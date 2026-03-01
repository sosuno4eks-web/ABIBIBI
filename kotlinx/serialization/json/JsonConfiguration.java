package kotlinx.serialization.json;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JsonConfiguration {
   private final boolean encodeDefaults;
   private final boolean ignoreUnknownKeys;
   private final boolean isLenient;
   private final boolean allowStructuredMapKeys;
   private final boolean prettyPrint;
   private final boolean explicitNulls;
   @NotNull
   private final String prettyPrintIndent;
   private final boolean coerceInputValues;
   private final boolean useArrayPolymorphism;
   @NotNull
   private final String classDiscriminator;
   private final boolean allowSpecialFloatingPointValues;
   private final boolean useAlternativeNames;
   @Nullable
   private final JsonNamingStrategy namingStrategy;
   private final boolean decodeEnumsCaseInsensitive;
   private final boolean allowTrailingComma;
   private final boolean allowComments;
   @NotNull
   private ClassDiscriminatorMode classDiscriminatorMode;

   public JsonConfiguration(boolean encodeDefaults, boolean ignoreUnknownKeys, boolean isLenient, boolean allowStructuredMapKeys, boolean prettyPrint, boolean explicitNulls, @NotNull String prettyPrintIndent, boolean coerceInputValues, boolean useArrayPolymorphism, @NotNull String classDiscriminator, boolean allowSpecialFloatingPointValues, boolean useAlternativeNames, @Nullable JsonNamingStrategy namingStrategy, boolean decodeEnumsCaseInsensitive, boolean allowTrailingComma, boolean allowComments, @NotNull ClassDiscriminatorMode classDiscriminatorMode) {
      Intrinsics.checkNotNullParameter(prettyPrintIndent, "prettyPrintIndent");
      Intrinsics.checkNotNullParameter(classDiscriminator, "classDiscriminator");
      Intrinsics.checkNotNullParameter(classDiscriminatorMode, "classDiscriminatorMode");
      super();
      this.encodeDefaults = encodeDefaults;
      this.ignoreUnknownKeys = ignoreUnknownKeys;
      this.isLenient = isLenient;
      this.allowStructuredMapKeys = allowStructuredMapKeys;
      this.prettyPrint = prettyPrint;
      this.explicitNulls = explicitNulls;
      this.prettyPrintIndent = prettyPrintIndent;
      this.coerceInputValues = coerceInputValues;
      this.useArrayPolymorphism = useArrayPolymorphism;
      this.classDiscriminator = classDiscriminator;
      this.allowSpecialFloatingPointValues = allowSpecialFloatingPointValues;
      this.useAlternativeNames = useAlternativeNames;
      this.namingStrategy = namingStrategy;
      this.decodeEnumsCaseInsensitive = decodeEnumsCaseInsensitive;
      this.allowTrailingComma = allowTrailingComma;
      this.allowComments = allowComments;
      this.classDiscriminatorMode = classDiscriminatorMode;
   }

   // $FF: synthetic method
   public JsonConfiguration(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5, boolean var6, String var7, boolean var8, boolean var9, String var10, boolean var11, boolean var12, JsonNamingStrategy var13, boolean var14, boolean var15, boolean var16, ClassDiscriminatorMode var17, int var18, DefaultConstructorMarker var19) {
      if ((var18 & 1) != 0) {
         var1 = false;
      }

      if ((var18 & 2) != 0) {
         var2 = false;
      }

      if ((var18 & 4) != 0) {
         var3 = false;
      }

      if ((var18 & 8) != 0) {
         var4 = false;
      }

      if ((var18 & 16) != 0) {
         var5 = false;
      }

      if ((var18 & 32) != 0) {
         var6 = true;
      }

      if ((var18 & 64) != 0) {
         var7 = "    ";
      }

      if ((var18 & 128) != 0) {
         var8 = false;
      }

      if ((var18 & 256) != 0) {
         var9 = false;
      }

      if ((var18 & 512) != 0) {
         var10 = "type";
      }

      if ((var18 & 1024) != 0) {
         var11 = false;
      }

      if ((var18 & 2048) != 0) {
         var12 = true;
      }

      if ((var18 & 4096) != 0) {
         var13 = null;
      }

      if ((var18 & 8192) != 0) {
         var14 = false;
      }

      if ((var18 & 16384) != 0) {
         var15 = false;
      }

      if ((var18 & '耀') != 0) {
         var16 = false;
      }

      if ((var18 & 65536) != 0) {
         var17 = ClassDiscriminatorMode.POLYMORPHIC;
      }

      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17);
   }

   public final boolean getEncodeDefaults() {
      return this.encodeDefaults;
   }

   public final boolean getIgnoreUnknownKeys() {
      return this.ignoreUnknownKeys;
   }

   public final boolean isLenient() {
      return this.isLenient;
   }

   public final boolean getAllowStructuredMapKeys() {
      return this.allowStructuredMapKeys;
   }

   public final boolean getPrettyPrint() {
      return this.prettyPrint;
   }

   public final boolean getExplicitNulls() {
      return this.explicitNulls;
   }

   @NotNull
   public final String getPrettyPrintIndent() {
      return this.prettyPrintIndent;
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static void getPrettyPrintIndent$annotations() {
   }

   public final boolean getCoerceInputValues() {
      return this.coerceInputValues;
   }

   public final boolean getUseArrayPolymorphism() {
      return this.useArrayPolymorphism;
   }

   @NotNull
   public final String getClassDiscriminator() {
      return this.classDiscriminator;
   }

   public final boolean getAllowSpecialFloatingPointValues() {
      return this.allowSpecialFloatingPointValues;
   }

   public final boolean getUseAlternativeNames() {
      return this.useAlternativeNames;
   }

   @Nullable
   public final JsonNamingStrategy getNamingStrategy() {
      return this.namingStrategy;
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static void getNamingStrategy$annotations() {
   }

   public final boolean getDecodeEnumsCaseInsensitive() {
      return this.decodeEnumsCaseInsensitive;
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static void getDecodeEnumsCaseInsensitive$annotations() {
   }

   public final boolean getAllowTrailingComma() {
      return this.allowTrailingComma;
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static void getAllowTrailingComma$annotations() {
   }

   public final boolean getAllowComments() {
      return this.allowComments;
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static void getAllowComments$annotations() {
   }

   @NotNull
   public final ClassDiscriminatorMode getClassDiscriminatorMode() {
      return this.classDiscriminatorMode;
   }

   /** @deprecated */
   @Deprecated(
      message = "JsonConfiguration is not meant to be mutable, and will be made read-only in a future release. The `Json(from = ...) {}` copy builder should be used instead.",
      level = DeprecationLevel.ERROR
   )
   public final void setClassDiscriminatorMode(@NotNull ClassDiscriminatorMode <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.classDiscriminatorMode = var1;
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static void getClassDiscriminatorMode$annotations() {
   }

   @NotNull
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("JsonConfiguration(encodeDefaults=").append(this.encodeDefaults).append(", ignoreUnknownKeys=").append(this.ignoreUnknownKeys).append(", isLenient=").append(this.isLenient).append(", allowStructuredMapKeys=").append(this.allowStructuredMapKeys).append(", prettyPrint=").append(this.prettyPrint).append(", explicitNulls=").append(this.explicitNulls).append(", prettyPrintIndent='").append(this.prettyPrintIndent).append("', coerceInputValues=").append(this.coerceInputValues).append(", useArrayPolymorphism=").append(this.useArrayPolymorphism).append(", classDiscriminator='").append(this.classDiscriminator).append("', allowSpecialFloatingPointValues=").append(this.allowSpecialFloatingPointValues).append(", useAlternativeNames=");
      var1.append(this.useAlternativeNames).append(", namingStrategy=").append(this.namingStrategy).append(", decodeEnumsCaseInsensitive=").append(this.decodeEnumsCaseInsensitive).append(", allowTrailingComma=").append(this.allowTrailingComma).append(", allowComments=").append(this.allowComments).append(", classDiscriminatorMode=").append(this.classDiscriminatorMode).append(')');
      return var1.toString();
   }

   public JsonConfiguration() {
      this(false, false, false, false, false, false, (String)null, false, false, (String)null, false, false, (JsonNamingStrategy)null, false, false, false, (ClassDiscriminatorMode)null, 131071, (DefaultConstructorMarker)null);
   }
}
