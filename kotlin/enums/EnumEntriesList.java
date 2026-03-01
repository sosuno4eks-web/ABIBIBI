package kotlin.enums;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(
   version = "1.8"
)
final class EnumEntriesList<T extends Enum<T>> extends AbstractList<T> implements EnumEntries<T>, Serializable {
   @NotNull
   private final T[] entries;

   public EnumEntriesList(@NotNull T[] entries) {
      Intrinsics.checkNotNullParameter(entries, "entries");
      super();
      this.entries = entries;
   }

   public int getSize() {
      return this.entries.length;
   }

   @NotNull
   public T get(int index) {
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.entries.length);
      return this.entries[index];
   }

   public boolean contains(@NotNull T element) {
      Intrinsics.checkNotNullParameter(element, "element");
      Enum target = (Enum)ArraysKt.getOrNull(this.entries, element.ordinal());
      return target == element;
   }

   public int indexOf(@NotNull T element) {
      Intrinsics.checkNotNullParameter(element, "element");
      int ordinal = element.ordinal();
      Enum target = (Enum)ArraysKt.getOrNull(this.entries, ordinal);
      return target == element ? ordinal : -1;
   }

   public int lastIndexOf(@NotNull T element) {
      Intrinsics.checkNotNullParameter(element, "element");
      return this.indexOf(element);
   }

   private final Object writeReplace() {
      return new EnumEntriesSerializationProxy(this.entries);
   }

   private final void readObject(ObjectInputStream input) {
      throw new InvalidObjectException("Deserialization is supported via proxy only");
   }
}
