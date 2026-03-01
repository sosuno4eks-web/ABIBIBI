package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2602;
import net.minecraft.class_2708;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.FinishUsingItemEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class y_ extends k9 {
   @NotNull
   public static final y_ o;
   static final KProperty[] N;
   @NotNull
   private static final z7 K;
   @NotNull
   private static final zv Q;
   private static boolean s;
   @NotNull
   private static final LinkedList O;
   private static final long b = j0.a(140911335386691468L, 7108376965961474955L, MethodHandles.lookup().lookupClass()).a(281452093482757L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   private y_(long var1, byte var3) {
      long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ b;
      long var6 = var4 ^ 140721236308648L;
      super(var6, true.g<invokedynamic>(18713, 4407910210094341234L ^ var4), pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final n_ T(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 135229107357294L;
      int var3 = (int)((var1 ^ 135229107357294L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (n_)K.k((short)var3, this, N[0], (short)var4, var5);
   }

   private final Color L(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 37355929398497L;
      int var3 = (int)((var1 ^ 37355929398497L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)Q.k((short)var3, this, N[1], (short)var4, var5);
   }

   public void n(long var1) {
      O.clear();
      s = false;
   }

   public void a(long var1) {
      long var3 = var1 ^ 80625255124458L;

      try {
         if (s) {
            this.m(var3);
         }

      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 4314963291160060627L, var1);
      }
   }

   @Flow
   public final void J(@NotNull Render3DEvent e) {
      long var2 = b ^ 82525087369536L;
      long var4 = var2 ^ 51982284894346L;
      long var6 = var2 ^ 96791002650492L;
      k9[] var10000 = 371394280716586114L.A<invokedynamic>(371394280716586114L, var2);
      Intrinsics.checkNotNullParameter(var1, "e");
      k9[] var8 = var10000;

      boolean var12;
      label40: {
         label39: {
            try {
               var12 = ((Collection)O).isEmpty();
               if (var8 == null) {
                  break label40;
               }

               if (!var12) {
                  break label39;
               }
            } catch (NumberFormatException var11) {
               throw var11.A<invokedynamic>(var11, 417337122686442744L, var2);
            }

            var12 = false;
            break label40;
         }

         var12 = true;
      }

      try {
         if (var12) {
            q1 var13 = q1.A;
            class_243 var10003 = ((class_2708)CollectionsKt.first((List)O)).comp_3228().comp_3148();
            Intrinsics.checkNotNull(var10003);
            var10003 = var10003.method_1031(-0.27D, 0.0D, -0.27D);
            class_243 var10004 = ((class_2708)CollectionsKt.first((List)O)).comp_3228().comp_3148();
            Intrinsics.checkNotNull(var10004);
            q1.B(var13, new class_238(var10003, var10004.method_1031(0.27D, 1.8D, 0.27D)), this.L(var6), (Color)null, 4, (Object)null, var4);
         }
      } catch (NumberFormatException var10) {
         throw var10.A<invokedynamic>(var10, 417337122686442744L, var2);
      }

      try {
         if (var8 == null) {
            (new int[5]).A<invokedynamic>(new int[5], 411954007058269708L, var2);
         }

      } catch (NumberFormatException var9) {
         throw var9.A<invokedynamic>(var9, 417337122686442744L, var2);
      }
   }

   @Flow
   public final void l(@NotNull InputEvent e) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void z(@NotNull ReceivePacket e) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void W(FinishUsingItemEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void m(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 116692544992636L;
      k9[] var10000 = -4954794860653055336L.A<invokedynamic>(-4954794860653055336L, var1);
      s = false;
      k9[] var5 = var10000;

      label21:
      while(true) {
         if (!O.isEmpty()) {
            ((class_2708)O.poll()).method_11740((class_2602)s8.Y(var3));
            if (var5 != null) {
               continue;
            }
         }

         while(var1 <= 0L) {
            if (var5 != null) {
               continue label21;
            }
         }

         return;
      }
   }

   static {
      long var20 = b ^ 63042529593777L;
      long var10001 = var20 ^ 74699278659159L;
      int var22 = (int)((var20 ^ 74699278659159L) >>> 32);
      int var23 = (int)(var10001 << 32 >>> 48);
      int var24 = (int)(var10001 << 48 >>> 48);
      var10001 = var20 ^ 59113962853086L;
      int var25 = (int)((var20 ^ 59113962853086L) >>> 32);
      int var26 = (int)(var10001 << 32 >>> 48);
      int var27 = (int)(var10001 << 48 >>> 48);
      long var28 = var20 ^ 14823490836968L;
      var10001 = var20 ^ 18097462796389L;
      long var30 = (var20 ^ 18097462796389L) >>> 8;
      int var32 = (int)(var10001 << 56 >>> 56);
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[8];
      int var16 = 0;
      String var15 = "\u0010\u001a\u0001\u0013÷j\u0010l,Û>ï+\fîh\u00039aq'\u0014\u0001¹\u008aØ\u000béâ\u0015¡i\u0010<Õ$d]}¿·ÿ?\u0098V%\u0081y´\u0010$Ï\u008fqÉ\u0012\u0099çiiu\u0000ÉH\"d0Ì\u0019ôZ2äþ¿\u0014W\"\u001b³*Ö\u0003WÂüb:!\u0097Ú\u000fL hÀ1Ì\u00984¨pM¸xJ\u0086Gw7\u0006ì×0ú\u0010¶îgÔ\u0017f{óæùÇó\u0002³þ<8ô\r\u008b&\u0081¿¹¦Ê\t\u0096Úøyæ\u009b%à)£¬\u0091BR\u0086vÀ¸¥\u0084\u007fÐä×ãj\bìªÖ°\u00837\u00adz\f\u0010@bþ\u000bo±\b\bã";
      int var17 = "\u0010\u001a\u0001\u0013÷j\u0010l,Û>ï+\fîh\u00039aq'\u0014\u0001¹\u008aØ\u000béâ\u0015¡i\u0010<Õ$d]}¿·ÿ?\u0098V%\u0081y´\u0010$Ï\u008fqÉ\u0012\u0099çiiu\u0000ÉH\"d0Ì\u0019ôZ2äþ¿\u0014W\"\u001b³*Ö\u0003WÂüb:!\u0097Ú\u000fL hÀ1Ì\u00984¨pM¸xJ\u0086Gw7\u0006ì×0ú\u0010¶îgÔ\u0017f{óæùÇó\u0002³þ<8ô\r\u008b&\u0081¿¹¦Ê\t\u0096Úøyæ\u009b%à)£¬\u0091BR\u0086vÀ¸¥\u0084\u007fÐä×ãj\bìªÖ°\u00837\u00adz\f\u0010@bþ\u000bo±\b\bã".length();
      char var14 = ' ';
      int var13 = -1;

      label55:
      while(true) {
         ++var13;
         String var41 = var15.substring(var13, var13 + var14);
         byte var45 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var41.getBytes("ISO-8859-1"));
            String var48 = b(var19).intern();
            switch(var45) {
            case 0:
               var18[var16++] = var48;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[8];
                  Cipher var1;
                  var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var2 = 1; var2 < 8; ++var2) {
                     var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var0 = new long[5];
                  int var4 = 0;
                  String var5 = "\u0002RÖ¢*°3iEC&!\u0012íÅO\u0010Äu\u001e¹Ï\u009d~";
                  int var6 = "\u0002RÖ¢*°3iEC&!\u0012íÅO\u0010Äu\u001e¹Ï\u009d~".length();
                  int var3 = 0;

                  label37:
                  while(true) {
                     int var50 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var50, var3).getBytes("ISO-8859-1");
                     long[] var43 = var0;
                     var50 = var4++;
                     long var51 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var52 = -1;

                     while(true) {
                        long var8 = var51;
                        byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var54 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var52) {
                        case 0:
                           var43[var50] = var54;
                           if (var3 >= var6) {
                              KProperty[] var40 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y_.class, true.g<invokedynamic>(21919, 6500597329637403976L ^ var20), true.g<invokedynamic>(8248, 4705749290097842408L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(y_.class, true.g<invokedynamic>(6059, 8805165530951954303L ^ var20), true.g<invokedynamic>(1565, 4178327157326200523L ^ var20), 0)))};
                              N = var40;
                              o = new y_(var30, (byte)var32);
                              il var44 = (il)o;
                              String var47 = 11076.g<invokedynamic>(11076, 1498983188508545941L ^ var20);
                              n_ var55 = new n_((int)var0[1], var25, (char)var26, false, (char)var27, false, (int)var0[3], (DefaultConstructorMarker)null);
                              int var10005 = (int)var0[0];
                              Object var33 = null;
                              int var34 = var10005;
                              Object var35 = null;
                              Object var36 = null;
                              n_ var37 = var55;
                              String var38 = var47;
                              il var39 = var44;
                              K = qi.b(var22, var39, var38, (char)var23, var37, (pj)var36, (Function0)var35, var34, var33, (short)var24);
                              Q = qi.F((il)o, true.g<invokedynamic>(4094, 6035143051692324652L ^ var20), new Color((int)var0[2]), (pj)null, (Function0)null, (int)var0[4], var28, (Object)null);
                              O = new LinkedList();
                              return;
                           }
                           break;
                        default:
                           var43[var50] = var54;
                           if (var3 < var6) {
                              continue label37;
                           }

                           var5 = "\u0091àÖ\u001fÕ¹\u001eÔ±ZÚh\u0003\u008f\u0088x";
                           var6 = "\u0091àÖ\u001fÕ¹\u001eÔ±ZÚh\u0003\u008f\u0088x".length();
                           var3 = 0;
                        }

                        var50 = var3;
                        var3 += 8;
                        var7 = var5.substring(var50, var3).getBytes("ISO-8859-1");
                        var43 = var0;
                        var50 = var4++;
                        var51 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var52 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var48;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label55;
               }

               var15 = "\u0081açîò>|DI\u0082^\u0081÷\t:/É\u0081UHIr\u000e6¼Õa\u0095¸\u009bP¯l\u0082z¬\u0007\bn\u0090\u0007|G8ö+\u0087\u008cGãý\u0000nÇÉ öh\r©Ú¤±\u000f(ðNM<\u009a\u0093ú\u001dB¥\u0003Aê\bî×\u008d\u0011\u0014Ô'¯m\u00825f\u009b\u00ad¯\u008e\u0013Å¹Þ\n6ø\u009aE\u0010´ÐAzát}M\u0091\u0086\u0011\u00adá\u0096¯!|û¬\u0017Ã*\u0092Íö]cÁÌìë\u0014¥*lötºN#\u0002Ì\u0001lN!\u00867Yí½é\u009fj#@\u00104\u0017¼Hn7üã\u000b\u009bëÛ´Æ\u0010 {\u00961³¹þZ\u001b¾ÊdÎ\bæY";
               var17 = "\u0081açîò>|DI\u0082^\u0081÷\t:/É\u0081UHIr\u000e6¼Õa\u0095¸\u009bP¯l\u0082z¬\u0007\bn\u0090\u0007|G8ö+\u0087\u008cGãý\u0000nÇÉ öh\r©Ú¤±\u000f(ðNM<\u009a\u0093ú\u001dB¥\u0003Aê\bî×\u008d\u0011\u0014Ô'¯m\u00825f\u009b\u00ad¯\u008e\u0013Å¹Þ\n6ø\u009aE\u0010´ÐAzát}M\u0091\u0086\u0011\u00adá\u0096¯!|û¬\u0017Ã*\u0092Íö]cÁÌìë\u0014¥*lötºN#\u0002Ì\u0001lN!\u00867Yí½é\u009fj#@\u00104\u0017¼Hn7üã\u000b\u009bëÛ´Æ\u0010 {\u00961³¹þZ\u001b¾ÊdÎ\bæY".length();
               var14 = 176;
               var13 = -1;
            }

            ++var13;
            var41 = var15.substring(var13, var13 + var14);
            var45 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15551;
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
            throw new RuntimeException("su/catlean/y_", var10);
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
         throw new RuntimeException("su/catlean/y_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
