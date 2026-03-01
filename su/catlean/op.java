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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.world.EntitySpawn;
import su.catlean.gofra.Flow;

public final class op extends k9 {
   @NotNull
   public static final op K;
   static final KProperty[] R;
   @NotNull
   private static final z0 W;
   @NotNull
   private static final z7 C;
   @NotNull
   private static final zo b;
   @NotNull
   private static final zo m;
   @NotNull
   private static final zo y;
   @NotNull
   private static class_243 d;
   @NotNull
   private static iv A;
   private static final long c = j0.a(2745495021735007005L, 8312944967092699343L, MethodHandles.lookup().lookupClass()).a(109238707311867L);
   private static final String[] e;
   private static final String[] f;
   private static final Map g;
   private static final long[] i;
   private static final Integer[] k;
   private static final Map l;

   private op(char var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ c;
      long var6 = var4 ^ 47252021019977L;
      super(var6, true.l<invokedynamic>(9536, 5903612477151012649L ^ var4), pa.w(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final int m(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 8613675842692L;
      int var3 = (int)((var1 ^ 8613675842692L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)W.k((short)var3, this, R[0], (short)var4, var5)).intValue();
   }

   private final n_ k(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 27383797410422L;
      int var3 = (int)((var1 ^ 27383797410422L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (n_)C.k((short)var3, this, R[1], (short)var4, var5);
   }

   private final boolean L(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 22194972317722L;
      int var3 = (int)((var1 ^ 22194972317722L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)b.k((short)var3, this, R[2], (short)var4, var5);
   }

   private final boolean b(int var1, int var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ c;
      long var10001 = var4 ^ 81152475847818L;
      int var6 = (int)((var4 ^ 81152475847818L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)m.k((short)var6, this, R[3], (short)var7, var8);
   }

   private final boolean u(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 5457603573490L;
      int var3 = (int)((var1 ^ 5457603573490L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)y.k((short)var3, this, R[4], (short)var4, var5);
   }

   @Flow
   private final void g(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void b(EntitySpawn param1) {
      // $FF: Couldn't be decompiled
   }

   private static final void s(int var0) {
      long var1 = c ^ 33260386773633L;
      long var10001 = var1 ^ 2983014347848L;
      int var3 = (int)((var1 ^ 2983014347848L) >>> 56);
      int var4 = (int)(var10001 << 8 >>> 32);
      int var5 = (int)(var10001 << 40 >>> 40);
      dk.I.W((byte)var3, var0, var4, var5);
   }

   private static final void U(int param0) {
      // $FF: Couldn't be decompiled
   }

   private static final void H(int var0, int var1) {
      long var2 = c ^ 121257408701690L;
      long var4 = var2 ^ 100527382063779L;
      long var10001 = var2 ^ 126164409449011L;
      int var6 = (int)((var2 ^ 126164409449011L) >>> 56);
      int var7 = (int)(var10001 << 8 >>> 32);
      int var8 = (int)(var10001 << 40 >>> 40);
      long var9 = var2 ^ 31617152078L;
      dk.I.W((byte)var6, var0, var7, var8);
      _7.K(_7.V, K.m(var4), (byte)0, false, op::U, 2, var9, (Object)null);
   }

   private static final void e(int var0) {
      long var1 = c ^ 25160306008466L;
      long var10001 = var1 ^ 11083550130011L;
      int var3 = (int)((var1 ^ 11083550130011L) >>> 56);
      int var4 = (int)(var10001 << 8 >>> 32);
      int var5 = (int)(var10001 << 40 >>> 40);
      dk.I.W((byte)var3, var0, var4, var5);
   }

   private static final void V(int param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = c ^ 61582244581497L;
      long var22 = var20 ^ 113577499354234L;
      long var10001 = var20 ^ 62616289108001L;
      int var24 = (int)((var20 ^ 62616289108001L) >>> 32);
      int var25 = (int)(var10001 << 32 >>> 48);
      int var26 = (int)(var10001 << 48 >>> 48);
      var10001 = var20 ^ 86591650569384L;
      int var27 = (int)((var20 ^ 86591650569384L) >>> 32);
      int var28 = (int)(var10001 << 32 >>> 48);
      int var29 = (int)(var10001 << 48 >>> 48);
      var10001 = var20 ^ 74922016804428L;
      int var30 = (int)((var20 ^ 74922016804428L) >>> 48);
      long var31 = var10001 << 16 >>> 16;
      long var33 = var20 ^ 70595164465852L;
      g = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[28];
      int var16 = 0;
      String var15 = "Â¶+,Ó|n\u000bæ\u0017\u0080;å\u0005ÏV\u001aÞ\u000fG²\u0097Z5äÔ\u000f\u0010ì¡\u0084ºÐ\u009bUWG\u00ad33\u0085\u0097C\u009e\u0017ì\u0097¥\u0014ÁÈ\r\u0080\u008d'Q\u0090ÄtÎEyH\f]\u0001Øp\nw¼\u009e\u0089ËéÑ©Îj»+È\u0093@\u009a}\u0087l9\u0012\"\u0087uM\u0082pikùüLõP\u0013öñz½áVl_õr±TU\r\u0005\u0012(µÀ\u0080Ñ\n\\ú\u001aí\u008a\u008dØÕ7cÜjöóô-\u0012\u008aÞ\u009bêgL\u009b8sº\u0082¥\u000eIò<\u0096ï(\u0011L\u000eý$¾Ä\u0095H]\u009fÖl\u009c\u008f\u0091\u0094\u0019\\¹k \u009cö;¸ ì\u0012»\u0081pê©µUÚ\"ÜF\u0080RÃqÀô\u0012\u009bZí\u0096[Ï~ÞÄ[\u00102*\u009a\u0087çuÿ\u00811Âf\u0007Ì4\f\b\u009bT\u009cÎbY5ù8Êiô\u008a\u000b3©>¸ÒFGQ#PÎÈ\u0080\u0090\u0086QøËY\u0005ê\u0090]\u009a\u0081)PÞ[ìï\u0085éÄÁ©¨I\u001flª\"\u001e\u0080oÞ½5ìüã\u0082w\u0004\u001aß;\"\u0084I/\u00ad$°\u008b\\ÄÖR$\u0089¶\u0081ajI½'zÍ\u001e(ô{©\u008dB£ëN©í\u009e¤8ºv½\u0000\u0000mÜ\fþò\u0002\n/\u0005)Ö\fÉç\u008eÀHù¨\u0013¹å \u001e{´ö{éB¿¯-ÉUkÍ\u00ad\u009fHÄ\tÅÉ#`SÄ½a¾\u00001ï\u0086(sÄÐ¯\u0083\u008b\u0093\u001aRð\u0010¯¦9æzåØÓÌ\u0085:cQúö\u001dv\u008d¤¬!ë`ãÔ}ªøi\u0090ËámÖ\u0003\t\bs\u0006Ûw\f}ý\"\u0004 z»\u0099Ë\u0006§`G\u0001\u008a\u0082ê¡\u009a\u0004Y\u0013\n»¨\u0082\b\u0089õcC(S\u0088q>\u0018èÚ\u0001ÂÏ\u008a\u0095î\u001e!¡Oæ\u0099)î?ú\u009dëE\u0006\u0095÷\u0088\u001f¹Ð;\u0097'fu\u0018¸¦þçÀH4£ô#,\u0090 #\u00892MJZ`Tüµ¡·À°ä:v«\u00adíóÍ&:Y·Íø\u0095XÔ#F÷y\u009a±4×\u0007\u0095e7¸Ç°\u009a\" ï*W\u0019&\f=\u0004xDZ¬\u008e?\u0000A\u001a±\u00075ð5>0f\u0000\u0082\u0088\u001fÃ\u0095\u009a8Ä\u00ad\u0006@I\u0001I>©Åý'þõMaU\b]ç-~gêÌZ\u0001\u001c®uY¡\u007f\u0085Ã\u0093Ê9vÈò\u0099«Ë\u0010\u0016\u0012*vèæ%¤}Kå\u0088\t\u0005T-üä·C:\u001eº\u0019c\u0014\u0086|¤&&ho2\u0006£5à\u0089Éß(\u0099\u0095x\fëÚ\u0097ÿÂ\u0006M\u001c\u009e\u000fó·TIÂe\u009egO\u0005CÏÃ+V\u0007<]M[:\u000fæ\u0014ÍÎQf?Ú]<\u008d\u0081\bç\u0019\"!®/ª\u000fâQé\u00adp\u009dé\u00977k[×æ\u008buôÆ[þR\u0090\u0086Ø4OÍ=\u0091¼5\u008cµµiÉ`Ñ6;0¥KN6©\"/Þâ ñÀßáÀ\u001aÍ\u0004óáw\u0099ô\u009b\u0092L\u0098c¼AìtT³0?ÍÎGà¤\" ÅJójyèÝOÂ]ÖÈWd\u0093çc\u009b\t` q§ªk¿K35\u008c\u0084\u0091\u0088ñ\t\u0094±ÜþP\u008bY8ndø9¢5\u009c8Cú6®6R¸nÇä5\u0098-ÍS¥°KÊ\u00077ÿ\u00ad+êE\u0015\u001b\u0093\u0094 ½\u008b³\u0017ÑÀF¯ó\u008a\u0010\\\u0001ªÕ\u008f\u009a/iæ~øB?!{b=\u00173Õ§`\u001cÒñ+ÕÜôV\u008b\u00152\u0014\u0083\u0018æê§\u0010°¬\u0095#þ\u0005\u00adÞõlÆA\u0004¡©\u008c\u009aXÐ`éÌÅºc42\u0081Ø\u008då\u001d¢\u0006´\u0096 \u0019g¥\u0085\u001c\u001c\u0083h`\u008fyù-à÷\u009dþVu)t\u00101\u0084Ú*Að\u0088\u0017\u007fÚ ¹Ì©á$°d¥Ö\u001dü7Ã\u009e\b\u008aÖ!»íBE?ÁFX>y \u008eîY\u0010(tÏqAÛµ8öiKIy\u0016å\u001d ¦7Ar\u0094dnóì*\\\u008b°c\u000e¨Çó\u0082Y¢î\u0018Ø¸>\nê¡2Ö©\u0010·\u009bÇ\u0002H*±Ò\t\u008bsÞVW\u0099f\u00105 5\u009d}øh`\tÉ,\tÖÁù}\u0018{\u0088a(³\u0080Ùi<\r*¤b÷bqk®à2öµ\n´x\u00829\u0010Fß\u0097\u0003wÚ\u0088ô\u0005\u0083£i\u0003Üt&\u0081Vf\u000e\u00060É´Äo>\u0087ZEýî¹ \u009e¾ç;©\u008eúF\u0007°xÍ¨HÑ\u0094\\Ýû¡#hæø8\u0084ä\u0007\u0086¸[\f®\u008c>É\u009cL6üÑ¥ð]Büö$ö@úVZ~\u009eö \u0013Rv_|çMáÄb\u0001\f\fÏëjý9Iþ{8Q¾¤\u0007\u00189\u0098#¯ç|:$\u0089ÒX5bÊÞv¥vÖ\u0095ëW¤\n \u009f\u0012\u0096Ç\u0012TÄF¢D%\\ùQéÍÂ¦}K\u0099\u009b_qí\u009b#pà-ìÜ\u0018|W<\u0098\u009eï<!\u009dñÙÎ\u001f6\"£h7õÕÐ\u001c\u0098- X¢|\u0013ÜÁ\u0098\u0005ø\u008d3\u0010\u009eüOx\u000e\u0099F\u0094\r\u0015t¼ÊRD9¾Êª;";
      int var17 = "Â¶+,Ó|n\u000bæ\u0017\u0080;å\u0005ÏV\u001aÞ\u000fG²\u0097Z5äÔ\u000f\u0010ì¡\u0084ºÐ\u009bUWG\u00ad33\u0085\u0097C\u009e\u0017ì\u0097¥\u0014ÁÈ\r\u0080\u008d'Q\u0090ÄtÎEyH\f]\u0001Øp\nw¼\u009e\u0089ËéÑ©Îj»+È\u0093@\u009a}\u0087l9\u0012\"\u0087uM\u0082pikùüLõP\u0013öñz½áVl_õr±TU\r\u0005\u0012(µÀ\u0080Ñ\n\\ú\u001aí\u008a\u008dØÕ7cÜjöóô-\u0012\u008aÞ\u009bêgL\u009b8sº\u0082¥\u000eIò<\u0096ï(\u0011L\u000eý$¾Ä\u0095H]\u009fÖl\u009c\u008f\u0091\u0094\u0019\\¹k \u009cö;¸ ì\u0012»\u0081pê©µUÚ\"ÜF\u0080RÃqÀô\u0012\u009bZí\u0096[Ï~ÞÄ[\u00102*\u009a\u0087çuÿ\u00811Âf\u0007Ì4\f\b\u009bT\u009cÎbY5ù8Êiô\u008a\u000b3©>¸ÒFGQ#PÎÈ\u0080\u0090\u0086QøËY\u0005ê\u0090]\u009a\u0081)PÞ[ìï\u0085éÄÁ©¨I\u001flª\"\u001e\u0080oÞ½5ìüã\u0082w\u0004\u001aß;\"\u0084I/\u00ad$°\u008b\\ÄÖR$\u0089¶\u0081ajI½'zÍ\u001e(ô{©\u008dB£ëN©í\u009e¤8ºv½\u0000\u0000mÜ\fþò\u0002\n/\u0005)Ö\fÉç\u008eÀHù¨\u0013¹å \u001e{´ö{éB¿¯-ÉUkÍ\u00ad\u009fHÄ\tÅÉ#`SÄ½a¾\u00001ï\u0086(sÄÐ¯\u0083\u008b\u0093\u001aRð\u0010¯¦9æzåØÓÌ\u0085:cQúö\u001dv\u008d¤¬!ë`ãÔ}ªøi\u0090ËámÖ\u0003\t\bs\u0006Ûw\f}ý\"\u0004 z»\u0099Ë\u0006§`G\u0001\u008a\u0082ê¡\u009a\u0004Y\u0013\n»¨\u0082\b\u0089õcC(S\u0088q>\u0018èÚ\u0001ÂÏ\u008a\u0095î\u001e!¡Oæ\u0099)î?ú\u009dëE\u0006\u0095÷\u0088\u001f¹Ð;\u0097'fu\u0018¸¦þçÀH4£ô#,\u0090 #\u00892MJZ`Tüµ¡·À°ä:v«\u00adíóÍ&:Y·Íø\u0095XÔ#F÷y\u009a±4×\u0007\u0095e7¸Ç°\u009a\" ï*W\u0019&\f=\u0004xDZ¬\u008e?\u0000A\u001a±\u00075ð5>0f\u0000\u0082\u0088\u001fÃ\u0095\u009a8Ä\u00ad\u0006@I\u0001I>©Åý'þõMaU\b]ç-~gêÌZ\u0001\u001c®uY¡\u007f\u0085Ã\u0093Ê9vÈò\u0099«Ë\u0010\u0016\u0012*vèæ%¤}Kå\u0088\t\u0005T-üä·C:\u001eº\u0019c\u0014\u0086|¤&&ho2\u0006£5à\u0089Éß(\u0099\u0095x\fëÚ\u0097ÿÂ\u0006M\u001c\u009e\u000fó·TIÂe\u009egO\u0005CÏÃ+V\u0007<]M[:\u000fæ\u0014ÍÎQf?Ú]<\u008d\u0081\bç\u0019\"!®/ª\u000fâQé\u00adp\u009dé\u00977k[×æ\u008buôÆ[þR\u0090\u0086Ø4OÍ=\u0091¼5\u008cµµiÉ`Ñ6;0¥KN6©\"/Þâ ñÀßáÀ\u001aÍ\u0004óáw\u0099ô\u009b\u0092L\u0098c¼AìtT³0?ÍÎGà¤\" ÅJójyèÝOÂ]ÖÈWd\u0093çc\u009b\t` q§ªk¿K35\u008c\u0084\u0091\u0088ñ\t\u0094±ÜþP\u008bY8ndø9¢5\u009c8Cú6®6R¸nÇä5\u0098-ÍS¥°KÊ\u00077ÿ\u00ad+êE\u0015\u001b\u0093\u0094 ½\u008b³\u0017ÑÀF¯ó\u008a\u0010\\\u0001ªÕ\u008f\u009a/iæ~øB?!{b=\u00173Õ§`\u001cÒñ+ÕÜôV\u008b\u00152\u0014\u0083\u0018æê§\u0010°¬\u0095#þ\u0005\u00adÞõlÆA\u0004¡©\u008c\u009aXÐ`éÌÅºc42\u0081Ø\u008då\u001d¢\u0006´\u0096 \u0019g¥\u0085\u001c\u001c\u0083h`\u008fyù-à÷\u009dþVu)t\u00101\u0084Ú*Að\u0088\u0017\u007fÚ ¹Ì©á$°d¥Ö\u001dü7Ã\u009e\b\u008aÖ!»íBE?ÁFX>y \u008eîY\u0010(tÏqAÛµ8öiKIy\u0016å\u001d ¦7Ar\u0094dnóì*\\\u008b°c\u000e¨Çó\u0082Y¢î\u0018Ø¸>\nê¡2Ö©\u0010·\u009bÇ\u0002H*±Ò\t\u008bsÞVW\u0099f\u00105 5\u009d}øh`\tÉ,\tÖÁù}\u0018{\u0088a(³\u0080Ùi<\r*¤b÷bqk®à2öµ\n´x\u00829\u0010Fß\u0097\u0003wÚ\u0088ô\u0005\u0083£i\u0003Üt&\u0081Vf\u000e\u00060É´Äo>\u0087ZEýî¹ \u009e¾ç;©\u008eúF\u0007°xÍ¨HÑ\u0094\\Ýû¡#hæø8\u0084ä\u0007\u0086¸[\f®\u008c>É\u009cL6üÑ¥ð]Büö$ö@úVZ~\u009eö \u0013Rv_|çMáÄb\u0001\f\fÏëjý9Iþ{8Q¾¤\u0007\u00189\u0098#¯ç|:$\u0089ÒX5bÊÞv¥vÖ\u0095ëW¤\n \u009f\u0012\u0096Ç\u0012TÄF¢D%\\ùQéÍÂ¦}K\u0099\u009b_qí\u009b#pà-ìÜ\u0018|W<\u0098\u009eï<!\u009dñÙÎ\u001f6\"£h7õÕÐ\u001c\u0098- X¢|\u0013ÜÁ\u0098\u0005ø\u008d3\u0010\u009eüOx\u000e\u0099F\u0094\r\u0015t¼ÊRD9¾Êª;".length();
      char var14 = 'x';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var43 = var15.substring(var13, var13 + var14);
         byte var47 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var43.getBytes("ISO-8859-1"));
            String var51 = b(var19).intern();
            switch(var47) {
            case 0:
               var18[var16++] = var51;
               if ((var13 += var14) >= var17) {
                  e = var18;
                  f = new String[28];
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
                  String var4 = "\u00ad\u001cQB×£\u0087\u008c;Ìõae±\u0012÷[Q#Zö¥æe\u007f\r\u009eÉþT\u0017TÚÚÏÆc1ß\u009e";
                  int var5 = "\u00ad\u001cQB×£\u0087\u008c;Ìõae±\u0012÷[Q#Zö¥æe\u007f\r\u009eÉþT\u0017TÚÚÏÆc1ß\u009e".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var53 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var53, var2).getBytes("ISO-8859-1");
                     long[] var45 = var6;
                     var53 = var3++;
                     long var54 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var55 = -1;

                     while(true) {
                        long var8 = var54;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var57 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var55) {
                        case 0:
                           var45[var53] = var57;
                           if (var2 >= var5) {
                              i = var6;
                              k = new Integer[7];
                              KProperty[] var42 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(op.class, true.l<invokedynamic>(20604, 8562397698963195424L ^ var20), true.l<invokedynamic>(21234, 4457868743473710271L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(op.class, true.l<invokedynamic>(11391, 3901366133571959330L ^ var20), true.l<invokedynamic>(19155, 7366177785795533969L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(op.class, true.l<invokedynamic>(11738, 7940395465081076639L ^ var20), true.l<invokedynamic>(10885, 6122964753013554388L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(op.class, true.l<invokedynamic>(6084, 448634664664957323L ^ var20), true.l<invokedynamic>(1084, 519562411542155893L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(op.class, true.l<invokedynamic>(26138, 50579543451562056L ^ var20), true.l<invokedynamic>(26258, 4540313843047035096L ^ var20), 0)))};
                              R = var42;
                              K = new op((char)var30, var31);
                              W = qi.o((il)K, true.l<invokedynamic>(12606, 4523426428430526309L ^ var20), 0, new IntRange(0, true.r<invokedynamic>(11874, 4799365889908643215L ^ var20)), var22, (pj)null, (Function0)null, true.r<invokedynamic>(3197, 3111712818861979543L ^ var20), (Object)null);
                              il var46 = (il)K;
                              String var50 = 11173.l<invokedynamic>(11173, 2447608702602657249L ^ var20);
                              n_ var58 = new n_(0, var27, (char)var28, false, (char)var29, false, true.r<invokedynamic>(12321, 155110510868270029L ^ var20), (DefaultConstructorMarker)null);
                              int var10005 = 10744.r<invokedynamic>(10744, 1501537080929948177L ^ var20);
                              Object var35 = null;
                              int var36 = var10005;
                              Object var37 = null;
                              Object var38 = null;
                              n_ var39 = var58;
                              String var40 = var50;
                              il var41 = var46;
                              C = qi.b(var24, var41, var40, (char)var25, var39, (pj)var38, (Function0)var37, var36, var35, (short)var26);
                              b = qi.R((il)K, true.l<invokedynamic>(16516, 5942817276042761950L ^ var20), false, (pj)null, (Function0)null, true.r<invokedynamic>(7678, 9022547658559890961L ^ var20), var33, (Object)null);
                              m = qi.R((il)K, true.l<invokedynamic>(18675, 530089946006544044L ^ var20), false, (pj)null, (Function0)null, true.r<invokedynamic>(7678, 9022547658559890961L ^ var20), var33, (Object)null);
                              y = qi.R((il)K, true.l<invokedynamic>(29545, 4435844814192567610L ^ var20), false, (pj)null, (Function0)null, true.r<invokedynamic>(7678, 9022547658559890961L ^ var20), var33, (Object)null);
                              class_243 var48 = class_243.field_1353;
                              Intrinsics.checkNotNullExpressionValue(var48, true.l<invokedynamic>(20740, 7572017067165042525L ^ var20));
                              d = var48;
                              A = new iv();
                              return;
                           }
                           break;
                        default:
                           var45[var53] = var57;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "g\u00ad÷`º\u0005£\u0099fUG\u0002\u008d£ÚO";
                           var5 = "g\u00ad÷`º\u0005£\u0099fUG\u0002\u008d£ÚO".length();
                           var2 = 0;
                        }

                        var53 = var2;
                        var2 += 8;
                        var7 = var4.substring(var53, var2).getBytes("ISO-8859-1");
                        var45 = var6;
                        var53 = var3++;
                        var54 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var55 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var51;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "y§ì\fÕ7k×\u0015Î\u0019~\u008asûI½æÎÆ$%â'\u008e\u008a8¨ä\u0095QhXÔ)£\u0080Ù\n?\u0080\u009fv\u0091ëÌ~\f\u007f\"óEµ\u00022 D\u009e\u008c\u0098¨W\u0016W°ÇÓà \u0001ÜQ\u009f üª\u008aE\u0086¹ãi\u000fIÜYµÑå\u0096\u0006(Z\u0004\u001eL*µuÙ\u008bOÂô÷C\u00ad\u0093\u0093ûwv#\u008c©´\u0017ð\u0084ÆÝ;\u0007bèD\\p6ûm\u001f6$8\u0099×\u0092\u008a)[\u0016\u00ad\u0007Ä\u001fðû:·Ð«T÷\u0017p\u00ade\u0011c\u0086 `«\u0090\u0098\u001fu~";
               var17 = "y§ì\fÕ7k×\u0015Î\u0019~\u008asûI½æÎÆ$%â'\u008e\u008a8¨ä\u0095QhXÔ)£\u0080Ù\n?\u0080\u009fv\u0091ëÌ~\f\u007f\"óEµ\u00022 D\u009e\u008c\u0098¨W\u0016W°ÇÓà \u0001ÜQ\u009f üª\u008aE\u0086¹ãi\u000fIÜYµÑå\u0096\u0006(Z\u0004\u001eL*µuÙ\u008bOÂô÷C\u00ad\u0093\u0093ûwv#\u008c©´\u0017ð\u0084ÆÝ;\u0007bèD\\p6ûm\u001f6$8\u0099×\u0092\u008a)[\u0016\u00ad\u0007Ä\u001fðû:·Ð«T÷\u0017p\u00ade\u0011c\u0086 `«\u0090\u0098\u001fu~".length();
               var14 = '(';
               var13 = -1;
            }

            ++var13;
            var43 = var15.substring(var13, var13 + var14);
            var47 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 23639;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/op", var10);
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
         f[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
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
         throw new RuntimeException("su/catlean/op" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29168;
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
            throw new RuntimeException("su/catlean/op", var14);
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
         throw new RuntimeException("su/catlean/op" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
