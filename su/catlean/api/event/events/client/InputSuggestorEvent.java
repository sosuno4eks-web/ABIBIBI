package su.catlean.api.event.events.client;

import com.mojang.brigadier.CommandDispatcher;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2172;
import net.minecraft.class_637;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.Event;

public final class InputSuggestorEvent extends Event {
   @NotNull
   public static final InputSuggestorEvent INSTANCE = new InputSuggestorEvent();
   @NotNull
   private static String prefix = "";
   @Nullable
   private static CommandDispatcher<class_2172> dispatcher;
   @Nullable
   private static class_637 source;

   private InputSuggestorEvent() {
   }

   @NotNull
   public final String getPrefix() {
      return prefix;
   }

   public final void setPrefix(@NotNull String <set-?>) {
      Intrinsics.checkNotNullParameter(var1, "<set-?>");
      prefix = var1;
   }

   @Nullable
   public final CommandDispatcher<class_2172> getDispatcher() {
      return dispatcher;
   }

   public final void setDispatcher(@Nullable CommandDispatcher<class_2172> <set-?>) {
      dispatcher = var1;
   }

   @Nullable
   public final class_637 getSource() {
      return source;
   }

   public final void setSource(@Nullable class_637 <set-?>) {
      source = var1;
   }
}
