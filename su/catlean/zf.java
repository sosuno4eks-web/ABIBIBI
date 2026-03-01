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
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class zf {
   @NotNull
   public static final gm m;
   @NotNull
   private final String a;
   private final Object A;
   private Object r;
   @Nullable
   private pj o;
   @NotNull
   private Function0 U;
   @NotNull
   private final String v;
   @NotNull
   private static final Json P;
   private static boolean w;
   private static final long c = j0.a(5496421510020723761L, 1505722003139531583L, MethodHandles.lookup().lookupClass()).a(232304899755745L);
   private static final String[] e;
   private static final String[] f;
   private static final Map g;
   private static final long[] p;
   private static final Integer[] q;
   private static final Map t;

   public zf(@NotNull String id, long a, Object defaultValue, Object value, @Nullable pj group, @NotNull Function0 visible) {
      var2 ^= c;
      Intrinsics.checkNotNullParameter(var1, true.e<invokedynamic>(14799, 5380709146624356843L ^ var2));
      Intrinsics.checkNotNullParameter(var7, true.e<invokedynamic>(17982, 3890888528024538644L ^ var2));
      super();
      this.a = var1;
      this.A = var4;
      this.r = var5;
      this.o = var6;
      this.U = var7;
      StringBuilder var8 = new StringBuilder();
      StringBuilder var9 = var8;
      boolean var10 = false;
      CharSequence var10000 = (CharSequence)this.a;
      String[] var11 = new String[]{"-"};
      Iterable var22 = (Iterable)StringsKt.split$default(var10000, var11, false, 0, true.o<invokedynamic>(27469, 197447762341553248L ^ var2), (Object)null);
      boolean var12 = false;
      Collection var14 = (Collection)(new ArrayList());
      boolean var15 = false;
      Iterator var16 = var22.iterator();

      while(true) {
         if (var16.hasNext()) {
            Object var17 = var16.next();
            String var18 = (String)var17;
            boolean var19 = false;

            int var25;
            label51: {
               try {
                  var25 = ((CharSequence)var18).length();
                  if (var2 < 0L) {
                     break;
                  }

                  if (var2 < 0L) {
                     break label51;
                  }

                  if (var25 > 0) {
                     var25 = 1;
                     break label51;
                  }
               } catch (NumberFormatException var21) {
                  throw var21.A<invokedynamic>(var21, 1716080493662175810L, var2);
               }

               var25 = 0;
            }

            if (var2 >= 0L) {
               if (var25 == 0) {
                  continue;
               }

               var14.add(var17);
            }

            if (var2 > 0L) {
               continue;
            }
         }

         var22 = (Iterable)((List)var14);
         boolean var27 = false;
         break;
      }

      Iterator var13 = var22.iterator();

      while(true) {
         if (var13.hasNext()) {
            Object var23 = var13.next();
            String var24 = (String)var23;
            boolean var26 = false;
            var9.append(" ");
            String var10001 = var24.substring(0, 1);
            Intrinsics.checkNotNullExpressionValue(var10001, true.e<invokedynamic>(8904, 7204477261584263908L ^ var2));
            var10001 = var10001.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(var10001, true.e<invokedynamic>(27703, 5891803980227060754L ^ var2));
            var9.append(var10001);
            var10001 = var24.substring(1);
            Intrinsics.checkNotNullExpressionValue(var10001, true.e<invokedynamic>(21560, 177217213314243601L ^ var2));
            var10001 = var10001.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(var10001, true.e<invokedynamic>(13423, 8267194540544359488L ^ var2));
            var9.append(var10001);
            if (var2 <= 0L) {
               break;
            }

            if (var2 >= 0L) {
               continue;
            }
         }

         this.v = var8.toString();
         break;
      }

   }

   public zf(String var1, Object var2, Object var3, long var4, pj var6, Function0 var7, int var8, DefaultConstructorMarker var9) {
      var4 ^= c;
      long var10 = var4 ^ 39059976832307L;
      if ((var8 & 4) != 0) {
         var3 = var2;
      }

      if ((var8 & true.o<invokedynamic>(618, 6728995427411110078L ^ var4)) != 0) {
         var6 = null;
      }

      if ((var8 & true.o<invokedynamic>(2884, 6274100878639079827L ^ var4)) != 0) {
         var7 = zf::u;
      }

      this(var1, var10, var2, var3, var6, var7);
   }

   @NotNull
   public final String M() {
      return this.a;
   }

   public final Object x() {
      return this.A;
   }

   public final Object B() {
      return this.r;
   }

   public final void v(Object <set-?>) {
      this.r = var1;
   }

   @Nullable
   public final pj s() {
      return this.o;
   }

   public final void F(@Nullable pj <set-?>) {
      this.o = var1;
   }

   @NotNull
   public final Function0 U() {
      return this.U;
   }

   public final void R(long a, @NotNull Function0 <set-?>) {
      var1 ^= c;
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(27633, 7530100888301242290L ^ var1));
      this.U = var3;
   }

   @NotNull
   public final String m() {
      return this.v;
   }

   public final Object k(short a, @Nullable Object thisRef, @NotNull KProperty property, short a, int a) {
      long var6 = ((long)var1 << 48 | (long)var4 << 48 >>> 16 | (long)var5 << 32 >>> 32) ^ c;
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(17003, 3043929984401149473L ^ var6));
      return this.r;
   }

   public final void P(@Nullable Object thisRef, int a, @NotNull KProperty property, short a, Object value, short a) {
      long var7 = ((long)var2 << 32 | (long)var4 << 48 >>> 32 | (long)var6 << 48 >>> 48) ^ c;
      Intrinsics.checkNotNullParameter(var3, true.e<invokedynamic>(17284, 4733562241978122199L ^ var7));
      this.r = var5;
   }

   public final void r() {
      this.r = this.A;
   }

   public abstract void n(long var1, @NotNull String var3);

   private static final boolean u() {
      return true;
   }

   private static final Unit O(JsonBuilder var0) {
      long var1 = c ^ 4620884485273L;
      Intrinsics.checkNotNullParameter(var0, true.e<invokedynamic>(3936, 9128657562800493928L ^ var1));
      var0.setIgnoreUnknownKeys(true);
      var0.setEncodeDefaults(true);
      return Unit.INSTANCE;
   }

   public static final Json K() {
      return P;
   }

   static {
      long var20 = c ^ 128240564911970L;
      g = new HashMap(13);
      true.A<invokedynamic>(true, -2401587725817557065L, var20);
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
      String var15 = "øúfA5k<\u0094Y~ÍqÙ©ÍUgophPð\\\u008a\u000bkZS}²G\f stfP.ØÚt\u0005\u009c\u001d0\u0089hhÁQf¤\u00adâ\u009dõ\u0014\u0099Ìwöø\u008a\u0006Ë\u0018\f[$X\u0099¨Ý£-úÆqle#ÚXýzlIç\u000b70©¸:AßZ¿\u008b\u001b\u0012\u0018öµVËQ_.´GË}\u0088#ýö\u008d\u0085\f\u0084!õêÞ8á\u0090n\u0010o\u001fI\u008f¸î@\u0097\u0085\u0018×ï£#\u008a·³æ[I]jGê/µí&µ:®¢'Y 6)\u0092\u0098\u009aþ,|QæýäÍm2\u009aµ\u009eÔ°P\u0004\u0002\by\u000b±\u0087\u001a=th\u0010cb»\u009f\u001dÌú½2\u0005j\u0010\u0019\u008eÜÃ\u0010L\u009cA\u009e\u0093Jµ\nÿ\r\n òsÀy";
      int var17 = "øúfA5k<\u0094Y~ÍqÙ©ÍUgophPð\\\u008a\u000bkZS}²G\f stfP.ØÚt\u0005\u009c\u001d0\u0089hhÁQf¤\u00adâ\u009dõ\u0014\u0099Ìwöø\u008a\u0006Ë\u0018\f[$X\u0099¨Ý£-úÆqle#ÚXýzlIç\u000b70©¸:AßZ¿\u008b\u001b\u0012\u0018öµVËQ_.´GË}\u0088#ýö\u008d\u0085\f\u0084!õêÞ8á\u0090n\u0010o\u001fI\u008f¸î@\u0097\u0085\u0018×ï£#\u008a·³æ[I]jGê/µí&µ:®¢'Y 6)\u0092\u0098\u009aþ,|QæýäÍm2\u009aµ\u009eÔ°P\u0004\u0002\by\u000b±\u0087\u001a=th\u0010cb»\u009f\u001dÌú½2\u0005j\u0010\u0019\u008eÜÃ\u0010L\u009cA\u009e\u0093Jµ\nÿ\r\n òsÀy".length();
      char var14 = ' ';
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var27 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var27;
               if ((var13 += var14) >= var17) {
                  e = var18;
                  f = new String[10];
                  t = new HashMap(13);
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
                  String var4 = "Ö}¬yq*<ýy\u0088;\u0013e\tª\u0005v\u008dvWww:\u0010";
                  int var5 = "Ö}¬yq*<ýy\u0088;\u0013e\tª\u0005v\u008dvWww:\u0010".length();
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

                  p = var6;
                  q = new Integer[3];
                  m = new gm((DefaultConstructorMarker)null);
                  P = JsonKt.Json$default((Json)null, zf::O, 1, (Object)null);
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

               var15 = "ÌKc´\u009a\u0013´\u0082ë\b²\u000eGÊ\u0094\u009c(ê©·b\u0017\u0099A]h¹\u0097,QV`Ó¦7\u0005\u009eQ²ç2U$¯´\u0011Ò\u008faM²\\!\u0080Þ¢°";
               var17 = "ÌKc´\u009a\u0013´\u0082ë\b²\u000eGÊ\u0094\u009c(ê©·b\u0017\u0099A]h¹\u0097,QV`Ó¦7\u0005\u009eQ²ç2U$¯´\u0011Ò\u008faM²\\!\u0080Þ¢°".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void u(boolean var0) {
      w = var0;
   }

   public static boolean h() {
      return w;
   }

   public static boolean f() {
      boolean var0 = h();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24157;
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
            throw new RuntimeException("su/catlean/zf", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         f[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/zf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 6492;
      if (q[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = p[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])t.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               t.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/zf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
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
         throw new RuntimeException("su/catlean/zf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
