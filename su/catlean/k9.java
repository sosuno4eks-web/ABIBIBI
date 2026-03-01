package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import su.catlean.gofra.Gofra;
import su.catlean.interfaces.IEntity;

public abstract class k9 implements il, da {
   // $FF: synthetic field
   static final KProperty[] h;
   @NotNull
   private final String H;
   @NotNull
   private final p5 D;
   @NotNull
   private final List F;
   @NotNull
   private final List Z;
   @NotNull
   private final List a;
   @NotNull
   private final String E;
   @NotNull
   private final zo j;
   @NotNull
   private final z7 p;
   private static int[] G;
   private static final long bb = j0.a(5728339455775791772L, 5216166332722871906L, MethodHandles.lookup().lookupClass()).a(25018447325021L);
   private static final String[] cb;
   private static final String[] db;
   private static final Map eb;
   private static final long[] kb;
   private static final Integer[] lb;
   private static final Map mb;

   public k9(@NotNull String id, long a, @NotNull p5 category, @NotNull List aliases) {
      var2 ^= bb;
      long var10001 = var2 ^ 100037915094802L;
      int var6 = (int)((var2 ^ 100037915094802L) >>> 32);
      int var7 = (int)(var10001 << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      var10001 = var2 ^ 49238199063451L;
      int var9 = (int)((var2 ^ 49238199063451L) >>> 32);
      int var10 = (int)(var10001 << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var2 ^ 37648315753871L;
      Intrinsics.checkNotNullParameter(var1, true.f<invokedynamic>(28759, 5908415883258998904L ^ var2));
      Intrinsics.checkNotNullParameter(var4, true.f<invokedynamic>(20552, 529597452666179686L ^ var2));
      Intrinsics.checkNotNullParameter(var5, true.f<invokedynamic>(12906, 4246261116146807377L ^ var2));
      super();
      this.H = var1;
      this.D = var4;
      this.F = var5;
      this.Z = (List)(new ArrayList());
      this.a = (List)(new ArrayList());
      StringBuilder var21 = new StringBuilder();
      StringBuilder var22 = var21;
      boolean var23 = false;
      CharSequence var10000 = (CharSequence)this.H;
      String[] var24 = new String[]{"-"};
      Iterable var44 = (Iterable)StringsKt.split$default(var10000, var24, false, 0, true.y<invokedynamic>(253, 4894065710104095235L ^ var2), (Object)null);
      boolean var25 = false;
      Iterator var26 = var44.iterator();

      String var10002;
      while(true) {
         if (var26.hasNext()) {
            Object var27 = var26.next();
            String var28 = (String)var27;
            boolean var29 = false;
            if (var2 <= 0L) {
               break;
            }

            StringBuilder var38 = var22;
            String var30 = var28;

            int var40;
            label35: {
               try {
                  var40 = ((CharSequence)var30).length();
                  if (var2 < 0L) {
                     break label35;
                  }

                  if (var40 > 0) {
                     var40 = 1;
                     break label35;
                  }
               } catch (NumberFormatException var37) {
                  throw var37.A<invokedynamic>(var37, 348449869461809126L, var2);
               }

               var40 = 0;
            }

            String var42;
            if (var40 != 0) {
               StringBuilder var41 = new StringBuilder();
               char var31 = var28.charAt(0);
               StringBuilder var32 = var41;
               boolean var34 = false;
               String var39 = String.valueOf(var31);
               Intrinsics.checkNotNull(var39, true.f<invokedynamic>(11521, 810346329739160887L ^ var2));
               var39 = var39.toUpperCase(Locale.ROOT);
               Intrinsics.checkNotNullExpressionValue(var39, true.f<invokedynamic>(12590, 5774429436774805790L ^ var2));
               CharSequence var35 = (CharSequence)var39;
               var38 = var22;
               var41 = var32.append(var35);
               byte var45 = 1;
               var10002 = var28.substring(var45);
               Intrinsics.checkNotNullExpressionValue(var10002, true.f<invokedynamic>(14978, 2467196357934545591L ^ var2));
               var42 = var41.append(var10002).toString();
            } else {
               var42 = var28;
            }

            var38.append(var42);
            var22.append((char)true.y<invokedynamic>(32219, 5242351984941848353L ^ var2));
            StringsKt.trim((CharSequence)var22);
            if (var2 > 0L) {
               continue;
            }
         }

         this.E = var21.toString();
         this.j = qi.R((il)this, true.f<invokedynamic>(6976, 8519048348770622328L ^ var2), false, (pj)null, (Function0)null, true.y<invokedynamic>(27657, 242009666624046832L ^ var2), var12, (Object)null);
         break;
      }

      il var43 = (il)this;
      var10002 = 12650.f<invokedynamic>(12650, 3305721123740905814L ^ var2);
      n_ var10003 = new n_(0, var9, (char)var10, false, (char)var11, false, true.y<invokedynamic>(20269, 8104557663459927510L ^ var2), (DefaultConstructorMarker)null);
      int var10006 = 15828.y<invokedynamic>(15828, 3114811986386261800L ^ var2);
      Object var14 = null;
      int var15 = var10006;
      Object var16 = null;
      Object var17 = null;
      n_ var18 = var10003;
      String var19 = var10002;
      il var20 = var43;
      this.p = qi.b(var6, var20, var19, (char)var7, var18, (pj)var17, (Function0)var16, var15, var14, (short)var8);
   }

   // $FF: synthetic method
   public k9(long var1, String var3, p5 var4, List var5, int var6, DefaultConstructorMarker var7) {
      var1 ^= bb;
      long var8 = var1 ^ 64882877931091L;
      if ((var6 & 4) != 0) {
         var5 = CollectionsKt.emptyList();
      }

      this(var3, var8, var4, var5);
   }

   @NotNull
   public final String D() {
      return this.H;
   }

   @NotNull
   public final p5 X() {
      return this.D;
   }

   @NotNull
   public final List z() {
      return this.F;
   }

   @NotNull
   public List B() {
      return this.Z;
   }

   @NotNull
   public List F() {
      return this.a;
   }

   @NotNull
   public final String g() {
      return this.E;
   }

   public boolean Z(long var1) {
      var1 ^= bb;
      long var10001 = var1 ^ 131331489999695L;
      int var3 = (int)((var1 ^ 131331489999695L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)this.j.k((short)var3, this, h[0], (short)var4, var5);
   }

   public void L(long a, boolean <set-?>) {
      var1 ^= bb;
      long var10001 = var1 ^ 86500891331640L;
      int var4 = (int)((var1 ^ 86500891331640L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      this.j.P(this, var4, h[0], (short)var5, var3, (short)var6);
   }

   @NotNull
   public n_ E(byte var1, int var2, int var3) {
      long var4 = ((long)var1 << 56 | (long)var2 << 32 >>> 8 | (long)var3 << 40 >>> 40) ^ bb;
      long var10001 = var4 ^ 6369416685234L;
      int var6 = (int)((var4 ^ 6369416685234L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (n_)this.p.k((short)var6, this, h[1], (short)var7, var8);
   }

   public void r(int a, char a, char a, @NotNull n_ <set-?>) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ bb;
      long var10001 = var5 ^ 21516940220645L;
      int var7 = (int)((var5 ^ 21516940220645L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var4, true.f<invokedynamic>(13622, 8426106155312130561L ^ var5));
      this.p.P(this, var7, h[1], (short)var8, var4, (short)var9);
   }

   public final boolean O(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void o(short param1, char param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public void N(long var1) {
      long var10001 = var1 ^ 123728193342631L;
      int var3 = (int)((var1 ^ 123728193342631L) >>> 32);
      int var4 = (int)(var10001 << 32 >>> 40);
      int var5 = (int)(var10001 << 56 >>> 56);
      long var6 = var1 ^ 26993087129092L;
      long var8 = var1 ^ 33526581128740L;
      var10001 = var1 ^ 3996914850347L;
      int var10 = (int)((var1 ^ 3996914850347L) >>> 48);
      int var11 = (int)(var10001 << 16 >>> 48);
      int var12 = (int)(var10001 << 32 >>> 32);
      this.L(var6, true);
      Gofra.INSTANCE.unplug(this);
      Gofra.INSTANCE.plug(this);
      this.n(var8);
      _x.m(_x.e, var3, this.E, var4, ha.P(this, (short)var10, (short)var11, var12, true.f<invokedynamic>(27362, 2200369581026337344L ^ var1), new Object[0], true), 1, v6.ENABLED, (class_1799)null, true.y<invokedynamic>(2494, 8407805826344807376L ^ var1), (Object)null, (byte)var5);
   }

   public final void K(int a, char a, short a, @NotNull String message) {
      long var5 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ bb;
      long var10001 = var5 ^ 125274466647775L;
      int var7 = (int)((var5 ^ 125274466647775L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 40);
      int var9 = (int)(var10001 << 56 >>> 56);
      var10001 = var5 ^ 64124720021375L;
      int var10 = (int)((var5 ^ 64124720021375L) >>> 32);
      int var11 = (int)(var10001 << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var4, true.f<invokedynamic>(2237, 3729262892529443903L ^ var5));
      this.l(var7, var8, (byte)var9);
      ha.F(this, var10, var11, var4, false, 2, (Object)null, var12);
   }

   public void l(int var1, int var2, byte var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3 << 56 >>> 56;
      long var6 = var4 ^ 40633205386748L;
      long var10001 = var4 ^ 27995489588821L;
      int var8 = (int)((var4 ^ 27995489588821L) >>> 32);
      int var9 = (int)(var10001 << 32 >>> 40);
      int var10 = (int)(var10001 << 56 >>> 56);
      long var11 = var4 ^ 124783084420342L;
      var10001 = var4 ^ 116905126232281L;
      int var13 = (int)((var4 ^ 116905126232281L) >>> 48);
      int var14 = (int)(var10001 << 16 >>> 48);
      int var15 = (int)(var10001 << 32 >>> 32);
      this.L(var11, false);
      Gofra.INSTANCE.unplug(this);
      this.a(var6);
      _x.m(_x.e, var8, this.E, var9, ha.P(this, (short)var13, (short)var14, var15, true.f<invokedynamic>(31721, 5320793711786977726L ^ var4), new Object[0], true), 1, v6.DISABLED, (class_1799)null, true.y<invokedynamic>(20421, 4979696654935373662L ^ var4), (Object)null, (byte)var10);
   }

   public void n(long var1) {
   }

   public void a(long var1) {
   }

   @NotNull
   public final class_243 W(long a, @NotNull class_1297 $this$pos) {
      var1 ^= bb;
      Intrinsics.checkNotNullParameter(var3, true.f<invokedynamic>(22380, 7015192959642679841L ^ var1));
      class_243 var10000 = ((IEntity)var3).catLean$getPosition();
      Intrinsics.checkNotNullExpressionValue(var10000, true.f<invokedynamic>(21947, 4900728466602735867L ^ var1));
      return var10000;
   }

   static {
      long var20 = bb ^ 29249560540116L;
      int[] var10000 = new int[4];
      eb = new HashMap(13);
      var10000.A<invokedynamic>(var10000, -2900936646552644602L, var20);
      Cipher var11;
      Cipher var23 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var23.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[18];
      int var16 = 0;
      String var15 = "\u0086\u00adWJì%\u0082ôý\u0088¯X\u0092Z¨î\u0018ù\u0097Åaª«e8ª$\u0084õä¶e¹§¨RÄÙ8ªA\u0010K(Î1Æ\u0001.\u0000&i\u009c\u001a\u001c)aG\u0010vÃ\u0082ÚÆ\u007fÕ%\u0083}kÌ7ä\u0096:\u0010\u0013\u0012YGHÓ¡\u008f»Õ!f¾\u0096èß\u0010ZV}\u009ay¸çþ\u00811\u000bùÉVC\u00168\u001deÙ06#\u0088±mïR\u0085`R\\q\u0017×s\u0091n»\u0000R#rÁLÑ²#\u0010e¨ê`ëL©Ø\u0019)Ê3\u0096øÃªæ\f¿ùò\tá]\u0010þö\u00119\u0001B\u00ad\u0084¶\u0080\u0092\u0000\u008a'<Ð\u0018Á\u008d\u0091º}oÕóC\u0092©Ìì°G½©\u0092\u0003þ^3å_X§\u0016Hæ×óå\\É\u009aeP*¤\u009b\u0017cÊ0qÌ\u009fþ¶Â#M*Ë«¥\u0016;\r\u009cBP!'\u008eÃ\u001dòm2\u001d²9gz_ëÐÌ¶8í©¥°AÃäÓ\u0018}\u0087Ò\nÐ\u000b\fq+û\u0085.\u009bl¨\u0003R\"ï^\u009d/p d\u0017\u001c_üw±ã_&\u0085eý\u008e\u0098ß÷\u0000ó\u0084þ\u0012\u0099\u0003íVXUf\u0087\u001b\u0084\u0010\u008dOøü^\u0016ª\u0080\u008c I\nÓ°¶a\u0010|ð_Q\u0090\u001bÚ'$\u0007³ëV2.\u00980\u00013GÀÚ¹àÚZqô7$¥\u009a\u00895Í6ÒÀdÉ|\u009dH`¹V²m\u008e\u0000Ø\r;ºÂ\u009b\u00953ºG\u0086\u0089zõ\u0005\u0010\u008d!AJQw#\f¤AËLÜ¶øÝ(*\u0006\u0001É*\u0002¡\u008e\u0091Rn\u0088©!AÃÉåÄÕy\ræ(ø*\u0095\u0013«À@\u00adª\u001f\u007fù\u0002«âÄ";
      int var17 = "\u0086\u00adWJì%\u0082ôý\u0088¯X\u0092Z¨î\u0018ù\u0097Åaª«e8ª$\u0084õä¶e¹§¨RÄÙ8ªA\u0010K(Î1Æ\u0001.\u0000&i\u009c\u001a\u001c)aG\u0010vÃ\u0082ÚÆ\u007fÕ%\u0083}kÌ7ä\u0096:\u0010\u0013\u0012YGHÓ¡\u008f»Õ!f¾\u0096èß\u0010ZV}\u009ay¸çþ\u00811\u000bùÉVC\u00168\u001deÙ06#\u0088±mïR\u0085`R\\q\u0017×s\u0091n»\u0000R#rÁLÑ²#\u0010e¨ê`ëL©Ø\u0019)Ê3\u0096øÃªæ\f¿ùò\tá]\u0010þö\u00119\u0001B\u00ad\u0084¶\u0080\u0092\u0000\u008a'<Ð\u0018Á\u008d\u0091º}oÕóC\u0092©Ìì°G½©\u0092\u0003þ^3å_X§\u0016Hæ×óå\\É\u009aeP*¤\u009b\u0017cÊ0qÌ\u009fþ¶Â#M*Ë«¥\u0016;\r\u009cBP!'\u008eÃ\u001dòm2\u001d²9gz_ëÐÌ¶8í©¥°AÃäÓ\u0018}\u0087Ò\nÐ\u000b\fq+û\u0085.\u009bl¨\u0003R\"ï^\u009d/p d\u0017\u001c_üw±ã_&\u0085eý\u008e\u0098ß÷\u0000ó\u0084þ\u0012\u0099\u0003íVXUf\u0087\u001b\u0084\u0010\u008dOøü^\u0016ª\u0080\u008c I\nÓ°¶a\u0010|ð_Q\u0090\u001bÚ'$\u0007³ëV2.\u00980\u00013GÀÚ¹àÚZqô7$¥\u009a\u00895Í6ÒÀdÉ|\u009dH`¹V²m\u008e\u0000Ø\r;ºÂ\u009b\u00953ºG\u0086\u0089zõ\u0005\u0010\u008d!AJQw#\f¤AËLÜ¶øÝ(*\u0006\u0001É*\u0002¡\u008e\u0091Rn\u0088©!AÃÉåÄÕy\ræ(ø*\u0095\u0013«À@\u00adª\u001f\u007fù\u0002«âÄ".length();
      char var14 = 16;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var24 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var24.getBytes("ISO-8859-1"));
            String var30 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var30;
               if ((var13 += var14) >= var17) {
                  cb = var18;
                  db = new String[18];
                  mb = new HashMap(13);
                  Cipher var0;
                  var23 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var23.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[7];
                  int var3 = 0;
                  String var4 = "E~P\u007fó´\u009fJ\u008f§Ò\u009f|³\u0094\u0001äÐ°\u0002\u008f\u00adßô\nùùN§|;\rV¯\u0013\u008d~»u\u0096";
                  int var5 = "E~P\u007fó´\u009fJ\u008f§Ò\u009f|³\u0094\u0001äÐ°\u0002\u008f\u00adßô\nùùN§|;\rV¯\u0013\u008d~»u\u0096".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var28 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                     long[] var27 = var6;
                     var28 = var3++;
                     long var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var33 = -1;

                     while(true) {
                        long var8 = var32;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var35 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var33) {
                        case 0:
                           var27[var28] = var35;
                           if (var2 >= var5) {
                              kb = var6;
                              lb = new Integer[7];
                              KProperty[] var22 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(k9.class, true.f<invokedynamic>(30318, 342439542536627693L ^ var20), true.f<invokedynamic>(13082, 5835742819297992851L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(k9.class, true.f<invokedynamic>(22015, 7958405696460146288L ^ var20), true.f<invokedynamic>(24722, 7365364218498282261L ^ var20), 0)))};
                              h = var22;
                              return;
                           }
                           break;
                        default:
                           var27[var28] = var35;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "f£Ì\u0014B ü»q\u007f¿q\u0089\u0005\u008c\u0019";
                           var5 = "f£Ì\u0014B ü»q\u007f¿q\u0089\u0005\u008c\u0019".length();
                           var2 = 0;
                        }

                        var28 = var2;
                        var2 += 8;
                        var7 = var4.substring(var28, var2).getBytes("ISO-8859-1");
                        var27 = var6;
                        var28 = var3++;
                        var32 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var33 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var30;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "úù\u0004>\u009dêÎ«Ä\u0084\u009b}ûcC\u0083\u0018Q?\u008aGn\u0083pÎIV\u0096\u0003Fa\\\u008eº\u008a\u000e}\u0016R¶\u008c";
               var17 = "úù\u0004>\u009dêÎ«Ä\u0084\u009b}ûcC\u0083\u0018Q?\u008aGn\u0083pÎIV\u0096\u0003Fa\\\u008eº\u008a\u000e}\u0016R¶\u008c".length();
               var14 = 16;
               var13 = -1;
            }

            ++var13;
            var24 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   public static void I(int[] var0) {
      G = var0;
   }

   public static int[] q() {
      return G;
   }

   private static NumberFormatException b(NumberFormatException var0) {
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

   private static String c(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 17680;
      if (db[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])eb.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               eb.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/k9", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = cb[var5].getBytes("ISO-8859-1");
         db[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return db[var5];
   }

   private static Object a(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = c(var4, var5);
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
         throw new RuntimeException("su/catlean/k9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int f(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12245;
      if (lb[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = kb[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])mb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               mb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/k9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         lb[var3] = var15;
      }

      return lb[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = f(var4, var5);
      MethodHandle var8 = MethodHandles.constant(Integer.TYPE, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, new Class[]{Integer.TYPE, Long.TYPE}));
      return var7;
   }

   private static CallSite d(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments("d".asCollector(Object[].class, var2.parameterCount()), 0, new Object[]{var0, var3, var1}), var2));
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException("su/catlean/k9" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
