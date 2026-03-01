package kotlin.enums;

import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.markers.KMappedMarker;

@SinceKotlin(
   version = "1.9"
)
@WasExperimental(
   markerClass = {ExperimentalStdlibApi.class}
)
public interface EnumEntries<E extends Enum<E>> extends List<E>, KMappedMarker {
}
