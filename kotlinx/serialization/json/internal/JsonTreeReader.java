package kotlinx.serialization.json.internal;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.DeepRecursiveFunction;
import kotlin.DeepRecursiveKt;
import kotlin.DeepRecursiveScope;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JsonTreeReader {
   @NotNull
   private final AbstractJsonLexer lexer;
   private final boolean isLenient;
   private final boolean trailingCommaAllowed;
   private int stackDepth;

   public JsonTreeReader(@NotNull JsonConfiguration configuration, @NotNull AbstractJsonLexer lexer) {
      Intrinsics.checkNotNullParameter(configuration, "configuration");
      Intrinsics.checkNotNullParameter(lexer, "lexer");
      super();
      this.lexer = lexer;
      this.isLenient = configuration.isLenient();
      this.trailingCommaAllowed = configuration.getAllowTrailingComma();
   }

   private final JsonElement readObject() {
      JsonTreeReader this_$iv = this;
      int $i$f$readObjectImpl = false;
      byte lastToken$iv = this.lexer.consumeNextToken((byte)6);
      if (this.lexer.peekNextToken() == 4) {
         AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      } else {
         LinkedHashMap result$iv = new LinkedHashMap();

         while(this_$iv.lexer.canConsumeValue()) {
            String key$iv = this_$iv.isLenient ? this_$iv.lexer.consumeStringLenient() : this_$iv.lexer.consumeString();
            this_$iv.lexer.consumeNextToken((byte)5);
            int var6 = false;
            JsonElement element$iv = this.read();
            ((Map)result$iv).put(key$iv, element$iv);
            lastToken$iv = this_$iv.lexer.consumeNextToken();
            if (lastToken$iv != 4) {
               if (lastToken$iv != 7) {
                  AbstractJsonLexer.fail$default(this_$iv.lexer, "Expected end of the object or comma", 0, (String)null, 6, (Object)null);
                  throw new KotlinNothingValueException();
               }
               break;
            }
         }

         if (lastToken$iv == 6) {
            this_$iv.lexer.consumeNextToken((byte)7);
         } else if (lastToken$iv == 4) {
            if (!this_$iv.trailingCommaAllowed) {
               JsonExceptionsKt.invalidTrailingComma$default(this_$iv.lexer, (String)null, 1, (Object)null);
               throw new KotlinNothingValueException();
            }

            this_$iv.lexer.consumeNextToken((byte)7);
         }

         return (JsonElement)(new JsonObject((Map)result$iv));
      }
   }

   private final Object readObject(DeepRecursiveScope<Unit, JsonElement> $this$readObject, Continuation<? super JsonElement> $completion) {
      Object $continuation;
      label67: {
         if ($completion instanceof <undefinedtype>) {
            $continuation = (<undefinedtype>)$completion;
            if ((((<undefinedtype>)$continuation).label & Integer.MIN_VALUE) != 0) {
               ((<undefinedtype>)$continuation).label -= Integer.MIN_VALUE;
               break label67;
            }
         }

         $continuation = new ContinuationImpl($completion) {
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            int I$0;
            int I$1;
            byte B$0;
            // $FF: synthetic field
            Object result;
            int label;

            @Nullable
            public final Object invokeSuspend(@NotNull Object $result) {
               this.result = $result;
               this.label |= Integer.MIN_VALUE;
               return JsonTreeReader.this.readObject((DeepRecursiveScope)null, (Continuation)this);
            }
         };
      }

      JsonTreeReader this_$iv;
      byte lastToken$iv;
      LinkedHashMap result$iv;
      label74: {
         Object $result = ((<undefinedtype>)$continuation).result;
         Object var12 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
         int $i$f$readObjectImpl;
         String key$iv;
         JsonElement element$iv;
         switch(((<undefinedtype>)$continuation).label) {
         case 0:
            ResultKt.throwOnFailure($result);
            this_$iv = this;
            $i$f$readObjectImpl = 0;
            lastToken$iv = this.lexer.consumeNextToken((byte)6);
            if (this.lexer.peekNextToken() == 4) {
               AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, (String)null, 6, (Object)null);
               throw new KotlinNothingValueException();
            }

            result$iv = new LinkedHashMap();
            break;
         case 1:
            int var8 = ((<undefinedtype>)$continuation).I$1;
            lastToken$iv = ((<undefinedtype>)$continuation).B$0;
            $i$f$readObjectImpl = ((<undefinedtype>)$continuation).I$0;
            key$iv = (String)((<undefinedtype>)$continuation).L$3;
            result$iv = (LinkedHashMap)((<undefinedtype>)$continuation).L$2;
            this_$iv = (JsonTreeReader)((<undefinedtype>)$continuation).L$1;
            $this$readObject = (DeepRecursiveScope)((<undefinedtype>)$continuation).L$0;
            ResultKt.throwOnFailure($result);
            element$iv = (JsonElement)$result;
            ((Map)result$iv).put(key$iv, element$iv);
            lastToken$iv = this_$iv.lexer.consumeNextToken();
            if (lastToken$iv != 4) {
               if (lastToken$iv != 7) {
                  AbstractJsonLexer.fail$default(this_$iv.lexer, "Expected end of the object or comma", 0, (String)null, 6, (Object)null);
                  throw new KotlinNothingValueException();
               }
               break label74;
            }
            break;
         default:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         }

         do {
            if (!this_$iv.lexer.canConsumeValue()) {
               break label74;
            }

            key$iv = this_$iv.isLenient ? this_$iv.lexer.consumeStringLenient() : this_$iv.lexer.consumeString();
            this_$iv.lexer.consumeNextToken((byte)5);
            int var14 = 0;
            Unit var10001 = Unit.INSTANCE;
            ((<undefinedtype>)$continuation).L$0 = $this$readObject;
            ((<undefinedtype>)$continuation).L$1 = this_$iv;
            ((<undefinedtype>)$continuation).L$2 = result$iv;
            ((<undefinedtype>)$continuation).L$3 = key$iv;
            ((<undefinedtype>)$continuation).I$0 = $i$f$readObjectImpl;
            ((<undefinedtype>)$continuation).B$0 = lastToken$iv;
            ((<undefinedtype>)$continuation).I$1 = var14;
            ((<undefinedtype>)$continuation).label = 1;
            Object var10000 = $this$readObject.callRecursive(var10001, (Continuation)$continuation);
            if (var10000 == var12) {
               return var12;
            }

            element$iv = (JsonElement)var10000;
            ((Map)result$iv).put(key$iv, element$iv);
            lastToken$iv = this_$iv.lexer.consumeNextToken();
         } while(lastToken$iv == 4);

         if (lastToken$iv != 7) {
            AbstractJsonLexer.fail$default(this_$iv.lexer, "Expected end of the object or comma", 0, (String)null, 6, (Object)null);
            throw new KotlinNothingValueException();
         }
      }

      if (lastToken$iv == 6) {
         this_$iv.lexer.consumeNextToken((byte)7);
      } else if (lastToken$iv == 4) {
         if (!this_$iv.trailingCommaAllowed) {
            JsonExceptionsKt.invalidTrailingComma$default(this_$iv.lexer, (String)null, 1, (Object)null);
            throw new KotlinNothingValueException();
         }

         this_$iv.lexer.consumeNextToken((byte)7);
      }

      return new JsonObject((Map)result$iv);
   }

   private final JsonObject readObjectImpl(Function0<? extends JsonElement> reader) {
      int $i$f$readObjectImpl = false;
      byte lastToken = this.lexer.consumeNextToken((byte)6);
      if (this.lexer.peekNextToken() == 4) {
         AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      } else {
         LinkedHashMap result = new LinkedHashMap();

         while(this.lexer.canConsumeValue()) {
            String key = this.isLenient ? this.lexer.consumeStringLenient() : this.lexer.consumeString();
            this.lexer.consumeNextToken((byte)5);
            JsonElement element = (JsonElement)reader.invoke();
            ((Map)result).put(key, element);
            lastToken = this.lexer.consumeNextToken();
            if (lastToken != 4) {
               if (lastToken != 7) {
                  AbstractJsonLexer.fail$default(this.lexer, "Expected end of the object or comma", 0, (String)null, 6, (Object)null);
                  throw new KotlinNothingValueException();
               }
               break;
            }
         }

         if (lastToken == 6) {
            this.lexer.consumeNextToken((byte)7);
         } else if (lastToken == 4) {
            if (!this.trailingCommaAllowed) {
               JsonExceptionsKt.invalidTrailingComma$default(this.lexer, (String)null, 1, (Object)null);
               throw new KotlinNothingValueException();
            }

            this.lexer.consumeNextToken((byte)7);
         }

         return new JsonObject((Map)result);
      }
   }

   private final JsonElement readArray() {
      byte lastToken = this.lexer.consumeNextToken();
      if (this.lexer.peekNextToken() == 4) {
         AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, (String)null, 6, (Object)null);
         throw new KotlinNothingValueException();
      } else {
         ArrayList result = new ArrayList();

         while(this.lexer.canConsumeValue()) {
            JsonElement element = this.read();
            result.add(element);
            lastToken = this.lexer.consumeNextToken();
            if (lastToken != 4) {
               AbstractJsonLexer $this$iv = this.lexer;
               boolean condition$iv = lastToken == 9;
               int position$iv = $this$iv.currentPosition;
               int $i$f$require$kotlinx_serialization_json = false;
               if (!condition$iv) {
                  int var8 = false;
                  AbstractJsonLexer.fail$default($this$iv, "Expected end of the array or comma", position$iv, (String)null, 4, (Object)null);
                  throw new KotlinNothingValueException();
               }
            }
         }

         if (lastToken == 8) {
            this.lexer.consumeNextToken((byte)9);
         } else if (lastToken == 4) {
            if (!this.trailingCommaAllowed) {
               JsonExceptionsKt.invalidTrailingComma(this.lexer, "array");
               throw new KotlinNothingValueException();
            }

            this.lexer.consumeNextToken((byte)9);
         }

         return (JsonElement)(new JsonArray((List)result));
      }
   }

   private final JsonPrimitive readValue(boolean isString) {
      String string = !this.isLenient && isString ? this.lexer.consumeString() : this.lexer.consumeStringLenient();
      return !isString && Intrinsics.areEqual((Object)string, (Object)"null") ? (JsonPrimitive)JsonNull.INSTANCE : (JsonPrimitive)(new JsonLiteral(string, isString, (SerialDescriptor)null, 4, (DefaultConstructorMarker)null));
   }

   @NotNull
   public final JsonElement read() {
      byte token = this.lexer.peekNextToken();
      JsonElement var10000;
      if (token == 1) {
         var10000 = (JsonElement)this.readValue(true);
      } else if (token == 0) {
         var10000 = (JsonElement)this.readValue(false);
      } else if (token == 6) {
         ++this.stackDepth;
         JsonElement result = this.stackDepth == 200 ? this.readDeepRecursive() : this.readObject();
         this.stackDepth += -1;
         int var3 = this.stackDepth;
         var10000 = result;
      } else {
         if (token != 8) {
            AbstractJsonLexer.fail$default(this.lexer, "Cannot read Json element because of unexpected " + AbstractJsonLexerKt.tokenDescription(token), 0, (String)null, 6, (Object)null);
            throw new KotlinNothingValueException();
         }

         var10000 = this.readArray();
      }

      return var10000;
   }

   private final JsonElement readDeepRecursive() {
      return (JsonElement)DeepRecursiveKt.invoke(new DeepRecursiveFunction((Function3)(new Function3<DeepRecursiveScope<Unit, JsonElement>, Unit, Continuation<? super JsonElement>, Object>((Continuation)null) {
         int label;
         // $FF: synthetic field
         private Object L$0;

         public final Object invokeSuspend(Object $result) {
            DeepRecursiveScope $this$DeepRecursiveFunction = (DeepRecursiveScope)this.L$0;
            Object var4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            Object var10000;
            JsonElement var6;
            switch(this.label) {
            case 0:
               ResultKt.throwOnFailure($result);
               byte var3 = JsonTreeReader.this.lexer.peekNextToken();
               if (var3 == 1) {
                  var6 = (JsonElement)JsonTreeReader.this.readValue(true);
                  return var6;
               }

               if (var3 == 0) {
                  var6 = (JsonElement)JsonTreeReader.this.readValue(false);
                  return var6;
               }

               if (var3 != 6) {
                  if (var3 != 8) {
                     AbstractJsonLexer.fail$default(JsonTreeReader.this.lexer, "Can't begin reading element, unexpected token", 0, (String)null, 6, (Object)null);
                     throw new KotlinNothingValueException();
                  }

                  var6 = JsonTreeReader.this.readArray();
                  return var6;
               }

               JsonTreeReader var5 = JsonTreeReader.this;
               Continuation var10002 = (Continuation)this;
               this.L$0 = SpillingKt.nullOutSpilledVariable($this$DeepRecursiveFunction);
               this.label = 1;
               var10000 = var5.readObject($this$DeepRecursiveFunction, var10002);
               if (var10000 == var4) {
                  return var4;
               }
               break;
            case 1:
               ResultKt.throwOnFailure($result);
               var10000 = $result;
               break;
            default:
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            var6 = (JsonElement)var10000;
            return var6;
         }

         public final Object invoke(DeepRecursiveScope<Unit, JsonElement> p1, Unit p2, Continuation<? super JsonElement> p3) {
            Function3 var4 = new <anonymous constructor>(p3);
            var4.L$0 = p1;
            return var4.invokeSuspend(Unit.INSTANCE);
         }
      })), Unit.INSTANCE);
   }
}
