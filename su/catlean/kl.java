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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1657;
import net.minecraft.class_2246;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class kl extends kr {
   @NotNull
   public static final kl s;
   static final KProperty[] y;
   @NotNull
   private static final zr m;
   @NotNull
   private static final zr W;
   private static final long c = j0.a(5316543091118300176L, 459731665215369197L, MethodHandles.lookup().lookupClass()).a(213942190039439L);
   private static final String[] e;
   private static final String[] k;
   private static final Map q;
   private static final long[] z;
   private static final Integer[] A;
   private static final Map B;

   private kl(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 82520857757721L;
      super(true.x<invokedynamic>(27836, 6906411709000051048L ^ var1), var3, pa.Q(), true.b<invokedynamic>(30348, 3581712498247427298L ^ var1), false, true.b<invokedynamic>(2164, 3656310798349965849L ^ var1), (DefaultConstructorMarker)null);
   }

   private final b3 t(int var1, int var2, short var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ c;
      long var10001 = var4 ^ 79259021311827L;
      int var6 = (int)((var4 ^ 79259021311827L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (b3)m.k((short)var6, this, y[0], (short)var7, var8);
   }

   private final void L(b3 var1, long var2) {
      var2 ^= c;
      long var10001 = var2 ^ 100086436157873L;
      int var4 = (int)((var2 ^ 100086436157873L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      m.P(this, var4, y[0], (short)var5, var1, (short)var6);
   }

   private final ve T(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 32524172179868L;
      int var3 = (int)((var1 ^ 32524172179868L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (ve)W.k((short)var3, this, y[1], (short)var4, var5);
   }

   private final void m(char var1, ve var2, char var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ c;
      long var10001 = var5 ^ 21200338263459L;
      int var7 = (int)((var5 ^ 21200338263459L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      W.P(this, var7, y[1], (short)var8, var2, (short)var9);
   }

   @Flow
   public final void S(@NotNull PlayerUpdateEvent e) {
      // $FF: Couldn't be decompiled
   }

   private final void E(long param1, class_1657 param3) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   protected List W(long var1) {
      return CollectionsKt.listOf(class_2246.field_10343);
   }

   @NotNull
   protected v0 c() {
      return v0.NONE;
   }

   static {
      long var20 = c ^ 122746048192530L;
      long var22 = var20 ^ 34063158029553L;
      long var24 = var20 ^ 46874763291882L;
      q = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[9];
      int var16 = 0;
      String var15 = "\u009d^Ï5\u0012 ê=³ÀQ¡&¡ö\u009e\u00ad¨4¬N>\u0019ô\u008d½LÕk5\u0003£8']Ru\u0015¸ÞQ%Â¯\u009e\u000bn;\u001dbÊú,Ùjáü\bJÁ\u009a0Q\u009dø\u0002v1\u008fßÝ~n§&\r¡Û12Í`ËÅùóA±\u00ad\u0010\u0093\u001e\u00198\f»{ÕÇTTGåFIÒ »ø»áá¼¨õ{\u0012ª\u008e{\u001boãP¤4\u0087Fl·*\u00ad\" \u0005=\u001aPÕ Øg\b~ñWÓÖº\r:g\u0085'K\u001e$6\u0082ÚWS8«Ü¿®¼¦\u0085-< åZ\nc¦\f\u000b\u008bq»\u0004ÅE\u0012÷§Þá\u0002&û\u007f®Á\u0003+S3I\u008c\u008a\u0010x\u007f\u0000ù%[¿æ\u0098wõ\u0016âh\u008bi/Ý\u0007 _\u0083\tªøçµ5ßàe=Ì\u001c\u009bW´Õ×^(l:\nyAæ8\n¸V¢ØoÈ®\u0083÷!âÅ×:eâÚÎÍF\u0002Ú\u0019\u0083\u0000\n\u001c\u008cë\rõÝ\u009fTF(Nº\u0099Ò¤\u0006Ø\u001c\u0094 \u0089£\u000e4\u009eipª\u0086à\f\u001eï¢\u0080ÍA@ýÔéi\"]\u001a4";
      int var17 = "\u009d^Ï5\u0012 ê=³ÀQ¡&¡ö\u009e\u00ad¨4¬N>\u0019ô\u008d½LÕk5\u0003£8']Ru\u0015¸ÞQ%Â¯\u009e\u000bn;\u001dbÊú,Ùjáü\bJÁ\u009a0Q\u009dø\u0002v1\u008fßÝ~n§&\r¡Û12Í`ËÅùóA±\u00ad\u0010\u0093\u001e\u00198\f»{ÕÇTTGåFIÒ »ø»áá¼¨õ{\u0012ª\u008e{\u001boãP¤4\u0087Fl·*\u00ad\" \u0005=\u001aPÕ Øg\b~ñWÓÖº\r:g\u0085'K\u001e$6\u0082ÚWS8«Ü¿®¼¦\u0085-< åZ\nc¦\f\u000b\u008bq»\u0004ÅE\u0012÷§Þá\u0002&û\u007f®Á\u0003+S3I\u008c\u008a\u0010x\u007f\u0000ù%[¿æ\u0098wõ\u0016âh\u008bi/Ý\u0007 _\u0083\tªøçµ5ßàe=Ì\u001c\u009bW´Õ×^(l:\nyAæ8\n¸V¢ØoÈ®\u0083÷!âÅ×:eâÚÎÍF\u0002Ú\u0019\u0083\u0000\n\u001c\u008cë\rõÝ\u009fTF(Nº\u0099Ò¤\u0006Ø\u001c\u0094 \u0089£\u000e4\u009eipª\u0086à\f\u001eï¢\u0080ÍA@ýÔéi\"]\u001a4".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var27 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = c(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var33;
               if ((var13 += var14) >= var17) {
                  e = var18;
                  k = new String[9];
                  B = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[5];
                  int var3 = 0;
                  String var4 = "Ñ7}\u009e\u009dÙØ\u001fÄ\b³I\u0091Ø\u000eØ\u009bhÎ¯í\u000f±\u001b";
                  int var5 = "Ñ7}\u009e\u009dÙØ\u001fÄ\b³I\u0091Ø\u000eØ\u009bhÎ¯í\u000f±\u001b".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var31 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                     long[] var30 = var6;
                     var31 = var3++;
                     long var35 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var36 = -1;

                     while(true) {
                        long var8 = var35;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var38 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var36) {
                        case 0:
                           var30[var31] = var38;
                           if (var2 >= var5) {
                              z = var6;
                              A = new Integer[5];
                              KProperty[] var26 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(kl.class, true.x<invokedynamic>(3568, 6293095179895803769L ^ var20), true.x<invokedynamic>(30275, 3746028415293256904L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(kl.class, true.x<invokedynamic>(11541, 5794378048101953431L ^ var20), true.x<invokedynamic>(16314, 4884272358283885879L ^ var20), 0)))};
                              y = var26;
                              s = new kl(var24);
                              m = qi.M((il)s, true.x<invokedynamic>(21584, 5083272280175335135L ^ var20), (Enum)b3.AUTO, (pj)null, (Function0)null, true.b<invokedynamic>(4124, 9192276078237910314L ^ var20), (Object)null, var22);
                              W = qi.M((il)s, true.x<invokedynamic>(9217, 2075648099153028745L ^ var20), (Enum)ve.ON, (pj)null, (Function0)null, true.b<invokedynamic>(29514, 5053951741296207480L ^ var20), (Object)null, var22);
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var38;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u0094\u0014ç\u0019\u0098Û¯ª3µtoßà\u008e\u000f";
                           var5 = "\u0094\u0014ç\u0019\u0098Û¯ª3µtoßà\u008e\u000f".length();
                           var2 = 0;
                        }

                        var31 = var2;
                        var2 += 8;
                        var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                        var30 = var6;
                        var31 = var3++;
                        var35 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var36 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var33;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "ö-G/Õùè¿:¸\u009eN\u001f`Ê5H\u0089}x\u009dø?\u0002¸Âc!Æ\u0083!\t?<NBºÎ¼öäD\u009eA½\u0017ÓiÍ¤\"fÚÏåÓ\u0010\u0010±\u0017>[\u0090áhA,æÍòzs\u0091";
               var17 = "ö-G/Õùè¿:¸\u009eN\u001f`Ê5H\u0089}x\u009dø?\u0002¸Âc!Æ\u0083!\t?<NBºÎ¼öäD\u009eA½\u0017ÓiÍ¤\"fÚÏåÓ\u0010\u0010±\u0017>[\u0090áhA,æÍòzs\u0091".length();
               var14 = '8';
               var13 = -1;
            }

            ++var13;
            var27 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
      return var0;
   }

   private static String c(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 18728;
      if (k[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])q.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               q.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/kl", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         k[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return k[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/kl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24212;
      if (A[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = z[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])B.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               B.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/kl", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         A[var3] = var15;
      }

      return A[var3];
   }

   private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/kl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
