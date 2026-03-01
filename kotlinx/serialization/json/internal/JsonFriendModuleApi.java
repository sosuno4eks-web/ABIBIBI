package kotlinx.serialization.json.internal;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.RequiresOptIn;

@Retention(RetentionPolicy.RUNTIME)
@RequiresOptIn(
   level = RequiresOptIn.Level.ERROR
)
public @interface JsonFriendModuleApi {
}
