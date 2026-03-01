package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class _u extends class_437 {
   @NotNull
   public static final _u w;
   @NotNull
   private static Set V;
   @Nullable
   private static dx r;
   @Nullable
   private static s4 a;
   private static final long b = j0.a(3219119606562401194L, 3852555335178076663L, MethodHandles.lookup().lookupClass()).a(261055091213448L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long f;

   private _u(long var1) {
      var1 ^= b;
      super(class_2561.method_30163(true.l<invokedynamic>(9692, 8800852206151457262L ^ var1)));
   }

   @NotNull
   public final Set Y() {
      return V;
   }

   public final void R(@NotNull Set <set-?>, long a) {
      var2 ^= b;
      Intrinsics.checkNotNullParameter(var1, true.l<invokedynamic>(9909, 8758741600896228585L ^ var2));
      V = var1;
   }

   @Nullable
   public final dx c() {
      return r;
   }

   public final void p(@Nullable dx <set-?>) {
      r = var1;
   }

   @Nullable
   public final s4 D() {
      return a;
   }

   public final void C(@Nullable s4 <set-?>) {
      a = var1;
   }

   protected void method_25426() {
      long var1 = b ^ 15952446021736L;
      Iterable var4 = (Iterable)V;
      int[] var10000 = 6659591568915846500L.A<invokedynamic>(6659591568915846500L, var1);
      boolean var5 = false;
      Iterator var6 = var4.iterator();
      int[] var3 = var10000;

      while(var6.hasNext()) {
         Object var7 = var6.next();
         s4 var8 = (s4)var7;
         boolean var9 = false;

         try {
            var8.J();
            if (var3 == null && var3 == null) {
               continue;
            }
            break;
         } catch (NumberFormatException var10) {
            throw var10.A<invokedynamic>(var10, 6687326205394130495L, var1);
         }
      }

   }

   public void method_25394(@NotNull class_332 context, int mouseX, int mouseY, float delta) {
      // $FF: Couldn't be decompiled
   }

   public boolean method_25421() {
      return false;
   }

   public boolean method_25402(@NotNull class_11909 click, boolean doubled) {
      // $FF: Couldn't be decompiled
   }

   public boolean method_25406(@NotNull class_11909 click) {
      long var2 = b ^ 87813563100635L;
      long var10001 = var2 ^ 109227703222324L;
      int var4 = (int)((var2 ^ 109227703222324L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, true.l<invokedynamic>(19756, 8710184224063524080L ^ var2));
      double var8 = var1.comp_4798();
      double var10 = var1.comp_4799();
      int var12 = var1.method_74245();
      int[] var10000 = -7937349835286996777L.A<invokedynamic>(-7937349835286996777L, var2);
      Iterable var13 = (Iterable)V;
      boolean var14 = false;
      Iterator var15 = var13.iterator();
      int[] var7 = var10000;

      while(true) {
         if (var15.hasNext()) {
            Object var16 = var15.next();
            s4 var17 = (s4)var16;
            boolean var18 = false;

            try {
               var17.v();
               if (var7 != null) {
                  break;
               }

               if (var7 == null) {
                  continue;
               }
            } catch (NumberFormatException var19) {
               throw var19.A<invokedynamic>(var19, -7963095731987719284L, var2);
            }
         }

         _t.e.S(var4, var5, var8, var6, var10, var12);
         break;
      }

      return super.method_25406(var1);
   }

   public boolean method_25401(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      long var9 = b ^ 42428236691362L;
      long var11 = var9 ^ 22231322199100L;
      int[] var10000 = 5449838423004365486L.A<invokedynamic>(5449838423004365486L, var9);
      Iterable var14 = (Iterable)V;
      int[] var13 = var10000;
      boolean var15 = false;
      Iterator var16 = var14.iterator();

      while(var16.hasNext()) {
         Object var17 = var16.next();
         s4 var18 = (s4)var17;
         boolean var19 = false;

         try {
            var18.D(var1, var11, var3, var7);
            if (var13 == null && var13 == null) {
               continue;
            }
            break;
         } catch (NumberFormatException var20) {
            throw var20.A<invokedynamic>(var20, 5405462856390181365L, var9);
         }
      }

      return super.method_25401(var1, var3, var5, var7);
   }

   public boolean method_25404(@NotNull class_11908 input) {
      // $FF: Couldn't be decompiled
   }

   public boolean method_25400(@NotNull class_11905 input) {
      // $FF: Couldn't be decompiled
   }

   protected void method_57734(@NotNull class_332 guiGraphics) {
      long var2 = b ^ 715356191472L;
      Intrinsics.checkNotNullParameter(var1, true.l<invokedynamic>(3290, 6907540422616373796L ^ var2));
   }

   public void method_25420(@NotNull class_332 guiGraphics, int mouseY, int j, float deltaTicks) {
      long var5 = b ^ 27435173286617L;
      Intrinsics.checkNotNullParameter(var1, true.l<invokedynamic>(15280, 6691719286533571949L ^ var5));
   }

   static {
      long var14 = b ^ 94567992245548L;
      long var16 = var14 ^ 83595968221359L;
      e = new HashMap(13);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[12];
      int var10 = 0;
      String var9 = "Àn\u0099±Þ\u008e\u0092W7\u00159ô\u00ado\u0091ê-¶?¸\u001e¡@\"Þ5Ê\u0085²\u0082\u00958%ì\u0013\u000b\u0098.læ(\u0011U\n\u0094\u009b\u0089\u0091\u0015Y=7tÞ¤_AtûÀÜ\u001dïfO,\u0003xRB\u0084\u0086O\u0014}û@\u0095½³\u008b\u0010B\u009e\u0001V\u0083êjJ¢!mÂ,\u000f\"\u0097\u0018I\u008c`\u009c\u001f(\u000e¹¼\u0086ýDïÎÇ\u0086\u000f¼\u008a\u0017IÀQÙ\u0010\u0093üKÅ,\u00870(\u0091ÑbV'Ds±0Aø\u0011ø\u0082á\u0002ÝË<¿²\"üà«»·u;ïW>\u000e\u0082\u008cÞ\u0089;hbíß¢±¿äÎÓw\u0000×\u0090X}[\u00907\u0010±Îeª8P(ñð \n\u0014X®%\u00ad\u0010\\ú\u0010¹\"\u0018\u0092\u0001¬Ð\u0019O\u0012µEL\u0010\u0081ë¹Ý\\\u0093A\u00902\u0088Û\u001dÚª¸S Ôs£½\u0003¹\u0081\u009a(ûp\u008bä\u009d¿Ý`ACÜf\u008bêD\u0018\u001aÿed\u0086éª";
      int var11 = "Àn\u0099±Þ\u008e\u0092W7\u00159ô\u00ado\u0091ê-¶?¸\u001e¡@\"Þ5Ê\u0085²\u0082\u00958%ì\u0013\u000b\u0098.læ(\u0011U\n\u0094\u009b\u0089\u0091\u0015Y=7tÞ¤_AtûÀÜ\u001dïfO,\u0003xRB\u0084\u0086O\u0014}û@\u0095½³\u008b\u0010B\u009e\u0001V\u0083êjJ¢!mÂ,\u000f\"\u0097\u0018I\u008c`\u009c\u001f(\u000e¹¼\u0086ýDïÎÇ\u0086\u000f¼\u008a\u0017IÀQÙ\u0010\u0093üKÅ,\u00870(\u0091ÑbV'Ds±0Aø\u0011ø\u0082á\u0002ÝË<¿²\"üà«»·u;ïW>\u000e\u0082\u008cÞ\u0089;hbíß¢±¿äÎÓw\u0000×\u0090X}[\u00907\u0010±Îeª8P(ñð \n\u0014X®%\u00ad\u0010\\ú\u0010¹\"\u0018\u0092\u0001¬Ð\u0019O\u0012µEL\u0010\u0081ë¹Ý\\\u0093A\u00902\u0088Û\u001dÚª¸S Ôs£½\u0003¹\u0081\u009a(ûp\u008bä\u009d¿Ý`ACÜf\u008bêD\u0018\u001aÿed\u0086éª".length();
      char var8 = '(';
      int var7 = -1;

      label37:
      while(true) {
         ++var7;
         String var19 = var9.substring(var7, var7 + var8);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var5.doFinal(var19.getBytes("ISO-8859-1"));
            String var24 = a(var13).intern();
            switch(var10001) {
            case 0:
               var12[var10++] = var24;
               if ((var7 += var8) >= var11) {
                  c = var12;
                  d = new String[12];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 8010443967561310625L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var26 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var22 = true;
                  f = var26;
                  w = new _u(var16);
                  s4[] var18 = new s4[]{sh.P, sn.G, sq.a, s7.m, sf.H};
                  V = SetsKt.setOf(var18);
                  return;
               }

               var8 = var9.charAt(var7);
               break;
            default:
               var12[var10++] = var24;
               if ((var7 += var8) < var11) {
                  var8 = var9.charAt(var7);
                  continue label37;
               }

               var9 = "eHg ùº\u0085\t1]#B\u0094¸/P¨\u0087\u009b\u000eÓ8®çwRfÈ\u009e\u009e]_³\u001e\u0083ÿ\u009a÷c\u001b\u00ad`1¼¾µ\u0016@XAã¹UË«\"ý\u000e^§kÐ#!Ä°\u0006®÷\u008e\u0019É:íìi´7?\u0016\u0085Õ`\u008f9væü8)Õ\u000bê§Æ\u009fPq[*\u0089ò \u008d\u009eNã\u0002P-&º\u000f¡à*ö\u0001Ñ\u009a\u008e\u0004\"\nÒO\u00ad\u0095\u0089\u007fë\u0001?ª&ÿèíÝ´\u009dÔÿ;Ô\u001dF`9Ua\u008cL\u0082\u001a5Þ9\u0085'õL4 ½¬â[tÒÕuCû4 £ )Ñ\u000f\u0012\u0096ÖÃ";
               var11 = "eHg ùº\u0085\t1]#B\u0094¸/P¨\u0087\u009b\u000eÓ8®çwRfÈ\u009e\u009e]_³\u001e\u0083ÿ\u009a÷c\u001b\u00ad`1¼¾µ\u0016@XAã¹UË«\"ý\u000e^§kÐ#!Ä°\u0006®÷\u008e\u0019É:íìi´7?\u0016\u0085Õ`\u008f9væü8)Õ\u000bê§Æ\u009fPq[*\u0089ò \u008d\u009eNã\u0002P-&º\u000f¡à*ö\u0001Ñ\u009a\u008e\u0004\"\nÒO\u00ad\u0095\u0089\u007fë\u0001?ª&ÿèíÝ´\u009dÔÿ;Ô\u001dF`9Ua\u008cL\u0082\u001a5Þ9\u0085'õL4 ½¬â[tÒÕuCû4 £ )Ñ\u000f\u0012\u0096ÖÃ".length();
               var8 = 16;
               var7 = -1;
            }

            ++var7;
            var19 = var9.substring(var7, var7 + var8);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20912;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/_u", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/_u" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
