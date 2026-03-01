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
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.minecraft.class_1297;
import net.minecraft.class_2596;
import net.minecraft.class_2848;
import net.minecraft.class_2848.class_2849;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class kg extends k9 {
   @NotNull
   public static final kg g;
   private static final long b = j0.a(1176736265753837295L, 1998333926718482918L, MethodHandles.lookup().lookupClass()).a(229096773784208L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] i;
   private static final Map k;

   private kg(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 32859422805601L;
      super(var3, true.g<invokedynamic>(15678, 6124413312078728371L ^ var1), pa.E(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   @Flow(
      priority = -10
   )
   private final void W(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void o(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   private static final void e() {
      long var0 = b ^ 139931368104361L;
      long var2 = var0 ^ 135290860109350L;
      long var4 = var0 ^ 127276529311672L;
      h4.G((class_2596)(new class_2848((class_1297)s8.f(var2), class_2849.field_12982)), var4);
      s8.f(var2).method_23669();
   }

   private static final void p(s1 param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 118444345460375L;
      long var22 = var20 ^ 35753439875978L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[10];
      int var16 = 0;
      String var15 = "\u0095\u0007ú>\u0000\u0099\u0015©l\u008c\u0092c¯Ð\u00950>¿å0U#Ã\u0093Ëzzq\u000fyl(®,\u0006}\u008fÚ\u0094¤(Ð\u0006éeâ\u00adÒ£¬\u009d\nÏÀ*£¦Yc\u0003ïQìwì\u0094:W\u00845\u0084VÎÏ\u001eÒÛm\u0013\u0097ü(H=»8¼\u0017â.rÑ9!\n\u009a\u008d(b£ßìv\u0001\bI\"[\u00179©P\u0014¹\u008d\u0007Èá\u000b2kÝ(ÓY\u0019×<\u0019yE\u0082ØÃxïÐ\u0092\u0017\"è-Ê¯m4 \u008a'Á³#ª*;«Øftgd\u0082a(vY-\u0010Ñøïå\u0097\u009eMkDò¹o(m\u0010nûQ»¿!Ù~G|¼Ð6^\u009dK©N\u0011Ò©\u0010O±É\u0004ü\t\u0005\u0006u.ÌÏ\u0080ôQ.(\u001e`\t¢p\fÄ¶\n\u000es\u0096²¤\u0003q&[>¤\"\u009d7fÐ\u009c\u009fM£ü\tKæqêT\u0085Ü \u0004\u0018*8½\u0000%ñÛ§´\n\u008efr\u008d\u00adg\f\u0017GÞ\u0010:ìù";
      int var17 = "\u0095\u0007ú>\u0000\u0099\u0015©l\u008c\u0092c¯Ð\u00950>¿å0U#Ã\u0093Ëzzq\u000fyl(®,\u0006}\u008fÚ\u0094¤(Ð\u0006éeâ\u00adÒ£¬\u009d\nÏÀ*£¦Yc\u0003ïQìwì\u0094:W\u00845\u0084VÎÏ\u001eÒÛm\u0013\u0097ü(H=»8¼\u0017â.rÑ9!\n\u009a\u008d(b£ßìv\u0001\bI\"[\u00179©P\u0014¹\u008d\u0007Èá\u000b2kÝ(ÓY\u0019×<\u0019yE\u0082ØÃxïÐ\u0092\u0017\"è-Ê¯m4 \u008a'Á³#ª*;«Øftgd\u0082a(vY-\u0010Ñøïå\u0097\u009eMkDò¹o(m\u0010nûQ»¿!Ù~G|¼Ð6^\u009dK©N\u0011Ò©\u0010O±É\u0004ü\t\u0005\u0006u.ÌÏ\u0080ôQ.(\u001e`\t¢p\fÄ¶\n\u000es\u0096²¤\u0003q&[>¤\"\u009d7fÐ\u009c\u009fM£ü\tKæqêT\u0085Ü \u0004\u0018*8½\u0000%ñÛ§´\n\u008efr\u008d\u00adg\f\u0017GÞ\u0010:ìù".length();
      char var14 = '(';
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var24 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var29 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var29;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[10];
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
                  String var4 = ";ë?GÝv´¶x<]©È.\u0083é\u001f¯è\u009e\u000bøH]";
                  int var5 = ";ë?GÝv´¶x<]©È.\u0083é\u001f¯è\u009e\u000bøH]".length();
                  int var2 = 0;

                  do {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     var27 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var31 = true;
                     var6[var27] = var10004;
                  } while(var2 < var5);

                  f = var6;
                  i = new Integer[3];
                  g = new kg(var22);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var29;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "\u0092\u0083Ýéùê~X½ÍN\u0097Ì¶I?¤D\u001fÍÚA\u0018Ü \u0012ã\u0082ö¬*#zcú\u0018W\\\u001d)ÚÍV MI\u0001ù\r \u0087I\u0015\u0090î5É";
               var17 = "\u0092\u0083Ýéùê~X½ÍN\u0097Ì¶I?¤D\u001fÍÚA\u0018Ü \u0012ã\u0082ö¬*#zcú\u0018W\\\u001d)ÚÍV MI\u0001ù\r \u0087I\u0015\u0090î5É".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var24 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9367;
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
            throw new RuntimeException("su/catlean/kg", var10);
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
         throw new RuntimeException("su/catlean/kg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17828;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/kg", var14);
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
         throw new RuntimeException("su/catlean/kg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
