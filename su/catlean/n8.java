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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class n8 extends nm {
   @NotNull
   public static final n8 t;
   @NotNull
   private static final List Z;
   @Nullable
   private static class_1309 n;
   @NotNull
   private static final aa u;
   @NotNull
   private static final aa R;
   private static int d;
   private static final long c = j0.a(4804202135847416424L, 6994608326968796258L, MethodHandles.lookup().lookupClass()).a(43658201931961L);
   private static final String[] e;
   private static final String[] i;
   private static final Map j;
   private static final long[] m;
   private static final Integer[] p;
   private static final Map x;

   private n8(long var1, char var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ c;
      long var6 = var4 ^ 41458642218524L;
      super(true.j<invokedynamic>(7522, 1018070556559344044L ^ var4), var6);
   }

   @Nullable
   public final class_1309 p() {
      return n;
   }

   public final void J(@Nullable class_1309 <set-?>) {
      n = var1;
   }

   @NotNull
   public final aa I() {
      return u;
   }

   public void Y(long param1, char param3) {
      // $FF: Couldn't be decompiled
   }

   public void k(@NotNull class_332 context, long a) {
      long var10001 = var2 ^ 16529812636317L;
      int var4 = (int)((var2 ^ 16529812636317L) >>> 56);
      long var5 = var10001 << 8 >>> 8;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(1992, 9101389327190748816L ^ var2));
      this.l((byte)var4, var5, var1, false);
   }

   public void O(@NotNull class_332 context, long a) {
      long var10001 = var2 ^ 131972572024064L;
      int var4 = (int)((var2 ^ 131972572024064L) >>> 56);
      long var5 = var10001 << 8 >>> 8;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(4986, 5013060740049810875L ^ var2));
      this.l((byte)var4, var5, var1, true);
   }

   private final void l(byte param1, long param2, class_332 param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   private final void i(class_332 param1, long param2, class_1657 param4) {
      // $FF: Couldn't be decompiled
   }

   private final void S(class_332 param1, int param2, short param3, char param4, class_1309 param5) {
      // $FF: Couldn't be decompiled
   }

   private final void F(int param1, int param2, class_332 param3, char param4) {
      // $FF: Couldn't be decompiled
   }

   private final void a(long param1, class_332 param3, class_1309 param4) {
      // $FF: Couldn't be decompiled
   }

   private final void z(long param1, class_332 param3, List param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean q(_d param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean Z(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var31 = c ^ 113247798346945L;
      long var10001 = var31 ^ 71145291142897L;
      long var33 = (var31 ^ 71145291142897L) >>> 16;
      int var35 = (int)(var10001 << 48 >>> 48);
      var10001 = var31 ^ 100194736765080L;
      int var36 = (int)((var31 ^ 100194736765080L) >>> 48);
      int var37 = (int)(var10001 << 16 >>> 48);
      int var38 = (int)(var10001 << 32 >>> 32);
      j = new HashMap(13);
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var23 = 1; var23 < 8; ++var23) {
         var10003[var23] = (byte)((int)(var31 << var23 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[23];
      int var27 = 0;
      String var26 = "»\u0019¦\u009c\u001b\fÍ¸Ø*Æ\u0001TqÇ\u001f8ó\ràS\u009c)\u0013Uî;®\u0019ó¼äÓ3\bL¦@}·#s^®Ð\"W\u0097\u008eÏ>\u008c¶ÂB\u0006®\u001f\u007fÃÊ4øüªCG½ê¶ËÈ\u0090\u0018(\u0087VJº¥N\u009d\u007fü!¸×Aê\u0013h\u0082\në\u009bíY\u008ex\u0011¼\u0016Ç\"\u0083ð|SºHh.f\u0093\u0080kZf\u0095Õ¨²gÕ(8\u0015\u001f\u0001¯üùÉgK@\u0003\u0084ª\t\u0000\u0085rÈ\u0013dmûÝáY.^\u0001\u0088l¶önU_\u0011AY¨\u001aM+ÆÊ> Ù¦ç9\"'XM £\u0005Â\u0001\u0014òå§Óô\u008e üyq\u0015=«Mµ\u0085äßf(A\u0017DÔ\u0015\\\u0007$\u0017Ùw¤0\u0010(¯C£Ìf\u00ad$Ø\u00054{lãeñ\u00180úÑI§·]@Gò7\u001f\u0080Ä\tË[¬¤Ü»ý\u0010 8\u0018\u009b\u0081}õ\u0086û\u0092\u009aq7_(Ca\u0090kêz¥&SÖ÷Ð~3£Þ\\s.×ýô¡\u0010d \u008cÉ[;oë6Á\u008bÁ·ÔáÔÎ\u008f\u0014 \u0010¤ a\u008ck¿g\u0098\u009aÝ}ó\u0090x\u001dëX\u0094g\u008ey\u009cT\u0093\u0097Î/jvëì\u0010W¨ì\nxÁ°Æ\u0004õ\u001e!\u0086ê\u0002Ù ¥\u0093Ä@hB\u0098Í}Ë9°¯\u00964zRka\u009b9º\u0012\u001c\u001c²1?,'qö(M×_\u0084Y\u009ca\u001d;Kô3\"\u0016\u0016\u0099æèV\u0011é¡\u009b\u0082.\u00adé\u0092Ù\u0090uD\u0097<+úûk\u0086U \u0010©\u009b\u0080\u0003éFWÔ\u001dRUºn\u0015×Å\u00adkÕD³ïGWO\u0098&\u009d33\u0099\u00103\u001dPîài7¬\u0000\u0099¤(\u0096A!¤(o\u0088f  Éd\u0083¥\u0016;ä\u000fªb\u008d\u009c¥Ùö\u0094T¿¸>¥\u0087SÒúª\tÍ\u0085°\b[j{)\u0010¢\u0013RÖ:~\u0097\u0017ÎaZA>\u00adÿÂ\u0010\u0091WSF¼Þ'õíñ \u001c¨\u001a-\u0015 lþÂ\\X\u0013\u001bý)C\u0091È\u007f'\u008aÞÀÀ@\u0014\u000f5\u0012ü\u0094ô\u0007,ÕòDG\u0010W\u000eëoë\u008b(áý\rMU»®ÁÅ\u0010X\u0093#Q¾wwI`D$ÝÏ·ï\u009e0*\u008eÚ\f\u0012ðìÎ\b\u0095J\u0017QF;\u0001ÅG¥v}G\u0006M°ù»Fýy[+ÂÕqä\u008f@©¤c\u0080Õ\u0001*\u0018\u0089Y\u0088\b\u0083.D`ÿRª\u0093\u0000\u000e\u009d¯ò\u000f`¬\u008e\u00118ÒEÜ\u009c\u0099¾o3\"\u009c§ÔÜÈ\u0089Qsk\u0013{\b:®!¨ñ\tyòaÔ\u0017æ\u0095ß^Em±\u0091Ù\u000e¹¢\u008cé}Ú@JD\u009c{TûyWó\u0005Rà¶[ª\u0003\u0097VÔ\r_\nSO\u0088\u0018ZÆçÕt»9Ï\u000e¯^&Ó\u009dHÖ\b\u0083Ý_\u0014:rVÅ¥´\\·6\u009aÌ\u009fË\u0091¬&\u0017rôa";
      int var28 = "»\u0019¦\u009c\u001b\fÍ¸Ø*Æ\u0001TqÇ\u001f8ó\ràS\u009c)\u0013Uî;®\u0019ó¼äÓ3\bL¦@}·#s^®Ð\"W\u0097\u008eÏ>\u008c¶ÂB\u0006®\u001f\u007fÃÊ4øüªCG½ê¶ËÈ\u0090\u0018(\u0087VJº¥N\u009d\u007fü!¸×Aê\u0013h\u0082\në\u009bíY\u008ex\u0011¼\u0016Ç\"\u0083ð|SºHh.f\u0093\u0080kZf\u0095Õ¨²gÕ(8\u0015\u001f\u0001¯üùÉgK@\u0003\u0084ª\t\u0000\u0085rÈ\u0013dmûÝáY.^\u0001\u0088l¶önU_\u0011AY¨\u001aM+ÆÊ> Ù¦ç9\"'XM £\u0005Â\u0001\u0014òå§Óô\u008e üyq\u0015=«Mµ\u0085äßf(A\u0017DÔ\u0015\\\u0007$\u0017Ùw¤0\u0010(¯C£Ìf\u00ad$Ø\u00054{lãeñ\u00180úÑI§·]@Gò7\u001f\u0080Ä\tË[¬¤Ü»ý\u0010 8\u0018\u009b\u0081}õ\u0086û\u0092\u009aq7_(Ca\u0090kêz¥&SÖ÷Ð~3£Þ\\s.×ýô¡\u0010d \u008cÉ[;oë6Á\u008bÁ·ÔáÔÎ\u008f\u0014 \u0010¤ a\u008ck¿g\u0098\u009aÝ}ó\u0090x\u001dëX\u0094g\u008ey\u009cT\u0093\u0097Î/jvëì\u0010W¨ì\nxÁ°Æ\u0004õ\u001e!\u0086ê\u0002Ù ¥\u0093Ä@hB\u0098Í}Ë9°¯\u00964zRka\u009b9º\u0012\u001c\u001c²1?,'qö(M×_\u0084Y\u009ca\u001d;Kô3\"\u0016\u0016\u0099æèV\u0011é¡\u009b\u0082.\u00adé\u0092Ù\u0090uD\u0097<+úûk\u0086U \u0010©\u009b\u0080\u0003éFWÔ\u001dRUºn\u0015×Å\u00adkÕD³ïGWO\u0098&\u009d33\u0099\u00103\u001dPîài7¬\u0000\u0099¤(\u0096A!¤(o\u0088f  Éd\u0083¥\u0016;ä\u000fªb\u008d\u009c¥Ùö\u0094T¿¸>¥\u0087SÒúª\tÍ\u0085°\b[j{)\u0010¢\u0013RÖ:~\u0097\u0017ÎaZA>\u00adÿÂ\u0010\u0091WSF¼Þ'õíñ \u001c¨\u001a-\u0015 lþÂ\\X\u0013\u001bý)C\u0091È\u007f'\u008aÞÀÀ@\u0014\u000f5\u0012ü\u0094ô\u0007,ÕòDG\u0010W\u000eëoë\u008b(áý\rMU»®ÁÅ\u0010X\u0093#Q¾wwI`D$ÝÏ·ï\u009e0*\u008eÚ\f\u0012ðìÎ\b\u0095J\u0017QF;\u0001ÅG¥v}G\u0006M°ù»Fýy[+ÂÕqä\u008f@©¤c\u0080Õ\u0001*\u0018\u0089Y\u0088\b\u0083.D`ÿRª\u0093\u0000\u000e\u009d¯ò\u000f`¬\u008e\u00118ÒEÜ\u009c\u0099¾o3\"\u009c§ÔÜÈ\u0089Qsk\u0013{\b:®!¨ñ\tyòaÔ\u0017æ\u0095ß^Em±\u0091Ù\u000e¹¢\u008cé}Ú@JD\u009c{TûyWó\u0005Rà¶[ª\u0003\u0097VÔ\r_\nSO\u0088\u0018ZÆçÕt»9Ï\u000e¯^&Ó\u009dHÖ\b\u0083Ý_\u0014:rVÅ¥´\\·6\u009aÌ\u009fË\u0091¬&\u0017rôa".length();
      char var25 = 16;
      int var24 = -1;

      label74:
      while(true) {
         ++var24;
         String var39 = var26.substring(var24, var24 + var25);
         byte var42 = -1;

         while(true) {
            byte[] var30 = var22.doFinal(var39.getBytes("ISO-8859-1"));
            String var45 = b(var30).intern();
            switch(var42) {
            case 0:
               var29[var27++] = var45;
               if ((var24 += var25) >= var28) {
                  e = var29;
                  i = new String[23];
                  x = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var12 = 1; var12 < 8; ++var12) {
                     var10003[var12] = (byte)((int)(var31 << var12 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[35];
                  int var14 = 0;
                  String var15 = " ÈÀïz}c\u001cvOhï±;³\n6Ö(\\\u0001¤\u0098Õ¯\u0013É\u00949é4\u001dÐÉ;\u000bW·\u008eõ°*õ8»\t\u00adÌ\u0000Q³¡\u008c¼h\u0016\u000b\u0080\u0003Á\"e\u0097\u0002\u0085\u0018Ø`\u008c\u0084¢ëÛ{jK5\u001d\u0084Ûð$µ\u0002jÅM¢ø\u000fk\u0089/î\u0004G¸\u0098\u0017o\u0012èè\u0001yÁÝ\u0090\u008eé,{³.\u008eL$\rÁ_öùêe¤@_FØøM·\u00171.[óõüR\u007fPÃÃ{P\u0097Å¯Ï\u0016\u000b;¡l-oñ\u009cDDK\u0081\u0017¥&®(7âºí*!mTØÂ;\u008dS\u001cÛ¡ìâü\u0085«\u008dÊÉÙsÌ\u0003yÅ¢\u0095éX6Q\u0004Ê§¥\u0084¿(\u0010õ\u009c\u0010\u001afw¥\u0081Ù\u001a\u008e\u001cO®®Îv½\\ùÕ\u0091F\u0014\u0083\u009c\täØ\u008bÒ©@\u009cPp^ôx\u001eøð^|V¥¢É¬}7\u0005";
                  int var16 = " ÈÀïz}c\u001cvOhï±;³\n6Ö(\\\u0001¤\u0098Õ¯\u0013É\u00949é4\u001dÐÉ;\u000bW·\u008eõ°*õ8»\t\u00adÌ\u0000Q³¡\u008c¼h\u0016\u000b\u0080\u0003Á\"e\u0097\u0002\u0085\u0018Ø`\u008c\u0084¢ëÛ{jK5\u001d\u0084Ûð$µ\u0002jÅM¢ø\u000fk\u0089/î\u0004G¸\u0098\u0017o\u0012èè\u0001yÁÝ\u0090\u008eé,{³.\u008eL$\rÁ_öùêe¤@_FØøM·\u00171.[óõüR\u007fPÃÃ{P\u0097Å¯Ï\u0016\u000b;¡l-oñ\u009cDDK\u0081\u0017¥&®(7âºí*!mTØÂ;\u008dS\u001cÛ¡ìâü\u0085«\u008dÊÉÙsÌ\u0003yÅ¢\u0095éX6Q\u0004Ê§¥\u0084¿(\u0010õ\u009c\u0010\u001afw¥\u0081Ù\u001a\u008e\u001cO®®Îv½\\ùÕ\u0091F\u0014\u0083\u009c\täØ\u008bÒ©@\u009cPp^ôx\u001eøð^|V¥¢É¬}7\u0005".length();
                  int var13 = 0;

                  label56:
                  while(true) {
                     int var46 = var13;
                     var13 += 8;
                     byte[] var18 = var15.substring(var46, var13).getBytes("ISO-8859-1");
                     long[] var41 = var17;
                     var46 = var14++;
                     long var48 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                     byte var49 = -1;

                     while(true) {
                        long var19 = var48;
                        byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                        long var51 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                        switch(var49) {
                        case 0:
                           var41[var46] = var51;
                           if (var13 >= var16) {
                              m = var17;
                              p = new Integer[35];
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
                              String var5 = "F\u009b©\u001d®<\u008céF\u009b©\u001d®<\u008cé";
                              int var6 = "F\u009b©\u001d®<\u008céF\u009b©\u001d®<\u008cé".length();
                              int var3 = 0;

                              do {
                                 var46 = var3;
                                 var3 += 8;
                                 byte[] var7 = var5.substring(var46, var3).getBytes("ISO-8859-1");
                                 var46 = var4++;
                                 long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                 byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                 var51 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                 boolean var52 = true;
                                 var0[var46] = var51;
                              } while(var3 < var6);

                              t = new n8(var33, (char)var35);
                              Z = (List)(new ArrayList());
                              u = new aa(sa.OUT_BACK, var0[1], (short)var36, (short)var37, var38);
                              R = new aa(sa.OUT_QUINT, var0[0], (short)var36, (short)var37, var38);
                              return;
                           }
                           break;
                        default:
                           var41[var46] = var51;
                           if (var13 < var16) {
                              continue label56;
                           }

                           var15 = "lSgò\u008fò«\u0096µFçáÜç¨\u001f";
                           var16 = "lSgò\u008fò«\u0096µFçáÜç¨\u001f".length();
                           var13 = 0;
                        }

                        var46 = var13;
                        var13 += 8;
                        var18 = var15.substring(var46, var13).getBytes("ISO-8859-1");
                        var41 = var17;
                        var46 = var14++;
                        var48 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        var49 = 0;
                     }
                  }
               }

               var25 = var26.charAt(var24);
               break;
            default:
               var29[var27++] = var45;
               if ((var24 += var25) < var28) {
                  var25 = var26.charAt(var24);
                  continue label74;
               }

               var26 = "\u0017Ð\u0087@Hüéÿ\u0081÷Wgò»n§#gE2î\u009aÒ\u009a§\b\u009dÉØ\u000bÐ¹z\u008a@ã¿â´sp¦üçu[¯¼\u0010\u0015ìmI!2\u0099-¹Âæ\u0081p\"GT";
               var28 = "\u0017Ð\u0087@Hüéÿ\u0081÷Wgò»n§#gE2î\u009aÒ\u009a§\b\u009dÉØ\u000bÐ¹z\u008a@ã¿â´sp¦üçu[¯¼\u0010\u0015ìmI!2\u0099-¹Âæ\u0081p\"GT".length();
               var25 = '0';
               var24 = -1;
            }

            ++var24;
            var39 = var26.substring(var24, var24 + var25);
            var42 = 0;
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3822;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/n8", var10);
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
         i[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
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
         throw new RuntimeException("su/catlean/n8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14704;
      if (p[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = m[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])x.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               x.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/n8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/n8" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
