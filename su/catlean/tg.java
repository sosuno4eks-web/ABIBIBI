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
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.PostTasksProcessEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.gofra.Flow;

public final class tg extends k9 {
   @NotNull
   public static final tg K;
   static final KProperty[] U;
   @NotNull
   private static final z0 n;
   @NotNull
   private static final zr d;
   @NotNull
   private static final z0 v;
   @NotNull
   private static final ArrayDeque m;
   @NotNull
   private static final iv T;
   @NotNull
   private static final iv Q;
   @NotNull
   private static final iv x;
   private static long e;
   private static int r;
   private static final long b = j0.a(5571783161537875871L, 4583450596071187594L, MethodHandles.lookup().lookupClass()).a(59927002997504L);
   private static final String[] c;
   private static final String[] f;
   private static final Map g;
   private static final long[] i;
   private static final Integer[] k;
   private static final Map l;
   private static final long o;

   private tg(long var1, char var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 82464344962300L;
      super(var6, true.q<invokedynamic>(18515, 4277638957706506245L ^ var4), pa.V(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final int x(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 35704458335923L;
      int var3 = (int)((var1 ^ 35704458335923L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)n.k((short)var3, this, U[0], (short)var4, var5)).intValue();
   }

   private final hz M(char var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ b;
      long var10001 = var4 ^ 128400810659597L;
      int var6 = (int)((var4 ^ 128400810659597L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (hz)d.k((short)var6, this, U[1], (short)var7, var8);
   }

   private final int w(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 44924046144091L;
      int var3 = (int)((var1 ^ 44924046144091L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)v.k((short)var3, this, U[2], (short)var4, var5)).intValue();
   }

   public final int A() {
      return r;
   }

   public final void r(int <set-?>) {
      r = var1;
   }

   @Flow
   private final void J(PostTasksProcessEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void S(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var25 = b ^ 88176474401424L;
      long var10001 = var25 ^ 85683500533008L;
      long var27 = (var25 ^ 85683500533008L) >>> 16;
      int var29 = (int)(var10001 << 48 >>> 48);
      long var30 = var25 ^ 48713288101721L;
      long var32 = var25 ^ 62706237302380L;
      g = new HashMap(13);
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var17 = 1; var17 < 8; ++var17) {
         var10003[var17] = (byte)((int)(var25 << var17 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[13];
      int var21 = 0;
      String var20 = "\u0017\u0012\u0084õ2>:*\u0088jý\u0085 \u0087t\u0019ú6öÝ\u0007\"ì¡;Æpù\u0089ïK´\u0010åÔ\u008f]nÌcEÀÎ\f\u0085Ï¶KÂ ·ôöÐ\u008d·½£ã3Y%\u0007ç\u0083\u007f¿\u00ad\u0083Â%Í¡\u0012\u0097ÈÍ\t\r\u008ffð\u0010~ \u0011±«ë\u0010ÑQ\u000f4Ê\u0094líÿ\u0010©Ô\u0084É2\u007fí®Vö¬5X\u0081[O°\u0099ìg}Ôùª\u0010ì×\u0081>?´wJå\u0005eD\u0087óPÄ)\u001a<ðY» ì\\\u008d\u0084l°2ª<\u0094\u0092\u0081Eçê\u0003¤â:m\u009d¥{'Øm\u0019<H\npý1òk¦ã&a\u0003¢¸ÿY¹\u0092\u0016ïkH¡7«ÉRó}á¬\u0082\u0099@/G\u00adZ\u0007\u0011\u00927c$Ú©\u0093\u0097¿é?xrÊÑÂ\u008bY¯w\u0087Å{£pÕQ\u0011\u0003?W\u00124@>\u001f\u0093÷Á\u007føB!<$9¼Ã¾¢0§r[1\u000b\u0003_m®¯ÿ\u0096È?\b`µm£ôUm}ù¡y@Óme\fMõÛ\u0006_z,û\u0018kJ\u008a\u0089R¾\u001bvì\u0007\u0091\u0096âÏ\u0092¶\u001eÍo=\u001b¼Õ\u0088ØªY\u0087;\u000föwÏIDôãW¶7±\u0088zUPð\u000bC¹²¼ ^ëxÁ)hA\u0010o\u0099ëµ±\u008f\u0093e)w³\u0006\u008d\u000eé\u008e\u009b[>Ä\u0098µø5 ç\u001e®¹BT\u001eùýü,\u00ad\u0083\u0089²ùö\f¾\u009e\u0088\u0089ð\u008f\u0000]gFíÆRè\u0018ÃÍ\u0098÷/þî^\\\u0081ú_Få]\"'¢&á[S§;(ã\u0018'\"\u0086z)¿ã\u001a\\\u0006\u0007\u0094{]XÍ5fò\u009eXøÝ>ü\u0004æ`f\u0007ÉwÂ\tz~\u008eû";
      int var22 = "\u0017\u0012\u0084õ2>:*\u0088jý\u0085 \u0087t\u0019ú6öÝ\u0007\"ì¡;Æpù\u0089ïK´\u0010åÔ\u008f]nÌcEÀÎ\f\u0085Ï¶KÂ ·ôöÐ\u008d·½£ã3Y%\u0007ç\u0083\u007f¿\u00ad\u0083Â%Í¡\u0012\u0097ÈÍ\t\r\u008ffð\u0010~ \u0011±«ë\u0010ÑQ\u000f4Ê\u0094líÿ\u0010©Ô\u0084É2\u007fí®Vö¬5X\u0081[O°\u0099ìg}Ôùª\u0010ì×\u0081>?´wJå\u0005eD\u0087óPÄ)\u001a<ðY» ì\\\u008d\u0084l°2ª<\u0094\u0092\u0081Eçê\u0003¤â:m\u009d¥{'Øm\u0019<H\npý1òk¦ã&a\u0003¢¸ÿY¹\u0092\u0016ïkH¡7«ÉRó}á¬\u0082\u0099@/G\u00adZ\u0007\u0011\u00927c$Ú©\u0093\u0097¿é?xrÊÑÂ\u008bY¯w\u0087Å{£pÕQ\u0011\u0003?W\u00124@>\u001f\u0093÷Á\u007føB!<$9¼Ã¾¢0§r[1\u000b\u0003_m®¯ÿ\u0096È?\b`µm£ôUm}ù¡y@Óme\fMõÛ\u0006_z,û\u0018kJ\u008a\u0089R¾\u001bvì\u0007\u0091\u0096âÏ\u0092¶\u001eÍo=\u001b¼Õ\u0088ØªY\u0087;\u000föwÏIDôãW¶7±\u0088zUPð\u000bC¹²¼ ^ëxÁ)hA\u0010o\u0099ëµ±\u008f\u0093e)w³\u0006\u008d\u000eé\u008e\u009b[>Ä\u0098µø5 ç\u001e®¹BT\u001eùýü,\u00ad\u0083\u0089²ùö\f¾\u009e\u0088\u0089ð\u008f\u0000]gFíÆRè\u0018ÃÍ\u0098÷/þî^\\\u0081ú_Få]\"'¢&á[S§;(ã\u0018'\"\u0086z)¿ã\u001a\\\u0006\u0007\u0094{]XÍ5fò\u009eXøÝ>ü\u0004æ`f\u0007ÉwÂ\tz~\u008eû".length();
      char var19 = ' ';
      int var18 = -1;

      label64:
      while(true) {
         ++var18;
         String var35 = var20.substring(var18, var18 + var19);
         byte var37 = -1;

         while(true) {
            byte[] var24 = var16.doFinal(var35.getBytes("ISO-8859-1"));
            String var42 = b(var24).intern();
            switch(var37) {
            case 0:
               var23[var21++] = var42;
               if ((var18 += var19) >= var22) {
                  c = var23;
                  f = new String[13];
                  l = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var25 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[14];
                  int var8 = 0;
                  String var9 = "þ¶¶·\u0001\u001c\u0006|Í\u0019TÒÈø`@FÛØ×¦cK\u009b\bBJ\u0097áõ³ä³G±\u0094\u009c·q\u0092ª\u0088ôV2e\u0016ôjà¶é4Ôîxûü\u0005l\u0005\u009frY\nO·|]Åsq\u009cG\u0083¨\u008d\u0090\u0090U\u007f\t§}õ\u0085\u00059ë\u001e¡¦Ò\u0018\u0001½";
                  int var10 = "þ¶¶·\u0001\u001c\u0006|Í\u0019TÒÈø`@FÛØ×¦cK\u009b\bBJ\u0097áõ³ä³G±\u0094\u009c·q\u0092ª\u0088ôV2e\u0016ôjà¶é4Ôîxûü\u0005l\u0005\u009frY\nO·|]Åsq\u009cG\u0083¨\u008d\u0090\u0090U\u007f\t§}õ\u0085\u00059ë\u001e¡¦Ò\u0018\u0001½".length();
                  int var7 = 0;

                  label46:
                  while(true) {
                     int var41 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var41, var7).getBytes("ISO-8859-1");
                     long[] var38 = var11;
                     var41 = var8++;
                     long var45 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte var46 = -1;

                     while(true) {
                        long var13 = var45;
                        byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                        long var48 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                        switch(var46) {
                        case 0:
                           var38[var41] = var48;
                           if (var7 >= var10) {
                              i = var11;
                              k = new Integer[14];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var25 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = 660696222292938753L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var45 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var44 = true;
                              o = var45;
                              KProperty[] var34 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tg.class, true.q<invokedynamic>(4895, 4087218785710786047L ^ var25), true.q<invokedynamic>(15708, 358031745452764086L ^ var25), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tg.class, true.q<invokedynamic>(25146, 6309140362619466972L ^ var25), true.q<invokedynamic>(28910, 54160573987825161L ^ var25), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(tg.class, true.q<invokedynamic>(22752, 1315466905925488136L ^ var25), true.q<invokedynamic>(13546, 228908058962485761L ^ var25), 0)))};
                              U = var34;
                              K = new tg(var27, (char)var29);
                              n = qi.o((il)K, true.q<invokedynamic>(29117, 3685582626738612063L ^ var25), true.o<invokedynamic>(1704, 7209670735165647067L ^ var25), new IntRange(0, true.o<invokedynamic>(2665, 9095055673469428753L ^ var25)), var30, (pj)null, (Function0)null, true.o<invokedynamic>(5442, 6729806863234857791L ^ var25), (Object)null);
                              d = qi.M((il)K, true.q<invokedynamic>(23143, 2123374786241531012L ^ var25), (Enum)hz.CHAT, (pj)null, (Function0)null, true.o<invokedynamic>(29098, 8817094060685041626L ^ var25), (Object)null, var32);
                              v = qi.o((il)K, true.q<invokedynamic>(11355, 6132879508626700986L ^ var25), true.o<invokedynamic>(12540, 1524861578802093701L ^ var25), new IntRange(0, true.o<invokedynamic>(13494, 8096463515387779777L ^ var25)), var30, (pj)null, (Function0)null, true.o<invokedynamic>(26012, 2462379839395433450L ^ var25), (Object)null);
                              m = new ArrayDeque(true.o<invokedynamic>(4720, 4706705060814617602L ^ var25));
                              T = new iv();
                              Q = new iv();
                              x = new iv();
                              return;
                           }
                           break;
                        default:
                           var38[var41] = var48;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "¼p\u0096\u0083A¢ÅwcT\u0082,ÝSk\u0087";
                           var10 = "¼p\u0096\u0083A¢ÅwcT\u0082,ÝSk\u0087".length();
                           var7 = 0;
                        }

                        var41 = var7;
                        var7 += 8;
                        var12 = var9.substring(var41, var7).getBytes("ISO-8859-1");
                        var38 = var11;
                        var41 = var8++;
                        var45 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        var46 = 0;
                     }
                  }
               }

               var19 = var20.charAt(var18);
               break;
            default:
               var23[var21++] = var42;
               if ((var18 += var19) < var22) {
                  var19 = var20.charAt(var18);
                  continue label64;
               }

               var20 = "ÌPdÌk7Û\u009b¸Î°TØ\u000f\u0003ÎLW\"&T7\"NØ5\u009bd@üF\u001a\u0010÷´Bëï|\u0096Pb&$§*à\u0092,";
               var22 = "ÌPdÌk7Û\u009b¸Î°TØ\u000f\u0003ÎLW\"&T7\"NØ5\u009bd@üF\u001a\u0010÷´Bëï|\u0096Pb&$§*à\u0092,".length();
               var19 = ' ';
               var18 = -1;
            }

            ++var18;
            var35 = var20.substring(var18, var18 + var19);
            var37 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22494;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/tg", var10);
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
         f[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
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
         throw new RuntimeException("su/catlean/tg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 28485;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/tg", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
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
         throw new RuntimeException("su/catlean/tg" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
