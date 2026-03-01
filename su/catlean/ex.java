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
public final class ex {
   @NotNull
   public static final d2 h;
   @NotNull
   private String c;
   @NotNull
   private String l;
   @NotNull
   private String R;
   private static int[] f;
   private static final long a = j0.a(695615068871290912L, 6923475457506897417L, MethodHandles.lookup().lookupClass()).a(245133568521130L);
   private static final String[] b;
   private static final String[] d;
   private static final Map e;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map j;

   public ex(long a, @NotNull String id, @NotNull String username, @NotNull String avatar) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.w<invokedynamic>(26893, 996632073259809595L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.w<invokedynamic>(14060, 3500190940206638294L ^ var1));
      Intrinsics.checkNotNullParameter(var5, true.w<invokedynamic>(18618, 2323108119151499909L ^ var1));
      super();
      this.c = var3;
      this.l = var4;
      this.R = var5;
   }

   public ex(int var1, String var2, String var3, String var4, int var5, char var6, short var7, DefaultConstructorMarker var8) {
      long var9 = ((long)var1 << 32 | (long)var6 << 48 >>> 32 | (long)var7 << 48 >>> 48) ^ a;
      long var11 = var9 ^ 98241459628123L;
      if ((var5 & 1) != 0) {
         var2 = true.w<invokedynamic>(15806, 2818756324065844341L ^ var9);
      }

      if ((var5 & 2) != 0) {
         var3 = true.w<invokedynamic>(25208, 7089971398226789287L ^ var9);
      }

      if ((var5 & 4) != 0) {
         var4 = true.w<invokedynamic>(25208, 7089971398226789287L ^ var9);
      }

      this(var11, var2, var3, var4);
   }

   @NotNull
   public final String P() {
      return this.c;
   }

   public final void k(long a, @NotNull String <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.w<invokedynamic>(28321, 6192040620376721818L ^ var1));
      this.c = var3;
   }

   @NotNull
   public final String V() {
      return this.l;
   }

   public final void p(@NotNull String <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.w<invokedynamic>(28321, 6192125953746288126L ^ var2));
      this.l = var1;
   }

   @NotNull
   public final String G() {
      return this.R;
   }

   public final void E(int a, char a, short a, @NotNull String <set-?>) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var4, true.w<invokedynamic>(15354, 3572167805696406406L ^ var5));
      this.R = var4;
   }

   @NotNull
   public final String g(int size, boolean forcePng, long a) {
      // $FF: Couldn't be decompiled
   }

   public static String N(ex var0, int var1, boolean var2, int var3, Object var4, long var5) {
      var5 ^= a;
      long var7 = var5 ^ 117815379512352L;
      int[] var9 = -106961722378758760L.A<invokedynamic>(-106961722378758760L, var5);

      int var10000;
      label37: {
         label36: {
            try {
               var10000 = var3 & 1;
               if (var9 != null) {
                  break label37;
               }

               if (var10000 == 0) {
                  break label36;
               }
            } catch (NumberFormatException var11) {
               throw var11.A<invokedynamic>(var11, -84278924828852093L, var5);
            }

            var1 = true.k<invokedynamic>(11102, 1449906924563433253L ^ var5);
         }

         var10000 = var3 & 2;
      }

      label27: {
         try {
            if (var9 != null) {
               break label27;
            }

            if (var10000 == 0) {
               return var0.g(var1, (boolean)var2, var7);
            }
         } catch (NumberFormatException var10) {
            throw var10.A<invokedynamic>(var10, -84278924828852093L, var5);
         }

         var10000 = 0;
      }

      var2 = var10000;
      return var0.g(var1, (boolean)var2, var7);
   }

   @NotNull
   public final String g() {
      return this.c;
   }

   @NotNull
   public final String J() {
      return this.l;
   }

   @NotNull
   public final String r() {
      return this.R;
   }

   @NotNull
   public final ex P(@NotNull String id, @NotNull String username, @NotNull String avatar, long a) {
      var4 ^= a;
      long var6 = var4 ^ 37834118007476L;
      Intrinsics.checkNotNullParameter(var1, true.w<invokedynamic>(13524, 8232645488520411113L ^ var4));
      Intrinsics.checkNotNullParameter(var2, true.w<invokedynamic>(2510, 1933176693970963191L ^ var4));
      Intrinsics.checkNotNullParameter(var3, true.w<invokedynamic>(30183, 961011774775916248L ^ var4));
      return new ex(var6, var1, var2, var3);
   }

   public static ex o(ex var0, String var1, long var2, String var4, String var5, int var6, Object var7) {
      var2 ^= a;
      long var8 = var2 ^ 131773286303092L;
      int[] var10 = 2704843953613835922L.A<invokedynamic>(2704843953613835922L, var2);

      int var10000;
      label41: {
         label40: {
            try {
               var10000 = var6 & 1;
               if (var10 != null) {
                  break label41;
               }

               if (var10000 == 0) {
                  break label40;
               }
            } catch (NumberFormatException var12) {
               throw var12.A<invokedynamic>(var12, 2728868134949657481L, var2);
            }

            var1 = var0.c;
         }

         var10000 = var6 & 2;
      }

      label32: {
         label31: {
            try {
               if (var10 != null) {
                  break label32;
               }

               if (var10000 == 0) {
                  break label31;
               }
            } catch (NumberFormatException var11) {
               throw var11.A<invokedynamic>(var11, 2728868134949657481L, var2);
            }

            var4 = var0.l;
         }

         var10000 = var6 & 4;
      }

      if (var10000 != 0) {
         var5 = var0.R;
      }

      return var0.P(var1, var4, var5, var8);
   }

   @NotNull
   public String toString() {
      long var1 = a ^ 50427000885480L;
      String var3 = this.R;
      String var4 = this.l;
      String var5 = this.c;
      String var10000 = 26992.w<invokedynamic>(26992, 8860090776919415663L ^ var1);
      return var10000 + var5 + true.w<invokedynamic>(13747, 7552757156080043951L ^ var1) + var4 + true.w<invokedynamic>(9116, 3021040999275647364L ^ var1) + var3 + ")";
   }

   public int hashCode() {
      long var1 = a ^ 119522996475660L;
      int var3 = this.c.hashCode();
      var3 = var3 * true.k<invokedynamic>(19709, 7099955437076992901L ^ var1) + this.l.hashCode();
      var3 = var3 * true.k<invokedynamic>(17312, 920006599822433499L ^ var1) + this.R.hashCode();
      return var3;
   }

   public boolean equals(@Nullable Object other) {
      // $FF: Couldn't be decompiled
   }

   @JvmStatic
   public static final void N(ex self, long a, CompositeEncoder output, SerialDescriptor serialDesc) {
      // $FF: Couldn't be decompiled
   }

   public ex(int seen0, String id, String username, long a, short a, String avatar, SerializationConstructorMarker serializationConstructorMarker) {
      // $FF: Couldn't be decompiled
   }

   public ex(long var1) {
      var1 ^= a;
      long var10001 = var1 ^ 27524400568515L;
      int var3 = (int)((var1 ^ 27524400568515L) >>> 32);
      int var4 = (int)(var10001 << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      this(var3, (String)null, (String)null, (String)null, true.k<invokedynamic>(14062, 7031235117297368772L ^ var1), (char)var4, (short)var5, (DefaultConstructorMarker)null);
   }

   static {
      long var20 = a ^ 27486305830L;
      e = new HashMap(13);
      null.A<invokedynamic>((Object)null, 2642282092805094800L, var20);
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
      String var15 = "\u001b\u001e´©hM\u0080Yd\b*%QÀ!ª@\u0012(\u0018Eü\u008a3K½å£óæ\u0014\u0096C£E@\u0010öVÏ\u008eÉ\u0015û÷\u0000½Û\u00adìæ$\u0002\u008fW3§zrå¯S\u0090!ý±ýNüE\u0006-Ð\u0017\u0088û\b¿IV«\u0010\u0091ä¿Ã\u009bã\u0089Sã®cé{¾%H@À\u008c¬\u0010î;ê\u009b\u009bkÝàÚÎ\u000bódY\u0089\u00ad®È4\u008a\u0000ñØ\r1M[ä¶-Åá\u001c|\u0095g{Î ã\u0018þïá\u0013\u0095bIì\u0098»@\u009dìû-\\üw\u0085 =\u0006\u001fÄWE\u008bÆ\u008a\u001fy>TÖóÂ\u00001(\u008e'Øiä\tªÞCPÊÇç\u0010\u00969\u008a\u0012J=¢*û\u0085\u0086q\u007f\u001d+i\u0018ja§Ny'²J-\u009d\u0088õ\u009fì\u0099çÔ<ÊÔ\u0015\u0013¸A B±\u0094¢C\u0087Öá\"ËB\u00834Üø\u0086VH+\u0091îNÔ\u0019ºî¢ipT§±\u0010Ï#Û#\u0012´\fw\u0085¥v¢eF\u009e\u0089\u0018¿ø\u0005Ì\nÂ\u0088Ï\u001d³ü\u0083Vú\u0006\u007f\u000eâ\u0089Ï\u0084óI\u0018\u0010\u0086\"ÕÌ\u001f9P®y3\ny6P\u0013«\u0010\u008d¿@\u0087\u0086ËË!]\u008esö\u008ec/g \u0007OÏÓLÑ:æ³\u008fB¾@F&¡7i0xÙ5ô&\u0091lÀh¼¢Ü#\u0018\tO1iÂ\u0081\u008e\u0017-\u001e\u008c\u0090\u0014\u009d\u007fq¾j Ç\u0004Ù`y \u0083O£\u0087`_Ì¶§\u0000$\u008d\u0084æj\u0087Âk^{©Áêÿb}ä=m\u0012Ms\u0010\u001fÃÁ\u0097DP¯è{\u0013-HM{\u0093Z";
      int var17 = "\u001b\u001e´©hM\u0080Yd\b*%QÀ!ª@\u0012(\u0018Eü\u008a3K½å£óæ\u0014\u0096C£E@\u0010öVÏ\u008eÉ\u0015û÷\u0000½Û\u00adìæ$\u0002\u008fW3§zrå¯S\u0090!ý±ýNüE\u0006-Ð\u0017\u0088û\b¿IV«\u0010\u0091ä¿Ã\u009bã\u0089Sã®cé{¾%H@À\u008c¬\u0010î;ê\u009b\u009bkÝàÚÎ\u000bódY\u0089\u00ad®È4\u008a\u0000ñØ\r1M[ä¶-Åá\u001c|\u0095g{Î ã\u0018þïá\u0013\u0095bIì\u0098»@\u009dìû-\\üw\u0085 =\u0006\u001fÄWE\u008bÆ\u008a\u001fy>TÖóÂ\u00001(\u008e'Øiä\tªÞCPÊÇç\u0010\u00969\u008a\u0012J=¢*û\u0085\u0086q\u007f\u001d+i\u0018ja§Ny'²J-\u009d\u0088õ\u009fì\u0099çÔ<ÊÔ\u0015\u0013¸A B±\u0094¢C\u0087Öá\"ËB\u00834Üø\u0086VH+\u0091îNÔ\u0019ºî¢ipT§±\u0010Ï#Û#\u0012´\fw\u0085¥v¢eF\u009e\u0089\u0018¿ø\u0005Ì\nÂ\u0088Ï\u001d³ü\u0083Vú\u0006\u007f\u000eâ\u0089Ï\u0084óI\u0018\u0010\u0086\"ÕÌ\u001f9P®y3\ny6P\u0013«\u0010\u008d¿@\u0087\u0086ËË!]\u008esö\u008ec/g \u0007OÏÓLÑ:æ³\u008fB¾@F&¡7i0xÙ5ô&\u0091lÀh¼¢Ü#\u0018\tO1iÂ\u0081\u008e\u0017-\u001e\u008c\u0090\u0014\u009d\u007fq¾j Ç\u0004Ù`y \u0083O£\u0087`_Ì¶§\u0000$\u008d\u0084æj\u0087Âk^{©Áêÿb}ä=m\u0012Ms\u0010\u001fÃÁ\u0097DP¯è{\u0013-HM{\u0093Z".length();
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
                  d = new String[18];
                  j = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "Iù\u008d½\u0006\u001a\u0095U`.?\n\f\u008dQ¿";
                  int var5 = "Iù\u008d½\u0006\u001a\u0095U`.?\n\f\u008dQ¿".length();
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
                              i = new Integer[4];
                              h = new d2((DefaultConstructorMarker)null);
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "Û\u001dýÑÌ}Û\u001e\u0089y[¡\u0081/ÂÁ";
                           var5 = "Û\u001dýÑÌ}Û\u001e\u0089y[¡\u0081/ÂÁ".length();
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

               var15 = "ÒF~\u001cÞ]\u0004\u0013Ó½ÊÜ\u00807Ò2\u0010,þÌðgå×!¡òR°wÝ\u00ad¿";
               var17 = "ÒF~\u001cÞ]\u0004\u0013Ó½ÊÜ\u00807Ò2\u0010,þÌðgå×!¡òR°wÝ\u00ad¿".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void Y(int[] var0) {
      f = var0;
   }

   public static int[] D() {
      return f;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 31045;
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
            throw new RuntimeException("su/catlean/ex", var10);
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
         throw new RuntimeException("su/catlean/ex" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21449;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ex", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
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
         throw new RuntimeException("su/catlean/ex" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
