package kotlinx.serialization;

import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.collections.Grouping;
import kotlin.reflect.KClass;

public final class SealedClassSerializer$special$$inlined$groupingBy$1 implements Grouping<Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>, String> {
   // $FF: synthetic field
   final Iterable $this_groupingBy;

   public SealedClassSerializer$special$$inlined$groupingBy$1(Iterable $receiver) {
      this.$this_groupingBy = $receiver;
   }

   public Iterator<Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>> sourceIterator() {
      return this.$this_groupingBy.iterator();
   }

   public String keyOf(Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> element) {
      Entry it = (Entry)element;
      int var3 = false;
      return ((KSerializer)it.getValue()).getDescriptor().getSerialName();
   }
}
