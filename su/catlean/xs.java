package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class xs implements im {
   @NotNull
   public static final xs R;
   @NotNull
   private static Function0 j;
   @NotNull
   private static Function0 b;
   private static final long a = j0.a(5939305745790731830L, 5687027767391502555L, MethodHandles.lookup().lookupClass()).a(130471491106495L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   private xs() {
   }

   @NotNull
   public final Function0 y() {
      return j;
   }

   public final void p(long a, @NotNull Function0 <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.q<invokedynamic>(23473, 5555667307747317960L ^ var1));
      j = var3;
   }

   @NotNull
   public final Function0 d() {
      return b;
   }

   public final void d(long a, @NotNull Function0 <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.q<invokedynamic>(939, 1007921350088727894L ^ var1));
      b = var3;
   }

   public void b(long var1) {
   }

   public void r(long a, @NotNull qq rotation) {
      long var4 = var1 ^ 4266148517500L;
      Intrinsics.checkNotNullParameter(var3, true.q<invokedynamic>(11647, 6785023471127796433L ^ var1));
      b.invoke();
      b = xs::S;
      t7.t.S(1);
      i4.v.B(var4);
   }

   public void v(int var1, int var2, int var3) {
   }

   public final void q(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final int u(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final void N() {
      j.invoke();
      j = xs::B;
   }

   private static final Unit l() {
      return Unit.INSTANCE;
   }

   private static final Unit Z() {
      return Unit.INSTANCE;
   }

   private static final Unit S() {
      return Unit.INSTANCE;
   }

   private static final void C() {
      long var0 = a ^ 26645274617502L;
      long var2 = var0 ^ 77554265293936L;
      i4.v.B(var2);
   }

   private static final Unit S(int param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit B() {
      return Unit.INSTANCE;
   }

   static {
      long var11 = a ^ 75840067724468L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[18];
      int var18 = 0;
      String var17 = "9\u0015RZ}Û\u00107\u0005ã\u0001\u0081b\u0019q\u001e3\\øW`_}Ô OÐ\u009eLËéDÙ\u0013\u0095\"wûD_\u0004+w@Åg\u0000\u000b>_1¤)$\u009cç@\u0010x\u0016l44º\u009c\u008cÊ\u008boÙl\u0001I8\u0018üön\u0091A$T\u0014\u0082ØàQ7lëLðG-t£Ç×²\u0018Ú\r\u0098ñjJ«¾\u0086Ü$\u0091Q²\\\u0088J\f4\b²¤B\u0015(ÆÒÙÏ\u0002\u009d]Kêáò9ÿm²Ì\u0095\u001ejy¹t\u008bdiâ\u0098\u00920\u0002*\u0096\u0088=\u0005\u000b]\u0019¶_\u0018\u0093\u009de²\u0016À-\u0098Ö®ÿÑ\nû\u0006\u007feWÈ9\u0092ö¬\u0018 {w\u0097/\u00adª¹\u000e\"#¥.Ø,ueFp0 ¬2Ì¹þ\u009dD\nóàÆe\u0010Êîâ\u001b\u0080î(%ªDFFV§]¦(d\u0098>\u0089R\u0011q\u0015\u0083]¥\u0083\u0093\u0096U¥\u0082óy ZSú22\u0019Q6\t\u0004ë\u009a\u0003 \u0084\u001fUD\u0004¦\u0018î'\u0015 gt\u0013\u001dÒ$\u001a#--\u007feç M¤5ä\u0011x\u0098MIá=\u0017¥©l^\u009c¦\u000b¨¦÷\u0014fÁ«\u0013.\f´Äc\u009f\n½(H%\u0003Fþ?Å\u0096vW\u0093\u0089ö')\u0003ï·Ø\fÃþøÚ¬\\Í#5nñÇwD\u0017JªzúGâàÀ^Èìé\u0014;ÃIý·_oûØH¸¨îù\u0087\u0099MÎÛ¤cÙy\r*§çY\u00ad\u0095\u0003F8ÄFBÍ\u0093èM\u0098\u0098ã\u0016üó¨\u008eþ\u008eØ|\u0091Éj}\u0089S\t\u001f\u0086\u00866p6\u001dD_ú{6#ÜÄÿ8\u0081Á\tz>\t\u001a²¾9Ó\u0093;¿¯\u009c)ñ\u008bÐ¹1ó¶\u000f\u0097»p\u008eª«Ûõ\u0004ÃP|\u0001D;¡cs\u001fwË\r«È ¾/&©2û\u0098\u0091¼ö]/\u0094\u0093\u0093ùÄmøÔ»µ\u0018nÉs¶F³Xaæ\u0081\u000f4\u0007Û\u001a«\u008d4Tä§\u009fè\u0017\u008e\u009ew\u008f~±\u000b\u0012òãE\u0087\u0082fqx\u001ba\u008aà\u001b\u0018[\u001ee^tlÅÀ \u00ad^Â\u0081?\u0014ïy×uùÇLXöùc\u009aÐ¾\u0087GíÙ¡ÞCÔ,\u0011ì\u0007:îæä¬]#vt(j´Ã þ$çQ+\u0088\u000fzo°g¬¿¦q\u007f\u0014qæ\u0095Ð\u0010JA°;¥\u0088ç\u008bâÈ\u008a\u0005\u0081 *S\u0082\u0089aõ9\u000b\u008aÓ\u0085\u0088UéeÇ*c\rõ¾º\u0012\u0091µæ¨ÖÏ¸fÉ80Cµú\u0083û\u0001\u000f°\fVh±c<1\f\u0084õ\u0018\u000bM1ÿìú'Ó\u0002Ha\u0086/\u008a\u0093\u001eµ³R\u0001ï%ÜGTÅ\u001c²Ô\"?÷²\u00129&";
      int var19 = "9\u0015RZ}Û\u00107\u0005ã\u0001\u0081b\u0019q\u001e3\\øW`_}Ô OÐ\u009eLËéDÙ\u0013\u0095\"wûD_\u0004+w@Åg\u0000\u000b>_1¤)$\u009cç@\u0010x\u0016l44º\u009c\u008cÊ\u008boÙl\u0001I8\u0018üön\u0091A$T\u0014\u0082ØàQ7lëLðG-t£Ç×²\u0018Ú\r\u0098ñjJ«¾\u0086Ü$\u0091Q²\\\u0088J\f4\b²¤B\u0015(ÆÒÙÏ\u0002\u009d]Kêáò9ÿm²Ì\u0095\u001ejy¹t\u008bdiâ\u0098\u00920\u0002*\u0096\u0088=\u0005\u000b]\u0019¶_\u0018\u0093\u009de²\u0016À-\u0098Ö®ÿÑ\nû\u0006\u007feWÈ9\u0092ö¬\u0018 {w\u0097/\u00adª¹\u000e\"#¥.Ø,ueFp0 ¬2Ì¹þ\u009dD\nóàÆe\u0010Êîâ\u001b\u0080î(%ªDFFV§]¦(d\u0098>\u0089R\u0011q\u0015\u0083]¥\u0083\u0093\u0096U¥\u0082óy ZSú22\u0019Q6\t\u0004ë\u009a\u0003 \u0084\u001fUD\u0004¦\u0018î'\u0015 gt\u0013\u001dÒ$\u001a#--\u007feç M¤5ä\u0011x\u0098MIá=\u0017¥©l^\u009c¦\u000b¨¦÷\u0014fÁ«\u0013.\f´Äc\u009f\n½(H%\u0003Fþ?Å\u0096vW\u0093\u0089ö')\u0003ï·Ø\fÃþøÚ¬\\Í#5nñÇwD\u0017JªzúGâàÀ^Èìé\u0014;ÃIý·_oûØH¸¨îù\u0087\u0099MÎÛ¤cÙy\r*§çY\u00ad\u0095\u0003F8ÄFBÍ\u0093èM\u0098\u0098ã\u0016üó¨\u008eþ\u008eØ|\u0091Éj}\u0089S\t\u001f\u0086\u00866p6\u001dD_ú{6#ÜÄÿ8\u0081Á\tz>\t\u001a²¾9Ó\u0093;¿¯\u009c)ñ\u008bÐ¹1ó¶\u000f\u0097»p\u008eª«Ûõ\u0004ÃP|\u0001D;¡cs\u001fwË\r«È ¾/&©2û\u0098\u0091¼ö]/\u0094\u0093\u0093ùÄmøÔ»µ\u0018nÉs¶F³Xaæ\u0081\u000f4\u0007Û\u001a«\u008d4Tä§\u009fè\u0017\u008e\u009ew\u008f~±\u000b\u0012òãE\u0087\u0082fqx\u001ba\u008aà\u001b\u0018[\u001ee^tlÅÀ \u00ad^Â\u0081?\u0014ïy×uùÇLXöùc\u009aÐ¾\u0087GíÙ¡ÞCÔ,\u0011ì\u0007:îæä¬]#vt(j´Ã þ$çQ+\u0088\u000fzo°g¬¿¦q\u007f\u0014qæ\u0095Ð\u0010JA°;¥\u0088ç\u008bâÈ\u008a\u0005\u0081 *S\u0082\u0089aõ9\u000b\u008aÓ\u0085\u0088UéeÇ*c\rõ¾º\u0012\u0091µæ¨ÖÏ¸fÉ80Cµú\u0083û\u0001\u000f°\fVh±c<1\f\u0084õ\u0018\u000bM1ÿìú'Ó\u0002Ha\u0086/\u008a\u0093\u001eµ³R\u0001ï%ÜGTÅ\u001c²Ô\"?÷²\u00129&".length();
      char var16 = 24;
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
                  c = var20;
                  d = new String[18];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[10];
                  int var3 = 0;
                  String var4 = "tdÉº\u0085\u0011È\u0099Y\fiV÷\\£\u0005 p`y\u0085-]Q\u0096frÉ»Äú\u0083ª\\íLýÅöñ¾Î=rõ\u0010dïöü\u0084¹\"]¹\u0003:+dÍx \u0088¨";
                  int var5 = "tdÉº\u0085\u0011È\u0099Y\fiV÷\\£\u0005 p`y\u0085-]Q\u0096frÉ»Äú\u0083ª\\íLýÅöñ¾Î=rõ\u0010dïöü\u0084¹\"]¹\u0003:+dÍx \u0088¨".length();
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
                              f = var6;
                              g = new Integer[10];
                              R = new xs();
                              j = xs::l;
                              b = xs::Z;
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "¨ã\u000e¿á\u000e\u0018?ót\"¡TôÍf";
                           var5 = "¨ã\u000e¿á\u000e\u0018?ót\"¡TôÍf".length();
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

               var17 = "\u0080e\u008a\u001dè$ñcýñwÏ\u008f\u0017\u009cµÂãn)%=!º(i\u0007Ò\u001dBÙ\u0099\u009eÞËÛÄL°Üý@®\u0018ÏÅÉRI\n\u009f\tÀwÈþ\u0096P$ïìHRÇb";
               var19 = "\u0080e\u008a\u001dè$ñcýñwÏ\u008f\u0017\u009cµÂãn)%=!º(i\u0007Ò\u001dBÙ\u0099\u009eÞËÛÄL°Üý@®\u0018ÏÅÉRI\n\u009f\tÀwÈþ\u0096P$ïìHRÇb".length();
               var16 = 24;
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1186;
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
            throw new RuntimeException("su/catlean/xs", var10);
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
         throw new RuntimeException("su/catlean/xs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 18422;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/xs", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/xs" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
