package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class ModuleNameRetriever {
   @NotNull
   public static final ModuleNameRetriever INSTANCE = new ModuleNameRetriever();
   @NotNull
   private static final ModuleNameRetriever.Cache notOnJava9 = new ModuleNameRetriever.Cache((Method)null, (Method)null, (Method)null);
   @Nullable
   private static ModuleNameRetriever.Cache cache;

   private ModuleNameRetriever() {
   }

   @Nullable
   public final String getModuleName(@NotNull BaseContinuationImpl continuation) {
      Intrinsics.checkNotNullParameter(continuation, "continuation");
      ModuleNameRetriever.Cache var10000 = ModuleNameRetriever.cache;
      if (var10000 == null) {
         var10000 = this.buildCache(continuation);
      }

      ModuleNameRetriever.Cache cache = var10000;
      if (cache == notOnJava9) {
         return null;
      } else {
         Method var6 = cache.getModuleMethod;
         if (var6 != null) {
            Object var7 = var6.invoke(continuation.getClass());
            if (var7 != null) {
               Object module = var7;
               var6 = cache.getDescriptorMethod;
               if (var6 != null) {
                  var7 = var6.invoke(module);
                  if (var7 != null) {
                     Object descriptor = var7;
                     var6 = cache.nameMethod;
                     Object var5 = var6 != null ? var6.invoke(descriptor) : null;
                     return var5 instanceof String ? (String)var5 : null;
                  }
               }

               return null;
            }
         }

         return null;
      }
   }

   private final ModuleNameRetriever.Cache buildCache(BaseContinuationImpl continuation) {
      ModuleNameRetriever var10000;
      try {
         Method getModuleMethod = Class.class.getDeclaredMethod("getModule");
         Class methodClass = continuation.getClass().getClassLoader().loadClass("java.lang.Module");
         Method getDescriptorMethod = methodClass.getDeclaredMethod("getDescriptor");
         Class moduleDescriptorClass = continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor");
         Method nameMethod = moduleDescriptorClass.getDeclaredMethod("name");
         ModuleNameRetriever.Cache var7 = new ModuleNameRetriever.Cache(getModuleMethod, getDescriptorMethod, nameMethod);
         int var9 = false;
         var10000 = INSTANCE;
         cache = var7;
         return var7;
      } catch (Exception var10) {
         ModuleNameRetriever.Cache var4 = notOnJava9;
         int var6 = false;
         var10000 = INSTANCE;
         cache = var4;
         return var4;
      }
   }

   private static final class Cache {
      @JvmField
      @Nullable
      public final Method getModuleMethod;
      @JvmField
      @Nullable
      public final Method getDescriptorMethod;
      @JvmField
      @Nullable
      public final Method nameMethod;

      public Cache(@Nullable Method getModuleMethod, @Nullable Method getDescriptorMethod, @Nullable Method nameMethod) {
         this.getModuleMethod = getModuleMethod;
         this.getDescriptorMethod = getDescriptorMethod;
         this.nameMethod = nameMethod;
      }
   }
}
