package org.shanoj.mobile.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;
import org.shanoj.mobile.enums.Platform;

@LoadPolicy(LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "classpath:config/general.properties",
        "classpath:config/uat.properties"
})
public interface MyConfig extends Config {
    String testDataFileLocation();
    String appiumServerURL();
    Platform executeOnPlatform();
    String baseURL();
}
