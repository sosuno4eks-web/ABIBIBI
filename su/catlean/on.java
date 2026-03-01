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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_2627;
import net.minecraft.class_3965;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.ScreenEvent;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.AfterElytraEvent;
import su.catlean.api.event.events.player.JumpEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreElytraEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.api.event.events.world.FireWorkVelocityEvent;
import su.catlean.gofra.Flow;

public final class on extends k9 {
   @NotNull
   public static final on M;
   static final KProperty[] e;
   @NotNull
   private static final zr i;
   @NotNull
   private static final zc Q;
   @NotNull
   private static final zc y;
   @NotNull
   private static final zo z;
   @NotNull
   private static final zo P;
   @NotNull
   private static final zo X;
   @NotNull
   private static final z0 o;
   private static boolean l;
   private static int R;
   @NotNull
   private static n A;
   private static float n;
   private static final long b = j0.a(-1392414259150724776L, 5637292118441099141L, MethodHandles.lookup().lookupClass()).a(255519421190072L);
   private static final String[] c;
   private static final String[] d;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] k;
   private static final Map m;

   private on(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 92947900116499L;
      super(var3, true.y<invokedynamic>(9253, 1829677205809500961L ^ var1), pa.c(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final bl x(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 23949454259229L;
      int var3 = (int)((var1 ^ 23949454259229L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (bl)i.k((short)var3, this, e[0], (short)var4, var5);
   }

   private final float M(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 60881828234095L;
      int var3 = (int)((var1 ^ 60881828234095L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)Q.k((short)var3, this, e[1], (short)var4, var5)).floatValue();
   }

   private final float Q(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 83533534763429L;
      int var3 = (int)((var1 ^ 83533534763429L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)y.k((short)var3, this, e[2], (short)var4, var5)).floatValue();
   }

   private final boolean c(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 46550292874560L;
      int var3 = (int)((var1 ^ 46550292874560L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)z.k((short)var3, this, e[3], (short)var4, var5);
   }

   private final boolean K(int var1, char var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 25554541285094L;
      int var6 = (int)((var4 ^ 25554541285094L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)P.k((short)var6, this, e[4], (short)var7, var8);
   }

   private final boolean s(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 73411204510747L;
      int var3 = (int)((var1 ^ 73411204510747L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)X.k((short)var3, this, e[5], (short)var4, var5);
   }

   private final int W(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 20488203281553L;
      int var3 = (int)((var1 ^ 20488203281553L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)o.k((short)var3, this, e[true.c<invokedynamic>(17385, 3610915837881624990L ^ var1)], (short)var4, var5)).intValue();
   }

   public void n(long var1) {
      R = 0;
   }

   @Flow
   private final void h(ScreenEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void D(JumpEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow(
      priority = -10
   )
   private final void O(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void c(FireWorkVelocityEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void z(PreElytraEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void F(AfterElytraEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void g(SetPoseEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void l(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean r() {
      long var0 = b ^ 40246827912869L;
      long var2 = var0 ^ 3997379446885L;

      boolean var10000;
      try {
         if (M.x(var2) == bl.ELYTRA) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, -5776045580952160334L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final boolean u() {
      long var0 = b ^ 103652663173197L;
      long var2 = var0 ^ 133579986921101L;

      boolean var10000;
      try {
         if (M.x(var2) == bl.ELYTRA) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, 89834475104180570L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final boolean H() {
      long var0 = b ^ 56664063435433L;
      long var2 = var0 ^ 22751093924969L;

      boolean var10000;
      try {
         if (M.x(var2) == bl.ELYTRA) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, 4889583416437070782L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final boolean b() {
      long var0 = b ^ 120046641535192L;
      long var2 = var0 ^ 81460747607576L;

      boolean var10000;
      try {
         if (M.x(var2) == bl.ELYTRA) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, -456529796463271473L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final Unit K(fy var0, class_2627 var1) {
      long var2 = b ^ 96242508820775L;
      long var4 = var2 ^ 114379931172593L;
      long var6 = var2 ^ 7369149043537L;
      s8.r(var4).method_2896(s8.f(var6), class_1268.field_5808, new class_3965(var0.p(), var0.s(), var1.method_11016(), false));
      s8.f(var6).method_6104(class_1268.field_5808);
      on var10000 = M;
      l = true;
      return Unit.INSTANCE;
   }

   private static final void G() {
      long var0 = b ^ 63762032845351L;
      long var2 = var0 ^ 56508009669363L;
      long var10001 = var0 ^ 81727802454146L;
      int var4 = (int)((var0 ^ 81727802454146L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);

      try {
         if (!_j.O(true.c<invokedynamic>(23690, 7324219419315413731L ^ var0), var2)) {
            s8.H((short)var4, (short)var5, var6).field_1690.field_1903.method_23481(false);
         }

      } catch (NumberFormatException var7) {
         throw var7.A<invokedynamic>(var7, 4851854829738351408L, var0);
      }
   }

   static {
      long var20 = b ^ 139671104426791L;
      long var22 = var20 ^ 61009485929789L;
      long var24 = var20 ^ 122749675356423L;
      long var26 = var20 ^ 137786846750280L;
      long var28 = var20 ^ 37619559355400L;
      long var30 = var20 ^ 74800827936748L;
      long var10001 = var20 ^ 14837840888383L;
      int var32 = (int)((var20 ^ 14837840888383L) >>> 48);
      int var33 = (int)(var10001 << 16 >>> 32);
      int var34 = (int)(var10001 << 48 >>> 48);
      long var35 = var20 ^ 17609459176443L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[30];
      int var16 = 0;
      String var15 = "0òJ3ÞUÉÛý\u0085üÀsbH¤zJ\u008b\u001a\u001f\u0006Fjî\r\u000f\u0010Jù\u0097|(\u0093®ôô¬æ[\u0000³X\u0097\u0087ÍS4+(Õ\u0088¬Áü\u0002Å«5ñ\fÎ\u0098ä\u0003\u0007íÇ¦ya,P\u0018ª1\u009aÝ`Å@)óû;zÇMû\u000b\u0003¬BVÒ6m\u0093\u0010`\u0093vó^.âéa½ÖdhÊNÙ(z\u008f\u009c\u0082\u008c\u000b\u009f\u0012±?£·¢U\u0010ËHÓá\u000b¤\u0090a³rY6\u0011Û\u009c\u0098åc\u008a\u00864£lU¹ ÎÓ\u001f\u0005)\r\u0081¹µ9²4\u009bðs1½,Gâ\u0093\u0012\u007fyá¥\u0004\u008a5L¼\u008b \f\u0001©ãþ$(\u0018t\u0093ë0c¨Íd^?òJ¯núòõ%å\u001d\r\u001amµ(u)Ð<Ñ4<ÍÃµ\u0002Fï\u0019{AfÅ¥eõ\u0013\u0081\u009e\u008f¾Yå÷¹¢F¥S?Þjp+\u0081(\u0012\u0093êM¶muÀd¹[\u0097xb\u001d®ÿfe\u0006µf\u0092ÐP\u009b\\\u0005\u0086\u0093\u009cÊ\u0093Á6Ýâ=\u00adñ \u0013\u0015\u001e\u001eG¨\u0080ðß\u0000Þ\u009ezâþÔòâ\f\u0080#7X,Û 5Y\u009e\u008fØM \u0098\u007få¤äsÚä\u0098±\u0082£Ê8üîxlÕ·\u001b\u001e}SØ=çÁ¬óO5\u0010¥úÞL\u008fF£¤\u0007l}<Î\u0098\u0086%\u0018ö^¢ø\u0085^çîïñ¾Ã\u0099^h©mðþòá~Ê$ {]ÈZÔð\u0001Á Q£D\ra.\\KMþÏ\u0094RD\u00188\rZ\u0080]63\u0093(ÄÄ¬+:âæ\u0080ÎÕ\u0088Û¥z3\u0090À4¶\u001aÞl@y0çýìÉ2Û\u0015ÛfÉ7Q{ÊS(Ë£çx³^\u0017B\u0013jcCZºM(ÊÒO\u0095åºé×\u001cYçoy½Bérü\u000eb\u00005ù¥(\u008eXg è\u0001\u0086\u0089\u0092t8ÄTDÇO\tÚd\u008ap\u0018Üï½\u0093¿ÍsZÌ¬ÕÙ8udIé\u0097\u00185¸£M&\u000fU!\u0086<}4ì\u0091\u0010CÎsÏ°\u00adßPÁ(Û²O\u0005\u001bQÁ£àÚ\u009c\u008b\u0012|Ôa6\u008c8)mõÁ\u009a13\u0096j\u0001ÛUØ×Y\u009c«³$\u0007) \u009d>%×\u0006)h1ªVp\u0005\u0087}Ç[J\u0097\u0091\\\u008aý\t\u001e\b'NkK#ø\u0005\u0010Cx\u0086gSË\u0017¥Ñ¡\u0092ýbhCJ(ÌÜ\u0011¨ÊÄÍ\u001cXS\u001d\bYW<\u001720w\u0017áå\u0017!-ÚÂ \u001b\u000e\u0018\u0082÷Þ\u0017\u001d!TQÙ\u0010õ\u0091\u009dåI\rao¾Âvª°\u0013õö ñþr\u0091 Ò\u000fUoø:\u0003:\u009b7Á¦T½Ú\u0093¢dKñÜ¬ÁÏ@\u0084ª\u0018\u000bw_\u0012$ù\u0084:H\\R#SýÂ¸êhñ\u008b\t7V¶\u0018\u0017\u000bá¶\u0005`\u0019Ç.î\u0004IÚ\u0080'\\ÌûÊwü\u0090÷ 8*\u009a\u0012Äiä\u0014\u007f¶R'\u0005\u007fÐÒ:?©#·Q³dAo÷PqH¹ôûEò¹\u00adâ\u0017ÞRû¦xÊi¡¨>yÆ©÷4\u009e\u0003H qº\u0013à\rp+ \u009ab1\\ÜÜ£k\u001f£\u00895qH?\u008dgY]w»\u0012Þ\t";
      int var17 = "0òJ3ÞUÉÛý\u0085üÀsbH¤zJ\u008b\u001a\u001f\u0006Fjî\r\u000f\u0010Jù\u0097|(\u0093®ôô¬æ[\u0000³X\u0097\u0087ÍS4+(Õ\u0088¬Áü\u0002Å«5ñ\fÎ\u0098ä\u0003\u0007íÇ¦ya,P\u0018ª1\u009aÝ`Å@)óû;zÇMû\u000b\u0003¬BVÒ6m\u0093\u0010`\u0093vó^.âéa½ÖdhÊNÙ(z\u008f\u009c\u0082\u008c\u000b\u009f\u0012±?£·¢U\u0010ËHÓá\u000b¤\u0090a³rY6\u0011Û\u009c\u0098åc\u008a\u00864£lU¹ ÎÓ\u001f\u0005)\r\u0081¹µ9²4\u009bðs1½,Gâ\u0093\u0012\u007fyá¥\u0004\u008a5L¼\u008b \f\u0001©ãþ$(\u0018t\u0093ë0c¨Íd^?òJ¯núòõ%å\u001d\r\u001amµ(u)Ð<Ñ4<ÍÃµ\u0002Fï\u0019{AfÅ¥eõ\u0013\u0081\u009e\u008f¾Yå÷¹¢F¥S?Þjp+\u0081(\u0012\u0093êM¶muÀd¹[\u0097xb\u001d®ÿfe\u0006µf\u0092ÐP\u009b\\\u0005\u0086\u0093\u009cÊ\u0093Á6Ýâ=\u00adñ \u0013\u0015\u001e\u001eG¨\u0080ðß\u0000Þ\u009ezâþÔòâ\f\u0080#7X,Û 5Y\u009e\u008fØM \u0098\u007få¤äsÚä\u0098±\u0082£Ê8üîxlÕ·\u001b\u001e}SØ=çÁ¬óO5\u0010¥úÞL\u008fF£¤\u0007l}<Î\u0098\u0086%\u0018ö^¢ø\u0085^çîïñ¾Ã\u0099^h©mðþòá~Ê$ {]ÈZÔð\u0001Á Q£D\ra.\\KMþÏ\u0094RD\u00188\rZ\u0080]63\u0093(ÄÄ¬+:âæ\u0080ÎÕ\u0088Û¥z3\u0090À4¶\u001aÞl@y0çýìÉ2Û\u0015ÛfÉ7Q{ÊS(Ë£çx³^\u0017B\u0013jcCZºM(ÊÒO\u0095åºé×\u001cYçoy½Bérü\u000eb\u00005ù¥(\u008eXg è\u0001\u0086\u0089\u0092t8ÄTDÇO\tÚd\u008ap\u0018Üï½\u0093¿ÍsZÌ¬ÕÙ8udIé\u0097\u00185¸£M&\u000fU!\u0086<}4ì\u0091\u0010CÎsÏ°\u00adßPÁ(Û²O\u0005\u001bQÁ£àÚ\u009c\u008b\u0012|Ôa6\u008c8)mõÁ\u009a13\u0096j\u0001ÛUØ×Y\u009c«³$\u0007) \u009d>%×\u0006)h1ªVp\u0005\u0087}Ç[J\u0097\u0091\\\u008aý\t\u001e\b'NkK#ø\u0005\u0010Cx\u0086gSË\u0017¥Ñ¡\u0092ýbhCJ(ÌÜ\u0011¨ÊÄÍ\u001cXS\u001d\bYW<\u001720w\u0017áå\u0017!-ÚÂ \u001b\u000e\u0018\u0082÷Þ\u0017\u001d!TQÙ\u0010õ\u0091\u009dåI\rao¾Âvª°\u0013õö ñþr\u0091 Ò\u000fUoø:\u0003:\u009b7Á¦T½Ú\u0093¢dKñÜ¬ÁÏ@\u0084ª\u0018\u000bw_\u0012$ù\u0084:H\\R#SýÂ¸êhñ\u008b\t7V¶\u0018\u0017\u000bá¶\u0005`\u0019Ç.î\u0004IÚ\u0080'\\ÌûÊwü\u0090÷ 8*\u009a\u0012Äiä\u0014\u007f¶R'\u0005\u007fÐÒ:?©#·Q³dAo÷PqH¹ôûEò¹\u00adâ\u0017ÞRû¦xÊi¡¨>yÆ©÷4\u009e\u0003H qº\u0013à\rp+ \u009ab1\\ÜÜ£k\u001f£\u00895qH?\u008dgY]w»\u0012Þ\t".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var38 = var15.substring(var13, var13 + var14);
         byte var40 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var38.getBytes("ISO-8859-1"));
            String var45 = b(var19).intern();
            switch(var40) {
            case 0:
               var18[var16++] = var45;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[30];
                  m = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[14];
                  int var3 = 0;
                  String var4 = "Ì½!wÌý\u008f\u0004®<êÖZ> ÉM/é8]{l\u0085ü!`ß\u001eñ`¤¥ºgÏkD\u008b\u0016g1y%í²ø\u0001\u000bv\u0080A¹\u0092\u008a¨\u008a)UÄB\u008c\u0087³¿ù\u008erú²U²)õ\u0081À\u000ei\u001f\u009bn<\u0089B\u0089C £azæÙÔô\u0084Þ";
                  int var5 = "Ì½!wÌý\u008f\u0004®<êÖZ> ÉM/é8]{l\u0085ü!`ß\u001eñ`¤¥ºgÏkD\u008b\u0016g1y%í²ø\u0001\u000bv\u0080A¹\u0092\u008a¨\u008a)UÄB\u008c\u0087³¿ù\u008erú²U²)õ\u0081À\u000ei\u001f\u009bn<\u0089B\u0089C £azæÙÔô\u0084Þ".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var44 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var44, var2).getBytes("ISO-8859-1");
                     long[] var41 = var6;
                     var44 = var3++;
                     long var47 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var48 = -1;

                     while(true) {
                        long var8 = var47;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var50 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var48) {
                        case 0:
                           var41[var44] = var50;
                           if (var2 >= var5) {
                              g = var6;
                              k = new Integer[14];
                              KProperty[] var37 = new KProperty[true.c<invokedynamic>(22240, 5210836132146043278L ^ var20)];
                              var37[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(on.class, true.y<invokedynamic>(591, 4060722968830587750L ^ var20), true.y<invokedynamic>(14941, 4243350630971935612L ^ var20), 0)));
                              var37[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(on.class, true.y<invokedynamic>(12066, 956132374854966815L ^ var20), true.y<invokedynamic>(21854, 5960590679105266804L ^ var20), 0)));
                              var37[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(on.class, true.y<invokedynamic>(22722, 5403583958806784502L ^ var20), true.y<invokedynamic>(22890, 5505964015766956118L ^ var20), 0)));
                              var37[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(on.class, true.y<invokedynamic>(1822, 5554553949930337851L ^ var20), true.y<invokedynamic>(15511, 6975402004026756516L ^ var20), 0)));
                              var37[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(on.class, true.y<invokedynamic>(27994, 7107961644943170678L ^ var20), true.y<invokedynamic>(20055, 7926004228339302253L ^ var20), 0)));
                              var37[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(on.class, true.y<invokedynamic>(5719, 943434533888468837L ^ var20), true.y<invokedynamic>(7940, 9132245940666740259L ^ var20), 0)));
                              var37[true.c<invokedynamic>(11974, 9121133562007167402L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(on.class, true.y<invokedynamic>(21422, 8631721636266992270L ^ var20), true.y<invokedynamic>(17493, 4256200574729188718L ^ var20), 0)));
                              e = var37;
                              M = new on(var26);
                              i = qi.M((il)M, true.y<invokedynamic>(20661, 6660737978364584323L ^ var20), (Enum)bl.VANILLA, (pj)null, (Function0)null, true.c<invokedynamic>(9203, 1774913307112942748L ^ var20), (Object)null, var28);
                              Q = qi.g((il)M, true.y<invokedynamic>(5109, 1628960481777394395L ^ var20), 0.42F, RangesKt.rangeTo(0.1F, 20.0F), (pj)null, (Function0)null, true.c<invokedynamic>(24191, 7360630102885683479L ^ var20), var30, (Object)null);
                              y = iw.j(qi.g((il)M, true.y<invokedynamic>(25672, 4070546633322616183L ^ var20), 0.0F, RangesKt.rangeTo(0.0F, 5.0F), (pj)null, (Function0)null, true.c<invokedynamic>(18957, 4285208968810448239L ^ var20), var30, (Object)null), 0.0F, var24, true.y<invokedynamic>(14138, 523608294587303445L ^ var20));
                              z = qi.R((il)M, true.y<invokedynamic>(19643, 1266102771549633930L ^ var20), false, (pj)null, on::r, 4, var35, (Object)null);
                              P = qi.R((il)M, true.y<invokedynamic>(6017, 7076374876679546540L ^ var20), false, (pj)null, on::u, 4, var35, (Object)null);
                              X = qi.R((il)M, true.y<invokedynamic>(6182, 8659923095283771667L ^ var20), false, (pj)null, on::H, 4, var35, (Object)null);
                              o = qi.o((il)M, true.y<invokedynamic>(20306, 8862006639495708268L ^ var20), 2, new IntRange(1, true.c<invokedynamic>(28406, 2438048555306770839L ^ var20)), var22, (pj)null, on::b, true.c<invokedynamic>(2296, 5930754325984348053L ^ var20), (Object)null);
                              A = new n((char)var32, var33, (char)var34);
                              return;
                           }
                           break;
                        default:
                           var41[var44] = var50;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "é)\u009e\u0082QtâTË\u009eÉZ\n\fÙ\u0080";
                           var5 = "é)\u009e\u0082QtâTË\u009eÉZ\n\fÙ\u0080".length();
                           var2 = 0;
                        }

                        var44 = var2;
                        var2 += 8;
                        var7 = var4.substring(var44, var2).getBytes("ISO-8859-1");
                        var41 = var6;
                        var44 = var3++;
                        var47 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var48 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var45;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "Nª\rù\u0093\u0007ý\u007f\u0099\u009f\\b\u0095M»G±äx¯\u0018ìÉ\u008b9-\u0018\u001e\u008fÌ\u009e%ý7\u0086',ã³\u009dJè;Éê?XÁ\u0088³¹\u0085\u009ciÇA\u0010ýlÑÀ\u008b\u00117w\u0099YÁ¿{\u0005\u0081Æ";
               var17 = "Nª\rù\u0093\u0007ý\u007f\u0099\u009f\\b\u0095M»G±äx¯\u0018ìÉ\u008b9-\u0018\u001e\u008fÌ\u009e%ý7\u0086',ã³\u009dJè;Éê?XÁ\u0088³¹\u0085\u009ciÇA\u0010ýlÑÀ\u008b\u00117w\u0099YÁ¿{\u0005\u0081Æ".length();
               var14 = '8';
               var13 = -1;
            }

            ++var13;
            var38 = var15.substring(var13, var13 + var14);
            var40 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 614;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/on", var10);
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
         throw new RuntimeException("su/catlean/on" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15423;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/on", var14);
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
         throw new RuntimeException("su/catlean/on" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
