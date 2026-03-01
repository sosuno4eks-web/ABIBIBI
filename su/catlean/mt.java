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
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Serializable
public final class mt implements s6 {
   @NotNull
   public static final p6 A;
   @NotNull
   private String a;
   @NotNull
   private n_ f;
   private boolean T;
   @NotNull
   private String R;
   @NotNull
   private String K;
   @NotNull
   private String P;
   @NotNull
   private String z;
   private boolean S;
   private static String[] j;
   private static final long b = j0.a(7847469246748855625L, 4351701242149286730L, MethodHandles.lookup().lookupClass()).a(160050455354469L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   public mt(@NotNull String id, @NotNull n_ bind, boolean enabled, @NotNull String module, @NotNull String setting, @NotNull String pressValue, @NotNull String releaseValue, long a, boolean hold) {
      var8 ^= b;
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(11158, 8169556560069317895L ^ var8));
      boolean var10000 = -5364225958872043852L.A<invokedynamic>(-5364225958872043852L, var8);
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(29980, 3671957327294434198L ^ var8));
      boolean var11 = var10000;
      Intrinsics.checkNotNullParameter(var4, true.i<invokedynamic>(29866, 5341447479110568485L ^ var8));
      Intrinsics.checkNotNullParameter(var5, true.i<invokedynamic>(4716, 2921253875080752378L ^ var8));
      Intrinsics.checkNotNullParameter(var6, true.i<invokedynamic>(8123, 4654307919143428389L ^ var8));
      Intrinsics.checkNotNullParameter(var7, true.i<invokedynamic>(20806, 8764186525997281247L ^ var8));
      super();
      this.a = var1;
      this.f = var2;
      this.T = var3;
      this.R = var4;
      this.K = var5;
      this.P = var6;
      this.z = var7;
      this.S = var10;
      if (-5333130734877233002L.A<invokedynamic>(-5333130734877233002L, var8) == null) {
         label22: {
            try {
               var10000 = var11;
               if (var8 <= 0L) {
                  break label22;
               }

               if (var11) {
                  var10000 = false;
                  break label22;
               }
            } catch (NumberFormatException var12) {
               throw var12.A<invokedynamic>(var12, -5376427538177464750L, var8);
            }

            var10000 = true;
         }

         var10000.A<invokedynamic>(var10000, -5365819665341286287L, var8);
      }

   }

   @NotNull
   public String L() {
      return this.a;
   }

   public void T(@NotNull String <set-?>, long a) {
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(894, 5810196080644449882L ^ var2));
      this.a = var1;
   }

   @NotNull
   public n_ f() {
      return this.f;
   }

   public void d(long a, @NotNull n_ <set-?>) {
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(5998, 3669101493886744419L ^ var1));
      this.f = var3;
   }

   public boolean X() {
      return this.T;
   }

   public void l(boolean <set-?>) {
      this.T = var1;
   }

   @NotNull
   public final String m() {
      return this.R;
   }

   public final void r(int a, char a, int a, @NotNull String <set-?>) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ b;
      Intrinsics.checkNotNullParameter(var4, true.i<invokedynamic>(5998, 3669097999682902987L ^ var5));
      this.R = var4;
   }

   @NotNull
   public final String B() {
      return this.K;
   }

   public final void U(long a, @NotNull String <set-?>) {
      var1 ^= b;
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(5998, 3669045201599812932L ^ var1));
      this.K = var3;
   }

   @NotNull
   public final String h() {
      return this.P;
   }

   public final void v(char a, @NotNull String <set-?>, int a, int a) {
      long var5 = ((long)var1 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ b;
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(5998, 3669149893111324891L ^ var5));
      this.P = var2;
   }

   @NotNull
   public final String a() {
      return this.z;
   }

   public final void b(long a, @NotNull String <set-?>) {
      var1 ^= b;
      Intrinsics.checkNotNullParameter(var3, true.i<invokedynamic>(5998, 3669133321007152948L ^ var1));
      this.z = var3;
   }

   public final boolean j() {
      return this.S;
   }

   public final void L(boolean <set-?>) {
      this.S = var1;
   }

   @NotNull
   public final String z() {
      return this.a;
   }

   @NotNull
   public final n_ C() {
      return this.f;
   }

   public final boolean b() {
      return this.T;
   }

   @NotNull
   public final String J() {
      return this.R;
   }

   @NotNull
   public final String T() {
      return this.K;
   }

   @NotNull
   public final String H() {
      return this.P;
   }

   @NotNull
   public final String Y() {
      return this.z;
   }

   public final boolean i() {
      return this.S;
   }

   @NotNull
   public final mt v(@NotNull String id, @NotNull n_ bind, boolean enabled, @NotNull String module, @NotNull String setting, @NotNull String pressValue, @NotNull String releaseValue, long a, boolean hold) {
      var8 ^= b;
      long var11 = var8 ^ 128454068685435L;
      Intrinsics.checkNotNullParameter(var1, true.i<invokedynamic>(22856, 4158768579406293255L ^ var8));
      Intrinsics.checkNotNullParameter(var2, true.i<invokedynamic>(32286, 6834057622157577823L ^ var8));
      Intrinsics.checkNotNullParameter(var4, true.i<invokedynamic>(8122, 7885141365526802402L ^ var8));
      Intrinsics.checkNotNullParameter(var5, true.i<invokedynamic>(30227, 5996526641823270472L ^ var8));
      Intrinsics.checkNotNullParameter(var6, true.i<invokedynamic>(7720, 8679782998110449260L ^ var8));
      Intrinsics.checkNotNullParameter(var7, true.i<invokedynamic>(32071, 4072253794812906753L ^ var8));
      return new mt(var1, var2, var3, var4, var5, var6, var7, var11, var10);
   }

   public static mt f(mt param0, String param1, n_ param2, boolean param3, String param4, String param5, String param6, long param7, String param9, boolean param10, int param11, Object param12) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public String toString() {
      long var1 = b ^ 76697688089547L;
      boolean var3 = this.S;
      String var4 = this.z;
      String var5 = this.P;
      String var6 = this.K;
      String var7 = this.R;
      boolean var8 = this.T;
      n_ var9 = this.f;
      String var10 = this.a;
      String var10000 = 22202.i<invokedynamic>(22202, 4910225812082998113L ^ var1);
      return var10000 + var10 + true.i<invokedynamic>(13052, 6597033588635557693L ^ var1) + var9 + true.i<invokedynamic>(15279, 3817924400725186175L ^ var1) + var8 + true.i<invokedynamic>(10485, 4015352271677605161L ^ var1) + var7 + true.i<invokedynamic>(32594, 6906417517774475924L ^ var1) + var6 + true.i<invokedynamic>(23426, 5164182119468807765L ^ var1) + var5 + true.i<invokedynamic>(23114, 1723139265044363154L ^ var1) + var4 + true.i<invokedynamic>(19842, 5577196209307983952L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = b ^ 637137326666L;
      int var4 = this.a.hashCode();
      var4 = var4 * true.w<invokedynamic>(24743, 3321257691788016429L ^ var1) + this.f.hashCode();
      var4 = var4 * true.w<invokedynamic>(13228, 8402914243247679523L ^ var1) + Boolean.hashCode(this.T);
      boolean var10000 = 1677438758458756221L.A<invokedynamic>(1677438758458756221L, var1);
      var4 = var4 * true.w<invokedynamic>(13228, 8402914243247679523L ^ var1) + this.R.hashCode();
      boolean var3 = var10000;
      var4 = var4 * true.w<invokedynamic>(13228, 8402914243247679523L ^ var1) + this.K.hashCode();
      var4 = var4 * true.w<invokedynamic>(13228, 8402914243247679523L ^ var1) + this.P.hashCode();
      var4 = var4 * true.w<invokedynamic>(13228, 8402914243247679523L ^ var1) + this.z.hashCode();
      var4 = var4 * true.w<invokedynamic>(13228, 8402914243247679523L ^ var1) + Boolean.hashCode(this.S);

      try {
         if (!var3) {
            (new int[5]).A<invokedynamic>(new int[5], 1715484317910619253L, var1);
         }

         return var4;
      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 1705196175661286555L, var1);
      }
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void G(mt self, CompositeEncoder output, long a, SerialDescriptor serialDesc) {
      var2 ^= b;
      var1.encodeStringElement(var4, 0, var0.L());
      var1.encodeSerializableElement(var4, 1, (SerializationStrategy)x_.v, var0.f());
      var1.encodeBooleanElement(var4, 2, var0.X());
      var1.encodeStringElement(var4, 3, var0.R);
      var1.encodeStringElement(var4, 4, var0.K);
      var1.encodeStringElement(var4, 5, var0.P);
      var1.encodeStringElement(var4, true.w<invokedynamic>(31215, 2815868946816776288L ^ var2), var0.z);
      var1.encodeBooleanElement(var4, true.w<invokedynamic>(22216, 8806260550172776266L ^ var2), var0.S);
   }

   public mt(short a, int seen0, String id, n_ bind, boolean enabled, String module, String setting, String pressValue, String releaseValue, boolean hold, int a, SerializationConstructorMarker serializationConstructorMarker, char a) {
      long var14 = ((long)var1 << 48 | (long)var11 << 32 >>> 16 | (long)var13 << 48 >>> 48) ^ b;
      if (true.w<invokedynamic>(1715, 3421827555315921215L ^ var14) != (true.w<invokedynamic>(30052, 6865749804640125677L ^ var14) & var2)) {
         PluginExceptionsKt.throwMissingFieldException(var2, true.w<invokedynamic>(30052, 6865749804640125677L ^ var14), qz.g.getDescriptor());
      }

      super();
      this.a = var3;
      this.f = var4;
      this.T = var5;
      this.R = var6;
      this.K = var7;
      this.P = var8;
      this.z = var9;
      this.S = var10;
   }

   static {
      long var20 = b ^ 51343181457922L;
      String[] var10000 = new String[2];
      e = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -5765967049230133225L, var20);
      Cipher var11;
      Cipher var22 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[22];
      int var16 = 0;
      String var15 = "Æeh\u0012zg4:Á\u0083\u0001q\u001a%\u0091*\u0010\u0012\u0019Û'?\u0085f\u0086\u0085\u009eòÕK\u008aßw\u0018#\u0004\u0015\u0098}\u0013R®\u008bÂK-\u009faëàÕð\u0081.\u0099OØØ <\fÓÿ-¯»\\úK¼$_·\u0002£\\\u0013¹ç¶T\u00ad¼\u001fg\u009dz÷X\"\u000f\u0018kßS+{Ú\u0019\u008a\u000bZwê\u0082(\u0002È\u009bhmíý\u008aWÎ\u0018}\u008dJY¾( äu\u0006Ã¢§\u008e8\u0019Û¬Qá\fÎÃê\u0010k\u0004ÃW\u0084b]Gg\f->±ÒH)\u0010Ço)LÄF\r9\u0090/¤à\u001c=´t\u0010\u001fó\u001cAt}\u001bffO\u0000ðÉ¶Õx(\u0080o95\u001c\u009eaûÇ\u0083<\u0092Y}õ\u0087k\u0012VqcÆìzH\u008eök\u001b\n\u009eè\u0085ªb¾a\u0091Øì\u0018\u0015«\u0002èî [\u0003éûpÔ\u000ev>uî\u0080\u0097ôQT\u009e«\u0010\u0099Û©¬\u008fí²Ï\u008c!^oFÔ°\u0089\u00105È'\u009fOü\n\u0099°±Ò?O\u008f&\u0013\u0018ñ\u0019\u0086R¥ó\u007f^%\u0005\u001di6\u009c¬ÊB_<°\u0013yð\b\u0018\u001eìá\u008cp\u0099ÎLxÁ½Ï\"ÿò7\u0099\u0019u8äH\u0089¯\u0018âïD»N\u0095¤¥\u0098;9\u0013£`\u009dè\u0014Ûa\u009cY!5\u0007\u0010µxÓ>\u0087\bý.î)\u008dZ\u0015\u0091¸t\u0010|R\u009b\u0080\u001c\u0086\u009d îþ\f\u008a\u008eÚi\\\u0010Èê;0èu\u0080±ä\u0007\u0012>\u0090íÝD\u0010Çb¤m-\u001f\u0013à$Üé\u0001\u0084×|¢";
      int var17 = "Æeh\u0012zg4:Á\u0083\u0001q\u001a%\u0091*\u0010\u0012\u0019Û'?\u0085f\u0086\u0085\u009eòÕK\u008aßw\u0018#\u0004\u0015\u0098}\u0013R®\u008bÂK-\u009faëàÕð\u0081.\u0099OØØ <\fÓÿ-¯»\\úK¼$_·\u0002£\\\u0013¹ç¶T\u00ad¼\u001fg\u009dz÷X\"\u000f\u0018kßS+{Ú\u0019\u008a\u000bZwê\u0082(\u0002È\u009bhmíý\u008aWÎ\u0018}\u008dJY¾( äu\u0006Ã¢§\u008e8\u0019Û¬Qá\fÎÃê\u0010k\u0004ÃW\u0084b]Gg\f->±ÒH)\u0010Ço)LÄF\r9\u0090/¤à\u001c=´t\u0010\u001fó\u001cAt}\u001bffO\u0000ðÉ¶Õx(\u0080o95\u001c\u009eaûÇ\u0083<\u0092Y}õ\u0087k\u0012VqcÆìzH\u008eök\u001b\n\u009eè\u0085ªb¾a\u0091Øì\u0018\u0015«\u0002èî [\u0003éûpÔ\u000ev>uî\u0080\u0097ôQT\u009e«\u0010\u0099Û©¬\u008fí²Ï\u008c!^oFÔ°\u0089\u00105È'\u009fOü\n\u0099°±Ò?O\u008f&\u0013\u0018ñ\u0019\u0086R¥ó\u007f^%\u0005\u001di6\u009c¬ÊB_<°\u0013yð\b\u0018\u001eìá\u008cp\u0099ÎLxÁ½Ï\"ÿò7\u0099\u0019u8äH\u0089¯\u0018âïD»N\u0095¤¥\u0098;9\u0013£`\u009dè\u0014Ûa\u009cY!5\u0007\u0010µxÓ>\u0087\bý.î)\u008dZ\u0015\u0091¸t\u0010|R\u009b\u0080\u001c\u0086\u009d îþ\f\u008a\u008eÚi\\\u0010Èê;0èu\u0080±ä\u0007\u0012>\u0090íÝD\u0010Çb¤m-\u001f\u0013à$Üé\u0001\u0084×|¢".length();
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
                  d = new String[22];
                  i = new HashMap(13);
                  Cipher var0;
                  var22 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var22.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[11];
                  int var3 = 0;
                  String var4 = "²\u0093M«3©àú\tñ\u0013>¹w_\u009b;\u008c0Ï¯»\u0092é6\u0004\u001a\u0098Êuq\u0001xP\u0003v©±>\u0083óÿj\u0011\"?¯\u0094ã´I\u0087ÑÇ%\u0001%\u008a\u001f7\u001c\u000b\u0085Ñ]y\u0002ÿø´WJ";
                  int var5 = "²\u0093M«3©àú\tñ\u0013>¹w_\u009b;\u008c0Ï¯»\u0092é6\u0004\u001a\u0098Êuq\u0001xP\u0003v©±>\u0083óÿj\u0011\"?¯\u0094ã´I\u0087ÑÇ%\u0001%\u008a\u001f7\u001c\u000b\u0085Ñ]y\u0002ÿø´WJ".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     long[] var26 = var6;
                     var27 = var3++;
                     long var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var32 = -1;

                     while(true) {
                        long var8 = var31;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var34 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var32) {
                        case 0:
                           var26[var27] = var34;
                           if (var2 >= var5) {
                              g = var6;
                              h = new Integer[11];
                              A = new p6((DefaultConstructorMarker)null);
                              return;
                           }
                           break;
                        default:
                           var26[var27] = var34;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "³\u007f\u009fò ¡Æñ4\u0002Õ\u0096@Î\u001f@";
                           var5 = "³\u007f\u009fò ¡Æñ4\u0002Õ\u0096@Î\u001f@".length();
                           var2 = 0;
                        }

                        var27 = var2;
                        var2 += 8;
                        var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        var26 = var6;
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

               var15 = "\u001cí°\u007fcv\ttS~ç\u0018\u009düÌ*vãÞÎ\u0011ïIÇ\u0010ë¿?Ù\u0081Ð¹@/GCVÂc'z";
               var17 = "\u001cí°\u007fcv\ttS~ç\u0018\u009düÌ*vãÞÎ\u0011ïIÇ\u0010ë¿?Ù\u0081Ð¹@/GCVÂc'z".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var23 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void Q(String[] var0) {
      j = var0;
   }

   public static String[] x() {
      return j;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19121;
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
            throw new RuntimeException("su/catlean/mt", var10);
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
         throw new RuntimeException("su/catlean/mt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3439;
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
            throw new RuntimeException("su/catlean/mt", var14);
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
         throw new RuntimeException("su/catlean/mt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
