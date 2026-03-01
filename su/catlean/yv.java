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
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class yv extends k9 {
   @NotNull
   public static final yv q;
   static final KProperty[] r;
   @NotNull
   private static final zr n;
   @NotNull
   private static final zo U;
   @NotNull
   private static final zo v;
   @NotNull
   private static final zo t;
   private static boolean C;
   @NotNull
   private static final iv J;
   @NotNull
   private static final iv B;
   private static final long b = j0.a(-4990676439676318864L, 1533013757821915588L, MethodHandles.lookup().lookupClass()).a(40752316947418L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private yv(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 93825336262371L;
      super(var3, true.m<invokedynamic>(21770, 2478971211741328711L ^ var1), pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final ch u(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 34869663299754L;
      int var3 = (int)((var1 ^ 34869663299754L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (ch)n.k((short)var3, this, r[0], (short)var4, var5);
   }

   private final boolean t(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 19206965846462L;
      int var3 = (int)((var1 ^ 19206965846462L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)U.k((short)var3, this, r[1], (short)var4, var5);
   }

   private final boolean x(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 323606779152L;
      int var3 = (int)((var1 ^ 323606779152L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)v.k((short)var3, this, r[2], (short)var4, var5);
   }

   private final boolean P(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 129005510342339L;
      int var3 = (int)((var1 ^ 129005510342339L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)t.k((short)var3, this, r[3], (short)var4, var5);
   }

   public void a(long var1) {
      C = false;
   }

   @Flow
   private final void S(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow(
      priority = -10
   )
   private final void h(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void p(int param1, char param2, short param3) {
      // $FF: Couldn't be decompiled
   }

   private final int Y(long param1) {
      // $FF: Couldn't be decompiled
   }

   public static final iv H() {
      return J;
   }

   static {
      long var20 = b ^ 127415835830638L;
      long var22 = var20 ^ 68870029339704L;
      long var24 = var20 ^ 13821009046475L;
      long var26 = var20 ^ 123594369371377L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[16];
      int var16 = 0;
      String var15 = "\u00adUï\"ì°°ý\u000f\u009eÀîåäº%×A\u0083\u0082âê\u0019¤\u0094?ö¹Ãã}ä /ÿ[]±Ï@Ýö+\u0087w\u008fW\u0012´5\u009f\u009b=+\u0002Bs\u001fÜ¼A\u008eô´ã\u0018Ê´\u0082 \u0014³#0\u008fDâÒ¼\u009f5J\u0087ÉÑ\b.t\u0095z\u0018ï\u0006ü=x\u008bAiçV\u0014O,ôx,TS\u008e\u0093yaâ\u0096 ÀòúBù¶\u001cÂGÊ\u0093Õ\u0087¦»\u0016¢\u0092\u0096äÀf,\u0090QÞ¢,¦Ç4¶\u0010\\ö\u0017G£Z>\nF\u00116ráÞ\u0005ø B\u0092°3ºl¿)9\u008b¥£\u0019è@\u000eoÞ\u000fúV>\u0097¼Nø~ýYµ\u0090l\u0010ö@2?&\u0001\u001d·\u001fÍ\u0004zUÑg\u0081 ¾\u0081\f a´y\u001a¦I\u0003p§O.\u0095\u000f\u0085ÜÞÃ%ýæ\u009b¤\u009f=\u0005\u0004À\t Ùæ,¯\u000f(\u0016t\u0084\u0092ØÐµ\u0090\u0084x´ç\u007fDíy\u001dE3÷\u009a\u009cgEâ¦\u0010¬-qd÷(©,>µ±\u0080\u0089\u0099OP \f\u0019ø,}äö¢\u0010ZÔ§>\u0019s$\u001e\r\u009fM7Åj\u0013\u0088\u009aAë¼iÊ\u0002\u0018\u0006TàfÊ÷`hv;H14R\u0019ä\u008dFH\u0084\u0094\u001eºé8Ïí\u0003\u00ad\u0010R\"¶w¦x\u009b\u009cÈ\u001c1:u\u008fÔÄ#4\u008b\u000e3GÛàï\u008c#ßbK+Ïó°K\b¹\u0019Ñ\u00120+¬G\u001d|-\u009f\u008b²\u0012";
      int var17 = "\u00adUï\"ì°°ý\u000f\u009eÀîåäº%×A\u0083\u0082âê\u0019¤\u0094?ö¹Ãã}ä /ÿ[]±Ï@Ýö+\u0087w\u008fW\u0012´5\u009f\u009b=+\u0002Bs\u001fÜ¼A\u008eô´ã\u0018Ê´\u0082 \u0014³#0\u008fDâÒ¼\u009f5J\u0087ÉÑ\b.t\u0095z\u0018ï\u0006ü=x\u008bAiçV\u0014O,ôx,TS\u008e\u0093yaâ\u0096 ÀòúBù¶\u001cÂGÊ\u0093Õ\u0087¦»\u0016¢\u0092\u0096äÀf,\u0090QÞ¢,¦Ç4¶\u0010\\ö\u0017G£Z>\nF\u00116ráÞ\u0005ø B\u0092°3ºl¿)9\u008b¥£\u0019è@\u000eoÞ\u000fúV>\u0097¼Nø~ýYµ\u0090l\u0010ö@2?&\u0001\u001d·\u001fÍ\u0004zUÑg\u0081 ¾\u0081\f a´y\u001a¦I\u0003p§O.\u0095\u000f\u0085ÜÞÃ%ýæ\u009b¤\u009f=\u0005\u0004À\t Ùæ,¯\u000f(\u0016t\u0084\u0092ØÐµ\u0090\u0084x´ç\u007fDíy\u001dE3÷\u009a\u009cgEâ¦\u0010¬-qd÷(©,>µ±\u0080\u0089\u0099OP \f\u0019ø,}äö¢\u0010ZÔ§>\u0019s$\u001e\r\u009fM7Åj\u0013\u0088\u009aAë¼iÊ\u0002\u0018\u0006TàfÊ÷`hv;H14R\u0019ä\u008dFH\u0084\u0094\u001eºé8Ïí\u0003\u00ad\u0010R\"¶w¦x\u009b\u009cÈ\u001c1:u\u008fÔÄ#4\u008b\u000e3GÛàï\u008c#ßbK+Ïó°K\b¹\u0019Ñ\u00120+¬G\u001d|-\u009f\u008b²\u0012".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var29 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
            String var35 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var35;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[16];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[9];
                  int var3 = 0;
                  String var4 = "O,Í|\u0093¯\u0019\u008bnó\u00ad1ä¨\u009a°¿nþ¿·\u0010úVÖ\f\u0085H\u00023f°/óÅ®%Jù¬S\u001fÂ\u0019d\u0094²´1 ïOó5\r\u0018";
                  int var5 = "O,Í|\u0093¯\u0019\u008bnó\u00ad1ä¨\u009a°¿nþ¿·\u0010úVÖ\f\u0085H\u00023f°/óÅ®%Jù¬S\u001fÂ\u0019d\u0094²´1 ïOó5\r\u0018".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var33 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                     long[] var32 = var6;
                     var33 = var3++;
                     long var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var38 = -1;

                     while(true) {
                        long var8 = var37;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var40 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var38) {
                        case 0:
                           var32[var33] = var40;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[9];
                              KProperty[] var28 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yv.class, true.m<invokedynamic>(19459, 155851817242870453L ^ var20), true.m<invokedynamic>(4441, 1868038402834571246L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yv.class, true.m<invokedynamic>(14349, 6065056019964737200L ^ var20), true.m<invokedynamic>(18807, 2796131497224521673L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yv.class, true.m<invokedynamic>(10867, 5579068444196938959L ^ var20), true.m<invokedynamic>(9346, 7095700505849014842L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yv.class, true.m<invokedynamic>(22925, 4601570912900929337L ^ var20), true.m<invokedynamic>(15312, 3818999177746953573L ^ var20), 0)))};
                              r = var28;
                              q = new yv(var26);
                              n = qi.M((il)q, true.m<invokedynamic>(18819, 6853854715667203890L ^ var20), (Enum)ch.V1_17, (pj)null, (Function0)null, true.v<invokedynamic>(10070, 1971500108770486193L ^ var20), (Object)null, var22);
                              U = qi.R((il)q, true.m<invokedynamic>(22704, 6780208501942933003L ^ var20), true, (pj)null, (Function0)null, true.v<invokedynamic>(6478, 4051014935499086250L ^ var20), var24, (Object)null);
                              v = qi.R((il)q, true.m<invokedynamic>(11844, 6939781051102077182L ^ var20), false, (pj)null, (Function0)null, true.v<invokedynamic>(6478, 4051014935499086250L ^ var20), var24, (Object)null);
                              t = qi.R((il)q, true.m<invokedynamic>(7959, 2639320883799658920L ^ var20), true, (pj)null, (Function0)null, true.v<invokedynamic>(6478, 4051014935499086250L ^ var20), var24, (Object)null);
                              J = new iv();
                              B = new iv();
                              return;
                           }
                           break;
                        default:
                           var32[var33] = var40;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0083¹áðH²®ý!\u0098|A!Ø\ts";
                           var5 = "\u0083¹áðH²®ý!\u0098|A!Ø\ts".length();
                           var2 = 0;
                        }

                        var33 = var2;
                        var2 += 8;
                        var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                        var32 = var6;
                        var33 = var3++;
                        var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var38 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var35;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "Öv)Ö\u008eÎD\u009cÄé[¬\u001c/üØ\u0018JVà\u001b¸Xªà\u0083T\u0092Q\u001cÐ¼Ú\u0088\\\u0086áM»½?";
               var17 = "Öv)Ö\u008eÎD\u009cÄé[¬\u001c/üØ\u0018JVà\u001b¸Xªà\u0083T\u0092Q\u001cÐ¼Ú\u0088\\\u0086áM»½?".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var29 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1489;
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
            throw new RuntimeException("su/catlean/yv", var10);
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
         throw new RuntimeException("su/catlean/yv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2953;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/yv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
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
         throw new RuntimeException("su/catlean/yv" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
