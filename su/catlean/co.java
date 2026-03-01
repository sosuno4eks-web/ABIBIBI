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
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class co extends cq {
   @NotNull
   public static final co P;
   // $FF: synthetic field
   static final KProperty[] W;
   @NotNull
   private static final ReadWriteProperty Z;
   @NotNull
   private static final ReadWriteProperty z;
   @NotNull
   private static final ReadWriteProperty C;
   @NotNull
   private static final ReadWriteProperty u;
   @NotNull
   private static final ReadWriteProperty a;
   @NotNull
   private static final ReadWriteProperty M;
   @NotNull
   private static final ReadWriteProperty h;
   private static String[] r;
   private static final long c = j0.a(-4900378176314234166L, 1603113914968400610L, MethodHandles.lookup().lookupClass()).a(241798545951945L);
   private static final long[] s;
   private static final Integer[] t;
   private static final Map v;

   private co(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 91870709292457L;
      super(var3);
   }

   @Nullable
   public final Long O() {
      return (Long)Z.getValue(this, W[0]);
   }

   public final void k(@Nullable Long <set-?>) {
      Z.setValue(this, W[0], var1);
   }

   @Nullable
   public final String l() {
      return (String)z.getValue(this, W[1]);
   }

   public final void L(@Nullable String <set-?>) {
      z.setValue(this, W[1], var1);
   }

   @Nullable
   public final String v() {
      return (String)C.getValue(this, W[2]);
   }

   public final void P(@Nullable String <set-?>) {
      C.setValue(this, W[2], var1);
   }

   @Nullable
   public final Pair z() {
      return (Pair)u.getValue(this, W[3]);
   }

   public final void f(@Nullable Pair <set-?>) {
      u.setValue(this, W[3], var1);
   }

   @Nullable
   public final Pair y() {
      return (Pair)a.getValue(this, W[4]);
   }

   public final void E(@Nullable Pair <set-?>) {
      a.setValue(this, W[4], var1);
   }

   @Nullable
   public final Pair I() {
      return (Pair)M.getValue(this, W[5]);
   }

   public final void A(@Nullable Pair <set-?>) {
      M.setValue(this, W[5], var1);
   }

   @Nullable
   public final Pair f(long var1) {
      var1 ^= c;
      return (Pair)h.getValue(this, W[true.q<invokedynamic>(18169, 4659400404445551867L ^ var1)]);
   }

   public final void i(@Nullable Pair <set-?>, long a) {
      var2 ^= c;
      h.setValue(this, W[true.q<invokedynamic>(18169, 4659467186219527888L ^ var2)], var1);
   }

   @NotNull
   public final sm d(char param1, short param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private final ReadWriteProperty G(boolean var1, Object var2) {
      Delegates var3 = Delegates.INSTANCE;
      boolean var5 = false;
      return (ReadWriteProperty)(new gc(var2, var1));
   }

   // $FF: synthetic method
   static ReadWriteProperty M(co var0, long var1, boolean var3, Object var4, int var5, Object var6) {
      long var10000 = c ^ var1;
      if ((var5 & 1) != 0) {
         var3 = false;
      }

      if ((var5 & 2) != 0) {
         var4 = null;
      }

      return var0.G(var3, var4);
   }

   public final void s() {
      ew.e.V(0);
      ew.e.y(true);
   }

   public final void u() {
      ew.e.y(false);
   }

   static {
      long var20 = c ^ 54140850260052L;
      long var22 = var20 ^ 123249384147444L;
      long var24 = var20 ^ 102903852662784L;
      if (4578357200722408825L.A<invokedynamic>(4578357200722408825L, var20) == null) {
         (new String[4]).A<invokedynamic>(new String[4], 4557470455683458811L, var20);
      }

      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[14];
      int var17 = 0;
      String var16 = "Eµánî\u0092ÊcLA5oU\u0017Xâ \u007fê\u001byæ\\\u0088ªÈíïMtÎ§@\u0010}\u0013zó1â\u0099¸T)2Ö75í\b\u0091\u001d¢áW\u009d\u0091Ë \u007fê\u001byæ\\\u0088ªPV=P[:\t\u0084àô\u0001)\u0002Fx8>x\u00835sS¾]\btù\u0004\u0099\u000fØ7\u009f\bÞl7:\u0005>!ý \nôa\u0000xc§÷\u007fâZ\u001bß\f§\u000ea# \u0092\u001c|\u0000»yKkb\u001f\u0080?\u0018 RÃ¾ÏCY¿ä\u008c\u009e\u000eú;1Hg\u008f|aÖ\u001d½ÚÕ\fÄ\u007f$£T\f8 6¦Q\u007f!\u0086¦ÐÔ*\u0014&ÂõàZñ\u001dÞiAEÞW)è¶³¾ÅVÔ TXn4@ÅÓ\u0007\u0013C\u0096\u0081z\u008bµ4ÏS¬rô×¥!Ji~0î¼¹\u008f\bz\u0007Í½\u0004[òâ h\u0006\tr\u0010\u009e\u0085a\u001bNìË3\u0019Ú\u009f\u0018æ*qÕ/øü$ÄÚÀÌÚÜ\u009f";
      int var18 = "Eµánî\u0092ÊcLA5oU\u0017Xâ \u007fê\u001byæ\\\u0088ªÈíïMtÎ§@\u0010}\u0013zó1â\u0099¸T)2Ö75í\b\u0091\u001d¢áW\u009d\u0091Ë \u007fê\u001byæ\\\u0088ªPV=P[:\t\u0084àô\u0001)\u0002Fx8>x\u00835sS¾]\btù\u0004\u0099\u000fØ7\u009f\bÞl7:\u0005>!ý \nôa\u0000xc§÷\u007fâZ\u001bß\f§\u000ea# \u0092\u001c|\u0000»yKkb\u001f\u0080?\u0018 RÃ¾ÏCY¿ä\u008c\u009e\u000eú;1Hg\u008f|aÖ\u001d½ÚÕ\fÄ\u007f$£T\f8 6¦Q\u007f!\u0086¦ÐÔ*\u0014&ÂõàZñ\u001dÞiAEÞW)è¶³¾ÅVÔ TXn4@ÅÓ\u0007\u0013C\u0096\u0081z\u008bµ4ÏS¬rô×¥!Ji~0î¼¹\u008f\bz\u0007Í½\u0004[òâ h\u0006\tr\u0010\u009e\u0085a\u001bNìË3\u0019Ú\u009f\u0018æ*qÕ/øü$ÄÚÀÌÚÜ\u009f".length();
      char var15 = 16;
      int var14 = -1;

      label49:
      while(true) {
         ++var14;
         String var27 = var16.substring(var14, var14 + var15);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var12.doFinal(var27.getBytes("ISO-8859-1"));
            String var32 = b(var19).intern();
            switch(var10001) {
            case 0:
               var11[var17++] = var32;
               if ((var14 += var15) >= var18) {
                  v = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "Y\u0003ã\u009a\u0080B¦¼à \u008b¯\u0098ð/Ð45E\u0011\u008dÜ¼¡";
                  int var5 = "Y\u0003ã\u009a\u0080B¦¼à \u008b¯\u0098ð/Ð45E\u0011\u008dÜ¼¡".length();
                  int var2 = 0;

                  do {
                     int var30 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                     var30 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var34 = true;
                     var6[var30] = var10004;
                  } while(var2 < var5);

                  s = var6;
                  t = new Integer[3];
                  KProperty[] var26 = new KProperty[true.q<invokedynamic>(24224, 4805886332690613050L ^ var20)];
                  var26[0] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(co.class, var11[2], var11[6], 0)));
                  var26[1] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(co.class, var11[13], var11[11], 0)));
                  var26[2] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(co.class, var11[4], var11[9], 0)));
                  var26[3] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(co.class, var11[0], var11[7], 0)));
                  var26[4] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(co.class, var11[12], var11[8], 0)));
                  var26[5] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(co.class, var11[10], var11[1], 0)));
                  var26[true.q<invokedynamic>(29108, 5427133881501805612L ^ var20)] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(co.class, var11[5], var11[3], 0)));
                  W = var26;
                  P = new co(var22);
                  Z = M(P, var24, true, (Object)null, 2, (Object)null);
                  z = M(P, var24, false, (Object)null, 3, (Object)null);
                  C = M(P, var24, false, (Object)null, 3, (Object)null);
                  u = M(P, var24, false, (Object)null, 3, (Object)null);
                  a = M(P, var24, false, (Object)null, 3, (Object)null);
                  M = M(P, var24, false, (Object)null, 3, (Object)null);
                  h = M(P, var24, false, (Object)null, 3, (Object)null);
                  return;
               }

               var15 = var16.charAt(var14);
               break;
            default:
               var11[var17++] = var32;
               if ((var14 += var15) < var18) {
                  var15 = var16.charAt(var14);
                  continue label49;
               }

               var16 = "U´\u0005\u0013t\u0000ÎÔ\u007f{Äõê>ó\u0001\bÊâèø2X\u0091³";
               var18 = "U´\u0005\u0013t\u0000ÎÔ\u007f{Äõê>ó\u0001\bÊâèø2X\u0091³".length();
               var15 = 16;
               var14 = -1;
            }

            ++var14;
            var27 = var16.substring(var14, var14 + var15);
            var10001 = 0;
         }
      }
   }

   public static void G(String[] var0) {
      r = var0;
   }

   public static String[] a() {
      return r;
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

   private static int c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8999;
      if (t[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = s[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])v.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               v.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/co", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         t[var3] = var15;
      }

      return t[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = c(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/co" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
