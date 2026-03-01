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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class db implements xp {
   @NotNull
   private final Function1 K;
   @NotNull
   private String z;
   private int u;
   private boolean p;
   private static int[] d;
   private static final long a = j0.a(6507683104718304877L, 1545965620682814392L, MethodHandles.lookup().lookupClass()).a(120781844089449L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;
   private static final long i;

   public db(@NotNull Function1 action, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.y<invokedynamic>(29512, 1474968444364755328L ^ var2));
      super();
      this.K = var1;
      this.z = "";
   }

   @NotNull
   public final Function1 d() {
      return this.K;
   }

   @NotNull
   public final String l() {
      return this.z;
   }

   public final void E(long a, @NotNull String <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.y<invokedynamic>(11398, 7766016550439293138L ^ var1));
      this.z = var3;
   }

   public final int t() {
      return this.u;
   }

   public final void e(int <set-?>) {
      this.u = var1;
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

   private final void b(long var1) {
      var1 ^= a;
      int[] var3 = 4668203083520073596L.A<invokedynamic>(4668203083520073596L, var1);

      boolean var10000;
      label30: {
         label29: {
            try {
               var10000 = StringsKt.isBlank((CharSequence)this.z);
               if (var3 != null) {
                  break label30;
               }

               if (!var10000) {
                  break label29;
               }
            } catch (NumberFormatException var5) {
               throw var5.A<invokedynamic>(var5, 4671565892926371476L, var1);
            }

            var10000 = false;
            break label30;
         }

         var10000 = true;
      }

      try {
         if (var10000) {
            this.K.invoke(this.z);
         }

      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, 4671565892926371476L, var1);
      }
   }

   public static void o(int[] var0) {
      d = var0;
   }

   public static int[] T() {
      return d;
   }

   static {
      long var25 = a ^ 51124241873483L;
      e = new HashMap(13);
      null.A<invokedynamic>((Object)null, -1544057906524005419L, var25);
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var17 = 1; var17 < 8; ++var17) {
         var10003[var17] = (byte)((int)(var25 << var17 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[11];
      int var21 = 0;
      String var20 = "òï~B'S\u0092#EJ\u000eàRÓÈ}\u0010\u0099©\u0081Ü\nóü\u000fÈ\u000fFY\u001dÞÖJ\u0010·Ó¹#ä\u00ad\u008e\u009ccê\u0080\u0099¿+f\u0015\u0018j\u008f\u0083\u0098\u008c<=mH ~éÞÁÆ\u008e=b8ã1Ã\u0013Ê(U\u009b±sd\u0002PÌ\u008fÕßà ¬\u000enûíæ½Ô5\u008eWhvñÍ\u008aê\u0010\u008d[úx÷:?dK\u0018\u0088\u0086Y<\u008aC\u0091ý\u001dyíB¨\u0007\u0098]\u0087p§L\u0093Ç\u0018\u008b\u0010yT]I\u009d\u0090ß\u0097\u0010\u0095Q^\rÌu\u0084\u0010\u0088²2å\u0006à5UªæÇ\u001däN\u0004Ô\u0010¼Ü\u0081'\u0095Â@¼LÌ÷î©{Ú¯";
      int var22 = "òï~B'S\u0092#EJ\u000eàRÓÈ}\u0010\u0099©\u0081Ü\nóü\u000fÈ\u000fFY\u001dÞÖJ\u0010·Ó¹#ä\u00ad\u008e\u009ccê\u0080\u0099¿+f\u0015\u0018j\u008f\u0083\u0098\u008c<=mH ~éÞÁÆ\u008e=b8ã1Ã\u0013Ê(U\u009b±sd\u0002PÌ\u008fÕßà ¬\u000enûíæ½Ô5\u008eWhvñÍ\u008aê\u0010\u008d[úx÷:?dK\u0018\u0088\u0086Y<\u008aC\u0091ý\u001dyíB¨\u0007\u0098]\u0087p§L\u0093Ç\u0018\u008b\u0010yT]I\u009d\u0090ß\u0097\u0010\u0095Q^\rÌu\u0084\u0010\u0088²2å\u0006à5UªæÇ\u001däN\u0004Ô\u0010¼Ü\u0081'\u0095Â@¼LÌ÷î©{Ú¯".length();
      char var19 = 16;
      int var18 = -1;

      label64:
      while(true) {
         ++var18;
         String var27 = var20.substring(var18, var18 + var19);
         byte var10001 = -1;

         while(true) {
            byte[] var24 = var16.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = a(var24).intern();
            switch(var10001) {
            case 0:
               var23[var21++] = var33;
               if ((var18 += var19) >= var22) {
                  b = var23;
                  c = new String[11];
                  h = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var25 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[7];
                  int var8 = 0;
                  String var9 = "\u0010; B\u000eï \u0000\u0086,\u001b\u0088x\u0097TU\u008fmr\u0014ãÕ ¶¶ êÖp_EÌ\u0015\u0006Â±¤ø\u0096ë";
                  int var10 = "\u0010; B\u000eï \u0000\u0086,\u001b\u0088x\u0097TU\u008fmr\u0014ãÕ ¶¶ êÖp_EÌ\u0015\u0006Â±¤ø\u0096ë".length();
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
                              g = new Integer[7];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var25 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = -6008695554966495249L;
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

                           var9 = "¤\u001dÍ\r©Ûãá¨1\u0087\u008b\u0015z(\u007f";
                           var10 = "¤\u001dÍ\r©Ûãá¨1\u0087\u008b\u0015z(\u007f".length();
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

               var19 = var20.charAt(var18);
               break;
            default:
               var23[var21++] = var33;
               if ((var18 += var19) < var22) {
                  var19 = var20.charAt(var18);
                  continue label64;
               }

               var20 = "QwÓ\u0095x'-Q\u008d\u0091ùaæòÚ\u000e\u0010\u0092 QðirÖô\u0089îm\u001cþ\u0082Õj";
               var22 = "QwÓ\u0095x'-Q\u008d\u0091ùaæòÚ\u000e\u0010\u0092 QðirÖô\u0089îm\u001cþ\u0082Õj".length();
               var19 = 16;
               var18 = -1;
            }

            ++var18;
            var27 = var20.substring(var18, var18 + var19);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24113;
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
            throw new RuntimeException("su/catlean/db", var10);
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
         throw new RuntimeException("su/catlean/db" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18339;
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
            throw new RuntimeException("su/catlean/db", var14);
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
         throw new RuntimeException("su/catlean/db" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
