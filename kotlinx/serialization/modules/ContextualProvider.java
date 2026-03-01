package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ContextualProvider {
   private ContextualProvider() {
   }

   @NotNull
   public abstract KSerializer<?> invoke(@NotNull List<? extends KSerializer<?>> var1);

   // $FF: synthetic method
   public ContextualProvider(DefaultConstructorMarker $constructor_marker) {
      this();
   }

   public static final class Argless extends ContextualProvider {
      @NotNull
      private final KSerializer<?> serializer;

      public Argless(@NotNull KSerializer<?> serializer) {
         Intrinsics.checkNotNullParameter(serializer, "serializer");
         super((DefaultConstructorMarker)null);
         this.serializer = serializer;
      }

      @NotNull
      public final KSerializer<?> getSerializer() {
         return this.serializer;
      }

      @NotNull
      public KSerializer<?> invoke(@NotNull List<? extends KSerializer<?>> typeArgumentsSerializers) {
         Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
         return this.serializer;
      }

      public boolean equals(@Nullable Object other) {
         return other instanceof ContextualProvider.Argless && Intrinsics.areEqual((Object)((ContextualProvider.Argless)other).serializer, (Object)this.serializer);
      }

      public int hashCode() {
         return this.serializer.hashCode();
      }
   }

   public static final class WithTypeArguments extends ContextualProvider {
      @NotNull
      private final Function1<List<? extends KSerializer<?>>, KSerializer<?>> provider;

      public WithTypeArguments(@NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
         Intrinsics.checkNotNullParameter(provider, "provider");
         super((DefaultConstructorMarker)null);
         this.provider = provider;
      }

      @NotNull
      public final Function1<List<? extends KSerializer<?>>, KSerializer<?>> getProvider() {
         return this.provider;
      }

      @NotNull
      public KSerializer<?> invoke(@NotNull List<? extends KSerializer<?>> typeArgumentsSerializers) {
         Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
         return (KSerializer)this.provider.invoke(typeArgumentsSerializers);
      }
   }
}
