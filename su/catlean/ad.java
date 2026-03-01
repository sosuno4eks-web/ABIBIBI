package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class ad extends a_ {
   @NotNull
   private final zf R;
   @NotNull
   private final ba F;
   @NotNull
   private final aa I;
   @NotNull
   private final fs E;
   @NotNull
   private List V;
   private float Q;
   private static final long a = j0.a(-2581735405559300801L, 7338111181850426536L, MethodHandles.lookup().lookupClass()).a(29679284874600L);
   private static final String[] c;
   private static final String[] g;
   private static final Map h = new HashMap(13);
   private static final long[] i;
   private static final Integer[] j;
   private static final Map k;
   private static final long l;

   public ad(@NotNull zf setting, byte a, int a, int a, @NotNull ba module) {
      long var6 = ((long)var2 << 56 | (long)var3 << 32 >>> 8 | (long)var4 << 40 >>> 40) ^ a;
      long var8 = var6 ^ 105308574895357L;
      long var10 = var6 ^ 41400282960665L;
      long var12 = var6 ^ 25196458156048L;
      long var10001 = var6 ^ 127377664898969L;
      long var14 = (var6 ^ 127377664898969L) >>> 16;
      int var16 = (int)(var10001 << 48 >>> 48);
      long var17 = var6 ^ 61756254882786L;
      var10001 = var6 ^ 91678247635579L;
      int var19 = (int)((var6 ^ 91678247635579L) >>> 48);
      int var20 = (int)(var10001 << 16 >>> 48);
      int var21 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var1, true.l<invokedynamic>(10074, 200094256774837638L ^ var6));
      Intrinsics.checkNotNullParameter(var5, true.l<invokedynamic>(8396, 3315558665247650326L ^ var6));
      super(var12, var1);
      this.R = var1;
      this.F = var5;
      this.I = new aa(sa.OUT_QUINT, l, (short)var19, (short)var20, var21);
      this.E = new fs(true.l<invokedynamic>(9378, 4911761780473886329L ^ var6), var10, true.i<invokedynamic>(17147, 1265590883299123793L ^ var6), true.i<invokedynamic>(18158, 4903581377404855883L ^ var6));
      this.V = (List)(new ArrayList());
      if (((pj)this.t().B()).V() == r6.BOOLS) {
         float var22 = 0.0F;
         var22 = 2.0F;
         Iterable var24 = (Iterable)this.F.x().B();
         boolean var25 = false;
         Collection var27 = (Collection)(new ArrayList());
         boolean var28 = false;
         Iterator var29 = var24.iterator();

         label50:
         do {
            boolean var10000;
            Object var30;
            do {
               if (!var29.hasNext()) {
                  break label50;
               }

               var30 = var29.next();
               zf var31 = (zf)var30;
               boolean var32 = false;
               if (var4 <= 0) {
                  return;
               }

               var10000 = Intrinsics.areEqual((Object)var31.s(), (Object)this.t().B());
               if (var3 <= 0) {
                  continue label50;
               }
            } while(!var10000);

            var27.add(var30);
         } while(var3 >= 0);

         List var23 = (List)var27;
         var24 = (Iterable)var23;
         var25 = false;
         var24 = (Iterable)CollectionsKt.sortedWith(var24, (Comparator)(new iq()));
         var25 = false;
         Iterator var26 = var24.iterator();

         while(var26.hasNext()) {
            Object var35 = var26.next();
            zf var36 = (zf)var35;
            boolean var37 = false;
            String var38 = var36.m();
            float var39 = g3.X(var8).e(var17, var38) + 6.0F;
            if (var3 < 0) {
               break;
            }

            float var40;
            int var33 = (var40 = var22 + var39 - (this.L() - 10.0F)) == 0.0F ? 0 : (var40 < 0.0F ? -1 : 1);
            if (var2 >= 0) {
               if (var33 > 0) {
                  this.Q += 12.0F;
                  var22 = 2.0F;
               }

               List var34 = this.V;
               float var10004 = this.Q;
               char var10006 = (char)var16;
               Intrinsics.checkNotNull(var36, true.l<invokedynamic>(13148, 1538310781538427265L ^ var6));
               var34.add(new cj(var22, var10004, var14, var10006, var39, var36, (aa)null, true.i<invokedynamic>(7909, 629329632479821377L ^ var6), (DefaultConstructorMarker)null));
            }

            var22 += var39 + 2.0F;
            if (var3 < 0) {
               break;
            }
         }
      }

   }

   @NotNull
   public zf t() {
      return this.R;
   }

   @NotNull
   public final ba g() {
      return this.F;
   }

   public void v(@NotNull class_332 context, long a, char a, int mouseX, int mouseY, float factor) {
      // $FF: Couldn't be decompiled
   }

   public void d(double mouseX, double mouseY, long a, int button) {
      // $FF: Couldn't be decompiled
   }

   public void x(double mouseX, double mouseY, int button) {
   }

   public void Z(long a, int key) {
   }

   public void G(long a, char char) {
   }

   public boolean i(int a, int a, int a, double mouseX, double mouseY, double verticalAmount) {
      return false;
   }

   public void e() {
   }

   static {
      long var16 = a ^ 125485449787427L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[7];
      int var23 = 0;
      String var22 = "»ô\u009a¯\u0010ÞÔßEÃ=\u0090¦\u0001)\u009f\u008a³\u0006\u0080ÅY'C8\u0012\u0019\u009aiÃ¸\u008f\u0010Èô\t\f@)<\u0018·Z\u001f\u0004\u001c\u0018¡<\u0088¾4Þo\u0082!\u0095\u001b\u0017LÙµË|ct\u00ad\u001f\u0081_+JR&ÑöàX\u0096\u0081ÏÖ¦wûw<\u001aS¦4dË}-L8U:Ù&k©>$ú\u0089\u008aÇq¯\u008aõ¶\u0088\u0018\u008a=8\u001aÓP\u000fc\u0012z)\u0002èU\u000fX¢ø«6\u009fW¤6B8\u0006ªî\u0092POPéì\u0086x\u00897A\u008e¼è2DM\u0080\u0082®Ù*ØHÒ\u0099\u0006Æ9¾>~²Õò¡\u001e±?n%\u0010-ª\u0087l9\u0016=ýð¾ÜËÉ\u0001û\u0010\u0010àÈ.u¸ëë\u0007eíÕ\u001fÒåb\u0012";
      int var24 = "»ô\u009a¯\u0010ÞÔßEÃ=\u0090¦\u0001)\u009f\u008a³\u0006\u0080ÅY'C8\u0012\u0019\u009aiÃ¸\u008f\u0010Èô\t\f@)<\u0018·Z\u001f\u0004\u001c\u0018¡<\u0088¾4Þo\u0082!\u0095\u001b\u0017LÙµË|ct\u00ad\u001f\u0081_+JR&ÑöàX\u0096\u0081ÏÖ¦wûw<\u001aS¦4dË}-L8U:Ù&k©>$ú\u0089\u008aÇq¯\u008aõ¶\u0088\u0018\u008a=8\u001aÓP\u000fc\u0012z)\u0002èU\u000fX¢ø«6\u009fW¤6B8\u0006ªî\u0092POPéì\u0086x\u00897A\u008e¼è2DM\u0080\u0082®Ù*ØHÒ\u0099\u0006Æ9¾>~²Õò¡\u001e±?n%\u0010-ª\u0087l9\u0016=ýð¾ÜËÉ\u0001û\u0010\u0010àÈ.u¸ëë\u0007eíÕ\u001fÒåb\u0012".length();
      char var21 = ' ';
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var27 = var22.substring(var20, var20 + var21);
         byte var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = b(var26).intern();
            switch(var10001) {
            case 0:
               var25[var23++] = var33;
               if ((var20 += var21) >= var24) {
                  c = var25;
                  g = new String[7];
                  k = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[11];
                  int var8 = 0;
                  String var9 = "S>\u009apØ«^Å\u008cÉÌ>[\u0095ÏY¼Ä\u000b\b\u0019x \u009e¸y\u0005w\u001e\bèE!Ý½\u00ad\u0080s=Æ¼Pe.&Ì\u009e\u009d¤Äáy\u008319¦)(Q$'\u0081ÏQnÑC\u0000p\u000e0°";
                  int var10 = "S>\u009apØ«^Å\u008cÉÌ>[\u0095ÏY¼Ä\u000b\b\u0019x \u009e¸y\u0005w\u001e\bèE!Ý½\u00ad\u0080s=Æ¼Pe.&Ì\u009e\u009d¤Äáy\u008319¦)(Q$'\u0081ÏQnÑC\u0000p\u000e0°".length();
                  int var7 = 0;

                  label46:
                  while(true) {
                     int var31 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                     long[] var30 = var11;
                     var31 = var8++;
                     long var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte var37 = -1;

                     while(true) {
                        long var13 = var36;
                        byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                        long var39 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                        switch(var37) {
                        case 0:
                           var30[var31] = var39;
                           if (var7 >= var10) {
                              i = var11;
                              j = new Integer[11];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = 3876608599931688174L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var34 = true;
                              l = var36;
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var39;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "\u0002ê|àò»áçJ«Ò\u001fÀ\u00079\u0082";
                           var10 = "\u0002ê|àò»áçJ«Ò\u001fÀ\u00079\u0082".length();
                           var7 = 0;
                        }

                        var31 = var7;
                        var7 += 8;
                        var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                        var30 = var11;
                        var31 = var8++;
                        var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        var37 = 0;
                     }
                  }
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var33;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label64;
               }

               var22 = "2O\u008a-\u009dÿ1wl\u0097ñ¢ïV# \u0018äÏ °üÆíìÇ\u0007hÏ¶¡«\u0082s\u0010rùý`GÍ";
               var24 = "2O\u008a-\u009dÿ1wl\u0097ñ¢ïV# \u0018äÏ °üÆíìÇ\u0007hÏ¶¡«\u0082s\u0010rùý`GÍ".length();
               var21 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13314;
      if (g[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])h.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ad", var10);
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
         g[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return g[var5];
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
         throw new RuntimeException("su/catlean/ad" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18045;
      if (j[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ad", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
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
         throw new RuntimeException("su/catlean/ad" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
