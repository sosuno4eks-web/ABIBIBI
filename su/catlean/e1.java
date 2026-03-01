package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class e1 extends class_437 {
   @NotNull
   public static final e1 D;
   private static boolean H;
   @NotNull
   private static final List F;
   @Nullable
   private static zt i;
   @NotNull
   private static aa V;
   @NotNull
   private static aa X;
   private static boolean d;
   private static boolean t;
   private static int C;
   private static int R;
   private static String[] s;
   private static final long a = j0.a(2575712859210671847L, 9081629740963917859L, MethodHandles.lookup().lookupClass()).a(205627675518116L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   private e1(long var1) {
      var1 ^= a;
      super(class_2561.method_30163(true.b<invokedynamic>(7246, 6803814748216152123L ^ var1)));
   }

   public final boolean B() {
      return H;
   }

   public final void k(boolean <set-?>) {
      H = var1;
   }

   @Nullable
   public final zt Z() {
      return i;
   }

   public final void I(@Nullable zt <set-?>) {
      i = var1;
   }

   public void method_25394(@NotNull class_332 context, int mX, int mY, float delta) {
      long var5 = a ^ 130953665534183L;
      long var7 = var5 ^ 16367594638345L;
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(1515, 2725384698429842779L ^ var5));
      int[] var10000 = -6635274190324895710L.A<invokedynamic>(-6635274190324895710L, var5);
      C = var2;
      R = var3;
      int[] var9 = var10000;

      try {
         if (var9 != null || i == null) {
            return;
         }
      } catch (NumberFormatException var12) {
         throw var12.A<invokedynamic>(var12, -6653107165799908213L, var5);
      }

      boolean var11 = false;
      D.x(var1, var7);
   }

   public final void x(@NotNull class_332 context, long a) {
      // $FF: Couldn't be decompiled
   }

   public void method_25393() {
      long var1 = a ^ 113014379518639L;
      long var3 = var1 ^ 71190988734669L;
      int[] var10000 = -2187952735736253846L.A<invokedynamic>(-2187952735736253846L, var1);
      super.method_25393();
      int[] var5 = var10000;

      try {
         if (i != null) {
            return;
         }
      } catch (NumberFormatException var12) {
         throw var12.A<invokedynamic>(var12, -2169754687754551613L, var1);
      }

      Iterable var6;
      boolean var7;
      Iterator var8;
      Object var9;
      c_ var10;
      boolean var11;
      boolean var20;
      label144: {
         label148: {
            try {
               var20 = _j.O(true.u<invokedynamic>(24127, 9058621468406488176L ^ var1), var3);
               if (var5 != null) {
                  break label144;
               }

               if (!var20) {
                  break label148;
               }
            } catch (NumberFormatException var19) {
               throw var19.A<invokedynamic>(var19, -2169754687754551613L, var1);
            }

            var6 = (Iterable)F;
            var7 = false;
            var8 = var6.iterator();

            while(var8.hasNext()) {
               var9 = var8.next();
               var10 = (c_)var9;
               var11 = false;

               try {
                  var10.M(var10.q() - true.u<invokedynamic>(237, 8985330854186304160L ^ var1));
                  if (var5 != null || var5 != null) {
                     break;
                  }
               } catch (NumberFormatException var18) {
                  throw var18.A<invokedynamic>(var18, -2169754687754551613L, var1);
               }
            }
         }

         var20 = _j.O(true.u<invokedynamic>(26254, 4013297935442912453L ^ var1), var3);
      }

      label123: {
         label150: {
            try {
               if (var5 != null) {
                  break label123;
               }

               if (!var20) {
                  break label150;
               }
            } catch (NumberFormatException var17) {
               throw var17.A<invokedynamic>(var17, -2169754687754551613L, var1);
            }

            var6 = (Iterable)F;
            var7 = false;
            var8 = var6.iterator();

            while(var8.hasNext()) {
               var9 = var8.next();
               var10 = (c_)var9;
               var11 = false;

               try {
                  var10.M(var10.q() + true.u<invokedynamic>(5023, 6055322515121099222L ^ var1));
                  if (var5 != null || var5 != null) {
                     break;
                  }
               } catch (NumberFormatException var16) {
                  throw var16.A<invokedynamic>(var16, -2169754687754551613L, var1);
               }
            }
         }

         var20 = _j.O(true.u<invokedynamic>(14292, 1642973763274896792L ^ var1), var3);
      }

      label102: {
         label152: {
            try {
               if (var5 != null) {
                  break label102;
               }

               if (!var20) {
                  break label152;
               }
            } catch (NumberFormatException var15) {
               throw var15.A<invokedynamic>(var15, -2169754687754551613L, var1);
            }

            var6 = (Iterable)F;
            var7 = false;
            var8 = var6.iterator();

            while(var8.hasNext()) {
               var9 = var8.next();
               var10 = (c_)var9;
               var11 = false;

               try {
                  var10.L(var10.u() - true.u<invokedynamic>(5023, 6055322515121099222L ^ var1));
                  if (var5 != null || var5 != null) {
                     break;
                  }
               } catch (NumberFormatException var14) {
                  throw var14.A<invokedynamic>(var14, -2169754687754551613L, var1);
               }
            }
         }

         var20 = _j.O(true.u<invokedynamic>(20738, 8948735013920052044L ^ var1), var3);
      }

      if (var20) {
         var6 = (Iterable)F;
         var7 = false;
         var8 = var6.iterator();

         while(var8.hasNext()) {
            var9 = var8.next();
            var10 = (c_)var9;
            var11 = false;

            try {
               var10.L(var10.u() + true.u<invokedynamic>(5023, 6055322515121099222L ^ var1));
               if (var5 != null || var5 != null) {
                  break;
               }
            } catch (NumberFormatException var13) {
               throw var13.A<invokedynamic>(var13, -2169754687754551613L, var1);
            }
         }
      }

   }

   private final void Q(p5 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   public final void x(@NotNull k9 module, long a, short a) {
      // $FF: Couldn't be decompiled
   }

   public final void b(long a, @NotNull k9 module) {
      var1 ^= a;
      long var4 = var1 ^ 88910555655549L;
      Intrinsics.checkNotNullParameter(var3, true.b<invokedynamic>(18848, 5749490582038159200L ^ var1));
      this.Q(var3.X(), var4);
      u1 var6 = u1.Z;
      int var7 = true.u<invokedynamic>(26904, 5460976864001531755L ^ var1);
      boolean var8 = false;
      var6.d().execute((Runnable)(new l(var7, var3)));
   }

   public boolean method_25421() {
      return false;
   }

   public boolean method_25402(@NotNull class_11909 click, boolean doubled) {
      // $FF: Couldn't be decompiled
   }

   public boolean method_25406(@NotNull class_11909 click) {
      long var2 = a ^ 77579304111048L;
      long var10001 = var2 ^ 73293102719312L;
      int var4 = (int)((var2 ^ 73293102719312L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var2 ^ 13140779754293L;
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(30304, 7287404834264581624L ^ var2));
      int[] var10000 = -1097201744398015731L.A<invokedynamic>(-1097201744398015731L, var2);
      double var10 = var1.comp_4798();
      double var12 = var1.comp_4799();
      int var14 = var1.method_74245();
      Iterable var15 = (Iterable)F;
      int[] var9 = var10000;
      boolean var16 = false;
      Iterator var17 = var15.iterator();

      while(true) {
         if (var17.hasNext()) {
            Object var18 = var17.next();
            c_ var19 = (c_)var18;
            boolean var20 = false;

            try {
               var19.x(var7, var10, var12, var14);
               if (var9 != null) {
                  break;
               }

               if (var9 == null) {
                  continue;
               }
            } catch (NumberFormatException var22) {
               throw var22.A<invokedynamic>(var22, -1115665804654170204L, var2);
            }
         }

         _t.e.S(var4, var5, var10, var6, var12, var14);
         break;
      }

      try {
         boolean var23 = super.method_25406(var1);
         if (-1092771003533429313L.A<invokedynamic>(-1092771003533429313L, var2) == null) {
            (new int[3]).A<invokedynamic>(new int[3], -1100687667808397223L, var2);
         }

         return var23;
      } catch (NumberFormatException var21) {
         throw var21.A<invokedynamic>(var21, -1115665804654170204L, var2);
      }
   }

   public boolean method_25404(@NotNull class_11908 input) {
      // $FF: Couldn't be decompiled
   }

   public boolean method_25400(@NotNull class_11905 input) {
      // $FF: Couldn't be decompiled
   }

   public boolean method_25401(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      // $FF: Couldn't be decompiled
   }

   public void method_25419() {
      long var1 = a ^ 121075495635106L;
      long var3 = var1 ^ 56396717495097L;
      Iterable var6 = (Iterable)F;
      int[] var10000 = 8336123617234526311L.A<invokedynamic>(8336123617234526311L, var1);
      boolean var7 = false;
      int[] var5 = var10000;
      Iterator var8 = var6.iterator();

      while(true) {
         if (var8.hasNext()) {
            Object var9 = var8.next();
            c_ var10 = (c_)var9;
            boolean var11 = false;

            try {
               var10.L(var3);
               if (var5 != null) {
                  break;
               }

               if (var5 == null) {
                  continue;
               }
            } catch (NumberFormatException var12) {
               throw var12.A<invokedynamic>(var12, 8353741130595839182L, var1);
            }
         }

         H = false;
         d = true;
         t = false;
         break;
      }

   }

   protected void method_57734(@NotNull class_332 context) {
      long var2 = a ^ 26422441620563L;
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(1515, 2725502324406110703L ^ var2));
   }

   public void method_25420(@NotNull class_332 context, int mouseX, int mouseY, float deltaTicks) {
      long var5 = a ^ 7142195082746L;
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(1515, 2725508547407595590L ^ var5));
   }

   public static final List L() {
      return F;
   }

   static {
      long var31 = a ^ 88239008791506L;
      long var33 = var31 ^ 95651489138571L;
      long var35 = var31 ^ 77084974708018L;
      long var10001 = var31 ^ 14747198090686L;
      int var37 = (int)((var31 ^ 14747198090686L) >>> 48);
      int var38 = (int)(var10001 << 16 >>> 48);
      int var39 = (int)(var10001 << 32 >>> 32);
      String[] var10000 = new String[4];
      e = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -4474175876095241554L, var31);
      Cipher var22;
      Cipher var54 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var23 = 1; var23 < 8; ++var23) {
         var10003[var23] = (byte)((int)(var31 << var23 * 8 >>> 56));
      }

      var54.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[15];
      int var27 = 0;
      String var26 = "\u0018Ë\u0089&Ì\u001aÏwC~õÐÍ\u0097'à\\ä¦¼\u001fèãÖ\u001dw1Y\u00060ã\u008cö)öÏü6©Ð\u0010sÃ\u009cBÚi\u0016\u001drw0\tëÈ÷\u001f\u0010áø«,\u0001FT\u00928|a!\u001by@à\u0010\t\u0002ÎÙ\u0004!åR$.ÍNh\u0004\u0089j\u0010(KÒ¸ò\u001bO\u0011\u0002\u009ag\u0016M\u0015\u0083¹\u0010\u0089(=z¢Þe&Ð#M+K 'Ñ\u0010:O\u0014&ç>1\u001ex¹\u0000N}ü~3\u0010ã\bð\u0012Û\u0090Î\u00033õY\u001aDô\u0003°(¯m°ÔØa'I\u009eê\u0003wú2\f\u009b\u008aGÜ²8B,\r':ÃÞ¶Ó?Ô{kU,Ï¥ØÚ\u0010\u0083\u008a\u0014²\u0084/8[Â?¦ñ· {»ĈÕ\u0099©\u0081áLy&dÒEò6M\u0005÷ó¦´Û¢nò)Ô`z²:M¸fW\u0003<ÛqkE\u001eu?\u0018]=È\u0095&eiI(\u0095 RàDÆ\\¦\u0095!\u0016Ë«¢ÜjæçS-\u0016\u0099¹\u0095§ è\u00ad¼\nó5â©\u0019\u0017áo\u0005Æ'è\r:,x\u009f¨;ºev\u0091\u0088þlR*$ã\u008f¤<1\u0014Áüf=zë\u0080ñ²Ï\u0097Y\u0004s±'\u0007\u009a\u0007\u00030l\u009aCH\u009e?ÍÑQ\u0084\u0084(©$»lK\u009e¡V®â¬:B\u009cÃZ\u0013\u0086ïCÓrÆÓøhGA\u0091¯i\u0011\u0087x\u0090'#í\u0094vm\fú,?ùû0èfs\u001b\n©\u008d\u0002ý:\u0018°@\u0006\u0092)\f\"\u009fÂ}\u0092S\u001e7A_I\u001auæ¦~Øm'Ë§Å\u0086P²,£\u0010\u009e1\u008a;\u00ade\u0082\u0093¸)\u009e¾O\t\u0015\u0086ú\u009a4$¤\u0010\u001egÜ\u0002Æ\u0083Äµû\b\u009f9å)F_\u0010\u0087\u001eSo\u00ad\u0017\u009f¶ à9{\u0085ò¼0";
      int var28 = "\u0018Ë\u0089&Ì\u001aÏwC~õÐÍ\u0097'à\\ä¦¼\u001fèãÖ\u001dw1Y\u00060ã\u008cö)öÏü6©Ð\u0010sÃ\u009cBÚi\u0016\u001drw0\tëÈ÷\u001f\u0010áø«,\u0001FT\u00928|a!\u001by@à\u0010\t\u0002ÎÙ\u0004!åR$.ÍNh\u0004\u0089j\u0010(KÒ¸ò\u001bO\u0011\u0002\u009ag\u0016M\u0015\u0083¹\u0010\u0089(=z¢Þe&Ð#M+K 'Ñ\u0010:O\u0014&ç>1\u001ex¹\u0000N}ü~3\u0010ã\bð\u0012Û\u0090Î\u00033õY\u001aDô\u0003°(¯m°ÔØa'I\u009eê\u0003wú2\f\u009b\u008aGÜ²8B,\r':ÃÞ¶Ó?Ô{kU,Ï¥ØÚ\u0010\u0083\u008a\u0014²\u0084/8[Â?¦ñ· {»ĈÕ\u0099©\u0081áLy&dÒEò6M\u0005÷ó¦´Û¢nò)Ô`z²:M¸fW\u0003<ÛqkE\u001eu?\u0018]=È\u0095&eiI(\u0095 RàDÆ\\¦\u0095!\u0016Ë«¢ÜjæçS-\u0016\u0099¹\u0095§ è\u00ad¼\nó5â©\u0019\u0017áo\u0005Æ'è\r:,x\u009f¨;ºev\u0091\u0088þlR*$ã\u008f¤<1\u0014Áüf=zë\u0080ñ²Ï\u0097Y\u0004s±'\u0007\u009a\u0007\u00030l\u009aCH\u009e?ÍÑQ\u0084\u0084(©$»lK\u009e¡V®â¬:B\u009cÃZ\u0013\u0086ïCÓrÆÓøhGA\u0091¯i\u0011\u0087x\u0090'#í\u0094vm\fú,?ùû0èfs\u001b\n©\u008d\u0002ý:\u0018°@\u0006\u0092)\f\"\u009fÂ}\u0092S\u001e7A_I\u001auæ¦~Øm'Ë§Å\u0086P²,£\u0010\u009e1\u008a;\u00ade\u0082\u0093¸)\u009e¾O\t\u0015\u0086ú\u009a4$¤\u0010\u001egÜ\u0002Æ\u0083Äµû\b\u009f9å)F_\u0010\u0087\u001eSo\u00ad\u0017\u009f¶ à9{\u0085ò¼0".length();
      char var25 = '(';
      int var24 = -1;

      label96:
      while(true) {
         ++var24;
         String var55 = var26.substring(var24, var24 + var25);
         byte var57 = -1;

         while(true) {
            byte[] var30 = var22.doFinal(var55.getBytes("ISO-8859-1"));
            String var62 = a(var30).intern();
            switch(var57) {
            case 0:
               var29[var27++] = var62;
               if ((var24 += var25) >= var28) {
                  b = var29;
                  c = new String[15];
                  h = new HashMap(13);
                  Cipher var11;
                  var54 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var12 = 1; var12 < 8; ++var12) {
                     var10003[var12] = (byte)((int)(var31 << var12 * 8 >>> 56));
                  }

                  var54.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[7];
                  int var14 = 0;
                  String var15 = "a°`\u009e\u000b{<\u0087Oµ\u0083æcù~\u0096ÅY«ì\u0013n\u001aô¹\u008aE¼Ò,þ\u001bJs¥2 ;JV";
                  int var16 = "a°`\u009e\u000b{<\u0087Oµ\u0083æcù~\u0096ÅY«ì\u0013n\u001aô¹\u008aE¼Ò,þ\u001bJs¥2 ;JV".length();
                  int var13 = 0;

                  label78:
                  while(true) {
                     int var61 = var13;
                     var13 += 8;
                     byte[] var18 = var15.substring(var61, var13).getBytes("ISO-8859-1");
                     long[] var59 = var17;
                     var61 = var14++;
                     long var64 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                     byte var65 = -1;

                     while(true) {
                        long var19 = var64;
                        byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                        long var67 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                        switch(var65) {
                        case 0:
                           var59[var61] = var67;
                           if (var13 >= var16) {
                              f = var17;
                              g = new Integer[7];
                              Cipher var1;
                              var54 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var2 = 1; var2 < 8; ++var2) {
                                 var10003[var2] = (byte)((int)(var31 << var2 * 8 >>> 56));
                              }

                              var54.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long[] var0 = new long[2];
                              int var4 = 0;
                              String var5 = "<§ªEGHø$ÝY¸Åk*Û\u0006";
                              int var6 = "<§ªEGHø$ÝY¸Åk*Û\u0006".length();
                              int var3 = 0;

                              do {
                                 var61 = var3;
                                 var3 += 8;
                                 byte[] var7 = var5.substring(var61, var3).getBytes("ISO-8859-1");
                                 var61 = var4++;
                                 long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                 byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                 var67 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                 boolean var68 = true;
                                 var0[var61] = var67;
                              } while(var3 < var6);

                              D = new e1(var35);
                              H = true;
                              Iterable var40 = (Iterable)sj.w.D();
                              boolean var41 = false;
                              Collection var43 = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(var40, true.u<invokedynamic>(5023, 6055341724207935659L ^ var31))));
                              boolean var44 = false;
                              int var45 = 0;
                              Iterator var46 = var40.iterator();

                              while(var46.hasNext()) {
                                 Object var47 = var46.next();
                                 int var48 = var45++;

                                 try {
                                    if (var48 < 0) {
                                       CollectionsKt.throwIndexOverflow();
                                    }
                                 } catch (NumberFormatException var53) {
                                    throw var53.A<invokedynamic>(var53, -4567128228349435970L, var31);
                                 }

                                 ih var49 = (ih)var47;
                                 boolean var51 = false;
                                 var43.add(new c_(var49, var48, var33));
                              }

                              F = (List)var43;
                              V = new aa(sa.OUT_BACK, var0[0], (short)var37, (short)var38, var39);
                              X = new aa(sa.IN_QUAD, var0[1], (short)var37, (short)var38, var39);
                              return;
                           }
                           break;
                        default:
                           var59[var61] = var67;
                           if (var13 < var16) {
                              continue label78;
                           }

                           var15 = "\u0011f Þ [\u0082\u0011\u0012GÎ\u0003GôßÀ";
                           var16 = "\u0011f Þ [\u0082\u0011\u0012GÎ\u0003GôßÀ".length();
                           var13 = 0;
                        }

                        var61 = var13;
                        var13 += 8;
                        var18 = var15.substring(var61, var13).getBytes("ISO-8859-1");
                        var59 = var17;
                        var61 = var14++;
                        var64 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        var65 = 0;
                     }
                  }
               }

               var25 = var26.charAt(var24);
               break;
            default:
               var29[var27++] = var62;
               if ((var24 += var25) < var28) {
                  var25 = var26.charAt(var24);
                  continue label96;
               }

               var26 = "á¬Ëj%ÝÂIüµØ)ý\u0099ë\u0012 9>TÞ\u007fkVTm\u0097¦¥üy\u0090Y·\u0014íÀ\u0082\u0017¢[°\\5\u009dèkó¤ÓÎç\u008127\u000e(KÐ1Ñ×)1\u0014ø4\"Îø\u0017\u0084¦x\f\u0019û\u0012yU\u00adðp\u0013R\u0018;ç´\u001d\u0083ï÷/Dýá";
               var28 = "á¬Ëj%ÝÂIüµØ)ý\u0099ë\u0012 9>TÞ\u007fkVTm\u0097¦¥üy\u0090Y·\u0014íÀ\u0082\u0017¢[°\\5\u009dèkó¤ÓÎç\u008127\u000e(KÐ1Ñ×)1\u0014ø4\"Îø\u0017\u0084¦x\f\u0019û\u0012yU\u00adðp\u0013R\u0018;ç´\u001d\u0083ï÷/Dýá".length();
               var25 = '8';
               var24 = -1;
            }

            ++var24;
            var55 = var26.substring(var24, var24 + var25);
            var57 = 0;
         }
      }
   }

   public static void g(String[] var0) {
      s = var0;
   }

   public static String[] t() {
      return s;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 667;
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
            throw new RuntimeException("su/catlean/e1", var10);
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
         throw new RuntimeException("su/catlean/e1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8744;
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
            throw new RuntimeException("su/catlean/e1", var14);
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
         throw new RuntimeException("su/catlean/e1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
