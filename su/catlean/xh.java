package su.catlean;

import java.awt.Color;
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
import net.minecraft.class_4587;
import net.minecraft.class_6364;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class xh {
   @Nullable
   private class_6364 B;
   @Nullable
   private class_6364 l;
   private boolean r;
   private static final long a = j0.a(5827598964783240908L, 1573976288478786083L, MethodHandles.lookup().lookupClass()).a(216312544685103L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @Nullable
   public final class_6364 G() {
      return this.B;
   }

   public final void U(@Nullable class_6364 <set-?>) {
      this.B = var1;
   }

   @Nullable
   public final class_6364 g() {
      return this.l;
   }

   public final void Z(@Nullable class_6364 <set-?>) {
      this.l = var1;
   }

   public final boolean z() {
      return this.r;
   }

   public final void a(boolean <set-?>) {
      this.r = var1;
   }

   public final void J(@NotNull class_4587 stack, boolean crystals, int vDistance, int hDistance, long a) {
      var5 ^= a;
      long var7 = var5 ^ 9805839378960L;
      long var9 = var5 ^ 74810388910675L;
      Intrinsics.checkNotNullParameter(var1, true.c<invokedynamic>(9318, 9175217471156999577L ^ var5));
      this.r = true;
      this.H(var9);
      this.x(var1, var7, var2, var3, var4);
      this.r = false;
   }

   public final void D(@NotNull h3 mode, @NotNull Color color, boolean glass, boolean borders, float radiusValue, float distanceValue, float glowAlphaValue, float lineWidthValue, int colorModev, @NotNull Color color1v, @NotNull Color color2v, int glowQualityV, float glowRadiusV, float glowAlphaMultV, long a, float fillAlphaMultV, float saturationV, float brightnessV, float alpha) {
      // $FF: Couldn't be decompiled
   }

   private final void H(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final void x(class_4587 param1, long param2, boolean param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = a ^ 7995609109880L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[13];
      int var7 = 0;
      String var6 = "\u009eS'õV£¤ö\t@e/yN\u0098ePV-\u0000-!Cÿ\u000eæ§\u0099Kêñl\u0098\u008c¥\t6V\u008a\u008c)Ì2|Ùâuç{¢u/>\u0096\u0083 \u0010X%áçø7Ð0©1\t\u000eÖ1\\F\u001eÎ\u001aÉ\u0080C\u001b>ql\u0098\u0003÷Õ'GU#4kK\u007fáçÚáIúî\u0090#8\bÁe\u00136°\u00830\u0019ýí\u0081Ri)VÀnãc¾\u0087 j§\u0092\u0007<¶ÎB0kÂ\u000e½Ù\u001e\u008b¶Ï o_ç¨52nì\u0088/\u008f?\u0084æLp8\u0001\u0083\u00adÎ;!\u0086XP\u0091A\u000ey\u001aòx¥F\u0002\u0004\u000f(Ec¶³9ÆÑ>½\u0091%\u001f\u0011¨Eò'\u0087õü«\u009f#¹ü6²O£óâºnpìÇ¤\u001d»)(>!\u0087´\u0081ej¼¦\u0003\u0083´ ±Ì\náVã>R\u0083ÒÖ»\u009bKhbÑRÙ Ó3³òyâ*\u0010$\u008dÄ]ç3\u000ft\n\u0084\u0005omÊ\u0099\u0014\u0010på:ô³¬\u0085ç¸\u00ad\u0082T\u009bqc\u0080\u0088¶Mé¬\u0017¬\u008c\u0016È~eª)K2\u0084qbú\u001b\f\b\u0095\u0002¼\u00adå\u009duï¤)a\u008at®0Y\u0092\u0006ÍÅ¥pe¨n\u0012¶\u0018\u001f$\u0019Ú\u0001°ÔOÛc:{\u00adxa£ Év\bY·\u0001Wî\u0003ü\u0086\u0093á\t\u001añ\u0017|ó6\u000e\u0001\u001f\u000bÓ\u00035{ßÜÀß¢^«ãd\u0001õ\"·\u0085g\u008cx\ti4´À¢\u0083\u0083¦´2¿®¾á !¨Ç\u000bökÛ.0d¼J2\u008eÂ\u0011\u0097³¸\u0081\u008dI\u009fw¶é±ÀÒñ,[¿Î½ç-ù\u0097Ù3\u0002ML5Øl\u0006ÿ^zxçééQ\u007f(\u00ad#\u00872\u0012IÏ`?\bÕÖbhY£´Ñ;vpv\u0095Ár{\r^ßëp\u0016Efô½|\u0005F\u001d \u00adG¢6\u000f\u000eÀPªb¬· \u0096¾y5½OKë)¶(ßøÙ¢Õk¶í\u0010R\u001cè*÷t¶6Ó#M=ç¨³ì";
      int var8 = "\u009eS'õV£¤ö\t@e/yN\u0098ePV-\u0000-!Cÿ\u000eæ§\u0099Kêñl\u0098\u008c¥\t6V\u008a\u008c)Ì2|Ùâuç{¢u/>\u0096\u0083 \u0010X%áçø7Ð0©1\t\u000eÖ1\\F\u001eÎ\u001aÉ\u0080C\u001b>ql\u0098\u0003÷Õ'GU#4kK\u007fáçÚáIúî\u0090#8\bÁe\u00136°\u00830\u0019ýí\u0081Ri)VÀnãc¾\u0087 j§\u0092\u0007<¶ÎB0kÂ\u000e½Ù\u001e\u008b¶Ï o_ç¨52nì\u0088/\u008f?\u0084æLp8\u0001\u0083\u00adÎ;!\u0086XP\u0091A\u000ey\u001aòx¥F\u0002\u0004\u000f(Ec¶³9ÆÑ>½\u0091%\u001f\u0011¨Eò'\u0087õü«\u009f#¹ü6²O£óâºnpìÇ¤\u001d»)(>!\u0087´\u0081ej¼¦\u0003\u0083´ ±Ì\náVã>R\u0083ÒÖ»\u009bKhbÑRÙ Ó3³òyâ*\u0010$\u008dÄ]ç3\u000ft\n\u0084\u0005omÊ\u0099\u0014\u0010på:ô³¬\u0085ç¸\u00ad\u0082T\u009bqc\u0080\u0088¶Mé¬\u0017¬\u008c\u0016È~eª)K2\u0084qbú\u001b\f\b\u0095\u0002¼\u00adå\u009duï¤)a\u008at®0Y\u0092\u0006ÍÅ¥pe¨n\u0012¶\u0018\u001f$\u0019Ú\u0001°ÔOÛc:{\u00adxa£ Év\bY·\u0001Wî\u0003ü\u0086\u0093á\t\u001añ\u0017|ó6\u000e\u0001\u001f\u000bÓ\u00035{ßÜÀß¢^«ãd\u0001õ\"·\u0085g\u008cx\ti4´À¢\u0083\u0083¦´2¿®¾á !¨Ç\u000bökÛ.0d¼J2\u008eÂ\u0011\u0097³¸\u0081\u008dI\u009fw¶é±ÀÒñ,[¿Î½ç-ù\u0097Ù3\u0002ML5Øl\u0006ÿ^zxçééQ\u007f(\u00ad#\u00872\u0012IÏ`?\bÕÖbhY£´Ñ;vpv\u0095Ár{\r^ßëp\u0016Efô½|\u0005F\u001d \u00adG¢6\u000f\u000eÀPªb¬· \u0096¾y5½OKë)¶(ßøÙ¢Õk¶í\u0010R\u001cè*÷t¶6Ó#M=ç¨³ì".length();
      char var5 = ' ';
      int var4 = -1;

      label27:
      while(true) {
         ++var4;
         String var11 = var6.substring(var4, var4 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var10).intern();
            switch(var10001) {
            case 0:
               var9[var7++] = var15;
               if ((var4 += var5) >= var8) {
                  b = var9;
                  c = new String[13];
                  return;
               }

               var5 = var6.charAt(var4);
               break;
            default:
               var9[var7++] = var15;
               if ((var4 += var5) < var8) {
                  var5 = var6.charAt(var4);
                  continue label27;
               }

               var6 = "\u0090W\u0098º>\u0086\nÊ0\u001ft\u0017D\nç¬\u0018=\u0011\u0013ÿ¤ÜÙ\u000bÏ8\u000e þw£\u009d1m\b´5(?\u0014";
               var8 = "\u0090W\u0098º>\u0086\nÊ0\u001ft\u0017D\nç¬\u0018=\u0011\u0013ÿ¤ÜÙ\u000bÏ8\u000e þw£\u009d1m\b´5(?\u0014".length();
               var5 = 16;
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26094;
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
            throw new RuntimeException("su/catlean/xh", var10);
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
         throw new RuntimeException("su/catlean/xh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
