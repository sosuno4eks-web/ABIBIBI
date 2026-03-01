package su.catlean;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1299;
import net.minecraft.class_332;
import net.minecraft.class_7922;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;

public final class z3 extends zd {
   @NotNull
   private final zf i;
   private static final long c = j0.a(-2602608850233322056L, 4785740707672239061L, MethodHandles.lookup().lookupClass()).a(6052063077680L);
   private static final String[] h;
   private static final String[] r;
   private static final Map s = new HashMap(13);

   public z3(@NotNull zf setting, long a) {
      var2 ^= c;
      long var4 = var2 ^ 104754973702216L;
      Intrinsics.checkNotNullParameter(var1, true.k<invokedynamic>(3171, 7240865092500563254L ^ var2));
      super(true.k<invokedynamic>(22979, 7526550545616171156L ^ var2), var4);
      this.i = var1;
   }

   @NotNull
   public final zf N() {
      return this.i;
   }

   @NotNull
   protected List t(long var1) {
      class_7922 var10000 = class_7923.field_41177;
      Intrinsics.checkNotNullExpressionValue(var10000, true.k<invokedynamic>(18432, 284335711801306044L ^ var1));
      return CollectionsKt.toList((Iterable)var10000);
   }

   @NotNull
   protected String W(@NotNull class_1299 item, long a) {
      var2 ^= c;
      Intrinsics.checkNotNullParameter(var1, true.k<invokedynamic>(26166, 5796328555623679747L ^ var2));
      String var10000 = var1.method_5897().getString();
      Intrinsics.checkNotNullExpressionValue(var10000, true.k<invokedynamic>(9204, 2402675208142013120L ^ var2));
      return var10000;
   }

   protected boolean F(@NotNull class_1299 item, long a) {
      var2 ^= c;
      Intrinsics.checkNotNullParameter(var1, true.k<invokedynamic>(2022, 9086396456724645049L ^ var2));
      return ((vh)this.i.B()).L().contains(var1);
   }

   public void S(@NotNull class_332 context, float x, long a, float y, @NotNull class_1299 entity) {
      // $FF: Couldn't be decompiled
   }

   protected void D(int a, @NotNull class_1299 item, int a, byte a) {
      // $FF: Couldn't be decompiled
   }

   public String Z(Object item, long a) {
      long var4 = var2 ^ 129939110336773L;
      return this.W((class_1299)var1, var4);
   }

   public boolean d(long a, Object item) {
      long var4 = var1 ^ 17226282189856L;
      return this.F((class_1299)var3, var4);
   }

   public void h(class_332 context, float x, float y, Object component, long a) {
      long var7 = var5 ^ 63733418037188L;
      this.S(var1, var2, var7, var3, (class_1299)var4);
   }

   public void C(int a, short a, Object item, int a) {
      long var5 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var10001 = var5 ^ 18636310635697L;
      int var7 = (int)((var5 ^ 18636310635697L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 40);
      int var9 = (int)(var10001 << 56 >>> 56);
      this.D(var7, (class_1299)var3, var8, (byte)var9);
   }

   static {
      long var0 = c ^ 42643270353986L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "Àé1.¨sK\u00ad\u001f\u0017î«½ìU \u0010Á\u0081=\u0019,ÌÛ\u001cýS \u0000¨Öc\u0004 ,ã\u0013örÄ\u009dò\u00adL°\u008fìÈØo_¶\u0018>`..¨K \u001a2\u0094Ðz*\u0010v+Çbàª6\u0086ø\u009b0X\u009dÔáÐ\u0018(¡ËS³\u0015\u0095N\u0091gA ½:\u0007BÁ\u0013Aêvydª\u0010>w\u0015 Þ\u0005S!ÉØÂ\u0087ÒÇqo";
      int var8 = "Àé1.¨sK\u00ad\u001f\u0017î«½ìU \u0010Á\u0081=\u0019,ÌÛ\u001cýS \u0000¨Öc\u0004 ,ã\u0013örÄ\u009dò\u00adL°\u008fìÈØo_¶\u0018>`..¨K \u001a2\u0094Ðz*\u0010v+Çbàª6\u0086ø\u009b0X\u009dÔáÐ\u0018(¡ËS³\u0015\u0095N\u0091gA ½:\u0007BÁ\u0013Aêvydª\u0010>w\u0015 Þ\u0005S!ÉØÂ\u0087ÒÇqo".length();
      char var5 = 16;
      int var4 = -1;

      label27:
      while(true) {
         ++var4;
         String var11 = var6.substring(var4, var4 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = c(var10).intern();
            switch(var10001) {
            case 0:
               var9[var7++] = var15;
               if ((var4 += var5) >= var8) {
                  h = var9;
                  r = new String[8];
                  return;
               }

               var5 = var6.charAt(var4);
               break;
            default:
               var9[var7++] = var15;
               if ((var4 += var5) < var8) {
                  var5 = var6.charAt(var4);
                  continue label27;
               }

               var6 = "=DèïácuH>ë[-ë\u0012D$\u0018\u0006\u001aísÑDÂ?\u0083â¹õ\u0017»Cm\u0010s(f\u007fPl°";
               var8 = "=DèïácuH>ë[-ë\u0012D$\u0018\u0006\u001aísÑDÂ?\u0083â¹õ\u0017»Cm\u0010s(f\u007fPl°".length();
               var5 = 16;
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException b(NumberFormatException var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6642;
      if (r[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])s.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               s.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/z3", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = h[var5].getBytes("ISO-8859-1");
         r[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return r[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/z3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
