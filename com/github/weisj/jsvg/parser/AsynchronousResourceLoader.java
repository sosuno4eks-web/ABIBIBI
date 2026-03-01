package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.parser.resources.RenderableResource;
import com.github.weisj.jsvg.util.ResourceUtil;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;

public final class AsynchronousResourceLoader implements ResourceLoader {
   private static final Logger LOGGER = Logger.getLogger(AsynchronousResourceLoader.class.getName());

   @NotNull
   public UIFuture<RenderableResource> loadImage(@NotNull URI uri) {
      return new SwingUIFuture(() -> {
         try {
            return ResourceUtil.loadImage(uri);
         } catch (IOException var2) {
            LOGGER.log(Level.SEVERE, var2.getMessage(), var2);
            return null;
         }
      });
   }
}
