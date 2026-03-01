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
import kotlin.text.StringsKt;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class ed implements xp {
   @NotNull
   private hh t;
   @NotNull
   private String d;
   private boolean T;
   private boolean v;
   private static final long a = j0.a(4553080226625712610L, 1260657020504223531L, MethodHandles.lookup().lookupClass()).a(33179678007522L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;
   private static final long i;

   public ed(short a, int a, short a, @NotNull hh type) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var4, true.e<invokedynamic>(5344, 7823341528866070048L ^ var5));
      super();
      this.t = var4;
      this.d = "";
   }

   @NotNull
   public final hh N() {
      return this.t;
   }

   public final void C(int a, short a, @NotNull hh <set-?>, char a) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(32161, 4140650367283449553L ^ var5));
      this.t = var3;
   }

   @NotNull
   public final String q() {
      return this.d;
   }

   public final void t(long a, int a, @NotNull String <set-?>) {
      long var5 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ a;
      Intrinsics.checkNotNullParameter(var4, true.e<invokedynamic>(13474, 3730989567964414765L ^ var5));
      this.d = var4;
   }

   public void A(@NotNull class_332 context, float x, float y, float mouseX, float mouseY, long a) {
      // $FF: Couldn't be decompiled
   }

   public void C(long a, char chr) {
      // $FF: Couldn't be decompiled
   }

   public void x(int key, long a) {
      // $FF: Couldn't be decompiled
   }

   public boolean H(long a, float x, float y, int button) {
      // $FF: Couldn't be decompiled
   }

   private final void l(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 27651598483396L;
      long var5 = var1 ^ 126576855388377L;
      long var7 = var1 ^ 20376634623405L;
      String[] var9 = 8378550582179398396L.A<invokedynamic>(8378550582179398396L, var1);

      boolean var10000;
      label32: {
         label31: {
            try {
               var10000 = StringsKt.isBlank((CharSequence)this.d);
               if (var9 == null) {
                  break label32;
               }

               if (!var10000) {
                  break label31;
               }
            } catch (NumberFormatException var11) {
               throw var11.A<invokedynamic>(var11, 8489231418902953726L, var1);
            }

            var10000 = false;
            break label32;
         }

         var10000 = true;
      }

      try {
         if (var10000) {
            q3.A(this.d, this.t, var3);
            bw.x.f().S(var5);
            sh.P.y(var7);
         }
      } catch (NumberFormatException var10) {
         throw var10.A<invokedynamic>(var10, 8489231418902953726L, var1);
      }

      sh.P.K((xp)null);
   }

   static {
      long var16 = a ^ 41301298299980L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[11];
      int var23 = 0;
      String var22 = "G\u0088\u0098Û\u0098Õu°ù\u0005õ«\u0005ÐU?\u0010£\u0010ô»&õJ)k1×gÑS\u001aB\u0010½I|fóh¨\u0014,í¦-â#4+\u0010Õ\u0016\u0004\u0017QH±Ì\u000b\u001f©\u001c\u001b\u000e ì\u0010\u008bcu´îDg\u0098º_r¦@ô\fî\u0010É\u0007ñg¼\u0002\u008eÈÂÍDñ\u0000Ðy\u0015\u0018Â%\u0088\u0012jgèå«O\u0096:\f\u000f\u0015>\u0017âñ+ÛC\\^\u0018°_´Ýz³Ã0\u0088<\to5¥-\u0096HÃ\u001a\u008fg!\u0093\u0090\u0010ý\u008aûnÁ}\f\u0091ç\u00831®m?¸Æ";
      int var24 = "G\u0088\u0098Û\u0098Õu°ù\u0005õ«\u0005ÐU?\u0010£\u0010ô»&õJ)k1×gÑS\u001aB\u0010½I|fóh¨\u0014,í¦-â#4+\u0010Õ\u0016\u0004\u0017QH±Ì\u000b\u001f©\u001c\u001b\u000e ì\u0010\u008bcu´îDg\u0098º_r¦@ô\fî\u0010É\u0007ñg¼\u0002\u008eÈÂÍDñ\u0000Ðy\u0015\u0018Â%\u0088\u0012jgèå«O\u0096:\f\u000f\u0015>\u0017âñ+ÛC\\^\u0018°_´Ýz³Ã0\u0088<\to5¥-\u0096HÃ\u001a\u008fg!\u0093\u0090\u0010ý\u008aûnÁ}\f\u0091ç\u00831®m?¸Æ".length();
      char var21 = 16;
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
                  b = var25;
                  c = new String[11];
                  h = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[6];
                  int var8 = 0;
                  String var9 = ",.Õ\u001d>ru÷6PÚ\u0016\n\u009b\u001e#DãÎhÒJØ\u0010Þ¸Á\u0081²l\u008e\u0007";
                  int var10 = ",.Õ\u001d>ru÷6PÚ\u0016\n\u009b\u001e#DãÎhÒJØ\u0010Þ¸Á\u0081²l\u008e\u0007".length();
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
                              g = new Integer[6];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = -4333465255895617206L;
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

                           var9 = "Õ\u0011`aRÆQ>\u009eÖW`\u0092¿õª";
                           var10 = "Õ\u0011`aRÆQ>\u009eÖW`\u0092¿õª".length();
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

               var22 = "\u007f\u0006N«:®¬×W\u008ae2ð\u008bR¯\u0010\u001bG\u0007\u0016Í½/¤\u009cÒfÆ\u0084vÊ0";
               var24 = "\u007f\u0006N«:®¬×W\u008ae2ð\u008bR¯\u0010\u001bG\u0007\u0016Í½/¤\u009cÒfÆ\u0084vÊ0".length();
               var21 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17174;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ed", var10);
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
         throw new RuntimeException("su/catlean/ed" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27397;
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
            throw new RuntimeException("su/catlean/ed", var14);
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
         throw new RuntimeException("su/catlean/ed" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
