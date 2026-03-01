package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

public final class ComposerWithPrettyPrint extends Composer {
   @NotNull
   private final Json json;
   private int level;

   public ComposerWithPrettyPrint(@NotNull InternalJsonWriter writer, @NotNull Json json) {
      Intrinsics.checkNotNullParameter(writer, "writer");
      Intrinsics.checkNotNullParameter(json, "json");
      super(writer);
      this.json = json;
   }

   public void indent() {
      this.setWritingFirst(true);
      int var1 = this.level++;
   }

   public void unIndent() {
      int var1 = this.level;
      this.level = var1 + -1;
   }

   public void nextItem() {
      this.setWritingFirst(false);
      this.print("\n");
      int var1 = this.level;

      for(int var2 = 0; var2 < var1; ++var2) {
         int var4 = false;
         this.print(this.json.getConfiguration().getPrettyPrintIndent());
      }

   }

   public void nextItemIfNotFirst() {
      if (this.getWritingFirst()) {
         this.setWritingFirst(false);
      } else {
         this.nextItem();
      }

   }

   public void space() {
      this.print(' ');
   }
}
