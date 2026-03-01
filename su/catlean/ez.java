package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.class_124;
import net.minecraft.class_1657;
import net.minecraft.class_1934;
import net.minecraft.class_2561;
import net.minecraft.class_268;
import net.minecraft.class_270;
import net.minecraft.class_5250;
import net.minecraft.class_640;
import net.minecraft.class_742;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.AfterReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class ez {
   @NotNull
   public static final ez N;
   @NotNull
   private static final CopyOnWriteArrayList J;
   @NotNull
   private static List b;
   @NotNull
   private static final String[] K;
   private static final long a = j0.a(2079032734320562053L, 4352980915698364545L, MethodHandles.lookup().lookupClass()).a(159547561796072L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   private ez() {
   }

   @NotNull
   public final List w() {
      return b;
   }

   public final void J(@NotNull List <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.h<invokedynamic>(21827, 8921035391165302395L ^ var2));
      b = var1;
   }

   @Flow
   private final void X(PlayerUpdateEvent var1) {
      long var2 = a ^ 47366224692967L;
      long var4 = var2 ^ 85359525712863L;
      k9[] var6 = 1791058190687959310L.A<invokedynamic>(1791058190687959310L, var2);

      boolean var10000;
      label39: {
         try {
            var10000 = np.i.O(var4);
            if (var6 == null) {
               break label39;
            }

            if (!var10000) {
               return;
            }
         } catch (NumberFormatException var10) {
            throw var10.A<invokedynamic>(var10, 1844771483220002178L, var2);
         }

         var10000 = J.isEmpty();
      }

      label29: {
         try {
            if (var6 == null) {
               break label29;
            }

            if (var10000) {
               return;
            }
         } catch (NumberFormatException var9) {
            throw var9.A<invokedynamic>(var9, 1844771483220002178L, var2);
         }

         J.removeIf(ez::t);
      }

      Iterable var7 = (Iterable)J;
      boolean var8 = false;
      b = CollectionsKt.toMutableList((Collection)CollectionsKt.sortedWith(var7, (Comparator)(new qc())));
   }

   @Flow
   private final void e(AfterReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final class_5250 N(long a, @NotNull class_640 entry) {
      var1 ^= a;
      long var4 = var1 ^ 59745456525949L;

      class_5250 var10000;
      class_5250 var10002;
      try {
         Intrinsics.checkNotNullParameter(var3, true.h<invokedynamic>(7715, 7704911259717866955L ^ var1));
         if (var3.method_2971() != null) {
            class_2561 var7 = var3.method_2971();
            Intrinsics.checkNotNull(var7);
            var10002 = var7.method_27661();
            Intrinsics.checkNotNullExpressionValue(var10002, true.h<invokedynamic>(5994, 4594220949712116873L ^ var1));
            var10000 = this.C(var3, var10002, var4);
            return var10000;
         }
      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, -6641708819509477432L, var1);
      }

      var10002 = class_268.method_1142((class_270)var3.method_2955(), (class_2561)class_2561.method_43470(var3.method_2966().name()));
      Intrinsics.checkNotNullExpressionValue(var10002, true.h<invokedynamic>(21515, 6610101721632432101L ^ var1));
      var10000 = this.C(var3, var10002, var4);
      return var10000;
   }

   private final class_5250 C(class_640 var1, class_5250 var2, long var3) {
      var3 ^= a;

      class_5250 var10000;
      label17: {
         try {
            if (var1.method_2958() == class_1934.field_9219) {
               var10000 = var2.method_27692(class_124.field_1056);
               break label17;
            }
         } catch (NumberFormatException var6) {
            throw var6.A<invokedynamic>(var6, 8025656623475864443L, var3);
         }

         var10000 = var2;
      }

      class_5250 var5 = var10000;
      Intrinsics.checkNotNull(var5);
      return var5;
   }

   private final void W(long var1, String[] var3) {
      var1 ^= a;

      try {
         if (var3.length >= 2) {
            ;
         }
      } catch (NumberFormatException var4) {
         throw var4.A<invokedynamic>(var4, 7042463959804427680L, var1);
      }
   }

   private final boolean n(String param1, short param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   @Nullable
   public final class_1657 V(long a, @NotNull String name) {
      var1 ^= a;
      long var10001 = var1 ^ 82493949064092L;
      int var4 = (int)((var1 ^ 82493949064092L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      k9[] var10000 = -805740536533379836L.A<invokedynamic>(-805740536533379836L, var1);
      Intrinsics.checkNotNullParameter(var3, true.h<invokedynamic>(16694, 4824496304638139554L ^ var1));
      Iterator var8 = s8.i((char)var4, var5, (short)var6).method_18456().iterator();
      k9[] var7 = var10000;

      label21:
      while(var8.hasNext()) {
         Object var10 = var8.next();

         do {
            class_742 var9 = (class_742)var10;
            if (!Intrinsics.areEqual((Object)var3, (Object)var9.method_5477().getString())) {
               continue label21;
            }

            var10 = (class_1657)var9;
         } while(var1 <= 0L || var7 == null);

         return (class_1657)var10;
      }

      return null;
   }

   private final int d(r7 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean p(r7 param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean t(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final boolean y(String var0, String var1) {
      Intrinsics.checkNotNull(var1);
      return StringsKt.startsWith$default(var0, var1, false, 2, (Object)null);
   }

   private static final boolean w(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   public static final int A(ez $this, long a, r7 employee) {
      var1 ^= a;
      long var4 = var1 ^ 125776366513777L;
      return var0.d(var3, var4);
   }

   public static final boolean q(ez $this, String name1, long a) {
      var2 ^= a;
      long var10001 = var2 ^ 62631165575510L;
      int var4 = (int)((var2 ^ 62631165575510L) >>> 48);
      long var5 = var10001 << 16 >>> 16;
      return var0.n(var1, (short)var4, var5);
   }

   public static final CopyOnWriteArrayList p() {
      return J;
   }

   public static final void C(ez $this, String[] stringArray, long a) {
      var2 ^= a;
      long var4 = var2 ^ 130362274539479L;
      var0.W(var4, var1);
   }

   static {
      long var20 = a ^ 136628421043676L;
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
      String var15 = "µÐ¹\u0006&\u0003³Ö\u0097|z\u0082q¦Ý\u009f(7ú\r\u0092ª¨\u001d\u0091\u0000é\u007fû®hÅ\u0007c\u0092Qücû\u008cÆ>ZÛ\u0094\u0092Z\u008d\n¥]Ðû\u000fx!b\u0018V>6H{¢\u0091v.\u0093\u0012zk\u00010\u0099Ûjÿ\u0084\u0014\"w\u0006([|\u008b\u0007\u0006QÑ\u0082ÎH3\rx{wI\u008fLt\u009d!å\u0005Êøô°weZÀ \n\\\u009c\u0096\u0093ðÒ\u0096\u0010¨¸\u0017Y\nç»â\u009a\u001d6\u0092¤@oi(\u0017{Ç\u000bØ§\u0013ÊºÆ¿\u009büø¡æø¬\u0081\npi_Z½õ\u0083éãÞ¾ÅÇ\u0091ÑyÞÐG¹\u0018Ò\u0086!Ê\u0084à®\u0099£\u000f&re\b¹SûÑO¬\u0019*\bÙ \u0082Þ\u0083B\u000bÀ¥\u0017\u008aÑÆ\u008a¥)\u0084\u0083z»t\u009aj7OuÍÉ%å<]^ú\u0010\u0013\u0013\u0084Ì¼á¥c´{¯fíüZz Ö)áàÚ\u008byéñ¦b¼nÁQ`øp\u000f=ui4\u0010\u0090Í>\u009a¸¡Rl\u0010\u0090N\t\u0084\u008e\"ÔPz\n¨ë]/\u0084É 0\u000eºß_XgÖ`ò*)\u0084¤\u0014(z\u00939JòTy×(¯ÆÒ9¦yÞ\u0010T.y \u0096\u008aÀ°ZM2Cî\" \u009b¨Î]¹\u0089øÔUï3Æ'\u009d\u008f£·Â\u0096|µxãIdJû\u000bþlí\u0081y¾¨öHÌàö{\u0019çK\u0010¸\u0002ùR^\u0086ò/Öé\u008bL£Gê\u0089\u009cð¡Øö\u0097¥\u009c+ñ*©b¬ç3þ\u0000Î\u0092À'\u009b¼\u0099]èVï\u0003\u0085{\u0013Ù¦\u0000±x\u008ekÇêë%^\u0095\u001cõ»6+\u0018®k±ù)á\u0099Êï\u0010aÑ6v\u0082\u0003\u0094QWàµ[\u0003f)<\u0095]Ñxw\u0092\u0005\u001f«ö\b´ \u0093k¯\u0080ãQDº\u0086\u00adIfÇÞyïa\b\u0018Á[\rSò\u0090<R\u008c7±°æÕ\u0098Ã³Qgé\u0000P\u0011± \u0097~*\u0018:O7å$Ú\u0084¢{Ç´üz\u0086\u0086y\u008c\u0092õ·Soúäi\u0018ZÆ\u0010¹\u00adñ\u0092_\u000eæ\u0017\u008b·Od\u0002ïC¶\u0010îï\u000be\u0087²\u008dõù\u0014».±í\nË\u0010AU\u0016\u001c\u0011\nËñ\u009dü$\r©ûÀ3\u0010\u009a1@\u007fÂ8Â\u0010*P.ÐíQî\u0099\u0018\u0018¥¬Åë ètØÙH\u0011\\µ°W\u0099´@\u0007iê~\u001d ²½Æ-°þY\u001en¤îÚ\u0086¯DèÅÅÙ\u009d\u001b\u0016ý\u0095Ìá/#æ§Õ\u0095\u0018\u000b\u001fK®\u0089¨\u0013~Ì\u0080\u0092\u00958\u009d\u0018_\u001f7\u0098\u0017¶¦\u001d Hª³\u008d`¶ko3~hôåÂX.\u0084Óþrà\u001f_«\u001fg\u0096\u0086¹\u0091/3Ç!è=\u0082'¿ð2\u008e\u000eÎÊ¨\u0091\u0081è\u001c\u000e¥e£-_\u0087,\u0002÷¾0\u0081>úPÎ'4M\u00adMÒ(põ\u0004M×\"Ewìù.ÕÊ\u008c@V%~èÝ.{0E+¯\u009fu\u0019N\u001f35RÐH\u001aüÁô ä7Ñ\u0097¹îyJqA\u0081Ã\u0001¯\u001dð\u009c!½B¾ë¿ÙÕúä\u009eé6\\\u0003 |\u009e¾s(&\u0016\tÝU^z\u001aq³=\u0099°¶34uè\u0018ìE·¯O\u0095Ê\u0019\u0010»la/\u0000¿\"E\u0016Ö\u0017\u0001EHjÒ ¾9\bfÈÑ¾\u0092+Æm\u0096f@\u0089Úêò°)±:JA\u0081\n¼ #>\b° ù©ùn-ê\u001b·\u0018ðY´\u0017SÇ?ÜNuÿ$×}Áv¢\u008e\u0018ãæHN\u0010Z\u0087X\u0016Qyá\u001f}\u0015\u00adÁ\u0011dTX\u0010\u00101nã4Ú\u0099zØ\u0081¬\u000f\u0096\t\u0096º\u0018\u0006ç\u008b\u000b·\u0091\u00022g\u0012\u0086L°\u0010!i±8\u0097lýïM\\ GrÐ\u008dª\u0098;ø\u0095XçWæû¼Kp ü\u008fèBzÁÝ$]yãx\u0085»\u0010èãáüá\u0094Úú\u009f=\u008aEk\u0006³a\u0010aOga\u001b,6Â²Í3À\u0084vIè\u0010Å\u00ad²JÚÞ4Añ\u0098\u009cá ^\u0002l\u0010OåC,þÄ\u0001\u00ad\u0092U\u0096ì¸±ÇF\u0010F:ÿ©3\u001d \u0099ï\u000b¡y\u0087ñå» \u0014è\u0004\"VUu\u0093j¶\u009e\u009a KÀ\u0016\u0087;ÿ\u0018lý\u0002\b!O©\u0017óÞô\u0010 &ËýÖì´h\u00ad1\u009cN\f\u008dÝI6/²\b3÷ÄW\u0095©\u00ad¯|*ó©\u0007";
      int var17 = "µÐ¹\u0006&\u0003³Ö\u0097|z\u0082q¦Ý\u009f(7ú\r\u0092ª¨\u001d\u0091\u0000é\u007fû®hÅ\u0007c\u0092Qücû\u008cÆ>ZÛ\u0094\u0092Z\u008d\n¥]Ðû\u000fx!b\u0018V>6H{¢\u0091v.\u0093\u0012zk\u00010\u0099Ûjÿ\u0084\u0014\"w\u0006([|\u008b\u0007\u0006QÑ\u0082ÎH3\rx{wI\u008fLt\u009d!å\u0005Êøô°weZÀ \n\\\u009c\u0096\u0093ðÒ\u0096\u0010¨¸\u0017Y\nç»â\u009a\u001d6\u0092¤@oi(\u0017{Ç\u000bØ§\u0013ÊºÆ¿\u009büø¡æø¬\u0081\npi_Z½õ\u0083éãÞ¾ÅÇ\u0091ÑyÞÐG¹\u0018Ò\u0086!Ê\u0084à®\u0099£\u000f&re\b¹SûÑO¬\u0019*\bÙ \u0082Þ\u0083B\u000bÀ¥\u0017\u008aÑÆ\u008a¥)\u0084\u0083z»t\u009aj7OuÍÉ%å<]^ú\u0010\u0013\u0013\u0084Ì¼á¥c´{¯fíüZz Ö)áàÚ\u008byéñ¦b¼nÁQ`øp\u000f=ui4\u0010\u0090Í>\u009a¸¡Rl\u0010\u0090N\t\u0084\u008e\"ÔPz\n¨ë]/\u0084É 0\u000eºß_XgÖ`ò*)\u0084¤\u0014(z\u00939JòTy×(¯ÆÒ9¦yÞ\u0010T.y \u0096\u008aÀ°ZM2Cî\" \u009b¨Î]¹\u0089øÔUï3Æ'\u009d\u008f£·Â\u0096|µxãIdJû\u000bþlí\u0081y¾¨öHÌàö{\u0019çK\u0010¸\u0002ùR^\u0086ò/Öé\u008bL£Gê\u0089\u009cð¡Øö\u0097¥\u009c+ñ*©b¬ç3þ\u0000Î\u0092À'\u009b¼\u0099]èVï\u0003\u0085{\u0013Ù¦\u0000±x\u008ekÇêë%^\u0095\u001cõ»6+\u0018®k±ù)á\u0099Êï\u0010aÑ6v\u0082\u0003\u0094QWàµ[\u0003f)<\u0095]Ñxw\u0092\u0005\u001f«ö\b´ \u0093k¯\u0080ãQDº\u0086\u00adIfÇÞyïa\b\u0018Á[\rSò\u0090<R\u008c7±°æÕ\u0098Ã³Qgé\u0000P\u0011± \u0097~*\u0018:O7å$Ú\u0084¢{Ç´üz\u0086\u0086y\u008c\u0092õ·Soúäi\u0018ZÆ\u0010¹\u00adñ\u0092_\u000eæ\u0017\u008b·Od\u0002ïC¶\u0010îï\u000be\u0087²\u008dõù\u0014».±í\nË\u0010AU\u0016\u001c\u0011\nËñ\u009dü$\r©ûÀ3\u0010\u009a1@\u007fÂ8Â\u0010*P.ÐíQî\u0099\u0018\u0018¥¬Åë ètØÙH\u0011\\µ°W\u0099´@\u0007iê~\u001d ²½Æ-°þY\u001en¤îÚ\u0086¯DèÅÅÙ\u009d\u001b\u0016ý\u0095Ìá/#æ§Õ\u0095\u0018\u000b\u001fK®\u0089¨\u0013~Ì\u0080\u0092\u00958\u009d\u0018_\u001f7\u0098\u0017¶¦\u001d Hª³\u008d`¶ko3~hôåÂX.\u0084Óþrà\u001f_«\u001fg\u0096\u0086¹\u0091/3Ç!è=\u0082'¿ð2\u008e\u000eÎÊ¨\u0091\u0081è\u001c\u000e¥e£-_\u0087,\u0002÷¾0\u0081>úPÎ'4M\u00adMÒ(põ\u0004M×\"Ewìù.ÕÊ\u008c@V%~èÝ.{0E+¯\u009fu\u0019N\u001f35RÐH\u001aüÁô ä7Ñ\u0097¹îyJqA\u0081Ã\u0001¯\u001dð\u009c!½B¾ë¿ÙÕúä\u009eé6\\\u0003 |\u009e¾s(&\u0016\tÝU^z\u001aq³=\u0099°¶34uè\u0018ìE·¯O\u0095Ê\u0019\u0010»la/\u0000¿\"E\u0016Ö\u0017\u0001EHjÒ ¾9\bfÈÑ¾\u0092+Æm\u0096f@\u0089Úêò°)±:JA\u0081\n¼ #>\b° ù©ùn-ê\u001b·\u0018ðY´\u0017SÇ?ÜNuÿ$×}Áv¢\u008e\u0018ãæHN\u0010Z\u0087X\u0016Qyá\u001f}\u0015\u00adÁ\u0011dTX\u0010\u00101nã4Ú\u0099zØ\u0081¬\u000f\u0096\t\u0096º\u0018\u0006ç\u008b\u000b·\u0091\u00022g\u0012\u0086L°\u0010!i±8\u0097lýïM\\ GrÐ\u008dª\u0098;ø\u0095XçWæû¼Kp ü\u008fèBzÁÝ$]yãx\u0085»\u0010èãáüá\u0094Úú\u009f=\u008aEk\u0006³a\u0010aOga\u001b,6Â²Í3À\u0084vIè\u0010Å\u00ad²JÚÞ4Añ\u0098\u009cá ^\u0002l\u0010OåC,þÄ\u0001\u00ad\u0092U\u0096ì¸±ÇF\u0010F:ÿ©3\u001d \u0099ï\u000b¡y\u0087ñå» \u0014è\u0004\"VUu\u0093j¶\u009e\u009a KÀ\u0016\u0087;ÿ\u0018lý\u0002\b!O©\u0017óÞô\u0010 &ËýÖì´h\u00ad1\u009cN\f\u008dÝI6/²\b3÷ÄW\u0095©\u00ad¯|*ó©\u0007".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var23 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var23.getBytes("ISO-8859-1"));
            String var29 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var29;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[43];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[18];
                  int var3 = 0;
                  String var4 = "\u0096\u007fsñSA\u008b\u0098ý7å\u009eµ,F²s\u0010º)ßâ\u008f;a\u008aM\u000b3Ò\u0099CÃ»\u009eW6\u0018>º\u0087×OéVÐ¥ü£'Úö\u0012é\u001eµ7íeÛ¶\u000b¾Ág¢õ4Û\u0085æ\u009dy¦d,\u008aÏK½$ØÆ\u001cÑ\u0019\u0084\u009dû\u007f\u0087'\u0089\u0098KÚE\u0091Ø\u0017òQô¼ýCW7ëÍÑû#t£ö\u000eà\u0087\u001f`5?Yû\u009f\u0093\u008b";
                  int var5 = "\u0096\u007fsñSA\u008b\u0098ý7å\u009eµ,F²s\u0010º)ßâ\u008f;a\u008aM\u000b3Ò\u0099CÃ»\u009eW6\u0018>º\u0087×OéVÐ¥ü£'Úö\u0012é\u001eµ7íeÛ¶\u000b¾Ág¢õ4Û\u0085æ\u009dy¦d,\u008aÏK½$ØÆ\u001cÑ\u0019\u0084\u009dû\u007f\u0087'\u0089\u0098KÚE\u0091Ø\u0017òQô¼ýCW7ëÍÑû#t£ö\u000eà\u0087\u001f`5?Yû\u009f\u0093\u008b".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     long[] var26 = var6;
                     var27 = var3++;
                     long var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var33 = -1;

                     while(true) {
                        long var8 = var32;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var35 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var33) {
                        case 0:
                           var26[var27] = var35;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[18];
                              N = new ez();
                              J = new CopyOnWriteArrayList();
                              long var30 = 7299178420844487002L ^ var20;
                              b = (List)(new ArrayList());
                              String[] var22 = new String[true.g<invokedynamic>(8660, var30)];
                              var22[0] = true.h<invokedynamic>(23437, 6625844558331414803L ^ var20);
                              var22[1] = true.h<invokedynamic>(1116, 6423213670687200969L ^ var20);
                              var22[2] = true.h<invokedynamic>(10737, 2208198238788909930L ^ var20);
                              var22[3] = true.h<invokedynamic>(32678, 8048816365825928510L ^ var20);
                              var22[4] = true.h<invokedynamic>(3571, 4151421751095156598L ^ var20);
                              var22[5] = true.h<invokedynamic>(22975, 3156561692463565624L ^ var20);
                              var22[true.g<invokedynamic>(31866, 8445896026509655281L ^ var20)] = true.h<invokedynamic>(29135, 6890482751675114337L ^ var20);
                              var22[true.g<invokedynamic>(25982, 7320603437033334268L ^ var20)] = true.h<invokedynamic>(15611, 4630865911480151640L ^ var20);
                              var22[true.g<invokedynamic>(29628, 9098761928573465403L ^ var20)] = true.h<invokedynamic>(23853, 90648817005825963L ^ var20);
                              var22[true.g<invokedynamic>(23040, 2047758472261048961L ^ var20)] = true.h<invokedynamic>(27160, 6939998671515072702L ^ var20);
                              var22[true.g<invokedynamic>(2196, 9222946973460711451L ^ var20)] = true.h<invokedynamic>(31959, 4316968600837271114L ^ var20);
                              var22[true.g<invokedynamic>(19890, 8552104227677801782L ^ var20)] = true.h<invokedynamic>(24458, 8259364432385379600L ^ var20);
                              var22[true.g<invokedynamic>(17640, 4863141231108785261L ^ var20)] = true.h<invokedynamic>(16777, 4729425972114395910L ^ var20);
                              var22[true.g<invokedynamic>(7110, 4972749029560834890L ^ var20)] = true.h<invokedynamic>(16777, 4729425972114395910L ^ var20);
                              var22[true.g<invokedynamic>(22762, 2574659329217665129L ^ var20)] = true.h<invokedynamic>(5174, 5322989713555506849L ^ var20);
                              K = var22;
                              return;
                           }
                           break;
                        default:
                           var26[var27] = var35;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0001c\u0086\tØÕãØª\"Ðs\nv#j";
                           var5 = "\u0001c\u0086\tØÕãØª\"Ðs\nv#j".length();
                           var2 = 0;
                        }

                        var27 = var2;
                        var2 += 8;
                        var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        var26 = var6;
                        var27 = var3++;
                        var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var33 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var29;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u0001\u0096\bxÛ\u001d\u009d´\u00805P\u0014¾¿\u0018\u0086?a\u0085Q_Yc¾ ¸\b\u008b\u000fJÊ\u0093\u001a\fî\u0088µéRÐ\\>ÃR2\u000fÃ\u001b\u001e\u001cÜ,À\u0083'\u0003÷";
               var17 = "\u0001\u0096\bxÛ\u001d\u009d´\u00805P\u0014¾¿\u0018\u0086?a\u0085Q_Yc¾ ¸\b\u008b\u000fJÊ\u0093\u001a\fî\u0088µéRÐ\\>ÃR2\u000fÃ\u001b\u001e\u001cÜ,À\u0083'\u0003÷".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var23 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10645;
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
            throw new RuntimeException("su/catlean/ez", var10);
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
         throw new RuntimeException("su/catlean/ez" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15260;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ez", var14);
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
         throw new RuntimeException("su/catlean/ez" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
