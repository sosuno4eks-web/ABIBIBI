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
import net.minecraft.class_1792;
import net.minecraft.class_7922;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class z_ extends zf {
   private static final long b = j0.a(-1878152087715037652L, 6447981049039530584L, MethodHandles.lookup().lookupClass()).a(41782285998202L);
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] j;
   private static final Integer[] k;
   private static final Map l;

   public z_(long a, @NotNull String id, @NotNull uj defaultValue, @Nullable pj group, @NotNull Function0 visible) {
      var1 ^= b;
      long var7 = var1 ^ 125440804813688L;
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(22726, 4200922233579028469L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.i<invokedynamic>(20645, 1488036642828957588L ^ var1));
      Intrinsics.checkNotNullParameter(var6, true.i<invokedynamic>(28783, 6526256621355538271L ^ var1));
      super(var3, var4, (Object)null, var7, var5, var6, 4, (DefaultConstructorMarker)null);
   }

   public z_(String var1, uj var2, pj var3, Function0 var4, int var5, long var6, DefaultConstructorMarker var8) {
      var6 ^= b;
      long var9 = var6 ^ 78457935745852L;
      if ((var5 & 4) != 0) {
         var3 = null;
      }

      if ((var5 & true.g<invokedynamic>(31202, 1191977991200159662L ^ var6)) != 0) {
         var4 = z_::I;
      }

      this(var9, var1, var2, var3, var4);
   }

   public void n(long a, @NotNull String setting) {
      long var10001 = var1 ^ 112033654752526L;
      int var4 = (int)((var1 ^ 112033654752526L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(19664, 4086782508576456624L ^ var1));
      int[] var10000 = -4766163499249553399L.A<invokedynamic>(-4766163499249553399L, var1);
      Json var8 = zf.m.c();
      boolean var10 = false;
      var8.getSerializersModule();
      Iterable var31 = (Iterable)var8.decodeFromString((DeserializationStrategy)(new ArrayListSerializer(StringSerializer.INSTANCE)), var3);
      boolean var9 = false;
      int[] var7 = var10000;
      Collection var11 = (Collection)(new ArrayList());
      boolean var12 = false;
      boolean var14 = false;
      Iterator var15 = var31.iterator();

      while(true) {
         if (var15.hasNext()) {
            Object var16 = var15.next();
            boolean var18 = false;
            String var19 = (String)var16;
            boolean var20 = false;
            class_7922 var32 = class_7923.field_41178;
            Intrinsics.checkNotNullExpressionValue(var32, true.i<invokedynamic>(23407, 6603828681287575560L ^ var1));
            Iterable var21 = (Iterable)var32;
            boolean var22 = false;
            if (var7 == null) {
               break;
            }

            Iterator var23 = var21.iterator();

            Object var33;
            label43:
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
                     class_1792 var25 = (class_1792)var33;
                     boolean var26 = false;
                     if (!Intrinsics.areEqual((Object)var25.method_7876(), (Object)var19)) {
                        continue label43;
                     }

                     var33 = var24;
                     if (var1 <= 0L) {
                        break;
                     }

                     if (var7 != null) {
                        break label43;
                     }
                  }
               }
            }

            class_1792 var34 = (class_1792)var33;
            if (var34 != null) {
               class_1792 var27 = var34;
               boolean var28 = false;
               var11.add(var27);
            }

            if (var7 != null) {
               continue;
            }
         }

         if (var1 >= 0L) {
         }
         break;
      }

      List var30 = CollectionsKt.toMutableList((Collection)((List)var11));
      this.v(new uj(var4, (short)var5, (short)var6, var30));
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 64994783003186L;
      Json var4 = zf.m.c();
      Iterable var5 = (Iterable)((uj)this.B()).m();
      boolean var6 = false;
      int[] var3 = -7173371299329076831L.A<invokedynamic>(-7173371299329076831L, var1);
      Collection var8 = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(var5, true.g<invokedynamic>(9043, 4970821162936570922L ^ var1))));
      boolean var9 = false;
      Iterator var10 = var5.iterator();

      Collection var10000;
      while(true) {
         if (var10.hasNext()) {
            Object var11 = var10.next();
            var10000 = var8;
            class_1792 var12 = (class_1792)var11;
            if (var3 == null) {
               break;
            }

            boolean var13 = false;
            var8.add(var12.method_7876());
            if (var3 != null) {
               continue;
            }
         }

         var10000 = var8;
         break;
      }

      List var15 = (List)var10000;
      var6 = false;
      var4.getSerializersModule();
      return var4.encodeToString((SerializationStrategy)(new ArrayListSerializer(StringSerializer.INSTANCE)), var15);
   }

   private static final boolean I() {
      return true;
   }

   static {
      long var11 = b ^ 128972202896229L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[5];
      int var18 = 0;
      String var17 = "·\u0080tegT\u00953Ü(qùrÞÆe\\ð\u0088\\sÆ|Ç\u0010!\u008eD¡9\u0088Á¶\u0090þôUM-ym\u0010\u0088\u009c \"Vn²ª\u009czãP¨e\u001e=";
      int var19 = "·\u0080tegT\u00953Ü(qùrÞÆe\\ð\u0088\\sÆ|Ç\u0010!\u008eD¡9\u0088Á¶\u0090þôUM-ym\u0010\u0088\u009c \"Vn²ª\u009czãP¨e\u001e=".length();
      char var16 = 24;
      int var15 = -1;

      label45:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var27 = b(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var27;
               if ((var15 += var16) >= var19) {
                  d = var20;
                  h = new String[5];
                  l = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[2];
                  int var3 = 0;
                  String var4 = "Ï\u0084\u009fb\u008fá\u0013{\u0091\u008eD\u001bn\u0091\u009fÞ";
                  int var5 = "Ï\u0084\u009fb\u008fá\u0013{\u0091\u008eD\u001bn\u0091\u009fÞ".length();
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

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var27;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label45;
               }

               var17 = "\u0091¥\u008b\u008dLË\u0081 ÔxP¸OËVd\u0010\u001bC\u00129»@\"\u0017ý\r\\\u0007¶\u001cÀ·";
               var19 = "\u0091¥\u008b\u008dLË\u0081 ÔxP¸OËVd\u0010\u001bC\u00129»@\"\u0017ý\r\\\u0007¶\u001cÀ·".length();
               var16 = 16;
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20235;
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
            throw new RuntimeException("su/catlean/z_", var10);
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
         throw new RuntimeException("su/catlean/z_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 10942;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = j[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/z_", var14);
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
         throw new RuntimeException("su/catlean/z_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
