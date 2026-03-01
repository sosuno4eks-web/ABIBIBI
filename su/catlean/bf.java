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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/** @deprecated */
// $FF: synthetic class
@Deprecated(
   message = "This synthesized declaration should not be used directly",
   level = DeprecationLevel.HIDDEN
)
public final class bf implements GeneratedSerializer {
   @NotNull
   public static final bf i;
   @NotNull
   private static final SerialDescriptor O;
   private static final long a = j0.a(5806975469225401026L, 9154430757401392707L, MethodHandles.lookup().lookupClass()).a(77227938725480L);
   private static final String[] b;
   private static final String[] c;
   private static final Map d;

   private bf() {
   }

   public final void W(@NotNull Encoder encoder, short a, @NotNull f4 value, int a, short a) {
      long var6 = ((long)var2 << 48 | (long)var4 << 32 >>> 16 | (long)var5 << 48 >>> 48) ^ a;
      Intrinsics.checkNotNullParameter(var1, true.v<invokedynamic>(17214, 5959934114761686390L ^ var6));
      Intrinsics.checkNotNullParameter(var3, true.v<invokedynamic>(6463, 4990890803288336246L ^ var6));
      SerialDescriptor var8 = O;
      CompositeEncoder var9 = var1.beginStructure(var8);
      f4.M(var3, var9, var8);
      var9.endStructure(var8);
   }

   @NotNull
   public final f4 l(short a, @NotNull Decoder decoder, int a, short a) {
      // $FF: Couldn't be decompiled
   }

   @NotNull
   public final SerialDescriptor getDescriptor() {
      return O;
   }

   @NotNull
   public final KSerializer[] childSerializers() {
      KSerializer[] var1 = new KSerializer[]{IntSerializer.INSTANCE, as.L};
      return var1;
   }

   @NotNull
   public KSerializer[] typeParametersSerializers() {
      return GeneratedSerializer.super.typeParametersSerializers();
   }

   public void serialize(Encoder encoder, Object value) {
      long var3 = a ^ 126836408096368L;
      long var10001 = var3 ^ 27767523099182L;
      int var5 = (int)((var3 ^ 27767523099182L) >>> 48);
      int var6 = (int)(var10001 << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      this.W(var1, (short)var5, (f4)var2, var6, (short)var7);
   }

   public Object deserialize(Decoder decoder) {
      long var2 = a ^ 115999383783757L;
      long var10001 = var2 ^ 46232076079292L;
      int var4 = (int)((var2 ^ 46232076079292L) >>> 48);
      int var5 = (int)(var10001 << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      return this.l((short)var4, var1, var5, (short)var6);
   }

   static {
      long var9 = a ^ 78349037177546L;
      d = new HashMap(13);
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)((int)(var9 >>> 56)), 0, 0, 0, 0, 0, 0, 0};

      for(int var1 = 1; var1 < 8; ++var1) {
         var10003[var1] = (byte)((int)(var9 << var1 * 8 >>> 56));
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[6];
      int var5 = 0;
      String var4 = ">¢¯Är.\r¥blbIA2_S9nç\r\rã\u008a*\u008f\u001a´\u0086\u0096¹>±\u0010©â.á\u0093Ü¢]-Ø~ÆG4\u001e \u0010y\u0004°D\u0001=B\n\u008bçÚ\u000b§\u0090iå ¶\u000b\u009eä^\u0084ì+weÅSàbà_ßp/Î¡\u001a{èô\u001eÙ-\u0007!óø";
      int var6 = ">¢¯Är.\r¥blbIA2_S9nç\r\rã\u008a*\u008f\u001a´\u0086\u0096¹>±\u0010©â.á\u0093Ü¢]-Ø~ÆG4\u001e \u0010y\u0004°D\u0001=B\n\u008bçÚ\u000b§\u0090iå ¶\u000b\u009eä^\u0084ì+weÅSàbà_ßp/Î¡\u001a{èô\u001eÙ-\u0007!óø".length();
      char var3 = ' ';
      int var2 = -1;

      label27:
      while(true) {
         ++var2;
         String var12 = var4.substring(var2, var2 + var3);
         byte var10001 = -1;

         while(true) {
            byte[] var8 = var0.doFinal(var12.getBytes("ISO-8859-1"));
            String var16 = a(var8).intern();
            switch(var10001) {
            case 0:
               var7[var5++] = var16;
               if ((var2 += var3) >= var6) {
                  b = var7;
                  c = new String[6];
                  i = new bf();
                  PluginGeneratedSerialDescriptor var11 = new PluginGeneratedSerialDescriptor(true.v<invokedynamic>(28376, 4305452284088633761L ^ var9), (GeneratedSerializer)i, 2);
                  var11.addElement(true.v<invokedynamic>(10072, 6501322847232557091L ^ var9), false);
                  var11.addElement(true.v<invokedynamic>(16669, 3764975918514923111L ^ var9), false);
                  O = (SerialDescriptor)var11;
                  return;
               }

               var3 = var4.charAt(var2);
               break;
            default:
               var7[var5++] = var16;
               if ((var2 += var3) < var6) {
                  var3 = var4.charAt(var2);
                  continue label27;
               }

               var4 = "È·\u009b5µgëô\u0088Oû³¡ø¶H\u0010\u00138!\u0091\u0095Ôn1Tù\u0086\u001d¶\u0085«\u0005";
               var6 = "È·\u009b5µgëô\u0088Oû³¡ø¶H\u0010\u00138!\u0091\u0095Ôn1Tù\u0086\u001d¶\u0085«\u0005".length();
               var3 = 16;
               var2 = -1;
            }

            ++var2;
            var12 = var4.substring(var2, var2 + var3);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 10770;
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
            throw new RuntimeException("su/catlean/bf", var10);
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
         throw new RuntimeException("su/catlean/bf" + " : " + var1 + " : " + var2.toString(), var5);
      }
   }
}
