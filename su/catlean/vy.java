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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_591;
import org.jetbrains.annotations.NotNull;

public final class vy {
   @NotNull
   private class_2960 W;
   @NotNull
   private class_591 t;
   @NotNull
   private ht O;
   private double l;
   private double X;
   private double k;
   private double v;
   private double Q;
   private double y;
   private double s;
   private double Y;
   private double z;
   private double I;
   private double a;
   private double f;
   private double j;
   private double q;
   private double A;
   private int G;
   private double o;
   private double D;
   private double g;
   private static final long b = j0.a(165098434877933448L, 7152636577219273932L, MethodHandles.lookup().lookupClass()).a(224653431305426L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] h;
   private static final Integer[] i;
   private static final Map m;

   public vy(@NotNull class_2960 texture, @NotNull class_591 model, @NotNull ht part, double x, double y, double z, long a) {
      var10 ^= b;
      Intrinsics.checkNotNullParameter(var1, true.o<invokedynamic>(25563, 7733617717314209979L ^ var10));
      Intrinsics.checkNotNullParameter(var2, true.o<invokedynamic>(6333, 8158372381948490719L ^ var10));
      Intrinsics.checkNotNullParameter(var3, true.o<invokedynamic>(32355, 5028628144809858313L ^ var10));
      super();
      this.W = var1;
      this.t = var2;
      this.O = var3;
      this.l = var4;
      this.X = var6;
      this.k = var8;
      this.v = this.I();
      this.Q = this.I();
      this.y = this.I();
      this.s = this.r() * 5.0D;
      this.Y = this.r() * 5.0D;
      this.z = this.r() * 5.0D;
      this.I = this.s;
      this.a = this.Y;
      this.f = this.z;
      this.j = this.r();
      this.q = this.r();
      this.A = this.r();
      this.o = this.l;
      this.D = this.X;
      this.g = this.k;
   }

   @NotNull
   public final class_2960 b() {
      return this.W;
   }

   public final void u(long a, @NotNull class_2960 <set-?>) {
      var1 ^= b;
      Intrinsics.checkNotNullParameter(var3, true.o<invokedynamic>(22349, 2841587610188311595L ^ var1));
      this.W = var3;
   }

   @NotNull
   public final class_591 q() {
      return this.t;
   }

   public final void g(@NotNull class_591 <set-?>, long a) {
      var2 ^= b;
      Intrinsics.checkNotNullParameter(var1, true.o<invokedynamic>(22349, 2841587611648915303L ^ var2));
      this.t = var1;
   }

   @NotNull
   public final ht T() {
      return this.O;
   }

   public final void X(@NotNull ht <set-?>, long a) {
      var2 ^= b;
      Intrinsics.checkNotNullParameter(var1, true.o<invokedynamic>(26878, 8200781675449685121L ^ var2));
      this.O = var1;
   }

   public final double G() {
      return this.l;
   }

   public final void C(double <set-?>) {
      this.l = var1;
   }

   public final double w() {
      return this.X;
   }

   public final void a(double <set-?>) {
      this.X = var1;
   }

   public final double x() {
      return this.k;
   }

   public final void Z(double <set-?>) {
      this.k = var1;
   }

   public final double I() {
      return Math.random() * 0.3D - 0.15D;
   }

   public final double r() {
      return Math.random() * 5.0D - 2.5D;
   }

   public final double z() {
      return this.v;
   }

   public final void B(double <set-?>) {
      this.v = var1;
   }

   public final double P() {
      return this.Q;
   }

   public final void X(double <set-?>) {
      this.Q = var1;
   }

   public final double K() {
      return this.y;
   }

   public final void e(double <set-?>) {
      this.y = var1;
   }

   public final double D() {
      return this.s;
   }

   public final void E(double <set-?>) {
      this.s = var1;
   }

   public final double e() {
      return this.Y;
   }

   public final void p(double <set-?>) {
      this.Y = var1;
   }

   public final double t() {
      return this.z;
   }

   public final void K(double <set-?>) {
      this.z = var1;
   }

   public final double y() {
      return this.I;
   }

   public final void q(double <set-?>) {
      this.I = var1;
   }

   public final double h() {
      return this.a;
   }

   public final void v(double <set-?>) {
      this.a = var1;
   }

   public final double m() {
      return this.f;
   }

   public final void R(double <set-?>) {
      this.f = var1;
   }

   public final double Z() {
      return this.j;
   }

   public final void M(double <set-?>) {
      this.j = var1;
   }

   public final double k() {
      return this.q;
   }

   public final void c(double <set-?>) {
      this.q = var1;
   }

   public final double Q() {
      return this.A;
   }

   public final void N(double <set-?>) {
      this.A = var1;
   }

   public final int R() {
      return this.G;
   }

   public final void K(int <set-?>) {
      this.G = var1;
   }

   public final double Y() {
      return this.o;
   }

   public final void o(double <set-?>) {
      this.o = var1;
   }

   public final double A() {
      return this.D;
   }

   public final void y(double <set-?>) {
      this.D = var1;
   }

   public final double M() {
      return this.g;
   }

   public final void Q(double <set-?>) {
      this.g = var1;
   }

   public final boolean s(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final void F(long a, @NotNull class_4587 stack) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = b ^ 118632086829807L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[15];
      int var18 = 0;
      String var17 = "\u0013~¬ü÷ý,\u0011WCÁÀ¢Á\u0010A(Þ¡\u009b\u0081:\u0096cXØî\u0001\u0012Ýs\u009cí/äSw\u0018â\u008d÷IDO8\u0001\u0085Ñß\u0093´©¶Æ\u009c\u0003\u000f\u0010v\u0013FO<:4K\u008eÎ\u0085]|èmÎ\u0010M\u0016\u0080j\u0095\"0\u0094BîË\u0099¦öËæ8\u0086(\u008ahð\u0093U\u008anxå\u0019qB\u0015o\u0083\u001cöÛãäb\u0082B¸²²¿øÛ8nD\u0007\u0014\u001eÌÃ'Å6\u0005NGíSU\\Ì¢ÍFãQË(\u0096\u001be3\fp\u009a0g9jÊ\u007fô\u000f\u009a`WÀÓ\t\u008e21>Q6\u0004~½\u001b\u001c\u009f¶\u0012J\\ôØ~\u0018l\u009añf÷,ý\nMN\u009d\u0090Uë\u0094{/4\u0011V5x\u0003ü\u0018®Ô¨~:Ü\u0082\u0012Þ¤\u007fx3KH\u0081@.\u0096¾\u0018\u0083®! Ë,ÇÕ¶óé\u0090\u001a\u009dÚöPm³IÌ\u0095ùeÃ£\u0097¡M#I{\u0001×òç\u0010?¡\u0001ÄeÑ\u0080\u009f_©\u0013\u0006Öx\\\u0019(6Ú.vgj\u009d½ö±cº\u0095\u008clK©R?\u0005ªE\"Kù\u00107ÃOµh¾µ\u0083\u009dý\u0098Ý\u001c!\u0010²¯òÞAD\u008a^üIÃèáø\u008c,(\t\u000eÁÍ \u008djº\u000b>\u0096>\u0015t¦P\u0004üWQ*CR\u0089¶\u0094\u009c\u000f]ómÈ\u000eQ«Âý\u0090\u0004 ";
      int var19 = "\u0013~¬ü÷ý,\u0011WCÁÀ¢Á\u0010A(Þ¡\u009b\u0081:\u0096cXØî\u0001\u0012Ýs\u009cí/äSw\u0018â\u008d÷IDO8\u0001\u0085Ñß\u0093´©¶Æ\u009c\u0003\u000f\u0010v\u0013FO<:4K\u008eÎ\u0085]|èmÎ\u0010M\u0016\u0080j\u0095\"0\u0094BîË\u0099¦öËæ8\u0086(\u008ahð\u0093U\u008anxå\u0019qB\u0015o\u0083\u001cöÛãäb\u0082B¸²²¿øÛ8nD\u0007\u0014\u001eÌÃ'Å6\u0005NGíSU\\Ì¢ÍFãQË(\u0096\u001be3\fp\u009a0g9jÊ\u007fô\u000f\u009a`WÀÓ\t\u008e21>Q6\u0004~½\u001b\u001c\u009f¶\u0012J\\ôØ~\u0018l\u009añf÷,ý\nMN\u009d\u0090Uë\u0094{/4\u0011V5x\u0003ü\u0018®Ô¨~:Ü\u0082\u0012Þ¤\u007fx3KH\u0081@.\u0096¾\u0018\u0083®! Ë,ÇÕ¶óé\u0090\u001a\u009dÚöPm³IÌ\u0095ùeÃ£\u0097¡M#I{\u0001×òç\u0010?¡\u0001ÄeÑ\u0080\u009f_©\u0013\u0006Öx\\\u0019(6Ú.vgj\u009d½ö±cº\u0095\u008clK©R?\u0005ªE\"Kù\u00107ÃOµh¾µ\u0083\u009dý\u0098Ý\u001c!\u0010²¯òÞAD\u008a^üIÃèáø\u008c,(\t\u000eÁÍ \u008djº\u000b>\u0096>\u0015t¦P\u0004üWQ*CR\u0089¶\u0094\u009c\u000f]ómÈ\u000eQ«Âý\u0090\u0004 ".length();
      char var16 = 16;
      int var15 = -1;

      label54:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var28;
               if ((var15 += var16) >= var19) {
                  c = var20;
                  d = new String[15];
                  m = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "JM\\|D\u0088¶\u001aÁ\u0097¢Ø\u001b¢s¦";
                  int var5 = "JM\\|D\u0088¶\u001aÁ\u0097¢Ø\u001b¢s¦".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var26 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     long[] var25 = var6;
                     var26 = var3++;
                     long var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var31 = -1;

                     while(true) {
                        long var8 = var30;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var33 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var31) {
                        case 0:
                           var25[var26] = var33;
                           if (var2 >= var5) {
                              h = var6;
                              i = new Integer[4];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "/ï,\u0000El8e\u0001 \u0080Á|§í·";
                           var5 = "/ï,\u0000El8e\u0001 \u0080Á|§í·".length();
                           var2 = 0;
                        }

                        var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        var25 = var6;
                        var26 = var3++;
                        var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var31 = 0;
                     }
                  }
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var28;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label54;
               }

               var17 = "-ão÷\"¢ÁÍ+ôZ¼í0ÒÖ\u00104þVrø°Iü\u0081#Í\u008dY0;\f";
               var19 = "-ão÷\"¢ÁÍ+ôZ¼í0ÒÖ\u00104þVrø°Iü\u0081#Í\u008dY0;\f".length();
               var16 = 16;
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 12928;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/vy", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = c[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("su/catlean/vy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1934;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = h[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/vy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
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
         throw new RuntimeException("su/catlean/vy" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
