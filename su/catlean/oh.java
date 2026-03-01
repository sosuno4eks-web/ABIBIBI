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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import net.minecraft.class_2708;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.EventPlayerTravel;
import su.catlean.gofra.Flow;

public final class oh extends k9 {
   @NotNull
   public static final oh b;
   // $FF: synthetic field
   static final KProperty[] W;
   @NotNull
   private static final zo m;
   @NotNull
   private static final zc x;
   @NotNull
   private static final zo I;
   @NotNull
   private static final zc J;
   @NotNull
   private static final zc Y;
   @NotNull
   private static final zc o;
   private static int v;
   private static float r;
   private static final long c = j0.a(2520411024982516506L, 5452984267534949431L, MethodHandles.lookup().lookupClass()).a(119136024604572L);
   private static final String[] d;
   private static final String[] e;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] i;
   private static final Map k;

   private oh(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 76900227814344L;
      super(var3, true.f<invokedynamic>(18346, 1086137289348940262L ^ var1), pa.c(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean j(short var1, short var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 48 >>> 16 | (long)var3 << 32 >>> 32) ^ c;
      long var10001 = var4 ^ 136011311946417L;
      int var6 = (int)((var4 ^ 136011311946417L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)m.k((short)var6, this, W[0], (short)var7, var8);
   }

   private final float K(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 78822343794374L;
      int var3 = (int)((var1 ^ 78822343794374L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)x.k((short)var3, this, W[1], (short)var4, var5)).floatValue();
   }

   private final boolean i(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 29936947427339L;
      int var3 = (int)((var1 ^ 29936947427339L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)I.k((short)var3, this, W[2], (short)var4, var5);
   }

   private final float c(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 67337854277037L;
      int var3 = (int)((var1 ^ 67337854277037L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)J.k((short)var3, this, W[3], (short)var4, var5)).floatValue();
   }

   private final float t(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 22879656855657L;
      int var3 = (int)((var1 ^ 22879656855657L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)Y.k((short)var3, this, W[4], (short)var4, var5)).floatValue();
   }

   private final float R(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 119271621828624L;
      int var3 = (int)((var1 ^ 119271621828624L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)o.k((short)var3, this, W[5], (short)var4, var5)).floatValue();
   }

   public void n(long var1) {
      v = 0;
      r = 0.0F;
   }

   @Flow
   public final void g(@NotNull EventPlayerTravel ev) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void e(@NotNull ReceivePacket e) {
      long var2 = c ^ 9559273431348L;
      boolean var10000 = 2904750046292003403L.A<invokedynamic>(2904750046292003403L, var2);
      Intrinsics.checkNotNullParameter(var1, "e");
      boolean var4 = var10000;

      try {
         if (var1.getPacket() instanceof class_2708) {
            r = 0.0F;
         }
      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, 2895516475669977028L, var2);
      }

      try {
         if (!var4) {
            (new int[5]).A<invokedynamic>(new int[5], 2929208432447580957L, var2);
         }

      } catch (NumberFormatException var5) {
         throw var5.A<invokedynamic>(var5, 2895516475669977028L, var2);
      }
   }

   private final float r(long param1) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean S() {
      long var0 = c ^ 25202755218205L;
      long var10001 = var0 ^ 105176461230961L;
      int var2 = (int)((var0 ^ 105176461230961L) >>> 48);
      int var3 = (int)(var10001 << 16 >>> 48);
      int var4 = (int)(var10001 << 32 >>> 32);
      return b.j((short)var2, (short)var3, var4);
   }

   static {
      long var20 = c ^ 110532630752330L;
      long var22 = var20 ^ 104640251983939L;
      long var24 = var20 ^ 12269048317012L;
      long var26 = var20 ^ 131565333849342L;
      f = new HashMap(13);
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
      String var15 = "\u0081±Üúì$5<\u0014\u0082i·ÆOXbþ³7ZØ\u001c\u0000\u009f¥\u0080¢g\u0003aóTfyÖ\u0004\u0010\u0085ªu(¥,±V^õ\"w\u0096GvÖ\u008ddûåÎtàà5Ý\u0087æÀC2ôªoùîÚZÇÅ`î\rQ([Ò\u0006\u001f\u0087`5\u0088\u008fÜYÞÍþµç´jÔA/Ed\u00895\u0098Ár-4â\u0090/;t\u008b5Iáó\u0010#\u000f\u0099\u008eÓIÒ\u0001]\u000e\u000eø\u009e\nÃ1\u0010\u000f-Hz\u00117Ý#,RÖ¯»Ä\u0098\r\u0018ý;¢»\u0011¹·\u0003\u0098A|»\u0098Å\u009dºTÝ\u0011ùX©/\u0086\u0010\u008c>eãIcíêg¼\u001fb#öÃÀ\u0010kvV\u008d´¬QÊ1J7Fï\u008d/± \u0018ô®ñ\u0094}6÷k_Û\u00adÈÍ\u0016\u0087L\u0088ñc¾Ö#¶/í¤\u0081Åë¾Q \u009e¦r\u0087ùåßä#Ö¼a\u008f\u0084äÚ\u0084Í\u001e¿\u008a\u00908ë\u0083?\u0006Rw½\u008f%\u0010\u0098|¹¾\u0007¤e8/DÐ\u00933\u0004Ò\u0017(ªCÔ+\u0081]A\u0003ªPV\u0018K\u008b\u0091ê\nEAÊèa.>\"\u0081]\u009bÕX\u0088êI[z!`$¾\u0017\u0010¢¹8\u008e\u008fÜ\u001fçá^ê]\u0084±\u0011Á\u0010¦ôÝ×\u0090BÂËZ!\u00ad+Ü\u001bOC(¬²¹§a\u00124P4ã£a\u0004Ý=?¹\u0081M=\u0094â\u0007\u008e\u009af\u001dº*<³ºLHVÏ9ö\u00012\u0018[næ½Ê>C\u0012\\\u009agLw*\u009e\u0017\u001c\u0089ýmZÂ\u0093\u0003 p÷ö\u0007Â<>\u0080´\u001c\u001b¨\nödjÍ\u001dìPt\u000f¼í3?éL\u0092L\u0091k Ê\u000b!Þ\u0087è7\u009aÀP8\u0099\u0002ªKÖ×êãúP$\u0095ä¦\u0082\\B±\u008bØÒ";
      int var17 = "\u0081±Üúì$5<\u0014\u0082i·ÆOXbþ³7ZØ\u001c\u0000\u009f¥\u0080¢g\u0003aóTfyÖ\u0004\u0010\u0085ªu(¥,±V^õ\"w\u0096GvÖ\u008ddûåÎtàà5Ý\u0087æÀC2ôªoùîÚZÇÅ`î\rQ([Ò\u0006\u001f\u0087`5\u0088\u008fÜYÞÍþµç´jÔA/Ed\u00895\u0098Ár-4â\u0090/;t\u008b5Iáó\u0010#\u000f\u0099\u008eÓIÒ\u0001]\u000e\u000eø\u009e\nÃ1\u0010\u000f-Hz\u00117Ý#,RÖ¯»Ä\u0098\r\u0018ý;¢»\u0011¹·\u0003\u0098A|»\u0098Å\u009dºTÝ\u0011ùX©/\u0086\u0010\u008c>eãIcíêg¼\u001fb#öÃÀ\u0010kvV\u008d´¬QÊ1J7Fï\u008d/± \u0018ô®ñ\u0094}6÷k_Û\u00adÈÍ\u0016\u0087L\u0088ñc¾Ö#¶/í¤\u0081Åë¾Q \u009e¦r\u0087ùåßä#Ö¼a\u008f\u0084äÚ\u0084Í\u001e¿\u008a\u00908ë\u0083?\u0006Rw½\u008f%\u0010\u0098|¹¾\u0007¤e8/DÐ\u00933\u0004Ò\u0017(ªCÔ+\u0081]A\u0003ªPV\u0018K\u008b\u0091ê\nEAÊèa.>\"\u0081]\u009bÕX\u0088êI[z!`$¾\u0017\u0010¢¹8\u008e\u008fÜ\u001fçá^ê]\u0084±\u0011Á\u0010¦ôÝ×\u0090BÂËZ!\u00ad+Ü\u001bOC(¬²¹§a\u00124P4ã£a\u0004Ý=?¹\u0081M=\u0094â\u0007\u008e\u009af\u001dº*<³ºLHVÏ9ö\u00012\u0018[næ½Ê>C\u0012\\\u009agLw*\u009e\u0017\u001c\u0089ýmZÂ\u0093\u0003 p÷ö\u0007Â<>\u0080´\u001c\u001b¨\nödjÍ\u001dìPt\u000f¼í3?éL\u0092L\u0091k Ê\u000b!Þ\u0087è7\u009aÀP8\u0099\u0002ªKÖ×êãúP$\u0095ä¦\u0082\\B±\u008bØÒ".length();
      char var14 = '(';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var29 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var29.getBytes("ISO-8859-1"));
            String var35 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var35;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  e = new String[20];
                  k = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[9];
                  int var3 = 0;
                  String var4 = "kÐ6Y]öåþ3=G\n\u008d\u008dÙ3$]\u0002(ÞüÀ\u0096\u0015L®¶¼U\u000bd\u008b\u0010¿ßC\u0098%z]áíø\u0095Æ®%¸\u0090\u008e`Ñº\r¾";
                  int var5 = "kÐ6Y]öåþ3=G\n\u008d\u008dÙ3$]\u0002(ÞüÀ\u0096\u0015L®¶¼U\u000bd\u008b\u0010¿ßC\u0098%z]áíø\u0095Æ®%¸\u0090\u008e`Ñº\r¾".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var33 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                     long[] var32 = var6;
                     var33 = var3++;
                     long var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var38 = -1;

                     while(true) {
                        long var8 = var37;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var40 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var38) {
                        case 0:
                           var32[var33] = var40;
                           if (var2 >= var5) {
                              g = var6;
                              i = new Integer[9];
                              KProperty[] var28 = new KProperty[true.a<invokedynamic>(31412, 6362146459695950179L ^ var20)];
                              var28[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oh.class, true.f<invokedynamic>(29604, 3454094132701157813L ^ var20), true.f<invokedynamic>(3592, 4504097440531915796L ^ var20), 0)));
                              var28[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oh.class, true.f<invokedynamic>(30152, 6421038433349394392L ^ var20), true.f<invokedynamic>(17518, 5869652345942208123L ^ var20), 0)));
                              var28[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oh.class, true.f<invokedynamic>(22195, 4179740654164180132L ^ var20), true.f<invokedynamic>(17795, 5001140587398950812L ^ var20), 0)));
                              var28[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oh.class, true.f<invokedynamic>(13993, 8630400864336780468L ^ var20), true.f<invokedynamic>(31717, 677637172907725288L ^ var20), 0)));
                              var28[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oh.class, true.f<invokedynamic>(5524, 7242932025604784013L ^ var20), true.f<invokedynamic>(1370, 6317423259967827797L ^ var20), 0)));
                              var28[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(oh.class, true.f<invokedynamic>(32751, 5426315144939099639L ^ var20), true.f<invokedynamic>(20944, 5111645862996900830L ^ var20), 0)));
                              W = var28;
                              b = new oh(var26);
                              m = qi.R((il)b, true.f<invokedynamic>(27638, 688458904602886637L ^ var20), true, (pj)null, (Function0)null, true.a<invokedynamic>(30221, 1931672193548559836L ^ var20), var24, (Object)null);
                              x = qi.g((il)b, true.f<invokedynamic>(5186, 2603495871846465116L ^ var20), 9.0F, RangesKt.rangeTo(0.0F, 20.0F), (pj)null, oh::S, true.a<invokedynamic>(30842, 1599802322567113640L ^ var20), var22, (Object)null);
                              I = qi.R((il)b, true.f<invokedynamic>(31683, 5610004111041515989L ^ var20), true, (pj)null, (Function0)null, true.a<invokedynamic>(11063, 5717447724333431015L ^ var20), var24, (Object)null);
                              J = qi.g((il)b, true.f<invokedynamic>(27331, 1670689053031907536L ^ var20), 0.77F, RangesKt.rangeTo(0.1F, 5.0F), (pj)null, (Function0)null, true.a<invokedynamic>(27219, 8050362849733556614L ^ var20), var22, (Object)null);
                              Y = qi.g((il)b, true.f<invokedynamic>(16238, 5117909222442440058L ^ var20), 1.0F, RangesKt.rangeTo(0.1F, 5.0F), (pj)null, (Function0)null, true.a<invokedynamic>(18255, 3040323380538578073L ^ var20), var22, (Object)null);
                              o = qi.g((il)b, true.f<invokedynamic>(1693, 3949752891522067591L ^ var20), 0.05F, RangesKt.rangeTo(0.0F, 0.5F), (pj)null, (Function0)null, true.a<invokedynamic>(18255, 3040323380538578073L ^ var20), var22, (Object)null);
                              return;
                           }
                           break;
                        default:
                           var32[var33] = var40;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "?fü\u009a\u0094×>\u0080\u001e²J9z¢êÜ";
                           var5 = "?fü\u009a\u0094×>\u0080\u001e²J9z¢êÜ".length();
                           var2 = 0;
                        }

                        var33 = var2;
                        var2 += 8;
                        var7 = var4.substring(var33, var2).getBytes("ISO-8859-1");
                        var32 = var6;
                        var33 = var3++;
                        var37 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var38 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var35;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "é Õ[ \u0002\u009a\u0017^ãøä\u0081-ô\u008eÁ\u009e±Dê\u0015\u0085ã//\u0089\u0099.eÝÓ\u0018\u0093@^^J\u0016YÔáÔ\u0093mé¼|Z)ü\u009c\u001cÐÆ\u0007¶";
               var17 = "é Õ[ \u0002\u009a\u0017^ãøä\u0081-ô\u008eÁ\u009e±Dê\u0015\u0085ã//\u0089\u0099.eÝÓ\u0018\u0093@^^J\u0016YÔáÔ\u0093mé¼|Z)ü\u009c\u001cÐÆ\u0007¶".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var29 = var15.substring(var13, var13 + var14);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 20202;
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
            throw new RuntimeException("su/catlean/oh", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = d[var5].getBytes("ISO-8859-1");
         e[var5] = b(((Cipher)var4[0]).doFinal(var9));
      }

      return e[var5];
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
         throw new RuntimeException("su/catlean/oh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14118;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/oh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
   }

   private static int c(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = b(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite c(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("c".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/oh" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
