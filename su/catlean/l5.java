package su.catlean;

import java.awt.Color;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class l5 extends k9 {
   @NotNull
   public static final l5 f;
   static final KProperty[] T;
   @NotNull
   private static final zr W;
   @NotNull
   private static final zo R;
   @NotNull
   private static final zo X;
   @NotNull
   private static final zv U;
   @NotNull
   private static final zo x;
   private static float Y;
   @NotNull
   private static aa A;
   @NotNull
   private static aa C;
   private static final long b = j0.a(4699160101162373908L, 4436641062974473254L, MethodHandles.lookup().lookupClass()).a(133656896197708L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map k;

   private l5(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 65713505534129L;
      super(var3, true.g<invokedynamic>(31472, 5735394473582795745L ^ var1), pa.W(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   @NotNull
   public final gi p(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 52999857680677L;
      int var3 = (int)((var1 ^ 52999857680677L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (gi)W.k((short)var3, this, T[0], (short)var4, var5);
   }

   private final boolean P(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 10153082399563L;
      int var3 = (int)((var1 ^ 10153082399563L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)R.k((short)var3, this, T[1], (short)var4, var5);
   }

   private final boolean C(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 119391972897921L;
      int var3 = (int)((var1 ^ 119391972897921L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)X.k((short)var3, this, T[2], (short)var4, var5);
   }

   private final Color v(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 79254387765564L;
      int var3 = (int)((var1 ^ 79254387765564L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)U.k((short)var3, this, T[3], (short)var4, var5);
   }

   private final boolean j(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 108752298108552L;
      int var3 = (int)((var1 ^ 108752298108552L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)x.k((short)var3, this, T[4], (short)var4, var5);
   }

   @Flow
   public final void a(@NotNull Render2DEvent e) {
      // $FF: Couldn't be decompiled
   }

   public final void J(long a, @NotNull class_4587 matrices, float x, float y, float size, @NotNull Color color) {
      var1 ^= b;
      long var8 = var1 ^ 41734734727333L;
      long var10 = var1 ^ 9075318610117L;
      Intrinsics.checkNotNullParameter(var3, true.g<invokedynamic>(20854, 2800599961072118063L ^ var1));
      Intrinsics.checkNotNullParameter(var7, true.g<invokedynamic>(21832, 1534283487550876946L ^ var1));
      String[] var10000 = 267172338284553660L.A<invokedynamic>(267172338284553660L, var1);
      Matrix4f var10001 = var3.method_23760().method_23761();
      Intrinsics.checkNotNullExpressionValue(var10001, true.g<invokedynamic>(29714, 6865950163727846471L ^ var1));
      Matrix4f var13 = var10001;
      String[] var12 = var10000;

      try {
         gk.E.S(var13, _h.o(), var4, var5, var6, var6, var7, var7, var8, var7, var7, true, this.p(var10).b().Z(), this.p(var10).b().q(), this.p(var10).b().n(), this.p(var10).b().k());
         if (var12 != null) {
            (new int[3]).A<invokedynamic>(new int[3], 263362297669533724L, var1);
         }

      } catch (NumberFormatException var14) {
         throw var14.A<invokedynamic>(var14, 266330800646672309L, var1);
      }
   }

   @Flow
   public final void O(@NotNull Render3DEvent e) {
      // $FF: Couldn't be decompiled
   }

   private final float h(float var1, float var2, long var3, float var5) {
      var3 ^= b;

      float var10000;
      label17: {
         try {
            if (au.a.z() > 5) {
               var10000 = 1.0F / (float)au.a.z();
               break label17;
            }
         } catch (NumberFormatException var7) {
            throw var7.A<invokedynamic>(var7, -647319359250777341L, var3);
         }

         var10000 = 0.016F;
      }

      float var6 = Math.clamp(var10000 * var5, 0.0F, 1.0F);
      return (1.0F - var6) * var1 + var6 * var2;
   }

   static {
      long var31 = b ^ 18801382767491L;
      long var33 = var31 ^ 83176643544422L;
      long var35 = var31 ^ 133680517153429L;
      long var37 = var31 ^ 136349098516558L;
      long var10001 = var31 ^ 113598412656275L;
      int var39 = (int)((var31 ^ 113598412656275L) >>> 48);
      int var40 = (int)(var10001 << 16 >>> 48);
      int var41 = (int)(var10001 << 32 >>> 32);
      long var42 = var31 ^ 87796559314871L;
      e = new HashMap(13);
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var23 = 1; var23 < 8; ++var23) {
         var10003[var23] = (byte)((int)(var31 << var23 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[22];
      int var27 = 0;
      String var26 = "\u007fÂí\u0000]BÍÖ*\u0083\u0080ÂÇ:Wolò\u009f\u0018Y$Ú{ ï«î\u0099¾ÎîÑ0oXb§ÕRC:\u0015È÷È\n£³GgÇÒ\u001c\f\"ý\u0010Ã\u0084\u0003\u0096\u00ad\u0091\u0087dG?\u00011\u0085¹e\u00ad\u0010*\u0010?H+Æ¼~°ëÁ4ÞF3P\u0010ü´Ò\n1\\\u0093â\u009cñ»Ò#\u008dÄÂ(\u008e2\u0018\ncâ\u0098y\u0016NàÎoZÞdåÂ]G\u0010ù¹J\u0094ü\t~_#¹ísS\u0088\u0014%pDC\u0010\u001c\u0017á\t\u009b -ÃSå\u0086¯?¡.ã\u0018¯=`ÈÊ\u0094^ÔEÜ7Q$zíþGùõ£\u0016ù³2\u0018I¡p\u0012.ÍòL\u0012\u0004\u0017Ê\u0093½\u0017\u001b3it<°\u001b\u0017Ô\u0010v\u0016he\u009a÷åúk\u0091Á:õ\u001fee\u0010\u0015³¼&\u0084þÎ\u0093Ú¡iÂqnïÊ rÄÐm¶:\u0013Ô(ËßQ\u0012Æª!p\u0080R\u0099tW7\u008aI\u0090GW\u0014,eJ@\u009eóÝjâ\u0013Ê\u0092ô1¤\n\u008dëî}©#Ñ¸;B\u007fnF\u0001¼¤»ï \u001b\u0004ª°óh,1±\u0084ÆíÁR§\u0006ÿh»\u000bI*\u0094\u009d\u0001'JU\u008d»\u008dÎ\f ÖmèÃ$kk\\\u0016\u0098í©à»Ý\u008a\u001bç\u001eñy\"\u0091pX\u0091_f\u007f\u008dtë0nj\u0012©X\u0089+ÀÔú\u00839\u0003úáÔ:Ë\u009a@\u001aÓ\u0084Vkùè\u0096ª\u0015@k\u0087ä8ß\u0013ö\u0099d§Â \u001aí¸ÐÏ \u008dÂrÆNßd\u0002ßk\u0012;õÇ\u001b{>¾|.bÑ<\n÷\u0098mï_¹añ\u0010(¤\u001bî`Ô\u0093a\u0098jâ \b\u0083N!\u0018´¼lG\u0094òo¢öåbà½\u0016þÙO\u0001å\u0094R\u0017\u009d¼\u0018Á_Ò\u001aa£ð\u0099\u0087ß¾ï\u009dN~\u0001ùþkþ>£\t;\u0018\u0019¿üYÛ¯o\u0018Yu`e=Y\u0015ó>,:K`[½\u0084";
      int var28 = "\u007fÂí\u0000]BÍÖ*\u0083\u0080ÂÇ:Wolò\u009f\u0018Y$Ú{ ï«î\u0099¾ÎîÑ0oXb§ÕRC:\u0015È÷È\n£³GgÇÒ\u001c\f\"ý\u0010Ã\u0084\u0003\u0096\u00ad\u0091\u0087dG?\u00011\u0085¹e\u00ad\u0010*\u0010?H+Æ¼~°ëÁ4ÞF3P\u0010ü´Ò\n1\\\u0093â\u009cñ»Ò#\u008dÄÂ(\u008e2\u0018\ncâ\u0098y\u0016NàÎoZÞdåÂ]G\u0010ù¹J\u0094ü\t~_#¹ísS\u0088\u0014%pDC\u0010\u001c\u0017á\t\u009b -ÃSå\u0086¯?¡.ã\u0018¯=`ÈÊ\u0094^ÔEÜ7Q$zíþGùõ£\u0016ù³2\u0018I¡p\u0012.ÍòL\u0012\u0004\u0017Ê\u0093½\u0017\u001b3it<°\u001b\u0017Ô\u0010v\u0016he\u009a÷åúk\u0091Á:õ\u001fee\u0010\u0015³¼&\u0084þÎ\u0093Ú¡iÂqnïÊ rÄÐm¶:\u0013Ô(ËßQ\u0012Æª!p\u0080R\u0099tW7\u008aI\u0090GW\u0014,eJ@\u009eóÝjâ\u0013Ê\u0092ô1¤\n\u008dëî}©#Ñ¸;B\u007fnF\u0001¼¤»ï \u001b\u0004ª°óh,1±\u0084ÆíÁR§\u0006ÿh»\u000bI*\u0094\u009d\u0001'JU\u008d»\u008dÎ\f ÖmèÃ$kk\\\u0016\u0098í©à»Ý\u008a\u001bç\u001eñy\"\u0091pX\u0091_f\u007f\u008dtë0nj\u0012©X\u0089+ÀÔú\u00839\u0003úáÔ:Ë\u009a@\u001aÓ\u0084Vkùè\u0096ª\u0015@k\u0087ä8ß\u0013ö\u0099d§Â \u001aí¸ÐÏ \u008dÂrÆNßd\u0002ßk\u0012;õÇ\u001b{>¾|.bÑ<\n÷\u0098mï_¹añ\u0010(¤\u001bî`Ô\u0093a\u0098jâ \b\u0083N!\u0018´¼lG\u0094òo¢öåbà½\u0016þÙO\u0001å\u0094R\u0017\u009d¼\u0018Á_Ò\u001aa£ð\u0099\u0087ß¾ï\u009dN~\u0001ùþkþ>£\t;\u0018\u0019¿üYÛ¯o\u0018Yu`e=Y\u0015ó>,:K`[½\u0084".length();
      char var25 = 24;
      int var24 = -1;

      label74:
      while(true) {
         ++var24;
         String var45 = var26.substring(var24, var24 + var25);
         byte var47 = -1;

         while(true) {
            byte[] var30 = var22.doFinal(var45.getBytes("ISO-8859-1"));
            String var53 = b(var30).intern();
            switch(var47) {
            case 0:
               var29[var27++] = var53;
               if ((var24 += var25) >= var28) {
                  c = var29;
                  d = new String[22];
                  k = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var12 = 1; var12 < 8; ++var12) {
                     var10003[var12] = (byte)((int)(var31 << var12 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[6];
                  int var14 = 0;
                  String var15 = "×\u0083×\u0088ªû*\u0080M(í!Ý\u008e\u0093¥¶Ü¥4)ÓCð\u009b\u0001\u0087ñ:ï0\u009f";
                  int var16 = "×\u0083×\u0088ªû*\u0080M(í!Ý\u008e\u0093¥¶Ü¥4)ÓCð\u009b\u0001\u0087ñ:ï0\u009f".length();
                  int var13 = 0;

                  label56:
                  while(true) {
                     int var52 = var13;
                     var13 += 8;
                     byte[] var18 = var15.substring(var52, var13).getBytes("ISO-8859-1");
                     long[] var48 = var17;
                     var52 = var14++;
                     long var55 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                     byte var56 = -1;

                     while(true) {
                        long var19 = var55;
                        byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                        long var58 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                        switch(var56) {
                        case 0:
                           var48[var52] = var58;
                           if (var13 >= var16) {
                              g = var17;
                              i = new Integer[6];
                              Cipher var1;
                              var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var2 = 1; var2 < 8; ++var2) {
                                 var10003[var2] = (byte)((int)(var31 << var2 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long[] var0 = new long[2];
                              int var4 = 0;
                              String var5 = "/¾\u001bÖÐ×{ó/¾\u001bÖÐ×{ó";
                              int var6 = "/¾\u001bÖÐ×{ó/¾\u001bÖÐ×{ó".length();
                              int var3 = 0;

                              do {
                                 var52 = var3;
                                 var3 += 8;
                                 byte[] var7 = var5.substring(var52, var3).getBytes("ISO-8859-1");
                                 var52 = var4++;
                                 long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                 byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                 var58 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                 boolean var59 = true;
                                 var0[var52] = var58;
                              } while(var3 < var6);

                              KProperty[] var44 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l5.class, true.g<invokedynamic>(19096, 4358526520432136827L ^ var31), true.g<invokedynamic>(15764, 6666128084246783354L ^ var31), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l5.class, true.g<invokedynamic>(28688, 7815589670715304182L ^ var31), true.g<invokedynamic>(14113, 6583439048150446034L ^ var31), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l5.class, true.g<invokedynamic>(11752, 4221506670581118215L ^ var31), true.g<invokedynamic>(13838, 2859939008612626155L ^ var31), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l5.class, true.g<invokedynamic>(14578, 6709972016067862554L ^ var31), true.g<invokedynamic>(20063, 4153655786154890931L ^ var31), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(l5.class, true.g<invokedynamic>(27434, 6544175696808817611L ^ var31), true.g<invokedynamic>(9500, 57984296358477297L ^ var31), 0)))};
                              T = var44;
                              f = new l5(var37);
                              W = qi.M((il)f, true.g<invokedynamic>(7352, 1268792388173841485L ^ var31), (Enum)gi.ARROWS_1, (pj)null, (Function0)null, true.d<invokedynamic>(26626, 183571014996285335L ^ var31), (Object)null, var33);
                              R = qi.R((il)f, true.g<invokedynamic>(13712, 8682574551616187762L ^ var31), false, (pj)null, (Function0)null, true.d<invokedynamic>(22147, 6708999716908460308L ^ var31), var35, (Object)null);
                              X = qi.R((il)f, true.g<invokedynamic>(10829, 629295690832966332L ^ var31), false, (pj)null, (Function0)null, true.d<invokedynamic>(22147, 6708999716908460308L ^ var31), var35, (Object)null);
                              il var50 = (il)f;
                              String var49 = 18605.g<invokedynamic>(18605, 862350021444997213L ^ var31);
                              Color var60 = Color.GREEN;
                              Intrinsics.checkNotNullExpressionValue(var60, true.g<invokedynamic>(2667, 1079437230541525633L ^ var31));
                              U = qi.F(var50, var49, var60, (pj)null, (Function0)null, true.d<invokedynamic>(22147, 6708999716908460308L ^ var31), var42, (Object)null);
                              x = qi.R((il)f, true.g<invokedynamic>(13476, 7589121472196602960L ^ var31), false, (pj)null, (Function0)null, true.d<invokedynamic>(22147, 6708999716908460308L ^ var31), var35, (Object)null);
                              A = new aa(sa.OUT_QUINT, var0[0], (short)var39, (short)var40, var41);
                              C = new aa(sa.OUT_QUINT, var0[1], (short)var39, (short)var40, var41);
                              return;
                           }
                           break;
                        default:
                           var48[var52] = var58;
                           if (var13 < var16) {
                              continue label56;
                           }

                           var15 = " è\u007fã\u0010À@\u000fs\u0018Á¬\f%\u00ad»";
                           var16 = " è\u007fã\u0010À@\u000fs\u0018Á¬\f%\u00ad»".length();
                           var13 = 0;
                        }

                        var52 = var13;
                        var13 += 8;
                        var18 = var15.substring(var52, var13).getBytes("ISO-8859-1");
                        var48 = var17;
                        var52 = var14++;
                        var55 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        var56 = 0;
                     }
                  }
               }

               var25 = var26.charAt(var24);
               break;
            default:
               var29[var27++] = var53;
               if ((var24 += var25) < var28) {
                  var25 = var26.charAt(var24);
                  continue label74;
               }

               var26 = ">\u0092 óÅ\u001a]©¶öÙÓy\u0097\u00ad+VD\u0087qeà»M\u0010\u007fÍø0\u008bJn\u0080áÃ\r\u0001\u008e\u007f\u0093N";
               var28 = ">\u0092 óÅ\u001a]©¶öÙÓy\u0097\u00ad+VD\u0087qeà»M\u0010\u007fÍø0\u008bJn\u0080áÃ\r\u0001\u008e\u007f\u0093N".length();
               var25 = 24;
               var24 = -1;
            }

            ++var24;
            var45 = var26.substring(var24, var24 + var25);
            var47 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31445;
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
            throw new RuntimeException("su/catlean/l5", var10);
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
         throw new RuntimeException("su/catlean/l5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 7587;
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
            throw new RuntimeException("su/catlean/l5", var14);
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
         throw new RuntimeException("su/catlean/l5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
