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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_2596;
import net.minecraft.class_2879;
import net.minecraft.class_6880;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class o5 extends k9 {
   @NotNull
   public static final o5 m;
   static final KProperty[] C;
   @NotNull
   private static final zo o;
   @NotNull
   private static final zo k;
   @NotNull
   private static final zo g;
   @NotNull
   private static final zo n;
   @NotNull
   private static final z0 t;
   @NotNull
   private static final zo T;
   @NotNull
   private static final zr s;
   @NotNull
   private static final z0 N;
   @NotNull
   private static final z0 P;
   @NotNull
   private static final zr K;
   @NotNull
   private static final n R;
   private static int f;
   private static final long b = j0.a(-12320789994661486L, 4687336940969258461L, MethodHandles.lookup().lookupClass()).a(246683002287909L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] i;
   private static final Integer[] l;
   private static final Map q;

   private o5(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 122569315364174L;
      super(var3, true.i<invokedynamic>(17916, 1848119915898743729L ^ var1), pa.w(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean K(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 81045356229604L;
      int var3 = (int)((var1 ^ 81045356229604L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)o.k((short)var3, this, C[0], (short)var4, var5);
   }

   private final boolean c(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 52739490983511L;
      int var3 = (int)((var1 ^ 52739490983511L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)k.k((short)var3, this, C[1], (short)var4, var5);
   }

   private final boolean t(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 9077489367572L;
      int var3 = (int)((var1 ^ 9077489367572L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)g.k((short)var3, this, C[2], (short)var4, var5);
   }

   private final boolean u(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 11337537497444L;
      int var3 = (int)((var1 ^ 11337537497444L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)n.k((short)var3, this, C[3], (short)var4, var5);
   }

   private final int V(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 112933802833517L;
      int var3 = (int)((var1 ^ 112933802833517L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)t.k((short)var3, this, C[4], (short)var4, var5)).intValue();
   }

   private final boolean I(char var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 32911902084417L;
      int var6 = (int)((var4 ^ 32911902084417L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)T.k((short)var6, this, C[5], (short)var7, var8);
   }

   private final mh i(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 111444832305760L;
      int var3 = (int)((var1 ^ 111444832305760L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (mh)s.k((short)var3, this, C[true.p<invokedynamic>(32748, 9061667453900849074L ^ var1)], (short)var4, var5);
   }

   private final int e(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 137277572142024L;
      int var3 = (int)((var1 ^ 137277572142024L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)N.k((short)var3, this, C[true.p<invokedynamic>(4973, 4223858683025228440L ^ var1)], (short)var4, var5)).intValue();
   }

   private final int H(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 135904456510596L;
      int var3 = (int)((var1 ^ 135904456510596L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)P.k((short)var3, this, C[true.p<invokedynamic>(11772, 6016497244623004482L ^ var1)], (short)var4, var5)).intValue();
   }

   private final uw p(char var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ b;
      long var10001 = var4 ^ 3792600496899L;
      int var6 = (int)((var4 ^ 3792600496899L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (uw)K.k((short)var6, this, C[true.p<invokedynamic>(317, 259568825115719694L ^ var4)], (short)var7, var8);
   }

   private final void j(uw var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 106803137849448L;
      int var4 = (int)((var2 ^ 106803137849448L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      K.P(this, var4, C[true.p<invokedynamic>(317, 259594970455694207L ^ var2)], (short)var5, var1, (short)var6);
   }

   @Flow(
      priority = -10
   )
   private final void Y(PlayerUpdateEvent var1) {
      long var2 = b ^ 32920847601063L;
      long var4 = var2 ^ 31066431815920L;
      long var6 = var2 ^ 24386303078748L;
      long var8 = var2 ^ 86998633235173L;
      long var10 = var2 ^ 54017108476506L;
      long var12 = var2 ^ 62280265128414L;
      f = 0;
      if (this.r(var10)) {
         x7 var10000 = x7.Z;
         qq var10003 = new qq(i4.v.V(var12), 90.0F, var8, false, (bc)null, true.p<invokedynamic>(17783, 4667700770154869635L ^ var2), (DefaultConstructorMarker)null);
         int var10004 = 11574.p<invokedynamic>(11574, 5166417459685170118L ^ var2);
         Function0 var14 = o5::P;
         int var15 = var10004;
         qq var16 = var10003;
         var10000.l(var4, new rx(var6, var16, var15, var14));
      }

   }

   private final void W(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final void M(long param1, class_6880 param3) {
      // $FF: Couldn't be decompiled
   }

   private final int k(class_6880 var1, long var2) {
      var2 ^= b;
      long var4 = var2 ^ 95963927493779L;
      long var10001 = var2 ^ 126358969339582L;
      int var6 = (int)((var2 ^ 126358969339582L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return dk.I.M(o5::V, var4, this.p((char)var6, (short)var7, var8)).I();
   }

   private final boolean w(int param1, char param2, class_6880 param3, char param4) {
      // $FF: Couldn't be decompiled
   }

   private final boolean E(long param1, class_1799 param3, class_6880 param4) {
      // $FF: Couldn't be decompiled
   }

   private final boolean r(long param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean s() {
      long var0 = b ^ 26202800531527L;
      long var2 = var0 ^ 70915145373946L;

      boolean var10000;
      try {
         if (m.i(var2) == mh.Health) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, -2149059466744540729L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final Unit P() {
      long var0 = b ^ 65604774845865L;
      long var2 = var0 ^ 12668756580793L;
      m.W(var2);
      return Unit.INSTANCE;
   }

   private static final Unit d() {
      long var0 = b ^ 50423167907871L;
      long var2 = var0 ^ 9761713426482L;
      long var10001 = var0 ^ 131174704508162L;
      int var4 = (int)((var0 ^ 131174704508162L) >>> 48);
      long var5 = var10001 << 16 >>> 16;
      ff.f(class_1268.field_5808, 0.0F, 0.0F, (char)var4, true.p<invokedynamic>(11160, 637920965549730005L ^ var0), var5, (Object)null);
      h4.G((class_2596)(new class_2879(class_1268.field_5808)), var2);
      int var7 = f;
      o5 var10000 = m;
      f = var7 + 1;
      return Unit.INSTANCE;
   }

   private static final boolean V(class_6880 var0, class_1799 var1) {
      long var2 = b ^ 52516579382181L;
      long var4 = var2 ^ 103508791769308L;
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(11433, 7100359096572652745L ^ var2));
      return m.E(var4, var1, var0);
   }

   static {
      long var20 = b ^ 57391274546395L;
      long var22 = var20 ^ 567810699524L;
      long var24 = var20 ^ 23975193475121L;
      long var10001 = var20 ^ 64348821614086L;
      int var26 = (int)((var20 ^ 64348821614086L) >>> 48);
      int var27 = (int)(var10001 << 16 >>> 32);
      int var28 = (int)(var10001 << 48 >>> 48);
      long var29 = var20 ^ 43966793007042L;
      long var31 = var20 ^ 14930347025129L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[43];
      int var16 = 0;
      String var15 = "Ñº\u001d±\u009bQkØ´\\\u0005S±\u008d\u008e·Xúø)±_jyç÷ádIåÑ©G÷:[äªµG CÃãÑ\u00961.\u0081ÆPºi\u009d\u0087C\u0004\u009b£v\u0090ÜÊ*{ZÐ{\u0089|Iln\u0010VÈ\u0083ñx\u000e~Ãó9\u0017x\u000fåú÷\u0018ßqH×\u0001ËÆb±ÉVU{«¯²º\u000b'ñèé\u009c\u001f A0Xjtó`~e¢VÆ\r_®çì-µµ\u009b~\u008eäñ¥K\\×ª×& ÆCP<#wïÞ\u0001\"x;1zJü\u000fK2P\u0081rÜZnÁC¬\u000b'\u0001\u0016 þðÄ¾²/\u0014XhAUwa7k6º|ÆÛu\u009a\u0092v\u0097Ì\u000e&\u0007Ç{ª\u0018Â$\u009f>ÍF[\u0081â\u009d\u0099\u008e\u008eá\u009dÙe:<\u000bud°\u0086 #\u009eÈ\u0006&çG¯\u000eÓv\u0091zö«f\u0098Zy¿es^^\u0007\u0085K\u0003èiåý\u0018\u0093L\u007fu-°\u00068¼-¢\u0095óU\u0019k³ÿñÅéÏ¡F\u0010fþ\u009b´\u0007ø\u008fEØ`\u0004Ã»\u008b Ù\u0010ºÉ/\u0091Ö(\u0019°Ãÿêù\u008fhÜÈ .MÐ?\u0000=.Ð\u001a\u0088GÖ8\u0005\u0084tÁilz#\u0080\u00850?s\u0096NÃá\u0019\n >¯wÅ®\u001cgª²£Çä\u009f)Ü\u0080æ\u007fë\u0086à8PÎ\u00adÍ*;´\u008f\u00ad\u008c\u0010ªà&Q\u0007¨¤É3Ùë\u0081Ñz°È\u0018ýÎ¤`C³2ò\u0093\u0094\u0019|¤§×væ\u0000\u009c\\â\u001e?\u009b\u0010Ïï6\u00142\u0092}ÐýÛàGÚÇÂ)0¾(\u0011w\u008c\u001bP%c)ûäð6©øDÙîÓ\u000b\u0002ôð=LÃ ´LáÑ\u008d79 g3÷TÖc,¦n\u0094ÒW +\u0086\nCâ§\u008a¨ú\"!>í¸´w\u0087ç\u0007P/wÒ*0A\u001eÁA\u0087\u0095\u0081\u00106ì\u0002¿«L\fÕVÕÃ\u0099\f\u0081øó0{\u0099=W\"4TïñH+\u0082ÑXßÄ£\u009aª\u0002\u0086sc\u0094g¬¬o+\u0003\u008agYå\u0093i/8\u0002\u0090#R\u008aéQ\u008cî\\\u0010\u0096c»\u0082\rd\u0018#ÖR\u0088X\u008b\u0003L\u00140×$¹ÅV=K\u0088\u0097\u0006\u001cò\u001f\u0082öÑf\u0003ât\u0095±c\u0080<ÊùFÑ\u0098+fÛG=Þ¤\u008b\u000e\u0085<Í\u0006¬\u0083b¯|\u0018¤e¼i)ù®cò)\u0083~6 Cþ¯Õ¶¸Ø\u009a\u0014a\u0010âíPm\u0018ûÛô\u0017±´fyL\u0098Ò(\t\u0082\u009f\u0015ð\u001a\u001bÓY\bó\u0007\u009bï®U\u008fÝ\tBÁÞ\u008a¨á\u0012î\u0014\u0083i±\u0086!¥Å.,ÄpL\u0010a\u0006ØÍ¿\u0095ló)ëbo\u0003÷\u0087\u008f\u0018%\u009a×\u008e\u0081v¾´ûR4\u0087 \u001e>\u009co,`¿&\bâ\u007f\u0010þ\u0017+\u0003\u0013³w\u0090Ö\u0003HOÿ}|Ì \u009fø¿Æô\u0012ýçBõvÔØ½\u009e°\u0015Ói\u008e&ç¶NØ\r¨!¦ºûz\u0010\u009b;<è>M\u001aðÀýÈ\u001a:\u0084Uß\u0018\u0001-\u000fÁ\u0005OIÂ\u0099Ãæ\u0014\u0088ÿ£\u0005j«ûdÝ\u0091Bj \u008b\u001fk\u0001\u0015\u0093K\u00adR¡PÚV\u0092íû\u0001\u009fa!¿^T§\u0084t#·ßbá<\u0010À\u0018\u0007iõ\u0001AÞ\u008a½Íx»x¬_ ³Oû[&bÜx\u0000\u008e³É\u0001.ÿSo£½\u0003®3jê4\u0013G\u0082]@¶G\u0018vûô\u009f¡\u0080sÉ°xø\u001c×\u0005>\u001dLò\u0014$\u0080£\u0006I8\u009bmºôA]/=N\u0084\u0016\u001c²\u009bu\u0088û\u0001\t\u0098àù}\u0082Ëû\u009b¿0n\u0095+ 4\u00ad4ÉXÊ\u0007F\u0085$.á0\u0013\u0017Ç\u009c\u0007\u001fhÌm°\u0018\u0085\u00973\u0000@ï>\u001e».º\u0019{,ø'Þ(«\u0013`¥ÄÄ B@\u0092÷Gn¾pÝvPÖÆ\u0088ë\u0014lª\u001c4\t>ÁÜKô¹\u001b\nÆ\u0006P\u0010\u0007k¹0pkëd\u0082BÇ]\bÕ\u0006\u0096\u0018oì\u0010$\u009a\u0010\n±ð \u0082\u0083}ØÿClYªt8\u008a#\u0005";
      int var17 = "Ñº\u001d±\u009bQkØ´\\\u0005S±\u008d\u008e·Xúø)±_jyç÷ádIåÑ©G÷:[äªµG CÃãÑ\u00961.\u0081ÆPºi\u009d\u0087C\u0004\u009b£v\u0090ÜÊ*{ZÐ{\u0089|Iln\u0010VÈ\u0083ñx\u000e~Ãó9\u0017x\u000fåú÷\u0018ßqH×\u0001ËÆb±ÉVU{«¯²º\u000b'ñèé\u009c\u001f A0Xjtó`~e¢VÆ\r_®çì-µµ\u009b~\u008eäñ¥K\\×ª×& ÆCP<#wïÞ\u0001\"x;1zJü\u000fK2P\u0081rÜZnÁC¬\u000b'\u0001\u0016 þðÄ¾²/\u0014XhAUwa7k6º|ÆÛu\u009a\u0092v\u0097Ì\u000e&\u0007Ç{ª\u0018Â$\u009f>ÍF[\u0081â\u009d\u0099\u008e\u008eá\u009dÙe:<\u000bud°\u0086 #\u009eÈ\u0006&çG¯\u000eÓv\u0091zö«f\u0098Zy¿es^^\u0007\u0085K\u0003èiåý\u0018\u0093L\u007fu-°\u00068¼-¢\u0095óU\u0019k³ÿñÅéÏ¡F\u0010fþ\u009b´\u0007ø\u008fEØ`\u0004Ã»\u008b Ù\u0010ºÉ/\u0091Ö(\u0019°Ãÿêù\u008fhÜÈ .MÐ?\u0000=.Ð\u001a\u0088GÖ8\u0005\u0084tÁilz#\u0080\u00850?s\u0096NÃá\u0019\n >¯wÅ®\u001cgª²£Çä\u009f)Ü\u0080æ\u007fë\u0086à8PÎ\u00adÍ*;´\u008f\u00ad\u008c\u0010ªà&Q\u0007¨¤É3Ùë\u0081Ñz°È\u0018ýÎ¤`C³2ò\u0093\u0094\u0019|¤§×væ\u0000\u009c\\â\u001e?\u009b\u0010Ïï6\u00142\u0092}ÐýÛàGÚÇÂ)0¾(\u0011w\u008c\u001bP%c)ûäð6©øDÙîÓ\u000b\u0002ôð=LÃ ´LáÑ\u008d79 g3÷TÖc,¦n\u0094ÒW +\u0086\nCâ§\u008a¨ú\"!>í¸´w\u0087ç\u0007P/wÒ*0A\u001eÁA\u0087\u0095\u0081\u00106ì\u0002¿«L\fÕVÕÃ\u0099\f\u0081øó0{\u0099=W\"4TïñH+\u0082ÑXßÄ£\u009aª\u0002\u0086sc\u0094g¬¬o+\u0003\u008agYå\u0093i/8\u0002\u0090#R\u008aéQ\u008cî\\\u0010\u0096c»\u0082\rd\u0018#ÖR\u0088X\u008b\u0003L\u00140×$¹ÅV=K\u0088\u0097\u0006\u001cò\u001f\u0082öÑf\u0003ât\u0095±c\u0080<ÊùFÑ\u0098+fÛG=Þ¤\u008b\u000e\u0085<Í\u0006¬\u0083b¯|\u0018¤e¼i)ù®cò)\u0083~6 Cþ¯Õ¶¸Ø\u009a\u0014a\u0010âíPm\u0018ûÛô\u0017±´fyL\u0098Ò(\t\u0082\u009f\u0015ð\u001a\u001bÓY\bó\u0007\u009bï®U\u008fÝ\tBÁÞ\u008a¨á\u0012î\u0014\u0083i±\u0086!¥Å.,ÄpL\u0010a\u0006ØÍ¿\u0095ló)ëbo\u0003÷\u0087\u008f\u0018%\u009a×\u008e\u0081v¾´ûR4\u0087 \u001e>\u009co,`¿&\bâ\u007f\u0010þ\u0017+\u0003\u0013³w\u0090Ö\u0003HOÿ}|Ì \u009fø¿Æô\u0012ýçBõvÔØ½\u009e°\u0015Ói\u008e&ç¶NØ\r¨!¦ºûz\u0010\u009b;<è>M\u001aðÀýÈ\u001a:\u0084Uß\u0018\u0001-\u000fÁ\u0005OIÂ\u0099Ãæ\u0014\u0088ÿ£\u0005j«ûdÝ\u0091Bj \u008b\u001fk\u0001\u0015\u0093K\u00adR¡PÚV\u0092íû\u0001\u009fa!¿^T§\u0084t#·ßbá<\u0010À\u0018\u0007iõ\u0001AÞ\u008a½Íx»x¬_ ³Oû[&bÜx\u0000\u008e³É\u0001.ÿSo£½\u0003®3jê4\u0013G\u0082]@¶G\u0018vûô\u009f¡\u0080sÉ°xø\u001c×\u0005>\u001dLò\u0014$\u0080£\u0006I8\u009bmºôA]/=N\u0084\u0016\u001c²\u009bu\u0088û\u0001\t\u0098àù}\u0082Ëû\u009b¿0n\u0095+ 4\u00ad4ÉXÊ\u0007F\u0085$.á0\u0013\u0017Ç\u009c\u0007\u001fhÌm°\u0018\u0085\u00973\u0000@ï>\u001e».º\u0019{,ø'Þ(«\u0013`¥ÄÄ B@\u0092÷Gn¾pÝvPÖÆ\u0088ë\u0014lª\u001c4\t>ÁÜKô¹\u001b\nÆ\u0006P\u0010\u0007k¹0pkëd\u0082BÇ]\bÕ\u0006\u0096\u0018oì\u0010$\u009a\u0010\n±ð \u0082\u0083}ØÿClYªt8\u008a#\u0005".length();
      char var14 = '(';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var34 = var15.substring(var13, var13 + var14);
         byte var36 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var34.getBytes("ISO-8859-1"));
            String var41 = b(var19).intern();
            switch(var36) {
            case 0:
               var18[var16++] = var41;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[43];
                  q = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[17];
                  int var3 = 0;
                  String var4 = "\u0005³kNu7Õ¹O´\u0014(öHoý²Æ!2\u0002\u0005?\r}\u0084:ËD\u0000o'ÑÙ[0íS¾\u00advbÖ\u0081ÐË°u³e\u001fDot@Ï¦\u009fÒõ,Vê\u0000ÒÄ¨©½\\\u009býlÁ\u0013¢>\u008a\u0010Ú=\u0083OLszp\u009d\u0082\u0083Â\u0094\u0084\u0088´Eôé3¤B\u0088E\u007f\u0086©¬4IüK®¯\u000bh\u0013\u009c}\u0018|";
                  int var5 = "\u0005³kNu7Õ¹O´\u0014(öHoý²Æ!2\u0002\u0005?\r}\u0084:ËD\u0000o'ÑÙ[0íS¾\u00advbÖ\u0081ÐË°u³e\u001fDot@Ï¦\u009fÒõ,Vê\u0000ÒÄ¨©½\\\u009býlÁ\u0013¢>\u008a\u0010Ú=\u0083OLszp\u009d\u0082\u0083Â\u0094\u0084\u0088´Eôé3¤B\u0088E\u007f\u0086©¬4IüK®¯\u000bh\u0013\u009c}\u0018|".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var40 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var40, var2).getBytes("ISO-8859-1");
                     long[] var37 = var6;
                     var40 = var3++;
                     long var43 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var44 = -1;

                     while(true) {
                        long var8 = var43;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var46 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var44) {
                        case 0:
                           var37[var40] = var46;
                           if (var2 >= var5) {
                              i = var6;
                              l = new Integer[17];
                              KProperty[] var33 = new KProperty[true.p<invokedynamic>(21605, 365840853816146914L ^ var20)];
                              var33[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(o5.class, true.i<invokedynamic>(13754, 3061645983547224748L ^ var20), true.i<invokedynamic>(23589, 79209363564108570L ^ var20), 0)));
                              var33[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(o5.class, true.i<invokedynamic>(14220, 1310752257487597710L ^ var20), true.i<invokedynamic>(23014, 6015767030368771815L ^ var20), 0)));
                              var33[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(o5.class, true.i<invokedynamic>(6002, 239823384518316137L ^ var20), true.i<invokedynamic>(31685, 8710444857630014707L ^ var20), 0)));
                              var33[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(o5.class, true.i<invokedynamic>(17480, 2469161933641417544L ^ var20), true.i<invokedynamic>(17819, 4715863755733959304L ^ var20), 0)));
                              var33[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(o5.class, true.i<invokedynamic>(20044, 4308340010545547593L ^ var20), true.i<invokedynamic>(22315, 1150321981824110641L ^ var20), 0)));
                              var33[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(o5.class, true.i<invokedynamic>(7506, 5854539815337744998L ^ var20), true.i<invokedynamic>(12349, 7920196813954053933L ^ var20), 0)));
                              var33[true.p<invokedynamic>(11160, 637893024597607441L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(o5.class, true.i<invokedynamic>(28746, 4131146640420321149L ^ var20), true.i<invokedynamic>(12543, 7903614504249882619L ^ var20), 0)));
                              var33[true.p<invokedynamic>(9271, 699595306514058169L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(o5.class, true.i<invokedynamic>(1199, 5343250403456369574L ^ var20), true.i<invokedynamic>(21652, 6383845686129857441L ^ var20), 0)));
                              var33[true.p<invokedynamic>(31075, 3573699835991512803L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(o5.class, true.i<invokedynamic>(15610, 3658122251619859398L ^ var20), true.i<invokedynamic>(4040, 588903210262841565L ^ var20), 0)));
                              var33[true.p<invokedynamic>(32564, 3655982650196709559L ^ var20)] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(o5.class, true.i<invokedynamic>(11829, 3718492168543070523L ^ var20), true.i<invokedynamic>(18369, 3483898777300959472L ^ var20), 0)));
                              C = var33;
                              m = new o5(var31);
                              o = qi.R((il)m, true.i<invokedynamic>(2413, 1980718199129394782L ^ var20), true, (pj)null, (Function0)null, true.p<invokedynamic>(17536, 8204931537060227844L ^ var20), var29, (Object)null);
                              k = qi.R((il)m, true.i<invokedynamic>(972, 7084219468297454811L ^ var20), true, (pj)null, (Function0)null, true.p<invokedynamic>(17783, 4667744465140640511L ^ var20), var29, (Object)null);
                              g = qi.R((il)m, true.i<invokedynamic>(3510, 4164211275737320111L ^ var20), true, (pj)null, (Function0)null, true.p<invokedynamic>(17783, 4667744465140640511L ^ var20), var29, (Object)null);
                              n = qi.R((il)m, true.i<invokedynamic>(32011, 4037566461270538811L ^ var20), true, (pj)null, (Function0)null, true.p<invokedynamic>(17783, 4667744465140640511L ^ var20), var29, (Object)null);
                              t = qi.o((il)m, true.i<invokedynamic>(427, 4575171963698923174L ^ var20), true.p<invokedynamic>(11772, 6016462932025606777L ^ var20), new IntRange(0, true.p<invokedynamic>(23996, 7426831949534720547L ^ var20)), var22, (pj)null, (Function0)null, true.p<invokedynamic>(9730, 2618733146309134735L ^ var20), (Object)null);
                              T = qi.R((il)m, true.i<invokedynamic>(23392, 13422591051668593L ^ var20), true, (pj)null, (Function0)null, true.p<invokedynamic>(17783, 4667744465140640511L ^ var20), var29, (Object)null);
                              s = qi.M((il)m, true.i<invokedynamic>(32317, 3442541833000204559L ^ var20), (Enum)mh.LackOfRegen, (pj)null, (Function0)null, true.p<invokedynamic>(17783, 4667744465140640511L ^ var20), (Object)null, var24);
                              N = qi.o((il)m, true.i<invokedynamic>(18065, 3330122998510322074L ^ var20), true.p<invokedynamic>(11772, 6016462932025606777L ^ var20), new IntRange(0, true.p<invokedynamic>(28296, 6347761111569940750L ^ var20)), var22, (pj)null, o5::s, true.p<invokedynamic>(11772, 6016462932025606777L ^ var20), (Object)null);
                              P = qi.o((il)m, true.i<invokedynamic>(27327, 8629456719775083964L ^ var20), 3, new IntRange(1, 3), var22, (pj)null, (Function0)null, true.p<invokedynamic>(20770, 8872136010575511208L ^ var20), (Object)null);
                              K = qi.M((il)m, true.i<invokedynamic>(29111, 4969484283642459825L ^ var20), (Enum)uw.SILENT_FULL, (pj)null, (Function0)null, true.p<invokedynamic>(17783, 4667744465140640511L ^ var20), (Object)null, var24);
                              R = new n((char)var26, var27, (char)var28);
                              return;
                           }
                           break;
                        default:
                           var37[var40] = var46;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "çÂ8\u0092\u008bÉ&9ÌÀÂ_\u000b·ßÎ";
                           var5 = "çÂ8\u0092\u008bÉ&9ÌÀÂ_\u000b·ßÎ".length();
                           var2 = 0;
                        }

                        var40 = var2;
                        var2 += 8;
                        var7 = var4.substring(var40, var2).getBytes("ISO-8859-1");
                        var37 = var6;
                        var40 = var3++;
                        var43 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var44 = 0;
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

               var15 = "|\u0096Äs\u0001oû\u009bT¾gqë\u0016\u001b]IÎ\u0014L\u0002·vn\u0018x'Â\u0003B÷Hw\u0081\u00838åV³½\u009b1 \u001c®P\b\"(";
               var17 = "|\u0096Äs\u0001oû\u009bT¾gqë\u0016\u001b]IÎ\u0014L\u0002·vn\u0018x'Â\u0003B÷Hw\u0081\u00838åV³½\u009b1 \u001c®P\b\"(".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var34 = var15.substring(var13, var13 + var14);
            var36 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22647;
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
            throw new RuntimeException("su/catlean/o5", var10);
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
         throw new RuntimeException("su/catlean/o5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12525;
      if (l[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/o5", var14);
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
         throw new RuntimeException("su/catlean/o5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
