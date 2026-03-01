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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

public enum py {
   public static final py Fade;
   public static final py Hover;
   public static final py Decrease;
   public static final py Static;
   public static final py Flash;
   public static final py Grow;
   public static final py FILL;
   public static final py TNT;
   public static final py Pull;
   // $FF: synthetic field
   private static final EnumEntries s;
   private static final long a = j0.a(2939393120323404447L, 2480011950050297345L, MethodHandles.lookup().lookupClass()).a(199567736410017L);
   private static final long[] b;
   private static final Integer[] c;
   private static final Map d;

   @NotNull
   public static EnumEntries G() {
      return s;
   }

   // $FF: synthetic method
   private static final py[] U(long var0) {
      var0 ^= a;
      py[] var2 = new py[true.c<invokedynamic>(14954, 4425118024007578212L ^ var0)];
      var2[0] = Fade;
      var2[1] = Hover;
      var2[2] = Decrease;
      var2[3] = Static;
      var2[4] = Flash;
      var2[5] = Grow;
      var2[true.c<invokedynamic>(10522, 3674842475052785941L ^ var0)] = FILL;
      var2[true.c<invokedynamic>(17275, 2608178581147782007L ^ var0)] = TNT;
      var2[true.c<invokedynamic>(20505, 1131156250650220563L ^ var0)] = Pull;
      return var2;
   }

   static {
      long var20 = a ^ 90120642665003L;
      long var22 = var20 ^ 2810509341545L;
      Cipher var12;
      Cipher var10000 = var12 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var13 = 1; var13 < 8; ++var13) {
         var10003[var13] = (byte)((int)(var20 << var13 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var11 = new String[9];
      int var17 = 0;
      String var16 = "6\"\u0007Å\u008eË\u009c Î\u0099¡þ\u0011&\u0085\u009a\b\u0007MK¼ëÚ\u0094\u009b\bùn\u0012ÿ)eÒ\u0091\b\u0084, #G4rã\bt\u0019=ç\f\u000bÌÓ\b\u0091\u0093XØ\u0091Õ¢\u008b\bßl\t\u0091#\u0090è¤";
      int var18 = "6\"\u0007Å\u008eË\u009c Î\u0099¡þ\u0011&\u0085\u009a\b\u0007MK¼ëÚ\u0094\u009b\bùn\u0012ÿ)eÒ\u0091\b\u0084, #G4rã\bt\u0019=ç\f\u000bÌÓ\b\u0091\u0093XØ\u0091Õ¢\u008b\bßl\t\u0091#\u0090è¤".length();
      char var15 = 16;
      int var14 = -1;

      label54:
      while(true) {
         ++var14;
         String var24 = var16.substring(var14, var14 + var15);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var12.doFinal(var24.getBytes("ISO-8859-1"));
            String var30 = a(var19).intern();
            switch(var10001) {
            case 0:
               var11[var17++] = var30;
               if ((var14 += var15) >= var18) {
                  d = new HashMap(13);
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
                  String var4 = "¼Ëer¢\u0086\u009c¬º\u0017Âd\u008aQ¹¦\t»Z\u000e\u000fc ö(,t\u0097\u0014\u0004.6B\u001a]\u0014ÓÂ};";
                  int var5 = "¼Ëer¢\u0086\u009c¬º\u0017Âd\u008aQ¹¦\t»Z\u000e\u000fc ö(,t\u0097\u0014\u0004.6B\u001a]\u0014ÓÂ};".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var28 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                     long[] var27 = var6;
                     var28 = var3++;
                     long var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var33 = -1;

                     while(true) {
                        long var8 = var32;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var35 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var33) {
                        case 0:
                           var27[var28] = var35;
                           if (var2 >= var5) {
                              b = var6;
                              c = new Integer[7];
                              Fade = new py(var11[4], 0);
                              Hover = new py(var11[8], 1);
                              Decrease = new py(var11[0], 2);
                              Static = new py(var11[3], 3);
                              Flash = new py(var11[6], 4);
                              Grow = new py(var11[2], 5);
                              FILL = new py(var11[5], true.c<invokedynamic>(7065, 7439182485258223719L ^ var20));
                              TNT = new py(var11[7], true.c<invokedynamic>(30008, 4225900272377736900L ^ var20));
                              Pull = new py(var11[1], true.c<invokedynamic>(23108, 6530978780403270078L ^ var20));
                              s = EnumEntriesKt.enumEntries((Enum[])p);
                              return;
                           }
                           break;
                        default:
                           var27[var28] = var35;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "òÕz¦ò\u009d÷÷ó£Û\u0097\u008d}\\\u001b";
                           var5 = "òÕz¦ò\u009d÷÷ó£Û\u0097\u008d}\\\u001b".length();
                           var2 = 0;
                        }

                        var28 = var2;
                        var2 += 8;
                        var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        var27 = var6;
                        var28 = var3++;
                        var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var33 = 0;
                     }
                  }
               }

               var15 = var16.charAt(var14);
               break;
            default:
               var11[var17++] = var30;
               if ((var14 += var15) < var18) {
                  var15 = var16.charAt(var14);
                  continue label54;
               }

               var16 = "¬]â\u0010×â\u0089\u0080\bJ\b¿\u0016qE~\u0087";
               var18 = "¬]â\u0010×â\u0089\u0080\bJ\b¿\u0016qE~\u0087".length();
               var15 = '\b';
               var14 = -1;
            }

            ++var14;
            var24 = var16.substring(var14, var14 + var15);
            var10001 = 0;
         }
      }
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

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 24909;
      if (c[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = b[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])d.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               d.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/py", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         c[var3] = var15;
      }

      return c[var3];
   }

   private static int a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = a(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite a(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("a".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/py" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
