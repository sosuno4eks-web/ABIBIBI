package su.catlean;

import java.awt.Color;
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
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class l1 extends k9 {
   @NotNull
   public static final l1 A;
   static final KProperty[] q;
   @NotNull
   private static final zc Y;
   @NotNull
   private static final zv d;
   @NotNull
   private static final zv Q;
   private static final long b = j0.a(-1587878162163100493L, 4213104142086877144L, MethodHandles.lookup().lookupClass()).a(186331368632711L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f;

   private l1(int var1, short var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 56658356762260L;
      super(var6, true.v<invokedynamic>(19131, 1667876995398785086L ^ var4), pa.W(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final float p(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 90642724047354L;
      int var3 = (int)((var1 ^ 90642724047354L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)Y.k((short)var3, this, q[0], (short)var4, var5)).floatValue();
   }

   private final Color K(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 78309435542396L;
      int var3 = (int)((var1 ^ 78309435542396L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)d.k((short)var3, this, q[1], (short)var4, var5);
   }

   private final Color L(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 62458431170670L;
      int var3 = (int)((var1 ^ 62458431170670L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)Q.k((short)var3, this, q[2], (short)var4, var5);
   }

   @Flow
   private final void A(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final Map s(long param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 44122317432451L;
      long var10001 = var20 ^ 85183734467435L;
      int var22 = (int)((var20 ^ 85183734467435L) >>> 32);
      int var23 = (int)(var10001 << 32 >>> 48);
      int var24 = (int)(var10001 << 48 >>> 48);
      long var25 = var20 ^ 137274027301889L;
      long var27 = var20 ^ 33634458115380L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[12];
      int var16 = 0;
      String var15 = "èæÆLì÷\u0082\u0081\u0013\r¶.Â¸ûZ C`\u008d\"\u000f+u\u0014Ð\u0015#ëhæÑ\u008fGÏIc\u0090e\u0013?\u0085a\u0095\u000eâëc§ Níf ÖGÇ¯\u0088\u001cLÿ×7îÃ\u0099Ð+ô±C\u0016Dð\u000bûZô¬ÃG8/\u009bò\u0017¿v5\u0085çÙÒ\u0013§&\u008c\u008eéë¾áRè2¬9.²°Ã¨3ÁÃAb\u0090\u000fd³ô»\u0085\u0006ñü\u0012ã_î{\u001déP)\b¯\u0010}ÁÆIÎMñ\u0002\u008b)@\u0090ªí\b\u0089 \u00921qH¸3)RR\u0097\u000b\u000f7Iey¨./®¥µ\u001f\u008aT[ß)\u0084Kò\u0085\u0010`>\u0017ï]ï\u000bçDêbã\u0087\u001f?\u000f \u0098×\u0000©½\u0013±PÈ»\u000b\u009b\u0006Õ¨ú\u0018½~\u0017B¦\u0092=áW¥Q&\u009f\tÏ\u0010\u000b´¿6 Ä /Ãù_\b{ä\u0094è\u0010±*\u0003PºÁE\u0001\u00020<H1\u0019\u009c`";
      int var17 = "èæÆLì÷\u0082\u0081\u0013\r¶.Â¸ûZ C`\u008d\"\u000f+u\u0014Ð\u0015#ëhæÑ\u008fGÏIc\u0090e\u0013?\u0085a\u0095\u000eâëc§ Níf ÖGÇ¯\u0088\u001cLÿ×7îÃ\u0099Ð+ô±C\u0016Dð\u000bûZô¬ÃG8/\u009bò\u0017¿v5\u0085çÙÒ\u0013§&\u008c\u008eéë¾áRè2¬9.²°Ã¨3ÁÃAb\u0090\u000fd³ô»\u0085\u0006ñü\u0012ã_î{\u001déP)\b¯\u0010}ÁÆIÎMñ\u0002\u008b)@\u0090ªí\b\u0089 \u00921qH¸3)RR\u0097\u000b\u000f7Iey¨./®¥µ\u001f\u008aT[ß)\u0084Kò\u0085\u0010`>\u0017ï]ï\u000bçDêbã\u0087\u001f?\u000f \u0098×\u0000©½\u0013±PÈ»\u000b\u009b\u0006Õ¨ú\u0018½~\u0017B¦\u0092=áW¥Q&\u009f\tÏ\u0010\u000b´¿6 Ä /Ãù_\b{ä\u0094è\u0010±*\u0003PºÁE\u0001\u00020<H1\u0019\u009c`".length();
      char var14 = 16;
      int var13 = -1;

      label55:
      while(true) {
         ++var13;
         String var30 = var15.substring(var13, var13 + var14);
         byte var32 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var30.getBytes("ISO-8859-1"));
            String var37 = b(var19).intern();
            switch(var32) {
            case 0:
               var18[var16++] = var37;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  e = new String[12];
                  Cipher var1;
                  var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var2 = 1; var2 < 8; ++var2) {
                     var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var0 = new long[9];
                  int var4 = 0;
                  String var5 = "*Ñ´\u0098nÑjWK\u0000»\u0093\u001b\u000eþ\u0012÷Æî`\u008e\u009cf¹`\u000fºR\u0085²HèBg\b?*FòIô\u000eÞÇ:>N\u0088Ü`í¶mõ\u001e\u0082";
                  int var6 = "*Ñ´\u0098nÑjWK\u0000»\u0093\u001b\u000eþ\u0012÷Æî`\u008e\u009cf¹`\u000fºR\u0085²HèBg\b?*FòIô\u000eÞÇ:>N\u0088Ü`í¶mõ\u001e\u0082".length();
                  int var3 = 0;

                  label37:
                  while(true) {
                     int var36 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var36, var3).getBytes("ISO-8859-1");
                     long[] var33 = var0;
                     var36 = var4++;
                     long var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var40 = -1;

                     while(true) {
                        long var8 = var39;
                        byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var42 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var40) {
                        case 0:
                           var33[var36] = var42;
                           if (var3 >= var6) {
                              KProperty[] var29 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l1.class, true.v<invokedynamic>(15468, 3749433879989257138L ^ var20), true.v<invokedynamic>(17372, 491680184046844931L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l1.class, true.v<invokedynamic>(8194, 6683549751879114704L ^ var20), true.v<invokedynamic>(1298, 1688468854883498699L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l1.class, true.v<invokedynamic>(9830, 762030822925506997L ^ var20), true.v<invokedynamic>(225, 6687320214329966384L ^ var20), 0)))};
                              q = var29;
                              A = new l1(var22, (short)var23, var24);
                              Y = qi.g((il)A, true.v<invokedynamic>(14515, 7296750185614116713L ^ var20), 1.0F, RangesKt.rangeTo(0.01F, 3.0F), (pj)null, (Function0)null, (int)var0[8], var25, (Object)null);
                              d = qi.F((il)A, true.v<invokedynamic>(24604, 2136929842409562048L ^ var20), new Color((int)var0[2], (int)var0[7], (int)var0[7], (int)var0[4]), (pj)null, (Function0)null, (int)var0[1], var27, (Object)null);
                              Q = qi.F((il)A, true.v<invokedynamic>(20431, 5130088869739622431L ^ var20), new Color((int)var0[7], (int)var0[0], (int)var0[5], (int)var0[6]), (pj)null, (Function0)null, (int)var0[3], var27, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var33[var36] = var42;
                           if (var3 < var6) {
                              continue label37;
                           }

                           var5 = "ð#¨%\u0091ØµM\u0010ÄÂ\u009f<`Úè";
                           var6 = "ð#¨%\u0091ØµM\u0010ÄÂ\u009f<`Úè".length();
                           var3 = 0;
                        }

                        var36 = var3;
                        var3 += 8;
                        var7 = var5.substring(var36, var3).getBytes("ISO-8859-1");
                        var33 = var0;
                        var36 = var4++;
                        var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var40 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var37;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label55;
               }

               var15 = "/Åæo%BÆCn\nKõfÂÃ^0\u008e¨áwÂ\u001cZ\u001f\u008fÜ oeN\u00ad²,ÊV\u009eþ\u001eë)\f^û\u0014Îª\u008e\u0000r1jg5\\ºÐÕ2$È\u0089[è\u0080";
               var17 = "/Åæo%BÆCn\nKõfÂÃ^0\u008e¨áwÂ\u001cZ\u001f\u008fÜ oeN\u00ad²,ÊV\u009eþ\u001eë)\f^û\u0014Îª\u008e\u0000r1jg5\\ºÐÕ2$È\u0089[è\u0080".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var30 = var15.substring(var13, var13 + var14);
            var32 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32620;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/l1", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/l1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
