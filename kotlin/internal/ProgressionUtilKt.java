package kotlin.internal;

import kotlin.PublishedApi;

public final class ProgressionUtilKt {
   private static final int mod(int a, int b) {
      int mod = a % b;
      return mod >= 0 ? mod : mod + b;
   }

   private static final long mod(long a, long b) {
      long mod = a % b;
      return mod >= 0L ? mod : mod + b;
   }

   private static final int differenceModulo(int a, int b, int c) {
      return mod(mod(a, c) - mod(b, c), c);
   }

   private static final long differenceModulo(long a, long b, long c) {
      return mod(mod(a, c) - mod(b, c), c);
   }

   @PublishedApi
   public static final int getProgressionLastElement(int start, int end, int step) {
      int var10000;
      if (step > 0) {
         var10000 = start >= end ? end : end - differenceModulo(end, start, step);
      } else {
         if (step >= 0) {
            throw new IllegalArgumentException("Step is zero.");
         }

         var10000 = start <= end ? end : end + differenceModulo(start, end, -step);
      }

      return var10000;
   }

   @PublishedApi
   public static final long getProgressionLastElement(long start, long end, long step) {
      long var10000;
      if (step > 0L) {
         var10000 = start >= end ? end : end - differenceModulo(end, start, step);
      } else {
         if (step >= 0L) {
            throw new IllegalArgumentException("Step is zero.");
         }

         var10000 = start <= end ? end : end + differenceModulo(start, end, -step);
      }

      return var10000;
   }
}
