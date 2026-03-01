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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.gofra.Flow;

public final class oc extends k9 {
   @NotNull
   public static final oc X;
   static final KProperty[] l;
   @NotNull
   private static final zr Q;
   @NotNull
   private static final zc u;
   @NotNull
   private static final zc B;
   @NotNull
   private static final zo f;
   private static final long b = j0.a(5334017494848968412L, 7081722181735012260L, MethodHandles.lookup().lookupClass()).a(63998672720907L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   private oc(int var1, int var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 137998733165426L;
      super(var6, true.l<invokedynamic>(26406, 398037440559515801L ^ var4), pa.c(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final xv i(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 83996426535160L;
      int var3 = (int)((var1 ^ 83996426535160L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (xv)Q.k((short)var3, this, l[0], (short)var4, var5);
   }

   private final float L(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 76889225670354L;
      int var3 = (int)((var1 ^ 76889225670354L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)u.k((short)var3, this, l[1], (short)var4, var5)).floatValue();
   }

   private final float K(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 72377818227783L;
      int var3 = (int)((var1 ^ 72377818227783L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)B.k((short)var3, this, l[2], (short)var4, var5)).floatValue();
   }

   private final boolean h(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 61957922768256L;
      int var3 = (int)((var1 ^ 61957922768256L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)f.k((short)var3, this, l[3], (short)var4, var5);
   }

   @Flow
   public final void h(@NotNull PreSyncEvent e) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean k() {
      long var0 = b ^ 127388510664448L;
      long var2 = var0 ^ 14633741141285L;

      boolean var10000;
      try {
         if (X.i(var2) == xv.Timer) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, -1298896989477324932L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final boolean H() {
      long var0 = b ^ 134332996471670L;
      long var2 = var0 ^ 5188498045267L;

      boolean var10000;
      try {
         if (X.i(var2) == xv.Motion) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, -7958021178675344630L, var0);
      }

      var10000 = false;
      return var10000;
   }

   static {
      long var20 = b ^ 90576811196976L;
      long var22 = var20 ^ 87287128636933L;
      long var24 = var20 ^ 45432414946785L;
      long var26 = var20 ^ 137790733711862L;
      long var10001 = var20 ^ 133302696499774L;
      int var28 = (int)((var20 ^ 133302696499774L) >>> 32);
      int var29 = (int)(var10001 << 32 >>> 48);
      int var30 = (int)(var10001 << 48 >>> 48);
      e = new HashMap(13);
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
      String var15 = "©à6:i\u001f¯(\u00161Dï·¼ãÂ\u0010pÏ«¤!\u0097áÀ/\u0004cSç¯Uº\u0018K\u008cHá\u0090\u0091.0Â\u0080çøÊÝ¹:\u001f\u001bÊ$Î{Ud8¦5àKRC\u008doõÞ¯ô¾\u009c¼(mé]ª\u0088HiJ¹\u009dÆ\u0004ë\u008aæI1$RËêD\b\u008f\u0002U÷\u0089\u0097Ç¦:\u0017\u0004äOâí.Ï\u0018)åíÑ\u0001:ÌÄPþo\u00adN.\t\u0002¯\u0097?\u001f« §Ï\u0010¢%ÐÅÆô\u0017(ö\u0091>o\u0007Ù\nã\u0010ÂÙ\u001b\u0013QWÔ\u0087\n \u008aÌMnÀ\u0088(\u000b,µ\u008b¹\u008b¤æà\u0015díÙ\u001c\u009c3\u001dÆÎLû\u008b+,ví\u0087\\ûÅúùW!ÈO§Ú ª ÅÒà¥Êi\u0017B\u001f~ãÏß\u0084\u0080\u0086\u0017\u0092\"É %ÄêS\u0011\u0001\u001bß\u0080í! ìs\u0093À~á¨\u0096\u008c\t@\u0085¹@õ\t\u0011èÒMT@_\u0098y/~i³\u007fgk\u0010\u0085¦;\u0099\u0019%aE8\u001a:\u001d×¿0\u0001";
      int var17 = "©à6:i\u001f¯(\u00161Dï·¼ãÂ\u0010pÏ«¤!\u0097áÀ/\u0004cSç¯Uº\u0018K\u008cHá\u0090\u0091.0Â\u0080çøÊÝ¹:\u001f\u001bÊ$Î{Ud8¦5àKRC\u008doõÞ¯ô¾\u009c¼(mé]ª\u0088HiJ¹\u009dÆ\u0004ë\u008aæI1$RËêD\b\u008f\u0002U÷\u0089\u0097Ç¦:\u0017\u0004äOâí.Ï\u0018)åíÑ\u0001:ÌÄPþo\u00adN.\t\u0002¯\u0097?\u001f« §Ï\u0010¢%ÐÅÆô\u0017(ö\u0091>o\u0007Ù\nã\u0010ÂÙ\u001b\u0013QWÔ\u0087\n \u008aÌMnÀ\u0088(\u000b,µ\u008b¹\u008b¤æà\u0015díÙ\u001c\u009c3\u001dÆÎLû\u008b+,ví\u0087\\ûÅúùW!ÈO§Ú ª ÅÒà¥Êi\u0017B\u001f~ãÏß\u0084\u0080\u0086\u0017\u0092\"É %ÄêS\u0011\u0001\u001bß\u0080í! ìs\u0093À~á¨\u0096\u008c\t@\u0085¹@õ\t\u0011èÒMT@_\u0098y/~i³\u007fgk\u0010\u0085¦;\u0099\u0019%aE8\u001a:\u001d×¿0\u0001".length();
      char var14 = 16;
      int var13 = -1;

      label55:
      while(true) {
         ++var13;
         String var32 = var15.substring(var13, var13 + var14);
         byte var34 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var32.getBytes("ISO-8859-1"));
            String var39 = b(var19).intern();
            switch(var34) {
            case 0:
               var18[var16++] = var39;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[13];
                  Cipher var1;
                  var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var2 = 1; var2 < 8; ++var2) {
                     var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var0 = new long[4];
                  int var4 = 0;
                  String var5 = "\"\u0016\u0017c\u0096Ó£5+)\u0090Ã°\u0096r/";
                  int var6 = "\"\u0016\u0017c\u0096Ó£5+)\u0090Ã°\u0096r/".length();
                  int var3 = 0;

                  label37:
                  while(true) {
                     int var38 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var38, var3).getBytes("ISO-8859-1");
                     long[] var35 = var0;
                     var38 = var4++;
                     long var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var42 = -1;

                     while(true) {
                        long var8 = var41;
                        byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var44 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var42) {
                        case 0:
                           var35[var38] = var44;
                           if (var3 >= var6) {
                              KProperty[] var31 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oc.class, true.l<invokedynamic>(1648, 6222444738201774229L ^ var20), true.l<invokedynamic>(9237, 8558490227495095027L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oc.class, true.l<invokedynamic>(11631, 9112987029428323211L ^ var20), true.l<invokedynamic>(24936, 3151921276659437449L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oc.class, true.l<invokedynamic>(9006, 6012433746086743495L ^ var20), true.l<invokedynamic>(4791, 793506243289054299L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oc.class, true.l<invokedynamic>(5188, 2057824561844026025L ^ var20), true.l<invokedynamic>(28474, 6849359679013650904L ^ var20), 0)))};
                              l = var31;
                              X = new oc(var28, var29, (char)var30);
                              Q = qi.M((il)X, true.l<invokedynamic>(29314, 6863839217199258722L ^ var20), (Enum)xv.Motion, (pj)null, (Function0)null, (int)var0[3], (Object)null, var22);
                              u = qi.g((il)X, true.l<invokedynamic>(3774, 9196732915725819985L ^ var20), 3.0F, RangesKt.rangeTo(1.0F, 5.0F), (pj)null, oc::k, (int)var0[0], var24, (Object)null);
                              B = qi.g((il)X, true.l<invokedynamic>(10096, 692987834340657555L ^ var20), 1.0F, RangesKt.rangeTo(0.1F, 2.0F), (pj)null, oc::H, (int)var0[2], var24, (Object)null);
                              f = qi.R((il)X, true.l<invokedynamic>(769, 6146142173470223855L ^ var20), false, (pj)null, (Function0)null, (int)var0[1], var26, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var35[var38] = var44;
                           if (var3 < var6) {
                              continue label37;
                           }

                           var5 = "$\nê¸ÞU\u009f\u0000W\u009aI¦c\u000f\u0013a";
                           var6 = "$\nê¸ÞU\u009f\u0000W\u009aI¦c\u000f\u0013a".length();
                           var3 = 0;
                        }

                        var38 = var3;
                        var3 += 8;
                        var7 = var5.substring(var38, var3).getBytes("ISO-8859-1");
                        var35 = var0;
                        var38 = var4++;
                        var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var42 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var39;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label55;
               }

               var15 = "v9\u0015\u0081\u0093½;À\u009c\u0007-.ãf[²\u001bÌïãa«Á\u0083:BÂ)ØH~F\u0010=9zýdO3\u009bx\rVS\u0089yQ®";
               var17 = "v9\u0015\u0081\u0093½;À\u009c\u0007-.ãf[²\u001bÌïãa«Á\u0083:BÂ)ØH~F\u0010=9zýdO3\u009bx\rVS\u0089yQ®".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var32 = var15.substring(var13, var13 + var14);
            var34 = 0;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 14259;
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
            throw new RuntimeException("su/catlean/oc", var10);
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
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
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
         throw new RuntimeException("su/catlean/oc" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
