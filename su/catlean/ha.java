package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import net.minecraft.class_2561;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ha {
   private static k9[] j;
   private static final long a = j0.a(6867675214096836643L, 8206658955752354749L, MethodHandles.lookup().lookupClass()).a(213561694012697L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public static final void u(@NotNull k9 $this$notify, @NotNull Object m, long a) {
      var2 ^= a;
      long var4 = var2 ^ 42504001035351L;
      Intrinsics.checkNotNullParameter(var0, true.g<invokedynamic>(13151, 7889293791860701183L ^ var2));
      Intrinsics.checkNotNullParameter(var1, "m");
      i(var0, var1.toString(), (v6)null, 0, (class_1799)null, true.e<invokedynamic>(9882, 735597625375279322L ^ var2), var4, (Object)null);
   }

   public static final void K(@NotNull k9 $this$notify, long a, @NotNull String message, @NotNull v6 type, int timeout, @Nullable class_1799 item) {
      var1 ^= a;
      long var7 = var1 ^ 99192739463764L;
      Intrinsics.checkNotNullParameter(var0, true.g<invokedynamic>(808, 3396088962963863168L ^ var1));
      Intrinsics.checkNotNullParameter(var3, true.g<invokedynamic>(31204, 1725551151037647949L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.g<invokedynamic>(10981, 5751479913422446406L ^ var1));
      _x.e.R(var0.g(), var7, var3, var5, var4, var6);
   }

   // $FF: synthetic method
   public static void i(k9 var0, String var1, v6 var2, int var3, class_1799 var4, int var5, long var6, Object var8) {
      var6 ^= a;
      long var9 = var6 ^ 43337486331222L;
      k9[] var11 = -95378042924007766L.A<invokedynamic>(-95378042924007766L, var6);

      int var10000;
      label51: {
         label50: {
            try {
               var10000 = var5 & 2;
               if (var11 != null) {
                  break label51;
               }

               if (var10000 == 0) {
                  break label50;
               }
            } catch (NumberFormatException var14) {
               throw var14.A<invokedynamic>(var14, -99801195391222606L, var6);
            }

            var2 = v6.INFO;
         }

         var10000 = var5 & 4;
      }

      label42: {
         label41: {
            try {
               if (var11 != null) {
                  break label42;
               }

               if (var10000 == 0) {
                  break label41;
               }
            } catch (NumberFormatException var13) {
               throw var13.A<invokedynamic>(var13, -99801195391222606L, var6);
            }

            var3 = 2;
         }

         var10000 = var5 & true.e<invokedynamic>(7448, 6958392928624505553L ^ var6);
      }

      if (var10000 != 0) {
         var4 = null;
      }

      try {
         K(var0, var9, var1, var2, var3, var4);
         if (var6 >= 0L && -132976476873688243L.A<invokedynamic>(-132976476873688243L, var6) == null) {
            (new k9[5]).A<invokedynamic>(new k9[5], -137161602760023424L, var6);
         }

      } catch (NumberFormatException var12) {
         throw var12.A<invokedynamic>(var12, -99801195391222606L, var6);
      }
   }

   public static final void b(@NotNull k9 $this$message, long a, @NotNull Object m) {
      var1 ^= a;
      long var10001 = var1 ^ 37018212609429L;
      int var4 = (int)((var1 ^ 37018212609429L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var0, true.g<invokedynamic>(808, 3396018605682950784L ^ var1));
      Intrinsics.checkNotNullParameter(var3, "m");
      F(var0, var4, var5, var3.toString(), false, 2, (Object)null, var6);
   }

   public static final void O(@NotNull k9 $this$message, long a, @NotNull String message, boolean chat) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public static void F(k9 var0, int var1, int var2, String var3, boolean var4, int var5, Object var6, int var7) {
      long var8 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ a;
      long var10 = var8 ^ 52000743808924L;
      k9[] var12 = 5363330767193361001L.A<invokedynamic>(5363330767193361001L, var8);

      label21: {
         int var10000;
         label20: {
            try {
               var10000 = var5 & 2;
               if (var12 != null) {
                  break label20;
               }

               if (var10000 == 0) {
                  break label21;
               }
            } catch (NumberFormatException var13) {
               throw var13.A<invokedynamic>(var13, 5358766310301124721L, var8);
            }

            var10000 = 0;
         }

         var4 = var10000;
      }

      O(var0, var10, var3, (boolean)var4);
   }

   @NotNull
   public static final String P(@NotNull k9 $this$i18n, short a, short a, int a, @NotNull String message, @NotNull Object[] args, boolean common) {
      long var7 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var9 = var7 ^ 26813062195099L;
      k9[] var10000 = -3812507073292055792L.A<invokedynamic>(-3812507073292055792L, var7);
      Intrinsics.checkNotNullParameter(var0, true.g<invokedynamic>(808, 3396040238927328179L ^ var7));
      k9[] var11 = var10000;

      String var10001;
      nf var27;
      label40: {
         try {
            Intrinsics.checkNotNullParameter(var4, true.g<invokedynamic>(5887, 3072442103519356526L ^ var7));
            Intrinsics.checkNotNullParameter(var5, true.g<invokedynamic>(16507, 3596521202506887395L ^ var7));
            var27 = nf.s;
            if (var6) {
               var10001 = 11568.g<invokedynamic>(11568, 8508374664699092393L ^ var7);
               break label40;
            }
         } catch (NumberFormatException var26) {
            throw var26.A<invokedynamic>(var26, -3808065615673112312L, var7);
         }

         var10001 = var0.X().f() + "." + var0.D();
      }

      String var24 = true.g<invokedynamic>(27561, 4705917027525516084L ^ var7) + var10001 + "." + var4;
      nf var23 = var27;
      boolean var14 = false;
      Object[] var15 = var5;
      Collection var16 = (Collection)(new ArrayList(var5.length));
      boolean var17 = false;
      int var18 = 0;
      int var19 = var5.length;

      Collection var29;
      label32:
      while(true) {
         if (var18 < var19) {
            Object var28 = var15[var18];

            do {
               Object var20 = var28;
               var29 = var16;
               if (var11 != null) {
                  break label32;
               }

               boolean var22 = false;
               Intrinsics.checkNotNull(var20, true.g<invokedynamic>(24013, 4907797107402272081L ^ var7));
               var16.add(var20);
               ++var18;
               if (var11 == null) {
                  continue label32;
               }

               var28 = new int[4];
            } while(var3 > 0);

            ((Class)var28).A<invokedynamic>(var28, -3790193814375364387L, var7);
         }

         var29 = var16;
         break;
      }

      List var25 = (List)var29;
      Collection var13 = (Collection)var25;
      var14 = false;
      Object[] var12 = var13.toArray(new Object[0]);
      return var23.G(var24, var9, Arrays.copyOf(var12, var12.length));
   }

   // $FF: synthetic method
   public static String r(k9 var0, String var1, Object[] var2, boolean var3, int var4, long var5, Object var7) {
      var5 ^= a;
      long var10001 = var5 ^ 81955571957086L;
      int var8 = (int)((var5 ^ 81955571957086L) >>> 48);
      int var9 = (int)(var10001 << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      k9[] var11 = -6082612953293968495L.A<invokedynamic>(-6082612953293968495L, var5);

      int var10000;
      label20: {
         try {
            var10000 = var4 & 4;
            if (var11 != null) {
               break label20;
            }

            if (var10000 == 0) {
               return P(var0, (short)var8, (short)var9, var10, var1, var2, (boolean)var3);
            }
         } catch (NumberFormatException var12) {
            throw var12.A<invokedynamic>(var12, -6078031260702824055L, var5);
         }

         var10000 = 0;
      }

      var3 = var10000;
      return P(var0, (short)var8, (short)var9, var10, var1, var2, (boolean)var3);
   }

   private static final void i(class_2561 var0) {
      long var1 = a ^ 98377275157225L;
      long var3 = var1 ^ 22620732306748L;
      s8.f(var3).method_7353(var0, false);
   }

   public static void t(k9[] var0) {
      j = var0;
   }

   public static k9[] x() {
      return j;
   }

   static {
      long var20 = a ^ 72404321320764L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, -6698080519075381357L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[12];
      int var16 = 0;
      String var15 = "Q4·[rW 'Ê¼§I×>å\u0018\u0010\u007fö4,zÑ`_¦\u009fÎv\u0081\u007f\u001d\u0016\u0010?`\u0092«¹B®\u0006\u00146ÓìçYÙ \u0010d÷A%ä\u0090\u001b\t>\u009eí\u0080\u0081ë-Ð`áÕ\u00adûáé\u0002`\t\"{¿y\u0003\u008cÐyD\u0096\u0006Æä\u0084\u008fZ7£0ö0MûðBqmó\u0018´^\u009c=¹\u0090I}á×å!>|\u0015#«\u009b:\u0005\\eÔ^¨\u008fÑ.\u009eU³gü3-\u008aB\u0096\u001a^G\u008e<R\u009e\u0090ò{x\u008c=\u0000WP\u0019\u009cD\u001f «iL\u0001kj\u0012ÜEÒ÷N^]&iÆ\u0012%½ö\u000f\u0010SJ\u0016hÉ\u009d÷0`\u0010{§!ð²\u0092æÕ ¡ü\u0001 ¼W\u000e\u0010\u0095¨\u00adA'\u001dàRý§\u008d^\u0007ÏËÑ\u0010A\u00149\u001ai\u0087\u009cSSPJ\f.\u001aw¯\u0010È[&ä@ì\u000f²k¥¾Å\u008c£%¨";
      int var17 = "Q4·[rW 'Ê¼§I×>å\u0018\u0010\u007fö4,zÑ`_¦\u009fÎv\u0081\u007f\u001d\u0016\u0010?`\u0092«¹B®\u0006\u00146ÓìçYÙ \u0010d÷A%ä\u0090\u001b\t>\u009eí\u0080\u0081ë-Ð`áÕ\u00adûáé\u0002`\t\"{¿y\u0003\u008cÐyD\u0096\u0006Æä\u0084\u008fZ7£0ö0MûðBqmó\u0018´^\u009c=¹\u0090I}á×å!>|\u0015#«\u009b:\u0005\\eÔ^¨\u008fÑ.\u009eU³gü3-\u008aB\u0096\u001a^G\u008e<R\u009e\u0090ò{x\u008c=\u0000WP\u0019\u009cD\u001f «iL\u0001kj\u0012ÜEÒ÷N^]&iÆ\u0012%½ö\u000f\u0010SJ\u0016hÉ\u009d÷0`\u0010{§!ð²\u0092æÕ ¡ü\u0001 ¼W\u000e\u0010\u0095¨\u00adA'\u001dàRý§\u008d^\u0007ÏËÑ\u0010A\u00149\u001ai\u0087\u009cSSPJ\f.\u001aw¯\u0010È[&ä@ì\u000f²k¥¾Å\u008c£%¨".length();
      char var14 = 16;
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
                  b = var18;
                  c = new String[12];
                  g = new HashMap(13);
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
                  String var4 = "ÊÀõ\u009d~á\u009dS\t«Û*\u0097cI]";
                  int var5 = "ÊÀõ\u009d~á\u009dS\t«Û*\u0097cI]".length();
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

                  e = var6;
                  f = new Integer[2];
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

               var15 = "Åè»·1\u0098\u009b»\u0004Þ6¢^#\u0091\u0097(É»T\u0011Ìh~\u008d!,¬Y\u001a¹\u001a\u008dN/¨\u0014õq×<ùcÕ4\u0004ÕY\u001c\u001b @\u0018¢À(]";
               var17 = "Åè»·1\u0098\u009b»\u0004Þ6¢^#\u0091\u0097(É»T\u0011Ìh~\u008d!,¬Y\u001a¹\u001a\u008dN/¨\u0014õq×<ùcÕ4\u0004ÕY\u001c\u001b @\u0018¢À(]".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31442;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ha", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("su/catlean/ha" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4153;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ha", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/ha" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
