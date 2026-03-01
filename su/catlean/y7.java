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
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.gofra.Flow;

public final class y7 extends k9 {
   @NotNull
   public static final y7 q;
   static final KProperty[] n;
   @NotNull
   private static final zo S;
   @NotNull
   private static final zo O;
   private static final long b = j0.a(-627411229165482035L, 2269283929241768107L, MethodHandles.lookup().lookupClass()).a(260821989174136L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   private y7(int var1, int var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 75854601514137L;
      super(var6, true.p<invokedynamic>(2242, 8214270258895690000L ^ var4), pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean C(char var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ b;
      long var10001 = var4 ^ 39760206659483L;
      int var6 = (int)((var4 ^ 39760206659483L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)S.k((short)var6, this, n[0], (short)var7, var8);
   }

   private final boolean c(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 60888282561868L;
      int var3 = (int)((var1 ^ 60888282561868L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)O.k((short)var3, this, n[1], (short)var4, var5);
   }

   @Flow
   private final void C(SendPacket param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 21585698261086L;
      long var10001 = var20 ^ 1662714150843L;
      int var22 = (int)((var20 ^ 1662714150843L) >>> 32);
      int var23 = (int)(var10001 << 32 >>> 48);
      int var24 = (int)(var10001 << 48 >>> 48);
      long var25 = var20 ^ 6264117489237L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[8];
      int var16 = 0;
      String var15 = "¸\u001f\u008fnQ9G57;\u0014z\u008eò\u009bï1\u0007\u0001nÈFóÜ z\u0019sbxÔ¨mo[MPßíÛ\u001e\u0084\u0000\u008cN?´\u001f,hÃô\u001e¯TUU\u0010à\"À\u0094nád\u009c%\u0004Ð\u001chÌs\u0093 ZÜ\u0081=yÿ`\u0088ÄÏ»\u0094\u008b;\u0004|ù\u0088\u0087¥\u008f\u0005{\u001f¥³9\n´\u008dy\\\u0010'¥dnf\u0014®\u008c\u0000\u009dÑàk\f¾T \"¹~\u001eR\u0015ëg\u009a\u0090\u0089¨ò\u008c²@öõ\u000f9\u0090lñj\u0014\u0094¨\u0007Õ\u007f¤<";
      int var17 = "¸\u001f\u008fnQ9G57;\u0014z\u008eò\u009bï1\u0007\u0001nÈFóÜ z\u0019sbxÔ¨mo[MPßíÛ\u001e\u0084\u0000\u008cN?´\u001f,hÃô\u001e¯TUU\u0010à\"À\u0094nád\u009c%\u0004Ð\u001chÌs\u0093 ZÜ\u0081=yÿ`\u0088ÄÏ»\u0094\u008b;\u0004|ù\u0088\u0087¥\u008f\u0005{\u001f¥³9\n´\u008dy\\\u0010'¥dnf\u0014®\u008c\u0000\u009dÑàk\f¾T \"¹~\u001eR\u0015ëg\u009a\u0090\u0089¨ò\u008c²@öõ\u000f9\u0090lñj\u0014\u0094¨\u0007Õ\u007f¤<".length();
      char var14 = 24;
      int var13 = -1;

      label47:
      while(true) {
         ++var13;
         String var28 = var15.substring(var13, var13 + var14);
         byte var30 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var28.getBytes("ISO-8859-1"));
            String var34 = b(var19).intern();
            switch(var30) {
            case 0:
               var18[var16++] = var34;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[8];
                  Cipher var1;
                  var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var2 = 1; var2 < 8; ++var2) {
                     var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var0 = new long[2];
                  int var4 = 0;
                  String var5 = "%\u001cJ´g&å\u0093Ò\u0082\u008a¨*(â,";
                  int var6 = "%\u001cJ´g&å\u0093Ò\u0082\u008a¨*(â,".length();
                  int var3 = 0;

                  do {
                     int var33 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var33, var3).getBytes("ISO-8859-1");
                     var33 = var4++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var36 = true;
                     var0[var33] = var10004;
                  } while(var3 < var6);

                  KProperty[] var27 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y7.class, true.p<invokedynamic>(23800, 4282833602895705147L ^ var20), true.p<invokedynamic>(6202, 8447540511150682363L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y7.class, true.p<invokedynamic>(11079, 5395127674650166146L ^ var20), true.p<invokedynamic>(25969, 7908820537090854321L ^ var20), 0)))};
                  n = var27;
                  q = new y7(var22, var23, (short)var24);
                  S = qi.R((il)q, true.p<invokedynamic>(31232, 2799638578593682118L ^ var20), true, (pj)null, (Function0)null, (int)var0[0], var25, (Object)null);
                  O = qi.R((il)q, true.p<invokedynamic>(31997, 3847184964470166585L ^ var20), true, (pj)null, (Function0)null, (int)var0[1], var25, (Object)null);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var34;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label47;
               }

               var15 = "\u0086°\u000fW.m@q¨SFbßÅ8ßèäp×\u009eâW\u0012\u0091g)\u0088A·\u0088wæ\u0096T²)º~÷´\tìö÷hÊülKº\u0098rÿÜ\u0003\u0098GQw\u0013qö%\u0097\u0001qg¼\u0002ò\u0096ZÂDâ>±\u009cP\u0018\u0015÷b\u0017\"îa°ü8×\u008eßª¬íÉZ@\u0092/!\u0016g\u0084\r*Ázç{\u0014~zÝD<º¶\u0099\u00ad\u001a\u0012\u0016wwbt6^f\u0089~TÛöØ\u00ad\u008d\u0084ãÒ·\u0006¸é\u0013÷!ÛTq{6BN\u0012\u000fg\u0018Ði\u0016º1uk\"Ð\u001d\u000e¡òÄ¡ñ}Ùö\u001c\u008e¸÷ê";
               var17 = "\u0086°\u000fW.m@q¨SFbßÅ8ßèäp×\u009eâW\u0012\u0091g)\u0088A·\u0088wæ\u0096T²)º~÷´\tìö÷hÊülKº\u0098rÿÜ\u0003\u0098GQw\u0013qö%\u0097\u0001qg¼\u0002ò\u0096ZÂDâ>±\u009cP\u0018\u0015÷b\u0017\"îa°ü8×\u008eßª¬íÉZ@\u0092/!\u0016g\u0084\r*Ázç{\u0014~zÝD<º¶\u0099\u00ad\u001a\u0012\u0016wwbt6^f\u0089~TÛöØ\u00ad\u008d\u0084ãÒ·\u0006¸é\u0013÷!ÛTq{6BN\u0012\u000fg\u0018Ði\u0016º1uk\"Ð\u001d\u000e¡òÄ¡ñ}Ùö\u001c\u008e¸÷ê".length();
               var14 = 160;
               var13 = -1;
            }

            ++var13;
            var28 = var15.substring(var13, var13 + var14);
            var30 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26164;
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
            throw new RuntimeException("su/catlean/y7", var10);
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
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/y7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
