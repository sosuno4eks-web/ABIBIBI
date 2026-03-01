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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

public final class nt extends nm {
   @NotNull
   public static final nt D;
   static final KProperty[] S;
   @NotNull
   private static final zo T;
   @NotNull
   private static final zo c;
   private static final long d = j0.a(-9100148848125802335L, 7258487326997595157L, MethodHandles.lookup().lookupClass()).a(87678828230459L);
   private static final String[] e;
   private static final String[] i;
   private static final Map j;
   private static final long[] m;
   private static final Integer[] n;
   private static final Map p;

   private nt(short var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ d;
      long var6 = var4 ^ 27059051122573L;
      super(true.e<invokedynamic>(19624, 7491044560089750909L ^ var4), var6);
   }

   private final boolean E(long var1) {
      var1 ^= d;
      long var10001 = var1 ^ 77850963994241L;
      int var3 = (int)((var1 ^ 77850963994241L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)T.k((short)var3, this, S[0], (short)var4, var5);
   }

   private final void D(boolean var1, long var2) {
      var2 ^= d;
      long var10001 = var2 ^ 28074393067941L;
      int var4 = (int)((var2 ^ 28074393067941L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      T.P(this, var4, S[0], (short)var5, var1, (short)var6);
   }

   private final boolean X(long var1) {
      var1 ^= d;
      long var10001 = var1 ^ 59452469865831L;
      int var3 = (int)((var1 ^ 59452469865831L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)c.k((short)var3, this, S[1], (short)var4, var5);
   }

   private final void B(int var1, int var2, boolean var3, char var4) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ d;
      long var10001 = var5 ^ 118847274012405L;
      int var7 = (int)((var5 ^ 118847274012405L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      c.P(this, var7, S[1], (short)var8, var3, (short)var9);
   }

   public void k(@NotNull class_332 context, long a) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = d ^ 81957638692608L;
      long var10001 = var20 ^ 90063424810145L;
      int var22 = (int)((var20 ^ 90063424810145L) >>> 48);
      int var23 = (int)(var10001 << 16 >>> 32);
      int var24 = (int)(var10001 << 48 >>> 48);
      long var25 = var20 ^ 95323330069621L;
      j = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[12];
      int var16 = 0;
      String var15 = "CXÓÚxá\u009dS\u000bÄ\u0085)L\u000b±Õ\u001a\u007f\u0096?n¨à\u0016\u007f±Ó·P\u0006ú\u0006 \t=w\r;ø\u00adÝ\u009e°Ï)\u000b\u00908\u0098\u0087¦¼®rf'¾£\tGÔ¦\u0091}\u00800\u0098½\u009bÖ\u0085\u0019\u0006\u009ePmC\u000f¢\u0093çJËræ¾ô<\u009eìb\u001c«/ÐÈ\rñ\u008eÓ¨éw\u009föÀ\r§O\u0085\u0003«Wà \u0091sEëF )eYË1\n¨N\u0081,Ü\u009bk8\u0088_\u0010áÂ}ô\u0000\u009cIz¨\u0010\u0006FÑ4ß\u009a\u009b\u0087\u008b_;(\u009c\u001aUO\u0018¶;!\u0013n\u001a\"\u0084ØÈ¡\u0011ÝÁ\f\u001dôðÌ[É\u009dÚè\u0010®`iI\u001e¶\u009eê\u0003\u0088`\u0081\u001f\u0002£}\u0018ÛÇwWKK\u0091 6\u0084m\u0086µ\u0004\u00157§nvT~\u0095\u001b®\u0010\u0080«Ü©\u0017:\fV_¤£S,\u001f'Õ(ÜÒe¼\u0010ó2ie\u0093\rÞÆ\u009cøúËáÏØÁ\u0007,ü\u0082ú±\u0015nCù8äS\u0080\u0006%jA]";
      int var17 = "CXÓÚxá\u009dS\u000bÄ\u0085)L\u000b±Õ\u001a\u007f\u0096?n¨à\u0016\u007f±Ó·P\u0006ú\u0006 \t=w\r;ø\u00adÝ\u009e°Ï)\u000b\u00908\u0098\u0087¦¼®rf'¾£\tGÔ¦\u0091}\u00800\u0098½\u009bÖ\u0085\u0019\u0006\u009ePmC\u000f¢\u0093çJËræ¾ô<\u009eìb\u001c«/ÐÈ\rñ\u008eÓ¨éw\u009föÀ\r§O\u0085\u0003«Wà \u0091sEëF )eYË1\n¨N\u0081,Ü\u009bk8\u0088_\u0010áÂ}ô\u0000\u009cIz¨\u0010\u0006FÑ4ß\u009a\u009b\u0087\u008b_;(\u009c\u001aUO\u0018¶;!\u0013n\u001a\"\u0084ØÈ¡\u0011ÝÁ\f\u001dôðÌ[É\u009dÚè\u0010®`iI\u001e¶\u009eê\u0003\u0088`\u0081\u001f\u0002£}\u0018ÛÇwWKK\u0091 6\u0084m\u0086µ\u0004\u00157§nvT~\u0095\u001b®\u0010\u0080«Ü©\u0017:\fV_¤£S,\u001f'Õ(ÜÒe¼\u0010ó2ie\u0093\rÞÆ\u009cøúËáÏØÁ\u0007,ü\u0082ú±\u0015nCù8äS\u0080\u0006%jA]".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var28 = var15.substring(var13, var13 + var14);
         byte var30 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var28.getBytes("ISO-8859-1"));
            String var35 = b(var19).intern();
            switch(var30) {
            case 0:
               var18[var16++] = var35;
               if ((var13 += var14) >= var17) {
                  e = var18;
                  i = new String[12];
                  p = new HashMap(13);
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
                  String var4 = "\u0088üw\u0084;ÿ\u008eÔ\u0006L\u009e.\u0093àòÌE\rÔiÈù¤6";
                  int var5 = "\u0088üw\u0084;ÿ\u008eÔ\u0006L\u009e.\u0093àòÌE\rÔiÈù¤6".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var34 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                     long[] var31 = var6;
                     var34 = var3++;
                     long var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var38 = -1;

                     while(true) {
                        long var8 = var37;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var40 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var38) {
                        case 0:
                           var31[var34] = var40;
                           if (var2 >= var5) {
                              m = var6;
                              n = new Integer[5];
                              KProperty[] var27 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(nt.class, true.e<invokedynamic>(15347, 2218888637907582295L ^ var20), true.e<invokedynamic>(23520, 4876503783914036552L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(nt.class, true.e<invokedynamic>(806, 1382007362507441536L ^ var20), true.e<invokedynamic>(1102, 8247228291609068269L ^ var20), 0)))};
                              S = var27;
                              D = new nt((short)var22, var23, var24);
                              T = qi.R((il)D, true.e<invokedynamic>(3227, 9061661182050339385L ^ var20), true, (pj)null, (Function0)null, true.l<invokedynamic>(28150, 3589758269529926037L ^ var20), var25, (Object)null);
                              c = qi.R((il)D, true.e<invokedynamic>(800, 4188442372107142528L ^ var20), true, (pj)null, (Function0)null, true.l<invokedynamic>(27222, 1579165859941232176L ^ var20), var25, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var31[var34] = var40;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "Si:rÞØ9Î\u009f¹+\u0090Ú)p\u009a";
                           var5 = "Si:rÞØ9Î\u009f¹+\u0090Ú)p\u009a".length();
                           var2 = 0;
                        }

                        var34 = var2;
                        var2 += 8;
                        var7 = var4.substring(var34, var2).getBytes("ISO-8859-1");
                        var31 = var6;
                        var34 = var3++;
                        var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var38 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var35;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "jÍv\u00188\u0015\u0098D\u0093e\u001d!\u0092%`\u0019\u0018\u000eËBLØ\u008dA\u0017°E5O·ÌWNªz;\b$Q\u00adÿ";
               var17 = "jÍv\u00188\u0015\u0098D\u0093e\u001d!\u0092%`\u0019\u0018\u000eËBLØ\u008dA\u0017°E5O·ÌWNªz;\b$Q\u00adÿ".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var28 = var15.substring(var13, var13 + var14);
            var30 = 0;
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25204;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])j.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               j.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/nt", var10);
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
         i[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
   }

   private static Object b(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
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
         throw new RuntimeException("su/catlean/nt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8370;
      if (n[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = m[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/nt", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/nt" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
