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
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_1294;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.SprintEvent;
import su.catlean.gofra.Flow;

public final class ot extends k9 {
   @NotNull
   public static final ot K;
   static final KProperty[] O;
   @NotNull
   private static final zr W;
   @NotNull
   private static final zc N;
   private static final long b = j0.a(-2699021006187770349L, 796542766330809330L, MethodHandles.lookup().lookupClass()).a(80853259655635L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   private ot(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 21355692151319L;
      super(var3, true.u<invokedynamic>(30098, 6025183352183880476L ^ var1), pa.c(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final vd S(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 99376327370071L;
      int var3 = (int)((var1 ^ 99376327370071L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (vd)W.k((short)var3, this, O[0], (short)var4, var5);
   }

   private final float K(char var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
      long var10001 = var4 ^ 10154427465390L;
      int var6 = (int)((var4 ^ 10154427465390L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)N.k((short)var6, this, O[1], (short)var7, var8)).floatValue();
   }

   public void a(long var1) {
      long var3 = var1 ^ 16426737678522L;
      long var5 = var1 ^ 10918132203881L;

      try {
         if (this.S(var5) == vd.DolphinGrace) {
            s8.f(var3).method_6016(class_1294.field_5900);
         }

      } catch (NumberFormatException var7) {
         throw var7.A<invokedynamic>(var7, 4256777904002801828L, var1);
      }
   }

   @Flow
   private final void R(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void u(MoveEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void d(SprintEvent param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 40929799608682L;
      long var22 = var20 ^ 77774525190762L;
      long var24 = var20 ^ 35791477516686L;
      long var26 = var20 ^ 106147370782721L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[7];
      int var16 = 0;
      String var15 = "\u000bX\u001b\u0097P\u001bfO>nFßHÁ6\u0085\u0010®ºò\u008b\u0095J©rÖ7'Ó2m-{ \u0001ZU\\úZ\u009eþêuá\u0018¨à\u0089\u00105\u0005X!6yHºylA?%\u0081\u0000&8Ð\u0095nàÂ³\u0013ê<¸²\u0011Ø\u007f\u0095o\u001c ¬Ä\u008búë\u0087®X9®\n«UÊ\u0089\u0093\u0001÷kÀ\u001c\u000bñ\u009d\u0083\u001c9²å\u008bÏÿRfÚÈ_y\u0010øGZ¡'³&×la\u008c3\u0010þ~¾";
      int var17 = "\u000bX\u001b\u0097P\u001bfO>nFßHÁ6\u0085\u0010®ºò\u008b\u0095J©rÖ7'Ó2m-{ \u0001ZU\\úZ\u009eþêuá\u0018¨à\u0089\u00105\u0005X!6yHºylA?%\u0081\u0000&8Ð\u0095nàÂ³\u0013ê<¸²\u0011Ø\u007f\u0095o\u001c ¬Ä\u008búë\u0087®X9®\n«UÊ\u0089\u0093\u0001÷kÀ\u001c\u000bñ\u009d\u0083\u001c9²å\u008bÏÿRfÚÈ_y\u0010øGZ¡'³&×la\u008c3\u0010þ~¾".length();
      char var14 = 16;
      int var13 = -1;

      label47:
      while(true) {
         ++var13;
         String var29 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
            String var34 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var34;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[7];
                  Cipher var1;
                  var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var2 = 1; var2 < 8; ++var2) {
                     var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var0 = new long[2];
                  int var4 = 0;
                  String var5 = "Í#¬¿W\u009c\u0081îÈÏ8BcÍ@}";
                  int var6 = "Í#¬¿W\u009c\u0081îÈÏ8BcÍ@}".length();
                  int var3 = 0;

                  do {
                     int var32 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var32, var3).getBytes("ISO-8859-1");
                     var32 = var4++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var36 = true;
                     var0[var32] = var10004;
                  } while(var3 < var6);

                  KProperty[] var28 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ot.class, true.u<invokedynamic>(20330, 8064307143736147377L ^ var20), true.u<invokedynamic>(133, 3319689977698153048L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ot.class, true.u<invokedynamic>(23853, 4000667653964247027L ^ var20), true.u<invokedynamic>(30216, 8608937878389556432L ^ var20), 0)))};
                  O = var28;
                  K = new ot(var26);
                  W = qi.M((il)K, true.u<invokedynamic>(31494, 4139504127979293148L ^ var20), (Enum)vd.DolphinGrace, (pj)null, (Function0)null, (int)var0[1], (Object)null, var22);
                  N = qi.g((il)K, true.u<invokedynamic>(26090, 1004578313114720053L ^ var20), 2.0F, RangesKt.rangeTo(1.0F, 10.0F), (pj)null, (Function0)null, (int)var0[0], var24, (Object)null);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var34;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label47;
               }

               var15 = "\u0098è)ïR¸ÂG5/\u008afôÈDæ\u0018ÒAV\u0007ÐØz&^É\u0099\u0018¦3CÌ\u0092\\{®\u0086\u0098\u0010Ë";
               var17 = "\u0098è)ïR¸ÂG5/\u008afôÈDæ\u0018ÒAV\u0007ÐØz&^É\u0099\u0018¦3CÌ\u0092\\{®\u0086\u0098\u0010Ë".length();
               var14 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18407;
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
            throw new RuntimeException("su/catlean/ot", var10);
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
         throw new RuntimeException("su/catlean/ot" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
