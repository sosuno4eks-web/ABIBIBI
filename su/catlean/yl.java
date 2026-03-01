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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1297;
import net.minecraft.class_239;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.api.event.events.player.AttackEvent;
import su.catlean.api.event.events.player.UpdateCrosshairTarget;
import su.catlean.gofra.Flow;

public final class yl extends k9 {
   @NotNull
   public static final yl I;
   static final KProperty[] s;
   @NotNull
   private static final zo A;
   @NotNull
   private static final zo J;
   @NotNull
   private static final zo S;
   private static final long b = j0.a(-6110724851014251224L, 5953641787813410893L, MethodHandles.lookup().lookupClass()).a(28285681953323L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;

   private yl(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 22507859407946L;
      super(var3, true.z<invokedynamic>(20949, 2021026029190634264L ^ var1), pa.e(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean K(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 134889159082590L;
      int var3 = (int)((var1 ^ 134889159082590L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)A.k((short)var3, this, s[0], (short)var4, var5);
   }

   private final boolean v(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 51051567698545L;
      int var3 = (int)((var1 ^ 51051567698545L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)J.k((short)var3, this, s[1], (short)var4, var5);
   }

   private final boolean M(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 115786181267557L;
      int var3 = (int)((var1 ^ 115786181267557L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)S.k((short)var3, this, s[2], (short)var4, var5);
   }

   @Flow
   private final void Q(UpdateCrosshairTarget param1) {
      // $FF: Couldn't be decompiled
   }

   private final class_239 b(char param1, class_1297 param2, double param3, float param5, short param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void s(@NotNull AttackEvent e) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void p(@NotNull InputEvent e) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = b ^ 93649384842208L;
      long var22 = var20 ^ 25887356013782L;
      long var24 = var20 ^ 36421265345162L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[20];
      int var16 = 0;
      String var15 = "êÂì\u0003ë\u0012\u009b©\u001f\u008f¹å\u009f\u0015?\bdH\u001e)9ÜÎØ\u000e+r?µY\u0082\\ Ë ÍJ«\"Qn\u0088Eðz\\\u0018x³(Hÿ\u0016ú«\u0001reX\u0013ÌïÍDÌ\u0018\u0004I*ü¡O\u0003Ì\u0082·\b\nämÄ\u0085³`_\u009a\u0010=5\b Ô(ø×=|ç¥8g¯ÿºeÔD]Ðÿð\\É,\u0019h,éX\u0000\u0090\u00154(\u001bð¸¶!$y\u0092ø\u0018Ù¨ùÃíþR\"\u0082Ócë{ù\u008d\u009fÌÐ¿oè$\u0014\u0013f¡=ÈQa 3\u0090Fo6«R:\u009aÏ\u0012\u001aäèÁP½®\u0003çZÓ#íò\"7ç*Ã°¡ \u0012J\u001b~ßÐ\u0089M\u001e\u0017µ4%D%\u0081â\u0001\u0005¤|2pá£°ºÜàb\u0097 (Ý\u0088\u009fäø×\u0011ÿË2  h2]»~ã\\\u0097¤Ó\u0014\u0010Ãl§¡É^Ì\u0016.PØÔ¹T¨* /ÿq_\u001c>\u0085\u0087ñhÃJÑÈz\u0014Áêzj]QT\u0092BO#Ð\u0019\u0090\u008c\u00900I\u001bª\rÃ\u0081£ë\u0011û\u0004ÝÒþU§ADÑø¸Çné}\u0097 þ¥a*\u0006+\"\u008fDÌ\u0091\"ZÖÙ»ÞL\u0091®mx½\b~\u00adzøSõ<\u0083R;\u0007TPw\\\u0091\u0089§@v\u0006îÈ£ä\u00166R$\u0010àh\u0000t©WÓæÚê\u00815ð«\u0085ö\u0005èJ´h\u000f\u0083\u008b¯Ð÷ið{ÕJ\u009d\u001bg±´³>Û\u009f\u0092õk=9\u001a,§\u0006\u00807\u009d[\rØÄ=tµÄ\f§úÊ#÷\u0086L\u0082\u0014G\u0085\u009dß\u0086r(\u009bÂ\"GW\u00ad\u0093Âk  ä\u009c7T%Å\u00107´½\u0086\u009a)uÍÈ&\u001e\u0081¢iñ\u00844Òx\u0017£ÌmzÛ(C\u008a3N\u0089\u0013GW\u0096¥fJ8þ«â\u0006\u0015\u0007æö\u0012é/]·F·\u0012\u0080ø+î´iÃ\u008f\u0086Þì\u0018ªÙCs\t\u0004¢\u0014\u0015+&µ94\u000f\u0091¥\u0018]×0Äú\u0002(ì\u0093S\fw}Í\u0005Å´ËA\u0082FwÁj\u0017\u0017^\u001aãÒkPí¥R:÷r¦|¹i*\u0010oÿÌ\u0080pú8Ê;Ô·A\u0093ÈÏ\u009f\u00ad$±\u001fb\u000f\fÚ\u009f»s¾X³\f&%%vK{«\u0081ß¦\u009f\u0081z'V«\u0007hN!¯´¥\u0003|&Áöñç!ÇÉ\u009c¦b·\u009a\b\u0016ñøºu/;Kå>Ù\u0013¨®¤\r¥Â;Væþb\u009eÏ(KGà(\u0083¨ã\u0098í³\u0011¬ñ\u0085\u0000\u0011÷\u0014,j\u008cáÁ\u008d¾\u0096¢n¶\u0099Y^ê\u008dK¹(ümãpbÇ\u0092S\u0006\u0011ò\u008e|4IØØ_Ñ6µ\u0093\u0018ë'Ó\u008eE¯¬0:\u0082Æ\u0086h\u001dr£> £×û²V±\u001e\u001eºT2Á¦Ú}\u0007 \u000e\u0096\u007f\u0004Çí\u001eô¶Íb\u0010Rí¤";
      int var17 = "êÂì\u0003ë\u0012\u009b©\u001f\u008f¹å\u009f\u0015?\bdH\u001e)9ÜÎØ\u000e+r?µY\u0082\\ Ë ÍJ«\"Qn\u0088Eðz\\\u0018x³(Hÿ\u0016ú«\u0001reX\u0013ÌïÍDÌ\u0018\u0004I*ü¡O\u0003Ì\u0082·\b\nämÄ\u0085³`_\u009a\u0010=5\b Ô(ø×=|ç¥8g¯ÿºeÔD]Ðÿð\\É,\u0019h,éX\u0000\u0090\u00154(\u001bð¸¶!$y\u0092ø\u0018Ù¨ùÃíþR\"\u0082Ócë{ù\u008d\u009fÌÐ¿oè$\u0014\u0013f¡=ÈQa 3\u0090Fo6«R:\u009aÏ\u0012\u001aäèÁP½®\u0003çZÓ#íò\"7ç*Ã°¡ \u0012J\u001b~ßÐ\u0089M\u001e\u0017µ4%D%\u0081â\u0001\u0005¤|2pá£°ºÜàb\u0097 (Ý\u0088\u009fäø×\u0011ÿË2  h2]»~ã\\\u0097¤Ó\u0014\u0010Ãl§¡É^Ì\u0016.PØÔ¹T¨* /ÿq_\u001c>\u0085\u0087ñhÃJÑÈz\u0014Áêzj]QT\u0092BO#Ð\u0019\u0090\u008c\u00900I\u001bª\rÃ\u0081£ë\u0011û\u0004ÝÒþU§ADÑø¸Çné}\u0097 þ¥a*\u0006+\"\u008fDÌ\u0091\"ZÖÙ»ÞL\u0091®mx½\b~\u00adzøSõ<\u0083R;\u0007TPw\\\u0091\u0089§@v\u0006îÈ£ä\u00166R$\u0010àh\u0000t©WÓæÚê\u00815ð«\u0085ö\u0005èJ´h\u000f\u0083\u008b¯Ð÷ið{ÕJ\u009d\u001bg±´³>Û\u009f\u0092õk=9\u001a,§\u0006\u00807\u009d[\rØÄ=tµÄ\f§úÊ#÷\u0086L\u0082\u0014G\u0085\u009dß\u0086r(\u009bÂ\"GW\u00ad\u0093Âk  ä\u009c7T%Å\u00107´½\u0086\u009a)uÍÈ&\u001e\u0081¢iñ\u00844Òx\u0017£ÌmzÛ(C\u008a3N\u0089\u0013GW\u0096¥fJ8þ«â\u0006\u0015\u0007æö\u0012é/]·F·\u0012\u0080ø+î´iÃ\u008f\u0086Þì\u0018ªÙCs\t\u0004¢\u0014\u0015+&µ94\u000f\u0091¥\u0018]×0Äú\u0002(ì\u0093S\fw}Í\u0005Å´ËA\u0082FwÁj\u0017\u0017^\u001aãÒkPí¥R:÷r¦|¹i*\u0010oÿÌ\u0080pú8Ê;Ô·A\u0093ÈÏ\u009f\u00ad$±\u001fb\u000f\fÚ\u009f»s¾X³\f&%%vK{«\u0081ß¦\u009f\u0081z'V«\u0007hN!¯´¥\u0003|&Áöñç!ÇÉ\u009c¦b·\u009a\b\u0016ñøºu/;Kå>Ù\u0013¨®¤\r¥Â;Væþb\u009eÏ(KGà(\u0083¨ã\u0098í³\u0011¬ñ\u0085\u0000\u0011÷\u0014,j\u008cáÁ\u008d¾\u0096¢n¶\u0099Y^ê\u008dK¹(ümãpbÇ\u0092S\u0006\u0011ò\u008e|4IØØ_Ñ6µ\u0093\u0018ë'Ó\u008eE¯¬0:\u0082Æ\u0086h\u001dr£> £×û²V±\u001e\u001eºT2Á¦Ú}\u0007 \u000e\u0096\u007f\u0004Çí\u001eô¶Íb\u0010Rí¤".length();
      char var14 = ' ';
      int var13 = -1;

      label47:
      while(true) {
         ++var13;
         String var27 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
            String var32 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var32;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[20];
                  Cipher var1;
                  var10000 = var1 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var2 = 1; var2 < 8; ++var2) {
                     var10003[var2] = (byte)((int)(var20 << var2 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var0 = new long[2];
                  int var4 = 0;
                  String var5 = "\u008eQW\\\u0082\u0003WÎR»ß§\u0005C\u009fÝ";
                  int var6 = "\u008eQW\\\u0082\u0003WÎR»ß§\u0005C\u009fÝ".length();
                  int var3 = 0;

                  do {
                     int var30 = var3;
                     var3 += 8;
                     byte[] var7 = var5.substring(var30, var3).getBytes("ISO-8859-1");
                     var30 = var4++;
                     long var8 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte[] var10 = var1.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                     long var10004 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                     boolean var34 = true;
                     var0[var30] = var10004;
                  } while(var3 < var6);

                  KProperty[] var26 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yl.class, true.z<invokedynamic>(21801, 5076870441552829173L ^ var20), true.z<invokedynamic>(12419, 6453658511239593822L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yl.class, true.z<invokedynamic>(15823, 5102182517567107613L ^ var20), true.z<invokedynamic>(24008, 584494567333253643L ^ var20), 0))), Reflection.property1((PropertyReference1)(new PropertyReference1Impl(yl.class, true.z<invokedynamic>(1165, 6207898581874740058L ^ var20), true.z<invokedynamic>(7057, 7548561835102147652L ^ var20), 0)))};
                  s = var26;
                  I = new yl(var22);
                  A = qi.R((il)I, true.z<invokedynamic>(18333, 1241612977124984909L ^ var20), false, (pj)null, (Function0)null, (int)var0[0], var24, (Object)null);
                  J = qi.R((il)I, true.z<invokedynamic>(17408, 1545841682727554004L ^ var20), true, (pj)null, (Function0)null, (int)var0[1], var24, (Object)null);
                  S = qi.R((il)I, true.z<invokedynamic>(13461, 1874586770320407372L ^ var20), false, (pj)null, (Function0)null, (int)var0[1], var24, (Object)null);
                  return;
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var32;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label47;
               }

               var15 = "i½L?\u0004\u008dô+sk6¨D\u0017n\u008aP)Ôà\u009bøá\u0084íV§º\u000bã'z¢}V|\u0014?nÙ(Ó\u0092B\u0011\u0006ñ\u0092ðAÅz?\u0084§ª¶\u001c\u0084ÖÑÝ|z`Ô\u001cÄò\u0006ÛßÂ,÷þOn\u0096×'";
               var17 = "i½L?\u0004\u008dô+sk6¨D\u0017n\u008aP)Ôà\u009bøá\u0084íV§º\u000bã'z¢}V|\u0014?nÙ(Ó\u0092B\u0011\u0006ñ\u0092ðAÅz?\u0084§ª¶\u001c\u0084ÖÑÝ|z`Ô\u001cÄò\u0006ÛßÂ,÷þOn\u0096×'".length();
               var14 = '(';
               var13 = -1;
            }

            ++var13;
            var27 = var15.substring(var13, var13 + var14);
            var10001 = 0;
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

   private static String a(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26107;
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
            throw new RuntimeException("su/catlean/yl", var10);
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
         throw new RuntimeException("su/catlean/yl" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
