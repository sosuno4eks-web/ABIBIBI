package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JsonBuilder {
   private boolean encodeDefaults;
   private boolean explicitNulls;
   private boolean ignoreUnknownKeys;
   private boolean isLenient;
   private boolean prettyPrint;
   @NotNull
   private String prettyPrintIndent;
   private boolean coerceInputValues;
   @NotNull
   private String classDiscriminator;
   @NotNull
   private ClassDiscriminatorMode classDiscriminatorMode;
   private boolean useAlternativeNames;
   @Nullable
   private JsonNamingStrategy namingStrategy;
   private boolean decodeEnumsCaseInsensitive;
   private boolean allowTrailingComma;
   private boolean allowComments;
   private boolean allowSpecialFloatingPointValues;
   private boolean allowStructuredMapKeys;
   private boolean useArrayPolymorphism;
   @NotNull
   private SerializersModule serializersModule;

   public JsonBuilder(@NotNull Json json) {
      Intrinsics.checkNotNullParameter(json, "json");
      super();
      this.encodeDefaults = json.getConfiguration().getEncodeDefaults();
      this.explicitNulls = json.getConfiguration().getExplicitNulls();
      this.ignoreUnknownKeys = json.getConfiguration().getIgnoreUnknownKeys();
      this.isLenient = json.getConfiguration().isLenient();
      this.prettyPrint = json.getConfiguration().getPrettyPrint();
      this.prettyPrintIndent = json.getConfiguration().getPrettyPrintIndent();
      this.coerceInputValues = json.getConfiguration().getCoerceInputValues();
      this.classDiscriminator = json.getConfiguration().getClassDiscriminator();
      this.classDiscriminatorMode = json.getConfiguration().getClassDiscriminatorMode();
      this.useAlternativeNames = json.getConfiguration().getUseAlternativeNames();
      this.namingStrategy = json.getConfiguration().getNamingStrategy();
      this.decodeEnumsCaseInsensitive = json.getConfiguration().getDecodeEnumsCaseInsensitive();
      this.allowTrailingComma = json.getConfiguration().getAllowTrailingComma();
      this.allowComments = json.getConfiguration().getAllowComments();
      this.allowSpecialFloatingPointValues = json.getConfiguration().getAllowSpecialFloatingPointValues();
      this.allowStructuredMapKeys = json.getConfiguration().getAllowStructuredMapKeys();
      this.useArrayPolymorphism = json.getConfiguration().getUseArrayPolymorphism();
      this.serializersModule = json.getSerializersModule();
   }

   public final boolean getEncodeDefaults() {
      return this.encodeDefaults;
   }

   public final void setEncodeDefaults(boolean <set-?>) {
      this.encodeDefaults = var1;
   }

   public final boolean getExplicitNulls() {
      return this.explicitNulls;
   }

   public final void setExplicitNulls(boolean <set-?>) {
      this.explicitNulls = var1;
   }

   public final boolean getIgnoreUnknownKeys() {
      return this.ignoreUnknownKeys;
   }

   public final void setIgnoreUnknownKeys(boolean <set-?>) {
      this.ignoreUnknownKeys = var1;
   }

   public final boolean isLenient() {
      return this.isLenient;
   }

   public final void setLenient(boolean <set-?>) {
      this.isLenient = var1;
   }

   public final boolean getPrettyPrint() {
      return this.prettyPrint;
   }

   public final void setPrettyPrint(boolean <set-?>) {
      this.prettyPrint = var1;
   }

   @NotNull
   public final String getPrettyPrintIndent() {
      return this.prettyPrintIndent;
   }

   public final void setPrettyPrintIndent(@NotNull String <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.prettyPrintIndent = var1;
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static void getPrettyPrintIndent$annotations() {
   }

   public final boolean getCoerceInputValues() {
      return this.coerceInputValues;
   }

   public final void setCoerceInputValues(boolean <set-?>) {
      this.coerceInputValues = var1;
   }

   @NotNull
   public final String getClassDiscriminator() {
      return this.classDiscriminator;
   }

   public final void setClassDiscriminator(@NotNull String <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.classDiscriminator = var1;
   }

   @NotNull
   public final ClassDiscriminatorMode getClassDiscriminatorMode() {
      return this.classDiscriminatorMode;
   }

   public final void setClassDiscriminatorMode(@NotNull ClassDiscriminatorMode <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.classDiscriminatorMode = var1;
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static void getClassDiscriminatorMode$annotations() {
   }

   public final boolean getUseAlternativeNames() {
      return this.useAlternativeNames;
   }

   public final void setUseAlternativeNames(boolean <set-?>) {
      this.useAlternativeNames = var1;
   }

   @Nullable
   public final JsonNamingStrategy getNamingStrategy() {
      return this.namingStrategy;
   }

   public final void setNamingStrategy(@Nullable JsonNamingStrategy <set-?>) {
      this.namingStrategy = var1;
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static void getNamingStrategy$annotations() {
   }

   public final boolean getDecodeEnumsCaseInsensitive() {
      return this.decodeEnumsCaseInsensitive;
   }

   public final void setDecodeEnumsCaseInsensitive(boolean <set-?>) {
      this.decodeEnumsCaseInsensitive = var1;
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static void getDecodeEnumsCaseInsensitive$annotations() {
   }

   public final boolean getAllowTrailingComma() {
      return this.allowTrailingComma;
   }

   public final void setAllowTrailingComma(boolean <set-?>) {
      this.allowTrailingComma = var1;
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static void getAllowTrailingComma$annotations() {
   }

   public final boolean getAllowComments() {
      return this.allowComments;
   }

   public final void setAllowComments(boolean <set-?>) {
      this.allowComments = var1;
   }

   /** @deprecated */
   // $FF: synthetic method
   @ExperimentalSerializationApi
   public static void getAllowComments$annotations() {
   }

   public final boolean getAllowSpecialFloatingPointValues() {
      return this.allowSpecialFloatingPointValues;
   }

   public final void setAllowSpecialFloatingPointValues(boolean <set-?>) {
      this.allowSpecialFloatingPointValues = var1;
   }

   public final boolean getAllowStructuredMapKeys() {
      return this.allowStructuredMapKeys;
   }

   public final void setAllowStructuredMapKeys(boolean <set-?>) {
      this.allowStructuredMapKeys = var1;
   }

   public final boolean getUseArrayPolymorphism() {
      return this.useArrayPolymorphism;
   }

   public final void setUseArrayPolymorphism(boolean <set-?>) {
      this.useArrayPolymorphism = var1;
   }

   @NotNull
   public final SerializersModule getSerializersModule() {
      return this.serializersModule;
   }

   public final void setSerializersModule(@NotNull SerializersModule <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      this.serializersModule = var1;
   }

   @NotNull
   public final JsonConfiguration build$kotlinx_serialization_json() {
      boolean var2;
      String var8;
      if (this.useArrayPolymorphism) {
         if (!Intrinsics.areEqual((Object)this.classDiscriminator, (Object)"type")) {
            var2 = false;
            var8 = "Class discriminator should not be specified when array polymorphism is specified";
            throw new IllegalArgumentException(var8.toString());
         }

         if (this.classDiscriminatorMode != ClassDiscriminatorMode.POLYMORPHIC) {
            var2 = false;
            var8 = "useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.";
            throw new IllegalArgumentException(var8.toString());
         }
      }

      if (!this.prettyPrint) {
         if (!Intrinsics.areEqual((Object)this.prettyPrintIndent, (Object)"    ")) {
            var2 = false;
            var8 = "Indent should not be specified when default printing mode is used";
            throw new IllegalArgumentException(var8.toString());
         }
      } else if (!Intrinsics.areEqual((Object)this.prettyPrintIndent, (Object)"    ")) {
         CharSequence $this$all$iv = (CharSequence)this.prettyPrintIndent;
         int $i$f$all = false;
         int var4 = 0;

         boolean var10000;
         while(true) {
            if (var4 >= $this$all$iv.length()) {
               var10000 = true;
               break;
            }

            char element$iv = $this$all$iv.charAt(var4);
            int var7 = false;
            if (element$iv != ' ' && element$iv != '\t' && element$iv != '\r' && element$iv != '\n') {
               var10000 = false;
               break;
            }

            ++var4;
         }

         boolean allWhitespaces = var10000;
         if (!allWhitespaces) {
            var2 = false;
            var8 = "Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.prettyPrintIndent;
            throw new IllegalArgumentException(var8.toString());
         }
      }

      return new JsonConfiguration(this.encodeDefaults, this.ignoreUnknownKeys, this.isLenient, this.allowStructuredMapKeys, this.prettyPrint, this.explicitNulls, this.prettyPrintIndent, this.coerceInputValues, this.useArrayPolymorphism, this.classDiscriminator, this.allowSpecialFloatingPointValues, this.useAlternativeNames, this.namingStrategy, this.decodeEnumsCaseInsensitive, this.allowTrailingComma, this.allowComments, this.classDiscriminatorMode);
   }
}
