package kotlin.collections;

import java.util.List;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableList;

@SinceKotlin(
   version = "1.1"
)
public abstract class AbstractMutableList<E> extends java.util.AbstractList<E> implements List<E>, KMutableList {
   protected AbstractMutableList() {
   }

   public abstract E set(int var1, E var2);

   public abstract E removeAt(int var1);

   public abstract void add(int var1, E var2);

   public abstract int getSize();
}
