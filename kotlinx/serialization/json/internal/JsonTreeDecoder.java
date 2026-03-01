package kotlinx.serialization.json.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class JsonTreeDecoder extends AbstractJsonTreeDecoder {
   @NotNull
   private final JsonObject value;
   @Nullable
   private final SerialDescriptor polyDescriptor;
   private int position;
   private boolean forceNull;

   public JsonTreeDecoder(@NotNull Json json, @NotNull JsonObject value, @Nullable String polymorphicDiscriminator, @Nullable SerialDescriptor polyDescriptor) {
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(value, "value");
      super(json, (JsonElement)value, polymorphicDiscriminator, (DefaultConstructorMarker)null);
      this.value = value;
      this.polyDescriptor = polyDescriptor;
   }

   // $FF: synthetic method
   public JsonTreeDecoder(Json var1, JsonObject var2, String var3, SerialDescriptor var4, int var5, DefaultConstructorMarker var6) {
      if ((var5 & 4) != 0) {
         var3 = null;
      }

      if ((var5 & 8) != 0) {
         var4 = null;
      }

      this(var1, var2, var3, var4);
   }

   @NotNull
   public JsonObject getValue() {
      return this.value;
   }

   public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");

      int index;
      boolean var16;
      do {
         String name;
         do {
            if (this.position >= descriptor.getElementsCount()) {
               return -1;
            }

            index = this.position++;
            name = this.getTag(descriptor, index);
            index = this.position - 1;
            this.forceNull = false;
         } while(!((Map)this.getValue()).containsKey(name) && !this.setForceNull(descriptor, index));

         if (!this.configuration.getCoerceInputValues()) {
            return index;
         }

         Json $this$tryCoerceValue$iv = this.getJson();
         int $i$f$tryCoerceValue = false;
         boolean isOptional$iv = descriptor.isElementOptional(index);
         SerialDescriptor elementDescriptor$iv = descriptor.getElementDescriptor(index);
         boolean it;
         boolean var11;
         if (isOptional$iv && !elementDescriptor$iv.isNullable()) {
            it = true;
            var11 = false;
            if (this.currentElementOrNull(name) instanceof JsonNull) {
               var16 = true;
               continue;
            }
         }

         if (Intrinsics.areEqual((Object)elementDescriptor$iv.getKind(), (Object)SerialKind.ENUM.INSTANCE)) {
            if (elementDescriptor$iv.isNullable()) {
               it = false;
               var11 = false;
               if (this.currentElementOrNull(name) instanceof JsonNull) {
                  var16 = false;
                  continue;
               }
            }

            it = false;
            JsonElement var15 = this.currentElementOrNull(name);
            String var10000 = (var15 instanceof JsonPrimitive ? (JsonPrimitive)var15 : null) != null ? JsonElementKt.getContentOrNull(var15 instanceof JsonPrimitive ? (JsonPrimitive)var15 : null) : null;
            if (var10000 == null) {
               var16 = false;
               continue;
            }

            String enumValue$iv = var10000;
            int enumIndex$iv = JsonNamesMapKt.getJsonNameIndex(elementDescriptor$iv, $this$tryCoerceValue$iv, enumValue$iv);
            boolean coerceToNull$iv = !$this$tryCoerceValue$iv.getConfiguration().getExplicitNulls() && elementDescriptor$iv.isNullable();
            if (enumIndex$iv == -3 && (isOptional$iv || coerceToNull$iv)) {
               it = false;
               if (this.setForceNull(descriptor, index)) {
                  return index;
               }

               var16 = true;
               continue;
            }
         }

         var16 = false;
      } while(var16);

      return index;
   }

   private final boolean setForceNull(SerialDescriptor descriptor, int index) {
      this.forceNull = !this.getJson().getConfiguration().getExplicitNulls() && !descriptor.isElementOptional(index) && descriptor.getElementDescriptor(index).isNullable();
      return this.forceNull;
   }

   public boolean decodeNotNullMark() {
      return !this.forceNull && super.decodeNotNullMark();
   }

   @NotNull
   protected String elementName(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      JsonNamingStrategy strategy = JsonNamesMapKt.namingStrategy(descriptor, this.getJson());
      String baseName = descriptor.getElementName(index);
      if (strategy == null) {
         if (!this.configuration.getUseAlternativeNames()) {
            return baseName;
         }

         if (this.getValue().keySet().contains(baseName)) {
            return baseName;
         }
      }

      Map deserializationNamesMap = JsonNamesMapKt.deserializationNamesMap(this.getJson(), descriptor);
      Iterable var7 = (Iterable)this.getValue().keySet();
      Iterator var8 = var7.iterator();

      Object var15;
      while(true) {
         if (!var8.hasNext()) {
            var15 = null;
            break;
         }

         Object var9;
         boolean var14;
         label45: {
            var9 = var8.next();
            String it = (String)var9;
            int var11 = false;
            Integer var10000 = (Integer)deserializationNamesMap.get(it);
            if (var10000 != null) {
               if (var10000 == index) {
                  var14 = true;
                  break label45;
               }
            }

            var14 = false;
         }

         if (var14) {
            var15 = var9;
            break;
         }
      }

      String fallbackName = (String)var15;
      if (fallbackName != null) {
         int var13 = false;
         return fallbackName;
      } else {
         fallbackName = strategy != null ? strategy.serialNameForJson(descriptor, index, baseName) : null;
         String var16 = fallbackName;
         if (fallbackName == null) {
            var16 = baseName;
         }

         return var16;
      }
   }

   @NotNull
   protected JsonElement currentElement(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      return (JsonElement)MapsKt.getValue((Map)this.getValue(), tag);
   }

   @Nullable
   public final JsonElement currentElementOrNull(@NotNull String tag) {
      Intrinsics.checkNotNullParameter(tag, "tag");
      return (JsonElement)this.getValue().get((Object)tag);
   }

   @NotNull
   public CompositeDecoder beginStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      if (descriptor == this.polyDescriptor) {
         JsonTreeDecoder var10000 = new JsonTreeDecoder;
         Json var10002 = this.getJson();
         AbstractJsonTreeDecoder this_$iv = (AbstractJsonTreeDecoder)this;
         JsonElement value$iv = this.currentObject();
         SerialDescriptor descriptor$iv = this.polyDescriptor;
         int $i$f$cast = false;
         String serialName$iv$iv = descriptor$iv.getSerialName();
         int $i$f$cast = false;
         if (!(value$iv instanceof JsonObject)) {
            StringBuilder var9 = (new StringBuilder()).append("Expected ").append(Reflection.getOrCreateKotlinClass(JsonObject.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value$iv.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName$iv$iv).append(" at element: ");
            byte var10 = -1;
            int var11 = false;
            String var12 = AbstractJsonTreeDecoder.access$renderTagStack(this_$iv);
            throw JsonExceptionsKt.JsonDecodingException(var10, var9.append(var12).toString(), (CharSequence)value$iv.toString());
         } else {
            var10000.<init>(var10002, (JsonObject)value$iv, this.getPolymorphicDiscriminator(), this.polyDescriptor);
            return (CompositeDecoder)var10000;
         }
      } else {
         return super.beginStructure(descriptor);
      }
   }

   public void endStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      if (!JsonNamesMapKt.ignoreUnknownKeys(descriptor, this.getJson()) && !(descriptor.getKind() instanceof PolymorphicKind)) {
         JsonNamingStrategy strategy = JsonNamesMapKt.namingStrategy(descriptor, this.getJson());
         Set var10000;
         if (strategy == null && !this.configuration.getUseAlternativeNames()) {
            var10000 = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
         } else if (strategy != null) {
            var10000 = JsonNamesMapKt.deserializationNamesMap(this.getJson(), descriptor).keySet();
         } else {
            var10000 = JsonInternalDependenciesKt.jsonCachedSerialNames(descriptor);
            Map var10001 = (Map)JsonSchemaCacheKt.getSchemaCache(this.getJson()).get(descriptor, JsonNamesMapKt.getJsonDeserializationNamesKey());
            Set var6 = var10001 != null ? var10001.keySet() : null;
            if (var6 == null) {
               var6 = SetsKt.emptySet();
            }

            var10000 = SetsKt.plus(var10000, (Iterable)var6);
         }

         Set names = var10000;
         Iterator var4 = this.getValue().keySet().iterator();

         String key;
         do {
            if (!var4.hasNext()) {
               return;
            }

            key = (String)var4.next();
         } while(names.contains(key) || Intrinsics.areEqual((Object)key, (Object)this.getPolymorphicDiscriminator()));

         throw JsonExceptionsKt.JsonDecodingException(-1, "Encountered an unknown key '" + key + "' at element: " + this.renderTagStack() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + JsonExceptionsKt.minify$default((CharSequence)this.getValue().toString(), 0, 1, (Object)null));
      }
   }
}
