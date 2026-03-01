package kotlin.reflect;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

public interface KProperty<V> extends KCallable<V> {
   boolean isLateinit();

   boolean isConst();

   @NotNull
   KProperty.Getter<V> getGetter();

   public interface Accessor<V> {
      @NotNull
      KProperty<V> getProperty();
   }

   public static final class DefaultImpls {
      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void isLateinit$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void isConst$annotations() {
      }
   }

   public interface Getter<V> extends KProperty.Accessor<V>, KFunction<V> {
   }
}
