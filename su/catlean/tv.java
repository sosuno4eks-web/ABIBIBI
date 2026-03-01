package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
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
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.CalcBlockBreakingDeltaEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class tv extends k9 {
   @NotNull
   public static final tv o;
   // $FF: synthetic field
   static final KProperty[] N;
   @NotNull
   private static final zo y;
   @NotNull
   private static final zo K;
   @NotNull
   private static final zo C;
   @NotNull
   private static final zo U;
   private static int W;
   private static boolean i;
   private static long Y;
   @NotNull
   private static final List l;
   private static final long b = j0.a(1131295685194695614L, 8643887112355720017L, MethodHandles.lookup().lookupClass()).a(208624160081237L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map k;

   private tv(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 110490361820445L;
      super(var3, true.u<invokedynamic>(28746, 8710207355550444772L ^ var1), pa.b(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean h(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 127145578290685L;
      int var3 = (int)((var1 ^ 127145578290685L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)y.k((short)var3, this, N[0], (short)var4, var5);
   }

   private final boolean k(int var1, byte var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ b;
      long var10001 = var4 ^ 76471753618934L;
      int var6 = (int)((var4 ^ 76471753618934L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)K.k((short)var6, this, N[1], (short)var7, var8);
   }

   private final boolean S(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 14186399645631L;
      int var3 = (int)((var1 ^ 14186399645631L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)C.k((short)var3, this, N[2], (short)var4, var5);
   }

   private final boolean e(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 127385963920944L;
      int var3 = (int)((var1 ^ 127385963920944L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)U.k((short)var3, this, N[3], (short)var4, var5);
   }

   @Flow
   public final void W(@NotNull PlayerUpdateEvent e) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void B(@NotNull CalcBlockBreakingDeltaEvent event) {
      // $FF: Couldn't be decompiled
   }

   private final float r(class_2680 param1, long param2, class_1799 param4) {
      // $FF: Couldn't be decompiled
   }

   private final int b(char param1, int param2, class_2338 param3, char param4) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean V() {
      long var0 = b ^ 67333548729310L;
      long var2 = var0 ^ 136812398988542L;
      String var4 = 5263373798637361918L.A<invokedynamic>(5263373798637361918L, var0);

      boolean var10000;
      label32: {
         try {
            var10000 = o.h(var2);
            if (var4 == null) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (NumberFormatException var5) {
            throw var5.A<invokedynamic>(var5, 5313365264359870775L, var0);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   static {
      long var20 = b ^ 10910863687151L;
      long var22 = var20 ^ 13272382863017L;
      long var24 = var20 ^ 65207282701198L;
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
      String var15 = "sö\u0001\u0083\u0005Å¥\u0018K£ä]÷ýN \u0097Ýçx\u009f£\u0001m sî}%¯\\\u0002ûìý\u00856\u0019è\u00adÀ\u008b\u0084\u000f=¨6\\àÏìýûÔ\u007fÒm\u0018Â\u009c\u0019\u0084h\nÚücU²&¿\u0004¸\u00894J\u000f_\u008cðqé\u0018Á¡`D\u0082Ë¸Æ\u0005U\n\u0098³\u0093àfßï6?áYÄÔ(\u0002\u0000K\u0016Ö·\u0012á\u0090´ÂÝTEeä\u00940p·tË2?R,\u00137$\u0095]¢f×û\"1\u0014©\u0083(\u0080\u0087\u001dc\u008a\u0098}øOl4r1Ï!Åõ\u001e\u00814B\u0004ü\u0007ûÀ\u0083É\u000bê\u0095£µÎB3w\nÞ\u0087 ²Âä]\u0081nÕqUJ,Ìa3÷$û1v\u008b\u0017rF\\-±Ú®\u0018v\u0094ü\u0018[T \u0012vk.«\u008f\u001b3/\u0011CÁgD\u00892\u009b±\u001aõü j\u0007\u00010í~~¯øÔ\u000bc\u0088á¸¹\u0011¿\u0013¥Ìë\\õ\u0092W/ÊK¸(Ü(QàÅÜ¦[Ü!\u009aú\\h\u001fS\u0083×#\u0097#LàS§8=úeÒ\u0011\\ük´\u0089ë_\u008eÁ«\u0080 s¯\u0012²\u001c[\u0085ÁMcÃn\b$~ÒS¦ì\u008a\u0002``§×\u008b\u0004¬Ñ¼\u008eé\u0018æ\u0016Yä\u0010ÁÜ·\u0010ZÉR\u0001ã¾öMð_2ê\u0082\n?\u0018)xùíîP\"\n\u0087Ôê\u000fÅ+9ö\u0087sî1\u0092@ùíxÏä7\u0000\u0084*½À4\u0001 \u0011ËÏ®3#\u0000{êÃJe.K\u0092+\u0091ï¸i\u0014\u00ad\u0082\u0018\u0001®\u00ad¥í\bF\u001b\u008a³¹·ÕU(é&\u0019g0½F\u0014º\u0093Ê|Ü\u0095\u0001ö2SµPfdÜN\u008e\t¿/\u009a>\u0010\u000fJ;\b@\u001f¡\u001eüÌÝ¿Àve®Ý«á°\u00079\u0080\u008dà=\u001bÛ3ë§÷Öy©\bw.A ôÞZh\"\u0000ñÃ²\u0089ÆJ·\u0086°âÎ\u001f\u0087êO\u0099\u0005°{æ\fó\u0019&Ü¾ z<±\u0007Nß¬?B~¡\u009d003\u0003Õ\u0082îËA¿rG\u0083\u0089\u0085Þsutù ðÜ\u0093éG¼\u0096\\õn\u0096§æá#ðò\u0090X\u007fh~ø\u0000\u0015\u0015í\u009bûY\u009fn\u0010Ì1oú\u0017×ÓhÐü°ñ\u00971v>\u0010Æ\u0094²\u0097Ú\u0099\"[PF\u0096g¤ñ®;\u0018µÃ\u0091'\u0096¼tÛaæ\u0083{Fv®\u0005O¶GffR\u009du";
      int var17 = "sö\u0001\u0083\u0005Å¥\u0018K£ä]÷ýN \u0097Ýçx\u009f£\u0001m sî}%¯\\\u0002ûìý\u00856\u0019è\u00adÀ\u008b\u0084\u000f=¨6\\àÏìýûÔ\u007fÒm\u0018Â\u009c\u0019\u0084h\nÚücU²&¿\u0004¸\u00894J\u000f_\u008cðqé\u0018Á¡`D\u0082Ë¸Æ\u0005U\n\u0098³\u0093àfßï6?áYÄÔ(\u0002\u0000K\u0016Ö·\u0012á\u0090´ÂÝTEeä\u00940p·tË2?R,\u00137$\u0095]¢f×û\"1\u0014©\u0083(\u0080\u0087\u001dc\u008a\u0098}øOl4r1Ï!Åõ\u001e\u00814B\u0004ü\u0007ûÀ\u0083É\u000bê\u0095£µÎB3w\nÞ\u0087 ²Âä]\u0081nÕqUJ,Ìa3÷$û1v\u008b\u0017rF\\-±Ú®\u0018v\u0094ü\u0018[T \u0012vk.«\u008f\u001b3/\u0011CÁgD\u00892\u009b±\u001aõü j\u0007\u00010í~~¯øÔ\u000bc\u0088á¸¹\u0011¿\u0013¥Ìë\\õ\u0092W/ÊK¸(Ü(QàÅÜ¦[Ü!\u009aú\\h\u001fS\u0083×#\u0097#LàS§8=úeÒ\u0011\\ük´\u0089ë_\u008eÁ«\u0080 s¯\u0012²\u001c[\u0085ÁMcÃn\b$~ÒS¦ì\u008a\u0002``§×\u008b\u0004¬Ñ¼\u008eé\u0018æ\u0016Yä\u0010ÁÜ·\u0010ZÉR\u0001ã¾öMð_2ê\u0082\n?\u0018)xùíîP\"\n\u0087Ôê\u000fÅ+9ö\u0087sî1\u0092@ùíxÏä7\u0000\u0084*½À4\u0001 \u0011ËÏ®3#\u0000{êÃJe.K\u0092+\u0091ï¸i\u0014\u00ad\u0082\u0018\u0001®\u00ad¥í\bF\u001b\u008a³¹·ÕU(é&\u0019g0½F\u0014º\u0093Ê|Ü\u0095\u0001ö2SµPfdÜN\u008e\t¿/\u009a>\u0010\u000fJ;\b@\u001f¡\u001eüÌÝ¿Àve®Ý«á°\u00079\u0080\u008dà=\u001bÛ3ë§÷Öy©\bw.A ôÞZh\"\u0000ñÃ²\u0089ÆJ·\u0086°âÎ\u001f\u0087êO\u0099\u0005°{æ\fó\u0019&Ü¾ z<±\u0007Nß¬?B~¡\u009d003\u0003Õ\u0082îËA¿rG\u0083\u0089\u0085Þsutù ðÜ\u0093éG¼\u0096\\õn\u0096§æá#ðò\u0090X\u007fh~ø\u0000\u0015\u0015í\u009bûY\u009fn\u0010Ì1oú\u0017×ÓhÐü°ñ\u00971v>\u0010Æ\u0094²\u0097Ú\u0099\"[PF\u0096g¤ñ®;\u0018µÃ\u0091'\u0096¼tÛaæ\u0083{Fv®\u0005O¶GffR\u009du".length();
      char var14 = 24;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var27 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var33;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[22];
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
                  String var4 = "Úî\u0082?Ñ\u0099\u008eÊèV©µ¥õ\t\u0010\u001fü·\u0087²\u008d¦ì";
                  int var5 = "Úî\u0082?Ñ\u0099\u008eÊèV©µ¥õ\t\u0010\u001fü·\u0087²\u008d¦ì".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var31 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                     long[] var30 = var6;
                     var31 = var3++;
                     long var35 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var36 = -1;

                     while(true) {
                        long var8 = var35;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var38 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var36) {
                        case 0:
                           var30[var31] = var38;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[5];
                              KProperty[] var26 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tv.class, true.u<invokedynamic>(11192, 3724147114075574113L ^ var20), true.u<invokedynamic>(30571, 1494007610000577452L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tv.class, true.u<invokedynamic>(7480, 5052387235378592248L ^ var20), true.u<invokedynamic>(9075, 4889319068974794681L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tv.class, true.u<invokedynamic>(11916, 7108741198237911621L ^ var20), true.u<invokedynamic>(29025, 8519707424523490723L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tv.class, true.u<invokedynamic>(20929, 186717355957499138L ^ var20), true.u<invokedynamic>(18154, 5218807480763752999L ^ var20), 0)))};
                              N = var26;
                              o = new tv(var24);
                              y = qi.R((il)o, true.u<invokedynamic>(14727, 1968879664542637402L ^ var20), false, (pj)null, (Function0)null, true.i<invokedynamic>(11225, 2667702988107845025L ^ var20), var22, (Object)null);
                              K = qi.R((il)o, true.u<invokedynamic>(4985, 6362800525162575798L ^ var20), true, (pj)null, tv::V, 4, var22, (Object)null);
                              C = qi.R((il)o, true.u<invokedynamic>(10989, 5481971337083833894L ^ var20), true, (pj)null, (Function0)null, true.i<invokedynamic>(26811, 6116305557577322182L ^ var20), var22, (Object)null);
                              U = qi.R((il)o, true.u<invokedynamic>(10061, 3102959134899291029L ^ var20), true, (pj)null, (Function0)null, true.i<invokedynamic>(26811, 6116305557577322182L ^ var20), var22, (Object)null);
                              l = (List)(new ArrayList());
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var38;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "ï\u0002æ_\u0085\u009f\u007fD¿]2\u008aá\u0095}Á";
                           var5 = "ï\u0002æ_\u0085\u009f\u007fD¿]2\u008aá\u0095}Á".length();
                           var2 = 0;
                        }

                        var31 = var2;
                        var2 += 8;
                        var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                        var30 = var6;
                        var31 = var3++;
                        var35 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var36 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var33;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "pK}&Þ\u0096%QÁÖÕ\u0017>¡.zÀ$Í®øQðj\u00107_¡\u008e¥s*\u008e\b³vü\\¼|ô";
               var17 = "pK}&Þ\u0096%QÁÖÕ\u0017>¡.zÀ$Í®øQðj\u00107_¡\u008e¥s*\u008e\b³vü\\¼|ô".length();
               var14 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12993;
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
            throw new RuntimeException("su/catlean/tv", var10);
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
         throw new RuntimeException("su/catlean/tv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28789;
      if (g[var3] == null) {
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
            throw new RuntimeException("su/catlean/tv", var14);
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
         throw new RuntimeException("su/catlean/tv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
