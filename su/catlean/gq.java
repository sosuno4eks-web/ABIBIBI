package su.catlean;

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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class gq {
   private final float a;
   private final float P;
   @NotNull
   private final p5 B;
   @NotNull
   private final aa x;
   private static final long b = j0.a(5107086179589888874L, 5589785971688268122L, MethodHandles.lookup().lookupClass()).a(237212693767056L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;
   private static final long i;

   public gq(int a, char a, float x, float w, @NotNull p5 subCategory, @NotNull aa animation, char a) {
      long var8 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ b;
      Intrinsics.checkNotNullParameter(var5, true.w<invokedynamic>(7002, 7941993448151270431L ^ var8));
      Intrinsics.checkNotNullParameter(var6, true.w<invokedynamic>(22929, 3526345852257732310L ^ var8));
      super();
      this.a = var3;
      this.P = var4;
      this.B = var5;
      this.x = var6;
   }

   // $FF: synthetic method
   public gq(float var1, float var2, p5 var3, long var4, aa var6, int var7, DefaultConstructorMarker var8, byte var9) {
      long var10 = (var4 << 8 | (long)var9 << 56 >>> 56) ^ b;
      long var10001 = var10 ^ 11792887800691L;
      int var12 = (int)((var10 ^ 11792887800691L) >>> 48);
      int var13 = (int)(var10001 << 16 >>> 48);
      int var14 = (int)(var10001 << 32 >>> 32);
      var10001 = var10 ^ 42313190460640L;
      int var15 = (int)((var10 ^ 42313190460640L) >>> 32);
      int var16 = (int)(var10001 << 32 >>> 48);
      int var17 = (int)(var10001 << 48 >>> 48);
      if ((var7 & true.g<invokedynamic>(8019, 7297891094012034101L ^ var10)) != 0) {
         var6 = new aa(sa.OUT_EXPO, i, (short)var12, (short)var13, var14);
      }

      this(var15, (char)var16, var1, var2, var3, var6, (char)var17);
   }

   public final float g() {
      return this.a;
   }

   public final float p() {
      return this.P;
   }

   @NotNull
   public final p5 v() {
      return this.B;
   }

   @NotNull
   public final aa r() {
      return this.x;
   }

   public final float C() {
      return this.a;
   }

   public final float T() {
      return this.P;
   }

   @NotNull
   public final p5 m() {
      return this.B;
   }

   @NotNull
   public final aa K() {
      return this.x;
   }

   @NotNull
   public final gq s(float x, long a, float w, @NotNull p5 subCategory, @NotNull aa animation) {
      var2 ^= b;
      long var10001 = var2 ^ 103205393825168L;
      int var7 = (int)((var2 ^ 103205393825168L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var5, true.w<invokedynamic>(26421, 8969129778187600995L ^ var2));
      Intrinsics.checkNotNullParameter(var6, true.w<invokedynamic>(2726, 1964386458143943154L ^ var2));
      return new gq(var7, (char)var8, var1, var4, var5, var6, (char)var9);
   }

   // $FF: synthetic method
   public static gq u(long param0, gq param2, float param3, float param4, p5 param5, aa param6, int param7, Object param8) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 51996822620642L;
      aa var3 = this.x;
      p5 var4 = this.B;
      float var5 = this.P;
      float var6 = this.a;
      String var10000 = 14575.w<invokedynamic>(14575, 4103416395092405628L ^ var1);
      return var10000 + var6 + true.w<invokedynamic>(32627, 7070639546940910306L ^ var1) + var5 + true.w<invokedynamic>(13599, 6505370521686220938L ^ var1) + var4 + true.w<invokedynamic>(22354, 5712731662633616069L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = b ^ 47431214228905L;
      int var3 = Float.hashCode(this.a);
      var3 = var3 * true.g<invokedynamic>(16120, 8330072059550348902L ^ var1) + Float.hashCode(this.P);
      var3 = var3 * true.g<invokedynamic>(23080, 5730312779150742196L ^ var1) + this.B.hashCode();
      var3 = var3 * true.g<invokedynamic>(23080, 5730312779150742196L ^ var1) + this.x.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var16 = b ^ 106310411524961L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[8];
      int var23 = 0;
      String var22 = "VDrN6òW\u009e¦\u008b\u0088P\u0014§¤5@ÙðèÌ\u0096\u00946p\u0094ròYY\u001dö ¦fÊÊ3\u00880«ôÃÒÅVÁwÓ:¼ÒÌ¦#ntû\u001es\u0011Yæ\u000f¾\u0018\u009f\u001c\r?5+ÿ\u0010\u0099^\r\u0019\u008e´;7ë\u0087\naút¡\u0011\u0018q\u0082\u0099Ô-ï\u0083Ê\u0018øJ¯\u0015\u009a\u0004Aµ6C¤ùò\u009eØ\u0018\u00882\u0094\u009eÎHü%b%ßô°Z\u007f\u0000XûY\u001a\u0086 \u0015m\u0018\u0007yNï\b ÓTG\u0096LeÈp\u000b¶íÇ\u00adI\u00ad\u0012¿#";
      int var24 = "VDrN6òW\u009e¦\u008b\u0088P\u0014§¤5@ÙðèÌ\u0096\u00946p\u0094ròYY\u001dö ¦fÊÊ3\u00880«ôÃÒÅVÁwÓ:¼ÒÌ¦#ntû\u001es\u0011Yæ\u000f¾\u0018\u009f\u001c\r?5+ÿ\u0010\u0099^\r\u0019\u008e´;7ë\u0087\naút¡\u0011\u0018q\u0082\u0099Ô-ï\u0083Ê\u0018øJ¯\u0015\u009a\u0004Aµ6C¤ùò\u009eØ\u0018\u00882\u0094\u009eÎHü%b%ßô°Z\u007f\u0000XûY\u001a\u0086 \u0015m\u0018\u0007yNï\b ÓTG\u0096LeÈp\u000b¶íÇ\u00adI\u00ad\u0012¿#".length();
      char var21 = ' ';
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var27 = var22.substring(var20, var20 + var21);
         byte var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = a(var26).intern();
            switch(var10001) {
            case 0:
               var25[var23++] = var33;
               if ((var20 += var21) >= var24) {
                  c = var25;
                  d = new String[8];
                  h = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[4];
                  int var8 = 0;
                  String var9 = "ÒA[\u0016¸ÚòÉ¢N\u00146ÙôÌ(";
                  int var10 = "ÒA[\u0016¸ÚòÉ¢N\u00146ÙôÌ(".length();
                  int var7 = 0;

                  label46:
                  while(true) {
                     int var31 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                     long[] var30 = var11;
                     var31 = var8++;
                     long var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte var37 = -1;

                     while(true) {
                        long var13 = var36;
                        byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                        long var39 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                        switch(var37) {
                        case 0:
                           var30[var31] = var39;
                           if (var7 >= var10) {
                              f = var11;
                              g = new Integer[4];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = 1979319672560812261L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var34 = true;
                              i = var36;
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var39;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "> [Îµ=²×³Hé9æ\u0099\u0012\u009f";
                           var10 = "> [Îµ=²×³Hé9æ\u0099\u0012\u009f".length();
                           var7 = 0;
                        }

                        var31 = var7;
                        var7 += 8;
                        var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                        var30 = var11;
                        var31 = var8++;
                        var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        var37 = 0;
                     }
                  }
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var33;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label64;
               }

               var22 = "÷h»ß\u0006=Ký\u0098-\u0002z÷Îõ\u008b\"d3Æ\u009e|ò}áa¬o½L.ý\u0010\rÂ\u0013/\u0096\u00199ù\u0005dK\u0092Ê³/a";
               var24 = "÷h»ß\u0006=Ký\u0098-\u0002z÷Îõ\u008b\"d3Æ\u009e|ò}áa¬o½L.ý\u0010\rÂ\u0013/\u0096\u00199ù\u0005dK\u0092Ê³/a".length();
               var21 = ' ';
               var20 = -1;
            }

            ++var20;
            var27 = var22.substring(var20, var20 + var21);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7665;
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
            throw new RuntimeException("su/catlean/gq", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/gq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11442;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/gq", var14);
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
         throw new RuntimeException("su/catlean/gq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
