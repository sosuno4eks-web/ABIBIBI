package kotlin.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

@JvmName(
   name = "LocksKt"
)
public final class LocksKt {
   @InlineOnly
   private static final <T> T withLock(Lock $this$withLock, Function0<? extends T> action) {
      Intrinsics.checkNotNullParameter($this$withLock, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      $this$withLock.lock();

      Object var2;
      try {
         var2 = action.invoke();
      } finally {
         InlineMarker.finallyStart(1);
         $this$withLock.unlock();
         InlineMarker.finallyEnd(1);
      }

      return var2;
   }

   @InlineOnly
   private static final <T> T read(ReentrantReadWriteLock $this$read, Function0<? extends T> action) {
      Intrinsics.checkNotNullParameter($this$read, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      ReadLock rl = $this$read.readLock();
      rl.lock();

      Object var3;
      try {
         var3 = action.invoke();
      } finally {
         InlineMarker.finallyStart(1);
         rl.unlock();
         InlineMarker.finallyEnd(1);
      }

      return var3;
   }

   @InlineOnly
   private static final <T> T write(ReentrantReadWriteLock $this$write, Function0<? extends T> action) {
      Intrinsics.checkNotNullParameter($this$write, "<this>");
      Intrinsics.checkNotNullParameter(action, "action");
      ReadLock rl = $this$write.readLock();
      int readCount = $this$write.getWriteHoldCount() == 0 ? $this$write.getReadHoldCount() : 0;

      for(int var4 = 0; var4 < readCount; ++var4) {
         int var6 = false;
         rl.unlock();
      }

      WriteLock wl = $this$write.writeLock();
      wl.lock();
      boolean var11 = false;

      Object var5;
      try {
         var11 = true;
         var5 = action.invoke();
         var11 = false;
      } finally {
         if (var11) {
            InlineMarker.finallyStart(1);

            for(int var7 = 0; var7 < readCount; ++var7) {
               int var9 = false;
               rl.lock();
            }

            wl.unlock();
            InlineMarker.finallyEnd(1);
         }
      }

      InlineMarker.finallyStart(1);

      for(int var14 = 0; var14 < readCount; ++var14) {
         int var8 = false;
         rl.lock();
      }

      wl.unlock();
      InlineMarker.finallyEnd(1);
      return var5;
   }
}
