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
import org.jetbrains.annotations.NotNull;

public final class _q {
   @NotNull
   public static final _q V;
   private static final long a = j0.a(7682942537280266820L, 3299189372562706234L, MethodHandles.lookup().lookupClass()).a(209726826187474L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private _q() {
   }

   public final void U(@NotNull ic mode, @NotNull Color fillColor, int a, short a, @NotNull Color lineColor, short a, int vDistance, int hDistance) {
      // $FF: Couldn't be decompiled
   }

   public final void S(@NotNull ic mode, @NotNull Color fillColor, @NotNull Color lineColor, @NotNull Color friendFillColor, @NotNull Color friendLineColor, int vDistance, int hDistance, @NotNull Color sFillColor, long a, @NotNull Color sLineColor, @NotNull Color sFriendFillColor, @NotNull Color sFriendLineColor) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = a ^ 38820873086414L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[20];
      int var7 = 0;
      String var6 = "\u0005wñ%î;½\u008a\u0006\u0099÷N8ÈÂoKºl©kÈÛx\u0015ãqáÞªÔZGwô\u0081\u00ad\u0095/*]Üû\u0095púiE\b\u0085q«»\u009dNhÓes\u0080\u008eòLÕñäsð\u009e¤µ_÷ ªÈ\u0092\u00ad!\\Ö¦#\u009c\u001d½Û\u009ep:µ\u000ewøe[«ôcÝ\u0019t\u008bù\\ä/0äNZ\u0018µ»³\u008dÞ\u0080[V\u0014¦§\u001dê(Ó\u0091FdUêï¬ë¥\u0010½`i¬KÙ°<®\t\u000fò¼×Mã ÌBC=\u0084\u0013½vp^g¥@Öë4sÅúò\u0010y.s\u001eý;1ß q: Y§\u008fúåÁèÜöL\u001b(z _ñz?¥Nöôn¼_9GÔ\u0002îø(\u0018;¾´Äµ\bp\n8qÁCÜ\u008f\u00870mÍy\u008dEýðl(ä\u007f¹\u0089òÖBN[\u0012?ÕI\u009fú§g§Á#U½mÃÐ\u0088\u00829Pª\u0016DÍ\u0010ÈRé\u0002?Ý\u0018\u0094N\u009e\u0014ì>\b\u001cÏ\u0092ÓÑJÂl\bs\f\u0093D±×þP\u0010\u0098þb2f«?:¡]\u0006\u0099cÚ¦N0ßí\u0097\bZlO\u009dø\u0094A=ð¯\u001cÀ,o\u0018è\u0006\u0088¨\u0089×\u000fã^¿Í¿»q^Ì\bP\u000eÇ\u008cÌ ÁO\u0085Ø\n? íJ\u0091Aa¹è\u009fÑ®\u0004\u0018´¶®n°Ó\u008fñ¤Úº\u0099¥Íâ 9^\u009e\u008e\u0018Sè¾¯ðÏ\u0003§9Ò\u0083òÝ(6\u0083GµH\u0017Å\u000eZ\u008b\u0018Þx\u0000Ð]\u00ad±\u001fh\u00006²\u007fü`ÐÁU\u001b+³Á\u008bH\u0018/\u0005u\u00ad\tU¨\u008c \u0083êÂËS¸ñ\u0017-\u009a\u0092ë\u0017Q\u0005 \u0086»\u001b$\u0006â\b^\u008d1r\u009f\u0001;\u0016pÎ J\u0006\u0015³D³mXj\u0005[\u001eÙ\u0085(F3J$Ý\u0097\u007f\u0087a)6£û³æ\u0002Ù\u0082M5\u0001.w\u0092ô\u0003nP{oþn{%a\u0097ÕË\u000e2(ÄÙ\u0099\u0015\u0000]\u0086=*ÊXTÖ#9mÎÌMÔ\u0015\u0096A{¬\u0018%d\u0096A%[©3°ÍÜ\u0088\u000bí §\u0087÷bB\u009fÛ\u0016ÊIi\u0003\u009d©Dæl\u0099N\u0012M\u0018Í2 Ê\u0096ZÌ|~Í(Wrâj\u008dÇUyé§ÉûÌ}nÁ\u0010v³å\u0018)5\u008a\u0007?pFx<{|,\u0099\u0084Í\u009a\u0010À2";
      int var8 = "\u0005wñ%î;½\u008a\u0006\u0099÷N8ÈÂoKºl©kÈÛx\u0015ãqáÞªÔZGwô\u0081\u00ad\u0095/*]Üû\u0095púiE\b\u0085q«»\u009dNhÓes\u0080\u008eòLÕñäsð\u009e¤µ_÷ ªÈ\u0092\u00ad!\\Ö¦#\u009c\u001d½Û\u009ep:µ\u000ewøe[«ôcÝ\u0019t\u008bù\\ä/0äNZ\u0018µ»³\u008dÞ\u0080[V\u0014¦§\u001dê(Ó\u0091FdUêï¬ë¥\u0010½`i¬KÙ°<®\t\u000fò¼×Mã ÌBC=\u0084\u0013½vp^g¥@Öë4sÅúò\u0010y.s\u001eý;1ß q: Y§\u008fúåÁèÜöL\u001b(z _ñz?¥Nöôn¼_9GÔ\u0002îø(\u0018;¾´Äµ\bp\n8qÁCÜ\u008f\u00870mÍy\u008dEýðl(ä\u007f¹\u0089òÖBN[\u0012?ÕI\u009fú§g§Á#U½mÃÐ\u0088\u00829Pª\u0016DÍ\u0010ÈRé\u0002?Ý\u0018\u0094N\u009e\u0014ì>\b\u001cÏ\u0092ÓÑJÂl\bs\f\u0093D±×þP\u0010\u0098þb2f«?:¡]\u0006\u0099cÚ¦N0ßí\u0097\bZlO\u009dø\u0094A=ð¯\u001cÀ,o\u0018è\u0006\u0088¨\u0089×\u000fã^¿Í¿»q^Ì\bP\u000eÇ\u008cÌ ÁO\u0085Ø\n? íJ\u0091Aa¹è\u009fÑ®\u0004\u0018´¶®n°Ó\u008fñ¤Úº\u0099¥Íâ 9^\u009e\u008e\u0018Sè¾¯ðÏ\u0003§9Ò\u0083òÝ(6\u0083GµH\u0017Å\u000eZ\u008b\u0018Þx\u0000Ð]\u00ad±\u001fh\u00006²\u007fü`ÐÁU\u001b+³Á\u008bH\u0018/\u0005u\u00ad\tU¨\u008c \u0083êÂËS¸ñ\u0017-\u009a\u0092ë\u0017Q\u0005 \u0086»\u001b$\u0006â\b^\u008d1r\u009f\u0001;\u0016pÎ J\u0006\u0015³D³mXj\u0005[\u001eÙ\u0085(F3J$Ý\u0097\u007f\u0087a)6£û³æ\u0002Ù\u0082M5\u0001.w\u0092ô\u0003nP{oþn{%a\u0097ÕË\u000e2(ÄÙ\u0099\u0015\u0000]\u0086=*ÊXTÖ#9mÎÌMÔ\u0015\u0096A{¬\u0018%d\u0096A%[©3°ÍÜ\u0088\u000bí §\u0087÷bB\u009fÛ\u0016ÊIi\u0003\u009d©Dæl\u0099N\u0012M\u0018Í2 Ê\u0096ZÌ|~Í(Wrâj\u008dÇUyé§ÉûÌ}nÁ\u0010v³å\u0018)5\u008a\u0007?pFx<{|,\u0099\u0084Í\u009a\u0010À2".length();
      char var5 = 136;
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
                  c = new String[20];
                  V = new _q();
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

               var6 = "\u0093¦ò7Èª\u008eF\u009e\u0080Ë\u008a\u009bm\u0090\u009eôñ\u0016\u001eú]ä¶ÂH\u0016CO±Ù[5¼\f\u0097Ç\u0006\"\u0001L\u0004\u0096\u0019\f!ïØ\u009ec^&EG Ê '\u009f¯s\u008eS&\u000e\u001f\u0096B±\u0011ý-\u008e\u0010óãaÓ~+\u0015\u00991jº´\u0019Þf";
               var8 = "\u0093¦ò7Èª\u008eF\u009e\u0080Ë\u008a\u009bm\u0090\u009eôñ\u0016\u001eú]ä¶ÂH\u0016CO±Ù[5¼\f\u0097Ç\u0006\"\u0001L\u0004\u0096\u0019\f!ïØ\u009ec^&EG Ê '\u009f¯s\u008eS&\u000e\u001f\u0096B±\u0011ý-\u008e\u0010óãaÓ~+\u0015\u00991jº´\u0019Þf".length();
               var5 = '8';
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12567;
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
            throw new RuntimeException("su/catlean/_q", var10);
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
         throw new RuntimeException("su/catlean/_q" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
