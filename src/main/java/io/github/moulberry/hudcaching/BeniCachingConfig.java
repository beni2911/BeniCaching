package io.github.moulberry.hudcaching;

import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.Slider;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;

/** OneConfig settings for BeniCaching. */
public class BeniCachingConfig extends Config {

    @Slider(
            name = "HUD update rate (per second)",
            min = 1f,
            max = 20f,
            step = 1
    )
    public static int hudUpdateRate = 20;

    public BeniCachingConfig() {
        super(new Mod("BeniCaching", ModType.UTIL_QOL), "benicaching.json");
        initialize();
    }
}
