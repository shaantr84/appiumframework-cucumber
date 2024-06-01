package org.shanoj.mobile.model.capabilities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AndroidCapabilities {
    String platformName;
    String platformVersion;
    String appPath;
    String automationName;
    String deviceName;
    String appPackage;
    String appActivity;
}
