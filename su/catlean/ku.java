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
import net.minecraft.class_2350;
import net.minecraft.class_2596;
import net.minecraft.class_2846;
import net.minecraft.class_2846.class_2847;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.CobWebEvent;
import su.catlean.api.event.events.player.CollisionEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class ku extends k9 {
   @NotNull
   public static final ku R;
   static final KProperty[] x;
   @NotNull
   private static final zr U;
   @NotNull
   private static final zc v;
   @NotNull
   private static final zc q;
   @NotNull
   private static final zo z;
   private static final long b = j0.a(-452773870724862629L, 7217444345606096819L, MethodHandles.lookup().lookupClass()).a(186514956219297L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private ku(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 4780321666722L;
      super(var3, true.d<invokedynamic>(10963, 7768615392573432729L ^ var1), pa.c(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final ul u(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 137073798392964L;
      int var3 = (int)((var1 ^ 137073798392964L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (ul)U.k((short)var3, this, x[0], (short)var4, var5);
   }

   private final void F(ul var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 6213694686905L;
      int var4 = (int)((var2 ^ 6213694686905L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      U.P(this, var4, x[0], (short)var5, var1, (short)var6);
   }

   private final float c(int var1, char var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 62012397589014L;
      int var6 = (int)((var4 ^ 62012397589014L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)v.k((short)var6, this, x[1], (short)var7, var8)).floatValue();
   }

   private final void o(long var1, float var3) {
      var1 ^= b;
      long var10001 = var1 ^ 70732644273872L;
      int var4 = (int)((var1 ^ 70732644273872L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      v.P(this, var4, x[1], (short)var5, var3, (short)var6);
   }

   private final float S(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 59626703780350L;
      int var3 = (int)((var1 ^ 59626703780350L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)q.k((short)var3, this, x[2], (short)var4, var5)).floatValue();
   }

   private final void F(long var1, float var3) {
      var1 ^= b;
      long var10001 = var1 ^ 64258832634304L;
      int var4 = (int)((var1 ^ 64258832634304L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      q.P(this, var4, x[2], (short)var5, var3, (short)var6);
   }

   private final boolean V(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 55394920715348L;
      int var3 = (int)((var1 ^ 55394920715348L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)z.k((short)var3, this, x[3], (short)var4, var5);
   }

   private final void w(boolean var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 70024387929804L;
      int var4 = (int)((var2 ^ 70024387929804L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      z.P(this, var4, x[3], (short)var5, var1, (short)var6);
   }

   @Flow
   public final void A(@Nullable PlayerUpdateEvent e) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void t(@NotNull CollisionEvent e) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void x(@NotNull CobWebEvent e) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean k() {
      long var0 = b ^ 87263108135767L;
      long var2 = var0 ^ 1130930545934L;

      boolean var10000;
      try {
         if (R.u(var2) == ul.TIMER) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, -7786946382160554865L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final boolean T() {
      long var0 = b ^ 66423294343837L;
      long var2 = var0 ^ 125566437319876L;

      boolean var10000;
      try {
         if (R.u(var2) == ul.FLY) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, 5919215012749792581L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final boolean h() {
      long var0 = b ^ 135478430623555L;
      long var2 = var0 ^ 58743635196186L;

      boolean var10000;
      try {
         if (R.u(var2) == ul.IGNORE) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, 1151516258944551067L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final class_2596 q(CobWebEvent var0, int var1) {
      return (class_2596)(new class_2846(class_2847.field_12973, var0.getPos(), class_2350.field_11036, var1));
   }

   static {
      long var20 = b ^ 136058111432382L;
      long var22 = var20 ^ 45324088802144L;
      long var24 = var20 ^ 115663036192949L;
      long var26 = var20 ^ 16496811074385L;
      long var28 = var20 ^ 100068977303366L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[14];
      int var16 = 0;
      String var15 = "÷Bï\u0012±\u0082\u008bâE©\u008a>\u008b\u000bçW8\u009aìòá÷\u0092\u008fÉ9\u0085x,Ù\u000f7ÞS^\u0011Æ%É\u0001\u000f8Ë\u0085\u0017¡\u000bfñEÚ\u001c©\u0095j°ô<\u001d\u008c \u00982þÃíÏ·\u0019Æd¡ \u0010B\u0012á;üê¾ä¢\u0003H\b\u0098Ü\u008bò\u0010äÐù\u00959$\u001eï\u0093\u009a\u000f\u0096~\u001cíÀ\u0018LnµòE^\u0088§`ÃN¾k\f:\u001e¤º¤yTpÁ\u0093 \u0016Úö\u001f×<³\u009eí\u0013¨«¦kàF\u0090\u0005«¦\u009c;\u0011ß\u0099+6\u0084ÈXÞ´ ¥>[Óc\u001d\u000bñeÈvr> \r®S\u0006\u0089xÄÔ£M\u0019.MçæS\u009d\u0017\u0010çÜÌ[\u0092sÎ\u0003\u0094$(¦vOþ.(\u009b\u0003\u0089DéF)Ð\u001b÷é=ÀußóÔ!±ñ\u0088\u0098\u009a\u001cz.N]ý,ø\u001aëhµ2ø\u009c0J\u0010\u000e8Ó4\u0086)ÀÒ\u0000\tÞ3Ó\u0095l³\u0010éUWZÂ=¥5y¤èy{\u0004[Ê\u0018¢±{\u008a½»å)Rx\u000eGÊ\b©ÐÕWúdP\u0015ì¸";
      int var17 = "÷Bï\u0012±\u0082\u008bâE©\u008a>\u008b\u000bçW8\u009aìòá÷\u0092\u008fÉ9\u0085x,Ù\u000f7ÞS^\u0011Æ%É\u0001\u000f8Ë\u0085\u0017¡\u000bfñEÚ\u001c©\u0095j°ô<\u001d\u008c \u00982þÃíÏ·\u0019Æd¡ \u0010B\u0012á;üê¾ä¢\u0003H\b\u0098Ü\u008bò\u0010äÐù\u00959$\u001eï\u0093\u009a\u000f\u0096~\u001cíÀ\u0018LnµòE^\u0088§`ÃN¾k\f:\u001e¤º¤yTpÁ\u0093 \u0016Úö\u001f×<³\u009eí\u0013¨«¦kàF\u0090\u0005«¦\u009c;\u0011ß\u0099+6\u0084ÈXÞ´ ¥>[Óc\u001d\u000bñeÈvr> \r®S\u0006\u0089xÄÔ£M\u0019.MçæS\u009d\u0017\u0010çÜÌ[\u0092sÎ\u0003\u0094$(¦vOþ.(\u009b\u0003\u0089DéF)Ð\u001b÷é=ÀußóÔ!±ñ\u0088\u0098\u009a\u001cz.N]ý,ø\u001aëhµ2ø\u009c0J\u0010\u000e8Ó4\u0086)ÀÒ\u0000\tÞ3Ó\u0095l³\u0010éUWZÂ=¥5y¤èy{\u0004[Ê\u0018¢±{\u008a½»å)Rx\u000eGÊ\b©ÐÕWúdP\u0015ì¸".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var31 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var31.getBytes("ISO-8859-1"));
            String var37 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var37;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[14];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "9º¶º'P$Ä \u009cæcã\u001cª÷";
                  int var5 = "9º¶º'P$Ä \u009cæcã\u001cª÷".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var35 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                     long[] var34 = var6;
                     var35 = var3++;
                     long var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var40 = -1;

                     while(true) {
                        long var8 = var39;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var42 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var40) {
                        case 0:
                           var34[var35] = var42;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[4];
                              KProperty[] var30 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ku.class, true.d<invokedynamic>(28603, 4946666582906401985L ^ var20), true.d<invokedynamic>(25974, 5155833103986884096L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ku.class, true.d<invokedynamic>(27327, 6610057281427239371L ^ var20), true.d<invokedynamic>(4019, 6666308328474711247L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ku.class, true.d<invokedynamic>(11385, 3088829909936092930L ^ var20), true.d<invokedynamic>(9684, 6822733324675563175L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ku.class, true.d<invokedynamic>(5456, 8900390098689068590L ^ var20), true.d<invokedynamic>(14340, 2405695420759712629L ^ var20), 0)))};
                              x = var30;
                              R = new ku(var22);
                              U = qi.M((il)R, true.d<invokedynamic>(14247, 2652778433343958231L ^ var20), (Enum)ul.SOLID, (pj)null, (Function0)null, true.o<invokedynamic>(771, 4374450352668960370L ^ var20), (Object)null, var24);
                              v = qi.g((il)R, true.d<invokedynamic>(16790, 158085170199714531L ^ var20), 20.0F, RangesKt.rangeTo(1.0F, 50.0F), (pj)null, ku::k, true.o<invokedynamic>(24558, 7750654761627368093L ^ var20), var26, (Object)null);
                              q = qi.g((il)R, true.d<invokedynamic>(24069, 1128989663916574072L ^ var20), 0.3F, RangesKt.rangeTo(0.0F, 10.0F), (pj)null, ku::T, true.o<invokedynamic>(15205, 1997014005027397143L ^ var20), var26, (Object)null);
                              z = qi.R((il)R, true.d<invokedynamic>(25768, 4260083812876910559L ^ var20), false, (pj)null, ku::h, 4, var28, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var34[var35] = var42;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "l·\u0093Y\u0012\u0010\u0019\u009b\u0004åÚÚý\r·\u001f";
                           var5 = "l·\u0093Y\u0012\u0010\u0019\u009b\u0004åÚÚý\r·\u001f".length();
                           var2 = 0;
                        }

                        var35 = var2;
                        var2 += 8;
                        var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                        var34 = var6;
                        var35 = var3++;
                        var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var40 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var37;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u008eô\u009adt\u0088ø\u0090hà¡?Ï\u0019Ëu\u0010UMYpå b\u009e4.Ëwiék\u000b";
               var17 = "\u008eô\u009adt\u0088ø\u0090hà¡?Ï\u0019Ëu\u0010UMYpå b\u009e4.Ëwiék\u000b".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var31 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25745;
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
            throw new RuntimeException("su/catlean/ku", var10);
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
         throw new RuntimeException("su/catlean/ku" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6804;
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
            throw new RuntimeException("su/catlean/ku", var14);
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
         throw new RuntimeException("su/catlean/ku" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
