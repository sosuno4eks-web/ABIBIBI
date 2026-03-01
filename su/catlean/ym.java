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
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class ym extends k9 {
   @NotNull
   public static final ym K;
   private static final long b = j0.a(-999711654198998880L, 7534348383478381187L, MethodHandles.lookup().lookupClass()).a(163072099442188L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   private ym(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 41797808812550L;
      super(var3, true.q<invokedynamic>(30212, 7290855334921134541L ^ var1), pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   @Flow
   public final void m(@NotNull PlayerUpdateEvent e) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var9 = b ^ 33844142497591L;
      long var11 = var9 ^ 121064719103565L;
      e = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[3];
      int var5 = 0;
      String var4 = "&As\f\u0088¼ü\u0007\nXØ\n4h\u009e$ýòOd9ö`Zr?Lstp\u0003\u0097È  #í®\u0097û¹Rn\u0005\u000es\u0017\u001bÝ\f\u008a¬(²\u0002Ú$ÿº±¦\u008aO\u0006wË\u008c2X]×þ Ù¯\u0093ÚÇi\fªç#5¤n¯MÑí9ºîg\u0080\u001f=\u0012k\u0094$\u009ad\u009b[cEìÚ\u008dk=éc\u0081Ø´Í9Û\u00801H¢ïÊXjXÞ4;Ì\u00058'çÕo©/+\f§\u007f~ïÓÙrV¹\u0081í\u000b8ÝC¢/\\\u0081Êëî\u0018\u008b\u0005¬`\u0011\u009e9Vx8ºcò H¢\u001b\u0097âjð\u0086)c4B\u0084\"9ð\u001b\u0019¸!\u0005&ì¤¿ciúq\u009cÍ8ØÝ\u0088ÖA\u0085@Uåìa=QÝd¨½\b\u001bQÖ¬»\u0095]\u008d\u001a¦·\u0005y\u0011\u0088v§±e\u0018ì®.aû_\u0096ñÜ;\u0005¾7óc®~ä²\u009fñ¹7R";
      int var6 = "&As\f\u0088¼ü\u0007\nXØ\n4h\u009e$ýòOd9ö`Zr?Lstp\u0003\u0097È  #í®\u0097û¹Rn\u0005\u000es\u0017\u001bÝ\f\u008a¬(²\u0002Ú$ÿº±¦\u008aO\u0006wË\u008c2X]×þ Ù¯\u0093ÚÇi\fªç#5¤n¯MÑí9ºîg\u0080\u001f=\u0012k\u0094$\u009ad\u009b[cEìÚ\u008dk=éc\u0081Ø´Í9Û\u00801H¢ïÊXjXÞ4;Ì\u00058'çÕo©/+\f§\u007f~ïÓÙrV¹\u0081í\u000b8ÝC¢/\\\u0081Êëî\u0018\u008b\u0005¬`\u0011\u009e9Vx8ºcò H¢\u001b\u0097âjð\u0086)c4B\u0084\"9ð\u001b\u0019¸!\u0005&ì¤¿ciúq\u009cÍ8ØÝ\u0088ÖA\u0085@Uåìa=QÝd¨½\b\u001bQÖ¬»\u0095]\u008d\u001a¦·\u0005y\u0011\u0088v§±e\u0018ì®.aû_\u0096ñÜ;\u0005¾7óc®~ä²\u009fñ¹7R".length();
      char var3 = 'x';
      int var2 = -1;

      while(true) {
         ++var2;
         byte[] var8 = var0.doFinal(var4.substring(var2, var2 + var3).getBytes("ISO-8859-1"));
         String var14 = b(var8).intern();
         boolean var10001 = true;
         var7[var5++] = var14;
         if ((var2 += var3) >= var6) {
            c = var7;
            d = new String[3];
            K = new ym(var11);
            return;
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 32433;
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
            throw new RuntimeException("su/catlean/ym", var10);
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
         throw new RuntimeException("su/catlean/ym" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
