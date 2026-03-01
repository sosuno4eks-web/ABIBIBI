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
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.InteractBlockEvent;
import su.catlean.gofra.Flow;

public final class yx extends k9 {
   @NotNull
   public static final yx e;
   // $FF: synthetic field
   static final KProperty[] U;
   @NotNull
   private static final zo S;
   private static final long b = j0.a(3791808187370892063L, 6197738559655395582L, MethodHandles.lookup().lookupClass()).a(248569083253019L);
   private static final String[] c;
   private static final String[] d;
   private static final Map f;

   private yx(int var1, char var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 43125924743977L;
      super(var6, true.m<invokedynamic>(25396, 7225675137544235376L ^ var4), pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean Y(short var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ b;
      long var10001 = var4 ^ 51141410842912L;
      int var6 = (int)((var4 ^ 51141410842912L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)S.k((short)var6, this, U[0], (short)var7, var8);
   }

   @Flow
   private final void m(InteractBlockEvent param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var16 = b ^ 82453040846337L;
      long var18 = var16 ^ 87697297829823L;
      long var10001 = var16 ^ 64988112094804L;
      int var20 = (int)((var16 ^ 64988112094804L) >>> 32);
      int var21 = (int)(var10001 << 32 >>> 48);
      int var22 = (int)(var10001 << 48 >>> 48);
      f = new HashMap(13);
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var16 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[5];
      int var12 = 0;
      String var11 = "4ª?²>\"´-u\u0092\u008e\u008c\u0094JÝÚ-\u0097F\u0093\u00013\u0088j\u0012/Q<(´\u0094Ì\u00182~c\u0081\u0004üA\rµºÎæ¬\u008fËNKX$\u0013Á/Ü° G¾´rx!\\ï^\u001fN\u001cÜ\u001f\u0081\u0011â2À\u009d\u000bå]\u0014\u001cÛî)ÁaO¬";
      int var13 = "4ª?²>\"´-u\u0092\u008e\u008c\u0094JÝÚ-\u0097F\u0093\u00013\u0088j\u0012/Q<(´\u0094Ì\u00182~c\u0081\u0004üA\rµºÎæ¬\u008fËNKX$\u0013Á/Ü° G¾´rx!\\ï^\u001fN\u001cÜ\u001f\u0081\u0011â2À\u009d\u000bå]\u0014\u001cÛî)ÁaO¬".length();
      char var10 = ' ';
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var24 = var11.substring(var9, var9 + var10);
         byte var26 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var24.getBytes("ISO-8859-1"));
            String var30 = b(var15).intern();
            switch(var26) {
            case 0:
               var14[var12++] = var30;
               if ((var9 += var10) >= var13) {
                  c = var14;
                  d = new String[5];
                  Cipher var2;
                  var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var3 = 1; var3 < 8; ++var3) {
                     var10003[var3] = (byte)((int)(var16 << var3 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var4 = -2499730171460679546L;
                  byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                  long var32 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                  boolean var29 = true;
                  long var0 = var32;
                  KProperty[] var23 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yx.class, true.m<invokedynamic>(32334, 173966310063614790L ^ var16), true.m<invokedynamic>(32711, 3700641875750365901L ^ var16), 0)))};
                  U = var23;
                  e = new yx(var20, (char)var21, var22);
                  S = qi.R((il)e, true.m<invokedynamic>(280, 8007845891352810515L ^ var16), false, (pj)null, (Function0)null, (int)var0, var18, (Object)null);
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var30;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "~\u009c»ÊÊãbÎ¿\u0003  ?Øªi\u0083qê\u0005X±>\u008c3\u001e\u0091\u0003îÐw\u0015 FÊ½iù«P¢n\u0096þ;ßõö\"Ð\u0006ab\bóS¡î\u0085Ü¥ø\u000b-º";
               var13 = "~\u009c»ÊÊãbÎ¿\u0003  ?Øªi\u0083qê\u0005X±>\u008c3\u001e\u0091\u0003îÐw\u0015 FÊ½iù«P¢n\u0096þ;ßõö\"Ð\u0006ab\bóS¡î\u0085Ü¥ø\u000b-º".length();
               var10 = ' ';
               var9 = -1;
            }

            ++var9;
            var24 = var11.substring(var9, var9 + var10);
            var26 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6677;
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
            throw new RuntimeException("su/catlean/yx", var10);
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
         throw new RuntimeException("su/catlean/yx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
