package su.catlean;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2172;
import net.minecraft.class_2561;
import org.jetbrains.annotations.NotNull;

public final class g5 implements ArgumentType {
   @NotNull
   public static final go h;
   private static final long a = j0.a(8657826707825897594L, 7758165063515634284L, MethodHandles.lookup().lookupClass()).a(62203132084600L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;
   private static final long i;

   @NotNull
   public String i(long a, @NotNull StringReader reader) throws CommandSyntaxException {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public CompletableFuture listSuggestions(@NotNull CommandContext context, @NotNull SuggestionsBuilder builder) {
      long var3 = a ^ 92484038354451L;
      long var5 = var3 ^ 25517100698355L;
      Intrinsics.checkNotNullParameter(var1, true.j<invokedynamic>(26704, 2515282025166385549L ^ var3));
      Intrinsics.checkNotNullParameter(var2, true.j<invokedynamic>(31268, 7326009718073271290L ^ var3));
      Iterable var8 = (Iterable)c0.S.H().T(var5);
      boolean var9 = false;
      boolean var10000 = 5976358931846163035L.A<invokedynamic>(5976358931846163035L, var3);
      Collection var11 = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(var8, true.d<invokedynamic>(3935, 2175495267527451239L ^ var3))));
      boolean var7 = var10000;
      boolean var12 = false;
      Iterator var13 = var8.iterator();

      Object var18;
      while(true) {
         if (var13.hasNext()) {
            Object var14 = var13.next();
            var18 = var11;
            hs var15 = (hs)var14;
            if (var7) {
               break;
            }

            boolean var16 = false;
            var11.add(var15.b());
            if (!var7) {
               continue;
            }
         }

         var18 = (Iterable)((List)var11);
         break;
      }

      CompletableFuture var19 = class_2172.method_9265((Iterable)var18, var2);
      Intrinsics.checkNotNullExpressionValue(var19, true.j<invokedynamic>(28937, 7656725265933117650L ^ var3));
      return var19;
   }

   @NotNull
   public List f(char var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ a;
      long var6 = var4 ^ 101538306764036L;
      boolean var10000 = -761706313064099472L.A<invokedynamic>(-761706313064099472L, var4);
      Iterable var9 = (Iterable)c0.S.H().T(var6);
      boolean var10 = false;
      Collection var12 = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(var9, true.d<invokedynamic>(3935, 2175416772923606416L ^ var4))));
      boolean var8 = var10000;
      boolean var13 = false;
      Iterator var14 = var9.iterator();

      Object var19;
      label23:
      while(true) {
         if (var14.hasNext()) {
            var19 = var14.next();
         } else {
            var19 = var12;
            if (var2 >= 0) {
               break;
            }
         }

         while(true) {
            Object var15 = var19;
            var19 = var12;
            hs var16 = (hs)var15;
            if (!var8) {
               break label23;
            }

            boolean var17 = false;
            var12.add(var16.b());
            if (var8) {
               break;
            }

            var19 = var12;
            if (var2 >= 0) {
               break label23;
            }
         }
      }

      List var20 = ((List)var19).stream().limit(i).toList();
      Intrinsics.checkNotNullExpressionValue(var20, true.j<invokedynamic>(15105, 3261317661514679594L ^ var4));
      return var20;
   }

   private static final Message U(Object var0) {
      long var1 = a ^ 40459779359546L;
      long var3 = var1 ^ 54499139885929L;
      nf var10000 = nf.s;
      String var10001 = 19448.j<invokedynamic>(19448, 4374550579619903246L ^ var1);
      Object[] var5 = new Object[1];
      Intrinsics.checkNotNull(var0);
      var5[0] = var0;
      return (Message)class_2561.method_43470(var10000.G(var10001, var3, var5));
   }

   public Object parse(StringReader p0) {
      long var2 = a ^ 140270471859409L;
      long var4 = var2 ^ 4261403573263L;
      return this.i(var4, var1);
   }

   public Collection getExamples() {
      long var1 = a ^ 40381062587197L;
      long var10001 = var1 ^ 65196112336731L;
      int var3 = (int)((var1 ^ 65196112336731L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Collection)this.f((char)var3, (short)var4, var5);
   }

   static {
      long var16 = a ^ 132948578106224L;
      Cipher var18;
      Cipher var10000 = var18 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var19 = 1; var19 < 8; ++var19) {
         var10003[var19] = (byte)((int)(var16 << var19 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var25 = new String[7];
      int var23 = 0;
      String var22 = "\u0013\u0007 Nj¶\u008e@Ãp\u0083I\u0081v%Ø þ·nZ\u0019x\u0094ã¶\u0013;8Ñh\u0017\u0011`<\u0006\u00929k\u0004Â6ËBgá6±¥0úÃÙ3Ñ\u0017\u0081n\u008d\u007fQÄ\u008döq7\u0093\u000fan>\u009ap\u0091`\u0093ZYð\u0017Ê\u0093®Ø\u0017§[B¦q\u001aª[\u0085Rö(¹\u0010\u0098!½\u0012fá&.[\u0013ÙÕ\u0092'\u008du\u0010L\u00ad^:±!Â#>DÃ\u009d%óq½";
      int var24 = "\u0013\u0007 Nj¶\u008e@Ãp\u0083I\u0081v%Ø þ·nZ\u0019x\u0094ã¶\u0013;8Ñh\u0017\u0011`<\u0006\u00929k\u0004Â6ËBgá6±¥0úÃÙ3Ñ\u0017\u0081n\u008d\u007fQÄ\u008döq7\u0093\u000fan>\u009ap\u0091`\u0093ZYð\u0017Ê\u0093®Ø\u0017§[B¦q\u001aª[\u0085Rö(¹\u0010\u0098!½\u0012fá&.[\u0013ÙÕ\u0092'\u008du\u0010L\u00ad^:±!Â#>DÃ\u009d%óq½".length();
      char var21 = 16;
      int var20 = -1;

      label56:
      while(true) {
         ++var20;
         String var27 = var22.substring(var20, var20 + var21);
         byte var10001 = -1;

         while(true) {
            byte[] var26 = var18.doFinal(var27.getBytes("ISO-8859-1"));
            String var32 = a(var26).intern();
            switch(var10001) {
            case 0:
               var25[var23++] = var32;
               if ((var20 += var21) >= var24) {
                  b = var25;
                  c = new String[7];
                  g = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var16 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[2];
                  int var8 = 0;
                  String var9 = "³\rë\u0010¶\u008f¯ÈÑR'E3óõB";
                  int var10 = "³\rë\u0010¶\u008f¯ÈÑR'E3óõB".length();
                  int var7 = 0;

                  do {
                     int var30 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var30, var7).getBytes("ISO-8859-1");
                     var30 = var8++;
                     long var13 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                     long var10004 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                     boolean var35 = true;
                     var11[var30] = var10004;
                  } while(var7 < var10);

                  e = var11;
                  f = new Integer[2];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var16 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var16 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 1734373729087091308L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var33 = true;
                  i = var36;
                  h = new go((DefaultConstructorMarker)null);
                  return;
               }

               var21 = var22.charAt(var20);
               break;
            default:
               var25[var23++] = var32;
               if ((var20 += var21) < var24) {
                  var21 = var22.charAt(var20);
                  continue label56;
               }

               var22 = "e:\u001f¶\u0007\bÈ\u0000& .\u009b9D}ç³clð\u0017î`RUïP\u0082!9á\u0089 9zA\u0094jdßâÖ!¤g¤\u0019à\u009bÖ`üëd\u001eqT¯r\u0093` Ej$";
               var24 = "e:\u001f¶\u0007\bÈ\u0000& .\u009b9D}ç³clð\u0017î`RUïP\u0082!9á\u0089 9zA\u0094jdßâÖ!¤g¤\u0019à\u009bÖ`üëd\u001eqT¯r\u0093` Ej$".length();
               var21 = ' ';
               var20 = -1;
            }

            ++var20;
            var27 = var22.substring(var20, var20 + var21);
            var10001 = 0;
         }
      }
   }

   private static CommandSyntaxException a(CommandSyntaxException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 2636;
      if (c[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])d.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/g5", var10);
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
         c[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return c[var5];
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
         throw new RuntimeException("su/catlean/g5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 16040;
      if (f[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = e[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/g5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
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
         throw new RuntimeException("su/catlean/g5" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
