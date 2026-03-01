package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.management.ManagementFactory;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class cq {
   @NotNull
   private final String[] p;
   @Nullable
   private p0 d;
   private boolean k;
   @Nullable
   private sm m;
   private final long q;
   @NotNull
   private final ex g;
   @NotNull
   private ex R;
   private static boolean o;
   private static final long b = j0.a(3512073860265983891L, 8812845297277923280L, MethodHandles.lookup().lookupClass()).a(133920808286779L);
   private static final String[] e;
   private static final String[] f;
   private static final Map i;
   private static final long[] j;
   private static final Integer[] l;
   private static final Map n;
   private static final long w;

   public cq(long var1) {
      var1 ^= b;
      long var10001 = var1 ^ 10896296902546L;
      int var3 = (int)((var1 ^ 10896296902546L) >>> 32);
      int var4 = (int)(var10001 << 32 >>> 48);
      int var5 = (int)(var10001 << 48 >>> 48);
      super();
      String[] var6 = new String[]{true.z<invokedynamic>(8243, 1752604015436721561L ^ var1), true.z<invokedynamic>(31286, 5081529331321550741L ^ var1), true.z<invokedynamic>(17266, 3172126322902208198L ^ var1), true.z<invokedynamic>(20637, 4796235661735271738L ^ var1)};
      this.p = var6;
      this.q = Instant.now().getEpochSecond();
      this.g = new ex(var3, (String)null, (String)null, (String)null, true.b<invokedynamic>(18454, 5541038734405264733L ^ var1), (char)var4, (short)var5, (DefaultConstructorMarker)null);
      this.R = this.g;
   }

   public final long m() {
      return this.q;
   }

   @NotNull
   public final ex C() {
      return this.g;
   }

   @NotNull
   public final ex A() {
      return this.R;
   }

   public final boolean t(short var1, int var2, short var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48) ^ b;

      boolean var10000;
      try {
         if (this.d != null) {
            var10000 = true;
            return var10000;
         }
      } catch (NumberFormatException var6) {
         throw var6.A<invokedynamic>(var6, -4574954967471953647L, var4);
      }

      var10000 = false;
      return var10000;
   }

   private final int Y(long var1) {
      var1 ^= b;
      String var10000 = ManagementFactory.getRuntimeMXBean().getName();
      Intrinsics.checkNotNullExpressionValue(var10000, true.z<invokedynamic>(17343, 143071075406801919L ^ var1));
      return Integer.parseInt(StringsKt.substringBefore$default(var10000, (char)true.b<invokedynamic>(20790, 7610383203160267159L ^ var1), (String)null, 2, (Object)null));
   }

   protected final void b(short param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   protected final void V(long appId, long a) {
      var3 ^= b;
      long var5 = var3 ^ 67504098206239L;
      long var7 = var3 ^ 100045450552406L;
      long var9 = var3 ^ 1808948551589L;
      long var11 = var3 ^ 83554468159780L;
      long var10001 = var3 ^ 58725201176047L;
      int var13 = (int)((var3 ^ 58725201176047L) >>> 32);
      int var14 = (int)(var10001 << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      boolean var16 = 6791915424707552413L.A<invokedynamic>(6791915424707552413L, var3);

      boolean var18;
      label53: {
         label44:
         try {
            if (var16 && this.d != null) {
               break label44;
            }
            break label53;
         } catch (NumberFormatException var23) {
            throw var23.A<invokedynamic>(var23, 6828310919677966160L, var3);
         }

         var18 = false;
         this.k(var5);
      }

      p0 var24;
      try {
         cq var10000 = this;
         if (var3 > 0L) {
            this.d = this.e(var7);
            if (!var16) {
               return;
            }

            var10000 = this;
         }

         var24 = var10000.d;
         if (var24 == null) {
            return;
         }
      } catch (NumberFormatException var22) {
         throw var22.A<invokedynamic>(var22, 6828310919677966160L, var3);
      }

      p0 var17 = var24;
      var18 = false;
      char var10002 = (char)var14;
      bk var10003 = bk.HANDSHAKE;
      Json var19 = su.catlean.q.K();
      qs var20 = new qs(var9, 1, String.valueOf(var1));
      boolean var21 = false;
      var19.getSerializersModule();
      var17.a(var13, var10002, var10003, (char)var15, var19.encodeToJsonElement((SerializationStrategy)qs.l.G(), var20));
      this.L(var11);
   }

   protected final void G(@NotNull sm presence, long a) {
      var2 ^= b;
      Intrinsics.checkNotNullParameter(var1, true.z<invokedynamic>(29055, 1950079303224330558L ^ var2));
      this.m = var1;
   }

   @Nullable
   public final Unit k(long var1) {
      var1 ^= b;
      boolean var3 = -7140758584509635014L.A<invokedynamic>(-7140758584509635014L, var1);

      p0 var10000;
      Unit var7;
      label33: {
         try {
            if (var3) {
               var10000 = this.d;
               if (var10000 != null) {
                  break label33;
               }
            }
         } catch (NumberFormatException var6) {
            throw var6.A<invokedynamic>(var6, -7177508092163607049L, var1);
         }

         var7 = null;
         return var7;
      }

      p0 var4 = var10000;
      boolean var5 = false;
      var4.E();
      this.d = null;
      this.k = false;
      this.m = null;
      this.R = this.g;
      var7 = Unit.INSTANCE;
      return var7;
   }

   private final void R(long var1) {
      var1 ^= b;
      long var3 = var1 ^ 135919831280173L;
      long var5 = var1 ^ 95170923661461L;
      long var10001 = var1 ^ 95375957817556L;
      int var7 = (int)((var1 ^ 95375957817556L) >>> 32);
      int var8 = (int)(var10001 << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      long var10 = var1 ^ 22237457005480L;
      boolean var12 = -4384740570517851208L.A<invokedynamic>(-4384740570517851208L, var1);

      label53: {
         p0 var10000;
         label42:
         try {
            if (!var12) {
               var10000 = this.d;
               if (var10000 != null) {
                  break label42;
               }
            }
            break label53;
         } catch (NumberFormatException var21) {
            throw var21.A<invokedynamic>(var21, -4325589463439250837L, var1);
         }

         p0 var13 = var10000;
         boolean var14 = false;

         sm var22;
         label30:
         try {
            if (!var12) {
               var22 = this.m;
               if (var22 != null) {
                  break label30;
               }
            }
            break label53;
         } catch (NumberFormatException var20) {
            throw var20.A<invokedynamic>(var20, -4325589463439250837L, var1);
         }

         sm var15 = var22;
         boolean var16 = false;
         char var10002 = (char)var8;
         bk var10003 = bk.FRAME;
         Json var17 = su.catlean.q.K();
         qp var18 = new qp(hd.SET_ACTIVITY, var5, new f4(var3, this.Y(var10), var15));
         boolean var19 = false;
         var17.getSerializersModule();
         var13.a(var7, var10002, var10003, (char)var9, var17.encodeToJsonElement((SerializationStrategy)qp.a.a(), var18));
      }

      this.m = null;
   }

   @Nullable
   public final Unit I(@NotNull t packet, int a, long a) {
      // $FF: Couldn't be decompiled
   }

   private final p0 e(long param1) {
      // $FF: Couldn't be decompiled
   }

   private final void L(long var1) {
      var1 ^= b;
      ThreadsKt.thread$default(true, true, (ClassLoader)null, true.z<invokedynamic>(17552, 4293356539188685670L ^ var1), 0, cq::D, true.b<invokedynamic>(15401, 4906335236132483897L ^ var1), (Object)null);
   }

   private static final Unit D(cq var0) {
      long var1 = b ^ 124016048826630L;
      long var10001 = var1 ^ 95886704917579L;
      int var3 = (int)((var1 ^ 95886704917579L) >>> 48);
      int var4 = (int)(var10001 << 16 >>> 32);
      int var5 = (int)(var10001 << 48 >>> 48);
      var10001 = var1 ^ 7274062522419L;
      int var6 = (int)((var1 ^ 7274062522419L) >>> 48);
      int var7 = (int)(var10001 << 16 >>> 32);
      int var8 = (int)(var10001 << 48 >>> 48);
      boolean var9 = -3974640695976118199L.A<invokedynamic>(-3974640695976118199L, var1);

      Unit var14;
      while(true) {
         if (var0.t((short)var6, var7, (short)var8)) {
            cq var10 = var0;

            Object var11;
            Result.Companion var10000;
            try {
               var10000 = Result.Companion;
               boolean var12 = false;
               var10.b((short)var3, var4, var5);
               var14 = Unit.INSTANCE;
               if (var9) {
                  break;
               }

               var11 = Result.constructor-impl(var14);
            } catch (Throwable var13) {
               var10000 = Result.Companion;
               var11 = Result.constructor-impl(ResultKt.createFailure(var13));
            }

            Thread.sleep(w);
            if (!var9) {
               continue;
            }
         }

         var14 = Unit.INSTANCE;
         break;
      }

      return var14;
   }

   public static void U(boolean var0) {
      o = var0;
   }

   public static boolean D() {
      return o;
   }

   public static boolean B() {
      boolean var0 = D();

      try {
         return !var0;
      } catch (NumberFormatException var1) {
         throw a((Throwable)var1);
      }
   }

   static {
      long var25 = b ^ 23012428345657L;
      i = new HashMap(13);
      false.A<invokedynamic>(false, 5795089620354077172L, var25);
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var17 = 1; var17 < 8; ++var17) {
         var10003[var17] = (byte)((int)(var25 << var17 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[20];
      int var21 = 0;
      String var20 = "\u0088*¥\\s\u0007þ8\u00058\u0080¼c\u0002n1±P\u009a\u0091âÄ0¨wG[ÝÉ\u0006/2´\u0097õØ\u0006Â\u009cå\u0010\u0014\u0013ÈÎ6\u0019\u0094©\u0083é6ÿÑÖ=}\u0010\u0001\u008fPk&\u0016!_\u001d¶\u008eH\u0087\\\u001b\u0098(/Û°\r¦p\u009bsî\u0093TNo\u001dW|\u0089ÔhS\u0098\u008bzNsOöh`¢#8<\u0081\\çï\r^\u008a\u0018\u0090Û4Q\u0004\u0098rËCö¢\u0011\u0018¨\u009cF\u0011T·,&¦\u0099B\u0010>BSüMå\u0080\u0085ã·t?$pf\u009b \u001eiÏ£,Ä;4äºa\u009c\u009f\u0085S\u001bÇ\u0005\"¥\u0099\u0004(W\u008d']U cy\u008a ÍcMøD\u000eF<\u009edå\u009e\u00ad\u0005ð$@\u0087à\u0002\u0096\u001d\u008de*\rºn\tÊ~ü\u0018kn/o\u0019\u0014iM¼ý=\be\u0001ê|¹Î±£\u00935Ýë8T¡³¤?t\u0080'\u0097I7\u0091¸Û5ß_V2Ì6Í¸Õ%V\u007fª\u0096\u008d#ê]Å\u0015\u0097ãCÀ\u00118ø\u0004\u0088\u008do´\u001a\u0018Þor\u0093:\u0005¸\u0010þ\u0014ÃIw\u001a`ü\u0010;\n^\u0016oj6 ×H¤\u00902xñ\u0098-ð\bÆt\u008dQIë÷²õ¸\u000f\u001e£\u008e,¼ÿ9w?A ¢XD}©TdçH\u00947\\¡Ñ+ «\u0089c\u0015è\u0002\u0004v\u0011`Õb^\u000faÍ(Èç¢|\\\u0097/¶·à\u0001S#¸ß\u001a\u0087ôª\u007f¡ú\u0081f\u0092sC)ø1ì}\u0013\u000bG¿\u0004\u0092»0 \u000eS°¸\u0095\u007fM\u001bR\u0000·áZ\u0004\u00045\u008ee ÅVJÄ_\u0004t^ç\t7PA0\u008f\u008aH[\u0086]Á¡l\u0098E[\u009boÚ \u0095ÒÃ-Ü\u0092:£\u0007¹«]1\u0095f\u000f\u0001Z\u008fm§Öbð\u0090F¯xî\u008d¨ã\u0010)T¶¹ùºkuï®ÝëkH?Ø(Y\u0090¿ï´ëK\u0096S%M¡\u008d\u0086\u008e\u0003B\u008a?/£\u0089c,¹¶<\u0084]@¥\u000bS\tú#P\u0082\u0007j";
      int var22 = "\u0088*¥\\s\u0007þ8\u00058\u0080¼c\u0002n1±P\u009a\u0091âÄ0¨wG[ÝÉ\u0006/2´\u0097õØ\u0006Â\u009cå\u0010\u0014\u0013ÈÎ6\u0019\u0094©\u0083é6ÿÑÖ=}\u0010\u0001\u008fPk&\u0016!_\u001d¶\u008eH\u0087\\\u001b\u0098(/Û°\r¦p\u009bsî\u0093TNo\u001dW|\u0089ÔhS\u0098\u008bzNsOöh`¢#8<\u0081\\çï\r^\u008a\u0018\u0090Û4Q\u0004\u0098rËCö¢\u0011\u0018¨\u009cF\u0011T·,&¦\u0099B\u0010>BSüMå\u0080\u0085ã·t?$pf\u009b \u001eiÏ£,Ä;4äºa\u009c\u009f\u0085S\u001bÇ\u0005\"¥\u0099\u0004(W\u008d']U cy\u008a ÍcMøD\u000eF<\u009edå\u009e\u00ad\u0005ð$@\u0087à\u0002\u0096\u001d\u008de*\rºn\tÊ~ü\u0018kn/o\u0019\u0014iM¼ý=\be\u0001ê|¹Î±£\u00935Ýë8T¡³¤?t\u0080'\u0097I7\u0091¸Û5ß_V2Ì6Í¸Õ%V\u007fª\u0096\u008d#ê]Å\u0015\u0097ãCÀ\u00118ø\u0004\u0088\u008do´\u001a\u0018Þor\u0093:\u0005¸\u0010þ\u0014ÃIw\u001a`ü\u0010;\n^\u0016oj6 ×H¤\u00902xñ\u0098-ð\bÆt\u008dQIë÷²õ¸\u000f\u001e£\u008e,¼ÿ9w?A ¢XD}©TdçH\u00947\\¡Ñ+ «\u0089c\u0015è\u0002\u0004v\u0011`Õb^\u000faÍ(Èç¢|\\\u0097/¶·à\u0001S#¸ß\u001a\u0087ôª\u007f¡ú\u0081f\u0092sC)ø1ì}\u0013\u000bG¿\u0004\u0092»0 \u000eS°¸\u0095\u007fM\u001bR\u0000·áZ\u0004\u00045\u008ee ÅVJÄ_\u0004t^ç\t7PA0\u008f\u008aH[\u0086]Á¡l\u0098E[\u009boÚ \u0095ÒÃ-Ü\u0092:£\u0007¹«]1\u0095f\u000f\u0001Z\u008fm§Öbð\u0090F¯xî\u008d¨ã\u0010)T¶¹ùºkuï®ÝëkH?Ø(Y\u0090¿ï´ëK\u0096S%M¡\u008d\u0086\u008e\u0003B\u008a?/£\u0089c,¹¶<\u0084]@¥\u000bS\tú#P\u0082\u0007j".length();
      char var19 = '(';
      int var18 = -1;

      label64:
      while(true) {
         ++var18;
         String var27 = var20.substring(var18, var18 + var19);
         byte var10001 = -1;

         while(true) {
            byte[] var24 = var16.doFinal(var27.getBytes("ISO-8859-1"));
            String var33 = a(var24).intern();
            switch(var10001) {
            case 0:
               var23[var21++] = var33;
               if ((var18 += var19) >= var22) {
                  e = var23;
                  f = new String[20];
                  n = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var25 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[5];
                  int var8 = 0;
                  String var9 = "õ¹'Ù1\u009aí31\u000b¡Ó#ôD\u009aôÿµl¹-l%";
                  int var10 = "õ¹'Ù1\u009aí31\u000b¡Ó#ôD\u009aôÿµl¹-l%".length();
                  int var7 = 0;

                  label46:
                  while(true) {
                     int var31 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                     long[] var30 = var11;
                     var31 = var8++;
                     long var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte var37 = -1;

                     while(true) {
                        long var13 = var36;
                        byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                        long var39 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                        switch(var37) {
                        case 0:
                           var30[var31] = var39;
                           if (var7 >= var10) {
                              j = var11;
                              l = new Integer[5];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var25 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = -395375249862059586L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var36 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var34 = true;
                              w = var36;
                              return;
                           }
                           break;
                        default:
                           var30[var31] = var39;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "\u001aN¦ß¯Jf&ûAJ#\b?X ";
                           var10 = "\u001aN¦ß¯Jf&ûAJ#\b?X ".length();
                           var7 = 0;
                        }

                        var31 = var7;
                        var7 += 8;
                        var12 = var9.substring(var31, var7).getBytes("ISO-8859-1");
                        var30 = var11;
                        var31 = var8++;
                        var36 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        var37 = 0;
                     }
                  }
               }

               var19 = var20.charAt(var18);
               break;
            default:
               var23[var21++] = var33;
               if ((var18 += var19) < var22) {
                  var19 = var20.charAt(var18);
                  continue label64;
               }

               var20 = "X\u0088\u009duu0\"c\u009c\u00041\u0080\u001díx\u0083\u0010êÉ)b·$Üi²þ\u001as®Ûú÷";
               var22 = "X\u0088\u009duu0\"c\u009c\u00041\u0080\u001díx\u0083\u0010êÉ)b·$Üi²þ\u001as®Ûú÷".length();
               var19 = 16;
               var18 = -1;
            }

            ++var18;
            var27 = var20.substring(var18, var18 + var19);
            var10001 = 0;
         }
      }
   }

   private static Throwable a(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28951;
      if (f[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/cq", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)((int)(var1 >>> 56));

         for(int var7 = 1; var7 < 8; ++var7) {
            var6[var7] = (byte)((int)(var1 << var7 * 8 >>> 56));
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = e[var5].getBytes("ISO-8859-1");
         f[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return f[var5];
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
         throw new RuntimeException("su/catlean/cq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 4602;
      if (l[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = j[var3];
         byte[] var7 = new byte[]{(byte)((int)(var5 >>> 56)), (byte)((int)(var5 >>> 48)), (byte)((int)(var5 >>> 40)), (byte)((int)(var5 >>> 32)), (byte)((int)(var5 >>> 24)), (byte)((int)(var5 >>> 16)), (byte)((int)(var5 >>> 8)), (byte)((int)var5)};
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("su/catlean/cq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
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
         throw new RuntimeException("su/catlean/cq" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
