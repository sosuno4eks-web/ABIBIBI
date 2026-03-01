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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class kt extends kr {
   @NotNull
   public static final kt K;
   static final KProperty[] W;
   @NotNull
   private static final zc P;
   @NotNull
   private static final zo m;
   @NotNull
   private static final zo B;
   @NotNull
   private static List e;
   private static final long c = j0.a(207577605658632596L, 9189394259879840710L, MethodHandles.lookup().lookupClass()).a(255578579714075L);
   private static final String[] k;
   private static final String[] q;
   private static final Map s;
   private static final long[] y;
   private static final Integer[] z;
   private static final Map A;

   private kt(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 7552153968981L;
      super(true.u<invokedynamic>(10661, 7555708766299767276L ^ var1), pa.N(), var3, true.j<invokedynamic>(14629, 8468072229830422101L ^ var1), false);
   }

   private final float J(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 73461454776624L;
      int var3 = (int)((var1 ^ 73461454776624L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)P.k((short)var3, this, W[0], (short)var4, var5)).floatValue();
   }

   private final void Q(float var1, long var2) {
      var2 ^= c;
      long var10001 = var2 ^ 48225294568396L;
      int var4 = (int)((var2 ^ 48225294568396L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      P.P(this, var4, W[0], (short)var5, var1, (short)var6);
   }

   private final boolean I(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 123080830353187L;
      int var3 = (int)((var1 ^ 123080830353187L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)m.k((short)var3, this, W[1], (short)var4, var5);
   }

   private final void u(boolean var1, long var2) {
      var2 ^= c;
      long var10001 = var2 ^ 106038056343801L;
      int var4 = (int)((var2 ^ 106038056343801L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      m.P(this, var4, W[1], (short)var5, var1, (short)var6);
   }

   private final boolean t(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 47878161898921L;
      int var3 = (int)((var1 ^ 47878161898921L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)B.k((short)var3, this, W[2], (short)var4, var5);
   }

   private final void Q(long var1, boolean var3) {
      var1 ^= c;
      long var10001 = var1 ^ 18255859381532L;
      int var4 = (int)((var1 ^ 18255859381532L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      B.P(this, var4, W[2], (short)var5, var3, (short)var6);
   }

   @Flow
   private final void P(AfterReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void y(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final List p(class_2338 param1, long param2, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   private final List i(short param1, int param2, short param3) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean f(gg param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean I(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var20 = c ^ 111376130810662L;
      long var22 = var20 ^ 11850478750101L;
      long var24 = var20 ^ 82424317715212L;
      long var26 = var20 ^ 34037639257883L;
      s = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[20];
      int var16 = 0;
      String var15 = "ÂÐ¸q\u0089¶áî\u0093ÚgC\u0013YM'(IÎ\"Ë\u00012¬ÏRæÖQ\u0094\u0010x\u0092¨¶A£/w«õÚÉì+\u001c\u0018v\u0092/¾8Ä\u0091®`\u0005°\u0080G.iÄ\u0018¤\u001b¥\u009ba=â¶F\rá\u009a-¸&:\u0096H\u0085x09ÔÂC\u008b/.no¡Dèxã´·k\f4Z[ý\u001f\u0084\fHã¥\u0015\u0007¾ìg_Ü\f9î.î\u001b~Æ¥°ðx+\u009d¹!Á'åmy\b)?:\u00924:¬ðæÏÜ\t \u0095îÜØFhÿ¯ç\u0005ÿuÖAû\u0017c/\u0015\u009b¾\u001c9\u0011T/\u00160Bæÿ\u0005\u0003\u0084»Y~¹ÚÊÈë5TÍQ+õ0\u0094¤vU'Çz`<õ\u0019Às ¤!Ì[\u0007Õn\u0014µÄz\u0005\u009f2@z\u0018)ñ<\u0014I®^\u0096;cu¤æá¼î\u0006\u0083¯¡\u0081#w\u009d r\u0011¸03\rÞ\u008d ÆO½Ku\u0018\t¬÷ÊÜ\u0085\u00895g\u0087\n±Ú\u0017\u0083\u001c\u0002 YdÊ-|\u008a$\u009e\u0013Q\\\u0015\u0087P©\bá#ä: 9\u00ad|Ò:tBüü.¹\u0010\u0094\u0082\u008ew\u008a\u0083¾t\u0010Xl1\u000bO\b© \u0013Á`\u0080Zÿ\u0081[\u0016² .ÁëS\u0095²nsÕ$\u0094Ã;2\u0084xÜ*}Ó©(îv3§Ã\u008d \u0095\u0088\u0018A\u0012Ác\u009fCk£\u008d\u0082öÁ\u0093Z¥\u001d\t¤m\tL\u001e°¢H\u009aô\u0004;û ,-¤×Ûeê\u0090\u0092§¨øS\u0094-/§n\u0012·\n\u0015çÈ.\u001f\u0090$Ï\u001eòë \u0086Lâ)A²Ùª\u008f©*\u0001$\u001d\"x¯¨åqÙ\u008e\u0082·Þo3\u0089\u0081\u0086\u008fZ\u0010'Í $\u0091\u0080\u0002\u009e}|\u001cY\u0018¸/\u0097 ÐÆ\u0016+·\u0086\u0085\u001a\u008b\u0088&E»\u0018ËÈ@\u001d'\u009bJ\u009bðµ®\u000fß\u009b\u009d1M\u0018\u0018¾Ô¢\u008b\u009eÝ\u0093¢ö\u001aÍuhòî\u0014\u0081Õp%Û\u0092\u0014Á\u0010\u0089\bä\u007f:ð¼|Q\u008a\u0097bp\u0088dð pS\u0004\u0015\u0013ÙYE\u0012d²SñÊ£\u0004fNÏ¯¯å\u0092Ó\u000eÜE\u0018NYõ\u009a _\u0099íW÷QÜ\u0005\u009b\u0085õ»\u000e°«\u009b6\t\u0089èst mÆ}ÛyøÖ\u008e) >Á¿æé5Ö\u001c7¿f%`³§©Ã\u000eÝ©¿8\u009a>:\rÂC%OÇK";
      int var17 = "ÂÐ¸q\u0089¶áî\u0093ÚgC\u0013YM'(IÎ\"Ë\u00012¬ÏRæÖQ\u0094\u0010x\u0092¨¶A£/w«õÚÉì+\u001c\u0018v\u0092/¾8Ä\u0091®`\u0005°\u0080G.iÄ\u0018¤\u001b¥\u009ba=â¶F\rá\u009a-¸&:\u0096H\u0085x09ÔÂC\u008b/.no¡Dèxã´·k\f4Z[ý\u001f\u0084\fHã¥\u0015\u0007¾ìg_Ü\f9î.î\u001b~Æ¥°ðx+\u009d¹!Á'åmy\b)?:\u00924:¬ðæÏÜ\t \u0095îÜØFhÿ¯ç\u0005ÿuÖAû\u0017c/\u0015\u009b¾\u001c9\u0011T/\u00160Bæÿ\u0005\u0003\u0084»Y~¹ÚÊÈë5TÍQ+õ0\u0094¤vU'Çz`<õ\u0019Às ¤!Ì[\u0007Õn\u0014µÄz\u0005\u009f2@z\u0018)ñ<\u0014I®^\u0096;cu¤æá¼î\u0006\u0083¯¡\u0081#w\u009d r\u0011¸03\rÞ\u008d ÆO½Ku\u0018\t¬÷ÊÜ\u0085\u00895g\u0087\n±Ú\u0017\u0083\u001c\u0002 YdÊ-|\u008a$\u009e\u0013Q\\\u0015\u0087P©\bá#ä: 9\u00ad|Ò:tBüü.¹\u0010\u0094\u0082\u008ew\u008a\u0083¾t\u0010Xl1\u000bO\b© \u0013Á`\u0080Zÿ\u0081[\u0016² .ÁëS\u0095²nsÕ$\u0094Ã;2\u0084xÜ*}Ó©(îv3§Ã\u008d \u0095\u0088\u0018A\u0012Ác\u009fCk£\u008d\u0082öÁ\u0093Z¥\u001d\t¤m\tL\u001e°¢H\u009aô\u0004;û ,-¤×Ûeê\u0090\u0092§¨øS\u0094-/§n\u0012·\n\u0015çÈ.\u001f\u0090$Ï\u001eòë \u0086Lâ)A²Ùª\u008f©*\u0001$\u001d\"x¯¨åqÙ\u008e\u0082·Þo3\u0089\u0081\u0086\u008fZ\u0010'Í $\u0091\u0080\u0002\u009e}|\u001cY\u0018¸/\u0097 ÐÆ\u0016+·\u0086\u0085\u001a\u008b\u0088&E»\u0018ËÈ@\u001d'\u009bJ\u009bðµ®\u000fß\u009b\u009d1M\u0018\u0018¾Ô¢\u008b\u009eÝ\u0093¢ö\u001aÍuhòî\u0014\u0081Õp%Û\u0092\u0014Á\u0010\u0089\bä\u007f:ð¼|Q\u008a\u0097bp\u0088dð pS\u0004\u0015\u0013ÙYE\u0012d²SñÊ£\u0004fNÏ¯¯å\u0092Ó\u000eÜE\u0018NYõ\u009a _\u0099íW÷QÜ\u0005\u009b\u0085õ»\u000e°«\u009b6\t\u0089èst mÆ}ÛyøÖ\u008e) >Á¿æé5Ö\u001c7¿f%`³§©Ã\u000eÝ©¿8\u009a>:\rÂC%OÇK".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var29 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
            String var35 = c(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var35;
               if ((var13 += var14) >= var17) {
                  k = var18;
                  q = new String[20];
                  A = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[8];
                  int var3 = 0;
                  String var4 = "$t1[\u0090\u0007î\u001fÕ*°[®\u007fÞT\u008e }it&/%Ä\u000e\u0094±ä~Ù\u0094\u0086Bå\u0090¦Uæ\u00001·-\u00052\u001aî\u0095";
                  int var5 = "$t1[\u0090\u0007î\u001fÕ*°[®\u007fÞT\u008e }it&/%Ä\u000e\u0094±ä~Ù\u0094\u0086Bå\u0090¦Uæ\u00001·-\u00052\u001aî\u0095".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var33 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                     long[] var32 = var6;
                     var33 = var3++;
                     long var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var38 = -1;

                     while(true) {
                        long var8 = var37;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var40 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var38) {
                        case 0:
                           var32[var33] = var40;
                           if (var2 >= var5) {
                              y = var6;
                              z = new Integer[8];
                              KProperty[] var28 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(kt.class, true.u<invokedynamic>(14836, 5263911789044647098L ^ var20), true.u<invokedynamic>(26295, 2432934239517187043L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(kt.class, true.u<invokedynamic>(18697, 4374111980697990212L ^ var20), true.u<invokedynamic>(1680, 8651543598069709778L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(kt.class, true.u<invokedynamic>(20575, 8208188736062729494L ^ var20), true.u<invokedynamic>(25921, 1151098085666396169L ^ var20), 0)))};
                              W = var28;
                              K = new kt(var22);
                              P = qi.g((il)K, true.u<invokedynamic>(1097, 2786554357482912006L ^ var20), 0.8F, RangesKt.rangeTo(0.0F, 0.9F), (pj)null, (Function0)null, true.j<invokedynamic>(8017, 272803478462160168L ^ var20), var24, (Object)null);
                              m = qi.R((il)K, true.u<invokedynamic>(27212, 5559005523045488396L ^ var20), true, (pj)null, (Function0)null, true.j<invokedynamic>(15424, 5234475729113316927L ^ var20), var26, (Object)null);
                              B = qi.R((il)K, true.u<invokedynamic>(5803, 2348629822898727911L ^ var20), true, (pj)null, (Function0)null, true.j<invokedynamic>(9243, 164436742507652705L ^ var20), var26, (Object)null);
                              e = (List)(new ArrayList());
                              return;
                           }
                           break;
                        default:
                           var32[var33] = var40;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "¢Óý\\+Ûð1\u0004gC¥Ö6´Z";
                           var5 = "¢Óý\\+Ûð1\u0004gC¥Ö6´Z".length();
                           var2 = 0;
                        }

                        var33 = var2;
                        var2 += 8;
                        var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                        var32 = var6;
                        var33 = var3++;
                        var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var38 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var35;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u001c;<\u001dOËl\u00adï£\u007fX-àI\u008bOY}ÄõDñy(°¶¸O\u0014Å%\u0087Z8/ç|ÌbÊx·³Ø%jN¥óÇ\u0098Dà\u0010¢®¸0E|â÷\u001b_";
               var17 = "\u001c;<\u001dOËl\u00adï£\u007fX-àI\u008bOY}ÄõDñy(°¶¸O\u0014Å%\u0087Z8/ç|ÌbÊx·³Ø%jN¥óÇ\u0098Dà\u0010¢®¸0E|â÷\u001b_".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var29 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17148;
      if (q[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])s.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               s.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/kt", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = k[var5].getBytes("ISO-8859-1");
         q[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return q[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/kt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32195;
      if (z[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = y[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])A.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               A.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/kt", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         z[var3] = var15;
      }

      return z[var3];
   }

   private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/kt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
