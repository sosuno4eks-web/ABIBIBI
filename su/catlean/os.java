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
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.gofra.Flow;

public final class os extends k9 {
   @NotNull
   public static final os c;
   static final KProperty[] m;
   @NotNull
   private static final zo y;
   @NotNull
   private static final z0 u;
   private static final long b = j0.a(-4716257348084685819L, 4182641922263523407L, MethodHandles.lookup().lookupClass()).a(119930464081008L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map k;

   private os(int var1, byte var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ b;
      long var6 = var4 ^ 52599408947070L;
      super(var6, true.y<invokedynamic>(31994, 6224406415110772841L ^ var4), pa.Q(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean H(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 62560542154603L;
      int var3 = (int)((var1 ^ 62560542154603L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)y.k((short)var3, this, m[0], (short)var4, var5);
   }

   private final void j(boolean var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 82145538295732L;
      int var4 = (int)((var2 ^ 82145538295732L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      y.P(this, var4, m[0], (short)var5, var1, (short)var6);
   }

   private final int e(int var1, short var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 121257489286198L;
      int var6 = (int)((var4 ^ 121257489286198L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)u.k((short)var6, this, m[1], (short)var7, var8)).intValue();
   }

   private final void A(int var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 28443319772144L;
      int var4 = (int)((var2 ^ 28443319772144L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      u.P(this, var4, m[1], (short)var5, var1, (short)var6);
   }

   @Flow
   private final void X(SendPacket param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean j(long param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 64953964042503L;
      long var22 = var20 ^ 128134494398661L;
      long var24 = var20 ^ 92295730177539L;
      long var10001 = var20 ^ 72680190438661L;
      int var26 = (int)((var20 ^ 72680190438661L) >>> 32);
      int var27 = (int)(var10001 << 32 >>> 56);
      int var28 = (int)(var10001 << 40 >>> 40);
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[7];
      int var16 = 0;
      String var15 = "ÎÖqØÌ}\u009aÈØ#\u0003åyvGä\u0010E(ÛÛ3'UÓ÷åÁÆ4vÚ4 Wºô\u0086ßÖø5C\u0099¿p(\u0096\u001d°\u0015qö\u009c)Ö¿£+´\u0094Â\u0089`¹\u008c\u0018?ÙAdG%Å¿&ð·ö¦CA\u001c1 O`Ðzëª\u0018{úm«¥\\,N\"\u0098r \u0094xñäN]Rµ\u008dô\u0003\r";
      int var17 = "ÎÖqØÌ}\u009aÈØ#\u0003åyvGä\u0010E(ÛÛ3'UÓ÷åÁÆ4vÚ4 Wºô\u0086ßÖø5C\u0099¿p(\u0096\u001d°\u0015qö\u009c)Ö¿£+´\u0094Â\u0089`¹\u008c\u0018?ÙAdG%Å¿&ð·ö¦CA\u001c1 O`Ðzëª\u0018{úm«¥\\,N\"\u0098r \u0094xñäN]Rµ\u008dô\u0003\r".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var30 = var15.substring(var13, var13 + var14);
         byte var32 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var30.getBytes("ISO-8859-1"));
            String var37 = b(var19).intern();
            switch(var32) {
            case 0:
               var18[var16++] = var37;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  e = new String[7];
                  k = new HashMap(13);
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
                  String var4 = "%?öË\u009e\u008f\u0088\u0080\u0096¢D·)\u008f\u0094e";
                  int var5 = "%?öË\u009e\u008f\u0088\u0080\u0096¢D·)\u008f\u0094e".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var36 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                     long[] var33 = var6;
                     var36 = var3++;
                     long var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var40 = -1;

                     while(true) {
                        long var8 = var39;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var42 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var40) {
                        case 0:
                           var33[var36] = var42;
                           if (var2 >= var5) {
                              g = var6;
                              i = new Integer[4];
                              KProperty[] var29 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(os.class, true.y<invokedynamic>(24640, 5549302581907158641L ^ var20), true.y<invokedynamic>(12105, 825138201637403002L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(os.class, true.y<invokedynamic>(14340, 8909588004432064052L ^ var20), true.y<invokedynamic>(25372, 2625085589529326889L ^ var20), 0)))};
                              m = var29;
                              c = new os(var26, (byte)var27, var28);
                              y = qi.R((il)c, true.y<invokedynamic>(12667, 557546194917566287L ^ var20), true, (pj)null, (Function0)null, true.s<invokedynamic>(31700, 7077494687582605530L ^ var20), var24, (Object)null);
                              u = qi.o((il)c, true.y<invokedynamic>(8878, 3399105944455001241L ^ var20), true.s<invokedynamic>(18634, 1088206106252567493L ^ var20), new IntRange(0, true.s<invokedynamic>(17950, 7162200214712184082L ^ var20)), var22, (pj)null, (Function0)null, true.s<invokedynamic>(30068, 7374170833186905721L ^ var20), (Object)null);
                              return;
                           }
                           break;
                        default:
                           var33[var36] = var42;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "öñtÿª©zAê\u0000\u0004DVS²Æ";
                           var5 = "öñtÿª©zAê\u0000\u0004DVS²Æ".length();
                           var2 = 0;
                        }

                        var36 = var2;
                        var2 += 8;
                        var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                        var33 = var6;
                        var36 = var3++;
                        var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var40 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var37;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u0011Û\u008a`®\u001a\u0013x¥|.Î«dM-t>~Ù$ìÅ\u009d÷¾\u0002þ§3.«ÊCzL°>#ë\u0010!ð»\"e0\u0099R´ß\u0004è\u009cCòs";
               var17 = "\u0011Û\u008a`®\u001a\u0013x¥|.Î«dM-t>~Ù$ìÅ\u009d÷¾\u0002þ§3.«ÊCzL°>#ë\u0010!ð»\"e0\u0099R´ß\u0004è\u009cCòs".length();
               var14 = '(';
               var13 = -1;
            }

            ++var13;
            var30 = var15.substring(var13, var13 + var14);
            var32 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4242;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/os", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/os" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11695;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
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
            throw new RuntimeException("su/catlean/os", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
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
         throw new RuntimeException("su/catlean/os" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
