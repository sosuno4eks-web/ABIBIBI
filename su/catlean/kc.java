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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class kc extends kr {
   static final KProperty[] C;
   @NotNull
   private final zq c;
   @NotNull
   private final zo A;
   private static String[] k;
   private static final long e = j0.a(-7504269982959352667L, 1181648778058402428L, MethodHandles.lookup().lookupClass()).a(159421783291386L);
   private static final String[] q;
   private static final String[] s;
   private static final Map z;
   private static final long[] K;
   private static final Integer[] P;
   private static final Map Q;

   public kc(char a, @NotNull String id, int a, @NotNull p5 category, int a) {
      long var6 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ e;
      long var8 = var6 ^ 59482924740329L;
      long var10001 = var6 ^ 128378292952293L;
      int var10 = (int)((var6 ^ 128378292952293L) >>> 48);
      int var11 = (int)(var10001 << 16 >>> 32);
      int var12 = (int)(var10001 << 48 >>> 48);
      long var13 = var6 ^ 18328544314799L;
      var10001 = var6 ^ 83152345609885L;
      int var15 = (int)((var6 ^ 83152345609885L) >>> 32);
      int var16 = (int)(var10001 << 32 >>> 48);
      int var17 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var2, true.o<invokedynamic>(26836, 2730665003099740198L ^ var6));
      Intrinsics.checkNotNullParameter(var4, true.o<invokedynamic>(11912, 1821446687692693112L ^ var6));
      super(var2, var4, var8, true.e<invokedynamic>(16355, 4393670279477254259L ^ var6), true);
      il var19 = (il)this;
      String var10003 = 10203.o<invokedynamic>(10203, 7773253409901287214L ^ var6);
      class_2248[] var18 = new class_2248[1];
      class_2248 var10008 = class_2246.field_10540;
      Intrinsics.checkNotNullExpressionValue(var10008, true.o<invokedynamic>(20089, 1525420833120255618L ^ var6));
      var18[0] = var10008;
      this.c = qi.K(var19, var15, var10003, new kq((short)var10, var11, CollectionsKt.mutableListOf(var18), (char)var12), (pj)null, (short)var16, (Function0)null, (char)var17, true.e<invokedynamic>(9576, 9214458430010376957L ^ var6), (Object)null);
      this.A = qi.R((il)this, true.o<invokedynamic>(13993, 4813355526899926611L ^ var6), true, (pj)null, (Function0)null, true.e<invokedynamic>(7993, 212016839437645992L ^ var6), var13, (Object)null);
   }

   private final kq i(long var1) {
      var1 ^= e;
      long var10001 = var1 ^ 21273258672995L;
      int var3 = (int)((var1 ^ 21273258672995L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (kq)this.c.k((short)var3, this, C[0], (short)var4, var5);
   }

   private final void O(kq var1, long var2) {
      var2 ^= e;
      long var10001 = var2 ^ 31215534996034L;
      int var4 = (int)((var2 ^ 31215534996034L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      this.c.P(this, var4, C[0], (short)var5, var1, (short)var6);
   }

   public final boolean y(long var1) {
      var1 ^= e;
      long var10001 = var1 ^ 39328435761047L;
      int var3 = (int)((var1 ^ 39328435761047L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)this.A.k((short)var3, this, C[1], (short)var4, var5);
   }

   public final void W(long a, @Nullable class_1657 target) {
      // $FF: Couldn't be decompiled
   }

   protected boolean t(@NotNull class_1297 crystal, long a) {
      long var4 = var2 ^ 38842543447822L;
      long var6 = var2 ^ 7807074793005L;
      long var8 = var2 ^ 29537782894620L;
      int[] var10000 = 2076019275172046303L.A<invokedynamic>(2076019275172046303L, var2);
      Intrinsics.checkNotNullParameter(var1, true.o<invokedynamic>(6167, 2162932162054295786L ^ var2));
      int[] var10 = var10000;

      int var12;
      label32: {
         try {
            float var13;
            var12 = (var13 = su.catlean.ab.X(su.catlean.ab.O, var6, this.W(var8, var1), (class_1657)s8.f(var4), 0, false, (List)null, false, true.e<invokedynamic>(13425, 7826476300015758313L ^ var2), (Object)null) + 4.0F - (s8.f(var4).method_6032() + s8.f(var4).method_6067())) == 0.0F ? 0 : (var13 < 0.0F ? -1 : 1);
            if (var10 == null) {
               return (boolean)var12;
            }

            if (var12 < 0) {
               break label32;
            }
         } catch (NumberFormatException var11) {
            throw var11.A<invokedynamic>(var11, 2155510164277857786L, var2);
         }

         var12 = 0;
         return (boolean)var12;
      }

      var12 = 1;
      return (boolean)var12;
   }

   private final List l(int param1, long param2, class_2338 param4, Set param5) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   protected List W(long var1) {
      long var3 = var1 ^ 111305154919801L;
      return this.i(var3).G();
   }

   static {
      long var20 = e ^ 29423771046649L;
      String[] var10000 = new String[5];
      z = new HashMap(13);
      var10000.A<invokedynamic>(var10000, 3977117869518112608L, var20);
      Cipher var11;
      Cipher var23 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var23.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[14];
      int var16 = 0;
      String var15 = "WÙ¤\u0019kRNÍ\u008e¹\u0087Þß¬ºÚ~\u0097½\u001boÀ¼\u0016\u0018\u0011\\\u00864'\u0007`\u009c\u001cx´µ×ðNÔÁGc]\u008ei\u000b¨\u0010Ê\u0001¦$R\u001eï¸Ì\u0092à0\u008b\u0084¿(@æ\u0091{ÄPzü6ÚµãáTUF\u000f\u008dª~\u00888²\u0017,y.Cq1ô\u0005Ï\u009eYSáôðôÆìw:``¦_ZçBÙ·¶t\u008b¹ÐV\"W\u0091þ½ð ¦\u008d\u0085¿oB$\u001eEÂ\u0006W\u009b4üãR\u0086QÙp¥xïã\n»\u0098x\u0095\u0092©\u0010à]Â\tP\u0012¤ò1¿ZAìcùÚ\u0010ÄªÓÛl0®=§\u0095þ}\u008eG¢o 6gE\u009fy=Ñ*\u008aØáW´)ëx.\u000e4Q>ü¥\u0086\u0010\u0016¨ óµÉK Í\u0093¡H#{°Y\u0082,@\u009cº8\u0018\u0080[\u0084è1z\u009bV\u0083\u0088íG¤Ù9Ï3 P`\u0016\u0095j¤æ\u0003üYEöráf(·øÍ\u0015Â\u0084\bÎòÕ>¨I\b&\u0006 \u001eúS¦æõ\u0006\u000bô¦\u001cÒ·è\u0016.k·ín\u008d+?Ô*Nº\u0097á\u008bý\u0097 Ku!~i\u009b$6¦\u0004ô\u0087\u000fÀ¬º\u009fßv\u0018;ý d\u0093{\u0002@!\u0090ôÁ";
      int var17 = "WÙ¤\u0019kRNÍ\u008e¹\u0087Þß¬ºÚ~\u0097½\u001boÀ¼\u0016\u0018\u0011\\\u00864'\u0007`\u009c\u001cx´µ×ðNÔÁGc]\u008ei\u000b¨\u0010Ê\u0001¦$R\u001eï¸Ì\u0092à0\u008b\u0084¿(@æ\u0091{ÄPzü6ÚµãáTUF\u000f\u008dª~\u00888²\u0017,y.Cq1ô\u0005Ï\u009eYSáôðôÆìw:``¦_ZçBÙ·¶t\u008b¹ÐV\"W\u0091þ½ð ¦\u008d\u0085¿oB$\u001eEÂ\u0006W\u009b4üãR\u0086QÙp¥xïã\n»\u0098x\u0095\u0092©\u0010à]Â\tP\u0012¤ò1¿ZAìcùÚ\u0010ÄªÓÛl0®=§\u0095þ}\u008eG¢o 6gE\u009fy=Ñ*\u008aØáW´)ëx.\u000e4Q>ü¥\u0086\u0010\u0016¨ óµÉK Í\u0093¡H#{°Y\u0082,@\u009cº8\u0018\u0080[\u0084è1z\u009bV\u0083\u0088íG¤Ù9Ï3 P`\u0016\u0095j¤æ\u0003üYEöráf(·øÍ\u0015Â\u0084\bÎòÕ>¨I\b&\u0006 \u001eúS¦æõ\u0006\u000bô¦\u001cÒ·è\u0016.k·ín\u008d+?Ô*Nº\u0097á\u008bý\u0097 Ku!~i\u009b$6¦\u0004ô\u0087\u000fÀ¬º\u009fßv\u0018;ý d\u0093{\u0002@!\u0090ôÁ".length();
      char var14 = 24;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var24 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var30 = c(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var30;
               if ((var13 += var14) >= var17) {
                  q = var18;
                  s = new String[14];
                  Q = new HashMap(13);
                  Cipher var0;
                  var23 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var23.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[6];
                  int var3 = 0;
                  String var4 = "\u0004\u0080(gnR¯\u0007²í\u0092a\u0006</[Á\u0012Ï\u0095Ú?»¤\u0014ØÜP\u001d\u0098ãD";
                  int var5 = "\u0004\u0080(gnR¯\u0007²í\u0092a\u0006</[Á\u0012Ï\u0095Ú?»¤\u0014ØÜP\u001d\u0098ãD".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var28 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                     long[] var27 = var6;
                     var28 = var3++;
                     long var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var33 = -1;

                     while(true) {
                        long var8 = var32;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var35 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var33) {
                        case 0:
                           var27[var28] = var35;
                           if (var2 >= var5) {
                              K = var6;
                              P = new Integer[6];
                              KProperty[] var22 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(kc.class, true.o<invokedynamic>(29958, 443189962359494170L ^ var20), true.o<invokedynamic>(28136, 9043378453586333424L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kc.class, true.o<invokedynamic>(16964, 8257453167224185175L ^ var20), true.o<invokedynamic>(8689, 6048556735602918119L ^ var20), 0)))};
                              C = var22;
                              return;
                           }
                           break;
                        default:
                           var27[var28] = var35;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0003áÑrõ\u0083n\u0086\u0081\u0006Wy.?|\u0084";
                           var5 = "\u0003áÑrõ\u0083n\u0086\u0081\u0006Wy.?|\u0084".length();
                           var2 = 0;
                        }

                        var28 = var2;
                        var2 += 8;
                        var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        var27 = var6;
                        var28 = var3++;
                        var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var33 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var30;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u007f\u001ez\u0097<\u0087\u000e\u0093\u008f\u0090ÁÝDÈù\u0015\u0081\u0084¡É\u009b\u000f{K¹\u0081\u0016\u0089xk5\bg$«ävËÏ¯(\\CÞ\u000epbòç£á×Æ®ªÌ©W\rN b!\u0016\u0019ÿk\u007fð@ <\u0010¦RVlRð>°";
               var17 = "\u007f\u001ez\u0097<\u0087\u000e\u0093\u008f\u0090ÁÝDÈù\u0015\u0081\u0084¡É\u009b\u000f{K¹\u0081\u0016\u0089xk5\bg$«ävËÏ¯(\\CÞ\u000epbòç£á×Æ®ªÌ©W\rN b!\u0016\u0019ÿk\u007fð@ <\u0010¦RVlRð>°".length();
               var14 = '(';
               var13 = -1;
            }

            ++var13;
            var24 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void t(String[] var0) {
      k = var0;
   }

   public static String[] t() {
      return k;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5631;
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
            throw new RuntimeException("su/catlean/kc", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = q[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("su/catlean/kc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17055;
      if (P[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = K[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])Q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               Q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/kc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         P[var3] = var15;
      }

      return P[var3];
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
         throw new RuntimeException("su/catlean/kc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
