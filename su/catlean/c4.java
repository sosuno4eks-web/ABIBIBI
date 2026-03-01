package su.catlean;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.flow.FlowControlHandler;
import io.netty.handler.proxy.ProxyHandler;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_9130.class_9131;
import net.minecraft.class_9130.class_9133;

public final class c4 extends ChannelInitializer {
   final v1 s;
   private static final long a = j0.a(5351023420384583779L, 3297363249018226224L, MethodHandles.lookup().lookupClass()).a(239430673440879L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long e;

   c4(v1 var1) {
      this.s = var1;
   }

   protected void S(long a, SocketChannel ch) {
      var1 ^= a;
      int[] var10000 = -8984769557345258864L.A<invokedynamic>(-8984769557345258864L, var1);
      Intrinsics.checkNotNullParameter(var3, true.m<invokedynamic>(20031, 2756538777211486689L ^ var1));
      int[] var4 = var10000;
      ChannelPipeline var8 = var3.pipeline();
      ChannelHandler[] var5 = new ChannelHandler[]{new FlowControlHandler()};
      var8 = var8.addLast(var5).addLast(true.m<invokedynamic>(18708, 4367346446255310536L ^ var1), (ChannelHandler)(new ReadTimeoutHandler((int)e))).addLast(true.m<invokedynamic>(1811, 5419640852366100684L ^ var1), (ChannelHandler)(new class_9131())).addLast(true.m<invokedynamic>(25055, 6020851795214593538L ^ var1), (ChannelHandler)(new class_9133()));
      var5 = new ChannelHandler[1];

      ChannelHandler[] var10001;
      byte var10002;
      ProxyHandler var10003;
      label33: {
         try {
            var10001 = var5;
            var10002 = 0;
            if (this.s.k()) {
               var10003 = (ProxyHandler)(new Socks4ProxyHandler((SocketAddress)(new InetSocketAddress(this.s.W(), this.s.b())), this.s.R()));
               break label33;
            }
         } catch (NumberFormatException var7) {
            throw var7.A<invokedynamic>(var7, -8950098532446980565L, var1);
         }

         var10003 = (ProxyHandler)(new Socks5ProxyHandler((SocketAddress)(new InetSocketAddress(this.s.W(), this.s.b())), this.s.R(), this.s.M()));
      }

      var10001[var10002] = var10003;
      var8 = var8.addLast(var5);
      var5 = new ChannelHandler[1];

      try {
         var5[0] = new r0();
         var8.addLast(var5);
         var10000 = var4;
         if (var1 >= 0L) {
            if (var4 != null) {
               return;
            }

            var10000 = new int[4];
         }

         var10000.A<invokedynamic>(var10000, -8988134984702082824L, var1);
      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, -8950098532446980565L, var1);
      }
   }

   public void initChannel(Channel p0) {
      long var2 = a ^ 15971609112240L;
      long var4 = var2 ^ 69469575834847L;
      this.S(var4, (SocketChannel)var1);
   }

   static {
      long var5 = a ^ 20258180974660L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[4];
      int var12 = 0;
      String var11 = " Í\u009cd& ¤Ð:õ+Ò·O\u0091à.xÕ·ß\u0094÷\u0019öÓ\u009e^\u0091\u007f\u0096\u009b4I\u001f\u008d\u0085OÑí(×ØFK0\u0000\u0014_\u008añù¯E¥\u008f|\u0095§Da~bÓÿ\u0018\u0002«\u0006©\u0094\u008b(Ï¨Ì0\u009a\u0016HÖ";
      int var13 = " Í\u009cd& ¤Ð:õ+Ò·O\u0091à.xÕ·ß\u0094÷\u0019öÓ\u009e^\u0091\u007f\u0096\u009b4I\u001f\u008d\u0085OÑí(×ØFK0\u0000\u0014_\u008añù¯E¥\u008f|\u0095§Da~bÓÿ\u0018\u0002«\u0006©\u0094\u008b(Ï¨Ì0\u009a\u0016HÖ".length();
      char var10 = '(';
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var16 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = a(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var21;
               if ((var9 += var10) >= var13) {
                  b = var14;
                  c = new String[4];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = -5769320996568906441L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  e = var23;
                  return;
               }

               var10 = var11.charAt(var9);
               break;
            default:
               var14[var12++] = var21;
               if ((var9 += var10) < var13) {
                  var10 = var11.charAt(var9);
                  continue label37;
               }

               var11 = "ó9ö{âO+ÖÚÿ9ÏjR\u001b\u000e(´*Ò/\u000eíÀ\u008a\u0017'!Ll¯\u0010ø\u0001bÞä\u0093Ò\u00adÈ\u0002\u0088(ü¨´aÑ\u008d*Îlö,=c";
               var13 = "ó9ö{âO+ÖÚÿ9ÏjR\u001b\u000e(´*Ò/\u000eíÀ\u008a\u0017'!Ll¯\u0010ø\u0001bÞä\u0093Ò\u00adÈ\u0002\u0088(ü¨´aÑ\u008d*Îlö,=c".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String a(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3507;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/c4", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = b[var5].getBytes("ISO-8859-1");
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/c4" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
