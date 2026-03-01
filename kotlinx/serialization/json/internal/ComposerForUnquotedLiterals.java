package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressAnimalSniffer
public final class ComposerForUnquotedLiterals extends Composer {
   private final boolean forceQuoting;

   public ComposerForUnquotedLiterals(@NotNull InternalJsonWriter writer, boolean forceQuoting) {
      Intrinsics.checkNotNullParameter(writer, "writer");
      super(writer);
      this.forceQuoting = forceQuoting;
   }

   public void printQuoted(@NotNull String value) {
      Intrinsics.checkNotNullParameter(value, "value");
      if (this.forceQuoting) {
         super.printQuoted(value);
      } else {
         super.print(value);
      }

   }
}
