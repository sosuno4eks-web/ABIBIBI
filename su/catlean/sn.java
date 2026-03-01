package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import net.minecraft.class_1792;
import net.minecraft.class_2248;
import net.minecraft.class_332;
import net.minecraft.class_7922;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class sn extends s4 {
   @NotNull
   public static final sn G;
   @NotNull
   private static final List T;
   @Nullable
   private static dx m;
   @Nullable
   private static dx z;
   @Nullable
   private static dx j;
   private static boolean t;
   @Nullable
   private static d3 u;
   @Nullable
   private static d3 x;
   @NotNull
   private static final aa R;
   @NotNull
   private static final aa F;
   @NotNull
   private static final aa a;
   private static boolean W;
   private static float i;
   @NotNull
   private static final dj v;
   @NotNull
   private static final dj E;
   @NotNull
   private static final dj q;
   @NotNull
   private static final dj g;
   @NotNull
   private static final dj H;
   @NotNull
   private static final dj O;
   @NotNull
   private static final dj M;
   private static boolean d;
   private static final long b = j0.a(-8765966005393502134L, 4503337001659256346L, MethodHandles.lookup().lookupClass()).a(85483674665653L);
   private static final String[] h;
   private static final String[] s;
   private static final Map w;
   private static final long[] B;
   private static final Integer[] D;
   private static final Map K;

   private sn(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 85715825352577L;
      int var3 = (int)((var1 ^ 85715825352577L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      super(true.u<invokedynamic>(26099, 9186235970723737066L ^ var1), (short)var3, var4, var5, 0.0F, 0.0F, 0.0F, 0.0F, true.a<invokedynamic>(7848, 6967562817413480690L ^ var1), (DefaultConstructorMarker)null);
   }

   @NotNull
   public final List I() {
      return T;
   }

   @Nullable
   public final dx g() {
      return m;
   }

   public final void G(@Nullable dx <set-?>) {
      m = var1;
   }

   @Nullable
   public final dx G() {
      return j;
   }

   public final void H(@Nullable dx <set-?>) {
      j = var1;
   }

   public final boolean M() {
      return t;
   }

   public final void y(boolean <set-?>) {
      t = var1;
   }

   @Nullable
   public final d3 f() {
      return u;
   }

   public final void i(@Nullable d3 <set-?>) {
      u = var1;
   }

   @Nullable
   public final d3 p() {
      return x;
   }

   public final void f(@Nullable d3 <set-?>) {
      x = var1;
   }

   @NotNull
   public final aa r() {
      return R;
   }

   public void y(long var1) {
      long var3 = var1 ^ 82925282239193L;
      long var5 = var1 ^ 112337561969038L;
      T.clear();
      Iterable var7 = (Iterable)pn.n.i(var3);
      boolean var8 = false;
      Iterator var9 = var7.iterator();

      while(var9.hasNext()) {
         Object var10 = var9.next();
         s6 var11 = (s6)var10;
         boolean var12 = false;
         sn var10000 = G;
         T.add(new d3(var5, var11));
         if (var1 > 0L && var1 > 0L) {
            continue;
         }
      }

   }

   public void X(@NotNull class_332 context, int mouseX, long a, int mouseY) {
      // $FF: Couldn't be decompiled
   }

   public void Z(int keyCode, int scanCode, int modifiers, long a) {
      // $FF: Couldn't be decompiled
   }

   public void T(float mX, float mY, int button, long a) {
      // $FF: Couldn't be decompiled
   }

   public void D(double mouseX, long a, double mouseY, double amount) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit U(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit g(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit w(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit d(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit N(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit c(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit k(dj param0) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit C() {
      long var0 = b ^ 108075796534084L;
      long var2 = var0 ^ 45740829466106L;
      pn var10000 = pn.n;
      sn var10001 = G;
      d3 var7 = u;
      Intrinsics.checkNotNull(var7);
      var10000.e(var2, var7.i());
      sn var6 = G;
      Collection var4 = (Collection)T;
      var6 = G;
      d3 var5 = u;
      TypeIntrinsics.asMutableCollection(var4).remove(var5);
      var6 = G;
      u = null;
      return Unit.INSTANCE;
   }

   static {
      long var31 = b ^ 80360544695342L;
      long var33 = var31 ^ 87574568836407L;
      long var35 = var31 ^ 49556747890966L;
      long var37 = var31 ^ 91742872943286L;
      long var10001 = var31 ^ 22436217063642L;
      int var39 = (int)((var31 ^ 22436217063642L) >>> 32);
      int var40 = (int)(var10001 << 32 >>> 48);
      int var41 = (int)(var10001 << 48 >>> 48);
      var10001 = var31 ^ 1369732530307L;
      int var42 = (int)((var31 ^ 1369732530307L) >>> 48);
      int var43 = (int)(var10001 << 16 >>> 48);
      int var44 = (int)(var10001 << 32 >>> 32);
      long var45 = var31 ^ 77705518845296L;
      w = new HashMap(13);
      false.A<invokedynamic>(false, -1345429454830787586L, var31);
      Cipher var22;
      Cipher var10000 = var22 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var23 = 1; var23 < 8; ++var23) {
         var10003[var23] = (byte)((int)(var31 << var23 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var29 = new String[33];
      int var27 = 0;
      String var26 = "\u0011L²\u0083-vØ&\u0006\u0010ÂNâd¹1 \u001f\\}\b\u001cÙ:ÿ)\u0091C\rËÁ>Ò`ýº\u001c\f\u009eË(RîÌË\u0001ê¥wµ\u00145¨Ôn:ËÅ`¤ùç¸\u0013\u000fHu\u008d \u0014ò?Ä=\u0084N÷Ô\"Ç\u0012\u00902N\u0081ðÄ²\u008d\u001eÐ+!\u0093\u008aØô¨è-{c+Ä2w\u001d»ÇÑÑ\u0095\u007fê9PåÅ¿£1¬ÌÊ:åÂ\u001aà\u009e\u00add\u008b\u0089\u0000\tÍÚ\u008dee\u0003º\u0084\u001b*Ï\u0016&\u0081\u0006\u0094\u0001SÁ8¸¼=*\u0012Ñ\u0091«\u008a¨¤Ìá\n\u000f\u0097[Óþc\u0007\u0098J;\u0012B_±)Pr\u0099\u0098ë¿\u001c±ª\b\u009føuÍ\u009e*×yÊ%E,YÒ\u0002\u0092À¢¹ rÕ¯'Y\u001e·\u0015äñ÷\u0098\u0010êiØ-s\u009d+³å,ä\u0019¶|ãw&Ü\u0010]\u007f\u0017¤\u009d\u0090lµIXæA?XÅx/@)\u0016ÙùZ\u0000J\u001b\u001ax&\u0006G\u0086\u00ad\u0092<Û\u0016¨S\u000b;6HX¨ðKg\u00041¤\u0090ÝSc]\u007fMÚykÒêòä\u008dÓ*â\u009agáç\u0089á\u008b\u000bYþÞ ·¤ß\u0007£tcôÙ\u0011h:®ëP!\u008b\u0095ßËU\ngC´\u0007(\n\u0003\u0011Ñ^¨eP#ÏjçþzÚð¿ªõö\u00ad>\u0019²\u0010!¨\u0096\u008f±a\u008e4(v`Dµ\u001cÁz\u0088\u008b\u0083ç\u0007ÉsæßìmªÂjþø[\u0094³À\u008c\u0014w\u0002\u0093ùÏ¾9ÏBnG¥Ò\u0019%\u0013âd\u0019ÝU\u0081\u0015Òug ¹¶\u0004h?Yü\u008aù\u0080hüÎÕü\u0005\u0083\u0088\u0006§\u001e]A\u0097\u007fé\u009a¨\u0012\u0080\u0015r\u008c\u0011XpP\u0099©\u001d*°\u0003\u009f.\u0090Êc+ÕÖ$\u0018c4ÓG\u009a\u0082\u009cb\r\u0085sè¿\u0015Ì\b`\u001cò>p\u0000FT\u0091\u0001éa\u008f/-½\u0002So\u0010£>êèx±\u00996\u0002Aè\u000b\u0006²ãÚ\u0010âá\u0014Vê\u0012ÿX{+M\u0018\u00ad×\u0000è \u0088\u00026\u0095¶\u0097fWg\u0016Z\u008dÏcõKÚÉÃMÇld¦\t\u009ehèÅtû~\u0010\u0094¼Ö-\u00987\u0080QAQ\u0095Vj\u008fz)\u0010¸K°\u0084lòS±KÞ\u008eS3ÉÀ¶\u0010NK\u0011¶rön¬gju\u008d¼¶ù\u0002\u00103ñÖ©¦±\u007f½\u008d9r]2}¯ò\u0010³$\u0086v²²ý`C(ô\u009cq\u009dðû nháîÝ_½S³ÝG2\u00922ÚY'ÞÃøt©rR\u009f6»3Ù-\u009cE\u0018å\u0016\u0019\u0003\u001cMúB=\u0004w.\u0001\u000f\u0099Û{\u0010I¿2Ð\u0010d\u0010\u0006'¼ÚÓ\u008bÆ°yWd\u000b'\u0016/î\u0010©êTcP\u001b,i\b~ä\u008bviw×(^y\u0006ÜRÀÓ\u001f£\u008d\u0088\u0085\u008e\u0097æãd\nòãq\u0086OÓ\u001e\u0007èØ\u0003ÞóúñFþ°v'\u0090Ù\u0010ç\u001d»\u000fN§+\b¹f\u0002\u000eR j\u001c\u0088H\u0017'ØîÔO\u0007}ä\u001e$]\u009f<\u009cÕ\u0085ö:ìÄ\u0007×\u009bßTè\u0086\u009fSV\u009d\u0084&\u0003\u0010e°À\u008a\u0014\u0015¨\u009d\u001fU\u0083\u0092ÔÔ\u0019§¨ßU\u008dùå.:`ÎQÑBdÙ\\\u001e\u0093Y®#û\u0088é5Rúm¥Ý\\\u0089Ø)oHEÒ!\u009chá]\u0093`m«Þ\u0086h\u007fG\u0082n\f|je4©=\u009fÌ5Rw¥Ai@¼F*vÚd\u0014¸\u009cg=\u0094Q\u0088\u0016ecÖã×¬ä\u001b¶\u0091\u000fadDY\u008f@\u0084ÐÁÛØÅ&Dì\u0095þD\u0012ã\u0091YO\u001aV[b§FAK\u0001Å÷½\u0005v\u000e\u0015ó\u0006iRcHÃÑò\u0091\u008cS\\Ý>ú\u000f\u008b\nÀ+xÐ\u0016\u0006¾n6^§T`h\u0085·\u0007\u0006\u0003VuùºH\u0003Ð.\u009aÈ¦©\u0014ï\u0001`/(Ý,\u0011%\nUÁBåÅ¡Ø\u0013\u008eès'\u0099gIõXÕ3\u001d\u008cÏÜ\u0090\u0010õr\u0098ËMâýKä\\éW\u0013÷\u001dÞ\u0010¾Jú[|Ø\u0010¬@õ\u0097)ÔfÀ\"\u0010yT\u00037êÃiL\u0014Ý¿\u0096\u001ar|Q\u0010\u009cS¦@}H\u009b\u0082(V9\u000eþ4¾\u0013\u0010Ò'òÃ\r\u001b§¹âtø«\u0082cµe\u0010\u0086zhk\u001fâ\u009eµ ¸òÃ ¹¬w\u0090&\u009a\u0093\u008cÛ\u0099ê\u009bx\u0010\u0085d#\u000b`ö\u001d\u0015\u008e\u0003[,Fc\u0016~g|j\u0007u\u008c_æ´§2µQ\u001dª^\n\u009fõ¦t\u001bóK+\t\u0014\u001cºî¾\u0012*\u0090\u007f·ªWÄB\u0016¡Ù\u001aþú(Â\rÒd\u0088ºÑ½¢\u0080n$\u0017;\u009f\u0089\u0000êÐb;u+u ×50!DOg§6&/\u0015w\u0082\u0014\bê\u0081~\u0011ü\u0006Ï_\u0093ây\u0091\u0092·ö\u00981éD\u0001D|ËîÍ[vF÷÷\u0010\u0090Ì\u0000\u0089ÃØ§\u001cêÎÿ\u009bBå?º\u0098ñKêã®Å»G»E®\u0016µØñÕS\u007f©&0MYãïâ®ÒÞ\u0084ËÙ\u0098Î\u0094Xüæ<÷Â\u001b¶Íú0\\Q\u0014¤\u0087\u009f\u008dd5x³±Pöã\u008bw\f»ij¥l$å\u0092ZTò¶\u0019\u001a±@L\u0084#J«jìo\u009f\u0001\u000e|\u008crê©ÌÕ\u009fÁ\u0017´Ôd\u009bç!øAþÎEuq£EÄÛÓ_jÒ=më\u008aYiW?r=\u001fòy5jâ\\øÉ£\u000b(nOKß\u0000T®)";
      int var28 = "\u0011L²\u0083-vØ&\u0006\u0010ÂNâd¹1 \u001f\\}\b\u001cÙ:ÿ)\u0091C\rËÁ>Ò`ýº\u001c\f\u009eË(RîÌË\u0001ê¥wµ\u00145¨Ôn:ËÅ`¤ùç¸\u0013\u000fHu\u008d \u0014ò?Ä=\u0084N÷Ô\"Ç\u0012\u00902N\u0081ðÄ²\u008d\u001eÐ+!\u0093\u008aØô¨è-{c+Ä2w\u001d»ÇÑÑ\u0095\u007fê9PåÅ¿£1¬ÌÊ:åÂ\u001aà\u009e\u00add\u008b\u0089\u0000\tÍÚ\u008dee\u0003º\u0084\u001b*Ï\u0016&\u0081\u0006\u0094\u0001SÁ8¸¼=*\u0012Ñ\u0091«\u008a¨¤Ìá\n\u000f\u0097[Óþc\u0007\u0098J;\u0012B_±)Pr\u0099\u0098ë¿\u001c±ª\b\u009føuÍ\u009e*×yÊ%E,YÒ\u0002\u0092À¢¹ rÕ¯'Y\u001e·\u0015äñ÷\u0098\u0010êiØ-s\u009d+³å,ä\u0019¶|ãw&Ü\u0010]\u007f\u0017¤\u009d\u0090lµIXæA?XÅx/@)\u0016ÙùZ\u0000J\u001b\u001ax&\u0006G\u0086\u00ad\u0092<Û\u0016¨S\u000b;6HX¨ðKg\u00041¤\u0090ÝSc]\u007fMÚykÒêòä\u008dÓ*â\u009agáç\u0089á\u008b\u000bYþÞ ·¤ß\u0007£tcôÙ\u0011h:®ëP!\u008b\u0095ßËU\ngC´\u0007(\n\u0003\u0011Ñ^¨eP#ÏjçþzÚð¿ªõö\u00ad>\u0019²\u0010!¨\u0096\u008f±a\u008e4(v`Dµ\u001cÁz\u0088\u008b\u0083ç\u0007ÉsæßìmªÂjþø[\u0094³À\u008c\u0014w\u0002\u0093ùÏ¾9ÏBnG¥Ò\u0019%\u0013âd\u0019ÝU\u0081\u0015Òug ¹¶\u0004h?Yü\u008aù\u0080hüÎÕü\u0005\u0083\u0088\u0006§\u001e]A\u0097\u007fé\u009a¨\u0012\u0080\u0015r\u008c\u0011XpP\u0099©\u001d*°\u0003\u009f.\u0090Êc+ÕÖ$\u0018c4ÓG\u009a\u0082\u009cb\r\u0085sè¿\u0015Ì\b`\u001cò>p\u0000FT\u0091\u0001éa\u008f/-½\u0002So\u0010£>êèx±\u00996\u0002Aè\u000b\u0006²ãÚ\u0010âá\u0014Vê\u0012ÿX{+M\u0018\u00ad×\u0000è \u0088\u00026\u0095¶\u0097fWg\u0016Z\u008dÏcõKÚÉÃMÇld¦\t\u009ehèÅtû~\u0010\u0094¼Ö-\u00987\u0080QAQ\u0095Vj\u008fz)\u0010¸K°\u0084lòS±KÞ\u008eS3ÉÀ¶\u0010NK\u0011¶rön¬gju\u008d¼¶ù\u0002\u00103ñÖ©¦±\u007f½\u008d9r]2}¯ò\u0010³$\u0086v²²ý`C(ô\u009cq\u009dðû nháîÝ_½S³ÝG2\u00922ÚY'ÞÃøt©rR\u009f6»3Ù-\u009cE\u0018å\u0016\u0019\u0003\u001cMúB=\u0004w.\u0001\u000f\u0099Û{\u0010I¿2Ð\u0010d\u0010\u0006'¼ÚÓ\u008bÆ°yWd\u000b'\u0016/î\u0010©êTcP\u001b,i\b~ä\u008bviw×(^y\u0006ÜRÀÓ\u001f£\u008d\u0088\u0085\u008e\u0097æãd\nòãq\u0086OÓ\u001e\u0007èØ\u0003ÞóúñFþ°v'\u0090Ù\u0010ç\u001d»\u000fN§+\b¹f\u0002\u000eR j\u001c\u0088H\u0017'ØîÔO\u0007}ä\u001e$]\u009f<\u009cÕ\u0085ö:ìÄ\u0007×\u009bßTè\u0086\u009fSV\u009d\u0084&\u0003\u0010e°À\u008a\u0014\u0015¨\u009d\u001fU\u0083\u0092ÔÔ\u0019§¨ßU\u008dùå.:`ÎQÑBdÙ\\\u001e\u0093Y®#û\u0088é5Rúm¥Ý\\\u0089Ø)oHEÒ!\u009chá]\u0093`m«Þ\u0086h\u007fG\u0082n\f|je4©=\u009fÌ5Rw¥Ai@¼F*vÚd\u0014¸\u009cg=\u0094Q\u0088\u0016ecÖã×¬ä\u001b¶\u0091\u000fadDY\u008f@\u0084ÐÁÛØÅ&Dì\u0095þD\u0012ã\u0091YO\u001aV[b§FAK\u0001Å÷½\u0005v\u000e\u0015ó\u0006iRcHÃÑò\u0091\u008cS\\Ý>ú\u000f\u008b\nÀ+xÐ\u0016\u0006¾n6^§T`h\u0085·\u0007\u0006\u0003VuùºH\u0003Ð.\u009aÈ¦©\u0014ï\u0001`/(Ý,\u0011%\nUÁBåÅ¡Ø\u0013\u008eès'\u0099gIõXÕ3\u001d\u008cÏÜ\u0090\u0010õr\u0098ËMâýKä\\éW\u0013÷\u001dÞ\u0010¾Jú[|Ø\u0010¬@õ\u0097)ÔfÀ\"\u0010yT\u00037êÃiL\u0014Ý¿\u0096\u001ar|Q\u0010\u009cS¦@}H\u009b\u0082(V9\u000eþ4¾\u0013\u0010Ò'òÃ\r\u001b§¹âtø«\u0082cµe\u0010\u0086zhk\u001fâ\u009eµ ¸òÃ ¹¬w\u0090&\u009a\u0093\u008cÛ\u0099ê\u009bx\u0010\u0085d#\u000b`ö\u001d\u0015\u008e\u0003[,Fc\u0016~g|j\u0007u\u008c_æ´§2µQ\u001dª^\n\u009fõ¦t\u001bóK+\t\u0014\u001cºî¾\u0012*\u0090\u007f·ªWÄB\u0016¡Ù\u001aþú(Â\rÒd\u0088ºÑ½¢\u0080n$\u0017;\u009f\u0089\u0000êÐb;u+u ×50!DOg§6&/\u0015w\u0082\u0014\bê\u0081~\u0011ü\u0006Ï_\u0093ây\u0091\u0092·ö\u00981éD\u0001D|ËîÍ[vF÷÷\u0010\u0090Ì\u0000\u0089ÃØ§\u001cêÎÿ\u009bBå?º\u0098ñKêã®Å»G»E®\u0016µØñÕS\u007f©&0MYãïâ®ÒÞ\u0084ËÙ\u0098Î\u0094Xüæ<÷Â\u001b¶Íú0\\Q\u0014¤\u0087\u009f\u008dd5x³±Pöã\u008bw\f»ij¥l$å\u0092ZTò¶\u0019\u001a±@L\u0084#J«jìo\u009f\u0001\u000e|\u008crê©ÌÕ\u009fÁ\u0017´Ôd\u009bç!øAþÎEuq£EÄÛÓ_jÒ=më\u008aYiW?r=\u001fòy5jâ\\øÉ£\u000b(nOKß\u0000T®)".length();
      char var25 = '(';
      int var24 = -1;

      label101:
      while(true) {
         ++var24;
         String var80 = var26.substring(var24, var24 + var25);
         byte var83 = -1;

         while(true) {
            byte[] var30 = var22.doFinal(var80.getBytes("ISO-8859-1"));
            String var86 = b(var30).intern();
            switch(var83) {
            case 0:
               var29[var27++] = var86;
               if ((var24 += var25) >= var28) {
                  h = var29;
                  s = new String[33];
                  K = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var12 = 1; var12 < 8; ++var12) {
                     var10003[var12] = (byte)((int)(var31 << var12 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[9];
                  int var14 = 0;
                  String var15 = ";Ú$8yËµ2Ü|\u0083§³·&\u0086\u0018\u0006ò¿s;%èrú\u0014zk\b\u009c>8®YuÆ«\u009b \u0083|\u008dÎRy}+½tÞ4C>,\u001d";
                  int var16 = ";Ú$8yËµ2Ü|\u0083§³·&\u0086\u0018\u0006ò¿s;%èrú\u0014zk\b\u009c>8®YuÆ«\u009b \u0083|\u008dÎRy}+½tÞ4C>,\u001d".length();
                  int var13 = 0;

                  label83:
                  while(true) {
                     int var87 = var13;
                     var13 += 8;
                     byte[] var18 = var15.substring(var87, var13).getBytes("ISO-8859-1");
                     long[] var82 = var17;
                     var87 = var14++;
                     long var89 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                     byte var90 = -1;

                     while(true) {
                        long var19 = var89;
                        byte[] var21 = var11.doFinal(new byte[]{(byte)((int)(var19 >>> 56)), (byte)((int)(var19 >>> 48)), (byte)((int)(var19 >>> 40)), (byte)((int)(var19 >>> 32)), (byte)((int)(var19 >>> 24)), (byte)((int)(var19 >>> 16)), (byte)((int)(var19 >>> 8)), (byte)((int)var19)});
                        long var93 = ((long)var21[0] & 255L) << 56 | ((long)var21[1] & 255L) << 48 | ((long)var21[2] & 255L) << 40 | ((long)var21[3] & 255L) << 32 | ((long)var21[4] & 255L) << 24 | ((long)var21[5] & 255L) << 16 | ((long)var21[6] & 255L) << 8 | (long)var21[7] & 255L;
                        switch(var90) {
                        case 0:
                           var82[var87] = var93;
                           if (var13 >= var16) {
                              B = var17;
                              D = new Integer[9];
                              Cipher var1;
                              var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var31 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var2 = 1; var2 < 8; ++var2) {
                                 var10003[var2] = (byte)((int)(var31 << var2 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long[] var0 = new long[3];
                              int var4 = 0;
                              String var5 = "ïéM%Rd²5ïéM%Rd²5Áy\u001f-JzxP";
                              int var6 = "ïéM%Rd²5ïéM%Rd²5Áy\u001f-JzxP".length();
                              int var3 = 0;

                              do {
                                 var87 = var3;
                                 var3 += 8;
                                 byte[] var7 = var5.substring(var87, var3).getBytes("ISO-8859-1");
                                 var87 = var4++;
                                 long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                                 byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                                 var93 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                                 boolean var95 = true;
                                 var0[var87] = var93;
                              } while(var3 < var6);

                              G = new sn(var45);
                              T = (List)(new ArrayList());
                              R = new aa(sa.OUT_QUINT, var0[0], (short)var42, (short)var43, var44);
                              F = new aa(sa.OUT_QUINT, var0[1], (short)var42, (short)var43, var44);
                              a = new aa(sa.OUT_QUINT, var0[2], (short)var42, (short)var43, var44);
                              v = new dj(var39, (char)var40, true.u<invokedynamic>(30982, 3484787794262811750L ^ var31), G.K(), (pl)null, (char)var41, sn::U, 4, (DefaultConstructorMarker)null);
                              E = new dj(var39, (char)var40, true.u<invokedynamic>(7059, 3387052355836282596L ^ var31), G.K(), (pl)null, (char)var41, sn::g, 4, (DefaultConstructorMarker)null);
                              var80 = 20891.u<invokedynamic>(20891, 4420632692358827242L ^ var31);
                              float var92 = G.K();
                              List var47 = (List)(new ArrayList());
                              float var62 = var92;
                              String var61 = var80;
                              boolean var49 = false;
                              class_7922 var94 = class_7923.field_41175;
                              Intrinsics.checkNotNullExpressionValue(var94, true.u<invokedynamic>(8648, 4653106673802951866L ^ var31));
                              Iterable var50 = (Iterable)var94;
                              boolean var52 = false;
                              Collection var54 = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(var50, true.a<invokedynamic>(10268, 1297773280530932536L ^ var31))));
                              boolean var55 = false;
                              Iterator var56 = var50.iterator();

                              Object var57;
                              boolean var60;
                              while(var56.hasNext()) {
                                 var57 = var56.next();
                                 class_2248 var58 = (class_2248)var57;
                                 var60 = false;
                                 var80 = var58.method_63499();
                                 Intrinsics.checkNotNullExpressionValue(var80, true.u<invokedynamic>(6818, 7875542074889373641L ^ var31));
                                 var54.add(StringsKt.replace$default(var80, true.u<invokedynamic>(10670, 5965799455426327766L ^ var31), "", false, 4, (Object)null));
                              }

                              var47.addAll((Collection)((List)var54));
                              var94 = class_7923.field_41178;
                              Intrinsics.checkNotNullExpressionValue(var94, true.u<invokedynamic>(25150, 3987125014396739L ^ var31));
                              var50 = (Iterable)var94;
                              var52 = false;
                              var54 = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(var50, true.a<invokedynamic>(10268, 1297773280530932536L ^ var31))));
                              var55 = false;
                              var56 = var50.iterator();

                              while(var56.hasNext()) {
                                 var57 = var56.next();
                                 class_1792 var78 = (class_1792)var57;
                                 var60 = false;
                                 var80 = var78.method_7876();
                                 Intrinsics.checkNotNullExpressionValue(var80, true.u<invokedynamic>(2537, 1318237022698476675L ^ var31));
                                 var54.add(StringsKt.replace$default(var80, true.u<invokedynamic>(4240, 5435672791668493812L ^ var31), "", false, 4, (Object)null));
                              }

                              var47.addAll((Collection)((List)var54));
                              var10001 = 4283661156929163949L ^ var31;
                              Unit var63 = Unit.INSTANCE;
                              pl var97 = new pl(var47, var37);
                              Function1 var65 = sn::w;
                              pl var66 = var97;
                              q = new dj(var61, var62, var66, var35, var65);
                              var80 = 20438.u<invokedynamic>(20438, var10001);
                              var92 = G.K();
                              Iterable var74 = (Iterable)sj.w.r();
                              var62 = var92;
                              var61 = var80;
                              boolean var48 = false;
                              Collection var75 = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(var74, true.a<invokedynamic>(10268, 1297773280530932536L ^ var31))));
                              boolean var51 = false;
                              Iterator var76 = var74.iterator();

                              while(var76.hasNext()) {
                                 Object var53 = var76.next();
                                 k9 var77 = (k9)var53;
                                 var55 = false;
                                 var75.add(var77.D());
                              }

                              List var79 = (List)var75;
                              pl var96 = new pl(var79, var37);
                              Function1 var70 = sn::d;
                              pl var71 = var96;
                              g = new dj(var61, var62, var71, var35, var70);
                              H = new dj(var39, (char)var40, true.u<invokedynamic>(27923, 8145957068206239861L ^ var31), G.K(), (pl)null, (char)var41, sn::N, 4, (DefaultConstructorMarker)null);
                              O = new dj(var39, (char)var40, true.u<invokedynamic>(7626, 1076329472062488755L ^ var31), G.K(), (pl)null, (char)var41, sn::c, 4, (DefaultConstructorMarker)null);
                              M = new dj(var39, (char)var40, true.u<invokedynamic>(11822, 1421344522138825556L ^ var31), G.K(), (pl)null, (char)var41, sn::k, 4, (DefaultConstructorMarker)null);
                              G.y(var33);
                              G.P(240.0F);
                              return;
                           }
                           break;
                        default:
                           var82[var87] = var93;
                           if (var13 < var16) {
                              continue label83;
                           }

                           var15 = "\u0093LpõÐ\u0010º\u0011©áÁá\u001cÈo\u0094";
                           var16 = "\u0093LpõÐ\u0010º\u0011©áÁá\u001cÈo\u0094".length();
                           var13 = 0;
                        }

                        var87 = var13;
                        var13 += 8;
                        var18 = var15.substring(var87, var13).getBytes("ISO-8859-1");
                        var82 = var17;
                        var87 = var14++;
                        var89 = ((long)var18[0] & 255L) << 56 | ((long)var18[1] & 255L) << 48 | ((long)var18[2] & 255L) << 40 | ((long)var18[3] & 255L) << 32 | ((long)var18[4] & 255L) << 24 | ((long)var18[5] & 255L) << 16 | ((long)var18[6] & 255L) << 8 | (long)var18[7] & 255L;
                        var90 = 0;
                     }
                  }
               }

               var25 = var26.charAt(var24);
               break;
            default:
               var29[var27++] = var86;
               if ((var24 += var25) < var28) {
                  var25 = var26.charAt(var24);
                  continue label101;
               }

               var26 = "\u0094æq\u008b\\6¼a\u009d×z2~Æ3ö\u000fè¼nké4C÷¬e¤ \u0090ðÜ\u0010\u009a%\tÉJGâH¬a\u0097>\u008c\u00ad\u000b\u000b";
               var28 = "\u0094æq\u008b\\6¼a\u009d×z2~Æ3ö\u000fè¼nké4C÷¬e¤ \u0090ðÜ\u0010\u009a%\tÉJGâH¬a\u0097>\u008c\u00ad\u000b\u000b".length();
               var25 = ' ';
               var24 = -1;
            }

            ++var24;
            var80 = var26.substring(var24, var24 + var25);
            var83 = 0;
         }
      }
   }

   public static void X(boolean var0) {
      d = var0;
   }

   public static boolean X() {
      return d;
   }

   public static boolean Q() {
      boolean var0 = X();

      try {
         return !var0;
      } catch (NoWhenBranchMatchedException var1) {
         throw a(var1);
      }
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29007;
      if (s[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])w.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               w.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/sn", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = h[var5].getBytes("ISO-8859-1");
         s[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return s[var5];
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
         throw new RuntimeException("su/catlean/sn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 26369;
      if (D[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = B[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])K.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               K.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/sn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         D[var3] = var15;
      }

      return D[var3];
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
         throw new RuntimeException("su/catlean/sn" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
