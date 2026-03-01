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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1713;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class r2 {
   private final int H;
   private final int C;
   private final int W;
   @NotNull
   private final class_1713 B;
   private static final long a = j0.a(9118474222230271529L, 2632672612426033160L, MethodHandles.lookup().lookupClass()).a(243710692468620L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public r2(long a, int syncId, int slotId, int button, @NotNull class_1713 actionType, char a) {
      long var8 = (var1 << 16 | (long)var7 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var6, true.b<invokedynamic>(15099, 2273701734728409448L ^ var8));
      super();
      this.H = var3;
      this.C = var4;
      this.W = var5;
      this.B = var6;
   }

   public final int R() {
      return this.H;
   }

   public final int I() {
      return this.C;
   }

   public final int a() {
      return this.W;
   }

   @NotNull
   public final class_1713 D() {
      return this.B;
   }

   public final int B() {
      return this.H;
   }

   public final int K() {
      return this.C;
   }

   public final int m() {
      return this.W;
   }

   @NotNull
   public final class_1713 E() {
      return this.B;
   }

   @NotNull
   public final r2 K(int syncId, int slotId, long a, int button, @NotNull class_1713 actionType) {
      var3 ^= a;
      long var10001 = var3 ^ 96716713695906L;
      long var7 = (var3 ^ 96716713695906L) >>> 16;
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var6, true.b<invokedynamic>(1936, 5261459345236422060L ^ var3));
      return new r2(var7, var1, var2, var5, var6, (char)var9);
   }

   // $FF: synthetic method
   public static r2 D(r2 param0, int param1, int param2, int param3, class_1713 param4, int param5, long param6, Object param8) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 57241176487985L;
      class_1713 var3 = this.B;
      int var4 = this.W;
      int var5 = this.C;
      int var6 = this.H;
      String var10000 = 12353.b<invokedynamic>(12353, 3842515594517138974L ^ var1);
      return var10000 + var6 + true.b<invokedynamic>(12027, 5214311600032895143L ^ var1) + var5 + true.b<invokedynamic>(29143, 5280316080867839886L ^ var1) + var4 + true.b<invokedynamic>(5016, 7536668703773978048L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 16008557885411L;
      int var4 = Integer.hashCode(this.H);
      var4 = var4 * true.n<invokedynamic>(12900, 5277783447148699566L ^ var1) + Integer.hashCode(this.C);
      String[] var10000 = -7078825763255741634L.A<invokedynamic>(-7078825763255741634L, var1);
      var4 = var4 * true.n<invokedynamic>(28954, 399357691419024594L ^ var1) + Integer.hashCode(this.W);
      var4 = var4 * true.n<invokedynamic>(28954, 399357691419024594L ^ var1) + this.B.hashCode();
      String[] var3 = var10000;

      try {
         if (var3 == null) {
            (new int[2]).A<invokedynamic>(new int[2], -7079139123451699590L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, -7112194137051065364L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 118682347232383L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[6];
      int var18 = 0;
      String var17 = "\u0005D\u0098\u0096{\u008d±Ä\u007fÈø²\u0087RÕ DøOrZ\u009f\u0018v\u001ddF[³;E£\u0018ª};³¬^\u00adI´Ì\"\tÙ~Åþ\u0004\t|\u0098J«(\u0015\u0018\u009eê\u0089ge\u0006Z\u0006\u009b\u001d»Y\u008bI¦ÊB~°-\u000eìûµ(g\u009eìZ;/PTMÇwXFÝJ\u008d¢ÁxP<ì\u001eô\u0011kâã¦p´°8\u0088Ú\u00964PW\u0007";
      int var19 = "\u0005D\u0098\u0096{\u008d±Ä\u007fÈø²\u0087RÕ DøOrZ\u009f\u0018v\u001ddF[³;E£\u0018ª};³¬^\u00adI´Ì\"\tÙ~Åþ\u0004\t|\u0098J«(\u0015\u0018\u009eê\u0089ge\u0006Z\u0006\u009b\u001d»Y\u008bI¦ÊB~°-\u000eìûµ(g\u009eìZ;/PTMÇwXFÝJ\u008d¢ÁxP<ì\u001eô\u0011kâã¦p´°8\u0088Ú\u00964PW\u0007".length();
      char var16 = ' ';
      int var15 = -1;

      label45:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var27 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var27;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  c = new String[6];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "\u0001¸'ÃÃ]h³\u0094ÄT¤K\u0018?\u008cÑ é\u0083\u0002\u0002\u0089~";
                  int var5 = "\u0001¸'ÃÃ]h³\u0094ÄT¤K\u0018?\u008cÑ é\u0083\u0002\u0002\u0089~".length();
                  int var2 = 0;

                  do {
                     int var25 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var25, var2).getBytes("ISO-8859-1");
                     var25 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var29 = true;
                     var6[var25] = var10004;
                  } while(var2 < var5);

                  e = var6;
                  f = new Integer[3];
                  return;
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var27;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label45;
               }

               var17 = "\u000b¤ìô\u0004£n~¸\u007f'\u00ad\u0014\u0087[\u0016vú\"f\u0080qOy¿ÙRÑ*ÅMç °G\u009e;P\thürQ7¤\r'õü\u0015,a\u008a¤$\u0096\u008a\u009c\u0096½Üq¦;æ";
               var19 = "\u000b¤ìô\u0004£n~¸\u007f'\u00ad\u0014\u0087[\u0016vú\"f\u0080qOy¿ÙRÑ*ÅMç °G\u009e;P\thürQ7¤\r'õü\u0015,a\u008a¤$\u0096\u008a\u009c\u0096½Üq¦;æ".length();
               var16 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11619;
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
            throw new RuntimeException("su/catlean/r2", var10);
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
         throw new RuntimeException("su/catlean/r2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12581;
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
            throw new RuntimeException("su/catlean/r2", var14);
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
         throw new RuntimeException("su/catlean/r2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
