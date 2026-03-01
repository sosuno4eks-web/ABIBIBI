package su.catlean;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class d7 extends dh {
   @NotNull
   private final vp u;
   @NotNull
   private final File v;
   public List x;
   public mm R;
   private static final long b = j0.a(8552608121350729826L, 8713183864378722183L, MethodHandles.lookup().lookupClass()).a(92591315171358L);
   private static final String[] d;
   private static final String[] e;
   private static final Map g = new HashMap(13);
   private static final long h;

   public d7(long a, @NotNull Json json, @NotNull vp sharedSource) {
      var1 ^= b;
      long var10001 = var1 ^ 85424153643142L;
      int var5 = (int)((var1 ^ 85424153643142L) >>> 32);
      int var6 = (int)(var10001 << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var3, true.l<invokedynamic>(10006, 5512261286805929611L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.l<invokedynamic>(24071, 5626034940427634590L ^ var1));
      super(var5, (char)var6, var3, (char)var7);
      this.u = var4;
      this.v = new File(kf.e(), true.l<invokedynamic>(19457, 5187022119633655194L ^ var1));
   }

   @NotNull
   public File K() {
      return this.v;
   }

   @NotNull
   public final List I(long param1, short param3) {
      // $FF: Couldn't be decompiled
   }

   public final void t(long a, @NotNull List <set-?>) {
      var1 ^= b;
      Intrinsics.checkNotNullParameter(var3, true.l<invokedynamic>(23008, 3013822652361572975L ^ var1));
      this.x = var3;
   }

   @NotNull
   public final mm E(long var1) {
      var1 ^= b;

      try {
         mm var10000 = this.R;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var3) {
         throw var3.A<invokedynamic>(var3, -7541287513176601578L, var1);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.l<invokedynamic>(474, 4406045939471389173L ^ var1));
      return null;
   }

   public final void v(long a, @NotNull mm <set-?>) {
      var1 ^= b;
      Intrinsics.checkNotNullParameter(var3, true.l<invokedynamic>(11070, 6225867300026661430L ^ var1));
      this.R = var3;
   }

   public void N(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void i(long param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var5 = b ^ 73360864957930L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[10];
      int var12 = 0;
      String var11 = "ð\u008dL2òM®íe×úx »\u008b¸l\u0017t,Hr\u0001xs±\u0006\u0082ã'N\u007f\u0010\u00adGîÙý^©Q©\u001a°\u000f_@\u0094\u0086\u0010¼\t@Þ\u0015eÆÓ\u0015}8·ùFz}\u0010*Pmø\u0019XJÌSÑP6Vu\u0000ú\u0010\u001cÚ^¹¤×J.Ý±ÄA\u0082/\u008bÐ\u0010\u0006J=ºq¤\u0015)ôe<Rk\u0011çÃ\u0010\u0002IG¹/¬æ\u0000\u001cºsÁVUÃ¶XOÜ±\réx\u000f\u001a=:ËÚG\u0087å#øà=Ò\u0085aÞ\u00819\u0086^M£¿©Ñf¡\u0091ï\u0088\u009b»Ãä\u0003iÒñ\u0091\u0089Ó®>!Zì\u001778\u0006ö\u000e2\u0089ÃEÑ\u0012½9Y\u0092r£Ú>\u008c\u001dzqºÕ\u0083Pó¢\u0083À?\u0094@";
      int var13 = "ð\u008dL2òM®íe×úx »\u008b¸l\u0017t,Hr\u0001xs±\u0006\u0082ã'N\u007f\u0010\u00adGîÙý^©Q©\u001a°\u000f_@\u0094\u0086\u0010¼\t@Þ\u0015eÆÓ\u0015}8·ùFz}\u0010*Pmø\u0019XJÌSÑP6Vu\u0000ú\u0010\u001cÚ^¹¤×J.Ý±ÄA\u0082/\u008bÐ\u0010\u0006J=ºq¤\u0015)ôe<Rk\u0011çÃ\u0010\u0002IG¹/¬æ\u0000\u001cºsÁVUÃ¶XOÜ±\réx\u000f\u001a=:ËÚG\u0087å#øà=Ò\u0085aÞ\u00819\u0086^M£¿©Ñf¡\u0091ï\u0088\u009b»Ãä\u0003iÒñ\u0091\u0089Ó®>!Zì\u001778\u0006ö\u000e2\u0089ÃEÑ\u0012½9Y\u0092r£Ú>\u008c\u001dzqºÕ\u0083Pó¢\u0083À?\u0094@".length();
      char var10 = ' ';
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var16 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = b(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var21;
               if ((var9 += var10) >= var13) {
                  d = var14;
                  e = new String[10];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -34718472835460284L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  h = var23;
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var21;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "m\u008bO¾pï\u001e4\u008eL\u001f@\u0019\u0015dÎ\u0010§>¶ (¾Wvð¦÷¦Lª?8";
               var13 = "m\u008bO¾pï\u001e4\u008eL\u001f@\u0019\u0015dÎ\u0010§>¶ (¾Wvð¦÷¦Lª?8".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1619;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/d7", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/d7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
