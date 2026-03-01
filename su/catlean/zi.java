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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1792;
import net.minecraft.class_332;
import net.minecraft.class_7922;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;

public final class zi extends zd {
   @NotNull
   private final List J;
   @NotNull
   private final Function1 Z;
   private static final long c = j0.a(8253704210890327685L, 3126701364737748226L, MethodHandles.lookup().lookupClass()).a(256122481591681L);
   private static final String[] h;
   private static final String[] i;
   private static final Map r = new HashMap(13);

   public zi(@NotNull List list, char a, @NotNull Function1 clickAction, long a) {
      long var6 = ((long)var2 << 48 | var4 << 16 >>> 16) ^ c;
      long var8 = var6 ^ 46417559807224L;
      Intrinsics.checkNotNullParameter(var1, true.o<invokedynamic>(3721, 53991433952944696L ^ var6));
      Intrinsics.checkNotNullParameter(var3, true.o<invokedynamic>(24736, 1370334042786794512L ^ var6));
      super(true.o<invokedynamic>(2045, 5166103900815747919L ^ var6), var8);
      this.J = var1;
      this.Z = var3;
   }

   @NotNull
   public final List T() {
      return this.J;
   }

   @NotNull
   public final Function1 N() {
      return this.Z;
   }

   @NotNull
   protected List t(long var1) {
      class_7922 var10000 = class_7923.field_41178;
      Intrinsics.checkNotNullExpressionValue(var10000, true.o<invokedynamic>(32206, 56211254214166311L ^ var1));
      return CollectionsKt.toList((Iterable)var10000);
   }

   @NotNull
   protected String E(long a, @NotNull class_1792 item) {
      var1 ^= c;
      Intrinsics.checkNotNullParameter(var3, true.o<invokedynamic>(3396, 8969862042253400207L ^ var1));
      String var10000 = var3.method_63680().getString();
      Intrinsics.checkNotNullExpressionValue(var10000, true.o<invokedynamic>(6500, 9144696635598179501L ^ var1));
      return var10000;
   }

   protected boolean Q(@NotNull class_1792 item, long a) {
      var2 ^= c;
      Intrinsics.checkNotNullParameter(var1, true.o<invokedynamic>(12765, 386453908305367668L ^ var2));
      return this.J.contains(var1);
   }

   public void i(int a, @NotNull class_332 context, int a, char a, float x, float y, @NotNull class_1792 item) {
      long var8 = ((long)var1 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ c;
      Intrinsics.checkNotNullParameter(var2, true.o<invokedynamic>(11662, 7741821509660370475L ^ var8));
      Intrinsics.checkNotNullParameter(var7, true.o<invokedynamic>(12765, 386456061306305150L ^ var8));
      var2.method_51448().pushMatrix();
      var2.method_51448().translate(var5 + 8.0F, var6);
      var2.method_51427(var7.method_7854(), 0, 0);
      var2.method_51448().popMatrix();
   }

   protected void k(int a, @NotNull class_1792 item, short a, int a) {
      // $FF: Couldn't be decompiled
   }

   public String Z(Object item, long a) {
      long var4 = var2 ^ 77502575316484L;
      return this.E(var4, (class_1792)var1);
   }

   public boolean d(long a, Object item) {
      long var4 = var1 ^ 119574059648815L;
      return this.Q((class_1792)var3, var4);
   }

   public void h(class_332 context, float x, float y, Object component, long a) {
      long var10001 = var5 ^ 80893080261698L;
      int var7 = (int)((var5 ^ 80893080261698L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      this.i(var7, var1, var8, (char)var9, var2, var3, (class_1792)var4);
   }

   public void C(int a, short a, Object item, int a) {
      long var5 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var10001 = var5 ^ 26307491537617L;
      int var7 = (int)((var5 ^ 26307491537617L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      this.k(var7, (class_1792)var3, (short)var8, var9);
   }

   static {
      long var0 = c ^ 28350380387291L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[8];
      int var7 = 0;
      String var6 = "µÜ\u007f=ÝåK\u000e\u009c\u0018ô¢\u00894õÀ\u0018Â\u008b,\u008b<|\u0091\u0086\u0010jí3áRuÃ4ps\u0012°\u008dñ\u0010\u0010ã³\u009f¢\u001bi\u0094Ô+W\u0095*îÉ\tÿ \u009bkiSÌI¯ë0\u009a¤¥@ÛV\u008352«6\u0001Ôöã¾P_R¤Ç\u0006<\u0010À#1ý.¨ºû\u0081Ã:×<\u0018\"M Û\u0015á¨C\u0004j\u0016ã\u001f4\u0003íÎk×±Ã\u000f\u0004\u0011Ål\u007f½r$ÄJw0\u0011";
      int var8 = "µÜ\u007f=ÝåK\u000e\u009c\u0018ô¢\u00894õÀ\u0018Â\u008b,\u008b<|\u0091\u0086\u0010jí3áRuÃ4ps\u0012°\u008dñ\u0010\u0010ã³\u009f¢\u001bi\u0094Ô+W\u0095*îÉ\tÿ \u009bkiSÌI¯ë0\u009a¤¥@ÛV\u008352«6\u0001Ôöã¾P_R¤Ç\u0006<\u0010À#1ý.¨ºû\u0081Ã:×<\u0018\"M Û\u0015á¨C\u0004j\u0016ã\u001f4\u0003íÎk×±Ã\u000f\u0004\u0011Ål\u007f½r$ÄJw0\u0011".length();
      char var5 = 16;
      int var4 = -1;

      label27:
      while(true) {
         ++var4;
         String var11 = var6.substring(var4, var4 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = c(var10).intern();
            switch(var10001) {
            case 0:
               var9[var7++] = var15;
               if ((var4 += var5) >= var8) {
                  h = var9;
                  i = new String[8];
                  return;
               }

               var5 = var6.charAt(var4);
               break;
            default:
               var9[var7++] = var15;
               if ((var4 += var5) < var8) {
                  var5 = var6.charAt(var4);
                  continue label27;
               }

               var6 = "ìc`æ>\u0013\u0007Ó³\u0016\u0085Cá$Èx\u0010\u009d\u0014ÔÑ\u0085\u0015üò\u008f°Ûµ\u0084O¢é";
               var8 = "ìc`æ>\u0013\u0007Ó³\u0016\u0085Cá$Èx\u0010\u009d\u0014ÔÑ\u0085\u0015üò\u008f°Ûµ\u0084O¢é".length();
               var5 = 16;
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException b(NumberFormatException var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16550;
      if (i[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])r.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               r.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/zi", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = h[var5].getBytes("ISO-8859-1");
         i[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return i[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
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
         throw new RuntimeException("su/catlean/zi" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
