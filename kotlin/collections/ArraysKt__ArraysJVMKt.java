package kotlin.collections;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class ArraysKt__ArraysJVMKt {
   // $FF: synthetic method
   public static final <T> T[] orEmpty(T[] $this$orEmpty) {
      int $i$f$orEmpty = false;
      Object[] var10000 = $this$orEmpty;
      if ($this$orEmpty == null) {
         Intrinsics.reifiedOperationMarker(0, "T");
         var10000 = new Object[0];
      }

      return var10000;
   }

   @InlineOnly
   private static final String toString(byte[] $this$toString, Charset charset) {
      Intrinsics.checkNotNullParameter($this$toString, "<this>");
      Intrinsics.checkNotNullParameter(charset, "charset");
      return new String($this$toString, charset);
   }

   // $FF: synthetic method
   public static final <T> T[] toTypedArray(Collection<? extends T> $this$toTypedArray) {
      Intrinsics.checkNotNullParameter($this$toTypedArray, "<this>");
      int $i$f$toTypedArray = false;
      Collection thisCollection = (Collection)$this$toTypedArray;
      Intrinsics.reifiedOperationMarker(0, "T?");
      return thisCollection.toArray(new Object[0]);
   }

   @NotNull
   public static final <T> T[] arrayOfNulls(@NotNull T[] reference, int size) {
      Intrinsics.checkNotNullParameter(reference, "reference");
      Object var10000 = Array.newInstance(reference.getClass().getComponentType(), size);
      Intrinsics.checkNotNull(var10000, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
      return (Object[])var10000;
   }

   @SinceKotlin(
      version = "1.3"
   )
   public static final void copyOfRangeToIndexCheck(int toIndex, int size) {
      if (toIndex > size) {
         throw new IndexOutOfBoundsException("toIndex (" + toIndex + ") is greater than size (" + size + ").");
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @PublishedApi
   @JvmName(
      name = "contentDeepHashCode"
   )
   public static final <T> int contentDeepHashCode(@Nullable T[] $this$contentDeepHashCodeImpl) {
      return Arrays.deepHashCode($this$contentDeepHashCodeImpl);
   }

   public ArraysKt__ArraysJVMKt() {
   }
}
