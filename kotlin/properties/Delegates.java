package kotlin.properties;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public final class Delegates {
   @NotNull
   public static final Delegates INSTANCE = new Delegates();

   private Delegates() {
   }

   @NotNull
   public final <T> ReadWriteProperty<Object, T> notNull() {
      return (ReadWriteProperty)(new NotNullVar());
   }

   @NotNull
   public final <T> ReadWriteProperty<Object, T> observable(T initialValue, @NotNull Function3<? super KProperty<?>, ? super T, ? super T, Unit> onChange) {
      Intrinsics.checkNotNullParameter(onChange, "onChange");
      int $i$f$observable = false;
      return (ReadWriteProperty)(new ObservableProperty<T>(initialValue) {
         protected void afterChange(KProperty<?> property, T oldValue, T newValue) {
            Intrinsics.checkNotNullParameter(property, "property");
            onChange.invoke(property, oldValue, newValue);
         }
      });
   }

   @NotNull
   public final <T> ReadWriteProperty<Object, T> vetoable(T initialValue, @NotNull Function3<? super KProperty<?>, ? super T, ? super T, Boolean> onChange) {
      Intrinsics.checkNotNullParameter(onChange, "onChange");
      int $i$f$vetoable = false;
      return (ReadWriteProperty)(new ObservableProperty<T>(initialValue) {
         protected boolean beforeChange(KProperty<?> property, T oldValue, T newValue) {
            Intrinsics.checkNotNullParameter(property, "property");
            return (Boolean)onChange.invoke(property, oldValue, newValue);
         }
      });
   }
}
