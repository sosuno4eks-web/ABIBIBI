package su.catlean;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.ScreenEvent;
import su.catlean.gofra.Flow;

public final class nf {
   @NotNull
   public static final nf s;
   @NotNull
   private static xz g;
   private static int T;
   private static final long a = j0.a(1119597678092008448L, 498791273161427140L, MethodHandles.lookup().lookupClass()).a(115470194024593L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;
   private static final long e;

   private nf() {
   }

   @Flow
   private final void a(ScreenEvent var1) {
      long var2 = a ^ 28476976697285L;
      long var10001 = var2 ^ 73371828239813L;
      int var4 = (int)((var2 ^ 73371828239813L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 48);
      int var6 = (int)(var10001 << 32 >>> 32);
      int var7 = 5651540743772714606L.A<invokedynamic>(5651540743772714606L, var2);
      if (!Intrinsics.areEqual((Object)s8.H((short)var4, (short)var5, var6).field_1690.field_1883, (Object)g.P())) {
         Iterable var8 = (Iterable)xz.c();
         boolean var9 = false;
         Iterator var10 = var8.iterator();

         Object var10000;
         label34:
         while(true) {
            if (!var10.hasNext()) {
               var10000 = null;
               break;
            }

            Object var11 = var10.next();
            var10000 = var11;

            while(true) {
               xz var12 = (xz)var10000;
               boolean var13 = false;
               if (!Intrinsics.areEqual((Object)var12.P(), (Object)s8.H((short)var4, (short)var5, var6).field_1690.field_1883)) {
                  break;
               }

               var10000 = var11;
               if (var7 != 0) {
                  break label34;
               }
            }
         }

         xz var15;
         try {
            var15 = (xz)var10000;
            if (var15 == null) {
               var15 = xz.EN;
            }
         } catch (IllegalFormatException var14) {
            throw var14.A<invokedynamic>(var14, 5677012224601519261L, var2);
         }

         g = var15;
      }

   }

   @NotNull
   public final String G(@NotNull String key, long a, @NotNull Object[] args) {
      // $FF: Couldn't be decompiled
   }

   public final void i(long var1) {
      var1 ^= a;
      int var10000 = 3408715694732775352L.A<invokedynamic>(3408715694732775352L, var1);
      nf var4 = this;
      int var3 = var10000;

      Object var5;
      Result.Companion var23;
      try {
         var23 = Result.Companion;
         nf var19 = (nf)var4;
         boolean var6 = false;
         Iterator var7 = xz.c().iterator();

         label103:
         while(true) {
            boolean var24 = var7.hasNext();

            while(true) {
               if (!var24) {
                  break label103;
               }

               xz var8 = (xz)var7.next();
               ClassLoader var25 = CatLean.class.getClassLoader();
               String var10001 = var8.name().toLowerCase(Locale.ROOT);
               Intrinsics.checkNotNullExpressionValue(var10001, true.g<invokedynamic>(9674, 7133035017723576524L ^ var1));
               String var10003 = true.g<invokedynamic>(29331, 5116210804684838806L ^ var1);
               InputStream var9 = var25.getResourceAsStream(var10003 + var10001 + true.g<invokedynamic>(18222, 7898271506026291754L ^ var1));

               label99:
               while(true) {
                  Json.Default var27;
                  BufferedReader var28;
                  label119: {
                     var27 = Json.Default;
                     Intrinsics.checkNotNull(var9);
                     Charset var11 = Charsets.UTF_8;
                     Reader var12 = (Reader)(new InputStreamReader(var9, var11));
                     int var13 = (int)e;
                     Reader var26 = var12;
                     if (var3 == 0) {
                        label118: {
                           try {
                              if (var26 instanceof BufferedReader) {
                                 var26 = var12;
                                 break label118;
                              }
                           } catch (Throwable var15) {
                              throw var15.A<invokedynamic>(var15, 3397937123332986226L, var1);
                           }

                           var28 = new BufferedReader(var12, var13);
                           break label119;
                        }
                     }

                     var28 = (BufferedReader)var26;
                  }

                  JsonElement var14 = var27.parseToJsonElement(TextStreamsKt.readText((Reader)var28));

                  JsonElement var29;
                  label77: {
                     try {
                        var29 = var14;
                        if (var3 != 0) {
                           break label77;
                        }

                        var24 = var14 instanceof JsonObject;
                        if (var1 < 0L) {
                           break;
                        }

                        if (!var24) {
                           continue label103;
                        }
                     } catch (Throwable var16) {
                        throw var16.A<invokedynamic>(var16, 3397937123332986226L, var1);
                     }

                     var29 = var14;
                  }

                  Iterator var10 = ((Map)var29).entrySet().iterator();

                  label97:
                  while(true) {
                     var10000 = var10.hasNext();

                     label95:
                     while(true) {
                        if (var10000 == 0) {
                           continue label103;
                        }

                        Entry var20 = (Entry)var10.next();
                        String var21 = (String)var20.getKey();
                        JsonElement var22 = (JsonElement)var20.getValue();
                        var8.i().put(var21, JsonElementKt.getJsonPrimitive(var22).getContent());

                        do {
                           var10000 = var3;
                           if (var1 < 0L) {
                              continue label95;
                           }

                           if (var3 != 0) {
                              continue label99;
                           }

                           try {
                              var10000 = var3;
                              if (var1 <= 0L) {
                                 continue label95;
                              }

                              if (var1 > 0L) {
                                 if (var3 != 0) {
                                    return;
                                 }

                                 var10000 = var3;
                              }

                              if (var10000 == 0) {
                                 continue label97;
                              }
                           } catch (Throwable var17) {
                              throw var17.A<invokedynamic>(var17, 3397937123332986226L, var1);
                           }
                        } while(var1 < 0L);

                        (new int[4]).A<invokedynamic>(new int[4], 3449673505809034340L, var1);
                        break label103;
                     }
                  }
               }
            }
         }

         var5 = Result.constructor-impl(Unit.INSTANCE);
      } catch (Throwable var18) {
         var23 = Result.Companion;
         var5 = Result.constructor-impl(ResultKt.createFailure(var18));
      }

   }

   static {
      long var14 = a ^ 49792027290430L;
      d = new HashMap(13);
      0.A<invokedynamic>(0, -6125886326825077213L, var14);
      Cipher var5;
      Cipher var10000 = var5 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var6 = 1; var6 < 8; ++var6) {
         var10003[var6] = (byte)((int)(var14 << var6 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var12 = new String[8];
      int var10 = 0;
      String var9 = "\u0086¾ì-w\u0097Rß\u001d\n\u0085ë\u001dQ®½\u0018Èpce\u0085ÏÅ\u009d\n`ä\u0083¤ j+k\u0090Ê\u0088\u0091 2\u0091\u0010ÛG\u0080\u0094Cm\u009d:¿Ò¶é\u008f\u0011\u000f\u0098\u0018$\u000eGi<¤#{\bNêÍ¦!ÆQÁ'º\bª\u0092F_\u0018½©»UÛÂ{«\u001aô\u008beU\u008céÑ\n¾àÁxåö´(\u009cqtÞÒ\u0016©Ý\u0085°\u001aW]\u001fý`\u0090\b]\u009fZ\fô@\u0097ñt\u0087µòÈ\u001fÜÕü¾d_æ÷";
      int var11 = "\u0086¾ì-w\u0097Rß\u001d\n\u0085ë\u001dQ®½\u0018Èpce\u0085ÏÅ\u009d\n`ä\u0083¤ j+k\u0090Ê\u0088\u0091 2\u0091\u0010ÛG\u0080\u0094Cm\u009d:¿Ò¶é\u008f\u0011\u000f\u0098\u0018$\u000eGi<¤#{\bNêÍ¦!ÆQÁ'º\bª\u0092F_\u0018½©»UÛÂ{«\u001aô\u008beU\u008céÑ\n¾àÁxåö´(\u009cqtÞÒ\u0016©Ý\u0085°\u001aW]\u001fý`\u0090\b]\u009fZ\fô@\u0097ñt\u0087µòÈ\u001fÜÕü¾d_æ÷".length();
      char var8 = 16;
      int var7 = -1;

      label37:
      while(true) {
         ++var7;
         String var16 = var9.substring(var7, var7 + var8);
         byte var10001 = -1;

         while(true) {
            byte[] var13 = var5.doFinal(var16.getBytes("ISO-8859-1"));
            String var21 = a(var13).intern();
            switch(var10001) {
            case 0:
               var12[var10++] = var21;
               if ((var7 += var8) >= var11) {
                  b = var12;
                  c = new String[8];
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var14 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var14 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long var2 = 4021329369062279316L;
                  byte[] var4 = var0.doFinal(new byte[]{(byte)((int)(var2 >>> 56)), (byte)((int)(var2 >>> 48)), (byte)((int)(var2 >>> 40)), (byte)((int)(var2 >>> 32)), (byte)((int)(var2 >>> 24)), (byte)((int)(var2 >>> 16)), (byte)((int)(var2 >>> 8)), (byte)((int)var2)});
                  long var23 = ((long)var4[0] & 255L) << 56 | ((long)var4[1] & 255L) << 48 | ((long)var4[2] & 255L) << 40 | ((long)var4[3] & 255L) << 32 | ((long)var4[4] & 255L) << 24 | ((long)var4[5] & 255L) << 16 | ((long)var4[6] & 255L) << 8 | (long)var4[7] & 255L;
                  boolean var19 = true;
                  e = var23;
                  s = new nf();
                  g = xz.EN;
                  return;
               }

               var8 = var9.charAt(var7);
               break;
            default:
               var12[var10++] = var21;
               if ((var7 += var8) < var11) {
                  var8 = var9.charAt(var7);
                  continue label37;
               }

               var9 = "SïábÑ5§ÛC{\u0084P0B\u0087ÛPÐ\u001d¹\u000eh«\u0015\u0093ÑÓ;\u001c\u0003QGV\u0004b^ Å\bÓ\u0014jM\fÕÃ@,\u0010\u008d_¿8Æ\u0088f¡\u001a9\u001c¿Àºóå";
               var11 = "SïábÑ5§ÛC{\u0084P0B\u0087ÛPÐ\u001d¹\u000eh«\u0015\u0093ÑÓ;\u001c\u0003QGV\u0004b^ Å\bÓ\u0014jM\fÕÃ@,\u0010\u008d_¿8Æ\u0088f¡\u001a9\u001c¿Àºóå".length();
               var8 = '0';
               var7 = -1;
            }

            ++var7;
            var16 = var9.substring(var7, var7 + var8);
            var10001 = 0;
         }
      }
   }

   public static void p(int var0) {
      T = var0;
   }

   public static int q() {
      return T;
   }

   public static int j() {
      int var0 = q();

      try {
         return var0 == 0 ? 45 : 0;
      } catch (IllegalFormatException var1) {
         throw a((Throwable)var1);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 3056;
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
            throw new RuntimeException("su/catlean/nf", var10);
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
         throw new RuntimeException("su/catlean/nf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
