package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.SVGDocument;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class StaxSVGLoader {
   private static final Logger LOGGER = Logger.getLogger(StaxSVGLoader.class.getName());
   private static final String SVG_NAMESPACE_URI = "http://www.w3.org/2000/svg";
   private static final String XLINK_NAMESPACE_URI = "http://www.w3.org/1999/xlink";
   @NotNull
   private final NodeSupplier nodeSupplier;
   @NotNull
   private final XMLInputFactory xmlInputFactory;

   public StaxSVGLoader(@NotNull NodeSupplier nodeSupplier) {
      this(nodeSupplier, createDefaultFactory());
   }

   @NotNull
   private static XMLInputFactory createDefaultFactory() {
      XMLInputFactory factory = XMLInputFactory.newFactory();
      factory.setProperty("javax.xml.stream.supportDTD", false);
      factory.setProperty("javax.xml.stream.isReplacingEntityReferences", false);
      factory.setProperty("javax.xml.stream.isSupportingExternalEntities", false);
      return factory;
   }

   public StaxSVGLoader(@NotNull NodeSupplier nodeSupplier, @NotNull XMLInputFactory factory) {
      this.nodeSupplier = nodeSupplier;
      this.xmlInputFactory = factory;
   }

   @Nullable
   private XMLEventReader createReader(@Nullable InputStream inputStream) {
      try {
         return this.xmlInputFactory.createXMLEventReader(inputStream);
      } catch (XMLStreamException var3) {
         LOGGER.log(Level.SEVERE, "Error while creating XMLEventReader.", var3);
         return null;
      }
   }

   @Nullable
   public SVGDocument load(@Nullable InputStream inputStream, @NotNull ParserProvider parserProvider, @NotNull ResourceLoader resourceLoader) throws IOException, XMLStreamException {
      if (inputStream == null) {
         return null;
      } else {
         XMLEventReader reader = this.createReader(inputStream);
         if (reader == null) {
            return null;
         } else {
            try {
               SVGDocumentBuilder builder = new SVGDocumentBuilder(parserProvider, resourceLoader, this.nodeSupplier);

               while(true) {
                  while(reader.hasNext()) {
                     XMLEvent event = reader.nextEvent();
                     switch(event.getEventType()) {
                     case 1:
                        StartElement element = event.asStartElement();
                        String uri = element.getName().getNamespaceURI();
                        if (uri != null && !uri.isEmpty() && !"http://www.w3.org/2000/svg".equals(uri)) {
                           skipElement(reader);
                        } else {
                           Map<String, String> attributes = new HashMap();
                           element.getAttributes().forEachRemaining((attr) -> {
                              attributes.put(qualifiedName(attr.getName()), attr.getValue().trim());
                           });
                           if (!builder.startElement(qualifiedName(element.getName()), attributes)) {
                              skipElement(reader);
                           }
                        }
                        break;
                     case 2:
                        builder.endElement(qualifiedName(event.asEndElement().getName()));
                     case 3:
                     case 5:
                     case 6:
                     case 9:
                     case 10:
                     case 11:
                     case 13:
                     case 14:
                     case 15:
                     default:
                        break;
                     case 4:
                     case 12:
                        char[] data = event.asCharacters().getData().toCharArray();
                        builder.addTextContent(data, 0, data.length);
                        break;
                     case 7:
                        builder.startDocument();
                        break;
                     case 8:
                        builder.endDocument();
                     }
                  }

                  SVGDocument var16 = builder.build();
                  return var16;
               }
            } catch (XMLStreamException var14) {
               LOGGER.log(Level.SEVERE, "Error while parsing SVG.", var14);
            } finally {
               reader.close();
               inputStream.close();
            }

            return null;
         }
      }
   }

   private static void skipElement(@NotNull XMLEventReader reader) throws XMLStreamException {
      int elementCount = 1;

      do {
         if (!reader.hasNext()) {
            return;
         }

         XMLEvent event = reader.nextEvent();
         if (event.isStartElement()) {
            ++elementCount;
         } else if (event.isEndElement()) {
            --elementCount;
         }
      } while(elementCount != 0);

   }

   private static String qualifiedName(@NotNull QName name) {
      String prefix = name.getPrefix();
      String localName = name.getLocalPart();
      if (prefix == null) {
         return localName;
      } else if (prefix.isEmpty()) {
         return localName;
      } else if ("http://www.w3.org/2000/svg".equals(name.getNamespaceURI())) {
         return localName;
      } else {
         return "http://www.w3.org/1999/xlink".equals(name.getNamespaceURI()) ? "xlink:" + localName : prefix + ":" + localName;
      }
   }
}
