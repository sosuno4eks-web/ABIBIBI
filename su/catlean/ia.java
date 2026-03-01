package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.text.StringsKt;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ia {
   @NotNull
   public static final ia v;
   private static float b;
   private static float G;
   private static float I;
   private static float P;
   @Nullable
   private static mm Y;
   @Nullable
   private static mm H;
   @NotNull
   private static List z;
   private static float u;
   @NotNull
   private static String p;
   private static boolean W;
   private static boolean r;
   @NotNull
   private static final aa M;
   @NotNull
   private static final aa o;
   @NotNull
   private static final aa m;
   @NotNull
   private static final fs d;
   @NotNull
   private static final fs U;
   private static String[] s;
   private static final long a = j0.a(2159296026282282088L, 4242750128453797543L, MethodHandles.lookup().lookupClass()).a(58014701244650L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;
   private static final long[] j;
   private static final Long[] k;
   private static final Map l;

   private ia() {
   }

   public final float m() {
      return b;
   }

   public final void V(float <set-?>) {
      b = var1;
   }

   public final float k() {
      return G;
   }

   public final void s(float <set-?>) {
      G = var1;
   }

   @NotNull
   public final fs j() {
      return U;
   }

   public final void L(@NotNull class_332 context, int mouseX, long a, int mouseY) {
      // $FF: Couldn't be decompiled
   }

   public final void x(double mouseX, long a, double mouseY, int button) {
      // $FF: Couldn't be decompiled
   }

   public final void h(double mouseX, long a, double mouseY, int button) {
      // $FF: Couldn't be decompiled
   }

   public final void Z(int keyCode, int scanCode, int modifiers, int a, int a, byte a) {
      // $FF: Couldn't be decompiled
   }

   private final void g(char var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 140333949929270L;
      long var10001 = var4 ^ 23830502052447L;
      long var8 = (var4 ^ 23830502052447L) >>> 16;
      int var10 = (int)(var10001 << 48 >>> 48);
      String[] var11 = -948401823525281625L.A<invokedynamic>(-948401823525281625L, var4);

      boolean var10000;
      label22: {
         label21: {
            try {
               var10000 = StringsKt.isBlank((CharSequence)p);
               if (var11 == null) {
                  break label22;
               }

               if (!var10000) {
                  break label21;
               }
            } catch (NumberFormatException var14) {
               throw var14.A<invokedynamic>(var14, -942826711499366250L, var4);
            }

            var10000 = false;
            break label22;
         }

         z8 var12 = z8.I;
         boolean var13 = false;
         var10001 = 4225191554718306711L ^ var4;
         c0.S.v().I(var8, (short)var10).add(new mm(p, var6, var12.O(), var12.T(), var12.F(), var12.r(), var12.E(), var12.M(), var12.N(), var12.h(), var12.a(), var12.U(), var12.V(), var12.p()));
         W = false;
         p = true.g<invokedynamic>(32258, var10001);
         return;
      }

      W = var10000;
      p = true.g<invokedynamic>(32258, 4225191554718306711L ^ var4);
   }

   public final void w(long a, char chr, char a) {
      // $FF: Couldn't be decompiled
   }

   public final boolean Z(double mX, double mY, short a, double amount, short a, int a) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var31 = a ^ 12746650515495L;
      long var33 = var31 ^ 69820587206700L;
      long var10001 = var31 ^ 82641804046129L;
      int var35 = (int)((var31 ^ 82641804046129L) >>> 48);
      int var36 = (int)(var10001 << 16 >>> 48);
      int var37 = (int)(var10001 << 32 >>> 32);
      var10001 = var31 ^ 80567664570702L;
      int var38 = (int)((var31 ^ 80567664570702L) >>> 48);
      int var39 = (int)(var10001 << 16 >>> 48);
      int var40 = (int)(var10001 << 32 >>> 32);
      String[] var10000 = new String[5];
      f = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -2563272119534876026L, var31);
      Cipher var22;
      Cipher var41 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var23 = 1; var23 < 8; ++var23) {
         var10003[var23] = (byte)((int)(var31 << var23 * 8 >>> 56));
      }

      var41.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[12];
      int var27 = 0;
      String var26 = "ð\u001a\\ã\u0080Ýfø{\u0091^h7\u0099npö#÷^½ gRV&5o,\u0088¤\u0011\u0018åRq©/Qµ÷\u0089u»r\\híW\u0089i`0Ô~y¤\u00103té8F-®¯W\u0095\u00888ñ0\u001fö\u0018T¹ý\t6ß×ä\u0089\u0095À³&aQø\u0095©<ÞÔ\u0084óZ f_òÇx\u0000¿·½¼\u0099o×+«ÔÕktF0M¯Àßºj\u0084FÈwØ\u0010\u009f ³ÉÞB=FÄ \u00171!A4\u0005\u0010O\u0005\u008aÉÆl\u000b\u0091\u0098\u007fnl\u008d¶(\u000f\u00180¨\u0015Õ\u0017âÔ\u008b\u0084\fÓ×Ç$jªA\u0099\bÊ¹ÊI>\u0010£ä\u0015â8/\u000fZ\u0004Ù{\u001e\u0088\u0012ßè \u0017\u0019\u000fÙ\\¶Ó\u0013%8\u0005î\u0089]wf\u0004b©Û!C\u0016õ\u0004Ê\u0015\u000e\u0096c\u0087»";
      int var28 = "ð\u001a\\ã\u0080Ýfø{\u0091^h7\u0099npö#÷^½ gRV&5o,\u0088¤\u0011\u0018åRq©/Qµ÷\u0089u»r\\híW\u0089i`0Ô~y¤\u00103té8F-®¯W\u0095\u00888ñ0\u001fö\u0018T¹ý\t6ß×ä\u0089\u0095À³&aQø\u0095©<ÞÔ\u0084óZ f_òÇx\u0000¿·½¼\u0099o×+«ÔÕktF0M¯Àßºj\u0084FÈwØ\u0010\u009f ³ÉÞB=FÄ \u00171!A4\u0005\u0010O\u0005\u008aÉÆl\u000b\u0091\u0098\u007fnl\u008d¶(\u000f\u00180¨\u0015Õ\u0017âÔ\u008b\u0084\fÓ×Ç$jªA\u0099\bÊ¹ÊI>\u0010£ä\u0015â8/\u000fZ\u0004Ù{\u001e\u0088\u0012ßè \u0017\u0019\u000fÙ\\¶Ó\u0013%8\u0005î\u0089]wf\u0004b©Û!C\u0016õ\u0004Ê\u0015\u000e\u0096c\u0087»".length();
      char var25 = ' ';
      int var24 = -1;

      label72:
      while(true) {
         ++var24;
         String var42 = var26.substring(var24, var24 + var25);
         byte var44 = -1;

         while(true) {
            byte[] var30 = var22.doFinal(var42.getBytes("ISO-8859-1"));
            String var49 = a(var30).intern();
            switch(var44) {
            case 0:
               var29[var27++] = var49;
               if ((var24 += var25) >= var28) {
                  c = var29;
                  e = new String[12];
                  i = new HashMap(13);
                  Cipher var11;
                  var41 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var12 = 1; var12 < 8; ++var12) {
                     var10003[var12] = (byte)((int)(var31 << var12 * 8 >>> 56));
                  }

                  var41.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[16];
                  int var14 = 0;
                  String var15 = "\u0097]Fèlíó³X>®Û-\n;\u0093Þ÷\u0017y÷¸\u0096é\u0083\u0019*©¹¥õñg\u0098`ìC2 YÄ*\u001eç<è\u0094_½Ì\u009bÁ\u0083h§úxì|,Bäù($fqV\u001eÁp´÷X*¢ù\u007f\u0089¶^\u007fËÛú!Áü\u0004Ý\u0011|\u001c_ìG:\u001e)\u0092yÐ\u0010%Zy\u0093¸4\n\u0000\n";
                  int var16 = "\u0097]Fèlíó³X>®Û-\n;\u0093Þ÷\u0017y÷¸\u0096é\u0083\u0019*©¹¥õñg\u0098`ìC2 YÄ*\u001eç<è\u0094_½Ì\u009bÁ\u0083h§úxì|,Bäù($fqV\u001eÁp´÷X*¢ù\u007f\u0089¶^\u007fËÛú!Áü\u0004Ý\u0011|\u001c_ìG:\u001e)\u0092yÐ\u0010%Zy\u0093¸4\n\u0000\n".length();
                  int var13 = 0;

                  label54:
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
                        long var56 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                        switch(var53) {
                        case 0:
                           var45[var50] = var56;
                           if (var13 >= var16) {
                              g = var17;
                              h = new Integer[16];
                              l = new HashMap(13);
                              Cipher var0;
                              var41 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var31 << var1 * 8 >>> 56));
                              }

                              var41.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long[] var6 = new long[3];
                              int var3 = 0;
                              String var4 = "KÛÇ\u000b\u009c\u0097J\u0095LË'ò\u0001\u000f\u008aê\u0000\u001a\u009eÀ\u0001\u0080\u009fÂ";
                              int var5 = "KÛÇ\u000b\u009c\u0097J\u0095LË'ò\u0001\u000f\u008aê\u0000\u001a\u009eÀ\u0001\u0080\u009fÂ".length();
                              int var2 = 0;

                              do {
                                 var50 = var2;
                                 var2 += 8;
                                 byte[] var7 = var4.substring(var50, var2).getBytes("ISO-8859-1");
                                 var50 = var3++;
                                 long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                 byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                 var56 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                 boolean var57 = true;
                                 var6[var50] = var56;
                              } while(var2 < var5);

                              j = var6;
                              k = new Long[3];
                              v = new ia();
                              b = 120.0F;
                              G = 270.0F;
                              float var48 = (float)s8.H((short)var35, (short)var36, var37).method_22683().method_4486();
                              ia var55 = v;
                              I = var48 - b - 5.0F;
                              var48 = (float)s8.H((short)var35, (short)var36, var37).method_22683().method_4502() / 2.0F;
                              var55 = v;
                              P = var48 - G / 2.0F;
                              z = (List)(new ArrayList());
                              p = true.g<invokedynamic>(32258, 4225198562929688370L ^ var31);
                              M = new aa(sa.OUT_QUINT, true.f<invokedynamic>(29195, 6230583754493752956L ^ var31), (short)var38, (short)var39, var40);
                              o = new aa(sa.OUT_QUINT, true.f<invokedynamic>(894, 2471527957773813512L ^ var31), (short)var38, (short)var39, var40);
                              m = new aa(sa.OUT_QUINT, true.f<invokedynamic>(894, 2471527957773813512L ^ var31), (short)var38, (short)var39, var40);
                              d = new fs(true.g<invokedynamic>(2509, 1152691418685720831L ^ var31), var33, true.m<invokedynamic>(25781, 2512288603826988193L ^ var31), true.m<invokedynamic>(1470, 7454068697136940452L ^ var31));
                              U = new fs(true.g<invokedynamic>(29307, 759418746175664972L ^ var31), var33, true.m<invokedynamic>(1470, 7454068697136940452L ^ var31), true.m<invokedynamic>(1470, 7454068697136940452L ^ var31));
                              return;
                           }
                           break;
                        default:
                           var45[var50] = var56;
                           if (var13 < var16) {
                              continue label54;
                           }

                           var15 = "\u0091ßhóí}y+\u000fán\u0090æVr\\";
                           var16 = "\u0091ßhóí}y+\u000fán\u0090æVr\\".length();
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
                  continue label72;
               }

               var26 = "¦Ê\u0084L\taLwú\u008dÞ\u0080½%dó#\rb±\u0083ÿ\u0087/\u0099Uø-Ïª\u0011K \u0007\u0016Ñµ\u001fýà\u001fÊ\u001e²ã¡r®\u0087\t0Á)\u000bØ(rJU1Ã1\u0090é{";
               var28 = "¦Ê\u0084L\taLwú\u008dÞ\u0080½%dó#\rb±\u0083ÿ\u0087/\u0099Uø-Ïª\u0011K \u0007\u0016Ñµ\u001fýà\u001fÊ\u001e²ã¡r®\u0087\t0Á)\u000bØ(rJU1Ã1\u0090é{".length();
               var25 = ' ';
               var24 = -1;
            }

            ++var24;
            var42 = var26.substring(var24, var24 + var25);
            var44 = 0;
         }
      }
   }

   public static void D(String[] var0) {
      s = var0;
   }

   public static String[] Z() {
      return s;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7385;
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
            throw new RuntimeException("su/catlean/ia", var10);
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
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/ia" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7665;
      if (h[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ia", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("su/catlean/ia" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22942;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = j[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ia", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         k[var3] = var15;
      }

      return k[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/ia" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
