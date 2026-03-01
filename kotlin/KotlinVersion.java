package kotlin;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(
   version = "1.1"
)
public final class KotlinVersion implements Comparable<KotlinVersion> {
   @NotNull
   public static final KotlinVersion.Companion Companion = new KotlinVersion.Companion((DefaultConstructorMarker)null);
   private final int major;
   private final int minor;
   private final int patch;
   private final int version;
   public static final int MAX_COMPONENT_VALUE = 255;
   @JvmField
   @NotNull
   public static final KotlinVersion CURRENT = KotlinVersionCurrentValue.get();

   public KotlinVersion(int major, int minor, int patch) {
      this.major = major;
      this.minor = minor;
      this.patch = patch;
      this.version = this.versionOf(this.major, this.minor, this.patch);
   }

   public final int getMajor() {
      return this.major;
   }

   public final int getMinor() {
      return this.minor;
   }

   public final int getPatch() {
      return this.patch;
   }

   public KotlinVersion(int major, int minor) {
      this(major, minor, 0);
   }

   private final int versionOf(int major, int minor, int patch) {
      if (!(0 <= major ? major < 256 : false) || !(0 <= minor ? minor < 256 : false) || !(0 <= patch ? patch < 256 : false)) {
         int var4 = false;
         String var5 = "Version components are out of range: " + major + '.' + minor + '.' + patch;
         throw new IllegalArgumentException(var5.toString());
      } else {
         return (major << 16) + (minor << 8) + patch;
      }
   }

   @NotNull
   public String toString() {
      return "" + this.major + '.' + this.minor + '.' + this.patch;
   }

   public boolean equals(@Nullable Object other) {
      if (this == other) {
         return true;
      } else {
         KotlinVersion var10000 = other instanceof KotlinVersion ? (KotlinVersion)other : null;
         if ((other instanceof KotlinVersion ? (KotlinVersion)other : null) == null) {
            return false;
         } else {
            KotlinVersion otherVersion = var10000;
            return this.version == otherVersion.version;
         }
      }
   }

   public int hashCode() {
      return this.version;
   }

   public int compareTo(@NotNull KotlinVersion other) {
      Intrinsics.checkNotNullParameter(other, "other");
      return this.version - other.version;
   }

   public final boolean isAtLeast(int major, int minor) {
      return this.major > major || this.major == major && this.minor >= minor;
   }

   public final boolean isAtLeast(int major, int minor, int patch) {
      return this.major > major || this.major == major && (this.minor > minor || this.minor == minor && this.patch >= patch);
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
