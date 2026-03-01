package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

public final class PluginExceptionsKt {
   @InternalSerializationApi
   public static final void throwMissingFieldException(int seen, int goldenMask, @NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      List missingFields = (List)(new ArrayList());
      int missingFieldsBits = goldenMask & ~seen;

      for(int i = 0; i < 32; ++i) {
         if ((missingFieldsBits & 1) != 0) {
            ((Collection)missingFields).add(descriptor.getElementName(i));
         }

         missingFieldsBits >>>= 1;
      }

      throw new MissingFieldException(missingFields, descriptor.getSerialName());
   }

   @InternalSerializationApi
   public static final void throwArrayMissingFieldException(@NotNull int[] seenArray, @NotNull int[] goldenMaskArray, @NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(seenArray, "seenArray");
      Intrinsics.checkNotNullParameter(goldenMaskArray, "goldenMaskArray");
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      List missingFields = (List)(new ArrayList());
      int maskSlot = 0;

      for(int var5 = goldenMaskArray.length; maskSlot < var5; ++maskSlot) {
         int missingFieldsBits = goldenMaskArray[maskSlot] & ~seenArray[maskSlot];
         if (missingFieldsBits != 0) {
            for(int i = 0; i < 32; ++i) {
               if ((missingFieldsBits & 1) != 0) {
                  ((Collection)missingFields).add(descriptor.getElementName(maskSlot * 32 + i));
               }

               missingFieldsBits >>>= 1;
            }
         }
      }

      throw new MissingFieldException(missingFields, descriptor.getSerialName());
   }
}
