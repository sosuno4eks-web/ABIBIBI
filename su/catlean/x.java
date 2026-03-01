package su.catlean;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2172;
import net.minecraft.class_634;
import net.minecraft.class_640;
import org.jetbrains.annotations.NotNull;

public final class x implements ArgumentType {
   @NotNull
   public static final xf X;
   private static final long a = j0.a(7943805172829858761L, 8518266309136423394L, MethodHandles.lookup().lookupClass()).a(2480141504016L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   @NotNull
   public String O(char a, long a, @NotNull StringReader reader) throws CommandSyntaxException {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public CompletableFuture listSuggestions(@NotNull CommandContext context, @NotNull SuggestionsBuilder builder) {
      long var3 = a ^ 102172728201134L;
      long var10001 = var3 ^ 59441134918407L;
      int var5 = (int)((var3 ^ 59441134918407L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 48);
      int var7 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var1, true.y<invokedynamic>(13691, 2125637865739622959L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.y<invokedynamic>(2547, 6120733060347602598L ^ var3));
      class_634 var10000 = s8.H((short)var5, (short)var6, var7).method_1562();
      Intrinsics.checkNotNull(var10000);
      CompletableFuture var8 = class_2172.method_9264(var10000.method_2880().stream().map(x::b), var2);
      Intrinsics.checkNotNullExpressionValue(var8, true.y<invokedynamic>(21028, 6059943472610475382L ^ var3));
      return var8;
   }

   @NotNull
   public List T(byte var1, long var2) {
      long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ a;
      long var10001 = var4 ^ 65427032063935L;
      int var6 = (int)((var4 ^ 65427032063935L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      class_634 var10000 = s8.H((short)var6, (short)var7, var8).method_1562();
      Intrinsics.checkNotNull(var10000);
      List var9 = var10000.method_2880().stream().map(x::M).limit(e).toList();
      Intrinsics.checkNotNullExpressionValue(var9, true.y<invokedynamic>(13333, 7692928040680194044L ^ var4));
      return var9;
   }

   private static final boolean U(String var0, class_640 var1) {
      return Intrinsics.areEqual((Object)var0, (Object)var1.method_2966().name());
   }

   private static final boolean p(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final String i(class_640 var0) {
      return var0.method_2966().name();
   }

   private static final String b(Function1 var0, Object var1) {
      return (String)var0.invoke(var1);
   }

   private static final String Y(class_640 var0) {
      return var0.method_2966().name();
   }

   private static final String M(Function1 var0, Object var1) {
      return (String)var0.invoke(var1);
   }

   public Object parse(StringReader p0) {
      long var2 = a ^ 125893414527180L;
      long var10001 = var2 ^ 69908024447721L;
      int var4 = (int)((var2 ^ 69908024447721L) >>> 48);
      long var5 = var10001 << 16 >>> 16;
      return this.O((char)var4, var5, var1);
   }

   public Collection getExamples() {
      long var1 = a ^ 61810440082156L;
      long var10001 = var1 ^ 89044439097226L;
      int var3 = (int)((var1 ^ 89044439097226L) >>> 56);
      long var4 = var10001 << 8 >>> 8;
      return (Collection)this.T((byte)var3, var4);
   }

   static {
      long var5 = a ^ 133729025869199L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[6];
      int var12 = 0;
      String var11 = "õên\u0015zúYY±.WÜµñ±D¾VèhCïÊ\u0082Ó\u0018ç\u0093Ø»G\u0082\u0018é[½Ð\u008e\u0089ûÕ-·\u000f-nÙ\u000bÑ2T\u0007x\u001dáp\u0089\u0010ØÞ\u0091ý¾\u0018½]\u0001âûÀ°áXD \u0084\u001fI\f\u0099Û$\u0007å»¼MÙ\u001e\u000e3÷ë\u0081D\u0099\u0019É>%°BÅ8%K%";
      int var13 = "õên\u0015zúYY±.WÜµñ±D¾VèhCïÊ\u0082Ó\u0018ç\u0093Ø»G\u0082\u0018é[½Ð\u008e\u0089ûÕ-·\u000f-nÙ\u000bÑ2T\u0007x\u001dáp\u0089\u0010ØÞ\u0091ý¾\u0018½]\u0001âûÀ°áXD \u0084\u001fI\f\u0099Û$\u0007å»¼MÙ\u001e\u000e3÷ë\u0081D\u0099\u0019É>%°BÅ8%K%".length();
      char var10 = ' ';
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var16 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = a(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var21;
               if ((var9 += var10) >= var13) {
                  b = var14;
                  c = new String[6];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 1455293803928642860L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  e = var23;
                  X = new xf((DefaultConstructorMarker)null);
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var21;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "Xãâ(õÓ\u0012®\n§7 ~\u0005+q\u0010ß<\u008c>\u008ckÎêD?uÀ@®m\u0091";
               var13 = "Xãâ(õÓ\u0012®\n§7 ~\u0005+q\u0010ß<\u008c>\u008ckÎêD?uÀ@®m\u0091".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
            var10001 = 0;
         }
      }
   }

   private static CommandSyntaxException a(CommandSyntaxException var0) {
      return var0;
   }

   private static String a(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for(int var4 = 0; var4 < var2; ++var4) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else {
            char var6;
            byte var7;
            if (var5 < 224) {
               var6 = (char)((char)(var5 & 31) << 6);
               ++var4;
               var7 = var0[var4];
               var6 |= (char)(var7 & 63);
               var3[var1++] = var6;
            } else if (var4 < var2 - 2) {
               var6 = (char)((char)(var5 & 15) << 12);
               ++var4;
               var7 = var0[var4];
               var6 = (char)(var6 | (char)(var7 & 63) << 6);
               ++var4;
               var7 = var0[var4];
               var6 |= (char)(var7 & 63);
               var3[var1++] = var6;
            }
         }
      }

      return new String(var3, 0, var1);
   }

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1679;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/x", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/x" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
