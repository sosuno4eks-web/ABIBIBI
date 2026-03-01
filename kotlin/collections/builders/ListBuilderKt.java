package kotlin.collections.builders;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class ListBuilderKt {
   @NotNull
   public static final <E> E[] arrayOfUninitializedElements(int size) {
      if (size < 0) {
         int var1 = false;
         String var2 = "capacity must be non-negative.";
         throw new IllegalArgumentException(var2.toString());
      } else {
         return new Object[size];
      }
   }

   private static final <T> String subarrayContentToString(T[] $this$subarrayContentToString, int offset, int length, Collection<? extends T> thisCollection) {
      StringBuilder sb = new StringBuilder(2 + length * 3);
      sb.append("[");

      for(int i = 0; i < length; ++i) {
         if (i > 0) {
            sb.append(", ");
         }

         Object nextElement = $this$subarrayContentToString[offset + i];
         if (nextElement == thisCollection) {
            sb.append("(this Collection)");
         } else {
            sb.append(nextElement);
         }
      }

      sb.append("]");
      String var10000 = sb.toString();
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   private static final <T> int subarrayContentHashCode(T[] $this$subarrayContentHashCode, int offset, int length) {
      int result = 1;

      for(int i = 0; i < length; ++i) {
         Object nextElement = $this$subarrayContentHashCode[offset + i];
         result = result * 31 + (nextElement != null ? nextElement.hashCode() : 0);
      }

      return result;
   }

   private static final <T> boolean subarrayContentEquals(T[] $this$subarrayContentEquals, int offset, int length, List<?> other) {
      if (length != other.size()) {
         return false;
      } else {
         for(int i = 0; i < length; ++i) {
            if (!Intrinsics.areEqual($this$subarrayContentEquals[offset + i], other.get(i))) {
               return false;
            }
         }

         return true;
      }
   }

   @NotNull
   public static final <T> T[] copyOfUninitializedElements(@NotNull T[] $this$copyOfUninitializedElements, int newSize) {
      Intrinsics.checkNotNullParameter($this$copyOfUninitializedElements, "<this>");
      Object[] var10000 = Arrays.copyOf($this$copyOfUninitializedElements, newSize);
      Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
      return var10000;
   }

   public static final <E> void resetAt(@NotNull E[] $this$resetAt, int index) {
      Intrinsics.checkNotNullParameter($this$resetAt, "<this>");
      $this$resetAt[index] = null;
   }

   public static final <E> void resetRange(@NotNull E[] $this$resetRange, int fromIndex, int toIndex) {
      Intrinsics.checkNotNullParameter($this$resetRange, "<this>");

      for(int index = fromIndex; index < toIndex; ++index) {
         resetAt($this$resetRange, index);
      }

   }

   // $FF: synthetic method
   public static final int access$subarrayContentHashCode(Object[] $receiver, int offset, int length) {
      return subarrayContentHashCode($receiver, offset, length);
   }

   // $FF: synthetic method
   public static final String access$subarrayContentToString(Object[] $receiver, int offset, int length, Collection thisCollection) {
      return subarrayContentToString($receiver, offset, length, thisCollection);
   }

   // $FF: synthetic method
   public static final boolean access$subarrayContentEquals(Object[] $receiver, int offset, int length, List other) {
      return subarrayContentEquals($receiver, offset, length, other);
   }
}
