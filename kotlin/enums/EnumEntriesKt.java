package kotlin.enums;

import kotlin.ExperimentalStdlibApi;
import kotlin.NotImplementedError;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class EnumEntriesKt {
   // $FF: synthetic method
   @WasExperimental(
      markerClass = {ExperimentalStdlibApi.class}
   )
   @SinceKotlin(
      version = "2.0"
   )
   public static final <T extends Enum<T>> EnumEntries<T> enumEntries() {
      int $i$f$enumEntries = false;
      throw new NotImplementedError((String)null, 1, (DefaultConstructorMarker)null);
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.8"
   )
   @NotNull
   public static final <E extends Enum<E>> EnumEntries<E> enumEntries(@NotNull Function0<E[]> entriesProvider) {
      Intrinsics.checkNotNullParameter(entriesProvider, "entriesProvider");
      return (EnumEntries)(new EnumEntriesList((Enum[])entriesProvider.invoke()));
   }

   @PublishedApi
   @SinceKotlin(
      version = "1.8"
   )
   @NotNull
   public static final <E extends Enum<E>> EnumEntries<E> enumEntries(@NotNull E[] entries) {
      Intrinsics.checkNotNullParameter(entries, "entries");
      return (EnumEntries)(new EnumEntriesList(entries));
   }
}
