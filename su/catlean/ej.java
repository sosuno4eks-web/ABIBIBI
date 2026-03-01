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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1657;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ej {
   @NotNull
   private final List H;
   @NotNull
   private final class_1657 r;
   private final float s;
   private final float S;
   private final float F;
   private final float X;
   private final boolean n;
   private final float D;
   private final float q;
   private final boolean K;
   private final float z;
   private final boolean W;
   @NotNull
   private final uf o;
   private final boolean l;
   private final boolean u;
   private final int a;
   private final boolean Y;
   private final float V;
   private final boolean h;
   private final boolean I;
   private final boolean J;
   private final boolean Z;
   private final boolean i;
   private final boolean x;
   private final boolean L;
   private static final long b = j0.a(3868260025249906111L, 5124986198664653375L, MethodHandles.lookup().lookupClass()).a(105941916313707L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e = new HashMap(13);
   private static final long[] f;
   private static final Integer[] g;
   private static final Map j;

   public ej(@NotNull List entities, @NotNull class_1657 target, float placeRange, long a, float explodeRange, float maxSelfDamage, float minDamage, boolean oldVer, float armorScale, float facePlaceHp, boolean overrideSelfDamage, float efficiencyFactor, boolean rayTrace, @NotNull uf friendProtection, boolean breakFire, boolean ignoreTerrain, int lethalMultiplier, boolean minimizeSelfDamage, float maxDamageReduction, boolean calcShields, boolean stringWaterRemove, boolean grimBreakRange, boolean explodeEChestFarm, boolean antiPortal, boolean antiQuiver, boolean overrideMinDamage) {
      var4 ^= b;
      Intrinsics.checkNotNullParameter(var1, true.a<invokedynamic>(3348, 5858201940817461924L ^ var4));
      Intrinsics.checkNotNullParameter(var2, true.a<invokedynamic>(31509, 7327654183108162749L ^ var4));
      Intrinsics.checkNotNullParameter(var15, true.a<invokedynamic>(11083, 5224694192948241642L ^ var4));
      super();
      this.H = var1;
      this.r = var2;
      this.s = var3;
      this.S = var6;
      this.F = var7;
      this.X = var8;
      this.n = var9;
      this.D = var10;
      this.q = var11;
      this.K = var12;
      this.z = var13;
      this.W = var14;
      this.o = var15;
      this.l = var16;
      this.u = var17;
      this.a = var18;
      this.Y = var19;
      this.V = var20;
      this.h = var21;
      this.I = var22;
      this.J = var23;
      this.Z = var24;
      this.i = var25;
      this.x = var26;
      this.L = var27;
   }

   @NotNull
   public final List V() {
      return this.H;
   }

   @NotNull
   public final class_1657 O() {
      return this.r;
   }

   public final float F() {
      return this.s;
   }

   public final float Z() {
      return this.S;
   }

   public final float J() {
      return this.F;
   }

   public final float D() {
      return this.X;
   }

   public final boolean l() {
      return this.n;
   }

   public final float K() {
      return this.D;
   }

   public final float s() {
      return this.q;
   }

   public final boolean x() {
      return this.K;
   }

   public final float o() {
      return this.z;
   }

   public final boolean I() {
      return this.W;
   }

   @NotNull
   public final uf b() {
      return this.o;
   }

   public final boolean m() {
      return this.l;
   }

   public final boolean A() {
      return this.u;
   }

   public final int g() {
      return this.a;
   }

   public final boolean w() {
      return this.Y;
   }

   public final float E() {
      return this.V;
   }

   public final boolean H() {
      return this.h;
   }

   public final boolean G() {
      return this.I;
   }

   public final boolean U() {
      return this.J;
   }

   public final boolean T() {
      return this.Z;
   }

   public final boolean R() {
      return this.i;
   }

   public final boolean v() {
      return this.x;
   }

   public final boolean M() {
      return this.L;
   }

   @NotNull
   public final List y() {
      return this.H;
   }

   @NotNull
   public final class_1657 d() {
      return this.r;
   }

   public final float L() {
      return this.s;
   }

   public final float n() {
      return this.S;
   }

   public final float e() {
      return this.F;
   }

   public final float P() {
      return this.X;
   }

   public final boolean a() {
      return this.n;
   }

   public final float j() {
      return this.D;
   }

   public final float c() {
      return this.q;
   }

   public final boolean X() {
      return this.K;
   }

   public final float Q() {
      return this.z;
   }

   public final boolean t() {
      return this.W;
   }

   @NotNull
   public final uf h() {
      return this.o;
   }

   public final boolean i() {
      return this.l;
   }

   public final boolean S() {
      return this.u;
   }

   public final int C() {
      return this.a;
   }

   public final boolean N() {
      return this.Y;
   }

   public final float B() {
      return this.V;
   }

   public final boolean u() {
      return this.h;
   }

   public final boolean q() {
      return this.I;
   }

   public final boolean r() {
      return this.J;
   }

   public final boolean f() {
      return this.Z;
   }

   public final boolean z() {
      return this.i;
   }

   public final boolean Y() {
      return this.x;
   }

   public final boolean k() {
      return this.L;
   }

   @NotNull
   public final ej w(@NotNull List entities, @NotNull class_1657 target, float placeRange, float explodeRange, float maxSelfDamage, float minDamage, boolean oldVer, float armorScale, float facePlaceHp, boolean overrideSelfDamage, float efficiencyFactor, boolean rayTrace, @NotNull uf friendProtection, boolean breakFire, boolean ignoreTerrain, long a, int lethalMultiplier, boolean minimizeSelfDamage, float maxDamageReduction, boolean calcShields, boolean stringWaterRemove, boolean grimBreakRange, boolean explodeEChestFarm, boolean antiPortal, boolean antiQuiver, boolean overrideMinDamage) {
      var16 ^= b;
      long var28 = var16 ^ 129207422897722L;
      Intrinsics.checkNotNullParameter(var1, true.a<invokedynamic>(15895, 2001404864245437944L ^ var16));
      Intrinsics.checkNotNullParameter(var2, true.a<invokedynamic>(19090, 7668106252847473022L ^ var16));
      Intrinsics.checkNotNullParameter(var13, true.a<invokedynamic>(18400, 7580850490028125200L ^ var16));
      return new ej(var1, var2, var3, var28, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var18, var19, var20, var21, var22, var23, var24, var25, var26, var27);
   }

   public static ej c(ej param0, List param1, class_1657 param2, float param3, float param4, float param5, float param6, boolean param7, float param8, float param9, boolean param10, float param11, boolean param12, uf param13, boolean param14, boolean param15, long param16, int param18, boolean param19, float param20, boolean param21, boolean param22, boolean param23, boolean param24, boolean param25, boolean param26, boolean param27, int param28, Object param29) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 96631389241821L;
      boolean var3 = this.L;
      boolean var4 = this.x;
      boolean var5 = this.i;
      boolean var6 = this.Z;
      boolean var7 = this.J;
      boolean var8 = this.I;
      boolean var9 = this.h;
      float var10 = this.V;
      boolean var11 = this.Y;
      int var12 = this.a;
      boolean var13 = this.u;
      boolean var14 = this.l;
      uf var15 = this.o;
      boolean var16 = this.W;
      float var17 = this.z;
      boolean var18 = this.K;
      float var19 = this.q;
      float var20 = this.D;
      boolean var21 = this.n;
      float var22 = this.X;
      float var23 = this.F;
      float var24 = this.S;
      float var25 = this.s;
      class_1657 var26 = this.r;
      List var27 = this.H;
      String var10000 = 8930.a<invokedynamic>(8930, 3785062292575959060L ^ var1);
      return var10000 + var27 + true.a<invokedynamic>(24365, 2027686321635050963L ^ var1) + var26 + true.a<invokedynamic>(3644, 3831104007479071939L ^ var1) + var25 + true.a<invokedynamic>(7245, 5730487527644300982L ^ var1) + var24 + true.a<invokedynamic>(24417, 7504931052943656341L ^ var1) + var23 + true.a<invokedynamic>(22375, 6856044040492109206L ^ var1) + var22 + true.a<invokedynamic>(10833, 8191706953769332904L ^ var1) + var21 + true.a<invokedynamic>(12346, 743113396011215561L ^ var1) + var20 + true.a<invokedynamic>(12469, 2979718516436937282L ^ var1) + var19 + true.a<invokedynamic>(13006, 5146946770612299836L ^ var1) + var18 + true.a<invokedynamic>(6453, 1737073839156233176L ^ var1) + var17 + true.a<invokedynamic>(14185, 5320057618392526213L ^ var1) + var16 + true.a<invokedynamic>(18320, 9199312691849158014L ^ var1) + var15 + true.a<invokedynamic>(4050, 5326334003987125543L ^ var1) + var14 + true.a<invokedynamic>(28852, 5911379764291660356L ^ var1) + var13 + true.a<invokedynamic>(4842, 2530517844915193861L ^ var1) + var12 + true.a<invokedynamic>(29412, 5115372600007616536L ^ var1) + var11 + true.a<invokedynamic>(1155, 768665607326604905L ^ var1) + var10 + true.a<invokedynamic>(25466, 65041194347624850L ^ var1) + var9 + true.a<invokedynamic>(11116, 2009830199266357646L ^ var1) + var8 + true.a<invokedynamic>(14372, 8232350179156828871L ^ var1) + var7 + true.a<invokedynamic>(27342, 2872799008263467050L ^ var1) + var6 + true.a<invokedynamic>(13380, 3804227195600318127L ^ var1) + var5 + true.a<invokedynamic>(25769, 69334546175852104L ^ var1) + var4 + true.a<invokedynamic>(22227, 419773183193893934L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = b ^ 69120679703122L;
      int var4 = this.H.hashCode();
      var4 = var4 * true.s<invokedynamic>(29550, 6788333199491423436L ^ var1) + this.r.hashCode();
      boolean var10000 = -2781406437471872644L.A<invokedynamic>(-2781406437471872644L, var1);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Float.hashCode(this.s);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Float.hashCode(this.S);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Float.hashCode(this.F);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Float.hashCode(this.X);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Boolean.hashCode(this.n);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Float.hashCode(this.D);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Float.hashCode(this.q);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Boolean.hashCode(this.K);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Float.hashCode(this.z);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Boolean.hashCode(this.W);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + this.o.hashCode();
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Boolean.hashCode(this.l);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Boolean.hashCode(this.u);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Integer.hashCode(this.a);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Boolean.hashCode(this.Y);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Float.hashCode(this.V);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Boolean.hashCode(this.h);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Boolean.hashCode(this.I);
      boolean var3 = var10000;
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Boolean.hashCode(this.J);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Boolean.hashCode(this.Z);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Boolean.hashCode(this.i);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Boolean.hashCode(this.x);
      var4 = var4 * true.s<invokedynamic>(13483, 7238027002095147777L ^ var1) + Boolean.hashCode(this.L);

      try {
         if (!var3) {
            (new int[5]).A<invokedynamic>(new int[5], -2808379801731196227L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, -2782452477825999888L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = b ^ 105969804104414L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[31];
      int var18 = 0;
      String var17 = "ï1\u008cÔ3çB?´&m!\u001f\u0082Yú%Iv\u0013\u00813PK \f³Ë\u009eØÝó\u0001°Xf)X¾68\u001aý\u008bs\u00963I\u0082Ô1\u000bEÀ,Ì°(\u0010UúìgGÔ\u009fÃ6VÛ|í æ¥\u000e\u0094÷ -ÜsÞê3Ògü\u0007\tñÂT\u0085Ö\rj\u0018\u0018`¤1\u0082Ñ92µ¹U\u0092úlÌ¨\nqv\u0010\u0086Öíâs(f_YP¸\u0091T×3\u009b©BÖñ\u0004Ó\u0003?¾\u001dP7VY\u0091\u0019\u0081Ù³Î\u008bÃ¿ë0~rdEe0X\u0018'\nð©½ô\u0096QêåfÇú\"Ô\u007f\u0000\u0092õ(#\u001cë²V\u009a;zRIyJ\u0016uF~\u001acu±yW\u0098\u0013Ç+\u0018Ú=]6D°^ \u0005\u0087R\u008a¦·½ym«\u0091\u0011T\u00ad\u009e¨ è\"À½ô8\t\u0092ù`\u0088g:d<8ð\u0019»^Pø\nX×ußKä\u0006\r\u0093(,\u008d\t\u0010Öa\u0012ïjëÏF§*\u0006^z÷÷È\f\u0012[\u0013r\u0098Ï¨zlùÅ\u000eWÎÀ\u0097-98 «ù{q(jåÙ\r«\t\u001a´2àÑâký\u0091X\u0090\u0003ßZ\u008fR¶Ñ6\u00ad^(ÚOTZës\u007feA½õÍ¯´¦Ó\u008dÍ\u0085/\u0097\u000f¬.\u001dÐ²ÚME\u001f0{¼ÿN7Í_6 R¡fFCÖgÐ\twÐ\u0007fÝTÉ#<Óó\u000eÛ|ÿùÂY@ñ2îr(þ\u0089Uæ\u0003ígxb7ù \u0086\u0016å!9-¤\u0002¿ù:ì\u009bK\u0003\f^~<ÆÚ±4:¹\u007f â °AÚG°É\u0097\u0081\u0082\u0091\u001fê\u008fµ{küÍP\u0097¼¡I}:7\u0014\u001aJ¸\"l(\u0081m9°2}þià\u009f'[:\u0086\u000etµ\"ÚføH\u0090\r?0!?e\u0088_¼\u0095\u008a®l»\u0015%Ö hâ\u001c;»\f<ÃÆ n]¬aXÒÔÆ\u0011\u001aJ\u0017»\u009c[;«úÃ\u0082ø6 ¾D\u0082°k»f\u0098§hï\u001e\u0012¹ü°TôÔ½ÿ>\nFÎí\u008cM .#=(Òn\u000fÇ¤2\nT¨·\u0012Î\u0016®\u008e`ï\u0005Db\u0011p7\u0091ÔeØnNî=«i£Ç[TÃ9%(\u0010X\u008d\u0085¶ì\u0084zÖ%Aòipl\u0005çx\u0016êwõñòûnÔ\u0091x\u009aNK/ÎûP\u0099ÛÊÊ\u0018\u0015à\u0080\u0005n9\u0088\u009b÷ÝÌ\u0083ÖX\u0000Ã\u0004íøâ>ë`l\u0018\u008cÒÉO\u008dö]Ç\u007fuL\u0012ÍÑ,\u0011?\u001dsÛZ\\ ×(è\u0098r\u0081mþ¡6i\u0087 \u00863Q?ì$p\u009d\u00adV\u009aÿ/,j\u0092±D¯«rMº\u0096A\"Cë~(ü\u0096\u001cúãP|ü`\"<\u0099_X\u0012w«w®Ç\u0088\u0018ª1hq;á\u00801iÎd`ôWòÐ\u0097A(S${4«l¯Î3\u0088xM\u008c\u0018D×\u0010+\u0091w\u0014\u001c¦Écæ5C\rÄ\u007f\u0002èt\u001a\u0013Ä\u0003ô\u0018\u0010,\u001fT±ö_úAÿòäÉÚ(]\u0001\u0018JÞÐ©\u001ai\u008fÇe¨\r#\u0010\u008b\u0098ïÅ\u0080\u000eíäF\u0015Í(\u0089\u0098²_i¸\u000fF\u0007}ú°ê»`\u001fW\u009c.Ý©ÁÇ\t×3\u0005EC{\u0007ùçæ\u0010MÕ\u001ak\u0085(x>Î \\\u008c|&,\u001a&a\u0000Ï#njç}\f\u001a+-8\u0080\u009cnÏ#ï£¥¿û\u0091«xÚ?;(R|C\u001f\u0093mÛ\u0004\u008b~F\u009eú\u009f\u001b·\u0090\u007fõ×Yz\u001e(c\u0096ÔGz¢&$\u00104¬\f¤Ëü?";
      int var19 = "ï1\u008cÔ3çB?´&m!\u001f\u0082Yú%Iv\u0013\u00813PK \f³Ë\u009eØÝó\u0001°Xf)X¾68\u001aý\u008bs\u00963I\u0082Ô1\u000bEÀ,Ì°(\u0010UúìgGÔ\u009fÃ6VÛ|í æ¥\u000e\u0094÷ -ÜsÞê3Ògü\u0007\tñÂT\u0085Ö\rj\u0018\u0018`¤1\u0082Ñ92µ¹U\u0092úlÌ¨\nqv\u0010\u0086Öíâs(f_YP¸\u0091T×3\u009b©BÖñ\u0004Ó\u0003?¾\u001dP7VY\u0091\u0019\u0081Ù³Î\u008bÃ¿ë0~rdEe0X\u0018'\nð©½ô\u0096QêåfÇú\"Ô\u007f\u0000\u0092õ(#\u001cë²V\u009a;zRIyJ\u0016uF~\u001acu±yW\u0098\u0013Ç+\u0018Ú=]6D°^ \u0005\u0087R\u008a¦·½ym«\u0091\u0011T\u00ad\u009e¨ è\"À½ô8\t\u0092ù`\u0088g:d<8ð\u0019»^Pø\nX×ußKä\u0006\r\u0093(,\u008d\t\u0010Öa\u0012ïjëÏF§*\u0006^z÷÷È\f\u0012[\u0013r\u0098Ï¨zlùÅ\u000eWÎÀ\u0097-98 «ù{q(jåÙ\r«\t\u001a´2àÑâký\u0091X\u0090\u0003ßZ\u008fR¶Ñ6\u00ad^(ÚOTZës\u007feA½õÍ¯´¦Ó\u008dÍ\u0085/\u0097\u000f¬.\u001dÐ²ÚME\u001f0{¼ÿN7Í_6 R¡fFCÖgÐ\twÐ\u0007fÝTÉ#<Óó\u000eÛ|ÿùÂY@ñ2îr(þ\u0089Uæ\u0003ígxb7ù \u0086\u0016å!9-¤\u0002¿ù:ì\u009bK\u0003\f^~<ÆÚ±4:¹\u007f â °AÚG°É\u0097\u0081\u0082\u0091\u001fê\u008fµ{küÍP\u0097¼¡I}:7\u0014\u001aJ¸\"l(\u0081m9°2}þià\u009f'[:\u0086\u000etµ\"ÚføH\u0090\r?0!?e\u0088_¼\u0095\u008a®l»\u0015%Ö hâ\u001c;»\f<ÃÆ n]¬aXÒÔÆ\u0011\u001aJ\u0017»\u009c[;«úÃ\u0082ø6 ¾D\u0082°k»f\u0098§hï\u001e\u0012¹ü°TôÔ½ÿ>\nFÎí\u008cM .#=(Òn\u000fÇ¤2\nT¨·\u0012Î\u0016®\u008e`ï\u0005Db\u0011p7\u0091ÔeØnNî=«i£Ç[TÃ9%(\u0010X\u008d\u0085¶ì\u0084zÖ%Aòipl\u0005çx\u0016êwõñòûnÔ\u0091x\u009aNK/ÎûP\u0099ÛÊÊ\u0018\u0015à\u0080\u0005n9\u0088\u009b÷ÝÌ\u0083ÖX\u0000Ã\u0004íøâ>ë`l\u0018\u008cÒÉO\u008dö]Ç\u007fuL\u0012ÍÑ,\u0011?\u001dsÛZ\\ ×(è\u0098r\u0081mþ¡6i\u0087 \u00863Q?ì$p\u009d\u00adV\u009aÿ/,j\u0092±D¯«rMº\u0096A\"Cë~(ü\u0096\u001cúãP|ü`\"<\u0099_X\u0012w«w®Ç\u0088\u0018ª1hq;á\u00801iÎd`ôWòÐ\u0097A(S${4«l¯Î3\u0088xM\u008c\u0018D×\u0010+\u0091w\u0014\u001c¦Écæ5C\rÄ\u007f\u0002èt\u001a\u0013Ä\u0003ô\u0018\u0010,\u001fT±ö_úAÿòäÉÚ(]\u0001\u0018JÞÐ©\u001ai\u008fÇe¨\r#\u0010\u008b\u0098ïÅ\u0080\u000eíäF\u0015Í(\u0089\u0098²_i¸\u000fF\u0007}ú°ê»`\u001fW\u009c.Ý©ÁÇ\t×3\u0005EC{\u0007ùçæ\u0010MÕ\u001ak\u0085(x>Î \\\u008c|&,\u001a&a\u0000Ï#njç}\f\u001a+-8\u0080\u009cnÏ#ï£¥¿û\u0091«xÚ?;(R|C\u001f\u0093mÛ\u0004\u008b~F\u009eú\u009f\u001b·\u0090\u007fõ×Yz\u001e(c\u0096ÔGz¢&$\u00104¬\f¤Ëü?".length();
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
                  d = new String[31];
                  j = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[24];
                  int var3 = 0;
                  String var4 = "\u0014nhr\u0098Ðû°»4EsÛÍ\u0093\u001f\u0010'\u0000ú á\u0005\u0091xRªÇ@%\u009a=ù3-\u009bÈ,Ö\u0082\u008d\f7ãÇÝòé1_8\u0082ÿÙ<V\f\u0081\u008f×:=Ì\u0016·x¸/\u0001\u0094#\u00ad¸×Î\u0010ÿT\u00111ö³eÃjêI&¬\u0095\t*\u0016úÛf\u0093\u0096´>T 'C`Ø$¯\u001eq\u001c\tmaüaõêï8R¹\u0000\u0095oït\u0098ñ{\u00842³\u0099[\u0087q³Wñ\u008dÃ\u0016\u009flGúV(lÔuø\u009ef)ôù4\u007f\u001bì\u0099\r1ào60ù\u0000mÙ/üê";
                  int var5 = "\u0014nhr\u0098Ðû°»4EsÛÍ\u0093\u001f\u0010'\u0000ú á\u0005\u0091xRªÇ@%\u009a=ù3-\u009bÈ,Ö\u0082\u008d\f7ãÇÝòé1_8\u0082ÿÙ<V\f\u0081\u008f×:=Ì\u0016·x¸/\u0001\u0094#\u00ad¸×Î\u0010ÿT\u00111ö³eÃjêI&¬\u0095\t*\u0016úÛf\u0093\u0096´>T 'C`Ø$¯\u001eq\u001c\tmaüaõêï8R¹\u0000\u0095oït\u0098ñ{\u00842³\u0099[\u0087q³Wñ\u008dÃ\u0016\u009flGúV(lÔuø\u009ef)ôù4\u007f\u001bì\u0099\r1ào60ù\u0000mÙ/üê".length();
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
                              g = new Integer[24];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "ôÓ\u0095´ÙV0\u008a4mÜ\u001f\u0099v\u009b}";
                           var5 = "ôÓ\u0095´ÙV0\u008a4mÜ\u001f\u0099v\u009b}".length();
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

               var17 = "ÄÎ¯\u001c\u0081¯°,Ä*¥\u00819 T\u0012z\u0012\u0088\tÜáþØ6yÆ\u0087tÐÎø\u0010\u0090¢çøª\u0019ÒCÆEÉ;àÏa_";
               var19 = "ÄÎ¯\u001c\u0081¯°,Ä*¥\u00819 T\u0012z\u0012\u0088\tÜáþØ6yÆ\u0087tÐÎø\u0010\u0090¢çøª\u0019ÒCÆEÉ;àÏa_".length();
               var16 = ' ';
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29021;
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
            throw new RuntimeException("su/catlean/ej", var10);
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
         throw new RuntimeException("su/catlean/ej" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 30604;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/ej", var14);
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
         throw new RuntimeException("su/catlean/ej" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
