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
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.gofra.Flow;

public final class ka extends k9 {
   @NotNull
   public static final ka R;
   // $FF: synthetic field
   static final KProperty[] d;
   @NotNull
   private static final zo n;
   private static boolean g;
   private static final long b = j0.a(2954777954218781171L, 6112334440450455974L, MethodHandles.lookup().lookupClass()).a(48890931031958L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f;

   private ka(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 53404457362009L;
      super(var3, true.c<invokedynamic>(22192, 2107084417042570120L ^ var1), pa.E(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean c(char var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 32812606588307L;
      int var6 = (int)((var4 ^ 32812606588307L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)n.k((short)var6, this, d[0], (short)var7, var8);
   }

   public final boolean J() {
      return g;
   }

   public final void M(boolean <set-?>) {
      g = var1;
   }

   @Flow(
      priority = 10
   )
   private final void u(TickEvent param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var16 = b ^ 56649007339531L;
      long var18 = var16 ^ 2800613279736L;
      long var20 = var16 ^ 94317587685678L;
      f = new HashMap(13);
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var16 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[4];
      int var12 = 0;
      String var11 = "\u000f7À\u0000¯\u0099CY\u008eí4;b\u0087Ô\u000f(ÁR£x\u0018\u009c\u001dc2IL\u0087GZý](ÁJ@¼Ç\u0093\u0091.&\u0018Cx\u0015áÝ\u0092Í\u0081\u0097-1\u0096è";
      int var13 = "\u000f7À\u0000¯\u0099CY\u008eí4;b\u0087Ô\u000f(ÁR£x\u0018\u009c\u001dc2IL\u0087GZý](ÁJ@¼Ç\u0093\u0091.&\u0018Cx\u0015áÝ\u0092Í\u0081\u0097-1\u0096è".length();
      char var10 = 16;
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var23 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var23.getBytes("ISO-8859-1"));
            String var28 = b(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var28;
               if ((var9 += var10) >= var13) {
                  c = var14;
                  e = new String[4];
                  Cipher var2;
                  var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var3 = 1; var3 < 8; ++var3) {
                     var10003[var3] = (byte)((int)(var16 << var3 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var4 = -5822517604269410036L;
                  byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                  long var30 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                  boolean var26 = true;
                  long var0 = var30;
                  KProperty[] var22 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ka.class, true.c<invokedynamic>(24411, 7102395100368260124L ^ var16), true.c<invokedynamic>(13875, 6468788354008425847L ^ var16), 0)))};
                  d = var22;
                  R = new ka(var20);
                  n = qi.R((il)R, true.c<invokedynamic>(5147, 3312961714182260573L ^ var16), false, (pj)null, (Function0)null, (int)var0, var18, (Object)null);
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var28;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "Cb{1*Ä<Wù\u001ai\u0088%<ÝòW\u0012\u007f¡+e\u0005þ\u0018\u0015d\u000eÞ¸W+wkÄËó¼\u0007\u0089 ÉCc\u007fÐU²\u001c";
               var13 = "Cb{1*Ä<Wù\u001ai\u0088%<ÝòW\u0012\u007f¡+e\u0005þ\u0018\u0015d\u000eÞ¸W+wkÄËó¼\u0007\u0089 ÉCc\u007fÐU²\u001c".length();
               var10 = 24;
               var9 = -1;
            }

            ++var9;
            var23 = var11.substring(var9, var9 + var10);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29725;
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
            throw new RuntimeException("su/catlean/ka", var10);
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
         throw new RuntimeException("su/catlean/ka" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
