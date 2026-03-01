package kotlin.collections;

import java.util.Set;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableSet;

@SinceKotlin(
   version = "1.1"
)
public abstract class AbstractMutableSet<E> extends java.util.AbstractSet<E> implements Set<E>, KMutableSet {
   protected AbstractMutableSet() {
   }

   public abstract boolean add(E var1);

   public abstract int getSize();
}
