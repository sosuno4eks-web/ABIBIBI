package su.catlean;

import java.lang.invoke.MethodHandles;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public abstract class dx {
   private static int[] D;

   public abstract void D(@NotNull class_332 var1, long var2, float var4, float var5, float var6, float var7);

   public abstract boolean y(float var1, long var2, float var4, int var5);

   public static void m(int[] var0) {
      D = var0;
   }

   public static int[] U() {
      return D;
   }

   static {
      long var0 = j0.a(8278474504805459348L, 9204636955133217876L, MethodHandles.lookup().lookupClass()).a(119362622516247L) ^ 121299631261269L;
      if (4444912014131451013L.A<invokedynamic>(4444912014131451013L, var0) == null) {
         (new int[1]).A<invokedynamic>(new int[1], 4442898690090510938L, var0);
      }

   }
}
