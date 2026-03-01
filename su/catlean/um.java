package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_3532;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class um {
   @NotNull
   public static final um c;
   @NotNull
   private static final Map e;
   @NotNull
   private static final Map S;
   private static int t;
   private static final long a = j0.a(6594362670540169901L, 6860150524703305072L, MethodHandles.lookup().lookupClass()).a(120466975180595L);
   private static final String[] b;
   private static final String[] d;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;
   private static final long j;

   private um() {
   }

   @Flow(
      priority = 10
   )
   private final void O(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow(
      priority = 10
   )
   private final void i(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public final int s(@NotNull class_1657 entity, long a, short a) {
      long var5 = (var2 << 16 | (long)var4 << 48 >>> 48) ^ a;
      long var10001 = var5 ^ 89815996269152L;
      int var7 = (int)((var5 ^ 89815996269152L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, true.e<invokedynamic>(30507, 3594130801498862841L ^ var5));
      String var11 = var1.method_5477().getString();
      Intrinsics.checkNotNullExpressionValue(var11, true.e<invokedynamic>(16070, 4237882470939852051L ^ var5));
      String var10 = var11;
      return this.J(var7, var10, (short)var8, (char)var9);
   }

   public final int J(int a, @NotNull String name, short a, char a) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final class_1657 i(float range, long a, @NotNull rw targetBy, boolean ignoreNaked, boolean ignoreCreative) {
      // $FF: Couldn't be decompiled
   }

   public static class_1657 q(um var0, float var1, rw var2, boolean var3, boolean var4, int var5, Object var6, long var7) {
      var7 ^= a;
      long var9 = var7 ^ 140424767272372L;
      k9[] var11 = 3733495987418321413L.A<invokedynamic>(3733495987418321413L, var7);

      int var10000;
      label37: {
         label36: {
            try {
               var10000 = var5 & 4;
               if (var11 == null) {
                  break label37;
               }

               if (var10000 == 0) {
                  break label36;
               }
            } catch (NoWhenBranchMatchedException var13) {
               throw var13.A<invokedynamic>(var13, 3630539547123555589L, var7);
            }

            var3 = false;
         }

         var10000 = var5 & true.c<invokedynamic>(10249, 7286988930741890928L ^ var7);
      }

      label27: {
         try {
            if (var11 == null) {
               break label27;
            }

            if (var10000 == 0) {
               return var0.i(var1, var9, var2, var3, (boolean)var4);
            }
         } catch (NoWhenBranchMatchedException var12) {
            throw var12.A<invokedynamic>(var12, 3630539547123555589L, var7);
         }

         var10000 = 0;
      }

      var4 = var10000;
      return var0.i(var1, var9, var2, var3, (boolean)var4);
   }

   private final List c(float param1, boolean param2, boolean param3, long param4) {
      // $FF: Couldn't be decompiled
   }

   static List S(um var0, float var1, boolean var2, boolean var3, int var4, Object var5, long var6) {
      var6 ^= a;
      long var8 = var6 ^ 60434870371128L;
      k9[] var10 = -2418398815613501531L.A<invokedynamic>(-2418398815613501531L, var6);

      int var10000;
      label37: {
         label36: {
            try {
               var10000 = var4 & 2;
               if (var10 == null) {
                  break label37;
               }

               if (var10000 == 0) {
                  break label36;
               }
            } catch (NoWhenBranchMatchedException var12) {
               throw var12.A<invokedynamic>(var12, -2323204583917784923L, var6);
            }

            var2 = false;
         }

         var10000 = var4 & 4;
      }

      label27: {
         try {
            if (var10 == null) {
               break label27;
            }

            if (var10000 == 0) {
               return var0.c(var1, var2, (boolean)var3, var8);
            }
         } catch (NoWhenBranchMatchedException var11) {
            throw var11.A<invokedynamic>(var11, -2323204583917784923L, var6);
         }

         var10000 = 0;
      }

      var3 = var10000;
      return var0.c(var1, var2, (boolean)var3, var8);
   }

   @Nullable
   public final class_1657 D(float range, int a, boolean ignoreNaked, boolean ignoreCreative, int a, byte a) {
      // $FF: Couldn't be decompiled
   }

   public static class_1657 O(long var0, um var2, float var3, boolean var4, boolean var5, int var6, Object var7) {
      var0 ^= a;
      long var10001 = var0 ^ 124364653373319L;
      int var8 = (int)((var0 ^ 124364653373319L) >>> 32);
      int var9 = (int)(var10001 << 32 >>> 40);
      int var10 = (int)(var10001 << 56 >>> 56);
      k9[] var11 = 3635346387889181606L.A<invokedynamic>(3635346387889181606L, var0);

      int var10000;
      label37: {
         label36: {
            try {
               var10000 = var6 & 2;
               if (var11 == null) {
                  break label37;
               }

               if (var10000 == 0) {
                  break label36;
               }
            } catch (NoWhenBranchMatchedException var13) {
               throw var13.A<invokedynamic>(var13, 3729287174148234406L, var0);
            }

            var4 = false;
         }

         var10000 = var6 & 4;
      }

      label27: {
         try {
            if (var11 == null) {
               break label27;
            }

            if (var10000 == 0) {
               return var2.D(var3, var8, var4, (boolean)var5, var9, (byte)var10);
            }
         } catch (NoWhenBranchMatchedException var12) {
            throw var12.A<invokedynamic>(var12, 3729287174148234406L, var0);
         }

         var10000 = 0;
      }

      var5 = var10000;
      return var2.D(var3, var8, var4, (boolean)var5, var9, (byte)var10);
   }

   @Nullable
   public final class_1657 f(float range, boolean ignoreNaked, boolean ignoreCreative, long a) {
      // $FF: Couldn't be decompiled
   }

   public static class_1657 v(short var0, int var1, um var2, char var3, float var4, boolean var5, boolean var6, int var7, Object var8) {
      long var9 = ((long)var0 << 48 | (long)var1 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var11 = var9 ^ 136964253377980L;
      k9[] var13 = -587988211392801278L.A<invokedynamic>(-587988211392801278L, var9);

      int var10000;
      label37: {
         label36: {
            try {
               var10000 = var7 & 2;
               if (var13 == null) {
                  break label37;
               }

               if (var10000 == 0) {
                  break label36;
               }
            } catch (NoWhenBranchMatchedException var15) {
               throw var15.A<invokedynamic>(var15, -692070568803673854L, var9);
            }

            var5 = false;
         }

         var10000 = var7 & 4;
      }

      label27: {
         try {
            if (var13 == null) {
               break label27;
            }

            if (var10000 == 0) {
               return var2.f(var4, var5, (boolean)var6, var11);
            }
         } catch (NoWhenBranchMatchedException var14) {
            throw var14.A<invokedynamic>(var14, -692070568803673854L, var9);
         }

         var10000 = 0;
      }

      var6 = var10000;
      return var2.f(var4, var5, (boolean)var6, var11);
   }

   @Nullable
   public final class_1657 H(float range, boolean ignoreNaked, long a, boolean ignoreCreative) {
      // $FF: Couldn't be decompiled
   }

   public static class_1657 i(um var0, float var1, boolean var2, boolean var3, long var4, int var6, Object var7) {
      var4 ^= a;
      long var8 = var4 ^ 10485497102372L;
      k9[] var10 = 4661075606756139386L.A<invokedynamic>(4661075606756139386L, var4);

      int var10000;
      label37: {
         label36: {
            try {
               var10000 = var6 & 2;
               if (var10 == null) {
                  break label37;
               }

               if (var10000 == 0) {
                  break label36;
               }
            } catch (NoWhenBranchMatchedException var12) {
               throw var12.A<invokedynamic>(var12, 4691969316228492922L, var4);
            }

            var2 = false;
         }

         var10000 = var6 & 4;
      }

      label27: {
         try {
            if (var10 == null) {
               break label27;
            }

            if (var10000 == 0) {
               return var0.H(var1, var2, var8, (boolean)var3);
            }
         } catch (NoWhenBranchMatchedException var11) {
            throw var11.A<invokedynamic>(var11, 4691969316228492922L, var4);
         }

         var10000 = 0;
      }

      var3 = var10000;
      return var0.H(var1, var2, var8, (boolean)var3);
   }

   @Nullable
   public final class_1657 a(float range, float fov, long a) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final class_1657 l(long a, float range, @NotNull rw targetBy, @NotNull Function1 predicate) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final class_1657 j(float range, @NotNull Function1 predicate, long a) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final class_1657 R(float range, long a, @NotNull Function1 predicate) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final class_1657 H(long a, float range, @NotNull Function1 predicate) {
      // $FF: Couldn't be decompiled
   }

   private final float O(int var1, int var2, int var3, class_1309 var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 120399675577637L;
      return Math.abs((float)class_3532.method_15338(Math.toDegrees(Math.atan2(var4.method_23321() - s8.f(var7).method_23321(), var4.method_23317() - s8.f(var7).method_23317())) - 90.0D) - class_3532.method_15393(s8.f(var7).method_36454()));
   }

   static {
      long var25 = a ^ 22427978579630L;
      f = new HashMap(13);
      63.A<invokedynamic>(63, -5497348619773808082L, var25);
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var17 = 1; var17 < 8; ++var17) {
         var10003[var17] = (byte)((int)(var25 << var17 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[10];
      int var21 = 0;
      String var20 = "\u0006´DÆ\u0086\u008c\u0080k]\u0081³êÊ\u0018¿SH§¯SÂÿ\u0018Í/P¬ùÖ\t\u0097:\u0010«ýZ\u0018W\u0094\u001eáE\u008dU·\u009c\u0000\u008aÃ ¸H¸\u0013*¿G0\u000b${7Á(¬\u001f|IØ=bùYV©\u0091Ø?öA\u0012Ã\u0018,\u0089òÒ~N,É_¦\t\u009dì¨\u0003rl¶:ûxf¾m\u0018\u008dÉÚ17&\u0015\u009eu\u00adñË\u0019ï\u008d<\u0018üå\u008c·\u0011dN\u0018$ÙO\u0093lu\u008e\u0080Ø\u001fZ\u001a«Y|q%*7O÷1D\u0089\u0018ùf(\u0082¤\\PËý(\u0002 B\t\u008bæÑ\u009c\rR>º%¡ rO«¼\u0003ÔP£\u0000>9\u00ad.æ¦S¾õ*¿/\b¥ëú\b{áÆz¡}";
      int var22 = "\u0006´DÆ\u0086\u008c\u0080k]\u0081³êÊ\u0018¿SH§¯SÂÿ\u0018Í/P¬ùÖ\t\u0097:\u0010«ýZ\u0018W\u0094\u001eáE\u008dU·\u009c\u0000\u008aÃ ¸H¸\u0013*¿G0\u000b${7Á(¬\u001f|IØ=bùYV©\u0091Ø?öA\u0012Ã\u0018,\u0089òÒ~N,É_¦\t\u009dì¨\u0003rl¶:ûxf¾m\u0018\u008dÉÚ17&\u0015\u009eu\u00adñË\u0019ï\u008d<\u0018üå\u008c·\u0011dN\u0018$ÙO\u0093lu\u008e\u0080Ø\u001fZ\u001a«Y|q%*7O÷1D\u0089\u0018ùf(\u0082¤\\PËý(\u0002 B\t\u008bæÑ\u009c\rR>º%¡ rO«¼\u0003ÔP£\u0000>9\u00ad.æ¦S¾õ*¿/\b¥ëú\b{áÆz¡}".length();
      char var19 = ' ';
      int var18 = -1;

      label64:
      while(true) {
         ++var18;
         String var27 = var20.substring(var18, var18 + var19);
         byte var10001 = -1;

         while(true) {
            byte[] var24 = var16.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = a(var24).intern();
            switch(var10001) {
            case 0:
               var23[var21++] = var33;
               if ((var18 += var19) >= var22) {
                  b = var23;
                  d = new String[10];
                  i = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var25 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[4];
                  int var8 = 0;
                  String var9 = "Ë\u0095¾¡YÜ\n!E£\u00047P5Sv";
                  int var10 = "Ë\u0095¾¡YÜ\n!E£\u00047P5Sv".length();
                  int var7 = 0;

                  label46:
                  while(true) {
                     int var31 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                     long[] var30 = var11;
                     var31 = var8++;
                     long var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte var37 = -1;

                     while(true) {
                        long var13 = var36;
                        byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                        long var39 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                        switch(var37) {
                        case 0:
                           var30[var31] = var39;
                           if (var7 >= var10) {
                              g = var11;
                              h = new Integer[4];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var25 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = -6725646888268372521L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var34 = true;
                              j = var36;
                              c = new um();
                              e = (Map)(new LinkedHashMap());
                              S = (Map)(new LinkedHashMap());
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var39;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "C²\bå´\u0000\u0090øR`¿¨Z\u001eu/";
                           var10 = "C²\bå´\u0000\u0090øR`¿¨Z\u001eu/".length();
                           var7 = 0;
                        }

                        var31 = var7;
                        var7 += 8;
                        var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                        var30 = var11;
                        var31 = var8++;
                        var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        var37 = 0;
                     }
                  }
               }

               var19 = var20.charAt(var18);
               break;
            default:
               var23[var21++] = var33;
               if ((var18 += var19) < var22) {
                  var19 = var20.charAt(var18);
                  continue label64;
               }

               var20 = ".¿(ã8YpÞô\nGÒÚ°\u000b¡NñE\u0010\u001cm\u0006\u008d:ãÑãû\u0082V\u0081 ·qqË3\u008eÇ¬\rí\u0017\u0094úâQpªIoYiÖ)gd\nJIq\u0013©\u001f";
               var22 = ".¿(ã8YpÞô\nGÒÚ°\u000b¡NñE\u0010\u001cm\u0006\u008d:ãÑãû\u0082V\u0081 ·qqË3\u008eÇ¬\rí\u0017\u0094úâQpªIoYiÖ)gd\nJIq\u0013©\u001f".length();
               var19 = ' ';
               var18 = -1;
            }

            ++var18;
            var27 = var20.substring(var18, var18 + var19);
            var10001 = 0;
         }
      }
   }

   public static void l(int var0) {
      t = var0;
   }

   public static int q() {
      return t;
   }

   public static int M() {
      int var0 = q();

      try {
         return var0 == 0 ? 113 : 0;
      } catch (NoWhenBranchMatchedException var1) {
         throw a(var1);
      }
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30460;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/um", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/um" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29787;
      if (h[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
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
            throw new RuntimeException("su/catlean/um", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("su/catlean/um" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
