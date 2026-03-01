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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.gofra.Flow;

public final class oe extends k9 {
   @NotNull
   public static final oe u;
   static final KProperty[] N;
   @NotNull
   private static final zr J;
   @NotNull
   private static final zo C;
   private static final long b = j0.a(-7112779151193076484L, 8228716114417858763L, MethodHandles.lookup().lookupClass()).a(114282100629080L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private oe(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 136271714906118L;
      super(var3, true.i<invokedynamic>(24601, 6577641793752300315L ^ var1), pa.w(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final uw I(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 8175693931722L;
      int var3 = (int)((var1 ^ 8175693931722L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (uw)J.k((short)var3, this, N[0], (short)var4, var5);
   }

   private final void n(uw var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 23677477513987L;
      int var4 = (int)((var2 ^ 23677477513987L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      J.P(this, var4, N[0], (short)var5, var1, (short)var6);
   }

   private final boolean K(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 775567767894L;
      int var3 = (int)((var1 ^ 775567767894L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)C.k((short)var3, this, N[1], (short)var4, var5);
   }

   private final void o(boolean var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 3381727427657L;
      int var4 = (int)((var2 ^ 3381727427657L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      C.P(this, var4, N[1], (short)var5, var1, (short)var6);
   }

   @Flow
   private final void T(AfterSendPacket param1) {
      // $FF: Couldn't be decompiled
   }

   private final class_2338 W(short param1, int param2, short param3) {
      // $FF: Couldn't be decompiled
   }

   public final boolean G(long param1) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit Q(class_2338 var0) {
      long var1 = b ^ 87664242108330L;
      long var3 = var1 ^ 69779883933084L;
      long var5 = var1 ^ 89893692362812L;
      s8.r(var3).method_2896(s8.f(var5), class_1268.field_5808, new class_3965(new class_243((double)var0.method_10263() + 0.5D, (double)var0.method_10084().method_10264(), (double)var0.method_10260() + 0.0D), class_2350.field_11036, var0, false));
      return Unit.INSTANCE;
   }

   private static final Unit f(class_2338 var0) {
      long var1 = b ^ 18830233690564L;
      long var3 = var1 ^ 107667453443058L;
      long var5 = var1 ^ 16873533511250L;
      s8.r(var3).method_2896(s8.f(var5), class_1268.field_5808, new class_3965(new class_243((double)var0.method_10263() + 0.5D, (double)var0.method_10084().method_10264() + 0.125D, (double)var0.method_10260() + 0.5D), class_2350.field_11036, var0.method_10084(), false));
      return Unit.INSTANCE;
   }

   private static final Unit P(s1 var0, class_2338 var1) {
      long var2 = b ^ 23204787291715L;
      long var4 = var2 ^ 46707476558496L;
      long var10001 = var2 ^ 77487646055303L;
      int var6 = (int)((var2 ^ 77487646055303L) >>> 32);
      int var7 = (int)(var10001 << 32 >>> 56);
      int var8 = (int)(var10001 << 40 >>> 40);
      long var9 = var2 ^ 35757372297300L;
      dk.I.X(var0.I(), var6, (byte)var7, var8, u.I(var9), oe::Q);
      dk var10000 = dk.I;
      class_1792 var11 = class_1802.field_8069;
      Intrinsics.checkNotNullExpressionValue(var11, true.i<invokedynamic>(9737, 3417642336352052665L ^ var2));
      var10000.Z(var11, u.I(var9), oe::f, var4);
      return Unit.INSTANCE;
   }

   static {
      long var20 = b ^ 50703644296912L;
      long var22 = var20 ^ 66447653475359L;
      long var24 = var20 ^ 15796709348332L;
      long var26 = var20 ^ 3516765760938L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[25];
      int var16 = 0;
      String var15 = "rTº\u0087â@\u0005U%Ç\n#é\u0007\u009a§Àî\u0081\u009bK»0K`\u008f'KÎä/Í0\u0081\u0091Á\u0083\u0016¯¹t?9\u008aìì\u0002D9Ë\u0088%\u0014sÖç\u0003k2\u0096Oé\u0011£Á\u008c\u009a\u0005ù\u0087Ö+©\u0096Ù°õ©\u001c¥\u0097 4\u0084\u000eiàÙÇ\u008d³!I«ýË\u009b\u001d&$×V\u0010!&8!\u0083æcñ~\u0018Ï0Ë±ë\r\u0004\u0097ðw\u009ei\u008få\u0087\u0001ydCiÿà*\u000e\n]\u0087/\u0012æ_pêÇG\u0090&i¥äü\nxO\u0096Ø£Ý]\u0094\u0018Û\u0004½·.1\u00989\u008fß§\u008fí\u0011v¤÷à\u001a\u00160\u0080\u001d\u0091\u0010ö\u0006\\º(Þ¶S\u009aÊ-G\u007f«\u0006\u0081\u0010\u001f0ø\u0011DÁ¤M°^Çõ.\u0012\\? 8Ä ýÁ\u0017S\nÞ\u0080h\u000fk±Ö8Õ¯öj#Oå8öý\u0000,,wFû(ê«#ó´%Òq*[\u0001¼#\u0012\nPpF¶\u000e§öS,\u0017Ô\u009d8â?\u0013\u008fº\u0005¢\u009cùãÒö  ße|\u001dJ4©ÒFÀC·)j\u007f\u007fi\u001a\u00860þ=@ûsëwÜSá»\u0010\u0091¾¼)/¬\u001a~ö\u0083\u0003c¿\u007ff§(¢\n×ß\fØ<P\tÆiº2\u0003Ú\u0097xtóS\u0085Hò|\u008e¦\u0097ÜhT;ûª5ù|4Y\u0082\u0097\u0010>*Mï\u0085\u0085Dq®\u001efÄ¤\u0003a2\u0018@EP\u008e^½\u0001lkG\u001bûnþsMo\bÕ\u008f;e!Û\u0018%Âz°SÞ\t÷¢0_¼ûËm\u001a`y;`EroÉ\u0018K\u0006o¤+\u0084æ%9.¦\u0098\u00947tx°#(ßF®fÏ È\b$[úÕN\u008d@®pF0\u0081\u009bÝ\u0010\u001bÑ7³\u0092\u001exLó{\u0017\u001ad©_ 0±\u0080\u0092\u0089fm\u0099\u008eÒR\u0000\u0098\u001eû\u001eBk4ê²²`fE´\u001d%<Þby\u0018¦\u009dyO\u0080\u0018BTÖU#([Å\u009b/<\u0007H&\b°\u0015Ç ±8ØÐ\u009aLò\u001efÏËXV>\u001b\"¿ªæä,-ÏôÔq2x\u009b)Þ5\u0010\u008cðíK \u0013w\u0086ò÷na\u0016:tA â\u008eÒÖ¡^\u0093Õ«¦m\u0082Óß\u0005þê\u009cÓô\u0082À,\u0018\u0091\b\u001e¤\u0006p¬á(ò\nÙ~\u0099\u001cU< CJÛ`Tc= \u001c\u0096H[ð\u0083K0\u009eïwï~k©\u008f&ª³A\u000f<ç";
      int var17 = "rTº\u0087â@\u0005U%Ç\n#é\u0007\u009a§Àî\u0081\u009bK»0K`\u008f'KÎä/Í0\u0081\u0091Á\u0083\u0016¯¹t?9\u008aìì\u0002D9Ë\u0088%\u0014sÖç\u0003k2\u0096Oé\u0011£Á\u008c\u009a\u0005ù\u0087Ö+©\u0096Ù°õ©\u001c¥\u0097 4\u0084\u000eiàÙÇ\u008d³!I«ýË\u009b\u001d&$×V\u0010!&8!\u0083æcñ~\u0018Ï0Ë±ë\r\u0004\u0097ðw\u009ei\u008få\u0087\u0001ydCiÿà*\u000e\n]\u0087/\u0012æ_pêÇG\u0090&i¥äü\nxO\u0096Ø£Ý]\u0094\u0018Û\u0004½·.1\u00989\u008fß§\u008fí\u0011v¤÷à\u001a\u00160\u0080\u001d\u0091\u0010ö\u0006\\º(Þ¶S\u009aÊ-G\u007f«\u0006\u0081\u0010\u001f0ø\u0011DÁ¤M°^Çõ.\u0012\\? 8Ä ýÁ\u0017S\nÞ\u0080h\u000fk±Ö8Õ¯öj#Oå8öý\u0000,,wFû(ê«#ó´%Òq*[\u0001¼#\u0012\nPpF¶\u000e§öS,\u0017Ô\u009d8â?\u0013\u008fº\u0005¢\u009cùãÒö  ße|\u001dJ4©ÒFÀC·)j\u007f\u007fi\u001a\u00860þ=@ûsëwÜSá»\u0010\u0091¾¼)/¬\u001a~ö\u0083\u0003c¿\u007ff§(¢\n×ß\fØ<P\tÆiº2\u0003Ú\u0097xtóS\u0085Hò|\u008e¦\u0097ÜhT;ûª5ù|4Y\u0082\u0097\u0010>*Mï\u0085\u0085Dq®\u001efÄ¤\u0003a2\u0018@EP\u008e^½\u0001lkG\u001bûnþsMo\bÕ\u008f;e!Û\u0018%Âz°SÞ\t÷¢0_¼ûËm\u001a`y;`EroÉ\u0018K\u0006o¤+\u0084æ%9.¦\u0098\u00947tx°#(ßF®fÏ È\b$[úÕN\u008d@®pF0\u0081\u009bÝ\u0010\u001bÑ7³\u0092\u001exLó{\u0017\u001ad©_ 0±\u0080\u0092\u0089fm\u0099\u008eÒR\u0000\u0098\u001eû\u001eBk4ê²²`fE´\u001d%<Þby\u0018¦\u009dyO\u0080\u0018BTÖU#([Å\u009b/<\u0007H&\b°\u0015Ç ±8ØÐ\u009aLò\u001efÏËXV>\u001b\"¿ªæä,-ÏôÔq2x\u009b)Þ5\u0010\u008cðíK \u0013w\u0086ò÷na\u0016:tA â\u008eÒÖ¡^\u0093Õ«¦m\u0082Óß\u0005þê\u009cÓô\u0082À,\u0018\u0091\b\u001e¤\u0006p¬á(ò\nÙ~\u0099\u001cU< CJÛ`Tc= \u001c\u0096H[ð\u0083K0\u009eïwï~k©\u008f&ª³A\u000f<ç".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var29 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
            String var35 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var35;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[25];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "Ç\u009c·Bçú\u000eJvdZ¡,\u00ad\u0011\u0084àéw\tC×È\u0090";
                  int var5 = "Ç\u009c·Bçú\u000eJvdZ¡,\u00ad\u0011\u0084àéw\tC×È\u0090".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var33 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                     long[] var32 = var6;
                     var33 = var3++;
                     long var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var38 = -1;

                     while(true) {
                        long var8 = var37;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var40 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var38) {
                        case 0:
                           var32[var33] = var40;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[5];
                              KProperty[] var28 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(oe.class, true.i<invokedynamic>(11578, 2750672801994452486L ^ var20), true.i<invokedynamic>(27669, 2374252912809602853L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(oe.class, true.i<invokedynamic>(26436, 1186994748176884853L ^ var20), true.i<invokedynamic>(20127, 5971140051644927399L ^ var20), 0)))};
                              N = var28;
                              u = new oe(var26);
                              J = qi.M((il)u, true.i<invokedynamic>(9883, 5910780665075213730L ^ var20), (Enum)uw.SILENT_FULL, (pj)null, (Function0)null, true.n<invokedynamic>(793, 5200353733226628694L ^ var20), (Object)null, var22);
                              C = qi.R((il)u, true.i<invokedynamic>(900, 1060827426219163809L ^ var20), false, (pj)null, (Function0)null, true.n<invokedynamic>(21536, 5585775171806384494L ^ var20), var24, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var32[var33] = var40;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u008aü0Kl\u009d\rU%¬k\u009f*º\n\r";
                           var5 = "\u008aü0Kl\u009d\rU%¬k\u009f*º\n\r".length();
                           var2 = 0;
                        }

                        var33 = var2;
                        var2 += 8;
                        var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                        var32 = var6;
                        var33 = var3++;
                        var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var38 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var35;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "Ú\u0004äê\bÓ\u0093#Y³A\u0005\u008b5\u0082´Z\u007fÐ$PF;Nn\u0017A\u009e\u0092\u0019\u009f&\u0018å\u009cï\u000bg\u0097E\u0089j&cO!Ötï\u001cÿ¡Å¤R¿Ï";
               var17 = "Ú\u0004äê\bÓ\u0093#Y³A\u0005\u008b5\u0082´Z\u007fÐ$PF;Nn\u0017A\u009e\u0092\u0019\u009f&\u0018å\u009cï\u000bg\u0097E\u0089j&cO!Ötï\u001cÿ¡Å¤R¿Ï".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var29 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28799;
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
            throw new RuntimeException("su/catlean/oe", var10);
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
         throw new RuntimeException("su/catlean/oe" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30209;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/oe", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
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
         throw new RuntimeException("su/catlean/oe" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
