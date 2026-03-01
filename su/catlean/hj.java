package su.catlean;

import com.mojang.brigadier.Message;
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
import net.minecraft.class_2561;
import org.jetbrains.annotations.NotNull;

public final class hj implements ArgumentType {
   @NotNull
   public static final b4 I;
   @NotNull
   private static final Collection X;
   private static final long a = j0.a(6080453924961719505L, 3570344266610385674L, MethodHandles.lookup().lookupClass()).a(209634789260994L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   @NotNull
   public k9 w(long a, @NotNull StringReader reader) throws CommandSyntaxException {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public CompletableFuture listSuggestions(@NotNull CommandContext context, @NotNull SuggestionsBuilder builder) {
      long var3 = a ^ 63009471429730L;
      Intrinsics.checkNotNullParameter(var1, true.c<invokedynamic>(3712, 5201607081967181444L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.c<invokedynamic>(8099, 7130422442891595682L ^ var3));
      CompletableFuture var10000 = class_2172.method_9264(sj.w.r().stream().map(hj::z), var2);
      Intrinsics.checkNotNullExpressionValue(var10000, true.c<invokedynamic>(28953, 1282510257235730716L ^ var3));
      return var10000;
   }

   @NotNull
   public Collection getExamples() {
      return X;
   }

   private static final Message s(Object var0) {
      long var1 = a ^ 67294218575066L;
      long var3 = var1 ^ 129300431536947L;
      nf var10000 = nf.s;
      String var10001 = 8562.c<invokedynamic>(8562, 4612775862936228301L ^ var1);
      Object[] var5 = new Object[1];
      Intrinsics.checkNotNull(var0);
      var5[0] = var0;
      return (Message)class_2561.method_43470(var10000.G(var10001, var3, var5));
   }

   private static final String f(k9 var0) {
      return var0.D();
   }

   private static final String z(Function1 var0, Object var1) {
      return (String)var0.invoke(var1);
   }

   private static final String l(k9 var0) {
      return var0.D();
   }

   private static final String W(Function1 var0, Object var1) {
      return (String)var0.invoke(var1);
   }

   public Object parse(StringReader p0) {
      long var2 = a ^ 94294157584348L;
      long var4 = var2 ^ 118338999348827L;
      return this.w(var4, var1);
   }

   static {
      long var16 = a ^ 105417964310844L;
      d = new HashMap(13);
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var16 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[7];
      int var12 = 0;
      String var11 = "\u0089-\u0093IÉPð\b$Ð³lûÌ\u0006f\u0018\u0019¶\u0082\u0093Bï\u00001\u0002\u0012¼ñ,>\u0018ºêÔ\u008c[\u0005\b\\>\u0010Þg\u008dÒla¼Z~\u001f~ªÄ\u0019®\u009a('²4\u0093ò\u0016tÿÒ>Óëµ\u0098A\u0080eæ&6B\\»Ëò³d\u0083/0æ\u0099¬°ß7WM)[ ¢+,.ÂÛ\u0094½¥µö*\u008e\u009c(\u0003<\u0095ÅfÚÄ\u0083XAÝ±²\u0098ö3t";
      int var13 = "\u0089-\u0093IÉPð\b$Ð³lûÌ\u0006f\u0018\u0019¶\u0082\u0093Bï\u00001\u0002\u0012¼ñ,>\u0018ºêÔ\u008c[\u0005\b\\>\u0010Þg\u008dÒla¼Z~\u001f~ªÄ\u0019®\u009a('²4\u0093ò\u0016tÿÒ>Óëµ\u0098A\u0080eæ&6B\\»Ëò³d\u0083/0æ\u0099¬°ß7WM)[ ¢+,.ÂÛ\u0094½¥µö*\u008e\u009c(\u0003<\u0095ÅfÚÄ\u0083XAÝ±²\u0098ö3t".length();
      char var10 = 16;
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var19 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var19.getBytes("ISO-8859-1"));
            String var24 = a(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var24;
               if ((var9 += var10) >= var13) {
                  b = var14;
                  c = new String[7];
                  Cipher var2;
                  var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var3 = 1; var3 < 8; ++var3) {
                     var10003[var3] = (byte)((int)(var16 << var3 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var4 = 2820869623055931538L;
                  byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                  long var26 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                  boolean var22 = true;
                  long var0 = var26;
                  I = new b4((DefaultConstructorMarker)null);
                  List var18 = sj.w.r().stream().map(hj::W).limit(var0).toList();
                  Intrinsics.checkNotNullExpressionValue(var18, true.c<invokedynamic>(6923, 3407577119046395479L ^ var16));
                  X = (Collection)var18;
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var24;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "ÃcêÛÚÆÈ³\fM\u0099\u0092M0Ky \u000b[5ºÒÓÂ¼q\u008b\n&a5Â+±I®Y[ü¥¨\u0089\b,Ö\u008fÀm7";
               var13 = "ÃcêÛÚÆÈ³\fM\u0099\u0092M0Ky \u000b[5ºÒÓÂ¼q\u008b\n&a5Â+±I®Y[ü¥¨\u0089\b,Ö\u008fÀm7".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var19 = var11.substring(var9, var9 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7774;
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
            throw new RuntimeException("su/catlean/hj", var10);
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
         throw new RuntimeException("su/catlean/hj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
