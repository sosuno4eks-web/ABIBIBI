package kotlin.internal.jdk7;

import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.internal.PlatformImplementations;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JDK7PlatformImplementations extends PlatformImplementations {
   private final boolean sdkIsNullOrAtLeast(int version) {
      return JDK7PlatformImplementations.ReflectSdkVersion.sdkVersion == null || JDK7PlatformImplementations.ReflectSdkVersion.sdkVersion >= version;
   }

   public void addSuppressed(@NotNull Throwable cause, @NotNull Throwable exception) {
      Intrinsics.checkNotNullParameter(cause, "cause");
      Intrinsics.checkNotNullParameter(exception, "exception");
      if (this.sdkIsNullOrAtLeast(19)) {
         cause.addSuppressed(exception);
      } else {
         super.addSuppressed(cause, exception);
      }

   }

   @NotNull
   public List<Throwable> getSuppressed(@NotNull Throwable exception) {
      Intrinsics.checkNotNullParameter(exception, "exception");
      List var2;
      if (this.sdkIsNullOrAtLeast(19)) {
         Throwable[] var10000 = exception.getSuppressed();
         Intrinsics.checkNotNullExpressionValue(var10000, "getSuppressed(...)");
         var2 = ArraysKt.asList((Object[])var10000);
      } else {
         var2 = super.getSuppressed(exception);
      }

      return var2;
   }

   private static final class ReflectSdkVersion {
      @NotNull
      public static final JDK7PlatformImplementations.ReflectSdkVersion INSTANCE = new JDK7PlatformImplementations.ReflectSdkVersion();
      @JvmField
      @Nullable
      public static final Integer sdkVersion;

      static {
         Integer var1;
         try {
            Object var5 = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object)null);
            var1 = var5 instanceof Integer ? (Integer)var5 : null;
         } catch (Throwable var4) {
            var1 = null;
         }

         Integer var10000;
         if (var1 != null) {
            int it = ((Number)var1).intValue();
            int var3 = false;
            var10000 = it > 0 ? var1 : null;
         } else {
            var10000 = null;
         }

         sdkVersion = var10000;
      }
   }
}
