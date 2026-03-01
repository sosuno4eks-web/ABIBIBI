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
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_3611;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.EntityPushEvent;
import su.catlean.api.event.events.player.PushOutOfBlocksEvent;
import su.catlean.api.event.events.world.WaterPushEvent;
import su.catlean.gofra.Flow;

public final class ks extends k9 {
   @NotNull
   public static final ks y;
   static final KProperty[] I;
   @NotNull
   private static final zo r;
   @NotNull
   private static final zo s;
   @NotNull
   private static final zo e;
   @NotNull
   private static final zo B;
   private static final long b = j0.a(-2781036399524093562L, 6196766194745331312L, MethodHandles.lookup().lookupClass()).a(40510724126764L);
   private static final String[] c;
   private static final String[] d;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map k;

   private ks(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 130155207410801L;
      super(var3, true.n<invokedynamic>(25757, 4009616921930270351L ^ var1), pa.E(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean Y(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 92825024532896L;
      int var3 = (int)((var1 ^ 92825024532896L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)r.k((short)var3, this, I[0], (short)var4, var5);
   }

   private final void G(long var1, boolean var3) {
      var1 ^= b;
      long var10001 = var1 ^ 35421540182385L;
      int var4 = (int)((var1 ^ 35421540182385L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      r.P(this, var4, I[0], (short)var5, var3, (short)var6);
   }

   private final boolean u(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 58189037047443L;
      int var3 = (int)((var1 ^ 58189037047443L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)s.k((short)var3, this, I[1], (short)var4, var5);
   }

   private final void D(boolean var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 95667346357433L;
      int var4 = (int)((var2 ^ 95667346357433L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      s.P(this, var4, I[1], (short)var5, var1, (short)var6);
   }

   private final boolean A(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 50472025362825L;
      int var3 = (int)((var1 ^ 50472025362825L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)e.k((short)var3, this, I[2], (short)var4, var5);
   }

   private final void c(long var1, boolean var3) {
      var1 ^= b;
      long var10001 = var1 ^ 106811251440213L;
      int var4 = (int)((var1 ^ 106811251440213L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      e.P(this, var4, I[2], (short)var5, var3, (short)var6);
   }

   private final boolean P(int var1, byte var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ b;
      long var10001 = var4 ^ 116221462187517L;
      int var6 = (int)((var4 ^ 116221462187517L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)B.k((short)var6, this, I[3], (short)var7, var8);
   }

   private final void b(char var1, char var2, boolean var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ b;
      long var10001 = var5 ^ 54273674355445L;
      int var7 = (int)((var5 ^ 54273674355445L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      B.P(this, var7, I[3], (short)var8, var3, (short)var9);
   }

   @Flow
   private final void y(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void X(WaterPushEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void A(PushOutOfBlocksEvent var1) {
      long var2 = b ^ 35057230112534L;
      long var4 = var2 ^ 133585463182443L;

      try {
         if (this.Y(var4)) {
            var1.cancel();
         }

      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, -4911459571067619368L, var2);
      }
   }

   @Flow
   private final void G(EntityPushEvent var1) {
      long var2 = b ^ 19576171828213L;
      long var4 = var2 ^ 26190493544379L;

      try {
         if (this.u(var4)) {
            var1.cancel();
         }

      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, 5707735993875530555L, var2);
      }
   }

   private final boolean H(class_3611 param1, class_2338 param2, class_2350 param3, long param4) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 65051711275311L;
      long var22 = var20 ^ 30329965174306L;
      long var24 = var20 ^ 53728387005627L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[20];
      int var16 = 0;
      String var15 = "«\u0092¸Å4\u000f}pÛoEÊ:ûã*äÇ,ê4\u0015\u0092á Ùý\u000e\u007fj°¾\u001fá\u0004\u001eBDÁ6uÈt©ÿoVÚ¸xKÿ7³\u0094\u0003Ä(\u009eA0ø\u008cïfT\u0011Îð÷]?tRº&À\u008c\u00939[ýå;mh\u00862Òò\u0002.\u0099\\h:gË\u0018ý¤\u001aç?b\u000bú#p\u001f\u0016Ð@#-w-Áø`\u0000¾p B\u001dË1GÈêÖo¼OÃIÆõðzËX@=i\u0085\n\u0099&\u0084\b\u0018µõI 9Ä\u001föM½\u009d_3Ð\u0083 \u0095\u001cÖ±\u001c\u0001Ä#\"ûüZ\u0092¡ÝL\u0088¤è\u0085\u0010\u000f\u0089H\u008d3ùL·>¡Hû @\u001fÿ\u0010øq\u0019ªÏ\u009fq$?ç\u0011?½\u0096§È\u0010\r\u008d\u0093©\u000b\u008dXç&\u008e{ë:\u0081øW\u0010\u009d\n)\u0006\u0091dsÿkÒT9Ì5^ü g¥VX¨ÑãC?µ\u001bÚ0\u0097óCbX=\u0085F\u0097uaCÑ\u000e\u0011\u0080\u0016=Å\u0080\u009d^\u0006\u0086\u001f\u009bö«ï¤Q\u001e¡í3¯>ú\u001d¸h\u0088Ô\\ý_\u0080\u0099^jAJ?\u009d\u0001\u0013§Çå©²sÕ\bD\u000b¢×Ú½±Tâos\u0004¨æï¡êÇ)÷\u0099Ç\u0085Ù\u0093ø1øØ©G#Ó·\u001c9q\u0005Z\u0086øÙÉSë@\u008eÒ±l\u0004v©1õÙNÏ¢\u001c¹\u0089\u001d\u0018\u0082hg<\u0086¦)â\u0010a\\ÉÉ¡ 'f¡Ë` ÿ5[ÌW\u0000\"n\u0096Æ\u0081<¢°\u0098¯%a}KÌ'¶Áâ=¡\u001d\u0092¡p\u0086\u0010Ëÿ\u008dÃ]Ðð\u0093]á\u008eÎ\u0089VÇà\u0010GÞPÇþ\u0012\rU¾è]&vÎ\u0015² ªm\u001c|XÍ«ÆZ\u008e]èµ sz\u001c\u0018;ÌR¾iíL\u0015?TÇiðÖ\u0018^àäWÒö¥)@\\ýÏ\nö»/×Ç\u00ad´¤Y%\u0081\u0018êfæûÂBÕ\u0015¿á\u009e\u0019Û\u001d¸%\u009cÃª\u0086t\u0087\u009a\b";
      int var17 = "«\u0092¸Å4\u000f}pÛoEÊ:ûã*äÇ,ê4\u0015\u0092á Ùý\u000e\u007fj°¾\u001fá\u0004\u001eBDÁ6uÈt©ÿoVÚ¸xKÿ7³\u0094\u0003Ä(\u009eA0ø\u008cïfT\u0011Îð÷]?tRº&À\u008c\u00939[ýå;mh\u00862Òò\u0002.\u0099\\h:gË\u0018ý¤\u001aç?b\u000bú#p\u001f\u0016Ð@#-w-Áø`\u0000¾p B\u001dË1GÈêÖo¼OÃIÆõðzËX@=i\u0085\n\u0099&\u0084\b\u0018µõI 9Ä\u001föM½\u009d_3Ð\u0083 \u0095\u001cÖ±\u001c\u0001Ä#\"ûüZ\u0092¡ÝL\u0088¤è\u0085\u0010\u000f\u0089H\u008d3ùL·>¡Hû @\u001fÿ\u0010øq\u0019ªÏ\u009fq$?ç\u0011?½\u0096§È\u0010\r\u008d\u0093©\u000b\u008dXç&\u008e{ë:\u0081øW\u0010\u009d\n)\u0006\u0091dsÿkÒT9Ì5^ü g¥VX¨ÑãC?µ\u001bÚ0\u0097óCbX=\u0085F\u0097uaCÑ\u000e\u0011\u0080\u0016=Å\u0080\u009d^\u0006\u0086\u001f\u009bö«ï¤Q\u001e¡í3¯>ú\u001d¸h\u0088Ô\\ý_\u0080\u0099^jAJ?\u009d\u0001\u0013§Çå©²sÕ\bD\u000b¢×Ú½±Tâos\u0004¨æï¡êÇ)÷\u0099Ç\u0085Ù\u0093ø1øØ©G#Ó·\u001c9q\u0005Z\u0086øÙÉSë@\u008eÒ±l\u0004v©1õÙNÏ¢\u001c¹\u0089\u001d\u0018\u0082hg<\u0086¦)â\u0010a\\ÉÉ¡ 'f¡Ë` ÿ5[ÌW\u0000\"n\u0096Æ\u0081<¢°\u0098¯%a}KÌ'¶Áâ=¡\u001d\u0092¡p\u0086\u0010Ëÿ\u008dÃ]Ðð\u0093]á\u008eÎ\u0089VÇà\u0010GÞPÇþ\u0012\rU¾è]&vÎ\u0015² ªm\u001c|XÍ«ÆZ\u008e]èµ sz\u001c\u0018;ÌR¾iíL\u0015?TÇiðÖ\u0018^àäWÒö¥)@\\ýÏ\nö»/×Ç\u00ad´¤Y%\u0081\u0018êfæûÂBÕ\u0015¿á\u009e\u0019Û\u001d¸%\u009cÃª\u0086t\u0087\u009a\b".length();
      char var14 = 24;
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var27 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
            String var32 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var32;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[20];
                  k = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "|éàhs\r[åZ\u008c\u008e«ä\b\u0012\u0003´Äl±øÒ?$";
                  int var5 = "|éàhs\r[åZ\u008c\u008e«ä\b\u0012\u0003´Äl±øÒ?$".length();
                  int var2 = 0;

                  do {
                     int var30 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                     var30 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var34 = true;
                     var6[var30] = var10004;
                  } while(var2 < var5);

                  g = var6;
                  i = new Integer[3];
                  KProperty[] var26 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ks.class, true.n<invokedynamic>(24235, 3411028472649105316L ^ var20), true.n<invokedynamic>(11887, 4512455647387504494L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ks.class, true.n<invokedynamic>(8041, 739954641008033402L ^ var20), true.n<invokedynamic>(22471, 7936035636923086538L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ks.class, true.n<invokedynamic>(22458, 7616606377585194687L ^ var20), true.n<invokedynamic>(6639, 7077619017761061096L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ks.class, true.n<invokedynamic>(31774, 8120443037676150030L ^ var20), true.n<invokedynamic>(9083, 2507131074338407035L ^ var20), 0)))};
                  I = var26;
                  y = new ks(var22);
                  r = qi.R((il)y, true.n<invokedynamic>(6420, 798722622573705246L ^ var20), true, (pj)null, (Function0)null, true.d<invokedynamic>(21674, 5820565227218684710L ^ var20), var24, (Object)null);
                  s = qi.R((il)y, true.n<invokedynamic>(19952, 1904018675874868478L ^ var20), true, (pj)null, (Function0)null, true.d<invokedynamic>(31348, 8178789673083856378L ^ var20), var24, (Object)null);
                  e = qi.R((il)y, true.n<invokedynamic>(2414, 3553507832746109029L ^ var20), true, (pj)null, (Function0)null, true.d<invokedynamic>(31348, 8178789673083856378L ^ var20), var24, (Object)null);
                  B = qi.R((il)y, true.n<invokedynamic>(8957, 8463631858506974191L ^ var20), true, (pj)null, (Function0)null, true.d<invokedynamic>(31348, 8178789673083856378L ^ var20), var24, (Object)null);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var32;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "j\u0097L\u00826õ¨í\u0095:Ûg\u009b¤\b\u0085A/Ò\u0012©¡Ïà\u008aÑæ\u000b\u009eØ4H\u0018\u0090F\u001aw\u0002ù£\u00895Ç\u0015²\u0018\u00adðc5\u009d\u008cPèíÒ\u008c";
               var17 = "j\u0097L\u00826õ¨í\u0095:Ûg\u009b¤\b\u0085A/Ò\u0012©¡Ïà\u008aÑæ\u000b\u009eØ4H\u0018\u0090F\u001aw\u0002ù£\u00895Ç\u0015²\u0018\u00adðc5\u009d\u008cPèíÒ\u008c".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var27 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 15641;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ks", var10);
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
         throw new RuntimeException("su/catlean/ks" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17301;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
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
            throw new RuntimeException("su/catlean/ks", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
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
         throw new RuntimeException("su/catlean/ks" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
