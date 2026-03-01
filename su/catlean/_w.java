package su.catlean;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_124;
import org.jetbrains.annotations.NotNull;

public final class _w extends _i {
   @NotNull
   public static final _w g;
   private static final long a = j0.a(-3855160326596041731L, 7020110372132985482L, MethodHandles.lookup().lookupClass()).a(179885224566231L);
   private static final String[] c;
   private static final String[] e;
   private static final Map i;

   private _w(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 114284616723287L;
      super(true.m<invokedynamic>(8581, 2327929930486330277L ^ var1), var3);
   }

   public void T(long a, @NotNull LiteralArgumentBuilder builder) {
      long var10001 = var1 ^ 8939855007606L;
      int var4 = (int)((var1 ^ 8939855007606L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      long var7 = var1 ^ 70331075405448L;
      boolean var10000 = 7094282424311137902L.A<invokedynamic>(7094282424311137902L, var1);
      Intrinsics.checkNotNullParameter(var3, true.m<invokedynamic>(22759, 4325218833244082833L ^ var1));
      var3.then(this.t(var7, true.m<invokedynamic>(26742, 1696630473545933320L ^ var1)).executes(_w::L));
      boolean var10 = var10000;
      var3.then(this.t(var7, true.m<invokedynamic>(28734, 4968009355907988044L ^ var1)).executes(_w::B));
      var3.then(this.t(var7, true.m<invokedynamic>(26578, 4787528348160191919L ^ var1)).executes(_w::v));
      LiteralArgumentBuilder var12 = var3;
      LiteralArgumentBuilder var13 = this.t(var7, true.m<invokedynamic>(21139, 8916221740691577067L ^ var1));
      _w var10002 = this;
      String var10003 = 18404.m<invokedynamic>(18404, 6121954183430229406L ^ var1);
      StringArgumentType var10004 = StringArgumentType.word();
      Intrinsics.checkNotNullExpressionValue(var10004, true.m<invokedynamic>(23071, 4466889053699592314L ^ var1));
      ArgumentType var9 = (ArgumentType)var10004;

      try {
         var12.then(var13.then(var10002.k(var10003, var4, (char)var5, var9, (short)var6).executes(_w::V)));
         var3.then(this.t(var7, true.m<invokedynamic>(9467, 1993664809469423261L ^ var1)).then(this.k(true.m<invokedynamic>(18404, 6121954183430229406L ^ var1), var4, (char)var5, (ArgumentType)g5.h.g(), (short)var6).executes(_w::O)));
         var3.then(this.t(var7, true.m<invokedynamic>(23560, 480231571642242683L ^ var1)).then(this.k(true.m<invokedynamic>(18404, 6121954183430229406L ^ var1), var4, (char)var5, (ArgumentType)g5.h.g(), (short)var6).executes(_w::I)));
         var3.executes(_w::D);
         if (!var10) {
            (new int[4]).A<invokedynamic>(new int[4], 7085429829879112175L, var1);
         }

      } catch (NumberFormatException var11) {
         throw var11.A<invokedynamic>(var11, 7068441003330670305L, var1);
      }
   }

   private static final int L(CommandContext param0) {
      // $FF: Couldn't be decompiled
   }

   private static final int B(CommandContext param0) {
      // $FF: Couldn't be decompiled
   }

   private static final int v(CommandContext var0) {
      long var1 = a ^ 34715881897196L;
      long var10001 = var1 ^ 40255039456122L;
      int var3 = (int)((var1 ^ 40255039456122L) >>> 32);
      int var4 = (int)(var10001 << 32 >>> 40);
      int var5 = (int)(var10001 << 56 >>> 56);
      long var6 = var1 ^ 112513834838241L;
      boolean var10000 = 1537804548844105212L.A<invokedynamic>(1537804548844105212L, var1);
      Iterator var17 = sj.w.r().iterator();
      Intrinsics.checkNotNullExpressionValue(var17, true.m<invokedynamic>(7090, 1197940010786121347L ^ var1));
      Iterator var9 = var17;
      boolean var8 = var10000;

      label49:
      while(var9.hasNext()) {
         Object var15 = var9.next();
         Intrinsics.checkNotNullExpressionValue(var15, true.m<invokedynamic>(27983, 3019510746718376049L ^ var1));
         k9 var10 = (k9)var15;

         while(true) {
            k9 var16 = var10;
            if (!var8) {
               try {
                  if (var16.Z(var6)) {
                     var10.l(var3, var4, (byte)var5);
                  }
               } catch (NumberFormatException var14) {
                  throw var14.A<invokedynamic>(var14, 1537505888407452079L, var1);
               }

               var16 = var10;
            }

            Iterator var11 = var16.B().iterator();

            while(true) {
               if (!var11.hasNext()) {
                  continue label49;
               }

               zf var12 = (zf)var11.next();
               var12.r();
               if (var8) {
                  break;
               }

               try {
                  if (var8 || var8) {
                     return 1;
                  }
               } catch (NumberFormatException var13) {
                  throw var13.A<invokedynamic>(var13, 1537505888407452079L, var1);
               }
            }
         }
      }

      return 1;
   }

   private static final int V(CommandContext var0) {
      long var1 = a ^ 66385866934274L;
      long var3 = var1 ^ 79859732360099L;
      long var5 = var1 ^ 80728971431177L;
      long var7 = var1 ^ 138765387770948L;
      String var9 = (String)var0.getArgument(true.m<invokedynamic>(18404, 6122040917342129726L ^ var1), String.class);
      Intrinsics.checkNotNull(var9);
      q3.A(var9, hh.MODULES, var3);
      _w var10000 = g;
      nf var10001 = nf.s;
      String var10002 = 12438.m<invokedynamic>(12438, 8281047077462407506L ^ var1);
      Object[] var10 = new Object[]{var9};
      var10000.O(var10001.G(var10002, var5, var10), var7);
      return 1;
   }

   private static final int O(CommandContext var0) {
      long var1 = a ^ 41301033577203L;
      long var10001 = var1 ^ 103167762107795L;
      int var3 = (int)((var1 ^ 103167762107795L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      long var6 = var1 ^ 88633675706360L;
      long var8 = var1 ^ 114093034704565L;
      String var10 = (String)var0.getArgument(true.m<invokedynamic>(18404, 6122012813415066831L ^ var1), String.class);
      Intrinsics.checkNotNull(var10);
      q3.j((char)var3, var4, var5, var10, hh.MODULES);
      _w var10000 = g;
      nf var12 = nf.s;
      String var10002 = 22084.m<invokedynamic>(22084, 7459393057203273057L ^ var1);
      Object[] var11 = new Object[]{var10};
      var10000.O(var12.G(var10002, var6, var11), var8);
      return 1;
   }

   private static final int I(CommandContext var0) {
      long var1 = a ^ 3788905449815L;
      long var3 = var1 ^ 77532517267563L;
      long var5 = var1 ^ 130286422789212L;
      long var7 = var1 ^ 71632873614609L;
      String var9 = (String)var0.getArgument(true.m<invokedynamic>(17620, 8653612082594073693L ^ var1), String.class);
      Intrinsics.checkNotNull(var9);
      q3.D(var9, var3, hh.MODULES);
      _w var10000 = g;
      nf var10001 = nf.s;
      String var10002 = 18094.m<invokedynamic>(18094, 7097579606779907628L ^ var1);
      Object[] var10 = new Object[]{var9};
      var10000.O(var10001.G(var10002, var5, var10), var7);
      return 1;
   }

   private static final int D(CommandContext var0) {
      long var1 = a ^ 62652328834165L;
      long var3 = var1 ^ 134892548296755L;
      g.O(class_124.field_1061 + true.m<invokedynamic>(10869, 5871470555545886683L ^ var1), var3);
      return 1;
   }

   static {
      long var9 = a ^ 103702605406878L;
      long var11 = var9 ^ 15446944864695L;
      i = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[19];
      int var5 = 0;
      String var4 = "ë©¸í\"±tËÁy\u008f\u0018¾¶W\u008cØÀ\u0015&\u0098Qoi¬\u0001ÛZ\u0082\u0081k©\u000eï$o\u0006+\u0083F(\u008a%ôXóØfÄ\u0099HWÔY\r\r¼\u009e\u000f/\u0012<}A#á¤^Å\u001fÕû/Ü~\u0082þ»\u001d_?\u0010ÏÃ¬.Ûyç¿\u0098òàj»÷\u0002l0|fßó\u000fª¤\u0092Á}®\u0080\u0081Ï\u008a@Ðý\u0092Òém_g\u0004æ9Dv¾\u00ad\u007fç\u009d«ÓU¸\u009a\u009cJä\u0087>£j\u0092ö \bfN\u00078¤äí³ÝÊ\u0086\u0086¼¥\u001f\u009b\u0087\u00ad\tðå3\u000e\u007f#D^ã6È~\u0010éK?ï\u0083>\u00036G%\u0094Gz¼\u009cÓ\u0010\u0082-\u0098\\¼D\u0004Ø¦Ð\u008dÛ\u008ckg\u0088\u0010Äf\u0019Ñ=¶Ð==r3²õF\u009a\u0015\u00105cOB\u009fØ\u0010ÃùÎv\u0086c^\u000e°\u0010\u008b\n±\u000fý 4ãð\u0084jð\u000e\u00adú\u0019\u001018~?gú\u0086ì\u0000·¤ð{ó®\f\u0018d\u009eê0Ðb§þ@\n\u0001¡vF\u001dPTsµÐ\u0081ëjû\u0010b\u0087Sñ\u0098+·Æá\u0092\u0084açzFó@²Y$å¥\u001cÛ\u009d)ïoµ·\u0018\u0091Ío?nqQ!°\u0088 \u0086:N\u0019N\u008a\u008ftm\u001eS§\u001d\u0082½B\u0015ÌÎÜoðñ.\u008f[\u0017d)\u0011F3ÃT\u000fkåô¥\u0010ð\n\tLh\u001a\u001fÏ£â½hÙ¶>\u001a\u0018\u0001\u0092<· ÏË¨Ê]#þNMSÌ\rþRóÛ\u0082\bß(Ðh\u0094Â\u009bRÅþrûü\tÙ\u009ce2#%FXï7\u0010\u00077òE¬@ä\u0084ü¨Ñ;hÕ)[Ê";
      int var6 = "ë©¸í\"±tËÁy\u008f\u0018¾¶W\u008cØÀ\u0015&\u0098Qoi¬\u0001ÛZ\u0082\u0081k©\u000eï$o\u0006+\u0083F(\u008a%ôXóØfÄ\u0099HWÔY\r\r¼\u009e\u000f/\u0012<}A#á¤^Å\u001fÕû/Ü~\u0082þ»\u001d_?\u0010ÏÃ¬.Ûyç¿\u0098òàj»÷\u0002l0|fßó\u000fª¤\u0092Á}®\u0080\u0081Ï\u008a@Ðý\u0092Òém_g\u0004æ9Dv¾\u00ad\u007fç\u009d«ÓU¸\u009a\u009cJä\u0087>£j\u0092ö \bfN\u00078¤äí³ÝÊ\u0086\u0086¼¥\u001f\u009b\u0087\u00ad\tðå3\u000e\u007f#D^ã6È~\u0010éK?ï\u0083>\u00036G%\u0094Gz¼\u009cÓ\u0010\u0082-\u0098\\¼D\u0004Ø¦Ð\u008dÛ\u008ckg\u0088\u0010Äf\u0019Ñ=¶Ð==r3²õF\u009a\u0015\u00105cOB\u009fØ\u0010ÃùÎv\u0086c^\u000e°\u0010\u008b\n±\u000fý 4ãð\u0084jð\u000e\u00adú\u0019\u001018~?gú\u0086ì\u0000·¤ð{ó®\f\u0018d\u009eê0Ðb§þ@\n\u0001¡vF\u001dPTsµÐ\u0081ëjû\u0010b\u0087Sñ\u0098+·Æá\u0092\u0084açzFó@²Y$å¥\u001cÛ\u009d)ïoµ·\u0018\u0091Ío?nqQ!°\u0088 \u0086:N\u0019N\u008a\u008ftm\u001eS§\u001d\u0082½B\u0015ÌÎÜoðñ.\u008f[\u0017d)\u0011F3ÃT\u000fkåô¥\u0010ð\n\tLh\u001a\u001fÏ£â½hÙ¶>\u001a\u0018\u0001\u0092<· ÏË¨Ê]#þNMSÌ\rþRóÛ\u0082\bß(Ðh\u0094Â\u009bRÅþrûü\tÙ\u009ce2#%FXï7\u0010\u00077òE¬@ä\u0084ü¨Ñ;hÕ)[Ê".length();
      char var3 = '(';
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var13 = var4.substring(var2, var2 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var17 = b(var8).intern();
            switch(var10001) {
            case 0:
               var7[var5++] = var17;
               if ((var2 += var3) >= var6) {
                  c = var7;
                  e = new String[19];
                  g = new _w(var11);
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var17;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "+n\u0003àb\u0018\u0006v\u008dFi\u001dÀT\u0007ÊÿûE\u001fbØß\b\u0010x!4\u0093ná@\u008b\u000fÈ\u001c=²ÓL\u0010";
               var6 = "+n\u0003àb\u0018\u0006v\u008dFi\u001dÀT\u0007ÊÿûE\u001fbØß\b\u0010x!4\u0093ná@\u008b\u000fÈ\u001c=²ÓL\u0010".length();
               var3 = 24;
               var2 = -1;
            }

            ++var2;
            var13 = var4.substring(var2, var2 + var3);
            var10001 = 0;
         }
      }
   }

   private static Exception a(Exception var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26892;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/_w", var10);
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
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/_w" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
