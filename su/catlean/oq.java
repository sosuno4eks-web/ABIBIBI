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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_1294;
import net.minecraft.class_243;
import net.minecraft.class_2708;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.gofra.Flow;

public final class oq extends k9 {
   @NotNull
   public static final oq M;
   // $FF: synthetic field
   static final KProperty[] i;
   @NotNull
   private static final zo c;
   @NotNull
   private static final zc o;
   @NotNull
   private static final zo q;
   @NotNull
   private static final zc B;
   @NotNull
   private static final zc L;
   private static float r;
   private static float g;
   private static int A;
   @Nullable
   private static class_243 Q;
   private static final long b = j0.a(-3587787999796855025L, 1042009680916315351L, MethodHandles.lookup().lookupClass()).a(22257783361077L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f;

   private oq(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 88087852496799L;
      super(var3, true.n<invokedynamic>(29887, 7952771158227288018L ^ var1), pa.c(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean k(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 136659621062169L;
      int var3 = (int)((var1 ^ 136659621062169L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)c.k((short)var3, this, i[0], (short)var4, var5);
   }

   private final float s(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 115628853898071L;
      int var3 = (int)((var1 ^ 115628853898071L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)o.k((short)var3, this, i[1], (short)var4, var5)).floatValue();
   }

   private final boolean b(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 18285578965336L;
      int var3 = (int)((var1 ^ 18285578965336L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)q.k((short)var3, this, i[2], (short)var4, var5);
   }

   private final float A(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 44860445174062L;
      int var3 = (int)((var1 ^ 44860445174062L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)B.k((short)var3, this, i[3], (short)var4, var5)).floatValue();
   }

   private final float p(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 21107758533797L;
      int var3 = (int)((var1 ^ 21107758533797L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)L.k((short)var3, this, i[4], (short)var4, var5)).floatValue();
   }

   @Flow
   public final void U(@NotNull MoveEvent e) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void s(@NotNull ReceivePacket e) {
      long var2 = b ^ 93619770663268L;
      long var10001 = var2 ^ 43516922867109L;
      int var4 = (int)((var2 ^ 43516922867109L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 40);
      int var6 = (int)(var10001 << 56 >>> 56);

      try {
         Intrinsics.checkNotNullParameter(var1, "e");
         if (var1.getPacket() instanceof class_2708) {
            this.l(var4, var5, (byte)var6);
         }

      } catch (NumberFormatException var7) {
         throw var7.A<invokedynamic>(var7, 8877919485638995750L, var2);
      }
   }

   public void n(long var1) {
      long var3 = var1 ^ 86711115599294L;
      this.h(var3);
   }

   private final void h(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final float P(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 2764332341355L;

      float var10000;
      try {
         if (s8.f(var3).method_6059(class_1294.field_5913)) {
            var10000 = 0.2F;
            return var10000;
         }
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 1998678697785790382L, var1);
      }

      var10000 = 0.0F;
      return var10000;
   }

   @Flow
   public final void F(@NotNull PreSyncEvent eventSync) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean W() {
      long var0 = b ^ 62728939330799L;
      long var2 = var0 ^ 131630433339435L;
      return M.k(var2);
   }

   static {
      long var20 = b ^ 76071595155896L;
      long var22 = var20 ^ 131537613842050L;
      long var24 = var20 ^ 39179060206229L;
      long var26 = var20 ^ 74689100582235L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[17];
      int var16 = 0;
      String var15 = "ìÀæÏ¦Ý@û³Æ\u0016\u008e\u0096Ìõõ7qe\u001f\u009dÇ\u0014\u0083%Riv¬\u009b]\u008d(¨Ù1\u009b\u0014a©ú \u0005|¶ÙËõ\u0081©\u0016%Ò;^ïé\u009e®9\u009d«\u001fÇà@tOLñ0ö\u007f(\u0080\f\u008b\u001dl³\u0001\u0098ÂÝC^ÌÇ\u0085\u009d\u0091u\u0011ßtï\u0099\u0082kÈúÑ\"UÂA§\bF\u009f\u001b\u0083Õ\u008c ù\u0096\u009a¼®/\u0084 h\u0082{Ô?¦ÜªÕ\u0088É\u0005}Øëåª\u0007\t}ñÚ\b\u009b\u0010¸\u0003ý¥ç£c\u0086¹æ\u0090zµ\u0089\u0019p 7\u001fþªè\u009e£&J3#\u0019\u000bÒ/ª\u0007\u008b\u001cê\u0002W\n Lj·gýµ\u0088Ö èFç\u001fÛ\u0095vjô\u0098þ\u0098\u000eÂ\tèÚ\u0085vÔ\u0005º×È.ÂðJe6Ø\u0093 uU\u008aS½&\u009fxÉHÁùãüf\u0003¤®;$þ\u0091\u0086\u0013}r#ÎçÈî¤ w8çþ\u0086¯\u0014â+¹\u0019\u0081\r2-±kõ{»\u0082ót\u0081ðùór;Ò\u009aà\u00189\u0015;Lî¥À\u0097\u0010O\u0082lÓ\u001dÏ\u0098\u0019\u0083S¢n¡\u009c\u009a\u0018Äã¡«.OQÚÈþ\u000evöGi9¿k'\rÌê|F\u0018ù\u0016çäç]c(ºâ\u0002ã\u0012\u008f\u001e£\u0085\u0002ü\u0092ÙE§?\u001052þ}ß\u0015´ß¡,í\u0097nS\u0089Õ(\u00adà\u009a'.¯!2ª4|¥¼«hñÂ\u0004\u0086R\u008bV.xÇñ§A\u009f8\u0011þõÇ\u009bL$û}\u0017\u0010:ÎO<J\u008b!U«&*\u0000ãÑ\u0015=";
      int var17 = "ìÀæÏ¦Ý@û³Æ\u0016\u008e\u0096Ìõõ7qe\u001f\u009dÇ\u0014\u0083%Riv¬\u009b]\u008d(¨Ù1\u009b\u0014a©ú \u0005|¶ÙËõ\u0081©\u0016%Ò;^ïé\u009e®9\u009d«\u001fÇà@tOLñ0ö\u007f(\u0080\f\u008b\u001dl³\u0001\u0098ÂÝC^ÌÇ\u0085\u009d\u0091u\u0011ßtï\u0099\u0082kÈúÑ\"UÂA§\bF\u009f\u001b\u0083Õ\u008c ù\u0096\u009a¼®/\u0084 h\u0082{Ô?¦ÜªÕ\u0088É\u0005}Øëåª\u0007\t}ñÚ\b\u009b\u0010¸\u0003ý¥ç£c\u0086¹æ\u0090zµ\u0089\u0019p 7\u001fþªè\u009e£&J3#\u0019\u000bÒ/ª\u0007\u008b\u001cê\u0002W\n Lj·gýµ\u0088Ö èFç\u001fÛ\u0095vjô\u0098þ\u0098\u000eÂ\tèÚ\u0085vÔ\u0005º×È.ÂðJe6Ø\u0093 uU\u008aS½&\u009fxÉHÁùãüf\u0003¤®;$þ\u0091\u0086\u0013}r#ÎçÈî¤ w8çþ\u0086¯\u0014â+¹\u0019\u0081\r2-±kõ{»\u0082ót\u0081ðùór;Ò\u009aà\u00189\u0015;Lî¥À\u0097\u0010O\u0082lÓ\u001dÏ\u0098\u0019\u0083S¢n¡\u009c\u009a\u0018Äã¡«.OQÚÈþ\u000evöGi9¿k'\rÌê|F\u0018ù\u0016çäç]c(ºâ\u0002ã\u0012\u008f\u001e£\u0085\u0002ü\u0092ÙE§?\u001052þ}ß\u0015´ß¡,í\u0097nS\u0089Õ(\u00adà\u009a'.¯!2ª4|¥¼«hñÂ\u0004\u0086R\u008bV.xÇñ§A\u009f8\u0011þõÇ\u009bL$û}\u0017\u0010:ÎO<J\u008b!U«&*\u0000ãÑ\u0015=".length();
      char var14 = ' ';
      int var13 = -1;

      label55:
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
                  d = var18;
                  e = new String[17];
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
                  String var5 = "\u007f(\u009fÆ\u0096¸Båe^#ÑûìÏä4\u008dx\u0083?\u0091ÎÍ";
                  int var6 = "\u007f(\u009fÆ\u0096¸Båe^#ÑûìÏä4\u008dx\u0083?\u0091ÎÍ".length();
                  int var3 = 0;

                  label37:
                  while(true) {
                     int var33 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var33, var3).getBytes("ISO-8859-1");
                     long[] var32 = var0;
                     var33 = var4++;
                     long var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var38 = -1;

                     while(true) {
                        long var8 = var37;
                        byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var40 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var38) {
                        case 0:
                           var32[var33] = var40;
                           if (var3 >= var6) {
                              KProperty[] var28 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oq.class, true.n<invokedynamic>(21748, 6928035364744726864L ^ var20), true.n<invokedynamic>(12063, 7689647041633678014L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oq.class, true.n<invokedynamic>(19026, 2769741723387697150L ^ var20), true.n<invokedynamic>(21024, 8003650756122021766L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oq.class, true.n<invokedynamic>(13303, 6500834775421677143L ^ var20), true.n<invokedynamic>(18820, 6874712880407647277L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oq.class, true.n<invokedynamic>(2125, 355405664357012962L ^ var20), true.n<invokedynamic>(10596, 2435751507764049103L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oq.class, true.n<invokedynamic>(554, 3198702004914610052L ^ var20), true.n<invokedynamic>(24358, 3056447608686019212L ^ var20), 0)))};
                              i = var28;
                              M = new oq(var26);
                              c = qi.R((il)M, true.n<invokedynamic>(7829, 3189177265872323378L ^ var20), false, (pj)null, (Function0)null, (int)var0[4], var24, (Object)null);
                              o = qi.g((il)M, true.n<invokedynamic>(13453, 539460484857293088L ^ var20), 1.0F, RangesKt.rangeTo(0.5F, 3.0F), (pj)null, oq::W, (int)var0[2], var22, (Object)null);
                              q = qi.R((il)M, true.n<invokedynamic>(23378, 5198074976591677169L ^ var20), true, (pj)null, (Function0)null, (int)var0[3], var24, (Object)null);
                              B = qi.g((il)M, true.n<invokedynamic>(278, 6437019069091536051L ^ var20), 1.35F, RangesKt.rangeTo(0.1F, 10.0F), (pj)null, (Function0)null, (int)var0[0], var22, (Object)null);
                              L = qi.g((il)M, true.n<invokedynamic>(15550, 4027339205821686038L ^ var20), 10.0F, RangesKt.rangeTo(5.0F, 40.0F), (pj)null, (Function0)null, (int)var0[1], var22, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var32[var33] = var40;
                           if (var3 < var6) {
                              continue label37;
                           }

                           var5 = "Æ«Û¹\"äÓ\u0011\u0094·U¾\u00939÷\u0015";
                           var6 = "Æ«Û¹\"äÓ\u0011\u0094·U¾\u00939÷\u0015".length();
                           var3 = 0;
                        }

                        var33 = var3;
                        var3 += 8;
                        var7 = var5.substring(var33, var3).getBytes("ISO-8859-1");
                        var32 = var0;
                        var33 = var4++;
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
                  continue label55;
               }

               var15 = "½³cõ\n¿\t!×º,ëoYEÃ¹´àv\u008deËs ìóikSü\u0090\u0080Üì8\u001c«Ì°\u0006l\u0004}}\u0097v\u0081Tn´{I\u0006Å\u0014|";
               var17 = "½³cõ\n¿\t!×º,ëoYEÃ¹´àv\u008deËs ìóikSü\u0090\u0080Üì8\u001c«Ì°\u0006l\u0004}}\u0097v\u0081Tn´{I\u0006Å\u0014|".length();
               var14 = 24;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10142;
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
            throw new RuntimeException("su/catlean/oq", var10);
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
         throw new RuntimeException("su/catlean/oq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
