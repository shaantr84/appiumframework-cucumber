package org.shanoj.mobile.managers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.shanoj.mobile.model.capabilities.iOSCapabilities;
import org.shanoj.mobile.utills.IOSCapbilityBuilder;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSDriverManager implements IDriverManager {
    protected AppiumDriver driver;
    URL url;
    @Override
    public AppiumDriver createDriverInstance() {
        try {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            iOSCapabilities iosCapabilities= new IOSCapbilityBuilder().getCapabilities();
            desiredCapabilities.setCapability("platformName", iosCapabilities.getPlatformName());
            desiredCapabilities.setCapability("deviceName", iosCapabilities.getDeviceName());
            desiredCapabilities.setCapability("udid",iosCapabilities.getUdid());
            desiredCapabilities.setCapability("automationName", iosCapabilities.getAutomationName());
            url = new URL(ConfigurationManager.getConfiguration().appiumServerURL());
            String iOSAppUrl = getClass().getResource(iosCapabilities.getAppPath()).getFile();
            desiredCapabilities.setCapability("bundleId", iosCapabilities.getBundleId());
            desiredCapabilities.setCapability("app", iOSAppUrl);
            driver = new IOSDriver (url, desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
