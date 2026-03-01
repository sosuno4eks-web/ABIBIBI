package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(
   name = "CollectionToArray"
)
public final class CollectionToArray {
   @NotNull
   private static final Object[] EMPTY = new Object[0];
   private static final int MAX_SIZE = 2147483645;

   /** @deprecated */
   @Deprecated(
      message = "This function will be made internal in a future release"
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.9",
      errorSince = "2.1"
   )
   @JvmName(
      name = "toArray"
   )
   @NotNull
   public static final Object[] toArray(@NotNull Collection<?> collection) {
      Intrinsics.checkNotNullParameter(collection, "collection");
      int $i$f$toArrayImpl = false;
      int size$iv = collection.size();
      Object[] var10000;
      if (size$iv == 0) {
         int var3 = false;
         var10000 = EMPTY;
      } else {
         Iterator iter$iv = collection.iterator();
         if (!iter$iv.hasNext()) {
            int var4 = false;
            var10000 = EMPTY;
         } else {
            int var5 = false;
            Object[] result$iv = new Object[size$iv];
            int i$iv = 0;

            while(true) {
               while(true) {
                  result$iv[i$iv++] = iter$iv.next();
                  if (i$iv >= result$iv.length) {
                     if (!iter$iv.hasNext()) {
                        var10000 = result$iv;
                        return var10000;
                     }

                     int newSize$iv = i$iv * 3 + 1 >>> 1;
                     if (newSize$iv <= i$iv) {
                        if (i$iv >= 2147483645) {
                           throw new OutOfMemoryError();
                        }

                        newSize$iv = 2147483645;
                     }

                     var10000 = Arrays.copyOf(result$iv, newSize$iv);
                     Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
                     result$iv = var10000;
                  } else if (!iter$iv.hasNext()) {
                     int var9 = false;
                     var10000 = Arrays.copyOf(result$iv, i$iv);
                     Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
                     return var10000;
                  }
               }
            }
         }
      }

      return var10000;
   }

   /** @deprecated */
   @Deprecated(
      message = "This function will be made internal in a future release"
   )
   @DeprecatedSinceKotlin(
      warningSince = "1.9",
      errorSince = "2.1"
   )
   @JvmName(
      name = "toArray"
   )
   @NotNull
   public static final Object[] toArray(@NotNull Collection<?> collection, @Nullable Object[] a) {
      Intrinsics.checkNotNullParameter(collection, "collection");
      if (a == null) {
         throw new NullPointerException();
      } else {
         int $i$f$toArrayImpl = false;
         int size$iv = collection.size();
         boolean var4;
         Object[] var10000;
         if (size$iv == 0) {
            var4 = false;
            if (a.length > 0) {
               a[0] = null;
            }

            var10000 = a;
         } else {
            Iterator iter$iv = collection.iterator();
            if (!iter$iv.hasNext()) {
               var4 = false;
               if (a.length > 0) {
                  a[0] = null;
               }

               var10000 = a;
            } else {
               int var6 = false;
               if (size$iv <= a.length) {
                  var10000 = a;
               } else {
                  Object var13 = Array.newInstance(a.getClass().getComponentType(), size$iv);
                  Intrinsics.checkNotNull(var13, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                  var10000 = (Object[])var13;
               }

               Object[] result$iv = var10000;
               int i$iv = 0;

               while(true) {
                  while(true) {
                     result$iv[i$iv++] = iter$iv.next();
                     if (i$iv >= result$iv.length) {
                        if (!iter$iv.hasNext()) {
                           var10000 = result$iv;
                           return var10000;
                        }

                        int newSize$iv = i$iv * 3 + 1 >>> 1;
                        if (newSize$iv <= i$iv) {
                           if (i$iv >= 2147483645) {
                              throw new OutOfMemoryError();
                           }

                           newSize$iv = 2147483645;
                        }

                        var10000 = Arrays.copyOf(result$iv, newSize$iv);
                        Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
                        result$iv = var10000;
                     } else if (!iter$iv.hasNext()) {
                        int var10 = false;
                        if (result$iv == a) {
                           a[i$iv] = null;
                           var10000 = a;
                        } else {
                           var10000 = Arrays.copyOf(result$iv, i$iv);
                           Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
                        }

                        return var10000;
                     }
                  }
               }
            }
         }

         return var10000;
      }
   }

   private static final Object[] toArrayImpl(Collection<?> collection, Function0<Object[]> empty, Function1<? super Integer, Object[]> alloc, Function2<? super Object[], ? super Integer, Object[]> trim) {
      int $i$f$toArrayImpl = false;
      int size = collection.size();
      if (size == 0) {
         return (Object[])empty.invoke();
      } else {
         Iterator iter = collection.iterator();
         if (!iter.hasNext()) {
            return (Object[])empty.invoke();
         } else {
            Object[] result = (Object[])alloc.invoke(size);
            int i = 0;

            while(true) {
               while(true) {
                  result[i++] = iter.next();
                  if (i >= result.length) {
                     if (!iter.hasNext()) {
                        return result;
                     }

                     int newSize = i * 3 + 1 >>> 1;
                     if (newSize <= i) {
                        if (i >= 2147483645) {
                           throw new OutOfMemoryError();
                        }

                        newSize = 2147483645;
                     }

                     Object[] var10000 = Arrays.copyOf(result, newSize);
                     Intrinsics.checkNotNullExpressionValue(var10000, "copyOf(...)");
                     result = var10000;
                  } else if (!iter.hasNext()) {
                     return (Object[])trim.invoke(result, i);
                  }
               }
            }
         }
      }
   }
}
