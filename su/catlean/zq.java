package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import net.minecraft.class_2248;
import net.minecraft.class_7922;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zq extends zf {
   private static int l;
   private static final long b = j0.a(-6619726715329116945L, 2506943221251399438L, MethodHandles.lookup().lookupClass()).a(21523238771374L);
   private static final String[] d;
   private static final String[] h;
   private static final Map i;
   private static final long[] j;
   private static final Integer[] k;
   private static final Map n;

   public zq(long a, @NotNull String id, @NotNull kq defaultValue, @Nullable pj group, @NotNull Function0 visible) {
      var1 ^= b;
      long var7 = var1 ^ 114159721161003L;
      Intrinsics.checkNotNullParameter(var3, true.r<invokedynamic>(5078, 2378624659857075854L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.r<invokedynamic>(22216, 7485997061304462225L ^ var1));
      Intrinsics.checkNotNullParameter(var6, true.r<invokedynamic>(6752, 9180624485950875455L ^ var1));
      super(var3, var4, (Object)null, var7, var5, var6, 4, (DefaultConstructorMarker)null);
   }

   public zq(String var1, short var2, kq var3, pj var4, short var5, int var6, Function0 var7, int var8, DefaultConstructorMarker var9) {
      long var10 = ((long)var2 << 48 | (long)var5 << 48 >>> 16 | (long)var6 << 32 >>> 32) ^ b;
      long var12 = var10 ^ 54607505352539L;
      if ((var8 & 4) != 0) {
         var4 = null;
      }

      if ((var8 & true.f<invokedynamic>(11916, 4263008692775803306L ^ var10)) != 0) {
         var7 = zq::H;
      }

      this(var12, var1, var3, var4, var7);
   }

   public void n(long a, @NotNull String setting) {
      long var10001 = var1 ^ 23605890172293L;
      int var4 = (int)((var1 ^ 23605890172293L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var3, true.r<invokedynamic>(287, 45256855799444034L ^ var1));
      Json var8 = zf.m.c();
      boolean var10 = false;
      var8.getSerializersModule();
      Iterable var31 = (Iterable)var8.decodeFromString((DeserializationStrategy)(new ArrayListSerializer(StringSerializer.INSTANCE)), var3);
      boolean var9 = false;
      Collection var11 = (Collection)(new ArrayList());
      int[] var10000 = -4766163499249553399L.A<invokedynamic>(-4766163499249553399L, var1);
      boolean var12 = false;
      boolean var14 = false;
      Iterator var15 = var31.iterator();
      int[] var7 = var10000;

      while(true) {
         if (var15.hasNext()) {
            Object var16 = var15.next();
            boolean var18 = false;
            String var19 = (String)var16;
            boolean var20 = false;
            class_7922 var32 = class_7923.field_41175;
            Intrinsics.checkNotNullExpressionValue(var32, true.r<invokedynamic>(32633, 9090036383427284005L ^ var1));
            Iterable var21 = (Iterable)var32;
            boolean var22 = false;
            if (var7 == null) {
               break;
            }

            Iterator var23 = var21.iterator();

            Object var33;
            label53:
            while(true) {
               if (!var23.hasNext()) {
                  var33 = null;
                  break;
               }

               var33 = var23.next();

               while(true) {
                  Object var24 = var33;
                  var33 = var24;

                  while(true) {
                     class_2248 var25 = (class_2248)var33;
                     boolean var26 = false;
                     if (!Intrinsics.areEqual((Object)var25.method_63499(), (Object)var19)) {
                        continue label53;
                     }

                     var33 = var24;
                     if (var1 < 0L) {
                        break;
                     }

                     if (var7 != null) {
                        break label53;
                     }
                  }
               }
            }

            class_2248 var34 = (class_2248)var33;
            if (var34 != null) {
               class_2248 var27 = var34;
               boolean var28 = false;
               var11.add(var27);
            }

            if (var7 != null) {
               continue;
            }
         }

         if (var1 > 0L) {
         }
         break;
      }

      List var30 = CollectionsKt.toMutableList((Collection)((List)var11));
      this.v(new kq((short)var4, var5, var30, (char)var6));
      var10000 = -4775848615119308590L.A<invokedynamic>(-4775848615119308590L, var1);
      if (var1 > 0L) {
         if (var10000 != null) {
            return;
         }

         var10000 = new int[4];
      }

      var10000.A<invokedynamic>(var10000, -4862271791286883739L, var1);
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 83120286489276L;
      Json var4 = zf.m.c();
      Iterable var5 = (Iterable)((kq)this.B()).G();
      boolean var6 = false;
      int[] var10000 = 4605880164112052793L.A<invokedynamic>(4605880164112052793L, var1);
      Collection var8 = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(var5, true.f<invokedynamic>(6870, 6506570430900314751L ^ var1))));
      int[] var3 = var10000;
      boolean var9 = false;
      Iterator var10 = var5.iterator();

      Collection var16;
      while(true) {
         if (var10.hasNext()) {
            Object var11 = var10.next();
            var16 = var8;
            class_2248 var12 = (class_2248)var11;
            if (var3 == null) {
               break;
            }

            boolean var13 = false;
            var8.add(var12.method_63499());
            if (var3 != null) {
               continue;
            }
         }

         var16 = var8;
         break;
      }

      List var15 = (List)var16;
      var6 = false;
      var4.getSerializersModule();
      return var4.encodeToString((SerializationStrategy)(new ArrayListSerializer(StringSerializer.INSTANCE)), var15);
   }

   private static final boolean H() {
      return true;
   }

   public static void l(int var0) {
      l = var0;
   }

   public static int a() {
      return l;
   }

   public static int w() {
      int var0 = a();

      try {
         return var0 == 0 ? 77 : 0;
      } catch (NumberFormatException var1) {
         throw b(var1);
      }
   }

   static {
      long var20 = b ^ 99797175850494L;
      i = new HashMap(13);
      0.A<invokedynamic>(0, 3595194885491641317L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[5];
      int var16 = 0;
      String var15 = "\u00003Ã}\u0010¯~Þw\u009aÞ\u0084¢Îù©\u0010R)~\u0088S\u008c\f\u000b^]©\u0099u\u0002\u0081\u0090\u0018·j\u000bgô=þÍW Ð|\u001a\u0084Em¶\u00826:ä\u008fd\u001a";
      int var17 = "\u00003Ã}\u0010¯~Þw\u009aÞ\u0084¢Îù©\u0010R)~\u0088S\u008c\f\u000b^]©\u0099u\u0002\u0081\u0090\u0018·j\u000bgô=þÍW Ð|\u001a\u0084Em¶\u00826:ä\u008fd\u001a".length();
      char var14 = 16;
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var27 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var27;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  h = new String[5];
                  n = new HashMap(13);
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
                  String var4 = "\u0097\u008fON\u0002\u000f(\u0080Q\u009eUV\u001aÆ\u009aÎ";
                  int var5 = "\u0097\u008fON\u0002\u000f(\u0080Q\u009eUV\u001aÆ\u009aÎ".length();
                  int var2 = 0;

                  do {
                     int var25 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var25, var2).getBytes("ISO-8859-1");
                     var25 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var29 = true;
                     var6[var25] = var10004;
                  } while(var2 < var5);

                  j = var6;
                  k = new Integer[2];
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var27;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "\u0081¿_mc\u001aÜi\u000b~\u001d\u0010nµ}\u009b\u0010òÖ\u0003\fÍmý\u00891\tZ¶$aÒb";
               var17 = "\u0081¿_mc\u001aÜi\u000b~\u001d\u0010nµ}\u009b\u0010òÖ\u0003\fÍmý\u00891\tZ¶$aÒb".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException b(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3890;
      if (h[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/zq", var10);
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
         h[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return h[var5];
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
         throw new RuntimeException("su/catlean/zq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1783;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = j[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/zq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/zq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
