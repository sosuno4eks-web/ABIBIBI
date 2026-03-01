package kotlin;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class LazyKt__LazyJVMKt {
   @NotNull
   public static final <T> Lazy<T> lazy(@NotNull Function0<? extends T> initializer) {
      Intrinsics.checkNotNullParameter(initializer, "initializer");
      return (Lazy)(new SynchronizedLazyImpl(initializer, (Object)null, 2, (DefaultConstructorMarker)null));
   }

   @NotNull
   public static final <T> Lazy<T> lazy(@NotNull LazyThreadSafetyMode mode, @NotNull Function0<? extends T> initializer) {
      Intrinsics.checkNotNullParameter(mode, "mode");
      Intrinsics.checkNotNullParameter(initializer, "initializer");
      Lazy var10000;
      switch(LazyKt__LazyJVMKt.WhenMappings.$EnumSwitchMapping$0[mode.ordinal()]) {
      case 1:
         var10000 = (Lazy)(new SynchronizedLazyImpl(initializer, (Object)null, 2, (DefaultConstructorMarker)null));
         break;
      case 2:
         var10000 = (Lazy)(new SafePublicationLazyImpl(initializer));
         break;
      case 3:
         var10000 = (Lazy)(new UnsafeLazyImpl(initializer));
         break;
      default:
         throw new NoWhenBranchMatchedException();
      }

      return var10000;
   }

   @NotNull
   public static final <T> Lazy<T> lazy(@Nullable Object lock, @NotNull Function0<? extends T> initializer) {
      Intrinsics.checkNotNullParameter(initializer, "initializer");
      return (Lazy)(new SynchronizedLazyImpl(initializer, lock));
   }

   public LazyKt__LazyJVMKt() {
   }

   // $FF: synthetic class
   public static final class WhenMappings {
      // $FF: synthetic field
      public static final int[] $EnumSwitchMapping$0;

      static {
         int[] var0 = new int[LazyThreadSafetyMode.values().length];

         try {
            var0[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
         }

         try {
            var0[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
         }

         try {
            var0[LazyThreadSafetyMode.NONE.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
         }

         $EnumSwitchMapping$0 = var0;
      }
   }
}
