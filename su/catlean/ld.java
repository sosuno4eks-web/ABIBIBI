package su.catlean;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.time.ZonedDateTime;
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
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.ClearColorEvent;
import su.catlean.api.event.events.world.ApplyFogEvent;
import su.catlean.gofra.Flow;

public final class ld extends k9 {
   @NotNull
   public static final ld Q;
   // $FF: synthetic field
   static final KProperty[] A;
   @NotNull
   private static final zo N;
   @NotNull
   private static final z0 O;
   @NotNull
   private static final z0 v;
   @NotNull
   private static final zv P;
   @NotNull
   private static final zo X;
   @NotNull
   private static final zo T;
   @NotNull
   private static final z0 n;
   private static long t;
   private static final long b = j0.a(-3952543749605911358L, 6599490302225663691L, MethodHandles.lookup().lookupClass()).a(106816104969518L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map i;

   private ld(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 109969247930427L;
      super(var3, true.p<invokedynamic>(1824, 3030553520852170365L ^ var1), pa.g(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean R(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 134119218633192L;
      int var3 = (int)((var1 ^ 134119218633192L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)N.k((short)var3, this, A[0], (short)var4, var5);
   }

   private final int U(long var1, short var3) {
      long var4 = (var1 << 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 84101397380658L;
      int var6 = (int)((var4 ^ 84101397380658L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return ((Number)O.k((short)var6, this, A[1], (short)var7, var8)).intValue();
   }

   private final int x(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 81534151185870L;
      int var3 = (int)((var1 ^ 81534151185870L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)v.k((short)var3, this, A[2], (short)var4, var5)).intValue();
   }

   private final Color A(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 27505476160496L;
      int var3 = (int)((var1 ^ 27505476160496L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Color)P.k((short)var3, this, A[3], (short)var4, var5);
   }

   private final boolean y(short var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;
      long var10001 = var4 ^ 82671577967170L;
      int var6 = (int)((var4 ^ 82671577967170L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)X.k((short)var6, this, A[4], (short)var7, var8);
   }

   private final boolean b(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 81107992022078L;
      int var3 = (int)((var1 ^ 81107992022078L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)T.k((short)var3, this, A[5], (short)var4, var5);
   }

   private final int w(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 82029527275388L;
      int var3 = (int)((var1 ^ 82029527275388L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)n.k((short)var3, this, A[true.w<invokedynamic>(3052, 6235265273801747593L ^ var1)], (short)var4, var5)).intValue();
   }

   private final void x(int var1, long var2) {
      var2 ^= b;
      long var10001 = var2 ^ 88185074811284L;
      int var4 = (int)((var2 ^ 88185074811284L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      n.P(this, var4, A[true.w<invokedynamic>(3052, 6235247416491838075L ^ var2)], (short)var5, var1, (short)var6);
   }

   public void n(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(long param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void I(ReceivePacket param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   public final void z(@NotNull PlayerUpdateEvent e) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void X(ApplyFogEvent param1) {
      // $FF: Couldn't be decompiled
   }

   @Flow
   private final void F(ClearColorEvent param1) {
      // $FF: Couldn't be decompiled
   }

   public final int d(long var1) {
      var1 ^= b;
      double var4 = (double)ZonedDateTime.now().toLocalTime().toSecondOfDay();
      boolean var10000 = 1883251377206787988L.A<invokedynamic>(1883251377206787988L, var1);
      double var6 = var4 / 86400.0D * 24000.0D;
      boolean var3 = var10000;

      try {
         int var9 = (int)((var6 - (double)true.w<invokedynamic>(2486, 6751973202549690449L ^ var1) + (double)true.w<invokedynamic>(2646, 4475383190224425909L ^ var1)) % (double)true.w<invokedynamic>(13217, 3826936499978136139L ^ var1));
         if (!var3) {
            (new int[2]).A<invokedynamic>(new int[2], 1874811317704513983L, var1);
         }

         return var9;
      } catch (NumberFormatException var8) {
         throw var8.A<invokedynamic>(var8, 1887528826466195765L, var1);
      }
   }

   private static final boolean H() {
      long var0 = b ^ 136930165767219L;
      long var2 = var0 ^ 61034517174022L;
      return Q.R(var2);
   }

   private static final boolean c() {
      long var0 = b ^ 23241945615743L;
      long var2 = var0 ^ 103527279830602L;
      return Q.R(var2);
   }

   private static final boolean t() {
      long var0 = b ^ 80531069147774L;
      long var2 = var0 ^ 2427270050123L;
      return Q.R(var2);
   }

   private static final boolean V() {
      long var0 = b ^ 94971729078515L;
      long var10001 = var0 ^ 52364292894828L;
      int var2 = (int)((var0 ^ 52364292894828L) >>> 48);
      int var3 = (int)(var10001 << 16 >>> 32);
      int var4 = (int)(var10001 << 48 >>> 48);
      return Q.y((short)var2, var3, (short)var4);
   }

   private static final boolean W() {
      long var0 = b ^ 113809843964562L;
      long var10001 = var0 ^ 33269830455821L;
      int var2 = (int)((var0 ^ 33269830455821L) >>> 48);
      int var3 = (int)(var10001 << 16 >>> 32);
      int var4 = (int)(var10001 << 48 >>> 48);
      return Q.y((short)var2, var3, (short)var4);
   }

   static {
      long var20 = b ^ 33983697987148L;
      long var22 = var20 ^ 56082764445194L;
      long var24 = var20 ^ 48601577665803L;
      long var26 = var20 ^ 22510669347020L;
      long var28 = var20 ^ 37608838448622L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[22];
      int var16 = 0;
      String var15 = "Î9ÄÉjÜ@\u0087¢:\u0013V¾\u0000óZ \"Ù\b\u0017\u0015\u0097K\"(_@\b\u001d\u009dzbÔl\u0091ý£\u009ey\u0092C\u0014%Äkðÿ\t\u0018a\u009b\u0094ï\u001d\u008eè\u008d`o`\b9\u0090ò¼jFÇºB]f\u0003\u0018¡:¥(÷¾à#®x%d/YñA\u0013\u0015B¬]íæF\u0018Èú\u0011\u007f!\u00adE!ó\t\u001d^\u0096\\¿\u0011Peï¼dë×©\u0018§_^\u0091\u0089;gå?\u0012Ò¾\u007fÝ\u0088¿¿¥T\u0004\u0007J\u0094\r\u0010ÁÆÀÄ\u00adÞý\u009a\u009b!\u008b\u0017k=\f\u0004\u0018cÁ\u0092f\u0090ø¹N×¿YIü²ØÄcqíS¯\u0095AÀ\u0018¤a\n\tÙ&§å0~O³Áê\u0093mx Èâ?\u001bªs Ç¦éßg\u001aç÷^ìa\u0082`ä¶\u0017\b'½ÊåQÔ*@\u0001@4\u001aë:ü XÊú*óe\u0085Åc/\u0014Øî\u0018¿\u009b¿\u0001Ì/Î¯\täJ\u0006ÀM\u0092\u0002n¥\u0018`m\r'%¯\u00adûá\u008dcy\u001aááq\u0087Î@%° `° \u009b6çPü`©\u0010xDU\u000f{C\u0001\nãLÎ\u001fµ\u008e\u0090È\u009a\u0014¹:\u009d´^\u00908g\rQË8¡\u001b©\u0090\u0085Oz{¸#tã\n(Ãd.\u0019êí{S\u001d¶µ\u0002ûº8\u009c\f\rum#pÛ\u000f¡\u0083dJÉ·¸|Ð\fÛ·v\u0018×\u008c=\u0005¸?;#Ü¼\u008cÐë\u0019Q1Æ\u0091\u0088¿¦þõÞ\u0018ÒA[\u0007µs§ªñ¶E \u0018Êô\u0006\f°&CHl\u0080®\u0018a¹\u001cß\u008av\r©Íba\u0002Ñû\u0006\\\u0011â\n ß\u0097\u0019¶ \u0099ùÕ\u001dlIBD:\u009a\u009fçß\u009e#\u009a±SÏ£\u0018+'qxoÅ\u0083\t\u0005B¯ J\u008a\u0099\u0088\u001cÛ\u0007 \u0097\u0083¹Gª\u0001#\u008a\u0097\u009duËjÒ\u0081:¨À\tíÊ:âA\u0018ÚÐ\fÀt\fd4\u0089t®uá\u009fÉ\u0001\u0082Ðq¼Ï\u0001E\u0088";
      int var17 = "Î9ÄÉjÜ@\u0087¢:\u0013V¾\u0000óZ \"Ù\b\u0017\u0015\u0097K\"(_@\b\u001d\u009dzbÔl\u0091ý£\u009ey\u0092C\u0014%Äkðÿ\t\u0018a\u009b\u0094ï\u001d\u008eè\u008d`o`\b9\u0090ò¼jFÇºB]f\u0003\u0018¡:¥(÷¾à#®x%d/YñA\u0013\u0015B¬]íæF\u0018Èú\u0011\u007f!\u00adE!ó\t\u001d^\u0096\\¿\u0011Peï¼dë×©\u0018§_^\u0091\u0089;gå?\u0012Ò¾\u007fÝ\u0088¿¿¥T\u0004\u0007J\u0094\r\u0010ÁÆÀÄ\u00adÞý\u009a\u009b!\u008b\u0017k=\f\u0004\u0018cÁ\u0092f\u0090ø¹N×¿YIü²ØÄcqíS¯\u0095AÀ\u0018¤a\n\tÙ&§å0~O³Áê\u0093mx Èâ?\u001bªs Ç¦éßg\u001aç÷^ìa\u0082`ä¶\u0017\b'½ÊåQÔ*@\u0001@4\u001aë:ü XÊú*óe\u0085Åc/\u0014Øî\u0018¿\u009b¿\u0001Ì/Î¯\täJ\u0006ÀM\u0092\u0002n¥\u0018`m\r'%¯\u00adûá\u008dcy\u001aááq\u0087Î@%° `° \u009b6çPü`©\u0010xDU\u000f{C\u0001\nãLÎ\u001fµ\u008e\u0090È\u009a\u0014¹:\u009d´^\u00908g\rQË8¡\u001b©\u0090\u0085Oz{¸#tã\n(Ãd.\u0019êí{S\u001d¶µ\u0002ûº8\u009c\f\rum#pÛ\u000f¡\u0083dJÉ·¸|Ð\fÛ·v\u0018×\u008c=\u0005¸?;#Ü¼\u008cÐë\u0019Q1Æ\u0091\u0088¿¦þõÞ\u0018ÒA[\u0007µs§ªñ¶E \u0018Êô\u0006\f°&CHl\u0080®\u0018a¹\u001cß\u008av\r©Íba\u0002Ñû\u0006\\\u0011â\n ß\u0097\u0019¶ \u0099ùÕ\u001dlIBD:\u009a\u009fçß\u009e#\u009a±SÏ£\u0018+'qxoÅ\u0083\t\u0005B¯ J\u008a\u0099\u0088\u001cÛ\u0007 \u0097\u0083¹Gª\u0001#\u008a\u0097\u009duËjÒ\u0081:¨À\tíÊ:âA\u0018ÚÐ\fÀt\fd4\u0089t®uá\u009fÉ\u0001\u0082Ðq¼Ï\u0001E\u0088".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var31 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var31.getBytes("ISO-8859-1"));
            String var37 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var37;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[22];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[17];
                  int var3 = 0;
                  String var4 = "n\u0006è]Ö\u0001¶ÀGp\u0002»Ô\u0018ü8£@\u0004\u0017\u0017Ý<`\u0091ùË²\u0005{J\u0018K-¤~\u0011\u0087@\u0006<HÚdÑÀîl\u0000\u0095\\^\u0017bÆ¸\u0088ì³¬\u0086Ø¢ðlÃt?Þê-\u0080¯\u0000¬Ç\bo\u001bÙÉJ\u009ca\nÑwU\u0081,\\cr\u009c\u0012\nx\t 7¦¦Ë¿\u0001\u001a-¡=.\u008c¸\u001e\u0084y\u0001ºýuÞ";
                  int var5 = "n\u0006è]Ö\u0001¶ÀGp\u0002»Ô\u0018ü8£@\u0004\u0017\u0017Ý<`\u0091ùË²\u0005{J\u0018K-¤~\u0011\u0087@\u0006<HÚdÑÀîl\u0000\u0095\\^\u0017bÆ¸\u0088ì³¬\u0086Ø¢ðlÃt?Þê-\u0080¯\u0000¬Ç\bo\u001bÙÉJ\u009ca\nÑwU\u0081,\\cr\u009c\u0012\nx\t 7¦¦Ë¿\u0001\u001a-¡=.\u008c¸\u001e\u0084y\u0001ºýuÞ".length();
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
                              f = var6;
                              g = new Integer[17];
                              KProperty[] var30 = new KProperty[true.w<invokedynamic>(11694, 917825129502897945L ^ var20)];
                              var30[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ld.class, true.p<invokedynamic>(26311, 7607232739333282996L ^ var20), true.p<invokedynamic>(6556, 511249231718212601L ^ var20), 0)));
                              var30[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ld.class, true.p<invokedynamic>(15188, 200498723147366704L ^ var20), true.p<invokedynamic>(608, 7730964027092039695L ^ var20), 0)));
                              var30[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ld.class, true.p<invokedynamic>(30956, 195884289533805195L ^ var20), true.p<invokedynamic>(4147, 1927075348649044548L ^ var20), 0)));
                              var30[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ld.class, true.p<invokedynamic>(11580, 2590597341311981404L ^ var20), true.p<invokedynamic>(31939, 8781985897703245481L ^ var20), 0)));
                              var30[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ld.class, true.p<invokedynamic>(17759, 1529611768087166763L ^ var20), true.p<invokedynamic>(20462, 7581555976337274243L ^ var20), 0)));
                              var30[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(ld.class, true.p<invokedynamic>(884, 4654860770119186716L ^ var20), true.p<invokedynamic>(16796, 2553646145444101106L ^ var20), 0)));
                              var30[true.w<invokedynamic>(17713, 2468035858760376222L ^ var20)] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(ld.class, true.p<invokedynamic>(18348, 6471202642852462030L ^ var20), true.p<invokedynamic>(22923, 1984011098588292094L ^ var20), 0)));
                              A = var30;
                              Q = new ld(var24);
                              N = qi.R((il)Q, true.p<invokedynamic>(9958, 2722636237736467597L ^ var20), true, (pj)null, (Function0)null, true.w<invokedynamic>(10636, 2570541198979527463L ^ var20), var26, (Object)null);
                              O = qi.o((il)Q, true.p<invokedynamic>(15100, 5322393258541957264L ^ var20), 0, new IntRange(0, true.w<invokedynamic>(26044, 2951817428655128350L ^ var20)), var22, (pj)null, ld::H, true.w<invokedynamic>(31518, 5790155749604008370L ^ var20), (Object)null);
                              v = qi.o((il)Q, true.p<invokedynamic>(14978, 2074520492772704496L ^ var20), true.w<invokedynamic>(19373, 1385974806508704000L ^ var20), new IntRange(true.w<invokedynamic>(24809, 1252389104783604303L ^ var20), true.w<invokedynamic>(26333, 1741331948143590519L ^ var20)), var22, (pj)null, ld::c, true.w<invokedynamic>(19419, 8878919460594553210L ^ var20), (Object)null);
                              P = qi.F((il)Q, true.p<invokedynamic>(28439, 6153459877190931838L ^ var20), new Color(true.w<invokedynamic>(18042, 1775955329423023327L ^ var20)), (pj)null, ld::t, 4, var28, (Object)null);
                              X = qi.R((il)Q, true.p<invokedynamic>(6012, 8476208419281038618L ^ var20), false, (pj)null, (Function0)null, true.w<invokedynamic>(28628, 2606610464826209648L ^ var20), var26, (Object)null);
                              T = qi.R((il)Q, true.p<invokedynamic>(25156, 586994587890456615L ^ var20), false, (pj)null, ld::V, 4, var26, (Object)null);
                              n = qi.o((il)Q, true.p<invokedynamic>(27700, 7365779018516436565L ^ var20), true.w<invokedynamic>(25298, 7849979726039529586L ^ var20), new IntRange(0, true.w<invokedynamic>(25006, 5521356490951473927L ^ var20)), var22, (pj)null, ld::W, true.w<invokedynamic>(19419, 8878919460594553210L ^ var20), (Object)null);
                              return;
                           }
                           break;
                        default:
                           var34[var35] = var42;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u001b\u009cS\u001cê\nóm\u0015i®5\u000f\u0007\u0003\"";
                           var5 = "\u001b\u009cS\u001cê\nóm\u0015i®5\u000f\u0007\u0003\"".length();
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

               var15 = "»\u0085]¾ºÎ¿:\u0095a\u007fÑ\u001b\u0000Ë;\u0011©ê¯\u0097Á°ª\u0015V\u0092§\u0083T# \u0010\u009ei7#¾·'t sTî×\u0087ó\u0083";
               var17 = "»\u0085]¾ºÎ¿:\u0095a\u007fÑ\u001b\u0000Ë;\u0011©ê¯\u0097Á°ª\u0015V\u0092§\u0083T# \u0010\u009ei7#¾·'t sTî×\u0087ó\u0083".length();
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 25099;
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
            throw new RuntimeException("su/catlean/ld", var10);
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
         throw new RuntimeException("su/catlean/ld" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 17099;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/ld", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/ld" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
