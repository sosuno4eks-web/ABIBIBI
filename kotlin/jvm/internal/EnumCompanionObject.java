package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

public final class EnumCompanionObject {
   @NotNull
   public static final EnumCompanionObject INSTANCE = new EnumCompanionObject();

   private EnumCompanionObject() {
   }
}
