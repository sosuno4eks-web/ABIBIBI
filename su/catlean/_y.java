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
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2382;
import net.minecraft.class_2680;
import net.minecraft.class_2791;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class _y implements zh {
   @NotNull
   public static final _y f;
   @NotNull
   private static final ExecutorService X;
   @Nullable
   private static Future B;
   @NotNull
   private static final iv r;
   @NotNull
   private static final Set P;
   @NotNull
   private static final Set t;
   @NotNull
   private static List m;
   @NotNull
   private static final List T;
   @NotNull
   private static final List z;
   @NotNull
   private static final List W;
   private static final long a = j0.a(3478834771944077495L, 6360946530039320374L, MethodHandles.lookup().lookupClass()).a(47565613442017L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] g;
   private static final Map h;

   private _y() {
   }

   private final int j(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 1808108623839L;
      long var10001 = var1 ^ 49785040641629L;
      int var5 = (int)((var1 ^ 49785040641629L) >>> 32);
      int var6 = (int)(var10001 << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      return Math.min(true.j<invokedynamic>(24226, 4749344605457654855L ^ var1), Math.max(kw.q.V(var3), li.m.h(var5, var6, var7)));
   }

   private final int A(short var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 85093531583712L;
      long var10001 = var4 ^ 103289543823392L;
      int var8 = (int)((var4 ^ 103289543823392L) >>> 48);
      long var9 = var10001 << 16 >>> 16;
      return Math.min(true.j<invokedynamic>(3964, 8325713507046567469L ^ var4), Math.max(kw.q.G((char)var8, var9), li.m.k(var6)));
   }

   @Flow
   private final void C(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final List m(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean F(char a, short a, int a, @NotNull class_2338 pos) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final class_2680 q(int i, int j, int k, long a) {
      // $FF: Couldn't be decompiled
   }

   private final class_2680 w(char var1, int var2, int var3, int var4, int var5, int var6) {
      long var7 = ((long)var1 << 48 | (long)var5 << 32 >>> 16 | (long)var6 << 48 >>> 48) ^ a;
      long var9 = var7 ^ 63593192045984L;
      return this.q(var2, var3, var4, var9);
   }

   private final boolean r(int var1, int var2, int var3, int var4, int var5) {
      long var6 = ((long)var4 << 32 | (long)var5 << 32 >>> 32) ^ a;
      long var10001 = var6 ^ 24890758710595L;
      int var8 = (int)((var6 ^ 24890758710595L) >>> 48);
      int var9 = (int)(var10001 << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      return this.w((char)var8, var1, var2, var3, var9, var10).method_45474();
   }

   private final boolean u(class_2791 param1, int param2, int param3, int param4, long param5) {
      // $FF: Couldn't be decompiled
   }

   private final boolean d(int var1, int var2, long var3, int var5) {
      var3 ^= a;
      long var6 = var3 ^ 39565665475850L;
      return t.contains(this.q(var1, var2, var5, var6).method_26204());
   }

   private final boolean D(int var1, int var2, long var3, int var5) {
      var3 ^= a;
      long var6 = var3 ^ 110576785622412L;
      return P.contains(this.q(var1, var2, var5, var6).method_26204());
   }

   private final qe n(int param1, long param2, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   private final List s(long param1) {
      // $FF: Couldn't be decompiled
   }

   private static final List Z() {
      long var0 = a ^ 127559426863969L;
      long var2 = var0 ^ 58291969466297L;
      return f.s(var2);
   }

   private static final List H(Throwable var0) {
      return CollectionsKt.emptyList();
   }

   static {
      long var20 = a ^ 11834353816848L;
      d = new HashMap(13);
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
      String var15 = "eÞM\u0084<'\n0\u0017LÌô\u0007Èü\b}Å¡ò!ýæ(x\u009e\u008fqÁ@+Ëâ¡k%\u0084\u0086ö|\u0018\u0097¹ÓýÍ=\u009dÐ\u001b^JHüIJ\u0003ñ!\u0017Òv·\u008bl\u0010|B\u0002,\u00875\u009cëêM\u0086XIgè°\u0018Å¢Ç B9/\u0092ÌÆUq;Ì¬1\u0015\u0087ÞÆ¼\u0092\u009eá\u0018m\u0090°°\u0081Èu\u0089]\u001aÒ\u007fRå\u001bS3öF\u0012°òY\u008f(\u001f¦\u0003ú\u0098\u0006\u0011Ã\u008dn£\u001aÂJ\u00adÌÓÒ\u0092\u00ad\u008f\u0088(\u0018\u0000\u0095¦ãîÍ÷n\u001dÊ\u0007HÊú\u001d¨\u0018Çâ\u0016>¶7\u001b\u0003»(J|×;\u0005jÁ%\u0086ä\u0095!n\u001c@cªz\f\u008f\u009fåoµáÖFÍêB\u001eL¨@\u0003U^±TÃÂ3.s\u0089Ê\u0001\u0013§ÚO\u0006¨\u009d\u001c\u009b\t0\u0088Æ/d\u009e\u0019É|E\u0017Ú\u0002ÔZè\fº\u0092p »";
      int var17 = "eÞM\u0084<'\n0\u0017LÌô\u0007Èü\b}Å¡ò!ýæ(x\u009e\u008fqÁ@+Ëâ¡k%\u0084\u0086ö|\u0018\u0097¹ÓýÍ=\u009dÐ\u001b^JHüIJ\u0003ñ!\u0017Òv·\u008bl\u0010|B\u0002,\u00875\u009cëêM\u0086XIgè°\u0018Å¢Ç B9/\u0092ÌÆUq;Ì¬1\u0015\u0087ÞÆ¼\u0092\u009eá\u0018m\u0090°°\u0081Èu\u0089]\u001aÒ\u007fRå\u001bS3öF\u0012°òY\u008f(\u001f¦\u0003ú\u0098\u0006\u0011Ã\u008dn£\u001aÂJ\u00adÌÓÒ\u0092\u00ad\u008f\u0088(\u0018\u0000\u0095¦ãîÍ÷n\u001dÊ\u0007HÊú\u001d¨\u0018Çâ\u0016>¶7\u001b\u0003»(J|×;\u0005jÁ%\u0086ä\u0095!n\u001c@cªz\f\u008f\u009fåoµáÖFÍêB\u001eL¨@\u0003U^±TÃÂ3.s\u0089Ê\u0001\u0013§ÚO\u0006¨\u009d\u001c\u009b\t0\u0088Æ/d\u009e\u0019É|E\u0017Ú\u0002ÔZè\fº\u0092p »".length();
      char var14 = '(';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var24 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var30 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var30;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[10];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[9];
                  int var3 = 0;
                  String var4 = "Z2z¾\u0086[\u0010\u001b=\u009a!áçÝi\u0000¤\u0089ÀLÆË\u001c-\u0098\u001a!\u0084Öp\u008cÅt\r7\u009f#ÔÏ»`ÅÈàä~FçUBUÅ/ý)-";
                  int var5 = "Z2z¾\u0086[\u0010\u001b=\u009a!áçÝi\u0000¤\u0089ÀLÆË\u001c-\u0098\u001a!\u0084Öp\u008cÅt\r7\u009f#ÔÏ»`ÅÈàä~FçUBUÅ/ý)-".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var28 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                     long[] var27 = var6;
                     var28 = var3++;
                     long var34 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var35 = -1;

                     while(true) {
                        long var8 = var34;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var37 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var35) {
                        case 0:
                           var27[var28] = var37;
                           if (var2 >= var5) {
                              e = var6;
                              g = new Integer[9];
                              f = new _y();
                              ExecutorService var31 = Executors.newVirtualThreadPerTaskExecutor();
                              Intrinsics.checkNotNullExpressionValue(var31, true.n<invokedynamic>(23977, 6219525893936508134L ^ var20));
                              X = var31;
                              long var33 = 6340641781828403766L ^ var20;
                              r = new iv();
                              class_2248[] var22 = new class_2248[]{class_2246.field_10540, class_2246.field_10443, class_2246.field_22109, class_2246.field_22108};
                              P = SetsKt.setOf(var22);
                              var22 = new class_2248[]{class_2246.field_9987, class_2246.field_10499};
                              t = SetsKt.setOf(var22);
                              m = CollectionsKt.emptyList();
                              class_2382[] var23 = new class_2382[true.j<invokedynamic>(4026, var33)];
                              var23[0] = new class_2382(-1, 0, 1);
                              var23[1] = new class_2382(0, 0, 2);
                              var23[2] = new class_2382(1, 0, 2);
                              var23[3] = new class_2382(2, 0, 1);
                              var23[4] = new class_2382(2, 0, 0);
                              var23[5] = new class_2382(1, 0, -1);
                              T = CollectionsKt.listOf(var23);
                              var23 = new class_2382[]{new class_2382(-1, 0, 1), new class_2382(0, 0, 2), new class_2382(1, 0, 1), new class_2382(1, 0, 0)};
                              z = CollectionsKt.listOf(var23);
                              var23 = new class_2382[]{new class_2382(0, 0, 1), new class_2382(1, 0, 1), new class_2382(2, 0, 0), new class_2382(1, 0, -1)};
                              W = CollectionsKt.mutableListOf(var23);
                              return;
                           }
                           break;
                        default:
                           var27[var28] = var37;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "{\u001c\u0014\u0011\u0095\u0000qx\u001a\u0017:VºîE«";
                           var5 = "{\u001c\u0014\u0011\u0095\u0000qx\u001a\u0017:VºîE«".length();
                           var2 = 0;
                        }

                        var28 = var2;
                        var2 += 8;
                        var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        var27 = var6;
                        var28 = var3++;
                        var34 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var35 = 0;
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

               var15 = "\u0000\u0090+\u008aãw\u009aÌr\u0001ÐWé\"ö\u0097UÜÚå\u0092µj5WðØ.¤dåñ¹B¥h\u0006\u0081~Y\u0018\u0083\u001aÉ¦\u0013ÛM-\u0007»;B\u0011c\u0014næ80JÏÐ¬L";
               var17 = "\u0000\u0090+\u008aãw\u009aÌr\u0001ÐWé\"ö\u0097UÜÚå\u0092µj5WðØ.¤dåñ¹B¥h\u0006\u0081~Y\u0018\u0083\u001aÉ¦\u0013ÛM-\u0007»;B\u0011c\u0014næ80JÏÐ¬L".length();
               var14 = '(';
               var13 = -1;
            }

            ++var13;
            var24 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32117;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/_y", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/_y" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 438;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/_y", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/_y" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
