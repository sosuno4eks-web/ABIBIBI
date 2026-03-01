package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

class PreconditionsKt__PreconditionsKt extends PreconditionsKt__AssertionsJVMKt {
   @InlineOnly
   private static final void require(boolean value) {
      if (!value) {
         int var1 = false;
         String var2 = "Failed requirement.";
         throw new IllegalArgumentException(var2.toString());
      }
   }

   @InlineOnly
   private static final void require(boolean value, Function0<? extends Object> lazyMessage) {
      Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
      if (!value) {
         Object message = lazyMessage.invoke();
         throw new IllegalArgumentException(message.toString());
      }
   }

   @InlineOnly
   private static final <T> T requireNotNull(T value) {
      if (value == null) {
         int var1 = false;
         String var2 = "Required value was null.";
         throw new IllegalArgumentException(var2.toString());
      } else {
         return value;
      }
   }

   @InlineOnly
   private static final <T> T requireNotNull(T value, Function0<? extends Object> lazyMessage) {
      Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
      if (value == null) {
         Object message = lazyMessage.invoke();
         throw new IllegalArgumentException(message.toString());
      } else {
         return value;
      }
   }

   @InlineOnly
   private static final void check(boolean value) {
      if (!value) {
         throw new IllegalStateException("Check failed.");
      }
   }

   @InlineOnly
   private static final void check(boolean value, Function0<? extends Object> lazyMessage) {
      Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
      if (!value) {
         Object message = lazyMessage.invoke();
         throw new IllegalStateException(message.toString());
      }
   }

   @InlineOnly
   private static final <T> T checkNotNull(T value) {
      if (value == null) {
         int var1 = false;
         String var2 = "Required value was null.";
         throw new IllegalStateException(var2.toString());
      } else {
         return value;
      }
   }

   @InlineOnly
   private static final <T> T checkNotNull(T value, Function0<? extends Object> lazyMessage) {
      Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
      if (value == null) {
         Object message = lazyMessage.invoke();
         throw new IllegalStateException(message.toString());
      } else {
         return value;
      }
   }

   @InlineOnly
   private static final Void error(Object message) {
      Intrinsics.checkNotNullParameter(message, "message");
      throw new IllegalStateException(message.toString());
   }

   public PreconditionsKt__PreconditionsKt() {
   }
}
