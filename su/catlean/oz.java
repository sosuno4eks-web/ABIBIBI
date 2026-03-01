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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class oz extends k9 {
   @NotNull
   public static final oz A;
   static final KProperty[] x;
   @NotNull
   private static final z7 T;
   @NotNull
   private static final z7 t;
   @NotNull
   private static final zo C;
   @NotNull
   private static final zo B;
   @NotNull
   private static iv O;
   @NotNull
   private static iv P;
   private static boolean s;
   @NotNull
   private static List q;
   private static final long b = j0.a(7262412763636555241L, 5607884324134033586L, MethodHandles.lookup().lookupClass()).a(141501931186584L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private oz(short var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 113982629065072L;
      super(var6, true.x<invokedynamic>(32078, 511896215047905122L ^ var4), pa.Q(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final n_ U(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 84242345078499L;
      int var3 = (int)((var1 ^ 84242345078499L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (n_)T.k((short)var3, this, x[0], (short)var4, var5);
   }

   private final n_ f(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 852187116382L;
      int var3 = (int)((var1 ^ 852187116382L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (n_)t.k((short)var3, this, x[1], (short)var4, var5);
   }

   private final boolean m(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 67893370902972L;
      int var3 = (int)((var1 ^ 67893370902972L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)C.k((short)var3, this, x[2], (short)var4, var5);
   }

   private final boolean v(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 66844668927922L;
      int var3 = (int)((var1 ^ 66844668927922L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)B.k((short)var3, this, x[3], (short)var4, var5);
   }

   @Flow
   private final void l(InputEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void u(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final int I(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean K(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 51146286150154L;
      int var3 = (int)((var1 ^ 51146286150154L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 86448006166463L;
      int[] var10000 = -823385711913044407L.A<invokedynamic>(-823385711913044407L, var1);
      class_2338 var15 = class_2338.method_49638((class_2374)s8.f(var6).method_33571()).method_10084();
      Intrinsics.checkNotNullExpressionValue(var15, true.x<invokedynamic>(4904, 6952277069612854961L ^ var1));
      class_2338 var9 = var15;
      int[] var8 = var10000;
      int var10 = true.r<invokedynamic>(9088, 8277177608403086539L ^ var1);

      label85:
      while(true) {
         int var14 = var10;

         label106: {
            label79:
            while(var14 < true.r<invokedynamic>(13006, 7983339710424448392L ^ var1)) {
               var14 = 32728.r<invokedynamic>(32728, 1707703995275423893L ^ var1);
               if (var8 != null) {
                  return (boolean)var14;
               }

               int var11 = var14;

               label77:
               while(true) {
                  var14 = var11;

                  label74:
                  while(true) {
                     if (var14 < true.r<invokedynamic>(13006, 7983339710424448392L ^ var1)) {
                        var14 = 32728.r<invokedynamic>(32728, 1707703995275423893L ^ var1);
                        int[] var16 = var8;

                        label69:
                        while(true) {
                           if (var16 != null) {
                              continue label79;
                           }

                           int var12 = var14;

                           while(true) {
                              if (var12 >= true.r<invokedynamic>(13006, 7983339710424448392L ^ var1)) {
                                 break label69;
                              }

                              var14 = q.contains(s8.i((char)var3, var4, (short)var5).method_8320(var9.method_10069(var10, var11, var12)).method_26204());
                              if (var8 != null) {
                                 continue label74;
                              }

                              try {
                                 var16 = var8;
                                 if (var1 < 0L) {
                                    break;
                                 }

                                 if (var8 != null) {
                                    return (boolean)var14;
                                 }

                                 if (var14 != 0) {
                                    break label106;
                                 }
                              } catch (NumberFormatException var13) {
                                 throw var13.A<invokedynamic>(var13, -796357289701494594L, var1);
                              }

                              ++var12;
                              if (var8 != null) {
                                 break label69;
                              }
                           }
                        }

                        ++var11;
                        var10000 = var8;
                        if (var1 <= 0L) {
                           break;
                        }

                        if (var8 == null) {
                           continue label77;
                        }
                     }

                     ++var10;
                     if (var1 <= 0L) {
                        break label79;
                     }

                     var10000 = var8;
                     break;
                  }

                  if (var10000 == null) {
                     continue label85;
                  }
                  break label79;
               }
            }

            var14 = 0;
            return (boolean)var14;
         }

         var14 = 1;
         return (boolean)var14;
      }
   }

   private final void e(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 1675055675694L;
      long var10001 = var1 ^ 82116221518411L;
      int var5 = (int)((var1 ^ 82116221518411L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      this.V((char)var5, var6, (short)var7);
      s = true;
      _7.K(_7.V, true.r<invokedynamic>(7861, 1185969761028872125L ^ var1), (byte)0, false, oz::w, true.r<invokedynamic>(13006, 7983442273327496130L ^ var1), var3, (Object)null);
   }

   private final void V(char param1, int param2, short param3) {
      // $FF: Couldn't be decompiled
   }

   private static final void w() {
      oz var10000 = A;
      s = false;
   }

   private static final boolean k(class_1799 var0) {
      long var1 = b ^ 16331151871711L;
      Intrinsics.checkNotNullParameter(var0, true.x<invokedynamic>(17661, 1251720842962318194L ^ var1));
      return Intrinsics.areEqual((Object)var0.method_7909(), (Object)class_1802.field_22021);
   }

   private static final boolean b(class_1799 var0) {
      long var1 = b ^ 109559177499274L;
      Intrinsics.checkNotNullParameter(var0, true.x<invokedynamic>(1759, 6765861123118902530L ^ var1));
      return Intrinsics.areEqual((Object)var0.method_7909(), (Object)class_1802.field_22021);
   }

   static {
      long var20 = b ^ 23465171969280L;
      long var10001 = var20 ^ 119355877785161L;
      int var22 = (int)((var20 ^ 119355877785161L) >>> 32);
      int var23 = (int)(var10001 << 32 >>> 48);
      int var24 = (int)(var10001 << 48 >>> 48);
      var10001 = var20 ^ 39730178674444L;
      int var25 = (int)((var20 ^ 39730178674444L) >>> 48);
      int var26 = (int)(var10001 << 16 >>> 32);
      int var27 = (int)(var10001 << 48 >>> 48);
      var10001 = var20 ^ 29405385294528L;
      int var28 = (int)((var20 ^ 29405385294528L) >>> 32);
      int var29 = (int)(var10001 << 32 >>> 48);
      int var30 = (int)(var10001 << 48 >>> 48);
      long var31 = var20 ^ 22316627686612L;
      e = new HashMap(13);
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
      String var15 = "û¤ Ï¯FØÈ3z®J³ê¢ØÐ²(Ä\u0002\u0004\u0095*]I\u001aG²z¦Äp×U°Ì\\ó9(ORß^HÕk!+[cÀãW=0ØP\u00003\u0098\u0090Î«Dü\u0090\u009e]Î\u008d\u000b\n®îºëeM\u00ad\u0010mÆ{'`Ïå!\u0002\u009ak]\u0004\"\u0088c(UÞ\u0016©=ôz«7\u0085ÉW\u001a\u008f¨\u0000£\r\u0095¾\u0097S\u0000Äàª\u0010R ]Eÿz\u0017\u008fñ*Ý×6 üJL/Ô»_¥\b7\u0086¿\u001d\u0086\u009d\u0013â@5 \u0082±ß~1ØÔ\u001foÎ\u0087\u0000\u0010íÒCâ\u000et\u0087\u0087æ¬hÈ{](ú\u0018\u0019O·¹`\u000f\u000fV\u0091P3³Øè\u0013\u000bl¨[\u0012YâÃ<\u0018\u000e\u001f§ª\u0084ß¶»'\tùÏùMpêfÈSn¶ÛWP E\u0001d*,LOx\u001fN\u0097I}GÚ\u008c\u0004U[®t£Ö/V\u008fbÁ\u0003sµz à\u001e#Øª\u0011Ã\u0000]t^¦Inè\u0094\u008fÝéÖ\u0096×bê{·\\µ¢\rÄ\u0081\u0018\u008c\u0080ËY\u009aµ\u0089e<éb\\ý¶¬\u008aÂ\u0087ÄÍ\u0010÷Ó\u0080\u0018\u00ad\u001aÏöÑ\u008bÐe\u0010\u0004\u009dè%Àé-jß¦\u009c\u008b\u0087\u0012´\u0010\u00913*L2]²4\u0092ûi\u0001¾üO> \f7]b'\u0016`_á^Þß\u001eìèG\u0017\bw\tIrÙC\u0000ö¸×Ùt\tØ@Ú\u0082\u0018\b«ê\u0007\u0088[Êi)t¢X\u009cámDÔPJ\u00ad*-&uËJëÎaû\f¶\u009e;qR\u0081s²áiË-7v{®»Æ\u0015\u008a*Úèë\u0017Y\u0012\u008c¿q\u0018'p¿\bø\tü;Äbÿ\u000b\u008bXf»±Ï\b\u0084-è6\b \u000f\u0085\u0011§9¥\u0096ÀÛTöÝBÿ$_¹û.\u0018 ÂÈ6\u00ad8Ë\u000e¯@¢n\u0018\u0099Dµ¨\u0018WG¥C48ÆÞËIz\u0086Ä9úvZÉ` \u007fª\rÝ÷Ã\u008c6\u008eÞ«'ö¤Ï\u008eó\u001a ]\u001c\u001d\u000eæ\u008c¿mGf¬\u0013\u008c\u0018é,\u0001\u0085ú¿i1¤\u0085Hx£\u0089;\u008c¾\u0013\u009e98M_\u00ad\u00180\u009c\u0090§it%O\u008f·ÏÃ¾\u009byåUº¾þv¥&ï(0Fór×X_¦IW5fo\u0019åì°¨ìu\u0093Á¨\u001c\u0089ñ\u0093\u0096zAq\u0080$!QÆ¢86\u008d";
      int var17 = "û¤ Ï¯FØÈ3z®J³ê¢ØÐ²(Ä\u0002\u0004\u0095*]I\u001aG²z¦Äp×U°Ì\\ó9(ORß^HÕk!+[cÀãW=0ØP\u00003\u0098\u0090Î«Dü\u0090\u009e]Î\u008d\u000b\n®îºëeM\u00ad\u0010mÆ{'`Ïå!\u0002\u009ak]\u0004\"\u0088c(UÞ\u0016©=ôz«7\u0085ÉW\u001a\u008f¨\u0000£\r\u0095¾\u0097S\u0000Äàª\u0010R ]Eÿz\u0017\u008fñ*Ý×6 üJL/Ô»_¥\b7\u0086¿\u001d\u0086\u009d\u0013â@5 \u0082±ß~1ØÔ\u001foÎ\u0087\u0000\u0010íÒCâ\u000et\u0087\u0087æ¬hÈ{](ú\u0018\u0019O·¹`\u000f\u000fV\u0091P3³Øè\u0013\u000bl¨[\u0012YâÃ<\u0018\u000e\u001f§ª\u0084ß¶»'\tùÏùMpêfÈSn¶ÛWP E\u0001d*,LOx\u001fN\u0097I}GÚ\u008c\u0004U[®t£Ö/V\u008fbÁ\u0003sµz à\u001e#Øª\u0011Ã\u0000]t^¦Inè\u0094\u008fÝéÖ\u0096×bê{·\\µ¢\rÄ\u0081\u0018\u008c\u0080ËY\u009aµ\u0089e<éb\\ý¶¬\u008aÂ\u0087ÄÍ\u0010÷Ó\u0080\u0018\u00ad\u001aÏöÑ\u008bÐe\u0010\u0004\u009dè%Àé-jß¦\u009c\u008b\u0087\u0012´\u0010\u00913*L2]²4\u0092ûi\u0001¾üO> \f7]b'\u0016`_á^Þß\u001eìèG\u0017\bw\tIrÙC\u0000ö¸×Ùt\tØ@Ú\u0082\u0018\b«ê\u0007\u0088[Êi)t¢X\u009cámDÔPJ\u00ad*-&uËJëÎaû\f¶\u009e;qR\u0081s²áiË-7v{®»Æ\u0015\u008a*Úèë\u0017Y\u0012\u008c¿q\u0018'p¿\bø\tü;Äbÿ\u000b\u008bXf»±Ï\b\u0084-è6\b \u000f\u0085\u0011§9¥\u0096ÀÛTöÝBÿ$_¹û.\u0018 ÂÈ6\u00ad8Ë\u000e¯@¢n\u0018\u0099Dµ¨\u0018WG¥C48ÆÞËIz\u0086Ä9úvZÉ` \u007fª\rÝ÷Ã\u008c6\u008eÞ«'ö¤Ï\u008eó\u001a ]\u001c\u001d\u000eæ\u008c¿mGf¬\u0013\u008c\u0018é,\u0001\u0085ú¿i1¤\u0085Hx£\u0089;\u008c¾\u0013\u009e98M_\u00ad\u00180\u009c\u0090§it%O\u008f·ÏÃ¾\u009byåUº¾þv¥&ï(0Fór×X_¦IW5fo\u0019åì°¨ìu\u0093Á¨\u001c\u0089ñ\u0093\u0096zAq\u0080$!QÆ¢86\u008d".length();
      char var14 = '(';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var42 = var15.substring(var13, var13 + var14);
         byte var46 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var42.getBytes("ISO-8859-1"));
            String var49 = b(var19).intern();
            switch(var46) {
            case 0:
               var18[var16++] = var49;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[24];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[15];
                  int var3 = 0;
                  String var4 = "Y\u009e»\u0082J\u00adµ\u001cÎ¤ÕáÚÞ\u001dá\u0094i:qJ«@\u001d\u000f´ù©\u0017\u008e#¹\u0019yO°wlï\u0095P\u0097·P\u0019\u0019&ÀA1V\u0002¼ \u001cbÌ\u008b×[Þ{\u0014¾Òü9\u0089\u0093:\u009e\u001c5\u0006z\u001b/[ïÁ\u008f Öü\u009d^pÏHS³Ò@Éê(ÉÒË`~%K\u0098";
                  int var5 = "Y\u009e»\u0082J\u00adµ\u001cÎ¤ÕáÚÞ\u001dá\u0094i:qJ«@\u001d\u000f´ù©\u0017\u008e#¹\u0019yO°wlï\u0095P\u0097·P\u0019\u0019&ÀA1V\u0002¼ \u001cbÌ\u008b×[Þ{\u0014¾Òü9\u0089\u0093:\u009e\u001c5\u0006z\u001b/[ïÁ\u008f Öü\u009d^pÏHS³Ò@Éê(ÉÒË`~%K\u0098".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var51 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var51, var2).getBytes("ISO-8859-1");
                     long[] var44 = var6;
                     var51 = var3++;
                     long var52 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var53 = -1;

                     while(true) {
                        long var8 = var52;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var55 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var53) {
                        case 0:
                           var44[var51] = var55;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[15];
                              KProperty[] var40 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oz.class, true.x<invokedynamic>(9472, 3385352624158030170L ^ var20), true.x<invokedynamic>(11815, 1316529782496277116L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oz.class, true.x<invokedynamic>(12800, 6282556631647858244L ^ var20), true.x<invokedynamic>(20395, 688034855149229032L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oz.class, true.x<invokedynamic>(21184, 6812072647627001500L ^ var20), true.x<invokedynamic>(30286, 2006292151275285019L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oz.class, true.x<invokedynamic>(14742, 7159790359717488068L ^ var20), true.x<invokedynamic>(20073, 2708694145803833919L ^ var20), 0)))};
                              x = var40;
                              A = new oz((short)var25, var26, var27);
                              il var45 = (il)A;
                              String var48 = 26791.x<invokedynamic>(26791, 1822600589483996391L ^ var20);
                              n_ var56 = new n_(0, var28, (char)var29, false, (char)var30, false, true.r<invokedynamic>(1807, 5084469731867126158L ^ var20), (DefaultConstructorMarker)null);
                              int var10005 = 1125.r<invokedynamic>(1125, 8730287663716428522L ^ var20);
                              Object var33 = null;
                              int var34 = var10005;
                              Object var35 = null;
                              Object var36 = null;
                              n_ var37 = var56;
                              String var38 = var48;
                              il var39 = var45;
                              T = qi.b(var22, var39, var38, (char)var23, var37, (pj)var36, (Function0)var35, var34, var33, (short)var24);
                              var45 = (il)A;
                              var48 = 21961.x<invokedynamic>(21961, 5884661231112243610L ^ var20);
                              var56 = new n_(0, var28, (char)var29, false, (char)var30, false, true.r<invokedynamic>(16153, 8882004195167654303L ^ var20), (DefaultConstructorMarker)null);
                              var10005 = 11842.r<invokedynamic>(11842, 1491454782160453831L ^ var20);
                              var33 = null;
                              var34 = var10005;
                              var35 = null;
                              var36 = null;
                              var37 = var56;
                              var38 = var48;
                              var39 = var45;
                              t = qi.b(var22, var39, var38, (char)var23, var37, (pj)var36, (Function0)var35, var34, var33, (short)var24);
                              C = qi.R((il)A, true.x<invokedynamic>(1390, 7137750362076289321L ^ var20), true, (pj)null, (Function0)null, true.r<invokedynamic>(11842, 1491454782160453831L ^ var20), var31, (Object)null);
                              B = qi.R((il)A, true.x<invokedynamic>(30504, 2176392077109521262L ^ var20), false, (pj)null, (Function0)null, true.r<invokedynamic>(11842, 1491454782160453831L ^ var20), var31, (Object)null);
                              O = new iv();
                              P = new iv();
                              class_2248[] var41 = new class_2248[5];
                              class_2248 var57 = class_2246.field_10381;
                              Intrinsics.checkNotNullExpressionValue(var57, true.x<invokedynamic>(30528, 2393220320934980382L ^ var20));
                              var41[0] = var57;
                              var57 = class_2246.field_10442;
                              Intrinsics.checkNotNullExpressionValue(var57, true.x<invokedynamic>(20452, 681518251982083001L ^ var20));
                              var41[1] = var57;
                              var57 = class_2246.field_10201;
                              Intrinsics.checkNotNullExpressionValue(var57, true.x<invokedynamic>(3073, 5509812038370136132L ^ var20));
                              var41[2] = var57;
                              var57 = class_2246.field_10013;
                              Intrinsics.checkNotNullExpressionValue(var57, true.x<invokedynamic>(2409, 8986784085268469046L ^ var20));
                              var41[3] = var57;
                              var57 = class_2246.field_22109;
                              Intrinsics.checkNotNullExpressionValue(var57, true.x<invokedynamic>(31676, 8170175303737075693L ^ var20));
                              var41[4] = var57;
                              q = CollectionsKt.listOf(var41);
                              return;
                           }
                           break;
                        default:
                           var44[var51] = var55;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "»`nm\u0007\u001f/Ë\u0096´þÐ>Ï\u0014ß";
                           var5 = "»`nm\u0007\u001f/Ë\u0096´þÐ>Ï\u0014ß".length();
                           var2 = 0;
                        }

                        var51 = var2;
                        var2 += 8;
                        var7 = var4.substring(var51, var2).getBytes("ISO-8859-1");
                        var44 = var6;
                        var51 = var3++;
                        var52 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var53 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var49;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u0017Ç§÷âSþ\u0013àÌ$É°C\u0014\u0099ö'-Å\u000e\u000eR³í\"ù?\u0097¹\u0088\u0086*ã\u000eÁ-À_!u` [/\u001d\u0002E ·®\u00932Ø\u009a°\u008e½t\u0015áî\u000f~$w\u0098¸G<\u001b-D<\u0007\u001eöF\u001f·U";
               var17 = "\u0017Ç§÷âSþ\u0013àÌ$É°C\u0014\u0099ö'-Å\u000e\u000eR³í\"ù?\u0097¹\u0088\u0086*ã\u000eÁ-À_!u` [/\u001d\u0002E ·®\u00932Ø\u009a°\u008e½t\u0015áî\u000f~$w\u0098¸G<\u001b-D<\u0007\u001eöF\u001f·U".length();
               var14 = '0';
               var13 = -1;
            }

            ++var13;
            var42 = var15.substring(var13, var13 + var14);
            var46 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18465;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/oz", var10);
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
         throw new RuntimeException("su/catlean/oz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15090;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/oz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/oz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
