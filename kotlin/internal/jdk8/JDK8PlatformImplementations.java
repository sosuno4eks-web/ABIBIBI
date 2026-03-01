package kotlin.internal.jdk8;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.internal.jdk7.JDK7PlatformImplementations;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.jdk8.PlatformThreadLocalRandom;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;
import kotlin.time.Clock;
import kotlin.time.ExperimentalTime;
import kotlin.time.Instant;
import kotlin.time.jdk8.InstantConversionsJDK8Kt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class JDK8PlatformImplementations extends JDK7PlatformImplementations {
   private final boolean sdkIsNullOrAtLeast(int version) {
      return JDK8PlatformImplementations.ReflectSdkVersion.sdkVersion == null || JDK8PlatformImplementations.ReflectSdkVersion.sdkVersion >= version;
   }

   @Nullable
   public MatchGroup getMatchResultNamedGroup(@NotNull MatchResult matchResult, @NotNull String name) {
      Intrinsics.checkNotNullParameter(matchResult, "matchResult");
      Intrinsics.checkNotNullParameter(name, "name");
      Matcher var10000 = matchResult instanceof Matcher ? (Matcher)matchResult : null;
      if ((matchResult instanceof Matcher ? (Matcher)matchResult : null) == null) {
         throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
      } else {
         Matcher matcher = var10000;
         IntRange range = new IntRange(matcher.start(name), matcher.end(name) - 1);
         MatchGroup var5;
         if (range.getStart() >= 0) {
            String var10002 = matcher.group(name);
            Intrinsics.checkNotNullExpressionValue(var10002, "group(...)");
            var5 = new MatchGroup(var10002, range);
         } else {
            var5 = null;
         }

         return var5;
      }
   }

   @NotNull
   public Random defaultPlatformRandom() {
      return this.sdkIsNullOrAtLeast(34) ? (Random)(new PlatformThreadLocalRandom()) : super.defaultPlatformRandom();
   }

   @ExperimentalTime
   @NotNull
   public Clock getSystemClock() {
      return this.sdkIsNullOrAtLeast(26) ? (Clock)(new Clock() {
         public Instant now() {
            java.time.Instant var10000 = java.time.Instant.now();
            Intrinsics.checkNotNullExpressionValue(var10000, "now(...)");
            return InstantConversionsJDK8Kt.toKotlinInstant(var10000);
         }
      }) : (Clock)(new Clock() {
         public Instant now() {
            return Instant.Companion.fromEpochMilliseconds(System.currentTimeMillis());
         }
      });
   }

   private static final class ReflectSdkVersion {
      @NotNull
      public static final JDK8PlatformImplementations.ReflectSdkVersion INSTANCE = new JDK8PlatformImplementations.ReflectSdkVersion();
      @JvmField
      @Nullable
      public static final Integer sdkVersion;

      static {
         Integer var1;
         try {
            Object var5 = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object)null);
            var1 = var5 instanceof Integer ? (Integer)var5 : null;
         } catch (Throwable var4) {
            var1 = null;
         }

         Integer var10000;
         if (var1 != null) {
            int it = ((Number)var1).intValue();
            int var3 = false;
            var10000 = it > 0 ? var1 : null;
         } else {
            var10000 = null;
         }

         sdkVersion = var10000;
      }
   }
}
