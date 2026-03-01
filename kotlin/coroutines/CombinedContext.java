package kotlin.coroutines;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.3"
)
public final class CombinedContext implements CoroutineContext, Serializable {
   @NotNull
   private final CoroutineContext left;
   @NotNull
   private final CoroutineContext.Element element;

   public CombinedContext(@NotNull CoroutineContext left, @NotNull CoroutineContext.Element element) {
      Intrinsics.checkNotNullParameter(left, "left");
      Intrinsics.checkNotNullParameter(element, "element");
      super();
      this.left = left;
      this.element = element;
   }

   @Nullable
   public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
      Intrinsics.checkNotNullParameter(key, "key");
      CombinedContext cur = this;

      while(true) {
         CoroutineContext.Element var3 = cur.element.get(key);
         if (var3 != null) {
            int var5 = false;
            return var3;
         }

         CoroutineContext next = cur.left;
         if (!(next instanceof CombinedContext)) {
            return next.get(key);
         }

         cur = (CombinedContext)next;
      }
   }

   public <R> R fold(R initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
      Intrinsics.checkNotNullParameter(operation, "operation");
      return operation.invoke(this.left.fold(initial, operation), this.element);
   }

   @NotNull
   public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
      Intrinsics.checkNotNullParameter(key, "key");
      if (this.element.get(key) != null) {
         int var4 = false;
         return this.left;
      } else {
         CoroutineContext newLeft = this.left.minusKey(key);
         return newLeft == this.left ? (CoroutineContext)this : (newLeft == EmptyCoroutineContext.INSTANCE ? (CoroutineContext)this.element : (CoroutineContext)(new CombinedContext(newLeft, this.element)));
      }
   }

   private final int size() {
      CombinedContext cur = this;
      int size = 2;

      while(true) {
         CoroutineContext var3 = cur.left;
         CombinedContext var10000 = var3 instanceof CombinedContext ? (CombinedContext)var3 : null;
         if ((var3 instanceof CombinedContext ? (CombinedContext)var3 : null) == null) {
            return size;
         }

         cur = var10000;
         ++size;
      }
   }

   private final boolean contains(CoroutineContext.Element element) {
      return Intrinsics.areEqual((Object)this.get(element.getKey()), (Object)element);
   }

   private final boolean containsAll(CombinedContext context) {
      CoroutineContext next;
      for(CombinedContext cur = context; this.contains(cur.element); cur = (CombinedContext)next) {
         next = cur.left;
         if (!(next instanceof CombinedContext)) {
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
            return this.contains((CoroutineContext.Element)next);
         }
      }

      return false;
   }

   public boolean equals(@Nullable Object other) {
      return this == other || other instanceof CombinedContext && ((CombinedContext)other).size() == this.size() && ((CombinedContext)other).containsAll(this);
   }

   public int hashCode() {
      return this.left.hashCode() + this.element.hashCode();
   }

   @NotNull
   public String toString() {
      return '[' + (String)this.fold("", CombinedContext::toString$lambda$2) + ']';
   }

   private final Object writeReplace() {
      int n = this.size();
      CoroutineContext[] elements = new CoroutineContext[n];
      Ref.IntRef index = new Ref.IntRef();
      this.fold(Unit.INSTANCE, CombinedContext::writeReplace$lambda$3);
      if (index.element != n) {
         throw new IllegalStateException("Check failed.");
      } else {
         return new CombinedContext.Serialized(elements);
      }
   }

   private final void readObject(ObjectInputStream input) {
      throw new InvalidObjectException("Deserialization is supported via proxy only");
   }

   @NotNull
   public CoroutineContext plus(@NotNull CoroutineContext context) {
      return CoroutineContext.DefaultImpls.plus(this, context);
   }

   private static final String toString$lambda$2(String acc, CoroutineContext.Element element) {
      Intrinsics.checkNotNullParameter(acc, "acc");
      Intrinsics.checkNotNullParameter(element, "element");
      return ((CharSequence)acc).length() == 0 ? element.toString() : acc + ", " + element;
   }

   private static final Unit writeReplace$lambda$3(CoroutineContext[] $elements, Ref.IntRef $index, Unit var2, CoroutineContext.Element element) {
      Intrinsics.checkNotNullParameter(var2, "<unused var>");
      Intrinsics.checkNotNullParameter(element, "element");
      int var4 = $index.element++;
      $elements[var4] = element;
      return Unit.INSTANCE;
   }

   private static final class Serialized implements Serializable {
      @NotNull
      public static final CombinedContext.Serialized.Companion Companion = new CombinedContext.Serialized.Companion((DefaultConstructorMarker)null);
      @NotNull
      private final CoroutineContext[] elements;
      private static final long serialVersionUID = 0L;

      public Serialized(@NotNull CoroutineContext[] elements) {
         Intrinsics.checkNotNullParameter(elements, "elements");
         super();
         this.elements = elements;
      }

      @NotNull
      public final CoroutineContext[] getElements() {
         return this.elements;
      }

      private final Object readResolve() {
         CoroutineContext[] $this$fold$iv = this.elements;
         Object initial$iv = EmptyCoroutineContext.INSTANCE;
         int $i$f$fold = false;
         Object accumulator$iv = initial$iv;
         int var5 = 0;

         for(int var6 = $this$fold$iv.length; var5 < var6; ++var5) {
            Object element$iv = $this$fold$iv[var5];
            CoroutineContext p0 = (CoroutineContext)accumulator$iv;
            int var10 = false;
            accumulator$iv = p0.plus(element$iv);
         }

         return accumulator$iv;
      }

      public static final class Companion {
         private Companion() {
         }

         // $FF: synthetic method
         public Companion(DefaultConstructorMarker $constructor_marker) {
            this();
         }
      }
   }
}
