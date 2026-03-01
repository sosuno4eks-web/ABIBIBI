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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.gofra.Flow;

public final class t3 extends k9 {
   @NotNull
   public static final t3 K;
   static final KProperty[] S;
   @NotNull
   private static final zo n;
   @NotNull
   private static final zo r;
   @NotNull
   private static final zo g;
   @NotNull
   private static final zo O;
   @NotNull
   private static final z0 A;
   @NotNull
   private static final zc z;
   @NotNull
   private static final zr i;
   @NotNull
   private static final zl T;
   @NotNull
   private static final z0 k;
   @NotNull
   private static final iv s;
   private static final long b = j0.a(7101831530341408244L, 3517382876815682036L, MethodHandles.lookup().lookupClass()).a(66196432732511L);
   private static final String[] c;
   private static final String[] d;
   private static final Map e;
   private static final long[] f;
   private static final Integer[] l;
   private static final Map m;

   private t3(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 7943444451972L;
      super(var3, true.j<invokedynamic>(30194, 8709782164116207191L ^ var1), pa.V(), (List)null, 4, (DefaultConstructorMarker)null);
   }

   private final boolean s(int var1, byte var2, int var3) {
      long var4 = ((long)var1 << 32 | (long)var2 << 56 >>> 32 | (long)var3 << 40 >>> 40) ^ b;
      long var10001 = var4 ^ 102078199012933L;
      int var6 = (int)((var4 ^ 102078199012933L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (Boolean)n.k((short)var6, this, S[0], (short)var7, var8);
   }

   private final boolean f(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 107244924219662L;
      int var3 = (int)((var1 ^ 107244924219662L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)r.k((short)var3, this, S[1], (short)var4, var5);
   }

   private final boolean T(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 106853121959734L;
      int var3 = (int)((var1 ^ 106853121959734L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)g.k((short)var3, this, S[2], (short)var4, var5);
   }

   private final boolean j(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 76128969145073L;
      int var3 = (int)((var1 ^ 76128969145073L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (Boolean)O.k((short)var3, this, S[3], (short)var4, var5);
   }

   private final int R(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 52532721572381L;
      int var3 = (int)((var1 ^ 52532721572381L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)A.k((short)var3, this, S[4], (short)var4, var5)).intValue();
   }

   private final float w(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 111801211206228L;
      int var3 = (int)((var1 ^ 111801211206228L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)z.k((short)var3, this, S[5], (short)var4, var5)).floatValue();
   }

   private final gb I(byte var1, long var2) {
      long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ b;
      long var10001 = var4 ^ 47742031267769L;
      int var6 = (int)((var4 ^ 47742031267769L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 48);
      int var8 = (int)(var10001 << 32 >>> 32);
      return (gb)i.k((short)var6, this, S[true.y<invokedynamic>(183, 7989809227815838639L ^ var4)], (short)var7, var8);
   }

   private final String S(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 16514223015119L;
      int var3 = (int)((var1 ^ 16514223015119L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return (String)T.k((short)var3, this, S[true.y<invokedynamic>(9476, 3490524225343997281L ^ var1)], (short)var4, var5);
   }

   private final void i(long var1, String var3) {
      var1 ^= b;
      long var10001 = var1 ^ 25738548304282L;
      int var4 = (int)((var1 ^ 25738548304282L) >>> 32);
      int var5 = (int)(var10001 << 32 >>> 48);
      int var6 = (int)(var10001 << 48 >>> 48);
      T.P(this, var4, S[true.y<invokedynamic>(24235, 5401363596784817039L ^ var1)], (short)var5, var3, (short)var6);
   }

   private final int Y(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 119569762281158L;
      int var3 = (int)((var1 ^ 119569762281158L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 48);
      int var5 = (int)(var10001 << 32 >>> 32);
      return ((Number)k.k((short)var3, this, S[true.y<invokedynamic>(854, 2780964660153418034L ^ var1)], (short)var4, var5)).intValue();
   }

   @Flow
   private final void R(PlayerUpdateEvent param1) {
      // $FF: Couldn't be decompiled
   }

   private final void x(long param1, String param3) {
      // $FF: Couldn't be decompiled
   }

   private static final boolean v() {
      long var0 = b ^ 83872531522908L;
      long var2 = var0 ^ 65442910432624L;
      return K.j(var2);
   }

   private static final boolean d() {
      long var0 = b ^ 68069547840598L;
      long var2 = var0 ^ 121178986267069L;
      return K.T(var2);
   }

   private static final boolean W() {
      long var0 = b ^ 78470004976754L;
      long var10001 = var0 ^ 104203878127894L;
      int var2 = (int)((var0 ^ 104203878127894L) >>> 56);
      long var3 = var10001 << 8 >>> 8;

      boolean var10000;
      try {
         if (K.I((byte)var2, var3) == gb.Command) {
            var10000 = true;
            return var10000;
         }
      } catch (NoWhenBranchMatchedException var5) {
         throw var5.A<invokedynamic>(var5, -5382896802426709492L, var0);
      }

      var10000 = false;
      return var10000;
   }

   private static final boolean C() {
      long var0 = b ^ 40630434696579L;
      long var10001 = var0 ^ 67550730189031L;
      int var2 = (int)((var0 ^ 67550730189031L) >>> 56);
      long var3 = var10001 << 8 >>> 8;

      boolean var10000;
      try {
         if (K.I((byte)var2, var3) != gb.None) {
            var10000 = true;
            return var10000;
         }
      } catch (NoWhenBranchMatchedException var5) {
         throw var5.A<invokedynamic>(var5, -7728889122003076099L, var0);
      }

      var10000 = false;
      return var10000;
   }

   static {
      long var20 = b ^ 46545035101299L;
      long var22 = var20 ^ 32506955805275L;
      long var24 = var20 ^ 136012192337291L;
      long var26 = var20 ^ 121958045188234L;
      long var28 = var20 ^ 9734565002094L;
      long var30 = var20 ^ 46466338818039L;
      long var32 = var20 ^ 64770132556957L;
      e = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[34];
      int var16 = 0;
      String var15 = "â¬]RôS³a¸ß\\³@\u0018\u000bm\u0089VwØ;±Ù\u0002 ¦Ë¨\u0085\u0099>`î{ò»%\u0091ª«T`\u0085\u0093D\u0083\u008dÝ`\u0086\\=\u0002\u0096åó$ ¦øè÷\u008d\u0087\u008a\u008b\u0084U'0)a¥åì×·sENì\u0003 _.*vÙv\u008a\u00108G\u0093ÆxFVÊÁ\u0090ëô\u001diàñ\u0010¨³ Ø\n\u000ez\u001eû\u001e\u0003<ù\u0096`\r tÞ\u0098\u001c=\\GR\u009f\u0081d,\u00058ObâuÊîÓÈÀÕmÕ8\u001aJÒ\u009f?\u0018W ¿\u0091Í\u001eC6ùsóöUý/vÜ\u0017\u0003C\u008d\u0081\u001b§ \bu\u0088ãö\"Ñ¡ã\u008dÎaÂérhk)ó\u000fQï$\u001dD($l\u0018{M\u009b\u0010\u0086<\u009aÔq±µ¯\u0082ßß\bÀ\u0012ÜU\u0010í¶\u0093!-umf\u0094<*ùÈWîæ\u0010\u000b\u0095ûÚ;|FsI]÷\u0087\u0012\u000eùX\u0010½UË!\u0088è%ø9¸»½\u0013>æ¦\u0010\u0086ú\u0085YÛ\u0095*nnm\u0015UT)Àb\u0010$BëW=üsØ&f\u009c\u009d©bG\u0096\u0018ç,hè¹jr\u0006GºjåÞ^\u0007\u0000z½.Ô¦y\u0090-(o]¼*cÜx\u0005ÇiØÚQ©\rÚF¤Rè\u0001d\u009a\u000fjÔ!Z\u000fÖ\u009aó'é\u009bÎ©ZÌ/ ]\u0007FüAil\u0005\"B\u0099ÌÐO\u00839\u0082<ë\u0089\u0090Û é\u0006\u009a[\u0015èµ\u000b%\u0010\u001eâ\u0082JE\u00838kn¢ù®\u001a8S\u0017 ðÎ`g+Çà\u0093¼}©ò¥b\u0092\tkF}a\u0097êD\u008d\f\u0002 ½ÁÐ\u001d÷8\u0081(¥Ö\u000fGk¯ÁÖÔÃ\u001en/\u00adD\u000bæn®xKÊ¶£JÎ(\u0091>Ø«Óø;\u0088\u008c\u0093:\u0097p\u0005Y\u0010mL\u009e\u0004´\u0085|¢\u0002ùé\u0010aö\u00003\u009f\u0081\u0084Ð¸\u008a9Ç\u009d½\u0081ý\u0010:_qê#ë\u0004²Ôï\u0089ùh¨P\u0099\u0010¢®«ÚÈ\u009dÖØ\u0014\u0080_t8J\u0010ã\u0018Ûª³ARÑ8Oñ\u009c©\u009f_SÖ+9$íbó¦ßæ\u0010\u009f\u0007Ñw+Ð\u0090Ø\u0093\u000f¡&ÆJ{$ G\u0095¬!O\u0095=kõ$\b_ûíõ\u0011³;¢\u0089\u001b\u0011úvs\u0013`\u0084\u0095\u0001òÉ\u0010j%G±q£\u008clí.×@\u0085þ\u0084r0\u0006\u0018\u001bû\u009d\u0018¼µ±\u0004\"µ{¬¶Ê}å¶/\u0006\u009eª2\u008cCó»p{G|\u008eýë®P\u0012\u009b®îa)Ý\b\"÷° Á&Ôïñ×\f\r,aü±\u0091ÝL\\Í\u0097â¸3ì-ûL1\b`¹BV£ ©;s\u0010É\u0082Z\u0095¤/·Hù\u0096\u0007äè;íH%S5,¼§\u000b\u0095Rùø\" :HÐ\u0091&\u0000@?wàÙðËÆß\u0092uê) ²\u008e6ÖÄ\u008bÜ¼\u009cyìG \r\"\u0092s\u0093½áÅ\u0004V\nuÉ`[¥{õK\u001eÔÁ\u008a©\u008cv\u0018l³L\u009b)";
      int var17 = "â¬]RôS³a¸ß\\³@\u0018\u000bm\u0089VwØ;±Ù\u0002 ¦Ë¨\u0085\u0099>`î{ò»%\u0091ª«T`\u0085\u0093D\u0083\u008dÝ`\u0086\\=\u0002\u0096åó$ ¦øè÷\u008d\u0087\u008a\u008b\u0084U'0)a¥åì×·sENì\u0003 _.*vÙv\u008a\u00108G\u0093ÆxFVÊÁ\u0090ëô\u001diàñ\u0010¨³ Ø\n\u000ez\u001eû\u001e\u0003<ù\u0096`\r tÞ\u0098\u001c=\\GR\u009f\u0081d,\u00058ObâuÊîÓÈÀÕmÕ8\u001aJÒ\u009f?\u0018W ¿\u0091Í\u001eC6ùsóöUý/vÜ\u0017\u0003C\u008d\u0081\u001b§ \bu\u0088ãö\"Ñ¡ã\u008dÎaÂérhk)ó\u000fQï$\u001dD($l\u0018{M\u009b\u0010\u0086<\u009aÔq±µ¯\u0082ßß\bÀ\u0012ÜU\u0010í¶\u0093!-umf\u0094<*ùÈWîæ\u0010\u000b\u0095ûÚ;|FsI]÷\u0087\u0012\u000eùX\u0010½UË!\u0088è%ø9¸»½\u0013>æ¦\u0010\u0086ú\u0085YÛ\u0095*nnm\u0015UT)Àb\u0010$BëW=üsØ&f\u009c\u009d©bG\u0096\u0018ç,hè¹jr\u0006GºjåÞ^\u0007\u0000z½.Ô¦y\u0090-(o]¼*cÜx\u0005ÇiØÚQ©\rÚF¤Rè\u0001d\u009a\u000fjÔ!Z\u000fÖ\u009aó'é\u009bÎ©ZÌ/ ]\u0007FüAil\u0005\"B\u0099ÌÐO\u00839\u0082<ë\u0089\u0090Û é\u0006\u009a[\u0015èµ\u000b%\u0010\u001eâ\u0082JE\u00838kn¢ù®\u001a8S\u0017 ðÎ`g+Çà\u0093¼}©ò¥b\u0092\tkF}a\u0097êD\u008d\f\u0002 ½ÁÐ\u001d÷8\u0081(¥Ö\u000fGk¯ÁÖÔÃ\u001en/\u00adD\u000bæn®xKÊ¶£JÎ(\u0091>Ø«Óø;\u0088\u008c\u0093:\u0097p\u0005Y\u0010mL\u009e\u0004´\u0085|¢\u0002ùé\u0010aö\u00003\u009f\u0081\u0084Ð¸\u008a9Ç\u009d½\u0081ý\u0010:_qê#ë\u0004²Ôï\u0089ùh¨P\u0099\u0010¢®«ÚÈ\u009dÖØ\u0014\u0080_t8J\u0010ã\u0018Ûª³ARÑ8Oñ\u009c©\u009f_SÖ+9$íbó¦ßæ\u0010\u009f\u0007Ñw+Ð\u0090Ø\u0093\u000f¡&ÆJ{$ G\u0095¬!O\u0095=kõ$\b_ûíõ\u0011³;¢\u0089\u001b\u0011úvs\u0013`\u0084\u0095\u0001òÉ\u0010j%G±q£\u008clí.×@\u0085þ\u0084r0\u0006\u0018\u001bû\u009d\u0018¼µ±\u0004\"µ{¬¶Ê}å¶/\u0006\u009eª2\u008cCó»p{G|\u008eýë®P\u0012\u009b®îa)Ý\b\"÷° Á&Ôïñ×\f\r,aü±\u0091ÝL\\Í\u0097â¸3ì-ûL1\b`¹BV£ ©;s\u0010É\u0082Z\u0095¤/·Hù\u0096\u0007äè;íH%S5,¼§\u000b\u0095Rùø\" :HÐ\u0091&\u0000@?wàÙðËÆß\u0092uê) ²\u008e6ÖÄ\u008bÜ¼\u009cyìG \r\"\u0092s\u0093½áÅ\u0004V\nuÉ`[¥{õK\u001eÔÁ\u008a©\u008cv\u0018l³L\u009b)".length();
      char var14 = 24;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var35 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var35.getBytes("ISO-8859-1"));
            String var41 = b(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var41;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[34];
                  m = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[14];
                  int var3 = 0;
                  String var4 = "\"äk\u0089?è¹sz²\u009al\u0016S\u009f\u009c¼,\u0005\u008dtÞ\"K'åGèõ-è\u009bÀ\u0002ûlÎÍÛ¼:ØÌn6\u0004Ú¢¹ß¤Äìv\u0089Íp'Ü\u008fÝu\u001f\u0099:6~êá¶û\u0089P©\u0094ýý7èÓ[§ê\u001d9\u0007*Ï\"j\u009c\u00914¦&²";
                  int var5 = "\"äk\u0089?è¹sz²\u009al\u0016S\u009f\u009c¼,\u0005\u008dtÞ\"K'åGèõ-è\u009bÀ\u0002ûlÎÍÛ¼:ØÌn6\u0004Ú¢¹ß¤Äìv\u0089Íp'Ü\u008fÝu\u001f\u0099:6~êá¶û\u0089P©\u0094ýý7èÓ[§ê\u001d9\u0007*Ï\"j\u009c\u00914¦&²".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var39 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
                     long[] var38 = var6;
                     var39 = var3++;
                     long var43 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var44 = -1;

                     while(true) {
                        long var8 = var43;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var46 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var44) {
                        case 0:
                           var38[var39] = var46;
                           if (var2 >= var5) {
                              f = var6;
                              l = new Integer[14];
                              KProperty[] var34 = new KProperty[true.y<invokedynamic>(22058, 818857717133139050L ^ var20)];
                              var34[0] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t3.class, true.j<invokedynamic>(2895, 2766197937330674999L ^ var20), true.j<invokedynamic>(1247, 323441371133039257L ^ var20), 0)));
                              var34[1] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t3.class, true.j<invokedynamic>(16999, 7322722780908557334L ^ var20), true.j<invokedynamic>(18156, 2627266155251896472L ^ var20), 0)));
                              var34[2] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t3.class, true.j<invokedynamic>(30448, 6638562261903581341L ^ var20), true.j<invokedynamic>(24570, 5597393926883445120L ^ var20), 0)));
                              var34[3] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t3.class, true.j<invokedynamic>(26716, 3841757531361951276L ^ var20), true.j<invokedynamic>(331, 2320061787955681066L ^ var20), 0)));
                              var34[4] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t3.class, true.j<invokedynamic>(17330, 647017312363910614L ^ var20), true.j<invokedynamic>(27138, 650461279869254777L ^ var20), 0)));
                              var34[5] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t3.class, true.j<invokedynamic>(31604, 4710897711622106394L ^ var20), true.j<invokedynamic>(10086, 757855428117262593L ^ var20), 0)));
                              var34[true.y<invokedynamic>(19921, 2999458070502983577L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t3.class, true.j<invokedynamic>(12161, 2562429417369270726L ^ var20), true.j<invokedynamic>(25103, 6379850851354096754L ^ var20), 0)));
                              var34[true.y<invokedynamic>(9476, 3490463124761128782L ^ var20)] = Reflection.mutableProperty1((MutablePropertyReference1)(new MutablePropertyReference1Impl(t3.class, true.j<invokedynamic>(25931, 1627560722912424737L ^ var20), true.j<invokedynamic>(19258, 4371324760426847567L ^ var20), 0)));
                              var34[true.y<invokedynamic>(24636, 8811749395471198833L ^ var20)] = Reflection.property1((PropertyReference1)(new PropertyReference1Impl(t3.class, true.j<invokedynamic>(11812, 5860768383750436955L ^ var20), true.j<invokedynamic>(19183, 1030839640501820553L ^ var20), 0)));
                              S = var34;
                              K = new t3(var24);
                              n = qi.R((il)K, true.j<invokedynamic>(22421, 3785862733780976103L ^ var20), true, (pj)null, (Function0)null, true.y<invokedynamic>(22503, 1606078103280770473L ^ var20), var32, (Object)null);
                              r = qi.R((il)K, true.j<invokedynamic>(13092, 735825210861413703L ^ var20), true, (pj)null, (Function0)null, true.y<invokedynamic>(16010, 2708648091962258629L ^ var20), var32, (Object)null);
                              g = qi.R((il)K, true.j<invokedynamic>(27265, 2982980055107943652L ^ var20), false, (pj)null, (Function0)null, true.y<invokedynamic>(16010, 2708648091962258629L ^ var20), var32, (Object)null);
                              O = qi.R((il)K, true.j<invokedynamic>(26716, 3841757531361951276L ^ var20), false, (pj)null, (Function0)null, true.y<invokedynamic>(16010, 2708648091962258629L ^ var20), var32, (Object)null);
                              A = qi.o((il)K, true.j<invokedynamic>(19468, 908487585123572346L ^ var20), 2, new IntRange(0, true.y<invokedynamic>(16289, 9207947431513142765L ^ var20)), var22, (pj)null, t3::v, true.y<invokedynamic>(24636, 8811749395471198833L ^ var20), (Object)null);
                              z = qi.g((il)K, true.j<invokedynamic>(1466, 2782439236035597252L ^ var20), 8.0F, RangesKt.rangeTo(1.0F, 20.0F), (pj)null, t3::d, true.y<invokedynamic>(24636, 8811749395471198833L ^ var20), var26, (Object)null);
                              i = qi.M((il)K, true.j<invokedynamic>(16931, 1088760265701037121L ^ var20), (Enum)gb.Leave, (pj)null, (Function0)null, true.y<invokedynamic>(16010, 2708648091962258629L ^ var20), (Object)null, var28);
                              T = qi.P((il)K, true.j<invokedynamic>(22561, 802841853968453206L ^ var20), var30, true.j<invokedynamic>(26885, 7572356932406919022L ^ var20), (pj)null, t3::W, 4, (Object)null);
                              k = qi.o((il)K, true.j<invokedynamic>(23268, 6986710933502626973L ^ var20), true.y<invokedynamic>(8824, 526290953543526449L ^ var20), new IntRange(4, true.y<invokedynamic>(28924, 2333796660311816895L ^ var20)), var22, (pj)null, t3::C, true.y<invokedynamic>(24636, 8811749395471198833L ^ var20), (Object)null);
                              s = new iv();
                              return;
                           }
                           break;
                        default:
                           var38[var39] = var46;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = ";7\u00913#FýÉ\u001bÃ\u0096À!WâS";
                           var5 = ";7\u00913#FýÉ\u001bÃ\u0096À!WâS".length();
                           var2 = 0;
                        }

                        var39 = var2;
                        var2 += 8;
                        var7 = var4.substring(var39, var2).getBytes("ISO-8859-1");
                        var38 = var6;
                        var39 = var3++;
                        var43 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var44 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var41;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "ñÌ²Fá8Fk\u0084\u0082VÙ\b\u0097x]\u0016©Çñ\u0089$åjÆ\u008f[²Å\u009cQV|H\u0013k?lSG\u0010\u0098¶þâòwX\u0006\u0000fÝQ\u009eÉ/2";
               var17 = "ñÌ²Fá8Fk\u0084\u0082VÙ\b\u0097x]\u0016©Çñ\u0089$åjÆ\u008f[²Å\u009cQV|H\u0013k?lSG\u0010\u0098¶þâòwX\u0006\u0000fÝQ\u009eÉ/2".length();
               var14 = '(';
               var13 = -1;
            }

            ++var13;
            var35 = var15.substring(var13, var13 + var14);
            var10001 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 19035;
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
            throw new RuntimeException("su/catlean/t3", var10);
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
         throw new RuntimeException("su/catlean/t3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5749;
      if (l[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = f[var3];
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
            throw new RuntimeException("su/catlean/t3", var14);
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
         throw new RuntimeException("su/catlean/t3" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
