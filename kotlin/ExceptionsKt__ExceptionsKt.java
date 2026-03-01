package kotlin;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import kotlin.internal.HidesMembers;
import kotlin.internal.InlineOnly;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

class ExceptionsKt__ExceptionsKt {
   @InlineOnly
   private static final void printStackTrace(Throwable $this$printStackTrace) {
      Intrinsics.checkNotNullParameter($this$printStackTrace, "<this>");
      $this$printStackTrace.printStackTrace();
   }

   @InlineOnly
   private static final void printStackTrace(Throwable $this$printStackTrace, PrintWriter writer) {
      Intrinsics.checkNotNullParameter($this$printStackTrace, "<this>");
      Intrinsics.checkNotNullParameter(writer, "writer");
      $this$printStackTrace.printStackTrace(writer);
   }

   @InlineOnly
   private static final void printStackTrace(Throwable $this$printStackTrace, PrintStream stream) {
      Intrinsics.checkNotNullParameter($this$printStackTrace, "<this>");
      Intrinsics.checkNotNullParameter(stream, "stream");
      $this$printStackTrace.printStackTrace(stream);
   }

   @NotNull
   public static final StackTraceElement[] getStackTrace(@NotNull Throwable $this$stackTrace) {
      Intrinsics.checkNotNullParameter($this$stackTrace, "<this>");
      StackTraceElement[] var10000 = $this$stackTrace.getStackTrace();
      Intrinsics.checkNotNull(var10000);
      return var10000;
   }

   /** @deprecated */
   // $FF: synthetic method
   public static void getStackTrace$annotations(Throwable <this>) {
   }

   @SinceKotlin(
      version = "1.4"
   )
   @NotNull
   public static final String stackTraceToString(@NotNull Throwable $this$stackTraceToString) {
      Intrinsics.checkNotNullParameter($this$stackTraceToString, "<this>");
      StringWriter sw = new StringWriter();
      PrintWriter pw = new PrintWriter((Writer)sw);
      $this$stackTraceToString.printStackTrace(pw);
      pw.flush();
      String var10000 = sw.toString();
      Intrinsics.checkNotNullExpressionValue(var10000, "toString(...)");
      return var10000;
   }

   @SinceKotlin(
      version = "1.1"
   )
   @HidesMembers
   public static final void addSuppressed(@NotNull Throwable $this$addSuppressed, @NotNull Throwable exception) {
      Intrinsics.checkNotNullParameter($this$addSuppressed, "<this>");
      Intrinsics.checkNotNullParameter(exception, "exception");
      if ($this$addSuppressed != exception) {
         PlatformImplementationsKt.IMPLEMENTATIONS.addSuppressed($this$addSuppressed, exception);
      }

   }

   @NotNull
   public static final List<Throwable> getSuppressedExceptions(@NotNull Throwable $this$suppressedExceptions) {
      Intrinsics.checkNotNullParameter($this$suppressedExceptions, "<this>");
      return PlatformImplementationsKt.IMPLEMENTATIONS.getSuppressed($this$suppressedExceptions);
   }

   /** @deprecated */
   // $FF: synthetic method
   @SinceKotlin(
      version = "1.4"
   )
   public static void getSuppressedExceptions$annotations(Throwable <this>) {
   }

   public ExceptionsKt__ExceptionsKt() {
   }
}
