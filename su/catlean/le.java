package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

public final class le extends k9 {
   @NotNull
   public static final le l;
   static final KProperty[] z;
   @NotNull
   private static final zr W;
   @NotNull
   private static final zv X;
   @NotNull
   private static final z0 i;
   private static int u;
   @NotNull
   private static List N;
   private static final long b = j0.a(-5360022600725897004L, 1693616824223940812L, MethodHandles.lookup().lookupClass()).a(48657270515398L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map k;

   private le(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 14728902863643L;
      super(var3, true.p<invokedynamic>(1875, 6901251060096525225L ^ var1), pa.W(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final ms C(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 62272901657424L;
      int var3 = (int)((var1 ^ 62272901657424L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (ms)W.k((short)var3, this, z[0], (short)var4, var5);
   }

   private final Color L(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 30823668139516L;
      int var3 = (int)((var1 ^ 30823668139516L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)X.k((short)var3, this, z[1], (short)var4, var5);
   }

   private final int h(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 114512874995373L;
      int var3 = (int)((var1 ^ 114512874995373L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)i.k((short)var3, this, z[2], (short)var4, var5)).intValue();
   }

   private final void u(int var1, int var2, char var3, int var4) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ b;
      long var10001 = var5 ^ 139217746721091L;
      int var7 = (int)((var5 ^ 139217746721091L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      i.P(this, var7, z[2], (short)var8, var1, (short)var9);
   }

   @Flow
   private final void A(Render3DEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void f(PlayerUpdateEvent var1) {
      long var2 = b ^ 97229176647007L;
      long var10001 = var2 ^ 120440721905561L;
      int var4 = (int)((var2 ^ 120440721905561L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 32);
      N = this.y(var4, var5);
   }

   private final List y(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 16554461236203L;
      long var22 = var20 ^ 138139688976710L;
      long var24 = var20 ^ 115350940354675L;
      long var26 = var20 ^ 93134717647756L;
      long var28 = var20 ^ 119393969451682L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[14];
      int var16 = 0;
      String var15 = "+ÝÀ÷?ú\rL\u00ad\u0019¡\u008eBAîK®\\»Ry×ì§¼Mÿï{²\u0099ã\u0003*û)£4u9\u0017ñ%\u009c\u0084\u0018~Û\u0010Z\u00027\u0016uÛ[>x\u0092<õ\u0014ikå\u0010ñ\u0010|9+póÈ\u0005j¸\u0094\u008f¹ê\u009b\u0010¸yþ_:Q¸\u0099ïËa¥§ \u008d\b Tµ<QÞ¸sê-\u0086\u0015\u0004N\u0097é1\u0098\u008c^8{*/]P\u001cØ(\u008fe´É\u0010ì\u0010+ú]àÊïc\u0003o¯\u0089õ@² û.TÎHÙï½§ÜFê}>Ði¼ê;óò\u0011N¾ì¤,\u001f\r1\rF\u0010d{u\u0099 L\u001d(k\u0090Ø¢Ôñ7³0É·\u0084)Vm\u0086ØO\u000eå\u0092\u0095ÒM~lý\u008f\u0019îÉ\u001c\u0082áY¯\u0018Vü\"çvSìùK¡\u001f8\u0000\u009cSy\u0093µNù\u0018\u007f\u001dÚn\u0086Õ½{ö\u0092\u009b+^¨\u0091Ñs=N\u0007K®\u009cæ \n\u009bùt\u0003FÁY~X)¨v\u0007äFëÚ\u009e²|9\u0085\u0087¾\u008aªùl\u0007ÃF\u0010õr\u0089lÂãó\u0014·ãù-4\u0084\u007f/";
      int var17 = "+ÝÀ÷?ú\rL\u00ad\u0019¡\u008eBAîK®\\»Ry×ì§¼Mÿï{²\u0099ã\u0003*û)£4u9\u0017ñ%\u009c\u0084\u0018~Û\u0010Z\u00027\u0016uÛ[>x\u0092<õ\u0014ikå\u0010ñ\u0010|9+póÈ\u0005j¸\u0094\u008f¹ê\u009b\u0010¸yþ_:Q¸\u0099ïËa¥§ \u008d\b Tµ<QÞ¸sê-\u0086\u0015\u0004N\u0097é1\u0098\u008c^8{*/]P\u001cØ(\u008fe´É\u0010ì\u0010+ú]àÊïc\u0003o¯\u0089õ@² û.TÎHÙï½§ÜFê}>Ði¼ê;óò\u0011N¾ì¤,\u001f\r1\rF\u0010d{u\u0099 L\u001d(k\u0090Ø¢Ôñ7³0É·\u0084)Vm\u0086ØO\u000eå\u0092\u0095ÒM~lý\u008f\u0019îÉ\u001c\u0082áY¯\u0018Vü\"çvSìùK¡\u001f8\u0000\u009cSy\u0093µNù\u0018\u007f\u001dÚn\u0086Õ½{ö\u0092\u009b+^¨\u0091Ñs=N\u0007K®\u009cæ \n\u009bùt\u0003FÁY~X)¨v\u0007äFëÚ\u009e²|9\u0085\u0087¾\u008aªùl\u0007ÃF\u0010õr\u0089lÂãó\u0014·ãù-4\u0084\u007f/".length();
      char var14 = '0';
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
                  d = new String[14];
                  k = new HashMap(13);
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
                  String var4 = "\u0080\u007fÄ´WâTjX¦[ÍXÓ\u001f\u008d\rXFù*\u0084#\u0013*\u00ado¯\u009bÚeÆ²:ª('\u0080\u0094µ";
                  int var5 = "\u0080\u007fÄ´WâTjX¦[ÍXÓ\u001f\u008d\rXFù*\u0084#\u0013*\u00ado¯\u009bÚeÆ²:ª('\u0080\u0094µ".length();
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
                              KProperty[] var30 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(le.class, true.p<invokedynamic>(27988, 2215106404763965153L ^ var20), true.p<invokedynamic>(3320, 2062408861430183753L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(le.class, true.p<invokedynamic>(9673, 180041536428990069L ^ var20), true.p<invokedynamic>(3909, 644922176582546684L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(le.class, true.p<invokedynamic>(15994, 3332432166674122184L ^ var20), true.p<invokedynamic>(31584, 7585074967381311696L ^ var20), 0)))};
                              z = var30;
                              l = new le(var26);
                              W = qi.M((il)l, true.p<invokedynamic>(4349, 6868458919225584453L ^ var20), (Enum)ms.CROSS, (pj)null, (Function0)null, true.x<invokedynamic>(10267, 2558337601636744663L ^ var20), (Object)null, var24);
                              il var35 = (il)l;
                              String var33 = 8114.p<invokedynamic>(8114, 1447976218939155465L ^ var20);
                              Color var44 = Color.WHITE;
                              Intrinsics.checkNotNullExpressionValue(var44, true.p<invokedynamic>(19283, 5898337265678266601L ^ var20));
                              X = qi.F(var35, var33, var44, (pj)null, (Function0)null, true.x<invokedynamic>(26634, 6743214537964027332L ^ var20), var28, (Object)null);
                              i = qi.o((il)l, true.p<invokedynamic>(27544, 1237205173821149222L ^ var20), true.x<invokedynamic>(8677, 7158304388898993192L ^ var20), new IntRange(1, true.x<invokedynamic>(15267, 9099735863951601257L ^ var20)), var22, (pj)null, (Function0)null, true.x<invokedynamic>(31932, 3669972089764178295L ^ var20), (Object)null);
                              N = (List)(new ArrayList());
                              return;
                           }
                           break;
                        default:
                           var34[var36] = var43;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\nÐ\u0098\u0092D\u0013w-\u009a²7ó\u0015ow\u008d";
                           var5 = "\nÐ\u0098\u0092D\u0013w-\u009a²7ó\u0015ow\u008d".length();
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

               var15 = "ý\u0018)-7\u000eZ_cý6\u0081\u0084;ß®\u0018ÏNmYó°èÖ\u001b&é*t\u0012Á\u008cÍVôêM²ñ²";
               var17 = "ý\u0018)-7\u000eZ_cý6\u0081\u0084;ß®\u0018ÏNmYó°èÖ\u001b&é*t\u0012Á\u008cÍVôêM²ñ²".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var31 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5273;
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
            throw new RuntimeException("su/catlean/le", var10);
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
         throw new RuntimeException("su/catlean/le" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31464;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/le", var14);
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
         throw new RuntimeException("su/catlean/le" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
