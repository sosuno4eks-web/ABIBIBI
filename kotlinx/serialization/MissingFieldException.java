package kotlinx.serialization;

import java.util.List;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalSerializationApi
public final class MissingFieldException extends SerializationException {
   @NotNull
   private final List<String> missingFields;

   public MissingFieldException(@NotNull List<String> missingFields, @Nullable String message, @Nullable Throwable cause) {
      Intrinsics.checkNotNullParameter(missingFields, "missingFields");
      super(message, cause);
      this.missingFields = missingFields;
   }

   @NotNull
   public final List<String> getMissingFields() {
      return this.missingFields;
   }

   public MissingFieldException(@NotNull List<String> missingFields, @NotNull String serialName) {
      Intrinsics.checkNotNullParameter(missingFields, "missingFields");
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      this(missingFields, missingFields.size() == 1 ? "Field '" + (String)missingFields.get(0) + "' is required for type with serial name '" + serialName + "', but it was missing" : "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing", (Throwable)null);
   }

   public MissingFieldException(@NotNull String missingField, @NotNull String serialName) {
      Intrinsics.checkNotNullParameter(missingField, "missingField");
      Intrinsics.checkNotNullParameter(serialName, "serialName");
      this(CollectionsKt.listOf(missingField), "Field '" + missingField + "' is required for type with serial name '" + serialName + "', but it was missing", (Throwable)null);
   }

   @PublishedApi
   public MissingFieldException(@NotNull String missingField) {
      Intrinsics.checkNotNullParameter(missingField, "missingField");
      this(CollectionsKt.listOf(missingField), "Field '" + missingField + "' is required, but it was missing", (Throwable)null);
   }
}
