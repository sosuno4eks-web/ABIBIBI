package su.catlean;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2172;
import net.minecraft.class_2561;
import org.jetbrains.annotations.NotNull;

public final class b7 implements ArgumentType {
   @NotNull
   public static final nc R;
   private static final long a = j0.a(7478801731193661256L, 2952463092369954833L, MethodHandles.lookup().lookupClass()).a(118180615424430L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   @NotNull
   public String o(byte a, int a, @NotNull StringReader reader, int a) throws CommandSyntaxException {
      long var5 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var4 << 40 >>> 40) ^ a;
      long var7 = var5 ^ 109287945284048L;
      Intrinsics.checkNotNullParameter(var3, true.c<invokedynamic>(27290, 19029098590508810L ^ var5));
      String var9 = var3.readString();

      try {
         _v var10000 = _v.n;
         Intrinsics.checkNotNull(var9);
         if (!var10000.p(var7, var9)) {
            throw (new DynamicCommandExceptionType(b7::f)).create(var9);
         } else {
            return var9;
         }
      } catch (CommandSyntaxException var10) {
         throw var10.A<invokedynamic>(var10, 5467899235251521601L, var5);
      }
   }

   @NotNull
   public CompletableFuture listSuggestions(@NotNull CommandContext context, @NotNull SuggestionsBuilder builder) {
      long var3 = a ^ 104111389656461L;
      long var5 = var3 ^ 57562416359411L;
      Intrinsics.checkNotNullParameter(var1, true.c<invokedynamic>(11410, 5908235690610686162L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.c<invokedynamic>(19295, 8848889978370006809L ^ var3));
      CompletableFuture var10000 = class_2172.method_9265((Iterable)c0.S.L().j(var5), var2);
      Intrinsics.checkNotNullExpressionValue(var10000, true.c<invokedynamic>(23972, 8901254921904523750L ^ var3));
      return var10000;
   }

   @NotNull
   public List C(int var1, int var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var6 = var4 ^ 129910275084923L;
      List var10000 = c0.S.L().j(var6).stream().limit(e).toList();
      Intrinsics.checkNotNullExpressionValue(var10000, true.c<invokedynamic>(26901, 5825729960883882206L ^ var4));
      return var10000;
   }

   private static final Message f(Object var0) {
      long var1 = a ^ 66333487103309L;
      long var3 = var1 ^ 4193141339813L;
      nf var10000 = nf.s;
      String var10001 = 7519.c<invokedynamic>(7519, 7983450395976724958L ^ var1);
      Object[] var5 = new Object[1];
      Intrinsics.checkNotNull(var0);
      var5[0] = var0;
      return (Message)class_2561.method_43470(var10000.G(var10001, var3, var5));
   }

   public Object parse(StringReader p0) {
      long var2 = a ^ 3670224766044L;
      long var10001 = var2 ^ 42750819159615L;
      int var4 = (int)((var2 ^ 42750819159615L) >>> 56);
      int var5 = (int)(var10001 << 8 >>> 32);
      int var6 = (int)(var10001 << 40 >>> 40);
      return this.o((byte)var4, var5, var1, var6);
   }

   public Collection getExamples() {
      long var1 = a ^ 74014608611213L;
      long var10001 = var1 ^ 129501355671985L;
      int var3 = (int)((var1 ^ 129501355671985L) >>> 32);
      int var4 = (int)(var10001 << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      return (Collection)this.C(var3, var4, (char)var5);
   }

   static {
      long var5 = a ^ 89292999670392L;
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
      String var11 = "½\"&\u0090´`[M\u0098ÈÕC\u0098\u0099|ÿ Ôì\u008eÊHÕ\u0080oeè.)Ø¶Ð õSaòyH\u0084'´¬ØÉz\u000b7\u0081è\u0098G\u0097\u007fç(&7N%¢âî»\u0004\u0010¼\u0083äS_\u009e,ýS\u0014{§åº÷\u00930\u0088o^¦_~Ã\u008a/3½<=§7\b_I®ÅÉÉ1\u0097\"¸\u0089Bò#À>®hñÁîm\u00939£ú\u000eÔn\u0085\u008cð";
      int var13 = "½\"&\u0090´`[M\u0098ÈÕC\u0098\u0099|ÿ Ôì\u008eÊHÕ\u0080oeè.)Ø¶Ð õSaòyH\u0084'´¬ØÉz\u000b7\u0081è\u0098G\u0097\u007fç(&7N%¢âî»\u0004\u0010¼\u0083äS_\u009e,ýS\u0014{§åº÷\u00930\u0088o^¦_~Ã\u008a/3½<=§7\b_I®ÅÉÉ1\u0097\"¸\u0089Bò#À>®hñÁîm\u00939£ú\u000eÔn\u0085\u008cð".length();
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
                  long var2 = -3138630125695605285L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  e = var23;
                  R = new nc((DefaultConstructorMarker)null);
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

               var11 = "Ã[9pÔÅÇvGÁä\u00adìye)\u0010Û\u0016÷\u001a\u009bót«Æ\u0007\u009a\u0096O/S\u0093";
               var13 = "Ã[9pÔÅÇvGÁä\u00adìye)\u0010Û\u0016÷\u001a\u009bót«Æ\u0007\u009a\u0096O/S\u0093".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14326;
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
            throw new RuntimeException("su/catlean/b7", var10);
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
         throw new RuntimeException("su/catlean/b7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
