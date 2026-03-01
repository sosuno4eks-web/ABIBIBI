package su.catlean;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class i1 {
   @NotNull
   public static final i1 N;
   private static final char m;
   private static final long a = j0.a(7067350985353729107L, 2292006460368129023L, MethodHandles.lookup().lookupClass()).a(124360374435969L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d = new HashMap(13);
   private static final long[] e;
   private static final Integer[] f;
   private static final Map g;

   private i1() {
   }

   @NotNull
   public final String i(@NotNull class_2561 t, long a) {
      var2 ^= a;
      Intrinsics.checkNotNullParameter(var1, "t");
      StringBuilder var4 = new StringBuilder();
      int[] var6 = new int[]{true.l<invokedynamic>(14953, 3702669711877240566L ^ var2)};
      var1.method_27658(i1::P, class_2583.field_24360);
      var4.append((char)true.l<invokedynamic>(14320, 8280341201971608417L ^ var2)).append((char)true.l<invokedynamic>(21531, 6949217721185278082L ^ var2));
      String var10000 = var4.toString();
      Intrinsics.checkNotNullExpressionValue(var10000, true.d<invokedynamic>(17469, 2330419388886083693L ^ var2));
      return var10000;
   }

   private final String D(long var1, int var3) {
      var1 ^= a;
      long var4 = var1 ^ 135182027861095L;
      long var6 = var1 ^ 142324393512L;
      String var10000 = -6099564497669240639L.A<invokedynamic>(-6099564497669240639L, var1);
      Character var9 = this.n(var6, var3);
      String var8 = var10000;

      Character var11;
      try {
         var11 = var9;
         if (var8 != null) {
            return "§" + var11;
         }

         if (var9 == null) {
            return this.p(var3, var4);
         }
      } catch (NumberFormatException var10) {
         throw var10.A<invokedynamic>(var10, -6191986101342379285L, var1);
      }

      var11 = var9;
      return "§" + var11;
   }

   private final String p(int var1, long var2) {
      var2 ^= a;
      StringCompanionObject var10000 = StringCompanionObject.INSTANCE;
      Locale var7 = Locale.ROOT;
      String var14 = -7639574738166581662L.A<invokedynamic>(-7639574738166581662L, var2);
      String var8 = true.d<invokedynamic>(6016, 5750760011008546652L ^ var2);
      String var4 = var14;
      Object[] var9 = new Object[]{var1 & true.l<invokedynamic>(28481, 6383414507513122631L ^ var2)};
      var14 = String.format(var7, var8, Arrays.copyOf(var9, var9.length));
      Intrinsics.checkNotNullExpressionValue(var14, true.d<invokedynamic>(15464, 2779120625236032695L ^ var2));
      String var5 = var14;
      StringBuilder var6 = new StringBuilder(true.l<invokedynamic>(26479, 99997977177982832L ^ var2));
      var6.append((char)true.l<invokedynamic>(30471, 657232974044632834L ^ var2)).append((char)true.l<invokedynamic>(12203, 6148790636913938342L ^ var2));
      int var11 = 0;
      int var12 = var5.length();

      StringBuilder var15;
      label33:
      while(true) {
         if (var11 < var12) {
            var14 = var5;
            if (var2 < 0L) {
               return var14;
            }

            char var13 = var5.charAt(var11);

            do {
               try {
                  var15 = var6.append((char)true.l<invokedynamic>(30471, 657232974044632834L ^ var2)).append(var13);
                  if (var4 != null) {
                     break label33;
                  }

                  ++var11;
                  if (var4 == null) {
                     continue label33;
                  }
               } catch (NumberFormatException var10) {
                  throw var10.A<invokedynamic>(var10, -7731945721354789816L, var2);
               }
            } while(var2 < 0L);
         }

         var15 = var6;
         break;
      }

      var14 = var15.toString();
      Intrinsics.checkNotNullExpressionValue(var14, true.d<invokedynamic>(894, 3775112994777039776L ^ var2));
      return var14;
   }

   @Nullable
   public final Character n(long a, int rgb) {
      var1 ^= a;
      String var4 = 6896626847194922029L.A<invokedynamic>(6896626847194922029L, var1);

      int var10000;
      Character var6;
      label156: {
         label157: {
            label158: {
               label159: {
                  label160: {
                     label161: {
                        label162: {
                           label163: {
                              label164: {
                                 label165: {
                                    label166: {
                                       label167: {
                                          label168: {
                                             label169: {
                                                label170: {
                                                   label171: {
                                                      label86: {
                                                         try {
                                                            var10000 = var3 & true.l<invokedynamic>(30879, 5970043646429647571L ^ var1);
                                                            if (var4 != null) {
                                                               break label156;
                                                            }

                                                            switch(var10000) {
                                                            case 0:
                                                               break;
                                                            case 170:
                                                               break label157;
                                                            case 43520:
                                                               break label158;
                                                            case 43690:
                                                               break label159;
                                                            case 5592405:
                                                               break label164;
                                                            case 5592575:
                                                               break label165;
                                                            case 5635925:
                                                               break label166;
                                                            case 5636095:
                                                               break label167;
                                                            case 11141120:
                                                               break label160;
                                                            case 11141290:
                                                               break label161;
                                                            case 11184810:
                                                               break label163;
                                                            case 16733525:
                                                               break label168;
                                                            case 16733695:
                                                               break label169;
                                                            case 16755200:
                                                               break label162;
                                                            case 16777045:
                                                               break label170;
                                                            case 16777215:
                                                               break label171;
                                                            default:
                                                               break label86;
                                                            }
                                                         } catch (NumberFormatException var5) {
                                                            throw var5.A<invokedynamic>(var5, 6844880474691212807L, var1);
                                                         }

                                                         var10000 = 16445.l<invokedynamic>(16445, 1678477842574731880L ^ var1);
                                                         break label156;
                                                      }

                                                      var6 = null;
                                                      return var6;
                                                   }

                                                   var6 = Character.valueOf((char)true.l<invokedynamic>(6768, 8975235138379493435L ^ var1));
                                                   return var6;
                                                }

                                                var6 = Character.valueOf((char)true.l<invokedynamic>(2423, 5263950370462049056L ^ var1));
                                                return var6;
                                             }

                                             var6 = Character.valueOf((char)true.l<invokedynamic>(16916, 6169485569611294810L ^ var1));
                                             return var6;
                                          }

                                          var6 = Character.valueOf((char)true.l<invokedynamic>(8699, 1113364083314822061L ^ var1));
                                          return var6;
                                       }

                                       var6 = Character.valueOf((char)true.l<invokedynamic>(12080, 6976837302762341743L ^ var1));
                                       return var6;
                                    }

                                    var6 = Character.valueOf((char)true.l<invokedynamic>(29698, 8137100628790533715L ^ var1));
                                    return var6;
                                 }

                                 var6 = Character.valueOf((char)true.l<invokedynamic>(12229, 1225249190495257994L ^ var1));
                                 return var6;
                              }

                              var6 = Character.valueOf((char)true.l<invokedynamic>(7787, 7298634285067711551L ^ var1));
                              return var6;
                           }

                           var6 = Character.valueOf((char)true.l<invokedynamic>(13183, 8083661055285106982L ^ var1));
                           return var6;
                        }

                        var6 = Character.valueOf((char)true.l<invokedynamic>(5425, 3115278428827205481L ^ var1));
                        return var6;
                     }

                     var6 = Character.valueOf((char)true.l<invokedynamic>(26420, 5510292648944192878L ^ var1));
                     return var6;
                  }

                  var6 = Character.valueOf((char)true.l<invokedynamic>(3859, 115571577353348429L ^ var1));
                  return var6;
               }

               var6 = Character.valueOf((char)true.l<invokedynamic>(8732, 8513293153901676625L ^ var1));
               return var6;
            }

            var6 = Character.valueOf((char)true.l<invokedynamic>(27804, 8679332206401799872L ^ var1));
            return var6;
         }

         var6 = Character.valueOf((char)true.l<invokedynamic>(4413, 6009649485444103029L ^ var1));
         return var6;
      }

      var6 = Character.valueOf((char)var10000);
      return var6;
   }

   private static final Optional P(int[] param0, StringBuilder param1, class_2583 param2, String param3) {
      // $FF: Couldn't be decompiled
   }

   static {
      long var11 = a ^ 7250033906222L;
      Cipher var13;
      Cipher var10000 = var13 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var14 = 1; var14 < 8; ++var14) {
         var10003[var14] = (byte)((int)(var11 << var14 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var20 = new String[6];
      int var18 = 0;
      String var17 = "×ÑÏþ\u0006Þ-GÑ¿c*5þi\u001c6\u008a\u008dªðä\u0000ò\u0010V\u009f\u001b\u0006á\u0082?¸Ö`¼&\u0084\r\u008eó\u0018\u000eÒ:\u00ad{#\u0096HÒÔÆ\u0099¡Þ«f\u0015±¤ö\u0080ÊÔ] \u0080$\u0095\u008c°;çò(@\u0090¥\u000e?ãÒ\u0080yÿ´\u0004\\\u0000bÊ¹\n4Þº\f\u0083";
      int var19 = "×ÑÏþ\u0006Þ-GÑ¿c*5þi\u001c6\u008a\u008dªðä\u0000ò\u0010V\u009f\u001b\u0006á\u0082?¸Ö`¼&\u0084\r\u008eó\u0018\u000eÒ:\u00ad{#\u0096HÒÔÆ\u0099¡Þ«f\u0015±¤ö\u0080ÊÔ] \u0080$\u0095\u008c°;çò(@\u0090¥\u000e?ãÒ\u0080yÿ´\u0004\\\u0000bÊ¹\n4Þº\f\u0083".length();
      char var16 = 24;
      int var15 = -1;

      label54:
      while(true) {
         ++var15;
         String var22 = var17.substring(var15, var15 + var16);
         byte var10001 = -1;

         while(true) {
            byte[] var21 = var13.doFinal(var22.getBytes("ISO-8859-1"));
            String var28 = a(var21).intern();
            switch(var10001) {
            case 0:
               var20[var18++] = var28;
               if ((var15 += var16) >= var19) {
                  b = var20;
                  c = new String[6];
                  g = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var11 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var11 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[26];
                  int var3 = 0;
                  String var4 = "d\u009e])R;´ä±\u0097}à8ùÀ\u0090y\u000eÔI\u008aû6n)\u0014.Ãq\u0091¸Ä¾ZgËï Ù¢-\u009d\u0095>â~Ë A \u0094çD*úü+\"I\u0014M$^*Ñb}+\u001e\u0017\u0090\u0095Õ2\u0001\u0001å¹Ên\u0007Æý¥\u0094;#\u008e\u0081 Ó©à)\\\u009d}Þwg3\u001b<¿A ~\u001c¨c¤\u0085g\fOQ\u009d\u0089\u007f\u0013Ø´\u0096\u0089«gY#\u000b\u009bø\u0005dã\u0088^,\u001aTPLÜ ¢V+ûèAJ\u0000Í\u0083(lî\u001d=Ç\u0093\u0004\u008d~{Ý(«·vÉz\u001c\u0005^âã¤/FÌÖ#o(¨ï+\u0091ö'\u0082\u0013";
                  int var5 = "d\u009e])R;´ä±\u0097}à8ùÀ\u0090y\u000eÔI\u008aû6n)\u0014.Ãq\u0091¸Ä¾ZgËï Ù¢-\u009d\u0095>â~Ë A \u0094çD*úü+\"I\u0014M$^*Ñb}+\u001e\u0017\u0090\u0095Õ2\u0001\u0001å¹Ên\u0007Æý¥\u0094;#\u008e\u0081 Ó©à)\\\u009d}Þwg3\u001b<¿A ~\u001c¨c¤\u0085g\fOQ\u009d\u0089\u007f\u0013Ø´\u0096\u0089«gY#\u000b\u009bø\u0005dã\u0088^,\u001aTPLÜ ¢V+ûèAJ\u0000Í\u0083(lî\u001d=Ç\u0093\u0004\u008d~{Ý(«·vÉz\u001c\u0005^âã¤/FÌÖ#o(¨ï+\u0091ö'\u0082\u0013".length();
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
                              e = var6;
                              f = new Integer[26];
                              m = (char)true.l<invokedynamic>(1066, var11 ^ 6800848162521018828L);
                              N = new i1();
                              return;
                           }
                           break;
                        default:
                           var25[var26] = var33;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "\u008c=íiD:r6\u0080i\u0099l\u0099Ñ\u0080?";
                           var5 = "\u008c=íiD:r6\u0080i\u0099l\u0099Ñ\u0080?".length();
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

               var16 = var17.charAt(var15);
               break;
            default:
               var20[var18++] = var28;
               if ((var15 += var16) < var19) {
                  var16 = var17.charAt(var15);
                  continue label54;
               }

               var17 = "ÀyBÇÓ\u0087ûó8\u0017~çAèß\u0002N\u0003\u0003ræçGñ\u00104j\u0003@M\u0005\u00adÑ\u0013\u0018§þ\u0098é\u0093\u0090";
               var19 = "ÀyBÇÓ\u0087ûó8\u0017~çAèß\u0002N\u0003\u0003ræçGñ\u00104j\u0003@M\u0005\u00adÑ\u0013\u0018§þ\u0098é\u0093\u0090".length();
               var16 = 24;
               var15 = -1;
            }

            ++var15;
            var22 = var17.substring(var15, var15 + var16);
            var10001 = 0;
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5597;
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
            throw new RuntimeException("su/catlean/i1", var10);
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
         throw new RuntimeException("su/catlean/i1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 29972;
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
            throw new RuntimeException("su/catlean/i1", var14);
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
         throw new RuntimeException("su/catlean/i1" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
