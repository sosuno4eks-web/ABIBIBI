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
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_5498;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.render.CameraOffsetEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class lc extends k9 {
   @NotNull
   public static final lc b;
   // $FF: synthetic field
   static final KProperty[] L;
   @NotNull
   private static final zc K;
   @NotNull
   private static aa c;
   @NotNull
   private static class_5498 Y;
   private static final long d = j0.a(-9205541688730194748L, 4757827217016429599L, MethodHandles.lookup().lookupClass()).a(153672625633326L);
   private static final String[] e;
   private static final String[] f;
   private static final Map g;

   private lc(long var1) {
      var1 ^= d;
      long var3 = var1 ^ 132760930011161L;
      super(var3, true.g<invokedynamic>(28180, 1830463462698431546L ^ var1), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final float f(byte var1, long var2) {
      long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ d;
      long var10001 = var4 ^ 90115630346925L;
      int var6 = (int)((var4 ^ 90115630346925L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)K.k((short)var6, this, L[0], (short)var7, var8)).floatValue();
   }

   private final void P(int var1, int var2, float var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 32 >>> 32) ^ d;
      long var10001 = var4 ^ 6157896251572L;
      int var6 = (int)((var4 ^ 6157896251572L) >>> 32);
      int var7 = (int)(var10001 << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      K.P(this, var6, L[0], (short)var7, var3, (short)var8);
   }

   @Flow
   private final void T(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void g(CameraOffsetEvent var1) {
      long var2 = d ^ 51576483197839L;
      long var10001 = var2 ^ 85680686494719L;
      int var4 = (int)((var2 ^ 85680686494719L) >>> 56);
      long var5 = var10001 << 8 >>> 8;
      var1.setOffset(1.0F + (this.f((byte)var4, var5) - 1.0F) * c.a());
      var1.cancel();
   }

   static {
      long var23 = d ^ 68150231019890L;
      long var25 = var23 ^ 21552386171415L;
      long var27 = var23 ^ 16734756466316L;
      long var10001 = var23 ^ 76959082831517L;
      int var29 = (int)((var23 ^ 76959082831517L) >>> 48);
      int var30 = (int)(var10001 << 16 >>> 48);
      int var31 = (int)(var10001 << 32 >>> 32);
      g = new HashMap(13);
      Cipher var14;
      Cipher var10000 = var14 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var23 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var15 = 1; var15 < 8; ++var15) {
         var10003[var15] = (byte)((int)(var23 << var15 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var21 = new String[5];
      int var19 = 0;
      String var18 = "î5oÎdøêSû}½`õ&\u0016ø\u0014¼\u001d_3=\n\u0012\u009då!\u0014ã\u0095«\u000f\u0018^\u00077*óÀ\u0089VdæR¦z\u0005_C¯\u0014ñí1oC= ®bû¥\\kVqNn¦æs\u0096g\u000b\u0090Y\u009eêî+\u0090dfN-(u··Á";
      int var20 = "î5oÎdøêSû}½`õ&\u0016ø\u0014¼\u001d_3=\n\u0012\u009då!\u0014ã\u0095«\u000f\u0018^\u00077*óÀ\u0089VdæR¦z\u0005_C¯\u0014ñí1oC= ®bû¥\\kVqNn¦æs\u0096g\u000b\u0090Y\u009eêî+\u0090dfN-(u··Á".length();
      char var17 = ' ';
      int var16 = -1;

      label49:
      while(true) {
         ++var16;
         String var33 = var18.substring(var16, var16 + var17);
         byte var35 = -1;

         while(true) {
            byte[] var22 = var14.doFinal(var33.getBytes("ISO-8859-1"));
            String var39 = b(var22).intern();
            switch(var35) {
            case 0:
               var21[var19++] = var39;
               if ((var16 += var17) >= var20) {
                  e = var21;
                  f = new String[5];
                  Cipher var9;
                  var10000 = var9 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var23 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var10 = 1; var10 < 8; ++var10) {
                     var10003[var10] = (byte)((int)(var23 << var10 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var11 = -5538179853154589650L;
                  byte[] var13 = var9.doFinal(new byte[]{(byte)((int)(var11 >>> 56)), (byte)((int)(var11 >>> 48)), (byte)((int)(var11 >>> 40)), (byte)((int)(var11 >>> 32)), (byte)((int)(var11 >>> 24)), (byte)((int)(var11 >>> 16)), (byte)((int)(var11 >>> 8)), (byte)((int)var11)});
                  long var41 = ((long)var13[0] & 255L) << 56 | ((long)var13[1] & 255L) << 48 | ((long)var13[2] & 255L) << 40 | ((long)var13[3] & 255L) << 32 | ((long)var13[4] & 255L) << 24 | ((long)var13[5] & 255L) << 16 | ((long)var13[6] & 255L) << 8 | (long)var13[7] & 255L;
                  boolean var38 = true;
                  long var7 = var41;
                  Cipher var2;
                  var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var23 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var3 = 1; var3 < 8; ++var3) {
                     var10003[var3] = (byte)((int)(var23 << var3 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var4 = 8103265642977884618L;
                  byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                  var41 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                  var38 = true;
                  long var0 = var41;
                  KProperty[] var32 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(lc.class, true.g<invokedynamic>(5432, 6177621725216763467L ^ var23), true.g<invokedynamic>(10502, 2775866982339269236L ^ var23), 0)))};
                  L = var32;
                  b = new lc(var25);
                  K = qi.g((il)b, true.g<invokedynamic>(17080, 5935503505631197646L ^ var23), 3.0F, RangesKt.rangeTo(1.0F, 20.0F), (pj)null, (Function0)null, (int)var7, var27, (Object)null);
                  c = new aa(sa.OUT_QUINT, var0, (short)var29, (short)var30, var31);
                  Y = class_5498.field_26664;
                  return;
               }

               var17 = var18.charAt(var16);
               break;
            default:
               var21[var19++] = var39;
               if ((var16 += var17) < var20) {
                  var17 = var18.charAt(var16);
                  continue label49;
               }

               var18 = "\rÅ÷ yZ\u0098*\u0095EÅ\u0099x¶\u001a<?\u0097Úã\u0005\u0089c\u0081Æ?\u00adÕ+ø\u0018RW\u009d\u0005<Ù\u0004ó\u001c 0>\u008fu:òÄ\u0092~Ïë\u008ec°ýÜÜLóa\f0,OÌ½\u0081A4v\"½";
               var20 = "\rÅ÷ yZ\u0098*\u0095EÅ\u0099x¶\u001a<?\u0097Úã\u0005\u0089c\u0081Æ?\u00adÕ+ø\u0018RW\u009d\u0005<Ù\u0004ó\u001c 0>\u008fu:òÄ\u0092~Ïë\u008ec°ýÜÜLóa\f0,OÌ½\u0081A4v\"½".length();
               var17 = '(';
               var16 = -1;
            }

            ++var16;
            var33 = var18.substring(var16, var16 + var17);
            var35 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2377;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/lc", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         f[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
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
         throw new RuntimeException("su/catlean/lc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
