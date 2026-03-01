package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class StreamingJsonEncoder extends AbstractEncoder implements JsonEncoder {
   @NotNull
   private final Composer composer;
   @NotNull
   private final Json json;
   @NotNull
   private final WriteMode mode;
   @Nullable
   private final JsonEncoder[] modeReuseCache;
   @NotNull
   private final SerializersModule serializersModule;
   @NotNull
   private final JsonConfiguration configuration;
   private boolean forceQuoting;
   @Nullable
   private String polymorphicDiscriminator;
   @Nullable
   private String polymorphicSerialName;

   public StreamingJsonEncoder(@NotNull Composer composer, @NotNull Json json, @NotNull WriteMode mode, @Nullable JsonEncoder[] modeReuseCache) {
      Intrinsics.checkNotNullParameter(composer, "composer");
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(mode, "mode");
      super();
      this.composer = composer;
      this.json = json;
      this.mode = mode;
      this.modeReuseCache = modeReuseCache;
      this.serializersModule = this.getJson().getSerializersModule();
      this.configuration = this.getJson().getConfiguration();
      int i = this.mode.ordinal();
      if (this.modeReuseCache != null && (this.modeReuseCache[i] != null || this.modeReuseCache[i] != this)) {
         this.modeReuseCache[i] = this;
      }

   }

   @NotNull
   public Json getJson() {
      return this.json;
   }

   public StreamingJsonEncoder(@NotNull InternalJsonWriter output, @NotNull Json json, @NotNull WriteMode mode, @NotNull JsonEncoder[] modeReuseCache) {
      Intrinsics.checkNotNullParameter(output, "output");
      Intrinsics.checkNotNullParameter(json, "json");
      Intrinsics.checkNotNullParameter(mode, "mode");
      Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
      this(ComposersKt.Composer(output, json), json, mode, modeReuseCache);
   }

   @NotNull
   public SerializersModule getSerializersModule() {
      return this.serializersModule;
   }

   public void encodeJsonElement(@NotNull JsonElement element) {
      Intrinsics.checkNotNullParameter(element, "element");
      if (this.polymorphicDiscriminator != null && !(element instanceof JsonObject)) {
         PolymorphicKt.throwJsonElementPolymorphicException(this.polymorphicSerialName, element);
         throw new KotlinNothingValueException();
      } else {
         this.encodeSerializableValue((SerializationStrategy)JsonElementSerializer.INSTANCE, element);
      }
   }

   public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return this.configuration.getEncodeDefaults();
   }

   public <T> void encodeSerializableValue(@NotNull SerializationStrategy<? super T> serializer, T value) {
      // $FF: Couldn't be decompiled
   }

   private final void encodeTypeInfo(String discriminator, String serialName) {
      this.composer.nextItem();
      this.encodeString(discriminator);
      this.composer.print(':');
      this.composer.space();
      this.encodeString(serialName);
   }

   @NotNull
   public CompositeEncoder beginStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      WriteMode newMode = WriteModeKt.switchMode(this.getJson(), descriptor);
      if (newMode.begin != 0) {
         this.composer.print(newMode.begin);
         this.composer.indent();
      }

      String discriminator = this.polymorphicDiscriminator;
      if (discriminator != null) {
         String var10002 = this.polymorphicSerialName;
         if (var10002 == null) {
            var10002 = descriptor.getSerialName();
         }

         this.encodeTypeInfo(discriminator, var10002);
         this.polymorphicDiscriminator = null;
         this.polymorphicSerialName = null;
      }

      if (this.mode == newMode) {
         return (CompositeEncoder)this;
      } else {
         JsonEncoder[] var10000 = this.modeReuseCache;
         CompositeEncoder var5;
         if (var10000 != null) {
            JsonEncoder var4 = var10000[newMode.ordinal()];
            if (var4 != null) {
               var5 = (CompositeEncoder)var4;
               return var5;
            }
         }

         var5 = (CompositeEncoder)(new StreamingJsonEncoder(this.composer, this.getJson(), newMode, this.modeReuseCache));
         return var5;
      }
   }

   public void endStructure(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      if (this.mode.end != 0) {
         this.composer.unIndent();
         this.composer.nextItemIfNotFirst();
         this.composer.print(this.mode.end);
      }

   }

   public boolean encodeElement(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      switch(StreamingJsonEncoder.WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()]) {
      case 1:
         if (!this.composer.getWritingFirst()) {
            this.composer.print(',');
         }

         this.composer.nextItem();
         break;
      case 2:
         if (!this.composer.getWritingFirst()) {
            boolean var10001;
            if (index % 2 == 0) {
               this.composer.print(',');
               this.composer.nextItem();
               var10001 = true;
            } else {
               this.composer.print(':');
               this.composer.space();
               var10001 = false;
            }

            this.forceQuoting = var10001;
         } else {
            this.forceQuoting = true;
            this.composer.nextItem();
         }
         break;
      case 3:
         if (index == 0) {
            this.forceQuoting = true;
         }

         if (index == 1) {
            this.composer.print(',');
            this.composer.space();
            this.forceQuoting = false;
         }
         break;
      default:
         if (!this.composer.getWritingFirst()) {
            this.composer.print(',');
         }

         this.composer.nextItem();
         this.encodeString(JsonNamesMapKt.getJsonElementName(descriptor, this.getJson(), index));
         this.composer.print(':');
         this.composer.space();
      }

      return true;
   }

   public <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor descriptor, int index, @NotNull SerializationStrategy<? super T> serializer, @Nullable T value) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      Intrinsics.checkNotNullParameter(serializer, "serializer");
      if (value != null || this.configuration.getExplicitNulls()) {
         super.encodeNullableSerializableElement(descriptor, index, serializer, value);
      }

   }

   @NotNull
   public Encoder encodeInline(@NotNull SerialDescriptor descriptor) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      boolean $i$f$composerAs;
      boolean p1;
      InternalJsonWriter p0;
      boolean var6;
      Composer var10000;
      Encoder var16;
      Json var10001;
      if (StreamingJsonEncoderKt.isUnsignedNumber(descriptor)) {
         $i$f$composerAs = false;
         if (this.composer instanceof ComposerForUnsignedNumbers) {
            var10000 = this.composer;
         } else {
            p1 = this.forceQuoting;
            p0 = this.composer.writer;
            var6 = false;
            var10000 = (Composer)(new ComposerForUnsignedNumbers(p0, p1));
         }

         var10001 = this.getJson();
         Object var7 = null;
         WriteMode var8 = this.mode;
         Json var9 = var10001;
         Composer var10 = var10000;
         var16 = (Encoder)(new StreamingJsonEncoder(var10, var9, var8, (JsonEncoder[])var7));
      } else if (StreamingJsonEncoderKt.isUnquotedLiteral(descriptor)) {
         $i$f$composerAs = false;
         if (this.composer instanceof ComposerForUnquotedLiterals) {
            var10000 = this.composer;
         } else {
            p1 = this.forceQuoting;
            p0 = this.composer.writer;
            var6 = false;
            var10000 = (Composer)(new ComposerForUnquotedLiterals(p0, p1));
         }

         var10001 = this.getJson();
         Object var11 = null;
         WriteMode var12 = this.mode;
         Json var13 = var10001;
         Composer var14 = var10000;
         var16 = (Encoder)(new StreamingJsonEncoder(var14, var13, var12, (JsonEncoder[])var11));
      } else if (this.polymorphicDiscriminator != null) {
         StreamingJsonEncoder $this$encodeInline_u24lambda_u242 = (StreamingJsonEncoder)this;
         p1 = false;
         $this$encodeInline_u24lambda_u242.polymorphicSerialName = descriptor.getSerialName();
         var16 = (Encoder)this;
      } else {
         var16 = super.encodeInline(descriptor);
      }

      return var16;
   }

   // $FF: synthetic method
   private final <T extends Composer> T composerAs(Function2<? super InternalJsonWriter, ? super Boolean, ? extends T> composerCreator) {
      int $i$f$composerAs = false;
      Composer var10000 = this.composer;
      Intrinsics.reifiedOperationMarker(3, "T");
      return var10000 instanceof Composer ? this.composer : (Composer)composerCreator.invoke(this.composer.writer, this.forceQuoting);
   }

   public void encodeNull() {
      this.composer.print("null");
   }

   public void encodeBoolean(boolean value) {
      if (this.forceQuoting) {
         this.encodeString(String.valueOf(value));
      } else {
         this.composer.print(value);
      }

   }

   public void encodeByte(byte value) {
      if (this.forceQuoting) {
         this.encodeString(String.valueOf(value));
      } else {
         this.composer.print(value);
      }

   }

   public void encodeShort(short value) {
      if (this.forceQuoting) {
         this.encodeString(String.valueOf(value));
      } else {
         this.composer.print(value);
      }

   }

   public void encodeInt(int value) {
      if (this.forceQuoting) {
         this.encodeString(String.valueOf(value));
      } else {
         this.composer.print(value);
      }

   }

   public void encodeLong(long value) {
      if (this.forceQuoting) {
         this.encodeString(String.valueOf(value));
      } else {
         this.composer.print(value);
      }

   }

   public void encodeFloat(float value) {
      if (this.forceQuoting) {
         this.encodeString(String.valueOf(value));
      } else {
         this.composer.print(value);
      }

      if (!this.configuration.getAllowSpecialFloatingPointValues() && !(Math.abs(value) <= Float.MAX_VALUE)) {
         throw JsonExceptionsKt.InvalidFloatingPointEncoded((Number)value, this.composer.writer.toString());
      }
   }

   public void encodeDouble(double value) {
      if (this.forceQuoting) {
         this.encodeString(String.valueOf(value));
      } else {
         this.composer.print(value);
      }

      if (!this.configuration.getAllowSpecialFloatingPointValues() && !(Math.abs(value) <= Double.MAX_VALUE)) {
         throw JsonExceptionsKt.InvalidFloatingPointEncoded((Number)value, this.composer.writer.toString());
      }
   }

   public void encodeChar(char value) {
      this.encodeString(String.valueOf(value));
   }

   public void encodeString(@NotNull String value) {
      Intrinsics.checkNotNullParameter(value, "value");
      this.composer.printQuoted(value);
   }

   public void encodeEnum(@NotNull SerialDescriptor enumDescriptor, int index) {
      Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
      this.encodeString(enumDescriptor.getElementName(index));
   }

   // $FF: synthetic class
   public static final class WhenMappings {
      // $FF: synthetic field
      public static final int[] $EnumSwitchMapping$0;

      static {
         int[] var0 = new int[WriteMode.values().length];

         try {
            var0[WriteMode.LIST.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
         }

         try {
            var0[WriteMode.MAP.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
         }

         try {
            var0[WriteMode.POLY_OBJ.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
         }

         $EnumSwitchMapping$0 = var0;
      }
   }
}
