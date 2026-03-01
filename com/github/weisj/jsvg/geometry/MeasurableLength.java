package com.github.weisj.jsvg.geometry;

import com.github.weisj.jsvg.geometry.size.MeasureContext;
import org.jetbrains.annotations.NotNull;

public interface MeasurableLength {
   double pathLength(@NotNull MeasureContext var1);
}
