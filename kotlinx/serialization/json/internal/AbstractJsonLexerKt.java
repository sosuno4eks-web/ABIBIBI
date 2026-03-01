package kotlinx.serialization.json.internal;

import org.jetbrains.annotations.NotNull;

public final class AbstractJsonLexerKt {
   @NotNull
   public static final String lenientHint = "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.";
   @NotNull
   public static final String coerceInputValuesHint = "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.";
   @NotNull
   public static final String specialFlowingValuesHint = "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'";
   @NotNull
   public static final String ignoreUnknownKeysHint = "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.";
   @NotNull
   public static final String allowStructuredMapKeysHint = "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.";
   @NotNull
   public static final String NULL = "null";
   public static final char COMMA = ',';
   public static final char COLON = ':';
   public static final char BEGIN_OBJ = '{';
   public static final char END_OBJ = '}';
   public static final char BEGIN_LIST = '[';
   public static final char END_LIST = ']';
   public static final char STRING = '"';
   public static final char STRING_ESC = '\\';
   public static final char INVALID = '\u0000';
   public static final char UNICODE_ESC = 'u';
   public static final byte TC_OTHER = 0;
   public static final byte TC_STRING = 1;
   public static final byte TC_STRING_ESC = 2;
   public static final byte TC_WHITESPACE = 3;
   public static final byte TC_COMMA = 4;
   public static final byte TC_COLON = 5;
   public static final byte TC_BEGIN_OBJ = 6;
   public static final byte TC_END_OBJ = 7;
   public static final byte TC_BEGIN_LIST = 8;
   public static final byte TC_END_LIST = 9;
   public static final byte TC_EOF = 10;
   public static final byte TC_INVALID = 127;
   private static final int CTC_MAX = 126;
   private static final int ESC2C_MAX = 117;
   public static final int asciiCaseMask = 32;

   @NotNull
   public static final String tokenDescription(byte token) {
      return token == 1 ? "quotation mark '\"'" : (token == 2 ? "string escape sequence '\\'" : (token == 4 ? "comma ','" : (token == 5 ? "colon ':'" : (token == 6 ? "start of the object '{'" : (token == 7 ? "end of the object '}'" : (token == 8 ? "start of the array '['" : (token == 9 ? "end of the array ']'" : (token == 10 ? "end of the input" : (token == 127 ? "invalid token" : "valid token")))))))));
   }

   public static final byte charToTokenClass(char c) {
      return c < '~' ? CharMappings.CHAR_TO_TOKEN[c] : 0;
   }

   public static final char escapeToChar(int c) {
      return c < 117 ? CharMappings.ESCAPE_2_CHAR[c] : '\u0000';
   }
}
