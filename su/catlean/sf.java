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
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class sf extends s4 {
   @NotNull
   public static final sf H;
   @NotNull
   private static final fs i;
   @NotNull
   private static final List Y;
   private static boolean v;
   @NotNull
   private static aa F;
   @NotNull
   private static aa t;
   private static float z;
   private static final long a = j0.a(-1378806356201829931L, 7427062843169036471L, MethodHandles.lookup().lookupClass()).a(45122730375846L);
   private static final String[] b;
   private static final String[] d;
   private static final Map g;
   private static final long[] h;
   private static final Integer[] j;
   private static final Map m;

   private sf(char var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var10001 = var4 ^ 84684868650171L;
      int var6 = (int)((var4 ^ 84684868650171L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      super(true.l<invokedynamic>(30585, 7004185813784920330L ^ var4), (short)var6, var7, var8, 0.0F, 0.0F, 0.0F, 0.0F, true.b<invokedynamic>(22120, 9150241617992791121L ^ var4), (DefaultConstructorMarker)null);
   }

   @NotNull
   public final fs w() {
      return i;
   }

   public void y(long var1) {
      long var3 = var1 ^ 13795419754217L;
      long var5 = var1 ^ 104512369833301L;
      Y.clear();
      Iterable var7 = (Iterable)c0.S.L().j(var5);
      boolean var8 = false;
      Iterator var9 = var7.iterator();

      while(var9.hasNext()) {
         Object var10 = var9.next();
         String var11 = (String)var10;
         boolean var12 = false;
         Y.add(new d6(var11, var3));
         if (var1 > 0L && var1 > 0L) {
            continue;
         }
      }

   }

   public void X(@NotNull class_332 context, int mouseX, long a, int mouseY) {
      // $FF: Couldn't be decompiled
   }

   public void T(float mX, float mY, int button, long a) {
      // $FF: Couldn't be decompiled
   }

   public void D(double mouseX, long a, double mouseY, double amount) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit J(String var0) {
      long var1 = a ^ 12189563803861L;
      long var3 = var1 ^ 116965405927182L;
      long var5 = var1 ^ 77586541668009L;
      Intrinsics.checkNotNullParameter(var0, true.l<invokedynamic>(998, 411084143043067980L ^ var1));
      _v.n.P(var3, var0);
      H.y(var5);
      H.K((xp)null);
      return Unit.INSTANCE;
   }

   static {
      long var31 = a ^ 32085071829116L;
      long var33 = var31 ^ 115409506329302L;
      long var10001 = var31 ^ 33192025947060L;
      int var35 = (int)((var31 ^ 33192025947060L) >>> 48);
      int var36 = (int)(var10001 << 16 >>> 48);
      int var37 = (int)(var10001 << 32 >>> 32);
      var10001 = var31 ^ 20221813307928L;
      int var38 = (int)((var31 ^ 20221813307928L) >>> 48);
      int var39 = (int)(var10001 << 16 >>> 32);
      int var40 = (int)(var10001 << 48 >>> 48);
      long var41 = var31 ^ 88686772397568L;
      g = new HashMap(13);
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var23 = 1; var23 < 8; ++var23) {
         var10003[var23] = (byte)((int)(var31 << var23 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[6];
      int var27 = 0;
      String var26 = "Cµ\u0083îµ\u0086à\u009cmáßÛ.Pèv n{D\u00945¹4\r!¼\u0085âCY/3_o\u0001WÜ}Äp#û:Õ\u001d×\u008fò ?\bÀüOÛ$Â_¤ÉñátÒá)V\u0015´ÈÛx\u0090Î)àÇg¡ó\u001c\u0010\u009e'ç°-¦\u0095Q\u0099¨\u00ad÷Ô{\tü";
      int var28 = "Cµ\u0083îµ\u0086à\u009cmáßÛ.Pèv n{D\u00945¹4\r!¼\u0085âCY/3_o\u0001WÜ}Äp#û:Õ\u001d×\u008fò ?\bÀüOÛ$Â_¤ÉñátÒá)V\u0015´ÈÛx\u0090Î)àÇg¡ó\u001c\u0010\u009e'ç°-¦\u0095Q\u0099¨\u00ad÷Ô{\tü".length();
      char var25 = 16;
      int var24 = -1;

      label74:
      while(true) {
         ++var24;
         String var43 = var26.substring(var24, var24 + var25);
         byte var46 = -1;

         while(true) {
            byte[] var30 = var22.doFinal(var43.getBytes("ISO-8859-1"));
            String var49 = b(var30).intern();
            switch(var46) {
            case 0:
               var29[var27++] = var49;
               if ((var24 += var25) >= var28) {
                  b = var29;
                  d = new String[6];
                  m = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var12 = 1; var12 < 8; ++var12) {
                     var10003[var12] = (byte)((int)(var31 << var12 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[4];
                  int var14 = 0;
                  String var15 = "É\u0096v\u0017\u0096\u001bV©ë\u00124\u008au0\u009dW";
                  int var16 = "É\u0096v\u0017\u0096\u001bV©ë\u00124\u008au0\u009dW".length();
                  int var13 = 0;

                  label56:
                  while(true) {
                     int var50 = var13;
                     var13 += 8;
                     byte[] var18 = var15.substring(var50, var13).getBytes("ISO-8859-1");
                     long[] var45 = var17;
                     var50 = var14++;
                     long var52 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                     byte var53 = -1;

                     while(true) {
                        long var19 = var52;
                        byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                        long var55 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                        switch(var53) {
                        case 0:
                           var45[var50] = var55;
                           if (var13 >= var16) {
                              h = var17;
                              j = new Integer[4];
                              Cipher var1;
                              var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var2 = 1; var2 < 8; ++var2) {
                                 var10003[var2] = (byte)((int)(var31 << var2 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long[] var0 = new long[2];
                              int var4 = 0;
                              String var5 = "\\\u0014\u0014\u0012e£\nX\u0015cy\u000bBýù\u0017";
                              int var6 = "\\\u0014\u0014\u0012e£\nX\u0015cy\u000bBýù\u0017".length();
                              int var3 = 0;

                              do {
                                 var50 = var3;
                                 var3 += 8;
                                 byte[] var7 = var5.substring(var50, var3).getBytes("ISO-8859-1");
                                 var50 = var4++;
                                 long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                 byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                 var55 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                 boolean var56 = true;
                                 var0[var50] = var55;
                              } while(var3 < var6);

                              H = new sf((char)var38, var39, (short)var40);
                              i = new fs(true.l<invokedynamic>(20548, 5457239161388684098L ^ var31), var33, true.b<invokedynamic>(15479, 2875608490773719866L ^ var31), true.b<invokedynamic>(9797, 5714965233053675787L ^ var31));
                              Y = (List)(new ArrayList());
                              F = new aa(sa.OUT_QUINT, var0[0], (short)var35, (short)var36, var37);
                              t = new aa(sa.OUT_QUINT, var0[1], (short)var35, (short)var36, var37);
                              H.P(240.0F);
                              H.u(290.0F);
                              H.H(110.0F);
                              H.y(var41);
                              return;
                           }
                           break;
                        default:
                           var45[var50] = var55;
                           if (var13 < var16) {
                              continue label56;
                           }

                           var15 = "E#\u0091\u0004\u007f£\u0015\"\u0002ÜóÝB9\u007fí";
                           var16 = "E#\u0091\u0004\u007f£\u0015\"\u0002ÜóÝB9\u007fí".length();
                           var13 = 0;
                        }

                        var50 = var13;
                        var13 += 8;
                        var18 = var15.substring(var50, var13).getBytes("ISO-8859-1");
                        var45 = var17;
                        var50 = var14++;
                        var52 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        var53 = 0;
                     }
                  }
               }

               var25 = var26.charAt(var24);
               break;
            default:
               var29[var27++] = var49;
               if ((var24 += var25) < var28) {
                  var25 = var26.charAt(var24);
                  continue label74;
               }

               var26 = "\u0014¨®É±pòf\u001e9\u0088®\u009cÒ¿° B\u0004\u001f\u009fFN¸ËõÖó®ZºHëÃ<\u0000Äû\u0013úa\u0091ïL\u009a¸Eêâ";
               var28 = "\u0014¨®É±pòf\u001e9\u0088®\u009cÒ¿° B\u0004\u001f\u009fFN¸ËõÖó®ZºHëÃ<\u0000Äû\u0013úa\u0091ïL\u009a¸Eêâ".length();
               var25 = 16;
               var24 = -1;
            }

            ++var24;
            var43 = var26.substring(var24, var24 + var25);
            var46 = 0;
         }
      }
   }

   private static NumberFormatException b(NumberFormatException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21525;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/sf", var10);
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
         d[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/sf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16478;
      if (j[var3] == null) {
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
            throw new RuntimeException("su/catlean/sf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
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
         throw new RuntimeException("su/catlean/sf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
