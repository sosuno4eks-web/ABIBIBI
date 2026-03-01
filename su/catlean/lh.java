package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.api.event.events.world.EntityRemove;
import su.catlean.gofra.Flow;

public final class lh extends k9 {
   @NotNull
   public static final lh d;
   @NotNull
   private static final List S;
   private static int u;
   private static final long b = j0.a(-1201110712304569268L, 2429244842002300474L, MethodHandles.lookup().lookupClass()).a(52549261286638L);
   private static final String[] c;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map k;

   private lh(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 9368762830538L;
      super(var3, true.v<invokedynamic>(15455, 6615558844351609814L ^ var1), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   @Flow
   private final void w(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void W(TickEvent var1) {
      S.removeIf(lh::B);
   }

   @Flow
   private final void V(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void Q(EntityRemove param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean Y(fr param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean B(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var20 = b ^ 133953773638575L;
      long var22 = var20 ^ 43492832232985L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[12];
      int var16 = 0;
      String var15 = "]k2\u0084¨\u0083~©¾Ðgi\u008b|ßÊ\\ø+P\u008fvvh4Q·êF§\u0007§Ð\u001e\u0092\u0097Z\u0096£°\u0010\nÕK\u0002Mñ~\u000bÊ\u007f¨½ç(=W ·+H\u0096ådÚèæQ`ò_%\u0096\u00888#E@d`¿\u0087\u0096\u0013zçÚ£kF(mQ-\u008b®·a}&(\u0085¶·\u008421ÿ\u0090v^îà\u0098ÃÂ³!'\u0001DÆßó\u0007÷ó\u0088CI\u0087 xö\u009dè2¤\u0015 \u008e\u0005L\u0003Cu\u001e{é\u009f\u0088fWÛ\u0092LÇK]óÊ#Êj  ÖÂ\u0080\u0087\u008aA\u0010øÙ\u008e¾!ü\u0094\u009fmü\u001b§@Æ5ÁH\u009f×\u000e\u0081<\u0015c Z\u0080\u0003\u0091þ\u001cÓîßàA6m2\u0098D\u0090H\u000bJ]®\u009c<ÚH®ÒöÐ\u008b\u0099(ó×Ð8\u0003®\u009es6/89\n\tðõ\u0006@\u0086À\u001cBx\u0004[s\u0006\u007f<¦ÌK4ví\u008aaË\u0087X Ñ\u008cik\u009bÌ\u000e\u009d\u0097\u0096×sF\u00107!\u0006ÍPf-,_µ\u0010a\u0012Ç0ÂBí(`\u0092\u00048x\u000f\u009fq\u001a\u0094Ìf\u0091I8~à*kÒ]\u008e¾Ù\u0001µ\bI\u0085Å\u009bQ£\u0094I\u0017\u0013*\u000f\u007f";
      int var17 = "]k2\u0084¨\u0083~©¾Ðgi\u008b|ßÊ\\ø+P\u008fvvh4Q·êF§\u0007§Ð\u001e\u0092\u0097Z\u0096£°\u0010\nÕK\u0002Mñ~\u000bÊ\u007f¨½ç(=W ·+H\u0096ådÚèæQ`ò_%\u0096\u00888#E@d`¿\u0087\u0096\u0013zçÚ£kF(mQ-\u008b®·a}&(\u0085¶·\u008421ÿ\u0090v^îà\u0098ÃÂ³!'\u0001DÆßó\u0007÷ó\u0088CI\u0087 xö\u009dè2¤\u0015 \u008e\u0005L\u0003Cu\u001e{é\u009f\u0088fWÛ\u0092LÇK]óÊ#Êj  ÖÂ\u0080\u0087\u008aA\u0010øÙ\u008e¾!ü\u0094\u009fmü\u001b§@Æ5ÁH\u009f×\u000e\u0081<\u0015c Z\u0080\u0003\u0091þ\u001cÓîßàA6m2\u0098D\u0090H\u000bJ]®\u009c<ÚH®ÒöÐ\u008b\u0099(ó×Ð8\u0003®\u009es6/89\n\tðõ\u0006@\u0086À\u001cBx\u0004[s\u0006\u007f<¦ÌK4ví\u008aaË\u0087X Ñ\u008cik\u009bÌ\u000e\u009d\u0097\u0096×sF\u00107!\u0006ÍPf-,_µ\u0010a\u0012Ç0ÂBí(`\u0092\u00048x\u000f\u009fq\u001a\u0094Ìf\u0091I8~à*kÒ]\u008e¾Ù\u0001µ\bI\u0085Å\u009bQ£\u0094I\u0017\u0013*\u000f\u007f".length();
      char var14 = '(';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var24 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var30 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var30;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  e = new String[12];
                  k = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[14];
                  int var3 = 0;
                  String var4 = "Û²\u001d\u0010¾,\u001fT\u001f´\u0095©X39\u0016GYH\u009bÃ/æ\u009b\u0011Wõ\u0098G\u0006¹Òáo\u0084\u0082\u001f0W\u008aÔ\u0006Y\u0093¼(Rx\u0004Ã\u001aÕ*\u0017Ãý\u009d»ºÅ<¶Í³¿Ô\u008fº\u0099\u0093,ÔÝ&Ã\u0007¡\u0004s1qþ# ÈÝ\u0011|Ú$ð´\u0093¡Øï";
                  int var5 = "Û²\u001d\u0010¾,\u001fT\u001f´\u0095©X39\u0016GYH\u009bÃ/æ\u009b\u0011Wõ\u0098G\u0006¹Òáo\u0084\u0082\u001f0W\u008aÔ\u0006Y\u0093¼(Rx\u0004Ã\u001aÕ*\u0017Ãý\u009d»ºÅ<¶Í³¿Ô\u008fº\u0099\u0093,ÔÝ&Ã\u0007¡\u0004s1qþ# ÈÝ\u0011|Ú$ð´\u0093¡Øï".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var28 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                     long[] var27 = var6;
                     var28 = var3++;
                     long var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var33 = -1;

                     while(true) {
                        long var8 = var32;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var35 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var33) {
                        case 0:
                           var27[var28] = var35;
                           if (var2 >= var5) {
                              g = var6;
                              i = new Integer[14];
                              d = new lh(var22);
                              S = (List)(new ArrayList());
                              u = -1;
                              return;
                           }
                           break;
                        default:
                           var27[var28] = var35;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0092F\u0095)©±Ñ\u0087]ác\u0006ö\u001bJ§";
                           var5 = "\u0092F\u0095)©±Ñ\u0087]ác\u0006ö\u001bJ§".length();
                           var2 = 0;
                        }

                        var28 = var2;
                        var2 += 8;
                        var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        var27 = var6;
                        var28 = var3++;
                        var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var33 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var30;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "0\u0091P´\u00ad\u000f\u0083.&Ë\u0080l\u001b\u000bB6¢<%\u0000!RuJnï÷¦öþ+Å¸j>Ñ~\u0091&\u0003\u009c\u009f÷.Ô\u0014ý\u009eÃ¢`W\f\u000fÖ)o±´>!\"\u0012sï\u0003+7\u0080Q\u009c»~Z\u001a(á=\u0006¾ÀÛ3ª>å¦~Úóp$=¼Áä:m§éKÒh¸!=×\u0080\u0099,\u0000æ\u0096CÓÌi\tc\u009dÜÌ[uÃµ\u0005ê\u0093~ÝÂù\u0096÷@·ô\b\u0094\u0096\u0083iX¥Û>Ó.¥_Ü<é\\É_\u001e4u\u0081ÈÄ\u0005°Á\u0002Rl$\"²\u0085³#ÍµÅüÑ\u0087 j3\u0013\t\\áÅ¶ð\u0015ò´h]Pß\\\u001e÷m¥\u00adõ\u009f3\u0016\u0011 \u00ad\u0081K9\u001d¶3";
               var17 = "0\u0091P´\u00ad\u000f\u0083.&Ë\u0080l\u001b\u000bB6¢<%\u0000!RuJnï÷¦öþ+Å¸j>Ñ~\u0091&\u0003\u009c\u009f÷.Ô\u0014ý\u009eÃ¢`W\f\u000fÖ)o±´>!\"\u0012sï\u0003+7\u0080Q\u009c»~Z\u001a(á=\u0006¾ÀÛ3ª>å¦~Úóp$=¼Áä:m§éKÒh¸!=×\u0080\u0099,\u0000æ\u0096CÓÌi\tc\u009dÜÌ[uÃµ\u0005ê\u0093~ÝÂù\u0096÷@·ô\b\u0094\u0096\u0083iX¥Û>Ó.¥_Ü<é\\É_\u001e4u\u0081ÈÄ\u0005°Á\u0002Rl$\"²\u0085³#ÍµÅüÑ\u0087 j3\u0013\t\\áÅ¶ð\u0015ò´h]Pß\\\u001e÷m¥\u00adõ\u009f3\u0016\u0011 \u00ad\u0081K9\u001d¶3".length();
               var14 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4667;
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
            throw new RuntimeException("su/catlean/lh", var10);
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
         throw new RuntimeException("su/catlean/lh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5496;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
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
            throw new RuntimeException("su/catlean/lh", var14);
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
         throw new RuntimeException("su/catlean/lh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
