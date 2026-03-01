package kotlin.collections;

import java.util.Collection;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableCollection;

@SinceKotlin(
   version = "1.1"
)
public abstract class AbstractMutableCollection<E> extends java.util.AbstractCollection<E> implements Collection<E>, KMutableCollection {
   protected AbstractMutableCollection() {
   }

   public abstract boolean add(E var1);

   public abstract int getSize();
}
