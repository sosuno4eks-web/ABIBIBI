package com.github.weisj.jsvg.parser;

import com.github.weisj.jsvg.renderer.awt.PlatformSupport;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.swing.SwingWorker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SwingUIFuture<T> implements UIFuture<T> {
   @NotNull
   private final AtomicReference<SwingWorker<Void, Void>> swingWorker;
   @Nullable
   private T value;

   public SwingUIFuture(@NotNull Supplier<T> supplier) {
      this.swingWorker = new AtomicReference(new SwingWorker<Void, Void>() {
         protected Void doInBackground() {
            SwingUIFuture.this.value = supplier.get();
            synchronized(SwingUIFuture.this) {
               SwingUIFuture.this.swingWorker.set((Object)null);
               return null;
            }
         }
      });
      ((SwingWorker)this.swingWorker.get()).execute();
   }

   public boolean checkIfReady(@NotNull PlatformSupport platformSupport) {
      SwingWorker<?, ?> worker = (SwingWorker)this.swingWorker.get();
      if (worker != null && !worker.isDone()) {
         PlatformSupport.TargetSurface targetSurface = platformSupport.targetSurface();
         if (targetSurface != null) {
            synchronized(this) {
               worker.addPropertyChangeListener((e) -> {
                  if (worker.isDone()) {
                     targetSurface.repaint();
                  }

               });
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public T get() {
      return this.value;
   }
}
