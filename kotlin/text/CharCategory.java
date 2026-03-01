package kotlin.text;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

public enum CharCategory {
   @NotNull
   public static final CharCategory.Companion Companion = new CharCategory.Companion((DefaultConstructorMarker)null);
   private final int value;
   @NotNull
   private final String code;
   UNASSIGNED(0, "Cn"),
   UPPERCASE_LETTER(1, "Lu"),
   LOWERCASE_LETTER(2, "Ll"),
   TITLECASE_LETTER(3, "Lt"),
   MODIFIER_LETTER(4, "Lm"),
   OTHER_LETTER(5, "Lo"),
   NON_SPACING_MARK(6, "Mn"),
   ENCLOSING_MARK(7, "Me"),
   COMBINING_SPACING_MARK(8, "Mc"),
   DECIMAL_DIGIT_NUMBER(9, "Nd"),
   LETTER_NUMBER(10, "Nl"),
   OTHER_NUMBER(11, "No"),
   SPACE_SEPARATOR(12, "Zs"),
   LINE_SEPARATOR(13, "Zl"),
   PARAGRAPH_SEPARATOR(14, "Zp"),
   CONTROL(15, "Cc"),
   FORMAT(16, "Cf"),
   PRIVATE_USE(18, "Co"),
   SURROGATE(19, "Cs"),
   DASH_PUNCTUATION(20, "Pd"),
   START_PUNCTUATION(21, "Ps"),
   END_PUNCTUATION(22, "Pe"),
   CONNECTOR_PUNCTUATION(23, "Pc"),
   OTHER_PUNCTUATION(24, "Po"),
   MATH_SYMBOL(25, "Sm"),
   CURRENCY_SYMBOL(26, "Sc"),
   MODIFIER_SYMBOL(27, "Sk"),
   OTHER_SYMBOL(28, "So"),
   INITIAL_QUOTE_PUNCTUATION(29, "Pi"),
   FINAL_QUOTE_PUNCTUATION(30, "Pf");

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   private CharCategory(int value, String code) {
      this.value = value;
      this.code = code;
   }

   public final int getValue() {
      return this.value;
   }

   @NotNull
   public final String getCode() {
      return this.code;
   }

   public final boolean contains(char char) {
      return Character.getType(var1) == this.value;
   }

   @NotNull
   public static EnumEntries<CharCategory> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final CharCategory[] $values() {
      CharCategory[] var0 = new CharCategory[]{UNASSIGNED, UPPERCASE_LETTER, LOWERCASE_LETTER, TITLECASE_LETTER, MODIFIER_LETTER, OTHER_LETTER, NON_SPACING_MARK, ENCLOSING_MARK, COMBINING_SPACING_MARK, DECIMAL_DIGIT_NUMBER, LETTER_NUMBER, OTHER_NUMBER, SPACE_SEPARATOR, LINE_SEPARATOR, PARAGRAPH_SEPARATOR, CONTROL, FORMAT, PRIVATE_USE, SURROGATE, DASH_PUNCTUATION, START_PUNCTUATION, END_PUNCTUATION, CONNECTOR_PUNCTUATION, OTHER_PUNCTUATION, MATH_SYMBOL, CURRENCY_SYMBOL, MODIFIER_SYMBOL, OTHER_SYMBOL, INITIAL_QUOTE_PUNCTUATION, FINAL_QUOTE_PUNCTUATION};
      return var0;
   }

   public static final class Companion {
      private Companion() {
      }

      @NotNull
      public final CharCategory valueOf(int category) {
         CharCategory var10000;
         if (0 <= category ? category < 17 : false) {
            var10000 = (CharCategory)CharCategory.getEntries().get(category);
         } else {
            if (!(18 <= category ? category < 31 : false)) {
               throw new IllegalArgumentException("Category #" + category + " is not defined.");
            }

            var10000 = (CharCategory)CharCategory.getEntries().get(category - 1);
         }

         return var10000;
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
