package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.gofra.Flow;

public final class y4 extends k9 {
   @NotNull
   public static final y4 l;
   static final KProperty[] X;
   @NotNull
   private static final zn c;
   @NotNull
   private static final zn O;
   @NotNull
   private static final zo W;
   @NotNull
   private static final Map K;
   private static boolean u;
   private static boolean V;
   private static int x;
   private static boolean Q;
   private static final long b = j0.a(-2451513601553088346L, 8663871776803859794L, MethodHandles.lookup().lookupClass()).a(168828126161995L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f;

   private y4(long var1, byte var3) {
      long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ b;
      long var6 = var4 ^ 78914358917123L;
      super(var6, true.w<invokedynamic>(17447, 6124166824700427007L ^ var4), pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final zu s(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 98489686395307L;
      int var3 = (int)((var1 ^ 98489686395307L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (zu)c.k((short)var3, this, X[0], (short)var4, var5);
   }

   private final zu c(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 90883651694505L;
      int var3 = (int)((var1 ^ 90883651694505L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (zu)O.k((short)var3, this, X[1], (short)var4, var5);
   }

   private final boolean S(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 1505458189920L;
      int var3 = (int)((var1 ^ 1505458189920L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)W.k((short)var3, this, X[2], (short)var4, var5);
   }

   @Flow
   private final void F(TickEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void V(long param1) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit A() {
      // $FF: Couldn't be decompiled
   }

   private static final boolean m() {
      long var0 = b ^ 14757416897507L;
      boolean var2 = -205503161530908794L.A<invokedynamic>(-205503161530908794L, var0);

      boolean var10000;
      label32: {
         try {
            var10000 = V;
            if (!var2) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (NumberFormatException var3) {
            throw var3.A<invokedynamic>(var3, -190405785798188208L, var0);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   private static final Unit h() {
      // $FF: Couldn't be decompiled
   }

   private static final boolean w() {
      long var0 = b ^ 65399538314878L;
      boolean var2 = -7426334088061390728L.A<invokedynamic>(-7426334088061390728L, var0);

      boolean var10000;
      label32: {
         try {
            var10000 = u;
            if (var2) {
               return var10000;
            }

            if (!var10000) {
               break label32;
            }
         } catch (NumberFormatException var3) {
            throw var3.A<invokedynamic>(var3, -7438050052872239411L, var0);
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   static {
      long var16 = b ^ 3363897043644L;
      long var18 = var16 ^ 92876311084340L;
      long var10001 = var16 ^ 19882237807043L;
      long var20 = (var16 ^ 19882237807043L) >>> 8;
      int var22 = (int)(var10001 << 56 >>> 56);
      var10001 = var16 ^ 64121999904042L;
      int var23 = (int)((var16 ^ 64121999904042L) >>> 56);
      int var24 = (int)(var10001 << 8 >>> 32);
      int var25 = (int)(var10001 << 40 >>> 40);
      f = new HashMap(13);
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var16 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[10];
      int var12 = 0;
      String var11 = "|÷\u0092ÃÖ\u0094¬;\u001aïFR\u0013Ýð§V\u000e×\u009d\u001dü=¢9\u0007°a\u001c\u0098¯] ÷w\u0084Æ m\u0004-¼]\u009e\u001bÐí\u0085ðñÎ\u0019\u008f\u0011Å«\u0085\u0086j?\u0010w\u0080J³\u0010Õy½x\u0083\u007f¢\u0011\u0012gI6¼Zfð(\u0098w]F\u0006ØôVA\u008fõ(]÷\u008f<WI[cP(\u0001Ìj\u001dA¶;âª¾\u0001\u001b2ÖBi®\u008dH\u0096`¶\u000fl]4\u001d@<x\u0004\u0089PÜ\n#\b\u0086Fxy\u0017½\u0082\u0095õ\u009f@\u0088ä×¿¹þ?Â\u0013lÄ\u008dIÖöÈÓä\u0092\u0087\u0006÷*\u008f\u008aQë\u0084\\?x~Ý_7äZz\u0016\u009cà\u008d%0\u008b\u009aD{î\u0080\u0015\u0080.º\u0097SîTÒ<=\u0081»J;\u0015h\u008bãiTbP@½%´\u0092\u0002\u008a\u0081\u0088{\u001bs|x#5-¤\u008f £\u001d\u009bÑhÒ¿ïÿ\u0017\u009a.\u0013À\u0010Ä\u001fü¬@ 3\u0010.ÆâÁ4Õ\u007fï' \u0089 \u008fhàÑ\u0013¤¡È_¹\u0089ÓH²\u0085Hh¬4ÃM8Öûñ\u0086ÌD\u0087o";
      int var13 = "|÷\u0092ÃÖ\u0094¬;\u001aïFR\u0013Ýð§V\u000e×\u009d\u001dü=¢9\u0007°a\u001c\u0098¯] ÷w\u0084Æ m\u0004-¼]\u009e\u001bÐí\u0085ðñÎ\u0019\u008f\u0011Å«\u0085\u0086j?\u0010w\u0080J³\u0010Õy½x\u0083\u007f¢\u0011\u0012gI6¼Zfð(\u0098w]F\u0006ØôVA\u008fõ(]÷\u008f<WI[cP(\u0001Ìj\u001dA¶;âª¾\u0001\u001b2ÖBi®\u008dH\u0096`¶\u000fl]4\u001d@<x\u0004\u0089PÜ\n#\b\u0086Fxy\u0017½\u0082\u0095õ\u009f@\u0088ä×¿¹þ?Â\u0013lÄ\u008dIÖöÈÓä\u0092\u0087\u0006÷*\u008f\u008aQë\u0084\\?x~Ý_7äZz\u0016\u009cà\u008d%0\u008b\u009aD{î\u0080\u0015\u0080.º\u0097SîTÒ<=\u0081»J;\u0015h\u008bãiTbP@½%´\u0092\u0002\u008a\u0081\u0088{\u001bs|x#5-¤\u008f £\u001d\u009bÑhÒ¿ïÿ\u0017\u009a.\u0013À\u0010Ä\u001fü¬@ 3\u0010.ÆâÁ4Õ\u007fï' \u0089 \u008fhàÑ\u0013¤¡È_¹\u0089ÓH²\u0085Hh¬4ÃM8Öûñ\u0086ÌD\u0087o".length();
      char var10 = ' ';
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var27 = var11.substring(var9, var9 + var10);
         byte var29 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var27.getBytes("ISO-8859-1"));
            String var32 = b(var15).intern();
            switch(var29) {
            case 0:
               var14[var12++] = var32;
               if ((var9 += var10) >= var13) {
                  d = var14;
                  e = new String[10];
                  Cipher var2;
                  var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var3 = 1; var3 < 8; ++var3) {
                     var10003[var3] = (byte)((int)(var16 << var3 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var4 = -2383208760292140919L;
                  byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                  long var35 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                  boolean var33 = true;
                  long var0 = var35;
                  KProperty[] var26 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y4.class, true.w<invokedynamic>(9579, 134405598309246295L ^ var16), true.w<invokedynamic>(17588, 766500932891280516L ^ var16), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y4.class, true.w<invokedynamic>(31093, 1706930247626307907L ^ var16), true.w<invokedynamic>(92, 4291538130032803949L ^ var16), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y4.class, true.w<invokedynamic>(7693, 7186790860958457400L ^ var16), true.w<invokedynamic>(8072, 7407668475318034367L ^ var16), 0)))};
                  X = var26;
                  l = new y4(var20, (byte)var22);
                  c = qi.w((il)l, true.w<invokedynamic>(27865, 5341672909371190500L ^ var16), (byte)var23, y4::A, (pj)null, var24, y4::m, 4, var25, (Object)null);
                  O = qi.w((il)l, true.w<invokedynamic>(28154, 767223967483211208L ^ var16), (byte)var23, y4::h, (pj)null, var24, y4::w, 4, var25, (Object)null);
                  W = qi.R((il)l, true.w<invokedynamic>(2944, 288894844409433012L ^ var16), false, (pj)null, (Function0)null, (int)var0, var18, (Object)null);
                  K = (Map)(new LinkedHashMap());
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var32;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "Öµö°\u000fæa\u0094{eE`7ð1³Ñ\u008fUy/°H\u008c¶+\u0097}\u0003%ºr ,<Z8¸Jlv\bJÇÛ9>J\u0001ZpáDêº\u008fñ\u000e\u000eÒõ¥k\u009e\u001e";
               var13 = "Öµö°\u000fæa\u0094{eE`7ð1³Ñ\u008fUy/°H\u008c¶+\u0097}\u0003%ºr ,<Z8¸Jlv\bJÇÛ9>J\u0001ZpáDêº\u008fñ\u000e\u000eÒõ¥k\u009e\u001e".length();
               var10 = ' ';
               var9 = -1;
            }

            ++var9;
            var27 = var11.substring(var9, var9 + var10);
            var29 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23968;
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
            throw new RuntimeException("su/catlean/y4", var10);
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
         throw new RuntimeException("su/catlean/y4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
