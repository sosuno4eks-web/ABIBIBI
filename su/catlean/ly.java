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
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class ly extends k9 {
   @NotNull
   public static final ly Q;
   private static final long b = j0.a(-2821999529819387899L, 3693059939949575930L, MethodHandles.lookup().lookupClass()).a(199168978566325L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private ly(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 77516730105367L;
      super(var3, true.v<invokedynamic>(2067, 838237106387458114L ^ var1), pa.V(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   @Flow
   public final void n(@NotNull PlayerUpdateEvent e) {
      Intrinsics.checkNotNullParameter(var1, "e");
   }

   @Flow
   private final void a(Render3DEvent var1) {
      long var2 = b ^ 136681875122001L;
      long var4 = var2 ^ 105895433460082L;
      long var6 = var2 ^ 74791324987473L;
      long var10001 = var2 ^ 2157123472788L;
      int var8 = (int)((var2 ^ 2157123472788L) >>> 32);
      int var9 = (int)(var10001 << 32 >>> 48);
      int var10 = (int)(var10001 << 48 >>> 48);
      class_2338 var10000 = class_2338.method_49638((class_2374)s8.f(var4).method_33571());
      Intrinsics.checkNotNullExpressionValue(var10000, true.v<invokedynamic>(31321, 4621159965329118239L ^ var2));
      class_2338 var20 = var10000;
      int var21 = true.q<invokedynamic>(30743, 6439252883191331318L ^ var2);
      IntRange var22 = new IntRange(var20.method_10263() - var21, var20.method_10263() + var21);
      String[] var83 = -2690176008449123267L.A<invokedynamic>(-2690176008449123267L, var2);
      IntRange var23 = new IntRange(var20.method_10264() - var21, var20.method_10264() + var21);
      String[] var19 = var83;
      IntRange var24 = new IntRange(var20.method_10260() - var21, var20.method_10260() + var21);
      long var72 = 0L;
      long var74 = 0L;
      Iterable var25 = (Iterable)var22;
      boolean var26 = false;
      Collection var28 = (Collection)(new ArrayList());
      boolean var29 = false;
      Iterator var30 = var25.iterator();

      k9 var90;
      label77:
      while(true) {
         Iterator var84 = var30;

         label74:
         while(var84.hasNext()) {
            int var31 = ((IntIterator)var30).nextInt();
            int var32 = var31;
            boolean var33 = false;
            Iterable var34 = (Iterable)var23;
            boolean var35 = false;
            Collection var37 = (Collection)(new ArrayList());
            boolean var38 = false;
            if (var19 == null) {
               break label77;
            }

            Iterator var39 = var34.iterator();

            label71:
            do {
               int var85 = var39.hasNext();

               Collection var46;
               label68:
               while(true) {
                  if (var85 == 0) {
                     break label71;
                  }

                  int var40 = ((IntIterator)var39).nextInt();
                  int var41 = var40;
                  boolean var42 = false;
                  Iterable var43 = (Iterable)var24;
                  boolean var44 = false;
                  var46 = (Collection)(new ArrayList());
                  boolean var47 = false;
                  boolean var49 = false;
                  var84 = var43.iterator();
                  if (var19 == null) {
                     continue label74;
                  }

                  Iterator var50 = var84;

                  while(true) {
                     if (!var50.hasNext()) {
                        break label68;
                     }

                     int var51 = ((IntIterator)var50).nextInt();
                     boolean var53 = false;
                     int var54 = var51;
                     boolean var55 = false;
                     ab.O.s(false);
                     float var56 = 0.0F;
                     boolean var57 = false;
                     long var58 = s8.Z();
                     boolean var62 = false;
                     ab var87 = ab.O;
                     class_243 var86 = (new class_2338(var32, var41, var51)).method_46558().method_1031(0.0D, 0.5D, 0.0D);
                     Intrinsics.checkNotNullExpressionValue(var86, true.v<invokedynamic>(15428, 1018964658006364675L ^ var2));
                     int var10007 = 4227.q<invokedynamic>(4227, 8917890870807302499L ^ var2);
                     Object var11 = null;
                     int var12 = var10007;
                     boolean var13 = false;
                     Object var14 = null;
                     boolean var15 = true;
                     byte var16 = 0;
                     Object var17 = null;
                     class_243 var18 = var86;
                     var56 = ab.X(var87, var6, var18, (class_1657)var17, var16, var15, (List)var14, var13, var12, var11);
                     Unit var63 = Unit.INSTANCE;
                     var74 += ((Number)TuplesKt.to(var63, s8.Z() - var58).getSecond()).longValue();
                     ab.O.s(true);
                     float var93 = 0.0F;
                     boolean var64 = false;
                     long var65 = s8.Z();
                     boolean var67 = false;
                     var87 = ab.O;
                     var86 = (new class_2338(var32, var41, var51)).method_46558().method_1031(0.0D, 0.5D, 0.0D);
                     Intrinsics.checkNotNullExpressionValue(var86, true.v<invokedynamic>(15940, 7465200950003044352L ^ var2));
                     var10007 = 7278.q<invokedynamic>(7278, 7466642279685660045L ^ var2);
                     var11 = null;
                     var12 = var10007;
                     var13 = false;
                     var14 = null;
                     var15 = true;
                     var16 = 0;
                     var17 = null;
                     var18 = var86;
                     var93 = ab.X(var87, var6, var18, (class_1657)var17, var16, var15, (List)var14, var13, var12, var11);
                     var63 = Unit.INSTANCE;
                     var72 += ((Number)TuplesKt.to(var63, s8.Z() - var65).getSecond()).longValue();
                     float var94;
                     var85 = (var94 = var56 - var93) == 0.0F ? 0 : (var94 < 0.0F ? -1 : 1);
                     if (var19 == null) {
                        break;
                     }

                     label63: {
                        label62: {
                           try {
                              if (var19 == null) {
                                 break label63;
                              }

                              if (var85 == 0) {
                                 break label62;
                              }
                           } catch (NumberFormatException var82) {
                              throw var82.A<invokedynamic>(var82, -2688334380008469410L, var2);
                           }

                           var85 = 0;
                           break label63;
                        }

                        var85 = 1;
                     }

                     try {
                        if (var85 == 0) {
                           var90 = (k9)Q;
                           class_2338 var88 = new class_2338(var32, var41, var54);
                           ha.F(var90, var8, var9, var88 + " " + var56 + true.v<invokedynamic>(16436, 8109983496803511921L ^ var2) + var93, false, 2, (Object)null, var10);
                        }
                     } catch (NumberFormatException var81) {
                        throw var81.A<invokedynamic>(var81, -2688334380008469410L, var2);
                     }

                     Unit var68 = Unit.INSTANCE;
                     boolean var69 = false;
                     var46.add(var68);
                     if (var19 == null) {
                        break label68;
                     }
                  }
               }

               Iterable var70 = (Iterable)((List)var46);
               CollectionsKt.addAll(var37, var70);
            } while(var19 != null);

            Iterable var71 = (Iterable)((List)var37);
            CollectionsKt.addAll(var28, var71);
            if (var19 != null) {
               continue label77;
            }
            break;
         }

         List var91 = (List)var28;
         break;
      }

      int var92 = (int)((float)(var74 - var72) / (float)Math.max(var74, 1L) * 100.0F);
      var90 = (k9)this;
      String var89 = 28789.v<invokedynamic>(28789, 7937598174210448950L ^ var2);
      ha.F(var90, var8, var9, var89 + var74 + true.v<invokedynamic>(13626, 4116732870325934970L ^ var2) + var72 + true.v<invokedynamic>(18349, 3360627231411431916L ^ var2) + var92 + "%", false, 2, (Object)null, var10);
   }

   static {
      long var20 = b ^ 69242268279132L;
      long var22 = var20 ^ 51291940946999L;
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
      String var15 = "4Ûd\u0012Í\u008f@§õ&Ñ¹\u0088\u008e$Á~V}\u0014o\u008dcTpS\u0000§Ä%\u0004E\u0010¥\u0093\u008e\u008b\u0083¡;XoðB\u0087RECà\u0018\u001fõ#2\u009díýØZ-\u0085þðÏL¶{\u0014\u0092©6\u0097a= gØ!x\u0097\u0005v\u009c\b\u0018.¯{lLOÎ¹öÊ¬â¯ïÝ§ZÔ2ð\u0011²\u0018§\u0007ò²}%nô5Ëzìa\u0015)4*£AÙ|BCx ´\u0092'¦nÎÚêö\u0098f\u0004OaÍC8{ç\\à½±/Íe¼\u001al\u001fØ/";
      int var17 = "4Ûd\u0012Í\u008f@§õ&Ñ¹\u0088\u008e$Á~V}\u0014o\u008dcTpS\u0000§Ä%\u0004E\u0010¥\u0093\u008e\u008b\u0083¡;XoðB\u0087RECà\u0018\u001fõ#2\u009díýØZ-\u0085þðÏL¶{\u0014\u0092©6\u0097a= gØ!x\u0097\u0005v\u009c\b\u0018.¯{lLOÎ¹öÊ¬â¯ïÝ§ZÔ2ð\u0011²\u0018§\u0007ò²}%nô5Ëzìa\u0015)4*£AÙ|BCx ´\u0092'¦nÎÚêö\u0098f\u0004OaÍC8{ç\\à½±/Íe¼\u001al\u001fØ/".length();
      char var14 = ' ';
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var24 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var29 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var29;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[8];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "°².\u0012»ãäu\u0081\u008bk¾Èýã0ºÐe\u000b\u0091/í»";
                  int var5 = "°².\u0012»ãäu\u0081\u008bk¾Èýã0ºÐe\u000b\u0091/í»".length();
                  int var2 = 0;

                  do {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     var27 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var31 = true;
                     var6[var27] = var10004;
                  } while(var2 < var5);

                  f = var6;
                  g = new Integer[3];
                  Q = new ly(var22);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var29;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = ",\u008d4\u0013°òdì\nÒè\u0095ÜÆ\u0002³\u0010|º\u0080Ô\u0099(\u001ar¬\u00adN3\u0010DÇ¸";
               var17 = ",\u008d4\u0013°òdì\nÒè\u0095ÜÆ\u0002³\u0010|º\u0080Ô\u0099(\u001ar¬\u00adN3\u0010DÇ¸".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var24 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30012;
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
            throw new RuntimeException("su/catlean/ly", var10);
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
         throw new RuntimeException("su/catlean/ly" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23193;
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
            throw new RuntimeException("su/catlean/ly", var14);
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
         throw new RuntimeException("su/catlean/ly" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
