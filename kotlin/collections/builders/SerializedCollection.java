package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class SerializedCollection implements Externalizable {
   @NotNull
   public static final SerializedCollection.Companion Companion = new SerializedCollection.Companion((DefaultConstructorMarker)null);
   @NotNull
   private Collection<?> collection;
   private final int tag;
   private static final long serialVersionUID = 0L;
   public static final int tagList = 0;
   public static final int tagSet = 1;

   public SerializedCollection(@NotNull Collection<?> collection, int tag) {
      Intrinsics.checkNotNullParameter(collection, "collection");
      super();
      this.collection = collection;
      this.tag = tag;
   }

   public SerializedCollection() {
      this((Collection)CollectionsKt.emptyList(), 0);
   }

   public void writeExternal(@NotNull ObjectOutput output) {
      Intrinsics.checkNotNullParameter(output, "output");
      output.writeByte(this.tag);
      output.writeInt(this.collection.size());
      Iterator var2 = this.collection.iterator();

      while(var2.hasNext()) {
         Object element = var2.next();
         output.writeObject(element);
      }

   }

   public void readExternal(@NotNull ObjectInput input) {
      Intrinsics.checkNotNullParameter(input, "input");
      int flags = input.readByte();
      int tag = flags & 1;
      int other = flags & -2;
      if (other != 0) {
         throw new InvalidObjectException("Unsupported flags value: " + flags + '.');
      } else {
         int size = input.readInt();
         if (size < 0) {
            throw new InvalidObjectException("Illegal size value: " + size + '.');
         } else {
            boolean var8;
            int var9;
            boolean var11;
            SerializedCollection var10000;
            Collection var10001;
            switch(tag) {
            case 0:
               List var13 = CollectionsKt.createListBuilder(size);
               List $this$readExternal_u24lambda_u241 = var13;
               var8 = false;

               for(var9 = 0; var9 < size; ++var9) {
                  var11 = false;
                  $this$readExternal_u24lambda_u241.add(input.readObject());
               }

               var10000 = this;
               var10001 = (Collection)CollectionsKt.build(var13);
               break;
            case 1:
               Set var6 = SetsKt.createSetBuilder(size);
               Set $this$readExternal_u24lambda_u243 = var6;
               var8 = false;

               for(var9 = 0; var9 < size; ++var9) {
                  var11 = false;
                  $this$readExternal_u24lambda_u243.add(input.readObject());
               }

               var10000 = this;
               var10001 = (Collection)SetsKt.build(var6);
               break;
            default:
               throw new InvalidObjectException("Unsupported collection type tag: " + tag + '.');
            }

            var10000.collection = var10001;
         }
      }
   }

   private final Object readResolve() {
      return this.collection;
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
