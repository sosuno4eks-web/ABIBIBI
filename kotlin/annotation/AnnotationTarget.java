package kotlin.annotation;

import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum AnnotationTarget {
   CLASS,
   ANNOTATION_CLASS,
   TYPE_PARAMETER,
   PROPERTY,
   FIELD,
   LOCAL_VARIABLE,
   VALUE_PARAMETER,
   CONSTRUCTOR,
   FUNCTION,
   PROPERTY_GETTER,
   PROPERTY_SETTER,
   TYPE,
   EXPRESSION,
   FILE,
   @SinceKotlin(
      version = "1.1"
   )
   TYPEALIAS;

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   @NotNull
   public static EnumEntries<AnnotationTarget> getEntries() {
      return $ENTRIES;
   }

   // $FF: synthetic method
   private static final AnnotationTarget[] $values() {
      AnnotationTarget[] var0 = new AnnotationTarget[]{CLASS, ANNOTATION_CLASS, TYPE_PARAMETER, PROPERTY, FIELD, LOCAL_VARIABLE, VALUE_PARAMETER, CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER, TYPE, EXPRESSION, FILE, TYPEALIAS};
      return var0;
   }
}
