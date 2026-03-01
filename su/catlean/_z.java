package su.catlean;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
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
import net.minecraft.class_124;
import org.jetbrains.annotations.NotNull;

public final class _z extends _i {
   @NotNull
   public static final _z B;
   private static final long a = j0.a(-7481986105458020513L, 8730401415250025727L, MethodHandles.lookup().lookupClass()).a(129630904249585L);
   private static final String[] c;
   private static final String[] e;
   private static final Map g;
   private static final long[] i;
   private static final Integer[] j;
   private static final Map k;

   private _z(char var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ a;
      long var6 = var4 ^ 8891835932509L;
      super(true.r<invokedynamic>(21447, 4750817869136707480L ^ var4), var6);
   }

   public void T(long a, @NotNull LiteralArgumentBuilder builder) {
      // $FF: Couldn't be decompiled
   }

   private static final int z(CommandContext param0) {
      // $FF: Couldn't be decompiled
   }

   private static final int Y(CommandContext param0) {
      // $FF: Couldn't be decompiled
   }

   private static final int Q(CommandContext param0) {
      // $FF: Couldn't be decompiled
   }

   private static final int R(CommandContext param0) {
      // $FF: Couldn't be decompiled
   }

   private static final int S(CommandContext var0) {
      long var1 = a ^ 122444794395675L;
      long var3 = var1 ^ 82616298485643L;
      B.O(class_124.field_1061 + true.r<invokedynamic>(4033, 4307250169689102263L ^ var1), var3);
      return 1;
   }

   static {
      long var20 = a ^ 35351242604728L;
      long var10001 = var20 ^ 34762464759707L;
      int var22 = (int)((var20 ^ 34762464759707L) >>> 48);
      long var23 = var10001 << 16 >>> 16;
      g = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[26];
      int var16 = 0;
      String var15 = "\u009c¥uÝIN¾²hKU\u008a]è~ñÐØ»QQæ©@\u0018ÐqDòy\u0019\u001f¬o:(\u0000{vñ(9\u0087É¤ÜBn\bý¿úÂYö\u0089Ú\u0002\u0087.È\boALAxH0`,\u0012:»¹nô\u0081RúK\u0010Ò(æ\b Bzè0\u0085¶\u001b³\u0089/ô\u0010õQ7hÑw¸@ú\u0007%\f\u0018Jk\u009c\u0010>rYî½ÞAÉ`Q\u008cËË\u0003ö\u0092\u0010Â°³xàÊ£Ê)aîE(êm88Gþ$h7\u0085Açizq·wîß5zN!@%yB\u0018Ù¦.Ä-ÍÀv\rÞ>ø*\u0019ÞÇ¡ØýNÒ\u0094ò¡ùb¾\u00130\ré,\u0010÷>\u0015\u008c\u0099À\u0003\u009d<\u0005º×\u0080À¨e 4¾ù@¸ýø\r4/¢f\u00adÍ\u0018ùÄF@\u0091\"^6\u00909a\u0000ÿè\u0012\u0019|\u0010Û2fÂ\u0013\u0014ô\f\u001aVc®¦V\u0084Ã \"~Ä\u009cÓ\u0088c+\u0087\u00152\u0012\u0088I£]¿\u009f8:½±&qXNTÛ\u008f%ýæ\u0010Ë9\u0084b\u0081ÖV1\u0016îS\u0083éØÔò À\u0005G\u0002 2\u0081z0Áù¬©ß¨íÀY#1å]2rZ]\u009d\u0006z.Û\u007f\u0010«\f\u009dÇ\u000fUÌ æ©\b}\u0007jî,\u0010J\u0018~\u0007Óß$þÅ%MÚ\u007f\u001etH\u0010\r3\u0010¸{Û\u008b.vl\"jía:\r\u0018¬Þ\u0081+\u0088ZòuøLà\u001dÉ\u0012(\u009c\u0095ûQ` ©¡ù\u0018\u0089\u0082QmB¢Ái\u0018\u0001ÊÓË¢{Qã®F2å°úº\u0010b\u001c¼s>ÍWrý\u0003\u000f\u0005ß Ö¬\u0018\u007fôRó&îÈÇ\u009c\u0094\u00ad÷\u001fýÚÒ\u0002SêíÔþ³U0\u001dÔ8^¤4\u0087÷LjAýÎê\u0086HËÊ wñ\u009b-\u0093\u0018ºÉUUq\u0095Fº\\W>|Ä\u001eº\u0091Ò\u0005¥Í\u00989¥\u0010Âó\u009e\u0091ª>\u0013Éó\u001b\fáG\btÙ\u0010jQ\u0012ù\u0000Ëèº$¡\u0080aOæu\u0080\u0010\u0087\u0003Dý0§a\u0098yí¢-\u0097çéu";
      int var17 = "\u009c¥uÝIN¾²hKU\u008a]è~ñÐØ»QQæ©@\u0018ÐqDòy\u0019\u001f¬o:(\u0000{vñ(9\u0087É¤ÜBn\bý¿úÂYö\u0089Ú\u0002\u0087.È\boALAxH0`,\u0012:»¹nô\u0081RúK\u0010Ò(æ\b Bzè0\u0085¶\u001b³\u0089/ô\u0010õQ7hÑw¸@ú\u0007%\f\u0018Jk\u009c\u0010>rYî½ÞAÉ`Q\u008cËË\u0003ö\u0092\u0010Â°³xàÊ£Ê)aîE(êm88Gþ$h7\u0085Açizq·wîß5zN!@%yB\u0018Ù¦.Ä-ÍÀv\rÞ>ø*\u0019ÞÇ¡ØýNÒ\u0094ò¡ùb¾\u00130\ré,\u0010÷>\u0015\u008c\u0099À\u0003\u009d<\u0005º×\u0080À¨e 4¾ù@¸ýø\r4/¢f\u00adÍ\u0018ùÄF@\u0091\"^6\u00909a\u0000ÿè\u0012\u0019|\u0010Û2fÂ\u0013\u0014ô\f\u001aVc®¦V\u0084Ã \"~Ä\u009cÓ\u0088c+\u0087\u00152\u0012\u0088I£]¿\u009f8:½±&qXNTÛ\u008f%ýæ\u0010Ë9\u0084b\u0081ÖV1\u0016îS\u0083éØÔò À\u0005G\u0002 2\u0081z0Áù¬©ß¨íÀY#1å]2rZ]\u009d\u0006z.Û\u007f\u0010«\f\u009dÇ\u000fUÌ æ©\b}\u0007jî,\u0010J\u0018~\u0007Óß$þÅ%MÚ\u007f\u001etH\u0010\r3\u0010¸{Û\u008b.vl\"jía:\r\u0018¬Þ\u0081+\u0088ZòuøLà\u001dÉ\u0012(\u009c\u0095ûQ` ©¡ù\u0018\u0089\u0082QmB¢Ái\u0018\u0001ÊÓË¢{Qã®F2å°úº\u0010b\u001c¼s>ÍWrý\u0003\u000f\u0005ß Ö¬\u0018\u007fôRó&îÈÇ\u009c\u0094\u00ad÷\u001fýÚÒ\u0002SêíÔþ³U0\u001dÔ8^¤4\u0087÷LjAýÎê\u0086HËÊ wñ\u009b-\u0093\u0018ºÉUUq\u0095Fº\\W>|Ä\u001eº\u0091Ò\u0005¥Í\u00989¥\u0010Âó\u009e\u0091ª>\u0013Éó\u001b\fáG\btÙ\u0010jQ\u0012ù\u0000Ëèº$¡\u0080aOæu\u0080\u0010\u0087\u0003Dý0§a\u0098yí¢-\u0097çéu".length();
      char var14 = '(';
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var25 = var15.substring(var13, var13 + var14);
         byte var27 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var31 = b(var19).intern();
            switch(var27) {
            case 0:
               var18[var16++] = var31;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  e = new String[26];
                  k = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = " \u0001\u007fÏ\u00868ü\u00826¶Ù\u0016\u008d®Tu";
                  int var5 = " \u0001\u007fÏ\u00868ü\u00826¶Ù\u0016\u008d®Tu".length();
                  int var2 = 0;

                  do {
                     int var30 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                     var30 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var33 = true;
                     var6[var30] = var10004;
                  } while(var2 < var5);

                  i = var6;
                  j = new Integer[2];
                  B = new _z((char)var22, var23);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var31;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "û\u0085\u0000\u008c¬>Q\u0084×\u009bå*\u0018Ð1jÉ\rÃW\u009c\u007f\u0088÷\u0007©öqjñ-±ÕÔ¦'\u0013®²\u001cÁ\u0092Â¬â·®Rg¿x\u0015\u008f£qÄæÊX\u009ci\u0003ä\u0005*\u0093bBdhÜCÕc\u0005\u001c¤Ä¦\u001f(\u0095ÍâO\u001d\u0086Kû\u008f\u0004\u009bú\u0084³Ðó\"^ñ¢\u0005¢êÅ\u0017!\u0017òue]\u0013K\u009ft2®£\u009b9";
               var17 = "û\u0085\u0000\u008c¬>Q\u0084×\u009bå*\u0018Ð1jÉ\rÃW\u009c\u007f\u0088÷\u0007©öqjñ-±ÕÔ¦'\u0013®²\u001cÁ\u0092Â¬â·®Rg¿x\u0015\u008f£qÄæÊX\u009ci\u0003ä\u0005*\u0093bBdhÜCÕc\u0005\u001c¤Ä¦\u001f(\u0095ÍâO\u001d\u0086Kû\u008f\u0004\u009bú\u0084³Ðó\"^ñ¢\u0005¢êÅ\u0017!\u0017òue]\u0013K\u009ft2®£\u009b9".length();
               var14 = 'P';
               var13 = -1;
            }

            ++var13;
            var25 = var15.substring(var13, var13 + var14);
            var27 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25465;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/_z", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/_z" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 287;
      if (j[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/_z", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
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
         throw new RuntimeException("su/catlean/_z" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
