package kotlinx.serialization.json.internal;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

public final class CharMappings {
   @NotNull
   public static final CharMappings INSTANCE = new CharMappings();
   @JvmField
   @NotNull
   public static final char[] ESCAPE_2_CHAR = new char[117];
   @JvmField
   @NotNull
   public static final byte[] CHAR_TO_TOKEN = new byte[126];

   private CharMappings() {
   }

   private final void initEscape() {
      for(int i = 0; i < 32; ++i) {
         this.initC2ESC(i, 'u');
      }

      this.initC2ESC((int)8, 'b');
      this.initC2ESC((int)9, 't');
      this.initC2ESC((int)10, 'n');
      this.initC2ESC((int)12, 'f');
      this.initC2ESC((int)13, 'r');
      this.initC2ESC('/', '/');
      this.initC2ESC('"', '"');
      this.initC2ESC('\\', '\\');
   }

   private final void initCharToToken() {
      for(int i = 0; i < 33; ++i) {
         this.initC2TC((int)i, (byte)127);
      }

      this.initC2TC((int)9, (byte)3);
      this.initC2TC((int)10, (byte)3);
      this.initC2TC((int)13, (byte)3);
      this.initC2TC((int)32, (byte)3);
      this.initC2TC((char)',', (byte)4);
      this.initC2TC((char)':', (byte)5);
      this.initC2TC((char)'{', (byte)6);
      this.initC2TC((char)'}', (byte)7);
      this.initC2TC((char)'[', (byte)8);
      this.initC2TC((char)']', (byte)9);
      this.initC2TC((char)'"', (byte)1);
      this.initC2TC((char)'\\', (byte)2);
   }

   private final void initC2ESC(int c, char esc) {
      if (esc != 'u') {
         ESCAPE_2_CHAR[esc] = (char)c;
      }

   }

   private final void initC2ESC(char c, char esc) {
      this.initC2ESC((int)c, esc);
   }

   private final void initC2TC(int c, byte cl) {
      CHAR_TO_TOKEN[c] = cl;
   }

   private final void initC2TC(char c, byte cl) {
      this.initC2TC((int)c, cl);
   }

   static {
      INSTANCE.initEscape();
      INSTANCE.initCharToToken();
   }
}
