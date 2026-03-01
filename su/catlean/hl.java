package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_5250;
import org.jetbrains.annotations.NotNull;

public final class hl {
   private static final long a = j0.a(3944859498461947828L, 6143958134542060022L, MethodHandles.lookup().lookupClass()).a(98083323749144L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   @NotNull
   public static final class_5250 X(long a, @NotNull class_5250 $this$applyFormatting, @NotNull String addition, @NotNull class_124 formatting) {
      var0 ^= a;
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(29472, 2721652034169514279L ^ var0));
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(14819, 1182668611311002597L ^ var0));
      Intrinsics.checkNotNullParameter(var4, true.i<invokedynamic>(14272, 5579229923201314241L ^ var0));
      class_5250 var10000 = var2.method_10852((class_2561)class_2561.method_43470(var3).method_27692(var4));
      Intrinsics.checkNotNullExpressionValue(var10000, true.i<invokedynamic>(26292, 2605763422550408368L ^ var0));
      return var10000;
   }

   @NotNull
   public static final class_5250 s(long a, @NotNull class_5250 $this$black, @NotNull String addition) {
      var0 ^= a;
      long var4 = var0 ^ 114186275566852L;
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(29472, 2721683919429907222L ^ var0));
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(14819, 1182674109441898964L ^ var0));
      return X(var4, var2, var3, class_124.field_1074);
   }

   @NotNull
   public static final class_5250 e(int a, @NotNull class_5250 $this$green, short a, @NotNull String addition, char a) {
      long var5 = ((long)var0 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 99596559043618L;
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(29472, 2721687472187787824L ^ var5));
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(14819, 1182633165273202930L ^ var5));
      return X(var7, var1, var3, class_124.field_1060);
   }

   @NotNull
   public static final class_5250 r(@NotNull class_5250 $this$white, long a, @NotNull String addition) {
      var1 ^= a;
      long var4 = var1 ^ 105874269285708L;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(29472, 2721681099084376926L ^ var1));
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(14819, 1182674593996300700L ^ var1));
      return X(var4, var0, var3, class_124.field_1068);
   }

   @NotNull
   public static final class_5250 Q(long a, @NotNull class_5250 $this$gray, @NotNull String addition) {
      var0 ^= a;
      long var4 = var0 ^ 83856470291011L;
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(29472, 2721711861337175121L ^ var0));
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(14819, 1182643813931220627L ^ var0));
      return X(var4, var2, var3, class_124.field_1080);
   }

   @NotNull
   public static final class_5250 y(@NotNull class_5250 $this$aqua, @NotNull String addition, long a) {
      var2 ^= a;
      long var4 = var2 ^ 31814499997975L;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(29472, 2721623536260030213L ^ var2));
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(14819, 1182697255816779207L ^ var2));
      return X(var4, var0, var1, class_124.field_1075);
   }

   @NotNull
   public static final class_5250 g(@NotNull class_5250 $this$darkBlue, short a, short a, @NotNull String addition, int a) {
      long var5 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 139188058425041L;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(29472, 2721656694129033411L ^ var5));
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(14819, 1182663960075618817L ^ var5));
      return X(var7, var0, var3, class_124.field_1058);
   }

   @NotNull
   public static final class_5250 m(@NotNull class_5250 $this$darkGreen, @NotNull String addition, long a) {
      var2 ^= a;
      long var4 = var2 ^ 89849470844672L;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(29472, 2721699710492309778L ^ var2));
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(14819, 1182623417648264144L ^ var2));
      return X(var4, var0, var1, class_124.field_1077);
   }

   @NotNull
   public static final class_5250 M(@NotNull class_5250 $this$darkAqua, long a, @NotNull String addition) {
      var1 ^= a;
      long var4 = var1 ^ 67937724038618L;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(29472, 2721589285639683016L ^ var1));
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(14819, 1182733412865749258L ^ var1));
      return X(var4, var0, var3, class_124.field_1062);
   }

   @NotNull
   public static final class_5250 a(@NotNull class_5250 $this$darkRed, @NotNull String addition, long a) {
      var2 ^= a;
      long var4 = var2 ^ 28021262524599L;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(29472, 2721620844160853669L ^ var2));
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(14819, 1182702258204666983L ^ var2));
      return X(var4, var0, var1, class_124.field_1079);
   }

   @NotNull
   public static final class_5250 c(int a, @NotNull class_5250 $this$darkPurple, @NotNull String addition, long a) {
      long var5 = ((long)var0 << 32 | var3 << 32 >>> 32) ^ a;
      long var7 = var5 ^ 65759251558252L;
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(29472, 2721582709929666942L ^ var5));
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(14819, 1182739997806371772L ^ var5));
      return X(var7, var1, var2, class_124.field_1064);
   }

   @NotNull
   public static final class_5250 C(long a, @NotNull class_5250 $this$gold, @NotNull String addition) {
      var0 ^= a;
      long var4 = var0 ^ 54140078871762L;
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(29472, 2721594733767742144L ^ var0));
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(14819, 1182728377020848130L ^ var0));
      return X(var4, var2, var3, class_124.field_1065);
   }

   @NotNull
   public static final class_5250 X(int a, @NotNull class_5250 $this$darkGray, int a, char a, @NotNull String addition) {
      long var5 = ((long)var0 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 55081461841430L;
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(29472, 2721591275736332292L ^ var5));
      Intrinsics.checkNotNullParameter(var4, true.i<invokedynamic>(14819, 1182729353231217350L ^ var5));
      return X(var7, var1, var4, class_124.field_1063);
   }

   @NotNull
   public static final class_5250 n(long a, @NotNull class_5250 $this$blue, @NotNull String addition) {
      var0 ^= a;
      long var4 = var0 ^ 109147271353706L;
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(29472, 2721679973498868600L ^ var0));
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(14819, 1182677900892510650L ^ var0));
      return X(var4, var2, var3, class_124.field_1078);
   }

   @NotNull
   public static final class_5250 H(@NotNull class_5250 $this$red, @NotNull String addition, long a) {
      var2 ^= a;
      long var4 = var2 ^ 7335620319432L;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(29472, 2721647980844981978L ^ var2));
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(14819, 1182707995205325848L ^ var2));
      return X(var4, var0, var1, class_124.field_1061);
   }

   @NotNull
   public static final class_5250 I(@NotNull class_5250 $this$lightPurple, @NotNull String addition, long a) {
      var2 ^= a;
      long var4 = var2 ^ 85378085793479L;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(31880, 6447342252635432825L ^ var2));
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(10434, 6543503065753482037L ^ var2));
      return X(var4, var0, var1, class_124.field_1076);
   }

   @NotNull
   public static final class_5250 i(@NotNull class_5250 $this$yellow, long a, @NotNull String addition) {
      var1 ^= a;
      long var4 = var1 ^ 87859677152665L;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(29472, 2721710367498519435L ^ var1));
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(14819, 1182647782308677961L ^ var1));
      return X(var4, var0, var3, class_124.field_1054);
   }

   @NotNull
   public static final class_5250 j(@NotNull class_5250 $this$obf, @NotNull String addition, long a) {
      var2 ^= a;
      long var4 = var2 ^ 56336105728143L;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(29472, 2721592528246042269L ^ var2));
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(14819, 1182730574660412511L ^ var2));
      return X(var4, var0, var1, class_124.field_1051);
   }

   @NotNull
   public static final class_5250 x(int a, short a, int a, @NotNull class_5250 $this$bold, @NotNull String addition) {
      long var5 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 140221610040854L;
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(29472, 2721657722061068292L ^ var5));
      Intrinsics.checkNotNullParameter(var4, true.i<invokedynamic>(14819, 1182664994164101830L ^ var5));
      return X(var7, var3, var4, class_124.field_1067);
   }

   @NotNull
   public static final class_5250 U(@NotNull class_5250 $this$strikethrough, @NotNull String addition, long a) {
      var2 ^= a;
      long var4 = var2 ^ 126134476998957L;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(29472, 2721661226296119103L ^ var2));
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(14819, 1182659702648161789L ^ var2));
      return X(var4, var0, var1, class_124.field_1055);
   }

   @NotNull
   public static final class_5250 p(@NotNull class_5250 $this$underline, @NotNull String addition, long a) {
      var2 ^= a;
      long var4 = var2 ^ 63018147024478L;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(29472, 2721585468279031884L ^ var2));
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(14819, 1182737359716074126L ^ var2));
      return X(var4, var0, var1, class_124.field_1073);
   }

   @NotNull
   public static final class_5250 S(@NotNull class_5250 $this$italic, @NotNull String addition, long a) {
      var2 ^= a;
      long var4 = var2 ^ 46368357071367L;
      Intrinsics.checkNotNullParameter(var0, true.i<invokedynamic>(29472, 2721600151882054677L ^ var2));
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(14819, 1182755824028808919L ^ var2));
      return X(var4, var0, var1, class_124.field_1056);
   }

   @NotNull
   public static final class_5250 F(long a, @NotNull class_5250 $this$reset, @NotNull String addition) {
      var0 ^= a;
      long var4 = var0 ^ 126932285268997L;
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(29472, 2721662576002966039L ^ var0));
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(14819, 1182660534822463701L ^ var0));
      return X(var4, var2, var3, class_124.field_1070);
   }

   @NotNull
   public static final class_5250 f(long var0) {
      var0 ^= a;
      class_5250 var10000 = class_2561.method_43473();
      Intrinsics.checkNotNullExpressionValue(var10000, true.i<invokedynamic>(11863, 4622497311052757777L ^ var0));
      return var10000;
   }

   @NotNull
   public static final class_2561 W(int a, int a, @NotNull String $this$text) {
      long var3 = ((long)var0 << 32 | (long)var1 << 32 >>> 32) ^ a;
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(29472, 2721611848079272006L ^ var3));
      class_2561 var10000 = class_2561.method_30163(var2);
      Intrinsics.checkNotNullExpressionValue(var10000, true.i<invokedynamic>(30359, 6752202391059656182L ^ var3));
      return var10000;
   }

   static {
      long var0 = a ^ 130218572432124L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "oËÐ\u0088ÝÂ»tÕ¡\u0005^ò¿+\u001c½<jSup\u0000`[\u009b\u0015¸âò£\u008e \u000b\u00115Ò\u0015¶[\u000eÆ¦0\n\u0084ûù[å\u0089mQü\u0015·¹÷\u0094ö!fL¼± dy{éYü¹\u0000Dô\u0099Ï»t\u0014iná\u008cX\u0094\b|+0Ùhh;é\u0089þ\u0010Ae¸áÍ\u0004\n\u001fP,Ö42\u0096\u0098ú(f*\u0080ä(Õ¬¬Èù6b!ëTo\u00107$q¾\u0007í\u0091+Ê\u0005Wý0\u001fãi)Y«zzC) ûòb\u0017\"ðÊ\u0019vÕ8àG¶°XxªÚ*££z¬\u0003\u0007ª8Êµvý";
      int var8 = "oËÐ\u0088ÝÂ»tÕ¡\u0005^ò¿+\u001c½<jSup\u0000`[\u009b\u0015¸âò£\u008e \u000b\u00115Ò\u0015¶[\u000eÆ¦0\n\u0084ûù[å\u0089mQü\u0015·¹÷\u0094ö!fL¼± dy{éYü¹\u0000Dô\u0099Ï»t\u0014iná\u008cX\u0094\b|+0Ùhh;é\u0089þ\u0010Ae¸áÍ\u0004\n\u001fP,Ö42\u0096\u0098ú(f*\u0080ä(Õ¬¬Èù6b!ëTo\u00107$q¾\u0007í\u0091+Ê\u0005Wý0\u001fãi)Y«zzC) ûòb\u0017\"ðÊ\u0019vÕ8àG¶°XxªÚ*££z¬\u0003\u0007ª8Êµvý".length();
      char var5 = ' ';
      int var4 = -1;

      label27:
      while(true) {
         ++var4;
         String var11 = var6.substring(var4, var4 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var10).intern();
            switch(var10001) {
            case 0:
               var9[var7++] = var15;
               if ((var4 += var5) >= var8) {
                  b = var9;
                  c = new String[8];
                  return;
               }

               var5 = var6.charAt(var4);
               break;
            default:
               var9[var7++] = var15;
               if ((var4 += var5) < var8) {
                  var5 = var6.charAt(var4);
                  continue label27;
               }

               var6 = "R9ÿ3\u0095O¹\u0096óÀ\u0092\u001a'è\u0096¦\u0094doV*5'W\u0010\u0017ÿéµ\u00111\n]\u0088þð/l*(p";
               var8 = "R9ÿ3\u0095O¹\u0096óÀ\u0092\u001a'è\u0096¦\u0094doV*5'W\u0010\u0017ÿéµ\u00111\n]\u0088þð/l*(p".length();
               var5 = 24;
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26300;
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
            throw new RuntimeException("su/catlean/hl", var10);
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
         throw new RuntimeException("su/catlean/hl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
