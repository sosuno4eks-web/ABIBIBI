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
import kotlin.math.MathKt;
import net.minecraft.class_124;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class d1 {
   @NotNull
   private final class_1657 P;
   @NotNull
   private final aa a;
   private boolean j;
   private static final long b = j0.a(4573243428787491907L, 7359242991246735017L, MethodHandles.lookup().lookupClass()).a(3489862514662L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;
   private static final long i;

   public d1(@NotNull class_1657 entity, long a, @NotNull aa animation, boolean removing) {
      var2 ^= b;
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(22451, 8757459074135449393L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.i<invokedynamic>(30274, 1411349223395917514L ^ var2));
      super();
      this.P = var1;
      this.a = var4;
      this.j = var5;
   }

   // $FF: synthetic method
   public d1(class_1657 var1, aa var2, boolean var3, int var4, DefaultConstructorMarker var5, long var6) {
      var6 ^= b;
      long var10001 = var6 ^ 99091570998198L;
      int var8 = (int)((var6 ^ 99091570998198L) >>> 48);
      int var9 = (int)(var10001 << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      long var11 = var6 ^ 125412892135795L;
      if ((var4 & 2) != 0) {
         var2 = new aa(sa.OUT_QUINT, i, (short)var8, (short)var9, var10);
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      this(var1, var11, var2, var3);
   }

   @NotNull
   public final class_1657 Q() {
      return this.P;
   }

   @NotNull
   public final aa k() {
      return this.a;
   }

   public final boolean b() {
      return this.j;
   }

   public final void f(boolean <set-?>) {
      this.j = var1;
   }

   @NotNull
   public final String N(int var1, long var2) {
      long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ b;
      long var6 = var4 ^ 134721744672532L;
      long var8 = var4 ^ 115488670173231L;
      long var10001 = var4 ^ 82683986870329L;
      int var10 = (int)((var4 ^ 82683986870329L) >>> 32);
      int var11 = (int)(var10001 << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);

      class_124 var10000;
      label17: {
         try {
            if (u8.F(var10, (short)var11, this.P, var12)) {
               var10000 = class_124.field_1060;
               break label17;
            }
         } catch (NumberFormatException var18) {
            throw var18.A<invokedynamic>(var18, 1442225636745235870L, var4);
         }

         var10000 = class_124.field_1068;
      }

      String var19 = this.P.method_7334().name();
      class_124 var10002 = class_124.field_1070;
      int var10003 = MathKt.roundToInt(this.P.method_6032() + this.P.method_6067());
      int var10004 = MathKt.roundToInt(s8.f(var6).method_5739((class_1297)this.P));
      int var13 = vi.o.X(this.P, var8);
      int var14 = var10004;
      int var15 = var10003;
      class_124 var16 = var10002;
      String var17 = var19;
      return var10000 + var17 + var16 + true.i<invokedynamic>(12997, 7501114189539046421L ^ var4) + var15 + true.i<invokedynamic>(3348, 2621705950096739265L ^ var4) + var14 + true.i<invokedynamic>(29353, 7741781953578120308L ^ var4) + var13 + true.i<invokedynamic>(16742, 5336457016203347893L ^ var4);
   }

   @NotNull
   public final class_1657 l() {
      return this.P;
   }

   @NotNull
   public final aa i() {
      return this.a;
   }

   public final boolean L() {
      return this.j;
   }

   @NotNull
   public final d1 b(long a, @NotNull class_1657 entity, @NotNull aa animation, boolean removing) {
      var1 ^= b;
      long var6 = var1 ^ 74157210533043L;
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(19727, 5833645533934494750L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.i<invokedynamic>(26502, 3184503301695213210L ^ var1));
      return new d1(var3, var6, var4, var5);
   }

   // $FF: synthetic method
   public static d1 r(d1 param0, class_1657 param1, aa param2, boolean param3, int param4, long param5, Object param7) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 70910907436650L;
      boolean var3 = this.j;
      aa var4 = this.a;
      class_1657 var5 = this.P;
      String var10000 = 10198.i<invokedynamic>(10198, 3664597469261375326L ^ var1);
      return var10000 + var5 + true.i<invokedynamic>(12615, 439747993711456718L ^ var1) + var4 + true.i<invokedynamic>(7389, 2142020825491709011L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = b ^ 113063409961849L;
      int var3 = this.P.hashCode();
      var3 = var3 * true.u<invokedynamic>(32247, 6224599939053409773L ^ var1) + this.a.hashCode();
      var3 = var3 * true.u<invokedynamic>(11384, 3699565335924966499L ^ var1) + Boolean.hashCode(this.j);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var16 = b ^ 108611118649429L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[11];
      int var23 = 0;
      String var22 = "\u0095\u0097d¼e\u0097¸+T\u0003Y5æ\u001aK\u0086üRÂÄw>\".G¶¢Ðâ¾¦\u009bn\u0080I_s'\u0012Z gu;Ûß£\u001d[\u0098\u009døBð¼QÀwN²#Ç+é'\u009b¡Ëúå±\u009ey\u0010Vßo\u0099T\u009bº\u0088\u0000òÛÙ=Åc\b\u0010ö\u001dÏû/Û¨ÁÓa@9hMêv\u0010·ílòò¦\nµKëôö\u008c\u0002\u0014½\u0018ü ¤_}\u00057\u0019Úò\u0084x\u0002ó\u001dú2 4>\u0011\u008fzº Æ\u0097ÍáZ<¨FÔ\u0010ç#Ý\u0083&gJÒ#îq²ìÜÌ+A2Ò\u0090¥-\u0010M\u008eI`õûÒ\bÝ»\u007f\u008e\u009bäÌ\u0012\u0010l\rüyhî:U\u009c¥ïZRß,\u0084";
      int var24 = "\u0095\u0097d¼e\u0097¸+T\u0003Y5æ\u001aK\u0086üRÂÄw>\".G¶¢Ðâ¾¦\u009bn\u0080I_s'\u0012Z gu;Ûß£\u001d[\u0098\u009døBð¼QÀwN²#Ç+é'\u009b¡Ëúå±\u009ey\u0010Vßo\u0099T\u009bº\u0088\u0000òÛÙ=Åc\b\u0010ö\u001dÏû/Û¨ÁÓa@9hMêv\u0010·ílòò¦\nµKëôö\u008c\u0002\u0014½\u0018ü ¤_}\u00057\u0019Úò\u0084x\u0002ó\u001dú2 4>\u0011\u008fzº Æ\u0097ÍáZ<¨FÔ\u0010ç#Ý\u0083&gJÒ#îq²ìÜÌ+A2Ò\u0090¥-\u0010M\u008eI`õûÒ\bÝ»\u007f\u008e\u009bäÌ\u0012\u0010l\rüyhî:U\u009c¥ïZRß,\u0084".length();
      char var21 = '(';
      int var20 = -1;

      label56:
      while(true) {
         ++var20;
         String var27 = var22.substring(var20, var20 + var21);
         byte var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var27.getBytes("ISO-8859-1"));
            String var32 = a(var26).intern();
            switch(var10001) {
            case 0:
               var25[var23++] = var32;
               if ((var20 += var21) >= var24) {
                  c = var25;
                  d = new String[11];
                  h = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[2];
                  int var8 = 0;
                  String var9 = "IÁïr8øå\u0012Q+ÀcÌ\u0085\u009dæ";
                  int var10 = "IÁïr8øå\u0012Q+ÀcÌ\u0085\u009dæ".length();
                  int var7 = 0;

                  do {
                     int var30 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var30, var7).getBytes("ISO-8859-1");
                     var30 = var8++;
                     long var13 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                     long var10004 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                     boolean var35 = true;
                     var11[var30] = var10004;
                  } while(var7 < var10);

                  f = var11;
                  g = new Integer[2];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 542205851570089987L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var33 = true;
                  i = var36;
                  return;
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var32;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label56;
               }

               var22 = "\u0090Æö}\u0096ÑÐ;ók}!\u0096X£ß\u001e\f\u0018¯®\ro·\u0010\u0089\u000b\u0014ó³ª{èÜ\u0080\u0088\n[ÁÚz";
               var24 = "\u0090Æö}\u0096ÑÐ;ók}!\u0096X£ß\u001e\f\u0018¯®\ro·\u0010\u0089\u000b\u0014ó³ª{èÜ\u0080\u0088\n[ÁÚz".length();
               var21 = 24;
               var20 = -1;
            }

            ++var20;
            var27 = var22.substring(var20, var20 + var21);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21449;
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
            throw new RuntimeException("su/catlean/d1", var10);
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
         throw new RuntimeException("su/catlean/d1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32328;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/d1", var14);
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
         throw new RuntimeException("su/catlean/d1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
