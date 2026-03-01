package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

final class SerializedMap implements Externalizable {
   @NotNull
   public static final SerializedMap.Companion Companion = new SerializedMap.Companion((DefaultConstructorMarker)null);
   @NotNull
   private Map<?, ?> map;
   private static final long serialVersionUID = 0L;

   public SerializedMap(@NotNull Map<?, ?> map) {
      Intrinsics.checkNotNullParameter(map, "map");
      super();
      this.map = map;
   }

   public SerializedMap() {
      this(MapsKt.emptyMap());
   }

   public void writeExternal(@NotNull ObjectOutput output) {
      Intrinsics.checkNotNullParameter(output, "output");
      output.writeByte(0);
      output.writeInt(this.map.size());
      Iterator var2 = this.map.entrySet().iterator();

      while(var2.hasNext()) {
         Entry entry = (Entry)var2.next();
         output.writeObject(entry.getKey());
         output.writeObject(entry.getValue());
      }

   }

   public void readExternal(@NotNull ObjectInput input) {
      Intrinsics.checkNotNullParameter(input, "input");
      int flags = input.readByte();
      if (flags != 0) {
         throw new InvalidObjectException("Unsupported flags value: " + flags);
      } else {
         int size = input.readInt();
         if (size < 0) {
            throw new InvalidObjectException("Illegal size value: " + size + '.');
         } else {
            Map var4 = MapsKt.createMapBuilder(size);
            Map $this$readExternal_u24lambda_u241 = var4;
            int var6 = false;

            for(int var7 = 0; var7 < size; ++var7) {
               int var9 = false;
               Object key = input.readObject();
               Object value = input.readObject();
               $this$readExternal_u24lambda_u241.put(key, value);
            }

            this.map = MapsKt.build(var4);
         }
      }
   }

   private final Object readResolve() {
      return this.map;
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
