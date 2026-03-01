package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.StringOpsKt;
import kotlinx.serialization.json.internal.SuppressAnimalSniffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JsonLiteral extends JsonPrimitive {
   private final boolean isString;
   @Nullable
   private final SerialDescriptor coerceToInlineType;
   @NotNull
   private final String content;

   public JsonLiteral(@NotNull Object body, boolean isString, @Nullable SerialDescriptor coerceToInlineType) {
      Intrinsics.checkNotNullParameter(body, "body");
      super((DefaultConstructorMarker)null);
      this.isString = isString;
      this.coerceToInlineType = coerceToInlineType;
      this.content = body.toString();
      if (this.coerceToInlineType != null && !this.coerceToInlineType.isInline()) {
         String var4 = "Failed requirement.";
         throw new IllegalArgumentException(var4.toString());
      }
   }

   // $FF: synthetic method
   public JsonLiteral(Object var1, boolean var2, SerialDescriptor var3, int var4, DefaultConstructorMarker var5) {
      if ((var4 & 4) != 0) {
         var3 = null;
      }

      this(var1, var2, var3);
   }

   public boolean isString() {
      return this.isString;
   }

   @Nullable
   public final SerialDescriptor getCoerceToInlineType$kotlinx_serialization_json() {
      return this.coerceToInlineType;
   }

   @NotNull
   public String getContent() {
      return this.content;
   }

   @NotNull
   public String toString() {
      String var10000;
      if (this.isString()) {
         StringBuilder var1 = new StringBuilder();
         int var3 = false;
         StringOpsKt.printQuoted(var1, this.getContent());
         var10000 = var1.toString();
      } else {
         var10000 = this.getContent();
      }

      return var10000;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (other != null && this.getClass() == other.getClass()) {
         JsonLiteral var10000 = (JsonLiteral)other;
         if (this.isString() != ((JsonLiteral)other).isString()) {
            return false;
         } else {
            return Intrinsics.areEqual((Object)this.getContent(), (Object)((JsonLiteral)other).getContent());
         }
      } else {
         return false;
      }
   }

   @SuppressAnimalSniffer
   public int hashCode() {
      int result = Boolean.hashCode(this.isString());
      result = 31 * result + this.getContent().hashCode();
      return result;
   }
}
