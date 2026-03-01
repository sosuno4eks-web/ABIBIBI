package su.catlean;

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
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $FF: synthetic class
@Deprecated(
   message = "This synthesized declaration should not be used directly",
   level = DeprecationLevel.HIDDEN
)
public final class mw implements GeneratedSerializer {
   @NotNull
   public static final mw e;
   @NotNull
   private static final SerialDescriptor a;
   private static final long b = j0.a(8737613534704536179L, 6334879051951325857L, MethodHandles.lookup().lookupClass()).a(95235293267569L);
   private static final String[] c;
   private static final String[] d;
   private static final Map f;
   private static final long[] g;
   private static final Integer[] h;
   private static final Map i;

   private mw() {
   }

   public final void B(long a, @NotNull Encoder encoder, @NotNull mm value) {
      var1 ^= b;
      long var10001 = var1 ^ 80368295877244L;
      int var5 = (int)((var1 ^ 80368295877244L) >>> 32);
      int var6 = (int)(var10001 << 32 >>> 48);
      int var7 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(var3, true.y<invokedynamic>(5849, 3921713922171640620L ^ var1));
      Intrinsics.checkNotNullParameter(var4, true.y<invokedynamic>(14884, 8905150141792565200L ^ var1));
      SerialDescriptor var8 = a;
      CompositeEncoder var9 = var3.beginStructure(var8);
      mm.f(var5, var4, var9, (short)var6, var8, (char)var7);
      var9.endStructure(var8);
   }

   @NotNull
   public final mm H(@NotNull Decoder decoder, long a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return a;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      long var1 = b ^ 48919249524454L;
      Lazy[] var3 = mm.C();
      KSerializer[] var4 = new KSerializer[true.b<invokedynamic>(7550, 4631339861636011811L ^ var1)];
      var4[0] = StringSerializer.INSTANCE;
      var4[1] = (KSerializer)var3[1].getValue();
      var4[2] = (KSerializer)var3[2].getValue();
      var4[3] = (KSerializer)var3[3].getValue();
      var4[4] = (KSerializer)var3[4].getValue();
      var4[5] = (KSerializer)var3[5].getValue();
      var4[true.b<invokedynamic>(14593, 1716342273273721667L ^ var1)] = (KSerializer)var3[true.b<invokedynamic>(25252, 2030712845809166531L ^ var1)].getValue();
      var4[true.b<invokedynamic>(23304, 601930504852902227L ^ var1)] = (KSerializer)var3[true.b<invokedynamic>(16705, 9075933984534694678L ^ var1)].getValue();
      var4[true.b<invokedynamic>(17675, 7752711106862255955L ^ var1)] = (KSerializer)var3[true.b<invokedynamic>(30756, 8851063589442105956L ^ var1)].getValue();
      var4[true.b<invokedynamic>(24522, 3420927352819357065L ^ var1)] = (KSerializer)var3[true.b<invokedynamic>(4814, 9053467274994800795L ^ var1)].getValue();
      var4[true.b<invokedynamic>(9265, 877357430620614269L ^ var1)] = (KSerializer)var3[true.b<invokedynamic>(16580, 2229443514250070657L ^ var1)].getValue();
      var4[true.b<invokedynamic>(13099, 7003653860477172091L ^ var1)] = (KSerializer)var3[true.b<invokedynamic>(30439, 1820398146296069307L ^ var1)].getValue();
      var4[true.b<invokedynamic>(14019, 2631685423515303069L ^ var1)] = (KSerializer)var3[true.b<invokedynamic>(32430, 19788759943066876L ^ var1)].getValue();
      return var4;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = b ^ 19769367651668L;
      long var5 = var3 ^ 64825042439548L;
      this.B(var5, var1, (mm)var2);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = b ^ 65960325167605L;
      long var4 = var2 ^ 52045420003347L;
      return this.H(var1, var4);
   }

   static {
      long var20 = b ^ 90199749587858L;
      f = new HashMap(13);
      Cipher var11;
      Cipher var10000 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var12 = 1; var12 < 8; ++var12) {
         var10003[var12] = (byte)((int)(var20 << var12 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[17];
      int var16 = 0;
      String var15 = "\u001d\u0093ÞáûV´\u0086y2\u0010²O\\¢Ñ£9@æ\u001b\u0001\u000bù\u0018V6Q:JÁX¦½¬Ïh4\u001c\u0019>ûë§o\u0084 ê\u001b\u0010A¬ò\u009bÌDÜ/¾\u0082@ÜT;\u0018Ï 3 \u000f\u008d¯{x\u0093#ÿÎ\u001fG\u0012/ù\u0013G\u0019s\u0096\u0013ªP1\u009dOµïOj´\u0018\u0093L¢\u009cÅþáÙ\f\rÃ =õí\u008fwÕ\u0010\bÌú¯t <\u0000\u0000Íw\u00016ñ\u0017\u0097\räºM¥\u001dÑXW\u0099Øbõê\u0090)ÅÓâ\u0015î:\u0018\u0095Y\u0085vü\u0080Ô\u00adé[uä¢H7§·ó0©G3\u0004¼(ÈTà\u0095Sáµ\u009fWø9q(hyi[ú\u0011¸¢ú¾\u008d\u0010Ã\u001a\fE«\u0014T\u001f\\u\u001d®[HN\u0018!\u0081å\bõ_ÔëÁwø^¬YMï\u0085oY+f#Ià0£\u0089\u0089ór9 ìù[wÈ¦\u0089ö\u00adÚN\u0013\u0090!-x%ûý\u009eT\u007fÈ0¸RChûF´5ðC]\u000eÛÛ[d\u0087\u0010æ\u0003\u0096\u008553óÚ\u008fÎ\u009c\u0017ÎCåÕ\u0018\u001dmë\u0014\u009aÛ\u0088~2\u000eõ\u0088ÄÇxO´þ\u001c¬9\u007f~á\u0010£Hc\u0019\u008d5bÏi \u0018±\u0096Ê\u0081\u0017\u0010\u001aZE¥L&\u0087ýÉH×*ða\u001eá0Ñ\u0088¹1\u001d\u0002`\u0090ãÉ\u000eåP#¹\u008a|\u0010\u009f\u008f{\u000f]\u008eLÇ\u001eË\u009d\u0004È\u008f_\u000eàcX>¼\u0092Ì%¾¤ä\u0091íÔ";
      int var17 = "\u001d\u0093ÞáûV´\u0086y2\u0010²O\\¢Ñ£9@æ\u001b\u0001\u000bù\u0018V6Q:JÁX¦½¬Ïh4\u001c\u0019>ûë§o\u0084 ê\u001b\u0010A¬ò\u009bÌDÜ/¾\u0082@ÜT;\u0018Ï 3 \u000f\u008d¯{x\u0093#ÿÎ\u001fG\u0012/ù\u0013G\u0019s\u0096\u0013ªP1\u009dOµïOj´\u0018\u0093L¢\u009cÅþáÙ\f\rÃ =õí\u008fwÕ\u0010\bÌú¯t <\u0000\u0000Íw\u00016ñ\u0017\u0097\räºM¥\u001dÑXW\u0099Øbõê\u0090)ÅÓâ\u0015î:\u0018\u0095Y\u0085vü\u0080Ô\u00adé[uä¢H7§·ó0©G3\u0004¼(ÈTà\u0095Sáµ\u009fWø9q(hyi[ú\u0011¸¢ú¾\u008d\u0010Ã\u001a\fE«\u0014T\u001f\\u\u001d®[HN\u0018!\u0081å\bõ_ÔëÁwø^¬YMï\u0085oY+f#Ià0£\u0089\u0089ór9 ìù[wÈ¦\u0089ö\u00adÚN\u0013\u0090!-x%ûý\u009eT\u007fÈ0¸RChûF´5ðC]\u000eÛÛ[d\u0087\u0010æ\u0003\u0096\u008553óÚ\u008fÎ\u009c\u0017ÎCåÕ\u0018\u001dmë\u0014\u009aÛ\u0088~2\u000eõ\u0088ÄÇxO´þ\u001c¬9\u007f~á\u0010£Hc\u0019\u008d5bÏi \u0018±\u0096Ê\u0081\u0017\u0010\u001aZE¥L&\u0087ýÉH×*ða\u001eá0Ñ\u0088¹1\u001d\u0002`\u0090ãÉ\u000eåP#¹\u008a|\u0010\u009f\u008f{\u000f]\u008eLÇ\u001eË\u009d\u0004È\u008f_\u000eàcX>¼\u0092Ì%¾¤ä\u0091íÔ".length();
      char var14 = 24;
      int var13 = -1;

      label54:
      while(true) {
         ++var13;
         String var23 = var15.substring(var13, var13 + var14);
         byte var10001 = -1;

         while(true) {
            byte[] var19 = var11.doFinal(var23.getBytes("ISO-8859-1"));
            String var29 = a(var19).intern();
            switch(var10001) {
            case 0:
               var18[var16++] = var29;
               if ((var13 += var14) >= var17) {
                  c = var18;
                  d = new String[17];
                  i = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)((int)(var20 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

                  for(int var1 = 1; var1 < 8; ++var1) {
                     var10003[var1] = (byte)((int)(var20 << var1 * 8 >>> 56));
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[34];
                  int var3 = 0;
                  String var4 = "\n>ð\u0084\u0010\u0080p\u0094[»\u008e$Ù³¢\u001f¶ÕÞ@Õ~ï\u0092<f\u008eÃÓB\u009d\u0094:Â\u0005kD\f'>ãE¨\u008cGc\u0002ÅK\"f¨²Ö«xå\u0084PæÃÈ\u001e·°:\u008e\u00ad\u0099>#ñ%\u0098¬\u0092¦¹¾Ùô$%&íWÍL^0\u000b&Ä'\u0018n÷'ÃÜ\u00adð\n~\u000b0'ánnH\u008a_U¿¦\u0080\u008aÅ-5üñ±»xû¬\u0086®\fUÂV\u001eæâ×_VG\u007fì¬\u00ad©]ã»Ùÿa\u0015\u0087¨Þ³«\u0003+j&\u0007>/\u0005\u0091\u0090eQAå\u00821¶\u008aJ\u009c]l\u0012pªÇñê¼Í VïG\u001eÕéS$P/É\u00adÿ\b\u009cð¨?\u0095µ#z®Ó\u0080ïº\u0014\u001a,}N\u001dÛ¡OTÇ\u001a\u0011\u009d/Û\u0081ãUÔ¾`>Y\u0080\u0082j#ìN´ßóÝ¿xýF¢S";
                  int var5 = "\n>ð\u0084\u0010\u0080p\u0094[»\u008e$Ù³¢\u001f¶ÕÞ@Õ~ï\u0092<f\u008eÃÓB\u009d\u0094:Â\u0005kD\f'>ãE¨\u008cGc\u0002ÅK\"f¨²Ö«xå\u0084PæÃÈ\u001e·°:\u008e\u00ad\u0099>#ñ%\u0098¬\u0092¦¹¾Ùô$%&íWÍL^0\u000b&Ä'\u0018n÷'ÃÜ\u00adð\n~\u000b0'ánnH\u008a_U¿¦\u0080\u008aÅ-5üñ±»xû¬\u0086®\fUÂV\u001eæâ×_VG\u007fì¬\u00ad©]ã»Ùÿa\u0015\u0087¨Þ³«\u0003+j&\u0007>/\u0005\u0091\u0090eQAå\u00821¶\u008aJ\u009c]l\u0012pªÇñê¼Í VïG\u001eÕéS$P/É\u00adÿ\b\u009cð¨?\u0095µ#z®Ó\u0080ïº\u0014\u001a,}N\u001dÛ¡OTÇ\u001a\u0011\u009d/Û\u0081ãUÔ¾`>Y\u0080\u0082j#ìN´ßóÝ¿xýF¢S".length();
                  int var2 = 0;

                  label36:
                  while(true) {
                     int var27 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                     long[] var26 = var6;
                     var27 = var3++;
                     long var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                     byte var32 = -1;

                     while(true) {
                        long var8 = var31;
                        byte[] var10 = var0.doFinal(new byte[]{(byte)((int)(var8 >>> 56)), (byte)((int)(var8 >>> 48)), (byte)((int)(var8 >>> 40)), (byte)((int)(var8 >>> 32)), (byte)((int)(var8 >>> 24)), (byte)((int)(var8 >>> 16)), (byte)((int)(var8 >>> 8)), (byte)((int)var8)});
                        long var34 = ((long)var10[0] & 255L) << 56 | ((long)var10[1] & 255L) << 48 | ((long)var10[2] & 255L) << 40 | ((long)var10[3] & 255L) << 32 | ((long)var10[4] & 255L) << 24 | ((long)var10[5] & 255L) << 16 | ((long)var10[6] & 255L) << 8 | (long)var10[7] & 255L;
                        switch(var32) {
                        case 0:
                           var26[var27] = var34;
                           if (var2 >= var5) {
                              g = var6;
                              h = new Integer[34];
                              e = new mw();
                              PluginGeneratedSerialDescriptor var22 = new PluginGeneratedSerialDescriptor(true.y<invokedynamic>(28196, 4068204679435442769L ^ var20), (GeneratedSerializer)e, true.b<invokedynamic>(27664, 2794990957866500911L ^ var20));
                              var22.addElement(true.y<invokedynamic>(1827, 6513487200938079060L ^ var20), false);
                              var22.addElement(true.y<invokedynamic>(32041, 6486122213129210202L ^ var20), false);
                              var22.addElement(true.y<invokedynamic>(17158, 6221320130169403254L ^ var20), false);
                              var22.addElement(true.y<invokedynamic>(23270, 2632112717102509720L ^ var20), false);
                              var22.addElement(true.y<invokedynamic>(24023, 4520429559275121074L ^ var20), false);
                              var22.addElement(true.y<invokedynamic>(26417, 8255351286820328256L ^ var20), false);
                              var22.addElement(true.y<invokedynamic>(27169, 8056066347777416796L ^ var20), false);
                              var22.addElement(true.y<invokedynamic>(1891, 352193971348091673L ^ var20), false);
                              var22.addElement(true.y<invokedynamic>(30443, 5671376776804745887L ^ var20), false);
                              var22.addElement(true.y<invokedynamic>(24275, 1623663066270427816L ^ var20), false);
                              var22.addElement(true.y<invokedynamic>(4214, 2683661127688692736L ^ var20), false);
                              var22.addElement(true.y<invokedynamic>(25927, 2615955282207068469L ^ var20), false);
                              var22.addElement(true.y<invokedynamic>(32162, 4883988770724727262L ^ var20), false);
                              a = (SerialDescriptor)var22;
                              return;
                           }
                           break;
                        default:
                           var26[var27] = var34;
                           if (var2 < var5) {
                              continue label36;
                           }

                           var4 = "¯æ°¨m(T\u0004P\u009f»\u0095²Ùsí";
                           var5 = "¯æ°¨m(T\u0004P\u009f»\u0095²Ùsí".length();
                           var2 = 0;
                        }

                        var27 = var2;
                        var2 += 8;
                        var7 = var4.substring(var27, var2).getBytes("ISO-8859-1");
                        var26 = var6;
                        var27 = var3++;
                        var31 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var32 = 0;
                     }
                  }
               }

               var14 = var15.charAt(var13);
               break;
            default:
               var18[var16++] = var29;
               if ((var13 += var14) < var17) {
                  var14 = var15.charAt(var13);
                  continue label54;
               }

               var15 = "Ö\u001c\u0096Ü #\u0090Ê\u001bô1\t\u009bo.+`/\u000e({8í¨v/9ðéT\u0085o6'\u008eÏc¡¤\u008c\u0018\u0007\f\u0082÷¡ÌA\u008c\u0013Z-ºq\u0014c\u0097\u0002Ä\u0018¼´\u001af\u0092";
               var17 = "Ö\u001c\u0096Ü #\u0090Ê\u001bô1\t\u009bo.+`/\u000e({8í¨v/9ðéT\u0085o6'\u008eÏc¡¤\u008c\u0018\u0007\f\u0082÷¡ÌA\u008c\u0013Z-ºq\u0014c\u0097\u0002Ä\u0018¼´\u001af\u0092".length();
               var14 = '(';
               var13 = -1;
            }

            ++var13;
            var23 = var15.substring(var13, var13 + var14);
            var10001 = 0;
         }
      }
   }

   private static UnknownFieldException a(UnknownFieldException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 26064;
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
            throw new RuntimeException("su/catlean/mw", var10);
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
         d[var5] = a(((Cipher)var4[0]).doFinal(var9));
      }

      return d[var5];
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
         throw new RuntimeException("su/catlean/mw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 32406;
      if (h[var3] == null) {
         byte[] var4 = new byte[]{(byte)((int)(var1 >>> 56)), (byte)((int)(var1 >>> 48)), (byte)((int)(var1 >>> 40)), (byte)((int)(var1 >>> 32)), (byte)((int)(var1 >>> 24)), (byte)((int)(var1 >>> 16)), (byte)((int)(var1 >>> 8)), (byte)((int)var1)};
         long var5 = g[var3];
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
            throw new RuntimeException("su/catlean/mw", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
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
         throw new RuntimeException("su/catlean/mw" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
