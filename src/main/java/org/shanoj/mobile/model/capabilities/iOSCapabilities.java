package org.shanoj.mobile.model.capabilities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class iOSCapabilities {
    String platformName;
    String platformVersion;
    String appPath;
    String automationName;
    String deviceName;
    String bundleId;
    String udid;
}
