package kotlinx.serialization.json;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@ExperimentalSerializationApi
public interface JsonNamingStrategy {
   @NotNull
   JsonNamingStrategy.Builtins Builtins = JsonNamingStrategy.Builtins.$$INSTANCE;

   @NotNull
   String serialNameForJson(@NotNull SerialDescriptor var1, int var2, @NotNull String var3);

   @ExperimentalSerializationApi
   public static final class Builtins {
      // $FF: synthetic field
      static final JsonNamingStrategy.Builtins $$INSTANCE = new JsonNamingStrategy.Builtins();
      @NotNull
      private static final JsonNamingStrategy SnakeCase = (JsonNamingStrategy)(new JsonNamingStrategy() {
         public String serialNameForJson(SerialDescriptor descriptor, int elementIndex, String serialName) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(serialName, "serialName");
            return JsonNamingStrategy.Builtins.$$INSTANCE.convertCamelCase(serialName, '_');
         }

         public String toString() {
            return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
         }
      });
      @NotNull
      private static final JsonNamingStrategy KebabCase = (JsonNamingStrategy)(new JsonNamingStrategy() {
         public String serialNameForJson(SerialDescriptor descriptor, int elementIndex, String serialName) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(serialName, "serialName");
            return JsonNamingStrategy.Builtins.$$INSTANCE.convertCamelCase(serialName, '-');
         }

         public String toString() {
            return "kotlinx.serialization.json.JsonNamingStrategy.KebabCase";
         }
      });

      private Builtins() {
      }

      @NotNull
      public final JsonNamingStrategy getSnakeCase() {
         return SnakeCase;
      }

      /** @deprecated */
      // $FF: synthetic method
      @ExperimentalSerializationApi
      public static void getSnakeCase$annotations() {
      }

      @NotNull
      public final JsonNamingStrategy getKebabCase() {
         return KebabCase;
      }

      /** @deprecated */
      // $FF: synthetic method
      @ExperimentalSerializationApi
      public static void getKebabCase$annotations() {
      }

      private final String convertCamelCase(String serialName, char delimiter) {
         int var3 = serialName.length() * 2;
         StringBuilder var4 = new StringBuilder(var3);
         StringBuilder $this$convertCamelCase_u24lambda_u241 = var4;
         int var6 = false;
         Object bufferedChar = null;
         int previousUpperCharsCount = 0;
         CharSequence $this$forEach$iv = (CharSequence)serialName;
         int $i$f$forEach = false;

         for(int var11 = 0; var11 < $this$forEach$iv.length(); ++var11) {
            char element$iv = $this$forEach$iv.charAt(var11);
            int var14 = false;
            if (Character.isUpperCase(element$iv)) {
               if (previousUpperCharsCount == 0 && ((CharSequence)$this$convertCamelCase_u24lambda_u241).length() > 0 && StringsKt.last((CharSequence)$this$convertCamelCase_u24lambda_u241) != delimiter) {
                  $this$convertCamelCase_u24lambda_u241.append(delimiter);
               }

               if (bufferedChar != null) {
                  char p0 = bufferedChar;
                  int var16 = false;
                  $this$convertCamelCase_u24lambda_u241.append(p0);
               }

               ++previousUpperCharsCount;
               bufferedChar = Character.toLowerCase(element$iv);
            } else {
               if (bufferedChar != null) {
                  if (previousUpperCharsCount > 1 && Character.isLetter(element$iv)) {
                     $this$convertCamelCase_u24lambda_u241.append(delimiter);
                  }

                  $this$convertCamelCase_u24lambda_u241.append(bufferedChar);
                  previousUpperCharsCount = 0;
                  bufferedChar = null;
               }

               $this$convertCamelCase_u24lambda_u241.append(element$iv);
            }
         }

         if (bufferedChar != null) {
            $this$convertCamelCase_u24lambda_u241.append(bufferedChar);
         }

         return var4.toString();
      }
   }
}
