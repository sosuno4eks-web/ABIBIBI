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
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.StopUsingItemEvent;
import su.catlean.api.event.events.player.UsingItemEvent;
import su.catlean.gofra.Flow;

public final class yo extends k9 {
   @NotNull
   public static final yo s;
   // $FF: synthetic field
   static final KProperty[] T;
   @NotNull
   private static final z0 v;
   @NotNull
   private static final zo q;
   @NotNull
   private static final zo W;
   @NotNull
   private static final zo V;
   @NotNull
   private static final zo P;
   @NotNull
   private static final zo b;
   @NotNull
   private static final zo d;
   private static boolean k;
   private static int u;
   private static final long c = j0.a(4018597647358601149L, 6070362205600934483L, MethodHandles.lookup().lookupClass()).a(136856299190972L);
   private static final String[] e;
   private static final String[] f;
   private static final Map g;
   private static final long[] i;
   private static final Integer[] l;
   private static final Map m;

   private yo(long var1, int var3) {
      long var4 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ c;
      long var6 = var4 ^ 116644354454091L;
      super(var6, true.j<invokedynamic>(5381, 1349197066728385292L ^ var4), pa.V(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final int W(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 62384047071293L;
      int var3 = (int)((var1 ^ 62384047071293L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)v.k((short)var3, this, T[0], (short)var4, var5)).intValue();
   }

   private final boolean p(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 130741813512639L;
      int var3 = (int)((var1 ^ 130741813512639L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)q.k((short)var3, this, T[1], (short)var4, var5);
   }

   private final boolean I(char var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ c;
      long var10001 = var4 ^ 121568593580017L;
      int var6 = (int)((var4 ^ 121568593580017L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)W.k((short)var6, this, T[2], (short)var7, var8);
   }

   private final boolean J(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 12164898030784L;
      int var3 = (int)((var1 ^ 12164898030784L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)V.k((short)var3, this, T[3], (short)var4, var5);
   }

   private final boolean k(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 71766802820053L;
      int var3 = (int)((var1 ^ 71766802820053L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)P.k((short)var3, this, T[4], (short)var4, var5);
   }

   private final boolean y(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 62929847871592L;
      int var3 = (int)((var1 ^ 62929847871592L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)b.k((short)var3, this, T[5], (short)var4, var5);
   }

   private final boolean c(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 51214688256306L;
      int var3 = (int)((var1 ^ 51214688256306L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)d.k((short)var3, this, T[true.i<invokedynamic>(16358, 3142986800715181176L ^ var1)], (short)var4, var5);
   }

   @Flow(
      priority = -10
   )
   private final void O(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void Y(byte param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private final boolean t(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean e(char param1, int param2, short param3, class_1268 param4) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void X(UsingItemEvent var1) {
      long var2 = c ^ 41559424086478L;

      try {
         if (k) {
            var1.cancel();
         }

      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, -1809576583724796143L, var2);
      }
   }

   @Flow
   private final void o(StopUsingItemEvent var1) {
      long var2 = c ^ 126187067422355L;

      try {
         if (k) {
            var1.cancel();
         }

      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, 7043137954278436940L, var2);
      }
   }

   static {
      long var20 = c ^ 40364063906172L;
      long var22 = var20 ^ 22217066979595L;
      long var10001 = var20 ^ 26921743167563L;
      long var24 = (var20 ^ 26921743167563L) >>> 32;
      int var26 = (int)(var10001 << 32 >>> 32);
      long var27 = var20 ^ 56402405044173L;
      g = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[24];
      int var16 = 0;
      String var15 = "áW\u000bóoÕæäÏÚ&¯=Î\u0001ù Í\u0093öEÁ\u001bg\u0086mi×O¶S<\u00050ï»Äw\u0097@ß2\u009c¥\u0099G!©¥\u0018\n\u001eV]ßs^Ý-½_4W\u001aßÅ\u008c¯r÷\rZ\u0000N\u0018\u0083eÚï\u009fjÿ!X\u0086¯BêÚji¬Æ\u0098\u0081\u0002\u0094T$\u0010ZK°uF »õqx\u000eV~÷³Ú\u0018ë°ìÊì¡\\¿\u0016\u0000¨\u001c\u0090Ø\u0096Éû3j\u0094ìá\u0088ü\u0018\u0087\u0082\u008b\u000f o#OTÀNAdøÕ\u0080\u0090Õ\u0016s°zCÌ XÁ\u00ad\u0014%õA\u0013_\rÝj\u0000Ònfv1ðmXòßP¤ÁÔ8Íþÿþ\u0010\"\u001b,M\u008d+oBi\u009a\u0014Vè?¨³(ÛÆIÃU\u00ad\u0017\u0091Ì\u000f!§Ú\u0085\u0084/\u009fßîº[[ú\u0090\u000f\\ÜÏúë7\u0088\u0015y&\u0097A\u0000]¦ ËÀ\u008e\u001bà½©A\u0010\u0086\u0084ºS±\u0081çï\u0090\u001b¢\u00041x\u009cØt`\u001dBªDþ\u0018\u0083ÎO¤ô\u009eZÐÙÙÿ{TQ§\u0019Uø\u0086þê7ï\u0017(\u0088\u0018qÅ\"üÙý×é¼\u009déã'[ì)\u001c\u00959º\u00139ø]\u0086\r\u0098Ï},H\u001cX^ÿõ(\u009d\u00184À^\u0093ôH\u008cÔ\u0096ò\u001ca&RS±¬#y>\u0090´§\u001e\u0018·\u001c\u008b½j!r\u0006\u0085Ñç»G! >-Ç*û\u0084L¾· ¼rBwÔ/+å\u0097Èt\u001fÛ¬\u0091ËOÌÃÍ\u001d\u0005«¼\u0094Ø³¾¨\u008ao0\u0010¬§\u0013\u008eLAûbV|8â\u0016Àa\u0004 \u0015\u0015ý\u009bOYa\u009c\u009d\u0017\u008f{\u0093Çg}3\n\u001d\u009dA\u0015@á'\u001bâ¯Ô(Èn\u0010³Ô\u0090\nÛýØ\u0015úH\u008duÉºÞ\u0019\u0010\rO\u0084[Öd\u0089»ó×\u009b®y\u000b\u0012_ Aé¹AüG\u0084Ð·\u0090\u0016F,1\u009a!Ô\u0088u0tòÒ@\u001c_\u0010#Sû\u0082.\u0018V\u0087J^¤ç\u0086\u0017À¨\u0006¡tÔ\u0097²Í¨s\u001fi9«D";
      int var17 = "áW\u000bóoÕæäÏÚ&¯=Î\u0001ù Í\u0093öEÁ\u001bg\u0086mi×O¶S<\u00050ï»Äw\u0097@ß2\u009c¥\u0099G!©¥\u0018\n\u001eV]ßs^Ý-½_4W\u001aßÅ\u008c¯r÷\rZ\u0000N\u0018\u0083eÚï\u009fjÿ!X\u0086¯BêÚji¬Æ\u0098\u0081\u0002\u0094T$\u0010ZK°uF »õqx\u000eV~÷³Ú\u0018ë°ìÊì¡\\¿\u0016\u0000¨\u001c\u0090Ø\u0096Éû3j\u0094ìá\u0088ü\u0018\u0087\u0082\u008b\u000f o#OTÀNAdøÕ\u0080\u0090Õ\u0016s°zCÌ XÁ\u00ad\u0014%õA\u0013_\rÝj\u0000Ònfv1ðmXòßP¤ÁÔ8Íþÿþ\u0010\"\u001b,M\u008d+oBi\u009a\u0014Vè?¨³(ÛÆIÃU\u00ad\u0017\u0091Ì\u000f!§Ú\u0085\u0084/\u009fßîº[[ú\u0090\u000f\\ÜÏúë7\u0088\u0015y&\u0097A\u0000]¦ ËÀ\u008e\u001bà½©A\u0010\u0086\u0084ºS±\u0081çï\u0090\u001b¢\u00041x\u009cØt`\u001dBªDþ\u0018\u0083ÎO¤ô\u009eZÐÙÙÿ{TQ§\u0019Uø\u0086þê7ï\u0017(\u0088\u0018qÅ\"üÙý×é¼\u009déã'[ì)\u001c\u00959º\u00139ø]\u0086\r\u0098Ï},H\u001cX^ÿõ(\u009d\u00184À^\u0093ôH\u008cÔ\u0096ò\u001ca&RS±¬#y>\u0090´§\u001e\u0018·\u001c\u008b½j!r\u0006\u0085Ñç»G! >-Ç*û\u0084L¾· ¼rBwÔ/+å\u0097Èt\u001fÛ¬\u0091ËOÌÃÍ\u001d\u0005«¼\u0094Ø³¾¨\u008ao0\u0010¬§\u0013\u008eLAûbV|8â\u0016Àa\u0004 \u0015\u0015ý\u009bOYa\u009c\u009d\u0017\u008f{\u0093Çg}3\n\u001d\u009dA\u0015@á'\u001bâ¯Ô(Èn\u0010³Ô\u0090\nÛýØ\u0015úH\u008duÉºÞ\u0019\u0010\rO\u0084[Öd\u0089»ó×\u009b®y\u000b\u0012_ Aé¹AüG\u0084Ð·\u0090\u0016F,1\u009a!Ô\u0088u0tòÒ@\u001c_\u0010#Sû\u0082.\u0018V\u0087J^¤ç\u0086\u0017À¨\u0006¡tÔ\u0097²Í¨s\u001fi9«D".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var30 = var15.substring(var13, var13 + var14);
         byte var32 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var30.getBytes("ISO-8859-1"));
            String var37 = b(var19).intern();
            switch(var32) {
            case 0:
               var18[var16++] = var37;
               if ((var13 += var14) >= var17) {
                  e = var18;
                  f = new String[24];
                  m = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[9];
                  int var3 = 0;
                  String var4 = "\u0019\u000f\u0093¶¯Y\u009b[±\u0012Àòì\u009cn\u009aÍR\u0080\u008fu\u0013áp\u001d\u000e\u008a\fëÕý\u0089Ý\u009f§Ùþ.q\u008dÐØ\u000fÛ_\u001a<y\u009dÙÇ\u009e ²ªC";
                  int var5 = "\u0019\u000f\u0093¶¯Y\u009b[±\u0012Àòì\u009cn\u009aÍR\u0080\u008fu\u0013áp\u001d\u000e\u008a\fëÕý\u0089Ý\u009f§Ùþ.q\u008dÐØ\u000fÛ_\u001a<y\u009dÙÇ\u009e ²ªC".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var36 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                     long[] var33 = var6;
                     var36 = var3++;
                     long var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var40 = -1;

                     while(true) {
                        long var8 = var39;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var42 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var40) {
                        case 0:
                           var33[var36] = var42;
                           if (var2 >= var5) {
                              i = var6;
                              l = new Integer[9];
                              KProperty[] var29 = new KProperty[true.i<invokedynamic>(28766, 670642681646161743L ^ var20)];
                              var29[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yo.class, true.j<invokedynamic>(19988, 6734485322002765402L ^ var20), true.j<invokedynamic>(7169, 5790259959148463179L ^ var20), 0)));
                              var29[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yo.class, true.j<invokedynamic>(31021, 3442590729203425663L ^ var20), true.j<invokedynamic>(30384, 4496865235385593592L ^ var20), 0)));
                              var29[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yo.class, true.j<invokedynamic>(17012, 6653667040383081005L ^ var20), true.j<invokedynamic>(509, 782422436129986986L ^ var20), 0)));
                              var29[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yo.class, true.j<invokedynamic>(26435, 4797640917451652878L ^ var20), true.j<invokedynamic>(29098, 1915062607606884858L ^ var20), 0)));
                              var29[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yo.class, true.j<invokedynamic>(9847, 2259389590624042537L ^ var20), true.j<invokedynamic>(3203, 4606651158330758354L ^ var20), 0)));
                              var29[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yo.class, true.j<invokedynamic>(22896, 9117491962396606780L ^ var20), true.j<invokedynamic>(5832, 8561501839747403422L ^ var20), 0)));
                              var29[true.i<invokedynamic>(16358, 3143021192187990266L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yo.class, true.j<invokedynamic>(31948, 2226620093935887511L ^ var20), true.j<invokedynamic>(29737, 339378588061084797L ^ var20), 0)));
                              T = var29;
                              s = new yo(var24, var26);
                              v = qi.o((il)s, true.j<invokedynamic>(7688, 8462506386785224285L ^ var20), true.i<invokedynamic>(28747, 8246970256099974998L ^ var20), new IntRange(0, true.i<invokedynamic>(27768, 7932777036218205026L ^ var20)), var22, (pj)null, (Function0)null, true.i<invokedynamic>(24921, 1642810999346859584L ^ var20), (Object)null);
                              q = qi.R((il)s, true.j<invokedynamic>(2886, 3550716786131358477L ^ var20), true, (pj)null, (Function0)null, true.i<invokedynamic>(11990, 1501664973411860937L ^ var20), var27, (Object)null);
                              W = qi.R((il)s, true.j<invokedynamic>(7016, 764216694711862069L ^ var20), true, (pj)null, (Function0)null, true.i<invokedynamic>(31139, 3308848552654673595L ^ var20), var27, (Object)null);
                              V = qi.R((il)s, true.j<invokedynamic>(2731, 1164644238656328420L ^ var20), false, (pj)null, (Function0)null, true.i<invokedynamic>(31139, 3308848552654673595L ^ var20), var27, (Object)null);
                              P = qi.R((il)s, true.j<invokedynamic>(24615, 2591059704944441469L ^ var20), false, (pj)null, (Function0)null, true.i<invokedynamic>(31139, 3308848552654673595L ^ var20), var27, (Object)null);
                              b = qi.R((il)s, true.j<invokedynamic>(23882, 6957421285109302550L ^ var20), false, (pj)null, (Function0)null, true.i<invokedynamic>(31139, 3308848552654673595L ^ var20), var27, (Object)null);
                              d = qi.R((il)s, true.j<invokedynamic>(22672, 6389615781859918024L ^ var20), false, (pj)null, (Function0)null, true.i<invokedynamic>(31139, 3308848552654673595L ^ var20), var27, (Object)null);
                              u = -1;
                              return;
                           }
                           break;
                        default:
                           var33[var36] = var42;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "¨\u0095E\u000fW3B×k\u007fK2{2¦\u0083";
                           var5 = "¨\u0095E\u000fW3B×k\u007fK2{2¦\u0083".length();
                           var2 = 0;
                        }

                        var36 = var2;
                        var2 += 8;
                        var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                        var33 = var6;
                        var36 = var3++;
                        var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var40 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var37;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "¸ó\u0097ðiÃ[\u0093\u0019Ü`\u0086\u0018øÌ.máÞr´H¿.Û¢+\u0081d¿\u0017\u008c  ý\u009d\u0083SÌzÚ\u00118àRÚb\u0011}¢ýä\u008e3\u009b¢\u001e®Èð#\u0082rP@";
               var17 = "¸ó\u0097ðiÃ[\u0093\u0019Ü`\u0086\u0018øÌ.máÞr´H¿.Û¢+\u0081d¿\u0017\u008c  ý\u009d\u0083SÌzÚ\u00118àRÚb\u0011}¢ýä\u008e3\u009b¢\u001e®Èð#\u0082rP@".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var30 = var15.substring(var13, var13 + var14);
            var32 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22320;
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
            throw new RuntimeException("su/catlean/yo", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
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
         throw new RuntimeException("su/catlean/yo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24692;
      if (l[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/yo", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
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
         throw new RuntimeException("su/catlean/yo" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
