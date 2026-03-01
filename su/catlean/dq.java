package su.catlean;

import java.io.File;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class dq extends dh {
   @NotNull
   private final vp P;
   @NotNull
   private final File k;
   public ru h;
   public List d;
   private static int[] F;
   private static final long b = j0.a(7973320206331187229L, 8869485646769119807L, MethodHandles.lookup().lookupClass()).a(217844280394803L);
   private static final String[] e;
   private static final String[] g;
   private static final Map j;
   private static final long[] o;
   private static final Integer[] p;
   private static final Map q;

   public dq(@NotNull Json json, long a, @NotNull vp sharedSource) {
      var2 ^= b;
      long var10001 = var2 ^ 104077071704423L;
      int var5 = (int)((var2 ^ 104077071704423L) >>> 32);
      int var6 = (int)(var10001 << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, true.w<invokedynamic>(20779, 1600569858141205821L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.w<invokedynamic>(13212, 7984809493730842508L ^ var2));
      super(var5, (char)var6, var1, (char)var7);
      this.P = var4;
      this.k = new File(kf.e(), true.w<invokedynamic>(24664, 4982465709152273483L ^ var2));
   }

   @NotNull
   public File K() {
      return this.k;
   }

   @NotNull
   public final ru a(long var1) {
      var1 ^= b;

      try {
         ru var10000 = this.h;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var3) {
         throw var3.A<invokedynamic>(var3, -3411147201528732283L, var1);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.w<invokedynamic>(23101, 3051873162274805835L ^ var1));
      return null;
   }

   public final void p(byte a, @NotNull ru <set-?>, long a) {
      long var5 = ((long)var1 << 56 | var3 << 8 >>> 8) ^ b;
      Intrinsics.checkNotNullParameter(var2, true.w<invokedynamic>(27638, 4487099846231170619L ^ var5));
      this.h = var2;
   }

   @NotNull
   public final List h(long var1) {
      var1 ^= b;

      try {
         List var10000 = this.d;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var3) {
         throw var3.A<invokedynamic>(var3, -8490951342026539258L, var1);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.w<invokedynamic>(18309, 4547092903821893491L ^ var1));
      return null;
   }

   public final void G(@NotNull List <set-?>, long a) {
      var2 ^= b;
      Intrinsics.checkNotNullParameter(var1, true.w<invokedynamic>(10415, 3751157043879736837L ^ var2));
      this.d = var1;
   }

   public void N(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void i(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final void t(@NotNull List widgets, @NotNull String id, long a) {
      var3 ^= b;
      long var5 = var3 ^ 134880984871627L;
      long var7 = var3 ^ 54224382674567L;
      long var9 = var3 ^ 25638261715530L;
      long var11 = var3 ^ 62045772090435L;
      long var10001 = var3 ^ 7840668987522L;
      int var13 = (int)((var3 ^ 7840668987522L) >>> 48);
      int var14 = (int)(var10001 << 16 >>> 48);
      int var15 = (int)(var10001 << 32 >>> 32);
      boolean var10000 = -2003183439023193052L.A<invokedynamic>(-2003183439023193052L, var3);
      Intrinsics.checkNotNullParameter(var1, true.w<invokedynamic>(20337, 5221197906045974767L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.w<invokedynamic>(28885, 2988204119556851528L ^ var3));
      Iterable var19 = (Iterable)this.h(var5);
      boolean var20 = false;
      boolean var16 = var10000;
      Iterator var21 = var19.iterator();

      Object var43;
      label82:
      while(true) {
         if (!var21.hasNext()) {
            var43 = null;
            break;
         }

         var43 = var21.next();

         while(true) {
            Object var22 = var43;
            var43 = var22;

            while(true) {
               ru var23 = (ru)var43;
               boolean var24 = false;
               if (!Intrinsics.areEqual((Object)var23.X(), (Object)var2)) {
                  continue label82;
               }

               var43 = var22;
               if (var3 <= 0L) {
                  break;
               }

               if (var16) {
                  break label82;
               }
            }
         }
      }

      ru var44;
      try {
         var44 = (ru)var43;
         if (var3 > 0L && var44 == null) {
            var44 = new ru(var2, (List)null, 2, var11, (DefaultConstructorMarker)null);
         }
      } catch (NumberFormatException var42) {
         throw var42.A<invokedynamic>(var42, -1924346986473795481L, var3);
      }

      ru var17 = var44;
      Iterable var18 = (Iterable)var1;
      boolean var45 = false;
      Collection var47 = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(var18, true.u<invokedynamic>(19303, 6998968439655789677L ^ var3))));
      boolean var48 = false;
      Iterator var49 = var18.iterator();

      label61:
      while(true) {
         var10000 = var49.hasNext();

         while(var10000) {
            Object var50 = var49.next();
            nm var25 = (nm)var50;
            boolean var26 = false;
            String var46 = var25.h();
            Iterable var27 = (Iterable)var25.B();
            String var28 = var46;
            boolean var29 = false;
            Iterable var30 = var27;
            Collection var31 = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(var27, true.u<invokedynamic>(19303, 6998968439655789677L ^ var3))));
            boolean var32 = false;
            var10000 = var16;

            label55:
            while(true) {
               if (!var10000) {
                  return;
               }

               Iterator var33 = var30.iterator();

               while(true) {
                  if (!var33.hasNext()) {
                     break label55;
                  }

                  Object var34 = var33.next();
                  zf var35 = (zf)var34;
                  boolean var37 = false;
                  var31.add(new x6(var35.M(), var9, var35.toString()));
                  if (!var16) {
                     continue label61;
                  }

                  var10000 = var16;
                  if (var3 < 0L) {
                     break;
                  }

                  if (!var16) {
                     break label55;
                  }
               }
            }

            List var40 = (List)var31;
            var47.add(new bj((char)var13, var28, var40, (short)var14, var15));
            var10000 = var16;
            if (var3 >= 0L) {
               if (var16) {
                  continue label61;
               }
               break;
            }
         }

         var17.X((List)var47, var7);
         this.h(var5).removeIf(dq::l);
         this.h(var5).add(var17);
         if (var3 >= 0L) {
         }
         break;
      }

   }

   private static final boolean Y(String var0, ru var1) {
      long var2 = b ^ 10547139849243L;
      Intrinsics.checkNotNullParameter(var1, true.w<invokedynamic>(11128, 5730117484586027254L ^ var2));
      return Intrinsics.areEqual((Object)var1.X(), (Object)var0);
   }

   private static final boolean l(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   public static void U(int[] var0) {
      F = var0;
   }

   public static int[] U() {
      return F;
   }

   static {
      long var20 = b ^ 107331680425253L;
      j = new HashMap(13);
      null.A<invokedynamic>((Object)null, -8545232796569855650L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[13];
      int var16 = 0;
      String var15 = "\u009e\u008eó\u0010\u0001êÐ\u0081Ø¸\u001fæ\u0003\u0000Uëp*jÆ1\u0080ìX©)_±ÇâÂJ\u0010gF®\u0085y\u00866\u001f\u0097oÌM·¢½Y\u0010Ü\u0003Ó@¸O\u000fl9Ù\u0001°\u000ba5®\u0010ræÿ»ó¦·\u0092Ø\u001f¶m§\u008e\u001aÎ\u0010´\u0081¢Fgù\ræ\u0094Z\u0001\u001d§sÝý\u0010w¹\bH\u001f\u008dÇÚ\u0094`Û\u0002\u0002¥¹ã\u0010\u0091ÀXÈy\u0014íþæ¸ÉÙ)Àéj\u0010é\"P\u0003koÇ÷\u0081\u0010þ\u0000á)\u0016\u0091\u0010ÂS\u009c\rFÄ÷íî\u00146\u001eò*þþ` £Ëâõ4=pâ\u0011a\u0013\u0093qa\t«.3bL¦¸\n8\\½6áï\u0098C5\u001d>õjjQ\u0090\u0019¤çå\u00183 x8ó\u000eï®uØ@O\u008eÍÜ)Lj(°\u0015\u0000µè5\u0017\u0083[\u0087\u0018Û§\u0005}Ôé+f3áÁå£½N\u008cÞ\u008e\u0088ç\u0005\u0010\n\u0013GüÔ@$5\u008d\u0096¥+D\u0081\u00ad\u001b";
      int var17 = "\u009e\u008eó\u0010\u0001êÐ\u0081Ø¸\u001fæ\u0003\u0000Uëp*jÆ1\u0080ìX©)_±ÇâÂJ\u0010gF®\u0085y\u00866\u001f\u0097oÌM·¢½Y\u0010Ü\u0003Ó@¸O\u000fl9Ù\u0001°\u000ba5®\u0010ræÿ»ó¦·\u0092Ø\u001f¶m§\u008e\u001aÎ\u0010´\u0081¢Fgù\ræ\u0094Z\u0001\u001d§sÝý\u0010w¹\bH\u001f\u008dÇÚ\u0094`Û\u0002\u0002¥¹ã\u0010\u0091ÀXÈy\u0014íþæ¸ÉÙ)Àéj\u0010é\"P\u0003koÇ÷\u0081\u0010þ\u0000á)\u0016\u0091\u0010ÂS\u009c\rFÄ÷íî\u00146\u001eò*þþ` £Ëâõ4=pâ\u0011a\u0013\u0093qa\t«.3bL¦¸\n8\\½6áï\u0098C5\u001d>õjjQ\u0090\u0019¤çå\u00183 x8ó\u000eï®uØ@O\u008eÍÜ)Lj(°\u0015\u0000µè5\u0017\u0083[\u0087\u0018Û§\u0005}Ôé+f3áÁå£½N\u008cÞ\u008e\u0088ç\u0005\u0010\n\u0013GüÔ@$5\u008d\u0096¥+D\u0081\u00ad\u001b".length();
      char var14 = ' ';
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
                  e = var18;
                  g = new String[13];
                  q = new HashMap(13);
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
                  String var4 = "»\u0001[Å¿\u001dûñ\u001chÀâ¦\u009eð§";
                  int var5 = "»\u0001[Å¿\u001dûñ\u001chÀâ¦\u009eð§".length();
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

                  o = var6;
                  p = new Integer[2];
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

               var15 = "\u009cq\u0012:\u007ffµ[÷Ð]ä\"JËÚ\u0010\u001aÛÏ${\u0093)\u001b«\rÒït\u0099dq";
               var17 = "\u009cq\u0012:\u007ffµ[÷Ð]ä\"JËÚ\u0010\u001aÛÏ${\u0093)\u001b«\rÒït\u0099dq".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4667;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/dq", var10);
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
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("su/catlean/dq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23215;
      if (p[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = o[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/dq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
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
         throw new RuntimeException("su/catlean/dq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
