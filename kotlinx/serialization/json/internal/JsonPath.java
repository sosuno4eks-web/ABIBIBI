package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JsonPath {
   @NotNull
   private Object[] currentObjectPath = new Object[8];
   @NotNull
   private int[] indicies;
   private int currentDepth;

   public JsonPath() {
      int var1 = 0;

      int[] var2;
      for(var2 = new int[8]; var1 < 8; ++var1) {
         var2[var1] = -1;
      }

      this.indicies = var2;
      this.currentDepth = -1;
   }

   public final void pushDescriptor(@NotNull SerialDescriptor sd) {
      Intrinsics.checkNotNullParameter(sd, "sd");
      ++this.currentDepth;
      int depth = this.currentDepth;
      if (depth == this.currentObjectPath.length) {
         this.resize();
      }

      this.currentObjectPath[depth] = sd;
   }

   public final void updateDescriptorIndex(int index) {
      this.indicies[this.currentDepth] = index;
   }

   public final void updateCurrentMapKey(@Nullable Object key) {
      if (this.indicies[this.currentDepth] != -2) {
         ++this.currentDepth;
         if (this.currentDepth == this.currentObjectPath.length) {
            this.resize();
         }
      }

      this.currentObjectPath[this.currentDepth] = key;
      this.indicies[this.currentDepth] = -2;
   }

   public final void resetCurrentMapKey() {
      if (this.indicies[this.currentDepth] == -2) {
         this.currentObjectPath[this.currentDepth] = JsonPath.Tombstone.INSTANCE;
      }

   }

   public final void popDescriptor() {
      int depth = this.currentDepth;
      int var2;
      if (this.indicies[depth] == -2) {
         this.indicies[depth] = -1;
         var2 = this.currentDepth;
         this.currentDepth = var2 + -1;
      }

      if (this.currentDepth != -1) {
         var2 = this.currentDepth;
         this.currentDepth = var2 + -1;
      }

   }

   @NotNull
   public final String getPath() {
      StringBuilder var1 = new StringBuilder();
      StringBuilder $this$getPath_u24lambda_u241 = var1;
      int var3 = false;
      var1.append("$");
      int var4 = this.currentDepth + 1;

      for(int var5 = 0; var5 < var4; ++var5) {
         int var7 = false;
         Object element = this.currentObjectPath[var5];
         if (element instanceof SerialDescriptor) {
            if (Intrinsics.areEqual((Object)((SerialDescriptor)element).getKind(), (Object)StructureKind.LIST.INSTANCE)) {
               if (this.indicies[var5] != -1) {
                  $this$getPath_u24lambda_u241.append("[");
                  $this$getPath_u24lambda_u241.append(this.indicies[var5]);
                  $this$getPath_u24lambda_u241.append("]");
               }
            } else {
               int idx = this.indicies[var5];
               if (idx >= 0) {
                  $this$getPath_u24lambda_u241.append(".");
                  $this$getPath_u24lambda_u241.append(((SerialDescriptor)element).getElementName(idx));
               }
            }
         } else if (element != JsonPath.Tombstone.INSTANCE) {
            $this$getPath_u24lambda_u241.append("[");
            $this$getPath_u24lambda_u241.append("'");
            $this$getPath_u24lambda_u241.append(element);
            $this$getPath_u24lambda_u241.append("'");
            $this$getPath_u24lambda_u241.append("]");
         }
      }

      return var1.toString();
   }

   private final String prettyString(Object it) {
      SerialDescriptor var10000 = it instanceof SerialDescriptor ? (SerialDescriptor)it : null;
      String var2;
      if ((it instanceof SerialDescriptor ? (SerialDescriptor)it : null) != null) {
         var2 = var10000.getSerialName();
         if (var2 != null) {
            return var2;
         }
      }

      var2 = String.valueOf(it);
      return var2;
   }

   private final void resize() {
      int newSize = this.currentDepth * 2;
      Object[] var10001 = Arrays.copyOf(this.currentObjectPath, newSize);
      Intrinsics.checkNotNullExpressionValue(var10001, "copyOf(...)");
      this.currentObjectPath = var10001;
      int var3 = 0;

      int[] var4;
      for(var4 = new int[newSize]; var3 < newSize; ++var3) {
         var4[var3] = -1;
      }

      ArraysKt.copyInto$default(this.indicies, var4, 0, 0, 0, 14, (Object)null);
      this.indicies = var4;
   }

   @NotNull
   public String toString() {
      return this.getPath();
   }

   private static final class Tombstone {
      @NotNull
      public static final JsonPath.Tombstone INSTANCE = new JsonPath.Tombstone();
   }
}
