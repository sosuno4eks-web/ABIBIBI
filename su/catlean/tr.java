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
import net.minecraft.class_1703;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class tr extends k9 {
   @NotNull
   public static final tr u;
   // $FF: synthetic field
   static final KProperty[] S;
   @NotNull
   private static final z7 K;
   @Nullable
   private static class_437 Y;
   @Nullable
   private static class_1703 o;
   private static final long b = j0.a(975043390951535363L, 1074136738892802414L, MethodHandles.lookup().lookupClass()).a(86218071570154L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   private tr(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 90450659125403L;
      super(var3, true.k<invokedynamic>(27814, 7329218853160463942L ^ var1), pa.b(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final n_ Y(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 88007542741481L;
      int var3 = (int)((var1 ^ 88007542741481L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (n_)K.k((short)var3, this, S[0], (short)var4, var5);
   }

   private final void Q(n_ var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 129640010624353L;
      int var4 = (int)((var2 ^ 129640010624353L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      K.P(this, var4, S[0], (short)var5, var1, (short)var6);
   }

   @Flow
   private final void E(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void b(SendPacket param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(long param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 14536868984184L;
      long var10001 = var20 ^ 100066752338291L;
      int var22 = (int)((var20 ^ 100066752338291L) >>> 32);
      int var23 = (int)(var10001 << 32 >>> 48);
      int var24 = (int)(var10001 << 48 >>> 48);
      long var25 = var20 ^ 10602790405791L;
      var10001 = var20 ^ 49689919743482L;
      int var27 = (int)((var20 ^ 49689919743482L) >>> 32);
      int var28 = (int)(var10001 << 32 >>> 48);
      int var29 = (int)(var10001 << 48 >>> 48);
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[4];
      int var16 = 0;
      String var15 = "¡\u00ad<V¢\t\u008b\u0080P4\u0094\u0015;Ú»ï\u00023Ç4Ðò\u001f\u0012Ó3/#7\u008f\u001fë\u0002KçÇýØ\u0019JÈ\u0091\n;\n.70þéÄò@EÞ\u008d\u0018J7°Û\u0092K\u009aF\u0089\u0091\u008a7Ã°Ìt#oç¼§tBP";
      int var17 = "¡\u00ad<V¢\t\u008b\u0080P4\u0094\u0015;Ú»ï\u00023Ç4Ðò\u001f\u0012Ó3/#7\u008f\u001fë\u0002KçÇýØ\u0019JÈ\u0091\n;\n.70þéÄò@EÞ\u008d\u0018J7°Û\u0092K\u009aF\u0089\u0091\u008a7Ã°Ìt#oç¼§tBP".length();
      char var14 = '8';
      int var13 = -1;

      label47:
      while(true) {
         ++var13;
         String var38 = var15.substring(var13, var13 + var14);
         byte var41 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var38.getBytes("ISO-8859-1"));
            String var44 = b(var19).intern();
            switch(var41) {
            case 0:
               var18[var16++] = var44;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[4];
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
                  String var5 = "íN[èÏø´\u0091ÕÀD1\u000fÏTÐ";
                  int var6 = "íN[èÏø´\u0091ÕÀD1\u000fÏTÐ".length();
                  int var3 = 0;

                  do {
                     int var45 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var45, var3).getBytes("ISO-8859-1");
                     var45 = var4++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var47 = true;
                     var0[var45] = var10004;
                  } while(var3 < var6);

                  KProperty[] var37 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(tr.class, true.k<invokedynamic>(15625, 7146969575458504515L ^ var20), true.k<invokedynamic>(7602, 682221833243516921L ^ var20), 0)))};
                  S = var37;
                  u = new tr(var25);
                  il var40 = (il)u;
                  String var42 = 15232.k<invokedynamic>(15232, 9155130053845350856L ^ var20);
                  n_ var48 = new n_(-1, var27, (char)var28, false, (char)var29, false, (int)var0[1], (DefaultConstructorMarker)null);
                  int var10005 = (int)var0[0];
                  Object var30 = null;
                  int var31 = var10005;
                  Object var32 = null;
                  Object var33 = null;
                  n_ var34 = var48;
                  String var35 = var42;
                  il var36 = var40;
                  K = qi.b(var22, var36, var35, (char)var23, var34, (pj)var33, (Function0)var32, var31, var30, (short)var24);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var44;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label47;
               }

               var15 = "È\u009d`ñ\u00940½¸ö\u008bô3Ì')\u0016%\u008b+û)\u009ba7\u0000a'h[ÑO\u008d\u0010:{\u0006\u001f\u0095FI³\u0016?N=:HØ\u0083";
               var17 = "È\u009d`ñ\u00940½¸ö\u008bô3Ì')\u0016%\u008b+û)\u009ba7\u0000a'h[ÑO\u008d\u0010:{\u0006\u001f\u0095FI³\u0016?N=:HØ\u0083".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var38 = var15.substring(var13, var13 + var14);
            var41 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28933;
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
            throw new RuntimeException("su/catlean/tr", var10);
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
         throw new RuntimeException("su/catlean/tr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
