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
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.FlagEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class yt extends k9 {
   @NotNull
   public static final yt c;
   // $FF: synthetic field
   static final KProperty[] Q;
   @NotNull
   private static final zo W;
   private static float V;
   private static float f;
   private static final long b = j0.a(17085999951527675L, 3895519399247695100L, MethodHandles.lookup().lookupClass()).a(145301915321381L);
   private static final String[] d;
   private static final String[] e;
   private static final Map g;

   private yt(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 52431473523708L;
      super(var3, true.q<invokedynamic>(21456, 6704492167823329486L ^ var1), pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   public final boolean v(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 132904481539219L;
      int var3 = (int)((var1 ^ 132904481539219L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      k9[] var6 = -5224152775173963543L.A<invokedynamic>(-5224152775173963543L, var1);

      try {
         boolean var10000 = (Boolean)W.k((short)var3, this, Q[0], (short)var4, var5);
         if (var6 == null) {
            (new int[4]).A<invokedynamic>(new int[4], -5232407188894878503L, var1);
         }

         return var10000;
      } catch (NumberFormatException var7) {
         throw var7.A<invokedynamic>(var7, -5244572801218600690L, var1);
      }
   }

   @Flow
   private final void j(PlayerUpdateEvent var1) {
      long var2 = b ^ 125379620942809L;
      long var4 = var2 ^ 48855190769136L;
      V = s8.f(var4).method_36454();
      f = s8.f(var4).method_36455();
   }

   @Flow
   private final void Y(FlagEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void y(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var16 = b ^ 73409372455644L;
      long var18 = var16 ^ 65644225897052L;
      long var20 = var16 ^ 38059786509919L;
      g = new HashMap(13);
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var16 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[6];
      int var12 = 0;
      String var11 = "·\u009cz(\u0091Ë\u001d@Ê¶¯í´\u0005Aë0=á/\u001fÀ4¯\u0006 áï|\u008e\u0018¤Ã\u001f\u0096y\u0012[æÌ¨úBà\u0014«\u009d\u0018G\u0099\u0014ak:\u008bxI\u000e9\u008cÓØò635bÆ.ük0Nf³\u0006çè\u008c\u00004ü{\u0002\u0002\u0095T\u0090´\n\\M\u0086\u00adæ+}\u000fR\u009cÎ\u007fß©G\b4\u009aÄÕØ¡\u0080çç\t\u009fAö²vÀqV³Ð&ÕEïò§®\u0096÷»dc®ÅÚ1ø×4ûÍµ´\u008cÅÊ\u0011üQÄþÃg\u0019\u0015nÙ^*\u0015¶z²'\u0004ñU\u0002\u001b\u0099&D\u00ad\u009a3T.SÍ:ÝA\\Ã\u0013\u001f\u000571\u0013½ÎË\u0016}§\u0097\u001d³\u0098ÛÌÔ\u0010\u009f\u001ag\u009dÿEi`._KÙY\u001dw\u0094\u0010\u00014x8qjP¸«¡9\u0016wéÄ\r";
      int var13 = "·\u009cz(\u0091Ë\u001d@Ê¶¯í´\u0005Aë0=á/\u001fÀ4¯\u0006 áï|\u008e\u0018¤Ã\u001f\u0096y\u0012[æÌ¨úBà\u0014«\u009d\u0018G\u0099\u0014ak:\u008bxI\u000e9\u008cÓØò635bÆ.ük0Nf³\u0006çè\u008c\u00004ü{\u0002\u0002\u0095T\u0090´\n\\M\u0086\u00adæ+}\u000fR\u009cÎ\u007fß©G\b4\u009aÄÕØ¡\u0080çç\t\u009fAö²vÀqV³Ð&ÕEïò§®\u0096÷»dc®ÅÚ1ø×4ûÍµ´\u008cÅÊ\u0011üQÄþÃg\u0019\u0015nÙ^*\u0015¶z²'\u0004ñU\u0002\u001b\u0099&D\u00ad\u009a3T.SÍ:ÝA\\Ã\u0013\u001f\u000571\u0013½ÎË\u0016}§\u0097\u001d³\u0098ÛÌÔ\u0010\u009f\u001ag\u009dÿEi`._KÙY\u001dw\u0094\u0010\u00014x8qjP¸«¡9\u0016wéÄ\r".length();
      char var10 = '(';
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
                  d = var14;
                  e = new String[6];
                  Cipher var2;
                  var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var3 = 1; var3 < 8; ++var3) {
                     var10003[var3] = (byte)((int)(var16 << var3 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var4 = 7032204376070930458L;
                  byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                  long var30 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                  boolean var26 = true;
                  long var0 = var30;
                  KProperty[] var22 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yt.class, true.q<invokedynamic>(29194, 1485493450250139496L ^ var16), true.q<invokedynamic>(32574, 8096767485623515738L ^ var16), 0)))};
                  Q = var22;
                  c = new yt(var18);
                  W = qi.R((il)c, true.q<invokedynamic>(1081, 4068147566599946586L ^ var16), true, (pj)null, (Function0)null, (int)var0, var20, (Object)null);
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

               var11 = "\u009d2¦}\tØ\u001a\u0084\u009f=w\\\u0082\u0090\u009a\u0082u\u008fÍã\u0084¿Z¹\u0015(\"&\u000fÄÛH\u0018\u001aL\u00101+\u0001\u001e\u0099(]d\u001eéë\u008a`mÈ\u009e·?_°\u008d";
               var13 = "\u009d2¦}\tØ\u001a\u0084\u009f=w\\\u0082\u0090\u009a\u0082u\u008fÍã\u0084¿Z¹\u0015(\"&\u000fÄÛH\u0018\u001aL\u00101+\u0001\u001e\u0099(]d\u001eéë\u008a`mÈ\u009e·?_°\u008d".length();
               var10 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31646;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/yt", var10);
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
         throw new RuntimeException("su/catlean/yt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
