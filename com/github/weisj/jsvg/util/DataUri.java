package com.github.weisj.jsvg.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class DataUri {
   private static final String CHARSET_OPTION_NAME = "charset";
   private static final String FILENAME_OPTION_NAME = "filename";
   private static final String CONTENT_DISPOSITION_OPTION_NAME = "content-disposition";
   @NotNull
   private final String mime;
   @Nullable
   private final Charset charset;
   @Nullable
   private final String filename;
   @Nullable
   private final String contentDisposition;
   @NotNull
   private final byte[] data;
   private static final Pattern PLUS = Pattern.compile("+", 16);

   public DataUri(String mime, Charset charset, byte[] data) {
      this(mime, charset, (String)null, (String)null, data);
   }

   public DataUri(@NotNull String mime, @Nullable Charset charset, @Nullable String filename, @Nullable String contentDisposition, @NotNull byte[] data) {
      this.mime = mime;
      this.charset = charset;
      this.filename = filename;
      this.contentDisposition = contentDisposition;
      this.data = data;
   }

   @NotNull
   public String mime() {
      return this.mime;
   }

   @NotNull
   public byte[] data() {
      return this.data;
   }

   @Nullable
   public Charset charset() {
      return this.charset;
   }

   @Nullable
   public String contentDisposition() {
      return this.contentDisposition;
   }

   @Nullable
   public String filename() {
      return this.filename;
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof DataUri)) {
         return false;
      } else {
         DataUri dataUri = (DataUri)o;
         return this.mime.equals(dataUri.mime) && Objects.equals(this.charset, dataUri.charset) && Objects.equals(this.filename, dataUri.filename) && Objects.equals(this.contentDisposition, dataUri.contentDisposition) && Arrays.equals(this.data, dataUri.data);
      }
   }

   public int hashCode() {
      int result = Objects.hash(new Object[]{this.mime, this.charset, this.filename, this.contentDisposition});
      result = 31 * result + Arrays.hashCode(this.data);
      return result;
   }

   public static DataUri parse(@NotNull String uri, Charset charset) throws DataUri.MalformedDataUriException {
      if (!uri.toLowerCase().startsWith("data:")) {
         throw new DataUri.MalformedDataUriException("URI must start with a case-insensitive `data:'");
      } else if (-1 == uri.indexOf(44)) {
         throw new DataUri.MalformedDataUriException("URI must contain a `,'");
      } else {
         Collection<String> supportedContentEncodings = Collections.singletonList("base64");
         String mimeType = "text/plain";
         String contentEncoding = "";
         boolean contentEncodingAlreadySet = false;
         Map<String, String> supportedValues = new HashMap();
         supportedValues.put("charset", "");
         supportedValues.put("filename", "");
         supportedValues.put("content-disposition", "");
         Map<String, Boolean> supportedValueSetBits = new HashMap();
         Iterator var8 = supportedValues.keySet().iterator();

         String temp;
         while(var8.hasNext()) {
            temp = (String)var8.next();
            supportedValueSetBits.put(temp, false);
         }

         int comma = uri.indexOf(44);
         temp = uri.substring("data:".length(), comma);
         String[] headers = temp.split(";");

         String name;
         String value;
         for(int header = 0; header < headers.length; ++header) {
            String s = headers[header];
            s = s.toLowerCase();
            int eq = s.indexOf(61);
            value = "";
            if (-1 == eq) {
               name = percentDecode(s, charset);
               name = name.trim();
            } else {
               name = s.substring(0, eq);
               name = percentDecode(name, charset);
               name = name.trim();
               value = s.substring(eq + 1);
               value = percentDecode(value, charset);
               value = value.trim();
            }

            if (0 == header && -1 == eq && !name.isEmpty()) {
               mimeType = name;
            } else {
               String nameCaseInsensitive;
               if (-1 == eq) {
                  nameCaseInsensitive = name.toLowerCase();
                  if (supportedContentEncodings.contains(nameCaseInsensitive) && !contentEncodingAlreadySet) {
                     contentEncoding = name;
                     contentEncodingAlreadySet = true;
                  }
               } else {
                  nameCaseInsensitive = name.toLowerCase();
                  if (!value.isEmpty() && supportedValues.containsKey(nameCaseInsensitive)) {
                     boolean valueSet = (Boolean)supportedValueSetBits.get(nameCaseInsensitive);
                     if (!valueSet) {
                        supportedValues.put(nameCaseInsensitive, value);
                        supportedValueSetBits.put(nameCaseInsensitive, true);
                     }
                  }
               }
            }
         }

         String data = uri.substring(comma + 1);
         data = percentDecode(data, charset);
         Charset finalCharset = ((String)supportedValues.get("charset")).isEmpty() ? null : Charset.forName((String)supportedValues.get("charset"));
         name = ((String)supportedValues.get("filename")).isEmpty() ? null : (String)supportedValues.get("filename");
         value = ((String)supportedValues.get("content-disposition")).isEmpty() ? null : (String)supportedValues.get("content-disposition");

         byte[] finalData;
         try {
            finalData = "base64".equalsIgnoreCase(contentEncoding) ? Base64.getMimeDecoder().decode(data) : data.getBytes(charset);
         } catch (RuntimeException var18) {
            throw new DataUri.MalformedDataUriException(var18);
         }

         return new DataUri(mimeType, finalCharset, name, value, finalData);
      }
   }

   public String toString() {
      StringBuilder s = new StringBuilder();
      s.append("data:").append(this.mime()).append(";");
      if (this.charset != null) {
         s.append("charset=").append(this.charset.name()).append(";");
      }

      if (this.contentDisposition != null) {
         s.append("content-disposition=").append(this.contentDisposition).append(";");
      }

      if (this.filename != null) {
         s.append("filename=").append(this.filename).append(";");
      }

      s.append("base64,").append(new String(Base64.getEncoder().encode(this.data()), StandardCharsets.UTF_8));
      return s.toString();
   }

   private static String percentDecode(String s, Charset cs) {
      try {
         s = PLUS.matcher(s).replaceAll("%2B");
         return URLDecoder.decode(s, cs.name());
      } catch (UnsupportedEncodingException var3) {
         throw new IllegalStateException("Charset `" + cs.name() + "' not supported", var3);
      }
   }

   static final class MalformedDataUriException extends IOException {
      MalformedDataUriException(@NotNull String reason) {
         super(reason);
      }

      MalformedDataUriException(@NotNull Exception reason) {
         super(reason);
      }
   }
}
