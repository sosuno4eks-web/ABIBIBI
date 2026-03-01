package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class sh extends s4 {
   @NotNull
   public static final sh P;
   @NotNull
   private static final List h;
   private static float U;
   @NotNull
   private static hh u;
   @Nullable
   private static ko d;
   @NotNull
   private static final iv D;
   @Nullable
   private static q9 z;
   @NotNull
   private static final fs G;
   @NotNull
   private static final fs b;
   @NotNull
   private static final aa v;
   private static final long a = j0.a(-211856932171114643L, 1854752890698864727L, MethodHandles.lookup().lookupClass()).a(155768537048530L);
   private static final String[] g;
   private static final String[] i;
   private static final Map j;
   private static final long[] m;
   private static final Integer[] q;
   private static final Map s;

   private sh(long var1, byte var3) {
      long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ a;
      long var10001 = var4 ^ 138876562365966L;
      int var6 = (int)((var4 ^ 138876562365966L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      super(true.n<invokedynamic>(9096, 3891342208160383595L ^ var4), (short)var6, var7, var8, 0.0F, 0.0F, 0.0F, 0.0F, true.n<invokedynamic>(24574, 2312506406148413284L ^ var4), (DefaultConstructorMarker)null);
   }

   @Nullable
   public final q9 o() {
      return z;
   }

   public final void T(@Nullable q9 <set-?>) {
      z = var1;
   }

   public void y(long var1) {
      long var3 = var1 ^ 101253486323824L;
      long var5 = var1 ^ 14327393199741L;
      long var7 = var1 ^ 90856601616481L;
      h.clear();
      Iterator var9 = c0.S.H().T(var3).iterator();

      while(true) {
         if (var9.hasNext()) {
            hs var10 = (hs)var9.next();
            h.add(new ko(var10.b(), 0.0F, 0.0F, hh.MODULES, true.n<invokedynamic>(5732, 906601458458482491L ^ var1), var7, (DefaultConstructorMarker)null));
            if (var1 <= 0L) {
               break;
            }

            if (var1 > 0L) {
               continue;
            }
         }

         var9 = c0.S.A().h(var5).iterator();
         break;
      }

      while(var9.hasNext()) {
         ru var11 = (ru)var9.next();
         h.add(new ko(var11.X(), 0.0F, 0.0F, hh.WIDGETS, true.n<invokedynamic>(5732, 906601458458482491L ^ var1), var7, (DefaultConstructorMarker)null));
         if (var1 < 0L) {
            break;
         }
      }

   }

   public void X(@NotNull class_332 context, int mouseX, long a, int mouseY) {
      // $FF: Couldn't be decompiled
   }

   private final void U(long param1, class_332 param3) {
      // $FF: Couldn't be decompiled
   }

   public void T(float mX, float mY, int button, long a) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var27 = a ^ 74544819409427L;
      long var10001 = var27 ^ 140522478037698L;
      long var29 = (var27 ^ 140522478037698L) >>> 8;
      int var31 = (int)(var10001 << 56 >>> 56);
      long var32 = var27 ^ 38789263120765L;
      var10001 = var27 ^ 94015029854239L;
      int var34 = (int)((var27 ^ 94015029854239L) >>> 48);
      int var35 = (int)(var10001 << 16 >>> 48);
      int var36 = (int)(var10001 << 32 >>> 32);
      long var37 = var27 ^ 29796152090027L;
      j = new HashMap(13);
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var27 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[16];
      int var23 = 0;
      String var22 = "×¯*2\u0091¼¢B\u0010RiU¤\u000e\u00ad» \u001cÖ\u0016¥M´$°\u0093\u009dÉÈ\\\u0094ÀCKµ´D«T\u0098=(\u000bÑB\u001f\u0085DÓ\u0010B»_i\\\u0018~ÐD\u001fÔ¬ë\u0096fX\u0010o©\u008a\u00962º5Ø\u00042ÃcQSÀ\u0001 %&c\u0080kïÑ@ûÓÐPk/\u009a¸gÌ}j¯úÇ\u0083í\u0092C\u009c-éi\u0017\u0010\u0010F\u0086\u001d¿\t\u001dU\u0083\u0089Aþ|´bù \u0005\u0094os ö¥(øÕ\u0084\u0011\u00adævñ»Zµb#cRÑ\u0003ÿè<×\u0092\u0005\u00070¶¾\u0091\u0014«Ë®Lùÿq.\u0088d\u0005\u008e\u0099_\f«!ÿ%a@\u0015A\u001fZB\u0084'·¨Rx&g}\u0090¿Ö\u0099b}\u0080í£ â\u0014U$~Xð!Y3\u009dË+\u0014\u0087Ü\u000b\u0002\u0019tV\u0011ÄÁ<\u0005>Æ\u0005â\u008fÂ\u0010\u009bPÔÞ\u0081A'Þìô\u0006Ì¸\u0003B\t\u0010qú\u0092\u008d\u008d£·¦~£ï\u0083\u0096\u0080)\u0092(×E.ÈèÚ\u0092\u0089]~\u0002ct=\u0005>\u008d7Âøh¸/8Ù\u000bº\u0088T\u0001Jªêª`\u0087u¾gg\u0010hBG/d[\u000eÅ\u0097T³Ô\u0081\u0094\u001a\u001b \u0017_lßô>¥ê1Y£Fkãï[y\u0000\u008aJx ç\u0091\u0005åY\u0091\u00ad¥Øz";
      int var24 = "×¯*2\u0091¼¢B\u0010RiU¤\u000e\u00ad» \u001cÖ\u0016¥M´$°\u0093\u009dÉÈ\\\u0094ÀCKµ´D«T\u0098=(\u000bÑB\u001f\u0085DÓ\u0010B»_i\\\u0018~ÐD\u001fÔ¬ë\u0096fX\u0010o©\u008a\u00962º5Ø\u00042ÃcQSÀ\u0001 %&c\u0080kïÑ@ûÓÐPk/\u009a¸gÌ}j¯úÇ\u0083í\u0092C\u009c-éi\u0017\u0010\u0010F\u0086\u001d¿\t\u001dU\u0083\u0089Aþ|´bù \u0005\u0094os ö¥(øÕ\u0084\u0011\u00adævñ»Zµb#cRÑ\u0003ÿè<×\u0092\u0005\u00070¶¾\u0091\u0014«Ë®Lùÿq.\u0088d\u0005\u008e\u0099_\f«!ÿ%a@\u0015A\u001fZB\u0084'·¨Rx&g}\u0090¿Ö\u0099b}\u0080í£ â\u0014U$~Xð!Y3\u009dË+\u0014\u0087Ü\u000b\u0002\u0019tV\u0011ÄÁ<\u0005>Æ\u0005â\u008fÂ\u0010\u009bPÔÞ\u0081A'Þìô\u0006Ì¸\u0003B\t\u0010qú\u0092\u008d\u008d£·¦~£ï\u0083\u0096\u0080)\u0092(×E.ÈèÚ\u0092\u0089]~\u0002ct=\u0005>\u008d7Âøh¸/8Ù\u000bº\u0088T\u0001Jªêª`\u0087u¾gg\u0010hBG/d[\u000eÅ\u0097T³Ô\u0081\u0094\u001a\u001b \u0017_lßô>¥ê1Y£Fkãï[y\u0000\u008aJx ç\u0091\u0005åY\u0091\u00ad¥Øz".length();
      char var21 = 16;
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var39 = var22.substring(var20, var20 + var21);
         byte var42 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var39.getBytes("ISO-8859-1"));
            String var45 = b(var26).intern();
            switch(var42) {
            case 0:
               var25[var23++] = var45;
               if ((var20 += var21) >= var24) {
                  g = var25;
                  i = new String[16];
                  s = new HashMap(13);
                  Cipher var7;
                  var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var8 = 1; var8 < 8; ++var8) {
                     var10003[var8] = (byte)((int)(var27 << var8 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var13 = new long[20];
                  int var10 = 0;
                  String var11 = "h\u0006\u0005\u008bHE\u001cP<ø9\u008c\u0097Ø\u000e8cOõi\u0090'\u00818:èëî\u0006\u009a;\b»ü%!á\u0089¶J³!(Ö$s#\u0005X\u0092ü\u0089*,?\u0080\u0080zñP)\u0014Jáÿ±¹ngÁR¤\u0082¢Hn*Zþî\u0002\u0095¯\u001e\u0094ù\u0004:\u0018Ú¹\u00ad\u0096>É\n³yú¡_è3¼-÷aÄãèß}ÙÄxvSç´iQuhgoÇÔ¥jÓ\u001bb\u0011]\u0086ãR\u008d \u0088\u0083i{Ó";
                  int var12 = "h\u0006\u0005\u008bHE\u001cP<ø9\u008c\u0097Ø\u000e8cOõi\u0090'\u00818:èëî\u0006\u009a;\b»ü%!á\u0089¶J³!(Ö$s#\u0005X\u0092ü\u0089*,?\u0080\u0080zñP)\u0014Jáÿ±¹ngÁR¤\u0082¢Hn*Zþî\u0002\u0095¯\u001e\u0094ù\u0004:\u0018Ú¹\u00ad\u0096>É\n³yú¡_è3¼-÷aÄãèß}ÙÄxvSç´iQuhgoÇÔ¥jÓ\u001bb\u0011]\u0086ãR\u008d \u0088\u0083i{Ó".length();
                  int var9 = 0;

                  label46:
                  while(true) {
                     int var46 = var9;
                     var9 += 8;
                     byte[] var14 = var11.substring(var46, var9).getBytes("ISO-8859-1");
                     long[] var41 = var13;
                     var46 = var10++;
                     long var49 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                     byte var50 = -1;

                     while(true) {
                        long var15 = var49;
                        byte[] var17 = var7.doFinal(new byte[]{(byte)((int)(var15 >>> 56)), (byte)((int)(var15 >>> 48)), (byte)((int)(var15 >>> 40)), (byte)((int)(var15 >>> 32)), (byte)((int)(var15 >>> 24)), (byte)((int)(var15 >>> 16)), (byte)((int)(var15 >>> 8)), (byte)((int)var15)});
                        long var52 = ((long)var17[0] & 255L) << 56 | ((long)var17[1] & 255L) << 48 | ((long)var17[2] & 255L) << 40 | ((long)var17[3] & 255L) << 32 | ((long)var17[4] & 255L) << 24 | ((long)var17[5] & 255L) << 16 | ((long)var17[6] & 255L) << 8 | (long)var17[7] & 255L;
                        switch(var50) {
                        case 0:
                           var41[var46] = var52;
                           if (var9 >= var12) {
                              m = var13;
                              q = new Integer[20];
                              Cipher var2;
                              var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var3 = 1; var3 < 8; ++var3) {
                                 var10003[var3] = (byte)((int)(var27 << var3 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var4 = -7607720816691699857L;
                              byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                              var49 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                              boolean var48 = true;
                              long var0 = var49;
                              P = new sh(var29, (byte)var31);
                              h = (List)(new ArrayList());
                              U = 40.0F;
                              u = hh.MODULES;
                              D = new iv();
                              G = new fs(true.n<invokedynamic>(22885, 8105162504502357224L ^ var27), var32, true.n<invokedynamic>(2589, 6933307846977541867L ^ var27), true.n<invokedynamic>(3519, 3700367689855553882L ^ var27));
                              b = new fs(true.n<invokedynamic>(30922, 8433908318956916043L ^ var27), var32, true.n<invokedynamic>(3519, 3700367689855553882L ^ var27), true.n<invokedynamic>(3519, 3700367689855553882L ^ var27));
                              v = new aa(sa.OUT_QUINT, var0, (short)var34, (short)var35, var36);
                              P.y(var37);
                              return;
                           }
                           break;
                        default:
                           var41[var46] = var52;
                           if (var9 < var12) {
                              continue label46;
                           }

                           var11 = "ü\u0090\u008ck\u0014\u0097\u001cb°øÈôÔ\u0093\u0086¤";
                           var12 = "ü\u0090\u008ck\u0014\u0097\u001cb°øÈôÔ\u0093\u0086¤".length();
                           var9 = 0;
                        }

                        var46 = var9;
                        var9 += 8;
                        var14 = var11.substring(var46, var9).getBytes("ISO-8859-1");
                        var41 = var13;
                        var46 = var10++;
                        var49 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                        var50 = 0;
                     }
                  }
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var45;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label64;
               }

               var22 = "\u0001\u001b2\u0018oiá´+yô°Ó;&ý q½!¶¡\u0011pÍ¯u\u0019Ö/\u0097\u0084O§\r¹¾7:¢+\u001c\u0010r;l\u001b7\u00ad";
               var24 = "\u0001\u001b2\u0018oiá´+yô°Ó;&ý q½!¶¡\u0011pÍ¯u\u0019Ö/\u0097\u0084O§\r¹¾7:¢+\u001c\u0010r;l\u001b7\u00ad".length();
               var21 = 16;
               var20 = -1;
            }

            ++var20;
            var39 = var22.substring(var20, var20 + var21);
            var42 = 0;
         }
      }
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6463;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/sh", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = g[var5].getBytes("ISO-8859-1");
         i[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
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
         throw new RuntimeException("su/catlean/sh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12365;
      if (q[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = m[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])s.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               s.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/sh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/sh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
