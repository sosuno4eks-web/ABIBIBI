package su.catlean;

import java.awt.Color;
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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;

public final class n2 extends nm {
   @NotNull
   public static final n2 K;
   @Nullable
   private static class_2338 Z;
   private static boolean n;
   private static final long c = j0.a(-3827556088729607861L, 6530360308113623128L, MethodHandles.lookup().lookupClass()).a(84310615620088L);
   private static final String[] d;
   private static final String[] e;
   private static final Map i;

   private n2(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 106450586433881L;
      super(true.t<invokedynamic>(15827, 7440494215670304843L ^ var1), var3);
   }

   @Nullable
   public final class_2338 g() {
      return Z;
   }

   public final void a(@Nullable class_2338 <set-?>) {
      Z = var1;
   }

   public final boolean x() {
      return n;
   }

   public final void l(boolean <set-?>) {
      n = var1;
   }

   public void k(@NotNull class_332 context, long a) {
      long var4 = var2 ^ 40368169918069L;
      long var6 = var2 ^ 47036540829465L;
      long var8 = var2 ^ 74152426005948L;
      long var10 = var2 ^ 96742491579843L;
      long var12 = var2 ^ 13315936160300L;
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(24960, 7510380925715787482L ^ var2));
      float var14 = 50.0F;

      try {
         if (Z == null) {
            return;
         }
      } catch (NumberFormatException var27) {
         throw var27.A<invokedynamic>(var27, -1856890276361741076L, var2);
      }

      double var15 = gk.E.u(s8.f(var8).field_6014, s8.f(var8).method_23317(), gk.E.h(var12));
      double var17 = gk.E.u(s8.f(var8).field_5969, s8.f(var8).method_23321(), gk.E.h(var12));
      class_2338 var10000 = Z;
      Intrinsics.checkNotNull(var10000);
      float var19 = (float)var10000.method_10263() + 0.5F;
      var10000 = Z;
      Intrinsics.checkNotNull(var10000);
      float var20 = (float)var10000.method_10260() + 0.5F;
      float var21 = ((float)var15 - var19 + 0.2F) * var14;
      float var22 = ((float)var17 - var20 + 0.2F) * var14;
      var1.method_51448().pushMatrix();
      var1.method_51448().rotateAbout((float)Math.toRadians((double)(-s8.f(var8).method_36454()) + 180.0D), this.Q(var6) + var14 * 0.5F, this.b(var4) + var14 * 0.5F);
      float var23 = this.Q(var6) + var21;
      float var24 = this.b(var4) + var22;

      Color var28;
      label22: {
         try {
            if (!n) {
               var28 = z8.I.M();
               break label22;
            }
         } catch (NumberFormatException var26) {
            throw var26.A<invokedynamic>(var26, -1856890276361741076L, var2);
         }

         var28 = Color.RED;
      }

      Color var25 = var28;
      gk.E.s(var1.method_51448(), this.Q(var6), this.b(var4), var10, var14, var14, z8.I.M());
      gk var29 = gk.E;
      Matrix3x2fStack var10001 = var1.method_51448();
      float var10005 = var14 * 0.6F;
      float var10006 = var14 * 0.6F;
      Intrinsics.checkNotNull(var25);
      var29.s(var10001, var23, var24, var10, var10005, var10006, var25);
      var1.method_51448().popMatrix();
      this.Z(var14, var14);
   }

   public void Y(long param1, char param3) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var9 = c ^ 133233571710554L;
      long var11 = var9 ^ 28603315503919L;
      i = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[5];
      int var5 = 0;
      String var4 = "N\"\u0097\u0080_A\u0088]M9fò\u0007\u0085@\u0083¾Ë\u0097ææ\u00adçþ\u0010\u001fW¸Cïì\u0084·z\u0005Ã\u0083ò\u0090Ö\f(_\u008d¨\u00ad\u0091³n´i\u0092\b%Ùýib\u0094ÜÉY\u0089Î³.¶\u0088Ï\u001e\u001f\fmy:Ö¹ÇÌ¸n¦";
      int var6 = "N\"\u0097\u0080_A\u0088]M9fò\u0007\u0085@\u0083¾Ë\u0097ææ\u00adçþ\u0010\u001fW¸Cïì\u0084·z\u0005Ã\u0083ò\u0090Ö\f(_\u008d¨\u00ad\u0091³n´i\u0092\b%Ùýib\u0094ÜÉY\u0089Î³.¶\u0088Ï\u001e\u001f\fmy:Ö¹ÇÌ¸n¦".length();
      char var3 = 24;
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var13 = var4.substring(var2, var2 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var17 = b(var8).intern();
            switch(var10001) {
            case 0:
               var7[var5++] = var17;
               if ((var2 += var3) >= var6) {
                  d = var7;
                  e = new String[5];
                  K = new n2(var11);
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var17;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "õ¦³àià\u0005\u000e\u0095þ\u0014ñ\u009c\"4È\u0014Þz.\u0098Çâì\u0018\u0017mÐ|=j\u0094\u0086\u00100Á¨ÉS6\u0097ò\u001f¢0,¡Û\u0002";
               var6 = "õ¦³àià\u0005\u000e\u0095þ\u0014ñ\u009c\"4È\u0014Þz.\u0098Çâì\u0018\u0017mÐ|=j\u0094\u0086\u00100Á¨ÉS6\u0097ò\u001f¢0,¡Û\u0002".length();
               var3 = 24;
               var2 = -1;
            }

            ++var2;
            var13 = var4.substring(var2, var2 + var3);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10477;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/n2", var10);
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
         throw new RuntimeException("su/catlean/n2" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
