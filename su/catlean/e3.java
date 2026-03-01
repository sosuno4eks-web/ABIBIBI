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
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_4050;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.AfterElytraEvent;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.PreElytraEvent;
import su.catlean.api.event.events.player.PreSyncEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.api.event.events.world.FireWorkVelocityEvent;

public final class e3 implements h5 {
   @NotNull
   public static final e3 F;
   private static float n;
   private static float y;
   @NotNull
   private static final n q;
   @NotNull
   private static final n D;
   @NotNull
   private static HashMap B;
   private static final long a = j0.a(6494401305949257687L, 6324111252386551799L, MethodHandles.lookup().lookupClass()).a(158026042866318L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private e3() {
   }

   public void m(char a, @NotNull PreSyncEvent e, long a) {
      Intrinsics.checkNotNullParameter(var2, "e");
   }

   public void i(long a, @NotNull PreElytraEvent e) {
      // $FF: Couldn't be decompiled
   }

   public void p(@NotNull AfterElytraEvent e, long a) {
      long var4 = var2 ^ 107026128700072L;
      Intrinsics.checkNotNullParameter(var1, "e");
      s8.f(var4).method_36456(n);
      s8.f(var4).method_36457(y);
   }

   public void T(@NotNull MoveEvent e, long a) {
      Intrinsics.checkNotNullParameter(var1, "e");
   }

   public void y(long a, @NotNull AfterSendPacket event) {
      Intrinsics.checkNotNullParameter(var3, true.q<invokedynamic>(30936, 3757741798570105770L ^ var1));
   }

   public void D(long a, @NotNull ReceivePacket e) {
      Intrinsics.checkNotNullParameter(var3, "e");
   }

   public void n(int a, @NotNull PlayerUpdateEvent e, char a, int a) {
      // $FF: Couldn't be decompiled
   }

   public void l(long var1) {
   }

   public void y(long var1) {
   }

   private final boolean z(long param1, char param3) {
      // $FF: Couldn't be decompiled
   }

   private final float j(long var1) {
      var1 ^= a;
      long var10001 = var1 ^ 42258101545926L;
      int var3 = (int)((var1 ^ 42258101545926L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      return i4.v.W((char)var3, var4, var5);
   }

   private final float p(char param1, short param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public void B(long a, @NotNull FireWorkVelocityEvent e) {
      // $FF: Couldn't be decompiled
   }

   public void o(@NotNull SetPoseEvent e) {
      Intrinsics.checkNotNullParameter(var1, "e");
      var1.cancel();
      var1.setPose(class_4050.field_18076);
   }

   public void n(@NotNull ReceivePacket e, long a) {
      // $FF: Couldn't be decompiled
   }

   private final void k(long var1) {
      var1 ^= a;
      long var3 = var1 ^ 2315759388717L;
      long var10001 = var1 ^ 60568012715654L;
      int var5 = (int)((var1 ^ 60568012715654L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 50987788367969L;
      int var8 = (int)((var1 ^ 50987788367969L) >>> 56);
      long var9 = var10001 << 8 >>> 8;
      long var11 = var1 ^ 74076435699225L;
      long var13 = var1 ^ 86272165282323L;
      var10001 = var1 ^ 5703308833504L;
      int var15 = (int)((var1 ^ 5703308833504L) >>> 32);
      int var16 = (int)(var10001 << 32 >>> 32);
      var10001 = var1 ^ 127289742624374L;
      long var17 = (var1 ^ 127289742624374L) >>> 16;
      int var19 = (int)(var10001 << 48 >>> 48);
      long var20 = var1 ^ 139293687721823L;
      long var22 = var1 ^ 37081016204363L;
      long var24 = var1 ^ 134199504829575L;
      var10001 = var1 ^ 56045032048216L;
      int var26 = (int)((var1 ^ 56045032048216L) >>> 32);
      int var27 = (int)(var10001 << 32 >>> 48);
      int var28 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 36215264358214L;
      int var29 = (int)((var1 ^ 36215264358214L) >>> 32);
      int var30 = (int)(var10001 << 32 >>> 48);
      int var31 = (int)(var10001 << 48 >>> 48);
      long var32 = var1 ^ 44947490198117L;
      long var34 = var1 ^ 9843777549436L;
      long var36 = var1 ^ 9401009689399L;
      long var38 = var1 ^ 109695982149341L;
      var10001 = var1 ^ 99631727400747L;
      int var40 = (int)((var1 ^ 99631727400747L) >>> 32);
      int var41 = (int)(var10001 << 32 >>> 48);
      int var42 = (int)(var10001 << 48 >>> 48);
      long var43 = var1 ^ 64536778319808L;
      long var45 = var1 ^ 58637109813648L;
      Pair[] var47 = new Pair[true.m<invokedynamic>(24139, 3667113489658794471L ^ var1)];
      var47[0] = TuplesKt.to(0.0F, o4.k.j7(var36));
      var47[1] = TuplesKt.to(5.0F, o4.k.N8(var45));
      var47[2] = TuplesKt.to(10.0F, o4.k.Np(var38));
      var47[3] = TuplesKt.to(15.0F, o4.k.NS((byte)var8, var9));
      var47[4] = TuplesKt.to(20.0F, o4.k.jP((char)var5, var6, (char)var7));
      var47[5] = TuplesKt.to(25.0F, o4.k.jp(var40, var41, var42));
      var47[true.m<invokedynamic>(2242, 3065357787178272612L ^ var1)] = TuplesKt.to(30.0F, o4.k.jo(var32));
      var47[true.m<invokedynamic>(24282, 6298194536873087339L ^ var1)] = TuplesKt.to(35.0F, o4.k.j8(var34));
      var47[true.m<invokedynamic>(15300, 5148883695653762144L ^ var1)] = TuplesKt.to(40.0F, o4.k.jC(var11));
      var47[true.m<invokedynamic>(16737, 1081674101858553546L ^ var1)] = TuplesKt.to(45.0F, o4.k.G(var17, (short)var19));
      var47[true.m<invokedynamic>(7559, 9124547919690994218L ^ var1)] = TuplesKt.to(50.0F, o4.k.NF(var43));
      var47[true.m<invokedynamic>(28956, 2718698841097174697L ^ var1)] = TuplesKt.to(55.0F, o4.k.jQ(var29, (char)var30, (short)var31));
      var47[true.m<invokedynamic>(12714, 4082200539257978368L ^ var1)] = TuplesKt.to(60.0F, o4.k.j6(var24));
      var47[true.m<invokedynamic>(4254, 4386911643225792304L ^ var1)] = TuplesKt.to(65.0F, o4.k.NB(var15, var16));
      var47[true.m<invokedynamic>(25036, 6199814120505798252L ^ var1)] = TuplesKt.to(70.0F, o4.k.jH(var3));
      var47[true.m<invokedynamic>(25599, 7308632262826519621L ^ var1)] = TuplesKt.to(75.0F, o4.k.p(var13));
      var47[true.m<invokedynamic>(4926, 8764294918939679895L ^ var1)] = TuplesKt.to(80.0F, o4.k.Q(var20));
      var47[true.m<invokedynamic>(24923, 6793943354118434552L ^ var1)] = TuplesKt.to(85.0F, o4.k.NY(var26, (short)var27, var28));
      var47[true.m<invokedynamic>(27649, 2924303180244640678L ^ var1)] = TuplesKt.to(90.0F, o4.k.Nq(var22));
      B = MapsKt.hashMapOf(var47);
   }

   private static final void Q() {
      long var0 = a ^ 125330012805286L;
      long var2 = var0 ^ 42029368743539L;
      long var10001 = var0 ^ 104495731033090L;
      int var4 = (int)((var0 ^ 104495731033090L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);

      try {
         if (!_j.O(true.m<invokedynamic>(1565, 4057540190862559921L ^ var0), var2)) {
            s8.H((short)var4, (short)var5, var6).field_1690.field_1903.method_23481(false);
         }

      } catch (NumberFormatException var7) {
         throw var7.A<invokedynamic>(var7, -5249083645946051068L, var0);
      }
   }

   static {
      long var20 = a ^ 70035232268L;
      long var10001 = var20 ^ 51906109638933L;
      int var22 = (int)((var20 ^ 51906109638933L) >>> 48);
      int var23 = (int)(var10001 << 16 >>> 32);
      int var24 = (int)(var10001 << 48 >>> 48);
      d = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[5];
      int var16 = 0;
      String var15 = "OÖ¨\u009fX\u0086¾B¤\u0096·ún+_L\u0007\u001cîäÌ ZÅ\u0017®\u0090¤\u0014|ËD\u0098ð\u001195\u008fó\u001d\u0018\u0017«ÀB\u0099Hj6C>°öw«\u0000lu)LøE9\u0085ò\u0010\u0096\u001e\u000eñÕ$9Ã\u0012ê\u0082¼Ñ4WD";
      int var17 = "OÖ¨\u009fX\u0086¾B¤\u0096·ún+_L\u0007\u001cîäÌ ZÅ\u0017®\u0090¤\u0014|ËD\u0098ð\u001195\u008fó\u001d\u0018\u0017«ÀB\u0099Hj6C>°öw«\u0000lu)LøE9\u0085ò\u0010\u0096\u001e\u000eñÕ$9Ã\u0012ê\u0082¼Ñ4WD".length();
      char var14 = '(';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var26 = var15.substring(var13, var13 + var14);
         byte var28 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var26.getBytes("ISO-8859-1"));
            String var33 = a(var19).intern();
            switch(var28) {
            case 0:
               var18[var16++] = var33;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[5];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[31];
                  int var3 = 0;
                  String var4 = "ð\\\u0097¨W\u0006¡è2`\u0084\u000f\u008aÝ¾¯\u0016\u0092\u0006@\u0015\u0089öÜ\rM°\u000f:\u001ciÇöUö\u0016\u00883O\u0099\u0099Ë½3\u0080*\u0084&\u0003<öCLË±Å¬'Ú\t\u0085¨.«\u0089µÎ$kÐjëe~Â\u0002ù^õr\u007f\u0004yZK5I¦±\u008b\u0093\u000e¸\u0015\u0015W²\u0004måvÌâ;\u0012'¢\u009d;IG\t\u009bÕÊjv|OðÛ¨Ø 1Q\u0091øÚ\u0091gþ]%\u0093ñ\u00adoÈ\u0089\u009d=\f\u0099Ö\u009d=\u008a¤\u009bÛ»>!\u0016gçÊâE\u001e\"UC$\u008e½ýM·\u0082!)-ºíÝãl\u0091\u0003âå\u0095°ñN>w\u001c©\u001c\u0089Ù\tk®C·iæy\u0082¾\u0096\tÂqF±\u0080Ä5 ´IR\u008c°æ¼Ä<\u008e{ÀÕ\u0093)Èè+";
                  int var5 = "ð\\\u0097¨W\u0006¡è2`\u0084\u000f\u008aÝ¾¯\u0016\u0092\u0006@\u0015\u0089öÜ\rM°\u000f:\u001ciÇöUö\u0016\u00883O\u0099\u0099Ë½3\u0080*\u0084&\u0003<öCLË±Å¬'Ú\t\u0085¨.«\u0089µÎ$kÐjëe~Â\u0002ù^õr\u007f\u0004yZK5I¦±\u008b\u0093\u000e¸\u0015\u0015W²\u0004måvÌâ;\u0012'¢\u009d;IG\t\u009bÕÊjv|OðÛ¨Ø 1Q\u0091øÚ\u0091gþ]%\u0093ñ\u00adoÈ\u0089\u009d=\f\u0099Ö\u009d=\u008a¤\u009bÛ»>!\u0016gçÊâE\u001e\"UC$\u008e½ýM·\u0082!)-ºíÝãl\u0091\u0003âå\u0095°ñN>w\u001c©\u001c\u0089Ù\tk®C·iæy\u0082¾\u0096\tÂqF±\u0080Ä5 ´IR\u008c°æ¼Ä<\u008e{ÀÕ\u0093)Èè+".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var32 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var32, var2).getBytes("ISO-8859-1");
                     long[] var29 = var6;
                     var32 = var3++;
                     long var35 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var36 = -1;

                     while(true) {
                        long var8 = var35;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var38 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var36) {
                        case 0:
                           var29[var32] = var38;
                           if (var2 >= var5) {
                              e = var6;
                              f = new Integer[31];
                              F = new e3();
                              q = new n((char)var22, var23, (char)var24);
                              var10001 = 4290424796126325847L ^ var20;
                              D = new n((char)var22, var23, (char)var24);
                              Pair[] var25 = new Pair[true.m<invokedynamic>(11863, var10001)];
                              var25[0] = TuplesKt.to(0.0F, 0.155F);
                              var25[1] = TuplesKt.to(5.0F, 0.16F);
                              var25[2] = TuplesKt.to(10.0F, 0.19F);
                              var25[3] = TuplesKt.to(15.0F, 0.22F);
                              var25[4] = TuplesKt.to(20.0F, 0.22F);
                              var25[5] = TuplesKt.to(25.0F, 0.27F);
                              var25[true.m<invokedynamic>(2242, 3065347032609557202L ^ var20)] = TuplesKt.to(30.0F, 0.28F);
                              var25[true.m<invokedynamic>(1252, 8609772637101426411L ^ var20)] = TuplesKt.to(35.0F, 0.34F);
                              var25[true.m<invokedynamic>(25269, 4237015289076768940L ^ var20)] = TuplesKt.to(40.0F, 0.37F);
                              var25[true.m<invokedynamic>(19154, 4654539730548574424L ^ var20)] = TuplesKt.to(45.0F, 0.37F);
                              var25[true.m<invokedynamic>(572, 1551691805336305711L ^ var20)] = TuplesKt.to(50.0F, 0.34F);
                              var25[true.m<invokedynamic>(17071, 8408631448518312123L ^ var20)] = TuplesKt.to(55.0F, 0.34F);
                              var25[true.m<invokedynamic>(23698, 6459007565286727308L ^ var20)] = TuplesKt.to(60.0F, 0.2F);
                              var25[true.m<invokedynamic>(19611, 174182272538005136L ^ var20)] = TuplesKt.to(65.0F, 0.18F);
                              var25[true.m<invokedynamic>(25036, 6199820958123058138L ^ var20)] = TuplesKt.to(70.0F, 0.16F);
                              var25[true.m<invokedynamic>(20249, 4528967036089322766L ^ var20)] = TuplesKt.to(75.0F, 0.16F);
                              var25[true.m<invokedynamic>(21658, 1711221437948024475L ^ var20)] = TuplesKt.to(80.0F, 0.13F);
                              var25[true.m<invokedynamic>(17878, 5644984926226958290L ^ var20)] = TuplesKt.to(85.0F, 0.13F);
                              var25[true.m<invokedynamic>(16932, 2950649903523282985L ^ var20)] = TuplesKt.to(90.0F, 0.13F);
                              B = MapsKt.hashMapOf(var25);
                              return;
                           }
                           break;
                        default:
                           var29[var32] = var38;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "nZg\u008dé\u0081ä¬r×\u0019öüÐ\u0082Â";
                           var5 = "nZg\u008dé\u0081ä¬r×\u0019öüÐ\u0082Â".length();
                           var2 = 0;
                        }

                        var32 = var2;
                        var2 += 8;
                        var7 = var4.substring(var32, var2).getBytes("ISO-8859-1");
                        var29 = var6;
                        var32 = var3++;
                        var35 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var36 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var33;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "ãÞ¦\t$\u0096ïÁ\fUí8\u0011\u0000l¦Fá§TÂ÷U«(\u0082T\u0097EA\u0099¾ùã\f\u0080\u001a-où´\u008añ-z83\u0006\u0002{\u001fÎI»O\u0097ÚÌØíðÓu*\u000e";
               var17 = "ãÞ¦\t$\u0096ïÁ\fUí8\u0011\u0000l¦Fá§TÂ÷U«(\u0082T\u0097EA\u0099¾ùã\f\u0080\u001a-où´\u008añ-z83\u0006\u0002{\u001fÎI»O\u0097ÚÌØíðÓu*\u000e".length();
               var14 = 24;
               var13 = -1;
            }

            ++var13;
            var26 = var15.substring(var13, var13 + var14);
            var28 = 0;
         }
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4277;
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
            throw new RuntimeException("su/catlean/e3", var10);
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
         throw new RuntimeException("su/catlean/e3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31334;
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
            throw new RuntimeException("su/catlean/e3", var14);
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
         throw new RuntimeException("su/catlean/e3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
