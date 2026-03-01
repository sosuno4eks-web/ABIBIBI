package kotlin.internal;

import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.FallbackThreadLocalRandom;
import kotlin.random.Random;
import kotlin.text.MatchGroup;
import kotlin.time.Clock;
import kotlin.time.ExperimentalTime;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PlatformImplementations {
   public void addSuppressed(@NotNull Throwable cause, @NotNull Throwable exception) {
      Intrinsics.checkNotNullParameter(cause, "cause");
      Intrinsics.checkNotNullParameter(exception, "exception");
      Method var10000 = PlatformImplementations.ReflectThrowable.addSuppressed;
      if (var10000 != null) {
         Object[] var3 = new Object[]{exception};
         var10000.invoke(cause, var3);
      }

   }

   @NotNull
   public List<Throwable> getSuppressed(@NotNull Throwable exception) {
      Intrinsics.checkNotNullParameter(exception, "exception");
      Method var10000 = PlatformImplementations.ReflectThrowable.getSuppressed;
      List var5;
      if (var10000 != null) {
         Object var4 = var10000.invoke(exception);
         if (var4 != null) {
            Object it = var4;
            int var3 = false;
            var5 = ArraysKt.asList((Throwable[])it);
            if (var5 != null) {
               return var5;
            }
         }
      }

      var5 = CollectionsKt.emptyList();
      return var5;
   }

   @Nullable
   public MatchGroup getMatchResultNamedGroup(@NotNull MatchResult matchResult, @NotNull String name) {
      Intrinsics.checkNotNullParameter(matchResult, "matchResult");
      Intrinsics.checkNotNullParameter(name, "name");
      throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
   }

   @NotNull
   public Random defaultPlatformRandom() {
      return (Random)(new FallbackThreadLocalRandom());
   }

   @ExperimentalTime
   @NotNull
   public Clock getSystemClock() {
      throw new UnsupportedOperationException("getSystemClock should not be called on the base PlatformImplementations.");
   }

   private static final class ReflectThrowable {
      @NotNull
      public static final PlatformImplementations.ReflectThrowable INSTANCE = new PlatformImplementations.ReflectThrowable();
      @JvmField
      @Nullable
      public static final Method addSuppressed;
      @JvmField
      @Nullable
      public static final Method getSuppressed;

      static {
         Class throwableClass = Throwable.class;
         Method[] throwableMethods = throwableClass.getMethods();
         Intrinsics.checkNotNull(throwableMethods);
         Method[] var2 = throwableMethods;
         int var3 = 0;
         int var4 = throwableMethods.length;

         Method var5;
         boolean var7;
         Method var9;
         while(true) {
            if (var3 >= var4) {
               var9 = null;
               break;
            }

            boolean var8;
            label36: {
               var5 = var2[var3];
               var7 = false;
               if (Intrinsics.areEqual((Object)var5.getName(), (Object)"addSuppressed")) {
                  Class[] var10000 = var5.getParameterTypes();
                  Intrinsics.checkNotNullExpressionValue(var10000, "getParameterTypes(...)");
                  if (Intrinsics.areEqual((Object)ArraysKt.singleOrNull((Object[])var10000), (Object)throwableClass)) {
                     var8 = true;
                     break label36;
                  }
               }

               var8 = false;
            }

            if (var8) {
               var9 = var5;
               break;
            }

            ++var3;
         }

         addSuppressed = var9;
         var2 = throwableMethods;
         var3 = 0;
         var4 = throwableMethods.length;

         while(true) {
            if (var3 >= var4) {
               var9 = null;
               break;
            }

            var5 = var2[var3];
            var7 = false;
            if (Intrinsics.areEqual((Object)var5.getName(), (Object)"getSuppressed")) {
               var9 = var5;
               break;
            }

            ++var3;
         }

         getSuppressed = var9;
      }
   }
}
