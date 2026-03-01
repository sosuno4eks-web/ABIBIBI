package su.catlean;

import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1282;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_259;
import net.minecraft.class_265;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.PostTasksProcessEvent;
import su.catlean.gofra.Flow;

@ExcludeFlow
@ExcludeIndy
public final class ab implements zh {
   @NotNull
   public static final ab O;
   public static final double A = -1.0E-7D;
   @NotNull
   private static final Long2ByteOpenHashMap w;
   @NotNull
   private static final class_265 s;
   @Nullable
   private static class_1282 I;
   private static boolean F;
   private static final long a = j0.a(8347201888056457595L, 5079767464823320721L, MethodHandles.lookup().lookupClass()).a(15072607899251L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private ab() {
   }

   public final boolean C() {
      return F;
   }

   public final void s(boolean <set-?>) {
      F = var1;
   }

   @Flow
   private final void i(PostTasksProcessEvent var1) {
      w.clear();
   }

   public final float p(@NotNull class_243 explosionPos, @NotNull class_1657 target, int predictTicks, boolean ignoreTerrain, @NotNull List ghost, boolean solid, long a) {
      // $FF: Couldn't be decompiled
   }

   public static float X(ab var0, long var1, class_243 var3, class_1657 var4, int var5, boolean var6, List var7, boolean var8, int var9, Object var10) {
      var1 ^= a;
      long var11 = var1 ^ 84461376337784L;
      long var13 = var1 ^ 133881327049160L;
      if ((var9 & 2) != 0) {
         var4 = (class_1657)s8.f(var11);
      }

      if ((var9 & 4) != 0) {
         var5 = 0;
      }

      if ((var9 & true.r<invokedynamic>(10593, 6068843902240206681L ^ var1)) != 0) {
         var6 = false;
      }

      if ((var9 & true.r<invokedynamic>(21886, 2962306944258757444L ^ var1)) != 0) {
         var7 = CollectionsKt.emptyList();
      }

      if ((var9 & true.r<invokedynamic>(31942, 4155670143955794680L ^ var1)) != 0) {
         var8 = false;
      }

      return var0.p(var3, var4, var5, var6, var7, var8, var13);
   }

   private final float G(class_1657 param1, double param2, long param4, double param6) {
      // $FF: Couldn't be decompiled
   }

   private final float l(Iterable var1) {
      float var2 = 0.0F;
      boolean var4 = false;
      Iterator var5 = var1.iterator();

      while(var5.hasNext()) {
         Object var6 = var5.next();
         class_1799 var7 = (class_1799)var6;
         boolean var8 = false;
         if (!var7.method_7960()) {
            var2 += 8.0F;
         }
      }

      return var2;
   }

   private final float G(double var1, double var3) {
      double var5 = (1.0D - var1) * var3;
      return (float)((var5 * var5 + var5) / 2.0D * 7.0D * 12.0D + 1.0D);
   }

   private final float c(class_243 param1, class_238 param2, boolean param3, long param4, List param6, boolean param7) {
      // $FF: Couldn't be decompiled
   }

   static float C(ab var0, class_243 var1, class_238 var2, boolean var3, List var4, boolean var5, long var6, int var8, Object var9) {
      var6 ^= a;
      long var10 = var6 ^ 105492579141920L;
      if ((var8 & true.r<invokedynamic>(10593, 6068836826864621453L ^ var6)) != 0) {
         var4 = CollectionsKt.emptyList();
      }

      return var0.c(var1, var2, var3, var10, var4, var5);
   }

   private final boolean B(double param1, double param3, double param5) {
      // $FF: Couldn't be decompiled
   }

   private final Pair x(long var1, class_243 var3, class_238 var4, boolean var5, List var6, boolean var7) {
      var1 ^= a;
      long var8 = var1 ^ 122372519121294L;
      double var10 = 1.0D / ((var4.field_1320 - var4.field_1323) * 2.0D + 1.0D);
      double var12 = 1.0D / ((var4.field_1324 - var4.field_1321) * 2.0D + 1.0D);
      double var14 = (1.0D - Math.floor(1.0D / var10) * var10) / 2.0D;
      double var16 = (1.0D - Math.floor(1.0D / var12) * var12) / 2.0D;
      int var18 = 0;
      int var19 = 0;

      for(double var20 = 0.0D; var20 <= 1.0D; ++var20) {
         for(double var22 = 0.0D; var22 <= 1.0D; ++var22) {
            for(double var24 = 0.0D; var24 <= 1.0D; ++var24) {
               double var26 = class_3532.method_16436(var20, var4.field_1323, var4.field_1320);
               double var28 = class_3532.method_16436(var22, var4.field_1322, var4.field_1325);
               double var30 = class_3532.method_16436(var24, var4.field_1321, var4.field_1324);
               class_243 var32 = new class_243(var26 + var14, var28, var30 + var16);

               try {
                  if (this.w(var8, var32, var3, var5, var6, var7) == null) {
                     ++var18;
                  }
               } catch (NumberFormatException var33) {
                  throw var33.A<invokedynamic>(var33, -5285567710212234307L, var1);
               }

               ++var19;
            }
         }
      }

      return new Pair(var18, var19);
   }

   static Pair z(ab var0, class_243 var1, class_238 var2, boolean var3, List var4, boolean var5, int var6, long var7, Object var9) {
      var7 ^= a;
      long var10 = var7 ^ 40959526181304L;
      if ((var6 & true.r<invokedynamic>(10593, 6068756154115386259L ^ var7)) != 0) {
         var4 = CollectionsKt.emptyList();
      }

      return var0.x(var10, var1, var2, var3, var4, var5);
   }

   private final class_3965 l(class_2338 param1, class_243 param2, class_243 param3, boolean param4, List param5, boolean param6, long param7) {
      // $FF: Couldn't be decompiled
   }

   static class_3965 n(ab var0, long var1, class_2338 var3, class_243 var4, class_243 var5, boolean var6, List var7, boolean var8, int var9, Object var10) {
      var1 ^= a;
      long var11 = var1 ^ 96518840521820L;
      if ((var9 & true.r<invokedynamic>(28609, 2625666158133720616L ^ var1)) != 0) {
         var6 = false;
      }

      if ((var9 & true.r<invokedynamic>(32273, 2362194905442232313L ^ var1)) != 0) {
         var7 = CollectionsKt.emptyList();
      }

      if ((var9 & true.r<invokedynamic>(14132, 1474783098626076377L ^ var1)) != 0) {
         var8 = true;
      }

      return var0.l(var3, var4, var5, var6, var7, var8, var11);
   }

   private final float x(byte param1) {
      // $FF: Couldn't be decompiled
   }

   private final class_265 w(byte var1) {
      byte var3 = var1;

      class_265 var10000;
      label31: {
         try {
            if (var3 == 1) {
               var10000 = class_259.method_1073();
               break label31;
            }
         } catch (NumberFormatException var5) {
            throw a(var5);
         }

         try {
            if (var3 == 4) {
               var10000 = s;
               break label31;
            }
         } catch (NumberFormatException var4) {
            throw a(var4);
         }

         var10000 = class_259.method_1077();
      }

      class_265 var2 = var10000;
      Intrinsics.checkNotNull(var2);
      return var2;
   }

   private final byte u(class_2248 var1, boolean var2) {
      try {
         if (var2) {
            return 1;
         }
      } catch (NumberFormatException var4) {
         throw a(var4);
      }

      try {
         if (Intrinsics.areEqual((Object)var1, (Object)class_2246.field_10443)) {
            return 4;
         }
      } catch (NumberFormatException var5) {
         throw a(var5);
      }

      try {
         return (byte)(var1.method_9520() >= 600.0F ? 3 : 2);
      } catch (NumberFormatException var3) {
         throw a(var3);
      }
   }

   @Nullable
   public final class_3965 w(long a, @NotNull class_243 start, @NotNull class_243 end, boolean ignoreTerrain, @NotNull List ghost, boolean solid) {
      // $FF: Couldn't be decompiled
   }

   public static class_3965 S(ab var0, int var1, class_243 var2, class_243 var3, boolean var4, List var5, boolean var6, short var7, int var8, int var9, Object var10) {
      long var11 = ((long)var1 << 32 | (long)var7 << 48 >>> 32 | (long)var9 << 48 >>> 48) ^ a;
      long var13 = var11 ^ 69285550364318L;
      if ((var8 & 4) != 0) {
         var4 = false;
      }

      if ((var8 & true.r<invokedynamic>(10593, 6068758852271614816L ^ var11)) != 0) {
         var5 = CollectionsKt.emptyList();
      }

      if ((var8 & true.r<invokedynamic>(21886, 2962373645890869117L ^ var11)) != 0) {
         var6 = true;
      }

      return var0.w(var13, var2, var3, var4, var5, var6);
   }

   public final boolean o(short a, char a, int a, @NotNull class_243 point) {
      // $FF: Couldn't be decompiled
   }

   private final int L(Iterable var1, long var2) {
      var2 ^= a;
      long var4 = var2 ^ 103103476539872L;
      int var6 = 0;
      boolean var8 = false;

      class_1799 var11;
      for(Iterator var9 = var1.iterator(); var9.hasNext(); var6 += O.n(var4, var11)) {
         Object var10 = var9.next();
         var11 = (class_1799)var10;
         boolean var12 = false;
      }

      return var6;
   }

   private final int n(long param1, class_1799 param3) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = a ^ 27174487873466L;
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[15];
      int var16 = 0;
      String var15 = "Tj²µ;\u008c©a\u009eÜÞÁ\u009aÛ\u008aF(ðGÊ\u001aºk\u008fnÆ\u009dP\u0091½\bÕ\\FQïûa\u0015\u009bPU\u0090i\u008b5y@¾à\u000bþës¥.\t\u0010\u008f¢Pyà\u001b\u0093>Ï\u0019JùQâ7Q0RAEâ\fè\u0003HC<\u0003OÙ\u000fþ:\u0017 \u0080¾ \u0081\u0080\u001e\u000bA\u0098Á\u0086Ér\u0003p\u0091\u007fî\u0000Y2ó\u0093\u0080ÚÅîyÈO(½ e¼1.4ÿj>-£þ\u009d\u001aH\u001dgÛû©p\u001fUå\u001bS\u00977©\u0091N\u0006&l\u0099Ê¾\u0095\u0003\u0018N\u0099j\u0095\u001aJÆ\u008fÔ\u0086º\u0096JùÃä{Dw_0^Ñ)\u0010\u0013\u0003w\u009d0b·';\u0004ð8ÂOlâ \u0080\u0094\u001f\u0001WDjõDvSVmÚå§1Ñ\u0019y\u009e\u0090ÓKDêµ:FÇui\u0018Ü¶7p\u000ede\b\u0097o\u001c§\u0093]Þ/áx®^Î\u0091zø x\nS:\u0006Ëè3'8\u0011¸x\u001a;\u009cÅf|¥À\u0006·_\u0010Ý\u0091×\u0093¶\u0004v\u0010TÌ{\u0094m¶\u008b\u0002Í\rí\u000b'Ó§V\u0010\u0092¶±ð?\u000flÿP0ÛY\u0007Ø\u0091Â(Ýðïgëd¸¿S\u00981xKÙu\u0094¼|Y\u0005Íå£ùB)W\u001bºÚ\u0099htMØ\u0089\u0097JÍ6";
      int var17 = "Tj²µ;\u008c©a\u009eÜÞÁ\u009aÛ\u008aF(ðGÊ\u001aºk\u008fnÆ\u009dP\u0091½\bÕ\\FQïûa\u0015\u009bPU\u0090i\u008b5y@¾à\u000bþës¥.\t\u0010\u008f¢Pyà\u001b\u0093>Ï\u0019JùQâ7Q0RAEâ\fè\u0003HC<\u0003OÙ\u000fþ:\u0017 \u0080¾ \u0081\u0080\u001e\u000bA\u0098Á\u0086Ér\u0003p\u0091\u007fî\u0000Y2ó\u0093\u0080ÚÅîyÈO(½ e¼1.4ÿj>-£þ\u009d\u001aH\u001dgÛû©p\u001fUå\u001bS\u00977©\u0091N\u0006&l\u0099Ê¾\u0095\u0003\u0018N\u0099j\u0095\u001aJÆ\u008fÔ\u0086º\u0096JùÃä{Dw_0^Ñ)\u0010\u0013\u0003w\u009d0b·';\u0004ð8ÂOlâ \u0080\u0094\u001f\u0001WDjõDvSVmÚå§1Ñ\u0019y\u009e\u0090ÓKDêµ:FÇui\u0018Ü¶7p\u000ede\b\u0097o\u001c§\u0093]Þ/áx®^Î\u0091zø x\nS:\u0006Ëè3'8\u0011¸x\u001a;\u009cÅf|¥À\u0006·_\u0010Ý\u0091×\u0093¶\u0004v\u0010TÌ{\u0094m¶\u008b\u0002Í\rí\u000b'Ó§V\u0010\u0092¶±ð?\u000flÿP0ÛY\u0007Ø\u0091Â(Ýðïgëd¸¿S\u00981xKÙu\u0094¼|Y\u0005Íå£ùB)W\u001bºÚ\u0099htMØ\u0089\u0097JÍ6".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var29 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var29;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[15];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[8];
                  int var3 = 0;
                  String var4 = "/\u0094\u0003PRFðÁN\u0015¢í\u008b¼Ö\u009a¡\u0084\u0017y¡P\u0095è÷*wCÃ~o¯\u000b¶©q;Ùc¿À\u0085ÇüÿL\u0095 ";
                  int var5 = "/\u0094\u0003PRFðÁN\u0015¢í\u008b¼Ö\u009a¡\u0084\u0017y¡P\u0095è÷*wCÃ~o¯\u000b¶©q;Ùc¿À\u0085ÇüÿL\u0095 ".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     long[] var25 = var6;
                     var27 = var3++;
                     long var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var32 = -1;

                     while(true) {
                        long var8 = var31;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var34 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var32) {
                        case 0:
                           var25[var27] = var34;
                           if (var2 >= var5) {
                              e = var6;
                              f = new Integer[8];
                              O = new ab();
                              w = new Long2ByteOpenHashMap();
                              class_265 var26 = class_2248.method_66404(14.0D, 0.0D, 14.0D);
                              Intrinsics.checkNotNullExpressionValue(var26, true.t<invokedynamic>(27557, 835811798405211489L ^ var20));
                              s = var26;
                              F = true;
                              return;
                           }
                           break;
                        default:
                           var25[var27] = var34;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "ûÑ\u00007\u001f\u008dx»\u008e\u0090Bo\\â\u001b\b";
                           var5 = "ûÑ\u00007\u001f\u008dx»\u008e\u0090Bo\\â\u001b\b".length();
                           var2 = 0;
                        }

                        var27 = var2;
                        var2 += 8;
                        var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        var25 = var6;
                        var27 = var3++;
                        var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var32 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var29;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u000bt\u0099T%]\u0090SUz\u00165F2së Ð\u0080»ÉÉÂfm°ª\u0098\u0088D_\u0019ÙÈTñë\u009c\u0002Îd\u007f\u008f|£b\u0090\u0005x";
               var17 = "\u000bt\u0099T%]\u0090SUz\u00165F2së Ð\u0080»ÉÉÂfm°ª\u0098\u0088D_\u0019ÙÈTñë\u009c\u0002Îd\u007f\u008f|£b\u0090\u0005x".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18220;
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
            throw new RuntimeException("su/catlean/ab", var10);
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
         throw new RuntimeException("su/catlean/ab" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29518;
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
            throw new RuntimeException("su/catlean/ab", var14);
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
         throw new RuntimeException("su/catlean/ab" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
