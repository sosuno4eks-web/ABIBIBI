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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1306;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionfc;
import su.catlean.api.event.events.render.EquipArmEvent;
import su.catlean.api.event.events.render.SwingArmEvent;
import su.catlean.api.event.events.render.SwingDurationEvent;
import su.catlean.gofra.Flow;

public final class lm extends k9 {
   @NotNull
   public static final lm L;
   static final KProperty[] T;
   @NotNull
   private static final zr W;
   @NotNull
   private static final z0 q;
   private static float c;
   private static final long b = j0.a(-315649115872835855L, 1297011129744490556L, MethodHandles.lookup().lookupClass()).a(29154550466270L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map k;

   private lm(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 76941297693201L;
      super(var3, true.o<invokedynamic>(8942, 3301198325144540639L ^ var1), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final dy s(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 74680602641313L;
      int var3 = (int)((var1 ^ 74680602641313L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (dy)W.k((short)var3, this, T[0], (short)var4, var5);
   }

   private final void n(long var1, dy var3) {
      var1 ^= b;
      long var10001 = var1 ^ 97610332535336L;
      int var4 = (int)((var1 ^ 97610332535336L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      W.P(this, var4, T[0], (short)var5, var3, (short)var6);
   }

   private final int V(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 128531121554024L;
      int var3 = (int)((var1 ^ 128531121554024L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)q.k((short)var3, this, T[1], (short)var4, var5)).intValue();
   }

   private final void T(long var1, int var3) {
      var1 ^= b;
      long var10001 = var1 ^ 91828016697495L;
      int var4 = (int)((var1 ^ 91828016697495L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      q.P(this, var4, T[1], (short)var5, var3, (short)var6);
   }

   @Flow
   private final void v(SwingDurationEvent var1) {
      long var2 = b ^ 19411055721133L;
      long var4 = var2 ^ 96424900790808L;
      var1.setValue(this.V(var4));
      var1.cancel();
   }

   @Flow
   private final void D(EquipArmEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void p(SwingArmEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void C(class_4587 var1, class_1306 var2, long var3, float var5) {
      var3 ^= b;

      byte var10000;
      label17: {
         try {
            if (var2 == class_1306.field_6183) {
               var10000 = 1;
               break label17;
            }
         } catch (NumberFormatException var9) {
            throw var9.A<invokedynamic>(var9, 370090453605797600L, var3);
         }

         var10000 = -1;
      }

      byte var6 = var10000;
      float var7 = (float)Math.sin((double)(var5 * var5 * 3.1415927F));
      var1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)var6 * (45.0F + var7 * -20.0F)));
      float var8 = (float)Math.sin((double)(class_3532.method_15355(var5) * 3.1415927F));
      var1.method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees((float)var6 * var8 * -20.0F));
      var1.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(var8 * -80.0F));
      var1.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees((float)var6 * -45.0F));
   }

   private final void Y(long var1, class_4587 var3, class_1306 var4, float var5) {
      var1 ^= b;

      class_4587 var10000;
      byte var10001;
      label17: {
         try {
            var10000 = var3;
            if (var4 == class_1306.field_6183) {
               var10001 = 1;
               break label17;
            }
         } catch (NumberFormatException var6) {
            throw var6.A<invokedynamic>(var6, 7804685394680522637L, var1);
         }

         var10001 = -1;
      }

      var10000.method_46416((float)var10001 * 0.56F, -0.52F + var5 * -0.6F, -0.72F);
   }

   static {
      long var20 = b ^ 16510354854461L;
      long var22 = var20 ^ 128660025016982L;
      long var24 = var20 ^ 105870471121827L;
      long var26 = var20 ^ 30932344945488L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[7];
      int var16 = 0;
      String var15 = "\u0083î\u000fÊn¡ý\u0098\u000fàÏ3Øýc](²Õ\u0015Ù\u0094½A\u0086§L\u0012ó\u0092\bÜjd\u0088U1ÂÌî\tº÷0èïÚ\u0087Ô¸ªþk¢\nm\u00958P\u00adÿ$\u009fFØ\u0083¾\u0003ø\u0097\u0005¸Ö ª(ðr  ±Ñ\u0093½\u008aàõÙ!O éÀch\u008a\u001e&\u0007\u008a±\u001dJ«ÐBAe\u001a.\u0085zKÞ\u0010±=Ú-ÃÂÍø.&^j¿\u0013ñS\u0010¼þÂh\u0083y¬Vôçì¿ÿÞ\u0094í";
      int var17 = "\u0083î\u000fÊn¡ý\u0098\u000fàÏ3Øýc](²Õ\u0015Ù\u0094½A\u0086§L\u0012ó\u0092\bÜjd\u0088U1ÂÌî\tº÷0èïÚ\u0087Ô¸ªþk¢\nm\u00958P\u00adÿ$\u009fFØ\u0083¾\u0003ø\u0097\u0005¸Ö ª(ðr  ±Ñ\u0093½\u008aàõÙ!O éÀch\u008a\u001e&\u0007\u008a±\u001dJ«ÐBAe\u001a.\u0085zKÞ\u0010±=Ú-ÃÂÍø.&^j¿\u0013ñS\u0010¼þÂh\u0083y¬Vôçì¿ÿÞ\u0094í".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var29 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
            String var35 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var35;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  e = new String[7];
                  k = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "A\u0089\u000e\u0092»±H}X\u0080\rËÖZ¥¢\u0090É½M\u0012ë\u0004ß";
                  int var5 = "A\u0089\u000e\u0092»±H}X\u0080\rËÖZ¥¢\u0090É½M\u0012ë\u0004ß".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var33 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                     long[] var32 = var6;
                     var33 = var3++;
                     long var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var38 = -1;

                     while(true) {
                        long var8 = var37;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var40 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var38) {
                        case 0:
                           var32[var33] = var40;
                           if (var2 >= var5) {
                              g = var6;
                              i = new Integer[5];
                              KProperty[] var28 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(lm.class, true.o<invokedynamic>(21765, 4408188740208797613L ^ var20), true.o<invokedynamic>(1666, 8048227416130122797L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(lm.class, true.o<invokedynamic>(13456, 8187350819126658622L ^ var20), true.o<invokedynamic>(16957, 4413602532711739542L ^ var20), 0)))};
                              T = var28;
                              L = new lm(var26);
                              W = qi.M((il)L, true.o<invokedynamic>(29279, 4128295315948536054L ^ var20), (Enum)dy.Default, (pj)null, (Function0)null, true.y<invokedynamic>(23527, 6270903811400392163L ^ var20), (Object)null, var24);
                              q = qi.o((il)L, true.o<invokedynamic>(16713, 7832748807757968356L ^ var20), true.y<invokedynamic>(14052, 8504660540539941089L ^ var20), new IntRange(0, true.y<invokedynamic>(16517, 4741158702049052290L ^ var20)), var22, (pj)null, (Function0)null, true.y<invokedynamic>(13898, 5890075202773626955L ^ var20), (Object)null);
                              return;
                           }
                           break;
                        default:
                           var32[var33] = var40;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = ":ë¸e0VÊM¼ùäOGÚ³\u0083";
                           var5 = ":ë¸e0VÊM¼ùäOGÚ³\u0083".length();
                           var2 = 0;
                        }

                        var33 = var2;
                        var2 += 8;
                        var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                        var32 = var6;
                        var33 = var3++;
                        var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var38 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var35;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "s#Ï§#û\u0083p\u0097;íÓ\fñ\u008aÁ MëÐ\bôC\u0007\u0092ç¿\u008eb\u0095à(Ó#õ}´O\u0010\u0016Â¬\u0006\u0082ª8\u0092Yt";
               var17 = "s#Ï§#û\u0083p\u0097;íÓ\fñ\u008aÁ MëÐ\bôC\u0007\u0092ç¿\u008eb\u0095à(Ó#õ}´O\u0010\u0016Â¬\u0006\u0082ª8\u0092Yt".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var29 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24157;
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
            throw new RuntimeException("su/catlean/lm", var10);
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
         throw new RuntimeException("su/catlean/lm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10997;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/lm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
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
         throw new RuntimeException("su/catlean/lm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
