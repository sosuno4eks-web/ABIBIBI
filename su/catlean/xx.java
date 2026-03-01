package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.gofra.Flow;

public final class xx implements zh {
   @NotNull
   public static final xx l;
   @NotNull
   private static final String g;
   @NotNull
   private static final String C;
   private static int X;
   private static boolean A;
   private static boolean Y;
   @NotNull
   private static final iv t;
   @NotNull
   private static final iv d;
   @NotNull
   private static CopyOnWriteArrayList y;
   @NotNull
   private static ConcurrentHashMap T;
   private static String[] Q;
   private static final long a = j0.a(2708943992478377876L, 8736964012571691095L, MethodHandles.lookup().lookupClass()).a(271048536979605L);
   private static final String[] b;
   private static final String[] c;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] h;
   private static final Map i;

   private xx() {
   }

   @Flow
   private final void N(TickEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public final void F(long a, @NotNull String name) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.n<invokedynamic>(16785, 3304341512921707036L ^ var1));
      String var10002 = true.n<invokedynamic>(13341, 3076283556938287003L ^ var1);
      String var4 = var10002 + var3 + true.n<invokedynamic>(14480, 2749908336461515541L ^ var1);
      HttpRequest var5 = HttpRequest.newBuilder(URI.create(true.n<invokedynamic>(26803, 4698083971126745914L ^ var1))).header(true.n<invokedynamic>(32303, 4252060795566509487L ^ var1), true.n<invokedynamic>(8316, 2094393653736313848L ^ var1)).POST(BodyPublishers.ofString(var4)).build();

      try {
         HttpClient.newHttpClient().send(var5, BodyHandlers.ofString());
      } catch (Throwable var7) {
      }

   }

   @NotNull
   public final List l(char var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      HttpRequest var6 = HttpRequest.newBuilder(URI.create(true.n<invokedynamic>(28582, 1608642000443292682L ^ var4))).GET().build();

      List var7;
      try {
         HttpResponse var12 = HttpClient.newHttpClient().send(var6, BodyHandlers.ofString());
         List var13;
         if (var12.statusCode() == true.k<invokedynamic>(15971, 4935549206945569455L ^ var4)) {
            Json var8 = h7.m();
            Object var10000 = var12.body();
            Intrinsics.checkNotNullExpressionValue(var10000, true.n<invokedynamic>(28340, 3420948483804183833L ^ var4));
            String var9 = (String)var10000;
            boolean var10 = false;
            var8.getSerializersModule();
            var13 = (List)var8.decodeFromString((DeserializationStrategy)(new ArrayListSerializer(StringSerializer.INSTANCE)), var9);
         } else {
            var13 = (List)(new ArrayList());
         }

         var7 = var13;
      } catch (Exception var11) {
         var7 = (List)(new ArrayList());
      }

      return var7;
   }

   public final boolean a(long a, @NotNull String string) {
      // $FF: Couldn't be decompiled
   }

   private final String d(String var1, long var2) {
      var2 ^= a;
      long var4 = var2 ^ 109686922208551L;
      String[] var10000 = 3693392959471458996L.A<invokedynamic>(3693392959471458996L, var2);
      byte[] var10001 = var1.getBytes(Charsets.UTF_8);
      Intrinsics.checkNotNullExpressionValue(var10001, true.n<invokedynamic>(25702, 7431661043747464972L ^ var2));
      byte[] var7 = var10001;
      String[] var6 = var10000;
      String var9 = true.n<invokedynamic>(18039, 5305877662371349770L ^ var2);
      byte[] var12 = var9.getBytes(Charsets.UTF_8);
      Intrinsics.checkNotNullExpressionValue(var12, true.n<invokedynamic>(20948, 5161814228369183400L ^ var2));
      byte[] var8 = var12;
      byte[] var13 = new byte[var7.length];
      int var10 = 0;
      int var11 = var7.length;

      label21:
      while(true) {
         if (var10 < var11) {
            var13[var10] = (byte)(var7[var10] ^ var8[var10 % var8.length]);
            ++var10;
            if (var6 == null) {
               continue;
            }
         }

         while(var2 <= 0L) {
            if (var6 == null) {
               continue label21;
            }
         }

         return this.X(var4, var13);
      }
   }

   private final String X(long var1, byte[] var3) {
      var1 ^= a;
      String var10000 = Base64.getEncoder().encodeToString(var3);
      Intrinsics.checkNotNullExpressionValue(var10000, true.n<invokedynamic>(7522, 1372493688194445243L ^ var1));
      return StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(var10000, (char)true.k<invokedynamic>(28321, 8324382361820441362L ^ var1), (char)true.k<invokedynamic>(902, 8056798851213411899L ^ var1), false, 4, (Object)null), (char)true.k<invokedynamic>(17507, 13421232167780831L ^ var1), (char)true.k<invokedynamic>(1394, 71262064437313733L ^ var1), false, 4, (Object)null), (char)true.k<invokedynamic>(31327, 4964399786922557417L ^ var1), (char)true.k<invokedynamic>(8527, 2652635153929430271L ^ var1), false, 4, (Object)null);
   }

   public static final String q(char a, xx $this, int a, int a, String input) {
      long var5 = ((long)var0 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ a;
      long var7 = var5 ^ 64948935383816L;
      return var1.d(var4, var7);
   }

   public static final int V() {
      return X;
   }

   public static final CopyOnWriteArrayList S() {
      return y;
   }

   static {
      long var20 = a ^ 130213167098943L;
      e = new HashMap(13);
      null.A<invokedynamic>((Object)null, 8725092071535099752L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[18];
      int var16 = 0;
      String var15 = "+È6²\u001asNðô\u0083>tÝ\u0014\u009fç([öM_kù\u0092\tâY[>KÓÇ0-p\u0014\u00adAÅø@C\u0091\u0090\u0002Ö\u0089r5á\u009a\u007f\u0010ê¦çø ¢y\u0001\u0085¿B-Gl::/3\u0088\u009cBy\u0096É#Êy\u0091FpBwBØZEÅ DmTñz\u0007YÕëÒ\u0084(1Ogé\bÛÔs¬¡ )k#È\u009f´YK\u0084\u0010b\u001e)*\u0003*åÖÑÄ \u0000\u0098NoW\u0018\tÚ\u001eyÕx\u0017Iæq4\u0004º'°Ì\u0095³%\u0080JurH(\u0084¦mÙê7{ÐÆ\u0082'|\u001bêO\u0088öOBï\u0011\u000b®G@æ\u0080)¹\u001dÇ&\u0010åÌJç^¸?\u0018\r²UíÕ×\u0016\u009d½W.ÛÀo2I@¨\u0017è\u0095ï\u001fÝ\u0010\u0003·D¡Þt/ÂjçæØØO@©8V~õ\u0089\u0003£*ë°µ;¬\u0086ñÐÑ´î[\u0089'\u008fÆÆE¡¶\u001aíã7T\u009emÞ¿ò,¬jæ\u0017\u009c©æ\u000fY\"3×=~Ó}Cã \u0084'cè«¦\u009fIÒ8\t\u0005±\u0080jæ\u0084¢,\u009b\u0012\u0096á5Õ.\u001ew\tóUy@Ú\u0018°S¶xÀ\u0096W\u0087°]\u001e®J\fBÀ:O½\u0082Ì¹\u001dEÐa¾Ü\u0016ã^|pB÷ÄD§µ+W\u0082\u001aç?v\u0013^D³TßcÄÛ\u0002»Ê\u000b\u0091Z\u008e0½\u0004T\u0085o\u0001O{>MoAsÑ½3\u0001¸´1GÃ\rÝòÞè-n;PAE\u009eÖ<K¶\u0095 |Y\u0002@{\u0013â&\u0018ë\u0081$é\u0098L\\\u009e°h«iìð°×Ïw\u009f\u001dCÿ7(\u0010Ì\bN¼)<'¨\u009aó©\u0081Ü1ýÒ HE°ã\u0098Ý\u008c,¨Ô÷>SÏÃÆI\u0002DîLùbÅÒX\u001aËèÛÒ\u0094";
      int var17 = "+È6²\u001asNðô\u0083>tÝ\u0014\u009fç([öM_kù\u0092\tâY[>KÓÇ0-p\u0014\u00adAÅø@C\u0091\u0090\u0002Ö\u0089r5á\u009a\u007f\u0010ê¦çø ¢y\u0001\u0085¿B-Gl::/3\u0088\u009cBy\u0096É#Êy\u0091FpBwBØZEÅ DmTñz\u0007YÕëÒ\u0084(1Ogé\bÛÔs¬¡ )k#È\u009f´YK\u0084\u0010b\u001e)*\u0003*åÖÑÄ \u0000\u0098NoW\u0018\tÚ\u001eyÕx\u0017Iæq4\u0004º'°Ì\u0095³%\u0080JurH(\u0084¦mÙê7{ÐÆ\u0082'|\u001bêO\u0088öOBï\u0011\u000b®G@æ\u0080)¹\u001dÇ&\u0010åÌJç^¸?\u0018\r²UíÕ×\u0016\u009d½W.ÛÀo2I@¨\u0017è\u0095ï\u001fÝ\u0010\u0003·D¡Þt/ÂjçæØØO@©8V~õ\u0089\u0003£*ë°µ;¬\u0086ñÐÑ´î[\u0089'\u008fÆÆE¡¶\u001aíã7T\u009emÞ¿ò,¬jæ\u0017\u009c©æ\u000fY\"3×=~Ó}Cã \u0084'cè«¦\u009fIÒ8\t\u0005±\u0080jæ\u0084¢,\u009b\u0012\u0096á5Õ.\u001ew\tóUy@Ú\u0018°S¶xÀ\u0096W\u0087°]\u001e®J\fBÀ:O½\u0082Ì¹\u001dEÐa¾Ü\u0016ã^|pB÷ÄD§µ+W\u0082\u001aç?v\u0013^D³TßcÄÛ\u0002»Ê\u000b\u0091Z\u008e0½\u0004T\u0085o\u0001O{>MoAsÑ½3\u0001¸´1GÃ\rÝòÞè-n;PAE\u009eÖ<K¶\u0095 |Y\u0002@{\u0013â&\u0018ë\u0081$é\u0098L\\\u009e°h«iìð°×Ïw\u009f\u001dCÿ7(\u0010Ì\bN¼)<'¨\u009aó©\u0081Ü1ýÒ HE°ã\u0098Ý\u008c,¨Ô÷>SÏÃÆI\u0002DîLùbÅÒX\u001aËèÛÒ\u0094".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var29 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var29;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[18];
                  C = true.n<invokedynamic>(31414, 6844028815002465237L ^ var20);
                  g = true.n<invokedynamic>(24271, 3943889488864663463L ^ var20);
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[10];
                  int var3 = 0;
                  String var4 = "\u0098\u008e¥¦ÌÕ> \u0016¨\u009d\u0017X3+Ôà y\u0094´pLª`·üË\u009a£½%ò[\u0091\u009a§4©f&û³\u0086ë\u0090ÿ¶zÁ(2\u001d\u001d®\u0094N\u0006Ý?²\u001dT\u0003";
                  int var5 = "\u0098\u008e¥¦ÌÕ> \u0016¨\u009d\u0017X3+Ôà y\u0094´pLª`·üË\u009a£½%ò[\u0091\u009a§4©f&û³\u0086ë\u0090ÿ¶zÁ(2\u001d\u001d®\u0094N\u0006Ý?²\u001dT\u0003".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     long[] var25 = var6;
                     var27 = var3++;
                     long var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var32 = -1;

                     while(true) {
                        long var8 = var31;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var34 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var32) {
                        case 0:
                           var25[var27] = var34;
                           if (var2 >= var5) {
                              f = var6;
                              h = new Integer[10];
                              l = new xx();
                              X = -1;
                              t = new iv();
                              d = new iv();
                              y = new CopyOnWriteArrayList();
                              T = new ConcurrentHashMap();
                              xx var26 = l;
                              X = Random.Default.nextInt(0, true.k<invokedynamic>(22234, 2105267829370431706L ^ var20));
                              return;
                           }
                           break;
                        default:
                           var25[var27] = var34;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "p\u0096\u001fËÊ[u¡\u0018\u008e\u0093êt!PÖ";
                           var5 = "p\u0096\u001fËÊ[u¡\u0018\u008e\u0093êt!PÖ".length();
                           var2 = 0;
                        }

                        var27 = var2;
                        var2 += 8;
                        var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        var25 = var6;
                        var27 = var3++;
                        var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var32 = 0;
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

               var15 = "\u0099\u007féæ?+Q¦>\u009eN>\fï®¢\ns¬\u0082{±3e\u0018jÆ\u001föA#øõP$Óï\u008c`\u0005V·Qí\u0094md$~";
               var17 = "\u0099\u007féæ?+Q¦>\u009eN>\fï®¢\ns¬\u0082{±3e\u0018jÆ\u001föA#øõP$Óï\u008c`\u0005V·Qí\u0094md$~".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void s(String[] var0) {
      Q = var0;
   }

   public static String[] T() {
      return Q;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 29120;
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
            throw new RuntimeException("su/catlean/xx", var10);
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
         throw new RuntimeException("su/catlean/xx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1707;
      if (h[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/xx", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("su/catlean/xx" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
