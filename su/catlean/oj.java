package su.catlean;

import java.io.Closeable;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class oj extends k9 {
   @NotNull
   public static final oj g;
   @NotNull
   private static final ConcurrentLinkedQueue P;
   private static float k;
   private static float N;
   private static int I;
   private static File M;
   private static final long b = j0.a(-7542235212793954342L, 7201798090919680560L, MethodHandles.lookup().lookupClass()).a(28714191075069L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] i;
   private static final Map l;

   private oj(short var1, char var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
      long var6 = var4 ^ 85882368551930L;
      super(var6, true.a<invokedynamic>(20448, 4659666679194732350L ^ var4), pa.Q(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   public final int W() {
      return I;
   }

   public final void o(int <set-?>) {
      I = var1;
   }

   public void n(long param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void D(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void V(short var1, short var2, String var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ b;
      long var10001 = var5 ^ 27104288945410L;
      int var7 = (int)((var5 ^ 27104288945410L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);

      try {
         P.add(var3);
         if (P.size() >= true.f<invokedynamic>(10811, 5532861975810472676L ^ var5)) {
            this.j(var7, (char)var8, (char)var9);
         }

      } catch (NumberFormatException var10) {
         throw var10.A<invokedynamic>(var10, 7391550927375368229L, var5);
      }
   }

   private final void j(int var1, char var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      String var6 = 3551898568770040549L.A<invokedynamic>(3551898568770040549L, var4);

      try {
         FileWriter var10001;
         FileWriter var24;
         File var26;
         try {
            var24 = new FileWriter;
            var10001 = var24;
            var26 = M;
            if (var26 == null) {
               Intrinsics.throwUninitializedPropertyAccessException(true.a<invokedynamic>(29582, 742893207711202131L ^ var4));
               var26 = null;
            }
         } catch (Throwable var21) {
            throw var21.A<invokedynamic>(var21, 3593319618010699631L, var4);
         }

         var10001.<init>(var26, true);
         Closeable var7 = (Closeable)var24;
         Throwable var8 = null;

         try {
            FileWriter var9 = (FileWriter)var7;
            boolean var10 = false;

            while(true) {
               boolean var25;
               if (!((Collection)P).isEmpty()) {
                  try {
                     var25 = true;
                     if (var1 > 0 && var6 == null) {
                     }
                  } catch (Throwable var17) {
                     throw var17.A<invokedynamic>(var17, 3593319618010699631L, var4);
                  }
               } else {
                  var25 = false;
               }

               try {
                  if (!var25) {
                     break;
                  }

                  var9.append((CharSequence)P.poll());
                  var9.append((CharSequence)"\n");
                  if (var6 == null) {
                     continue;
                  }
               } catch (Throwable var18) {
                  throw var18.A<invokedynamic>(var18, 3593319618010699631L, var4);
               }

               if (var3 <= 0) {
               }
               break;
            }

            Unit var23 = Unit.INSTANCE;
         } catch (Throwable var19) {
            var8 = var19;
            throw var19;
         } finally {
            CloseableKt.closeFinally(var7, var8);
         }
      } catch (IOException var22) {
         String var10000 = var22.getMessage();
         String var10002 = true.a<invokedynamic>(10061, 4337688294697463710L ^ var4);
         System.out.println(var10002 + var10000);
      }

   }

   static {
      long var20 = b ^ 82044752695576L;
      long var10001 = var20 ^ 90560128475550L;
      int var22 = (int)((var20 ^ 90560128475550L) >>> 48);
      int var23 = (int)(var10001 << 16 >>> 48);
      int var24 = (int)(var10001 << 32 >>> 32);
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[15];
      int var16 = 0;
      String var15 = "'\u0088 ã?ûI½|Ê\u0092õóo\u001fp/y\u0081ñ(Nú4¤}\u00ad\u0003\u009c+Ö×\u0010¾\u0094\u0001-Ã»(ñ63\u0091Â\u0099ý\bd\u0010CûÕ·PÜ\u0095\b\u0080Nk\u008c\nG)2\u0010/?í¥]ú\u0093pÎ\u008fA2\u0017\u0013ä° \"Û\b\u0011(Yp\u0015R6Ésã<ô\u0018àMî~\u0091\u000eÜã®z?¬Å°\u0083/ 1\u009d~»eò¸ \u008bÝ«¯5£ûé%vsøÚÁ;U\u0092Çá\u0012æ¯\u0001\u0003\u0080§\u009eÂdkÛqvg½·>°ÈäRßÒ58«ÖsHâè\u001e¨Ç+ØÄ|V~#\u0081¹û)¦\u000fÅ5\u009e\t}\u009e~T«å£¾áBj\u0007{U\u0012X¾mf\u008fÞYëbsY\u0099²òýD\u0011ZçR\u0003öÿF4u:G´å!ªluu·\u0001\u001fü.\u0004Â8\fÄÂ¸\u001dx\u0083 #]M)äÒ\u009c4íG\u0011Pc&\u0098\u009f %º-\u001b\u0015\u0094¾\u00996)\u0016Wç\b¾\"ë\u000fÆîø\u000fåÒª\u0013éÎ×\r\u0081\u0098ŸOÎè)ZôMDú\u0098ÿ~A%\u008b\u0000Ê@\u0093\u0001m«\u009awª:\u0005\u0017T\u001c\u009a.!Ñvu\u0017¸\"RÛ\u00821\u0094¦\u0000·\u008b/Ç\u0004ú\u0087¥\u0092oR\u0016Û+tÇ`ß@(\u0095«Ö\u0006\u000bI»ï\u0017\u0087\u000f\fv®`\u0092s#\u0007±q»µ$N\u0085(ZÛVp\u0099ò=\u001f\u009cÁ\u001e§zêÞ\u000eªî\u008eh|ì&üë\u0088Ò±\u00143L1\u0012²\u0006¢?Fðlv\u009d\u008f)@¢¸õö\u0088\u007f¨µ%ø\u007fEO\u0014\u001e\u008c\u000fct8\u000e\u0013³P\u008d\u0002\u008cã\u001fÇ\u0095K°²Aå\u001d\t\u0003ãoüý\u001fÐ\u000eîäÍ^\u0013lXm\u008a\u0084i\u0084k\u0010s\\8±\u009b\u009e\u0082\u0010,Y\u009c;¦ÄGº+qI!uÍ¥ï²\u008fIÉN¡\u009b\u0010Oâ;\u0095\u008fÜä\\ò\u0091\b$þ\u001a%D\u0010¸°W\tkµ\u008aåWëÃÓV6\u0014E\u0096!ª¨\u0091\u00121êh7\u0098p¹¶È\u0091ÀÈ}#\u008fhn\u008aw<³T7\u0089|zÆ[\u0014Â\u0082ô\u001ftÏ!\u009e\u001doL\u0007Ú\r\u0012\u0013`\u008cÿq\u008a;1]ë\u0007m°3\u008a\u000fl:Þ2¥]+)\bÌ\u0093\u009bNWpÇ{\u009cÇ\u0010E0\u0081\u0081\u0083\u001f\u0002ºã\\uÏïHÃ«\u0010¥\u0082\u0080\u0007[²Ú9¾\u0082\u0010FßZ\u00ad'¤\u0096T\u0010® gP\u001f\u0088\u00078ø©ç\u0003\u0092Âÿ$\u009d\u0080:êh£1xréí8¾\u0006¡w\u001dL_{RÊl[\u0087À¹ý6\u001cÜmá\b\u0097²c@\f\u0001A;(\u0012üb©ß ¦Ü¯\u0091ú\u0083õá\u0014¬í\rÑ\r~uL\u0017÷ÓF$\u0002½\u00855DãÀ¡O^(Øô\u0092AW_ÞÉD-\u0098ÞLô\u009b\u0007^\u00ad\u0015þ\u0013\u009c¡Å{c:P(\u0007wï4ô»ìÏlÊ~";
      int var17 = "'\u0088 ã?ûI½|Ê\u0092õóo\u001fp/y\u0081ñ(Nú4¤}\u00ad\u0003\u009c+Ö×\u0010¾\u0094\u0001-Ã»(ñ63\u0091Â\u0099ý\bd\u0010CûÕ·PÜ\u0095\b\u0080Nk\u008c\nG)2\u0010/?í¥]ú\u0093pÎ\u008fA2\u0017\u0013ä° \"Û\b\u0011(Yp\u0015R6Ésã<ô\u0018àMî~\u0091\u000eÜã®z?¬Å°\u0083/ 1\u009d~»eò¸ \u008bÝ«¯5£ûé%vsøÚÁ;U\u0092Çá\u0012æ¯\u0001\u0003\u0080§\u009eÂdkÛqvg½·>°ÈäRßÒ58«ÖsHâè\u001e¨Ç+ØÄ|V~#\u0081¹û)¦\u000fÅ5\u009e\t}\u009e~T«å£¾áBj\u0007{U\u0012X¾mf\u008fÞYëbsY\u0099²òýD\u0011ZçR\u0003öÿF4u:G´å!ªluu·\u0001\u001fü.\u0004Â8\fÄÂ¸\u001dx\u0083 #]M)äÒ\u009c4íG\u0011Pc&\u0098\u009f %º-\u001b\u0015\u0094¾\u00996)\u0016Wç\b¾\"ë\u000fÆîø\u000fåÒª\u0013éÎ×\r\u0081\u0098ŸOÎè)ZôMDú\u0098ÿ~A%\u008b\u0000Ê@\u0093\u0001m«\u009awª:\u0005\u0017T\u001c\u009a.!Ñvu\u0017¸\"RÛ\u00821\u0094¦\u0000·\u008b/Ç\u0004ú\u0087¥\u0092oR\u0016Û+tÇ`ß@(\u0095«Ö\u0006\u000bI»ï\u0017\u0087\u000f\fv®`\u0092s#\u0007±q»µ$N\u0085(ZÛVp\u0099ò=\u001f\u009cÁ\u001e§zêÞ\u000eªî\u008eh|ì&üë\u0088Ò±\u00143L1\u0012²\u0006¢?Fðlv\u009d\u008f)@¢¸õö\u0088\u007f¨µ%ø\u007fEO\u0014\u001e\u008c\u000fct8\u000e\u0013³P\u008d\u0002\u008cã\u001fÇ\u0095K°²Aå\u001d\t\u0003ãoüý\u001fÐ\u000eîäÍ^\u0013lXm\u008a\u0084i\u0084k\u0010s\\8±\u009b\u009e\u0082\u0010,Y\u009c;¦ÄGº+qI!uÍ¥ï²\u008fIÉN¡\u009b\u0010Oâ;\u0095\u008fÜä\\ò\u0091\b$þ\u001a%D\u0010¸°W\tkµ\u008aåWëÃÓV6\u0014E\u0096!ª¨\u0091\u00121êh7\u0098p¹¶È\u0091ÀÈ}#\u008fhn\u008aw<³T7\u0089|zÆ[\u0014Â\u0082ô\u001ftÏ!\u009e\u001doL\u0007Ú\r\u0012\u0013`\u008cÿq\u008a;1]ë\u0007m°3\u008a\u000fl:Þ2¥]+)\bÌ\u0093\u009bNWpÇ{\u009cÇ\u0010E0\u0081\u0081\u0083\u001f\u0002ºã\\uÏïHÃ«\u0010¥\u0082\u0080\u0007[²Ú9¾\u0082\u0010FßZ\u00ad'¤\u0096T\u0010® gP\u001f\u0088\u00078ø©ç\u0003\u0092Âÿ$\u009d\u0080:êh£1xréí8¾\u0006¡w\u001dL_{RÊl[\u0087À¹ý6\u001cÜmá\b\u0097²c@\f\u0001A;(\u0012üb©ß ¦Ü¯\u0091ú\u0083õá\u0014¬í\rÑ\r~uL\u0017÷ÓF$\u0002½\u00855DãÀ¡O^(Øô\u0092AW_ÞÉD-\u0098ÞLô\u009b\u0007^\u00ad\u0015þ\u0013\u009c¡Å{c:P(\u0007wï4ô»ìÏlÊ~".length();
      char var14 = ' ';
      int var13 = -1;

      label45:
      while(true) {
         ++var13;
         String var25 = var15.substring(var13, var13 + var14);
         byte var27 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var25.getBytes("ISO-8859-1"));
            String var31 = b(var19).intern();
            switch(var27) {
            case 0:
               var18[var16++] = var31;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[15];
                  l = new HashMap(13);
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
                  String var4 = "ìgH\u0091\u0086!³6À°¤¨HX:YZì «±\u008a\u0011L";
                  int var5 = "ìgH\u0091\u0086!³6À°¤¨HX:YZì «±\u008a\u0011L".length();
                  int var2 = 0;

                  do {
                     int var30 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var30, var2).getBytes("ISO-8859-1");
                     var30 = var3++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var33 = true;
                     var6[var30] = var10004;
                  } while(var2 < var5);

                  f = var6;
                  i = new Integer[3];
                  g = new oj((short)var22, (char)var23, var24);
                  P = new ConcurrentLinkedQueue();
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var31;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label45;
               }

               var15 = "¯KïÆ\u000b°s¹Ü\u0085fÕ\u001bF\u0003÷f ñ\u001dÓÊ½XùÙº8:\u0012ÒÊ=üø6µ\u0019öê(º¾$hDUO¢È'\u0019û\u001e6^ß\u0093d\u0019ÿLÒHüÐE>kEn£°\u0006]\u0097>µxW]";
               var17 = "¯KïÆ\u000b°s¹Ü\u0085fÕ\u001bF\u0003÷f ñ\u001dÓÊ½XùÙº8:\u0012ÒÊ=üø6µ\u0019öê(º¾$hDUO¢È'\u0019û\u001e6^ß\u0093d\u0019ÿLÒHüÐE>kEn£°\u0006]\u0097>µxW]".length();
               var14 = '(';
               var13 = -1;
            }

            ++var13;
            var25 = var15.substring(var13, var13 + var14);
            var27 = 0;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 30805;
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
            throw new RuntimeException("su/catlean/oj", var10);
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
         throw new RuntimeException("su/catlean/oj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14104;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/oj", var14);
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
         throw new RuntimeException("su/catlean/oj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
