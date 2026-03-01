package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.parser.resources.RenderableResource;
import java.io.IOException;
import java.net.URI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@FunctionalInterface
public interface ResourceLoader {
   @Nullable
   UIFuture<RenderableResource> loadImage(@NotNull URI var1) throws IOException;
}
