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
import net.minecraft.class_1299;
import net.minecraft.class_7922;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class z9 extends zf {
   private static final long b = j0.a(8420631588493040680L, 7647879141517878393L, MethodHandles.lookup().lookupClass()).a(125610815193378L);
   private static final String[] d;
   private static final String[] h;
   private static final Map i = new HashMap(13);
   private static final long[] j;
   private static final Integer[] k;
   private static final Map l;

   public z9(@NotNull String id, @NotNull vh defaultValue, @Nullable pj group, long a, @NotNull Function0 visible) {
      var4 ^= b;
      long var7 = var4 ^ 7109117061111L;
      Intrinsics.checkNotNullParameter(var1, true.b<invokedynamic>(23726, 4343074522125161763L ^ var4));
      Intrinsics.checkNotNullParameter(var2, true.b<invokedynamic>(13034, 5432209765773753189L ^ var4));
      Intrinsics.checkNotNullParameter(var6, true.b<invokedynamic>(16895, 5486410105560254577L ^ var4));
      super(var1, var2, (Object)null, var7, var3, var6, 4, (DefaultConstructorMarker)null);
   }

   public z9(char var1, String var2, vh var3, pj var4, int var5, short var6, Function0 var7, int var8, DefaultConstructorMarker var9) {
      long var10 = ((long)var1 << 48 | (long)var5 << 32 >>> 16 | (long)var6 << 48 >>> 48) ^ b;
      long var12 = var10 ^ 109565011305028L;
      if ((var8 & 4) != 0) {
         var4 = null;
      }

      if ((var8 & true.y<invokedynamic>(31053, 1138064170782609346L ^ var10)) != 0) {
         var7 = z9::n;
      }

      this(var2, var3, var4, var12, var7);
   }

   public void n(long a, @NotNull String setting) {
      long var4 = var1 ^ 139568738543893L;
      Intrinsics.checkNotNullParameter(var3, true.b<invokedynamic>(23583, 3476370048526261582L ^ var1));
      Json var7 = zf.m.c();
      boolean var9 = false;
      var7.getSerializersModule();
      Iterable var30 = (Iterable)var7.decodeFromString((DeserializationStrategy)(new ArrayListSerializer(StringSerializer.INSTANCE)), var3);
      boolean var8 = false;
      int[] var10000 = -4766163499249553399L.A<invokedynamic>(-4766163499249553399L, var1);
      Collection var10 = (Collection)(new ArrayList());
      int[] var6 = var10000;
      boolean var11 = false;
      boolean var13 = false;
      Iterator var14 = var30.iterator();

      label56:
      while(var14.hasNext()) {
         Object var15 = var14.next();
         boolean var17 = false;
         String var18 = (String)var15;
         boolean var19 = false;
         class_7922 var31 = class_7923.field_41177;
         Intrinsics.checkNotNullExpressionValue(var31, true.b<invokedynamic>(12233, 7424412144650383007L ^ var1));
         Iterable var20 = (Iterable)var31;
         boolean var21 = false;
         var10000 = var6;

         do {
            if (var10000 == null) {
               break label56;
            }

            Iterator var22 = var20.iterator();

            Object var32;
            label48:
            while(true) {
               if (!var22.hasNext()) {
                  var32 = null;
                  break;
               }

               var32 = var22.next();

               while(true) {
                  Object var23 = var32;
                  var32 = var23;

                  while(true) {
                     class_1299 var24 = (class_1299)var32;
                     boolean var25 = false;
                     if (!Intrinsics.areEqual((Object)var24.method_5882(), (Object)var18)) {
                        continue label48;
                     }

                     var32 = var23;
                     if (var1 <= 0L) {
                        break;
                     }

                     if (var6 != null) {
                        break label48;
                     }
                  }
               }
            }

            class_1299 var33 = (class_1299)var32;
            if (var33 != null) {
               class_1299 var26 = var33;
               boolean var27 = false;
               var10.add(var26);
            }

            if (var6 != null) {
               continue label56;
            }

            var10000 = new int[4];
         } while(var1 < 0L);

         var10000.A<invokedynamic>(var10000, -4808800399398961416L, var1);
         break;
      }

      List var29 = CollectionsKt.toMutableList((Collection)((List)var10));
      this.v(new vh(var29, var4));
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 80527791166283L;
      int[] var10000 = 8857222015023773497L.A<invokedynamic>(8857222015023773497L, var1);
      Json var4 = zf.m.c();
      Iterable var5 = (Iterable)((vh)this.B()).L();
      boolean var6 = false;
      int[] var3 = var10000;
      Collection var8 = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(var5, true.y<invokedynamic>(17621, 3757205510446954465L ^ var1))));
      boolean var9 = false;
      Iterator var10 = var5.iterator();

      Collection var16;
      while(true) {
         if (var10.hasNext()) {
            Object var11 = var10.next();
            var16 = var8;
            class_1299 var12 = (class_1299)var11;
            if (var3 == null) {
               break;
            }

            boolean var13 = false;
            var8.add(var12.method_5882());
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

   private static final boolean n() {
      return true;
   }

   static {
      long var11 = b ^ 134783494283920L;
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
      String var17 = "rIÝÓñ\fÁÑï»\u009diÀdâ#>¬ÙË\u0093@J)\u0011±\u0087\\yót-\u0010Í>¯\u0095ÑÑ\u0090öÏzó6·\u008e\u0011\u009d\u0010F_\u0007Nå^\u0014=\f\u0098\u0083\u009aN\u0085Àá";
      int var19 = "rIÝÓñ\fÁÑï»\u009diÀdâ#>¬ÙË\u0093@J)\u0011±\u0087\\yót-\u0010Í>¯\u0095ÑÑ\u0090öÏzó6·\u008e\u0011\u009d\u0010F_\u0007Nå^\u0014=\f\u0098\u0083\u009aN\u0085Àá".length();
      char var16 = ' ';
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
                  String var4 = "Zí×\u008a'>øì»\u009a\u009cÂØ\u001e\u001eá";
                  int var5 = "Zí×\u008a'>øì»\u009a\u009cÂØ\u001e\u001eá".length();
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

               var17 = "â\\\u0095óL\u0088W\u008b¾\u0096!\u00171]T\u0099ñÅ\"`3£Àí\u00100:w\u0081«$\u0089\u008bùkü\u0014àf\u008a]";
               var19 = "â\\\u0095óL\u0088W\u008b¾\u0096!\u00171]T\u0099ñÅ\"`3£Àí\u00100:w\u0081«$\u0089\u008bùkü\u0014àf\u008a]".length();
               var16 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32058;
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
            throw new RuntimeException("su/catlean/z9", var10);
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
         throw new RuntimeException("su/catlean/z9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2155;
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
            throw new RuntimeException("su/catlean/z9", var14);
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
         throw new RuntimeException("su/catlean/z9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
