package su.catlean;

import com.google.common.collect.Queues;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_2547;
import net.minecraft.class_2596;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.render.Render3DEvent;

public final class a8 {
   @NotNull
   public static final a8 V;
   @NotNull
   private static final ConcurrentLinkedQueue D;
   @NotNull
   private static final ConcurrentLinkedQueue e;
   @Nullable
   private static class_1657 O;
   @Nullable
   private static class_243 K;
   @Nullable
   private static class_243 S;
   private static long c;
   private static final long a = j0.a(7451426667558597437L, 4040646155419368373L, MethodHandles.lookup().lookupClass()).a(157869103582907L);
   private static final String[] b;
   private static final String[] d;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   private a8() {
   }

   @Nullable
   public final class_1657 b() {
      return O;
   }

   public final void j(@Nullable class_1657 <set-?>) {
      O = var1;
   }

   public final void M(long a, @NotNull Render3DEvent event) {
      // $FF: Couldn't be decompiled
   }

   public final void a(@NotNull ReceivePacket e, long a) {
      // $FF: Couldn't be decompiled
   }

   public final void p(int param1, short param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public final void Q(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final void T(boolean clear) {
      D.removeIf(a8::o);
   }

   public static void n(a8 var0, long var1, boolean var3, int var4, Object var5) {
      var1 ^= a;
      String var6 = 4774812952752754383L.A<invokedynamic>(4774812952752754383L, var1);

      label21: {
         int var10000;
         label20: {
            try {
               var10000 = var4 & 1;
               if (var6 == null) {
                  break label20;
               }

               if (var10000 == 0) {
                  break label21;
               }
            } catch (NumberFormatException var7) {
               throw var7.A<invokedynamic>(var7, 4860002966633567422L, var1);
            }

            var10000 = 0;
         }

         var3 = var10000;
      }

      var0.T((boolean)var3);
   }

   public final void o() {
      D.removeIf(a8::W);
      O = null;
      K = null;
   }

   private static final boolean y(class_2596 var0) {
      long var1 = a ^ 47383171001556L;
      long var3 = var1 ^ 21114860129027L;
      a8 var5 = V;

      Result.Companion var10000;
      Object var6;
      try {
         var10000 = Result.Companion;
         boolean var7 = false;
         Intrinsics.checkNotNull(var0, true.z<invokedynamic>(22478, 8069871934711846644L ^ var1));
         var0.method_65081((class_2547)s8.Y(var3));
         var6 = Result.constructor-impl(Unit.INSTANCE);
      } catch (Throwable var8) {
         var10000 = Result.Companion;
         var6 = Result.constructor-impl(ResultKt.createFailure(var8));
      }

      return true;
   }

   private static final boolean X(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean j(boolean param0, p2 param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean o(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean o(p2 var0) {
      long var1 = a ^ 70986647419073L;
      long var3 = var1 ^ 132644482883350L;
      a8 var5 = V;

      Result.Companion var10000;
      Object var6;
      try {
         var10000 = Result.Companion;
         boolean var7 = false;
         class_2596 var9 = var0.o();
         Intrinsics.checkNotNull(var9, true.z<invokedynamic>(20339, 8355863642295048795L ^ var1));
         var9.method_65081((class_2547)s8.Y(var3));
         var6 = Result.constructor-impl(Unit.INSTANCE);
      } catch (Throwable var8) {
         var10000 = Result.Companion;
         var6 = Result.constructor-impl(ResultKt.createFailure(var8));
      }

      return true;
   }

   private static final boolean W(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var20 = a ^ 39804972493356L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[6];
      int var16 = 0;
      String var15 = "u\u0000ï\u0000f¦~\u00109\u001a=«© ¤\u00858¡àG\u0003\u0004zÜÑ\u001dò\u009ay½Ï¹\u0085(5©¶æA\u0081\bx\u0006ñN\u008cóÅºàýG}\u0006\u0080ÉëÖ66\u0016ÈCk\u008d\u000bV¹BÐ9ì\u000fà[YWH\u0082usñT;ï\u009b/Ê^)±\u008f>6h¹¶liÍMWò@q\u009c`Ä\u0093.Fé.OL±øhv\u008bæ$\u0011ãdÑ\\\u008aµê÷x\u0019tDß¯t\u009bËÈY¤Öfú,Ród(ò¤\f\u0094²þÝðÅ^u9> ©½b\u0099Ö«\u0094JäáÉê\u0097sØgvø\u001fòJDLßbye¤R]K4\u0093¾¯TsëÖ'S\u0085\u008aÇHk(\u001f6\u0007r3-Ú\u0097\u000e\u00068«\u008e\u0011^Äø\u007faq^×ÈÏÄ\u0099DEûq3.\u008f\u001ec?\u0010§\u0001¢\n\u001a\u0004n\u0013©\u008aÒ«&JÖx2\u00adµ\u001bÍ|hg\r4mOM,ER¡â\u0099DN/8ýâCÒ\u0092Úd¢v¨8\u0086ñÅ©û¹~\u009c\u009e¯\u0089;,^\\\"\u0014Ê/NxÿéÖ!ã\u0095qTµh\u0082«\u0091Ú\u0091a\u0088ý\u0098í\t\u0096¤#eÓ\u0085\u009an\u0092$j,µò";
      int var17 = "u\u0000ï\u0000f¦~\u00109\u001a=«© ¤\u00858¡àG\u0003\u0004zÜÑ\u001dò\u009ay½Ï¹\u0085(5©¶æA\u0081\bx\u0006ñN\u008cóÅºàýG}\u0006\u0080ÉëÖ66\u0016ÈCk\u008d\u000bV¹BÐ9ì\u000fà[YWH\u0082usñT;ï\u009b/Ê^)±\u008f>6h¹¶liÍMWò@q\u009c`Ä\u0093.Fé.OL±øhv\u008bæ$\u0011ãdÑ\\\u008aµê÷x\u0019tDß¯t\u009bËÈY¤Öfú,Ród(ò¤\f\u0094²þÝðÅ^u9> ©½b\u0099Ö«\u0094JäáÉê\u0097sØgvø\u001fòJDLßbye¤R]K4\u0093¾¯TsëÖ'S\u0085\u008aÇHk(\u001f6\u0007r3-Ú\u0097\u000e\u00068«\u008e\u0011^Äø\u007faq^×ÈÏÄ\u0099DEûq3.\u008f\u001ec?\u0010§\u0001¢\n\u001a\u0004n\u0013©\u008aÒ«&JÖx2\u00adµ\u001bÍ|hg\r4mOM,ER¡â\u0099DN/8ýâCÒ\u0092Úd¢v¨8\u0086ñÅ©û¹~\u009c\u009e¯\u0089;,^\\\"\u0014Ê/NxÿéÖ!ã\u0095qTµh\u0082«\u0091Ú\u0091a\u0088ý\u0098í\t\u0096¤#eÓ\u0085\u009an\u0092$j,µò".length();
      char var14 = 16;
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var28;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  d = new String[6];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[3];
                  int var3 = 0;
                  String var4 = "#¨æÄÎm\u0094a\u0083ee]\u009dìFÀ^º·\u0094\u008e\u008d7Ú";
                  int var5 = "#¨æÄÎm\u0094a\u0083ee]\u009dìFÀ^º·\u0094\u008e\u008d7Ú".length();
                  int var2 = 0;

                  do {
                     int var26 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     var26 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var30 = true;
                     var6[var26] = var10004;
                  } while(var2 < var5);

                  g = var6;
                  h = new Integer[3];
                  V = new a8();
                  ConcurrentLinkedQueue var25 = Queues.newConcurrentLinkedQueue();
                  Intrinsics.checkNotNullExpressionValue(var25, true.z<invokedynamic>(2126, 961569249101647752L ^ var20));
                  D = var25;
                  var25 = Queues.newConcurrentLinkedQueue();
                  Intrinsics.checkNotNullExpressionValue(var25, true.z<invokedynamic>(17464, 7991675002066093052L ^ var20));
                  e = var25;
                  c = s8.Z();
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var28;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "âñ¶\u0081h\u0091c¸ê¯çÇ\u0014õ\u0014¯÷(Z$¾H¾1÷ÅÐ©\u00048\u0010<\u0010æe|2Ø\u00ad»úQ½\u0081Ç\u009a\u0099mF3n2ë«\u0080È¹Æ\u0000\u001do\u0017E\u0096Òç\u0084\u0092HÒVsôJ_Ýî\u0006\u0092(YóÉÏZ§Æeáð\u0083¾~1%=J?¬¸eþ -°@Î\u0007)±~\u000eÓô#Ò(0Â[\u0084ö\u0089\u0018¢dTÝØÓ¸áÙ\u0019¢z\u0005L\u0017±ÔË\u009cpä\u0087õ\tÞ¼Ì³ZDm¡\u0003\u008d÷+«$cÅ «\u0095\u001f¦¼\u001d\u007f¡\fØ\u0018ó1íy´\u0087g\u0000ò9txI!\u0094JîGO\u009fÄ\u0087\u009cR¬gÂ!#V¬UÁ#bë\u009f\u0080\u0097\u0013¶óÑ?Íf]NÖRùÅßD¢U×º\u0017ô\u000eBvH/¥uú\u0088\u001f\u0013\u0000j¾ð,såài\u0001ä\u0092A\u0080 *\u0000ÜÂG\u0011ÎÑjp\u0002\u008a;òT¡¢ûÊº}Ð~ýÙë|\u00adG\u0001jk\r{ \u0012|ô¡°ÍEz\u009fØ$²À \u0080\u009f\u0005|ì/R]Eü\u0099\u009d\u008aa¸.\u0089£f\u008e|öõçOº\u008fKw\u0016_ª©\u0084";
               var17 = "âñ¶\u0081h\u0091c¸ê¯çÇ\u0014õ\u0014¯÷(Z$¾H¾1÷ÅÐ©\u00048\u0010<\u0010æe|2Ø\u00ad»úQ½\u0081Ç\u009a\u0099mF3n2ë«\u0080È¹Æ\u0000\u001do\u0017E\u0096Òç\u0084\u0092HÒVsôJ_Ýî\u0006\u0092(YóÉÏZ§Æeáð\u0083¾~1%=J?¬¸eþ -°@Î\u0007)±~\u000eÓô#Ò(0Â[\u0084ö\u0089\u0018¢dTÝØÓ¸áÙ\u0019¢z\u0005L\u0017±ÔË\u009cpä\u0087õ\tÞ¼Ì³ZDm¡\u0003\u008d÷+«$cÅ «\u0095\u001f¦¼\u001d\u007f¡\fØ\u0018ó1íy´\u0087g\u0000ò9txI!\u0094JîGO\u009fÄ\u0087\u009cR¬gÂ!#V¬UÁ#bë\u009f\u0080\u0097\u0013¶óÑ?Íf]NÖRùÅßD¢U×º\u0017ô\u000eBvH/¥uú\u0088\u001f\u0013\u0000j¾ð,såài\u0001ä\u0092A\u0080 *\u0000ÜÂG\u0011ÎÑjp\u0002\u008a;òT¡¢ûÊº}Ð~ýÙë|\u00adG\u0001jk\r{ \u0012|ô¡°ÍEz\u009fØ$²À \u0080\u009f\u0005|ì/R]Eü\u0099\u009d\u008aa¸.\u0089£f\u008e|öõçOº\u008fKw\u0016_ª©\u0084".length();
               var14 = 128;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17857;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/a8", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/a8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12488;
      if (h[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
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
            throw new RuntimeException("su/catlean/a8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
   }

   private static int b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite b(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("b".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/a8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
