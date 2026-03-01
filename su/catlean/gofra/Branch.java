package su.catlean.gofra;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class Branch {
   @NotNull
   private final Class<?> eventTarget;
   private final byte priority;
   @NotNull
   private Consumer<Object> consumer;
   private Method privateLookupInMethod;

   public Branch(@NotNull Class<?> klass, @NotNull Object obj, @NotNull Method method) {
      Intrinsics.checkNotNullParameter(klass, "klass");
      Intrinsics.checkNotNullParameter(obj, "obj");
      Intrinsics.checkNotNullParameter(method, "method");
      super();
      Class var10001 = method.getParameters()[0].getType();
      Intrinsics.checkNotNullExpressionValue(var10001, "getType(...)");
      this.eventTarget = var10001;
      this.priority = ((Flow)method.getAnnotation(Flow.class)).priority();
      Class[] var4 = new Class[]{Class.class, Lookup.class};
      this.privateLookupInMethod = MethodHandles.class.getDeclaredMethod("privateLookupIn", var4);
      Method var10000 = this.privateLookupInMethod;
      Object[] var6 = new Object[]{klass, MethodHandles.lookup()};
      Object var9 = var10000.invoke((Object)null, var6);
      Intrinsics.checkNotNull(var9, "null cannot be cast to non-null type java.lang.invoke.MethodHandles.Lookup");
      Lookup l = (Lookup)var9;
      MethodType mT = MethodType.methodType(Void.TYPE, method.getParameters()[0].getType());
      MethodHandle mH = l.findVirtual(klass, method.getName(), mT);
      MethodType iT = MethodType.methodType(Consumer.class, klass);
      this.consumer = LambdaMetafactory.metafactory(l, "accept", iT, MethodType.methodType(Void.TYPE, Object.class), mH, mT).getTarget().invoke(obj);
   }

   @NotNull
   public final Class<?> getEventTarget() {
      return this.eventTarget;
   }

   public final byte getPriority() {
      return this.priority;
   }

   public final void call(@NotNull Object event) {
      Intrinsics.checkNotNullParameter(event, "event");
      this.consumer.accept(event);
   }
}
