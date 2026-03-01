package su.catlean;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_124;
import org.jetbrains.annotations.NotNull;

public final class _2 extends _i {
   @NotNull
   public static final _2 S;
   private static final long a = j0.a(8010604267219160353L, 2837939225213391466L, MethodHandles.lookup().lookupClass()).a(115461599867032L);
   private static final String[] c;
   private static final String[] e;
   private static final Map g;

   private _2(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 6374927255867L;
      super(true.e<invokedynamic>(18210, 3453159600684278235L ^ var1), var3);
   }

   public void T(long a, @NotNull LiteralArgumentBuilder builder) {
      long var10001 = var1 ^ 8939855007606L;
      int var4 = (int)((var1 ^ 8939855007606L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var1 ^ 70331075405448L;
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(20605, 6313333962346515646L ^ var1));
      var3.then(this.t(var7, true.e<invokedynamic>(32074, 3614776295325884813L ^ var1)).executes(_2::A));
      var3.then(this.t(var7, true.e<invokedynamic>(26246, 3790066753663498822L ^ var1)).then(this.k(true.e<invokedynamic>(8778, 2245130534984007308L ^ var1), var4, (char)var5, (ArgumentType)x.X.k(), (short)var6).executes(_2::d)));
      var3.then(this.t(var7, true.e<invokedynamic>(25634, 7642636735165790446L ^ var1)).then(this.k(true.e<invokedynamic>(4646, 1940578877912125167L ^ var1), var4, (char)var5, (ArgumentType)b7.R.T(), (short)var6).executes(_2::a)));
      var3.then(this.t(var7, true.e<invokedynamic>(30498, 3198459837345983471L ^ var1)).executes(_2::h));
      var3.executes(_2::P);
   }

   private static final int A(CommandContext var0) {
      long var1 = a ^ 4073344887620L;
      long var3 = var1 ^ 2505112190950L;
      long var5 = var1 ^ 94960433362721L;
      long var7 = var1 ^ 106675359618668L;
      _v.n.o(var3);
      S.O(nf.s.G(true.e<invokedynamic>(1955, 1665079461494121184L ^ var1), var5, new Object[0]), var7);
      return 1;
   }

   private static final int d(CommandContext var0) {
      long var1 = a ^ 129102950344969L;
      long var3 = var1 ^ 6669649176584L;
      long var5 = var1 ^ 35746138109292L;
      long var7 = var1 ^ 26225939731489L;
      String var9 = (String)var0.getArgument(true.e<invokedynamic>(4646, 1940608303510172970L ^ var1), String.class);
      _v var10000 = _v.n;
      Intrinsics.checkNotNull(var9);
      var10000.P(var3, var9);
      _2 var11 = S;
      nf var10001 = nf.s;
      String var10002 = 19529.e<invokedynamic>(19529, 3050388551230745417L ^ var1);
      Object[] var10 = new Object[]{var9};
      var11.O(var10001.G(var10002, var5, var10), var7);
      return 1;
   }

   private static final int a(CommandContext var0) {
      long var1 = a ^ 94741834269659L;
      long var3 = var1 ^ 102124793888743L;
      long var5 = var1 ^ 4136485724094L;
      long var7 = var1 ^ 57844112850675L;
      String var9 = (String)var0.getArgument(true.e<invokedynamic>(4646, 1940576148400087032L ^ var1), String.class);
      _v var10000 = _v.n;
      Intrinsics.checkNotNull(var9);
      var10000.s(var3, var9);
      _2 var11 = S;
      nf var10001 = nf.s;
      String var10002 = 4030.e<invokedynamic>(4030, 2283821827123380843L ^ var1);
      Object[] var10 = new Object[]{var9};
      var11.O(var10001.G(var10002, var5, var10), var7);
      return 1;
   }

   private static final int h(CommandContext param0) {
      // $FF: Couldn't be decompiled
   }

   private static final int P(CommandContext var0) {
      long var1 = a ^ 137062421573247L;
      long var3 = var1 ^ 33094742561623L;
      S.O(class_124.field_1061 + true.e<invokedynamic>(18177, 8142250404037551994L ^ var1), var3);
      return 1;
   }

   static {
      long var9 = a ^ 46582942220969L;
      long var11 = var9 ^ 26650210786284L;
      g = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[16];
      int var5 = 0;
      String var4 = "¾wQf\u0000\u0018ÊÜös\u0083õ·\f0W(û,w~ØëÍ¶\u0095<å\u0095I7£y`ÿðjo\u0094úÒ¿Ø\u001fJ\r\u0015\u008bGØ\u0007mÕY\u0003T\u009f\u0018PÔ4\u0089ÁY¸\u008d\u0016\u0018°gîH@'|«\u0095ñÉqX\f\u0010û¦d-\u0097:3\u0012\u0097½s$\bÁpi\u0010{Þ%2evdòÓ>uGÑï½N\u0010£g\u0084\u009aþ\u0019!¶\u0012\u0005\u001d\u000f¨Ù\u0097\u009e(ÓOÊb½ÿ×H.\u009aq\u0010\u0080PE_\u0007,âl·>¯Rú½%êJ\u0018]£\u0091ÜÔ\u0098¤\u0017\u0085¥\u0010Q-¼xÐ+Ý\u008f\u0016\u00962_<\u0001Üø(]Ãàdô\u000fîÙU\u008cµ_\u0099.\u001aÀ \u0084ùã\u0084å\u0019O1\u001c\n\u008a\u0014\u0006\u0012õ\u0016\u0092®Éðw\u0015¥(dEÕK\u001eæ°\u001e\f¿Põ>PÚ¤Ô\u0086\bÂ,w\u0011\u0004f\f\u0098l\u0088\u0007\u0089¥Ã'\u0016£\u000b$\u0097^\u0010\rm<L\u0080D\u0085Ú\u0016¢¡¹bÕûjp!sfv\tó9\u0018ÂWì\u0010*Lºô0R[\u0019\u001e¢Ïúÿ\u0011õa\u00ad\u001cáqênê-Ë\b\u008c\u000b\u0011\u0003j^ªóÔ¡\u0097/\u008b\u0084\u00185Fó\u0099\u0013\u00914\u0083ë\u001ehk\u008eÒ\u009e°È\u0091?¸\u0090_¡\u0002\u008e\u0002\u0092#¿=f\f}Ý\u009bçU«é\b\u00190Ã¬3\u009bUÖ^\u007fæj\u001aWHö%b5(ù4Q;êlY\u0017ækFîÚï¢ça\u0005tò\u0011Õ\u0086Ó;\u001c\u0007éO8õ\u007f,\u0011W\u0006±sN\f\u0010ÖW)Ùx!Úz\u00182¤Á\u009d\u0004\u001aI";
      int var6 = "¾wQf\u0000\u0018ÊÜös\u0083õ·\f0W(û,w~ØëÍ¶\u0095<å\u0095I7£y`ÿðjo\u0094úÒ¿Ø\u001fJ\r\u0015\u008bGØ\u0007mÕY\u0003T\u009f\u0018PÔ4\u0089ÁY¸\u008d\u0016\u0018°gîH@'|«\u0095ñÉqX\f\u0010û¦d-\u0097:3\u0012\u0097½s$\bÁpi\u0010{Þ%2evdòÓ>uGÑï½N\u0010£g\u0084\u009aþ\u0019!¶\u0012\u0005\u001d\u000f¨Ù\u0097\u009e(ÓOÊb½ÿ×H.\u009aq\u0010\u0080PE_\u0007,âl·>¯Rú½%êJ\u0018]£\u0091ÜÔ\u0098¤\u0017\u0085¥\u0010Q-¼xÐ+Ý\u008f\u0016\u00962_<\u0001Üø(]Ãàdô\u000fîÙU\u008cµ_\u0099.\u001aÀ \u0084ùã\u0084å\u0019O1\u001c\n\u008a\u0014\u0006\u0012õ\u0016\u0092®Éðw\u0015¥(dEÕK\u001eæ°\u001e\f¿Põ>PÚ¤Ô\u0086\bÂ,w\u0011\u0004f\f\u0098l\u0088\u0007\u0089¥Ã'\u0016£\u000b$\u0097^\u0010\rm<L\u0080D\u0085Ú\u0016¢¡¹bÕûjp!sfv\tó9\u0018ÂWì\u0010*Lºô0R[\u0019\u001e¢Ïúÿ\u0011õa\u00ad\u001cáqênê-Ë\b\u008c\u000b\u0011\u0003j^ªóÔ¡\u0097/\u008b\u0084\u00185Fó\u0099\u0013\u00914\u0083ë\u001ehk\u008eÒ\u009e°È\u0091?¸\u0090_¡\u0002\u008e\u0002\u0092#¿=f\f}Ý\u009bçU«é\b\u00190Ã¬3\u009bUÖ^\u007fæj\u001aWHö%b5(ù4Q;êlY\u0017ækFîÚï¢ça\u0005tò\u0011Õ\u0086Ó;\u001c\u0007éO8õ\u007f,\u0011W\u0006±sN\f\u0010ÖW)Ùx!Úz\u00182¤Á\u009d\u0004\u001aI".length();
      char var3 = 16;
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var13 = var4.substring(var2, var2 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var17 = b(var8).intern();
            switch(var10001) {
            case 0:
               var7[var5++] = var17;
               if ((var2 += var3) >= var6) {
                  c = var7;
                  e = new String[16];
                  S = new _2(var11);
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var17;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "\u0018\"ªöi¤Þ®¬\u0083 \u008bøìÝá\u0010îdec\u008ak\u0001¥HÊÀ¦z\u00108¬";
               var6 = "\u0018\"ªöi¤Þ®¬\u0083 \u008bøìÝá\u0010îdec\u008ak\u0001¥HÊÀ¦z\u00108¬".length();
               var3 = 16;
               var2 = -1;
            }

            ++var2;
            var13 = var4.substring(var2, var2 + var3);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String b(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32699;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/_2", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/_2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
