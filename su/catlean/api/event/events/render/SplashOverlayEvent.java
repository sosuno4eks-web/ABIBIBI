package su.catlean.api.event.events.render;

import java.util.Optional;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import net.minecraft.class_4011;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;
import su.catlean.gofra.Gofra;

public final class SplashOverlayEvent extends Event {
   @NotNull
   public static final SplashOverlayEvent INSTANCE = new SplashOverlayEvent();
   private static boolean reloading;
   private static float progress;
   private static long reloadCompleteTime = -1L;
   private static long reloadStartTime = -1L;
   @Nullable
   private static class_4011 reload;
   @Nullable
   private static Consumer<Optional<Throwable>> exceptionHandler;
   @Nullable
   private static class_332 context;

   private SplashOverlayEvent() {
   }

   public final boolean getReloading() {
      return reloading;
   }

   public final void setReloading(boolean <set-?>) {
      reloading = var1;
   }

   public final float getProgress() {
      return progress;
   }

   public final void setProgress(float <set-?>) {
      progress = var1;
   }

   public final long getReloadCompleteTime() {
      return reloadCompleteTime;
   }

   public final void setReloadCompleteTime(long <set-?>) {
      reloadCompleteTime = var1;
   }

   public final long getReloadStartTime() {
      return reloadStartTime;
   }

   public final void setReloadStartTime(long <set-?>) {
      reloadStartTime = var1;
   }

   @Nullable
   public final class_4011 getReload() {
      return reload;
   }

   public final void setReload(@Nullable class_4011 <set-?>) {
      reload = var1;
   }

   @Nullable
   public final Consumer<Optional<Throwable>> getExceptionHandler() {
      return exceptionHandler;
   }

   public final void setExceptionHandler(@Nullable Consumer<Optional<Throwable>> <set-?>) {
      exceptionHandler = var1;
   }

   @Nullable
   public final class_332 getContext() {
      return context;
   }

   public final void setContext(@Nullable class_332 <set-?>) {
      context = var1;
   }

   public final boolean call(@NotNull class_332 context, boolean reloading, float progress, long reloadCompleteTime, long reloadStartTime, @Nullable class_4011 reload, @Nullable Consumer<Optional<Throwable>> exceptionHandler) {
      Intrinsics.checkNotNullParameter(context, "context");
      SplashOverlayEvent.context = context;
      SplashOverlayEvent.reloading = reloading;
      SplashOverlayEvent.progress = progress;
      SplashOverlayEvent.reloadCompleteTime = reloadCompleteTime;
      SplashOverlayEvent.reloadStartTime = reloadStartTime;
      SplashOverlayEvent.reload = reload;
      SplashOverlayEvent.exceptionHandler = exceptionHandler;
      this.setCancelled(false);
      Gofra.INSTANCE.drain(this);
      return this.getCancelled();
   }
}
