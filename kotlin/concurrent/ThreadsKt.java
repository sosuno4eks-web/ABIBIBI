package kotlin.concurrent;

import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(
   name = "ThreadsKt"
)
public final class ThreadsKt {
   @NotNull
   public static final Thread thread(boolean start, boolean isDaemon, @Nullable ClassLoader contextClassLoader, @Nullable String name, int priority, @NotNull Function0<Unit> block) {
      Intrinsics.checkNotNullParameter(block, "block");
      <undefinedtype> thread = new Thread() {
         public void run() {
            block.invoke();
         }
      };
      if (isDaemon) {
         thread.setDaemon(true);
      }

      if (priority > 0) {
         thread.setPriority(priority);
      }

      if (name != null) {
         thread.setName(name);
      }

      if (contextClassLoader != null) {
         thread.setContextClassLoader(contextClassLoader);
      }

      if (start) {
         thread.start();
      }

      return (Thread)thread;
   }

   // $FF: synthetic method
   public static Thread thread$default(boolean var0, boolean var1, ClassLoader var2, String var3, int var4, Function0 var5, int var6, Object var7) {
      if ((var6 & 1) != 0) {
         var0 = true;
      }

      if ((var6 & 2) != 0) {
         var1 = false;
      }

      if ((var6 & 4) != 0) {
         var2 = null;
      }

      if ((var6 & 8) != 0) {
         var3 = null;
      }

      if ((var6 & 16) != 0) {
         var4 = -1;
      }

      return thread(var0, var1, var2, var3, var4, var5);
   }

   @InlineOnly
   private static final <T> T getOrSet(ThreadLocal<T> $this$getOrSet, Function0<? extends T> default) {
      Intrinsics.checkNotNullParameter($this$getOrSet, "<this>");
      Intrinsics.checkNotNullParameter(var1, "default");
      Object var10000 = $this$getOrSet.get();
      if (var10000 == null) {
         Object var2 = var1.invoke();
         int var4 = false;
         $this$getOrSet.set(var2);
         var10000 = var2;
      }

      return var10000;
   }
}
