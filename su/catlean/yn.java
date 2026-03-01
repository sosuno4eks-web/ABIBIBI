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
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.gofra.Flow;

public final class yn extends k9 {
   @NotNull
   public static final yn y;
   static final KProperty[] r;
   @NotNull
   private static final zo W;
   @NotNull
   private static final zo c;
   @NotNull
   private static final zo m;
   private static final long b = j0.a(1861273707561482282L, 3436452508365949529L, MethodHandles.lookup().lookupClass()).a(114099128659645L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f;

   private yn(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 72185393648811L;
      super(var3, true.g<invokedynamic>(1584, 263688354334903135L ^ var1), pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean w(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 100951114866404L;
      int var3 = (int)((var1 ^ 100951114866404L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)W.k((short)var3, this, r[0], (short)var4, var5);
   }

   private final boolean r(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 93114028342198L;
      int var3 = (int)((var1 ^ 93114028342198L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)c.k((short)var3, this, r[1], (short)var4, var5);
   }

   private final boolean e(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 134894642110935L;
      int var3 = (int)((var1 ^ 134894642110935L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)m.k((short)var3, this, r[2], (short)var4, var5);
   }

   @Flow
   private final void S(SendPacket param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 72188417331038L;
      long var22 = var20 ^ 73997071877954L;
      long var24 = var20 ^ 95515715354761L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[10];
      int var16 = 0;
      String var15 = "\"øh\u0012\\:\u0017\"¨>{rûu ´ ¿\u001bùlØ\u0018ÜØ\u000e\u0097S#ú\u0099o¡e\u0096;[Rx\u0006²\"\u0086\u0017\u0003°6Ïà ³#\u009c\u008cÙ';_\u008a=§Ü¸Ã?\u000eÔBË äSÖ¹\f\u009c*\u0015m8\u0093\u0018 ppÝäKÖ\u0012í£\u0099º\u0006Ïjp:Ü»·\u0096»×b±ú\u009eïþ\u0083iä)\u0010\rº4¤L\u001f\u0014Fq \f÷\u0086W:\u0081\u0018ÈW\u0091ºØ\u009e\u0001ã\u000e×,å\u009d|6\u009a\u0087å<,îeÄÚ\u0010mþîÞfý\b\\k5jÓ÷\u0098Ë!\u0018\u009dÙJ\u0011å\u0096\u001eX\"ÉÒ\u008eOÉ\u0013Dö?f\u008b¯¤ú¼";
      int var17 = "\"øh\u0012\\:\u0017\"¨>{rûu ´ ¿\u001bùlØ\u0018ÜØ\u000e\u0097S#ú\u0099o¡e\u0096;[Rx\u0006²\"\u0086\u0017\u0003°6Ïà ³#\u009c\u008cÙ';_\u008a=§Ü¸Ã?\u000eÔBË äSÖ¹\f\u009c*\u0015m8\u0093\u0018 ppÝäKÖ\u0012í£\u0099º\u0006Ïjp:Ü»·\u0096»×b±ú\u009eïþ\u0083iä)\u0010\rº4¤L\u001f\u0014Fq \f÷\u0086W:\u0081\u0018ÈW\u0091ºØ\u009e\u0001ã\u000e×,å\u009d|6\u009a\u0087å<,îeÄÚ\u0010mþîÞfý\b\\k5jÓ÷\u0098Ë!\u0018\u009dÙJ\u0011å\u0096\u001eX\"ÉÒ\u008eOÉ\u0013Dö?f\u008b¯¤ú¼".length();
      char var14 = 16;
      int var13 = -1;

      label47:
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
                  d = var18;
                  e = new String[10];
                  Cipher var1;
                  var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var2 = 1; var2 < 8; ++var2) {
                     var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var0 = new long[2];
                  int var4 = 0;
                  String var5 = "ú\u000e\r=ÒÈÉ\u0000\rË\u007f\u009f\u001e\u009c\u0080Û";
                  int var6 = "ú\u000e\r=ÒÈÉ\u0000\rË\u007f\u009f\u001e\u009c\u0080Û".length();
                  int var3 = 0;

                  do {
                     int var30 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var30, var3).getBytes("ISO-8859-1");
                     var30 = var4++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var34 = true;
                     var0[var30] = var10004;
                  } while(var3 < var6);

                  KProperty[] var26 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yn.class, true.g<invokedynamic>(30709, 3190983853911069348L ^ var20), true.g<invokedynamic>(7805, 701736651146804005L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yn.class, true.g<invokedynamic>(24062, 953115623987181742L ^ var20), true.g<invokedynamic>(30151, 6495287546221908121L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yn.class, true.g<invokedynamic>(26731, 8299111800086777140L ^ var20), true.g<invokedynamic>(16060, 4299554283545926624L ^ var20), 0)))};
                  r = var26;
                  y = new yn(var24);
                  W = qi.R((il)y, true.g<invokedynamic>(21054, 4097163277159200611L ^ var20), true, (pj)null, (Function0)null, (int)var0[1], var22, (Object)null);
                  c = qi.R((il)y, true.g<invokedynamic>(17701, 2050262379401076862L ^ var20), true, (pj)null, (Function0)null, (int)var0[0], var22, (Object)null);
                  m = qi.R((il)y, true.g<invokedynamic>(24345, 2373167700271888960L ^ var20), true, (pj)null, (Function0)null, (int)var0[0], var22, (Object)null);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var32;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label47;
               }

               var15 = "8 ùZ\u0081ß|ZW¼m\u0005zTl©\u0018`;\u0014\u008b'é§ïs©=èlêµ^3ülý2.9º";
               var17 = "8 ùZ\u0081ß|ZW¼m\u0005zTl©\u0018`;\u0014\u008b'é§ïs©=èlêµ^3ülý2.9º".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var27 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 699;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/yn", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/yn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
