package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class ln extends k9 {
   @NotNull
   public static final ln Y;
   static final KProperty[] w;
   @NotNull
   private static final zv X;
   @NotNull
   private static final zv T;
   @NotNull
   private static final zc r;
   @NotNull
   private static final z0 M;
   @NotNull
   private static final HashMap v;
   @NotNull
   private static final ArrayList z;
   @NotNull
   private static final DecimalFormat n;
   private static final long b = j0.a(-5761258424991710340L, 5749596056443582411L, MethodHandles.lookup().lookupClass()).a(260955305903953L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private ln(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 84546061588791L;
      super(var3, true.v<invokedynamic>(11500, 1164191138361031937L ^ var1), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final Color Q(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 113135027555700L;
      int var3 = (int)((var1 ^ 113135027555700L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)X.k((short)var3, this, w[0], (short)var4, var5);
   }

   private final Color h(char var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 51526284845822L;
      int var6 = (int)((var4 ^ 51526284845822L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Color)T.k((short)var6, this, w[1], (short)var7, var8);
   }

   private final float W(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 29709427382620L;
      int var3 = (int)((var1 ^ 29709427382620L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)r.k((short)var3, this, w[2], (short)var4, var5)).floatValue();
   }

   private final int S(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 35226818836631L;
      int var3 = (int)((var1 ^ 35226818836631L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)M.k((short)var3, this, w[3], (short)var4, var5)).intValue();
   }

   @NotNull
   public final DecimalFormat P() {
      return n;
   }

   public void n(long var1) {
      z.clear();
      v.clear();
   }

   @Flow
   private final void Z(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void Y(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean I(m2 param0) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean q(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   static {
      long var20 = b ^ 55071825104625L;
      long var22 = var20 ^ 113773813909914L;
      long var24 = var20 ^ 44174433471674L;
      long var26 = var20 ^ 21994724195147L;
      long var28 = var20 ^ 130084693817982L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[19];
      int var16 = 0;
      String var15 = "ùs\u009c\u007fëü×\u0088\u0084V%EX\u008d¥f\u001aä\u0004Íu§#¯\u0017J:Þ\"Tw\u0097\u0088± \u007f\u0090\u001d|\u0018\u0018ô$Ö\u0012;âtãø\u0015a\r|6Hn³\u009bÕá}`÷\u00858z\t<\u0007\u0093\u008cêG\u009d,Þë\u008e\u0083µæ¿\u0091fUØ¾ÿ\u0018\u0017Z\u009b\u0010ÇI\u0014\u0004æ%\u0005añØZêb¼tëúë®Å4\u0010\u009c³¡i\u00adZ\u0010ÅfÇ\u0012¯k\u0099\u008aÛGê\u008c\u009eú\u0094&\u0010ÎpµG\u0003º¿s\u0095¼ÑÇRÈaD\u0010\u0002\u001a4± îï\u001f\u001a!\u009a,\u009f\u0016\u0003Ì \rã¨Î|·¼`Ô,»n\u000b¨¶[\u008e~çSØ\u007f\u0095¶\u001dQ§\u000eA÷úN\u0010}m\u0016?\bA\u009d\\4¦\u0083\u001f\u0011wÜØ\u0010\u008d\u001c\u0005ÔJ+òE\u0096_@Z:É\u00ad\u0098\u0010 Pµ\u0000\u0001)#³5Ô\u008d\u0002{\u0018J° Á}ê@»\u001f\u008b,õª®b\u0086açD®¾\u0092Z\u009a\u009fO\u0087_éCÍb\u0007ÀÚ\u0018ð\u0088U!lGöu\u008b¬e î\u009eg¯U\u0090_¢¾Ö§r\u0010\u001b\u000e\u0013ê¨\u00ad\u000e286 1\u0005¦\u0086y\u0010#é\u009eBÄ\u001e\u001e\u0003d\u00ad¦\u00178ØêÏ\u00107±bO\u0014õôê%\u0016/+¨Wâ\u001f8h[S/\u0015\u0006Ï¢HÊ*òì\u0015fTÖólÌòn]\u0097ÆòU4ÍÙ·WØ\u0005n×\u0098@\u0093×àíÇ\u0085\u009c@\u0017´üù\u008fl\u00983\u0007l\u0010%8¢W@'Ücñ'çøLT9\u001f";
      int var17 = "ùs\u009c\u007fëü×\u0088\u0084V%EX\u008d¥f\u001aä\u0004Íu§#¯\u0017J:Þ\"Tw\u0097\u0088± \u007f\u0090\u001d|\u0018\u0018ô$Ö\u0012;âtãø\u0015a\r|6Hn³\u009bÕá}`÷\u00858z\t<\u0007\u0093\u008cêG\u009d,Þë\u008e\u0083µæ¿\u0091fUØ¾ÿ\u0018\u0017Z\u009b\u0010ÇI\u0014\u0004æ%\u0005añØZêb¼tëúë®Å4\u0010\u009c³¡i\u00adZ\u0010ÅfÇ\u0012¯k\u0099\u008aÛGê\u008c\u009eú\u0094&\u0010ÎpµG\u0003º¿s\u0095¼ÑÇRÈaD\u0010\u0002\u001a4± îï\u001f\u001a!\u009a,\u009f\u0016\u0003Ì \rã¨Î|·¼`Ô,»n\u000b¨¶[\u008e~çSØ\u007f\u0095¶\u001dQ§\u000eA÷úN\u0010}m\u0016?\bA\u009d\\4¦\u0083\u001f\u0011wÜØ\u0010\u008d\u001c\u0005ÔJ+òE\u0096_@Z:É\u00ad\u0098\u0010 Pµ\u0000\u0001)#³5Ô\u008d\u0002{\u0018J° Á}ê@»\u001f\u008b,õª®b\u0086açD®¾\u0092Z\u009a\u009fO\u0087_éCÍb\u0007ÀÚ\u0018ð\u0088U!lGöu\u008b¬e î\u009eg¯U\u0090_¢¾Ö§r\u0010\u001b\u000e\u0013ê¨\u00ad\u000e286 1\u0005¦\u0086y\u0010#é\u009eBÄ\u001e\u001e\u0003d\u00ad¦\u00178ØêÏ\u00107±bO\u0014õôê%\u0016/+¨Wâ\u001f8h[S/\u0015\u0006Ï¢HÊ*òì\u0015fTÖólÌòn]\u0097ÆòU4ÍÙ·WØ\u0005n×\u0098@\u0093×àíÇ\u0085\u009c@\u0017´üù\u008fl\u00983\u0007l\u0010%8¢W@'Ücñ'çøLT9\u001f".length();
      char var14 = '(';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var31 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var31.getBytes("ISO-8859-1"));
            String var38 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var38;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[19];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[7];
                  int var3 = 0;
                  String var4 = "×Ç\n\u008d<³µÇ¹í\u008cæþ\u0015ü×m\u0004Þ&u»\b\u0004ÓÐë\u0090#Ø\u0011\n)\u0080©\u0015i\u0085üá";
                  int var5 = "×Ç\n\u008d<³µÇ¹í\u008cæþ\u0015ü×m\u0004Þ&u»\b\u0004ÓÐë\u0090#Ø\u0011\n)\u0080©\u0015i\u0085üá".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var36 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                     long[] var34 = var6;
                     var36 = var3++;
                     long var40 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var41 = -1;

                     while(true) {
                        long var8 = var40;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var43 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var41) {
                        case 0:
                           var34[var36] = var43;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[7];
                              KProperty[] var30 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ln.class, true.v<invokedynamic>(19913, 2521517206758619551L ^ var20), true.v<invokedynamic>(12897, 3717776254915315257L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ln.class, true.v<invokedynamic>(29065, 3451782633651127747L ^ var20), true.v<invokedynamic>(11007, 4815119146195820202L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ln.class, true.v<invokedynamic>(13040, 2015311154086512292L ^ var20), true.v<invokedynamic>(18688, 6457159991511579996L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ln.class, true.v<invokedynamic>(9715, 629316331087401377L ^ var20), true.v<invokedynamic>(16427, 4234945654942987387L ^ var20), 0)))};
                              w = var30;
                              Y = new ln(var24);
                              il var35 = (il)Y;
                              String var33 = 13381.v<invokedynamic>(13381, 6044867641780437012L ^ var20);
                              Color var44 = Color.GREEN;
                              Intrinsics.checkNotNullExpressionValue(var44, true.v<invokedynamic>(14377, 2102832517285219444L ^ var20));
                              X = qi.F(var35, var33, var44, (pj)null, (Function0)null, true.l<invokedynamic>(6370, 2291541954481931034L ^ var20), var28, (Object)null);
                              var35 = (il)Y;
                              var33 = 4656.v<invokedynamic>(4656, 5199467998917437051L ^ var20);
                              var44 = Color.RED;
                              Intrinsics.checkNotNullExpressionValue(var44, true.v<invokedynamic>(5860, 9027007412722639546L ^ var20));
                              T = qi.F(var35, var33, var44, (pj)null, (Function0)null, true.l<invokedynamic>(27807, 9044507808181466979L ^ var20), var28, (Object)null);
                              r = qi.g((il)Y, true.v<invokedynamic>(27692, 6037662591704422523L ^ var20), 0.5F, RangesKt.rangeTo(0.1F, 3.0F), (pj)null, (Function0)null, true.l<invokedynamic>(4424, 1690208009191377590L ^ var20), var26, (Object)null);
                              M = qi.o((il)Y, true.v<invokedynamic>(8328, 8231394735294584017L ^ var20), true.l<invokedynamic>(10693, 2941566625076769338L ^ var20), new IntRange(5, true.l<invokedynamic>(32686, 7836582927820727383L ^ var20)), var22, (pj)null, (Function0)null, true.l<invokedynamic>(4424, 1690208009191377590L ^ var20), (Object)null);
                              v = new HashMap();
                              z = new ArrayList();
                              n = new DecimalFormat(true.v<invokedynamic>(21110, 1584854256950339109L ^ var20));
                              return;
                           }
                           break;
                        default:
                           var34[var36] = var43;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\fR\u0085\u0015+\u000b-dÙõ \rV¯é@";
                           var5 = "\fR\u0085\u0015+\u000b-dÙõ \rV¯é@".length();
                           var2 = 0;
                        }

                        var36 = var2;
                        var2 += 8;
                        var7 = var4.substring(var36, var2).getBytes("ISO-8859-1");
                        var34 = var6;
                        var36 = var3++;
                        var40 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var41 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var38;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u00128×v«bXÐ»\u001bÿQóvh#·ñ}¹ìòíÀ\u001f\u001d\u00179_T!m ¯\u0089\u0011\u009e&6þ\u001aÈec`í\u0006ëQ\u0003S,\u0016å´ì,ÙÆ:rdýõ\u009b";
               var17 = "\u00128×v«bXÐ»\u001bÿQóvh#·ñ}¹ìòíÀ\u001f\u001d\u00179_T!m ¯\u0089\u0011\u009e&6þ\u001aÈec`í\u0006ëQ\u0003S,\u0016å´ì,ÙÆ:rdýõ\u009b".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var31 = var15.substring(var13, var13 + var14);
            var10001 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21414;
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
            throw new RuntimeException("su/catlean/ln", var10);
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
         throw new RuntimeException("su/catlean/ln" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15361;
      if (g[var3] == null) {
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
            throw new RuntimeException("su/catlean/ln", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/ln" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
