package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@WasExperimental(
   markerClass = {ExperimentalStdlibApi.class}
)
@SinceKotlin(
   version = "2.2"
)
public final class HexFormat {
   @NotNull
   public static final HexFormat.Companion Companion = new HexFormat.Companion((DefaultConstructorMarker)null);
   private final boolean upperCase;
   @NotNull
   private final HexFormat.BytesHexFormat bytes;
   @NotNull
   private final HexFormat.NumberHexFormat number;
   @NotNull
   private static final HexFormat Default;
   @NotNull
   private static final HexFormat UpperCase;

   public HexFormat(boolean upperCase, @NotNull HexFormat.BytesHexFormat bytes, @NotNull HexFormat.NumberHexFormat number) {
      Intrinsics.checkNotNullParameter(bytes, "bytes");
      Intrinsics.checkNotNullParameter(number, "number");
      super();
      this.upperCase = upperCase;
      this.bytes = bytes;
      this.number = number;
   }

   public final boolean getUpperCase() {
      return this.upperCase;
   }

   @NotNull
   public final HexFormat.BytesHexFormat getBytes() {
      return this.bytes;
   }

   @NotNull
   public final HexFormat.NumberHexFormat getNumber() {
      return this.number;
   }

   @NotNull
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      int var3 = false;
      var1.append("HexFormat(").append('\n');
      StringBuilder var4 = var1.append("    upperCase = ").append(this.upperCase);
      var4.append(",").append('\n');
      var1.append("    bytes = BytesHexFormat(").append('\n');
      this.bytes.appendOptionsTo$kotlin_stdlib(var1, "        ").append('\n');
      var1.append("    ),").append('\n');
      var1.append("    number = NumberHexFormat(").append('\n');
      this.number.appendOptionsTo$kotlin_stdlib(var1, "        ").append('\n');
      var1.append("    )").append('\n');
      var1.append(")");
      return var1.toString();
   }

   static {
      Default = new HexFormat(false, HexFormat.BytesHexFormat.Companion.getDefault$kotlin_stdlib(), HexFormat.NumberHexFormat.Companion.getDefault$kotlin_stdlib());
      UpperCase = new HexFormat(true, HexFormat.BytesHexFormat.Companion.getDefault$kotlin_stdlib(), HexFormat.NumberHexFormat.Companion.getDefault$kotlin_stdlib());
   }

   public static final class Builder {
      private boolean upperCase;
      @Nullable
      private HexFormat.BytesHexFormat.Builder _bytes;
      @Nullable
      private HexFormat.NumberHexFormat.Builder _number;

      @PublishedApi
      public Builder() {
         this.upperCase = HexFormat.Companion.getDefault().getUpperCase();
      }

      public final boolean getUpperCase() {
         return this.upperCase;
      }

      public final void setUpperCase(boolean <set-?>) {
         this.upperCase = var1;
      }

      @NotNull
      public final HexFormat.BytesHexFormat.Builder getBytes() {
         if (this._bytes == null) {
            this._bytes = new HexFormat.BytesHexFormat.Builder();
         }

         HexFormat.BytesHexFormat.Builder var10000 = this._bytes;
         Intrinsics.checkNotNull(var10000);
         return var10000;
      }

      @NotNull
      public final HexFormat.NumberHexFormat.Builder getNumber() {
         if (this._number == null) {
            this._number = new HexFormat.NumberHexFormat.Builder();
         }

         HexFormat.NumberHexFormat.Builder var10000 = this._number;
         Intrinsics.checkNotNull(var10000);
         return var10000;
      }

      @InlineOnly
      private final void bytes(Function1<? super HexFormat.BytesHexFormat.Builder, Unit> builderAction) {
         Intrinsics.checkNotNullParameter(builderAction, "builderAction");
         builderAction.invoke(this.getBytes());
      }

      @InlineOnly
      private final void number(Function1<? super HexFormat.NumberHexFormat.Builder, Unit> builderAction) {
         Intrinsics.checkNotNullParameter(builderAction, "builderAction");
         builderAction.invoke(this.getNumber());
      }

      @PublishedApi
      @NotNull
      public final HexFormat build() {
         HexFormat var10000;
         HexFormat.BytesHexFormat var1;
         boolean var10002;
         label19: {
            var10000 = new HexFormat;
            var10002 = this.upperCase;
            HexFormat.BytesHexFormat.Builder var10003 = this._bytes;
            if (var10003 != null) {
               var1 = var10003.build$kotlin_stdlib();
               if (var1 != null) {
                  break label19;
               }
            }

            var1 = HexFormat.BytesHexFormat.Companion.getDefault$kotlin_stdlib();
         }

         HexFormat.NumberHexFormat var2;
         label14: {
            HexFormat.NumberHexFormat.Builder var10004 = this._number;
            if (var10004 != null) {
               var2 = var10004.build$kotlin_stdlib();
               if (var2 != null) {
                  break label14;
               }
            }

            var2 = HexFormat.NumberHexFormat.Companion.getDefault$kotlin_stdlib();
         }

         var10000.<init>(var10002, var1, var2);
         return var10000;
      }
   }

   public static final class BytesHexFormat {
      @NotNull
      public static final HexFormat.BytesHexFormat.Companion Companion = new HexFormat.BytesHexFormat.Companion((DefaultConstructorMarker)null);
      private final int bytesPerLine;
      private final int bytesPerGroup;
      @NotNull
      private final String groupSeparator;
      @NotNull
      private final String byteSeparator;
      @NotNull
      private final String bytePrefix;
      @NotNull
      private final String byteSuffix;
      private final boolean noLineAndGroupSeparator;
      private final boolean shortByteSeparatorNoPrefixAndSuffix;
      private final boolean ignoreCase;
      @NotNull
      private static final HexFormat.BytesHexFormat Default = new HexFormat.BytesHexFormat(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

      public BytesHexFormat(int bytesPerLine, int bytesPerGroup, @NotNull String groupSeparator, @NotNull String byteSeparator, @NotNull String bytePrefix, @NotNull String byteSuffix) {
         Intrinsics.checkNotNullParameter(groupSeparator, "groupSeparator");
         Intrinsics.checkNotNullParameter(byteSeparator, "byteSeparator");
         Intrinsics.checkNotNullParameter(bytePrefix, "bytePrefix");
         Intrinsics.checkNotNullParameter(byteSuffix, "byteSuffix");
         super();
         this.bytesPerLine = bytesPerLine;
         this.bytesPerGroup = bytesPerGroup;
         this.groupSeparator = groupSeparator;
         this.byteSeparator = byteSeparator;
         this.bytePrefix = bytePrefix;
         this.byteSuffix = byteSuffix;
         this.noLineAndGroupSeparator = this.bytesPerLine == Integer.MAX_VALUE && this.bytesPerGroup == Integer.MAX_VALUE;
         this.shortByteSeparatorNoPrefixAndSuffix = ((CharSequence)this.bytePrefix).length() == 0 && ((CharSequence)this.byteSuffix).length() == 0 && this.byteSeparator.length() <= 1;
         this.ignoreCase = HexFormatKt.access$isCaseSensitive(this.groupSeparator) || HexFormatKt.access$isCaseSensitive(this.byteSeparator) || HexFormatKt.access$isCaseSensitive(this.bytePrefix) || HexFormatKt.access$isCaseSensitive(this.byteSuffix);
      }

      public final int getBytesPerLine() {
         return this.bytesPerLine;
      }

      public final int getBytesPerGroup() {
         return this.bytesPerGroup;
      }

      @NotNull
      public final String getGroupSeparator() {
         return this.groupSeparator;
      }

      @NotNull
      public final String getByteSeparator() {
         return this.byteSeparator;
      }

      @NotNull
      public final String getBytePrefix() {
         return this.bytePrefix;
      }

      @NotNull
      public final String getByteSuffix() {
         return this.byteSuffix;
      }

      public final boolean getNoLineAndGroupSeparator$kotlin_stdlib() {
         return this.noLineAndGroupSeparator;
      }

      public final boolean getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib() {
         return this.shortByteSeparatorNoPrefixAndSuffix;
      }

      public final boolean getIgnoreCase$kotlin_stdlib() {
         return this.ignoreCase;
      }

      @NotNull
      public String toString() {
         StringBuilder var1 = new StringBuilder();
         int var3 = false;
         var1.append("BytesHexFormat(").append('\n');
         this.appendOptionsTo$kotlin_stdlib(var1, "    ").append('\n');
         var1.append(")");
         return var1.toString();
      }

      @NotNull
      public final StringBuilder appendOptionsTo$kotlin_stdlib(@NotNull StringBuilder sb, @NotNull String indent) {
         Intrinsics.checkNotNullParameter(sb, "sb");
         Intrinsics.checkNotNullParameter(indent, "indent");
         StringBuilder var3 = sb.append(indent).append("bytesPerLine = ").append(this.bytesPerLine);
         var3.append(",").append('\n');
         var3 = sb.append(indent).append("bytesPerGroup = ").append(this.bytesPerGroup);
         var3.append(",").append('\n');
         var3 = sb.append(indent).append("groupSeparator = \"").append(this.groupSeparator);
         var3.append("\",").append('\n');
         var3 = sb.append(indent).append("byteSeparator = \"").append(this.byteSeparator);
         var3.append("\",").append('\n');
         var3 = sb.append(indent).append("bytePrefix = \"").append(this.bytePrefix);
         var3.append("\",").append('\n');
         sb.append(indent).append("byteSuffix = \"").append(this.byteSuffix).append("\"");
         return sb;
      }

      public static final class Builder {
         private int bytesPerLine;
         private int bytesPerGroup;
         @NotNull
         private String groupSeparator;
         @NotNull
         private String byteSeparator;
         @NotNull
         private String bytePrefix;
         @NotNull
         private String byteSuffix;

         public Builder() {
            this.bytesPerLine = HexFormat.BytesHexFormat.Companion.getDefault$kotlin_stdlib().getBytesPerLine();
            this.bytesPerGroup = HexFormat.BytesHexFormat.Companion.getDefault$kotlin_stdlib().getBytesPerGroup();
            this.groupSeparator = HexFormat.BytesHexFormat.Companion.getDefault$kotlin_stdlib().getGroupSeparator();
            this.byteSeparator = HexFormat.BytesHexFormat.Companion.getDefault$kotlin_stdlib().getByteSeparator();
            this.bytePrefix = HexFormat.BytesHexFormat.Companion.getDefault$kotlin_stdlib().getBytePrefix();
            this.byteSuffix = HexFormat.BytesHexFormat.Companion.getDefault$kotlin_stdlib().getByteSuffix();
         }

         public final int getBytesPerLine() {
            return this.bytesPerLine;
         }

         public final void setBytesPerLine(int value) {
            if (value <= 0) {
               throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was " + value);
            } else {
               this.bytesPerLine = value;
            }
         }

         public final int getBytesPerGroup() {
            return this.bytesPerGroup;
         }

         public final void setBytesPerGroup(int value) {
            if (value <= 0) {
               throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was " + value);
            } else {
               this.bytesPerGroup = value;
            }
         }

         @NotNull
         public final String getGroupSeparator() {
            return this.groupSeparator;
         }

         public final void setGroupSeparator(@NotNull String <set-?>) {
            Intrinsics.checkNotNullParameter(var1, "<set-?>");
            this.groupSeparator = var1;
         }

         @NotNull
         public final String getByteSeparator() {
            return this.byteSeparator;
         }

         public final void setByteSeparator(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!StringsKt.contains$default((CharSequence)value, '\n', false, 2, (Object)null) && !StringsKt.contains$default((CharSequence)value, '\r', false, 2, (Object)null)) {
               this.byteSeparator = value;
            } else {
               throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was " + value);
            }
         }

         @NotNull
         public final String getBytePrefix() {
            return this.bytePrefix;
         }

         public final void setBytePrefix(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!StringsKt.contains$default((CharSequence)value, '\n', false, 2, (Object)null) && !StringsKt.contains$default((CharSequence)value, '\r', false, 2, (Object)null)) {
               this.bytePrefix = value;
            } else {
               throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was " + value);
            }
         }

         @NotNull
         public final String getByteSuffix() {
            return this.byteSuffix;
         }

         public final void setByteSuffix(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!StringsKt.contains$default((CharSequence)value, '\n', false, 2, (Object)null) && !StringsKt.contains$default((CharSequence)value, '\r', false, 2, (Object)null)) {
               this.byteSuffix = value;
            } else {
               throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was " + value);
            }
         }

         @NotNull
         public final HexFormat.BytesHexFormat build$kotlin_stdlib() {
            return new HexFormat.BytesHexFormat(this.bytesPerLine, this.bytesPerGroup, this.groupSeparator, this.byteSeparator, this.bytePrefix, this.byteSuffix);
         }
      }

      public static final class Companion {
         private Companion() {
         }

         @NotNull
         public final HexFormat.BytesHexFormat getDefault$kotlin_stdlib() {
            return HexFormat.BytesHexFormat.Default;
         }

         // $FF: synthetic method
         public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
         }
      }
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final HexFormat getDefault() {
         return HexFormat.Default;
      }

      @NotNull
      public final HexFormat getUpperCase() {
         return HexFormat.UpperCase;
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }

   public static final class NumberHexFormat {
      @NotNull
      public static final HexFormat.NumberHexFormat.Companion Companion = new HexFormat.NumberHexFormat.Companion((DefaultConstructorMarker)null);
      @NotNull
      private final String prefix;
      @NotNull
      private final String suffix;
      private final boolean removeLeadingZeros;
      private final int minLength;
      private final boolean isDigitsOnly;
      private final boolean isDigitsOnlyAndNoPadding;
      private final boolean ignoreCase;
      @NotNull
      private static final HexFormat.NumberHexFormat Default = new HexFormat.NumberHexFormat("", "", false, 1);

      public NumberHexFormat(@NotNull String prefix, @NotNull String suffix, boolean removeLeadingZeros, int minLength) {
         Intrinsics.checkNotNullParameter(prefix, "prefix");
         Intrinsics.checkNotNullParameter(suffix, "suffix");
         super();
         this.prefix = prefix;
         this.suffix = suffix;
         this.removeLeadingZeros = removeLeadingZeros;
         this.minLength = minLength;
         this.isDigitsOnly = ((CharSequence)this.prefix).length() == 0 && ((CharSequence)this.suffix).length() == 0;
         this.isDigitsOnlyAndNoPadding = this.isDigitsOnly && this.minLength == 1;
         this.ignoreCase = HexFormatKt.access$isCaseSensitive(this.prefix) || HexFormatKt.access$isCaseSensitive(this.suffix);
      }

      @NotNull
      public final String getPrefix() {
         return this.prefix;
      }

      @NotNull
      public final String getSuffix() {
         return this.suffix;
      }

      public final boolean getRemoveLeadingZeros() {
         return this.removeLeadingZeros;
      }

      public final int getMinLength() {
         return this.minLength;
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "2.0"
      )
      public static void getMinLength$annotations() {
      }

      public final boolean isDigitsOnly$kotlin_stdlib() {
         return this.isDigitsOnly;
      }

      public final boolean isDigitsOnlyAndNoPadding$kotlin_stdlib() {
         return this.isDigitsOnlyAndNoPadding;
      }

      public final boolean getIgnoreCase$kotlin_stdlib() {
         return this.ignoreCase;
      }

      @NotNull
      public String toString() {
         StringBuilder var1 = new StringBuilder();
         int var3 = false;
         var1.append("NumberHexFormat(").append('\n');
         this.appendOptionsTo$kotlin_stdlib(var1, "    ").append('\n');
         var1.append(")");
         return var1.toString();
      }

      @NotNull
      public final StringBuilder appendOptionsTo$kotlin_stdlib(@NotNull StringBuilder sb, @NotNull String indent) {
         Intrinsics.checkNotNullParameter(sb, "sb");
         Intrinsics.checkNotNullParameter(indent, "indent");
         StringBuilder var3 = sb.append(indent).append("prefix = \"").append(this.prefix);
         var3.append("\",").append('\n');
         var3 = sb.append(indent).append("suffix = \"").append(this.suffix);
         var3.append("\",").append('\n');
         var3 = sb.append(indent).append("removeLeadingZeros = ").append(this.removeLeadingZeros);
         char var4 = ',';
         var3.append(var4).append('\n');
         sb.append(indent).append("minLength = ").append(this.minLength);
         return sb;
      }

      public static final class Builder {
         @NotNull
         private String prefix;
         @NotNull
         private String suffix;
         private boolean removeLeadingZeros;
         private int minLength;

         public Builder() {
            this.prefix = HexFormat.NumberHexFormat.Companion.getDefault$kotlin_stdlib().getPrefix();
            this.suffix = HexFormat.NumberHexFormat.Companion.getDefault$kotlin_stdlib().getSuffix();
            this.removeLeadingZeros = HexFormat.NumberHexFormat.Companion.getDefault$kotlin_stdlib().getRemoveLeadingZeros();
            this.minLength = HexFormat.NumberHexFormat.Companion.getDefault$kotlin_stdlib().getMinLength();
         }

         @NotNull
         public final String getPrefix() {
            return this.prefix;
         }

         public final void setPrefix(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!StringsKt.contains$default((CharSequence)value, '\n', false, 2, (Object)null) && !StringsKt.contains$default((CharSequence)value, '\r', false, 2, (Object)null)) {
               this.prefix = value;
            } else {
               throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was " + value);
            }
         }

         @NotNull
         public final String getSuffix() {
            return this.suffix;
         }

         public final void setSuffix(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (!StringsKt.contains$default((CharSequence)value, '\n', false, 2, (Object)null) && !StringsKt.contains$default((CharSequence)value, '\r', false, 2, (Object)null)) {
               this.suffix = value;
            } else {
               throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was " + value);
            }
         }

         public final boolean getRemoveLeadingZeros() {
            return this.removeLeadingZeros;
         }

         public final void setRemoveLeadingZeros(boolean <set-?>) {
            this.removeLeadingZeros = var1;
         }

         public final int getMinLength() {
            return this.minLength;
         }

         public final void setMinLength(int value) {
            if (value <= 0) {
               int var2 = false;
               String var3 = "Non-positive values are prohibited for minLength, but was " + value;
               throw new IllegalArgumentException(var3.toString());
            } else {
               this.minLength = value;
            }
         }

         /** @deprecated */
         // $FF: synthetic method
         @SinceKotlin(
            version = "2.0"
         )
         public static void getMinLength$annotations() {
         }

         @NotNull
         public final HexFormat.NumberHexFormat build$kotlin_stdlib() {
            return new HexFormat.NumberHexFormat(this.prefix, this.suffix, this.removeLeadingZeros, this.minLength);
         }
      }

      public static final class Companion {
         private Companion() {
         }

         @NotNull
         public final HexFormat.NumberHexFormat getDefault$kotlin_stdlib() {
            return HexFormat.NumberHexFormat.Default;
         }

         // $FF: synthetic method
         public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
         }
      }
   }
}
