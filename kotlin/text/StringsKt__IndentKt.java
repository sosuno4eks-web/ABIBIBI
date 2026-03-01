package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

class StringsKt__IndentKt extends StringsKt__AppendableKt {
   @IntrinsicConstEvaluation
   @NotNull
   public static final String trimMargin(@NotNull String $this$trimMargin, @NotNull String marginPrefix) {
      Intrinsics.checkNotNullParameter($this$trimMargin, "<this>");
      Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
      return StringsKt.replaceIndentByMargin($this$trimMargin, "", marginPrefix);
   }

   // $FF: synthetic method
   public static String trimMargin$default(String var0, String var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = "|";
      }

      return StringsKt.trimMargin(var0, var1);
   }

   @NotNull
   public static final String replaceIndentByMargin(@NotNull String $this$replaceIndentByMargin, @NotNull String newIndent, @NotNull String marginPrefix) {
      Intrinsics.checkNotNullParameter($this$replaceIndentByMargin, "<this>");
      Intrinsics.checkNotNullParameter(newIndent, "newIndent");
      Intrinsics.checkNotNullParameter(marginPrefix, "marginPrefix");
      if (StringsKt.isBlank((CharSequence)marginPrefix)) {
         int var4 = false;
         String var37 = "marginPrefix must be non-blank string.";
         throw new IllegalArgumentException(var37.toString());
      } else {
         List lines = StringsKt.lines((CharSequence)$this$replaceIndentByMargin);
         int resultSizeEstimate$iv = $this$replaceIndentByMargin.length() + newIndent.length() * lines.size();
         Function1 indentAddFunction$iv = getIndentFunction$StringsKt__IndentKt(newIndent);
         int $i$f$reindent = false;
         int lastIndex$iv = CollectionsKt.getLastIndex(lines);
         Iterable $this$mapIndexedNotNull$iv$iv = (Iterable)lines;
         int $i$f$mapIndexedNotNull = false;
         Collection destination$iv$iv$iv = (Collection)(new ArrayList());
         int $i$f$mapIndexedNotNullTo = false;
         int $i$f$forEachIndexed = false;
         int index$iv$iv$iv$iv = 0;
         Iterator var17 = $this$mapIndexedNotNull$iv$iv.iterator();

         while(var17.hasNext()) {
            Object item$iv$iv$iv$iv = var17.next();
            int var19 = index$iv$iv$iv$iv++;
            if (var19 < 0) {
               CollectionsKt.throwIndexOverflow();
            }

            int var22 = false;
            String value$iv = (String)item$iv$iv$iv$iv;
            int var25 = false;
            String var38;
            if ((var19 == 0 || var19 == lastIndex$iv) && StringsKt.isBlank((CharSequence)value$iv)) {
               var38 = null;
            } else {
               label86: {
                  int var27 = false;
                  CharSequence $this$indexOfFirst$iv = (CharSequence)value$iv;
                  int $i$f$indexOfFirst = false;
                  int index$iv = 0;
                  int var31 = $this$indexOfFirst$iv.length();

                  int var10000;
                  while(true) {
                     if (index$iv >= var31) {
                        var10000 = -1;
                        break;
                     }

                     char it = $this$indexOfFirst$iv.charAt(index$iv);
                     int var33 = false;
                     if (!CharsKt.isWhitespace(it)) {
                        var10000 = index$iv;
                        break;
                     }

                     ++index$iv;
                  }

                  int firstNonWhitespaceIndex = var10000;
                  if (firstNonWhitespaceIndex == -1) {
                     var38 = null;
                  } else if (StringsKt.startsWith$default(value$iv, marginPrefix, firstNonWhitespaceIndex, false, 4, (Object)null)) {
                     int var39 = firstNonWhitespaceIndex + marginPrefix.length();
                     Intrinsics.checkNotNull(value$iv, "null cannot be cast to non-null type java.lang.String");
                     var38 = value$iv.substring(var39);
                     Intrinsics.checkNotNullExpressionValue(var38, "substring(...)");
                  } else {
                     var38 = null;
                  }

                  if (var38 != null) {
                     var38 = (String)indentAddFunction$iv.invoke(var38);
                     if (var38 != null) {
                        break label86;
                     }
                  }

                  var38 = value$iv;
               }
            }

            if (var38 != null) {
               Object it$iv$iv$iv = var38;
               int var36 = false;
               destination$iv$iv$iv.add(it$iv$iv$iv);
            }
         }

         return ((StringBuilder)CollectionsKt.joinTo$default((Iterable)((List)destination$iv$iv$iv), (Appendable)(new StringBuilder(resultSizeEstimate$iv)), (CharSequence)"\n", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 124, (Object)null)).toString();
      }
   }

   // $FF: synthetic method
   public static String replaceIndentByMargin$default(String var0, String var1, String var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = "";
      }

      if ((var3 & 2) != 0) {
         var2 = "|";
      }

      return StringsKt.replaceIndentByMargin(var0, var1, var2);
   }

   @IntrinsicConstEvaluation
   @NotNull
   public static final String trimIndent(@NotNull String $this$trimIndent) {
      Intrinsics.checkNotNullParameter($this$trimIndent, "<this>");
      return StringsKt.replaceIndent($this$trimIndent, "");
   }

   @NotNull
   public static final String replaceIndent(@NotNull String $this$replaceIndent, @NotNull String newIndent) {
      Intrinsics.checkNotNullParameter($this$replaceIndent, "<this>");
      Intrinsics.checkNotNullParameter(newIndent, "newIndent");
      List lines = StringsKt.lines((CharSequence)$this$replaceIndent);
      Iterable $this$map$iv = (Iterable)lines;
      int $i$f$map = false;
      Collection destination$iv$iv = (Collection)(new ArrayList());
      int $i$f$mapTo = false;
      Iterator var10 = $this$map$iv.iterator();

      Object item$iv$iv;
      String p0;
      boolean $i$f$mapIndexedNotNullTo;
      while(var10.hasNext()) {
         item$iv$iv = var10.next();
         p0 = (String)item$iv$iv;
         $i$f$mapIndexedNotNullTo = false;
         if (!StringsKt.isBlank((CharSequence)p0)) {
            destination$iv$iv.add(item$iv$iv);
         }
      }

      $this$map$iv = (Iterable)((List)destination$iv$iv);
      $i$f$map = false;
      destination$iv$iv = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)));
      $i$f$mapTo = false;
      var10 = $this$map$iv.iterator();

      while(var10.hasNext()) {
         item$iv$iv = var10.next();
         p0 = (String)item$iv$iv;
         $i$f$mapIndexedNotNullTo = false;
         destination$iv$iv.add(indentWidth$StringsKt__IndentKt(p0));
      }

      Integer var10000 = (Integer)CollectionsKt.minOrNull((Iterable)((List)destination$iv$iv));
      int minCommonIndent = var10000 != null ? var10000 : 0;
      int resultSizeEstimate$iv = $this$replaceIndent.length() + newIndent.length() * lines.size();
      Function1 indentAddFunction$iv = getIndentFunction$StringsKt__IndentKt(newIndent);
      int $i$f$reindent = false;
      int lastIndex$iv = CollectionsKt.getLastIndex(lines);
      Iterable $this$mapIndexedNotNull$iv$iv = (Iterable)lines;
      int $i$f$mapIndexedNotNull = false;
      Collection destination$iv$iv$iv = (Collection)(new ArrayList());
      $i$f$mapIndexedNotNullTo = false;
      int $i$f$forEachIndexed = false;
      int index$iv$iv$iv$iv = 0;
      Iterator var17 = $this$mapIndexedNotNull$iv$iv.iterator();

      while(var17.hasNext()) {
         Object item$iv$iv$iv$iv = var17.next();
         int var19 = index$iv$iv$iv$iv++;
         if (var19 < 0) {
            CollectionsKt.throwIndexOverflow();
         }

         int var22 = false;
         String value$iv = (String)item$iv$iv$iv$iv;
         int var25 = false;
         String var38;
         if ((var19 == 0 || var19 == lastIndex$iv) && StringsKt.isBlank((CharSequence)value$iv)) {
            var38 = null;
         } else {
            label78: {
               int var27 = false;
               var38 = StringsKt.drop(value$iv, minCommonIndent);
               if (var38 != null) {
                  var38 = (String)indentAddFunction$iv.invoke(var38);
                  if (var38 != null) {
                     break label78;
                  }
               }

               var38 = value$iv;
            }
         }

         if (var38 != null) {
            Object it$iv$iv$iv = var38;
            int var29 = false;
            destination$iv$iv$iv.add(it$iv$iv$iv);
         }
      }

      return ((StringBuilder)CollectionsKt.joinTo$default((Iterable)((List)destination$iv$iv$iv), (Appendable)(new StringBuilder(resultSizeEstimate$iv)), (CharSequence)"\n", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 124, (Object)null)).toString();
   }

   // $FF: synthetic method
   public static String replaceIndent$default(String var0, String var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = "";
      }

      return StringsKt.replaceIndent(var0, var1);
   }

   @NotNull
   public static final String prependIndent(@NotNull String $this$prependIndent, @NotNull String indent) {
      Intrinsics.checkNotNullParameter($this$prependIndent, "<this>");
      Intrinsics.checkNotNullParameter(indent, "indent");
      return SequencesKt.joinToString$default(SequencesKt.map(StringsKt.lineSequence((CharSequence)$this$prependIndent), StringsKt__IndentKt::prependIndent$lambda$5$StringsKt__IndentKt), (CharSequence)"\n", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null);
   }

   // $FF: synthetic method
   public static String prependIndent$default(String var0, String var1, int var2, Object var3) {
      if ((var2 & 1) != 0) {
         var1 = "    ";
      }

      return StringsKt.prependIndent(var0, var1);
   }

   private static final int indentWidth$StringsKt__IndentKt(String $this$indentWidth) {
      CharSequence $this$indexOfFirst$iv = (CharSequence)$this$indentWidth;
      int $i$f$indexOfFirst = false;
      int index$iv = 0;
      int var4 = $this$indexOfFirst$iv.length();

      int var10000;
      while(true) {
         if (index$iv >= var4) {
            var10000 = -1;
            break;
         }

         char it = $this$indexOfFirst$iv.charAt(index$iv);
         int var6 = false;
         if (!CharsKt.isWhitespace(it)) {
            var10000 = index$iv;
            break;
         }

         ++index$iv;
      }

      int it = var10000;
      int var8 = false;
      return it == -1 ? $this$indentWidth.length() : it;
   }

   private static final Function1<String, String> getIndentFunction$StringsKt__IndentKt(String indent) {
      return ((CharSequence)indent).length() == 0 ? StringsKt__IndentKt::getIndentFunction$lambda$8$StringsKt__IndentKt : StringsKt__IndentKt::getIndentFunction$lambda$9$StringsKt__IndentKt;
   }

   private static final String reindent$StringsKt__IndentKt(List<String> $this$reindent, int resultSizeEstimate, Function1<? super String, String> indentAddFunction, Function1<? super String, String> indentCutFunction) {
      int $i$f$reindent = false;
      int lastIndex = CollectionsKt.getLastIndex($this$reindent);
      Iterable $this$mapIndexedNotNull$iv = (Iterable)$this$reindent;
      int $i$f$mapIndexedNotNull = false;
      Collection destination$iv$iv = (Collection)(new ArrayList());
      int $i$f$mapIndexedNotNullTo = false;
      int $i$f$forEachIndexed = false;
      int index$iv$iv$iv = 0;
      Iterator var14 = $this$mapIndexedNotNull$iv.iterator();

      while(var14.hasNext()) {
         Object item$iv$iv$iv = var14.next();
         int var16 = index$iv$iv$iv++;
         if (var16 < 0) {
            CollectionsKt.throwIndexOverflow();
         }

         int var19 = false;
         String value = (String)item$iv$iv$iv;
         int var22 = false;
         String var25;
         if ((var16 == 0 || var16 == lastIndex) && StringsKt.isBlank((CharSequence)value)) {
            var25 = null;
         } else {
            label42: {
               var25 = (String)indentCutFunction.invoke(value);
               if (var25 != null) {
                  var25 = (String)indentAddFunction.invoke(var25);
                  if (var25 != null) {
                     break label42;
                  }
               }

               var25 = value;
            }
         }

         if (var25 != null) {
            Object it$iv$iv = var25;
            int var24 = false;
            destination$iv$iv.add(it$iv$iv);
         }
      }

      return ((StringBuilder)CollectionsKt.joinTo$default((Iterable)((List)destination$iv$iv), (Appendable)(new StringBuilder(resultSizeEstimate)), (CharSequence)"\n", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 124, (Object)null)).toString();
   }

   private static final String prependIndent$lambda$5$StringsKt__IndentKt(String $indent, String it) {
      Intrinsics.checkNotNullParameter(it, "it");
      return StringsKt.isBlank((CharSequence)it) ? (it.length() < $indent.length() ? $indent : it) : $indent + it;
   }

   private static final String getIndentFunction$lambda$8$StringsKt__IndentKt(String line) {
      Intrinsics.checkNotNullParameter(line, "line");
      return line;
   }

   private static final String getIndentFunction$lambda$9$StringsKt__IndentKt(String $indent, String line) {
      Intrinsics.checkNotNullParameter(line, "line");
      return $indent + line;
   }

   public StringsKt__IndentKt() {
   }
}
