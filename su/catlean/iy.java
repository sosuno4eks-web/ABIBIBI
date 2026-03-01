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
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_243;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class iy {
   private static final double r = 0.05D;
   private static final double t = 0.95D;
   private static final double f = 0.5D;
   @NotNull
   private static final Map O;
   @NotNull
   private static final List z;
   private static String[] J;
   private static final long a = j0.a(693003697999168167L, 6827361337313784482L, MethodHandles.lookup().lookupClass()).a(137582235930909L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] g;
   private static final Map h;

   @NotNull
   public static final Map c() {
      return O;
   }

   @NotNull
   public static final List i() {
      return z;
   }

   @Nullable
   public static final pk S(int a, @NotNull o6 $this$calcPosition, @NotNull ej configState, long a) {
      long var5 = ((long)var0 << 32 | var3 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 94195642716135L;
      long var9 = var5 ^ 24767377404713L;
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(9550, 8044260233129924539L ^ var5));
      Intrinsics.checkNotNullParameter(var2, true.t<invokedynamic>(8834, 2780553835951100007L ^ var5));
      boolean var12 = false;
      long var13 = s8.Z();
      boolean var15 = false;
      Pair var11 = TuplesKt.to(vo.y(var2, var7, L(var1, var9, var2, false, false, true.v<invokedynamic>(2278, 7718136008467558282L ^ var5), (Object)null)), s8.Z() - var13);
      pk var16 = (pk)var11.component1();
      var13 = ((Number)var11.component2()).longValue();
      var1.L(var13);
      return var16;
   }

   @Nullable
   public static final class_3965 t(int a, int a, @NotNull o6 $this$calcBasePosition, short a, boolean onlyNoPositions, boolean sponges) {
      // $FF: Couldn't be decompiled
   }

   private static final List E(o6 var0, ej var1, long var2, boolean var4, boolean var5) {
      var2 ^= a;
      long var6 = var2 ^ 100401523103276L;
      long var8 = var2 ^ 56827916424651L;
      long var10 = var2 ^ 10103793261526L;
      class_2338 var10000 = class_2338.method_49638((class_2374)s8.f(var6).method_33571());
      Intrinsics.checkNotNullExpressionValue(var10000, true.t<invokedynamic>(8857, 2883853311312043459L ^ var2));
      class_2338 var13 = var10000;
      class_243 var14 = gn.Y.x(var10, (class_1657)s8.f(var6), 1);
      int var15 = (int)((float)Math.ceil((double)var1.F()));
      IntRange var16 = new IntRange(var13.method_10263() - var15, var13.method_10263() + var15);
      IntRange var17 = new IntRange(var13.method_10264() - var15, var13.method_10264() + var15);
      IntRange var18 = new IntRange(var13.method_10260() - var15, var13.method_10260() + var15);
      Iterable var19 = (Iterable)var16;
      boolean var20 = false;
      Collection var22 = (Collection)(new ArrayList());
      String[] var55 = -7694909424615465427L.A<invokedynamic>(-7694909424615465427L, var2);
      boolean var23 = false;
      String[] var12 = var55;
      Iterator var24 = var19.iterator();

      label74:
      while(true) {
         Iterator var56 = var24;

         Object var57;
         Collection var58;
         label71:
         while(true) {
            if (var56.hasNext()) {
               int var25 = ((IntIterator)var24).nextInt();
               int var26 = var25;
               boolean var27 = false;
               Iterable var28 = (Iterable)var17;
               boolean var29 = false;
               var57 = new ArrayList();
               if (var2 <= 0L) {
                  return (List)var57;
               }

               var58 = (Collection)var57;
               if (var12 != null) {
                  break;
               }

               Collection var31 = var58;
               boolean var32 = false;
               Iterator var33 = var28.iterator();

               while(var33.hasNext()) {
                  int var34 = ((IntIterator)var33).nextInt();
                  int var35 = var34;
                  boolean var36 = false;
                  Iterable var37 = (Iterable)var18;
                  boolean var38 = false;
                  Collection var40 = (Collection)(new ArrayList());
                  boolean var41 = false;
                  boolean var43 = false;
                  var56 = var37.iterator();
                  if (var12 != null) {
                     continue label71;
                  }

                  Iterator var44 = var56;

                  label63: {
                     while(var44.hasNext()) {
                        int var45 = ((IntIterator)var44).nextInt();
                        boolean var47 = false;
                        int var48 = var45;
                        boolean var49 = false;

                        label82: {
                           pk var59;
                           try {
                              if (var12 != null) {
                                 break label63;
                              }

                              var59 = X(var0, new class_2338(var26, var35, var48), var8, var14, var1, var4, var5);
                              if (var59 == null) {
                                 break label82;
                              }
                           } catch (NoSuchElementException var54) {
                              throw var54.A<invokedynamic>(var54, -7699261455749869337L, var2);
                           }

                           pk var50 = var59;
                           boolean var51 = false;
                           var40.add(var50);
                        }

                        if (var12 != null) {
                           break;
                        }
                     }

                     if (var2 > 0L) {
                     }
                  }

                  Iterable var52 = (Iterable)((List)var40);
                  CollectionsKt.addAll(var31, var52);
                  if (var12 != null) {
                     break;
                  }
               }

               Iterable var53 = (Iterable)((List)var31);
               CollectionsKt.addAll(var22, var53);
               if (var2 >= 0L && var12 == null) {
                  continue label74;
               }
            }

            var58 = var22;
            if (var2 > 0L) {
            }
            break;
         }

         var57 = (List)var58;
         return (List)var57;
      }
   }

   static List L(o6 var0, long var1, ej var3, boolean var4, boolean var5, int var6, Object var7) {
      var1 ^= a;
      long var8 = var1 ^ 9552558096023L;
      String[] var10 = 5112761728976326127L.A<invokedynamic>(5112761728976326127L, var1);

      int var10000;
      label37: {
         label36: {
            try {
               var10000 = var6 & 2;
               if (var10 != null) {
                  break label37;
               }

               if (var10000 == 0) {
                  break label36;
               }
            } catch (NoSuchElementException var12) {
               throw var12.A<invokedynamic>(var12, 5108391969894810405L, var1);
            }

            var4 = false;
         }

         var10000 = var6 & 4;
      }

      label27: {
         try {
            if (var10 != null) {
               break label27;
            }

            if (var10000 == 0) {
               return E(var0, var3, var8, var4, (boolean)var5);
            }
         } catch (NoSuchElementException var11) {
            throw var11.A<invokedynamic>(var11, 5108391969894810405L, var1);
         }

         var10000 = 0;
      }

      var5 = var10000;
      return E(var0, var3, var8, var4, (boolean)var5);
   }

   @Nullable
   public static final pk X(@NotNull o6 $this$getPlaceData, @NotNull class_2338 bp, long a, @NotNull class_243 predictedPlayerPos, @NotNull ej configState, boolean basePlace, boolean sponges) {
      // $FF: Couldn't be decompiled
   }

   public static pk I(o6 var0, class_2338 var1, class_243 var2, ej var3, boolean var4, boolean var5, int var6, long var7, Object var9) {
      var7 ^= a;
      long var10 = var7 ^ 2488421721649L;
      String[] var12 = 2795610885631438295L.A<invokedynamic>(2795610885631438295L, var7);

      int var10000;
      label37: {
         label36: {
            try {
               var10000 = var6 & true.v<invokedynamic>(19685, 3338449980071105991L ^ var7);
               if (var12 != null) {
                  break label37;
               }

               if (var10000 == 0) {
                  break label36;
               }
            } catch (NoSuchElementException var14) {
               throw var14.A<invokedynamic>(var14, 2800266535008445213L, var7);
            }

            var4 = false;
         }

         var10000 = var6 & true.v<invokedynamic>(6742, 8211069675462329201L ^ var7);
      }

      label27: {
         try {
            if (var12 != null) {
               break label27;
            }

            if (var10000 == 0) {
               return X(var0, var1, var10, var2, var3, var4, (boolean)var5);
            }
         } catch (NoSuchElementException var13) {
            throw var13.A<invokedynamic>(var13, 2800266535008445213L, var7);
         }

         var10000 = 0;
      }

      var5 = var10000;
      return X(var0, var1, var10, var2, var3, var4, (boolean)var5);
   }

   @Nullable
   public static final class_3965 j(@NotNull class_2338 bp, @NotNull ej configState, boolean basePlace, long a) {
      // $FF: Couldn't be decompiled
   }

   public static class_3965 N(class_2338 var0, long var1, ej var3, boolean var4, int var5, Object var6) {
      var1 ^= a;
      long var7 = var1 ^ 62236356593279L;
      String[] var9 = 1330578324755503468L.A<invokedynamic>(1330578324755503468L, var1);

      int var10000;
      label20: {
         try {
            var10000 = var5 & 4;
            if (var9 != null) {
               break label20;
            }

            if (var10000 == 0) {
               return j(var0, var3, (boolean)var4, var7);
            }
         } catch (NoSuchElementException var10) {
            throw var10.A<invokedynamic>(var10, 1326208065983453094L, var1);
         }

         var10000 = 0;
      }

      var4 = var10000;
      return j(var0, var3, (boolean)var4, var7);
   }

   private static final class_3965 s(long param0, class_2338 param2, ej param3) {
      // $FF: Couldn't be decompiled
   }

   private static final class_3965 I(long param0, class_2338 param2, char param3, ej param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean c(long param0, class_243 param2, class_2338 param3, class_243 param4, ej param5) {
      // $FF: Couldn't be decompiled
   }

   public static final boolean r(@NotNull o6 $this$isPositionBlockedByEntity, long a, @NotNull class_2338 base, boolean calcPhase, @NotNull ej configState) {
      // $FF: Couldn't be decompiled
   }

   public static final boolean P(int a, @NotNull class_2338 bp, int a, int a, @NotNull class_1657 target) {
      // $FF: Couldn't be decompiled
   }

   private static final Float e(class_2338 var0, class_243 var1) {
      long var2 = a ^ 116290011626729L;
      long var4 = var2 ^ 15572216277026L;
      return i4.v.y(new class_243((double)var0.method_10263() + var1.field_1352, (double)var0.method_10264() + var1.field_1351, (double)var0.method_10260() + var1.field_1350), var4);
   }

   private static final Float X(Function1 var0, Object var1) {
      return (Float)var0.invoke(var1);
   }

   static {
      long var20 = a ^ 18002577584166L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, -2483616655589433891L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[25];
      int var16 = 0;
      String var15 = "¿i\u0092¨\u0006é\u0017ÞU\u007fðãì\u0096ý\u007f(i\u0000\u0003,\u001eÄêæ\u00ad\u008f;},E\u0010Ô{\u008f\\\u0000\u0098¯Båqß§M}\u0007÷¬Ot!\u008f\u00adfB|\u0018s\u009e\u009e\u0006ÛÉÃ\u0081è\u008d¿%Ç`\u001a¤\u0084·ºì³\u0017*ï89ò®ÅG\u0010ÄÓè\n\u0017³\u0093ûyu5Wâ\u0095¬êÅ\u0000W\u0086Û¶¹\u0016\u0000I\u001a@ \n0j¿[].Q.é\n\u009d³P=\u0081¨VÎO\u008c(Ã)\u008daO\u007fB\u001a^.^Úà:(´\u001aË\u007föm\u009e\u0096c\u0004QQ¿Os¬\fàãÐ\u0098û\u0080ÒÔ \u001e\u0012P+³©\u000b\u0092óT2¿o×¾_n\u0080nVä5\u0003\u0017mYø+\u008eÜ\u0098f\u0018éÅv©¡ÉhR©T¦2\u0015d~`½\u0093¨\u0094p\rº\u0016 7=\u0015\u0018y;\u000f\u009bÍ5egm\u0082Ïy\u0081Óï.\u0016Ø~u\u001bªM?äJØ×\u00107w \u008ea´(\u001eÃ\u008d\u0097Eg%\u0096+\u0010×Jj¹T«\u0082\u0099êè²Ôc\u008bÉg PI?Õ\u0017\u008d|\u001fPçßñ]8  \u0086)\u009a>Í\u0003Ç5É>øêët`\u0090\u0018JZµÜ ñ¥\u0093tÛÅ²¢ü\u0001\u0085ÈØ Ú»\u0097 Õ\u0010\u001aaéûÅÔÜÄ\u0091²Æ°²f\"\\\u0018'¼X*<E '¤®Õ[Å\u0002\u001bt\\\u001b\u0007k\fÉ-ù(l\u0080HKP\u0005\u00188Ê\u0007«Ã¬#¬\u001f|æ^°%ÿ\u0012åg\u0018°\u001df\u008dÉÑ\u0015¼¥hôåf\u009d\u0010ë\u0084Õ\u0091mQÖ ¼Çquv\u0094:0\u0018`©¤¼ã\u000f0\u0002\u009f\u008eâ¬s\u0006?ûn\u0012^Òi<²b <ÙÌ¬'{zÚÕâ\u009a\u001dóºÄ«¯¯{\u0091¤u\u0003\u001cÄ¡O\u0085\u0085òL\u0001\u0010> Òù\bå\u0000¨fÎ\u0097Ø³\u001cPh\u0010ÛâP\u0087CñJk\u0084°}\u009a\u0010ì>Í\u0010\r\u0088Õ#1\u000eÏ@z5|?\u0080l\u0010|\u0010ûÔ[0}H2õf:\u009bå*Î\u009d(\u0010br\u0001ùÌ\u008al]ù½e9\u0083²^È";
      int var17 = "¿i\u0092¨\u0006é\u0017ÞU\u007fðãì\u0096ý\u007f(i\u0000\u0003,\u001eÄêæ\u00ad\u008f;},E\u0010Ô{\u008f\\\u0000\u0098¯Båqß§M}\u0007÷¬Ot!\u008f\u00adfB|\u0018s\u009e\u009e\u0006ÛÉÃ\u0081è\u008d¿%Ç`\u001a¤\u0084·ºì³\u0017*ï89ò®ÅG\u0010ÄÓè\n\u0017³\u0093ûyu5Wâ\u0095¬êÅ\u0000W\u0086Û¶¹\u0016\u0000I\u001a@ \n0j¿[].Q.é\n\u009d³P=\u0081¨VÎO\u008c(Ã)\u008daO\u007fB\u001a^.^Úà:(´\u001aË\u007föm\u009e\u0096c\u0004QQ¿Os¬\fàãÐ\u0098û\u0080ÒÔ \u001e\u0012P+³©\u000b\u0092óT2¿o×¾_n\u0080nVä5\u0003\u0017mYø+\u008eÜ\u0098f\u0018éÅv©¡ÉhR©T¦2\u0015d~`½\u0093¨\u0094p\rº\u0016 7=\u0015\u0018y;\u000f\u009bÍ5egm\u0082Ïy\u0081Óï.\u0016Ø~u\u001bªM?äJØ×\u00107w \u008ea´(\u001eÃ\u008d\u0097Eg%\u0096+\u0010×Jj¹T«\u0082\u0099êè²Ôc\u008bÉg PI?Õ\u0017\u008d|\u001fPçßñ]8  \u0086)\u009a>Í\u0003Ç5É>øêët`\u0090\u0018JZµÜ ñ¥\u0093tÛÅ²¢ü\u0001\u0085ÈØ Ú»\u0097 Õ\u0010\u001aaéûÅÔÜÄ\u0091²Æ°²f\"\\\u0018'¼X*<E '¤®Õ[Å\u0002\u001bt\\\u001b\u0007k\fÉ-ù(l\u0080HKP\u0005\u00188Ê\u0007«Ã¬#¬\u001f|æ^°%ÿ\u0012åg\u0018°\u001df\u008dÉÑ\u0015¼¥hôåf\u009d\u0010ë\u0084Õ\u0091mQÖ ¼Çquv\u0094:0\u0018`©¤¼ã\u000f0\u0002\u009f\u008eâ¬s\u0006?ûn\u0012^Òi<²b <ÙÌ¬'{zÚÕâ\u009a\u001dóºÄ«¯¯{\u0091¤u\u0003\u001cÄ¡O\u0085\u0085òL\u0001\u0010> Òù\bå\u0000¨fÎ\u0097Ø³\u001cPh\u0010ÛâP\u0087CñJk\u0084°}\u009a\u0010ì>Í\u0010\r\u0088Õ#1\u000eÏ@z5|?\u0080l\u0010|\u0010ûÔ[0}H2õf:\u009bå*Î\u009d(\u0010br\u0001ùÌ\u008al]ù½e9\u0083²^È".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var24 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var30 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var30;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[25];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[14];
                  int var3 = 0;
                  String var4 = "\u0083\u009e¨/©\u0019\u00ad\u008b]öO\u0007WA\u0086\u0092ö÷Q\u0018GÕÓ+L\u0003Ó5£q\u0005îÚ\u0094Ô°òâE\tëÇ\u008f\u009b<\u0016Èê\u0005\\\u0014(\u0083;¥¾Dí\u0003\u0006\t\u0083\u0083îvÛ á@^ú`\u0081+Í\u0087,ë\u0004JY¶QFy<i*ÖÒ^×V×u@";
                  int var5 = "\u0083\u009e¨/©\u0019\u00ad\u008b]öO\u0007WA\u0086\u0092ö÷Q\u0018GÕÓ+L\u0003Ó5£q\u0005îÚ\u0094Ô°òâE\tëÇ\u008f\u009b<\u0016Èê\u0005\\\u0014(\u0083;¥¾Dí\u0003\u0006\t\u0083\u0083îvÛ á@^ú`\u0081+Í\u0087,ë\u0004JY¶QFy<i*ÖÒ^×V×u@".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var28 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                     long[] var27 = var6;
                     var28 = var3++;
                     long var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var33 = -1;

                     while(true) {
                        long var8 = var32;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var35 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var33) {
                        case 0:
                           var27[var28] = var35;
                           if (var2 >= var5) {
                              e = var6;
                              g = new Integer[14];
                              Pair[] var22 = new Pair[true.v<invokedynamic>(20406, 5608068484327287858L ^ var20)];
                              var22[0] = TuplesKt.to(new class_243(0.5D, 1.0D, 0.5D), true);
                              var22[1] = TuplesKt.to(new class_243(0.5D, 0.0D, 0.5D), true);
                              var22[2] = TuplesKt.to(new class_243(0.5D, 0.5D, 0.0D), true);
                              var22[3] = TuplesKt.to(new class_243(0.5D, 0.5D, 1.0D), true);
                              var22[4] = TuplesKt.to(new class_243(0.0D, 0.5D, 0.5D), true);
                              var22[5] = TuplesKt.to(new class_243(1.0D, 0.5D, 0.5D), true);
                              var22[true.v<invokedynamic>(31545, 5697262869367265466L ^ var20)] = TuplesKt.to(new class_243(0.05D, 0.05D, 0.05D), false);
                              var22[true.v<invokedynamic>(10500, 8454967109456415375L ^ var20)] = TuplesKt.to(new class_243(0.05D, 0.05D, 0.95D), false);
                              var22[true.v<invokedynamic>(24137, 4836726672364944838L ^ var20)] = TuplesKt.to(new class_243(0.05D, 0.95D, 0.05D), false);
                              var22[true.v<invokedynamic>(22785, 8850371734445963912L ^ var20)] = TuplesKt.to(new class_243(0.05D, 0.95D, 0.95D), false);
                              var22[true.v<invokedynamic>(28330, 5292250669260180780L ^ var20)] = TuplesKt.to(new class_243(0.95D, 0.05D, 0.05D), false);
                              var22[true.v<invokedynamic>(4347, 807302784670397310L ^ var20)] = TuplesKt.to(new class_243(0.95D, 0.05D, 0.95D), false);
                              var22[true.v<invokedynamic>(30947, 8580487072569695081L ^ var20)] = TuplesKt.to(new class_243(0.95D, 0.95D, 0.05D), false);
                              var22[true.v<invokedynamic>(2835, 9218228897112483997L ^ var20)] = TuplesKt.to(new class_243(0.95D, 0.95D, 0.95D), false);
                              O = MapsKt.mapOf(var22);
                              class_243[] var23 = new class_243[true.v<invokedynamic>(27496, 1855147574351497444L ^ var20)];
                              var23[0] = new class_243(0.51D, 0.0D, 0.49D);
                              var23[1] = new class_243(0.05D, 0.0D, 0.05D);
                              var23[2] = new class_243(0.05D, 0.0D, 0.95D);
                              var23[3] = new class_243(0.95D, 0.0D, 0.05D);
                              var23[4] = new class_243(0.95D, 0.0D, 0.95D);
                              var23[5] = new class_243(0.475D, 0.0D, 0.95D);
                              var23[true.v<invokedynamic>(2278, 7718152224285125473L ^ var20)] = new class_243(0.475D, 0.0D, 0.05D);
                              var23[true.v<invokedynamic>(25713, 2696021703086934003L ^ var20)] = new class_243(0.95D, 0.0D, 0.025D);
                              var23[true.v<invokedynamic>(24137, 4836726672364944838L ^ var20)] = new class_243(0.05D, 0.0D, 0.475D);
                              z = CollectionsKt.listOf(var23);
                              return;
                           }
                           break;
                        default:
                           var27[var28] = var35;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "q\u0094&¥34\u00850µ¼\u009e(%>Ð×";
                           var5 = "q\u0094&¥34\u00850µ¼\u009e(%>Ð×".length();
                           var2 = 0;
                        }

                        var28 = var2;
                        var2 += 8;
                        var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        var27 = var6;
                        var28 = var3++;
                        var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var33 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var30;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u0093ÖæÃì2\u00ad\u0093\u001b8\u0081»÷xz\u0097zE¿\u00890¨)íæ22'§/>\n(Ð\u008bìÿ\\µ\u0096½²e?®´\u0017ÐB£\u009aÊÏ£?Ö\u0004<\u0016o/&¾éMù\u0086\u0099½Íé¦8";
               var17 = "\u0093ÖæÃì2\u00ad\u0093\u001b8\u0081»÷xz\u0097zE¿\u00890¨)íæ22'§/>\n(Ð\u008bìÿ\\µ\u0096½²e?®´\u0017ÐB£\u009aÊÏ£?Ö\u0004<\u0016o/&¾éMù\u0086\u0099½Íé¦8".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var24 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void K(String[] var0) {
      J = var0;
   }

   public static String[] t() {
      return J;
   }

   private static NoSuchElementException a(NoSuchElementException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11131;
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
            throw new RuntimeException("su/catlean/iy", var10);
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
         throw new RuntimeException("su/catlean/iy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16124;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/iy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/iy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
