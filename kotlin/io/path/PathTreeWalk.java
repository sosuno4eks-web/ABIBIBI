package kotlin.io.path;

import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

public final class PathTreeWalk implements Sequence<Path> {
   @NotNull
   private final Path start;
   @NotNull
   private final PathWalkOption[] options;

   public PathTreeWalk(@NotNull Path start, @NotNull PathWalkOption[] options) {
      Intrinsics.checkNotNullParameter(start, "start");
      Intrinsics.checkNotNullParameter(options, "options");
      super();
      this.start = start;
      this.options = options;
   }

   private final boolean getFollowLinks() {
      return ArraysKt.contains(this.options, PathWalkOption.FOLLOW_LINKS);
   }

   private final LinkOption[] getLinkOptions() {
      return LinkFollowing.INSTANCE.toLinkOptions(this.getFollowLinks());
   }

   private final boolean getIncludeDirectories() {
      return ArraysKt.contains(this.options, PathWalkOption.INCLUDE_DIRECTORIES);
   }

   private final boolean isBFS() {
      return ArraysKt.contains(this.options, PathWalkOption.BREADTH_FIRST);
   }

   @NotNull
   public Iterator<Path> iterator() {
      return this.isBFS() ? this.bfsIterator() : this.dfsIterator();
   }

   private final Object yieldIfNeeded(SequenceScope<? super Path> $this$yieldIfNeeded, PathNode node, DirectoryEntriesReader entriesReader, Function1<? super List<PathNode>, Unit> entriesAction, Continuation<? super Unit> $completion) {
      int $i$f$yieldIfNeeded = false;
      Path path = node.getPath();
      if (node.getParent() != null) {
         PathsKt.checkFileName(path);
      }

      LinkOption[] var9 = access$getLinkOptions(this);
      var9 = (LinkOption[])Arrays.copyOf(var9, var9.length);
      if (Files.isDirectory(path, (LinkOption[])Arrays.copyOf(var9, var9.length))) {
         if (PathTreeWalkKt.access$createsCycle(node)) {
            throw new FileSystemLoopException(path.toString());
         }

         if (access$getIncludeDirectories(this)) {
            InlineMarker.mark(0);
            $this$yieldIfNeeded.yield(path, $completion);
            InlineMarker.mark(1);
         }

         var9 = access$getLinkOptions(this);
         var9 = (LinkOption[])Arrays.copyOf(var9, var9.length);
         if (Files.isDirectory(path, (LinkOption[])Arrays.copyOf(var9, var9.length))) {
            entriesAction.invoke(entriesReader.readEntries(node));
         }
      } else {
         var9 = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
         if (Files.exists(path, (LinkOption[])Arrays.copyOf(var9, var9.length))) {
            InlineMarker.mark(0);
            $this$yieldIfNeeded.yield(path, $completion);
            InlineMarker.mark(1);
            return Unit.INSTANCE;
         }
      }

      return Unit.INSTANCE;
   }

   private final Iterator<Path> dfsIterator() {
      return SequencesKt.iterator((Function2)(new Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object>((Continuation)null) {
         Object L$1;
         Object L$2;
         Object L$3;
         Object L$4;
         Object L$5;
         Object L$6;
         Object L$7;
         Object L$8;
         Object L$9;
         int I$0;
         int label;
         // $FF: synthetic field
         private Object L$0;

         public final Object invokeSuspend(Object $result) {
            SequenceScope $this$iterator;
            ArrayDeque stack;
            DirectoryEntriesReader entriesReader;
            PathNode startNode;
            PathNode topNode;
            Iterator topIterator;
            PathNode pathNode;
            PathTreeWalk this_$iv;
            Path path$ivx;
            LinkOption[] var14;
            List entriesx;
            boolean var16;
            Object var17;
            Continuation var10002;
            label102: {
               $this$iterator = (SequenceScope)this.L$0;
               var17 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
               SequenceScope $this$yieldIfNeeded$iv;
               int $i$f$yieldIfNeededx;
               PathTreeWalk this_$ivx;
               SequenceScope $this$yieldIfNeeded$ivx;
               int $i$f$yieldIfNeededxx;
               Path path$iv;
               LinkOption[] var23;
               switch(this.label) {
               case 0:
                  ResultKt.throwOnFailure($result);
                  stack = new ArrayDeque();
                  entriesReader = new DirectoryEntriesReader(PathTreeWalk.this.getFollowLinks());
                  startNode = new PathNode(PathTreeWalk.this.start, PathTreeWalkKt.access$keyOf(PathTreeWalk.this.start, PathTreeWalk.this.getLinkOptions()), (PathNode)null);
                  this_$ivx = PathTreeWalk.this;
                  int $i$f$yieldIfNeededxxx = 0;
                  path$iv = startNode.getPath();
                  if (startNode.getParent() != null) {
                     PathsKt.checkFileName(path$iv);
                  }

                  var23 = this_$ivx.getLinkOptions();
                  var23 = (LinkOption[])Arrays.copyOf(var23, var23.length);
                  if (!Files.isDirectory(path$iv, (LinkOption[])Arrays.copyOf(var23, var23.length))) {
                     var23 = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
                     if (Files.exists(path$iv, (LinkOption[])Arrays.copyOf(var23, var23.length))) {
                        var10002 = (Continuation)this;
                        this.L$0 = $this$iterator;
                        this.L$1 = stack;
                        this.L$2 = entriesReader;
                        this.L$3 = SpillingKt.nullOutSpilledVariable(startNode);
                        this.L$4 = SpillingKt.nullOutSpilledVariable(this_$ivx);
                        this.L$5 = SpillingKt.nullOutSpilledVariable($this$iterator);
                        this.L$6 = SpillingKt.nullOutSpilledVariable(path$iv);
                        this.I$0 = $i$f$yieldIfNeededxxx;
                        this.label = 2;
                        if ($this$iterator.yield(path$iv, var10002) == var17) {
                           return var17;
                        }
                     }
                     break label102;
                  }

                  if (PathTreeWalkKt.access$createsCycle(startNode)) {
                     throw new FileSystemLoopException(path$iv.toString());
                  }

                  if (this_$ivx.getIncludeDirectories()) {
                     var10002 = (Continuation)this;
                     this.L$0 = $this$iterator;
                     this.L$1 = stack;
                     this.L$2 = entriesReader;
                     this.L$3 = startNode;
                     this.L$4 = this_$ivx;
                     this.L$5 = SpillingKt.nullOutSpilledVariable($this$iterator);
                     this.L$6 = path$iv;
                     this.I$0 = $i$f$yieldIfNeededxxx;
                     this.label = 1;
                     if ($this$iterator.yield(path$iv, var10002) == var17) {
                        return var17;
                     }
                  }
                  break;
               case 1:
                  $i$f$yieldIfNeededxx = this.I$0;
                  path$iv = (Path)this.L$6;
                  $this$yieldIfNeeded$ivx = (SequenceScope)this.L$5;
                  this_$ivx = (PathTreeWalk)this.L$4;
                  startNode = (PathNode)this.L$3;
                  entriesReader = (DirectoryEntriesReader)this.L$2;
                  stack = (ArrayDeque)this.L$1;
                  ResultKt.throwOnFailure($result);
                  break;
               case 2:
                  $i$f$yieldIfNeededxx = this.I$0;
                  path$iv = (Path)this.L$6;
                  $this$yieldIfNeeded$ivx = (SequenceScope)this.L$5;
                  this_$ivx = (PathTreeWalk)this.L$4;
                  startNode = (PathNode)this.L$3;
                  entriesReader = (DirectoryEntriesReader)this.L$2;
                  stack = (ArrayDeque)this.L$1;
                  ResultKt.throwOnFailure($result);
                  break label102;
               case 3:
                  $i$f$yieldIfNeededx = this.I$0;
                  path$ivx = (Path)this.L$9;
                  $this$yieldIfNeeded$iv = (SequenceScope)this.L$8;
                  this_$iv = (PathTreeWalk)this.L$7;
                  pathNode = (PathNode)this.L$6;
                  topIterator = (Iterator)this.L$5;
                  topNode = (PathNode)this.L$4;
                  startNode = (PathNode)this.L$3;
                  entriesReader = (DirectoryEntriesReader)this.L$2;
                  stack = (ArrayDeque)this.L$1;
                  ResultKt.throwOnFailure($result);
                  var14 = this_$iv.getLinkOptions();
                  var14 = (LinkOption[])Arrays.copyOf(var14, var14.length);
                  if (Files.isDirectory(path$ivx, (LinkOption[])Arrays.copyOf(var14, var14.length))) {
                     entriesx = entriesReader.readEntries(pathNode);
                     var16 = false;
                     pathNode.setContentIterator(entriesx.iterator());
                     stack.addLast(pathNode);
                  }
                  break label102;
               case 4:
                  $i$f$yieldIfNeededx = this.I$0;
                  path$ivx = (Path)this.L$9;
                  $this$yieldIfNeeded$iv = (SequenceScope)this.L$8;
                  this_$iv = (PathTreeWalk)this.L$7;
                  pathNode = (PathNode)this.L$6;
                  topIterator = (Iterator)this.L$5;
                  topNode = (PathNode)this.L$4;
                  startNode = (PathNode)this.L$3;
                  entriesReader = (DirectoryEntriesReader)this.L$2;
                  stack = (ArrayDeque)this.L$1;
                  ResultKt.throwOnFailure($result);
                  break label102;
               default:
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               var23 = this_$ivx.getLinkOptions();
               var23 = (LinkOption[])Arrays.copyOf(var23, var23.length);
               if (Files.isDirectory(path$iv, (LinkOption[])Arrays.copyOf(var23, var23.length))) {
                  List entries = entriesReader.readEntries(startNode);
                  int var13 = false;
                  startNode.setContentIterator(entries.iterator());
                  stack.addLast(startNode);
               }
            }

            while(!((Collection)stack).isEmpty()) {
               topNode = (PathNode)stack.last();
               Iterator var10000 = topNode.getContentIterator();
               Intrinsics.checkNotNull(var10000);
               topIterator = var10000;
               if (topIterator.hasNext()) {
                  pathNode = (PathNode)topIterator.next();
                  this_$iv = PathTreeWalk.this;
                  int $i$f$yieldIfNeeded = 0;
                  path$ivx = pathNode.getPath();
                  if (pathNode.getParent() != null) {
                     PathsKt.checkFileName(path$ivx);
                  }

                  var14 = this_$iv.getLinkOptions();
                  var14 = (LinkOption[])Arrays.copyOf(var14, var14.length);
                  if (Files.isDirectory(path$ivx, (LinkOption[])Arrays.copyOf(var14, var14.length))) {
                     if (PathTreeWalkKt.access$createsCycle(pathNode)) {
                        throw new FileSystemLoopException(path$ivx.toString());
                     }

                     if (this_$iv.getIncludeDirectories()) {
                        var10002 = (Continuation)this;
                        this.L$0 = $this$iterator;
                        this.L$1 = stack;
                        this.L$2 = entriesReader;
                        this.L$3 = SpillingKt.nullOutSpilledVariable(startNode);
                        this.L$4 = SpillingKt.nullOutSpilledVariable(topNode);
                        this.L$5 = SpillingKt.nullOutSpilledVariable(topIterator);
                        this.L$6 = pathNode;
                        this.L$7 = this_$iv;
                        this.L$8 = SpillingKt.nullOutSpilledVariable($this$iterator);
                        this.L$9 = path$ivx;
                        this.I$0 = $i$f$yieldIfNeeded;
                        this.label = 3;
                        if ($this$iterator.yield(path$ivx, var10002) == var17) {
                           return var17;
                        }
                     }

                     var14 = this_$iv.getLinkOptions();
                     var14 = (LinkOption[])Arrays.copyOf(var14, var14.length);
                     if (Files.isDirectory(path$ivx, (LinkOption[])Arrays.copyOf(var14, var14.length))) {
                        entriesx = entriesReader.readEntries(pathNode);
                        var16 = false;
                        pathNode.setContentIterator(entriesx.iterator());
                        stack.addLast(pathNode);
                     }
                  } else {
                     var14 = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
                     if (Files.exists(path$ivx, (LinkOption[])Arrays.copyOf(var14, var14.length))) {
                        var10002 = (Continuation)this;
                        this.L$0 = $this$iterator;
                        this.L$1 = stack;
                        this.L$2 = entriesReader;
                        this.L$3 = SpillingKt.nullOutSpilledVariable(startNode);
                        this.L$4 = SpillingKt.nullOutSpilledVariable(topNode);
                        this.L$5 = SpillingKt.nullOutSpilledVariable(topIterator);
                        this.L$6 = SpillingKt.nullOutSpilledVariable(pathNode);
                        this.L$7 = SpillingKt.nullOutSpilledVariable(this_$iv);
                        this.L$8 = SpillingKt.nullOutSpilledVariable($this$iterator);
                        this.L$9 = SpillingKt.nullOutSpilledVariable(path$ivx);
                        this.I$0 = $i$f$yieldIfNeeded;
                        this.label = 4;
                        if ($this$iterator.yield(path$ivx, var10002) == var17) {
                           return var17;
                        }
                     }
                  }
               } else {
                  stack.removeLast();
               }
            }

            return Unit.INSTANCE;
         }

         public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            Function2 var3 = new <anonymous constructor>($completion);
            var3.L$0 = value;
            return (Continuation)var3;
         }

         public final Object invoke(SequenceScope<? super Path> p1, Continuation<? super Unit> p2) {
            return ((<undefinedtype>)this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
         }
      }));
   }

   private final Iterator<Path> bfsIterator() {
      return SequencesKt.iterator((Function2)(new Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object>((Continuation)null) {
         Object L$1;
         Object L$2;
         Object L$3;
         Object L$4;
         Object L$5;
         Object L$6;
         int I$0;
         int label;
         // $FF: synthetic field
         private Object L$0;

         public final Object invokeSuspend(Object $result) {
            SequenceScope $this$iterator = (SequenceScope)this.L$0;
            Object var14 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ArrayDeque queue;
            DirectoryEntriesReader entriesReader;
            PathNode pathNode;
            PathTreeWalk this_$iv;
            SequenceScope $this$yieldIfNeeded$iv;
            int $i$f$yieldIfNeededx;
            Path path$iv;
            LinkOption[] var11;
            List entries;
            boolean var13;
            switch(this.label) {
            case 0:
               ResultKt.throwOnFailure($result);
               queue = new ArrayDeque();
               entriesReader = new DirectoryEntriesReader(PathTreeWalk.this.getFollowLinks());
               queue.addLast(new PathNode(PathTreeWalk.this.start, PathTreeWalkKt.access$keyOf(PathTreeWalk.this.start, PathTreeWalk.this.getLinkOptions()), (PathNode)null));
               break;
            case 1:
               $i$f$yieldIfNeededx = this.I$0;
               path$iv = (Path)this.L$6;
               $this$yieldIfNeeded$iv = (SequenceScope)this.L$5;
               this_$iv = (PathTreeWalk)this.L$4;
               pathNode = (PathNode)this.L$3;
               entriesReader = (DirectoryEntriesReader)this.L$2;
               queue = (ArrayDeque)this.L$1;
               ResultKt.throwOnFailure($result);
               var11 = this_$iv.getLinkOptions();
               var11 = (LinkOption[])Arrays.copyOf(var11, var11.length);
               if (Files.isDirectory(path$iv, (LinkOption[])Arrays.copyOf(var11, var11.length))) {
                  entries = entriesReader.readEntries(pathNode);
                  var13 = false;
                  queue.addAll((Collection)entries);
               }
               break;
            case 2:
               $i$f$yieldIfNeededx = this.I$0;
               path$iv = (Path)this.L$6;
               $this$yieldIfNeeded$iv = (SequenceScope)this.L$5;
               this_$iv = (PathTreeWalk)this.L$4;
               pathNode = (PathNode)this.L$3;
               entriesReader = (DirectoryEntriesReader)this.L$2;
               queue = (ArrayDeque)this.L$1;
               ResultKt.throwOnFailure($result);
               break;
            default:
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            while(!((Collection)queue).isEmpty()) {
               pathNode = (PathNode)queue.removeFirst();
               this_$iv = PathTreeWalk.this;
               int $i$f$yieldIfNeeded = 0;
               path$iv = pathNode.getPath();
               if (pathNode.getParent() != null) {
                  PathsKt.checkFileName(path$iv);
               }

               var11 = this_$iv.getLinkOptions();
               var11 = (LinkOption[])Arrays.copyOf(var11, var11.length);
               Continuation var10002;
               if (Files.isDirectory(path$iv, (LinkOption[])Arrays.copyOf(var11, var11.length))) {
                  if (PathTreeWalkKt.access$createsCycle(pathNode)) {
                     throw new FileSystemLoopException(path$iv.toString());
                  }

                  if (this_$iv.getIncludeDirectories()) {
                     var10002 = (Continuation)this;
                     this.L$0 = $this$iterator;
                     this.L$1 = queue;
                     this.L$2 = entriesReader;
                     this.L$3 = pathNode;
                     this.L$4 = this_$iv;
                     this.L$5 = SpillingKt.nullOutSpilledVariable($this$iterator);
                     this.L$6 = path$iv;
                     this.I$0 = $i$f$yieldIfNeeded;
                     this.label = 1;
                     if ($this$iterator.yield(path$iv, var10002) == var14) {
                        return var14;
                     }
                  }

                  var11 = this_$iv.getLinkOptions();
                  var11 = (LinkOption[])Arrays.copyOf(var11, var11.length);
                  if (Files.isDirectory(path$iv, (LinkOption[])Arrays.copyOf(var11, var11.length))) {
                     entries = entriesReader.readEntries(pathNode);
                     var13 = false;
                     queue.addAll((Collection)entries);
                  }
               } else {
                  var11 = new LinkOption[]{LinkOption.NOFOLLOW_LINKS};
                  if (Files.exists(path$iv, (LinkOption[])Arrays.copyOf(var11, var11.length))) {
                     var10002 = (Continuation)this;
                     this.L$0 = $this$iterator;
                     this.L$1 = queue;
                     this.L$2 = entriesReader;
                     this.L$3 = SpillingKt.nullOutSpilledVariable(pathNode);
                     this.L$4 = SpillingKt.nullOutSpilledVariable(this_$iv);
                     this.L$5 = SpillingKt.nullOutSpilledVariable($this$iterator);
                     this.L$6 = SpillingKt.nullOutSpilledVariable(path$iv);
                     this.I$0 = $i$f$yieldIfNeeded;
                     this.label = 2;
                     if ($this$iterator.yield(path$iv, var10002) == var14) {
                        return var14;
                     }
                  }
               }
            }

            return Unit.INSTANCE;
         }

         public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
            Function2 var3 = new <anonymous constructor>($completion);
            var3.L$0 = value;
            return (Continuation)var3;
         }

         public final Object invoke(SequenceScope<? super Path> p1, Continuation<? super Unit> p2) {
            return ((<undefinedtype>)this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
         }
      }));
   }
}
