package su.catlean;

import com.mojang.blaze3d.buffers.Std140Builder;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_241;
import net.minecraft.class_11280.class_11281;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public final class a9 implements class_11281 {
   @NotNull
   private final class_241 C;
   @NotNull
   private final class_241 c;
   private final float v;
   private final float G;
   @NotNull
   private final Matrix4f z;
   @NotNull
   private final Color b;
   private static final long a = j0.a(6694839067599580913L, 5471967915780403498L, MethodHandles.lookup().lookupClass()).a(72684421495643L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public a9(@NotNull class_241 texelSize, long a, @NotNull class_241 direction, float radius, float glowAlpha, @NotNull Matrix4f matrix, @NotNull Color color) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(13030, 5701353846212459280L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.j<invokedynamic>(25553, 8845911286336989739L ^ var2));
      Intrinsics.checkNotNullParameter(var7, true.j<invokedynamic>(28899, 2248230441988995347L ^ var2));
      Intrinsics.checkNotNullParameter(var8, true.j<invokedynamic>(16452, 1636455508419545520L ^ var2));
      super();
      this.C = var1;
      this.c = var4;
      this.v = var5;
      this.G = var6;
      this.z = var7;
      this.b = var8;
   }

   @NotNull
   public final class_241 z() {
      return this.C;
   }

   @NotNull
   public final class_241 T() {
      return this.c;
   }

   public final float V() {
      return this.v;
   }

   public final float k() {
      return this.G;
   }

   @NotNull
   public final Matrix4f I() {
      return this.z;
   }

   @NotNull
   public final Color Q() {
      return this.b;
   }

   public void method_71104(@NotNull ByteBuffer buffer) {
      long var2 = a ^ 45101937475656L;
      long var4 = var2 ^ 60339651001968L;
      long var6 = var2 ^ 76772006609648L;
      long var8 = var2 ^ 87333446497499L;
      long var10 = var2 ^ 76818449411682L;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(26732, 8042774729773056358L ^ var2));
      Std140Builder.intoBuffer(var1).putVec2(this.C.field_1343, this.C.field_1342).putVec2(this.c.field_1343, this.c.field_1342).putFloat(this.v).putFloat(this.G).putMat4f((Matrix4fc)this.z).putVec4(gk.E.H(this.b, var8), gk.E.L(var10, this.b), gk.E.M(var4, this.b), gk.E.D(var6, this.b));
   }

   @NotNull
   public final class_241 O() {
      return this.C;
   }

   @NotNull
   public final class_241 H() {
      return this.c;
   }

   public final float F() {
      return this.v;
   }

   public final float s() {
      return this.G;
   }

   @NotNull
   public final Matrix4f L() {
      return this.z;
   }

   @NotNull
   public final Color r() {
      return this.b;
   }

   @NotNull
   public final a9 I(@NotNull class_241 texelSize, long a, @NotNull class_241 direction, float radius, float glowAlpha, @NotNull Matrix4f matrix, @NotNull Color color) {
      var2 ^= a;
      long var9 = var2 ^ 64522669711518L;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(2895, 3728920482418697890L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.j<invokedynamic>(7844, 1329989716181791555L ^ var2));
      Intrinsics.checkNotNullParameter(var7, true.j<invokedynamic>(24230, 8967640169640915782L ^ var2));
      Intrinsics.checkNotNullParameter(var8, true.j<invokedynamic>(24104, 8748078232254903232L ^ var2));
      return new a9(var1, var9, var4, var5, var6, var7, var8);
   }

   public static a9 N(a9 param0, class_241 param1, class_241 param2, float param3, float param4, long param5, Matrix4f param7, Color param8, int param9, Object param10) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 82706498158714L;
      Color var3 = this.b;
      Matrix4f var4 = this.z;
      float var5 = this.G;
      float var6 = this.v;
      class_241 var7 = this.c;
      class_241 var8 = this.C;
      String var10000 = 6138.j<invokedynamic>(6138, 4710039149688504011L ^ var1);
      return var10000 + var8 + true.j<invokedynamic>(9615, 2431671155386584245L ^ var1) + var7 + true.j<invokedynamic>(7073, 5645067123881718428L ^ var1) + var6 + true.j<invokedynamic>(17968, 7717555144914628359L ^ var1) + var5 + true.j<invokedynamic>(19051, 2808739270783460178L ^ var1) + var4 + true.j<invokedynamic>(8215, 931558660429908258L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 122135873518958L;
      int var3 = this.C.hashCode();
      var3 = var3 * true.d<invokedynamic>(1709, 4141913569380334079L ^ var1) + this.c.hashCode();
      var3 = var3 * true.d<invokedynamic>(28464, 5927357323465265251L ^ var1) + Float.hashCode(this.v);
      var3 = var3 * true.d<invokedynamic>(28464, 5927357323465265251L ^ var1) + Float.hashCode(this.G);
      var3 = var3 * true.d<invokedynamic>(28464, 5927357323465265251L ^ var1) + this.z.hashCode();
      var3 = var3 * true.d<invokedynamic>(28464, 5927357323465265251L ^ var1) + this.b.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 25643361303301L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[15];
      int var18 = 0;
      String var17 = "q\u00adÃ\u0080¿\u0086V\u007f\u0018>o%-2\u0086\u008b(#¼¨\f\u0083ÆHÙ§]RT¹ûü0\u0014J_W8oe°z3\u001f\u0019ÿ>Å\u008fÈms¯\tÄ¶\u0013 \u0016ÒdÛx\fxJ,\t{\u001bµÿ\u0088ü\u001c\u0010úbôq$Ó©\u0093>\u0010\u0093Cçª\u0010£Ì'\u008bÝÐÙrpÍ1\u0089\b!â¶\u0010´àÆ\u0013\u0086i]M-¡Vß#x\u0090Ï\u0018½¾\u0017ê®¸\u0087º\u0014Æª½Õë\u0086|eÞ\u0084Sÿ ©Â \u0018]\u008e¿Ù\u0000\u001c£UOû^Î\b^§)[[¤}º\u009ccßÅò\u0010\npSÿ\u0018\u00ad¿SZ\u0004î'ûú\u00ad>&\r{\u008ddFXyZ¢Ê\u008b^\u0010v\u009e\u008a¤\u0088cMX,R|ü/àúÞ {û¬.+}¸ìUckÑ&ÙÆ+\u0005Àü\u0004`æ}¶¿Ã\u0007\u0080\u009d(íG &¢Î¬!;3¸\u0087\u0019\u001c5ø\u0090Rº<\u008711ô8~õç³i\u001fï\u0097J%\u0010*Û\u007f\u0017\u009e_ó\u0005úNL¾\u009e0qÐ\u0018L\u0015ÕK\u0010h~k¤Uì\u0001Åå%S°=\u008d*\u0006¦\u0007\u0090";
      int var19 = "q\u00adÃ\u0080¿\u0086V\u007f\u0018>o%-2\u0086\u008b(#¼¨\f\u0083ÆHÙ§]RT¹ûü0\u0014J_W8oe°z3\u001f\u0019ÿ>Å\u008fÈms¯\tÄ¶\u0013 \u0016ÒdÛx\fxJ,\t{\u001bµÿ\u0088ü\u001c\u0010úbôq$Ó©\u0093>\u0010\u0093Cçª\u0010£Ì'\u008bÝÐÙrpÍ1\u0089\b!â¶\u0010´àÆ\u0013\u0086i]M-¡Vß#x\u0090Ï\u0018½¾\u0017ê®¸\u0087º\u0014Æª½Õë\u0086|eÞ\u0084Sÿ ©Â \u0018]\u008e¿Ù\u0000\u001c£UOû^Î\b^§)[[¤}º\u009ccßÅò\u0010\npSÿ\u0018\u00ad¿SZ\u0004î'ûú\u00ad>&\r{\u008ddFXyZ¢Ê\u008b^\u0010v\u009e\u008a¤\u0088cMX,R|ü/àúÞ {û¬.+}¸ìUckÑ&ÙÆ+\u0005Àü\u0004`æ}¶¿Ã\u0007\u0080\u009d(íG &¢Î¬!;3¸\u0087\u0019\u001c5ø\u0090Rº<\u008711ô8~õç³i\u001fï\u0097J%\u0010*Û\u007f\u0017\u009e_ó\u0005úNL¾\u009e0qÐ\u0018L\u0015ÕK\u0010h~k¤Uì\u0001Åå%S°=\u008d*\u0006¦\u0007\u0090".length();
      char var16 = 16;
      int var15 = -1;

      label54:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var28;
               if ((var15 += var16) >= var19) {
                  d = var20;
                  e = new String[15];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "\u0000Jí\u000b?¹i¬J²2z\u0094×KÞØÒ±#¼[\tÆ";
                  int var5 = "\u0000Jí\u000b?¹i¬J²2z\u0094×KÞØÒ±#¼[\tÆ".length();
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
                              g = var6;
                              h = new Integer[5];
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "Û=\u0016)\f\u00996\u009bºÅu\u0003\u000f*È\u0007";
                           var5 = "Û=\u0016)\f\u00996\u009bºÅu\u0003\u000f*È\u0007".length();
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

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var28;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label54;
               }

               var17 = "ú\u009b\tè\t\u001cZ\u001e\u0003\u000f>¨\u0012\u009fÖD&®\u000f-4\rX\u001b\u0018Ø\u0089)ïíì\u0093ÓSÅ¤û»\u0090}\u009aqþ\u0019\u009a\u0097\u001eÍá";
               var19 = "ú\u009b\tè\t\u001cZ\u001e\u0003\u000f>¨\u0012\u009fÖD&®\u000f-4\rX\u001b\u0018Ø\u0089)ïíì\u0093ÓSÅ¤û»\u0090}\u009aqþ\u0019\u009a\u0097\u001eÍá".length();
               var16 = 24;
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 11723;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/a9", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/a9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1726;
      if (h[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
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
            throw new RuntimeException("su/catlean/a9", var14);
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
         throw new RuntimeException("su/catlean/a9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
