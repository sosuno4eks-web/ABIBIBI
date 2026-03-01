package kotlin.random;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class PlatformRandom extends AbstractPlatformRandom implements Serializable {
   @NotNull
   private static final PlatformRandom.Companion Companion = new PlatformRandom.Companion((DefaultConstructorMarker)null);
   @NotNull
   private final java.util.Random impl;
   private static final long serialVersionUID = 0L;

   public PlatformRandom(@NotNull java.util.Random impl) {
      Intrinsics.checkNotNullParameter(impl, "impl");
      super();
      this.impl = impl;
   }

   @NotNull
   public java.util.Random getImpl() {
      return this.impl;
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
