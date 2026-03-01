package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

public final class ro {
   @NotNull
   private static final ih Z;
   @NotNull
   private static final ih x;
   @NotNull
   private static final ih n;
   @NotNull
   private static final ih t;

   @NotNull
   public static final ih w() {
      return Z;
   }

   @NotNull
   public static final ih Z() {
      return x;
   }

   @NotNull
   public static final ih X() {
      return n;
   }

   @NotNull
   public static final ih u() {
      return t;
   }

   static {
      long var9 = j0.a(7886132952299917250L, 282907018678060598L, MethodHandles.lookup().lookupClass()).a(231283777902113L) ^ 64309936609633L;
      long var11 = var9 ^ 100647578417037L;
      Cipher var1;
      Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var2 = 1; var2 < 8; ++var2) {
         var10003[var2] = (byte)((int)(var9 << var2 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var0 = new String[4];
      int var6 = 0;
      String var5 = "¨U;\\\u0018\u0084 +\b&Ø\u0006\u0087ÆIvü";
      int var7 = "¨U;\\\u0018\u0084 +\b&Ø\u0006\u0087ÆIvü".length();
      char var4 = '\b';
      int var3 = -1;

      label28:
      while(true) {
         ++var3;
         String var14 = var5.substring(var3, var3 + var4);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var1.doFinal(var14.getBytes("ISO-8859-1"));
            String var18 = a(var8).intern();
            switch(var10001) {
            case 0:
               var0[var6++] = var18;
               if ((var3 += var4) >= var7) {
                  var18 = var0[1];
                  p5[] var13 = new p5[]{pa.Q(), pa.w(), pa.N()};
                  Z = new ih(var18, (List)CollectionsKt.arrayListOf(var13), var11);
                  var18 = var0[2];
                  var13 = new p5[]{pa.E(), pa.c()};
                  x = new ih(var18, (List)CollectionsKt.arrayListOf(var13), var11);
                  var18 = var0[0];
                  var13 = new p5[]{pa.g(), pa.W()};
                  n = new ih(var18, (List)CollectionsKt.arrayListOf(var13), var11);
                  var18 = var0[3];
                  var13 = new p5[]{pa.m(), pa.b(), pa.e(), pa.V()};
                  t = new ih(var18, (List)CollectionsKt.arrayListOf(var13), var11);
                  return;
               }

               var4 = var5.charAt(var3);
               break;
            default:
               var0[var6++] = var18;
               if ((var3 += var4) < var7) {
                  var4 = var5.charAt(var3);
                  continue label28;
               }

               var5 = "êE+\u0017[å\u0095[DâJ\u0019\u009eï÷\\\b\u0012i\u001f\u0006lÓÆJ";
               var7 = "êE+\u0017[å\u0095[DâJ\u0019\u009eï÷\\\b\u0012i\u001f\u0006lÓÆJ".length();
               var4 = 16;
               var3 = -1;
            }

            ++var3;
            var14 = var5.substring(var3, var3 + var4);
            var10001 = 0;
         }
      }
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
}
