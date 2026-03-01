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
import net.minecraft.class_630;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;

public final class fu {
   @NotNull
   public static final fu M;
   private static final long a = j0.a(1677406518844421422L, 5770326426699885206L, MethodHandles.lookup().lookupClass()).a(131490104010998L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private fu() {
   }

   public final void Y(@NotNull class_4587 stack, @NotNull Color lineColor, @NotNull Color friendLineColor, boolean extraPart, long a) {
      // $FF: Couldn't be decompiled
   }

   private final void X(class_630 var1, float var2, class_4587 var3, Color var4, long var5, ib var7) {
      var5 ^= a;
      long var10001 = var5 ^ 28566261315805L;
      int var8 = (int)((var5 ^ 28566261315805L) >>> 32);
      int var9 = (int)(var10001 << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var5 ^ 43300964241317L;
      long var13 = var5 ^ 134041513306317L;
      this.K(var3, var1, var13);
      Matrix4f var15 = var3.method_23760().method_23761();
      Intrinsics.checkNotNullExpressionValue(var15, true.x<invokedynamic>(13388, 2242994770838089815L ^ var5));
      ib var10000 = var7.A(var15, var8, 0.0F, (char)var9, 0.0F, var10, 0.0F).N(var4, var11);
      var15 = var3.method_23760().method_23761();
      Intrinsics.checkNotNullExpressionValue(var15, true.x<invokedynamic>(480, 4682239856641590769L ^ var5));
      var10000.A(var15, var8, 0.0F, (char)var9, var2, var10, 0.0F).N(var4, var11);
      var3.method_22909();
   }

   private final void K(class_4587 param1, class_630 param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 100610017049572L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[16];
      int var18 = 0;
      String var17 = "Êæ~¾Ø\u0012\u008c\u009fÚv(û\u0087\u000e\u001d\u000b\u001cûC(\u0000¤6^óx\u008f¡\u0013öúU\u0010*´\"Æ.j÷bÇ\u009d\u0090.@\u008fô\u0002 3kyI¸õ£\u0096ÊöÖÈ*iÿ75\u001a-Í\u0011ðã\u0001\u0013á¢\u0096[ý§¡ĐH$fN62é^L\u009e\u0000¹\u009dfb!ùµ#\u001dé¥\t\u0090¯\u0087\u0001.ÙþI\u00167¸Ù\u0003^I«\u0005Ëñ6ûa*Î³ª\u0000@u\u009fË\u0096Åï\u001b\u009c\u0003Â\u008a=\u001aQ>)\u0005mµæ6\u000e\u0010ò\u007fýc=¹\u001a¯ÍçÍc(\u008c<®ê¡QÜû\u0081\u009c\u0093ôâÚ}\u00adê\u0097íô\\w-2[&¹¯nY\u0085-ø\u0006î\u00826WÆè\u001fVgiÓTêU\\\u0012âàI\bÝ|°\u0007h<\u0096ð\u001fø\u0000HR\u001fÑã\u007f¤b\u0089Úü\u007fz\u0010\u0083\u001a7\u001a¤æ\u0001áÉ\n\u0012®`Ö\u0019wç4\"Z¿¡\u0017Ä\u0099\u0084e¢ô\u001bPJ[£_¡$\u0089\u0094\u0087e\u0086Þ\u008eó\f\u00962V l²\u009fáNy¿\u0012sôäöÐÍw\u0094À_òÎêù=³ÐE?õE³ÊlQ<*\u0091®H¬\u0016zõÕù\u008fi\u0011Ì.\u0016Ñ\u008açy\u0091â(\u0086V\u001bä*¦2\u0006\u0001\u009fÛðmÙÁS¦Æ\u0089\u001e\"o\u009b\u0090»YûI6[\u000f\u009bå~&lAÆ7f\u0018\u0007ß}d\u001c\\Ë^\u009f8ð£.\u0086\u0006 \u0094ü2êcê%Â\u0010g\u00147\u008e\u009d¸+\u008c\u0014\b'&1\u0005Q>\u00180\u0096eg´].âµÔ:\u0085yj\u001f°ïX:-ÓáG¬ ÂGÒSdnÚÌPî\u0082®OÓmáÛA\u001d²Ò#¡Ò+\u0013ÅË\u001e\u0012gH\u00109Ó\u001fCªïfj@´+òÓ\b\u0002m\u0010î y¹ñ\u0081ùÅ\u0015ý<q½Ññk¨\u0014¯/Ó´\u00833\u001bÇòØ%}È¸jçêÇ\u008eÀ\u001a\u001b\u001e#Ñ¡v¾\fu¿\u001a»GÅ¼Ýe¿©ê\u000eûs§´I\u0081\u0098Äïtµ)\u0017ªôÑKå%ÐKy2]\u0097÷m#rØ´}U\u0014K¯\u0082\u0089¯âê\u0097\u000eZy\u0083©\ná \u007f\u0092\u0015|º9³íªïö\u008b\u001e¼\u0091d\u000b\u0098m-Ch\u0097MzôÏ~\u001c·ÑäIÆ6\u0083é#áv*~A+·¬\u00880¿:\u0098.\u0096®\u001c«\u0093ªiâbÊ;ò\u0093¬Â\u0095\u0097/0Ô¥´¯ ÓÛlÛ|,ªã¼î2\u0082Ø\u0002??#Ç\f,7 9=\u008eF\u0001.î\u0098j\\\u0018Ð\u008c\u0006Ý\u001e\u009bè÷\"Íé¼yÆt¶üä\u008eðÐ<Ï\u0015";
      int var19 = "Êæ~¾Ø\u0012\u008c\u009fÚv(û\u0087\u000e\u001d\u000b\u001cûC(\u0000¤6^óx\u008f¡\u0013öúU\u0010*´\"Æ.j÷bÇ\u009d\u0090.@\u008fô\u0002 3kyI¸õ£\u0096ÊöÖÈ*iÿ75\u001a-Í\u0011ðã\u0001\u0013á¢\u0096[ý§¡ĐH$fN62é^L\u009e\u0000¹\u009dfb!ùµ#\u001dé¥\t\u0090¯\u0087\u0001.ÙþI\u00167¸Ù\u0003^I«\u0005Ëñ6ûa*Î³ª\u0000@u\u009fË\u0096Åï\u001b\u009c\u0003Â\u008a=\u001aQ>)\u0005mµæ6\u000e\u0010ò\u007fýc=¹\u001a¯ÍçÍc(\u008c<®ê¡QÜû\u0081\u009c\u0093ôâÚ}\u00adê\u0097íô\\w-2[&¹¯nY\u0085-ø\u0006î\u00826WÆè\u001fVgiÓTêU\\\u0012âàI\bÝ|°\u0007h<\u0096ð\u001fø\u0000HR\u001fÑã\u007f¤b\u0089Úü\u007fz\u0010\u0083\u001a7\u001a¤æ\u0001áÉ\n\u0012®`Ö\u0019wç4\"Z¿¡\u0017Ä\u0099\u0084e¢ô\u001bPJ[£_¡$\u0089\u0094\u0087e\u0086Þ\u008eó\f\u00962V l²\u009fáNy¿\u0012sôäöÐÍw\u0094À_òÎêù=³ÐE?õE³ÊlQ<*\u0091®H¬\u0016zõÕù\u008fi\u0011Ì.\u0016Ñ\u008açy\u0091â(\u0086V\u001bä*¦2\u0006\u0001\u009fÛðmÙÁS¦Æ\u0089\u001e\"o\u009b\u0090»YûI6[\u000f\u009bå~&lAÆ7f\u0018\u0007ß}d\u001c\\Ë^\u009f8ð£.\u0086\u0006 \u0094ü2êcê%Â\u0010g\u00147\u008e\u009d¸+\u008c\u0014\b'&1\u0005Q>\u00180\u0096eg´].âµÔ:\u0085yj\u001f°ïX:-ÓáG¬ ÂGÒSdnÚÌPî\u0082®OÓmáÛA\u001d²Ò#¡Ò+\u0013ÅË\u001e\u0012gH\u00109Ó\u001fCªïfj@´+òÓ\b\u0002m\u0010î y¹ñ\u0081ùÅ\u0015ý<q½Ññk¨\u0014¯/Ó´\u00833\u001bÇòØ%}È¸jçêÇ\u008eÀ\u001a\u001b\u001e#Ñ¡v¾\fu¿\u001a»GÅ¼Ýe¿©ê\u000eûs§´I\u0081\u0098Äïtµ)\u0017ªôÑKå%ÐKy2]\u0097÷m#rØ´}U\u0014K¯\u0082\u0089¯âê\u0097\u000eZy\u0083©\ná \u007f\u0092\u0015|º9³íªïö\u008b\u001e¼\u0091d\u000b\u0098m-Ch\u0097MzôÏ~\u001c·ÑäIÆ6\u0083é#áv*~A+·¬\u00880¿:\u0098.\u0096®\u001c«\u0093ªiâbÊ;ò\u0093¬Â\u0095\u0097/0Ô¥´¯ ÓÛlÛ|,ªã¼î2\u0082Ø\u0002??#Ç\f,7 9=\u008eF\u0001.î\u0098j\\\u0018Ð\u008c\u0006Ý\u001e\u009bè÷\"Íé¼yÆt¶üä\u008eðÐ<Ï\u0015".length();
      char var16 = ' ';
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
                  c = new String[16];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[10];
                  int var3 = 0;
                  String var4 = "Ø\b.\u001c\u0007P£]ø\\ôù\u0017aí\u0004Xª¥@\\ã}Ôá8ïÜ\u0094¬áÎÓ Õëí\u009dñØ\u009df$Áµï\u0014\u000bHÓÑÉ\rHÑ\u0090Ø\u0080G\u0092iõw,";
                  int var5 = "Ø\b.\u001c\u0007P£]ø\\ôù\u0017aí\u0004Xª¥@\\ã}Ôá8ïÜ\u0094¬áÎÓ Õëí\u009dñØ\u009df$Áµï\u0014\u000bHÓÑÉ\rHÑ\u0090Ø\u0080G\u0092iõw,".length();
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
                              f = new Integer[10];
                              M = new fu();
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "%½üt\u0013íÁH¿7,\u001frÈ\u0014\u0019";
                           var5 = "%½üt\u0013íÁH¿7,\u001frÈ\u0014\u0019".length();
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

               var17 = "ÁÃ\u001a\u009fI{k#êê¤¨Âÿd£Qª_s1\u0001S¬Gcú÷1\u0084¾\u001c8r£\b\u0017_L\u0017áÓ.zÿsJa¼\u0082âÙh\u001f\u001f\u0019íÜ¢ÝÃsE%\u0011ºG ¾zådÒ\n\u0081r\u0013Ú5¤è¡¹ë®)éÉÆ";
               var19 = "ÁÃ\u001a\u009fI{k#êê¤¨Âÿd£Qª_s1\u0001S¬Gcú÷1\u0084¾\u001c8r£\b\u0017_L\u0017áÓ.zÿsJa¼\u0082âÙh\u001f\u001f\u0019íÜ¢ÝÃsE%\u0011ºG ¾zådÒ\n\u0081r\u0013Ú5¤è¡¹ë®)éÉÆ".length();
               var16 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11597;
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
            throw new RuntimeException("su/catlean/fu", var10);
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
         throw new RuntimeException("su/catlean/fu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32130;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/fu", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("su/catlean/fu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
