package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DebugMetadataKt {
   private static final int COROUTINES_DEBUG_METADATA_VERSION = 1;

   @SinceKotlin(
      version = "1.3"
   )
   @JvmName(
      name = "getStackTraceElement"
   )
   @Nullable
   public static final StackTraceElement getStackTraceElement(@NotNull BaseContinuationImpl $this$getStackTraceElementImpl) {
      Intrinsics.checkNotNullParameter($this$getStackTraceElementImpl, "<this>");
      DebugMetadata var10000 = getDebugMetadataAnnotation($this$getStackTraceElementImpl);
      if (var10000 == null) {
         return null;
      } else {
         DebugMetadata debugMetadata = var10000;
         checkDebugMetadataVersion(1, debugMetadata.v());
         int label = getLabel($this$getStackTraceElementImpl);
         int lineNumber = label < 0 ? -1 : debugMetadata.l()[label];
         String moduleName = ModuleNameRetriever.INSTANCE.getModuleName($this$getStackTraceElementImpl);
         String moduleAndClass = moduleName == null ? debugMetadata.c() : moduleName + '/' + debugMetadata.c();
         return new StackTraceElement(moduleAndClass, debugMetadata.m(), debugMetadata.f(), lineNumber);
      }
   }

   private static final DebugMetadata getDebugMetadataAnnotation(BaseContinuationImpl $this$getDebugMetadataAnnotation) {
      return (DebugMetadata)$this$getDebugMetadataAnnotation.getClass().getAnnotation(DebugMetadata.class);
   }

   private static final int getLabel(BaseContinuationImpl $this$getLabel) {
      int var1;
      try {
         Field field = $this$getLabel.getClass().getDeclaredField("label");
         field.setAccessible(true);
         Object var3 = field.get($this$getLabel);
         var1 = ((var3 instanceof Integer ? (Integer)var3 : null) != null ? var3 instanceof Integer ? (Integer)var3 : null : 0) - 1;
      } catch (Exception var4) {
         var1 = -1;
      }

      return var1;
   }

   private static final void checkDebugMetadataVersion(int expected, int actual) {
      if (actual > expected) {
         throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + expected + ", got " + actual + ". Please update the Kotlin standard library.").toString());
      }
   }

   @SinceKotlin(
      version = "1.3"
   )
   @JvmName(
      name = "getSpilledVariableFieldMapping"
   )
   @Nullable
   public static final String[] getSpilledVariableFieldMapping(@NotNull BaseContinuationImpl $this$getSpilledVariableFieldMapping) {
      Intrinsics.checkNotNullParameter($this$getSpilledVariableFieldMapping, "<this>");
      DebugMetadata var10000 = getDebugMetadataAnnotation($this$getSpilledVariableFieldMapping);
      if (var10000 == null) {
         return null;
      } else {
         DebugMetadata debugMetadata = var10000;
         checkDebugMetadataVersion(1, debugMetadata.v());
         ArrayList res = new ArrayList();
         int label = getLabel($this$getSpilledVariableFieldMapping);
         int[] var4 = debugMetadata.i();
         int var5 = 0;

         for(int var6 = var4.length; var5 < var6; ++var5) {
            int labelOfIndex = var4[var5];
            if (labelOfIndex == label) {
               res.add(debugMetadata.s()[var5]);
               res.add(debugMetadata.n()[var5]);
            }
         }

         Collection $this$toTypedArray$iv = (Collection)res;
         int $i$f$toTypedArray = false;
         return (String[])$this$toTypedArray$iv.toArray(new String[0]);
      }
   }
}
