package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_332;
import net.minecraft.class_7922;
import net.minecraft.class_7923;
import org.jetbrains.annotations.NotNull;

public final class z6 extends zd {
   @NotNull
   private final zf h;
   private static final long c = j0.a(6926365679360133228L, 6572158372353651718L, MethodHandles.lookup().lookupClass()).a(41841435905236L);
   private static final String[] i;
   private static final String[] r;
   private static final Map s = new HashMap(13);

   public z6(@NotNull zf setting, int a, char a, int a) {
      long var5 = ((long)var2 << 32 | (long)var3 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ c;
      long var7 = var5 ^ 84086915845628L;
      Intrinsics.checkNotNullParameter(var1, true.l<invokedynamic>(10347, 6544843538005143678L ^ var5));
      super(true.l<invokedynamic>(10788, 6520190109912478261L ^ var5), var7);
      this.h = var1;
   }

   @NotNull
   public final zf g() {
      return this.h;
   }

   @NotNull
   protected List t(long var1) {
      List var3 = (List)(new ArrayList());
      Collection var10000 = (Collection)var3;
      class_7922 var10001 = class_7923.field_41175;
      Intrinsics.checkNotNullExpressionValue(var10001, true.l<invokedynamic>(28061, 7386352839161137875L ^ var1));
      CollectionsKt.addAll(var10000, (Iterable)var10001);
      var3.remove(class_2246.field_10124);
      Iterable var4 = (Iterable)var3;
      boolean var5 = false;
      CollectionsKt.sortedWith(var4, (Comparator)(new e6()));
      return var3;
   }

   @NotNull
   protected String t(long a, @NotNull class_2248 item) {
      var1 ^= c;
      Intrinsics.checkNotNullParameter(var3, true.l<invokedynamic>(28805, 6066867461165936004L ^ var1));
      String var10000 = var3.method_9518().getString();
      Intrinsics.checkNotNullExpressionValue(var10000, true.l<invokedynamic>(27529, 2088922437195069068L ^ var1));
      return var10000;
   }

   protected boolean g(@NotNull class_2248 item, long a) {
      var2 ^= c;
      Intrinsics.checkNotNullParameter(var1, true.l<invokedynamic>(28805, 6066818230675117743L ^ var2));
      return ((kq)this.h.B()).G().contains(var1);
   }

   public void t(@NotNull class_332 context, float x, long a, float y, @NotNull class_2248 block) {
      var3 ^= c;
      Intrinsics.checkNotNullParameter(var1, true.l<invokedynamic>(5300, 3370271358093821550L ^ var3));
      Intrinsics.checkNotNullParameter(var6, true.l<invokedynamic>(12321, 1695397459864331005L ^ var3));
      var1.method_51448().pushMatrix();
      var1.method_51448().translate(var2 + 8.0F, var5);
      var1.method_51427(var6.method_8389().method_7854(), 0, 0);
      var1.method_51448().popMatrix();
   }

   protected void P(long a, @NotNull class_2248 item) {
      // $FF: Couldn't be decompiled
   }

   public String Z(Object item, long a) {
      long var4 = var2 ^ 132389391334801L;
      return this.t(var4, (class_2248)var1);
   }

   public boolean d(long a, Object item) {
      long var4 = var1 ^ 106931010337270L;
      return this.g((class_2248)var3, var4);
   }

   public void h(class_332 context, float x, float y, Object component, long a) {
      long var7 = var5 ^ 62212950521442L;
      this.t(var1, var2, var7, var3, (class_2248)var4);
   }

   public void C(int a, short a, Object item, int a) {
      long var5 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48;
      long var7 = var5 ^ 132521152659222L;
      this.P(var7, (class_2248)var3);
   }

   static {
      long var0 = c ^ 140641952067606L;
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
      String var6 = "Ò@K\u0082Vm n×¥FûyâÀ\f\u0010ræòu\u0012=Í\u00adìq¼^`íöí\u0010kÐ¢*üx¥@ <ïn«\u0006ú\u0012 éË(q\u0015£\u0001\u001d©å.nô5\u007fª\u0005¬ºsÂ§ªé#§i]\u001d\u0080ás\u0010Ä\u009aÞ<|tÎÙ\u0005_a)(R55\u0018-ÈT8\u0002\u00110Í~iuù¦kÚ)ºC%]!<8\u0088";
      int var8 = "Ò@K\u0082Vm n×¥FûyâÀ\f\u0010ræòu\u0012=Í\u00adìq¼^`íöí\u0010kÐ¢*üx¥@ <ïn«\u0006ú\u0012 éË(q\u0015£\u0001\u001d©å.nô5\u007fª\u0005¬ºsÂ§ªé#§i]\u001d\u0080ás\u0010Ä\u009aÞ<|tÎÙ\u0005_a)(R55\u0018-ÈT8\u0002\u00110Í~iuù¦kÚ)ºC%]!<8\u0088".length();
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
                  i = var9;
                  r = new String[8];
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

               var6 = "Ñèñqý¼ |\u009f:\u0007\u0010ªqñq\u0010`Hq,ØÞþ^W\u008cØ2\u0006Üä\u000f";
               var8 = "Ñèñqý¼ |\u009f:\u0007\u0010ªqñq\u0010`Hq,ØÞþ^W\u008cØ2\u0006Üä\u000f".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7425;
      if (r[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])s.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               s.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/z6", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = i[var5].getBytes("ISO-8859-1");
         r[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return r[var5];
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
         throw new RuntimeException("su/catlean/z6" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
