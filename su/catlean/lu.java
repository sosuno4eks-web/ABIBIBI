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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.LightMapUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.api.event.events.render.XRayBlockEvent;
import su.catlean.gofra.Flow;

public final class lu extends k9 {
   @NotNull
   public static final lu s;
   // $FF: synthetic field
   static final KProperty[] g;
   @NotNull
   private static final zq y;
   @NotNull
   private static final zo Y;
   @NotNull
   private static final zo P;
   @NotNull
   private static final z0 v;
   @NotNull
   private static final z0 U;
   @NotNull
   private static final z0 R;
   @NotNull
   private static final z0 W;
   @NotNull
   private static final iv c;
   @NotNull
   private static final ArrayList k;
   @Nullable
   private static class_2338 m;
   @NotNull
   private static class_238 Q;
   private static boolean V;
   private static final long b = j0.a(-2870143143608198447L, 2097804106301913533L, MethodHandles.lookup().lookupClass()).a(18546041510942L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f;
   private static final long[] i;
   private static final Integer[] l;
   private static final Map n;

   private lu(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 29022429508581L;
      super(var3, true.j<invokedynamic>(24904, 540750343950096619L ^ var1), pa.W(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final kq y(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 61533126437197L;
      int var3 = (int)((var1 ^ 61533126437197L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (kq)y.k((short)var3, this, g[0], (short)var4, var5);
   }

   private final void u(long var1, kq var3) {
      var1 ^= b;
      long var10001 = var1 ^ 64583977496424L;
      int var4 = (int)((var1 ^ 64583977496424L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      y.P(this, var4, g[0], (short)var5, var3, (short)var6);
   }

   private final boolean h(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 107815313653734L;
      int var3 = (int)((var1 ^ 107815313653734L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)Y.k((short)var3, this, g[1], (short)var4, var5);
   }

   private final boolean w(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 117787037510993L;
      int var3 = (int)((var1 ^ 117787037510993L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)P.k((short)var3, this, g[2], (short)var4, var5);
   }

   private final int Y(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 8983642061374L;
      int var3 = (int)((var1 ^ 8983642061374L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)v.k((short)var3, this, g[3], (short)var4, var5)).intValue();
   }

   private final int W(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 33762140881814L;
      int var3 = (int)((var1 ^ 33762140881814L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)U.k((short)var3, this, g[4], (short)var4, var5)).intValue();
   }

   private final int R(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 50990692750109L;
      int var3 = (int)((var1 ^ 50990692750109L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)R.k((short)var3, this, g[5], (short)var4, var5)).intValue();
   }

   private final int U(int var1, int var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 19922182031906L;
      int var6 = (int)((var4 ^ 19922182031906L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)W.k((short)var6, this, g[true.q<invokedynamic>(15240, 2689689963728493855L ^ var4)], (short)var7, var8)).intValue();
   }

   @Flow
   private final void q(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void h(XRayBlockEvent var1) {
      long var2 = b ^ 10773767272475L;
      long var4 = var2 ^ 14064264700811L;

      try {
         if (this.y(var4).G().contains(var1.getBlock())) {
            var1.cancel();
         }

      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, -8870794867782215527L, var2);
      }
   }

   public void n(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(long param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void V(MoveEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void z(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void I(LightMapUpdateEvent var1) {
      var1.cancel();
   }

   private final class_238 u(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 47734465891516L;
      long var5 = var1 ^ 123256412279425L;
      long var7 = var1 ^ 71250032542218L;
      long var10001 = var1 ^ 84007716785086L;
      int var9 = (int)((var1 ^ 84007716785086L) >>> 32);
      int var10 = (int)(var10001 << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      return new class_238(s8.f(var3).method_23317() - (double)this.W(var7), s8.f(var3).method_23318() - (double)this.U(var9, var10, (short)var11), s8.f(var3).method_23321() - (double)this.W(var7), s8.f(var3).method_23317() + (double)this.W(var7), s8.f(var3).method_23318() + (double)this.R(var5), s8.f(var3).method_23321() + (double)this.W(var7));
   }

   private final ArrayList H(long param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean I() {
      long var0 = b ^ 106735671785320L;
      long var2 = var0 ^ 54897424955987L;
      return s.h(var2);
   }

   private static final boolean s() {
      long var0 = b ^ 40128982882064L;
      long var2 = var0 ^ 128101049391659L;
      return s.h(var2);
   }

   private static final boolean J() {
      long var0 = b ^ 101929522561099L;
      long var2 = var0 ^ 13515334241648L;
      return s.h(var2);
   }

   private static final boolean m() {
      long var0 = b ^ 90870587643620L;
      long var2 = var0 ^ 2593847155679L;
      return s.h(var2);
   }

   private static final boolean L() {
      long var0 = b ^ 136858438819429L;
      long var2 = var0 ^ 48955361530718L;
      return s.h(var2);
   }

   static {
      long var20 = b ^ 129541811572318L;
      long var22 = var20 ^ 47769277701583L;
      long var10001 = var20 ^ 114778021579331L;
      int var24 = (int)((var20 ^ 114778021579331L) >>> 48);
      int var25 = (int)(var10001 << 16 >>> 32);
      int var26 = (int)(var10001 << 48 >>> 48);
      long var27 = var20 ^ 13240375939849L;
      var10001 = var20 ^ 95665493221435L;
      int var29 = (int)((var20 ^ 95665493221435L) >>> 32);
      int var30 = (int)(var10001 << 32 >>> 48);
      int var31 = (int)(var10001 << 48 >>> 48);
      long var32 = var20 ^ 63134580565703L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[27];
      int var16 = 0;
      String var15 = "Í\u0010£òù*.\u0004\u0004\u00900\u0096¯\u0095\u0007\u00ad\u0010\u0086ç±Çx\u0091xiÃ§\u0093\u008eoR¢V\u0018gã\u009a#À\u0010\u001dLh\b\u0090\u0096¦\u009ac\u0087G\u0006¾\u008a\u00adpk©\u0010i\u001f4÷\u0010\u001c\u00963á¡\u0080\u0012\f?`ó\u0010L=7ÒûB\u009a«S°\u0016M\u0092\u008e\u0094\u0085\u0018\u0001^¬\u0019\u009fa\u000e ¬íðÍ¨\u001bi\u0088_}\u0098ï@¹\u0007¢(@î?MEÌ\u008ce´¥ëìk)+\u009b\u008b;å Z|¸J\"£ \u0088Ó\u0081¥¬Ù3u\u0093E\u009d¦! z\u0019\rQyÛY\u008aþ¹¹\u0083ù\u00ad¡\u009f\u000b\u009dpeæPn\u008c)CÿDÔ¢2§ \u0017\u0006ä!;.sÂÊ\u0013z\u0099\u0082Ì\u0016\u007f\u0099xææ&úf^\u008eJ\u0005¸¨\bÛx\u0010÷ëä®O\u008a[\u0082ë]ø£)+\u0082\u008e\u0018økfßo <bSÔ\u001bó?D\u00189û¡A§u{\u0093·\u0018ë\u0092\u008f*!*§í\u008d_\t\u0016Àù÷T\u0098cAR¤\u0090£\u0098(DZõ1Þâ;p\b¥9\u008e\u001b\u0002*yiR0µ\u0096\u001a\u008cÔ\u0002æë\n\u0089Ô\u0016}\u0007ÅXj\u00961ÛÁ /\u001f3\u0001r\u0005²\u0010hKÈ¦\u0014¿\u001cv0M]\u0085¨iz\t%ÛX\\4Z\u001cZ  zO=§l\u009bì\u0080iSC|È\u009aµD´\u0084c~~\u0019%Ø\u0000Lã\u0010Óÿ³\u0010\u0090Ä,áûÈèÜ\u0091ÿèÔ\u001e¿`h $\u0092\u001do\u0095§¦\tÜýX¦þ\u0094brGÖÅ\u0017·_/háoPWÄ\u0018Ý\u008e\u0018b\u008cêé.:åº'(Z\r\u0014eF^cuQ\\vèKM@%\u000fRª±¬Ø\u009e(Æ\u0083\u008f¹»z¼o±}«\f´øCI\u0095,{}Õý%Òo\u0090ý¡sÇÅ«ûwy¨â<ã\u001f²\u001f\u0095<ÖQõ{pÀ\u000f\u0097V^X\u0010Ð\u008dBïXÜâøß¶aþ\u000fô\u0015\" ¬Ì1ô\u00854é\u0097\u0088]\rúÀõ\u0083Ü\u0099-\u0097Çy-¼\u0097\u0081ááñ^¼¤ý\u0010§ÃðÚ>Ì\u0083G[\u0097¸sÈ«øy Ñ%ÁõèøÁ fFd6®\u0098\u0018RÝÊH¼-\u00049³>\n_ùç\u001c$Ã\u0010v®d\u0013üô`\"%ëÙç£(+\u0089\u0010®»º\u0090iàq\u0098<\r\"\u008a\u008er\u0000Ý";
      int var17 = "Í\u0010£òù*.\u0004\u0004\u00900\u0096¯\u0095\u0007\u00ad\u0010\u0086ç±Çx\u0091xiÃ§\u0093\u008eoR¢V\u0018gã\u009a#À\u0010\u001dLh\b\u0090\u0096¦\u009ac\u0087G\u0006¾\u008a\u00adpk©\u0010i\u001f4÷\u0010\u001c\u00963á¡\u0080\u0012\f?`ó\u0010L=7ÒûB\u009a«S°\u0016M\u0092\u008e\u0094\u0085\u0018\u0001^¬\u0019\u009fa\u000e ¬íðÍ¨\u001bi\u0088_}\u0098ï@¹\u0007¢(@î?MEÌ\u008ce´¥ëìk)+\u009b\u008b;å Z|¸J\"£ \u0088Ó\u0081¥¬Ù3u\u0093E\u009d¦! z\u0019\rQyÛY\u008aþ¹¹\u0083ù\u00ad¡\u009f\u000b\u009dpeæPn\u008c)CÿDÔ¢2§ \u0017\u0006ä!;.sÂÊ\u0013z\u0099\u0082Ì\u0016\u007f\u0099xææ&úf^\u008eJ\u0005¸¨\bÛx\u0010÷ëä®O\u008a[\u0082ë]ø£)+\u0082\u008e\u0018økfßo <bSÔ\u001bó?D\u00189û¡A§u{\u0093·\u0018ë\u0092\u008f*!*§í\u008d_\t\u0016Àù÷T\u0098cAR¤\u0090£\u0098(DZõ1Þâ;p\b¥9\u008e\u001b\u0002*yiR0µ\u0096\u001a\u008cÔ\u0002æë\n\u0089Ô\u0016}\u0007ÅXj\u00961ÛÁ /\u001f3\u0001r\u0005²\u0010hKÈ¦\u0014¿\u001cv0M]\u0085¨iz\t%ÛX\\4Z\u001cZ  zO=§l\u009bì\u0080iSC|È\u009aµD´\u0084c~~\u0019%Ø\u0000Lã\u0010Óÿ³\u0010\u0090Ä,áûÈèÜ\u0091ÿèÔ\u001e¿`h $\u0092\u001do\u0095§¦\tÜýX¦þ\u0094brGÖÅ\u0017·_/háoPWÄ\u0018Ý\u008e\u0018b\u008cêé.:åº'(Z\r\u0014eF^cuQ\\vèKM@%\u000fRª±¬Ø\u009e(Æ\u0083\u008f¹»z¼o±}«\f´øCI\u0095,{}Õý%Òo\u0090ý¡sÇÅ«ûwy¨â<ã\u001f²\u001f\u0095<ÖQõ{pÀ\u000f\u0097V^X\u0010Ð\u008dBïXÜâøß¶aþ\u000fô\u0015\" ¬Ì1ô\u00854é\u0097\u0088]\rúÀõ\u0083Ü\u0099-\u0097Çy-¼\u0097\u0081ááñ^¼¤ý\u0010§ÃðÚ>Ì\u0083G[\u0097¸sÈ«øy Ñ%ÁõèøÁ fFd6®\u0098\u0018RÝÊH¼-\u00049³>\n_ùç\u001c$Ã\u0010v®d\u0013üô`\"%ëÙç£(+\u0089\u0010®»º\u0090iàq\u0098<\r\"\u008a\u008er\u0000Ý".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var36 = var15.substring(var13, var13 + var14);
         byte var39 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var36.getBytes("ISO-8859-1"));
            String var43 = b(var19).intern();
            switch(var39) {
            case 0:
               var18[var16++] = var43;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  e = new String[27];
                  n = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[12];
                  int var3 = 0;
                  String var4 = "¨±\u0004Ñ\u0012\u008cÖ\u0003cÏ1\u0086¶!\rDÐèäÂ#Ð{h\u0016=WÐO~»)câ\"¥\u009d§í*ÊîXuÜ\tÞ\u00028\u0003+\u001bä\u0015Ñµ¢W\u009b;öì¦\u0016\u008bÕ\u0087Ótôq%Zd\u0087×öA8¶";
                  int var5 = "¨±\u0004Ñ\u0012\u008cÖ\u0003cÏ1\u0086¶!\rDÐèäÂ#Ð{h\u0016=WÐO~»)câ\"¥\u009d§í*ÊîXuÜ\tÞ\u00028\u0003+\u001bä\u0015Ñµ¢W\u009b;öì¦\u0016\u008bÕ\u0087Ótôq%Zd\u0087×öA8¶".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var44 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var44, var2).getBytes("ISO-8859-1");
                     long[] var38 = var6;
                     var44 = var3++;
                     long var46 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var47 = -1;

                     while(true) {
                        long var8 = var46;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var49 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var47) {
                        case 0:
                           var38[var44] = var49;
                           if (var2 >= var5) {
                              i = var6;
                              l = new Integer[12];
                              KProperty[] var34 = new KProperty[true.q<invokedynamic>(1623, 3707873919294532501L ^ var20)];
                              var34[0] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(lu.class, true.j<invokedynamic>(24565, 4180853295294233981L ^ var20), true.j<invokedynamic>(26145, 1509285779366708385L ^ var20), 0)));
                              var34[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lu.class, true.j<invokedynamic>(31298, 3568589674866546904L ^ var20), true.j<invokedynamic>(14821, 7567886202887920506L ^ var20), 0)));
                              var34[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lu.class, true.j<invokedynamic>(16230, 405520271135530476L ^ var20), true.j<invokedynamic>(285, 3478145843604480904L ^ var20), 0)));
                              var34[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lu.class, true.j<invokedynamic>(19401, 3167440317666961759L ^ var20), true.j<invokedynamic>(9529, 6957088836917053371L ^ var20), 0)));
                              var34[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lu.class, true.j<invokedynamic>(26652, 2654938478121290393L ^ var20), true.j<invokedynamic>(15604, 1631376954332208740L ^ var20), 0)));
                              var34[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lu.class, true.j<invokedynamic>(3394, 8982007790052929481L ^ var20), true.j<invokedynamic>(11459, 7657207687409520192L ^ var20), 0)));
                              var34[true.q<invokedynamic>(22335, 3344798795975637759L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(lu.class, true.j<invokedynamic>(7267, 5361922700309036786L ^ var20), true.j<invokedynamic>(20705, 6332870078983123577L ^ var20), 0)));
                              g = var34;
                              s = new lu(var32);
                              il var40 = (il)s;
                              var43 = 16303.j<invokedynamic>(16303, 4918145197379411246L ^ var20);
                              class_2248[] var35 = new class_2248[3];
                              class_2248 var10007 = class_2246.field_10442;
                              Intrinsics.checkNotNullExpressionValue(var10007, true.j<invokedynamic>(17427, 4676072689766213252L ^ var20));
                              var35[0] = var10007;
                              var10007 = class_2246.field_29029;
                              Intrinsics.checkNotNullExpressionValue(var10007, true.j<invokedynamic>(24534, 4326000909230980418L ^ var20));
                              var35[1] = var10007;
                              var10007 = class_2246.field_22109;
                              Intrinsics.checkNotNullExpressionValue(var10007, true.j<invokedynamic>(12782, 7773323366643946344L ^ var20));
                              var35[2] = var10007;
                              y = qi.K(var40, var29, var43, new kq((short)var24, var25, CollectionsKt.mutableListOf(var35), (char)var26), (pj)null, (short)var30, (Function0)null, (char)var31, true.q<invokedynamic>(5337, 4672570094754658580L ^ var20), (Object)null);
                              Y = qi.R((il)s, true.j<invokedynamic>(10345, 3451149349642095344L ^ var20), false, (pj)null, (Function0)null, true.q<invokedynamic>(30836, 5371303669965329850L ^ var20), var27, (Object)null);
                              P = qi.R((il)s, true.j<invokedynamic>(31291, 5765505012590516412L ^ var20), false, (pj)null, lu::I, 4, var27, (Object)null);
                              v = qi.o((il)s, true.j<invokedynamic>(5260, 2311433313080735262L ^ var20), true.q<invokedynamic>(20556, 6889309104980802947L ^ var20), new IntRange(1, true.q<invokedynamic>(29881, 7785722853095217525L ^ var20)), var22, (pj)null, lu::s, true.q<invokedynamic>(5300, 7601917303601494385L ^ var20), (Object)null);
                              U = qi.o((il)s, true.j<invokedynamic>(13982, 882763200678646787L ^ var20), 5, new IntRange(1, true.q<invokedynamic>(15213, 4046267859733534379L ^ var20)), var22, (pj)null, lu::J, true.q<invokedynamic>(5300, 7601917303601494385L ^ var20), (Object)null);
                              R = qi.o((il)s, true.j<invokedynamic>(13982, 882763200678646787L ^ var20), 5, new IntRange(1, true.q<invokedynamic>(11773, 8349774856156004409L ^ var20)), var22, (pj)null, lu::m, true.q<invokedynamic>(5300, 7601917303601494385L ^ var20), (Object)null);
                              W = qi.o((il)s, true.j<invokedynamic>(20364, 2785388499760360727L ^ var20), 5, new IntRange(1, true.q<invokedynamic>(18899, 7874347490962482196L ^ var20)), var22, (pj)null, lu::L, true.q<invokedynamic>(5300, 7601917303601494385L ^ var20), (Object)null);
                              c = new iv();
                              k = new ArrayList();
                              Q = new class_238(class_2338.field_10980);
                              return;
                           }
                           break;
                        default:
                           var38[var44] = var49;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u001cµ\u000f°\u0016\u008e\u001e4\u0082nÐml8\u000f\t";
                           var5 = "\u001cµ\u000f°\u0016\u008e\u001e4\u0082nÐml8\u000f\t".length();
                           var2 = 0;
                        }

                        var44 = var2;
                        var2 += 8;
                        var7 = var4.substring(var44, var2).getBytes("ISO-8859-1");
                        var38 = var6;
                        var44 = var3++;
                        var46 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var47 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var43;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u0098æúçe¶½\u00837ÐQ\u0086Ä½>ö |boøíF,9]:S\u0090\u0085G¥ß)T\u0095Y-ö\u008f ü\u0090âÚs\u0011ßc";
               var17 = "\u0098æúçe¶½\u00837ÐQ\u0086Ä½>ö |boøíF,9]:S\u0090\u0085G¥ß)T\u0095Y-ö\u008f ü\u0090âÚs\u0011ßc".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var36 = var15.substring(var13, var13 + var14);
            var39 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20795;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/lu", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/lu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24172;
      if (l[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/lu", var14);
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
         throw new RuntimeException("su/catlean/lu" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
