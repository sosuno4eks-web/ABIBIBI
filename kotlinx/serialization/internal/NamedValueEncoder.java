package kotlinx.serialization.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@InternalSerializationApi
public abstract class NamedValueEncoder extends TaggedEncoder<String> {
   @NotNull
   protected final String getTag(@NotNull SerialDescriptor $this$getTag, int index) {
      Intrinsics.checkNotNullParameter($this$getTag, "<this>");
      return this.nested(this.elementName($this$getTag, index));
   }

   @NotNull
   protected final String nested(@NotNull String nestedName) {
      Intrinsics.checkNotNullParameter(nestedName, "nestedName");
      String var10001 = (String)this.getCurrentTagOrNull();
      if (var10001 == null) {
         var10001 = "";
      }

      return this.composeName(var10001, nestedName);
   }

   @NotNull
   protected String elementName(@NotNull SerialDescriptor descriptor, int index) {
      Intrinsics.checkNotNullParameter(descriptor, "descriptor");
      return descriptor.getElementName(index);
   }

   @NotNull
   protected String composeName(@NotNull String parentName, @NotNull String childName) {
      Intrinsics.checkNotNullParameter(parentName, "parentName");
      Intrinsics.checkNotNullParameter(childName, "childName");
      return ((CharSequence)parentName).length() == 0 ? childName : parentName + '.' + childName;
   }
}
