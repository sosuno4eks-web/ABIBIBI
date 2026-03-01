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
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2885;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class o3 extends k9 {
   @NotNull
   public static final o3 X;
   static final KProperty[] U;
   @NotNull
   private static final z0 u;
   @NotNull
   private static final zr f;
   @NotNull
   private static final zo c;
   @NotNull
   private static n A;
   @NotNull
   private static n M;
   private static final long b = j0.a(1926484482823791394L, 6817788658008494675L, MethodHandles.lookup().lookupClass()).a(228110981358501L);
   private static final String[] d;
   private static final String[] e;
   private static final Map g;
   private static final long[] i;
   private static final Integer[] k;
   private static final Map l;

   private o3(long var1, char var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ b;
      long var6 = var4 ^ 94274549697714L;
      super(var6, true.o<invokedynamic>(14825, 3691040129340977152L ^ var4), pa.Q(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final int y(int var1, byte var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ b;
      long var10001 = var4 ^ 44938251973220L;
      int var6 = (int)((var4 ^ 44938251973220L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)u.k((short)var6, this, U[0], (short)var7, var8)).intValue();
   }

   private final void a(long var1, int var3) {
      var1 ^= b;
      long var10001 = var1 ^ 32526986629804L;
      int var4 = (int)((var1 ^ 32526986629804L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      u.P(this, var4, U[0], (short)var5, var3, (short)var6);
   }

   private final uw K(short var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 32253902677533L;
      int var6 = (int)((var4 ^ 32253902677533L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (uw)f.k((short)var6, this, U[1], (short)var7, var8);
   }

   private final void N(short var1, short var2, int var3, uw var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
      long var10001 = var5 ^ 33867261431576L;
      int var7 = (int)((var5 ^ 33867261431576L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      f.P(this, var7, U[1], (short)var8, var4, (short)var9);
   }

   private final boolean W(int var1, short var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 130376389699662L;
      int var6 = (int)((var4 ^ 130376389699662L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)c.k((short)var6, this, U[2], (short)var7, var8);
   }

   private final void m(boolean var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 76378923559889L;
      int var4 = (int)((var2 ^ 76378923559889L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      c.P(this, var4, U[2], (short)var5, var1, (short)var6);
   }

   @Flow
   private final void M(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean i(long var1, class_2338 var3) {
      var1 ^= b;
      long var10001 = var1 ^ 33786463000932L;
      int var4 = (int)((var1 ^ 33786463000932L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var1 ^ 70339833505897L;
      long var9 = var1 ^ 46595145801421L;
      long var11 = var1 ^ 35236185485153L;
      long var13 = var1 ^ 6768539179561L;
      var10001 = var1 ^ 41173349384535L;
      int var15 = (int)((var1 ^ 41173349384535L) >>> 56);
      int var16 = (int)(var10001 << 8 >>> 32);
      int var17 = (int)(var10001 << 40 >>> 40);
      var10001 = var1 ^ 126834039556904L;
      int var18 = (int)((var1 ^ 126834039556904L) >>> 56);
      long var19 = var10001 << 8 >>> 8;
      String var10000 = -7397095390553133770L.A<invokedynamic>(-7397095390553133770L, var1);
      s1 var31 = dk.I.M(o3::M, var7, this.K((short)var4, var5, var6));
      String var30 = var10000;

      boolean var34;
      label22: {
         try {
            var34 = var31.y();
            if (var30 == null) {
               return var34;
            }

            if (!var34) {
               break label22;
            }
         } catch (NumberFormatException var33) {
            throw var33.A<invokedynamic>(var33, -7356599516617708894L, var1);
         }

         ml var35 = ml.j;
         class_2338 var37 = var3.method_10074();
         Intrinsics.checkNotNullExpressionValue(var37, true.o<invokedynamic>(26816, 7663256161111158477L ^ var1));
         st var10003 = st.Strict;
         v0 var10004 = v0.ALL;
         float var10005 = (float)s8.f(var13).method_55754();
         float var10006 = (float)s8.f(var13).method_55754();
         int var10008 = 14538.u<invokedynamic>(14538, 7291688912369617842L ^ var1);
         class_243 var21 = null;
         int var22 = var10008;
         Object var23 = null;
         float var24 = var10006;
         float var25 = var10005;
         v0 var26 = var10004;
         st var27 = var10003;
         byte var28 = -1;
         class_2338 var29 = var37;
         class_3965 var32 = ml.e(var35, (byte)var15, var29, var28, var27, var26, var25, var24, var16, var17, (List)var23, var22, var21);
         if (var32 != null) {
            x7 var36 = x7.Z;
            c7 var38 = qq.g;
            class_243 var39 = var32.method_17784();
            Intrinsics.checkNotNullExpressionValue(var39, true.o<invokedynamic>(18801, 8215749740349689718L ^ var1));
            var21 = var39;
            var36.l(var9, new rx(var11, var38.Q((byte)var18, var19, var21), true.u<invokedynamic>(28292, 754524004269743615L ^ var1), o3::n));
         }
      }

      var34 = true;
      return var34;
   }

   private final void v(long var1, class_2338 var3) {
      var1 ^= b;
      long var4 = var1 ^ 35292584802171L;
      long var6 = var1 ^ 86508515269339L;
      double var8 = Random.Default.nextDouble() / 10.0D + 0.5D;
      class_3965 var10 = new class_3965(new class_243((double)var3.method_10263() + var8, (double)var3.method_10264(), (double)var3.method_10260() + var8), class_2350.field_11033, var3, false);
      s8.r(var4).method_2896(s8.f(var6), class_1268.field_5808, var10);
      s8.f(var6).method_6104(class_1268.field_5808);
   }

   public final float U(@NotNull class_2338 pos, long a) {
      var2 ^= b;
      long var4 = var2 ^ 133281690968421L;
      String var10000 = 7067348417346885242L.A<invokedynamic>(7067348417346885242L, var2);
      Intrinsics.checkNotNullParameter(var1, true.o<invokedynamic>(2663, 3571523918345156407L ^ var2));
      String var6 = var10000;

      try {
         float var8 = (float)Math.abs(class_3532.method_15338(Math.toDegrees(Math.atan2(var1.method_46558().field_1350 - s8.f(var4).method_23321(), var1.method_46558().field_1352 - s8.f(var4).method_23317())) - 90.0D) - (double)class_3532.method_15393(s8.f(var4).method_36454()));
         if (var6 == null) {
            (new int[5]).A<invokedynamic>(new int[5], 7080647705428075000L, var2);
         }

         return var8;
      } catch (NumberFormatException var7) {
         throw var7.A<invokedynamic>(var7, 7107916787076239854L, var2);
      }
   }

   private static final Unit M(Entry var0) {
      long var1 = b ^ 100137496613153L;
      long var3 = var1 ^ 110390260173296L;
      X.v(var3, (class_2338)var0.getKey());
      return Unit.INSTANCE;
   }

   private static final boolean M(class_1799 var0) {
      long var1 = b ^ 126548596296161L;
      Intrinsics.checkNotNullParameter(var0, true.o<invokedynamic>(27162, 3042961944200292433L ^ var1));
      return Intrinsics.areEqual((Object)var0.method_7909(), (Object)class_1802.field_28042);
   }

   private static final class_2596 W(class_3965 var0, int var1) {
      return (class_2596)(new class_2885(class_1268.field_5808, var0, var1));
   }

   private static final Unit w(class_2338 param0, class_3965 param1) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit n(s1 var0, class_2338 var1, class_3965 var2) {
      long var3 = b ^ 103710197593809L;
      long var10001 = var3 ^ 125307652874769L;
      int var5 = (int)((var3 ^ 125307652874769L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      var10001 = var3 ^ 40068945496846L;
      int var8 = (int)((var3 ^ 40068945496846L) >>> 32);
      int var9 = (int)(var10001 << 32 >>> 56);
      int var10 = (int)(var10001 << 40 >>> 40);
      dk.I.X(var0.I(), var8, (byte)var9, var10, X.K((short)var5, var6, var7), o3::w);
      return Unit.INSTANCE;
   }

   static {
      long var20 = b ^ 25865147894005L;
      long var22 = var20 ^ 63764811608852L;
      long var24 = var20 ^ 49153656076833L;
      long var10001 = var20 ^ 4381712919574L;
      int var26 = (int)((var20 ^ 4381712919574L) >>> 48);
      int var27 = (int)(var10001 << 16 >>> 32);
      int var28 = (int)(var10001 << 48 >>> 48);
      long var29 = var20 ^ 33563085012434L;
      var10001 = var20 ^ 22984986664763L;
      long var31 = (var20 ^ 22984986664763L) >>> 16;
      int var33 = (int)(var10001 << 48 >>> 48);
      g = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[20];
      int var16 = 0;
      String var15 = "+kX]\u001f\u0005\u00ad¢\u008cePá¹IUd4¥,HÔ\u0094õ\fMØÈúÍ\u009c\r|û'pÇ±\u000b8¾\u0095¥ðú\u0086þ\noÿ57\u0093«ÊXê\u0010ËÎF©+à\u0014\u0098q¬ñÇÜ$%³ \u001fÛôyáv\u0013h\u0013Ki\u0082\u0001\u0083ús©Uþ¨\u0000mèåö¬wô}\u0089u¦(éJÞ\u0091&\u0002+\u009f&ß\u0092\u0006Gò\u0015ÅÏ {FT¦c\u009c\u0088lòºjx´ù\\ìÃ¡å¼§10ÝiñÁ)øP)Hÿ¶¬\u009e¾¦ö\u0084¹>\u0014UÕB×X\u0017?\u0003\u008f\u008aûY\u009eÛOa\u0013Î\u0001MÂq®ê¥`oÿ ;e\"T\u0087\u0017\r\u0006Ó¸\u001bË@!(üï\u008f`\u009fÇ/D\u0015\u0005#\u0005âHJæ\u0096\u0010\r\b&Å\u0090,v\u0084\t\u009eQÕ1\u0014\u000eâ0é,Ù5\u0083¦ù\u008c]ðõºgfsN\u001eßÜ¤\u009dÄÐH\u0097±$ï\u008cÓOEPc\u009bEc\u0089ÓjÆâ\u009b¶\u0090\u009cM¼(\u0006ð°\u008eÒ\u0012³ìêD,©qÐ o(Á;:ó¡}0\u001eR\t\"0§Õ¾o\u0002ÛNhÂÝo\u0018T}\u007fV\u0094\u0095\u0097\u0000ÃRAà=[¡8\u008bìÿ»<)\u0093ë ~hã§Ü2@\t\u0096,\u0001\u0082\u008a\u009e\u0010\u009fú¥AÑ|qº\u0093\u0081\u008847cg@·\u0018n(0¬'¸>#q(f\u008aØØ¨aì\u0091ô-`\u009c??\u0010\u001f=£sçµÄ©ÞAXþ¼EDW\u0010l¨á\u00adzZ\u008e©\u0092\u000b\u0084ç¤aXþ ·\u0019V\u0097·Ìa\u0004õÃ¤\u008f\u0085¼\u001c;DB\u000e%\u008fÜhiï#\u000e® \u0006-\u001b\u0018#\u0096Á<_¹üG1»øÛ\u008c¯\"²\u008f\u001f\u0006í\u0016\u009fÄ° .è:í¥ZÈx\u0095O²^Ò`z±©\n\u001e\u009eRqã\u0010Ëã^\u008eÑ\u008fET\u0018\u0013Øø6Ãóä\t@Ý\u001fÏ´06\u0099!n\u0097=úg\u009dI";
      int var17 = "+kX]\u001f\u0005\u00ad¢\u008cePá¹IUd4¥,HÔ\u0094õ\fMØÈúÍ\u009c\r|û'pÇ±\u000b8¾\u0095¥ðú\u0086þ\noÿ57\u0093«ÊXê\u0010ËÎF©+à\u0014\u0098q¬ñÇÜ$%³ \u001fÛôyáv\u0013h\u0013Ki\u0082\u0001\u0083ús©Uþ¨\u0000mèåö¬wô}\u0089u¦(éJÞ\u0091&\u0002+\u009f&ß\u0092\u0006Gò\u0015ÅÏ {FT¦c\u009c\u0088lòºjx´ù\\ìÃ¡å¼§10ÝiñÁ)øP)Hÿ¶¬\u009e¾¦ö\u0084¹>\u0014UÕB×X\u0017?\u0003\u008f\u008aûY\u009eÛOa\u0013Î\u0001MÂq®ê¥`oÿ ;e\"T\u0087\u0017\r\u0006Ó¸\u001bË@!(üï\u008f`\u009fÇ/D\u0015\u0005#\u0005âHJæ\u0096\u0010\r\b&Å\u0090,v\u0084\t\u009eQÕ1\u0014\u000eâ0é,Ù5\u0083¦ù\u008c]ðõºgfsN\u001eßÜ¤\u009dÄÐH\u0097±$ï\u008cÓOEPc\u009bEc\u0089ÓjÆâ\u009b¶\u0090\u009cM¼(\u0006ð°\u008eÒ\u0012³ìêD,©qÐ o(Á;:ó¡}0\u001eR\t\"0§Õ¾o\u0002ÛNhÂÝo\u0018T}\u007fV\u0094\u0095\u0097\u0000ÃRAà=[¡8\u008bìÿ»<)\u0093ë ~hã§Ü2@\t\u0096,\u0001\u0082\u008a\u009e\u0010\u009fú¥AÑ|qº\u0093\u0081\u008847cg@·\u0018n(0¬'¸>#q(f\u008aØØ¨aì\u0091ô-`\u009c??\u0010\u001f=£sçµÄ©ÞAXþ¼EDW\u0010l¨á\u00adzZ\u008e©\u0092\u000b\u0084ç¤aXþ ·\u0019V\u0097·Ìa\u0004õÃ¤\u008f\u0085¼\u001c;DB\u000e%\u008fÜhiï#\u000e® \u0006-\u001b\u0018#\u0096Á<_¹üG1»øÛ\u008c¯\"²\u008f\u001f\u0006í\u0016\u009fÄ° .è:í¥ZÈx\u0095O²^Ò`z±©\n\u001e\u009eRqã\u0010Ëã^\u008eÑ\u008fET\u0018\u0013Øø6Ãóä\t@Ý\u001fÏ´06\u0099!n\u0097=úg\u009dI".length();
      char var14 = '8';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var35 = var15.substring(var13, var13 + var14);
         byte var38 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var35.getBytes("ISO-8859-1"));
            String var41 = b(var19).intern();
            switch(var38) {
            case 0:
               var18[var16++] = var41;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  e = new String[20];
                  l = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[7];
                  int var3 = 0;
                  String var4 = "VÈúãê¦\u001f6x\u0083\u0015\u0091IúÁ-ç\u0015l\u000eÍ0¹«Ê3\u0017¤\u0095®yÊK67\u0093Ü\u0090¸\u0000";
                  int var5 = "VÈúãê¦\u001f6x\u0083\u0015\u0091IúÁ-ç\u0015l\u000eÍ0¹«Ê3\u0017¤\u0095®yÊK67\u0093Ü\u0090¸\u0000".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var42 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var42, var2).getBytes("ISO-8859-1");
                     long[] var37 = var6;
                     var42 = var3++;
                     long var44 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var45 = -1;

                     while(true) {
                        long var8 = var44;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var47 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var45) {
                        case 0:
                           var37[var42] = var47;
                           if (var2 >= var5) {
                              i = var6;
                              k = new Integer[7];
                              KProperty[] var34 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(o3.class, true.o<invokedynamic>(3872, 3441966291796036728L ^ var20), true.o<invokedynamic>(17279, 4776442991254028334L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(o3.class, true.o<invokedynamic>(17952, 3435372966846121332L ^ var20), true.o<invokedynamic>(29487, 911498170799911025L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(o3.class, true.o<invokedynamic>(9552, 3367487827894576668L ^ var20), true.o<invokedynamic>(26994, 3550272334369909309L ^ var20), 0)))};
                              U = var34;
                              X = new o3(var31, (char)var33);
                              u = qi.o((il)X, true.o<invokedynamic>(28878, 8543328000132608925L ^ var20), 0, new IntRange(0, true.u<invokedynamic>(27338, 1053588080837860580L ^ var20)), var22, (pj)null, (Function0)null, true.u<invokedynamic>(29056, 3630766141871196072L ^ var20), (Object)null);
                              f = qi.M((il)X, true.o<invokedynamic>(18376, 4242768918559147162L ^ var20), (Enum)uw.SILENT_FULL, (pj)null, (Function0)null, true.u<invokedynamic>(31700, 271113070016728568L ^ var20), (Object)null, var24);
                              c = qi.R((il)X, true.o<invokedynamic>(1, 2284778153080587089L ^ var20), true, (pj)null, (Function0)null, true.u<invokedynamic>(31914, 7545602550523071109L ^ var20), var29, (Object)null);
                              A = new n((char)var26, var27, (char)var28);
                              M = new n((char)var26, var27, (char)var28);
                              return;
                           }
                           break;
                        default:
                           var37[var42] = var47;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u000f\u0001¢\u00818\u0001Jk®ûZ{¹\u0092`Â";
                           var5 = "\u000f\u0001¢\u00818\u0001Jk®ûZ{¹\u0092`Â".length();
                           var2 = 0;
                        }

                        var42 = var2;
                        var2 += 8;
                        var7 = var4.substring(var42, var2).getBytes("ISO-8859-1");
                        var37 = var6;
                        var42 = var3++;
                        var44 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var45 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var41;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "¢\u0016ý\u000e\u0019ÁWÉï£>Â\u0010ó\u009a*:qzLÒ5£ÿ\u00970Q[°öf\u0095\u0010y\u0091c\u000f!3ózÇ6\f\u0086nêím";
               var17 = "¢\u0016ý\u000e\u0019ÁWÉï£>Â\u0010ó\u009a*:qzLÒ5£ÿ\u00970Q[°öf\u0095\u0010y\u0091c\u000f!3ózÇ6\f\u0086nêím".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var35 = var15.substring(var13, var13 + var14);
            var38 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24108;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/o3", var10);
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
         throw new RuntimeException("su/catlean/o3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11102;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
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
            throw new RuntimeException("su/catlean/o3", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
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
         throw new RuntimeException("su/catlean/o3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
