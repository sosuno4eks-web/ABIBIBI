package su.catlean;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;
import net.minecraft.class_640;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class te extends k9 {
   @NotNull
   public static final te r;
   static final KProperty[] w;
   @NotNull
   private static final zn z;
   @NotNull
   private static final zr J;
   @NotNull
   private static final zl P;
   @NotNull
   private static final zo b;
   @NotNull
   private static final zc X;
   @NotNull
   private static final iv M;
   @NotNull
   private static List V;
   private static long f;
   @NotNull
   private static final File S;
   private static final long c = j0.a(-3985157786566012175L, 8129719130595006205L, MethodHandles.lookup().lookupClass()).a(18078556701080L);
   private static final String[] d;
   private static final String[] e;
   private static final Map g;
   private static final long[] i;
   private static final Integer[] k;
   private static final Map l;

   private te(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 109460933819000L;
      super(var3, true.c<invokedynamic>(7777, 5620974288913539178L ^ var1), pa.V(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final zu I(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 196206837672L;
      int var3 = (int)((var1 ^ 196206837672L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (zu)z.k((short)var3, this, w[0], (short)var4, var5);
   }

   private final void y(long var1, zu var3) {
      var1 ^= c;
      long var10001 = var1 ^ 132414491953694L;
      int var4 = (int)((var1 ^ 132414491953694L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      z.P(this, var4, w[0], (short)var5, var3, (short)var6);
   }

   private final ix t(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 43027700439756L;
      int var3 = (int)((var1 ^ 43027700439756L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (ix)J.k((short)var3, this, w[1], (short)var4, var5);
   }

   private final void Z(ix var1, long var2) {
      var2 ^= c;
      long var10001 = var2 ^ 61233634549997L;
      int var4 = (int)((var2 ^ 61233634549997L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      J.P(this, var4, w[1], (short)var5, var1, (short)var6);
   }

   private final String P(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 127325419679332L;
      int var3 = (int)((var1 ^ 127325419679332L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (String)P.k((short)var3, this, w[2], (short)var4, var5);
   }

   private final void u(String var1, long var2) {
      var2 ^= c;
      long var10001 = var2 ^ 110850396248049L;
      int var4 = (int)((var2 ^ 110850396248049L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      P.P(this, var4, w[2], (short)var5, var1, (short)var6);
   }

   private final boolean f(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 54386317950303L;
      int var3 = (int)((var1 ^ 54386317950303L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)b.k((short)var3, this, w[3], (short)var4, var5);
   }

   private final void N(boolean var1, long var2) {
      var2 ^= c;
      long var10001 = var2 ^ 88100919763915L;
      int var4 = (int)((var2 ^ 88100919763915L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      b.P(this, var4, w[3], (short)var5, var1, (short)var6);
   }

   private final float c(long var1) {
      var1 ^= c;
      long var10001 = var1 ^ 135670213858840L;
      int var3 = (int)((var1 ^ 135670213858840L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)X.k((short)var3, this, w[4], (short)var4, var5)).floatValue();
   }

   private final void p(float var1, char var2, int var3, short var4) {
      long var5 = ((long)var2 << 48 | (long)var3 << 32 >>> 16 | (long)var4 << 48 >>> 48) ^ c;
      long var10001 = var5 ^ 74380026826367L;
      int var7 = (int)((var5 ^ 74380026826367L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      X.P(this, var7, w[4], (short)var8, var1, (short)var9);
   }

   public void n(long var1) {
      long var3 = var1 ^ 75345589274289L;
      V = this.d(var3);
   }

   @Flow
   public final void I(@NotNull PlayerUpdateEvent event) {
      // $FF: Couldn't be decompiled
   }

   private final String b(int var1, short var2, char var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48) ^ c;
      long var6 = var4 ^ 104247122242944L;
      Collection var10000 = s8.Y(var6).method_2880();
      Intrinsics.checkNotNullExpressionValue(var10000, true.c<invokedynamic>(8567, 8076474241248042008L ^ var4));
      return (String)CollectionsKt.randomOrNull((Collection)SequencesKt.toList(SequencesKt.filter(SequencesKt.map(CollectionsKt.asSequence((Iterable)var10000), te::J), te::j)), (Random)Random.Default);
   }

   private final String y(long var1) {
      var1 ^= c;
      char var10000 = (char)(Random.Default.nextInt(true.k<invokedynamic>(15192, 1259534992770978585L ^ var1)) + true.k<invokedynamic>(7144, 7717802043657352106L ^ var1));
      return "[" + var10000 + Random.Default.nextInt(true.k<invokedynamic>(10381, 5118189528808603841L ^ var1)) + (char)(Random.Default.nextInt(true.k<invokedynamic>(26190, 4544330679571680768L ^ var1)) + true.k<invokedynamic>(27966, 6601417414199149941L ^ var1)) + "]";
   }

   private final List d(long param1) {
      // $FF: Couldn't be decompiled
   }

   private static final Unit C() {
      // $FF: Couldn't be decompiled
   }

   private static final boolean x() {
      long var0 = c ^ 134265977627135L;
      long var2 = var0 ^ 122935857433070L;

      boolean var10000;
      try {
         if (r.t(var2) == ix.WHISPERS) {
            var10000 = true;
            return var10000;
         }
      } catch (NoWhenBranchMatchedException var4) {
         throw var4.A<invokedynamic>(var4, -1155415825547495198L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final String J(class_640 var0) {
      long var1 = c ^ 69714199780316L;
      Intrinsics.checkNotNullParameter(var0, true.c<invokedynamic>(11330, 1647431437286025171L ^ var1));
      return var0.method_2966().name();
   }

   private static final boolean j(String var0) {
      long var1 = c ^ 44179880014325L;
      return Pattern.matches(true.c<invokedynamic>(23916, 7103393666008693974L ^ var1), (CharSequence)var0);
   }

   static {
      long var20 = c ^ 76659627714561L;
      long var22 = var20 ^ 36795829944348L;
      long var24 = var20 ^ 4327087864965L;
      long var26 = var20 ^ 78366558419960L;
      long var28 = var20 ^ 124153579194629L;
      long var30 = var20 ^ 21190490474479L;
      long var10001 = var20 ^ 137903500507121L;
      int var32 = (int)((var20 ^ 137903500507121L) >>> 56);
      int var33 = (int)(var10001 << 8 >>> 32);
      int var34 = (int)(var10001 << 40 >>> 40);
      g = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[23];
      int var16 = 0;
      String var15 = "ï\u008ekj¢á¹¦\u009frü÷Hq?8ø0¾\t÷eþ»@µ±ÅÃì¥@\u0004\u000f\u0010\u0098\u008dC®\u001e?Í\u0015¾ê\u008aMÈ-î-\n=sQå\"\u0096 \u0097¶q\u0089«\u0017ãý\u000bÃ±\u0083RJ5\u0091ÚP\u0000\u0094¨¦R\u007fNí;Þ\u000eP\u0010[\u008f\u007fR\u001f1&\u009aoO\u0082í1ÿ9- \nõ=ßáY\u00908\u0096.\u0086\u0007!\u00835_,iÓ½N\u008f\u0096x9xD¹á \fë\u0010\"Ï»\u00004^9\u008b¾\u0001*\fVn\u0086F\u0018\u008f\u0081ö?\u0081\f/\u0088&ù\u0099ÂÓAw]à\tÓ6\u0015\f\u009eÉ\u0018¬«×¬©@¾ÀJ\u00896²ÎOR¬ §ùØ\u0010\u0080^7\u0010\tÝ4¿d\u0089c©ø@\u000bÃ \u009a\u0082}\u0010B\u0019c\u0011}\\µ\u001bØ\u0092\u001eS%h>f\u0018&\u0080\u007f\u00013\u0012=\u009a§['Ðjsöøk¦¬ùÕ\u009a£æ AL\bÌ©&\u008b\u0092\u0088|ñyÔ\u008fn7øJë\u0093Àéf9¥QãÉí\u009cn+0\u0094ý\tÂ\u0013#Ö\u0084Ê\u0082äê=Éß×\u008d @÷8Éú®Ä|b* ³á\u007fr\u0018\u0093ñ\u001c\u0084\u009e\u007fÙü\u0099\u009f~S\u0007\u0089\u0010\u008a^BÆF\u0094©¿_\u0006\u000fr\u009b²o\u0097\u0010\u0080¯§\u009fÄÈ+1\u008d\u0093\u009b\u001e\nHI\u009a\u0010»ÞüaÛr\u009eë\u008eù>Mc\u0011û½\u0010q\u008dþKA)\u00800ÖÛýÐÑÅP\u00068\u0013\u008f§Ô\u0099|¯6\u009cX¯~¿ÔFh²£ZÏ\u000e»Ã\u008b¾\u0001Ï\u001fÓøST\u00811³{ç\u0010o¥èÉÂ4zo\u0081\u008d\u00ad÷×\u0086ñà¯ê\u0010\n n\u0017\u0014\u0003Ý\u009b«\u001aklL¸\u0011É\u0010ÒÞ\u009d´»}\u001dÕ\u0005tÐ\t×\u0000\nI(ÎJ\u0081\u008b½)\u0081ëo9\u0096Sñ!üLÂ*!IÞíki0\u001e\u0002â¦¹Y\u0092Ý4;\u0006uõ\u0086æ ÌÃÏSd\u0083:ðí¾ÝË\u0086Tð\u0093³b%:GcZó\u0004T&\u0000\u0011Dc¤";
      int var17 = "ï\u008ekj¢á¹¦\u009frü÷Hq?8ø0¾\t÷eþ»@µ±ÅÃì¥@\u0004\u000f\u0010\u0098\u008dC®\u001e?Í\u0015¾ê\u008aMÈ-î-\n=sQå\"\u0096 \u0097¶q\u0089«\u0017ãý\u000bÃ±\u0083RJ5\u0091ÚP\u0000\u0094¨¦R\u007fNí;Þ\u000eP\u0010[\u008f\u007fR\u001f1&\u009aoO\u0082í1ÿ9- \nõ=ßáY\u00908\u0096.\u0086\u0007!\u00835_,iÓ½N\u008f\u0096x9xD¹á \fë\u0010\"Ï»\u00004^9\u008b¾\u0001*\fVn\u0086F\u0018\u008f\u0081ö?\u0081\f/\u0088&ù\u0099ÂÓAw]à\tÓ6\u0015\f\u009eÉ\u0018¬«×¬©@¾ÀJ\u00896²ÎOR¬ §ùØ\u0010\u0080^7\u0010\tÝ4¿d\u0089c©ø@\u000bÃ \u009a\u0082}\u0010B\u0019c\u0011}\\µ\u001bØ\u0092\u001eS%h>f\u0018&\u0080\u007f\u00013\u0012=\u009a§['Ðjsöøk¦¬ùÕ\u009a£æ AL\bÌ©&\u008b\u0092\u0088|ñyÔ\u008fn7øJë\u0093Àéf9¥QãÉí\u009cn+0\u0094ý\tÂ\u0013#Ö\u0084Ê\u0082äê=Éß×\u008d @÷8Éú®Ä|b* ³á\u007fr\u0018\u0093ñ\u001c\u0084\u009e\u007fÙü\u0099\u009f~S\u0007\u0089\u0010\u008a^BÆF\u0094©¿_\u0006\u000fr\u009b²o\u0097\u0010\u0080¯§\u009fÄÈ+1\u008d\u0093\u009b\u001e\nHI\u009a\u0010»ÞüaÛr\u009eë\u008eù>Mc\u0011û½\u0010q\u008dþKA)\u00800ÖÛýÐÑÅP\u00068\u0013\u008f§Ô\u0099|¯6\u009cX¯~¿ÔFh²£ZÏ\u000e»Ã\u008b¾\u0001Ï\u001fÓøST\u00811³{ç\u0010o¥èÉÂ4zo\u0081\u008d\u00ad÷×\u0086ñà¯ê\u0010\n n\u0017\u0014\u0003Ý\u009b«\u001aklL¸\u0011É\u0010ÒÞ\u009d´»}\u001dÕ\u0005tÐ\t×\u0000\nI(ÎJ\u0081\u008b½)\u0081ëo9\u0096Sñ!üLÂ*!IÞíki0\u001e\u0002â¦¹Y\u0092Ý4;\u0006uõ\u0086æ ÌÃÏSd\u0083:ðí¾ÝË\u0086Tð\u0093³b%:GcZó\u0004T&\u0000\u0011Dc¤".length();
      char var14 = 24;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var36 = var15.substring(var13, var13 + var14);
         byte var38 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var36.getBytes("ISO-8859-1"));
            String var43 = b(var19).intern();
            switch(var38) {
            case 0:
               var18[var16++] = var43;
               if ((var13 += var14) >= var17) {
                  d = var18;
                  e = new String[23];
                  l = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[11];
                  int var3 = 0;
                  String var4 = "1@`Î\u008dþVï\u001c:ü\u009br¶\u0095Ö¥wk+ºKá¥å°<3sÂ¡fð\u0018qTp\u008d\u009d«Û\u0091\u0006\u0015V¬\u0001\"LEÖl,»H~!\u001eì°Ê?M\u0005ürbÎh\u0085Ús";
                  int var5 = "1@`Î\u008dþVï\u001c:ü\u009br¶\u0095Ö¥wk+ºKá¥å°<3sÂ¡fð\u0018qTp\u008d\u009d«Û\u0091\u0006\u0015V¬\u0001\"LEÖl,»H~!\u001eì°Ê?M\u0005ürbÎh\u0085Ús".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var42 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var42, var2).getBytes("ISO-8859-1");
                     long[] var39 = var6;
                     var42 = var3++;
                     long var45 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var46 = -1;

                     while(true) {
                        long var8 = var45;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var48 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var46) {
                        case 0:
                           var39[var42] = var48;
                           if (var2 >= var5) {
                              i = var6;
                              k = new Integer[11];
                              KProperty[] var35 = new KProperty[]{Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(te.class, true.c<invokedynamic>(13231, 8673307196800814055L ^ var20), true.c<invokedynamic>(14646, 8779561245793272168L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(te.class, true.c<invokedynamic>(17669, 1862659863521377626L ^ var20), true.c<invokedynamic>(11171, 7329147304155993062L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(te.class, true.c<invokedynamic>(2944, 1401881250788799451L ^ var20), true.c<invokedynamic>(2189, 5626250403149869250L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(te.class, true.c<invokedynamic>(1877, 5992481036642385681L ^ var20), true.c<invokedynamic>(32084, 2165073390517224718L ^ var20), 0))), Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(te.class, true.c<invokedynamic>(16855, 7156762171771402645L ^ var20), true.c<invokedynamic>(30673, 6502140344292904854L ^ var20), 0)))};
                              w = var35;
                              r = new te(var28);
                              z = qi.w((il)r, true.c<invokedynamic>(6477, 2259089515602141461L ^ var20), (byte)var32, te::C, (pj)null, var33, (Function0)null, true.k<invokedynamic>(18949, 3419682205302496719L ^ var20), var34, (Object)null);
                              J = qi.M((il)r, true.c<invokedynamic>(17147, 452522156486048423L ^ var20), (Enum)ix.GLOBAL, (pj)null, (Function0)null, true.k<invokedynamic>(14710, 7345505671026306747L ^ var20), (Object)null, var22);
                              P = qi.P((il)r, true.c<invokedynamic>(13066, 2134801591723969353L ^ var20), var24, true.c<invokedynamic>(1178, 3157531947599658195L ^ var20), (pj)null, te::x, 4, (Object)null);
                              b = qi.R((il)r, true.c<invokedynamic>(18406, 5058791714888662957L ^ var20), false, (pj)null, (Function0)null, true.k<invokedynamic>(14710, 7345505671026306747L ^ var20), var30, (Object)null);
                              X = qi.g((il)r, true.c<invokedynamic>(23380, 1167585064954536722L ^ var20), 5.0F, RangesKt.rangeTo(0.0F, 30.0F), (pj)null, (Function0)null, true.k<invokedynamic>(19657, 4028652992987437826L ^ var20), var26, (Object)null);
                              M = new iv();
                              V = CollectionsKt.emptyList();
                              S = new File(kf.e(), true.c<invokedynamic>(6634, 7516426120044405159L ^ var20));
                              return;
                           }
                           break;
                        default:
                           var39[var42] = var48;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "éð \u0006ÿ\u008aT¿hÃd\u0088z\u001e\u0012/";
                           var5 = "éð \u0006ÿ\u008aT¿hÃd\u0088z\u001e\u0012/".length();
                           var2 = 0;
                        }

                        var42 = var2;
                        var2 += 8;
                        var7 = var4.substring(var42, var2).getBytes("ISO-8859-1");
                        var39 = var6;
                        var42 = var3++;
                        var45 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var46 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var43;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "\u0094\u0099}\u009ciå\u001dò.AQ\tVtT¶:¹çÌ\u001fiUä]~EP\u001fA\u008fw .Ã\u00ad\u0004÷ª\u0090Ü¨\nîå84ZÍé©\u0096WkDÔSÈÕÛ\u0019Û_Z$";
               var17 = "\u0094\u0099}\u009ciå\u001dò.AQ\tVtT¶:¹çÌ\u001fiUä]~EP\u001fA\u008fw .Ã\u00ad\u0004÷ª\u0090Ü¨\nîå84ZÍé©\u0096WkDÔSÈÕÛ\u0019Û_Z$".length();
               var14 = ' ';
               var13 = -1;
            }

            ++var13;
            var36 = var15.substring(var13, var13 + var14);
            var38 = 0;
         }
      }
   }

   private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7937;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])g.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               g.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/te", var10);
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
         throw new RuntimeException("su/catlean/te" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 12421;
      if (k[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = i[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/te", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
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
         throw new RuntimeException("su/catlean/te" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
