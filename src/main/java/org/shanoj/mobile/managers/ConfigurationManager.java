package org.shanoj.mobile.managers;

import org.aeonbits.owner.ConfigCache;
import org.shanoj.mobile.config.MyConfig;

public class ConfigurationManager {

    private ConfigurationManager() {
    }

    public static MyConfig getConfiguration() {
        return ConfigCache.getOrCreate(MyConfig.class);
    }

}

