package su.catlean;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
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
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_332;
import net.minecraft.class_6364;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix4f;

public final class ni extends nm {
   @NotNull
   public static final ni E;
   @Nullable
   private static class_6364 B;
   private static boolean F;
   private static long T;
   private static final long c = j0.a(8233859222698784817L, 1981516600820636351L, MethodHandles.lookup().lookupClass()).a(17901330263702L);
   private static final String[] d;
   private static final String[] e;
   private static final Map i;
   private static final long[] j;
   private static final Integer[] m;
   private static final Map n;
   private static final long p;

   private ni(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 56497982432323L;
      super(true.y<invokedynamic>(6606, 7216196316603268765L ^ var1), var3);
   }

   @Nullable
   public final class_6364 G() {
      return B;
   }

   public final void u(@Nullable class_6364 <set-?>) {
      B = var1;
   }

   public final boolean k() {
      return F;
   }

   public final void e(boolean <set-?>) {
      F = var1;
   }

   public void k(@NotNull class_332 context, long a) {
      // $FF: Couldn't be decompiled
   }

   public void O(@NotNull class_332 context, long a) {
      long var4 = var2 ^ 103115379732612L;
      long var10001 = var2 ^ 125808327138510L;
      int var6 = (int)((var2 ^ 125808327138510L) >>> 32);
      int var7 = (int)(var10001 << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var2 ^ 63619569429831L;
      Intrinsics.checkNotNullParameter(var1, true.y<invokedynamic>(24608, 3919524214644209470L ^ var2));
      this.P(var9);
      this.s(var6, var1, this.Q(var4), (short)var7, (char)var8);
   }

   private final void t(class_332 param1, float param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   private final void P(long var1) {
      var1 ^= c;
      long var3 = var1 ^ 103853876363513L;
      long var5 = var1 ^ 81254650016769L;
      long var10001 = var1 ^ 88023026980049L;
      int var7 = (int)((var1 ^ 88023026980049L) >>> 48);
      int var8 = (int)(var10001 << 16 >>> 48);
      int var9 = (int)(var10001 << 32 >>> 32);
      long var10 = var1 ^ 101982112042756L;
      var10001 = var1 ^ 109659018495324L;
      int var12 = (int)((var1 ^ 109659018495324L) >>> 32);
      int var13 = (int)(var10001 << 32 >>> 48);
      int var14 = (int)(var10001 << 48 >>> 48);
      long var15 = var1 ^ 58978470536999L;
      float var17 = (float)s8.H((short)var7, (short)var8, var9).method_22683().method_4486();
      float var18 = (float)s8.H((short)var7, (short)var8, var9).method_22683().method_4502();
      VertexFormat var10002 = class_290.field_1575;
      Intrinsics.checkNotNullExpressionValue(var10002, true.y<invokedynamic>(13113, 221259316532292107L ^ var1));
      ib var19 = new ib(var10002, 0, false, true.c<invokedynamic>(19782, 1838730278572046563L ^ var1), var5, (DefaultConstructorMarker)null);
      ib var10000 = ib.P(var19, 0.0F, var18, 0.0F, var10, 4, (Object)null).k(var12, 0.0F, 0.0F, (short)var13, (char)var14);
      Color var20 = Color.WHITE;
      Intrinsics.checkNotNullExpressionValue(var20, true.y<invokedynamic>(32581, 6039766547913238128L ^ var1));
      var10000.N(var20, var3);
      var10000 = ib.P(var19, var17, var18, 0.0F, var10, 4, (Object)null).k(var12, 1.0F, 0.0F, (short)var13, (char)var14);
      var20 = Color.WHITE;
      Intrinsics.checkNotNullExpressionValue(var20, true.y<invokedynamic>(26572, 6583108634219904764L ^ var1));
      var10000.N(var20, var3);
      var10000 = ib.P(var19, var17, 0.0F, 0.0F, var10, 4, (Object)null).k(var12, 1.0F, 1.0F, (short)var13, (char)var14);
      var20 = Color.WHITE;
      Intrinsics.checkNotNullExpressionValue(var20, true.y<invokedynamic>(26572, 6583108634219904764L ^ var1));
      var10000.N(var20, var3);
      var10000 = ib.P(var19, 0.0F, 0.0F, 0.0F, var10, 4, (Object)null).k(var12, 0.0F, 1.0F, (short)var13, (char)var14);
      var20 = Color.WHITE;
      Intrinsics.checkNotNullExpressionValue(var20, true.y<invokedynamic>(26572, 6583108634219904764L ^ var1));
      var10000.N(var20, var3);
      RenderPipeline var22 = v2.S.W();
      class_276 var21 = s8.H((short)var7, (short)var8, var9).method_1522();
      Intrinsics.checkNotNullExpressionValue(var21, true.y<invokedynamic>(29647, 3749099688548920056L ^ var1));
      String var10007 = 11093.y<invokedynamic>(11093, 1792529371797140073L ^ var1);
      class_6364 var10008 = B;
      Intrinsics.checkNotNull(var10008);
      GpuTextureView var23 = var10008.method_71639();
      Intrinsics.checkNotNull(var23);
      ib.j(var19, var22, var21, var15, (GpuBufferSlice)null, (Matrix4f)null, (Matrix3x2f)null, MapsKt.mapOf(TuplesKt.to(var10007, var23)), true.c<invokedynamic>(28946, 7052905398127297718L ^ var1), (Object)null);
   }

   private final void s(int param1, class_332 param2, float param3, short param4, char param5) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var25 = c ^ 107822277959574L;
      long var27 = var25 ^ 90768599353337L;
      i = new HashMap(13);
      Cipher var16;
      Cipher var10000 = var16 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var17 = 1; var17 < 8; ++var17) {
         var10003[var17] = (byte)((int)(var25 << var17 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var23 = new String[14];
      int var21 = 0;
      String var20 = "VÎ3.mí\u0087Å\u0084ù¹\u0099\u0088\u008e5eõb|ß\u0087'\u0015úÃ\u001fÉh#~¡Ñ\u0010¹9{\u009a\u0086 \u0094\n\u0087\u001f¥Ü&r\u0003\u0015\u0010\u009c\u0015»¬)Õ\u009d*uIp\bdø¸ä(É\u0012e°\u0094!\\©_ÕÈå\u0088Zêo\u00851Ø\u008e\u00846\u001fTX¬ö\u0087Áä\u008f·\u00978§·\u001fèú/\u0010Ïêg.º±Bõ8\u0090²Ã8[í4(uòÉ\u00ad\u008f\u0016Ró¶\u0086sÎ~Õwb2\u0092Î*ÿ\u008edæGU1~2\u0083J\tWd,v\u009c\u0005z\u000f8\u008b]Ó¹7\u0081\u0099\u0001\u0005\u0083\u0007¹Ò½mé6æ#\u0017\u0012ô$Ý=\u0085ß\u0080ÒÐ)\u0007\r¤ÆA\u001f&:°\u0081«Myñ\u0014¦\u0084XO\u0084ÜE\u0004Ñ\u0014\u0018e0\u001a\u001d\u0096!\"dý«5K]Òûí\u008ev»Þ)÷A1 ¾õÓ¼e\u0098ßÕöªn\u001c½¢SùÛç±2\u0011(TßÐ\u0092¥ìL\u000fNc\u0080Æ«jU!ë/\u009c\u0001õ:\u0081êãB\u0086\nüGòÞ-dÈ\f\u0012\u007f\u001d5§hcÊAª\u008dF®\r\nÎÉÁ\u00039Ó\u0088;\u0011hIz\u001cÙ[b~D¼\u0097+;öH41aEû\"ñÅ¢¦ú¯ÃL\u0013·_8E\u009c¶\u0010À¡ð\u0014\"äFñ[/\u00121\u0098\f\u0088iåfÑ?(\u0002y\u0084\"¼°\\\u001aM?¨\u0087÷\u009c:°/|>ó¿ \u009c4$_B:\u0099\u0082ÞótW,\u0010i\u001eÞó\u0011\u0080ÆKú\bÒ\u008b\u0097çwÁ¡\u009c ÎüxÙ,iWÒÏÿ\u0089\u009akÝ\u0010\u0083Î\u009c·xÎ\"\u0016Ó\u0082â\r\u0097'è\bP";
      int var22 = "VÎ3.mí\u0087Å\u0084ù¹\u0099\u0088\u008e5eõb|ß\u0087'\u0015úÃ\u001fÉh#~¡Ñ\u0010¹9{\u009a\u0086 \u0094\n\u0087\u001f¥Ü&r\u0003\u0015\u0010\u009c\u0015»¬)Õ\u009d*uIp\bdø¸ä(É\u0012e°\u0094!\\©_ÕÈå\u0088Zêo\u00851Ø\u008e\u00846\u001fTX¬ö\u0087Áä\u008f·\u00978§·\u001fèú/\u0010Ïêg.º±Bõ8\u0090²Ã8[í4(uòÉ\u00ad\u008f\u0016Ró¶\u0086sÎ~Õwb2\u0092Î*ÿ\u008edæGU1~2\u0083J\tWd,v\u009c\u0005z\u000f8\u008b]Ó¹7\u0081\u0099\u0001\u0005\u0083\u0007¹Ò½mé6æ#\u0017\u0012ô$Ý=\u0085ß\u0080ÒÐ)\u0007\r¤ÆA\u001f&:°\u0081«Myñ\u0014¦\u0084XO\u0084ÜE\u0004Ñ\u0014\u0018e0\u001a\u001d\u0096!\"dý«5K]Òûí\u008ev»Þ)÷A1 ¾õÓ¼e\u0098ßÕöªn\u001c½¢SùÛç±2\u0011(TßÐ\u0092¥ìL\u000fNc\u0080Æ«jU!ë/\u009c\u0001õ:\u0081êãB\u0086\nüGòÞ-dÈ\f\u0012\u007f\u001d5§hcÊAª\u008dF®\r\nÎÉÁ\u00039Ó\u0088;\u0011hIz\u001cÙ[b~D¼\u0097+;öH41aEû\"ñÅ¢¦ú¯ÃL\u0013·_8E\u009c¶\u0010À¡ð\u0014\"äFñ[/\u00121\u0098\f\u0088iåfÑ?(\u0002y\u0084\"¼°\\\u001aM?¨\u0087÷\u009c:°/|>ó¿ \u009c4$_B:\u0099\u0082ÞótW,\u0010i\u001eÞó\u0011\u0080ÆKú\bÒ\u008b\u0097çwÁ¡\u009c ÎüxÙ,iWÒÏÿ\u0089\u009akÝ\u0010\u0083Î\u009c·xÎ\"\u0016Ó\u0082â\r\u0097'è\bP".length();
      char var19 = ' ';
      int var18 = -1;

      label64:
      while(true) {
         ++var18;
         String var29 = var20.substring(var18, var18 + var19);
         byte var10001 = -1;

         while(true) {
            byte[] var24 = var16.doFinal(var29.getBytes("ISO-8859-1"));
            String var35 = b(var24).intern();
            switch(var10001) {
            case 0:
               var23[var21++] = var35;
               if ((var18 += var19) >= var22) {
                  d = var23;
                  e = new String[14];
                  n = new HashMap(13);
                  Cipher var5;
                  var10000 = var5 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var6 = 1; var6 < 8; ++var6) {
                     var10003[var6] = (byte)((int)(var25 << var6 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var11 = new long[16];
                  int var8 = 0;
                  String var9 = "åqh¤çv\u0089,Kðu`ÙÊú\u0002fwhøÙv48Ä´îV~\\Å«\u0084\u0098\u0099À¼´[#±æN¬ã\u0012£ÉÖCwýR%6\tvðÔØç?_ùT>E9=Ù]ªÀkÙ9+ÑØà\u0096\u0084\u0080¥K$+[ßò;@Ï¢ûû\u0091H/å\u000e»<F¡\u0007\u0094R<\u0084¸C";
                  int var10 = "åqh¤çv\u0089,Kðu`ÙÊú\u0002fwhøÙv48Ä´îV~\\Å«\u0084\u0098\u0099À¼´[#±æN¬ã\u0012£ÉÖCwýR%6\tvðÔØç?_ùT>E9=Ù]ªÀkÙ9+ÑØà\u0096\u0084\u0080¥K$+[ßò;@Ï¢ûû\u0091H/å\u000e»<F¡\u0007\u0094R<\u0084¸C".length();
                  int var7 = 0;

                  label46:
                  while(true) {
                     int var33 = var7;
                     var7 += 8;
                     byte[] var12 = var9.substring(var33, var7).getBytes("ISO-8859-1");
                     long[] var32 = var11;
                     var33 = var8++;
                     long var38 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                     byte var39 = -1;

                     while(true) {
                        long var13 = var38;
                        byte[] var15 = var5.doFinal(new byte[]{(byte)((int)(var13 >>> 56)), (byte)((int)(var13 >>> 48)), (byte)((int)(var13 >>> 40)), (byte)((int)(var13 >>> 32)), (byte)((int)(var13 >>> 24)), (byte)((int)(var13 >>> 16)), (byte)((int)(var13 >>> 8)), (byte)((int)var13)});
                        long var41 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
                        switch(var39) {
                        case 0:
                           var32[var33] = var41;
                           if (var7 >= var10) {
                              j = var11;
                              m = new Integer[16];
                              Cipher var0;
                              var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                              var10002 = SecretKeyFactory.getInstance("DES");
                              var10003 = new byte[]{(byte)((int)(var25 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                              for(int var1 = 1; var1 < 8; ++var1) {
                                 var10003[var1] = (byte)((int)(var25 << var1 * 8 >>> 56));
                              }

                              var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                              long var2 = 4490398571617188010L;
                              byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                              var38 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                              boolean var36 = true;
                              p = var38;
                              E = new ni(var27);
                              return;
                           }
                           break;
                        default:
                           var32[var33] = var41;
                           if (var7 < var10) {
                              continue label46;
                           }

                           var9 = "\u007fé\u0002½\u0080×òîÍ\u0015âzûáFl";
                           var10 = "\u007fé\u0002½\u0080×òîÍ\u0015âzûáFl".length();
                           var7 = 0;
                        }

                        var33 = var7;
                        var7 += 8;
                        var12 = var9.substring(var33, var7).getBytes("ISO-8859-1");
                        var32 = var11;
                        var33 = var8++;
                        var38 = ((long)var12[0] & 255L) << 56 | ((long)var12[1] & 255L) << 48 | ((long)var12[2] & 255L) << 40 | ((long)var12[3] & 255L) << 32 | ((long)var12[4] & 255L) << 24 | ((long)var12[5] & 255L) << 16 | ((long)var12[6] & 255L) << 8 | (long)var12[7] & 255L;
                        var39 = 0;
                     }
                  }
               }

               var19 = var20.charAt(var18);
               break;
            default:
               var23[var21++] = var35;
               if ((var18 += var19) < var22) {
                  var19 = var20.charAt(var18);
                  continue label64;
               }

               var20 = "\u001a \u008aUó\u0013\u00829¯h½OêåOl l ä\u0006\u009fX\u0083¨NL\u0093aèî3\u0003«Âd\f\u000b\r¥ãëT÷\u001dÂÍ\u0087Ï";
               var22 = "\u001a \u008aUó\u0013\u00829¯h½OêåOl l ä\u0006\u009fX\u0083¨NL\u0093aèî3\u0003«Âd\f\u000b\r¥ãëT÷\u001dÂÍ\u0087Ï".length();
               var19 = 16;
               var18 = -1;
            }

            ++var18;
            var29 = var20.substring(var18, var18 + var19);
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

   private static String b(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16185;
      if (e[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])i.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               i.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("su/catlean/ni", var10);
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
      String var7 = b(var4, var5);
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
         throw new RuntimeException("su/catlean/ni" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int d(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21422;
      if (m[var3] == null) {
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
            throw new RuntimeException("su/catlean/ni", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
   }

   private static int d(Lookup var0, MutableCallSite var1, String var2, Object[] var3) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = d(var4, var5);
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
         throw new RuntimeException("su/catlean/ni" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
