package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FilePathComponents {
   @NotNull
   private final File root;
   @NotNull
   private final List<File> segments;

   public FilePathComponents(@NotNull File root, @NotNull List<? extends File> segments) {
      Intrinsics.checkNotNullParameter(root, "root");
      Intrinsics.checkNotNullParameter(segments, "segments");
      super();
      this.root = root;
      this.segments = segments;
   }

   @NotNull
   public final File getRoot() {
      return this.root;
   }

   @NotNull
   public final List<File> getSegments() {
      return this.segments;
   }

   @NotNull
   public final String getRootName() {
      String var10000 = this.root.getPath();
      Intrinsics.checkNotNullExpressionValue(var10000, "getPath(...)");
      return var10000;
   }

   public final boolean isRooted() {
      String var10000 = this.root.getPath();
      Intrinsics.checkNotNullExpressionValue(var10000, "getPath(...)");
      return ((CharSequence)var10000).length() > 0;
   }

   public final int getSize() {
      return this.segments.size();
   }

   @NotNull
   public final File subPath(int beginIndex, int endIndex) {
      if (beginIndex >= 0 && beginIndex <= endIndex && endIndex <= this.getSize()) {
         Iterable var10002 = (Iterable)this.segments.subList(beginIndex, endIndex);
         String var10003 = File.separator;
         Intrinsics.checkNotNullExpressionValue(var10003, "separator");
         return new File(CollectionsKt.joinToString$default(var10002, (CharSequence)var10003, (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null));
      } else {
         throw new IllegalArgumentException();
      }
   }

   @NotNull
   public final File component1() {
      return this.root;
   }

   @NotNull
   public final List<File> component2() {
      return this.segments;
   }

   @NotNull
   public final FilePathComponents copy$kotlin_stdlib(@NotNull File root, @NotNull List<? extends File> segments) {
      Intrinsics.checkNotNullParameter(root, "root");
      Intrinsics.checkNotNullParameter(segments, "segments");
      return new FilePathComponents(root, segments);
   }

   // $FF: synthetic method
   public static FilePathComponents copy$kotlin_stdlib$default(FilePathComponents var0, File var1, List var2, int var3, Object var4) {
      if ((var3 & 1) != 0) {
         var1 = var0.root;
      }

      if ((var3 & 2) != 0) {
         var2 = var0.segments;
      }

      return var0.copy$kotlin_stdlib(var1, var2);
   }

   @NotNull
   public String toString() {
      return "FilePathComponents(root=" + this.root + ", segments=" + this.segments + ')';
   }

   public int hashCode() {
      int result = this.root.hashCode();
      result = result * 31 + this.segments.hashCode();
      return result;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else if (!(other instanceof FilePathComponents)) {
         return false;
      } else {
         FilePathComponents var2 = (FilePathComponents)other;
         if (!Intrinsics.areEqual((Object)this.root, (Object)var2.root)) {
            return false;
         } else {
            return Intrinsics.areEqual((Object)this.segments, (Object)var2.segments);
         }
      }
   }
}
