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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class km extends kr {
   @NotNull
   public static final km q;
   static final KProperty[] B;
   @NotNull
   private static final zo m;
   @NotNull
   private static final z0 P;
   @NotNull
   private static final zo Q;
   @NotNull
   private static final n C;
   @NotNull
   private static final n V;
   @Nullable
   private static class_3965 y;
   @Nullable
   private static class_2338 k;
   private static final long c = j0.a(-1305636061511218439L, 8671795945096384364L, MethodHandles.lookup().lookupClass()).a(190739564645009L);
   private static final String[] e;
   private static final String[] s;
   private static final Map z;
   private static final long[] A;
   private static final Integer[] K;
   private static final Map W;

   private km(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 16914252195339L;
      super(true.v<invokedynamic>(31534, 3268955736504555574L ^ var1), var3, pa.Q(), 0, false, true.q<invokedynamic>(19754, 3248870902542693664L ^ var1), (DefaultConstructorMarker)null);
   }

   private final boolean t(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 83207602482630L;
      int var3 = (int)((var1 ^ 83207602482630L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)m.k((short)var3, this, B[0], (short)var4, var5);
   }

   private final int b(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 120574912166593L;
      int var3 = (int)((var1 ^ 120574912166593L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)P.k((short)var3, this, B[1], (short)var4, var5)).intValue();
   }

   private final boolean J(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 118903831904027L;
      int var3 = (int)((var1 ^ 118903831904027L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)Q.k((short)var3, this, B[2], (short)var4, var5);
   }

   @Flow
   private final void a(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean k(char a, @NotNull class_2338 pos, long a) {
      long var5 = ((long)var1 << 48 | var3 << 16 >>> 16) ^ c;
      long var7 = var5 ^ 93993313770894L;
      long var9 = var5 ^ 79935655214431L;
      long var10001 = var5 ^ 90884244845737L;
      int var11 = (int)((var5 ^ 90884244845737L) >>> 32);
      int var12 = (int)(var10001 << 32 >>> 32);
      long var13 = var5 ^ 10413026292250L;
      -1802216623180236995L.A<invokedynamic>(-1802216623180236995L, var5);
      Intrinsics.checkNotNullParameter(var2, true.v<invokedynamic>(24171, 5217586846731401315L ^ var5));

      try {
         boolean var10000 = ml.j.T(var11, var2, this.p(var9), this.c(), this.G(var13), var12, this.f(var7));
         if (-1863979951530187957L.A<invokedynamic>(-1863979951530187957L, var5) == null) {
            (new int[2]).A<invokedynamic>(new int[2], -1820873717426075255L, var5);
         }

         return var10000;
      } catch (NumberFormatException var16) {
         throw var16.A<invokedynamic>(var16, -1870439546678992723L, var5);
      }
   }

   @NotNull
   protected List W(long var1) {
      return CollectionsKt.listOf(class_2246.field_10540);
   }

   private static final boolean T() {
      long var0 = c ^ 132635301379726L;
      long var2 = var0 ^ 2186048545173L;
      return q.t(var2);
   }

   public static final void r(class_3965 <set-?>) {
      y = var0;
   }

   public static final boolean X(short a, km $this, int a, int a) {
      long var4 = ((long)var0 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ c;
      long var6 = var4 ^ 85261870730701L;
      return var1.J(var6);
   }

   static {
      long var20 = c ^ 89921224673202L;
      long var22 = var20 ^ 98767855124993L;
      long var10001 = var20 ^ 109772828007683L;
      int var24 = (int)((var20 ^ 109772828007683L) >>> 48);
      int var25 = (int)(var10001 << 16 >>> 32);
      int var26 = (int)(var10001 << 48 >>> 48);
      long var27 = var20 ^ 139280619408583L;
      long var29 = var20 ^ 88672891626840L;
      z = new HashMap(13);
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
      String var15 = "çê~\u0097ÚÝª¤XæÝùä¯\u001bùG9±J\u0007\u0005ÐË:KúY}\u0004°Ï²\u001aÌ\u001f¥#à\u0003\u0010y\u0085\u0006Dl\u0017\u0088_âv¾H×D\u0081}(ç\u00841¶Kô\u0097ip÷\u0082\u008eìâ.ßI·\u00ad\u009dÀN\f\u0006)XÚdM6\u0014\u0000ÔüÑ\u0006¯\u001e\u001aÐ\u0010\u009b°WAI1\t\u009avÏ©ªæm\u0099&\u0018\u0081ý2¯ÝËWS'ÏvñõPÄ¦äÙïïs \u00856\u0018È\u0084ö_\u0086\u0016¦P\u0087Âþ\\\u000e4oç±\u0012Å§Ü¤uu\u0018À\u007fý\u0005~×¶·þ<.Á\u0099\u009cbÐ(\u0099\u00894Ö#Ä¸ è sù~%\u001eÿç\\\u0084\u0013L\u008fú.\u0092Zê\rhO©\u001bu»îxnøö6\u0010q\f\u001b\u0081ù·£ð¬¼W5\u001fM\u0087u(¡\u009a§iè\u0089¤ \u0088\u000b¢í«Åm\u0098r2p\"ØÏG<Ña,Ð\u001a©×\u009e\u001b£³\u001d\u0005c<\u0010 \u0087\u0087'#£\u0081k$DªQðVïÛ?ÙbÕ\u0090±\bN~%:É?æ®\u0004x0\u0011\u001f%¹^ALåmÒ\u0019\u000f.ªØ\u0094;ºÌ\to´Ôê\u0093BU\u00ad÷\u0007\tÃË»#Ä³±°Ôvg\u0096E4N?i";
      int var17 = "çê~\u0097ÚÝª¤XæÝùä¯\u001bùG9±J\u0007\u0005ÐË:KúY}\u0004°Ï²\u001aÌ\u001f¥#à\u0003\u0010y\u0085\u0006Dl\u0017\u0088_âv¾H×D\u0081}(ç\u00841¶Kô\u0097ip÷\u0082\u008eìâ.ßI·\u00ad\u009dÀN\f\u0006)XÚdM6\u0014\u0000ÔüÑ\u0006¯\u001e\u001aÐ\u0010\u009b°WAI1\t\u009avÏ©ªæm\u0099&\u0018\u0081ý2¯ÝËWS'ÏvñõPÄ¦äÙïïs \u00856\u0018È\u0084ö_\u0086\u0016¦P\u0087Âþ\\\u000e4oç±\u0012Å§Ü¤uu\u0018À\u007fý\u0005~×¶·þ<.Á\u0099\u009cbÐ(\u0099\u00894Ö#Ä¸ è sù~%\u001eÿç\\\u0084\u0013L\u008fú.\u0092Zê\rhO©\u001bu»îxnøö6\u0010q\f\u001b\u0081ù·£ð¬¼W5\u001fM\u0087u(¡\u009a§iè\u0089¤ \u0088\u000b¢í«Åm\u0098r2p\"ØÏG<Ña,Ð\u001a©×\u009e\u001b£³\u001d\u0005c<\u0010 \u0087\u0087'#£\u0081k$DªQðVïÛ?ÙbÕ\u0090±\bN~%:É?æ®\u0004x0\u0011\u001f%¹^ALåmÒ\u0019\u000f.ªØ\u0094;ºÌ\to´Ôê\u0093BU\u00ad÷\u0007\tÃË»#Ä³±°Ôvg\u0096E4N?i".length();
      char var14 = '(';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var32 = var15.substring(var13, var13 + var14);
         byte var34 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
            String var39 = c(var19).intern();
            switch(var34) {
            case 0:
               var18[var16++] = var39;
               if ((var13 += var14) >= var17) {
                  e = var18;
                  s = new String[14];
                  W = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[8];
                  int var3 = 0;
                  String var4 = "¦\u0086S.\u0013ß\u0012,ý³\u008fÐ± ({JÎºÕz)s\u0005\u001d®á\u009f£L£q\u001dC9%yoþQ\u0007åàü¸c°X";
                  int var5 = "¦\u0086S.\u0013ß\u0012,ý³\u008fÐ± ({JÎºÕz)s\u0005\u001d®á\u009f£L£q\u001dC9%yoþQ\u0007åàü¸c°X".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var38 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
                     long[] var35 = var6;
                     var38 = var3++;
                     long var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var42 = -1;

                     while(true) {
                        long var8 = var41;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var44 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var42) {
                        case 0:
                           var35[var38] = var44;
                           if (var2 >= var5) {
                              A = var6;
                              K = new Integer[8];
                              KProperty[] var31 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(km.class, true.v<invokedynamic>(6175, 4362981012020262285L ^ var20), true.v<invokedynamic>(28712, 4333820897577901493L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(km.class, true.v<invokedynamic>(8016, 2006639911456043718L ^ var20), true.v<invokedynamic>(19374, 8689730136577975871L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(km.class, true.v<invokedynamic>(28236, 3257747477472805851L ^ var20), true.v<invokedynamic>(28672, 3351123023512771987L ^ var20), 0)))};
                              B = var31;
                              q = new km(var29);
                              m = qi.R((il)q, true.v<invokedynamic>(29059, 2852039778573982739L ^ var20), false, (pj)null, (Function0)null, true.q<invokedynamic>(13280, 7615842228766328163L ^ var20), var27, (Object)null);
                              P = qi.o((il)q, true.v<invokedynamic>(1418, 198588921275934737L ^ var20), true.q<invokedynamic>(21872, 223818861570532338L ^ var20), new IntRange(0, true.q<invokedynamic>(11153, 2720408092722617616L ^ var20)), var22, (pj)null, km::T, true.q<invokedynamic>(5449, 2056889991874175948L ^ var20), (Object)null);
                              Q = qi.R((il)q, true.v<invokedynamic>(29325, 6119972021553372951L ^ var20), false, (pj)null, (Function0)null, true.q<invokedynamic>(19754, 3248923813684198317L ^ var20), var27, (Object)null);
                              C = new n((char)var24, var25, (char)var26);
                              V = new n((char)var24, var25, (char)var26);
                              return;
                           }
                           break;
                        default:
                           var35[var38] = var44;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "¯(\u0093\\t~ê©k\u001aç\u00adÈFùA";
                           var5 = "¯(\u0093\\t~ê©k\u001aç\u00adÈFùA".length();
                           var2 = 0;
                        }

                        var38 = var2;
                        var2 += 8;
                        var7 = var4.substring(var38, var2).getBytes("ISO-8859-1");
                        var35 = var6;
                        var38 = var3++;
                        var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var42 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var39;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u0081~M?êÚnª>8 üÎ\u009b\u0017T.))7\u0090Ëí\u0012¹¾eñ¦³\rQ\u0010NØ¯¡´\u0010u¶$\u0087\u001f\u001a¹9\u008d ";
               var17 = "\u0081~M?êÚnª>8 üÎ\u009b\u0017T.))7\u0090Ëí\u0012¹¾eñ¦³\rQ\u0010NØ¯¡´\u0010u¶$\u0087\u001f\u001a¹9\u008d ".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var32 = var15.substring(var13, var13 + var14);
            var34 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16886;
      if (s[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])z.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               z.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/km", var10);
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
         s[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return s[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/km" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23264;
      if (K[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = A[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])W.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               W.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/km", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         K[var3] = var15;
      }

      return K[var3];
   }

   private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/km" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
