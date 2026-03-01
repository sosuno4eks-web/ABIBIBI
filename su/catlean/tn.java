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
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class tn extends k9 {
   @NotNull
   public static final tn A;
   // $FF: synthetic field
   static final KProperty[] n;
   @NotNull
   private static final zc b;
   @NotNull
   private static final zo C;
   @NotNull
   private static final iv x;
   private static final long c = j0.a(1211369012125034234L, 6596831549677838756L, MethodHandles.lookup().lookupClass()).a(73212885167191L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map k;

   private tn(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 18905605195544L;
      super(var3, true.t<invokedynamic>(23819, 8144274545744887224L ^ var1), pa.N(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final float L(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 112064873554892L;
      int var3 = (int)((var1 ^ 112064873554892L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)b.k((short)var3, this, n[0], (short)var4, var5)).floatValue();
   }

   private final boolean t(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 66695308729754L;
      int var3 = (int)((var1 ^ 66695308729754L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)C.k((short)var3, this, n[1], (short)var4, var5);
   }

   @Flow
   private final void n(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void f(@NotNull ReceivePacket e) {
      // $FF: Couldn't be decompiled
   }

   private final void d(long param1, int param3) {
      // $FF: Couldn't be decompiled
   }

   private final int S(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final float h(short var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ c;
      long var6 = var4 ^ 17006068890628L;
      return s8.f(var6).method_6032() + s8.f(var6).method_6067();
   }

   static {
      long var20 = c ^ 91748427871318L;
      long var22 = var20 ^ 22676313565234L;
      long var24 = var20 ^ 118030175200198L;
      long var26 = var20 ^ 69659602870225L;
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
      String var15 = "w¿Ýà\u008c{5;×c¨bM\u00013L(%2Ò)?\u0010ò.´\u008cafX\u00045íÃuÓÜ%âÔ\u009bØC¥e\u0089EVÒ0Â\u001fÂ«ÁM?(E'(Ic±\u001b9V7\u009a<,Å³>\u0010Hi\u0006ãù°á[²\u0099gØ\u0087\u0003õRëJ\u0081$\u0005®ú(ï´§ÑßßÖÈ)åÍ¤\u009c\u001bê<5ÕP\u001fÒ©\u008d:/+ÿ&)j¥ì{\u0085®\u0007Â¾\u009a\u008d0jÄb&\u0019l¡WÎ\u0017Ñáa/VÚ»\u0090ÈI|Û©@Öº9Ì!K8|þþh\u0000\u0083K\u0085Ó>dÃ}¶4È\u000f\u0010ÂY0@!æõèwéÌ+~6Ç\u009f \u0096\r\u008c\u009e\u001cÎ\"±¢\u009c»\u001dÈ\t¬\u009e¿öì´\u007fMÇ}\u0094W%\u0017IXkï \u008cVßðû\u009d_\u001eê`\u0002á\u0000£ák\u00856G\u000bù\\¡Cä3\u0005×û%\u0006\u008b";
      int var17 = "w¿Ýà\u008c{5;×c¨bM\u00013L(%2Ò)?\u0010ò.´\u008cafX\u00045íÃuÓÜ%âÔ\u009bØC¥e\u0089EVÒ0Â\u001fÂ«ÁM?(E'(Ic±\u001b9V7\u009a<,Å³>\u0010Hi\u0006ãù°á[²\u0099gØ\u0087\u0003õRëJ\u0081$\u0005®ú(ï´§ÑßßÖÈ)åÍ¤\u009c\u001bê<5ÕP\u001fÒ©\u008d:/+ÿ&)j¥ì{\u0085®\u0007Â¾\u009a\u008d0jÄb&\u0019l¡WÎ\u0017Ñáa/VÚ»\u0090ÈI|Û©@Öº9Ì!K8|þþh\u0000\u0083K\u0085Ó>dÃ}¶4È\u000f\u0010ÂY0@!æõèwéÌ+~6Ç\u009f \u0096\r\u008c\u009e\u001cÎ\"±¢\u009c»\u001dÈ\t¬\u009e¿öì´\u007fMÇ}\u0094W%\u0017IXkï \u008cVßðû\u009d_\u001eê`\u0002á\u0000£ák\u00856G\u000bù\\¡Cä3\u0005×û%\u0006\u008b".length();
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
                  e = new String[10];
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
                  String var4 = "T\t\t\u0084\u0002ñ+\u0018+gI©eüÜX\u009cs·Â«\u0007ê^";
                  int var5 = "T\t\t\u0084\u0002ñ+\u0018+gI©eüÜX\u009cs·Â«\u0007ê^".length();
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
                              KProperty[] var28 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tn.class, true.t<invokedynamic>(10306, 2597252923365649382L ^ var20), true.t<invokedynamic>(28804, 5209850185469801251L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tn.class, true.t<invokedynamic>(24980, 585837665971642940L ^ var20), true.t<invokedynamic>(31105, 7609610691629726242L ^ var20), 0)))};
                              n = var28;
                              A = new tn(var22);
                              b = qi.g((il)A, true.t<invokedynamic>(23252, 3258097200319469941L ^ var20), 16.0F, RangesKt.rangeTo(0.0F, 36.0F), (pj)null, (Function0)null, true.p<invokedynamic>(21060, 7273187004549398899L ^ var20), var24, (Object)null);
                              C = qi.R((il)A, true.t<invokedynamic>(28187, 630827650951261618L ^ var20), false, (pj)null, (Function0)null, true.p<invokedynamic>(32081, 1556516802549231204L ^ var20), var26, (Object)null);
                              x = new iv();
                              return;
                           }
                           break;
                        default:
                           var32[var33] = var40;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "K@¹Þ\u0087\u0018z-z\u0087Ý\u001chfÏl";
                           var5 = "K@¹Þ\u0087\u0018z-z\u0087Ý\u001chfÏl".length();
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

               var15 = "ºÒtê\u009b,Æ/\u001ds5Ax\"_\bÑQ!ú\u0016Ð\u001a7µ\u008e\u008d\u001c>g\u001cä#¢¨laÛ\u0006é 9ZDQ>æ\u0011Ú\u0096w{>p±_C Þ\u0093¬|®ÜÝ\u0013/g}¾¹S«";
               var17 = "ºÒtê\u009b,Æ/\u001ds5Ax\"_\bÑQ!ú\u0016Ð\u001a7µ\u008e\u008d\u001c>g\u001cä#¢¨laÛ\u0006é 9ZDQ>æ\u0011Ú\u0096w{>p±_C Þ\u0093¬|®ÜÝ\u0013/g}¾¹S«".length();
               var14 = '(';
               var13 = -1;
            }

            ++var13;
            var29 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15568;
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
            throw new RuntimeException("su/catlean/tn", var10);
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
         throw new RuntimeException("su/catlean/tn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11335;
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
            throw new RuntimeException("su/catlean/tn", var14);
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
         throw new RuntimeException("su/catlean/tn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
