package kotlin.jvm.internal;

import org.jetbrains.annotations.NotNull;

public abstract class PrimitiveSpreadBuilder<T> {
   private final int size;
   private int position;
   @NotNull
   private final T[] spreads;

   public PrimitiveSpreadBuilder(int size) {
      this.size = size;
      this.spreads = new Object[this.size];
   }

   protected abstract int getSize(@NotNull T var1);

   protected final int getPosition() {
      return this.position;
   }

   protected final void setPosition(int <set-?>) {
      this.position = var1;
   }

   /** @deprecated */
   // $FF: synthetic method
   private static void getSpreads$annotations() {
   }

   public final void addSpread(@NotNull T spreadArgument) {
      Intrinsics.checkNotNullParameter(spreadArgument, "spreadArgument");
      Object[] var10000 = this.spreads;
      int var2 = this.position++;
      var10000[var2] = spreadArgument;
   }

   protected final int size() {
      int totalLength = 0;
      int i = 0;
      int var3 = this.size - 1;
      if (i <= var3) {
         while(true) {
            Object var10001 = this.spreads[i];
            totalLength += var10001 != null ? this.getSize(var10001) : 1;
            if (i == var3) {
               break;
            }

            ++i;
         }
      }

      return totalLength;
   }

   @NotNull
   protected final T toArray(@NotNull T values, @NotNull T result) {
      Intrinsics.checkNotNullParameter(values, "values");
      Intrinsics.checkNotNullParameter(result, "result");
      int dstIndex = 0;
      int copyValuesFrom = 0;
      int i = 0;
      int var6 = this.size - 1;
      if (i <= var6) {
         while(true) {
            Object spreadArgument = this.spreads[i];
            if (spreadArgument != null) {
               if (copyValuesFrom < i) {
                  System.arraycopy(values, copyValuesFrom, result, dstIndex, i - copyValuesFrom);
                  dstIndex += i - copyValuesFrom;
               }

               int spreadSize = this.getSize(spreadArgument);
               System.arraycopy(spreadArgument, 0, result, dstIndex, spreadSize);
               dstIndex += spreadSize;
               copyValuesFrom = i + 1;
            }

            if (i == var6) {
               break;
            }

            ++i;
         }
      }

      if (copyValuesFrom < this.size) {
         System.arraycopy(values, copyValuesFrom, result, dstIndex, this.size - copyValuesFrom);
      }

      return result;
   }
}
