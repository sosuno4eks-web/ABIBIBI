package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2248;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.SendPacket;
import su.catlean.gofra.Flow;

public final class dk implements zh {
   @NotNull
   public static final dk I;
   private static int G;
   private static int v;
   private static int[] e;
   private static final long a = j0.a(6402695362170216997L, 304706642751586112L, MethodHandles.lookup().lookupClass()).a(187381957829568L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long[] f;
   private static final Integer[] g;
   private static final Map h;

   private dk() {
   }

   @Flow
   private final void W(SendPacket param1) {
      // $FF: Couldn't be decompiled
   }

   public final int N(@NotNull class_1792 item, boolean offHand, long a) {
      // $FF: Couldn't be decompiled
   }

   public static int v(dk var0, class_1792 var1, boolean var2, int var3, Object var4, long var5) {
      var5 ^= a;
      long var7 = var5 ^ 38509309388557L;
      int var9 = -5725848461471755833L.A<invokedynamic>(-5725848461471755833L, var5);

      int var10000;
      label20: {
         try {
            var10000 = var3 & 2;
            if (var9 == 0) {
               return var10000;
            }

            if (var10000 == 0) {
               break label20;
            }
         } catch (NoWhenBranchMatchedException var10) {
            throw var10.A<invokedynamic>(var10, -5714008219687506193L, var5);
         }

         var2 = false;
      }

      var10000 = var0.N(var1, var2, var7);
      return var10000;
   }

   public final int P(long a, @NotNull class_1792 item) {
      // $FF: Couldn't be decompiled
   }

   public final int G(long a, @NotNull dc searcher) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final s1 J(long a, @NotNull dc searcher) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final s1 q(int a, short a, char a, @NotNull dc searcher) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final s1 o(long a, @NotNull List items) {
      var1 ^= a;
      long var4 = var1 ^ 101959981432949L;
      Intrinsics.checkNotNullParameter(var3, true.a<invokedynamic>(4834, 6951679274514998757L ^ var1));
      return this.J(var4, dk::b);
   }

   @NotNull
   public final s1 b(@NotNull class_1792[] items, long a) {
      var2 ^= a;
      long var4 = var2 ^ 82304273287101L;
      Intrinsics.checkNotNullParameter(var1, true.a<invokedynamic>(4834, 6951663462383215149L ^ var2));
      return this.J(var4, dk::s);
   }

   @NotNull
   public final s1 e(long a, @NotNull List items) {
      var1 ^= a;
      long var10001 = var1 ^ 22032240997395L;
      int var4 = (int)((var1 ^ 22032240997395L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var3, true.a<invokedynamic>(12576, 2868209243927982154L ^ var1));
      return this.q(var4, (short)var5, (char)var6, dk::a);
   }

   @NotNull
   public final s1 Q(int a, short a, @NotNull class_1792[] items, int a) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var4 << 48 >>> 48) ^ a;
      long var10001 = var5 ^ 135674238166048L;
      int var7 = (int)((var5 ^ 135674238166048L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var3, true.a<invokedynamic>(4834, 6951656286791173046L ^ var5));
      return this.q(var7, (short)var8, (char)var9, dk::W);
   }

   @NotNull
   public final s1 d(long a, @NotNull List blocks) {
      var1 ^= a;
      long var4 = var1 ^ 16137933756349L;
      int var10000 = 3157199684405598452L.A<invokedynamic>(3157199684405598452L, var1);
      Intrinsics.checkNotNullParameter(var3, true.a<invokedynamic>(11849, 5055923083607396998L ^ var1));
      Iterable var7 = (Iterable)var3;
      boolean var8 = false;
      int var6 = var10000;
      Collection var10 = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(var7, true.o<invokedynamic>(12631, 2301768179178065844L ^ var1))));
      boolean var11 = false;
      Iterator var12 = var7.iterator();

      label23:
      while(true) {
         Object var18;
         if (var12.hasNext()) {
            var18 = var12.next();
         } else {
            var18 = var10;
            if (var1 > 0L) {
               return this.o(var4, (List)var18);
            }
         }

         do {
            Object var13 = var18;
            var18 = var10;
            class_2248 var14 = (class_2248)var13;
            if (var6 != 0) {
               return this.o(var4, (List)var18);
            }

            boolean var15 = false;
            var10.add(var14.method_8389());
            if (var6 == 0) {
               continue label23;
            }

            var18 = var10;
         } while(var1 <= 0L);

         return this.o(var4, (List)var18);
      }
   }

   @NotNull
   public final s1 d(@NotNull class_2248[] blocks, char a, long a) {
      long var5 = ((long)var2 << 48 | var3 << 16 >>> 16) ^ a;
      long var7 = var5 ^ 99224733227217L;
      Intrinsics.checkNotNullParameter(var1, true.a<invokedynamic>(11849, 5055972082356641258L ^ var5));
      int var10000 = 2620811023728100624L.A<invokedynamic>(2620811023728100624L, var5);
      boolean var11 = false;
      class_2248[] var12 = var1;
      Collection var13 = (Collection)(new ArrayList(var1.length));
      int var9 = var10000;
      boolean var14 = false;
      int var15 = 0;
      int var16 = var1.length;

      Collection var22;
      while(true) {
         if (var15 < var16) {
            class_2248 var17 = var12[var15];
            var22 = var13;
            if (var9 == 0) {
               break;
            }

            boolean var19 = false;
            var13.add(var17.method_8389());
            ++var15;
            if (var9 != 0) {
               continue;
            }
         }

         var22 = var13;
         if (var2 >= 0) {
         }
         break;
      }

      return this.o(var7, (List)var22);
   }

   @NotNull
   public final s1 r(long a, @NotNull List blocks) {
      var1 ^= a;
      long var4 = var1 ^ 119370857506065L;
      int var10000 = -5828571842201510856L.A<invokedynamic>(-5828571842201510856L, var1);
      Intrinsics.checkNotNullParameter(var3, true.a<invokedynamic>(11849, 5055958986517993034L ^ var1));
      int var6 = var10000;
      Iterable var7 = (Iterable)var3;
      boolean var8 = false;
      Collection var10 = (Collection)(new ArrayList(CollectionsKt.collectionSizeOrDefault(var7, true.o<invokedynamic>(25702, 1554031330139446858L ^ var1))));
      boolean var11 = false;
      Iterator var12 = var7.iterator();

      label23:
      while(true) {
         Object var18;
         if (var12.hasNext()) {
            var18 = var12.next();
         } else {
            var18 = var10;
            if (var1 > 0L) {
               return this.e(var4, (List)var18);
            }
         }

         do {
            Object var13 = var18;
            var18 = var10;
            class_2248 var14 = (class_2248)var13;
            if (var6 != 0) {
               return this.e(var4, (List)var18);
            }

            boolean var15 = false;
            var10.add(var14.method_8389());
            if (var6 == 0) {
               continue label23;
            }

            var18 = var10;
         } while(var1 <= 0L);

         return this.e(var4, (List)var18);
      }
   }

   @NotNull
   public final s1 A(long a, @NotNull class_2248[] blocks) {
      var1 ^= a;
      long var4 = var1 ^ 81687462832363L;
      Intrinsics.checkNotNullParameter(var3, true.a<invokedynamic>(19136, 7270626650149044018L ^ var1));
      int var6 = 2451347278841430858L.A<invokedynamic>(2451347278841430858L, var1);
      boolean var8 = false;
      class_2248[] var9 = var3;
      Collection var10 = (Collection)(new ArrayList(var3.length));
      boolean var11 = false;
      int var12 = 0;
      int var13 = var3.length;

      Collection var10000;
      while(true) {
         if (var12 < var13) {
            class_2248 var14 = var9[var12];
            var10000 = var10;
            if (var6 == 0) {
               break;
            }

            boolean var16 = false;
            var10.add(var14.method_8389());
            ++var12;
            if (var6 != 0) {
               continue;
            }
         }

         var10000 = var10;
         if (var1 >= 0L) {
         }
         break;
      }

      return this.e(var4, (List)var10000);
   }

   public final void f(int var1, int var2, byte var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56) ^ a;
      long var6 = var4 ^ 104054654140016L;
      v = s8.f(var6).method_31548().method_67532();
   }

   public final void q(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final void T(long a, int slot) {
      var1 ^= a;
      long var10001 = var1 ^ 84418191324520L;
      int var4 = (int)((var1 ^ 84418191324520L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 40);
      int var6 = (int)(var10001 << 56 >>> 56);
      var10001 = var1 ^ 102846076228033L;
      int var7 = (int)((var1 ^ 102846076228033L) >>> 56);
      int var8 = (int)(var10001 << 8 >>> 32);
      int var9 = (int)(var10001 << 40 >>> 40);
      this.f(var4, var5, (byte)var6);
      this.W((byte)var7, var3, var8, var9);
   }

   @NotNull
   public final s1 M(@NotNull dc searcher, long a, @NotNull uw mode) {
      // $FF: Couldn't be decompiled
   }

   public final boolean c(@NotNull dc searcher, long a, @NotNull uw mode, byte a, @NotNull Function0 action) {
      // $FF: Couldn't be decompiled
   }

   public final boolean Z(@NotNull class_1792 item, @NotNull uw mode, @NotNull Function0 action, long a) {
      // $FF: Couldn't be decompiled
   }

   public final void X(int slot, int a, byte a, int a, @NotNull uw mode, @NotNull Function0 action) {
      // $FF: Couldn't be decompiled
   }

   public final void N(int slot, char a, int a, int a) {
      // $FF: Couldn't be decompiled
   }

   public final void W(byte a, int slot, int a, int a) {
      // $FF: Couldn't be decompiled
   }

   public final void f(int slot, int a, int a) {
      // $FF: Couldn't be decompiled
   }

   public final int p(long param1) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final s1 L(long param1) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final s1 o(long param1) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final s1 W(long param1) {
      // $FF: Couldn't be decompiled
   }

   public final void G(int a, char a, int slot, int factor, char a) {
      // $FF: Couldn't be decompiled
   }

   public static void I(dk var0, int var1, int var2, int var3, long var4, Object var6) {
      var4 ^= a;
      long var10001 = var4 ^ 1196250985838L;
      int var7 = (int)((var4 ^ 1196250985838L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      int var10 = -8270044627827081698L.A<invokedynamic>(-8270044627827081698L, var4);

      label21: {
         int var10000;
         label20: {
            try {
               var10000 = var3 & 2;
               if (var10 != 0) {
                  break label20;
               }

               if (var10000 == 0) {
                  break label21;
               }
            } catch (NoWhenBranchMatchedException var11) {
               throw var11.A<invokedynamic>(var11, -8222834513494797378L, var4);
            }

            var10000 = 1;
         }

         var2 = var10000;
      }

      var0.G(var7, (char)var8, var1, var2, (char)var9);
   }

   public final void n(int a, short a, int slot, short a) {
      // $FF: Couldn't be decompiled
   }

   public final void x(int from, long a, int to) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean b(List var0, class_1799 var1) {
      long var2 = a ^ 22835988856300L;
      Intrinsics.checkNotNullParameter(var1, true.a<invokedynamic>(907, 3278800665234945120L ^ var2));
      return var0.contains(var1.method_7909());
   }

   private static final boolean s(class_1792[] var0, class_1799 var1) {
      long var2 = a ^ 72520200530205L;
      Intrinsics.checkNotNullParameter(var1, true.a<invokedynamic>(3517, 3262099660286258858L ^ var2));
      return ArraysKt.contains(var0, var1.method_7909());
   }

   private static final boolean a(List var0, class_1799 var1) {
      long var2 = a ^ 58148574130948L;
      Intrinsics.checkNotNullParameter(var1, true.a<invokedynamic>(907, 3278765610082679432L ^ var2));
      return var0.contains(var1.method_7909());
   }

   private static final boolean W(class_1792[] var0, class_1799 var1) {
      long var2 = a ^ 113642360448799L;
      Intrinsics.checkNotNullParameter(var1, true.a<invokedynamic>(907, 3278849548379942547L ^ var2));
      return ArraysKt.contains(var0, var1.method_7909());
   }

   private static final boolean S(class_1799 param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var20 = a ^ 92995278582219L;
      d = new HashMap(13);
      null.A<invokedynamic>((Object)null, 3225555436841398534L, var20);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[21];
      int var16 = 0;
      String var15 = "\u000fzr\u0012(Ìº W\u0087}Í\u0004\u009eôÆ\u0010°ä>Xî\u0088\u008cäïzMè«·Ö\\\u0010¶\u009fÈ\u008a7\u0017~øÁ¼¨\u001fá,p\u008e\u0088ÒÛ\u000e4\u0002C\u0007\u000fýoZ¯çÄ\u007ff¶§|é\u001a\u001aïÞRÞ»Û~ç\u0088\f¿\r\u0090¾y\u0082hãÛÐV\u001bvU\u001e=\u0087Å»ÚrÒðµSoó\u0087\u0015{°Öû\u0092Ro\u001f¨sö+53W\u0082BRÐ¨\u0086¢Ô6±c|_\u0084UÀ\u0085q_\u0098Çh\u0084¥¡¸]Bñ<ñË7ÜIU²jÈ\u001f×\u00852»¯J\u0005LGep\u009d\u0090¼¢\u0012f\u0019É\u001b\u0010\u0087É;¤·{i#\u0092À\u0093ûmw\u009a\u0088\u0010âA¬\u0083_-D\u0086\u0081¯0û\u009a,Y\u001b\u00103À\u001an\u0086\u0089\nõ\u0099¡êUÞ\u0098C¦\u0010\bê}\\¥\u0006\"Ú7h\u0006¾£M]5(SÀò\u0080F\r1áßË\f×@\u0004©\u007f}]m\u0091¥¼*(1\u0005=Î\u0090\b!\u0095ÌÀ\u0016ºV#Ô?(\u0089]ä(\u0004§Y\u0096Dª\u009dQ÷ÀVEY²hªa\u0019Xä5\u009aµ\u0017\u0016µ×3^¬È;9|ù \u0010K-çù\u008a*Îi\u009d!¥ËÃ\u0085\u0000Î\u0010¿Ô\u0005ö}tw|\u0005Ïä4>þÎý\u0010\tdT\u0094\u00adBp×¢¸¹\u0015ý_Pá\u0018FABÕ\u0089\u0088:ÇENPf\u0099LC½\\\u0004\u0097Rû?(\u0005 àä}Ùu^\u009c\u008b\u000eÈè%Ë\u008d¤Wp\u0019\t\u008cólÿ\u008d\b>¾\u008aß\u0017\u0083@ *¢F\u001cs\u001bè¬g7\u0011GuE¨!\u0006\u001fu8F\u008d\u008fÞµØ8\u0082ôç\u0083þp\fZ¿\u0016ÈZÏ\u0004®P\u0015Bè\u0082Qü)HIo\u0095\u00192å\u009a÷¦\u0006m.·ñH[cZ\u0015ì]=Ýv¨\u0019\u0014}çE\u008ajîó(\u001bi#\u0004O§rÙÃL0}QÚ¬\u0081Â¨rB±³[gÁI@º¿Dñ\u0018X\u0096\u009b\u0097²11£/\u001c/ÅÓ À0Hd\u009c\u008e\u0019¼\u0098í\u0011SB\u0018qVÊ@\u0015\u0014\u0002rÕ!\u0096\u0012\u008bÂø!Q8ìË©Ët¼ ·\u0089\u009f}àJ\u0099\u0096ãc\u0092þL%\u0085·\u0081Im§\u0004·\f\u0085þ¶Qê\u0082Û\u008dä";
      int var17 = "\u000fzr\u0012(Ìº W\u0087}Í\u0004\u009eôÆ\u0010°ä>Xî\u0088\u008cäïzMè«·Ö\\\u0010¶\u009fÈ\u008a7\u0017~øÁ¼¨\u001fá,p\u008e\u0088ÒÛ\u000e4\u0002C\u0007\u000fýoZ¯çÄ\u007ff¶§|é\u001a\u001aïÞRÞ»Û~ç\u0088\f¿\r\u0090¾y\u0082hãÛÐV\u001bvU\u001e=\u0087Å»ÚrÒðµSoó\u0087\u0015{°Öû\u0092Ro\u001f¨sö+53W\u0082BRÐ¨\u0086¢Ô6±c|_\u0084UÀ\u0085q_\u0098Çh\u0084¥¡¸]Bñ<ñË7ÜIU²jÈ\u001f×\u00852»¯J\u0005LGep\u009d\u0090¼¢\u0012f\u0019É\u001b\u0010\u0087É;¤·{i#\u0092À\u0093ûmw\u009a\u0088\u0010âA¬\u0083_-D\u0086\u0081¯0û\u009a,Y\u001b\u00103À\u001an\u0086\u0089\nõ\u0099¡êUÞ\u0098C¦\u0010\bê}\\¥\u0006\"Ú7h\u0006¾£M]5(SÀò\u0080F\r1áßË\f×@\u0004©\u007f}]m\u0091¥¼*(1\u0005=Î\u0090\b!\u0095ÌÀ\u0016ºV#Ô?(\u0089]ä(\u0004§Y\u0096Dª\u009dQ÷ÀVEY²hªa\u0019Xä5\u009aµ\u0017\u0016µ×3^¬È;9|ù \u0010K-çù\u008a*Îi\u009d!¥ËÃ\u0085\u0000Î\u0010¿Ô\u0005ö}tw|\u0005Ïä4>þÎý\u0010\tdT\u0094\u00adBp×¢¸¹\u0015ý_Pá\u0018FABÕ\u0089\u0088:ÇENPf\u0099LC½\\\u0004\u0097Rû?(\u0005 àä}Ùu^\u009c\u008b\u000eÈè%Ë\u008d¤Wp\u0019\t\u008cólÿ\u008d\b>¾\u008aß\u0017\u0083@ *¢F\u001cs\u001bè¬g7\u0011GuE¨!\u0006\u001fu8F\u008d\u008fÞµØ8\u0082ôç\u0083þp\fZ¿\u0016ÈZÏ\u0004®P\u0015Bè\u0082Qü)HIo\u0095\u00192å\u009a÷¦\u0006m.·ñH[cZ\u0015ì]=Ýv¨\u0019\u0014}çE\u008ajîó(\u001bi#\u0004O§rÙÃL0}QÚ¬\u0081Â¨rB±³[gÁI@º¿Dñ\u0018X\u0096\u009b\u0097²11£/\u001c/ÅÓ À0Hd\u009c\u008e\u0019¼\u0098í\u0011SB\u0018qVÊ@\u0015\u0014\u0002rÕ!\u0096\u0012\u008bÂø!Q8ìË©Ët¼ ·\u0089\u009f}àJ\u0099\u0096ãc\u0092þL%\u0085·\u0081Im§\u0004·\f\u0085þ¶Qê\u0082Û\u008dä".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var22 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var28;
               if ((var13 += var14) >= var17) {
                  b = var18;
                  c = new String[21];
                  h = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[15];
                  int var3 = 0;
                  String var4 = "#ñiÑ\u0088*º\u000b\u009dnÜï¹ã\u0081\u008d\u0094µB~\u0017\u0089\få\u001f\u0093³ÓLXlÒ-µ\u0017P\u0093ÁAº2\u000e¹Ñ«\n·n·\b®'||Í\u0012¬]D\u008a\u0099\u0005³¾\u0010\u0017\u0012Ê\u009fF\u0019¶¬\u0091î3ùåôÁ¸IF\u0092N\u008eÓmË©áñ\u009c¸JÂÚwA+Ï\u001d{\u0097";
                  int var5 = "#ñiÑ\u0088*º\u000b\u009dnÜï¹ã\u0081\u008d\u0094µB~\u0017\u0089\få\u001f\u0093³ÓLXlÒ-µ\u0017P\u0093ÁAº2\u000e¹Ñ«\n·n·\b®'||Í\u0012¬]D\u008a\u0099\u0005³¾\u0010\u0017\u0012Ê\u009fF\u0019¶¬\u0091î3ùåôÁ¸IF\u0092N\u008eÓmË©áñ\u009c¸JÂÚwA+Ï\u001d{\u0097".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var26 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                     long[] var25 = var6;
                     var26 = var3++;
                     long var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var31 = -1;

                     while(true) {
                        long var8 = var30;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var33 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var31) {
                        case 0:
                           var25[var26] = var33;
                           if (var2 >= var5) {
                              f = var6;
                              g = new Integer[15];
                              I = new dk();
                              G = -1;
                              v = -1;
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u00066ïG*x%Órèl<?\"_\u008c";
                           var5 = "\u00066ïG*x%Órèl<?\"_\u008c".length();
                           var2 = 0;
                        }

                        var26 = var2;
                        var2 += 8;
                        var7 = var4.substring(var26, var2).getBytes("ISO-8859-1");
                        var25 = var6;
                        var26 = var3++;
                        var30 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var31 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var28;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "½t\u0016\u0014E\nðlx\u0015Þ\u001f\u0004¨ Á\u0010aK6q5þA\u0084\u0093§\u008c·Òe\u0080Ä";
               var17 = "½t\u0016\u0014E\nðlx\u0015Þ\u001f\u0004¨ Á\u0010aK6q5þA\u0084\u0093§\u008c·Òe\u0080Ä".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var22 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void F(int[] var0) {
      e = var0;
   }

   public static int[] I() {
      return e;
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22143;
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
            throw new RuntimeException("su/catlean/dk", var10);
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
         throw new RuntimeException("su/catlean/dk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21592;
      if (g[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/dk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
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
         throw new RuntimeException("su/catlean/dk" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
