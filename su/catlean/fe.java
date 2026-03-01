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
import net.minecraft.class_1792;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class fe {
   @NotNull
   private final class_1792 E;
   private final boolean O;
   private final boolean m;
   @NotNull
   private final String U;
   private static final long a = j0.a(2140760461589439884L, 5168843142317611331L, MethodHandles.lookup().lookupClass()).a(131378890365921L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public fe(@NotNull class_1792 item, boolean another, long a, boolean enchanted, @NotNull String name) {
      var3 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.f<invokedynamic>(17330, 1893953614099901642L ^ var3));
      Intrinsics.checkNotNullParameter(var6, true.f<invokedynamic>(27927, 7671150998128181866L ^ var3));
      super();
      this.E = var1;
      this.O = var2;
      this.m = var5;
      this.U = var6;
   }

   public fe(class_1792 var1, boolean var2, boolean var3, String var4, int var5, long var6, DefaultConstructorMarker var8) {
      var6 ^= a;
      long var9 = var6 ^ 47907357120139L;
      if ((var5 & 2) != 0) {
         var2 = false;
      }

      if ((var5 & 4) != 0) {
         var3 = false;
      }

      if ((var5 & true.i<invokedynamic>(28749, 2020197165215953252L ^ var6)) != 0) {
         var4 = "";
      }

      this(var1, var2, var9, var3, var4);
   }

   @NotNull
   public final class_1792 D() {
      return this.E;
   }

   public final boolean R() {
      return this.O;
   }

   public final boolean E() {
      return this.m;
   }

   @NotNull
   public final String q() {
      return this.U;
   }

   @NotNull
   public final class_1792 w() {
      return this.E;
   }

   public final boolean x() {
      return this.O;
   }

   public final boolean c() {
      return this.m;
   }

   @NotNull
   public final String r() {
      return this.U;
   }

   @NotNull
   public final fe O(@NotNull class_1792 item, boolean another, long a, boolean enchanted, @NotNull String name) {
      var3 ^= a;
      long var7 = var3 ^ 98323803545645L;
      Intrinsics.checkNotNullParameter(var1, true.f<invokedynamic>(4021, 1369403798655876446L ^ var3));
      Intrinsics.checkNotNullParameter(var6, true.f<invokedynamic>(10616, 4202119750736780180L ^ var3));
      return new fe(var1, var2, var7, var5, var6);
   }

   public static fe Q(int param0, fe param1, class_1792 param2, int param3, boolean param4, boolean param5, byte param6, String param7, int param8, Object param9) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 86180277903511L;
      String var3 = this.U;
      boolean var4 = this.m;
      boolean var5 = this.O;
      class_1792 var6 = this.E;
      String var10000 = 14948.f<invokedynamic>(14948, 4833225924649965654L ^ var1);
      return var10000 + var6 + true.f<invokedynamic>(15247, 117048142934137275L ^ var1) + var5 + true.f<invokedynamic>(8048, 7890799317629074757L ^ var1) + var4 + true.f<invokedynamic>(29017, 3210364756040651624L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 117663452453133L;
      int var4 = this.E.hashCode();
      var4 = var4 * true.i<invokedynamic>(555, 8025611242671004899L ^ var1) + Boolean.hashCode(this.O);
      k9[] var10000 = -1908973241341043586L.A<invokedynamic>(-1908973241341043586L, var1);
      var4 = var4 * true.i<invokedynamic>(20748, 6529107761466576838L ^ var1) + Boolean.hashCode(this.m);
      k9[] var3 = var10000;
      var4 = var4 * true.i<invokedynamic>(20748, 6529107761466576838L ^ var1) + this.U.hashCode();

      try {
         if (var3 != null) {
            (new int[2]).A<invokedynamic>(new int[2], -1901763581131741664L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, -1908114776403677462L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 70898712112272L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[8];
      int var18 = 0;
      String var17 = "d0±\u001a6cbÏÿ\u00adÈ\b+ýó=\u0010±»K\u009dÂh¡àÕ\t tz¢@G\u0018Ç_\u0093\\\tâ\u001eÒr§\u0001@Ã\u0081Ä\u0004¢ç½[\b«\u0091È \u0010Ü\fÿ\u0081\u001b\u008b\u009f½3XØñ*\u0019vç4\u0011È¥\u009a{z+ê\u0015Nkç\u001c+\u0010¼\u0018\u0099[À\nLþBÎ$<ÔYpã(L\u0000u¿ë\få_~·:{)áÓ~yñ¼§¯ÀRWü\u0018\u009f\u0012óð¥ñ\u008f\tJ<Ôí¿.";
      int var19 = "d0±\u001a6cbÏÿ\u00adÈ\b+ýó=\u0010±»K\u009dÂh¡àÕ\t tz¢@G\u0018Ç_\u0093\\\tâ\u001eÒr§\u0001@Ã\u0081Ä\u0004¢ç½[\b«\u0091È \u0010Ü\fÿ\u0081\u001b\u008b\u009f½3XØñ*\u0019vç4\u0011È¥\u009a{z+ê\u0015Nkç\u001c+\u0010¼\u0018\u0099[À\nLþBÎ$<ÔYpã(L\u0000u¿ë\få_~·:{)áÓ~yñ¼§¯ÀRWü\u0018\u009f\u0012óð¥ñ\u008f\tJ<Ôí¿.".length();
      char var16 = 16;
      int var15 = -1;

      label54:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var28;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  c = new String[8];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "V\u0093 KNu&À\u00889Z\u001d\u001búþÈ";
                  int var5 = "V\u0093 KNu&À\u00889Z\u001d\u001búþÈ".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var26 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     long[] var25 = var6;
                     var26 = var3++;
                     long var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var31 = -1;

                     while(true) {
                        long var8 = var30;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var33 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var31) {
                        case 0:
                           var25[var26] = var33;
                           if (var2 >= var5) {
                              e = var6;
                              f = new Integer[4];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0085\u001c$üßÙ)c¹úËæS\u0090à*";
                           var5 = "\u0085\u001c$üßÙ)c¹úËæS\u0090à*".length();
                           var2 = 0;
                        }

                        var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        var25 = var6;
                        var26 = var3++;
                        var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var31 = 0;
                     }
                  }
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var28;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label54;
               }

               var17 = "cUz\u0000q\u0092,\u0015í\u008ecó&\u009dm\u0017\u0010i=ê\u00957UáG§*`N<x÷ÿ";
               var19 = "cUz\u0000q\u0092,\u0015í\u008ecó&\u009dm\u0017\u0010i=ê\u00957UáG§*`N<x÷ÿ".length();
               var16 = 16;
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16154;
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
            throw new RuntimeException("su/catlean/fe", var10);
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
         throw new RuntimeException("su/catlean/fe" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14974;
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
            throw new RuntimeException("su/catlean/fe", var14);
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
         throw new RuntimeException("su/catlean/fe" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
