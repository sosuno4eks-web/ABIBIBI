package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public final class tb extends k9 {
   @NotNull
   public static final tb e;
   static final KProperty[] T;
   @NotNull
   private static final zr W;
   @NotNull
   private static final zr b;
   @NotNull
   private static final zr t;
   private static boolean S;
   private static final long c = j0.a(4052358122364609005L, 311834234511702939L, MethodHandles.lookup().lookupClass()).a(25695999748096L);
   private static final String[] d;
   private static final String[] f;
   private static final Map g;

   private tb(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 29339771417732L;
      super(var3, true.q<invokedynamic>(28031, 9030545975474203132L ^ var1), pa.V(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   @NotNull
   public final sr S(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 119540139108955L;
      int var3 = (int)((var1 ^ 119540139108955L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (sr)W.k((short)var3, this, T[0], (short)var4, var5);
   }

   @NotNull
   public final z5 M(char param1, short param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final ge p(short var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ c;
      long var10001 = var4 ^ 71219619957397L;
      int var6 = (int)((var4 ^ 71219619957397L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      boolean var9 = -478920318807052001L.A<invokedynamic>(-478920318807052001L, var4);

      try {
         ge var10000 = (ge)t.k((short)var6, this, T[2], (short)var7, var8);
         if (var9) {
            (new int[5]).A<invokedynamic>(new int[5], -475981588095092001L, var4);
         }

         return var10000;
      } catch (NumberFormatException var10) {
         throw var10.A<invokedynamic>(var10, -439334638798118267L, var4);
      }
   }

   static {
      long var20 = c ^ 112148246078358L;
      long var22 = var20 ^ 45694542318702L;
      long var24 = var20 ^ 135405798879238L;
      long var10001 = var20 ^ 120237895804543L;
      int var26 = (int)((var20 ^ 120237895804543L) >>> 56);
      int var27 = (int)(var10001 << 8 >>> 32);
      int var28 = (int)(var10001 << 40 >>> 40);
      g = new HashMap(13);
      true.A<invokedynamic>(true, -7519918583858435025L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[10];
      int var16 = 0;
      String var15 = "·Ä\u000f\r\u008fê¤e¼§hæEÏDËÃü'À\u0017u?ç\u0010}¿Ýý$¹ \u0092Y1ì=óí\u0017D\u0018¢Ã\u000bÚÐÞ.m²\u0004x\u009aäk\u0001@\u0084\u0087\u001c\u0087Yø]\u008f\u00181/\u0010\u0087¦\u0007\u0002O*\u0086\u0088à¯#èùgXË\u009a34Ü\u009f\u0080¢N§5\u0087\u0016n\u0006)¦ø%Ê¥çzÓÍÔ\u0094\u0005¿ÈãxË¯0\u0006B½\u0082Ë»Úv\\\u009dÈ\u009a¹3:Û©*+ú \u0098£\u0016Õ´8\u001e+ ïºl=fòawñJ\u0006ï²Åd=¯Ô\u001dá{\u0019t4¶xH&[\u0090S«\u0012\u008f\u009c\u0082¤ÿSh!)£\u0091!ä\u0082¢|·êKÁS~òû\u009d\u001an]*yç 5ìû\u0097o ´õø[í\bXì£\u0089Ù\u0007á+òpKït\u0001¨oÛoBÁ¢V¬C Ü\u0018\u0004*ö\u008e<yÁ\u0012ä°3Ú¥ùÈyï`ãZ#êà£8'\u0015)¤\u0096XIÁ·Al}\u0002s*\u0007ôËþ\u0093\u0011âæÐú},´µc`|¤\u0004môÖ6fî>»:F÷\u0015ý¤Í\u001a\u001biÑ¼1\u001e";
      int var17 = "·Ä\u000f\r\u008fê¤e¼§hæEÏDËÃü'À\u0017u?ç\u0010}¿Ýý$¹ \u0092Y1ì=óí\u0017D\u0018¢Ã\u000bÚÐÞ.m²\u0004x\u009aäk\u0001@\u0084\u0087\u001c\u0087Yø]\u008f\u00181/\u0010\u0087¦\u0007\u0002O*\u0086\u0088à¯#èùgXË\u009a34Ü\u009f\u0080¢N§5\u0087\u0016n\u0006)¦ø%Ê¥çzÓÍÔ\u0094\u0005¿ÈãxË¯0\u0006B½\u0082Ë»Úv\\\u009dÈ\u009a¹3:Û©*+ú \u0098£\u0016Õ´8\u001e+ ïºl=fòawñJ\u0006ï²Åd=¯Ô\u001dá{\u0019t4¶xH&[\u0090S«\u0012\u008f\u009c\u0082¤ÿSh!)£\u0091!ä\u0082¢|·êKÁS~òû\u009d\u001an]*yç 5ìû\u0097o ´õø[í\bXì£\u0089Ù\u0007á+òpKït\u0001¨oÛoBÁ¢V¬C Ü\u0018\u0004*ö\u008e<yÁ\u0012ä°3Ú¥ùÈyï`ãZ#êà£8'\u0015)¤\u0096XIÁ·Al}\u0002s*\u0007ôËþ\u0093\u0011âæÐú},´µc`|¤\u0004môÖ6fî>»:F÷\u0015ý¤Í\u001a\u001biÑ¼1\u001e".length();
      char var14 = 24;
      int var13 = -1;

      label58:
      while(true) {
         ++var13;
         String var31 = var15.substring(var13, var13 + var14);
         byte var33 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var31.getBytes("ISO-8859-1"));
            String var37 = b(var19).intern();
            switch(var33) {
            case 0:
               var18[var16++] = var37;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  f = new String[10];
                  Cipher var1;
                  var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var2 = 1; var2 < 8; ++var2) {
                     var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var0 = new long[3];
                  int var4 = 0;
                  String var5 = "\u001ar`\u009fÂnÐ^ù\u009f\u0097?yqå\u0099²Q\u0086÷t@*U";
                  int var6 = "\u001ar`\u009fÂnÐ^ù\u009f\u0097?yqå\u0099²Q\u0086÷t@*U".length();
                  int var3 = 0;

                  do {
                     int var36 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var36, var3).getBytes("ISO-8859-1");
                     var36 = var4++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var39 = true;
                     var0[var36] = var10004;
                  } while(var3 < var6);

                  KProperty[] var29 = new KProperty[3];

                  try {
                     var29[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tb.class, true.q<invokedynamic>(6325, 5792154738326791320L ^ var20), true.q<invokedynamic>(9187, 4777062841606332357L ^ var20), 0)));
                     var29[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tb.class, true.q<invokedynamic>(1946, 8654390173552802739L ^ var20), true.q<invokedynamic>(31993, 916489176188223697L ^ var20), 0)));
                     var29[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tb.class, true.q<invokedynamic>(28357, 4283875027289019113L ^ var20), true.q<invokedynamic>(29448, 7039779435960143651L ^ var20), 0)));
                     T = var29;
                     e = new tb(var22);
                     W = qi.M((il)e, true.q<invokedynamic>(29755, 8333916487126812692L ^ var20), (Enum)sr.DEFAULT, (pj)null, (Function0)null, (int)var0[2], (Object)null, var24);
                     b = qi.M((il)e, true.q<invokedynamic>(31422, 8386621256026162836L ^ var20), (Enum)z5.CENTER, (pj)null, (Function0)null, (int)var0[0], (Object)null, var24);
                     t = qi.M((il)e, true.q<invokedynamic>(6945, 1761855792650479366L ^ var20), (Enum)ge.NEW, (pj)null, (Function0)null, (int)var0[0], (Object)null, var24);
                     if (e.E((byte)var26, var27, var28).y() == -1) {
                        e.E((byte)var26, var27, var28).Z((int)var0[1]);
                     }

                     return;
                  } catch (NumberFormatException var30) {
                     throw var30.A<invokedynamic>(var30, -7567630964192211560L, var20);
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var37;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label58;
               }

               var15 = "\u009d\u0004£y¬ol8ûJ\u0081èWÑÀ'bí\u000bú©ï\u008eÝ0\u0097Öô|C¦Nå\u001dh¼ûÕ\u008c&\u0093!å\u0007!L\u0018èH\u0080z:Xcç~\u0005z ûAÝïÔoÌó\u0007ç\u0086\u000eÐ\n";
               var17 = "\u009d\u0004£y¬ol8ûJ\u0081èWÑÀ'bí\u000bú©ï\u008eÝ0\u0097Öô|C¦Nå\u001dh¼ûÕ\u008c&\u0093!å\u0007!L\u0018èH\u0080z:Xcç~\u0005z ûAÝïÔoÌó\u0007ç\u0086\u000eÐ\n".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var31 = var15.substring(var13, var13 + var14);
            var33 = 0;
         }
      }
   }

   public static void Y(boolean var0) {
      S = var0;
   }

   public static boolean L() {
      return S;
   }

   public static boolean h() {
      boolean var0 = L();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 27514;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/tb", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         f[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
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
         throw new RuntimeException("su/catlean/tb" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
