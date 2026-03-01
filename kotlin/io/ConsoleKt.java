package kotlin.io;

import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(
   name = "ConsoleKt"
)
public final class ConsoleKt {
   @InlineOnly
   private static final void print(Object message) {
      System.out.print(message);
   }

   @InlineOnly
   private static final void print(int message) {
      System.out.print(message);
   }

   @InlineOnly
   private static final void print(long message) {
      System.out.print(message);
   }

   @InlineOnly
   private static final void print(byte message) {
      System.out.print(message);
   }

   @InlineOnly
   private static final void print(short message) {
      System.out.print(message);
   }

   @InlineOnly
   private static final void print(char message) {
      System.out.print(message);
   }

   @InlineOnly
   private static final void print(boolean message) {
      System.out.print(message);
   }

   @InlineOnly
   private static final void print(float message) {
      System.out.print(message);
   }

   @InlineOnly
   private static final void print(double message) {
      System.out.print(message);
   }

   @InlineOnly
   private static final void print(char[] message) {
      Intrinsics.checkNotNullParameter(message, "message");
      System.out.print(message);
   }

   @InlineOnly
   private static final void println(Object message) {
      System.out.println(message);
   }

   @InlineOnly
   private static final void println(int message) {
      System.out.println(message);
   }

   @InlineOnly
   private static final void println(long message) {
      System.out.println(message);
   }

   @InlineOnly
   private static final void println(byte message) {
      System.out.println(message);
   }

   @InlineOnly
   private static final void println(short message) {
      System.out.println(message);
   }

   @InlineOnly
   private static final void println(char message) {
      System.out.println(message);
   }

   @InlineOnly
   private static final void println(boolean message) {
      System.out.println(message);
   }

   @InlineOnly
   private static final void println(float message) {
      System.out.println(message);
   }

   @InlineOnly
   private static final void println(double message) {
      System.out.println(message);
   }

   @InlineOnly
   private static final void println(char[] message) {
      Intrinsics.checkNotNullParameter(message, "message");
      System.out.println(message);
   }

   @InlineOnly
   private static final void println() {
      System.out.println();
   }

   @SinceKotlin(
      version = "1.6"
   )
   @NotNull
   public static final String readln() {
      return readlnOrNull();
   }

   @SinceKotlin(
      version = "1.6"
   )
   @Nullable
   public static final String readlnOrNull() {
      return readLine();
   }

   @Nullable
   public static final String readLine() {
      LineReader var10000 = LineReader.INSTANCE;
      InputStream var10001 = System.in;
      Intrinsics.checkNotNullExpressionValue(var10001, "in");
      Charset var10002 = Charset.defaultCharset();
      Intrinsics.checkNotNullExpressionValue(var10002, "defaultCharset(...)");
      return var10000.readLine(var10001, var10002);
   }
}
