package kotlin.internal;

import kotlin.KotlinVersion;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.jdk8.JDK8PlatformImplementations;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class PlatformImplementationsKt {
   @JvmField
   @NotNull
   public static final PlatformImplementations IMPLEMENTATIONS;

   // $FF: synthetic method
   @InlineOnly
   private static final <T> T castToBaseType(Object instance) {
      try {
         Intrinsics.reifiedOperationMarker(1, "T");
         return (Object)instance;
      } catch (ClassCastException var4) {
         ClassLoader instanceCL = instance.getClass().getClassLoader();
         Intrinsics.reifiedOperationMarker(4, "T");
         ClassLoader baseTypeCL = ((Class)Object.class).getClassLoader();
         if (!Intrinsics.areEqual((Object)instanceCL, (Object)baseTypeCL)) {
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + instanceCL + ", base type classloader: " + baseTypeCL, (Throwable)var4);
         } else {
            throw var4;
         }
      }
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.2"
   )
   public static final boolean apiVersionIsAtLeast(int major, int minor, int patch) {
      return KotlinVersion.CURRENT.isAtLeast(major, minor, patch);
   }

   static {
      JDK8PlatformImplementations var0 = new JDK8PlatformImplementations();

      PlatformImplementations var10000;
      try {
         var10000 = (PlatformImplementations)var0;
      } catch (ClassCastException var4) {
         ClassLoader var2 = var0.getClass().getClassLoader();
         ClassLoader var3 = PlatformImplementations.class.getClassLoader();
         if (!Intrinsics.areEqual((Object)var2, (Object)var3)) {
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + var2 + ", base type classloader: " + var3, (Throwable)var4);
         }

         throw var4;
      }

      IMPLEMENTATIONS = var10000;
   }
}
