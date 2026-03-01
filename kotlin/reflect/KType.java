package kotlin.reflect;

import java.util.List;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface KType extends KAnnotatedElement {
   @Nullable
   KClassifier getClassifier();

   @NotNull
   List<KTypeProjection> getArguments();

   boolean isMarkedNullable();

   public static final class DefaultImpls {
      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void getClassifier$annotations() {
      }

      /** @deprecated */
      // $FF: synthetic method
      @SinceKotlin(
         version = "1.1"
      )
      public static void getArguments$annotations() {
      }
   }
}
