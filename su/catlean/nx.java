package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class nx extends nm {
   @NotNull
   public static final nx G;
   @NotNull
   private static final List i;
   @NotNull
   private static final aa W;
   private static final long c = j0.a(-5632845586749402234L, 6536747016745194945L, MethodHandles.lookup().lookupClass()).a(242831378908576L);
   private static final String[] d;
   private static final String[] e;
   private static final Map j;
   private static final long[] m;
   private static final Integer[] n;
   private static final Map p;

   private nx(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 124262669566821L;
      super(true.f<invokedynamic>(7706, 2124363697271154327L ^ var1), var3);
   }

   public void k(@NotNull class_332 context, long a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final String k(int ticks, long a) {
      var2 ^= c;
      int var10000 = var1 / true.j<invokedynamic>(18601, 2707887047843283715L ^ var2);
      StringCompanionObject var10001 = StringCompanionObject.INSTANCE;
      String var4 = true.f<invokedynamic>(18464, 601097633356469029L ^ var2);
      Object[] var5 = new Object[]{var1 % true.j<invokedynamic>(8386, 1907690991140399978L ^ var2) / true.j<invokedynamic>(15071, 8399875960104022384L ^ var2)};
      String var6 = String.format(var4, Arrays.copyOf(var5, var5.length));
      Intrinsics.checkNotNullExpressionValue(var6, true.f<invokedynamic>(17668, 925127570145107461L ^ var2));
      return var10000 + ":" + var6;
   }

   private static final boolean S(gp param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean w(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var27 = c ^ 24777065854491L;
      long var29 = var27 ^ 110446708443474L;
      long var10001 = var27 ^ 35392316192395L;
      int var31 = (int)((var27 ^ 35392316192395L) >>> 48);
      int var32 = (int)(var10001 << 16 >>> 48);
      int var33 = (int)(var10001 << 32 >>> 32);
      j = new HashMap(13);
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var27 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[15];
      int var23 = 0;
      String var22 = "¨§'\u0001&\u0017rbp\u0011E\t\u0089éhü0®\u0081<ÈËÐeÎ \u0082g\t¦É³}¢G\u0017\u009c\u008b;i\u0088¯¯\u0081'bû_4$.¸,V\u0088\u008fs\u001fÅ\u0089*hÛJ\u009fh6ÌÜ\u008a÷xâ\u009cypS9¨5ða\u001eÇáF·Ø\u0015T\u0007\u0099OSùì\u0012Ôéäîb¡°på\u0092á\u00adgÓJ\u000eÃp\u0089\u0087\u0001çî?Sõ;ð\brnº:¡#2S\u0018zÃôL¡ÁW'd/\f[Ó\u001bf\u0003·%Õ\u001f\u0018`þ\u007fÙË<\u0002\u009b\u008cJï\u0016|\u0012ò)\u008b\u0001ðé¦0ãåö\u0002Ò\u0006Ã4Î.¼BlÂ\u000e\u0088hN\t10R§~À\u0088\u009fo°<'Ôsk«Rou\u0015\u0005\u0095ú*j¹38\u008b\u0090fÉ25K÷#Ã§\"þ)xQ\u008dY\u0011°\u0088æ\u008cÞy^<\u009aÖÈ²¤\u009e\u000fñnÞ\\ÔÕÓê\u007fX$\u0088'oqBï¾:\u0082\u0082¾\u009b×\u0011\u0006µ:c]Êþúúl\u0017ñ$ÞQ®ÖcÝÓ1W\u000fÜí\u008cfiI\u001fæj(ß½ò,ÂÜ¶Zî\u007f\u0087Ï\u0098ñ\u0004WGL2¡v\b\u0016Ì\u0005GH}\u009f\u0080 \u000b|],$p\u008a²~N9\u0011[V\u009bÑÇR.Ågùh JD1}a\fíøÃî}¹ÁÇ2\u0092\u0014\f\u008aü\rÁ!Z²\u000e\u0001\u008fT\u001fÃ\u0087\u0010\u009fc\u0006¶å\u0018Ï\u001do\fë\u009aGé8«\u0018À©°\u001d\u0094#«¾i\u0096\u0098¯I.8²þ,\u000eÐ¯\u0003ÞL(\u0085¶(\u0010¿¸\"\u0086¿\u00953îvl p³lRú{w&ô÷5ÚÇ@id¡àó²àr|\u009a*\u0010MÒ\u00ad×\u001f@\u008aJ\u0002àXj\nµFf\u0018\u001b2 ï\u008f\\åi¬¶ÜpYýèÍ*%\u009f\u0086t´7% ÊVH¿jÝèTâ\u0088±\u001dg¹.\u009d\u000eij\n\u000fb}\u0002Eß£YXgsË(\u009e4 ½è¿F=¨ùÿ²õèr\u009dXÌì¬ì\u0010|\u0087v)ôc´\u0017ÎÕ\u0086~óª\u001d!\u0097\u0089 \u0087\u008eY\u0086\u008d¦ÖNÑE\u0006Í|\u00adæã\u0080´Mìõü\u00ad¨û\u0002Ì2®Ü*Q";
      int var24 = "¨§'\u0001&\u0017rbp\u0011E\t\u0089éhü0®\u0081<ÈËÐeÎ \u0082g\t¦É³}¢G\u0017\u009c\u008b;i\u0088¯¯\u0081'bû_4$.¸,V\u0088\u008fs\u001fÅ\u0089*hÛJ\u009fh6ÌÜ\u008a÷xâ\u009cypS9¨5ða\u001eÇáF·Ø\u0015T\u0007\u0099OSùì\u0012Ôéäîb¡°på\u0092á\u00adgÓJ\u000eÃp\u0089\u0087\u0001çî?Sõ;ð\brnº:¡#2S\u0018zÃôL¡ÁW'd/\f[Ó\u001bf\u0003·%Õ\u001f\u0018`þ\u007fÙË<\u0002\u009b\u008cJï\u0016|\u0012ò)\u008b\u0001ðé¦0ãåö\u0002Ò\u0006Ã4Î.¼BlÂ\u000e\u0088hN\t10R§~À\u0088\u009fo°<'Ôsk«Rou\u0015\u0005\u0095ú*j¹38\u008b\u0090fÉ25K÷#Ã§\"þ)xQ\u008dY\u0011°\u0088æ\u008cÞy^<\u009aÖÈ²¤\u009e\u000fñnÞ\\ÔÕÓê\u007fX$\u0088'oqBï¾:\u0082\u0082¾\u009b×\u0011\u0006µ:c]Êþúúl\u0017ñ$ÞQ®ÖcÝÓ1W\u000fÜí\u008cfiI\u001fæj(ß½ò,ÂÜ¶Zî\u007f\u0087Ï\u0098ñ\u0004WGL2¡v\b\u0016Ì\u0005GH}\u009f\u0080 \u000b|],$p\u008a²~N9\u0011[V\u009bÑÇR.Ågùh JD1}a\fíøÃî}¹ÁÇ2\u0092\u0014\f\u008aü\rÁ!Z²\u000e\u0001\u008fT\u001fÃ\u0087\u0010\u009fc\u0006¶å\u0018Ï\u001do\fë\u009aGé8«\u0018À©°\u001d\u0094#«¾i\u0096\u0098¯I.8²þ,\u000eÐ¯\u0003ÞL(\u0085¶(\u0010¿¸\"\u0086¿\u00953îvl p³lRú{w&ô÷5ÚÇ@id¡àó²àr|\u009a*\u0010MÒ\u00ad×\u001f@\u008aJ\u0002àXj\nµFf\u0018\u001b2 ï\u008f\\åi¬¶ÜpYýèÍ*%\u009f\u0086t´7% ÊVH¿jÝèTâ\u0088±\u001dg¹.\u009d\u000eij\n\u000fb}\u0002Eß£YXgsË(\u009e4 ½è¿F=¨ùÿ²õèr\u009dXÌì¬ì\u0010|\u0087v)ôc´\u0017ÎÕ\u0086~óª\u001d!\u0097\u0089 \u0087\u008eY\u0086\u008d¦ÖNÑE\u0006Í|\u00adæã\u0080´Mìõü\u00ad¨û\u0002Ì2®Ü*Q".length();
      char var21 = '(';
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var34 = var22.substring(var20, var20 + var21);
         byte var36 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var34.getBytes("ISO-8859-1"));
            String var41 = b(var26).intern();
            switch(var36) {
            case 0:
               var25[var23++] = var41;
               if ((var20 += var21) >= var24) {
                  d = var25;
                  e = new String[15];
                  p = new HashMap(13);
                  Cipher var7;
                  var10000 = var7 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var8 = 1; var8 < 8; ++var8) {
                     var10003[var8] = (byte)((int)(var27 << var8 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var13 = new long[8];
                  int var10 = 0;
                  String var11 = "Øå\u0084³£¡ý\u0087ØuxÍ½ø¾\u008c\u001eÜÓ×j\u009a\u009d¯\u0089Ìë¼¨\u0098õÙ\u009d*ëÍË\u000e¯\u001b\u0096Uõibêx\u0010";
                  int var12 = "Øå\u0084³£¡ý\u0087ØuxÍ½ø¾\u008c\u001eÜÓ×j\u009a\u009d¯\u0089Ìë¼¨\u0098õÙ\u009d*ëÍË\u000e¯\u001b\u0096Uõibêx\u0010".length();
                  int var9 = 0;

                  label46:
                  while(true) {
                     int var40 = var9;
                     var9 += 8;
                     byte[] var14 = var11.substring(var40, var9).getBytes("ISO-8859-1");
                     long[] var37 = var13;
                     var40 = var10++;
                     long var44 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                     byte var45 = -1;

                     while(true) {
                        long var15 = var44;
                        byte[] var17 = var7.doFinal(new byte[]{(byte)((int)(var15 >>> 56)), (byte)((int)(var15 >>> 48)), (byte)((int)(var15 >>> 40)), (byte)((int)(var15 >>> 32)), (byte)((int)(var15 >>> 24)), (byte)((int)(var15 >>> 16)), (byte)((int)(var15 >>> 8)), (byte)((int)var15)});
                        long var47 = ((long)var17[0] & 255L) << 56 | ((long)var17[1] & 255L) << 48 | ((long)var17[2] & 255L) << 40 | ((long)var17[3] & 255L) << 32 | ((long)var17[4] & 255L) << 24 | ((long)var17[5] & 255L) << 16 | ((long)var17[6] & 255L) << 8 | (long)var17[7] & 255L;
                        switch(var45) {
                        case 0:
                           var37[var40] = var47;
                           if (var9 >= var12) {
                              m = var13;
                              n = new Integer[8];
                              Cipher var2;
                              var10000 = var2 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var27 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var3 = 1; var3 < 8; ++var3) {
                                 var10003[var3] = (byte)((int)(var27 << var3 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var4 = 6601990091098599429L;
                              byte[] var6 = var2.doFinal(new byte[]{(byte)((int)(var4 >>> 56)), (byte)((int)(var4 >>> 48)), (byte)((int)(var4 >>> 40)), (byte)((int)(var4 >>> 32)), (byte)((int)(var4 >>> 24)), (byte)((int)(var4 >>> 16)), (byte)((int)(var4 >>> 8)), (byte)((int)var4)});
                              var44 = ((long)var6[0] & 255L) << 56 | ((long)var6[1] & 255L) << 48 | ((long)var6[2] & 255L) << 40 | ((long)var6[3] & 255L) << 32 | ((long)var6[4] & 255L) << 24 | ((long)var6[5] & 255L) << 16 | ((long)var6[6] & 255L) << 8 | (long)var6[7] & 255L;
                              boolean var43 = true;
                              long var0 = var44;
                              G = new nx(var29);
                              i = (List)(new ArrayList());
                              W = new aa(sa.OUT_BACK, var0, (short)var31, (short)var32, var33);
                              return;
                           }
                           break;
                        default:
                           var37[var40] = var47;
                           if (var9 < var12) {
                              continue label46;
                           }

                           var11 = "§8aÑb£MÃ)=e\bJLôè";
                           var12 = "§8aÑb£MÃ)=e\bJLôè".length();
                           var9 = 0;
                        }

                        var40 = var9;
                        var9 += 8;
                        var14 = var11.substring(var40, var9).getBytes("ISO-8859-1");
                        var37 = var13;
                        var40 = var10++;
                        var44 = ((long)var14[0] & 255L) << 56 | ((long)var14[1] & 255L) << 48 | ((long)var14[2] & 255L) << 40 | ((long)var14[3] & 255L) << 32 | ((long)var14[4] & 255L) << 24 | ((long)var14[5] & 255L) << 16 | ((long)var14[6] & 255L) << 8 | (long)var14[7] & 255L;
                        var45 = 0;
                     }
                  }
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var41;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label64;
               }

               var22 = "\u0013Ïjv\b?YýôáÃ\u001dß\u0011ôLhwrv3<\u0088?Øô\u0098oåù\u007fÌô©h±ý#´x*g´i;\u009c@\u00ad\u001e9\"éi Ã\u009b\u001e\u0091D\u000e¨\bÊÒ\u0015\u0019ÄÃ!·ÈÙhÓ/ËQÁ®\u0080´p\u0010\u008a¤02StÏ\u0091v|ô¢[JÀ*\u001b*ó\u0091*\tÞ¼#Këuõ{²\u009b\u0002áÊ\u001dW\u0011ç]£\u0081ä)d\u001c{.I?ómî82»*±\u009fp}\u0085Xÿ\u0091\u009fGrä\u0010Cê§Ý\u001b\u001cRNæ ?\nÞh=ü";
               var24 = "\u0013Ïjv\b?YýôáÃ\u001dß\u0011ôLhwrv3<\u0088?Øô\u0098oåù\u007fÌô©h±ý#´x*g´i;\u009c@\u00ad\u001e9\"éi Ã\u009b\u001e\u0091D\u000e¨\bÊÒ\u0015\u0019ÄÃ!·ÈÙhÓ/ËQÁ®\u0080´p\u0010\u008a¤02StÏ\u0091v|ô¢[JÀ*\u001b*ó\u0091*\tÞ¼#Këuõ{²\u009b\u0002áÊ\u001dW\u0011ç]£\u0081ä)d\u001c{.I?ómî82»*±\u009fp}\u0085Xÿ\u0091\u009fGrä\u0010Cê§Ý\u001b\u001cRNæ ?\nÞh=ü".length();
               var21 = 152;
               var20 = -1;
            }

            ++var20;
            var34 = var22.substring(var20, var20 + var21);
            var36 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1988;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/nx", var10);
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
         throw new RuntimeException("su/catlean/nx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22372;
      if (n[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = m[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/nx", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/nx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
