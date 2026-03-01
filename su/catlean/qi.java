package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class qi {
   private static int W;
   private static final long a = j0.a(388037250517661272L, 1839214685165513282L, MethodHandles.lookup().lookupClass()).a(17169056664373L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   @NotNull
   public static final zo j(int a, char a, @NotNull il $this$setting, @NotNull String id, boolean defaultValue, @Nullable pj group, @NotNull Function0 visible, char a) {
      long var8 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ a;
      long var10001 = var8 ^ 109236990700367L;
      int var10 = (int)((var8 ^ 109236990700367L) >>> 48);
      int var11 = (int)(var10001 << 16 >>> 32);
      int var12 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var2, true.h<invokedynamic>(4153, 3413163752405365260L ^ var8));
      Intrinsics.checkNotNullParameter(var3, true.h<invokedynamic>(2543, 5165429588407118806L ^ var8));
      Intrinsics.checkNotNullParameter(var6, true.h<invokedynamic>(24951, 2575719226056639309L ^ var8));
      zo var13 = new zo((short)var10, var3, var4, var11, var12, var5, var6);
      ((Collection)var2.B()).add(var13);
      return var13;
   }

   // $FF: synthetic method
   public static zo R(il var0, String var1, boolean var2, pj var3, Function0 var4, int var5, long var6, Object var8) {
      var6 ^= a;
      long var10001 = var6 ^ 56993173555916L;
      int var9 = (int)((var6 ^ 56993173555916L) >>> 32);
      int var10 = (int)(var10001 << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      if ((var5 & 4) != 0) {
         var3 = null;
      }

      int var10000 = var5 & true.u<invokedynamic>(28976, 730528886746607047L ^ var6);
      if (var6 > 0L) {
         if (var10000 != 0) {
            var4 = qi::W;
         }

         var10000 = var9;
      }

      return j(var10000, (char)var10, var0, var1, var2, var3, var4, (char)var11);
   }

   @NotNull
   public static final z0 h(@NotNull il $this$setting, int a, @NotNull String id, int defaultValue, char a, char a, @NotNull IntRange range, @Nullable pj group, @NotNull Function0 visible) {
      long var9 = ((long)var1 << 32 | (long)var4 << 48 >>> 32 | (long)var5 << 48 >>> 48) ^ a;
      long var11 = var9 ^ 5078229307365L;
      Intrinsics.checkNotNullParameter(var0, true.h<invokedynamic>(4153, 3413050111234589583L ^ var9));
      Intrinsics.checkNotNullParameter(var2, true.h<invokedynamic>(2543, 5165385165130619477L ^ var9));
      Intrinsics.checkNotNullParameter(var6, true.h<invokedynamic>(13947, 6135937751063389635L ^ var9));
      Intrinsics.checkNotNullParameter(var8, true.h<invokedynamic>(24951, 2575674544880792270L ^ var9));
      z0 var13 = new z0(var2, var11, var3, var6, var7, var8);
      ((Collection)var0.B()).add(var13);
      return var13;
   }

   // $FF: synthetic method
   public static z0 o(il var0, String var1, int var2, IntRange var3, long var4, pj var6, Function0 var7, int var8, Object var9) {
      var4 ^= a;
      long var10001 = var4 ^ 136383499629961L;
      int var10 = (int)((var4 ^ 136383499629961L) >>> 32);
      int var11 = (int)(var10001 << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      if ((var8 & true.u<invokedynamic>(28976, 730563208447976193L ^ var4)) != 0) {
         var6 = null;
      }

      if ((var8 & true.u<invokedynamic>(14172, 7091858265186739560L ^ var4)) != 0) {
         var7 = qi::h;
      }

      return h(var0, var10, var1, var2, (char)var11, (char)var12, var3, var6, var7);
   }

   @NotNull
   public static final zc o(@NotNull il $this$setting, @NotNull String id, float defaultValue, @NotNull ClosedFloatingPointRange range, @Nullable pj group, long a, @NotNull Function0 visible, short a) {
      long var9 = (var5 << 16 | (long)var8 << 48 >>> 48) ^ a;
      long var11 = var9 ^ 63671660571441L;
      Intrinsics.checkNotNullParameter(var0, true.h<invokedynamic>(28454, 4017176117627323913L ^ var9));
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(2543, 5165428833670619335L ^ var9));
      Intrinsics.checkNotNullParameter(var3, true.h<invokedynamic>(19205, 244146226455421479L ^ var9));
      Intrinsics.checkNotNullParameter(var7, true.h<invokedynamic>(24951, 2575718148996270172L ^ var9));
      zc var13 = new zc(var1, var2, var3, var4, var7, var11);
      ((Collection)var0.B()).add(var13);
      return var13;
   }

   // $FF: synthetic method
   public static zc g(il var0, String var1, float var2, ClosedFloatingPointRange var3, pj var4, Function0 var5, int var6, long var7, Object var9) {
      var7 ^= a;
      long var10001 = var7 ^ 113429795208650L;
      long var10 = (var7 ^ 113429795208650L) >>> 16;
      int var12 = (int)(var10001 << 48 >>> 48);
      if ((var6 & true.u<invokedynamic>(28976, 730436519604081104L ^ var7)) != 0) {
         var4 = null;
      }

      if ((var6 & true.u<invokedynamic>(14172, 7091802718437906361L ^ var7)) != 0) {
         var5 = qi::w;
      }

      return o(var0, var1, var2, var3, var4, var10, var5, (short)var12);
   }

   @NotNull
   public static final zl m(@NotNull il $this$setting, @NotNull String id, long a, @NotNull String defaultValue, @Nullable pj group, @NotNull Function0 visible) {
      var2 ^= a;
      long var7 = var2 ^ 21210598019862L;
      Intrinsics.checkNotNullParameter(var0, true.h<invokedynamic>(4153, 3413106056847909233L ^ var2));
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(2543, 5165485211638003883L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.h<invokedynamic>(27093, 1788581684167186584L ^ var2));
      Intrinsics.checkNotNullParameter(var6, true.h<invokedynamic>(24951, 2575774505590526000L ^ var2));
      zl var9 = new zl(var1, var4, var5, var6, var7);
      ((Collection)var0.B()).add(var9);
      return var9;
   }

   // $FF: synthetic method
   public static zl P(il var0, String var1, long var2, String var4, pj var5, Function0 var6, int var7, Object var8) {
      var2 ^= a;
      long var9 = var2 ^ 22841668330203L;
      if ((var7 & 4) != 0) {
         var5 = null;
      }

      if ((var7 & true.u<invokedynamic>(28976, 730511730246014637L ^ var2)) != 0) {
         var6 = qi::f;
      }

      return m(var0, var1, var9, var4, var5, var6);
   }

   @NotNull
   public static final z7 M(@NotNull il $this$setting, @NotNull String id, long a, @NotNull n_ defaultValue, @Nullable pj group, @NotNull Function0 visible) {
      var2 ^= a;
      long var7 = var2 ^ 110231444962142L;
      Intrinsics.checkNotNullParameter(var0, true.h<invokedynamic>(4153, 3413061787781512641L ^ var2));
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(2543, 5165370466520343579L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.h<invokedynamic>(4434, 8111304792061099175L ^ var2));
      Intrinsics.checkNotNullParameter(var6, true.h<invokedynamic>(24951, 2575660108833967232L ^ var2));
      z7 var9 = new z7(var7, var1, var4, var6);
      var9.F(var5);
      ((Collection)var0.B()).add(var9);
      return var9;
   }

   // $FF: synthetic method
   public static z7 b(int var0, il var1, String var2, char var3, n_ var4, pj var5, Function0 var6, int var7, Object var8, short var9) {
      long var10 = ((long)var0 << 32 | (long)var3 << 48 >>> 32 | (long)var9 << 48 >>> 48) ^ a;
      long var12 = var10 ^ 22910239772572L;
      if ((var7 & 4) != 0) {
         var5 = null;
      }

      if ((var7 & true.u<invokedynamic>(28976, 730468111784437594L ^ var10)) != 0) {
         var6 = qi::H;
      }

      return M(var1, var2, var12, var4, var5, var6);
   }

   @NotNull
   public static final zr N(@NotNull il $this$setting, @NotNull String id, @NotNull Enum defaultValue, @Nullable pj group, @NotNull Function0 visible, long a) {
      var5 ^= a;
      long var7 = var5 ^ 29105441026604L;
      Intrinsics.checkNotNullParameter(var0, true.h<invokedynamic>(4153, 3413057302389858174L ^ var5));
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(2543, 5165392403431949988L ^ var5));
      Intrinsics.checkNotNullParameter(var2, true.h<invokedynamic>(4434, 8111291547822366232L ^ var5));
      Intrinsics.checkNotNullParameter(var4, true.h<invokedynamic>(24951, 2575682045814271551L ^ var5));
      zr var9 = new zr(var1, var7, var2, var3, var4);
      ((Collection)var0.B()).add(var9);
      return var9;
   }

   // $FF: synthetic method
   public static zr M(il var0, String var1, Enum var2, pj var3, Function0 var4, int var5, Object var6, long var7) {
      var7 ^= a;
      long var9 = var7 ^ 107988051746893L;
      if ((var5 & 4) != 0) {
         var3 = null;
      }

      if ((var5 & true.u<invokedynamic>(28976, 730548597032397364L ^ var7)) != 0) {
         var4 = qi::s;
      }

      return N(var0, var1, var2, var3, var4, var9);
   }

   @NotNull
   public static final zy a(@NotNull il $this$setting, @NotNull String id, char a, @NotNull r1 defaultValue, @Nullable pj group, long a, @NotNull Function0 visible) {
      long var8 = ((long)var2 << 48 | var5 << 16 >>> 16) ^ a;
      long var10 = var8 ^ 111008124771065L;
      Intrinsics.checkNotNullParameter(var0, true.h<invokedynamic>(4153, 3413129989954337803L ^ var8));
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(2543, 5165465129514821073L ^ var8));
      Intrinsics.checkNotNullParameter(var3, true.h<invokedynamic>(4434, 8111363922925288813L ^ var8));
      Intrinsics.checkNotNullParameter(var7, true.h<invokedynamic>(24951, 2575754424138435914L ^ var8));
      zy var12 = new zy(var1, var3, var10, var4, var7);
      var0.B().add(var12);
      return var12;
   }

   // $FF: synthetic method
   public static zy K(il var0, String var1, r1 var2, pj var3, Function0 var4, int var5, Object var6, long var7) {
      var7 ^= a;
      long var10001 = var7 ^ 115862258815913L;
      int var9 = (int)((var7 ^ 115862258815913L) >>> 48);
      long var10 = var10001 << 16 >>> 16;
      if ((var5 & 4) != 0) {
         var3 = null;
      }

      if ((var5 & true.u<invokedynamic>(28976, 730470919314750117L ^ var7)) != 0) {
         var4 = qi::I;
      }

      return a(var0, var1, (char)var9, var2, var3, var10, var4);
   }

   @NotNull
   public static final zv M(@NotNull il $this$setting, long a, @NotNull String id, @NotNull Color defaultValue, @Nullable pj group, @NotNull Function0 visible) {
      var1 ^= a;
      long var7 = var1 ^ 64271620716927L;
      Intrinsics.checkNotNullParameter(var0, true.h<invokedynamic>(4153, 3413134086080946267L ^ var1));
      Intrinsics.checkNotNullParameter(var3, true.h<invokedynamic>(2543, 5165443851379407233L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.h<invokedynamic>(4434, 8111377075244720445L ^ var1));
      Intrinsics.checkNotNullParameter(var6, true.h<invokedynamic>(24951, 2575733506646577434L ^ var1));
      zv var9 = new zv(var3, var4, var5, var6, var7);
      var0.B().add(var9);
      return var9;
   }

   // $FF: synthetic method
   public static zv F(il var0, String var1, Color var2, pj var3, Function0 var4, int var5, long var6, Object var8) {
      var6 ^= a;
      long var9 = var6 ^ 27075157632441L;
      if ((var5 & 4) != 0) {
         var3 = null;
      }

      if ((var5 & true.u<invokedynamic>(28976, 730544575473946853L ^ var6)) != 0) {
         var4 = qi::n;
      }

      return M(var0, var9, var1, var2, var3, var4);
   }

   @NotNull
   public static final zq l(@NotNull il $this$setting, @NotNull String id, @NotNull kq defaultValue, @Nullable pj group, long a, @NotNull Function0 visible) {
      var4 ^= a;
      long var7 = var4 ^ 24235930940087L;
      Intrinsics.checkNotNullParameter(var0, true.h<invokedynamic>(4153, 3413070947681827933L ^ var4));
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(2543, 5165379729365656967L ^ var4));
      Intrinsics.checkNotNullParameter(var2, true.h<invokedynamic>(4434, 8111313705520823611L ^ var4));
      Intrinsics.checkNotNullParameter(var6, true.h<invokedynamic>(24951, 2575669027680259356L ^ var4));
      zq var9 = new zq(var7, var1, var2, var3, var6);
      var0.B().add(var9);
      return var9;
   }

   // $FF: synthetic method
   public static zq K(il var0, int var1, String var2, kq var3, pj var4, short var5, Function0 var6, char var7, int var8, Object var9) {
      long var10 = ((long)var1 << 32 | (long)var5 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ a;
      long var12 = var10 ^ 69776342579119L;
      if ((var8 & 4) != 0) {
         var4 = null;
      }

      if ((var8 & true.u<invokedynamic>(26515, 7816695537032480849L ^ var10)) != 0) {
         var6 = qi::b;
      }

      return l(var0, var2, var3, var4, var12, var6);
   }

   @NotNull
   public static final z9 K(long a, @NotNull il $this$setting, @NotNull String id, @NotNull vh defaultValue, @Nullable pj group, @NotNull Function0 visible) {
      var0 ^= a;
      long var7 = var0 ^ 43893824579090L;
      Intrinsics.checkNotNullParameter(var2, true.h<invokedynamic>(4153, 3413034675934880467L ^ var0));
      Intrinsics.checkNotNullParameter(var3, true.h<invokedynamic>(2543, 5165413796161813257L ^ var0));
      Intrinsics.checkNotNullParameter(var4, true.h<invokedynamic>(4434, 8111279604089807797L ^ var0));
      Intrinsics.checkNotNullParameter(var6, true.h<invokedynamic>(24951, 2575703090584621970L ^ var0));
      z9 var9 = new z9(var3, var4, var5, var7, var6);
      var2.B().add(var9);
      return var9;
   }

   // $FF: synthetic method
   public static z9 d(il var0, String var1, long var2, vh var4, pj var5, Function0 var6, int var7, Object var8) {
      var2 ^= a;
      long var9 = var2 ^ 95038412138271L;
      if ((var7 & 4) != 0) {
         var5 = null;
      }

      if ((var7 & true.u<invokedynamic>(28976, 730514639737819339L ^ var2)) != 0) {
         var6 = qi::r;
      }

      return K(var9, var0, var1, var4, var5, var6);
   }

   @NotNull
   public static final z_ W(@NotNull il $this$setting, @NotNull String id, long a, @NotNull uj defaultValue, @Nullable pj group, @NotNull Function0 visible) {
      var2 ^= a;
      long var7 = var2 ^ 124989034264687L;
      Intrinsics.checkNotNullParameter(var0, true.h<invokedynamic>(4153, 3413135071877584832L ^ var2));
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(2543, 5165436139663838746L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.h<invokedynamic>(4434, 8111371489537971878L ^ var2));
      Intrinsics.checkNotNullParameter(var6, true.h<invokedynamic>(24951, 2575725730439407233L ^ var2));
      z_ var9 = new z_(var7, var1, var4, var5, var6);
      var0.B().add(var9);
      return var9;
   }

   // $FF: synthetic method
   public static z_ M(il var0, String var1, uj var2, pj var3, Function0 var4, long var5, int var7, Object var8) {
      var5 ^= a;
      long var9 = var5 ^ 104798567239883L;
      if ((var7 & 4) != 0) {
         var3 = null;
      }

      if ((var7 & true.u<invokedynamic>(28976, 730474541035229708L ^ var5)) != 0) {
         var4 = qi::G;
      }

      return W(var0, var1, var9, var2, var3, var4);
   }

   @NotNull
   public static final zn F(long a, @NotNull il $this$setting, @NotNull String id, @NotNull Function0 defaultValue, @Nullable pj group, @NotNull Function0 visible) {
      var0 ^= a;
      long var7 = var0 ^ 50213854478084L;
      long var9 = var0 ^ 124696359708821L;
      Intrinsics.checkNotNullParameter(var2, true.h<invokedynamic>(4153, 3413152401236249120L ^ var0));
      Intrinsics.checkNotNullParameter(var3, true.h<invokedynamic>(2543, 5165418254652756986L ^ var0));
      Intrinsics.checkNotNullParameter(var4, true.h<invokedynamic>(4434, 8111388790643346246L ^ var0));
      Intrinsics.checkNotNullParameter(var6, true.h<invokedynamic>(24951, 2575707840797293409L ^ var0));
      zu var13 = new zu(var9, var4);
      zn var14 = new zn(var3, var7, var13, var5, var6);
      var2.B().add(var14);
      return var14;
   }

   // $FF: synthetic method
   public static zn w(il var0, String var1, byte var2, Function0 var3, pj var4, int var5, Function0 var6, int var7, int var8, Object var9) {
      long var10 = ((long)var2 << 56 | (long)var5 << 32 >>> 8 | (long)var8 << 40 >>> 40) ^ a;
      long var12 = var10 ^ 96357775115006L;
      if ((var7 & 4) != 0) {
         var4 = null;
      }

      if ((var7 & true.u<invokedynamic>(28976, 730482604740976089L ^ var10)) != 0) {
         var6 = qi::R;
      }

      return F(var12, var0, var1, var3, var4, var6);
   }

   @NotNull
   public static final zm d(long a, @NotNull il $this$setting, @NotNull String id, @NotNull g0 defaultValue, @Nullable pj group, @NotNull Function0 visible) {
      var0 ^= a;
      long var7 = var0 ^ 49603066158562L;
      Intrinsics.checkNotNullParameter(var2, true.h<invokedynamic>(4153, 3413107299538071993L ^ var0));
      Intrinsics.checkNotNullParameter(var3, true.h<invokedynamic>(2543, 5165487553638459491L ^ var0));
      Intrinsics.checkNotNullParameter(var4, true.h<invokedynamic>(4434, 8111350329319551199L ^ var0));
      Intrinsics.checkNotNullParameter(var6, true.h<invokedynamic>(24951, 2575777122939175160L ^ var0));
      zm var9 = new zm(var3, var4, var7, var5, var6);
      var2.B().add(var9);
      return var9;
   }

   // $FF: synthetic method
   public static zm v(il var0, String var1, long var2, g0 var4, pj var5, Function0 var6, int var7, Object var8) {
      var2 ^= a;
      long var9 = var2 ^ 108418957467464L;
      if ((var7 & 4) != 0) {
         var5 = null;
      }

      if ((var7 & true.u<invokedynamic>(28976, 730489344967605238L ^ var2)) != 0) {
         var6 = qi::t;
      }

      return d(var9, var0, var1, var4, var5, var6);
   }

   @NotNull
   public static final zk a(@NotNull il $this$group, @NotNull String id, @NotNull r6 type, @NotNull Function0 visible, long a) {
      var4 ^= a;
      long var6 = var4 ^ 71296855975230L;
      long var10001 = var4 ^ 136965876803849L;
      int var8 = (int)((var4 ^ 136965876803849L) >>> 48);
      int var9 = (int)(var10001 << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var0, true.h<invokedynamic>(4153, 3413102187403191375L ^ var4));
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(2543, 5165473559611882901L ^ var4));
      Intrinsics.checkNotNullParameter(var2, true.h<invokedynamic>(915, 432994008572901359L ^ var4));
      Intrinsics.checkNotNullParameter(var3, true.h<invokedynamic>(24951, 2575763214979224846L ^ var4));
      pj var11 = new pj(var6, false, var2);
      zk var12 = new zk((short)var8, var1, (short)var9, var10, var11, var3);
      var0.B().add(var12);
      return var12;
   }

   // $FF: synthetic method
   public static zk G(il var0, String var1, r6 var2, Function0 var3, long var4, int var6, Object var7) {
      var4 ^= a;
      long var8 = var4 ^ 34674770790218L;
      if ((var6 & 2) != 0) {
         var2 = r6.DEFAULT;
      }

      if ((var6 & 4) != 0) {
         var3 = qi::D;
      }

      return a(var0, var1, var2, var3, var8);
   }

   @NotNull
   public static final zk T(@NotNull k9 parent, @NotNull String id, @NotNull r6 type, @NotNull Function0 visible, long a) {
      var4 ^= a;
      long var6 = var4 ^ 97785411767902L;
      long var10001 = var4 ^ 110667299504745L;
      int var8 = (int)((var4 ^ 110667299504745L) >>> 48);
      int var9 = (int)(var10001 << 16 >>> 48);
      int var10 = (int)(var10001 << 32 >>> 32);
      Intrinsics.checkNotNullParameter(var0, true.h<invokedynamic>(24566, 2552323956546617577L ^ var4));
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(22204, 8573630075432421805L ^ var4));
      Intrinsics.checkNotNullParameter(var2, true.h<invokedynamic>(2816, 6368375939610088471L ^ var4));
      Intrinsics.checkNotNullParameter(var3, true.h<invokedynamic>(21978, 3294696424357382856L ^ var4));
      pj var11 = new pj(var6, false, var2);
      zk var12 = new zk((short)var8, var1, (short)var9, var10, var11, var3);
      ((Collection)var0.B()).add(var12);
      return var12;
   }

   // $FF: synthetic method
   public static zk S(k9 var0, String var1, r6 var2, long var3, Function0 var5, int var6, Object var7) {
      var3 ^= a;
      long var8 = var3 ^ 43642359965722L;
      if ((var6 & 4) != 0) {
         var2 = r6.DEFAULT;
      }

      if ((var6 & true.u<invokedynamic>(28976, 730542426776121906L ^ var3)) != 0) {
         var5 = qi::c;
      }

      return T(var0, var1, var2, var5, var8);
   }

   @NotNull
   public static final zc t(@NotNull k9 parent, @NotNull String id, float defaultValue, @NotNull ClosedFloatingPointRange range, @Nullable pj group, @NotNull Function0 visible, long a) {
      var6 ^= a;
      long var8 = var6 ^ 91770259776541L;
      Intrinsics.checkNotNullParameter(var0, true.h<invokedynamic>(18337, 3519148866285429153L ^ var6));
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(2543, 5165383264956231659L ^ var6));
      Intrinsics.checkNotNullParameter(var3, true.h<invokedynamic>(13947, 6135934757400383613L ^ var6));
      Intrinsics.checkNotNullParameter(var5, true.h<invokedynamic>(24951, 2575672632460101488L ^ var6));
      zc var10 = new zc(var1, var2, var3, var4, var5, var8);
      ((Collection)var0.B()).add(var10);
      return var10;
   }

   // $FF: synthetic method
   public static zc b(k9 param0, String param1, float param2, ClosedFloatingPointRange param3, pj param4, long param5, Function0 param7, int param8, Object param9) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public static final z0 P(@NotNull k9 parent, short a, @NotNull String id, int defaultValue, int a, @NotNull IntRange range, @Nullable pj group, @NotNull Function0 visible, short a) {
      long var9 = ((long)var1 << 48 | (long)var4 << 32 >>> 16 | (long)var8 << 48 >>> 48) ^ a;
      long var11 = var9 ^ 7786086846098L;
      Intrinsics.checkNotNullParameter(var0, true.h<invokedynamic>(18337, 3519147990898709864L ^ var9));
      Intrinsics.checkNotNullParameter(var2, true.h<invokedynamic>(2543, 5165384656305249058L ^ var9));
      Intrinsics.checkNotNullParameter(var5, true.h<invokedynamic>(13947, 6135936147042854068L ^ var9));
      Intrinsics.checkNotNullParameter(var7, true.h<invokedynamic>(24951, 2575673954452616121L ^ var9));
      z0 var13 = new z0(var2, var11, var3, var5, var6, var7);
      ((Collection)var0.B()).add(var13);
      return var13;
   }

   // $FF: synthetic method
   public static z0 d(k9 var0, String var1, int var2, IntRange var3, pj var4, Function0 var5, int var6, long var7, Object var9) {
      var7 ^= a;
      long var10001 = var7 ^ 107770215920864L;
      int var10 = (int)((var7 ^ 107770215920864L) >>> 48);
      int var11 = (int)(var10001 << 16 >>> 32);
      int var12 = (int)(var10001 << 48 >>> 48);
      byte var13 = 9181551859064482572L.A<invokedynamic>(9181551859064482572L, var7);

      int var10000;
      label39: {
         label38: {
            try {
               var10000 = var6 & true.u<invokedynamic>(14172, 7091843403868087670L ^ var7);
               if (var13 != 0) {
                  break label39;
               }

               if (var10000 == 0) {
                  break label38;
               }
            } catch (NumberFormatException var15) {
               throw var15.A<invokedynamic>(var15, 9209357808638138576L, var7);
            }

            var4 = null;
         }

         var10000 = var6 & true.u<invokedynamic>(29163, 3259390371234702272L ^ var7);
      }

      if (var10000 != 0) {
         var5 = qi::A;
      }

      try {
         z0 var16 = P(var0, (short)var10, var1, var2, var11, var3, var4, var5, (short)var12);
         byte var17 = var13;
         if (var7 > 0L) {
            if (var13 == 0) {
               return var16;
            }

            var17 = 3;
         }

         (new int[var17]).A<invokedynamic>(new int[var17], 9182812853330820308L, var7);
         return var16;
      } catch (NumberFormatException var14) {
         throw var14.A<invokedynamic>(var14, 9209357808638138576L, var7);
      }
   }

   @NotNull
   public static final zo z(@NotNull k9 parent, long a, @NotNull String id, boolean defaultValue, @Nullable pj group, @NotNull Function0 visible) {
      var1 ^= a;
      long var10001 = var1 ^ 38040496695598L;
      int var7 = (int)((var1 ^ 38040496695598L) >>> 48);
      int var8 = (int)(var10001 << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var0, true.h<invokedynamic>(18337, 3519189959848208381L ^ var1));
      Intrinsics.checkNotNullParameter(var3, true.h<invokedynamic>(2543, 5165359489267820983L ^ var1));
      Intrinsics.checkNotNullParameter(var6, true.h<invokedynamic>(24951, 2575649126717587756L ^ var1));
      zo var10 = new zo((short)var7, var3, var4, var8, var9, var5, var6);
      ((Collection)var0.B()).add(var10);
      return var10;
   }

   // $FF: synthetic method
   public static zo Y(long var0, k9 var2, String var3, boolean var4, pj var5, Function0 var6, int var7, Object var8) {
      var0 ^= a;
      long var9 = var0 ^ 64194377224004L;
      boolean var11 = 3916476154368549437L.A<invokedynamic>(3916476154368549437L, var0);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var7 & true.u<invokedynamic>(28976, 730449898464160302L ^ var0);
               if (var11) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var12) {
               throw var12.A<invokedynamic>(var12, 3962961688934339041L, var0);
            }

            var5 = null;
         }

         var10000 = var7 & true.u<invokedynamic>(14172, 7091824206206233671L ^ var0);
      }

      if (var10000 != 0) {
         var6 = qi::F;
      }

      return z(var2, var9, var3, var4, var5, var6);
   }

   @NotNull
   public static final zr b(@NotNull k9 parent, @NotNull String id, @NotNull Enum defaultValue, @Nullable pj group, long a, @NotNull Function0 visible) {
      var4 ^= a;
      long var7 = var4 ^ 75019688756513L;
      Intrinsics.checkNotNullParameter(var0, true.h<invokedynamic>(18337, 3519229740614467555L ^ var4));
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(2543, 5165478432742535593L ^ var4));
      Intrinsics.checkNotNullParameter(var2, true.h<invokedynamic>(4434, 8111342390596069653L ^ var4));
      Intrinsics.checkNotNullParameter(var6, true.h<invokedynamic>(24951, 2575768092235995442L ^ var4));
      zr var9 = new zr(var1, var7, var2, var3, var6);
      ((Collection)var0.B()).add(var9);
      return var9;
   }

   // $FF: synthetic method
   public static zr O(k9 var0, long var1, String var3, Enum var4, pj var5, Function0 var6, int var7, Object var8) {
      var1 ^= a;
      long var9 = var1 ^ 35317825630901L;
      boolean var11 = 6031859630863124434L.A<invokedynamic>(6031859630863124434L, var1);

      int var10000;
      label25: {
         label24: {
            try {
               var10000 = var7 & true.u<invokedynamic>(28976, 730553457250684865L ^ var1);
               if (var11) {
                  break label25;
               }

               if (var10000 == 0) {
                  break label24;
               }
            } catch (NumberFormatException var12) {
               throw var12.A<invokedynamic>(var12, 5985321869729379342L, var1);
            }

            var5 = null;
         }

         var10000 = var7 & true.u<invokedynamic>(14172, 7091866101868464552L ^ var1);
      }

      if (var10000 != 0) {
         var6 = qi::v;
      }

      return b(var0, var3, var4, var5, var9, var6);
   }

   private static final boolean W() {
      return true;
   }

   private static final boolean h() {
      return true;
   }

   private static final boolean w() {
      return true;
   }

   private static final boolean f() {
      return true;
   }

   private static final boolean H() {
      return true;
   }

   private static final boolean s() {
      return true;
   }

   private static final boolean I() {
      return true;
   }

   private static final boolean n() {
      return true;
   }

   private static final boolean b() {
      return true;
   }

   private static final boolean r() {
      return true;
   }

   private static final boolean G() {
      return true;
   }

   private static final boolean R() {
      return true;
   }

   private static final boolean t() {
      return true;
   }

   private static final boolean D() {
      return true;
   }

   private static final boolean c() {
      return true;
   }

   private static final boolean B() {
      return true;
   }

   private static final boolean A() {
      return true;
   }

   private static final boolean F() {
      return true;
   }

   private static final boolean v() {
      return true;
   }

   public static void N(int var0) {
      W = var0;
   }

   public static int O() {
      return W;
   }

   public static int d() {
      int var0 = O();

      try {
         return var0 == 0 ? 48 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
      }
   }

   static {
      long var20 = a ^ 96166600906555L;
      d = new HashMap(13);
      108.A<invokedynamic>(108, -4154115805479517406L, var20);
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
      String var15 = "U(E®¡íE·¢yiS(;ßØ(!\u008e¯³yè8Û\u0018¶,\u0094o1\u0010\u0010»\r\u001cËû\r1\u0002ÓçÛ©\u001c/\rr\u0010aP¯pÞÏ#¯FÖÂkª3ÐÍ\u0010}yh(ºà0&\u009cÑ#0\u0085OÐ\u0091\u0010HÐÌè²\u0007:ýw#\u0013ø+\u0016@~\u0010\u0098Ò\u007fõ\u0005àÞþiðõ6\u008f:yl\u0010.ã\u007f\u009fxÔgV¸\u0019Zâ\t''ç\u0010\"~ÚÞ\u0084T\u0098\u008a\u0093Lâ\u00ad²)H[ °\u0000ÆÎà,\u000bÝÕZiÃ=&¤ëJ[\u0086hb\u009b\u0013T\u008f\u009a\u009f\u0095ºzÒZ\u0010\u009cáVÅ\u000eà]\u0013©ì\n\u008e+£\u0081|\u0010·\nKU\u0084(\u008br\tPS Zµ\u0006\u0096\u0010\u009aò\u0082B_à(gô\u009aÎ\u0015üÛkÀ";
      int var17 = "U(E®¡íE·¢yiS(;ßØ(!\u008e¯³yè8Û\u0018¶,\u0094o1\u0010\u0010»\r\u001cËû\r1\u0002ÓçÛ©\u001c/\rr\u0010aP¯pÞÏ#¯FÖÂkª3ÐÍ\u0010}yh(ºà0&\u009cÑ#0\u0085OÐ\u0091\u0010HÐÌè²\u0007:ýw#\u0013ø+\u0016@~\u0010\u0098Ò\u007fõ\u0005àÞþiðõ6\u008f:yl\u0010.ã\u007f\u009fxÔgV¸\u0019Zâ\t''ç\u0010\"~ÚÞ\u0084T\u0098\u008a\u0093Lâ\u00ad²)H[ °\u0000ÆÎà,\u000bÝÕZiÃ=&¤ëJ[\u0086hb\u009b\u0013T\u008f\u009a\u009f\u0095ºzÒZ\u0010\u009cáVÅ\u000eà]\u0013©ì\n\u008e+£\u0081|\u0010·\nKU\u0084(\u008br\tPS Zµ\u0006\u0096\u0010\u009aò\u0082B_à(gô\u009aÎ\u0015üÛkÀ".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
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
                  c = new String[14];
                  g = new HashMap(13);
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
                  String var4 = "\u001eµÓtº\u0007\u009aæê]_¹\u008cÆÅ\u0080ôCÄ&Yß·øóU\u000e\tA\u009b\u0015£";
                  int var5 = "\u001eµÓtº\u0007\u009aæê]_¹\u008cÆÅ\u0080ôCÄ&Yß·øóU\u000e\tA\u009b\u0015£".length();
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
                              f = new Integer[6];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "|\u0099\u00ad?\u0013]\u0080âÀ;F1d»\u007fí";
                           var5 = "|\u0099\u00ad?\u0013]\u0080âÀ;F1d»\u007fí".length();
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

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var28;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "-6¨|ß>Qÿ·Dß^ä®ä\u0084\u0010\u0084ê\u0003\u0015c\nP\u00897\u0018Ùc\u0082\u007fþ\u000e";
               var17 = "-6¨|ß>Qÿ·Dß^ä®ä\u0084\u0010\u0084ê\u0003\u0015c\nP\u00897\u0018Ùc\u0082\u007fþ\u000e".length();
               var14 = 16;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2132;
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
            throw new RuntimeException("su/catlean/qi", var10);
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
         throw new RuntimeException("su/catlean/qi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27753;
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
            throw new RuntimeException("su/catlean/qi", var14);
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
         throw new RuntimeException("su/catlean/qi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
