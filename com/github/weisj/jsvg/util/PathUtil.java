package com.github.weisj.jsvg.util;

import com.github.weisj.jsvg.attributes.FillRule;
import com.github.weisj.jsvg.geometry.FillRuleAwareAWTSVGShape;
import com.github.weisj.jsvg.geometry.MeasurableShape;
import com.github.weisj.jsvg.geometry.path.BuildHistory;
import com.github.weisj.jsvg.geometry.path.PathCommand;
import com.github.weisj.jsvg.geometry.path.PathParser;
import java.awt.geom.Path2D;
import java.awt.geom.Path2D.Float;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class PathUtil {
   @Nullable
   private static final MethodHandle trimPathHandle = lookupTrimPathMethod();

   @Nullable
   private static MethodHandle lookupTrimPathMethod() {
      try {
         MethodType methodType = MethodType.methodType(Void.TYPE);
         return MethodHandles.lookup().findVirtual(Path2D.class, "trimToSize", methodType);
      } catch (IllegalAccessException | NoSuchMethodException var1) {
         return null;
      }
   }

   private PathUtil() {
   }

   @NotNull
   public static MeasurableShape parseFromPathData(@NotNull String data, @NotNull FillRule fillRule) {
      PathCommand[] pathCommands = (new PathParser(data)).parsePathCommand();
      int nodeCount = 2;
      PathCommand[] var4 = pathCommands;
      int var5 = pathCommands.length;

      for(int var6 = 0; var6 < var5; ++var6) {
         PathCommand pathCommand = var4[var6];
         nodeCount += pathCommand.nodeCount() - 1;
      }

      Path2D path = new Float(fillRule.awtWindingRule, nodeCount);
      BuildHistory hist = new BuildHistory();
      PathCommand[] var12 = pathCommands;
      int var13 = pathCommands.length;

      for(int var8 = 0; var8 < var13; ++var8) {
         PathCommand pathCommand = var12[var8];
         pathCommand.appendPath(path, hist);
      }

      trimPathToSize(path);
      return new FillRuleAwareAWTSVGShape(path);
   }

   public static void trimPathToSize(@NotNull Path2D path) {
      if (trimPathHandle != null) {
         try {
            trimPathHandle.invokeExact(path);
         } catch (Throwable var2) {
            throw new RuntimeException(var2);
         }
      }

   }
}
