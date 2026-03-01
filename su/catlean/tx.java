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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class tx extends k9 {
   @NotNull
   public static final tx N;
   // $FF: synthetic field
   static final KProperty[] V;
   @NotNull
   private static final z0 v;
   private static final long b = j0.a(2264031474793800565L, 3908920701205046433L, MethodHandles.lookup().lookupClass()).a(174037236440588L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private tx(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 14844954533530L;
      super(var3, true.v<invokedynamic>(4821, 306464035120526434L ^ var1), pa.b(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final int Y(char var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 3738945697104L;
      int var6 = (int)((var4 ^ 3738945697104L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)v.k((short)var6, this, V[0], (short)var7, var8)).intValue();
   }

   @Flow
   public final void R(@NotNull PlayerUpdateEvent e) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 47819632239348L;
      long var22 = var20 ^ 116932962889622L;
      long var24 = var20 ^ 123291666982674L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[6];
      int var16 = 0;
      String var15 = "ÜØ8\u00956\u0005WåÄÌÓpG\u0092Ó\u0088Z\u0001F&_Ï¼z\u008c«eïE\u00adÂ\u0091(>\rL÷pJÉÆ\u0080\u008b\u001bµé®p¯\u0013Nù\u0089÷GïBî{øÍÈ\u0090·iÃw\u000e\u0095Hp¯3(*\u0003\u000f\u008bÙàìi>O\u001f\u0082*\u0003\u0002<É\u0011Yºß\u008c\u009fÝ\u008cB²\u0006û\u0019áé\u000b*íeEít7 ²?\u0093\u0012_\u0016\u0096s@÷ÉHÚ\u009711Ã\u000b·KÙ\u0012\u009f\u0093 ¦qÌo\u0095\"\u009d";
      int var17 = "ÜØ8\u00956\u0005WåÄÌÓpG\u0092Ó\u0088Z\u0001F&_Ï¼z\u008c«eïE\u00adÂ\u0091(>\rL÷pJÉÆ\u0080\u008b\u001bµé®p¯\u0013Nù\u0089÷GïBî{øÍÈ\u0090·iÃw\u000e\u0095Hp¯3(*\u0003\u000f\u008bÙàìi>O\u001f\u0082*\u0003\u0002<É\u0011Yºß\u008c\u009fÝ\u008cB²\u0006û\u0019áé\u000b*íeEít7 ²?\u0093\u0012_\u0016\u0096s@÷ÉHÚ\u009711Ã\u000b·KÙ\u0012\u009f\u0093 ¦qÌo\u0095\"\u009d".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var27 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var33;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[6];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "/A÷¦2ïÎ!\u0012ð` \u0086Y®_";
                  int var5 = "/A÷¦2ïÎ!\u0012ð` \u0086Y®_".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var31 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                     long[] var30 = var6;
                     var31 = var3++;
                     long var35 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var36 = -1;

                     while(true) {
                        long var8 = var35;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var38 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var36) {
                        case 0:
                           var30[var31] = var38;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[4];
                              KProperty[] var26 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tx.class, true.v<invokedynamic>(32675, 5294094886993304836L ^ var20), true.v<invokedynamic>(32722, 4333560272046005620L ^ var20), 0)))};
                              V = var26;
                              N = new tx(var24);
                              v = qi.o((il)N, true.v<invokedynamic>(26115, 6394172588244173987L ^ var20), true.b<invokedynamic>(11142, 7360672911034287835L ^ var20), new IntRange(1, true.b<invokedynamic>(3254, 1104973878100173288L ^ var20)), var22, (pj)null, (Function0)null, true.b<invokedynamic>(22395, 3111785890856598055L ^ var20), (Object)null);
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var38;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "D\u0094\r´Îæ®E<\u0003<\u0018ÎÑ\u001aò";
                           var5 = "D\u0094\r´Îæ®E<\u0003<\u0018ÎÑ\u001aò".length();
                           var2 = 0;
                        }

                        var31 = var2;
                        var2 += 8;
                        var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                        var30 = var6;
                        var31 = var3++;
                        var35 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var36 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var33;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "úø\u009cÃR\u008c\u00adþÄw\u0017R´\u0097\u00ad\u001eÖú\u000f çÖDK r\u0005^\" \u0094\u0018ÐwF:\u000fÎ\f\u008aã;¼\u0091ÌÎ\u0015SÇ\u0002¶\u0002¼á8\u0088\u008e";
               var17 = "úø\u009cÃR\u008c\u00adþÄw\u0017R´\u0097\u00ad\u001eÖú\u000f çÖDK r\u0005^\" \u0094\u0018ÐwF:\u000fÎ\f\u008aã;¼\u0091ÌÎ\u0015SÇ\u0002¶\u0002¼á8\u0088\u008e".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var27 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25428;
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
            throw new RuntimeException("su/catlean/tx", var10);
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
         throw new RuntimeException("su/catlean/tx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11439;
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
            throw new RuntimeException("su/catlean/tx", var14);
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
         throw new RuntimeException("su/catlean/tx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
