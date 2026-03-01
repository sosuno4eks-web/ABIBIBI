package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.SubclassOptInRequired;
import kotlin.collections.CollectionsKt;
import kotlinx.serialization.SealedSerializationApi;
import org.jetbrains.annotations.NotNull;

@SubclassOptInRequired(
   markerClass = {SealedSerializationApi.class}
)
public interface SerialDescriptor {
   @NotNull
   String getSerialName();

   @NotNull
   SerialKind getKind();

   default boolean isNullable() {
      return false;
   }

   default boolean isInline() {
      return false;
   }

   int getElementsCount();

   @NotNull
   default List<Annotation> getAnnotations() {
      return CollectionsKt.emptyList();
   }

   @NotNull
   String getElementName(int var1);

   int getElementIndex(@NotNull String var1);

   @NotNull
   List<Annotation> getElementAnnotations(int var1);

   @NotNull
   SerialDescriptor getElementDescriptor(int var1);

   boolean isElementOptional(int var1);

   public static final class DefaultImpls {
      /** @deprecated */
      @Deprecated
      public static boolean isNullable(@NotNull SerialDescriptor $this) {
         return $this.isNullable();
      }

      /** @deprecated */
      @Deprecated
      public static boolean isInline(@NotNull SerialDescriptor $this) {
         return $this.isInline();
      }

      /** @deprecated */
      @Deprecated
      @NotNull
      public static List<Annotation> getAnnotations(@NotNull SerialDescriptor $this) {
         return $this.getAnnotations();
      }
   }
}
