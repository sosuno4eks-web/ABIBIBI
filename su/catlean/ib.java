package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import net.minecraft.class_276;
import net.minecraft.class_290;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryUtil;

public final class ib {
   @NotNull
   private final VertexFormat i;
   private final boolean x;
   private ByteBuffer B;
   private final int R;
   private ByteBuffer d;
   private long y;
   private long G;
   private final ByteBuffer H;
   private long O;
   @NotNull
   private final int[] E;
   private int F;
   private int z;
   private int h;
   private final boolean l;
   private final boolean g;
   @NotNull
   private final Vector3f Y;
   private static String M;
   private static final long a = j0.a(4334850080388361405L, 8403579901915692103L, MethodHandles.lookup().lookupClass()).a(228513885753416L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] j;
   private static final Map k;
   private static final long[] m;
   private static final Long[] n;
   private static final Map o;

   public ib(long a, @NotNull VertexFormat format, int objectsCount, boolean lines) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.d<invokedynamic>(18993, 4128796343867417772L ^ var1));
      String var10000 = 7379585974346089969L.A<invokedynamic>(7379585974346089969L, var1);
      super();
      String var6 = var10000;

      int var10001;
      ib var8;
      label22: {
         label21: {
            try {
               this.i = var3;
               this.x = var5;
               this.B = BufferUtils.createByteBuffer(this.i.getVertexSize() * var4 * 4);
               var8 = this;
               var10001 = this.x;
               if (var6 != null) {
                  break label22;
               }

               if (var10001 != 0) {
                  break label21;
               }
            } catch (NumberFormatException var7) {
               throw var7.A<invokedynamic>(var7, 7449064250566258862L, var1);
            }

            var10001 = 27748.q<invokedynamic>(27748, 2530654408345377219L ^ var1);
            break label22;
         }

         var10001 = 2;
      }

      var8.R = var10001;
      this.d = BufferUtils.createByteBuffer(var4 * this.R * 4);
      this.y = MemoryUtil.memAddress0((Buffer)this.B);
      this.G = MemoryUtil.memAddress0((Buffer)this.d);
      this.H = MemoryUtil.memAlloc(true.q<invokedynamic>(28546, 1391893728815864356L ^ var1));
      this.O = this.y;
      this.E = new int[4];
      this.l = Intrinsics.areEqual((Object)this.i, (Object)class_290.field_1592);
      this.g = Intrinsics.areEqual((Object)this.i, (Object)class_290.field_1585);
      this.Y = new Vector3f();
   }

   public ib(VertexFormat var1, int var2, boolean var3, int var4, long var5, DefaultConstructorMarker var7) {
      var5 ^= a;
      long var8 = var5 ^ 36273774441626L;
      if ((var4 & 1) != 0) {
         VertexFormat var10000 = class_290.field_1592;
         Intrinsics.checkNotNullExpressionValue(var10000, true.d<invokedynamic>(8288, 4201384842838327258L ^ var5));
         var1 = var10000;
      }

      if ((var4 & 2) != 0) {
         var2 = 1;
      }

      if ((var4 & 4) != 0) {
         var3 = false;
      }

      this(var8, var1, var2, var3);
   }

   public final boolean X() {
      return this.x;
   }

   @NotNull
   public final ib B(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 60974296938900L;
      return this.s(-1.0F, var3, -1.0F, 0.0F).s(-1.0F, var3, 1.0F, 0.0F).s(1.0F, var3, 1.0F, 0.0F).s(1.0F, var3, -1.0F, 0.0F);
   }

   @NotNull
   public final ib d(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 67969007164862L;
      long var5 = var1 ^ 86209398780581L;
      long var10001 = var1 ^ 70446468736653L;
      int var7 = (int)((var1 ^ 70446468736653L) >>> 48);
      int var8 = (int)(var10001 << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      var10001 = var1 ^ 127163632711424L;
      int var10 = (int)((var1 ^ 127163632711424L) >>> 32);
      int var11 = (int)(var10001 << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      float var13 = (float)s8.H((short)var7, (short)var8, var9).method_22683().method_4486();
      float var14 = (float)s8.H((short)var7, (short)var8, var9).method_22683().method_4502();
      ib var10000 = this.s(0.0F, var3, var14, 0.0F).k(var10, 0.0F, 0.0F, (short)var11, (char)var12);
      Color var15 = Color.WHITE;
      Intrinsics.checkNotNullExpressionValue(var15, true.d<invokedynamic>(10181, 3165930626527230857L ^ var1));
      var10000 = var10000.N(var15, var5).s(0.0F, var3, 0.0F, 0.0F).k(var10, 0.0F, 1.0F, (short)var11, (char)var12);
      var15 = Color.WHITE;
      Intrinsics.checkNotNullExpressionValue(var15, true.d<invokedynamic>(26844, 3080659299500340353L ^ var1));
      var10000 = var10000.N(var15, var5).s(var13, var3, 0.0F, 0.0F).k(var10, 1.0F, 1.0F, (short)var11, (char)var12);
      var15 = Color.WHITE;
      Intrinsics.checkNotNullExpressionValue(var15, true.d<invokedynamic>(26844, 3080659299500340353L ^ var1));
      var10000 = var10000.N(var15, var5).s(var13, var3, var14, 0.0F).k(var10, 1.0F, 0.0F, (short)var11, (char)var12);
      var15 = Color.WHITE;
      Intrinsics.checkNotNullExpressionValue(var15, true.d<invokedynamic>(26844, 3080659299500340353L ^ var1));
      return var10000.N(var15, var5);
   }

   @NotNull
   public final ib D(@NotNull Matrix4f matrix, float x, float y, float z, long a, float u, float v, @NotNull Color color) {
      var5 ^= a;
      long var10001 = var5 ^ 16386853495439L;
      long var10 = (var5 ^ 16386853495439L) >>> 16;
      int var12 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, true.d<invokedynamic>(13313, 7794952147986001127L ^ var5));
      Intrinsics.checkNotNullParameter(var9, true.d<invokedynamic>(30691, 4710036968139058953L ^ var5));
      var1.transformPosition(var2, var3, var4, this.Y);
      this.n(this.Y.x, this.Y.y, this.Y.z, var10, var7, (short)var12, var8, var9);
      return this;
   }

   @NotNull
   public final ib n(float x, float y, float z, long a, float u, short a, float v, @NotNull Color color) {
      long var10 = (var4 << 16 | (long)var7 << 48 >>> 48) ^ a;
      long var12 = var10 ^ 96273780170003L;
      long var14 = var10 ^ 11112750212689L;
      Intrinsics.checkNotNullParameter(var9, true.d<invokedynamic>(31260, 515890967747282398L ^ var10));
      this.o(var14, true.q<invokedynamic>(11261, 4460178715513343755L ^ var10));
      this.H.putFloat(0, var1);
      this.H.putFloat(4, var2);
      this.H.putFloat(true.q<invokedynamic>(18588, 7627660193400040545L ^ var10), var3);
      this.H.putFloat(true.q<invokedynamic>(22065, 7624771344662082248L ^ var10), var6);
      this.H.putFloat(true.q<invokedynamic>(25627, 5193087291010711784L ^ var10), var8);
      this.H.put(true.q<invokedynamic>(9533, 6461513749317173705L ^ var10), (byte)var9.getRed());
      this.H.put(true.q<invokedynamic>(24523, 1289547521805040444L ^ var10), (byte)var9.getGreen());
      this.H.put(true.q<invokedynamic>(5796, 955547065181499985L ^ var10), (byte)var9.getBlue());
      this.H.put(true.q<invokedynamic>(29012, 4217309384407029183L ^ var10), (byte)RangesKt.coerceIn((int)((float)var9.getAlpha() * gk.E.p()), (ClosedRange)(new IntRange(0, true.q<invokedynamic>(19883, 8492244853484104019L ^ var10)))));
      MemoryUtil.memCopy(MemoryUtil.memAddress(this.H), this.O, true.t<invokedynamic>(27565, 305579591827814194L ^ var10));
      this.O += (long)true.q<invokedynamic>(11261, 4460178715513343755L ^ var10);
      this.o(var12);
      return this;
   }

   @NotNull
   public final ib s(float x, long a, float y, float z) {
      // $FF: Couldn't be decompiled
   }

   public static ib P(ib var0, float var1, float var2, float var3, long var4, int var6, Object var7) {
      var4 ^= a;
      long var8 = var4 ^ 65668901659979L;
      if ((var6 & 4) != 0) {
         var3 = 0.0F;
      }

      return var0.s(var1, var8, var2, var3);
   }

   @NotNull
   public final ib A(@NotNull Matrix4f matrix, int a, float x, char a, float y, int a, float z) {
      long var8 = ((long)var2 << 32 | (long)var4 << 48 >>> 32 | (long)var6 << 48 >>> 48) ^ a;
      long var10 = var8 ^ 8348244467150L;
      Intrinsics.checkNotNullParameter(var1, true.d<invokedynamic>(4331, 1200317783377349855L ^ var8));
      var1.transformPosition(var3, var5, var7, this.Y);
      return this.s(this.Y.x, var10, this.Y.y, this.Y.z);
   }

   @NotNull
   public final ib c(@NotNull Matrix3x2f matrix, long a, float x, float y, float z) {
      var2 ^= a;
      long var7 = var2 ^ 133236374155957L;
      Intrinsics.checkNotNullParameter(var1, true.d<invokedynamic>(13313, 7794890305455015751L ^ var2));
      this.I(var1).transformPosition(var4, var5, var6, this.Y);
      return this.s(this.Y.x, var7, this.Y.y, this.Y.z);
   }

   @NotNull
   public final ib k(int a, float u, float v, short a, char a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final ib N(@NotNull Color c, long a) {
      var2 ^= a;
      long var4 = var2 ^ 43167302938876L;
      Intrinsics.checkNotNullParameter(var1, "c");
      return this.Y(var1.getRed(), var1.getGreen(), var1.getBlue(), var4, var1.getAlpha());
   }

   @NotNull
   public final ib I(long a, float r, float g, float b, float a) {
      var1 ^= a;
      long var7 = var1 ^ 26015344694298L;
      return this.Y((int)(var3 * (float)true.q<invokedynamic>(19195, 490774558189313645L ^ var1)), (int)(var4 * (float)true.q<invokedynamic>(19883, 8492258281429686580L ^ var1)), (int)(var5 * (float)true.q<invokedynamic>(19883, 8492258281429686580L ^ var1)), var7, (int)(var6 * (float)true.q<invokedynamic>(19883, 8492258281429686580L ^ var1)));
   }

   @NotNull
   public final ib Y(int r, int g, int b, long a, int a) {
      // $FF: Couldn't be decompiled
   }

   private final void o(long var1, int var3) {
      long var10000 = a ^ var1;
      int var4 = (int)(this.O - this.y);
      if (var4 + var3 > this.B.capacity()) {
         ByteBuffer var5 = this.B;
         int var6 = Math.max(var5.capacity() * 2, var4 + var3);
         ByteBuffer var7 = BufferUtils.createByteBuffer(var6);
         MemoryUtil.memCopy(MemoryUtil.memAddress0((Buffer)var5), MemoryUtil.memAddress0((Buffer)var7), (long)var4);
         this.B = var7;
         this.y = MemoryUtil.memAddress0((Buffer)this.B);
         this.O = this.y + (long)var4;
      }

   }

   private final void E(long var1, int var3) {
      long var10000 = a ^ var1;
      int var4 = this.h * 4;
      if (var4 + var3 > this.d.capacity()) {
         ByteBuffer var5 = this.d;
         int var6 = Math.max(var5.capacity() * 2, var4 + var3);
         ByteBuffer var7 = BufferUtils.createByteBuffer(var6);
         MemoryUtil.memCopy(MemoryUtil.memAddress0((Buffer)var5), MemoryUtil.memAddress0((Buffer)var7), (long)var4);
         this.d = var7;
         this.G = MemoryUtil.memAddress0((Buffer)this.d);
      }

   }

   private final ib o(long param1) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final Matrix4f I(@NotNull Matrix3x2f m) {
      Intrinsics.checkNotNullParameter(var1, "m");
      Matrix4f var2 = new Matrix4f();
      boolean var4 = false;
      var2.m00(var1.m00());
      var2.m01(var1.m01());
      var2.m10(var1.m10());
      var2.m11(var1.m11());
      var2.m30(var1.m20());
      var2.m31(var1.m21());
      return var2;
   }

   public final void C(long a, @NotNull RenderPipeline pipeline, @NotNull class_276 fb, @Nullable GpuBufferSlice ubo, @Nullable Matrix4f matrix3D, @Nullable Matrix3x2f matrix2D, @NotNull Map samplers) {
      var1 ^= a;
      long var9 = var1 ^ 66482547850079L;
      Intrinsics.checkNotNullParameter(var3, true.d<invokedynamic>(17541, 7742727417784838046L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.d<invokedynamic>(1185, 3827905702333966259L ^ var1));
      Intrinsics.checkNotNullParameter(var8, true.d<invokedynamic>(12951, 869292659601789337L ^ var1));
      this.K(var9, var3, var4.method_71639(), var4.method_71640(), var5, var6, var7, var8);
   }

   public static void j(ib param0, RenderPipeline param1, class_276 param2, long param3, GpuBufferSlice param5, Matrix4f param6, Matrix3x2f param7, Map param8, int param9, Object param10) {
      // $FF: Couldn't be decompiled
   }

   public final void K(long a, @NotNull RenderPipeline pipeline, @Nullable GpuTextureView color, @Nullable GpuTextureView depth, @Nullable GpuBufferSlice ubo, @Nullable Matrix4f matrix3D, @Nullable Matrix3x2f matrix2D, @NotNull Map samplers) {
      // $FF: Couldn't be decompiled
   }

   public static void P(ib var0, RenderPipeline var1, short var2, int var3, GpuTextureView var4, GpuTextureView var5, GpuBufferSlice var6, Matrix4f var7, Matrix3x2f var8, int var9, Map var10, int var11, Object var12) {
      long var13 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var9 << 48 >>> 48) ^ a;
      long var15 = var13 ^ 118118382864078L;
      String var17 = -7608062954651290126L.A<invokedynamic>(-7608062954651290126L, var13);

      int var10000;
      label41: {
         label40: {
            try {
               var10000 = var11 & true.q<invokedynamic>(25627, 5193206033943470501L ^ var13);
               if (var17 != null) {
                  break label41;
               }

               if (var10000 == 0) {
                  break label40;
               }
            } catch (NumberFormatException var19) {
               throw var19.A<invokedynamic>(var19, -7538092097212399443L, var13);
            }

            var7 = null;
         }

         var10000 = var11 & true.q<invokedynamic>(19829, 2568498991516518598L ^ var13);
      }

      label32: {
         label31: {
            try {
               if (var17 != null) {
                  break label32;
               }

               if (var10000 == 0) {
                  break label31;
               }
            } catch (NumberFormatException var18) {
               throw var18.A<invokedynamic>(var18, -7538092097212399443L, var13);
            }

            var8 = null;
         }

         var10000 = var11 & true.q<invokedynamic>(31923, 7113414167118362900L ^ var13);
      }

      if (var10000 != 0) {
         var10 = MapsKt.emptyMap();
      }

      var0.K(var15, var1, var4, var5, var6, var7, var8, var10);
   }

   private static final String F() {
      long var0 = a ^ 103311008825834L;
      return true.d<invokedynamic>(27732, 5541591218777726991L ^ var0);
   }

   public ib(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 110894274912181L;
      this((VertexFormat)null, 0, false, true.q<invokedynamic>(14517, 7526572105891096102L ^ var1), var3, (DefaultConstructorMarker)null);
   }

   public static void c(String var0) {
      M = var0;
   }

   public static String m() {
      return M;
   }

   static {
      long var31 = a ^ 74157755909467L;
      e = new HashMap(13);
      null.A<invokedynamic>((Object)null, -9079378279443159877L, var31);
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var23 = 1; var23 < 8; ++var23) {
         var10003[var23] = (byte)((int)(var31 << var23 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[24];
      int var27 = 0;
      String var26 = "\u008f¹×Õ¬\n\u0003:)Þ\u0081 \u001a\u0006\b\u0014;îÅà)P+B£N\u001bWl®ä¸\u0019\u007fR\u0017{µÀ\u009d\u0090}\u009c:\u008a\u0095\u009eo\u0095\u000b°:H£³\u0092\u0010ÙqÃd-7m\u0083£´²½ø\u0016\u0085[Õ\u0091\u0012\u009e\u008b\u0007vÖ\u0092½\u0001¥\u0082\u0085ßÐ~>ÍKw,â9¬ø\u0004ÁP\u0098\u008e\u0085ê\u0085ªUA~àe)w\u0099j¤\u009c%±ð2Cñ\u0098\u009euì*MX0ìÈ£\u008b\u0005Ø×\u0014£L\u0088q\u001dVË+ôóèÿÏ\u0014#ó\t,\u008f\u001f ë,âù\u008bÐ\u0010¸iÛE\u001d*GA\u0006\u009a\u009a\u0085\u00020Ê¥\u0018ù\u000f\u0080áÞ¼\u0018A¨yI]V°Î×\u0018ý¤P\u00ad%¦ì\u0010ýéæ\u001cNzÌ$Ú;gF\u0097Ñâ\u0001\u0010=&¸úq¬\u00809Îftëh¹7\u0095\u0010»H\u0085\u001d\u00176\n#zg·ÏªuÍ\u001f\u0018©§\u0001½\u008f\fÏ\u0097\u0081ïD4_\u0092é\u001fgÔ\u0019e\u008fí½\u0003\u0010ï¤\u001a3\u0015¨©\u001a\u001aÝ\u009b¸\u0007¹@\u009e0\f<J\u009b_K¶C\u0087è¾:WA\\C!õ®gí2\u0018ªèò5\t¶\u0082p×@\u000el\få¡\u00896R/º\u0088ðàV\u001f\u0010|\u0098\u0093\u007f{xx\u0091\u00864oð82,[(§\t\u0010\u001b\u0010¿Ê×\u0090î\u0002ý+²\u0081üör,.\u0003À\u0000Rð¶2\u009dfê\u0084ü\u0006\u008a!§?AGx(uõÀâî¨\\\u009cDÔêÇ·\u008b]\u0000îË\u0002^\u0013\n \n=:¸¿\u009e\u0014\u0019\u008dº¯\u0017ÇÍ\u001dJ\u0093\u0010ÏP\u00066\u0018\u001aE»Ï\u0081¢\u001e§@Sß\u0098ÿ|ì»\u008cEÇ4ö®\u0018\u0087D±¯w\u0000IhÄ?\u0088mü\u009d\u007fÙÚã9/Ì\u0004øåÀa*ò¦(ùÉµÓS\u001bé\u009f\u0084Í}®\u008aî¥\u0091_¡u\u0001ìÛ\u0005ù\u0099%¿\u00900²r\u0006¿à\u0001n¸o\u009dû\u009cïz\u001eò>Ø=q#ü=kÔ\u000eñqÖ¹\u0003v\u0092\u0004Oü\u0018i@&\u009aQ¥\u0083x\u0080=Ty\u0019Á\u0003-^Y\u009dEÃã\u0007\u0086t`\u0084Û\u0005ÉFês[\u007f^h±\u001d\u0095\u0088\u0015:S\u00028P¨\u009e)í[ï\u0012$õóÔ\u001f[)\u0010SÙ¿\u00ad©ÝÙ\u0015´s(\u008fGÚ©K:ÁaÄ-Å¥\u0011Nú\u0006¯\u000b\f\u0096\u009aNUW;¬òÑ\\\u0010ù\\FóE\u0085Î\u0080H÷\nõãÐ\u008d®@\u001euR·ÉzvtuA\u009b~;UPSGI\u009eU¬æ,¬Pd÷\u0080?\u0088\u000b\u000b¸½\u009bõØ\u0098ï{\"(S\u0084\u009f\u008a ¼Â#Ë\b\u0006~} °N÷ä\u0092^më\u00186\u009díµóÊ\u009f;À\u008f\u0002ÝÃ\u000e¿pÍC\u0006Ç\u0010mû¸\u0010\u0094\u009b¨¥Ï\u0090v×êÏxâ\u008az<\u001b\u0018{ha>~ª·£.'³ØPÓc\u0095JÅ\u0098\u0003@Ëj30ß\u0004\u0096\u001a@ø3 `hP¥\u0098çâ\u008d;CTkó\u0086õè\u0085¾Üçåö\u0010±D\u009dëÏg\u0094!k²\u0015î«O\u008fÝ²\u0010K\u008b\b!Ù\u0018+\u0086âÇ\u0089\u0085üü9p";
      int var28 = "\u008f¹×Õ¬\n\u0003:)Þ\u0081 \u001a\u0006\b\u0014;îÅà)P+B£N\u001bWl®ä¸\u0019\u007fR\u0017{µÀ\u009d\u0090}\u009c:\u008a\u0095\u009eo\u0095\u000b°:H£³\u0092\u0010ÙqÃd-7m\u0083£´²½ø\u0016\u0085[Õ\u0091\u0012\u009e\u008b\u0007vÖ\u0092½\u0001¥\u0082\u0085ßÐ~>ÍKw,â9¬ø\u0004ÁP\u0098\u008e\u0085ê\u0085ªUA~àe)w\u0099j¤\u009c%±ð2Cñ\u0098\u009euì*MX0ìÈ£\u008b\u0005Ø×\u0014£L\u0088q\u001dVË+ôóèÿÏ\u0014#ó\t,\u008f\u001f ë,âù\u008bÐ\u0010¸iÛE\u001d*GA\u0006\u009a\u009a\u0085\u00020Ê¥\u0018ù\u000f\u0080áÞ¼\u0018A¨yI]V°Î×\u0018ý¤P\u00ad%¦ì\u0010ýéæ\u001cNzÌ$Ú;gF\u0097Ñâ\u0001\u0010=&¸úq¬\u00809Îftëh¹7\u0095\u0010»H\u0085\u001d\u00176\n#zg·ÏªuÍ\u001f\u0018©§\u0001½\u008f\fÏ\u0097\u0081ïD4_\u0092é\u001fgÔ\u0019e\u008fí½\u0003\u0010ï¤\u001a3\u0015¨©\u001a\u001aÝ\u009b¸\u0007¹@\u009e0\f<J\u009b_K¶C\u0087è¾:WA\\C!õ®gí2\u0018ªèò5\t¶\u0082p×@\u000el\få¡\u00896R/º\u0088ðàV\u001f\u0010|\u0098\u0093\u007f{xx\u0091\u00864oð82,[(§\t\u0010\u001b\u0010¿Ê×\u0090î\u0002ý+²\u0081üör,.\u0003À\u0000Rð¶2\u009dfê\u0084ü\u0006\u008a!§?AGx(uõÀâî¨\\\u009cDÔêÇ·\u008b]\u0000îË\u0002^\u0013\n \n=:¸¿\u009e\u0014\u0019\u008dº¯\u0017ÇÍ\u001dJ\u0093\u0010ÏP\u00066\u0018\u001aE»Ï\u0081¢\u001e§@Sß\u0098ÿ|ì»\u008cEÇ4ö®\u0018\u0087D±¯w\u0000IhÄ?\u0088mü\u009d\u007fÙÚã9/Ì\u0004øåÀa*ò¦(ùÉµÓS\u001bé\u009f\u0084Í}®\u008aî¥\u0091_¡u\u0001ìÛ\u0005ù\u0099%¿\u00900²r\u0006¿à\u0001n¸o\u009dû\u009cïz\u001eò>Ø=q#ü=kÔ\u000eñqÖ¹\u0003v\u0092\u0004Oü\u0018i@&\u009aQ¥\u0083x\u0080=Ty\u0019Á\u0003-^Y\u009dEÃã\u0007\u0086t`\u0084Û\u0005ÉFês[\u007f^h±\u001d\u0095\u0088\u0015:S\u00028P¨\u009e)í[ï\u0012$õóÔ\u001f[)\u0010SÙ¿\u00ad©ÝÙ\u0015´s(\u008fGÚ©K:ÁaÄ-Å¥\u0011Nú\u0006¯\u000b\f\u0096\u009aNUW;¬òÑ\\\u0010ù\\FóE\u0085Î\u0080H÷\nõãÐ\u008d®@\u001euR·ÉzvtuA\u009b~;UPSGI\u009eU¬æ,¬Pd÷\u0080?\u0088\u000b\u000b¸½\u009bõØ\u0098ï{\"(S\u0084\u009f\u008a ¼Â#Ë\b\u0006~} °N÷ä\u0092^më\u00186\u009díµóÊ\u009f;À\u008f\u0002ÝÃ\u000e¿pÍC\u0006Ç\u0010mû¸\u0010\u0094\u009b¨¥Ï\u0090v×êÏxâ\u008az<\u001b\u0018{ha>~ª·£.'³ØPÓc\u0095JÅ\u0098\u0003@Ëj30ß\u0004\u0096\u001a@ø3 `hP¥\u0098çâ\u008d;CTkó\u0086õè\u0085¾Üçåö\u0010±D\u009dëÏg\u0094!k²\u0015î«O\u008fÝ²\u0010K\u008b\b!Ù\u0018+\u0086âÇ\u0089\u0085üü9p".length();
      char var25 = '(';
      int var24 = -1;

      label81:
      while(true) {
         ++var24;
         String var33 = var26.substring(var24, var24 + var25);
         byte var10001 = -1;

         while(true) {
            byte[] var30 = var22.doFinal(var33.getBytes("ISO-8859-1"));
            String var39 = a(var30).intern();
            switch(var10001) {
            case 0:
               var29[var27++] = var39;
               if ((var24 += var25) >= var28) {
                  b = var29;
                  c = new String[24];
                  k = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var12 = 1; var12 < 8; ++var12) {
                     var10003[var12] = (byte)((int)(var31 << var12 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[20];
                  int var14 = 0;
                  String var15 = "ÿí\u008bÂ<¿ð\u0014rñ\u0004Q$\u001bã2³;èõz\u0013yë\u0000Þ\u001dgLÍ\\Ø¤\u009fÇä¦Öño¦£\u009cñ¸j\u00823Ãbè¹\u009fS¨QS¶\u008a@\u0084lívh\u0019Ò\u0016Ç\u0091ÉGÈ\u000f¹\u00ad\u0002ÓÁ\"\"úÉâ=>\u0006Ï^\u009c\u0001\u0080ÜàÈ\u0087Ü\fBpZÌ\u001dó¤c-\u0096²u¢\u000fT÷â²gôã¸\u008f~«;\u000e\u009cÓ\u001bj\u008bëÇ\\\u009cË\u0097lÿ\u009a9þUMN";
                  int var16 = "ÿí\u008bÂ<¿ð\u0014rñ\u0004Q$\u001bã2³;èõz\u0013yë\u0000Þ\u001dgLÍ\\Ø¤\u009fÇä¦Öño¦£\u009cñ¸j\u00823Ãbè¹\u009fS¨QS¶\u008a@\u0084lívh\u0019Ò\u0016Ç\u0091ÉGÈ\u000f¹\u00ad\u0002ÓÁ\"\"úÉâ=>\u0006Ï^\u009c\u0001\u0080ÜàÈ\u0087Ü\fBpZÌ\u001dó¤c-\u0096²u¢\u000fT÷â²gôã¸\u008f~«;\u000e\u009cÓ\u001bj\u008bëÇ\\\u009cË\u0097lÿ\u009a9þUMN".length();
                  int var13 = 0;

                  label63:
                  while(true) {
                     int var37 = var13;
                     var13 += 8;
                     byte[] var18 = var15.substring(var37, var13).getBytes("ISO-8859-1");
                     long[] var36 = var17;
                     var37 = var14++;
                     long var41 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                     byte var42 = -1;

                     while(true) {
                        long var19 = var41;
                        byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                        long var44 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                        switch(var42) {
                        case 0:
                           var36[var37] = var44;
                           if (var13 >= var16) {
                              f = var17;
                              j = new Integer[20];
                              o = new HashMap(13);
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var31 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long[] var6 = new long[5];
                              int var3 = 0;
                              String var4 = "\u008e\u0086ÇSn¹\rDQ_WùZ\u009eë\u0081Ü\u001ba¦è\u0081xb";
                              int var5 = "\u008e\u0086ÇSn¹\rDQ_WùZ\u009eë\u0081Ü\u001ba¦è\u0081xb".length();
                              int var2 = 0;

                              label47:
                              while(true) {
                                 var37 = var2;
                                 var2 += 8;
                                 byte[] var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                                 var36 = var6;
                                 var37 = var3++;
                                 var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                 var42 = -1;

                                 while(true) {
                                    long var8 = var41;
                                    byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                    var44 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                    switch(var42) {
                                    case 0:
                                       var36[var37] = var44;
                                       if (var2 >= var5) {
                                          m = var6;
                                          n = new Long[5];
                                          return;
                                       }
                                       break;
                                    default:
                                       var36[var37] = var44;
                                       if (var2 < var5) {
                                          continue label47;
                                       }

                                       var4 = "!¶\t!rÕx\u001dÚ;J1õ/è\r";
                                       var5 = "!¶\t!rÕx\u001dÚ;J1õ/è\r".length();
                                       var2 = 0;
                                    }

                                    var37 = var2;
                                    var2 += 8;
                                    var7 = var4.substring(var37, var2).getBytes("ISO-8859-1");
                                    var36 = var6;
                                    var37 = var3++;
                                    var41 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                    var42 = 0;
                                 }
                              }
                           }
                           break;
                        default:
                           var36[var37] = var44;
                           if (var13 < var16) {
                              continue label63;
                           }

                           var15 = "\u000eÚW8\u0096R\b?Z\u0090¨\b*Ö¦\u0015";
                           var16 = "\u000eÚW8\u0096R\b?Z\u0090¨\b*Ö¦\u0015".length();
                           var13 = 0;
                        }

                        var37 = var13;
                        var13 += 8;
                        var18 = var15.substring(var37, var13).getBytes("ISO-8859-1");
                        var36 = var17;
                        var37 = var14++;
                        var41 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        var42 = 0;
                     }
                  }
               }

               var25 = var26.charAt(var24);
               break;
            default:
               var29[var27++] = var39;
               if ((var24 += var25) < var28) {
                  var25 = var26.charAt(var24);
                  continue label81;
               }

               var26 = "õ\u0086\u0085Ù\u009cÁäN¼.\b ø)\u0011ÆLü¬¤'\u009c:« !7\u009a\u0097@9¾û¤¹}c\u0083;v\u00ad¡X\u0090Ñ§YÍÕÔ&õÊP¨Kê";
               var28 = "õ\u0086\u0085Ù\u009cÁäN¼.\b ø)\u0011ÆLü¬¤'\u009c:« !7\u009a\u0097@9¾û¤¹}c\u0083;v\u00ad¡X\u0090Ñ§YÍÕÔ&õÊP¨Kê".length();
               var25 = 24;
               var24 = -1;
            }

            ++var24;
            var33 = var26.substring(var24, var24 + var25);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2076;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])e.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               e.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ib", var10);
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
         throw new RuntimeException("su/catlean/ib" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21284;
      if (j[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/ib", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
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
         throw new RuntimeException("su/catlean/ib" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static long c(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 11078;
      if (n[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = m[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ib", var14);
         }

         long var15 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
         n[var3] = var15;
      }

      return n[var3];
   }

   private static long c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = c(var4, var5);
      MethodHandle var9 = MethodHandles.constant(Long.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/ib" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
