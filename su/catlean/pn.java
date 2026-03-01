package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1268;
import net.minecraft.class_1792;
import net.minecraft.class_310;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.MinecraftAccessor;

public final class pn implements zh {
   @NotNull
   public static final pn n;
   @Nullable
   private static Function0 J;
   private static int y;
   private static boolean j;
   @NotNull
   private static final Map D;
   private static final long a = j0.a(3264185589446099372L, 2921552892236279992L, MethodHandles.lookup().lookupClass()).a(140874910149289L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private pn() {
   }

   @NotNull
   public final List i(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 130555485550871L;
      return c0.S.i().V(var3);
   }

   public final boolean Z(char a, int a, char a, @NotNull s6 macro) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 16369287750460L;
      Intrinsics.checkNotNullParameter(var4, true.u<invokedynamic>(23611, 221462585359512512L ^ var5));
      return this.i(var7).add(var4);
   }

   public final boolean e(long a, @NotNull s6 macro) {
      var1 ^= a;
      long var4 = var1 ^ 114857468508887L;
      Intrinsics.checkNotNullParameter(var3, true.u<invokedynamic>(31636, 1274256487293242763L ^ var1));
      return this.i(var4).remove(var3);
   }

   @Flow
   private final void m(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void P(InputEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void p(s6 param1, long param2, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   private final void G(long param1, md param3) {
      // $FF: Couldn't be decompiled
   }

   private final void m(int param1, so param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private final void f(mt param1, long param2, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final class_1792 l(long a, @NotNull String id) {
      // $FF: Couldn't be decompiled
   }

   private static final void r(s6 var0) {
      long var1 = a ^ 17853566936740L;
      long var10001 = var1 ^ 88638656938539L;
      int var3 = (int)((var1 ^ 88638656938539L) >>> 32);
      int var4 = (int)(var10001 << 32 >>> 32);
      n.m(var3, (so)var0, var4);
   }

   private static final void K() {
      long var0 = a ^ 95086120197619L;
      long var2 = var0 ^ 81214504853584L;
      long var10001 = var0 ^ 117990054629507L;
      int var4 = (int)((var0 ^ 117990054629507L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      class_310 var10000 = s8.H((short)var4, (short)var5, var6);
      Intrinsics.checkNotNull(var10000, true.u<invokedynamic>(25584, 7579173391996575395L ^ var0));
      ((MinecraftAccessor)var10000).idoItemUse();
      s8.f(var2).method_6104(class_1268.field_5808);
   }

   private static final Unit t(so param0, s1 param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 119612428271785L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[15];
      int var18 = 0;
      String var17 = "â£o¾\u0001u\u0019yÙDiú\u0085ò¹\u0000\u0003&>¶/Î\u0092»Å\u00114¾\u0011Ìb2óÍNÝ\u0092Ä^=\u0010\u0089÷]6z\u0087#Ý\u008dù\u001f\u0001%rÈ\u0094 x³¾üò(ò\u0098\u007fàëÍÕ\u0098Mhg\u001eô5è\u00803M´±#Æü½8\u0010(ÂÎ \u00048\u0094Cä\u0017wzrh/³ÅY4aÉ¸¤Ç¼åÐ\u009b\r\u0011\u009f½(f0|Â\u001bìË\u009d\u0080ùýÈÕá\u00012`_°±\u001dU8\u0081÷\u0098>ý½SþZ\u0080\u009c»¬¹\u008c7ôLÕfú(LâlGC\u0003ÅÕ.%¡w\u009c»Æz`Eâ\u0086Ê R\u0096\u0003\u007f\u008bÿå\u0086\u0013[z\f\u008fâEå\\SGï%î¥êÏ\u0098¿\u0019F\u0015§îö\u0006¸$R\u009a\u0015\u001d¥\rZÈ¬'Ov\u00ad(cßFÿ%lyrì\r\u0089\u0012è.[\u0004\u0098Mj¿\u0010$®k(µ<km\u0000î9us\u0006RÕ\u0010èåæÎç§´G¼\u001fè7\u0087µ(-\u0010\u008d&àÚ<\u00858ò\u0012r0ÂqÂ·9(b\u009fI°R\u0019·\u00820\u001a¯À\"\u0011\u008f\rÚÊ\fA\u0004G}\u00170ZéÌµÃ#ðJb\u008a\u0006N¹ûN\u0010®\u0011\u0011\u001fg#C¹\u0083k\u009dÂ\u0003|¶< ìà*Pä:Ejo\u009e>\u001b>ïº{m\u0011þ\u0096\\L¡rÔ±\u008dBÜ%\u0089÷ ýõaÙ¡Lº*\u0019øÄûÔh\u009fîqËØl\u0093\u0019÷ZíôYf/Q;ý\u0088\u0089fÈÒ'ìAÑ\u0094/\u008fc£á:DJ¼·ç\u000e@Ñ\u008bÚ`ñ\bÛ-?\u001cvs\u0083m¢âÌe3 j,Ý\u009d\u0093\"\u001eµgj\u009c\u0004j\u0010®\u0019%Åâ\u0091\u0085>O\u001eÏø@\u0017Ï\\3\u0099\u0080¿TÊ%þ\u001enaÀ®\u0082ñ\u0097\"2(2X×_ÁÈ\u0005çÊÕSÜ\u0013\u0019æÁ\u0012½\u001baÉ@\\©m\u0092òÆ¢\u0092{\u001bïù'§é¾\u0003\u0095\tjL¢\u0094";
      int var19 = "â£o¾\u0001u\u0019yÙDiú\u0085ò¹\u0000\u0003&>¶/Î\u0092»Å\u00114¾\u0011Ìb2óÍNÝ\u0092Ä^=\u0010\u0089÷]6z\u0087#Ý\u008dù\u001f\u0001%rÈ\u0094 x³¾üò(ò\u0098\u007fàëÍÕ\u0098Mhg\u001eô5è\u00803M´±#Æü½8\u0010(ÂÎ \u00048\u0094Cä\u0017wzrh/³ÅY4aÉ¸¤Ç¼åÐ\u009b\r\u0011\u009f½(f0|Â\u001bìË\u009d\u0080ùýÈÕá\u00012`_°±\u001dU8\u0081÷\u0098>ý½SþZ\u0080\u009c»¬¹\u008c7ôLÕfú(LâlGC\u0003ÅÕ.%¡w\u009c»Æz`Eâ\u0086Ê R\u0096\u0003\u007f\u008bÿå\u0086\u0013[z\f\u008fâEå\\SGï%î¥êÏ\u0098¿\u0019F\u0015§îö\u0006¸$R\u009a\u0015\u001d¥\rZÈ¬'Ov\u00ad(cßFÿ%lyrì\r\u0089\u0012è.[\u0004\u0098Mj¿\u0010$®k(µ<km\u0000î9us\u0006RÕ\u0010èåæÎç§´G¼\u001fè7\u0087µ(-\u0010\u008d&àÚ<\u00858ò\u0012r0ÂqÂ·9(b\u009fI°R\u0019·\u00820\u001a¯À\"\u0011\u008f\rÚÊ\fA\u0004G}\u00170ZéÌµÃ#ðJb\u008a\u0006N¹ûN\u0010®\u0011\u0011\u001fg#C¹\u0083k\u009dÂ\u0003|¶< ìà*Pä:Ejo\u009e>\u001b>ïº{m\u0011þ\u0096\\L¡rÔ±\u008dBÜ%\u0089÷ ýõaÙ¡Lº*\u0019øÄûÔh\u009fîqËØl\u0093\u0019÷ZíôYf/Q;ý\u0088\u0089fÈÒ'ìAÑ\u0094/\u008fc£á:DJ¼·ç\u000e@Ñ\u008bÚ`ñ\bÛ-?\u001cvs\u0083m¢âÌe3 j,Ý\u009d\u0093\"\u001eµgj\u009c\u0004j\u0010®\u0019%Åâ\u0091\u0085>O\u001eÏø@\u0017Ï\\3\u0099\u0080¿TÊ%þ\u001enaÀ®\u0082ñ\u0097\"2(2X×_ÁÈ\u0005çÊÕSÜ\u0013\u0019æÁ\u0012½\u001baÉ@\\©m\u0092òÆ¢\u0092{\u001bïù'§é¾\u0003\u0095\tjL¢\u0094".length();
      char var16 = '(';
      int var15 = -1;

      label54:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var28;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  c = new String[15];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[7];
                  int var3 = 0;
                  String var4 = "fY\u0014Ûá%Ååú\\63\u001d8À[ûô\u001bJY\u00aduU°=±ÔL\u008d\u00922£wµR\u00adÑÆç";
                  int var5 = "fY\u0014Ûá%Ååú\\63\u001d8À[ûô\u001bJY\u00aduU°=±ÔL\u008d\u00922£wµR\u00adÑÆç".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var26 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     long[] var25 = var6;
                     var26 = var3++;
                     long var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var31 = -1;

                     while(true) {
                        long var8 = var30;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var33 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var31) {
                        case 0:
                           var25[var26] = var33;
                           if (var2 >= var5) {
                              e = var6;
                              f = new Integer[7];
                              n = new pn();
                              D = (Map)(new LinkedHashMap());
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "U\u001fx°¿\u0007ÄÉïëUà|¾·\u0017";
                           var5 = "U\u001fx°¿\u0007ÄÉïëUà|¾·\u0017".length();
                           var2 = 0;
                        }

                        var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        var25 = var6;
                        var26 = var3++;
                        var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var31 = 0;
                     }
                  }
               }

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var28;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label54;
               }

               var17 = "\u00104©t\u001e\u0002|¨£Ì=¶\tx³\u0014%\u001b\u0098ÙáQw\u0004\u0080gì!Ï\fÏ¾\u0097!ÝC\u0084-êÌ\u0083ÞÅ®²f5d\u008c\u0010³\u0084\u0017á\nÜFH\u008a¯½ãûzÿå)HÅÉ/ë¦å\u0097X²\u0003NüË@\u0086z\u0019ü÷n:;\u009cáu\u0098¼÷/E©¦A\u000b¦éQT\u0002Û¢\f\u0007u¡ß\u0018&gæ#0î\u009eÎX\u0019kò&\u0014\u0004Ï)ÆaÎ\u0094{QÖ(Ä!å[ô\u0099=\u0090\u000b\u001eçEþ";
               var19 = "\u00104©t\u001e\u0002|¨£Ì=¶\tx³\u0014%\u001b\u0098ÙáQw\u0004\u0080gì!Ï\fÏ¾\u0097!ÝC\u0084-êÌ\u0083ÞÅ®²f5d\u008c\u0010³\u0084\u0017á\nÜFH\u008a¯½ãûzÿå)HÅÉ/ë¦å\u0097X²\u0003NüË@\u0086z\u0019ü÷n:;\u009cáu\u0098¼÷/E©¦A\u000b¦éQT\u0002Û¢\f\u0007u¡ß\u0018&gæ#0î\u009eÎX\u0019kò&\u0014\u0004Ï)ÆaÎ\u0094{QÖ(Ä!å[ô\u0099=\u0090\u000b\u001eçEþ".length();
               var16 = 24;
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
            var10001 = 0;
         }
      }
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24325;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/pn", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("su/catlean/pn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27308;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/pn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("su/catlean/pn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
