package kotlin.internal;

import java.io.InvalidObjectException;

public final class SerializationUtilKt {
   @InlineOnly
   private static final Void throwReadObjectNotSupported() {
      throw new InvalidObjectException("Deserialization is supported via proxy only");
   }
}
