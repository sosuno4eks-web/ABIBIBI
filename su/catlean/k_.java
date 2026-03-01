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
import net.minecraft.class_1657;
import net.minecraft.class_238;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class k_ extends kr {
   @NotNull
   public static final k_ P;
   // $FF: synthetic field
   static final KProperty[] K;
   @NotNull
   private static final zo e;
   @NotNull
   private static final zk q;
   @NotNull
   private static final zo c;
   @NotNull
   private static final zo m;
   @NotNull
   private static final zo Q;
   @NotNull
   private static final zo C;
   private static final long k = j0.a(-6700014929265409796L, 2808573734568805154L, MethodHandles.lookup().lookupClass()).a(263518633728867L);
   private static final String[] s;
   private static final String[] y;
   private static final Map z;
   private static final long[] A;
   private static final Integer[] B;
   private static final Map V;

   private k_(long var1) {
      var1 ^= k;
      long var3 = var1 ^ 11275661940142L;
      super(true.w<invokedynamic>(1562, 7294539592461029623L ^ var1), var3, pa.Q(), 0, false, true.f<invokedynamic>(16298, 7554887461784697470L ^ var1), (DefaultConstructorMarker)null);
   }

   private final boolean b(long var1) {
      var1 ^= k;
      long var10001 = var1 ^ 113178224594327L;
      int var3 = (int)((var1 ^ 113178224594327L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)e.k((short)var3, this, K[0], (short)var4, var5);
   }

   private final pj T(long var1) {
      var1 ^= k;
      long var10001 = var1 ^ 90465963969096L;
      int var3 = (int)((var1 ^ 90465963969096L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (pj)q.k((short)var3, this, K[1], (short)var4, var5);
   }

   private final boolean I(long var1) {
      var1 ^= k;
      long var10001 = var1 ^ 68578567759652L;
      int var3 = (int)((var1 ^ 68578567759652L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)c.k((short)var3, this, K[2], (short)var4, var5);
   }

   private final boolean i(long var1) {
      var1 ^= k;
      long var10001 = var1 ^ 6432260295347L;
      int var3 = (int)((var1 ^ 6432260295347L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)m.k((short)var3, this, K[3], (short)var4, var5);
   }

   private final boolean m(long var1) {
      var1 ^= k;
      long var10001 = var1 ^ 26588865228337L;
      int var3 = (int)((var1 ^ 26588865228337L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)Q.k((short)var3, this, K[4], (short)var4, var5);
   }

   private final boolean y(long var1) {
      var1 ^= k;
      long var10001 = var1 ^ 140698152530165L;
      int var3 = (int)((var1 ^ 140698152530165L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)C.k((short)var3, this, K[5], (short)var4, var5);
   }

   @Flow
   private final void K(PlayerUpdateEvent var1) {
      long var2 = k ^ 126715819905953L;
      long var4 = var2 ^ 11839144616497L;
      long var6 = var2 ^ 83352333747617L;
      kr.J((kr)this, this.J(var6), var4, false, false, (List)null, false, true.f<invokedynamic>(16534, 3967713264933067546L ^ var2), (Object)null);
   }

   private final List J(long param1) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   protected List h(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final boolean J(char param1, long param2, class_1657 param4) {
      // $FF: Couldn't be decompiled
   }

   private final boolean c(int param1, class_238 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   protected v0 c() {
      return v0.NONE;
   }

   static {
      long var20 = k ^ 93830901746127L;
      long var22 = var20 ^ 59243285852506L;
      long var24 = var20 ^ 85202010074648L;
      long var26 = var20 ^ 98007985534429L;
      long var28 = var20 ^ 89165352884352L;
      z = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[24];
      int var16 = 0;
      String var15 = "Ûy^\u0011QII\u0015Ùo+p{Ô«ñ6¿Æ¦R\u0018>!L]\u0097}½=\u0003® 2OêÙ£X}îÔæ¡`\\é\u0012OÂ\u001a\u001d\u007fR\u001d\u0019U\u0019\u0012Ä\u0001§à£j\u0010jFB·ú{\u0092Yø·J \u0086p³i\u0018¦ÒÌ¥\u008c\u0000ÿÚ£«t7\u0093\u008a\u0004XÔ\u0086Ü4Ù\u009b%æ\u0018\u0013\u0094ñ.MÂ\u0081©`ä\u0086ª\u0017Â\u0017ë\t\u0019{\u0098\u0019Jç}\u0010\u008fH|B}«ðÌ(\u001a\\,OÊ\u0091Ê Ýè\u0099\u0084Î)Ò½=\u000f\u0085\\\u008ec\u007f±ä\u008e¬£À!À--³6ü8²Èñ\u0010¦^â\u008bIû\u0087R\u0018=öM\u0011 ¸Ê8ä]o@Ì\u001b\u0092?Îc\u0010ã1y\u0095»\f.\u0085\u007f1ãN-Ú\u000eAó\u0087%t¦\u009d1íWj}Ð\u008b×`\u0018¾\u001auS\u008fß\fSo!óø\u0017 î¼¸¢\u0083\u0084KçëÅKvP«*²n\u0006\u0003Ã·µ&9m/3vy\u009cà>\u0018³\u0088Á\u0018\u008cHÚ&\u0087Ý\u008e-·xC\u0091í Çk·6~K\u0018y\u0002Ç-|\u0003\u009dö\u0088LC½$ôì\u0096\u0081\u0012Ë¶\u009f1\t\u00ad\u0010¥»(QZQí-Nç«\u007fÈ\u000bD\u0002 Å¡ÿ'[ü¼Ö0\u0007\u0000=5\u0001÷\u0002\u0014I¤×@~\u0018ÍNÿ\u0080<g\u0013g#\u0010AH;P\u007f\u000e\fºqRºó\u007f\u00118è\u0010°Ì\u0094ícâëÊ·\u008d!_ð\u0003ó=\u0018?\u0080\u008e|i!&\u009e«\u008f^v=ª÷\u009fla*Æô?¼Ý\u0010GØ\u0015\u0085ü.\u0085çÎàmÎI*¡4\u0010üó(ö5¸wq\u0085&171ñæz Û\tSr>L\u000b¿\r\"´àðQ\u001egáA7v\u000e'Xö¤Îã{4\u001dë;(Ràz°~\u0081Ùí¦j=\u001cCV\u001f\u0004,cG\u008dÍ]*;\u000eÈ\u001b\u008f®7ßP\u00183Þ©ÂØ\u009f_([\u008cçÍìzb3\u0014$ÌÈì\u0085?\nú\u0084\u001d½\u007fÎ.\u001bßkÓ\u0089oSq\u0013S¯,\u009fíü\u0016\u0087";
      int var17 = "Ûy^\u0011QII\u0015Ùo+p{Ô«ñ6¿Æ¦R\u0018>!L]\u0097}½=\u0003® 2OêÙ£X}îÔæ¡`\\é\u0012OÂ\u001a\u001d\u007fR\u001d\u0019U\u0019\u0012Ä\u0001§à£j\u0010jFB·ú{\u0092Yø·J \u0086p³i\u0018¦ÒÌ¥\u008c\u0000ÿÚ£«t7\u0093\u008a\u0004XÔ\u0086Ü4Ù\u009b%æ\u0018\u0013\u0094ñ.MÂ\u0081©`ä\u0086ª\u0017Â\u0017ë\t\u0019{\u0098\u0019Jç}\u0010\u008fH|B}«ðÌ(\u001a\\,OÊ\u0091Ê Ýè\u0099\u0084Î)Ò½=\u000f\u0085\\\u008ec\u007f±ä\u008e¬£À!À--³6ü8²Èñ\u0010¦^â\u008bIû\u0087R\u0018=öM\u0011 ¸Ê8ä]o@Ì\u001b\u0092?Îc\u0010ã1y\u0095»\f.\u0085\u007f1ãN-Ú\u000eAó\u0087%t¦\u009d1íWj}Ð\u008b×`\u0018¾\u001auS\u008fß\fSo!óø\u0017 î¼¸¢\u0083\u0084KçëÅKvP«*²n\u0006\u0003Ã·µ&9m/3vy\u009cà>\u0018³\u0088Á\u0018\u008cHÚ&\u0087Ý\u008e-·xC\u0091í Çk·6~K\u0018y\u0002Ç-|\u0003\u009dö\u0088LC½$ôì\u0096\u0081\u0012Ë¶\u009f1\t\u00ad\u0010¥»(QZQí-Nç«\u007fÈ\u000bD\u0002 Å¡ÿ'[ü¼Ö0\u0007\u0000=5\u0001÷\u0002\u0014I¤×@~\u0018ÍNÿ\u0080<g\u0013g#\u0010AH;P\u007f\u000e\fºqRºó\u007f\u00118è\u0010°Ì\u0094ícâëÊ·\u008d!_ð\u0003ó=\u0018?\u0080\u008e|i!&\u009e«\u008f^v=ª÷\u009fla*Æô?¼Ý\u0010GØ\u0015\u0085ü.\u0085çÎàmÎI*¡4\u0010üó(ö5¸wq\u0085&171ñæz Û\tSr>L\u000b¿\r\"´àðQ\u001egáA7v\u000e'Xö¤Îã{4\u001dë;(Ràz°~\u0081Ùí¦j=\u001cCV\u001f\u0004,cG\u008dÍ]*;\u000eÈ\u001b\u008f®7ßP\u00183Þ©ÂØ\u009f_([\u008cçÍìzb3\u0014$ÌÈì\u0085?\nú\u0084\u001d½\u007fÎ.\u001bßkÓ\u0089oSq\u0013S¯,\u009fíü\u0016\u0087".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var31 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var31.getBytes("ISO-8859-1"));
            String var37 = c(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var37;
               if ((var13 += var14) >= var17) {
                  s = var18;
                  y = new String[24];
                  V = new HashMap(13);
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
                  String var4 = "1DÅ\b\u0094\u0086¼Z\u0015ñR8òZA\u0088Gp\u00ad1o}ß\"þhyíææ()¤8§\u0003ªq\u0094\u008e";
                  int var5 = "1DÅ\b\u0094\u0086¼Z\u0015ñR8òZA\u0088Gp\u00ad1o}ß\"þhyíææ()¤8§\u0003ªq\u0094\u008e".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var35 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                     long[] var34 = var6;
                     var35 = var3++;
                     long var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var40 = -1;

                     while(true) {
                        long var8 = var39;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var42 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var40) {
                        case 0:
                           var34[var35] = var42;
                           if (var2 >= var5) {
                              A = var6;
                              B = new Integer[7];
                              KProperty[] var30 = new KProperty[true.f<invokedynamic>(8452, 7738305750763348197L ^ var20)];
                              var30[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k_.class, true.w<invokedynamic>(31884, 8086075805452627548L ^ var20), true.w<invokedynamic>(19656, 786263949932912136L ^ var20), 0)));
                              var30[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k_.class, true.w<invokedynamic>(22853, 2926015106363607955L ^ var20), true.w<invokedynamic>(9524, 4564907893066872808L ^ var20), 0)));
                              var30[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k_.class, true.w<invokedynamic>(6388, 5516786261465500209L ^ var20), true.w<invokedynamic>(10436, 2362987656011364883L ^ var20), 0)));
                              var30[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k_.class, true.w<invokedynamic>(17754, 8312167894500399004L ^ var20), true.w<invokedynamic>(10748, 2467196666294221630L ^ var20), 0)));
                              var30[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k_.class, true.w<invokedynamic>(29393, 9166015825840594946L ^ var20), true.w<invokedynamic>(26518, 5241812193245066563L ^ var20), 0)));
                              var30[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(k_.class, true.w<invokedynamic>(11540, 8179176416791543744L ^ var20), true.w<invokedynamic>(24228, 3964541716096404581L ^ var20), 0)));
                              K = var30;
                              P = new k_(var28);
                              e = qi.R((il)P, true.w<invokedynamic>(1180, 8560868440915678811L ^ var20), false, (pj)null, (Function0)null, true.f<invokedynamic>(8286, 7656461370767516089L ^ var20), var26, (Object)null);
                              q = qi.G((il)P, true.w<invokedynamic>(10605, 4150217578079075260L ^ var20), r6.BOOLS, (Function0)null, var24, 4, (Object)null);
                              c = qi.R((il)P, true.w<invokedynamic>(3535, 7871638336445783828L ^ var20), true, P.T(var22), (Function0)null, true.f<invokedynamic>(28676, 3179009138302808545L ^ var20), var26, (Object)null);
                              m = qi.R((il)P, true.w<invokedynamic>(13139, 8903711200016048523L ^ var20), true, P.T(var22), (Function0)null, true.f<invokedynamic>(12279, 8471161570223369751L ^ var20), var26, (Object)null);
                              Q = qi.R((il)P, true.w<invokedynamic>(10473, 1144755987219462707L ^ var20), true, P.T(var22), (Function0)null, true.f<invokedynamic>(12279, 8471161570223369751L ^ var20), var26, (Object)null);
                              C = qi.R((il)P, true.w<invokedynamic>(5738, 5753970492680438967L ^ var20), true, P.T(var22), (Function0)null, true.f<invokedynamic>(12279, 8471161570223369751L ^ var20), var26, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var34[var35] = var42;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "p\u000f\u0084\u0087ä\u0089w(¼éÜg\"\u0016°\u0091";
                           var5 = "p\u000f\u0084\u0087ä\u0089w(¼éÜg\"\u0016°\u0091".length();
                           var2 = 0;
                        }

                        var35 = var2;
                        var2 += 8;
                        var7 = var4.substring(var35, var2).getBytes("ISO-8859-1");
                        var34 = var6;
                        var35 = var3++;
                        var39 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var40 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var37;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "ÀjÁQ¬\u0091«7¦j\u0012\u0018B\u0096\u0093gbõ¤PG¾®\u0015Qýi\u0082Éà\u0000D8Â\u007f!¿\u0089ùg\u0010%º¹z¥ëR×(r|\u009e\u0007áü\u001e\u0092A\u0015È]\u009c\u0016\b-\u0010\rs\u001eo£k»\u00admô]»Åb4º¯\u008fè6·Ð";
               var17 = "ÀjÁQ¬\u0091«7¦j\u0012\u0018B\u0096\u0093gbõ¤PG¾®\u0015Qýi\u0082Éà\u0000D8Â\u007f!¿\u0089ùg\u0010%º¹z¥ëR×(r|\u009e\u0007áü\u001e\u0092A\u0015È]\u009c\u0016\b-\u0010\rs\u001eo£k»\u00admô]»Åb4º¯\u008fè6·Ð".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var31 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static NumberFormatException a(NumberFormatException var0) {
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 1961;
      if (y[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])z.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               z.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/k_", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = s[var5].getBytes("ISO-8859-1");
         y[var5] = c(((Cipher)var4[0]).doFinal(var9));
      }

      return y[var5];
   }

   private static Object c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = b(var4, var5);
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
         throw new RuntimeException("su/catlean/k_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int e(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5273;
      if (B[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = A[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])V.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               V.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/k_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         B[var3] = var15;
      }

      return B[var3];
   }

   private static int f(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = e(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite f(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("f".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/k_" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
