package kotlinx.serialization.json.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.StringsKt;

public final class ArrayPoolsKt {
   private static final int MAX_CHARS_IN_POOL;

   // $FF: synthetic method
   public static final int access$getMAX_CHARS_IN_POOL$p() {
      return MAX_CHARS_IN_POOL;
   }

   static {
      Result.Companion var10000;
      Object var0;
      try {
         var10000 = Result.Companion;
         int var3 = false;
         String var4 = System.getProperty("kotlinx.serialization.json.pool.size");
         var0 = Result.constructor-impl(var4 != null ? StringsKt.toIntOrNull(var4) : null);
      } catch (Throwable var2) {
         var10000 = Result.Companion;
         var0 = Result.constructor-impl(ResultKt.createFailure(var2));
      }

      Integer var5 = (Integer)(Result.isFailure-impl(var0) ? null : var0);
      MAX_CHARS_IN_POOL = var5 != null ? var5 : 2097152;
   }
}
