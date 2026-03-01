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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zz extends zt {
   @NotNull
   private final List o;
   @NotNull
   private final Function1 K;
   @NotNull
   private final Function1 N;
   @Nullable
   private String h;
   private boolean V;
   @NotNull
   private String U;
   private boolean q;
   private boolean n;
   private static final long a = j0.a(-94139550180000901L, 5793848324949480512L, MethodHandles.lookup().lookupClass()).a(48312089079503L);
   private static final String[] c;
   private static final String[] f;
   private static final Map i = new HashMap(13);
   private static final long[] l;
   private static final Integer[] m;
   private static final Map p;
   private static final long r;

   public zz(short a, @NotNull List list, int a, @NotNull Function1 clickAction, char a, @NotNull Function1 clickRemoveAction) {
      long var7 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ a;
      long var9 = var7 ^ 29995205555520L;
      Intrinsics.checkNotNullParameter(var2, true.e<invokedynamic>(11777, 3817721301864317772L ^ var7));
      Intrinsics.checkNotNullParameter(var4, true.e<invokedynamic>(32430, 1338737867860562921L ^ var7));
      Intrinsics.checkNotNullParameter(var6, true.e<invokedynamic>(16700, 4647745588172483706L ^ var7));
      super(var9);
      this.o = var2;
      this.K = var4;
      this.N = var6;
      this.U = "";
   }

   @NotNull
   public final List L() {
      return this.o;
   }

   @NotNull
   public final Function1 B() {
      return this.K;
   }

   @NotNull
   public final Function1 X() {
      return this.N;
   }

   public void X(@NotNull class_332 context, int mouseX, int mouseY, long a) {
      // $FF: Couldn't be decompiled
   }

   public void p(int a, char a, int mouseX, short a, int mouseY, int mouseButton) {
      // $FF: Couldn't be decompiled
   }

   public void P(int key, long a) {
      // $FF: Couldn't be decompiled
   }

   private final void q(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void B(char char, int a, int a) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var16 = a ^ 92976890075988L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[14];
      int var23 = 0;
      String var22 = "¥\u0003\u0092ÛÎP| MpøÀ¡\u0096ÁÎW´U{ü\u0099ç·\u0007'«£\u0007Ï\u00adS Ljà\u000e}e\u0090Ò\"\u0016!.\\ÊCW\u0014<Æ\u00941¢¥É@UZìj¼w: GÏÄ(¿\u0010¸±ãg\u001e\u008dæ/QË,Â\nnjë\u0010¨Á{^\u00876ëXy \b\\\u001f\u0000\u000b\u008e\u0094*¬}Úâ\u0095\u009e]\u00975þA.Ñ¥¥ãÊñw^k\u0091iÎ\u0010zµ\u008e7æ\u0087\u001dã[¬\u0019?ùñO\u000e\u0018oDÿ2Ñ\u0081\u0006\u0098höïË{\u0080lKÐ\u0097\u0015\u0013b\u0004Çù \u0098\u008fX\u0000W\f¡j:\u0092\u009f0r\u0099Js¼Å\u008a\u0092N\u008aZ\u0098lU\u0001A4»\u008bð(îKîX\u0085¶lòé®¦\u0016\u0097\"vâ,¨Íô\\<°ÿÀî\u0001=]cT3¤ü\"\u001d\rdf\u0092\u0018Yv\u009bb/òpÝ,ëÙRy¦ÊÐÞ/|é\u0002òÀ\n\u0010\b\u0086}Æ¯°àÂ=m¹\u0014²öÊ¦\u0010^BÛ\u008b\u0005È(Â¶\u008d®ÿd:ÑT\u0010\u0005\u0099\u0003£Kñ2\u0010ò>\t7\u007f8ûI";
      int var24 = "¥\u0003\u0092ÛÎP| MpøÀ¡\u0096ÁÎW´U{ü\u0099ç·\u0007'«£\u0007Ï\u00adS Ljà\u000e}e\u0090Ò\"\u0016!.\\ÊCW\u0014<Æ\u00941¢¥É@UZìj¼w: GÏÄ(¿\u0010¸±ãg\u001e\u008dæ/QË,Â\nnjë\u0010¨Á{^\u00876ëXy \b\\\u001f\u0000\u000b\u008e\u0094*¬}Úâ\u0095\u009e]\u00975þA.Ñ¥¥ãÊñw^k\u0091iÎ\u0010zµ\u008e7æ\u0087\u001dã[¬\u0019?ùñO\u000e\u0018oDÿ2Ñ\u0081\u0006\u0098höïË{\u0080lKÐ\u0097\u0015\u0013b\u0004Çù \u0098\u008fX\u0000W\f¡j:\u0092\u009f0r\u0099Js¼Å\u008a\u0092N\u008aZ\u0098lU\u0001A4»\u008bð(îKîX\u0085¶lòé®¦\u0016\u0097\"vâ,¨Íô\\<°ÿÀî\u0001=]cT3¤ü\"\u001d\rdf\u0092\u0018Yv\u009bb/òpÝ,ëÙRy¦ÊÐÞ/|é\u0002òÀ\n\u0010\b\u0086}Æ¯°àÂ=m¹\u0014²öÊ¦\u0010^BÛ\u008b\u0005È(Â¶\u008d®ÿd:ÑT\u0010\u0005\u0099\u0003£Kñ2\u0010ò>\t7\u007f8ûI".length();
      char var21 = ' ';
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var27 = var22.substring(var20, var20 + var21);
         byte var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = b(var26).intern();
            switch(var10001) {
            case 0:
               var25[var23++] = var33;
               if ((var20 += var21) >= var24) {
                  c = var25;
                  f = new String[14];
                  p = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[10];
                  int var8 = 0;
                  String var9 = "Ý\u0096-\u0084à\u0090Ò¹c\u0087äð\u0012À\nM\u0006\u009b\u0098N\u0085\"xg\u0012\u007f\u008f\u0012\u008e/Ü¢BnÈ\u0006þÓ\u009eØ;Ü¸R~UJjL\u008eZ~£\u0081»½\u009f\u0015ñ\u0016E¿Îú";
                  int var10 = "Ý\u0096-\u0084à\u0090Ò¹c\u0087äð\u0012À\nM\u0006\u009b\u0098N\u0085\"xg\u0012\u007f\u008f\u0012\u008e/Ü¢BnÈ\u0006þÓ\u009eØ;Ü¸R~UJjL\u008eZ~£\u0081»½\u009f\u0015ñ\u0016E¿Îú".length();
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
                              l = var11;
                              m = new Integer[10];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = 3793850254805873967L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var34 = true;
                              r = var36;
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var39;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "@÷1\u008fÅ>²½ßp¸90\næò";
                           var10 = "@÷1\u008fÅ>²½ßp¸90\næò".length();
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

               var22 = "\u00ad¤ \u00adÖÉÛÅÐcgêJÍ\u0097ÿ\u0010\u0085\u0098DÏlV±è8!3\u001d\u0098x>×";
               var24 = "\u00ad¤ \u00adÖÉÛÅÐcgêJÍ\u0097ÿ\u0010\u0085\u0098DÏlV±è8!3\u001d\u0098x>×".length();
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 8635;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/zz", var10);
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
         f[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
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
         throw new RuntimeException("su/catlean/zz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 25668;
      if (m[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = l[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/zz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
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
         throw new RuntimeException("su/catlean/zz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
