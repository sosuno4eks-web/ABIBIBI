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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_591;
import net.minecraft.class_630;
import org.jetbrains.annotations.NotNull;

public enum ht {
   @NotNull
   private final Function1 Q;
   @NotNull
   private final Function1 F;
   private final double f;
   private final double I;
   public static final ht HEAD;
   public static final ht BODY;
   public static final ht LEFT_ARM;
   public static final ht RIGHT_ARM;
   public static final ht LEFT_LEG;
   public static final ht RIGHT_LEG;
   // $FF: synthetic field
   private static final EnumEntries s;
   private static boolean l;
   private static final long a = j0.a(173558495682307433L, 9036813948115405969L, MethodHandles.lookup().lookupClass()).a(171781706240791L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long e;

   private ht(Function1 var3, Function1 var4, double var5, double var7) {
      this.Q = var3;
      this.F = var4;
      this.f = var5;
      this.I = var7;
   }

   @NotNull
   public final Function1 t() {
      return this.Q;
   }

   @NotNull
   public final Function1 p() {
      return this.F;
   }

   public final double Q() {
      return this.f;
   }

   public final double I() {
      return this.I;
   }

   @NotNull
   public static EnumEntries i() {
      return s;
   }

   private static final class_630 a(class_591 var0) {
      long var1 = a ^ 112334129765913L;
      Intrinsics.checkNotNullParameter(var0, true.j<invokedynamic>(3170, 3583258794787604333L ^ var1));
      class_630 var10000 = var0.field_3398;
      Intrinsics.checkNotNullExpressionValue(var10000, true.j<invokedynamic>(14598, 8261553398842470920L ^ var1));
      return var10000;
   }

   private static final class_630 c(class_591 var0) {
      long var1 = a ^ 12336518708561L;
      Intrinsics.checkNotNullParameter(var0, true.j<invokedynamic>(3170, 3583220369897169957L ^ var1));
      class_630 var10000 = var0.field_3394;
      Intrinsics.checkNotNullExpressionValue(var10000, true.j<invokedynamic>(21614, 9215482226891684912L ^ var1));
      return var10000;
   }

   private static final class_630 g(class_591 var0) {
      long var1 = a ^ 64476327954905L;
      Intrinsics.checkNotNullParameter(var0, true.j<invokedynamic>(31985, 6800483964550979625L ^ var1));
      class_630 var10000 = var0.field_3391;
      Intrinsics.checkNotNullExpressionValue(var10000, true.j<invokedynamic>(15289, 1222197247763113844L ^ var1));
      return var10000;
   }

   private static final class_630 m(class_591 var0) {
      long var1 = a ^ 19388146393390L;
      Intrinsics.checkNotNullParameter(var0, true.j<invokedynamic>(3170, 3583243985007589466L ^ var1));
      class_630 var10000 = var0.field_3483;
      Intrinsics.checkNotNullExpressionValue(var10000, true.j<invokedynamic>(18335, 3506535842906895290L ^ var1));
      return var10000;
   }

   private static final class_630 G(class_591 var0) {
      long var1 = a ^ 41676095954843L;
      Intrinsics.checkNotNullParameter(var0, true.j<invokedynamic>(3170, 3583186547683329775L ^ var1));
      class_630 var10000 = var0.field_27433;
      Intrinsics.checkNotNullExpressionValue(var10000, true.j<invokedynamic>(20072, 6912451048967619838L ^ var1));
      return var10000;
   }

   private static final class_630 j(class_591 var0) {
      long var1 = a ^ 15770879300716L;
      Intrinsics.checkNotNullParameter(var0, true.j<invokedynamic>(3170, 3583214518543715608L ^ var1));
      class_630 var10000 = var0.field_3484;
      Intrinsics.checkNotNullExpressionValue(var10000, true.j<invokedynamic>(27045, 8925129690240968909L ^ var1));
      return var10000;
   }

   private static final class_630 k(class_591 var0) {
      long var1 = a ^ 99068660239460L;
      Intrinsics.checkNotNullParameter(var0, true.j<invokedynamic>(3170, 3583307104187307280L ^ var1));
      class_630 var10000 = var0.field_3401;
      Intrinsics.checkNotNullExpressionValue(var10000, true.j<invokedynamic>(30846, 9104947937887854864L ^ var1));
      return var10000;
   }

   private static final class_630 l(class_591 var0) {
      long var1 = a ^ 24035292530355L;
      Intrinsics.checkNotNullParameter(var0, true.j<invokedynamic>(3170, 3583239217585086407L ^ var1));
      class_630 var10000 = var0.field_3486;
      Intrinsics.checkNotNullExpressionValue(var10000, true.j<invokedynamic>(25837, 1477553862273021789L ^ var1));
      return var10000;
   }

   private static final class_630 A(class_591 var0) {
      long var1 = a ^ 23317852019012L;
      Intrinsics.checkNotNullParameter(var0, true.j<invokedynamic>(3170, 3583240209601642544L ^ var1));
      class_630 var10000 = var0.field_3397;
      Intrinsics.checkNotNullExpressionValue(var10000, true.j<invokedynamic>(20447, 7315393513061385102L ^ var1));
      return var10000;
   }

   private static final class_630 h(class_591 var0) {
      long var1 = a ^ 120988732795381L;
      Intrinsics.checkNotNullParameter(var0, true.j<invokedynamic>(3170, 3583249848612827265L ^ var1));
      class_630 var10000 = var0.field_3482;
      Intrinsics.checkNotNullExpressionValue(var10000, true.j<invokedynamic>(26640, 338173485907203296L ^ var1));
      return var10000;
   }

   private static final class_630 I(class_591 var0) {
      long var1 = a ^ 43899885478103L;
      Intrinsics.checkNotNullParameter(var0, true.j<invokedynamic>(3170, 3583188704911358371L ^ var1));
      class_630 var10000 = var0.field_3392;
      Intrinsics.checkNotNullExpressionValue(var10000, true.j<invokedynamic>(29697, 7102615547640185297L ^ var1));
      return var10000;
   }

   private static final class_630 H(class_591 var0) {
      long var1 = a ^ 520676885579L;
      Intrinsics.checkNotNullParameter(var0, true.j<invokedynamic>(3170, 3583225589977865535L ^ var1));
      class_630 var10000 = var0.field_3479;
      Intrinsics.checkNotNullExpressionValue(var10000, true.j<invokedynamic>(9136, 558414930584892146L ^ var1));
      return var10000;
   }

   // $FF: synthetic method
   private static final ht[] v(int var0, char var1, char var2) {
      long var3 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48) ^ a;
      ht[] var5 = new ht[(int)e];
      var5[0] = HEAD;
      var5[1] = BODY;
      var5[2] = LEFT_ARM;
      var5[3] = RIGHT_ARM;
      var5[4] = LEFT_LEG;
      var5[5] = RIGHT_LEG;
      return var5;
   }

   static {
      long var14 = a ^ 78227967955778L;
      long var10001 = var14 ^ 79601304215028L;
      int var16 = (int)((var14 ^ 79601304215028L) >>> 32);
      int var17 = (int)(var10001 << 32 >>> 48);
      int var18 = (int)(var10001 << 48 >>> 48);
      d = new HashMap(13);
      true.A<invokedynamic>(true, -7415237682554384622L, var14);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[20];
      int var10 = 0;
      String var9 = "û/\u0082\u0082Ô\t$!\u0083\u0090ým\u0091J\u009e\nW\u008aJ&\n\u001436 \u0090ýp\u0090\u00ad`#?ªS¥E°¤¯Ú\u008aº+ì\u0091ph&R7\u0093\u0016Q¢]¯ è¤\u0006¥\u0083\u0085\u0093ü\u001d\u0002\u0011\u0080/.\u0082\u009câ\u0013\t\u00194Ë>\u0017ÀpêÞ\u009e\u0095,\u0094 j\t\u0095Fj\u00976á°\u008fl\u0093ÿ1\u008a\u0004\t\u009aµ\u0092!ËAÚGí\u009d¦,rNý\u0018>\u009c\u0090Ëç\u0082±\u009es\u0016¢Ä\u0010\u0099\u0007`¢RÂoêbm\t íæAjb\u0080\u009eð2Þ\u0006^\u0010:#\u009f*r\u0093\u0007S^ß»m½IDIÛ\u008d«\u0010_Â\u000b;þ0áßYÞº³fJË£ Xrd¤¯\u0018\u0091\u009b/ÏLatH]õÓ¥\u009d\u0016ã\u009cwÆ\u000eÛº\u0018©rW\u0097\u0010(WÉÆÈà\u00898·4\t\u0013T\u001c\u0092¹\u0010¼\u0006þ\u001d\u009a\u001cT\u00ad\u0086\t\u0082£¤Lß\u0006\u0010\u009f¥ÄÙäÙG9ù¿è÷Ïï\u0011ä ,\u0003òï:ú~ Èa*\u00ad\f\u001eÜ_+v:\u0095\u009e&ø\u0016\u0019C\u007f( v°á\u0010\u000f \u0086N\u0007\u009e\\\u0094J4/Äö³\u0087c\u0018ï)Þ±mI_!\u008d»æ\u0094ù\u008f.ÇZoDú\u001eéÐø Sña´\u009e#¶\u009a\u001bn_m¬G\u0088\u0085ái\u0082D.K;½\u0085j\u0094\u0097ù5¤\u009f\u0010\u0093\u008f}Tö«s\u001cR\u0094M\u008b\u0006\u0089ñ\u0087\u0010ÿI¬åÀ+Äñ\u008b\u001aÂMEM\u001cÏ\u0010V\f\u008bó\u0006Í\u008cZ\u000f%Z«\r\\Ø^";
      int var11 = "û/\u0082\u0082Ô\t$!\u0083\u0090ým\u0091J\u009e\nW\u008aJ&\n\u001436 \u0090ýp\u0090\u00ad`#?ªS¥E°¤¯Ú\u008aº+ì\u0091ph&R7\u0093\u0016Q¢]¯ è¤\u0006¥\u0083\u0085\u0093ü\u001d\u0002\u0011\u0080/.\u0082\u009câ\u0013\t\u00194Ë>\u0017ÀpêÞ\u009e\u0095,\u0094 j\t\u0095Fj\u00976á°\u008fl\u0093ÿ1\u008a\u0004\t\u009aµ\u0092!ËAÚGí\u009d¦,rNý\u0018>\u009c\u0090Ëç\u0082±\u009es\u0016¢Ä\u0010\u0099\u0007`¢RÂoêbm\t íæAjb\u0080\u009eð2Þ\u0006^\u0010:#\u009f*r\u0093\u0007S^ß»m½IDIÛ\u008d«\u0010_Â\u000b;þ0áßYÞº³fJË£ Xrd¤¯\u0018\u0091\u009b/ÏLatH]õÓ¥\u009d\u0016ã\u009cwÆ\u000eÛº\u0018©rW\u0097\u0010(WÉÆÈà\u00898·4\t\u0013T\u001c\u0092¹\u0010¼\u0006þ\u001d\u009a\u001cT\u00ad\u0086\t\u0082£¤Lß\u0006\u0010\u009f¥ÄÙäÙG9ù¿è÷Ïï\u0011ä ,\u0003òï:ú~ Èa*\u00ad\f\u001eÜ_+v:\u0095\u009e&ø\u0016\u0019C\u007f( v°á\u0010\u000f \u0086N\u0007\u009e\\\u0094J4/Äö³\u0087c\u0018ï)Þ±mI_!\u008d»æ\u0094ù\u008f.ÇZoDú\u001eéÐø Sña´\u009e#¶\u009a\u001bn_m¬G\u0088\u0085ái\u0082D.K;½\u0085j\u0094\u0097ù5¤\u009f\u0010\u0093\u008f}Tö«s\u001cR\u0094M\u008b\u0006\u0089ñ\u0087\u0010ÿI¬åÀ+Äñ\u008b\u001aÂMEM\u001cÏ\u0010V\f\u008bó\u0006Í\u008cZ\u000f%Z«\r\\Ø^".length();
      char var8 = 24;
      int var7 = -1;

      label37:
      while(true) {
         ++var7;
         String var19 = var9.substring(var7, var7 + var8);
         byte var21 = -1;

         while(true) {
            byte[] var13 = var5.doFinal(var19.getBytes("ISO-8859-1"));
            String var25 = a(var13).intern();
            switch(var21) {
            case 0:
               var12[var10++] = var25;
               if ((var7 += var8) >= var11) {
                  b = var12;
                  c = new String[20];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 5007427051214132834L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var27 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var24 = true;
                  e = var27;
                  HEAD = new ht(true.j<invokedynamic>(16316, 9176066224086546928L ^ var14), 0, ht::a, ht::c, 0.5D, 0.25D);
                  BODY = new ht(true.j<invokedynamic>(16622, 864229358571226788L ^ var14), 1, ht::g, ht::m, 0.7D, 0.2D);
                  LEFT_ARM = new ht(true.j<invokedynamic>(3546, 5969508716428413850L ^ var14), 2, ht::G, ht::j, 0.6D, 0.2D);
                  RIGHT_ARM = new ht(true.j<invokedynamic>(13620, 3756954537188062064L ^ var14), 3, ht::k, ht::l, 0.6D, 0.2D);
                  LEFT_LEG = new ht(true.j<invokedynamic>(23582, 7137500625435236956L ^ var14), 4, ht::A, ht::h, 0.7D, 0.2D);
                  RIGHT_LEG = new ht(true.j<invokedynamic>(30060, 175283333079348002L ^ var14), 5, ht::I, ht::H, 0.7D, 0.2D);
                  s = EnumEntriesKt.enumEntries((Enum[])m);
                  return;
               }

               var8 = var9.charAt(var7);
               break;
            default:
               var12[var10++] = var25;
               if ((var7 += var8) < var11) {
                  var8 = var9.charAt(var7);
                  continue label37;
               }

               var9 = "¿Ï@ÛaËoØc³3h;Ç7|\u0010É¼Æc~\u0086ÞÜ_\u0081z0$\u0080]!";
               var11 = "¿Ï@ÛaËoØc³3h;Ç7|\u0010É¼Æc~\u0086ÞÜ_\u0081z0$\u0080]!".length();
               var8 = 16;
               var7 = -1;
            }

            ++var7;
            var19 = var9.substring(var7, var7 + var8);
            var21 = 0;
         }
      }
   }

   public static void l(boolean var0) {
      l = var0;
   }

   public static boolean C() {
      return l;
   }

   public static boolean q() {
      boolean var0 = C();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
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
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ht", var10);
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
         throw new RuntimeException("su/catlean/ht" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
