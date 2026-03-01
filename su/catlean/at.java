package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2fStack;

public final class at extends a_ {
   @NotNull
   private final zf C;
   private boolean B;
   private boolean R;
   private boolean U;
   private boolean y;
   @NotNull
   private final aa k;
   @NotNull
   private final aa i;
   @NotNull
   private final aa L;
   @NotNull
   private final ArrayList p;
   private static final long a = j0.a(-3347163723278004826L, 4305899716838865770L, MethodHandles.lookup().lookupClass()).a(63231507538996L);
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);
   private static final long[] j;
   private static final Integer[] l;
   private static final Map m;
   private static final long[] n;
   private static final Long[] o;
   private static final Map q;

   public at(@NotNull zf setting, short a, long a) {
      long var5 = ((long)var2 << 48 | var3 << 16 >>> 16) ^ a;
      long var7 = var5 ^ 101523717126343L;
      long var9 = var5 ^ 131967959451444L;
      long var10001 = var5 ^ 28444856029868L;
      int var11 = (int)((var5 ^ 28444856029868L) >>> 48);
      int var12 = (int)(var10001 << 16 >>> 48);
      int var13 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(22207, 7448775179716871926L ^ var5));
      super(var7, var1);
      this.C = var1;
      this.k = new aa(sa.OUT_QUINT, true.t<invokedynamic>(32484, 1814708923095050406L ^ var5), (short)var11, (short)var12, var13);
      this.i = new aa(sa.OUT_QUINT, true.t<invokedynamic>(424, 7002637978013964267L ^ var5), (short)var11, (short)var12, var13);
      this.L = new aa(sa.OUT_QUINT, true.t<invokedynamic>(424, 7002637978013964267L ^ var5), (short)var11, (short)var12, var13);
      this.p = new ArrayList();
      byte var14 = 4;
      int var15 = 0;

      while(var15 < var14) {
         boolean var17 = false;
         this.p.add(new ra(this.t(), this.i(), this.R(), var9, var15));
         ++var15;
         if (var3 > 0L && var2 >= 0) {
            continue;
         }
      }

   }

   @NotNull
   public zf t() {
      return this.C;
   }

   public void v(@NotNull class_332 context, long a, char a, int mouseX, int mouseY, float factor) {
      // $FF: Couldn't be decompiled
   }

   private final void U(int var1, short var2, int var3, Matrix3x2fStack var4, int var5, int var6) {
      long var7 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var10001 = var7 ^ 114362728613520L;
      int var9 = (int)((var7 ^ 114362728613520L) >>> 32);
      int var10 = (int)(var10001 << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var7 ^ 19065463986800L;
      int[] var10000 = -3983809716204745285L.A<invokedynamic>(-3983809716204745285L, var7);
      float var15 = this.i() + this.L() - 48.0F + 2.0F;
      int[] var14 = var10000;
      float var16 = this.R() + 10.0F + 2.0F;
      float[] var17 = new float[3];

      int var21;
      label20: {
         try {
            Color.RGBtoHSB(((Color)this.t().B()).getRed(), ((Color)this.t().B()).getGreen(), ((Color)this.t().B()).getBlue(), var17);
            float var22 = var15 - 4.0F + (float)true.e<invokedynamic>(12501, 1391856364779857886L ^ var7) * var17[1];
            float var10002 = var16 - 4.0F + (float)true.e<invokedynamic>(21791, 8688324687561392671L ^ var7) * (1.0F - var17[2]);
            char var10009 = (char)var10;
            Color var10011 = (Color)this.t().B();
            Color var10012 = Color.BLACK;
            Intrinsics.checkNotNullExpressionValue(var10012, true.b<invokedynamic>(10666, 4082921217914654216L ^ var7));
            _8.M(var4, var22, var10002, 7.0F, 7.0F, 2.5F, var9, 1.5F, 1.0F, var10009, 1.0F, var10011, var10012, 0.0F, 0.0F, (short)var11, 0.0F, true.e<invokedynamic>(3867, 4597768954703271960L ^ var7), (Object)null);
            var21 = this.R;
            if (var14 != null) {
               break label20;
            }

            if (var21 == 0) {
               return;
            }
         } catch (NumberFormatException var20) {
            throw var20.A<invokedynamic>(var20, -3971671760089542559L, var7);
         }

         var21 = var5;
      }

      float var18 = Math.clamp(((float)var21 - var15) / 40.0F, 0.0F, 1.0F);
      float var19 = Math.clamp(1.0F - ((float)var6 - var16) / 40.0F, 0.0F, 1.0F);
      this.t().v(gk.E.e(var12, new Color(Color.HSBtoRGB(var17[0], var18, var19)), (float)((Color)this.t().B()).getAlpha() / 255.0F));
   }

   private final void F(byte var1, int var2, Matrix3x2fStack var3, int var4, int var5) {
      long var6 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var5 << 40 >>> 40) ^ a;
      long var10001 = var6 ^ 13754541712512L;
      int var8 = (int)((var6 ^ 13754541712512L) >>> 32);
      int var9 = (int)(var10001 << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var6 ^ 129563484452960L;
      float var13 = this.R() + 11.0F;
      _8.M(var3, this.i() + 58.0F, var13 - 4.0F + (float)true.e<invokedynamic>(15142, 2046669390855851579L ^ var6) * (1.0F - (float)((Color)this.t().B()).getAlpha() / 255.0F), 7.0F, 7.0F, 2.5F, var8, 1.0F, 1.0F, (char)var9, 1.0F, (Color)this.t().B(), gk.E.e(var11, (Color)this.t().B(), 1.0F), 0.0F, 0.0F, (short)var10, 0.0F, true.e<invokedynamic>(3867, 4597869556506720776L ^ var6), (Object)null);
      if (this.U) {
         float var14 = Math.clamp(1.0F - ((float)var4 - var13) / 39.0F, 0.0F, 1.0F);
         this.t().v(gk.E.e(var11, (Color)this.t().B(), var14));
      }

   }

   private final void t(Matrix3x2fStack var1, int var2, long var3) {
      var3 ^= a;
      long var10001 = var3 ^ 84253494510411L;
      int var5 = (int)((var3 ^ 84253494510411L) >>> 32);
      int var6 = (int)(var10001 << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      long var8 = var3 ^ 59325988560811L;
      float var11 = this.i();
      int[] var10000 = -3644099806649792416L.A<invokedynamic>(-3644099806649792416L, var3);
      float[] var12 = new float[3];
      Color.RGBtoHSB(((Color)this.t().B()).getRed(), ((Color)this.t().B()).getGreen(), ((Color)this.t().B()).getBlue(), var12);
      _8.M(var1, var11 - 3.5F + (float)true.e<invokedynamic>(15725, 9031547909852295098L ^ var3) * var12[0], this.R() + 52.0F, 7.0F, 7.0F, 2.5F, var5, 1.0F, 1.0F, (char)var6, 1.0F, new Color(Color.HSBtoRGB(var12[0], 1.0F, 1.0F)), new Color(Color.HSBtoRGB(var12[0], 1.0F, 1.0F)), 0.0F, 0.0F, (short)var7, 0.0F, true.e<invokedynamic>(12824, 4877009852432146634L ^ var3), (Object)null);
      int[] var10 = var10000;

      int var15;
      label20: {
         try {
            var15 = this.y;
            if (var10 != null) {
               break label20;
            }

            if (var15 == 0) {
               return;
            }
         } catch (NumberFormatException var14) {
            throw var14.A<invokedynamic>(var14, -3658350955375258182L, var3);
         }

         var15 = var2;
      }

      float var13 = Math.clamp(((float)var15 - var11) / 107.0F, 0.0F, 1.0F);
      this.t().v(gk.E.e(var8, new Color(Color.HSBtoRGB(var13, var12[1], var12[2])), (float)((Color)this.t().B()).getAlpha() / 255.0F));
   }

   public void d(double mouseX, double mouseY, long a, int button) {
      // $FF: Couldn't be decompiled
   }

   public void x(double mouseX, double mouseY, int button) {
      this.R = false;
      this.y = false;
      this.U = false;
   }

   public void Z(long a, int key) {
      // $FF: Couldn't be decompiled
   }

   public void G(long a, char char) {
      // $FF: Couldn't be decompiled
   }

   public boolean i(int a, int a, int a, double mouseX, double mouseY, double verticalAmount) {
      // $FF: Couldn't be decompiled
   }

   public void e() {
      this.R = false;
      this.y = false;
      this.U = false;
   }

   static {
      long var22 = a ^ 88763868806669L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var25 = 1; var25 < 8; ++var25) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[9];
      int var29 = 0;
      String var28 = "²K¨<\t\u0012_wX£hÔåÿOB X¡[3\u001c\u0010¬G¨A\u0017þ{©\u001fWÀ®\u0007[}H\u007f\u009d\n[9,×>DÒ\u0010-\u0088\u0017³èW\tË¶P\u009cÕ$\r\u009c8 \u008f\u0005\u00ad¸\u0000\u0091Â\"y\u008a/\u0099Õ!\u008b`Ë\n\u008b\u00019A\u0002\u0098V²\u008e\fW\f¾ç v\u00058\u0000\u0004\u0002ÝÕÛ:¯]\u0003\u0014\u008d\u0014¼Ñ)yZ\u0097\r¿ÞJ.iÈ(ÕB\u0010\u008dH³\u0011ÁC\u007fÉ\u0084Y\u0086\u0012AÈËÕ\u0010\u001dk;\u0081%UÂx«52ô\u0000¸Aë";
      int var30 = "²K¨<\t\u0012_wX£hÔåÿOB X¡[3\u001c\u0010¬G¨A\u0017þ{©\u001fWÀ®\u0007[}H\u007f\u009d\n[9,×>DÒ\u0010-\u0088\u0017³èW\tË¶P\u009cÕ$\r\u009c8 \u008f\u0005\u00ad¸\u0000\u0091Â\"y\u008a/\u0099Õ!\u008b`Ë\n\u008b\u00019A\u0002\u0098V²\u008e\fW\f¾ç v\u00058\u0000\u0004\u0002ÝÕÛ:¯]\u0003\u0014\u008d\u0014¼Ñ)yZ\u0097\r¿ÞJ.iÈ(ÕB\u0010\u008dH³\u0011ÁC\u007fÉ\u0084Y\u0086\u0012AÈËÕ\u0010\u001dk;\u0081%UÂx«52ô\u0000¸Aë".length();
      char var27 = 16;
      int var26 = -1;

      label72:
      while(true) {
         ++var26;
         String var33 = var28.substring(var26, var26 + var27);
         byte var10001 = -1;

         while(true) {
            byte[] var32 = var24.doFinal(var33.getBytes("ISO-8859-1"));
            String var39 = b(var32).intern();
            switch(var10001) {
            case 0:
               var31[var29++] = var39;
               if ((var26 += var27) >= var30) {
                  c = var31;
                  g = new String[9];
                  m = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var12 = 1; var12 < 8; ++var12) {
                     var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[11];
                  int var14 = 0;
                  String var15 = "\u0098ë\u009cÔ^ï«g\u0083ÙÏ¢2ÓFP§=XÐ+ÜÆBC;h~.úa\n#©\t¸µmk|B³lË3¥c\u009aû[ä\u0096\u0084vT÷Õ4-o¸·\u000b\u008c\u0000h5õV~F\u0010";
                  int var16 = "\u0098ë\u009cÔ^ï«g\u0083ÙÏ¢2ÓFP§=XÐ+ÜÆBC;h~.úa\n#©\t¸µmk|B³lË3¥c\u009aû[ä\u0096\u0084vT÷Õ4-o¸·\u000b\u008c\u0000h5õV~F\u0010".length();
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
                              j = var17;
                              l = new Integer[11];
                              q = new HashMap(13);
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var22 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long[] var6 = new long[2];
                              int var3 = 0;
                              String var4 = "©ðñ\u001d-\u0017\u008fU÷\u0099ï&6\u0084\u00848";
                              int var5 = "©ðñ\u001d-\u0017\u008fU÷\u0099ï&6\u0084\u00848".length();
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

                              n = var6;
                              o = new Long[2];
                              return;
                           }
                           break;
                        default:
                           var36[var37] = var44;
                           if (var13 < var16) {
                              continue label54;
                           }

                           var15 = "mà\t²¾\u0012þIT\u0005ÊvcÌÍÏ";
                           var16 = "mà\t²¾\u0012þIT\u0005ÊvcÌÍÏ".length();
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

               var28 = "\"\u000ew\u0019&}öëa\u009fe \u0085ðÎ|ÛR\u001b\u0093ÂÃÏµ\u0010\u0082ó\u0010\u00883§kÄc<¯Y×%JO";
               var30 = "\"\u000ew\u0019&}öëa\u009fe \u0085ðÎ|ÛR\u001b\u0093ÂÃÏµ\u0010\u0082ó\u0010\u00883§kÄc<¯Y×%JO".length();
               var27 = 24;
               var26 = -1;
            }

            ++var26;
            var33 = var28.substring(var26, var26 + var27);
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11845;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/at", var10);
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
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("su/catlean/at" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7916;
      if (l[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = j[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/at", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
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
         throw new RuntimeException("su/catlean/at" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10312;
      if (o[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = n[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/at", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         o[var3] = var15;
      }

      return o[var3];
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
         throw new RuntimeException("su/catlean/at" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
