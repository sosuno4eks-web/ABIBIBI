package su.catlean;

import kotlin.jvm.functions.Function0;

public final class fh implements Runnable {
   final int O;
   final Function0 n;

   public fh(int $delay, Function0 $runnable) {
      this.O = var1;
      this.n = var2;
   }

   public final void run() {
      Thread.sleep((long)this.O);
      this.n.invoke();
   }
}
