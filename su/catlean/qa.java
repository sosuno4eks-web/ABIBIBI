package su.catlean;

import java.lang.invoke.MethodHandles;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import net.minecraft.class_2350;

// $FF: synthetic class
public final class qa {
   public static final EnumEntries H;
   private static int[] u;

   static {
      long var0 = j0.a(6962905612532984415L, 4810259787818221188L, MethodHandles.lookup().lookupClass()).a(232190851260775L) ^ 5737975950195L;
      H = EnumEntriesKt.enumEntries((Enum[])class_2350.values());
      null.A<invokedynamic>((Object)null, 1520595784437643542L, var0);
   }

   public static void j(int[] var0) {
      u = var0;
   }

   public static int[] C() {
      return u;
   }
}
