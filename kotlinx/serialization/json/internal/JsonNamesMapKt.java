package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonIgnoreUnknownKeys;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JsonNamesMapKt {
   @NotNull
   private static final DescriptorSchemaCache.Key<Map<String, Integer>> JsonDeserializationNamesKey = new DescriptorSchemaCache.Key();
   @NotNull
   private static final DescriptorSchemaCache.Key<String[]> JsonSerializationNamesKey = new DescriptorSchemaCache.Key();

   @NotNull
   public static final DescriptorSchemaCache.Key<Map<String, Integer>> getJsonDeserializationNamesKey() {
      return JsonDeserializationNamesKey;
   }

   @NotNull
   public static final DescriptorSchemaCache.Key<String[]> getJsonSerializationNamesKey() {
      return JsonSerializationNamesKey;
   }

   private static final Map<String, Integer> buildDeserializationNamesMap(SerialDescriptor $this$buildDeserializationNamesMap, Json json) {
      Map builder = (Map)(new LinkedHashMap());
      boolean useLowercaseEnums = decodeCaseInsensitive(json, $this$buildDeserializationNamesMap);
      JsonNamingStrategy strategyForClasses = namingStrategy($this$buildDeserializationNamesMap, json);
      int i = 0;

      for(int var6 = $this$buildDeserializationNamesMap.getElementsCount(); i < var6; ++i) {
         Iterable $this$filterIsInstance$iv = (Iterable)$this$buildDeserializationNamesMap.getElementAnnotations(i);
         int $i$f$filterIsInstance = false;
         Collection destination$iv$iv = (Collection)(new ArrayList());
         int $i$f$filterIsInstanceTo = false;
         Iterator var13 = $this$filterIsInstance$iv.iterator();

         while(var13.hasNext()) {
            Object element$iv$iv = var13.next();
            if (element$iv$iv instanceof JsonNames) {
               destination$iv$iv.add(element$iv$iv);
            }
         }

         JsonNames var10000 = (JsonNames)CollectionsKt.singleOrNull((List)destination$iv$iv);
         boolean $i$f$forEach;
         if (var10000 != null) {
            String[] var21 = var10000.names();
            if (var21 != null) {
               Object[] $this$forEach$iv = var21;
               $i$f$forEach = false;
               int var18 = 0;

               for(int var19 = $this$forEach$iv.length; var18 < var19; ++var18) {
                  Object element$iv = $this$forEach$iv[var18];
                  int var15 = false;
                  String var10002;
                  if (useLowercaseEnums) {
                     var10002 = element$iv.toLowerCase(Locale.ROOT);
                     Intrinsics.checkNotNullExpressionValue(var10002, "toLowerCase(...)");
                  } else {
                     var10002 = element$iv;
                  }

                  buildDeserializationNamesMap$putOrThrow(builder, $this$buildDeserializationNamesMap, var10002, i);
               }
            }
         }

         String var22;
         if (useLowercaseEnums) {
            var22 = $this$buildDeserializationNamesMap.getElementName(i).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(var22, "toLowerCase(...)");
         } else {
            var22 = strategyForClasses != null ? strategyForClasses.serialNameForJson($this$buildDeserializationNamesMap, i, $this$buildDeserializationNamesMap.getElementName(i)) : null;
         }

         String nameToPut = var22;
         if (nameToPut != null) {
            $i$f$forEach = false;
            buildDeserializationNamesMap$putOrThrow(builder, $this$buildDeserializationNamesMap, nameToPut, i);
         }
      }

      Map var23;
      if (builder.isEmpty()) {
         int var16 = false;
         var23 = MapsKt.emptyMap();
      } else {
         var23 = builder;
      }

      return var23;
   }

   @NotNull
   public static final Map<String, Integer> deserializationNamesMap(@NotNull Json $this$deserializationNamesMap, @NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter($this$deserializationNamesMap, "<this>");
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return (Map)JsonSchemaCacheKt.getSchemaCache($this$deserializationNamesMap).getOrPut(descriptor, JsonDeserializationNamesKey, JsonNamesMapKt::deserializationNamesMap$lambda$3);
   }

   @NotNull
   public static final String[] serializationNamesIndices(@NotNull SerialDescriptor $this$serializationNamesIndices, @NotNull Json json, @NotNull JsonNamingStrategy strategy) {
      Intrinsics.checkNotNullParameter($this$serializationNamesIndices, "<this>");
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(strategy, "strategy");
      return (String[])JsonSchemaCacheKt.getSchemaCache(json).getOrPut($this$serializationNamesIndices, JsonSerializationNamesKey, JsonNamesMapKt::serializationNamesIndices$lambda$4);
   }

   @NotNull
   public static final String getJsonElementName(@NotNull SerialDescriptor $this$getJsonElementName, @NotNull Json json, int index) {
      Intrinsics.checkNotNullParameter($this$getJsonElementName, "<this>");
      Intrinsics.checkNotNullParameter(json, "json");
      JsonNamingStrategy strategy = namingStrategy($this$getJsonElementName, json);
      return strategy == null ? $this$getJsonElementName.getElementName(index) : serializationNamesIndices($this$getJsonElementName, json, strategy)[index];
   }

   @Nullable
   public static final JsonNamingStrategy namingStrategy(@NotNull SerialDescriptor $this$namingStrategy, @NotNull Json json) {
      Intrinsics.checkNotNullParameter($this$namingStrategy, "<this>");
      Intrinsics.checkNotNullParameter(json, "json");
      return Intrinsics.areEqual((Object)$this$namingStrategy.getKind(), (Object)StructureKind.CLASS.INSTANCE) ? json.getConfiguration().getNamingStrategy() : null;
   }

   private static final int getJsonNameIndexSlowPath(SerialDescriptor $this$getJsonNameIndexSlowPath, Json json, String name) {
      Integer var10000 = (Integer)deserializationNamesMap(json, $this$getJsonNameIndexSlowPath).get(name);
      return var10000 != null ? var10000 : -3;
   }

   private static final boolean decodeCaseInsensitive(Json $this$decodeCaseInsensitive, SerialDescriptor descriptor) {
      return $this$decodeCaseInsensitive.getConfiguration().getDecodeEnumsCaseInsensitive() && Intrinsics.areEqual((Object)descriptor.getKind(), (Object)SerialKind.ENUM.INSTANCE);
   }

   public static final int getJsonNameIndex(@NotNull SerialDescriptor $this$getJsonNameIndex, @NotNull Json json, @NotNull String name) {
      Intrinsics.checkNotNullParameter($this$getJsonNameIndex, "<this>");
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(name, "name");
      if (decodeCaseInsensitive(json, $this$getJsonNameIndex)) {
         String var10002 = name.toLowerCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var10002, "toLowerCase(...)");
         return getJsonNameIndexSlowPath($this$getJsonNameIndex, json, var10002);
      } else {
         JsonNamingStrategy strategy = namingStrategy($this$getJsonNameIndex, json);
         if (strategy != null) {
            return getJsonNameIndexSlowPath($this$getJsonNameIndex, json, name);
         } else {
            int index = $this$getJsonNameIndex.getElementIndex(name);
            if (index != -3) {
               return index;
            } else {
               return !json.getConfiguration().getUseAlternativeNames() ? index : getJsonNameIndexSlowPath($this$getJsonNameIndex, json, name);
            }
         }
      }
   }

   public static final int getJsonNameIndexOrThrow(@NotNull SerialDescriptor $this$getJsonNameIndexOrThrow, @NotNull Json json, @NotNull String name, @NotNull String suffix) {
      Intrinsics.checkNotNullParameter($this$getJsonNameIndexOrThrow, "<this>");
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(name, "name");
      Intrinsics.checkNotNullParameter(suffix, "suffix");
      int index = getJsonNameIndex($this$getJsonNameIndexOrThrow, json, name);
      if (index == -3) {
         throw new SerializationException($this$getJsonNameIndexOrThrow.getSerialName() + " does not contain element with name '" + name + '\'' + suffix);
      } else {
         return index;
      }
   }

   // $FF: synthetic method
   public static int getJsonNameIndexOrThrow$default(SerialDescriptor var0, Json var1, String var2, String var3, int var4, Object var5) {
      if ((var4 & 4) != 0) {
         var3 = "";
      }

      return getJsonNameIndexOrThrow(var0, var1, var2, var3);
   }

   public static final boolean tryCoerceValue(@NotNull Json $this$tryCoerceValue, @NotNull SerialDescriptor descriptor, int index, @NotNull Function1<? super Boolean, Boolean> peekNull, @NotNull Function0<String> peekString, @NotNull Function0<Unit> onEnumCoercing) {
      Intrinsics.checkNotNullParameter($this$tryCoerceValue, "<this>");
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(peekNull, "peekNull");
      Intrinsics.checkNotNullParameter(peekString, "peekString");
      Intrinsics.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
      int $i$f$tryCoerceValue = false;
      boolean isOptional = descriptor.isElementOptional(index);
      SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(index);
      if (isOptional && !elementDescriptor.isNullable() && (Boolean)peekNull.invoke(true)) {
         return true;
      } else {
         if (Intrinsics.areEqual((Object)elementDescriptor.getKind(), (Object)SerialKind.ENUM.INSTANCE)) {
            if (elementDescriptor.isNullable() && (Boolean)peekNull.invoke(false)) {
               return false;
            }

            String var10000 = (String)peekString.invoke();
            if (var10000 == null) {
               return false;
            }

            String enumValue = var10000;
            int enumIndex = getJsonNameIndex(elementDescriptor, $this$tryCoerceValue, enumValue);
            boolean coerceToNull = !$this$tryCoerceValue.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
            if (enumIndex == -3 && (isOptional || coerceToNull)) {
               onEnumCoercing.invoke();
               return true;
            }
         }

         return false;
      }
   }

   // $FF: synthetic method
   public static boolean tryCoerceValue$default(Json $this$tryCoerceValue_u24default, SerialDescriptor descriptor, int index, Function1 peekNull, Function0 peekString, Function0 onEnumCoercing, int $i$f$tryCoerceValue, Object isOptional) {
      if ((var6 & 16) != 0) {
         onEnumCoercing = (Function0)null.INSTANCE;
      }

      Intrinsics.checkNotNullParameter($this$tryCoerceValue_u24default, "<this>");
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(peekNull, "peekNull");
      Intrinsics.checkNotNullParameter(peekString, "peekString");
      Intrinsics.checkNotNullParameter(onEnumCoercing, "onEnumCoercing");
      int $i$f$tryCoerceValue = false;
      boolean isOptional = descriptor.isElementOptional(index);
      SerialDescriptor elementDescriptor = descriptor.getElementDescriptor(index);
      if (isOptional && !elementDescriptor.isNullable() && (Boolean)peekNull.invoke(true)) {
         return true;
      } else {
         if (Intrinsics.areEqual((Object)elementDescriptor.getKind(), (Object)SerialKind.ENUM.INSTANCE)) {
            if (elementDescriptor.isNullable() && (Boolean)peekNull.invoke(false)) {
               return false;
            }

            String var10000 = (String)peekString.invoke();
            if (var10000 == null) {
               return false;
            }

            String enumValue = var10000;
            int enumIndex = getJsonNameIndex(elementDescriptor, $this$tryCoerceValue_u24default, enumValue);
            boolean coerceToNull = !$this$tryCoerceValue_u24default.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
            if (enumIndex == -3 && (isOptional || coerceToNull)) {
               onEnumCoercing.invoke();
               return true;
            }
         }

         return false;
      }
   }

   public static final boolean ignoreUnknownKeys(@NotNull SerialDescriptor $this$ignoreUnknownKeys, @NotNull Json json) {
      Intrinsics.checkNotNullParameter($this$ignoreUnknownKeys, "<this>");
      Intrinsics.checkNotNullParameter(json, "json");
      boolean var10000;
      if (!json.getConfiguration().getIgnoreUnknownKeys()) {
         Iterable $this$any$iv = (Iterable)$this$ignoreUnknownKeys.getAnnotations();
         int $i$f$any = false;
         if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            var10000 = false;
         } else {
            Iterator var4 = $this$any$iv.iterator();

            while(true) {
               if (!var4.hasNext()) {
                  var10000 = false;
                  break;
               }

               Object element$iv = var4.next();
               Annotation it = (Annotation)element$iv;
               int var7 = false;
               if (it instanceof JsonIgnoreUnknownKeys) {
                  var10000 = true;
                  break;
               }
            }
         }

         if (!var10000) {
            var10000 = false;
            return var10000;
         }
      }

      var10000 = true;
      return var10000;
   }

   private static final void buildDeserializationNamesMap$putOrThrow(Map<String, Integer> $this$buildDeserializationNamesMap_u24putOrThrow, SerialDescriptor $this_buildDeserializationNamesMap, String name, int index) {
      String entity = Intrinsics.areEqual((Object)$this_buildDeserializationNamesMap.getKind(), (Object)SerialKind.ENUM.INSTANCE) ? "enum value" : "property";
      if ($this$buildDeserializationNamesMap_u24putOrThrow.containsKey(name)) {
         throw new JsonException("The suggested name '" + name + "' for " + entity + ' ' + $this_buildDeserializationNamesMap.getElementName(index) + " is already one of the names for " + entity + ' ' + $this_buildDeserializationNamesMap.getElementName(((Number)MapsKt.getValue($this$buildDeserializationNamesMap_u24putOrThrow, name)).intValue()) + " in " + $this_buildDeserializationNamesMap);
      } else {
         $this$buildDeserializationNamesMap_u24putOrThrow.put(name, index);
      }
   }

   private static final Map deserializationNamesMap$lambda$3(SerialDescriptor $descriptor, Json $this_deserializationNamesMap) {
      return buildDeserializationNamesMap($descriptor, $this_deserializationNamesMap);
   }

   private static final String[] serializationNamesIndices$lambda$4(SerialDescriptor $this_serializationNamesIndices, JsonNamingStrategy $strategy) {
      int var2 = 0;
      int var3 = $this_serializationNamesIndices.getElementsCount();

      String[] var4;
      for(var4 = new String[var3]; var2 < var3; ++var2) {
         String baseName = $this_serializationNamesIndices.getElementName(var2);
         var4[var2] = $strategy.serialNameForJson($this_serializationNamesIndices, var2, baseName);
      }

      return var4;
   }
}
