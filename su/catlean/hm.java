package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class hm {
   @NotNull
   private final class_2338 B;
   @NotNull
   private final Color D;
   @NotNull
   private final Color L;
   @NotNull
   private final py y;
   @NotNull
   private final vr x;
   private static final long a = j0.a(945791848356497853L, 2379558889727448005L, MethodHandles.lookup().lookupClass()).a(57830871664235L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long[] h;
   private static final Long[] i;
   private static final Map j;

   public hm(@NotNull class_2338 pos, @NotNull Color lineColor, @NotNull Color fillColor, @NotNull py animationMode, @NotNull vr renderMode, long a) {
      var6 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(8686, 607912156936793356L ^ var6));
      Intrinsics.checkNotNullParameter(var2, true.v<invokedynamic>(25205, 8645232729826733713L ^ var6));
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(9261, 2976450258620213453L ^ var6));
      Intrinsics.checkNotNullParameter(var4, true.v<invokedynamic>(2598, 6103279466515220174L ^ var6));
      Intrinsics.checkNotNullParameter(var5, true.v<invokedynamic>(20640, 9070105685398559822L ^ var6));
      super();
      this.B = var1;
      this.D = var2;
      this.L = var3;
      this.y = var4;
      this.x = var5;
   }

   @NotNull
   public final class_2338 p() {
      return this.B;
   }

   @NotNull
   public final Color i() {
      return this.D;
   }

   @NotNull
   public final Color a() {
      return this.L;
   }

   @NotNull
   public final py X() {
      return this.y;
   }

   @NotNull
   public final vr h() {
      return this.x;
   }

   public final void I(long time, @NotNull class_4587 stack, long a) {
      // $FF: Couldn't be decompiled
   }

   private final void O(float param1, class_238 param2, char param3, vr param4, Color param5, Color param6, long param7) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final class_2338 J() {
      return this.B;
   }

   @NotNull
   public final Color T() {
      return this.D;
   }

   @NotNull
   public final Color V() {
      return this.L;
   }

   @NotNull
   public final py K() {
      return this.y;
   }

   @NotNull
   public final vr r() {
      return this.x;
   }

   @NotNull
   public final hm N(@NotNull class_2338 pos, char a, short a, int a, @NotNull Color lineColor, @NotNull Color fillColor, @NotNull py animationMode, @NotNull vr renderMode) {
      long var9 = ((long)var2 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      long var11 = var9 ^ 32880685126910L;
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(20405, 5250596975784632623L ^ var9));
      Intrinsics.checkNotNullParameter(var5, true.v<invokedynamic>(9091, 2256993106493099283L ^ var9));
      Intrinsics.checkNotNullParameter(var6, true.v<invokedynamic>(31876, 8718488156954006033L ^ var9));
      Intrinsics.checkNotNullParameter(var7, true.v<invokedynamic>(8539, 3067187258769330117L ^ var9));
      Intrinsics.checkNotNullParameter(var8, true.v<invokedynamic>(25395, 6032115999082876330L ^ var9));
      return new hm(var1, var5, var6, var7, var8, var11);
   }

   public static hm X(hm param0, class_2338 param1, Color param2, Color param3, py param4, vr param5, long param6, int param8, Object param9) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 40762321405286L;
      vr var3 = this.x;
      py var4 = this.y;
      Color var5 = this.L;
      Color var6 = this.D;
      class_2338 var7 = this.B;
      String var10000 = 6459.v<invokedynamic>(6459, 7661287651036819577L ^ var1);
      return var10000 + var7 + true.v<invokedynamic>(32611, 9153961256547030560L ^ var1) + var6 + true.v<invokedynamic>(9760, 7563416842923233141L ^ var1) + var5 + true.v<invokedynamic>(16070, 4740003630474057623L ^ var1) + var4 + true.v<invokedynamic>(15546, 5818476221864990190L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 42746452195539L;
      int var3 = this.B.hashCode();
      var3 = var3 * true.g<invokedynamic>(5535, 2104051203977054368L ^ var1) + this.D.hashCode();
      var3 = var3 * true.g<invokedynamic>(24936, 7158477545045556308L ^ var1) + this.L.hashCode();
      var3 = var3 * true.g<invokedynamic>(24936, 7158477545045556308L ^ var1) + this.y.hashCode();
      var3 = var3 * true.g<invokedynamic>(24936, 7158477545045556308L ^ var1) + this.x.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var22 = a ^ 106663169414028L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var25 = 1; var25 < 8; ++var25) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[18];
      int var29 = 0;
      String var28 = "cî»{ÊdÌº\u0082ÆÌiîÄI²õâ\u0019U\u0004F\u0082 aà\u0014â\u0097ð[m\u0018îb§Ùó\u009a\u001eÕU\u001bÑYêÕ\u008aâ!\u0097\u007f\u0090\u0096,$[ \u0019Héíõ\u0014öE\b\u0002\u001a\u0082Y±\rãCy©{\u0082P3\u0084ÇSB\fçÒ\u0016\u008a(ct\u0019\u0010\bË\u0000f\u0001ø)\u0087|ß`.6Â«à\u0007\u009cÂ\u009cQºÍõï\u00960óü,ïXÉ8Ê5  Ê\u0082j\u0082X¼÷õ\u0015\u0082½V\u001aIf\u0095ú!\u008d\u0000Ø\u0017kÎä\u001bBø}ú\u0080 YóþïB¸ç\u008aík.Ø8á÷\u0091õÅ\u0096Áð_0Ë\u009f5\u000eúá6\u0015\u0007\u00184\u001eSÿK\u000b³;\u001f\u009fÀgzùÁ\u0017ËÃìÐ×Và\f\u0018ðp\u001b4eJµ(JSú\u0096¾n\u001cc\u001döe(;ç=¶\u0010o\u0080bqå«\u0012j¸&öy>yßd\u0010âÓÎ\u009a8\u001eLz\u0082M\u0094ÂÑL\u0098Ý \u0018\u0015\u0084\u0099\u008bç\u001d¡X¿O¤\u0087G¹\bB°±³a\u0085\u0092\u0007øú^\u0004\u0019üZ©\u0018A\u000eeÉ\f\u0084ªÏD\u0096m\\Ú\u0081£ Ùz¿DïÙfÒ :\u001f±Õ\u0089\u0098½³ Íµ3Ø\u0098¦\u0089)»Z8D\u0005\u0006fÁ\u0001]\u009a)àrÈ\u0018-\u0017GúRçû\u000fj\u0083\u0000º\u0080üh¯+\ba\b'ð\u008c% b+6õ\u001fûP\tóF+\f`ãT \u0000>ÑqnµM^£öÞ\u009aU1é©\u0010\u0094\bÓ\u0011$¹)¥#\u0080)ç\u00adETn";
      int var30 = "cî»{ÊdÌº\u0082ÆÌiîÄI²õâ\u0019U\u0004F\u0082 aà\u0014â\u0097ð[m\u0018îb§Ùó\u009a\u001eÕU\u001bÑYêÕ\u008aâ!\u0097\u007f\u0090\u0096,$[ \u0019Héíõ\u0014öE\b\u0002\u001a\u0082Y±\rãCy©{\u0082P3\u0084ÇSB\fçÒ\u0016\u008a(ct\u0019\u0010\bË\u0000f\u0001ø)\u0087|ß`.6Â«à\u0007\u009cÂ\u009cQºÍõï\u00960óü,ïXÉ8Ê5  Ê\u0082j\u0082X¼÷õ\u0015\u0082½V\u001aIf\u0095ú!\u008d\u0000Ø\u0017kÎä\u001bBø}ú\u0080 YóþïB¸ç\u008aík.Ø8á÷\u0091õÅ\u0096Áð_0Ë\u009f5\u000eúá6\u0015\u0007\u00184\u001eSÿK\u000b³;\u001f\u009fÀgzùÁ\u0017ËÃìÐ×Và\f\u0018ðp\u001b4eJµ(JSú\u0096¾n\u001cc\u001döe(;ç=¶\u0010o\u0080bqå«\u0012j¸&öy>yßd\u0010âÓÎ\u009a8\u001eLz\u0082M\u0094ÂÑL\u0098Ý \u0018\u0015\u0084\u0099\u008bç\u001d¡X¿O¤\u0087G¹\bB°±³a\u0085\u0092\u0007øú^\u0004\u0019üZ©\u0018A\u000eeÉ\f\u0084ªÏD\u0096m\\Ú\u0081£ Ùz¿DïÙfÒ :\u001f±Õ\u0089\u0098½³ Íµ3Ø\u0098¦\u0089)»Z8D\u0005\u0006fÁ\u0001]\u009a)àrÈ\u0018-\u0017GúRçû\u000fj\u0083\u0000º\u0080üh¯+\ba\b'ð\u008c% b+6õ\u001fûP\tóF+\f`ãT \u0000>ÑqnµM^£öÞ\u009aU1é©\u0010\u0094\bÓ\u0011$¹)¥#\u0080)ç\u00adETn".length();
      char var27 = ' ';
      int var26 = -1;

      label72:
      while(true) {
         ++var26;
         String var33 = var28.substring(var26, var26 + var27);
         byte var10001 = -1;

         while(true) {
            byte[] var32 = var24.doFinal(var33.getBytes("ISO-8859-1"));
            String var39 = a(var32).intern();
            switch(var10001) {
            case 0:
               var31[var29++] = var39;
               if ((var26 += var27) >= var30) {
                  b = var31;
                  c = new String[18];
                  g = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var12 = 1; var12 < 8; ++var12) {
                     var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[7];
                  int var14 = 0;
                  String var15 = "Ð3Ç\u0013ÃÝà0°t\u008fy\u0012\u0092ÆºÙF³\u008a\u0018¿¬\u0080\u0085@\u009dÄë Õ¶§mZÎõßUã";
                  int var16 = "Ð3Ç\u0013ÃÝà0°t\u008fy\u0012\u0092ÆºÙF³\u008a\u0018¿¬\u0080\u0085@\u009dÄë Õ¶§mZÎõßUã".length();
                  int var13 = 0;

                  label54:
                  while(true) {
                     int var37 = var13;
                     var13 += 8;
                     byte[] var18 = var15.substring(var37, var13).getBytes("ISO-8859-1");
                     long[] var36 = var17;
                     var37 = var14++;
                     long var41 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                     byte var42 = -1;

                     while(true) {
                        long var19 = var41;
                        byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                        long var44 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                        switch(var42) {
                        case 0:
                           var36[var37] = var44;
                           if (var13 >= var16) {
                              e = var17;
                              f = new Integer[7];
                              j = new HashMap(13);
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long[] var6 = new long[3];
                              int var3 = 0;
                              String var4 = "¾1\u0082\u0017\u0096ËgüuÐ\u008a7½\r5\u008dÚì.d\u000e»ô\u0082";
                              int var5 = "¾1\u0082\u0017\u0096ËgüuÐ\u008a7½\r5\u008dÚì.d\u000e»ô\u0082".length();
                              int var2 = 0;

                              do {
                                 var37 = var2;
                                 var2 += 8;
                                 byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                                 var37 = var3++;
                                 long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                 byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                 var44 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                 boolean var45 = true;
                                 var6[var37] = var44;
                              } while(var2 < var5);

                              h = var6;
                              i = new Long[3];
                              return;
                           }
                           break;
                        default:
                           var36[var37] = var44;
                           if (var13 < var16) {
                              continue label54;
                           }

                           var15 = "â\u0099ÆëÚ\u008a×\u0015ß\u0019\u0089fs\u0011q\u0098";
                           var16 = "â\u0099ÆëÚ\u008a×\u0015ß\u0019\u0089fs\u0011q\u0098".length();
                           var13 = 0;
                        }

                        var37 = var13;
                        var13 += 8;
                        var18 = var15.substring(var37, var13).getBytes("ISO-8859-1");
                        var36 = var17;
                        var37 = var14++;
                        var41 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        var42 = 0;
                     }
                  }
               }

               var27 = var28.charAt(var26);
               break;
            default:
               var31[var29++] = var39;
               if ((var26 += var27) < var30) {
                  var27 = var28.charAt(var26);
                  continue label72;
               }

               var28 = "ý\u008a\u0083¢;\u000f\u0087\u0006,\u0093Z\u0007æ3?\u0085=®³ô\u009aÄðÎ®Üûë\u009a¶\u0011Nic3íó\u00883ä\u0018ö\u0081t4£¥~}ÿ\u0080±\u0098h«È6Áù$}fhO\u0015";
               var30 = "ý\u008a\u0083¢;\u000f\u0087\u0006,\u0093Z\u0007æ3?\u0085=®³ô\u009aÄðÎ®Üûë\u009a¶\u0011Nic3íó\u00883ä\u0018ö\u0081t4£¥~}ÿ\u0080±\u0098h«È6Áù$}fhO\u0015".length();
               var27 = '(';
               var26 = -1;
            }

            ++var26;
            var33 = var28.substring(var26, var26 + var27);
            var10001 = 0;
         }
      }
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23221;
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
            throw new RuntimeException("su/catlean/hm", var10);
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
         throw new RuntimeException("su/catlean/hm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4974;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/hm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("su/catlean/hm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32366;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = h[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/hm", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/hm" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
