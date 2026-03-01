package su.catlean;

import com.mojang.blaze3d.buffers.Std140Builder;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ii implements class_11281 {
   private final float G;
   private final float o;
   @NotNull
   private final Color U;
   @NotNull
   private final Color I;
   @NotNull
   private final Color g;
   @NotNull
   private final Color f;
   private final float t;
   private final float D;
   private static final long a = j0.a(2811998237626010699L, 8902730469082439114L, MethodHandles.lookup().lookupClass()).a(225644269170551L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] h;
   private static final Map i;

   public ii(float halfTexelSizeX, float halfTexelSizeY, @NotNull Color color1, @NotNull Color color2, @NotNull Color color3, byte a, long a, @NotNull Color color4, float lineWidth, float time) {
      long var12 = ((long)var6 << 56 | var7 << 8 >>> 8) ^ a;
      Intrinsics.checkNotNullParameter(var3, true.g<invokedynamic>(2914, 2662350050115080869L ^ var12));
      Intrinsics.checkNotNullParameter(var4, true.g<invokedynamic>(13826, 2255232820366372803L ^ var12));
      Intrinsics.checkNotNullParameter(var5, true.g<invokedynamic>(16995, 3273839958107790252L ^ var12));
      Intrinsics.checkNotNullParameter(var9, true.g<invokedynamic>(14555, 5345098642115322139L ^ var12));
      super();
      this.G = var1;
      this.o = var2;
      this.U = var3;
      this.I = var4;
      this.g = var5;
      this.f = var9;
      this.t = var10;
      this.D = var11;
   }

   public final float N() {
      return this.G;
   }

   public final float n() {
      return this.o;
   }

   @NotNull
   public final Color V() {
      return this.U;
   }

   @NotNull
   public final Color C() {
      return this.I;
   }

   @NotNull
   public final Color L() {
      return this.g;
   }

   @NotNull
   public final Color O() {
      return this.f;
   }

   public final float Y() {
      return this.t;
   }

   public final float I() {
      return this.D;
   }

   public void method_71104(@NotNull ByteBuffer buffer) {
      long var2 = a ^ 128956638989559L;
      long var4 = var2 ^ 46790545704690L;
      long var6 = var2 ^ 98665305963122L;
      long var8 = var2 ^ 91273585462361L;
      long var10 = var2 ^ 98625850840800L;
      9066255049026507755L.A<invokedynamic>(9066255049026507755L, var2);
      Intrinsics.checkNotNullParameter(var1, true.g<invokedynamic>(17865, 2016116196710726865L ^ var2));
      Std140Builder.intoBuffer(var1).putVec2(this.G, this.o).putVec4(gk.E.H(this.U, var8), gk.E.L(var10, this.U), gk.E.M(var4, this.U), gk.E.D(var6, this.U)).putVec4(gk.E.H(this.I, var8), gk.E.L(var10, this.I), gk.E.M(var4, this.I), gk.E.D(var6, this.I)).putVec4(gk.E.H(this.g, var8), gk.E.L(var10, this.g), gk.E.M(var4, this.g), gk.E.D(var6, this.g)).putVec4(gk.E.H(this.f, var8), gk.E.L(var10, this.f), gk.E.M(var4, this.f), gk.E.D(var6, this.f)).putFloat(this.t).putFloat(this.D);

      try {
         if (9051251866385021174L.A<invokedynamic>(9051251866385021174L, var2) == null) {
            (new k9[1]).A<invokedynamic>(new k9[1], 9043013717898560993L, var2);
         }

      } catch (NumberFormatException var13) {
         throw var13.A<invokedynamic>(var13, 9046348046473996952L, var2);
      }
   }

   public final float M() {
      return this.G;
   }

   public final float X() {
      return this.o;
   }

   @NotNull
   public final Color v() {
      return this.U;
   }

   @NotNull
   public final Color T() {
      return this.I;
   }

   @NotNull
   public final Color J() {
      return this.g;
   }

   @NotNull
   public final Color H() {
      return this.f;
   }

   public final float E() {
      return this.t;
   }

   public final float d() {
      return this.D;
   }

   @NotNull
   public final ii s(float halfTexelSizeX, float halfTexelSizeY, long a, @NotNull Color color1, @NotNull Color color2, @NotNull Color color3, @NotNull Color color4, float lineWidth, float time) {
      var3 ^= a;
      long var10001 = var3 ^ 119102363730366L;
      int var11 = (int)((var3 ^ 119102363730366L) >>> 56);
      long var12 = var10001 << 8 >>> 8;
      Intrinsics.checkNotNullParameter(var5, true.g<invokedynamic>(13960, 5011041211512593988L ^ var3));
      Intrinsics.checkNotNullParameter(var6, true.g<invokedynamic>(8260, 2033888250940459139L ^ var3));
      Intrinsics.checkNotNullParameter(var7, true.g<invokedynamic>(9559, 8443755827300371863L ^ var3));
      Intrinsics.checkNotNullParameter(var8, true.g<invokedynamic>(11505, 1827037126603965496L ^ var3));
      return new ii(var1, var2, var5, var6, var7, (byte)var11, var12, var8, var9, var10);
   }

   public static ii t(ii param0, float param1, long param2, float param4, Color param5, Color param6, Color param7, Color param8, float param9, float param10, int param11, Object param12) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 7984319382336L;
      float var3 = this.D;
      float var4 = this.t;
      Color var5 = this.f;
      Color var6 = this.g;
      Color var7 = this.I;
      Color var8 = this.U;
      float var9 = this.o;
      float var10 = this.G;
      String var10000 = 22351.g<invokedynamic>(22351, 2863385430029984230L ^ var1);
      return var10000 + var10 + true.g<invokedynamic>(9487, 9033411529308705703L ^ var1) + var9 + true.g<invokedynamic>(26421, 9208783740752187796L ^ var1) + var8 + true.g<invokedynamic>(15378, 5178280878955268798L ^ var1) + var7 + true.g<invokedynamic>(16219, 2208690716459043299L ^ var1) + var6 + true.g<invokedynamic>(15887, 1446493580683479209L ^ var1) + var5 + true.g<invokedynamic>(30700, 5778710383827632463L ^ var1) + var4 + true.g<invokedynamic>(13471, 5658840575725929010L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 116332709566506L;
      int var3 = Float.hashCode(this.G);
      var3 = var3 * true.r<invokedynamic>(7188, 7266381291061213356L ^ var1) + Float.hashCode(this.o);
      var3 = var3 * true.r<invokedynamic>(24247, 7991728818813811209L ^ var1) + this.U.hashCode();
      var3 = var3 * true.r<invokedynamic>(24247, 7991728818813811209L ^ var1) + this.I.hashCode();
      var3 = var3 * true.r<invokedynamic>(24247, 7991728818813811209L ^ var1) + this.g.hashCode();
      var3 = var3 * true.r<invokedynamic>(24247, 7991728818813811209L ^ var1) + this.f.hashCode();
      var3 = var3 * true.r<invokedynamic>(24247, 7991728818813811209L ^ var1) + Float.hashCode(this.t);
      var3 = var3 * true.r<invokedynamic>(24247, 7991728818813811209L ^ var1) + Float.hashCode(this.D);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 18818660008395L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[17];
      int var18 = 0;
      String var17 = "\u00ad\u008c\u0019\\Y\u0080\u0003\u0093cþÖt:\u0014½\u0085kúxæO\b¨{h\u000bê\u0098Ë;rÐßð-æg^:\u008a8\u0089Ó\u007f»nf\u0014L¤oòRÖ\u0097\u009ac\u0010\u0080\u0006\u000b\u0098|¶Ãs\u00ad\u0084÷\u0006e,×õûLg?ÃX^àæ;YÿÅð/ÍDBÆ/\u0085ÅI\u0010\u00ad\u0015OÏ}\u0018¸Ô\u0000è@èbÉ\u008f9\u0010òÊ\nP.¥\u0098úæ>æÂ\u0086c\u008ba bÆt=\u0097\u0097ê\u001cÂ1ëd\u001e*sëÁ$\u0007hótåT\\\f:\u009fÏò\u008d\u0004\u0010fÅ#7È\u0013qÊ¸Åí÷UÏ^ø\u0010Ý½\u0010z\u001dQ\u0087´Õ\u0087ø^Uø\u001d\t\u0010Õî\u001eÛ³ü\u0001¤\u001f\u0084y:ÉZ ×\u0010¸\u009aã&\u0012TUp¢`Bî\u0093U6\u0087\u0018\u0089\u0002\u008c\u0082Ø\u0093\u0093wqMÓ\u008f$ç×Â\u001a¼\u0084Û<==(\u0010\u001f\u0089¨Á[\u0083\u0085#B6\u0017\u000bðkN\u0097 \u0016:Y~¿\u0082¾Á\f+ûÍ!-\u008a\u0007=\u0081\u008ar)«ë\u0094\u0098©8N«\u009b\u0007V\u0010\u0000\u009d \u0083\u0084 \u0000 c¿³UÁÅuL\u0010\u0093Ïê¨\fb BÒá¿1\u0088üV\u0014\u0018m\u0085\u0001s¿\u001b!Cvú¾sl\u000f\u0080Æ\u008fß~\u008f\u008e½\u000e1";
      int var19 = "\u00ad\u008c\u0019\\Y\u0080\u0003\u0093cþÖt:\u0014½\u0085kúxæO\b¨{h\u000bê\u0098Ë;rÐßð-æg^:\u008a8\u0089Ó\u007f»nf\u0014L¤oòRÖ\u0097\u009ac\u0010\u0080\u0006\u000b\u0098|¶Ãs\u00ad\u0084÷\u0006e,×õûLg?ÃX^àæ;YÿÅð/ÍDBÆ/\u0085ÅI\u0010\u00ad\u0015OÏ}\u0018¸Ô\u0000è@èbÉ\u008f9\u0010òÊ\nP.¥\u0098úæ>æÂ\u0086c\u008ba bÆt=\u0097\u0097ê\u001cÂ1ëd\u001e*sëÁ$\u0007hótåT\\\f:\u009fÏò\u008d\u0004\u0010fÅ#7È\u0013qÊ¸Åí÷UÏ^ø\u0010Ý½\u0010z\u001dQ\u0087´Õ\u0087ø^Uø\u001d\t\u0010Õî\u001eÛ³ü\u0001¤\u001f\u0084y:ÉZ ×\u0010¸\u009aã&\u0012TUp¢`Bî\u0093U6\u0087\u0018\u0089\u0002\u008c\u0082Ø\u0093\u0093wqMÓ\u008f$ç×Â\u001a¼\u0084Û<==(\u0010\u001f\u0089¨Á[\u0083\u0085#B6\u0017\u000bðkN\u0097 \u0016:Y~¿\u0082¾Á\f+ûÍ!-\u008a\u0007=\u0081\u008ar)«ë\u0094\u0098©8N«\u009b\u0007V\u0010\u0000\u009d \u0083\u0084 \u0000 c¿³UÁÅuL\u0010\u0093Ïê¨\fb BÒá¿1\u0088üV\u0014\u0018m\u0085\u0001s¿\u001b!Cvú¾sl\u000f\u0080Æ\u008fß~\u008f\u008e½\u000e1".length();
      char var16 = '(';
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
                  c = new String[17];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[7];
                  int var3 = 0;
                  String var4 = "\u008dÂ¸àp\u009a.¡\u0013,-¸È}\f0\u008cúLÊ\u0010±\n) \u0015\u0081ô?\u0086\u0013Æé\u0010ÿÛ\u0002\u0092{\u008d";
                  int var5 = "\u008dÂ¸àp\u009a.¡\u0013,-¸È}\f0\u008cúLÊ\u0010±\n) \u0015\u0081ô?\u0086\u0013Æé\u0010ÿÛ\u0002\u0092{\u008d".length();
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
                              h = new Integer[7];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "Á%êÂ\u0098ñlßÝVXÝ\u00076g¾";
                           var5 = "Á%êÂ\u0098ñlßÝVXÝ\u00076g¾".length();
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

               var17 = "\u008aãpþëeùú\"k_àÌ\u0093ï\u000f zx¿\u0006P¢</V\u0099E¯.\u0015ïj_\u0004+ÚßViIÄ\u0012uö6g\u0004n";
               var19 = "\u008aãpþëeùú\"k_àÌ\u0093ï\u000f zx¿\u0006P¢</V\u0099E¯.\u0015ïj_\u0004+ÚßViIÄ\u0012uö6g\u0004n".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1364;
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
            throw new RuntimeException("su/catlean/ii", var10);
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
         throw new RuntimeException("su/catlean/ii" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 19502;
      if (h[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ii", var14);
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
         throw new RuntimeException("su/catlean/ii" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
