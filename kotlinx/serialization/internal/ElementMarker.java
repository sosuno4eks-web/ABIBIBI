package kotlinx.serialization.internal;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@CoreFriendModuleApi
public final class ElementMarker {
   @NotNull
   private static final ElementMarker.Companion Companion = new ElementMarker.Companion((DefaultConstructorMarker)null);
   @NotNull
   private final SerialDescriptor descriptor;
   @NotNull
   private final Function2<SerialDescriptor, Integer, Boolean> readIfAbsent;
   private long lowerMarks;
   @NotNull
   private final long[] highMarksArray;
   @NotNull
   private static final long[] EMPTY_HIGH_MARKS = new long[0];

   public ElementMarker(@NotNull SerialDescriptor descriptor, @NotNull Function2<? super SerialDescriptor, ? super Integer, Boolean> readIfAbsent) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
      super();
      this.descriptor = descriptor;
      this.readIfAbsent = readIfAbsent;
      int elementsCount = this.descriptor.getElementsCount();
      if (elementsCount <= 64) {
         this.lowerMarks = elementsCount == 64 ? 0L : -1L << elementsCount;
         this.highMarksArray = EMPTY_HIGH_MARKS;
      } else {
         this.lowerMarks = 0L;
         this.highMarksArray = this.prepareHighMarksArray(elementsCount);
      }

   }

   public final void mark(int index) {
      if (index < 64) {
         this.lowerMarks |= 1L << index;
      } else {
         this.markHigh(index);
      }

   }

   public final int nextUnmarkedIndex() {
      int elementsCount = this.descriptor.getElementsCount();

      int index;
      do {
         if (this.lowerMarks == -1L) {
            if (elementsCount > 64) {
               return this.nextUnmarkedHighIndex();
            }

            return -1;
         }

         index = Long.numberOfTrailingZeros(~this.lowerMarks);
         this.lowerMarks |= 1L << index;
      } while(!(Boolean)this.readIfAbsent.invoke(this.descriptor, index));

      return index;
   }

   private final long[] prepareHighMarksArray(int elementsCount) {
      int slotsCount = elementsCount - 1 >>> 6;
      int elementsInLastSlot = elementsCount & 63;
      long[] highMarks = new long[slotsCount];
      if (elementsInLastSlot != 0) {
         highMarks[ArraysKt.getLastIndex(highMarks)] = -1L << elementsCount;
      }

      return highMarks;
   }

   private final void markHigh(int index) {
      int slot = (index >>> 6) - 1;
      int offsetInSlot = index & 63;
      this.highMarksArray[slot] |= 1L << offsetInSlot;
   }

   private final int nextUnmarkedHighIndex() {
      int slot = 0;

      for(int var2 = this.highMarksArray.length; slot < var2; ++slot) {
         int slotOffset = (slot + 1) * 64;
         long slotMarks = this.highMarksArray[slot];

         while(slotMarks != -1L) {
            int indexInSlot = Long.numberOfTrailingZeros(~slotMarks);
            slotMarks |= 1L << indexInSlot;
            int index = slotOffset + indexInSlot;
            if ((Boolean)this.readIfAbsent.invoke(this.descriptor, index)) {
               this.highMarksArray[slot] = slotMarks;
               return index;
            }
         }

         this.highMarksArray[slot] = slotMarks;
      }

      return -1;
   }

   private static final class Companion {
      private Companion() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
