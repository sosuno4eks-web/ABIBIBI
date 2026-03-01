package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1657;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.api.event.events.player.ClickSlotEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class kz extends k9 {
   @NotNull
   public static final kz t;
   static final KProperty[] K;
   @NotNull
   private static final zr k;
   @NotNull
   private static List J;
   @NotNull
   private static final LinkedList R;
   @NotNull
   private static final AtomicBoolean q;
   private static boolean i;
   private static boolean W;
   private static int S;
   private static boolean U;
   private static boolean T;
   @NotNull
   private static final Map s;
   @NotNull
   private static final Map y;
   private static boolean e;
   private static int o;
   private static final long b = j0.a(3522867602927746670L, 1487739103979617013L, MethodHandles.lookup().lookupClass()).a(18958629299568L);
   private static final String[] c;
   private static final String[] d;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] l;
   private static final Map m;

   private kz(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 4168810669566L;
      super(var3, true.d<invokedynamic>(5658, 5544631151155443570L ^ var1), pa.E(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   @NotNull
   public final cd A(char var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 59173161246980L;
      int var6 = (int)((var4 ^ 59173161246980L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (cd)k.k((short)var6, this, K[0], (short)var7, var8);
   }

   @NotNull
   public final Map w() {
      return s;
   }

   @NotNull
   public final Map C() {
      return y;
   }

   public final boolean x() {
      return e;
   }

   public final void A(boolean <set-?>) {
      e = var1;
   }

   @Flow
   private final void j(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void f(ClickSlotEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void p(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void e(SendPacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void Y(AfterSendPacket param1) {
      // $FF: Couldn't be decompiled
   }

   private final void J(int var1, int var2, int var3, long var4, class_1713 var6, class_1657 var7) {
      var4 ^= b;

      try {
         if (var1 == var7.field_7512.field_7763) {
            var7.field_7512.method_7593(var2, var3, var6, var7);
         }

      } catch (NumberFormatException var8) {
         throw var8.A<invokedynamic>(var8, 3058165867344304097L, var4);
      }
   }

   private final void R(long var1, Map var3) {
      var1 ^= b;
      long var4 = var1 ^ 137132713884535L;
      String[] var10000 = -5164877727139481938L.A<invokedynamic>(-5164877727139481938L, var1);
      int var7 = 0;
      String[] var6 = var10000;

      label21:
      while(true) {
         if (var7 < true.i<invokedynamic>(11518, 1998152436206965404L ^ var1)) {
            var3.put(var7, s8.f(var4).field_7512.method_7611(var7).method_7677().method_7972());
            ++var7;
            if (var6 != null) {
               continue;
            }
         }

         while(var1 <= 0L) {
            if (var6 != null) {
               continue label21;
            }
         }

         return;
      }
   }

   private final void W(short var1, int var2, Map var3, int var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ b;
      long var7 = var5 ^ 51906369421114L;
      String[] var10000 = -279231287078587677L.A<invokedynamic>(-279231287078587677L, var5);
      int var10 = 0;
      String[] var9 = var10000;

      label21:
      while(true) {
         if (var10 < true.i<invokedynamic>(2933, 3726693672204169560L ^ var5)) {
            class_1703 var11 = s8.f(var7).field_7512;
            int var10002 = s8.f(var7).field_7512.method_37421();
            Object var10003 = var3.get(var10);
            Intrinsics.checkNotNull(var10003);
            var11.method_7619(var10, var10002, (class_1799)var10003);
            ++var10;
            if (var9 != null) {
               continue;
            }
         }

         while(var4 <= 0) {
            if (var9 != null) {
               continue label21;
            }
         }

         return;
      }
   }

   static {
      long var20 = b ^ 34061409623533L;
      long var22 = var20 ^ 18540333357662L;
      long var24 = var20 ^ 83492055360367L;
      f = new HashMap(13);
      0.A<invokedynamic>(0, -4872311729600812843L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[11];
      int var16 = 0;
      String var15 = "ÕÂÜqO;\u001aÿvðÒ¾SWÏ\u0015\u000fí\u008cù\u0097\u0095\u0016|\u0094\u0003\tv\\h\u001e\u0007\u0010\u0092 \u000bB+¢ÆùGo£\u00ad\u009f]ÑÅ\u0010=\u0081ë¨Ôe\u0080[¼[\u0085>B\u001fÿÁ\u0088\u0092s\u0010\u008d¯ äö[ÃËs\u0006\u0007Q jñ§në#UKx]TT\u0080·Q§M#\u001dÅÏ\u0016¢\u009c1\u0007ý\b:\u000bºüÞ?\u009a3¶¦\u0007\u0007\u000eäp¡d@÷;Sd\u000bi\"¿\u000bA0ê©}QäñÜ\u009f~\u0012ñÔh}O\ts ÏÎ\fX¬\u0093Âá\u0015\u0004\u0010ä¤2A¼4\u0003ÈN\u0003±\u0084ý\u0011²(¿É¡\u00adÐ]ý³Æ\u0098½\u00819_\u008b\u0018z\u0098 £Ò\u0094[\f\u0091*ð¯\n\u0085\u0005\u009f\u000e\u001a\u008aâ75Z\u001e%èÃ\u00ad+\u000fj\u0001B\u0098ø\u0010óg~¦\u007fh}ø\u000f4Z\u00831±ÉË\u0010\u009fÐ\u0098\u0090¶YFu]èÇ\u0081øe\u001d÷ \u0015ÀËöÑê2\u0099£ \u008cÀV\u001ar\u0011RõDïö\fÖ:;òÃ!ñèµN8\u0005}cK#Asá\u0086)#¤Å\u0010¸ÂuJR\u0018¤ñb\u0081j\u008c,¼®æ\u0093ØE9§)âNú\u008b\u0094Keû\u0012\u001e\u001f[\u008d\u0010ü\u001ckçÇ7";
      int var17 = "ÕÂÜqO;\u001aÿvðÒ¾SWÏ\u0015\u000fí\u008cù\u0097\u0095\u0016|\u0094\u0003\tv\\h\u001e\u0007\u0010\u0092 \u000bB+¢ÆùGo£\u00ad\u009f]ÑÅ\u0010=\u0081ë¨Ôe\u0080[¼[\u0085>B\u001fÿÁ\u0088\u0092s\u0010\u008d¯ äö[ÃËs\u0006\u0007Q jñ§në#UKx]TT\u0080·Q§M#\u001dÅÏ\u0016¢\u009c1\u0007ý\b:\u000bºüÞ?\u009a3¶¦\u0007\u0007\u000eäp¡d@÷;Sd\u000bi\"¿\u000bA0ê©}QäñÜ\u009f~\u0012ñÔh}O\ts ÏÎ\fX¬\u0093Âá\u0015\u0004\u0010ä¤2A¼4\u0003ÈN\u0003±\u0084ý\u0011²(¿É¡\u00adÐ]ý³Æ\u0098½\u00819_\u008b\u0018z\u0098 £Ò\u0094[\f\u0091*ð¯\n\u0085\u0005\u009f\u000e\u001a\u008aâ75Z\u001e%èÃ\u00ad+\u000fj\u0001B\u0098ø\u0010óg~¦\u007fh}ø\u000f4Z\u00831±ÉË\u0010\u009fÐ\u0098\u0090¶YFu]èÇ\u0081øe\u001d÷ \u0015ÀËöÑê2\u0099£ \u008cÀV\u001ar\u0011RõDïö\fÖ:;òÃ!ñèµN8\u0005}cK#Asá\u0086)#¤Å\u0010¸ÂuJR\u0018¤ñb\u0081j\u008c,¼®æ\u0093ØE9§)âNú\u008b\u0094Keû\u0012\u001e\u001f[\u008d\u0010ü\u001ckçÇ7".length();
      char var14 = ' ';
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var27 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var33;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[11];
                  m = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "·\u008ba!R ÏÉÞ\u0082íí_]û$";
                  int var5 = "·\u008ba!R ÏÉÞ\u0082íí_]û$".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var31 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                     long[] var30 = var6;
                     var31 = var3++;
                     long var35 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var36 = -1;

                     while(true) {
                        long var8 = var35;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var38 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var36) {
                        case 0:
                           var30[var31] = var38;
                           if (var2 >= var5) {
                              g = var6;
                              l = new Integer[4];
                              KProperty[] var26 = new KProperty[]{Reflection.property1((PropertyReference1)(new PropertyReference1Impl(kz.class, true.d<invokedynamic>(11845, 8230860292047391919L ^ var20), true.d<invokedynamic>(12622, 5578988777722336168L ^ var20), 0)))};
                              K = var26;
                              t = new kz(var24);
                              k = qi.M((il)t, true.d<invokedynamic>(4308, 5335501902383411768L ^ var20), (Enum)cd.NONE, (pj)null, (Function0)null, true.i<invokedynamic>(31966, 2787042968162584271L ^ var20), (Object)null, var22);
                              J = CollectionsKt.emptyList();
                              R = new LinkedList();
                              q = new AtomicBoolean();
                              s = (Map)(new LinkedHashMap());
                              y = (Map)(new LinkedHashMap());
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var38;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "ó\u0091º\u0093É,6\fBÆK\u0081®\u008a3¨";
                           var5 = "ó\u0091º\u0093É,6\fBÆK\u0081®\u008a3¨".length();
                           var2 = 0;
                        }

                        var31 = var2;
                        var2 += 8;
                        var7 = var4.substring(var31, var2).getBytes("ISO-8859-1");
                        var30 = var6;
                        var31 = var3++;
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

               var15 = "ÚÿÛ±É¶\u0007íâ¬Jk\u0097}ÉR\u0080z¦Ò\u000f¿s¢5\u00adÕrQ-%i\u0010\u0099\\0eP{B÷ç\u0086]s<!7\u0095";
               var17 = "ÚÿÛ±É¶\u0007íâ¬Jk\u0097}ÉR\u0080z¦Ò\u000f¿s¢5\u00adÕrQ-%i\u0010\u0099\\0eP{B÷ç\u0086]s<!7\u0095".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var27 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void g(int var0) {
      o = var0;
   }

   public static int I() {
      return o;
   }

   public static int d() {
      int var0 = I();

      try {
         return var0 == 0 ? 123 : 0;
      } catch (NumberFormatException var1) {
         throw a(var1);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 24547;
      if (d[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])f.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               f.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/kz", var10);
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
         throw new RuntimeException("su/catlean/kz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 1823;
      if (l[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/kz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
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
         throw new RuntimeException("su/catlean/kz" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
