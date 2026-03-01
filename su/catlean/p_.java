package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.SocketAddress;
import java.net.UnixDomainSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class p_ extends p0 {
   private final Selector Y;
   private final SocketChannel a;
   @Nullable
   private bk e;
   @Nullable
   private Integer I;
   @Nullable
   private ByteBuffer p;
   private final ByteBuffer c;
   private static final long d = j0.a(5996837639241851337L, 8310751259409611737L, MethodHandles.lookup().lookupClass()).a(193072421926223L);
   private static final String[] i;
   private static final String[] j;
   private static final Map k = new HashMap(13);
   private static final long m;

   public p_(int a, @NotNull String name, short a, char a) {
      long var5 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ d;
      Intrinsics.checkNotNullParameter(var2, true.m<invokedynamic>(25714, 7575423172180396282L ^ var5));
      super();
      this.Y = Selector.open();
      this.a = SocketChannel.open((SocketAddress)UnixDomainSocketAddress.of(var2));
      boolean var10000 = 826770111928803378L.A<invokedynamic>(826770111928803378L, var5);
      this.c = ByteBuffer.allocate(4);
      this.a.configureBlocking(false);
      this.a.register(this.Y, 1);
      boolean var7 = var10000;

      try {
         ThreadsKt.thread$default(true, false, (ClassLoader)null, true.m<invokedynamic>(22970, 2808965274859566384L ^ var5), 0, p_::g, (int)m, (Object)null);
         if (var7) {
            (new int[5]).A<invokedynamic>(new int[5], 824930117666064585L, var5);
         }

      } catch (NumberFormatException var8) {
         throw var8.A<invokedynamic>(var8, 858167706981958403L, var5);
      }
   }

   private final void e(long param1) {
      // $FF: Couldn't be decompiled
   }

   protected void N(long a, @NotNull ByteBuffer buffer) {
      Intrinsics.checkNotNullParameter(var3, true.m<invokedynamic>(7537, 8539539625523261743L ^ var1));
      p_ var4 = this;

      Result.Companion var10000;
      Object var5;
      try {
         var10000 = Result.Companion;
         p_ var8 = (p_)var4;
         boolean var6 = false;
         var5 = Result.constructor-impl(var8.a.write(var3));
      } catch (Throwable var7) {
         var10000 = Result.Companion;
         var5 = Result.constructor-impl(ResultKt.createFailure(var7));
      }

   }

   public void E() {
      p_ var1 = this;

      Result.Companion var10000;
      Object var2;
      try {
         var10000 = Result.Companion;
         p_ var5 = (p_)var1;
         boolean var3 = false;
         var5.a.close();
         var5.Y.close();
         var2 = Result.constructor-impl(Unit.INSTANCE);
      } catch (Throwable var4) {
         var10000 = Result.Companion;
         var2 = Result.constructor-impl(ResultKt.createFailure(var4));
      }

   }

   private final t D(ReadableByteChannel param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private final boolean R(long param1, ReadableByteChannel param3) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit g(p_ var0) {
      long var1 = d ^ 18782784258021L;
      long var3 = var1 ^ 64631689876959L;
      var0.e(var3);
      return Unit.INSTANCE;
   }

   private static final boolean m(p_ var0, SelectionKey var1) {
      long var2 = d ^ 46238605390593L;
      long var10001 = var2 ^ 69825151702210L;
      int var4 = (int)((var2 ^ 69825151702210L) >>> 32);
      long var5 = var10001 << 32 >>> 32;
      long var7 = var2 ^ 137422427228048L;
      boolean var9 = -8454443041001969361L.A<invokedynamic>(-8454443041001969361L, var2);

      label48: {
         boolean var10000;
         try {
            var10000 = var1.isReadable();
            if (!var9) {
               return var10000;
            }

            if (var10000) {
               break label48;
            }
         } catch (NumberFormatException var14) {
            throw var14.A<invokedynamic>(var14, -8480325978642218332L, var2);
         }

         var10000 = false;
         return var10000;
      }

      SocketChannel var16 = var0.a;
      Intrinsics.checkNotNullExpressionValue(var16, true.m<invokedynamic>(28967, 4956612295603739659L ^ var2));
      t var10 = var0.D((ReadableByteChannel)var16, var7);

      t var15;
      label30: {
         try {
            var15 = var10;
            if (!var9) {
               break label30;
            }

            if (var10 == null) {
               return false;
            }
         } catch (NumberFormatException var13) {
            throw var13.A<invokedynamic>(var13, -8480325978642218332L, var2);
         }

         var15 = var10;
      }

      t var11 = var15;
      boolean var12 = false;
      co.P.I(var11, var4, var5);
      return true;
   }

   private static final boolean R(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var5 = d ^ 87350740083473L;
      Cipher var7;
      Cipher var10000 = var7 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var8 = 1; var8 < 8; ++var8) {
         var10003[var8] = (byte)((int)(var5 << var8 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var14 = new String[5];
      int var12 = 0;
      String var11 = "©\u009dr9üå¼\u00957Ñ\u009c¦¤\u009fèZ á-|¾2\u0099K¾à\u0097\u001f\u0004Ôi\u0018§NTL*â14@Lÿ®ñ{\u009b\u008220ý¾\u0083±\u0011I\u001a×\b]5\u008c§µ\u007fK\u001díÇ~»¿\u008e6\u0080\u00025.Ðz©EÄZÒp\u009cé·ØT¦X¢ú×@î";
      int var13 = "©\u009dr9üå¼\u00957Ñ\u009c¦¤\u009fèZ á-|¾2\u0099K¾à\u0097\u001f\u0004Ôi\u0018§NTL*â14@Lÿ®ñ{\u009b\u008220ý¾\u0083±\u0011I\u001a×\b]5\u008c§µ\u007fK\u001díÇ~»¿\u008e6\u0080\u00025.Ðz©EÄZÒp\u009cé·ØT¦X¢ú×@î".length();
      char var10 = 16;
      int var9 = -1;

      label37:
      while(true) {
         ++var9;
         String var16 = var11.substring(var9, var9 + var10);
         byte var10001 = -1;

         while(true) {
            byte[] var15 = var7.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = b(var15).intern();
            switch(var10001) {
            case 0:
               var14[var12++] = var21;
               if ((var9 += var10) >= var13) {
                  i = var14;
                  j = new String[5];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var5 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var5 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 3224423429400801410L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  m = var23;
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

               var11 = "¹\u0090;&LÎs\u009f¥\u0093oT©oÓú\u0010ÙN\f\u001b3«\nÜäVþ3\u000fD\u0095\u0087";
               var13 = "¹\u0090;&LÎs\u009f¥\u0093oT©oÓú\u0010ÙN\f\u001b3«\nÜäVþ3\u000fD\u0095\u0087".length();
               var10 = 16;
               var9 = -1;
            }

            ++var9;
            var16 = var11.substring(var9, var9 + var10);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9942;
      if (j[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])k.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/p_", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = i[var5].getBytes("ISO-8859-1");
         j[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return j[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
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
         throw new RuntimeException("su/catlean/p_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
