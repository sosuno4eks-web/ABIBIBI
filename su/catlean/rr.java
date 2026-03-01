package su.catlean;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class rr implements xd {
   @NotNull
   private final Json h;
   @NotNull
   private final File J;
   public List Z;
   private static final long a = j0.a(8027519178411110907L, 5375138188594018938L, MethodHandles.lookup().lookupClass()).a(171921198888891L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   public rr(char a, int a, @NotNull Json json, char a) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var3, true.t<invokedynamic>(14230, 984734163429237079L ^ var5));
      super();
      this.h = var3;
      this.J = new File(kf.e(), true.t<invokedynamic>(15744, 1439007573919902531L ^ var5));
   }

   @NotNull
   public final List V(long var1) {
      var1 ^= a;

      try {
         List var10000 = this.Z;
         if (var10000 != null) {
            return var10000;
         }
      } catch (NumberFormatException var3) {
         throw var3.A<invokedynamic>(var3, -3912584170919701682L, var1);
      }

      Intrinsics.throwUninitializedPropertyAccessException(true.t<invokedynamic>(22578, 6383778031235188196L ^ var1));
      return null;
   }

   public final void O(@NotNull List <set-?>, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, true.t<invokedynamic>(16550, 3135320586182010180L ^ var2));
      this.Z = var1;
   }

   public void N(long var1) {
      long var3 = var1 ^ 119654669773946L;

      rr var10000;
      List var10001;
      label29: {
         try {
            var10000 = this;
            if (this.J.createNewFile()) {
               var10001 = (List)(new ArrayList());
               break label29;
            }
         } catch (Exception var12) {
            throw var12.A<invokedynamic>(var12, 1870240036559611L, var1);
         }

         rr var9 = var10000;

         List var5;
         try {
            Json var6 = this.h;
            String var7 = FilesKt.readText$default(this.J, (Charset)null, 1, (Object)null);
            boolean var8 = false;
            var6.getSerializersModule();
            e0 var13 = (e0)var6.decodeFromString((DeserializationStrategy)e0.C.U(), var7);
            List var14 = (List)(new ArrayList());
            var8 = false;
            var14.addAll((Collection)var13.U());
            var14.addAll((Collection)var13.G());
            var14.addAll((Collection)var13.D());
            var10000 = var9;
            var5 = var14;
         } catch (Exception var11) {
            var10000 = var9;
            s8.T().warn(true.t<invokedynamic>(15860, 2359924423071328657L ^ var1));
            var5 = (List)(new ArrayList());
         }

         var10001 = var5;
      }

      var10000.O(var10001, var3);
   }

   public void i(long param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var0 = a ^ 110204067671440L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[5];
      int var7 = 0;
      String var6 = "Tú°\u001cÄ\u0004Ë«<#\u000e\u0011Ú]XÐ\u0010M\u0002Ê7A_áMò\u0015öõ>W\u008eSXükÙ`\u001dâO\u0003É8\u0000R']\u0004ÄÖø\u0015ÅO¹æê\u008f·i\u001bÐ\u001a\u0088L\u009e\u0096¢Ã,~\u0087\u008fa4iå\u0083ûñ \"\u000fG#\\ñß+\u0005J½¯P\u009e\u0003ä'}z\u0088(>\u001ctþ#ÝQÜ\u0004@@\u009b\u000fKZ\u0082@\u000b\u0085";
      int var8 = "Tú°\u001cÄ\u0004Ë«<#\u000e\u0011Ú]XÐ\u0010M\u0002Ê7A_áMò\u0015öõ>W\u008eSXükÙ`\u001dâO\u0003É8\u0000R']\u0004ÄÖø\u0015ÅO¹æê\u008f·i\u001bÐ\u001a\u0088L\u009e\u0096¢Ã,~\u0087\u008fa4iå\u0083ûñ \"\u000fG#\\ñß+\u0005J½¯P\u009e\u0003ä'}z\u0088(>\u001ctþ#ÝQÜ\u0004@@\u009b\u000fKZ\u0082@\u000b\u0085".length();
      char var5 = 16;
      int var4 = -1;

      label27:
      while(true) {
         ++var4;
         String var11 = var6.substring(var4, var4 + var5);
         byte var10001 = -1;

         while(true) {
            byte[] var10 = var2.doFinal(var11.getBytes("ISO-8859-1"));
            String var15 = a(var10).intern();
            switch(var10001) {
            case 0:
               var9[var7++] = var15;
               if ((var4 += var5) >= var8) {
                  b = var9;
                  c = new String[5];
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

               var6 = "\u0002\u0006\t«1 F÷EQ|tF\u0004Ç¢2Ý\u0012ÎÓÔö(\u0080\u008dá.=âÎà\u0010\u0091gÀ\u0082N\u0003¢Ï%\u0090\u000b'9é\u001ek";
               var8 = "\u0002\u0006\t«1 F÷EQ|tF\u0004Ç¢2Ý\u0012ÎÓÔö(\u0080\u008dá.=âÎà\u0010\u0091gÀ\u0082N\u0003¢Ï%\u0090\u000b'9é\u001ek".length();
               var5 = ' ';
               var4 = -1;
            }

            ++var4;
            var11 = var6.substring(var4, var4 + var5);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 21848;
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
            throw new RuntimeException("su/catlean/rr", var10);
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
         throw new RuntimeException("su/catlean/rr" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
