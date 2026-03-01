package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class uc {
   @NotNull
   private final class_243 w;
   @NotNull
   private final aa A;
   private static final long a = j0.a(1553032666904543277L, 5095364284505924644L, MethodHandles.lookup().lookupClass()).a(152295800910237L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;
   private static final long f;

   public uc(@NotNull class_243 vec, long a, @NotNull aa animation) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(22305, 8085293050736271072L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.i<invokedynamic>(8356, 1629424777564432742L ^ var2));
      super();
      this.w = var1;
      this.A = var4;
   }

   // $FF: synthetic method
   public uc(class_243 var1, aa var2, int var3, long var4, DefaultConstructorMarker var6) {
      var4 ^= a;
      long var7 = var4 ^ 24388163888661L;
      long var10001 = var4 ^ 26203868295719L;
      int var9 = (int)((var4 ^ 26203868295719L) >>> 48);
      int var10 = (int)(var10001 << 16 >>> 48);
      int var11 = (int)(var10001 << 32 >>> 32);
      if ((var3 & 2) != 0) {
         var2 = new aa(sa.OUT_QUINT, f, (short)var9, (short)var10, var11);
      }

      this(var1, var7, var2);
   }

   @NotNull
   public final class_243 c() {
      return this.w;
   }

   @NotNull
   public final aa H() {
      return this.A;
   }

   @NotNull
   public final class_243 X() {
      return this.w;
   }

   @NotNull
   public final aa g() {
      return this.A;
   }

   @NotNull
   public final uc W(@NotNull class_243 vec, @NotNull aa animation, long a) {
      var3 ^= a;
      long var5 = var3 ^ 56491575058895L;
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(16159, 5226188711553403030L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(27773, 1631665099725528055L ^ var3));
      return new uc(var1, var5, var2);
   }

   // $FF: synthetic method
   public static uc u(uc var0, class_243 var1, aa var2, int var3, long var4, Object var6) {
      var4 ^= a;
      long var7 = var4 ^ 4294613832755L;
      k9[] var9 = -7815388444634232925L.A<invokedynamic>(-7815388444634232925L, var4);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var3 & 1;
               if (var9 != null) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var10) {
               throw var10.A<invokedynamic>(var10, -7812267650207473043L, var4);
            }

            var1 = var0.w;
         }

         var10000 = var3 & 2;
      }

      if (var10000 != 0) {
         var2 = var0.A;
      }

      return var0.W(var1, var2, var7);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 96493060016256L;
      class_243 var10000 = this.w;
      aa var10001 = this.A;
      String var10003 = true.i<invokedynamic>(10122, 529363688640274009L ^ var1);
      return var10003 + var10000 + true.i<invokedynamic>(17925, 8656870801541611479L ^ var1) + var10001 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 109308420591944L;
      int var3 = this.w.hashCode();
      var3 = var3 * (int)e + this.A.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var10 = a ^ 72837077356506L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var10 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var19 = new String[6];
      int var17 = 0;
      String var16 = "\u0099Â¦E¶\t3mdó«ÞJ\u0097\u0095\u0093\r2>ÑO\"RC\u0010\u0012Ì!JÉ\u009fÏ\u0085\u00ad\u0005\u0090\u0083]ìtò\u0018Ù¦f]¼ÿ\u008dk\u0013ï#\u0091¦ê´ç\u008b\u009f;\t\u0019\u008bËô\u0010é\\X$Î^ghDZÒMgþY)";
      int var18 = "\u0099Â¦E¶\t3mdó«ÞJ\u0097\u0095\u0093\r2>ÑO\"RC\u0010\u0012Ì!JÉ\u009fÏ\u0085\u00ad\u0005\u0090\u0083]ìtò\u0018Ù¦f]¼ÿ\u008dk\u0013ï#\u0091¦ê´ç\u008b\u009f;\t\u0019\u008bËô\u0010é\\X$Î^ghDZÒMgþY)".length();
      char var15 = 24;
      int var14 = -1;

      label49:
      while(true) {
         ++var14;
         String var21 = var16.substring(var14, var14 + var15);
         byte var10001 = -1;

         while(true) {
            byte[] var20 = var12.doFinal(var21.getBytes("ISO-8859-1"));
            String var26 = a(var20).intern();
            switch(var10001) {
            case 0:
               var19[var17++] = var26;
               if ((var14 += var15) >= var18) {
                  b = var19;
                  c = new String[6];
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var10 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var7 = 3236565167422697463L;
                  byte[] var9 = var5.doFinal(new byte[]{(byte)((int)(var7 >>> 56)), (byte)((int)(var7 >>> 48)), (byte)((int)(var7 >>> 40)), (byte)((int)(var7 >>> 32)), (byte)((int)(var7 >>> 24)), (byte)((int)(var7 >>> 16)), (byte)((int)(var7 >>> 8)), (byte)((int)var7)});
                  long var28 = ((long)var9[0] & 255L) << 56 | ((long)var9[1] & 255L) << 48 | ((long)var9[2] & 255L) << 40 | ((long)var9[3] & 255L) << 32 | ((long)var9[4] & 255L) << 24 | ((long)var9[5] & 255L) << 16 | ((long)var9[6] & 255L) << 8 | (long)var9[7] & 255L;
                  boolean var24 = true;
                  e = var28;
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var10 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var10 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 2747292310991637384L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  var28 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  var24 = true;
                  f = var28;
                  return;
               }

               var15 = var16.charAt(var14);
               break;
            default:
               var19[var17++] = var26;
               if ((var14 += var15) < var18) {
                  var15 = var16.charAt(var14);
                  continue label49;
               }

               var16 = "µÃ¨\u0096-ç\u009d_ßj9KÄyÓÎ\u0006Z\u0003v1\fã7;\u001bE\u0099=\u0010\u000f) \u0001Â+ûG\u000egW&È3ø\u0015°Á9\u0085-ëø\u0017Õw&Û;¤Ä\u0081Þ{g";
               var18 = "µÃ¨\u0096-ç\u009d_ßj9KÄyÓÎ\u0006Z\u0003v1\fã7;\u001bE\u0099=\u0010\u000f) \u0001Â+ûG\u000egW&È3ø\u0015°Á9\u0085-ëø\u0017Õw&Û;¤Ä\u0081Þ{g".length();
               var15 = ' ';
               var14 = -1;
            }

            ++var14;
            var21 = var16.substring(var14, var14 + var15);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11987;
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
            throw new RuntimeException("su/catlean/uc", var10);
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
         throw new RuntimeException("su/catlean/uc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
