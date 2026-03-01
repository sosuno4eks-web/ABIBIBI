package kotlin.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin._Assertions;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class FileTreeWalk implements Sequence<File> {
   @NotNull
   private final File start;
   @NotNull
   private final FileWalkDirection direction;
   @Nullable
   private final Function1<File, Boolean> onEnter;
   @Nullable
   private final Function1<File, Unit> onLeave;
   @Nullable
   private final Function2<File, IOException, Unit> onFail;
   private final int maxDepth;

   private FileTreeWalk(File start, FileWalkDirection direction, Function1<? super File, Boolean> onEnter, Function1<? super File, Unit> onLeave, Function2<? super File, ? super IOException, Unit> onFail, int maxDepth) {
      this.start = start;
      this.direction = direction;
      this.onEnter = onEnter;
      this.onLeave = onLeave;
      this.onFail = onFail;
      this.maxDepth = maxDepth;
   }

   // $FF: synthetic method
   FileTreeWalk(File var1, FileWalkDirection var2, Function1 var3, Function1 var4, Function2 var5, int var6, int var7, DefaultConstructorMarker var8) {
      if ((var7 & 2) != 0) {
         var2 = FileWalkDirection.TOP_DOWN;
      }

      if ((var7 & 32) != 0) {
         var6 = Integer.MAX_VALUE;
      }

      this(var1, var2, var3, var4, var5, var6);
   }

   public FileTreeWalk(@NotNull File start, @NotNull FileWalkDirection direction) {
      Intrinsics.checkNotNullParameter(start, "start");
      Intrinsics.checkNotNullParameter(direction, "direction");
      this(start, direction, (Function1)null, (Function1)null, (Function2)null, 0, 32, (DefaultConstructorMarker)null);
   }

   // $FF: synthetic method
   public FileTreeWalk(File var1, FileWalkDirection var2, int var3, DefaultConstructorMarker var4) {
      if ((var3 & 2) != 0) {
         var2 = FileWalkDirection.TOP_DOWN;
      }

      this(var1, var2);
   }

   @NotNull
   public Iterator<File> iterator() {
      return (Iterator)(new FileTreeWalk.FileTreeWalkIterator());
   }

   @NotNull
   public final FileTreeWalk onEnter(@NotNull Function1<? super File, Boolean> function) {
      Intrinsics.checkNotNullParameter(function, "function");
      return new FileTreeWalk(this.start, this.direction, function, this.onLeave, this.onFail, this.maxDepth);
   }

   @NotNull
   public final FileTreeWalk onLeave(@NotNull Function1<? super File, Unit> function) {
      Intrinsics.checkNotNullParameter(function, "function");
      return new FileTreeWalk(this.start, this.direction, this.onEnter, function, this.onFail, this.maxDepth);
   }

   @NotNull
   public final FileTreeWalk onFail(@NotNull Function2<? super File, ? super IOException, Unit> function) {
      Intrinsics.checkNotNullParameter(function, "function");
      return new FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, function, this.maxDepth);
   }

   @NotNull
   public final FileTreeWalk maxDepth(int depth) {
      if (depth <= 0) {
         throw new IllegalArgumentException("depth must be positive, but was " + depth + '.');
      } else {
         return new FileTreeWalk(this.start, this.direction, this.onEnter, this.onLeave, this.onFail, depth);
      }
   }

   private abstract static class DirectoryState extends FileTreeWalk.WalkState {
      public DirectoryState(@NotNull File rootDir) {
         Intrinsics.checkNotNullParameter(rootDir, "rootDir");
         super(rootDir);
         if (_Assertions.ENABLED) {
            boolean var2 = rootDir.isDirectory();
            if (_Assertions.ENABLED && !var2) {
               int var3 = false;
               String var4 = "rootDir must be verified to be directory beforehand.";
               throw new AssertionError(var4);
            }
         }

      }
   }

   private final class FileTreeWalkIterator extends AbstractIterator<File> {
      @NotNull
      private final ArrayDeque<FileTreeWalk.WalkState> state = new ArrayDeque();

      public FileTreeWalkIterator() {
         if (FileTreeWalk.this.start.isDirectory()) {
            this.state.push(this.directoryState(FileTreeWalk.this.start));
         } else if (FileTreeWalk.this.start.isFile()) {
            this.state.push(new FileTreeWalk.FileTreeWalkIterator.SingleFileState(FileTreeWalk.this.start));
         } else {
            this.done();
         }

      }

      protected void computeNext() {
         File nextFile = this.gotoNext();
         if (nextFile != null) {
            this.setNext(nextFile);
         } else {
            this.done();
         }

      }

      private final FileTreeWalk.DirectoryState directoryState(File root) {
         FileTreeWalk.DirectoryState var10000;
         switch(FileTreeWalk.FileTreeWalkIterator.WhenMappings.$EnumSwitchMapping$0[FileTreeWalk.this.direction.ordinal()]) {
         case 1:
            var10000 = (FileTreeWalk.DirectoryState)(new FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState(root));
            break;
         case 2:
            var10000 = (FileTreeWalk.DirectoryState)(new FileTreeWalk.FileTreeWalkIterator.BottomUpDirectoryState(root));
            break;
         default:
            throw new NoWhenBranchMatchedException();
         }

         return var10000;
      }

      private final File gotoNext() {
         FileTreeWalk.FileTreeWalkIterator var1 = this;

         while(true) {
            while(true) {
               FileTreeWalk.WalkState var10000 = (FileTreeWalk.WalkState)var1.state.peek();
               if (var10000 == null) {
                  return null;
               }

               FileTreeWalk.WalkState topState = var10000;
               File file = topState.step();
               if (file != null) {
                  if (Intrinsics.areEqual((Object)file, (Object)topState.getRoot()) || !file.isDirectory() || var1.state.size() >= FileTreeWalk.this.maxDepth) {
                     return file;
                  }

                  var1.state.push(var1.directoryState(file));
                  var1 = var1;
               } else {
                  var1.state.pop();
                  var1 = var1;
               }
            }
         }
      }

      private final class BottomUpDirectoryState extends FileTreeWalk.DirectoryState {
         private boolean rootVisited;
         @Nullable
         private File[] fileList;
         private int fileIndex;
         private boolean failed;

         public BottomUpDirectoryState(@NotNull File rootDir) {
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
            super(rootDir);
         }

         @Nullable
         public File step() {
            Function1 var10000;
            if (!this.failed && this.fileList == null) {
               var10000 = FileTreeWalk.this.onEnter;
               if (var10000 != null ? !(Boolean)var10000.invoke(this.getRoot()) : false) {
                  return null;
               }

               this.fileList = this.getRoot().listFiles();
               if (this.fileList == null) {
                  Function2 var2 = FileTreeWalk.this.onFail;
                  if (var2 != null) {
                     var2.invoke(this.getRoot(), new AccessDeniedException(this.getRoot(), (File)null, "Cannot list files in a directory", 2, (DefaultConstructorMarker)null));
                  }

                  this.failed = true;
               }
            }

            if (this.fileList != null) {
               int var3 = this.fileIndex;
               File[] var10001 = this.fileList;
               Intrinsics.checkNotNull(var10001);
               if (var3 < var10001.length) {
                  File[] var4 = this.fileList;
                  Intrinsics.checkNotNull(var4);
                  int var1 = this.fileIndex++;
                  return var4[var1];
               }
            }

            if (!this.rootVisited) {
               this.rootVisited = true;
               return this.getRoot();
            } else {
               var10000 = FileTreeWalk.this.onLeave;
               if (var10000 != null) {
                  var10000.invoke(this.getRoot());
               }

               return null;
            }
         }
      }

      private final class SingleFileState extends FileTreeWalk.WalkState {
         private boolean visited;

         public SingleFileState(@NotNull File rootFile) {
            Intrinsics.checkNotNullParameter(rootFile, "rootFile");
            super(rootFile);
            if (_Assertions.ENABLED) {
               boolean var3 = rootFile.isFile();
               if (_Assertions.ENABLED && !var3) {
                  int var4 = false;
                  String var5 = "rootFile must be verified to be file beforehand.";
                  throw new AssertionError(var5);
               }
            }

         }

         @Nullable
         public File step() {
            if (this.visited) {
               return null;
            } else {
               this.visited = true;
               return this.getRoot();
            }
         }
      }

      private final class TopDownDirectoryState extends FileTreeWalk.DirectoryState {
         private boolean rootVisited;
         @Nullable
         private File[] fileList;
         private int fileIndex;

         public TopDownDirectoryState(@NotNull File rootDir) {
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
            super(rootDir);
         }

         @Nullable
         public File step() {
            Function1 var4;
            if (!this.rootVisited) {
               var4 = FileTreeWalk.this.onEnter;
               if (var4 != null ? !(Boolean)var4.invoke(this.getRoot()) : false) {
                  return null;
               } else {
                  this.rootVisited = true;
                  return this.getRoot();
               }
            } else {
               if (this.fileList != null) {
                  int var10000 = this.fileIndex;
                  File[] var10001 = this.fileList;
                  Intrinsics.checkNotNull(var10001);
                  if (var10000 >= var10001.length) {
                     var4 = FileTreeWalk.this.onLeave;
                     if (var4 != null) {
                        var4.invoke(this.getRoot());
                     }

                     return null;
                  }
               }

               File[] var3;
               if (this.fileList == null) {
                  label62: {
                     this.fileList = this.getRoot().listFiles();
                     if (this.fileList == null) {
                        Function2 var2 = FileTreeWalk.this.onFail;
                        if (var2 != null) {
                           var2.invoke(this.getRoot(), new AccessDeniedException(this.getRoot(), (File)null, "Cannot list files in a directory", 2, (DefaultConstructorMarker)null));
                        }
                     }

                     if (this.fileList != null) {
                        var3 = this.fileList;
                        Intrinsics.checkNotNull(var3);
                        if (var3.length != 0) {
                           break label62;
                        }
                     }

                     var4 = FileTreeWalk.this.onLeave;
                     if (var4 != null) {
                        var4.invoke(this.getRoot());
                     }

                     return null;
                  }
               }

               var3 = this.fileList;
               Intrinsics.checkNotNull(var3);
               int var1 = this.fileIndex++;
               return var3[var1];
            }
         }
      }

      // $FF: synthetic class
      public static final class WhenMappings {
         // $FF: synthetic field
         public static final int[] $EnumSwitchMapping$0;

         static {
            int[] var0 = new int[FileWalkDirection.values().length];

            try {
               var0[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError var3) {
            }

            try {
               var0[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
            } catch (NoSuchFieldError var2) {
            }

            $EnumSwitchMapping$0 = var0;
         }
      }
   }

   private abstract static class WalkState {
      @NotNull
      private final File root;

      public WalkState(@NotNull File root) {
         Intrinsics.checkNotNullParameter(root, "root");
         super();
         this.root = root;
      }

      @NotNull
      public final File getRoot() {
         return this.root;
      }

      @Nullable
      public abstract File step();
   }
}
