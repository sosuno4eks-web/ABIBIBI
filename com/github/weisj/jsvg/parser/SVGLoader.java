package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.SVGDocument;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SVGLoader {
   static final Logger LOGGER = Logger.getLogger(SVGLoader.class.getName());
   @NotNull
   private static final NodeSupplier NODE_SUPPLIER = new NodeSupplier();
   private final StaxSVGLoader loader;

   public SVGLoader() {
      this.loader = new StaxSVGLoader(NODE_SUPPLIER);
   }

   @Nullable
   public SVGDocument load(@NotNull URL xmlBase) {
      return this.load((URL)xmlBase, new DefaultParserProvider());
   }

   @Nullable
   public SVGDocument load(@NotNull URL xmlBase, @NotNull ParserProvider parserProvider) {
      try {
         return this.load(xmlBase.openStream(), parserProvider);
      } catch (IOException var4) {
         LOGGER.log(Level.WARNING, "Could not read " + xmlBase, var4);
         return null;
      }
   }

   @Nullable
   public SVGDocument load(@NotNull InputStream inputStream) {
      return this.load((InputStream)inputStream, new DefaultParserProvider());
   }

   @Nullable
   public SVGDocument load(@NotNull InputStream inputStream, @NotNull ParserProvider parserProvider) {
      return this.load(inputStream, parserProvider, new SynchronousResourceLoader());
   }

   @Nullable
   public SVGDocument load(@NotNull InputStream inputStream, @NotNull ParserProvider parserProvider, @NotNull ResourceLoader resourceLoader) {
      try {
         return this.loader.load(this.createDocumentInputStream(inputStream), parserProvider, resourceLoader);
      } catch (Throwable var5) {
         LOGGER.log(Level.WARNING, "Could not load SVG ", var5);
         return null;
      }
   }

   @Nullable
   private InputStream createDocumentInputStream(@NotNull InputStream is) {
      try {
         BufferedInputStream bin = new BufferedInputStream(is);
         bin.mark(2);
         int b0 = bin.read();
         int b1 = bin.read();
         bin.reset();
         return (InputStream)((b1 << 8 | b0) == 35615 ? new GZIPInputStream(bin) : bin);
      } catch (IOException var5) {
         LOGGER.log(Level.SEVERE, var5.getMessage(), var5);
         return null;
      }
   }
}
