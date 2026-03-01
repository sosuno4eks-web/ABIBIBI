package su.catlean;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.FilesDraggedEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class c0 implements zh {
   @NotNull
   public static final c0 S;
   @NotNull
   private static final Json X;
   @NotNull
   private static final vp N;
   @NotNull
   private static final dq f;
   @NotNull
   private static final dn B;
   @NotNull
   private static final d7 g;
   @NotNull
   private static final m8 L;
   @NotNull
   private static final vm l;
   @NotNull
   private static final rr R;
   @NotNull
   private static final sc H;
   @NotNull
   private static final df Y;
   @NotNull
   private static final iv b;
   private static int x;
   private static final long a = j0.a(510961337130899187L, 149196397076502127L, MethodHandles.lookup().lookupClass()).a(83869541902875L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] h;
   private static final Integer[] i;
   private static final Map j;

   private c0() {
   }

   @NotNull
   public final vp O() {
      return N;
   }

   @NotNull
   public final dq A() {
      return f;
   }

   @NotNull
   public final dn H() {
      return B;
   }

   @NotNull
   public final d7 v() {
      return g;
   }

   @NotNull
   public final m8 G() {
      return L;
   }

   @NotNull
   public final vm o() {
      return l;
   }

   @NotNull
   public final rr i() {
      return R;
   }

   @NotNull
   public final sc L() {
      return H;
   }

   @NotNull
   public final df T() {
      return Y;
   }

   private final void k(short var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 105162080127030L;
      Object var8 = kf.R();
      boolean var9 = false;
      int var10 = 0;
      int var11 = ((Object[])var8).length;

      while(true) {
         if (var10 < var11) {
            Object var12 = ((Object[])var8)[var10];
            boolean var14 = false;
            ((File)var12).mkdirs();
            ++var10;
            if (var3 > 0) {
               break;
            }

            if (var3 < 0) {
               continue;
            }
         }

         Field[] var10000 = this.getClass().getDeclaredFields();
         Intrinsics.checkNotNullExpressionValue(var10000, true.q<invokedynamic>(32747, 7439524501706458074L ^ var4));
         var8 = (Object[])var10000;
         var9 = false;
         break;
      }

      Object var20 = var8;
      Collection var22 = (Collection)(new ArrayList());
      boolean var24 = false;
      int var13 = 0;
      int var27 = ((Object[])var8).length;

      while(var13 < var27) {
         Object var15 = ((Object[])var20)[var13];
         Field var16 = (Field)var15;
         boolean var17 = false;

         label47: {
            try {
               if (var3 > 0) {
                  break label47;
               }

               if (xd.class.isAssignableFrom(var16.getType())) {
                  var22.add(var15);
               }
            } catch (NumberFormatException var18) {
               throw var18.A<invokedynamic>(var18, 603818484198340387L, var4);
            }

            ++var13;
         }

         if (var2 < 0) {
            break;
         }
      }

      Iterable var19 = (Iterable)((List)var22);
      var9 = false;
      Iterator var21 = var19.iterator();

      while(var21.hasNext()) {
         Object var23 = var21.next();
         Field var25 = (Field)var23;
         boolean var26 = false;
         var25.setAccessible(true);
         Object var28 = var25.get(S);
         Intrinsics.checkNotNull(var28, true.q<invokedynamic>(14442, 7618192315597522004L ^ var4));
         ((xd)var28).N(var6);
         if (var3 <= 0 && var3 <= 0) {
            continue;
         }
      }

   }

   public final void x(long param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void i(FilesDraggedEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void a(PlayerUpdateEvent var1) {
      long var2 = a ^ 38567532211118L;
      long var10001 = var2 ^ 2872127035373L;
      int var4 = (int)((var2 ^ 2872127035373L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      long var7 = var2 ^ 124222471685792L;
      int var9 = -1947528796969125646L.A<invokedynamic>(-1947528796969125646L, var2);

      int var14;
      iv var10000;
      label26: {
         label25: {
            try {
               var10000 = b;
               var14 = s8.H((short)var4, (short)var5, var6).field_1755 instanceof _u;
               if (var9 != 0) {
                  break label26;
               }

               if (var14 != 0) {
                  break label25;
               }
            } catch (NumberFormatException var13) {
               throw var13.A<invokedynamic>(var13, -1991626056127341794L, var2);
            }

            var14 = 23106.i<invokedynamic>(23106, 304846744477620055L ^ var2);
            break label26;
         }

         var14 = 29554.i<invokedynamic>(29554, 6641954423719362146L ^ var2);
      }

      if (var10000.a(var7, var14)) {
         u1 var10 = u1.Z;
         byte var11 = 0;
         boolean var12 = false;
         var10.d().execute((Runnable)(new pz(var11)));
      }

   }

   private static final Unit b(JsonBuilder var0) {
      long var1 = a ^ 58023813119085L;
      Intrinsics.checkNotNullParameter(var0, true.q<invokedynamic>(20461, 7601757927201589292L ^ var1));
      var0.setPrettyPrint(true);
      var0.setIgnoreUnknownKeys(true);
      var0.setEncodeDefaults(true);
      return Unit.INSTANCE;
   }

   static {
      long var20 = a ^ 135585671356462L;
      long var10001 = var20 ^ 80915234171175L;
      int var22 = (int)((var20 ^ 80915234171175L) >>> 48);
      int var23 = (int)(var10001 << 16 >>> 48);
      int var24 = (int)(var10001 << 32 >>> 32);
      long var25 = var20 ^ 85820556150050L;
      var10001 = var20 ^ 109616869198691L;
      int var27 = (int)((var20 ^ 109616869198691L) >>> 56);
      long var28 = var10001 << 8 >>> 8;
      var10001 = var20 ^ 25153913849389L;
      int var30 = (int)((var20 ^ 25153913849389L) >>> 48);
      int var31 = (int)(var10001 << 16 >>> 48);
      int var32 = (int)(var10001 << 32 >>> 32);
      long var33 = var20 ^ 14693691197759L;
      var10001 = var20 ^ 117748660629715L;
      int var35 = (int)((var20 ^ 117748660629715L) >>> 48);
      int var36 = (int)(var10001 << 16 >>> 32);
      int var37 = (int)(var10001 << 48 >>> 48);
      long var38 = var20 ^ 55630767940028L;
      long var40 = var20 ^ 43828656620853L;
      long var42 = var20 ^ 92080633450163L;
      long var44 = var20 ^ 128166751219940L;
      e = new HashMap(13);
      0.A<invokedynamic>(0, 8001529319878682819L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[14];
      int var16 = 0;
      String var15 = "]\u0093\"-»Lt\u000e¼\u008af0K2Zçn\u001fÂ\u0096\u0090\u008fº%#\u0080=öXÔäâ\u0007À£7ëÖ§ÿ\u0010j]\"µ½ô¡Þz\u0098\u0089øC-â\u0086(ã@\u0001\u0019c\u0092ç¤\u001e¹'ê|ì§Ó¹\u0093ÝCõ f\u0083!M\r±\u008e½Í\"\u0011©\"O\r¿I_\u0018;µ\u0019\u0011\u0086 ´Ë*/C\u00181rù À\u001bÚñ\u0017\u0012àó\u00181ü\u0087W\u0086S;¶ÐGÐ\u001f*;\u0081\u008bÁÙI!\u0083\u0093Æ/\u0080»·\u0097ù)!\u008e§'¥ü³½\b\u008dÎ\u0084cæR}\u0003\u0019`H\u00179ö¶Ë\u001e;xÂ$À\u009f\u000b@t\u0015\u0005ù\u0002ú^Û?3\f¹\u0087t\u0011\\ùò ?ö\u000e|\u0094y\u0086suH¹\u0089Î:\u008e´.\u009aÒFr\u0084Å¦\u0083µq\u0092%¥?÷P\u0081\u001févÛ6ý(\u0013\u0016ê\u0092\u009f'»|dâ|øwr\u0013\u0097\u001c<\nZ?Ðf\u009d\u0002\b7û4 eR\u008f0¸\u0004¿k8õ\u008b}ÂtPE\u0016ö\u0089Ó¸\u0012´:\u001b!üñGÔå±\u00101\u001eÃH¦2òjnerv9Óþãx»ÒD¨Z·\u0004à\u0017\u0014\u0006j\u001eëëâf©\u0002T6Ü¶2Rjà\u0092\u000e_¬\u0099ÑÁ\u009c^µÇ\u0007Ö\u0016\u008fÄ2¼¶¢.NÕ\bL\u008f\u0015\u0096ÛõÚrÒ¹\u0098Ö»Úo¶\u0019\u008a\u000b1¸\u008eô\u0004Òa\u0000à[®\u0088ÒH\u0080½êxw\u0014©`Q\u0096äÙ\u0081)ã¾g?\u0097\u0098Õci\"À\u0001X}\u000b\u009cø.\u0085ê\u008c\u0006\u0010[ ¼0ðÎÿ¸B«\u0010\u009fo´\u0094\u0007 PFÐT±6Ù¾s¤ºùPj\u0017Rnt\u008a8EÏ1X\u0084¥fF;\u0088\u001a\u009b(\u008f\n4\u008b\u00818Ðï8\u0000ë¦ÉÃÂ.Ï\u007fï\u0092ìm\u0017üÒ]^\b*~WêÜr¹¿\u008d%\u0099ª";
      int var17 = "]\u0093\"-»Lt\u000e¼\u008af0K2Zçn\u001fÂ\u0096\u0090\u008fº%#\u0080=öXÔäâ\u0007À£7ëÖ§ÿ\u0010j]\"µ½ô¡Þz\u0098\u0089øC-â\u0086(ã@\u0001\u0019c\u0092ç¤\u001e¹'ê|ì§Ó¹\u0093ÝCõ f\u0083!M\r±\u008e½Í\"\u0011©\"O\r¿I_\u0018;µ\u0019\u0011\u0086 ´Ë*/C\u00181rù À\u001bÚñ\u0017\u0012àó\u00181ü\u0087W\u0086S;¶ÐGÐ\u001f*;\u0081\u008bÁÙI!\u0083\u0093Æ/\u0080»·\u0097ù)!\u008e§'¥ü³½\b\u008dÎ\u0084cæR}\u0003\u0019`H\u00179ö¶Ë\u001e;xÂ$À\u009f\u000b@t\u0015\u0005ù\u0002ú^Û?3\f¹\u0087t\u0011\\ùò ?ö\u000e|\u0094y\u0086suH¹\u0089Î:\u008e´.\u009aÒFr\u0084Å¦\u0083µq\u0092%¥?÷P\u0081\u001févÛ6ý(\u0013\u0016ê\u0092\u009f'»|dâ|øwr\u0013\u0097\u001c<\nZ?Ðf\u009d\u0002\b7û4 eR\u008f0¸\u0004¿k8õ\u008b}ÂtPE\u0016ö\u0089Ó¸\u0012´:\u001b!üñGÔå±\u00101\u001eÃH¦2òjnerv9Óþãx»ÒD¨Z·\u0004à\u0017\u0014\u0006j\u001eëëâf©\u0002T6Ü¶2Rjà\u0092\u000e_¬\u0099ÑÁ\u009c^µÇ\u0007Ö\u0016\u008fÄ2¼¶¢.NÕ\bL\u008f\u0015\u0096ÛõÚrÒ¹\u0098Ö»Úo¶\u0019\u008a\u000b1¸\u008eô\u0004Òa\u0000à[®\u0088ÒH\u0080½êxw\u0014©`Q\u0096äÙ\u0081)ã¾g?\u0097\u0098Õci\"À\u0001X}\u000b\u009cø.\u0085ê\u008c\u0006\u0010[ ¼0ðÎÿ¸B«\u0010\u009fo´\u0094\u0007 PFÐT±6Ù¾s¤ºùPj\u0017Rnt\u008a8EÏ1X\u0084¥fF;\u0088\u001a\u009b(\u008f\n4\u008b\u00818Ðï8\u0000ë¦ÉÃÂ.Ï\u007fï\u0092ìm\u0017üÒ]^\b*~WêÜr¹¿\u008d%\u0099ª".length();
      char var14 = '(';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var46 = var15.substring(var13, var13 + var14);
         byte var49 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var46.getBytes("ISO-8859-1"));
            String var52 = a(var19).intern();
            switch(var49) {
            case 0:
               var18[var16++] = var52;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[14];
                  j = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[6];
                  int var3 = 0;
                  String var4 = "!\u0012\u0080Ïú\u008cN¶êí\u0099\u0083k\t\u008e\u0006©Çù÷aQ)}pÙNm\u009aï\u0010O";
                  int var5 = "!\u0012\u0080Ïú\u008cN¶êí\u0099\u0083k\t\u008e\u0006©Çù÷aQ)}pÙNm\u009aï\u0010O".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var54 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var54, var2).getBytes("ISO-8859-1");
                     long[] var48 = var6;
                     var54 = var3++;
                     long var55 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var56 = -1;

                     while(true) {
                        long var8 = var55;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var58 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var56) {
                        case 0:
                           var48[var54] = var58;
                           if (var2 >= var5) {
                              h = var6;
                              i = new Integer[6];
                              S = new c0();
                              X = JsonKt.Json$default((Json)null, c0::b, 1, (Object)null);
                              N = new vp(var38, X);
                              c0 var59 = S;
                              f = new dq(X, var40, N);
                              c0 var60 = S;
                              B = new dn(var25, X, N);
                              var60 = S;
                              g = new d7(var33, X, N);
                              L = new m8((byte)var27, var28, X);
                              l = new vm(X, var44);
                              R = new rr((char)var35, var36, X, (char)var37);
                              H = new sc((char)var30, (short)var31, var32, X);
                              var59 = S;
                              Y = new df(X, N, var42);
                              b = new iv();
                              S.k((short)var22, (short)var23, var24);
                              return;
                           }
                           break;
                        default:
                           var48[var54] = var58;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0088<ø\u001b.¦\u0011Ìè\u001b\u0087\u0005°Xjµ";
                           var5 = "\u0088<ø\u001b.¦\u0011Ìè\u001b\u0087\u0005°Xjµ".length();
                           var2 = 0;
                        }

                        var54 = var2;
                        var2 += 8;
                        var7 = var4.substring(var54, var2).getBytes("ISO-8859-1");
                        var48 = var6;
                        var54 = var3++;
                        var55 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var56 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var52;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u0098[·\u0019lgh\u0019F2\u000b\u009dtoúç\u0018JC\u007f%\u0095\u0081(à\u0096WÎ¸ê<\u0019\u0003ý\u0005òV\u0001:\u0010c";
               var17 = "\u0098[·\u0019lgh\u0019F2\u000b\u009dtoúç\u0018JC\u007f%\u0095\u0081(à\u0096WÎ¸ê<\u0019\u0003ý\u0005òV\u0001:\u0010c".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var46 = var15.substring(var13, var13 + var14);
            var49 = 0;
         }
      }
   }

   public static void q(int var0) {
      x = var0;
   }

   public static int U() {
      return x;
   }

   public static int r() {
      int var0 = U();

      try {
         return var0 == 0 ? 109 : 0;
      } catch (NumberFormatException var1) {
         throw a((Throwable)var1);
      }
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 13618;
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
            throw new RuntimeException("su/catlean/c0", var10);
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
         throw new RuntimeException("su/catlean/c0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26660;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = h[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/c0", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
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
         throw new RuntimeException("su/catlean/c0" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
