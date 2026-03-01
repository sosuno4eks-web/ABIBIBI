package kotlin.reflect;

import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface KParameter extends KAnnotatedElement {
   int getIndex();

   @Nullable
   String getName();

   @NotNull
   KType getType();

   @NotNull
   KParameter.Kind getKind();

   boolean isOptional();

   boolean isVararg();

   public static final class DefaultImpls {
      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void isVararg$annotations() {
      }
   }

   public static enum Kind {
      INSTANCE,
      EXTENSION_RECEIVER,
      VALUE;

      // $FF: synthetic field
      private static final EnumEntries $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);

      @NotNull
      public static EnumEntries<KParameter.Kind> getEntries() {
         return $ENTRIES;
      }

      // $FF: synthetic method
      private static final KParameter.Kind[] $values() {
         KParameter.Kind[] var0 = new KParameter.Kind[]{INSTANCE, EXTENSION_RECEIVER, VALUE};
         return var0;
      }
   }
}
