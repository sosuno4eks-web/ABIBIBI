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
import net.minecraft.class_1799;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_2378;
import net.minecraft.class_6880;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class yj extends k9 {
   @NotNull
   public static final yj g;
   static final KProperty[] u;
   @NotNull
   private static final zr B;
   @NotNull
   private static final zo z;
   @NotNull
   private static final zo T;
   @NotNull
   private static final zo C;
   private static final long b = j0.a(5195353513213493273L, 6367053079179792620L, MethodHandles.lookup().lookupClass()).a(114980113845293L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] i;
   private static final Map k;

   private yj(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 111055726597793L;
      super(var3, true.y<invokedynamic>(9999, 1004669399032477594L ^ var1), pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final ee M(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 116724855703890L;
      int var3 = (int)((var1 ^ 116724855703890L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (ee)B.k((short)var3, this, u[0], (short)var4, var5);
   }

   private final boolean I(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 58262888985258L;
      int var3 = (int)((var1 ^ 58262888985258L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)z.k((short)var3, this, u[1], (short)var4, var5);
   }

   private final boolean h(char var1, char var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
      long var10001 = var4 ^ 29298624565388L;
      int var6 = (int)((var4 ^ 29298624565388L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)T.k((short)var6, this, u[2], (short)var7, var8);
   }

   private final boolean V(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 12067394297329L;
      int var3 = (int)((var1 ^ 12067394297329L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)C.k((short)var3, this, u[3], (short)var4, var5);
   }

   @Flow
   private final void U(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final float u(long var1, class_1799 var3) {
      var1 ^= b;
      long var10001 = var1 ^ 44084662557022L;
      int var4 = (int)((var1 ^ 44084662557022L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      return (float)class_1890.method_8225((class_6880)((class_2378)s8.i((char)var4, var5, (short)var6).method_30349().method_46759(class_1893.field_9098.method_58273()).get()).method_10223(class_1893.field_9098.method_29177()).get(), var3);
   }

   static {
      long var20 = b ^ 68957635825856L;
      long var22 = var20 ^ 48829161513670L;
      long var24 = var20 ^ 33372250596661L;
      long var26 = var20 ^ 14748755041565L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[15];
      int var16 = 0;
      String var15 = "\u0019@}\u009c,\u0097\u0091Å\u0091Ôj\u008c\u009e+\u0098íX¨p\u0092^²\u009f\\8\u009fkæ\u007f\u0099`\u0013Å¸~»}\u00ad\u0081\u001bY\u008f\u0094?W\u008bc\u0002=£³¨Y\u0088¨ £qIæÊ²Ë´\u0014¯Æë\u00995\u001c\u0094\u0091§ø\u008féë°ÿÇ G\u0000\u0095|\u0080Üat\u0092\u0016%\u0016\"m=¤wV\u0019¨¥\"!\b\u0099ÿ%\u0099Ë\u0002\u0080r\u0010\u0001\u008ahÇ\u0088Í\u0097\\\"`}\u0000ÐG\u009f\u008b\u0010.\u0088Þ\u0095\u0017þà\u000e\u0004\u0094ºÂ=Øb\u007f\u0010âóÒò~2¿\u0019²;7\u000f\u0094Ê\u0092I\u0088JK\u0099DÈ\u000fà¹ð\u0092\tkîÞNÎ]I&\u008fAÄQáÉ\u001f;X\u00126{5i\rÏE\u0011\u001dÁ9\u0082u\u0093\u0003\u0091Gê\u0081>é\u00120Ròr\u0094Åò\u0002Ñ¹îó\u0018\u0090\u0093\u0007¿\u0080\u0015\u0001\u009eWáhÄIdDDÃ\u008ebÉA·|d²\u00023_ÕÄ{æguz¯#kªî9\u0098àhÍÞ:ÄÔ\u0091¯å\u0017I\"\u0085káF\n \u001aÀ\u008eS°¹¨Ch\u009eá\u0010\u0083d\u001eXpG'økD\u00845þË\u009aª\u0010-\u0004nÚÕ\rÜ°HçCQ\f ÌÁ\u0018YWaY\u001dE\u0085Ð@©\u0095'Ãýæh¥¼BrèE\u0015¸\u0010Ë\u0090zAK\u00adEo\u00059Méì\u0094\u0083\u0087\u0018É³\u0017èdÏ\u0098aIÝ \u0082ä'ºè\u0016ã¢Ý=f\u000e\u0007 \u001cçM\u001fß6\u0092ÕNÓ¿d\u0082Kö)\fç\u0004¢\u0080ªÇÓ\u0001¥\u0081\u001b\u0091\u0087\u0007u";
      int var17 = "\u0019@}\u009c,\u0097\u0091Å\u0091Ôj\u008c\u009e+\u0098íX¨p\u0092^²\u009f\\8\u009fkæ\u007f\u0099`\u0013Å¸~»}\u00ad\u0081\u001bY\u008f\u0094?W\u008bc\u0002=£³¨Y\u0088¨ £qIæÊ²Ë´\u0014¯Æë\u00995\u001c\u0094\u0091§ø\u008féë°ÿÇ G\u0000\u0095|\u0080Üat\u0092\u0016%\u0016\"m=¤wV\u0019¨¥\"!\b\u0099ÿ%\u0099Ë\u0002\u0080r\u0010\u0001\u008ahÇ\u0088Í\u0097\\\"`}\u0000ÐG\u009f\u008b\u0010.\u0088Þ\u0095\u0017þà\u000e\u0004\u0094ºÂ=Øb\u007f\u0010âóÒò~2¿\u0019²;7\u000f\u0094Ê\u0092I\u0088JK\u0099DÈ\u000fà¹ð\u0092\tkîÞNÎ]I&\u008fAÄQáÉ\u001f;X\u00126{5i\rÏE\u0011\u001dÁ9\u0082u\u0093\u0003\u0091Gê\u0081>é\u00120Ròr\u0094Åò\u0002Ñ¹îó\u0018\u0090\u0093\u0007¿\u0080\u0015\u0001\u009eWáhÄIdDDÃ\u008ebÉA·|d²\u00023_ÕÄ{æguz¯#kªî9\u0098àhÍÞ:ÄÔ\u0091¯å\u0017I\"\u0085káF\n \u001aÀ\u008eS°¹¨Ch\u009eá\u0010\u0083d\u001eXpG'økD\u00845þË\u009aª\u0010-\u0004nÚÕ\rÜ°HçCQ\f ÌÁ\u0018YWaY\u001dE\u0085Ð@©\u0095'Ãýæh¥¼BrèE\u0015¸\u0010Ë\u0090zAK\u00adEo\u00059Méì\u0094\u0083\u0087\u0018É³\u0017èdÏ\u0098aIÝ \u0082ä'ºè\u0016ã¢Ý=f\u000e\u0007 \u001cçM\u001fß6\u0092ÕNÓ¿d\u0082Kö)\fç\u0004¢\u0080ªÇÓ\u0001¥\u0081\u001b\u0091\u0087\u0007u".length();
      char var14 = 24;
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
                  c = var18;
                  d = new String[15];
                  k = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[6];
                  int var3 = 0;
                  String var4 = "\u000bg«\u0084A\u0081\u0010;=É¹³V×ÝØ\u001d\u001f\u0095Î]9T\u0010¤ózEEÕªñ";
                  int var5 = "\u000bg«\u0084A\u0081\u0010;=É¹³V×ÝØ\u001d\u001f\u0095Î]9T\u0010¤ózEEÕªñ".length();
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
                              f = var6;
                              i = new Integer[6];
                              KProperty[] var28 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yj.class, true.y<invokedynamic>(12338, 3443189916826740963L ^ var20), true.y<invokedynamic>(23477, 2393345846507258720L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yj.class, true.y<invokedynamic>(17753, 3370192692783930762L ^ var20), true.y<invokedynamic>(4075, 4298873944037037875L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yj.class, true.y<invokedynamic>(25035, 1631639322533853469L ^ var20), true.y<invokedynamic>(16697, 3179896325566716384L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yj.class, true.y<invokedynamic>(18139, 7165654180955512332L ^ var20), true.y<invokedynamic>(28348, 1184844190785566307L ^ var20), 0)))};
                              u = var28;
                              g = new yj(var26);
                              B = qi.M((il)g, true.y<invokedynamic>(20777, 1142324390064212469L ^ var20), (Enum)ee.Legit, (pj)null, (Function0)null, true.p<invokedynamic>(14504, 2660614508396158565L ^ var20), (Object)null, var22);
                              z = qi.R((il)g, true.y<invokedynamic>(24039, 7494153512195278137L ^ var20), true, (pj)null, (Function0)null, true.p<invokedynamic>(990, 156193724121818384L ^ var20), var24, (Object)null);
                              T = qi.R((il)g, true.y<invokedynamic>(1771, 1267987654716890673L ^ var20), true, (pj)null, (Function0)null, true.p<invokedynamic>(990, 156193724121818384L ^ var20), var24, (Object)null);
                              C = qi.R((il)g, true.y<invokedynamic>(8873, 1116219533949516409L ^ var20), true, (pj)null, (Function0)null, true.p<invokedynamic>(990, 156193724121818384L ^ var20), var24, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var32[var33] = var40;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "G\u001dLù>Sw¦UìÇ5\u000e5§\u0094";
                           var5 = "G\u001dLù>Sw¦UìÇ5\u000e5§\u0094".length();
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

               var15 = "ûíÏfþôÕ|N$îó\u0089\u0088ßY>×eÑoêEó\u009f·ª>¹¾¡j\u0018\u008b\u009bTý\u007f,\u008b\u008d|,p6\u0001À\\\u0003[GÆIrzÞÙ";
               var17 = "ûíÏfþôÕ|N$îó\u0089\u0088ßY>×eÑoêEó\u009f·ª>¹¾¡j\u0018\u008b\u009bTý\u007f,\u008b\u008d|,p6\u0001À\\\u0003[GÆIrzÞÙ".length();
               var14 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23873;
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
            throw new RuntimeException("su/catlean/yj", var10);
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
         throw new RuntimeException("su/catlean/yj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25432;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/yj", var14);
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
         throw new RuntimeException("su/catlean/yj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
