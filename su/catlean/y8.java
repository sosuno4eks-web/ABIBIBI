package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.BasicProjectionMatrixEvent;
import su.catlean.gofra.Flow;

public final class y8 extends k9 {
   @NotNull
   public static final y8 B;
   // $FF: synthetic field
   static final KProperty[] X;
   @NotNull
   private static final z7 Y;
   @NotNull
   private static final zc k;
   @NotNull
   private static final z7 M;
   @NotNull
   private static final zc o;
   @NotNull
   private static final aa m;
   private static final long b = j0.a(-4781614959064575599L, 474888623008029310L, MethodHandles.lookup().lookupClass()).a(64966348567205L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   private y8(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 79888332333239L;
      super(var3, true.r<invokedynamic>(24501, 267068819576271793L ^ var1), pa.m(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final n_ A(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 63306329897L;
      int var3 = (int)((var1 ^ 63306329897L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (n_)Y.k((short)var3, this, X[0], (short)var4, var5);
   }

   private final float y(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 133804164132286L;
      int var3 = (int)((var1 ^ 133804164132286L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)k.k((short)var3, this, X[1], (short)var4, var5)).floatValue();
   }

   private final n_ K(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 124092784208136L;
      int var3 = (int)((var1 ^ 124092784208136L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (n_)M.k((short)var3, this, X[2], (short)var4, var5);
   }

   private final float d(int var1, byte var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ b;
      long var10001 = var4 ^ 65577429349900L;
      int var6 = (int)((var4 ^ 65577429349900L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)o.k((short)var6, this, X[3], (short)var7, var8)).floatValue();
   }

   @Flow
   private final void H(BasicProjectionMatrixEvent param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var27 = b ^ 122272113978153L;
      long var10001 = var27 ^ 12280238565453L;
      int var29 = (int)((var27 ^ 12280238565453L) >>> 32);
      int var30 = (int)(var10001 << 32 >>> 48);
      int var31 = (int)(var10001 << 48 >>> 48);
      var10001 = var27 ^ 137546234860740L;
      int var32 = (int)((var27 ^ 137546234860740L) >>> 32);
      int var33 = (int)(var10001 << 32 >>> 48);
      int var34 = (int)(var10001 << 48 >>> 48);
      long var35 = var27 ^ 43905639898823L;
      long var37 = var27 ^ 124534360363234L;
      var10001 = var27 ^ 120021383409366L;
      int var39 = (int)((var27 ^ 120021383409366L) >>> 48);
      int var40 = (int)(var10001 << 16 >>> 48);
      int var41 = (int)(var10001 << 32 >>> 32);
      e = new HashMap(13);
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var27 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[13];
      int var23 = 0;
      String var22 = "Áõ\u00ad &PÆ\u0006ZíÌHÂ\u0088ïªÕnÅx\u0082Ç)\u008b\u008a-eªæÏ·&\u0010D\u0010¿\u0006<D4\u0011\u0012\u0016Ñ\u007f*\u001c~r «\u0005ÐbyÅÍµ\u0007I`\u0018¶1£\u001c½rv!)\u0083\u0016ìÜ\u001dD\u0095\u00adÅ*\u009c\u0018È\u0019\n\u0088þ4Ý\u0080\u0001^*\u0000ùv\u0094\u0018\u0005)\u0094Î\u0094L¡W\u0018K'/{\u000e_\u0016-DÉUéå¡nëm\u0002\u00804´ç\u0018:\u0010ßBá\u0016¤·-Äd\u0019Pz\u0006\u008a\u009aÙ\u0018\u0089<fzn²\u00141%\u008aË·=gõ\u001d%x&9Yò\u0092\t mî_b[±ñ\u00865y)9\u0004mN½9Qü;%2l >¥¹Ìôô9\u00050Kpné+µË±ÜM½gÉVë\u0004Ò{ÕDZÉ\u0090\u009cøW#Ú\\^}\u008d>·Ù'ãO1(v\u008c\u0098â:ôR;\u0018w¾L\u0014DÙÕ\u0003\u001dp5éç`È(Ô\u0087/ï\u0089f*\u0092 Ê WF\u0099ØÇ®ªn³ê\u008dRéÕ\t\u009aV±\u008eÒ\u009e\u009d$\u008a±\u0000\u009eÔ\b\u0017";
      int var24 = "Áõ\u00ad &PÆ\u0006ZíÌHÂ\u0088ïªÕnÅx\u0082Ç)\u008b\u008a-eªæÏ·&\u0010D\u0010¿\u0006<D4\u0011\u0012\u0016Ñ\u007f*\u001c~r «\u0005ÐbyÅÍµ\u0007I`\u0018¶1£\u001c½rv!)\u0083\u0016ìÜ\u001dD\u0095\u00adÅ*\u009c\u0018È\u0019\n\u0088þ4Ý\u0080\u0001^*\u0000ùv\u0094\u0018\u0005)\u0094Î\u0094L¡W\u0018K'/{\u000e_\u0016-DÉUéå¡nëm\u0002\u00804´ç\u0018:\u0010ßBá\u0016¤·-Äd\u0019Pz\u0006\u008a\u009aÙ\u0018\u0089<fzn²\u00141%\u008aË·=gõ\u001d%x&9Yò\u0092\t mî_b[±ñ\u00865y)9\u0004mN½9Qü;%2l >¥¹Ìôô9\u00050Kpné+µË±ÜM½gÉVë\u0004Ò{ÕDZÉ\u0090\u009cøW#Ú\\^}\u008d>·Ù'ãO1(v\u008c\u0098â:ôR;\u0018w¾L\u0014DÙÕ\u0003\u001dp5éç`È(Ô\u0087/ï\u0089f*\u0092 Ê WF\u0099ØÇ®ªn³ê\u008dRéÕ\t\u009aV±\u008eÒ\u009e\u009d$\u008a±\u0000\u009eÔ\b\u0017".length();
      char var21 = ' ';
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var50 = var22.substring(var20, var20 + var21);
         byte var53 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var50.getBytes("ISO-8859-1"));
            String var57 = b(var26).intern();
            switch(var53) {
            case 0:
               var25[var23++] = var57;
               if ((var20 += var21) >= var24) {
                  c = var25;
                  d = new String[13];
                  Cipher var8;
                  var10000 = var8 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var9 = 1; var9 < 8; ++var9) {
                     var10003[var9] = (byte)((int)(var27 << var9 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var7 = new long[6];
                  int var11 = 0;
                  String var12 = "`'g¹fö\u0081<Ð\u0088\u0005]ÌsiÅ\u009fµôªÌ*:gyNÃÝÞh8Ï";
                  int var13 = "`'g¹fö\u0081<Ð\u0088\u0005]ÌsiÅ\u009fµôªÌ*:gyNÃÝÞh8Ï".length();
                  int var10 = 0;

                  label46:
                  while(true) {
                     int var59 = var10;
                     var10 += 8;
                     byte[] var14 = var12.substring(var59, var10).getBytes("ISO-8859-1");
                     long[] var52 = var7;
                     var59 = var11++;
                     long var60 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                     byte var61 = -1;

                     while(true) {
                        long var15 = var60;
                        byte[] var17 = var8.doFinal(new byte[]{(byte)((int)(var15 >>> 56)), (byte)((int)(var15 >>> 48)), (byte)((int)(var15 >>> 40)), (byte)((int)(var15 >>> 32)), (byte)((int)(var15 >>> 24)), (byte)((int)(var15 >>> 16)), (byte)((int)(var15 >>> 8)), (byte)((int)var15)});
                        long var64 = ((long)var17[0] & 255L) << 56 | ((long)var17[1] & 255L) << 48 | ((long)var17[2] & 255L) << 40 | ((long)var17[3] & 255L) << 32 | ((long)var17[4] & 255L) << 24 | ((long)var17[5] & 255L) << 16 | ((long)var17[6] & 255L) << 8 | (long)var17[7] & 255L;
                        switch(var61) {
                        case 0:
                           var52[var59] = var64;
                           if (var10 >= var13) {
                              Cipher var2;
                              var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var3 = 1; var3 < 8; ++var3) {
                                 var10003[var3] = (byte)((int)(var27 << var3 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var4 = 9001684197083592924L;
                              byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                              var60 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                              boolean var62 = true;
                              long var0 = var60;
                              KProperty[] var49 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y8.class, true.r<invokedynamic>(20365, 6932628975298796090L ^ var27), true.r<invokedynamic>(2809, 821300230726459215L ^ var27), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y8.class, true.r<invokedynamic>(24876, 4804020123230925969L ^ var27), true.r<invokedynamic>(14712, 7566760004298747072L ^ var27), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y8.class, true.r<invokedynamic>(18444, 6228120877419945397L ^ var27), true.r<invokedynamic>(29804, 8653930017110417886L ^ var27), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y8.class, true.r<invokedynamic>(4902, 853787729807640210L ^ var27), true.r<invokedynamic>(23795, 6075416027529365830L ^ var27), 0)))};
                              X = var49;
                              B = new y8(var37);
                              il var54 = (il)B;
                              String var56 = 12566.r<invokedynamic>(12566, 1602634325408720040L ^ var27);
                              n_ var65 = new n_(0, var32, (char)var33, false, (char)var34, false, (int)var7[4], (DefaultConstructorMarker)null);
                              int var10005 = (int)var7[0];
                              Object var42 = null;
                              int var43 = var10005;
                              Object var44 = null;
                              Object var45 = null;
                              n_ var46 = var65;
                              String var47 = var56;
                              il var48 = var54;
                              Y = qi.b(var29, var48, var47, (char)var30, var46, (pj)var45, (Function0)var44, var43, var42, (short)var31);
                              k = qi.g((il)B, true.r<invokedynamic>(23060, 5403951162573442991L ^ var27), 8.0F, RangesKt.rangeTo(1.0F, 25.0F), (pj)null, (Function0)null, (int)var7[1], var35, (Object)null);
                              var54 = (il)B;
                              var56 = 8849.r<invokedynamic>(8849, 5062072540068493099L ^ var27);
                              var65 = new n_(0, var32, (char)var33, false, (char)var34, false, (int)var7[3], (DefaultConstructorMarker)null);
                              var10005 = (int)var7[5];
                              var42 = null;
                              var43 = var10005;
                              var44 = null;
                              var45 = null;
                              var46 = var65;
                              var47 = var56;
                              var48 = var54;
                              M = qi.b(var29, var48, var47, (char)var30, var46, (pj)var45, (Function0)var44, var43, var42, (short)var31);
                              o = qi.g((il)B, true.r<invokedynamic>(32042, 8909275929142290582L ^ var27), 0.75F, RangesKt.rangeTo(0.1F, 1.0F), (pj)null, (Function0)null, (int)var7[2], var35, (Object)null);
                              m = new aa(sa.OUT_QUINT, var0, (short)var39, (short)var40, var41);
                              return;
                           }
                           break;
                        default:
                           var52[var59] = var64;
                           if (var10 < var13) {
                              continue label46;
                           }

                           var12 = "2Ù\u009dRv©Y\u0094Þ\u0001rÀ\u0004Ô\u0088ç";
                           var13 = "2Ù\u009dRv©Y\u0094Þ\u0001rÀ\u0004Ô\u0088ç".length();
                           var10 = 0;
                        }

                        var59 = var10;
                        var10 += 8;
                        var14 = var12.substring(var59, var10).getBytes("ISO-8859-1");
                        var52 = var7;
                        var59 = var11++;
                        var60 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                        var61 = 0;
                     }
                  }
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var57;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label64;
               }

               var22 = "Ú~P\u0006\u008bÖBY£]BG\u0015\u0006õ\u0007Híïf\u000b0ÑS8öW¦ø\u0018eõ9\u0013\u0004V\u0011-¿\u0088\u001b \u0005*\u0018·¡Ww5iÆ°ñ<¹)Ñ3Å%]_%ß&Þ1\u001e\u0080À¿Æ=ùk\u0081k_à\u001a";
               var24 = "Ú~P\u0006\u008bÖBY£]BG\u0015\u0006õ\u0007Híïf\u000b0ÑS8öW¦ø\u0018eõ9\u0013\u0004V\u0011-¿\u0088\u001b \u0005*\u0018·¡Ww5iÆ°ñ<¹)Ñ3Å%]_%ß&Þ1\u001e\u0080À¿Æ=ùk\u0081k_à\u001a".length();
               var21 = 24;
               var20 = -1;
            }

            ++var20;
            var50 = var22.substring(var20, var20 + var21);
            var53 = 0;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22478;
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
            throw new RuntimeException("su/catlean/y8", var10);
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
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
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
         throw new RuntimeException("su/catlean/y8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
