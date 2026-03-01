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
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class dj extends dx {
   @NotNull
   public static final n7 L;
   @NotNull
   private final String T;
   private float c;
   @NotNull
   private pl M;
   @NotNull
   private final Function1 d;
   @NotNull
   private String E;
   @Nullable
   private static dj g;
   private static final long a = j0.a(-8946464307545058770L, 6006166041397965461L, MethodHandles.lookup().lookupClass()).a(123119087699717L);
   private static final String[] b;
   private static final String[] e;
   private static final Map f = new HashMap(13);
   private static final long[] h;
   private static final Integer[] i;
   private static final Map j;
   private static final long k;

   public dj(@NotNull String name, float width, @NotNull pl suggestions, long a, @NotNull Function1 onChange) {
      var4 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.q<invokedynamic>(31179, 7156562803906728269L ^ var4));
      Intrinsics.checkNotNullParameter(var3, true.q<invokedynamic>(1898, 7059592753505939438L ^ var4));
      Intrinsics.checkNotNullParameter(var6, true.q<invokedynamic>(28522, 4202412838939314154L ^ var4));
      super();
      this.T = var1;
      this.c = var2;
      this.M = var3;
      this.d = var6;
      this.E = "";
   }

   public dj(int var1, char var2, String var3, float var4, pl var5, char var6, Function1 var7, int var8, DefaultConstructorMarker var9) {
      long var10 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var6 << 48 >>> 48) ^ a;
      long var12 = var10 ^ 42604211541071L;
      long var14 = var10 ^ 97707450802159L;
      if ((var8 & 4) != 0) {
         var5 = new pl(CollectionsKt.emptyList(), var14);
      }

      this(var3, var4, var5, var12, var7);
   }

   @NotNull
   public final String k() {
      return this.T;
   }

   public final float e() {
      return this.c;
   }

   public final void y(float <set-?>) {
      this.c = var1;
   }

   @NotNull
   public final pl d() {
      return this.M;
   }

   public final void u(long a, @NotNull pl <set-?>) {
      var1 ^= a;
      Intrinsics.checkNotNullParameter(var3, true.q<invokedynamic>(17370, 1881083733142427219L ^ var1));
      this.M = var3;
   }

   @NotNull
   public final String f() {
      return this.E;
   }

   public final void H(short a, @NotNull String value, short a, int a) {
      long var5 = ((long)var1 << 48 | (long)var3 << 48 >>> 16 | (long)var4 << 32 >>> 32) ^ a;
      Intrinsics.checkNotNullParameter(var2, true.q<invokedynamic>(4106, 676309015144318403L ^ var5));
      this.E = var2;
      this.d.invoke(this);
   }

   public void D(@NotNull class_332 context, long a, float x, float y, float mouseX, float mouseY) {
      // $FF: Couldn't be decompiled
   }

   public boolean y(float x, long a, float y, int button) {
      return false;
   }

   @Nullable
   public final Unit S(long var1) {
      var1 ^= a;
      long var10001 = var1 ^ 53761757930011L;
      int var3 = (int)((var1 ^ 53761757930011L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      long var6 = var1 ^ 64537623280952L;
      int[] var8 = 4867675516910873255L.A<invokedynamic>(4867675516910873255L, var1);

      Unit var12;
      String var10000;
      label33: {
         try {
            if (var8 != null) {
               var10000 = this.M.c(this.f(), var6);
               if (var10000 != null) {
                  break label33;
               }
            }
         } catch (NumberFormatException var11) {
            throw var11.A<invokedynamic>(var11, 4892821597040222955L, var1);
         }

         var12 = null;
         return var12;
      }

      String var9 = var10000;
      boolean var10 = false;
      this.H((short)var3, var9, (short)var4, var5);
      var12 = Unit.INSTANCE;
      return var12;
   }

   public static final dj x() {
      return g;
   }

   public static final void a(dj <set-?>) {
      g = var0;
   }

   static {
      long var16 = a ^ 96906889671452L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[15];
      int var23 = 0;
      String var22 = "æÔ¯=¾rê\u0085;é\u0089»\u0093_¼\u0081\u0018ÿ¼ê,'ÆÁi\u0018¡Ü±ùÜä-ïå<\u00025£ê\u0093\u0018¾U\u001aÙW|å\u0089\u0014{ã-v/}\u0016àê\u0019Eöj×m\u0018í`ß\u001b\u0007¶\u0012#§yxÀþGý¡cUg¸èDY\u0000\u0010vïwvPê\u001a¶i\u0085\u008c7G/$\u0088\u00187Ûç£.¨×4\u0096\u0014\b\u0083\u0001Ý,{©ç\u0016N\u0088¬e|\u0010\u000bý\u0002H1¦ÿ|&®\u0091¸\u0087h\u0012«\u0010Ï%¢Òdåäq~u\u00adÞMÐ\u0094N }\u0088ëñº\u00006q¦\u0086\u000fÆ¾xgÌ\rÍ÷<¬\u0012û\u008bÁÕ\u000eªYÈ\u008e½\u0010Ï\u0007zIâIlÜÜ\u0011§I±\u008aÔ\u008b\u0010\u001aó:\u0000÷È\u0019rË#\u00125N¢eÚ\u0010Ôk}\u009a\u0090ÙÑç\t\u00917tqí\u0011½\u0018?Éc©ÚÜÄþ\u0084]\u008aöi;t\u0087\u0002«¢íé\u0095R\u0083";
      int var24 = "æÔ¯=¾rê\u0085;é\u0089»\u0093_¼\u0081\u0018ÿ¼ê,'ÆÁi\u0018¡Ü±ùÜä-ïå<\u00025£ê\u0093\u0018¾U\u001aÙW|å\u0089\u0014{ã-v/}\u0016àê\u0019Eöj×m\u0018í`ß\u001b\u0007¶\u0012#§yxÀþGý¡cUg¸èDY\u0000\u0010vïwvPê\u001a¶i\u0085\u008c7G/$\u0088\u00187Ûç£.¨×4\u0096\u0014\b\u0083\u0001Ý,{©ç\u0016N\u0088¬e|\u0010\u000bý\u0002H1¦ÿ|&®\u0091¸\u0087h\u0012«\u0010Ï%¢Òdåäq~u\u00adÞMÐ\u0094N }\u0088ëñº\u00006q¦\u0086\u000fÆ¾xgÌ\rÍ÷<¬\u0012û\u008bÁÕ\u000eªYÈ\u008e½\u0010Ï\u0007zIâIlÜÜ\u0011§I±\u008aÔ\u008b\u0010\u001aó:\u0000÷È\u0019rË#\u00125N¢eÚ\u0010Ôk}\u009a\u0090ÙÑç\t\u00917tqí\u0011½\u0018?Éc©ÚÜÄþ\u0084]\u008aöi;t\u0087\u0002«¢íé\u0095R\u0083".length();
      char var21 = 16;
      int var20 = -1;

      label64:
      while(true) {
         ++var20;
         String var27 = var22.substring(var20, var20 + var21);
         byte var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = a(var26).intern();
            switch(var10001) {
            case 0:
               var25[var23++] = var33;
               if ((var20 += var21) >= var24) {
                  b = var25;
                  e = new String[15];
                  j = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[5];
                  int var8 = 0;
                  String var9 = "\u0013\u0011ÒÂ6\u00adèØ\u0005.\fÙ6~n`b¹1¼\u000fpm.";
                  int var10 = "\u0013\u0011ÒÂ6\u00adèØ\u0005.\fÙ6~n`b¹1¼\u000fpm.".length();
                  int var7 = 0;

                  label46:
                  while(true) {
                     int var31 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                     long[] var30 = var11;
                     var31 = var8++;
                     long var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte var37 = -1;

                     while(true) {
                        long var13 = var36;
                        byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                        long var39 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                        switch(var37) {
                        case 0:
                           var30[var31] = var39;
                           if (var7 >= var10) {
                              h = var11;
                              i = new Integer[5];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = 4446605607924994075L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var34 = true;
                              k = var36;
                              L = new n7((DefaultConstructorMarker)null);
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var39;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "ýø&D¥\u0084\u008b¹\u0019×X\u009c³àï\b";
                           var10 = "ýø&D¥\u0084\u008b¹\u0019×X\u009c³àï\b".length();
                           var7 = 0;
                        }

                        var31 = var7;
                        var7 += 8;
                        var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                        var30 = var11;
                        var31 = var8++;
                        var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        var37 = 0;
                     }
                  }
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var33;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label64;
               }

               var22 = "î¯æ¸\u0080LØ\u007f\u008dÈxb1\u001clè\u0018o\u001a\u008c\u001f\u0000¨\u008b7W-¯¬v\u0000ko_9Ûa\u00143U(";
               var24 = "î¯æ¸\u0080LØ\u007f\u008dÈxb1\u001clè\u0018o\u001a\u008c\u001f\u0000¨\u008b7W-¯¬v\u0000ko_9Ûa\u00143U(".length();
               var21 = 16;
               var20 = -1;
            }

            ++var20;
            var27 = var22.substring(var20, var20 + var21);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22577;
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
            throw new RuntimeException("su/catlean/dj", var10);
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
         throw new RuntimeException("su/catlean/dj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12995;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = h[var3];
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
            throw new RuntimeException("su/catlean/dj", var14);
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
         throw new RuntimeException("su/catlean/dj" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
