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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum q7 {
   private final float q;
   private final float R;
   private final float r;
   private final float S;
   public static final q7 SMOKE;
   public static final q7 CIRCLE;
   public static final q7 CRACK;
   public static final q7 CLOUD;
   public static final q7 DOLLAR;
   public static final q7 DROP;
   public static final q7 FIREFLY;
   public static final q7 FIREFLY_ALT;
   public static final q7 HEART;
   public static final q7 SNOWFLAKE;
   public static final q7 STAR;
   public static final q7 TRIANGLE1;
   public static final q7 TRIANGLE2;
   public static final q7 TRIANGLE3;
   public static final q7 TRIANGLE4;
   public static final q7 HALO;
   public static final q7 TRIANGLE5;
   // $FF: synthetic field
   private static final EnumEntries w;
   private static boolean F;
   private static final long a = j0.a(3289699681189568516L, 4276491573318209362L, MethodHandles.lookup().lookupClass()).a(265427872841410L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;

   private q7(float var3, float var4, float var5, float var6) {
      this.q = var3;
      this.R = var4;
      this.r = var5;
      this.S = var6;
   }

   public final float Z() {
      return this.q;
   }

   public final float q() {
      return this.R;
   }

   public final float n() {
      return this.r;
   }

   public final float k() {
      return this.S;
   }

   @NotNull
   public static EnumEntries I() {
      return w;
   }

   // $FF: synthetic method
   private static final q7[] w(int var0, int var1, char var2) {
      long var3 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48) ^ a;
      q7[] var5 = new q7[true.m<invokedynamic>(20212, 3205116887808240574L ^ var3)];
      var5[0] = SMOKE;
      var5[1] = CIRCLE;
      var5[2] = CRACK;
      var5[3] = CLOUD;
      var5[4] = DOLLAR;
      var5[5] = DROP;
      var5[true.m<invokedynamic>(16586, 2000015851499939228L ^ var3)] = FIREFLY;
      var5[true.m<invokedynamic>(25287, 4112407591930480533L ^ var3)] = FIREFLY_ALT;
      var5[true.m<invokedynamic>(2614, 4649072329226661753L ^ var3)] = HEART;
      var5[true.m<invokedynamic>(1493, 4750359617142202513L ^ var3)] = SNOWFLAKE;
      var5[true.m<invokedynamic>(11418, 4684683555201452494L ^ var3)] = STAR;
      var5[true.m<invokedynamic>(9815, 4042047434118365974L ^ var3)] = TRIANGLE1;
      var5[true.m<invokedynamic>(32465, 4903406419159735174L ^ var3)] = TRIANGLE2;
      var5[true.m<invokedynamic>(10113, 8666718504483357379L ^ var3)] = TRIANGLE3;
      var5[true.m<invokedynamic>(16266, 124497329375779532L ^ var3)] = TRIANGLE4;
      var5[true.m<invokedynamic>(12968, 2781460834348767206L ^ var3)] = HALO;
      var5[true.m<invokedynamic>(18898, 4317046491856039071L ^ var3)] = TRIANGLE5;
      return var5;
   }

   static {
      long var20 = a ^ 80412204684578L;
      long var10001 = var20 ^ 75847382902603L;
      int var22 = (int)((var20 ^ 75847382902603L) >>> 32);
      int var23 = (int)(var10001 << 32 >>> 48);
      int var24 = (int)(var10001 << 48 >>> 48);
      if (!-6507847891220322708L.A<invokedynamic>(-6507847891220322708L, var20)) {
         true.A<invokedynamic>(true, -6500133188358531069L, var20);
      }

      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[17];
      int var17 = 0;
      String var16 = "ä\u0091\u001b\u0011ô,\u00920âð\u0019³àû\u009fG\b§âoIààÂ¶\u0010Å!\u0010d\u0014$é\u0019kh)Ô\u001b§>\u0017\bL§\u0012TamGü\b8hù¸^\u008b;ú\bâIÈ\u009bËÐ§\u0099\u0010ä\u0091\u001b\u0011ô,\u00920&×2(\t\u0010Ý¨\bä\u0089S÷_mb÷\bÅb\u007fTÿÑ\u0088S\u0010ä\u0091\u001b\u0011ô,\u00920ØKÿ\u008dåÊ\u0092²\u0010Í¦\u0097äÕ\u0082¢\u0091\u0000JjÒ\u0094$ò×\b\u000eh\u001c|õß¾~\u0010ä\u0091\u001b\u0011ô,\u00920\u008e£G°ª©+á\u0010ä\u0091\u001b\u0011ô,\u00920¡tj¸,\u0084ß\u009a\b\n,V\u0096\u0002æc\u0011";
      int var18 = "ä\u0091\u001b\u0011ô,\u00920âð\u0019³àû\u009fG\b§âoIààÂ¶\u0010Å!\u0010d\u0014$é\u0019kh)Ô\u001b§>\u0017\bL§\u0012TamGü\b8hù¸^\u008b;ú\bâIÈ\u009bËÐ§\u0099\u0010ä\u0091\u001b\u0011ô,\u00920&×2(\t\u0010Ý¨\bä\u0089S÷_mb÷\bÅb\u007fTÿÑ\u0088S\u0010ä\u0091\u001b\u0011ô,\u00920ØKÿ\u008dåÊ\u0092²\u0010Í¦\u0097äÕ\u0082¢\u0091\u0000JjÒ\u0094$ò×\b\u000eh\u001c|õß¾~\u0010ä\u0091\u001b\u0011ô,\u00920\u008e£G°ª©+á\u0010ä\u0091\u001b\u0011ô,\u00920¡tj¸,\u0084ß\u009a\b\n,V\u0096\u0002æc\u0011".length();
      char var15 = 16;
      int var14 = -1;

      label58:
      while(true) {
         ++var14;
         String var25 = var16.substring(var14, var14 + var15);
         byte var27 = -1;

         while(true) {
            byte[] var19 = var12.doFinal(var25.getBytes("ISO-8859-1"));
            String var32 = a(var19).intern();
            switch(var27) {
            case 0:
               var11[var17++] = var32;
               if ((var14 += var15) >= var18) {
                  d = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[23];
                  int var3 = 0;
                  String var4 = "Äàí\u0081E\u00900\u0005\u001bOÌ¿\u0094\u008b05åqA\u009c\u008ay:dG]\u001fI\u001d\u009c&\u0086\\¸\u0018ò5ÿvd·\u000bªKJµá@à\u001e½t£þpñ=\u0014\u0010âÀW!\u0088\u0016BeUH\u008a|@Çd@Þ\u008dâ\u001a\u009e_ª\u0016\u0001Íò]¬\u0099\u0087_ßr\u0016êÃ\u0093>É\u0086\u0080p]SÑ\u009a\u0082³±¬\u0001\u0014hµWÌ\u007f«X7ËW%'\u009eí²`\u009c\u008e_\u000b\u0005áÕ}ìZ±\u009f>¹*#\u0010\u008b,[¬Ñ\u0083\u008aµ*Ú,õÓ\u007f6ËU\u0088yT?Tâ";
                  int var5 = "Äàí\u0081E\u00900\u0005\u001bOÌ¿\u0094\u008b05åqA\u009c\u008ay:dG]\u001fI\u001d\u009c&\u0086\\¸\u0018ò5ÿvd·\u000bªKJµá@à\u001e½t£þpñ=\u0014\u0010âÀW!\u0088\u0016BeUH\u008a|@Çd@Þ\u008dâ\u001a\u009e_ª\u0016\u0001Íò]¬\u0099\u0087_ßr\u0016êÃ\u0093>É\u0086\u0080p]SÑ\u009a\u0082³±¬\u0001\u0014hµWÌ\u007f«X7ËW%'\u009eí²`\u009c\u008e_\u000b\u0005áÕ}ìZ±\u009f>¹*#\u0010\u008b,[¬Ñ\u0083\u008aµ*Ú,õÓ\u007f6ËU\u0088yT?Tâ".length();
                  int var2 = 0;

                  label40:
                  while(true) {
                     int var31 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                     long[] var28 = var6;
                     var31 = var3++;
                     long var34 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var35 = -1;

                     while(true) {
                        long var8 = var34;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var37 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var35) {
                        case 0:
                           var28[var31] = var37;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[23];
                              SMOKE = new q7(var11[3], 0, 0.0F, 0.0F, 0.3906F, 0.3906F);
                              CIRCLE = new q7(var11[7], 1, 0.3906F, 0.0F, 0.6406F, 0.25F);
                              CRACK = new q7(var11[1], 2, 0.6406F, 0.0F, 0.8906F, 0.25F);
                              CLOUD = new q7(var11[16], 3, 0.8906F, 0.0F, 0.9531F, 0.0625F);
                              DOLLAR = new q7(var11[5], 4, 0.8906F, 0.0625F, 0.9531F, 0.125F);
                              DROP = new q7(var11[8], 5, 0.8906F, 0.125F, 0.9531F, 0.1875F);
                              FIREFLY = new q7(var11[15], true.m<invokedynamic>(3966, 792086404819942441L ^ var20), 0.8906F, 0.1875F, 0.9531F, 0.25F);
                              FIREFLY_ALT = new q7(var11[10], true.m<invokedynamic>(13067, 1196124252325920839L ^ var20), 0.3906F, 0.25F, 0.4531F, 0.3125F);
                              HEART = new q7(var11[14], true.m<invokedynamic>(21894, 5102807678184695506L ^ var20), 0.4531F, 0.25F, 0.5156F, 0.3125F);
                              SNOWFLAKE = new q7(var11[2], true.m<invokedynamic>(6071, 5511705907518858465L ^ var20), 0.5156F, 0.25F, 0.5781F, 0.3125F);
                              STAR = new q7(var11[4], true.m<invokedynamic>(5605, 6352836748111865530L ^ var20), 0.5781F, 0.25F, 0.6406F, 0.3125F);
                              TRIANGLE1 = new q7(var11[6], true.m<invokedynamic>(27709, 1335098699806875511L ^ var20), 0.6406F, 0.25F, 0.7031F, 0.3125F);
                              TRIANGLE2 = new q7(var11[0], true.m<invokedynamic>(4671, 5282869924294812005L ^ var20), 0.7031F, 0.25F, 0.7656F, 0.3125F);
                              TRIANGLE3 = new q7(var11[13], true.m<invokedynamic>(1046, 1001337424275076938L ^ var20), 0.7656F, 0.25F, 0.8281F, 0.3125F);
                              TRIANGLE4 = new q7(var11[9], true.m<invokedynamic>(28078, 5864833728214671094L ^ var20), 0.8281F, 0.25F, 0.8906F, 0.3125F);
                              HALO = new q7(var11[11], true.m<invokedynamic>(24162, 8308120278035279153L ^ var20), 0.8906F, 0.25F, 0.9531F, 0.3096F);
                              TRIANGLE5 = new q7(var11[12], true.m<invokedynamic>(8571, 2806054859913024053L ^ var20), 0.3906F, 0.3125F, 0.4531F, 0.3701F);
                              w = EnumEntriesKt.enumEntries((Enum[])h);
                              return;
                           }
                           break;
                        default:
                           var28[var31] = var37;
                           if (var2 < var5) {
                              continue label40;
                           }

                           var4 = "\u0086öfZ\u00955\u0094\u0017j\u0002èPöB^Ë";
                           var5 = "\u0086öfZ\u00955\u0094\u0017j\u0002èPöB^Ë".length();
                           var2 = 0;
                        }

                        var31 = var2;
                        var2 += 8;
                        var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                        var28 = var6;
                        var31 = var3++;
                        var34 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var35 = 0;
                     }
                  }
               }

               var15 = var16.charAt(var14);
               break;
            default:
               var11[var17++] = var32;
               if ((var14 += var15) < var18) {
                  var15 = var16.charAt(var14);
                  continue label58;
               }

               var16 = "\u0087\u0082±\u0004âûáí\bhÄä\u008a3NÝ?";
               var18 = "\u0087\u0082±\u0004âûáí\bhÄä\u008a3NÝ?".length();
               var15 = '\b';
               var14 = -1;
            }

            ++var14;
            var25 = var16.substring(var14, var14 + var15);
            var27 = 0;
         }
      }
   }

   public static void x(boolean var0) {
      F = var0;
   }

   public static boolean E() {
      return F;
   }

   public static boolean D() {
      boolean var0 = E();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a(var1);
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 22318;
      if (c[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = b[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/q7", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/q7" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
