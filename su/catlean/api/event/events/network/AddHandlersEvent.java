package su.catlean.api.event.events.network;

import io.netty.channel.ChannelPipeline;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import net.minecraft.class_2598;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class AddHandlersEvent extends Event {
   @NotNull
   public static final AddHandlersEvent INSTANCE;
   // $FF: synthetic field
   static final KProperty<Object>[] $$delegatedProperties;
   private static AtomicReference<ChannelPipeline> pipeline;
   private static class_2598 side;
   @NotNull
   private static final ReadWriteProperty local$delegate;

   private AddHandlersEvent() {
   }

   @NotNull
   public final AtomicReference<ChannelPipeline> getPipeline() {
      AtomicReference var10000 = pipeline;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("pipeline");
         return null;
      }
   }

   @NotNull
   public final class_2598 getSide() {
      class_2598 var10000 = side;
      if (var10000 != null) {
         return var10000;
      } else {
         Intrinsics.throwUninitializedPropertyAccessException("side");
         return null;
      }
   }

   public final boolean getLocal() {
      return (Boolean)local$delegate.getValue(this, $$delegatedProperties[0]);
   }

   private final void setLocal(boolean <set-?>) {
      local$delegate.setValue(this, $$delegatedProperties[0], var1);
   }

   public final boolean call(@NotNull AtomicReference<ChannelPipeline> pipeline, @NotNull class_2598 side, boolean local) {
      Intrinsics.checkNotNullParameter(pipeline, "pipeline");
      Intrinsics.checkNotNullParameter(side, "side");
      this.setCancelled(false);
      AddHandlersEvent.pipeline = pipeline;
      AddHandlersEvent.side = side;
      this.setLocal(local);
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }

   static {
      KProperty[] var0 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(AddHandlersEvent.class, "local", "getLocal()Z", 0)))};
      $$delegatedProperties = var0;
      INSTANCE = new AddHandlersEvent();
      local$delegate = Delegates.INSTANCE.notNull();
   }
}
