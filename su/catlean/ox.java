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
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.TridentUseEvent;
import su.catlean.api.event.events.player.TridentWeatherEvent;
import su.catlean.gofra.Flow;

public final class ox extends k9 {
   @NotNull
   public static final ox I;
   static final KProperty[] N;
   @NotNull
   private static final zr K;
   @NotNull
   private static final zc w;
   @NotNull
   private static final z0 L;
   @NotNull
   private static final zo k;
   private static final long b = j0.a(-8291282183587499105L, 4512401975219351156L, MethodHandles.lookup().lookupClass()).a(170444308358129L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private ox(byte var1, int var2, int var3) {
      long var4 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var3 << 40 >>> 40) ^ b;
      long var6 = var4 ^ 112276767373610L;
      super(var6, true.y<invokedynamic>(26974, 1444434131595195377L ^ var4), pa.c(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final cm b(char var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 42601784059485L;
      int var6 = (int)((var4 ^ 42601784059485L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (cm)K.k((short)var6, this, N[0], (short)var7, var8);
   }

   private final float V(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 59827521837086L;
      int var3 = (int)((var1 ^ 59827521837086L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)w.k((short)var3, this, N[1], (short)var4, var5)).floatValue();
   }

   public final int w(int var1, int var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 108174303028509L;
      int var6 = (int)((var4 ^ 108174303028509L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      String var9 = 1642638857217606587L.A<invokedynamic>(1642638857217606587L, var4);

      try {
         int var10000 = ((Number)L.k((short)var6, this, N[2], (short)var7, var8)).intValue();
         if (1591926394485609341L.A<invokedynamic>(1591926394485609341L, var4) == null) {
            "Cw4yrc".A<invokedynamic>("Cw4yrc", 1642064383963968397L, var4);
         }

         return var10000;
      } catch (NumberFormatException var10) {
         throw var10.A<invokedynamic>(var10, 1634003524440487213L, var4);
      }
   }

   private final boolean R(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 40298106318075L;
      int var3 = (int)((var1 ^ 40298106318075L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)k.k((short)var3, this, N[3], (short)var4, var5);
   }

   @Flow
   public final void q(@NotNull TridentUseEvent e) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void H(@NotNull TridentWeatherEvent e) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 87908376714666L;
      long var22 = var20 ^ 12034371315864L;
      long var24 = var20 ^ 34891855634861L;
      long var26 = var20 ^ 133637707586121L;
      long var28 = var20 ^ 50066926528094L;
      long var10001 = var20 ^ 139848753872892L;
      int var30 = (int)((var20 ^ 139848753872892L) >>> 56);
      int var31 = (int)(var10001 << 8 >>> 32);
      int var32 = (int)(var10001 << 40 >>> 40);
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[13];
      int var16 = 0;
      String var15 = "®¼kKE\bÖÆpõ*gdK#q\u000e²ürv\u0088\u0093\u0098 èý\u007f¡_\u0011 «\"¥=ÄÏ¬X©6\u0090yååò¼^qäè§$/&\u0001(çì\u008aÓ\u009e\u00033M\u009dG<&ds\u001dI\u0018\u008d!\u0017\n¸Ä\fª\\\u0019;ë\u009dî<90ÿ\u001d\u001e®rì\u0010³4\u0093\u0000\u0087\f Ç\u0019*ó©\u0004\u0084Ö\u000b\u0010u&\u0081I\u0004XgÔ@°äi\u001cÄÀ\u001a\u0010d\u0095¾è\\²Z¶àÂÚØø6O2\u0018\u008a¶\u008c\"²n\u0093$Üs\u0017\u009eÁ\u009a\\e<\u001a08FP-\u00990èbµ¼L\u007f\u0093t,`\u0098VG ßEãØ\u0003xV$ü\u0015\u009c÷Á)»Vö=\u00902\u0098Ú[\u0010ME°%K´K\u0080X\r\u0010 (Ðô\u001f¹n\u0087ÃL^$Ç%&\u0011\u0010«\u008a¬\u0012\u0007à¯c2.\u009d!È¦\u0004j0º\u0018]\u0095¤\tÈªÁ\u0099ZeC\u009cöhÀ\u0081¥Pî\u008bö)%\u0019`\u0084?¯µ·'Ìq(e-\u0099Ç>Ô\r\u00828\u0001X\b";
      int var17 = "®¼kKE\bÖÆpõ*gdK#q\u000e²ürv\u0088\u0093\u0098 èý\u007f¡_\u0011 «\"¥=ÄÏ¬X©6\u0090yååò¼^qäè§$/&\u0001(çì\u008aÓ\u009e\u00033M\u009dG<&ds\u001dI\u0018\u008d!\u0017\n¸Ä\fª\\\u0019;ë\u009dî<90ÿ\u001d\u001e®rì\u0010³4\u0093\u0000\u0087\f Ç\u0019*ó©\u0004\u0084Ö\u000b\u0010u&\u0081I\u0004XgÔ@°äi\u001cÄÀ\u001a\u0010d\u0095¾è\\²Z¶àÂÚØø6O2\u0018\u008a¶\u008c\"²n\u0093$Üs\u0017\u009eÁ\u009a\\e<\u001a08FP-\u00990èbµ¼L\u007f\u0093t,`\u0098VG ßEãØ\u0003xV$ü\u0015\u009c÷Á)»Vö=\u00902\u0098Ú[\u0010ME°%K´K\u0080X\r\u0010 (Ðô\u001f¹n\u0087ÃL^$Ç%&\u0011\u0010«\u008a¬\u0012\u0007à¯c2.\u009d!È¦\u0004j0º\u0018]\u0095¤\tÈªÁ\u0099ZeC\u009cöhÀ\u0081¥Pî\u008bö)%\u0019`\u0084?¯µ·'Ìq(e-\u0099Ç>Ô\r\u00828\u0001X\b".length();
      char var14 = 24;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var34 = var15.substring(var13, var13 + var14);
         byte var36 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var34.getBytes("ISO-8859-1"));
            String var41 = b(var19).intern();
            switch(var36) {
            case 0:
               var18[var16++] = var41;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[13];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[7];
                  int var3 = 0;
                  String var4 = ">\u0011ò>Ög9è§Êcò(õ{(È¿\u008a\u0014C\u0093Ã¼xú>\u001bpo«ª\u0014{\u0018]3¼\u008e\u0005";
                  int var5 = ">\u0011ò>Ög9è§Êcò(õ{(È¿\u008a\u0014C\u0093Ã¼xú>\u001bpo«ª\u0014{\u0018]3¼\u008e\u0005".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var40 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var40, var2).getBytes("ISO-8859-1");
                     long[] var37 = var6;
                     var40 = var3++;
                     long var43 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var44 = -1;

                     while(true) {
                        long var8 = var43;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var46 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var44) {
                        case 0:
                           var37[var40] = var46;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[7];
                              KProperty[] var33 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ox.class, true.y<invokedynamic>(17092, 7381035508260175050L ^ var20), true.y<invokedynamic>(11199, 3551574267603293619L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ox.class, true.y<invokedynamic>(11545, 11302463872832283L ^ var20), true.y<invokedynamic>(26222, 9195733668651554916L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ox.class, true.y<invokedynamic>(25004, 964906082927075244L ^ var20), true.y<invokedynamic>(16660, 8016223784649654037L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ox.class, true.y<invokedynamic>(1949, 8384541235241597328L ^ var20), true.y<invokedynamic>(4469, 1203374153944641393L ^ var20), 0)))};
                              N = var33;
                              I = new ox((byte)var30, var31, var32);
                              K = qi.M((il)I, true.y<invokedynamic>(10296, 742432866627982909L ^ var20), (Enum)cm.Motion, (pj)null, (Function0)null, true.x<invokedynamic>(22855, 3592589116318011331L ^ var20), (Object)null, var24);
                              w = qi.g((il)I, true.y<invokedynamic>(6542, 5637507341551478657L ^ var20), 1.0F, RangesKt.rangeTo(0.1F, 20.0F), (pj)null, (Function0)null, true.x<invokedynamic>(15606, 81067256852720244L ^ var20), var26, (Object)null);
                              L = qi.o((il)I, true.y<invokedynamic>(16601, 129962540668354266L ^ var20), true.x<invokedynamic>(7949, 4381024798196730250L ^ var20), new IntRange(0, true.x<invokedynamic>(12017, 5382365189367674999L ^ var20)), var22, (pj)null, (Function0)null, true.x<invokedynamic>(29981, 381390268629967774L ^ var20), (Object)null);
                              k = qi.R((il)I, true.y<invokedynamic>(8599, 5304359081665339281L ^ var20), true, (pj)null, (Function0)null, true.x<invokedynamic>(4802, 2031624221535208519L ^ var20), var28, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var37[var40] = var46;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0099´BB\u0005qÀ\u009d\u000eïf@wýeø";
                           var5 = "\u0099´BB\u0005qÀ\u009d\u000eïf@wýeø".length();
                           var2 = 0;
                        }

                        var40 = var2;
                        var2 += 8;
                        var7 = var4.substring(var40, var2).getBytes("ISO-8859-1");
                        var37 = var6;
                        var40 = var3++;
                        var43 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var44 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var41;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "¢-B[C¼8¼¯\u0095u]ØÉ\fØ£\u0080²²XN\u0002\u0099\u007f\u008eÅ\u001bì\u0010ð/ \u0003,h¤\u008fss\u0012\u0082ø\u0000lgÚ÷\u0089¥H\u0091Ñ\u0094¼é\u0000qô\u008b¢5*%¤";
               var17 = "¢-B[C¼8¼¯\u0095u]ØÉ\fØ£\u0080²²XN\u0002\u0099\u007f\u008eÅ\u001bì\u0010ð/ \u0003,h¤\u008fss\u0012\u0082ø\u0000lgÚ÷\u0089¥H\u0091Ñ\u0094¼é\u0000qô\u008b¢5*%¤".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var34 = var15.substring(var13, var13 + var14);
            var36 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30968;
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
            throw new RuntimeException("su/catlean/ox", var10);
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
         throw new RuntimeException("su/catlean/ox" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20601;
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
            throw new RuntimeException("su/catlean/ox", var14);
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
         throw new RuntimeException("su/catlean/ox" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
