package kotlin.enums;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class EnumEntriesSerializationProxy<E extends Enum<E>> implements Serializable {
   @NotNull
   private static final EnumEntriesSerializationProxy.Companion Companion = new EnumEntriesSerializationProxy.Companion((DefaultConstructorMarker)null);
   @NotNull
   private final Class<E> c;
   private static final long serialVersionUID = 0L;

   public EnumEntriesSerializationProxy(@NotNull E[] entries) {
      Intrinsics.checkNotNullParameter(entries, "entries");
      super();
      Class var10001 = entries.getClass().getComponentType();
      Intrinsics.checkNotNull(var10001);
      this.c = var10001;
   }

   private final Object readResolve() {
      Object[] var10000 = this.c.getEnumConstants();
      Intrinsics.checkNotNullExpressionValue(var10000, "getEnumConstants(...)");
      return EnumEntriesKt.enumEntries((Enum[])var10000);
   }

   private static final class Companion {
      private Companion() {
      }

      // $FF: synthetic method
      public Companion(DefaultConstructorMarker $constructor_marker) {
         this();
      }
   }
}
