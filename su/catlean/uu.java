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

public final class uu {
   @NotNull
   private String S;
   @NotNull
   private final mm A;
   private float T;
   private float G;
   @NotNull
   private Color P;
   private boolean X;
   private boolean Y;
   private boolean D;
   private boolean N;
   private float r;
   private float n;
   @NotNull
   private final aa b;
   @NotNull
   private final aa f;
   @NotNull
   private final aa i;
   @NotNull
   private final ArrayList B;
   private static final long a = j0.a(5859586359609830339L, 984841467731825278L, MethodHandles.lookup().lookupClass()).a(169962003566858L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map j;
   private static final long[] k;
   private static final Long[] l;
   private static final Map m;

   public uu(@NotNull String id, @NotNull mm theme, float x, float y, long a, @NotNull Color setting) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final String e() {
      return this.S;
   }

   public final void M(long a, @NotNull String <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(18737, 3732266195311280669L ^ var1));
      this.S = var3;
   }

   @NotNull
   public final mm N() {
      return this.A;
   }

   public final float r() {
      return this.T;
   }

   public final void u(float <set-?>) {
      this.T = var1;
   }

   public final float l() {
      return this.G;
   }

   public final void L(float <set-?>) {
      this.G = var1;
   }

   @NotNull
   public final Color a() {
      return this.P;
   }

   public final void U(char a, int a, char a, @NotNull Color <set-?>) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var4, true.i<invokedynamic>(2425, 4924170275699954495L ^ var5));
      this.P = var4;
   }

   public final float p() {
      return this.r;
   }

   public final void t(float <set-?>) {
      this.r = var1;
   }

   public final float n() {
      return this.n;
   }

   public final void K(float <set-?>) {
      this.n = var1;
   }

   public final void W(@NotNull class_332 context, int mouseX, int mouseY, long a) {
      // $FF: Couldn't be decompiled
   }

   private final void t(long var1, Matrix3x2fStack var3, int var4, int var5) {
      var1 ^= a;
      long var10001 = var1 ^ 74070684157856L;
      int var6 = (int)((var1 ^ 74070684157856L) >>> 32);
      int var7 = (int)(var10001 << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var1 ^ 63813805448000L;
      float var12 = this.T + this.r - 48.0F + 2.0F;
      String[] var10000 = 670676233088113471L.A<invokedynamic>(670676233088113471L, var1);
      float var13 = this.G + 10.0F + 2.0F;
      float[] var14 = new float[3];
      Color.RGBtoHSB(this.P.getRed(), this.P.getGreen(), this.P.getBlue(), var14);
      float var10002 = var12 - 4.0F + (float)true.o<invokedynamic>(14049, 3941628461916131804L ^ var1) * var14[1];
      float var10003 = var13 - 4.0F + (float)true.o<invokedynamic>(21163, 4899802510581167518L ^ var1) * (1.0F - var14[2]);
      char var10010 = (char)var7;
      Color var10012 = this.P;
      Color var10013 = Color.BLACK;
      Intrinsics.checkNotNullExpressionValue(var10013, true.i<invokedynamic>(26855, 8041813577119366828L ^ var1));
      _8.M(var3, var10002, var10003, 7.0F, 7.0F, 2.5F, var6, 1.5F, 1.0F, var10010, 1.0F, var10012, var10013, 0.0F, 0.0F, (short)var8, 0.0F, true.o<invokedynamic>(24748, 1659386953361803152L ^ var1), (Object)null);
      String[] var11 = var10000;

      int var18;
      label20: {
         try {
            var18 = this.Y;
            if (var11 == null) {
               break label20;
            }

            if (var18 == 0) {
               return;
            }
         } catch (NumberFormatException var17) {
            throw var17.A<invokedynamic>(var17, 689526637173370937L, var1);
         }

         var18 = var4;
      }

      float var15 = Math.clamp(((float)var18 - var12) / 40.0F, 0.0F, 1.0F);
      float var16 = Math.clamp(1.0F - ((float)var5 - var13) / 40.0F, 0.0F, 1.0F);
      this.P = gk.E.e(var9, new Color(Color.HSBtoRGB(var14[0], var15, var16)), (float)this.P.getAlpha() / 255.0F);
   }

   private final void j(long param1, Matrix3x2fStack param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private final void Q(int var1, short var2, Matrix3x2fStack var3, short var4, int var5) {
      long var6 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var10001 = var6 ^ 100507295653290L;
      int var8 = (int)((var6 ^ 100507295653290L) >>> 32);
      int var9 = (int)(var10001 << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var6 ^ 37645627572554L;
      String[] var10000 = -3223275168739278539L.A<invokedynamic>(-3223275168739278539L, var6);
      float var14 = this.T;
      float[] var15 = new float[3];
      String[] var13 = var10000;

      int var18;
      label20: {
         try {
            Color.RGBtoHSB(this.P.getRed(), this.P.getGreen(), this.P.getBlue(), var15);
            _8.M(var3, var14 - 3.5F + (float)true.o<invokedynamic>(9414, 3027907848428706293L ^ var6) * var15[0], this.G + 52.0F, 7.0F, 7.0F, 2.5F, var8, 1.0F, 1.0F, (char)var9, 1.0F, new Color(Color.HSBtoRGB(var15[0], 1.0F, 1.0F)), new Color(Color.HSBtoRGB(var15[0], 1.0F, 1.0F)), 0.0F, 0.0F, (short)var10, 0.0F, true.o<invokedynamic>(31871, 4659345678649393473L ^ var6), (Object)null);
            var18 = this.N;
            if (var13 == null) {
               break label20;
            }

            if (var18 == 0) {
               return;
            }
         } catch (NumberFormatException var17) {
            throw var17.A<invokedynamic>(var17, -3198777402396923341L, var6);
         }

         var18 = var5;
      }

      float var16 = Math.clamp(((float)var18 - var14) / 107.0F, 0.0F, 1.0F);
      this.P = gk.E.e(var11, new Color(Color.HSBtoRGB(var16, var15[1], var15[2])), (float)this.P.getAlpha() / 255.0F);
   }

   public final void T(double mouseX, double mouseY, long a, int button) {
      // $FF: Couldn't be decompiled
   }

   public final void P() {
      this.Y = false;
      this.N = false;
      this.D = false;
   }

   public final void P(int key, long a) {
      // $FF: Couldn't be decompiled
   }

   public final void q(char char, short a, int a, char a) {
      // $FF: Couldn't be decompiled
   }

   public final void O(double mouseX, double mouseY, short a, short a, int a, double verticalAmount) {
      // $FF: Couldn't be decompiled
   }

   private final void h(long param1, mm param3) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var22 = a ^ 54180876854737L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var25 = 1; var25 < 8; ++var25) {
         var10003[var25] = (byte)((int)(var22 << var25 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[26];
      int var29 = 0;
      String var28 = "9\u001a\u009c\u0010ò\u0000ü5ÍXKÞ£Í\u000bª\u001baKè\u0088íH\u0083î(\u008a\u0016\u0087O\u0017\u009d(\"&²váwF~5\u001eé \f÷9oIºNf×\u001bO/ÆA\u007fÎü~¦jA&$½+(&÷\u0018\u0011\u0004å$\u0000H§\u0099ÐáI1\bH1ùË«£\u0092·\u0091W6 YxÓéÌ\u0094M\u00ad¥~ÑÕ\u007få£±ãúËÖ8ürNeæ¾#®¥o\u0011 Õ\u008bq\u0003\u0096\tå®ÃeÕX¥k\u0082>ÒÄËõ÷\u0095%\u0019ÆÇ0÷V\u0002£\u0000 L\u0088Ü:\u0098T3\u001bjj)\"Ake·\"\u0094|ë~*\u0094u\u009aí5\u008b\u0012vø\u0083\u0010S\u009b\u0099¤ÛRU ÕjF\u0004±®\u0093Ö\u0010û£@Éé\u0002\u0088©\u0082\u0095Ýå5o.ì\u0018wÉ0b\u0005Z]q=!\u0010\u0086ã\u0005\u007f;\u0014\t*_íV\nA0Çµ©Ð¼\u0095Ií\u0017ßwþp\u001cß\u0010Åö|\rfàëùvkbòt/û\u008f#´ZÜ×ØFÛ\u0004Ê\u000f\u009bAûm'\u0010\u008b¿êû¯§Ø\u0090Zy\rá£ZóØ ð.¾ÒÐ\u009fó;?{´'Ç=\u0095\u00860ÎÂÝ \u0085\riÑØDk{\u0005\u008aÉ\u0010/&¹x\b¿\u008fÇ_$\u0098\u0096xU,¾\u0010¿õ\u001b\u001cYêë_¯\u0080Uê\u0014~\u008bò\u0010j0O\u00841vHÈ\u001aåZ³?÷\u0013\u0091\u0010ò\u009aå[V\u0083[X(âÄ\u0081\u0089\u0011D \u0010(ôK\u0007À\u0080\u008b&\u008fkÊ÷'ä+C\u0010ß\u008fBWë¯\u0014Þ,ð\u0092vZ\u009a?º\u0010¬qób)þr\u009fT\u000bä´N×\rû\u0010ÝKh\u0005leâ¤\u0095\r\nlûÑ\u0010\r\u00107ä©Ò¦¦\u0098\tjÙÙ\u001eðQ\u0090\n\u0010®@^xØâ\u0006x\u0086\u0005n\u0006³Z_ù\u0010#\u0017\u0018\u000b+T\u0085C\u0081\u0083ÊdX\u0005åo\u00101\u0091,\u001d?j\u0089}oà\"þ\u008cP\n5";
      int var30 = "9\u001a\u009c\u0010ò\u0000ü5ÍXKÞ£Í\u000bª\u001baKè\u0088íH\u0083î(\u008a\u0016\u0087O\u0017\u009d(\"&²váwF~5\u001eé \f÷9oIºNf×\u001bO/ÆA\u007fÎü~¦jA&$½+(&÷\u0018\u0011\u0004å$\u0000H§\u0099ÐáI1\bH1ùË«£\u0092·\u0091W6 YxÓéÌ\u0094M\u00ad¥~ÑÕ\u007få£±ãúËÖ8ürNeæ¾#®¥o\u0011 Õ\u008bq\u0003\u0096\tå®ÃeÕX¥k\u0082>ÒÄËõ÷\u0095%\u0019ÆÇ0÷V\u0002£\u0000 L\u0088Ü:\u0098T3\u001bjj)\"Ake·\"\u0094|ë~*\u0094u\u009aí5\u008b\u0012vø\u0083\u0010S\u009b\u0099¤ÛRU ÕjF\u0004±®\u0093Ö\u0010û£@Éé\u0002\u0088©\u0082\u0095Ýå5o.ì\u0018wÉ0b\u0005Z]q=!\u0010\u0086ã\u0005\u007f;\u0014\t*_íV\nA0Çµ©Ð¼\u0095Ií\u0017ßwþp\u001cß\u0010Åö|\rfàëùvkbòt/û\u008f#´ZÜ×ØFÛ\u0004Ê\u000f\u009bAûm'\u0010\u008b¿êû¯§Ø\u0090Zy\rá£ZóØ ð.¾ÒÐ\u009fó;?{´'Ç=\u0095\u00860ÎÂÝ \u0085\riÑØDk{\u0005\u008aÉ\u0010/&¹x\b¿\u008fÇ_$\u0098\u0096xU,¾\u0010¿õ\u001b\u001cYêë_¯\u0080Uê\u0014~\u008bò\u0010j0O\u00841vHÈ\u001aåZ³?÷\u0013\u0091\u0010ò\u009aå[V\u0083[X(âÄ\u0081\u0089\u0011D \u0010(ôK\u0007À\u0080\u008b&\u008fkÊ÷'ä+C\u0010ß\u008fBWë¯\u0014Þ,ð\u0092vZ\u009a?º\u0010¬qób)þr\u009fT\u000bä´N×\rû\u0010ÝKh\u0005leâ¤\u0095\r\nlûÑ\u0010\r\u00107ä©Ò¦¦\u0098\tjÙÙ\u001eðQ\u0090\n\u0010®@^xØâ\u0006x\u0086\u0005n\u0006³Z_ù\u0010#\u0017\u0018\u000b+T\u0085C\u0081\u0083ÊdX\u0005åo\u00101\u0091,\u001d?j\u0089}oà\"þ\u008cP\n5".length();
      char var27 = ' ';
      int var26 = -1;

      label72:
      while(true) {
         ++var26;
         String var33 = var28.substring(var26, var26 + var27);
         byte var10001 = -1;

         while(true) {
            byte[] var32 = var24.doFinal(var33.getBytes("ISO-8859-1"));
            String var39 = a(var32).intern();
            switch(var10001) {
            case 0:
               var31[var29++] = var39;
               if ((var26 += var27) >= var30) {
                  c = var31;
                  d = new String[26];
                  j = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var22 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var12 = 1; var12 < 8; ++var12) {
                     var10003[var12] = (byte)((int)(var22 << var12 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[10];
                  int var14 = 0;
                  String var15 = "ÄÈl\u0087Ó%RU\u0015m\u000b\u000bå¹qÝ\u0015®íJÓP\u001b\u0018Âdx\u0004°O\u001a\u001coÜ²¬øêØ\u0007î\u0088DVÕ\u0092ì\u0013|Ë÷m\u00122ù\u001d\u009a/c¼æ\u0016*·";
                  int var16 = "ÄÈl\u0087Ó%RU\u0015m\u000b\u000bå¹qÝ\u0015®íJÓP\u001b\u0018Âdx\u0004°O\u001a\u001coÜ²¬øêØ\u0007î\u0088DVÕ\u0092ì\u0013|Ë÷m\u00122ù\u001d\u009a/c¼æ\u0016*·".length();
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
                              g = var17;
                              h = new Integer[10];
                              m = new HashMap(13);
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
                              String var4 = "/Z\u0007\u009b-o¼\u0095ºF!\u0081âÎ0¤";
                              int var5 = "/Z\u0007\u009b-o¼\u0095ºF!\u0081âÎ0¤".length();
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

                              k = var6;
                              l = new Long[2];
                              return;
                           }
                           break;
                        default:
                           var36[var37] = var44;
                           if (var13 < var16) {
                              continue label54;
                           }

                           var15 = "°\u0089aÃËÿ\u0091\u008fòü\u0011L2\u0012\u0096\u0018";
                           var16 = "°\u0089aÃËÿ\u0091\u008fòü\u0011L2\u0012\u0096\u0018".length();
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

               var28 = "K¨\u0086f\u0099ÉzW_\u0011ý³\u0083{G~ÙoúD@j%\u0088$\u0011Õ\u000f\u0097\u0090¥á ¨$\u008b\u0004)¾D2dd\"¨´Kò.,1ÉCSNþ\u007f\u0093\u0099B\u000fèy\u0085ð";
               var30 = "K¨\u0086f\u0099ÉzW_\u0011ý³\u0083{G~ÙoúD@j%\u0088$\u0011Õ\u000f\u0097\u0090¥á ¨$\u008b\u0004)¾D2dd\"¨´Kò.,1ÉCSNþ\u007f\u0093\u0099B\u000fèy\u0085ð".length();
               var27 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7822;
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
            throw new RuntimeException("su/catlean/uu", var10);
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
         throw new RuntimeException("su/catlean/uu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12265;
      if (h[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/uu", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("su/catlean/uu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2142;
      if (l[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = k[var3];
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
            throw new RuntimeException("su/catlean/uu", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         l[var3] = var15;
      }

      return l[var3];
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
         throw new RuntimeException("su/catlean/uu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
