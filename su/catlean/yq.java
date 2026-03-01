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
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.gofra.Flow;

public final class yq extends k9 {
   @NotNull
   public static final yq N;
   // $FF: synthetic field
   static final KProperty[] S;
   @NotNull
   private static final zl m;
   private static final long b = j0.a(-7359704727757558021L, 2750477944310312146L, MethodHandles.lookup().lookupClass()).a(265292614994209L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private yq(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 15698171310185L;
      super(var3, true.v<invokedynamic>(5878, 8177701142717952023L ^ var1), pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final String I(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 36022858607519L;
      int var3 = (int)((var1 ^ 36022858607519L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (String)m.k((short)var3, this, S[0], (short)var4, var5);
   }

   @Flow
   private final void z(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 2365206767311L;
      long var22 = var20 ^ 99772537802202L;
      long var24 = var20 ^ 138570812622807L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[22];
      int var16 = 0;
      String var15 = "¡\u009e\u0085=ky\u0093¶@\u00adOøßO\u0000>*T4A\u0086\u0090\u0080\u0006g\u007f¶egÙ\u008döî\u0000KÁ(\u001e>R\u009cýÅÌNÎ4ø®B\u0083j(\u001eh\u00123¤;ª\u0016\u000b¾³zãRû.Õ $\u001fµ\bw\u00ado\u009fÿ©ù»F\u0088ÇÛ\u009fµ\u0090!oèî{è\u009a\u001e(÷ûÔ\u0088¦>T\u001cî\u001aè\u0084Wh/TPm6½\u001d²[¶Ék\u0096\u0011¡ì\u0086cpèU¯SªËf{öá$Ä~\u009ey\u008fè\ttØwC\b\"\u0002 ïC\u0010fdäV[pÎÒ\u0007a¸ûÚÖh\u0094 |§ÇB\u00907ÉV\u0095\u0014þ6f0½:ÂßÝÑ)³V\u0087.0î\u0087¶üí§ ¢øC0Ý?RÓVø§-K0d4\u0088FÙÝQòåT>Ô<\u0006ÀGß\u009e\u00104¬Û-,¤\b\u0097\u0093b\u0080ìz\u009cÊ2 |M\u00959Wí]M½&%\u000b\u008f¤Ai\u000eµ\u001eãR1úAx\u0013(öW\u0089\u0094\u0018\u0018\u008byX´ÿ:W6Àª\nwÈ\u0095ä]\u009cl\u0087\u000e´ä©õ yA4¯R\u001aSI«sh×#PóýhÄÓck[(\u0080÷â¿Ïnfõ\u001e(¶3Ag\u0082\u000bÕ¯qúf\u001cg\u00adÞ±\u0096\u0086'j¶\u008eÂ\u0006\u008do¿W\r\u009fÓ\u008dþ í\u0098\u0092\u008fÝÝ\u0010\u008eqbqæ\u000f¤\u000f·s¢\u0017§\u000büA\u0018Ì Ô2sNnvåbiÞ0áWu÷¼\u0082\u0094®Pkô@\u0085\u001e2¼Ôß92ÖÂ\u009fó¯{\u000bÈm\u008fC\t\u0012Ëã\u0004\u00867+\u0003b\u000fC\u0005dk\u0018RÛ pì¾Ò\u0014Æ·\u0003´!¡Ï\u0096\u0093®ÓìM÷%à\u008b\u0004\u0092Îv\u0010½àN\u0083KÒiÝ÷\u001bç\u0015æÅMÜ C>2ï\u001cBû\u0088\u0080\u000e©\u0001Ë§\u008eG\u00adB¢ðå;\u009c\u0092z´\u0080ìZªqÂ\u0010\u001e\u000b\u0089¢K*ø\u009f\u001cÓùK\u00adËRH8¡þGV¢\u0085ã¡\u0082y;.|²Á9/\u009fB*\u0002¶þ¯\u0089\u0091\u000bùÍÎo¶\u0083.p>\u0090R\tç®:ÞëÐô\u009c/M\u001b=\u001aÃ'øâ\u0010À0~ýãrY&!Z\u008fÄåd\u001d. \u0085´ô½\u0088¥Áü¢É8\n\f\u009fò,\u0083\u0094yN\u0013{\u0013\u001c¿R¨\u000f\u00ad7\u0002Û\u0018@RÕ\u0091\u0017[¦,Vn Í\u0006¥\u0099,V\u001aö!v\u001dã§ ß\bv\u009f»Òt\u00169V6U¯Fôáñ8°\u008c.\u0018ê\u0098f\u0015e\u0016zëâ\u0003";
      int var17 = "¡\u009e\u0085=ky\u0093¶@\u00adOøßO\u0000>*T4A\u0086\u0090\u0080\u0006g\u007f¶egÙ\u008döî\u0000KÁ(\u001e>R\u009cýÅÌNÎ4ø®B\u0083j(\u001eh\u00123¤;ª\u0016\u000b¾³zãRû.Õ $\u001fµ\bw\u00ado\u009fÿ©ù»F\u0088ÇÛ\u009fµ\u0090!oèî{è\u009a\u001e(÷ûÔ\u0088¦>T\u001cî\u001aè\u0084Wh/TPm6½\u001d²[¶Ék\u0096\u0011¡ì\u0086cpèU¯SªËf{öá$Ä~\u009ey\u008fè\ttØwC\b\"\u0002 ïC\u0010fdäV[pÎÒ\u0007a¸ûÚÖh\u0094 |§ÇB\u00907ÉV\u0095\u0014þ6f0½:ÂßÝÑ)³V\u0087.0î\u0087¶üí§ ¢øC0Ý?RÓVø§-K0d4\u0088FÙÝQòåT>Ô<\u0006ÀGß\u009e\u00104¬Û-,¤\b\u0097\u0093b\u0080ìz\u009cÊ2 |M\u00959Wí]M½&%\u000b\u008f¤Ai\u000eµ\u001eãR1úAx\u0013(öW\u0089\u0094\u0018\u0018\u008byX´ÿ:W6Àª\nwÈ\u0095ä]\u009cl\u0087\u000e´ä©õ yA4¯R\u001aSI«sh×#PóýhÄÓck[(\u0080÷â¿Ïnfõ\u001e(¶3Ag\u0082\u000bÕ¯qúf\u001cg\u00adÞ±\u0096\u0086'j¶\u008eÂ\u0006\u008do¿W\r\u009fÓ\u008dþ í\u0098\u0092\u008fÝÝ\u0010\u008eqbqæ\u000f¤\u000f·s¢\u0017§\u000büA\u0018Ì Ô2sNnvåbiÞ0áWu÷¼\u0082\u0094®Pkô@\u0085\u001e2¼Ôß92ÖÂ\u009fó¯{\u000bÈm\u008fC\t\u0012Ëã\u0004\u00867+\u0003b\u000fC\u0005dk\u0018RÛ pì¾Ò\u0014Æ·\u0003´!¡Ï\u0096\u0093®ÓìM÷%à\u008b\u0004\u0092Îv\u0010½àN\u0083KÒiÝ÷\u001bç\u0015æÅMÜ C>2ï\u001cBû\u0088\u0080\u000e©\u0001Ë§\u008eG\u00adB¢ðå;\u009c\u0092z´\u0080ìZªqÂ\u0010\u001e\u000b\u0089¢K*ø\u009f\u001cÓùK\u00adËRH8¡þGV¢\u0085ã¡\u0082y;.|²Á9/\u009fB*\u0002¶þ¯\u0089\u0091\u000bùÍÎo¶\u0083.p>\u0090R\tç®:ÞëÐô\u009c/M\u001b=\u001aÃ'øâ\u0010À0~ýãrY&!Z\u008fÄåd\u001d. \u0085´ô½\u0088¥Áü¢É8\n\f\u009fò,\u0083\u0094yN\u0013{\u0013\u001c¿R¨\u000f\u00ad7\u0002Û\u0018@RÕ\u0091\u0017[¦,Vn Í\u0006¥\u0099,V\u001aö!v\u001dã§ ß\bv\u009f»Òt\u00169V6U¯Fôáñ8°\u008c.\u0018ê\u0098f\u0015e\u0016zëâ\u0003".length();
      char var14 = 160;
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var27 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
            String var32 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var32;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[22];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "a\u0082;\u001a\u0001\u0011\u0087\u0095\u007fá\u008dp\u0001%ëúI\fz\u0010{Ù(o";
                  int var5 = "a\u0082;\u001a\u0001\u0011\u0087\u0095\u007fá\u008dp\u0001%ëúI\fz\u0010{Ù(o".length();
                  int var2 = 0;

                  do {
                     int var30 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                     var30 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var34 = true;
                     var6[var30] = var10004;
                  } while(var2 < var5);

                  f = var6;
                  g = new Integer[3];
                  KProperty[] var26 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yq.class, true.v<invokedynamic>(2719, 8902436663852653425L ^ var20), true.v<invokedynamic>(1370, 331349608312755386L ^ var20), 0)))};
                  S = var26;
                  N = new yq(var22);
                  m = qi.P((il)N, true.v<invokedynamic>(7669, 5359481346376649751L ^ var20), var24, true.v<invokedynamic>(31525, 7862183778258234048L ^ var20), (pj)null, (Function0)null, true.h<invokedynamic>(25922, 7374962015693135081L ^ var20), (Object)null);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var32;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "&gPIo¾\u0013£Ö\u000eôI\u008e±\u000edö\fr×_Zâ>\u0091Î6\na£wYw\u0082\u009c0\u0085CÄÂ\u0090»Ñ\u009d¬\u001c&7Ï¼°\u0016\u0001\u0092¦· k\u009c9*.\u0015\u0006\u0015p\u000fí\u0000â\u0002ØÈ~AjÐ Äß\u0004§\u008cKÖæ\u009fMg";
               var17 = "&gPIo¾\u0013£Ö\u000eôI\u008e±\u000edö\fr×_Zâ>\u0091Î6\na£wYw\u0082\u009c0\u0085CÄÂ\u0090»Ñ\u009d¬\u001c&7Ï¼°\u0016\u0001\u0092¦· k\u009c9*.\u0015\u0006\u0015p\u000fí\u0000â\u0002ØÈ~AjÐ Äß\u0004§\u008cKÖæ\u009fMg".length();
               var14 = '8';
               var13 = -1;
            }

            ++var13;
            var27 = var15.substring(var13, var13 + var14);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19954;
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
            throw new RuntimeException("su/catlean/yq", var10);
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
         throw new RuntimeException("su/catlean/yq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 9654;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/yq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/yq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
