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
import kotlin.Metadata;
import net.minecraft.class_437;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.IPasteable;
import su.catlean.api.event.events.client.InitEvent;
import su.catlean.api.event.events.client.PostTitleScreenInitEvent;
import su.catlean.gofra.Flow;

@ExcludeCommon
@Metadata(
   mv = {2, 2, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\nH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"},
   d2 = {"Lsu/catlean/CatLean;", "Lsu/catlean/api/IPasteable;", "CatLean", "()V", "", "onInitializeClient", "Lsu/catlean/api/event/events/client/InitEvent;", "event", "k", "(Lsu/catlean/api/event/events/client/InitEvent;)V", "Lsu/catlean/api/event/events/client/PostTitleScreenInitEvent;", "w", "(Lsu/catlean/api/event/events/client/PostTitleScreenInitEvent;)V", "catlean"}
)
public final class CatLean implements IPasteable {
   @NotNull
   public static final CatLean INSTANCE;
   private static final long a = j0.a(7477152948481933584L, 154828754357827827L, MethodHandles.lookup().lookupClass()).a(31458672692143L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);

   private CatLean() {
   }

   public void onInitializeClient() {
      long var1 = a ^ 106039710553659L;
      long var10001 = var1 ^ 135332092751805L;
      int var3 = (int)((var1 ^ 135332092751805L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      long var6 = var1 ^ 45364598005536L;
      ak.S((IPasteable)this, (char)var3, (char)var4, var5);
      aq.p(var6, (IPasteable)this);
   }

   @Flow
   private final void k(InitEvent var1) {
      long var2 = a ^ 106430883621643L;
      long var10001 = var2 ^ 110399319013827L;
      int var4 = (int)((var2 ^ 110399319013827L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var2 ^ 58406378495251L;
      PreLaunch.INSTANCE.H();
      g8.Y((short)var4, (IPasteable)this, var5, (char)var6);
      nf.s.i(var7);
      String var10000 = 16315.a<invokedynamic>(16315, 8114217208925530640L ^ var2);
      String var9 = System.getProperty(true.a<invokedynamic>(31984, 4298015666825390424L ^ var2));
      String var10003 = true.a<invokedynamic>(24142, 8833581819099827175L ^ var2);
      System.setProperty(var10000, var10003 + var9);
   }

   @Flow
   private final void w(PostTitleScreenInitEvent var1) {
      long var2 = a ^ 110479301199719L;
      long var4 = var2 ^ 111118249879918L;
      long var10001 = var2 ^ 90441509825932L;
      int var6 = (int)((var2 ^ 90441509825932L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);

      try {
         if (mf.j()) {
            s8.H((short)var6, (short)var7, var8).method_1507((class_437)(new z1(var4)));
         }

      } catch (NumberFormatException var9) {
         throw var9.A<invokedynamic>(var9, -6941302775927840750L, var2);
      }
   }

   static {
      long var0 = a ^ 134466579490006L;
      Cipher var2;
      Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var0 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var3 = 1; var3 < 8; ++var3) {
         var10003[var3] = (byte)((int)(var0 << var3 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var9 = new String[3];
      int var7 = 0;
      String var6 = "«yÓfÑ\u0099\u009a6\u0083\u0007\u0098Vo¡×Þ Ó\u007f\u0085Ý\u00182'\u008bö jÝg;ëxÌtC\u0015Óâá\u0090\u0013Ö\u0017÷²Ò9¨ @\u009a¹Á=C\u007f{þ\u008cj\u000e¡\u008aû1¹«\u0092µ(Ú\u0012óÙ\u001dXÛ)U\u009cö";
      int var8 = "«yÓfÑ\u0099\u009a6\u0083\u0007\u0098Vo¡×Þ Ó\u007f\u0085Ý\u00182'\u008bö jÝg;ëxÌtC\u0015Óâá\u0090\u0013Ö\u0017÷²Ò9¨ @\u009a¹Á=C\u007f{þ\u008cj\u000e¡\u008aû1¹«\u0092µ(Ú\u0012óÙ\u001dXÛ)U\u009cö".length();
      char var5 = 16;
      int var4 = -1;

      while(true) {
         ++var4;
         byte[] var10 = var2.doFinal(var6.substring(var4, var4 + var5).getBytes("ISO-8859-1"));
         String var12 = a(var10).intern();
         boolean var10001 = true;
         var9[var7++] = var12;
         if ((var4 += var5) >= var8) {
            b = var9;
            c = new String[3];
            INSTANCE = new CatLean();
            return;
         }

         var5 = var6.charAt(var4);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 9872;
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
            throw new RuntimeException("su/catlean/CatLean", var10);
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
         throw new RuntimeException("su/catlean/CatLean" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
