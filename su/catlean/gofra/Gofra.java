package su.catlean.gofra;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class Gofra {
   @NotNull
   public static final Gofra INSTANCE = new Gofra();
   @NotNull
   private static final ConcurrentHashMap<Object, List<Branch>> cachedBranches = new ConcurrentHashMap();
   @NotNull
   private static final ConcurrentHashMap<Object, List<Branch>> branches = new ConcurrentHashMap();

   private Gofra() {
   }

   @Nullable
   public final Unit drain(@NotNull Object event) {
      Intrinsics.checkNotNullParameter(event, "event");
      List var10000 = (List)branches.get(event.getClass());
      Unit var10;
      if (var10000 != null) {
         List it = var10000;
         int var3 = false;
         Iterable $this$forEach$iv = (Iterable)it;
         int $i$f$forEach = false;
         Iterator var6 = $this$forEach$iv.iterator();

         while(var6.hasNext()) {
            Object element$iv = var6.next();
            Branch m = (Branch)element$iv;
            int var9 = false;
            m.call(event);
         }

         var10 = Unit.INSTANCE;
      } else {
         var10 = null;
      }

      return var10;
   }

   public final void plugAll(@NotNull Object... listeners) {
      Intrinsics.checkNotNullParameter(listeners, "listeners");
      Object[] $this$forEach$iv = listeners;
      int $i$f$forEach = false;
      int var4 = 0;

      for(int var5 = listeners.length; var4 < var5; ++var4) {
         Object element$iv = $this$forEach$iv[var4];
         int var8 = false;
         INSTANCE.plug(element$iv);
      }

   }

   public final void plug(@NotNull Object obj) {
      Intrinsics.checkNotNullParameter(obj, "obj");
      Iterable $this$forEach$iv = (Iterable)this.getBranches(obj);
      int $i$f$forEach = false;
      Iterator var4 = $this$forEach$iv.iterator();

      while(var4.hasNext()) {
         Object element$iv = var4.next();
         Branch it = (Branch)element$iv;
         int var7 = false;
         Gofra var10000 = INSTANCE;
         Object var10001 = branches.computeIfAbsent(it.getEventTarget(), Gofra::plug$lambda$5$lambda$4);
         Intrinsics.checkNotNullExpressionValue(var10001, "computeIfAbsent(...)");
         var10000.insert((List)var10001, it);
      }

   }

   public final void unplug(@NotNull Object obj) {
      Intrinsics.checkNotNullParameter(obj, "obj");
      Iterable $this$forEach$iv = (Iterable)this.getBranches(obj);
      int $i$f$forEach = false;
      Iterator var4 = $this$forEach$iv.iterator();

      while(var4.hasNext()) {
         Object element$iv = var4.next();
         Branch it = (Branch)element$iv;
         int var7 = false;
         List var10000 = (List)branches.get(it.getEventTarget());
         if (var10000 != null) {
            var10000.remove(it);
         }
      }

   }

   private final void insert(List<Branch> bl, Branch b) {
      int $i$f$indexOfFirst = false;
      int index$iv = 0;
      Iterator var6 = bl.iterator();

      int var10000;
      while(true) {
         if (!var6.hasNext()) {
            var10000 = -1;
            break;
         }

         Object item$iv = var6.next();
         Branch it = (Branch)item$iv;
         int var9 = false;
         if (b.getPriority() > it.getPriority()) {
            var10000 = index$iv;
            break;
         }

         ++index$iv;
      }

      int var11 = var10000;
      int var12 = false;
      var11 = var11 == -1 ? bl.size() : var11;
      bl.add(var11, b);
   }

   private final List<Branch> getBranches(Object obj) {
      Object var10000 = cachedBranches.computeIfAbsent(obj, Gofra::getBranches$lambda$11);
      Intrinsics.checkNotNullExpressionValue(var10000, "computeIfAbsent(...)");
      return (List)var10000;
   }

   private final void getBranchesRecursive(List<Branch> listeners, Class<?> klass, Object obj) {
      Iterator var4 = ArrayIteratorKt.iterator(klass.getDeclaredMethods());

      while(var4.hasNext()) {
         Method method = (Method)var4.next();
         if (method.isAnnotationPresent(Flow.class)) {
            Intrinsics.checkNotNull(method);
            listeners.add(new Branch(klass, obj, method));
         }
      }

      if (klass.getSuperclass() != null) {
         Class var10002 = klass.getSuperclass();
         Intrinsics.checkNotNullExpressionValue(var10002, "getSuperclass(...)");
         this.getBranchesRecursive(listeners, var10002, obj);
      }

   }

   private static final List plug$lambda$5$lambda$3(Object it) {
      Intrinsics.checkNotNullParameter(it, "it");
      return (List)(new CopyOnWriteArrayList());
   }

   private static final List plug$lambda$5$lambda$4(Function1 $tmp0, Object p0) {
      return (List)$tmp0.invoke(p0);
   }

   private static final List getBranches$lambda$10(Object $obj, Object it) {
      Intrinsics.checkNotNullParameter(it, "it");
      CopyOnWriteArrayList var2 = new CopyOnWriteArrayList();
      int var4 = false;
      INSTANCE.getBranchesRecursive((List)var2, $obj.getClass(), $obj);
      return (List)var2;
   }

   private static final List getBranches$lambda$11(Function1 $tmp0, Object p0) {
      return (List)$tmp0.invoke(p0);
   }
}
