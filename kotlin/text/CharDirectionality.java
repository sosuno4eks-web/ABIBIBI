package kotlin.text;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

public enum CharDirectionality {
   @NotNull
   public static final CharDirectionality.Companion Companion = new CharDirectionality.Companion((DefaultConstructorMarker)null);
   private final int value;
   @NotNull
   private static final Lazy<Map<Integer, CharDirectionality>> directionalityMap$delegate = LazyKt.lazy(CharDirectionality::directionalityMap_delegate$lambda$1);
   UNDEFINED(-1),
   LEFT_TO_RIGHT(0),
   RIGHT_TO_LEFT(1),
   RIGHT_TO_LEFT_ARABIC(2),
   EUROPEAN_NUMBER(3),
   EUROPEAN_NUMBER_SEPARATOR(4),
   EUROPEAN_NUMBER_TERMINATOR(5),
   ARABIC_NUMBER(6),
   COMMON_NUMBER_SEPARATOR(7),
   NONSPACING_MARK(8),
   BOUNDARY_NEUTRAL(9),
   PARAGRAPH_SEPARATOR(10),
   SEGMENT_SEPARATOR(11),
   WHITESPACE(12),
   OTHER_NEUTRALS(13),
   LEFT_TO_RIGHT_EMBEDDING(14),
   LEFT_TO_RIGHT_OVERRIDE(15),
   RIGHT_TO_LEFT_EMBEDDING(16),
   RIGHT_TO_LEFT_OVERRIDE(17),
   POP_DIRECTIONAL_FORMAT(18);

   // $FF: synthetic field
   private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

   private CharDirectionality(int value) {
      this.value = value;
   }

   public final int getValue() {
      return this.value;
   }

   @NotNull
   public static EnumEntries<CharDirectionality> getEntries() {
      return $ENTRIES;
   }

   private static final Map directionalityMap_delegate$lambda$1() {
      Iterable $this$associateBy$iv = (Iterable)getEntries();
      int $i$f$associateBy = false;
      int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associateBy$iv, 10)), 16);
      Map destination$iv$iv = (Map)(new LinkedHashMap(capacity$iv));
      int $i$f$associateByTo = false;
      Iterator var6 = $this$associateBy$iv.iterator();

      while(var6.hasNext()) {
         Object element$iv$iv = var6.next();
         CharDirectionality it = (CharDirectionality)element$iv$iv;
         int var9 = false;
         destination$iv$iv.put(it.value, element$iv$iv);
      }

      return destination$iv$iv;
   }

   // $FF: synthetic method
   private static final CharDirectionality[] $values() {
      CharDirectionality[] var0 = new CharDirectionality[]{UNDEFINED, LEFT_TO_RIGHT, RIGHT_TO_LEFT, RIGHT_TO_LEFT_ARABIC, EUROPEAN_NUMBER, EUROPEAN_NUMBER_SEPARATOR, EUROPEAN_NUMBER_TERMINATOR, ARABIC_NUMBER, COMMON_NUMBER_SEPARATOR, NONSPACING_MARK, BOUNDARY_NEUTRAL, PARAGRAPH_SEPARATOR, SEGMENT_SEPARATOR, WHITESPACE, OTHER_NEUTRALS, LEFT_TO_RIGHT_EMBEDDING, LEFT_TO_RIGHT_OVERRIDE, RIGHT_TO_LEFT_EMBEDDING, RIGHT_TO_LEFT_OVERRIDE, POP_DIRECTIONAL_FORMAT};
      return var0;
   }

   public static final class Companion {
      private Companion() {
      }

      private final Map<Integer, CharDirectionality> getDirectionalityMap() {
         Lazy var1 = CharDirectionality.directionalityMap$delegate;
         return (Map)var1.getValue();
      }

      @NotNull
      public final CharDirectionality valueOf(int directionality) {
         return (CharDirectionality)this.getDirectionalityMap().get(directionality);
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
