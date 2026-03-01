package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class a3 extends a_ {
   @NotNull
   private final zf v;
   private boolean E;
   @NotNull
   private final aa n;
   @NotNull
   private List x;
   private float p;
   private boolean c;
   private static final long a = j0.a(-5486993090970200457L, 844142988670579792L, MethodHandles.lookup().lookupClass()).a(52728942074922L);
   private static final String[] g;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] j;
   private static final Integer[] k;
   private static final Map l;
   private static final long m;

   public a3(long a, @NotNull zf setting) {
      var1 ^= a;
      long var4 = var1 ^ 45518282569979L;
      long var6 = var1 ^ 105877869876246L;
      long var8 = var1 ^ 86361633751012L;
      long var10001 = var1 ^ 41509185437309L;
      int var10 = (int)((var1 ^ 41509185437309L) >>> 48);
      int var11 = (int)(var10001 << 16 >>> 48);
      int var12 = (int)(var10001 << 32 >>> 32);
      var10001 = var1 ^ 100005082648497L;
      int var13 = (int)((var1 ^ 100005082648497L) >>> 32);
      int var14 = (int)(var10001 << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var3, true.s<invokedynamic>(17788, 7545021015311150878L ^ var1));
      super(var6, var3);
      this.v = var3;
      this.n = new aa(sa.OUT_QUINT, m, (short)var10, (short)var11, var12);
      this.x = (List)(new ArrayList());
      Object[] var10000;
      Object var20;
      Enum var21;
      float var10005;
      boolean var22;
      List var26;
      if (this.c) {
         var10000 = this.t().B().getClass().getEnumConstants();
         Intrinsics.checkNotNullExpressionValue(var10000, true.s<invokedynamic>(23931, 6523048928765540112L ^ var1));
         Object[] var16 = var10000;
         boolean var17 = false;
         int var18 = 0;
         int var19 = var16.length;

         while(var18 < var19) {
            var20 = var16[var18];
            var21 = (Enum)var20;
            var22 = false;
            var26 = this.x;
            var10005 = this.p;
            float var10006 = this.L() - 11.0F;
            Intrinsics.checkNotNull(var21);
            var26.add(new pc(var13, 1.0F, var10005, var10006, var21, (char)var14, (aa)null, true.z<invokedynamic>(2008, 9013727225530457008L ^ var1), (DefaultConstructorMarker)null, (char)var15));
            this.p += 15.0F;
            ++var18;
            if (var1 <= 0L || var1 <= 0L) {
               break;
            }
         }

         if (var1 > 0L) {
            return;
         }
      }

      float var25 = 0.0F;
      var25 = 2.0F;
      var10000 = this.t().B().getClass().getEnumConstants();
      Intrinsics.checkNotNullExpressionValue(var10000, true.s<invokedynamic>(30002, 7280495109651554135L ^ var1));
      Object[] var28 = var10000;
      boolean var30 = false;
      Iterable var29 = (Iterable)ArraysKt.sortedWith(var28, (Comparator)(new uq()));
      var30 = false;
      Iterator var31 = var29.iterator();

      while(var31.hasNext()) {
         var20 = var31.next();
         var21 = (Enum)var20;
         var22 = false;
         String var23 = var21.name();
         float var24 = g3.X(var4).e(var8, var23) + 4.0F;
         if (var1 < 0L) {
            break;
         }

         float var32;
         int var27 = (var32 = var25 + var24 - (this.L() - 10.0F)) == 0.0F ? 0 : (var32 < 0.0F ? -1 : 1);
         if (var1 > 0L) {
            if (var27 > 0) {
               this.p += 12.0F;
               var25 = 2.0F;
            }

            var26 = this.x;
            var10005 = this.p;
            Intrinsics.checkNotNull(var21);
            var26.add(new pc(var13, var25, var10005, var24, var21, (char)var14, (aa)null, true.z<invokedynamic>(9539, 9072444929010612517L ^ var1), (DefaultConstructorMarker)null, (char)var15));
         }

         var25 += var24 + 2.0F;
         if (var1 <= 0L) {
            break;
         }
      }

   }

   @NotNull
   public zf t() {
      return this.v;
   }

   @NotNull
   public final List D() {
      return this.x;
   }

   public final void k(@NotNull List <set-?>, int a, char a, short a) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var1, true.s<invokedynamic>(13083, 5979608230025156036L ^ var5));
      this.x = var1;
   }

   public void v(@NotNull class_332 context, long a, char a, int mouseX, int mouseY, float factor) {
      // $FF: Couldn't be decompiled
   }

   public void d(double mouseX, double mouseY, long a, int button) {
      // $FF: Couldn't be decompiled
   }

   public void x(double mouseX, double mouseY, int button) {
   }

   public void Z(long a, int key) {
   }

   public void G(long a, char char) {
   }

   public boolean i(int a, int a, int a, double mouseX, double mouseY, double verticalAmount) {
      return false;
   }

   public void e() {
   }

   private static final CharSequence B(String var0) {
      long var1 = a ^ 4764557077695L;
      Intrinsics.checkNotNullParameter(var0, "s");
      int[] var10000 = -7973104158010010540L.A<invokedynamic>(-7973104158010010540L, var1);
      String var4 = var0;
      int[] var3 = var10000;

      int var10;
      label27: {
         label26: {
            try {
               var10 = ((CharSequence)var4).length();
               if (var3 != null) {
                  break label27;
               }

               if (var10 > 0) {
                  break label26;
               }
            } catch (NumberFormatException var8) {
               throw var8.A<invokedynamic>(var8, -7998488394060260940L, var1);
            }

            var10 = 0;
            break label27;
         }

         var10 = 1;
      }

      String var12;
      if (var10 != 0) {
         StringBuilder var11 = new StringBuilder();
         char var5 = var0.charAt(0);
         StringBuilder var7 = var11;
         boolean var6 = false;
         var12 = String.valueOf(var5);
         Intrinsics.checkNotNull(var12, true.s<invokedynamic>(6221, 5472324841261871348L ^ var1));
         var12 = var12.toUpperCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var12, true.s<invokedynamic>(27185, 7755873488516989577L ^ var1));
         var11 = var7.append((CharSequence)var12);
         byte var9 = 1;
         String var10001 = var0.substring(var9);
         Intrinsics.checkNotNullExpressionValue(var10001, true.s<invokedynamic>(29255, 7567465396830558960L ^ var1));
         var12 = var11.append(var10001).toString();
      } else {
         var12 = var0;
      }

      return (CharSequence)var12;
   }

   private static final CharSequence X(String var0) {
      long var1 = a ^ 16590617916023L;
      int[] var10000 = -3489775958485382500L.A<invokedynamic>(-3489775958485382500L, var1);
      Intrinsics.checkNotNullParameter(var0, "s");
      String var4 = var0;
      int[] var3 = var10000;

      int var10;
      label27: {
         label26: {
            try {
               var10 = ((CharSequence)var4).length();
               if (var3 != null) {
                  break label27;
               }

               if (var10 > 0) {
                  break label26;
               }
            } catch (NumberFormatException var8) {
               throw var8.A<invokedynamic>(var8, -3587219987335723140L, var1);
            }

            var10 = 0;
            break label27;
         }

         var10 = 1;
      }

      String var12;
      if (var10 != 0) {
         StringBuilder var11 = new StringBuilder();
         char var5 = var0.charAt(0);
         StringBuilder var7 = var11;
         boolean var6 = false;
         var12 = String.valueOf(var5);
         Intrinsics.checkNotNull(var12, true.s<invokedynamic>(16400, 995166411568395881L ^ var1));
         var12 = var12.toUpperCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var12, true.s<invokedynamic>(4585, 6901869083582588819L ^ var1));
         var11 = var7.append((CharSequence)var12);
         byte var9 = 1;
         String var10001 = var0.substring(var9);
         Intrinsics.checkNotNullExpressionValue(var10001, true.s<invokedynamic>(2018, 2784670736495079825L ^ var1));
         var12 = var11.append(var10001).toString();
      } else {
         var12 = var0;
      }

      return (CharSequence)var12;
   }

   private static final CharSequence I(String var0) {
      long var1 = a ^ 135116070439709L;
      int[] var10000 = 3961943591445935094L.A<invokedynamic>(3961943591445935094L, var1);
      Intrinsics.checkNotNullParameter(var0, "s");
      int[] var3 = var10000;
      String var4 = var0;

      int var10;
      label27: {
         label26: {
            try {
               var10 = ((CharSequence)var4).length();
               if (var3 != null) {
                  break label27;
               }

               if (var10 > 0) {
                  break label26;
               }
            } catch (NumberFormatException var8) {
               throw var8.A<invokedynamic>(var8, 3989581895157333526L, var1);
            }

            var10 = 0;
            break label27;
         }

         var10 = 1;
      }

      String var12;
      if (var10 != 0) {
         StringBuilder var11 = new StringBuilder();
         char var5 = var0.charAt(0);
         StringBuilder var7 = var11;
         boolean var6 = false;
         var12 = String.valueOf(var5);
         Intrinsics.checkNotNull(var12, true.s<invokedynamic>(16400, 995294837994278659L ^ var1));
         var12 = var12.toUpperCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var12, true.s<invokedynamic>(4585, 6901811134214577913L ^ var1));
         var11 = var7.append((CharSequence)var12);
         byte var9 = 1;
         String var10001 = var0.substring(var9);
         Intrinsics.checkNotNullExpressionValue(var10001, true.s<invokedynamic>(2018, 2784727267466807547L ^ var1));
         var12 = var11.append(var10001).toString();
      } else {
         var12 = var0;
      }

      return (CharSequence)var12;
   }

   static {
      long var16 = a ^ 62316015783927L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[15];
      int var23 = 0;
      String var22 = "e\\\u0089Ýú\u0018ÔÈ¹\u008f\u0091âí\fú\"ê\u001b\u0010\u009c[$\u0080áX[é±ô(¹\u001a\u0097 +ÞC!`8ÔÈÙ\u009f\u0098\u0091\u001a®{<(uuÿ\u009aK\u001cí\u0088\u0098ÆÏ\u001fÁìÜ\u0088´\u0015\u0001J²ßs´Í[\u001a\u0099\u008f\u0094J\u0085]/ÀË\t\u0007\u008eº\u0001D\u0084]\u0017R¿6He{®d4Ð¦\u00adÝ\u00193ú\u0085(\u0084¥{Xk7þ81´½.ë¨R\u0094#¾Äff4ÓHU\u008beÊ×\td#³oPæ->H@\u0010bÐp\u0092\u0013P\u0013íùoÿC\u0013¬'g(/\u000bA\u0088x9\u0086\u008c¨\\0\u009b\u009aÛ¬¯ÜÖ\u008c 0·7\u009cïêLÜÚäôY¢\t¶\\d\u0013 E þÒ½\u0081¼\u0082¿úní¤\u001f(\\C\u0093(øÝ\u00187Ë*Ê=¯\u009dæ²B\u008eò\u0010\u008e^mR\u00999\b9xuÁ\t\u0081\u0003.¦\u00185Ê²PXgð\u001e\u0086Ë\u0019¦\u0000ªR*¢BóA\u0002z![(\u0098ÿ2²m\u0089n\u009fU*'9f#\u0095\u0095³è\n±ø\u0015ÌÁ6UzÑÏífö6Ö¨Òâ\"\u0081ù`öÚ,\u001a%Ð¼\u0007\u0081\u009eO\u001aê\u0006Y¡\u008d\u0083#óÒ\n\u0090ÞK'ó\u0080{&é\u0095«\u000e9v\u001f\u0083S+\u0098ø/®*¢Îv¦Þ\u0085Û\u0082\u0017\u001a\u0007î\u0018\u001c\u000b×û\u008eÐU\u0016sz8ÌÓK\u0002t\u007f¸\u000e\u00008¢&9ÄÌküÆ\u001f~\\»µæ<¼1(nø>ýìlD²P½óy4\u001e2\u009c¿k\u0096\u0013ª»é\"h¸Ai\u009aÉX\u001eâI\u0001Ùu\u0013\u009cÈ \b¼½\u0003\u001e^qÈ£Ô½\u0000¾¢ôÈ\u000b\u0086fL\u0003ç\u007f°\u0092\u009f\u0087O:æØ~\u0010rx\u0004\t\u0092\u0011\u0087E\u0005L\u0002Â`¤òÚ";
      int var24 = "e\\\u0089Ýú\u0018ÔÈ¹\u008f\u0091âí\fú\"ê\u001b\u0010\u009c[$\u0080áX[é±ô(¹\u001a\u0097 +ÞC!`8ÔÈÙ\u009f\u0098\u0091\u001a®{<(uuÿ\u009aK\u001cí\u0088\u0098ÆÏ\u001fÁìÜ\u0088´\u0015\u0001J²ßs´Í[\u001a\u0099\u008f\u0094J\u0085]/ÀË\t\u0007\u008eº\u0001D\u0084]\u0017R¿6He{®d4Ð¦\u00adÝ\u00193ú\u0085(\u0084¥{Xk7þ81´½.ë¨R\u0094#¾Äff4ÓHU\u008beÊ×\td#³oPæ->H@\u0010bÐp\u0092\u0013P\u0013íùoÿC\u0013¬'g(/\u000bA\u0088x9\u0086\u008c¨\\0\u009b\u009aÛ¬¯ÜÖ\u008c 0·7\u009cïêLÜÚäôY¢\t¶\\d\u0013 E þÒ½\u0081¼\u0082¿úní¤\u001f(\\C\u0093(øÝ\u00187Ë*Ê=¯\u009dæ²B\u008eò\u0010\u008e^mR\u00999\b9xuÁ\t\u0081\u0003.¦\u00185Ê²PXgð\u001e\u0086Ë\u0019¦\u0000ªR*¢BóA\u0002z![(\u0098ÿ2²m\u0089n\u009fU*'9f#\u0095\u0095³è\n±ø\u0015ÌÁ6UzÑÏífö6Ö¨Òâ\"\u0081ù`öÚ,\u001a%Ð¼\u0007\u0081\u009eO\u001aê\u0006Y¡\u008d\u0083#óÒ\n\u0090ÞK'ó\u0080{&é\u0095«\u000e9v\u001f\u0083S+\u0098ø/®*¢Îv¦Þ\u0085Û\u0082\u0017\u001a\u0007î\u0018\u001c\u000b×û\u008eÐU\u0016sz8ÌÓK\u0002t\u007f¸\u000e\u00008¢&9ÄÌküÆ\u001f~\\»µæ<¼1(nø>ýìlD²P½óy4\u001e2\u009c¿k\u0096\u0013ª»é\"h¸Ai\u009aÉX\u001eâI\u0001Ùu\u0013\u009cÈ \b¼½\u0003\u001e^qÈ£Ô½\u0000¾¢ôÈ\u000b\u0086fL\u0003ç\u007f°\u0092\u009f\u0087O:æØ~\u0010rx\u0004\t\u0092\u0011\u0087E\u0005L\u0002Â`¤òÚ".length();
      char var21 = 24;
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
                  g = var25;
                  h = new String[15];
                  l = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[13];
                  int var8 = 0;
                  String var9 = "\u008dîd ìõöû¡\f\u0018²\u001dW\u0088í\n\\\u0090\u001b\u0098Êß:\u0013ÈÁ°lò\u001c\u009f\u009dèêA?ÃÚ\u009e\u001bç\u001b\u0019\bùK\u0099õÊ\"¾\u0016Û\u0013\u0015À\u001câªñ\u0083Z¸X\u0013\u00800º9\u001cìúÅ\u0089\u0016\u001b\u0015KùKû\u00926A¬1d";
                  int var10 = "\u008dîd ìõöû¡\f\u0018²\u001dW\u0088í\n\\\u0090\u001b\u0098Êß:\u0013ÈÁ°lò\u001c\u009f\u009dèêA?ÃÚ\u009e\u001bç\u001b\u0019\bùK\u0099õÊ\"¾\u0016Û\u0013\u0015À\u001câªñ\u0083Z¸X\u0013\u00800º9\u001cìúÅ\u0089\u0016\u001b\u0015KùKû\u00926A¬1d".length();
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
                              j = var11;
                              k = new Integer[13];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = 2514800870272563631L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var34 = true;
                              m = var36;
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var39;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "\u0001~\u0003«\u009chá2\u009e2¹nJIÄ0";
                           var10 = "\u0001~\u0003«\u009chá2\u009e2¹nJIÄ0".length();
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

               var22 = "÷ö¿9I\bÁï\u000bq\u0017^\u001d\u0003\u0099\u0092Ú\u0007\u0082]È|þ\u008a&\u0004Nlä\u0092\u0091\u0097Ö\u0083úõ¬0yñ(&\u007fbO\u000bi\u008dÐ»\u0003(¾àß\u009dVR\u0003]ÖR«SÙôÐ\u0098Ü«\n\u0013àÛâs\u0004\u007f·\rW";
               var24 = "÷ö¿9I\bÁï\u000bq\u0017^\u001d\u0003\u0099\u0092Ú\u0007\u0082]È|þ\u008a&\u0004Nlä\u0092\u0091\u0097Ö\u0083úõ¬0yñ(&\u007fbO\u000bi\u008dÐ»\u0003(¾àß\u009dVR\u0003]ÖR«SÙôÐ\u0098Ü«\n\u0013àÛâs\u0004\u007f·\rW".length();
               var21 = '(';
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14522;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/a3", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("su/catlean/a3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3775;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = j[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/a3", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
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
         throw new RuntimeException("su/catlean/a3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
