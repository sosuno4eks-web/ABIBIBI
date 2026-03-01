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
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class zw {
   @NotNull
   public static final be w;
   @NotNull
   private String X;
   @NotNull
   private String r;
   @NotNull
   private String F;
   @NotNull
   private String H;
   private boolean R;
   private static int[] B;
   private static final long a = j0.a(1664945476194771494L, 8132128329832576760L, MethodHandles.lookup().lookupClass()).a(149191085522719L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   public zw(@NotNull String modulesConfig, short a, int a, @NotNull String widgetsConfig, @NotNull String inventoriesConfig, short a, @NotNull String themeConfig, boolean rpcAsked) {
      long var9 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var6 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var1, true.n<invokedynamic>(13816, 9040066394247919828L ^ var9));
      Intrinsics.checkNotNullParameter(var4, true.n<invokedynamic>(17780, 7016647581186721863L ^ var9));
      Intrinsics.checkNotNullParameter(var5, true.n<invokedynamic>(25481, 5906241256025992891L ^ var9));
      Intrinsics.checkNotNullParameter(var7, true.n<invokedynamic>(31575, 6870652653110998625L ^ var9));
      super();
      this.X = var1;
      this.r = var4;
      this.F = var5;
      this.H = var7;
      this.R = var8;
   }

   public zw(String var1, long var2, String var4, String var5, String var6, boolean var7, int var8, DefaultConstructorMarker var9) {
      var2 ^= a;
      long var10001 = var2 ^ 37600035181796L;
      int var10 = (int)((var2 ^ 37600035181796L) >>> 48);
      int var11 = (int)(var10001 << 16 >>> 32);
      int var12 = (int)(var10001 << 48 >>> 48);
      if ((var8 & 1) != 0) {
         var1 = true.n<invokedynamic>(21112, 4699622480866910446L ^ var2);
      }

      if ((var8 & 2) != 0) {
         var4 = true.n<invokedynamic>(19234, 9043859998111545789L ^ var2);
      }

      if ((var8 & 4) != 0) {
         var5 = true.n<invokedynamic>(19234, 9043859998111545789L ^ var2);
      }

      if ((var8 & true.f<invokedynamic>(22899, 4299357257750642082L ^ var2)) != 0) {
         var6 = it.p().F();
      }

      if ((var8 & true.f<invokedynamic>(16701, 2739753179555816941L ^ var2)) != 0) {
         var7 = false;
      }

      this(var1, (short)var10, var11, var4, var5, (short)var12, var6, var7);
   }

   @NotNull
   public final String E() {
      return this.X;
   }

   public final void R(long a, @NotNull String <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.n<invokedynamic>(32390, 3650047191402984199L ^ var1));
      this.X = var3;
   }

   @NotNull
   public final String A() {
      return this.r;
   }

   public final void f(@NotNull String <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.n<invokedynamic>(22547, 2576969636898460260L ^ var2));
      this.r = var1;
   }

   @NotNull
   public final String x() {
      return this.F;
   }

   public final void B(long a, @NotNull String <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.n<invokedynamic>(22547, 2577034437468192430L ^ var1));
      this.F = var3;
   }

   @NotNull
   public final String U() {
      return this.H;
   }

   public final void n(@NotNull String <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.n<invokedynamic>(22547, 2576981892115677158L ^ var2));
      this.H = var1;
   }

   public final boolean k() {
      return this.R;
   }

   public final void i(boolean <set-?>) {
      this.R = var1;
   }

   @NotNull
   public final String Y() {
      return this.X;
   }

   @NotNull
   public final String o() {
      return this.r;
   }

   @NotNull
   public final String c() {
      return this.F;
   }

   @NotNull
   public final String W() {
      return this.H;
   }

   public final boolean Q() {
      return this.R;
   }

   @NotNull
   public final zw v(@NotNull String modulesConfig, @NotNull String widgetsConfig, long a, @NotNull String inventoriesConfig, @NotNull String themeConfig, boolean rpcAsked) {
      var3 ^= a;
      long var10001 = var3 ^ 124010759294719L;
      int var8 = (int)((var3 ^ 124010759294719L) >>> 48);
      int var9 = (int)(var10001 << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var1, true.n<invokedynamic>(24157, 4080726665608148692L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.n<invokedynamic>(31686, 2680727720103252803L ^ var3));
      Intrinsics.checkNotNullParameter(var5, true.n<invokedynamic>(14533, 8910672723291066435L ^ var3));
      Intrinsics.checkNotNullParameter(var6, true.n<invokedynamic>(26678, 8907326343530217662L ^ var3));
      return new zw(var1, (short)var8, var9, var2, var5, (short)var10, var6, var7);
   }

   public static zw l(zw param0, String param1, String param2, String param3, String param4, long param5, boolean param7, int param8, Object param9) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 102705466414728L;
      boolean var3 = this.R;
      String var4 = this.H;
      String var5 = this.F;
      String var6 = this.r;
      String var7 = this.X;
      String var10000 = 11895.n<invokedynamic>(11895, 3762577203028724310L ^ var1);
      return var10000 + var7 + true.n<invokedynamic>(25659, 1047976680398471185L ^ var1) + var6 + true.n<invokedynamic>(4951, 7330044429371062129L ^ var1) + var5 + true.n<invokedynamic>(24290, 5528373975073454798L ^ var1) + var4 + true.n<invokedynamic>(6719, 5959627175394623003L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 57262522747762L;
      int var3 = this.X.hashCode();
      var3 = var3 * true.f<invokedynamic>(14404, 4797545041901852624L ^ var1) + this.r.hashCode();
      var3 = var3 * true.f<invokedynamic>(8662, 7492616939068493382L ^ var1) + this.F.hashCode();
      var3 = var3 * true.f<invokedynamic>(8662, 7492616939068493382L ^ var1) + this.H.hashCode();
      var3 = var3 * true.f<invokedynamic>(8662, 7492616939068493382L ^ var1) + Boolean.hashCode(this.R);
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void A(zw self, CompositeEncoder output, long a, SerialDescriptor serialDesc) {
      // $FF: Couldn't be decompiled
   }

   public zw(int seen0, String modulesConfig, String widgetsConfig, String inventoriesConfig, String themeConfig, boolean rpcAsked, SerializationConstructorMarker serializationConstructorMarker, long a) {
      // $FF: Couldn't be decompiled
   }

   public zw(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 42457067100429L;
      this((String)null, var3, (String)null, (String)null, (String)null, false, true.f<invokedynamic>(8662, 7492623729527109454L ^ var1), (DefaultConstructorMarker)null);
   }

   static {
      long var20 = a ^ 18189154677324L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, 6406787909633923385L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[17];
      int var16 = 0;
      String var15 = "ä\u0095\u009cç¹{Êh\u0004\u0015ë\u0085~ênR(ÛÔ\u0080\u008a\u001aÀ!\u0019k\u008d?Æ\u009a{B!\u000bP\u009cá7\u009fÎ\u0080Ú7\u0019\"Þ>»F~\u0000\u0083\u008c^:z\u0007\u0010Bµå3¡ \u00061¥%·T@öëô ç÷×5\to\tx:;\\\u001ae`\u0010£ÇÁqê\u0084EXù\u008eB\u008c½ãb7ë\u0018SÛ\u0007\u001c\u0091I\u008a¶Y+¨ð\u0092Ð\u0088\u0081vüã0äûFÉ\u0010Á@=¾p\u0092\u001eÄ(ë\u0092\u0087\u0085&Ê\u00140l\u001c\u0089À\u0095¸$m\u0017 4«\u008f¿EmK¹ôÔ\u008f´\u001a¡D²\u0085y¤ÝÊ\u0016\u0013Ü\u0016Áî^Ø&\u001c}S\u001fáuP`(\u001ap\u0092É\u0002\u0001?&\u009d®\u0000GÕGÜû\u0013M\u0011¶\u0018\u009a`°\u0099ÙÊïÖ\u0094¹\u0082\u000e×öFFmÿJ\u0018ÄÚ\u0000\u008cZä5´.)VóGØ\u0000^a?ô£r§ \u008e\u00183#\r8go´\u0012Í²øG\u0014ÔT\u0011]û§é¸S\u0093\u009c Ø \u0019ó\u0019}9\u001b\u0018þ\u0017Ññ¶\u009b'²B\u0085\u0010\u0081Òa@ÇÔ\u0017DxR(\n äe\u0095\u009e\u0087¿2E\u0095È{\u0010\u0084\tÙ\u001eCê`S\u0091ª\u0086)ÐvÖ:¨Zó@\u0010U=\u001a\u0011\u0013ä[àÇÍ!8{\u0006\u0081q(Ë\u008at¬Å>\u001c,\u0017ç?e\u0096ú\u0012/þÓÂª[§\u0084W\u009aº\u0016Á8\u008fÉÏä\u001e\u008dûNgì](\u0092Bú°Õ*Y\u0006ø{<y[ 2\u00072]¸Åb½\u008eÂ37U¥e\u001d\u001a'½duûqê\u0090A";
      int var17 = "ä\u0095\u009cç¹{Êh\u0004\u0015ë\u0085~ênR(ÛÔ\u0080\u008a\u001aÀ!\u0019k\u008d?Æ\u009a{B!\u000bP\u009cá7\u009fÎ\u0080Ú7\u0019\"Þ>»F~\u0000\u0083\u008c^:z\u0007\u0010Bµå3¡ \u00061¥%·T@öëô ç÷×5\to\tx:;\\\u001ae`\u0010£ÇÁqê\u0084EXù\u008eB\u008c½ãb7ë\u0018SÛ\u0007\u001c\u0091I\u008a¶Y+¨ð\u0092Ð\u0088\u0081vüã0äûFÉ\u0010Á@=¾p\u0092\u001eÄ(ë\u0092\u0087\u0085&Ê\u00140l\u001c\u0089À\u0095¸$m\u0017 4«\u008f¿EmK¹ôÔ\u008f´\u001a¡D²\u0085y¤ÝÊ\u0016\u0013Ü\u0016Áî^Ø&\u001c}S\u001fáuP`(\u001ap\u0092É\u0002\u0001?&\u009d®\u0000GÕGÜû\u0013M\u0011¶\u0018\u009a`°\u0099ÙÊïÖ\u0094¹\u0082\u000e×öFFmÿJ\u0018ÄÚ\u0000\u008cZä5´.)VóGØ\u0000^a?ô£r§ \u008e\u00183#\r8go´\u0012Í²øG\u0014ÔT\u0011]û§é¸S\u0093\u009c Ø \u0019ó\u0019}9\u001b\u0018þ\u0017Ññ¶\u009b'²B\u0085\u0010\u0081Òa@ÇÔ\u0017DxR(\n äe\u0095\u009e\u0087¿2E\u0095È{\u0010\u0084\tÙ\u001eCê`S\u0091ª\u0086)ÐvÖ:¨Zó@\u0010U=\u001a\u0011\u0013ä[àÇÍ!8{\u0006\u0081q(Ë\u008at¬Å>\u001c,\u0017ç?e\u0096ú\u0012/þÓÂª[§\u0084W\u009aº\u0016Á8\u008fÉÏä\u001e\u008dûNgì](\u0092Bú°Õ*Y\u0006ø{<y[ 2\u00072]¸Åb½\u008eÂ37U¥e\u001d\u001a'½duûqê\u0090A".length();
      char var14 = 16;
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
                  c = new String[17];
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
                  String var4 = "ã½\u0087k¤\f¸\u0098E\u009d_\u007fW%ù\u008bÒiG'R9Wó®\u007f ¢²ë\u0081;";
                  int var5 = "ã½\u0087k¤\f¸\u0098E\u009d_\u007fW%ù\u008bÒiG'R9Wó®\u007f ¢²ë\u0081;".length();
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
                              w = new be((DefaultConstructorMarker)null);
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0000N4ð\u0018\u009avµ\u009d\u0087ÿ[ñº£m";
                           var5 = "\u0000N4ð\u0018\u009avµ\u009d\u0087ÿ[ñº£m".length();
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

               var15 = "ÑG\u007f:¨h\u0003\u0098á¤NIõä,oOUD\u009bhÖ/Ý£3\f\u0088\u0014û¤\\ Ó\u0083xõÜµ\u0011þw+\u008cßrNô³w\u0006x#ª~õ®Q´\u009c×ì£èù";
               var17 = "ÑG\u007f:¨h\u0003\u0098á¤NIõä,oOUD\u009bhÖ/Ý£3\f\u0088\u0014û¤\\ Ó\u0083xõÜµ\u0011þw+\u008cßrNô³w\u0006x#ª~õ®Q´\u009c×ì£èù".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void b(int[] var0) {
      B = var0;
   }

   public static int[] i() {
      return B;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 6637;
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
            throw new RuntimeException("su/catlean/zw", var10);
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
         throw new RuntimeException("su/catlean/zw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 20389;
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
            throw new RuntimeException("su/catlean/zw", var14);
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
         throw new RuntimeException("su/catlean/zw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
