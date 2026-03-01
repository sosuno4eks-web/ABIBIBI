package kotlin.collections;

import org.jetbrains.annotations.NotNull;

final class State {
   @NotNull
   public static final State INSTANCE = new State();
   public static final int NOT_READY = 0;
   public static final int READY = 1;
   public static final int DONE = 2;
   public static final int FAILED = 3;

   private State() {
   }
}
