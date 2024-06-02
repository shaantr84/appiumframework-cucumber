package org.shanoj.mobile.managers;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.shanoj.mobile.model.capabilities.AndroidCapabilities;
import org.shanoj.mobile.utills.AndroidCapbilityBuilder;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDriverManager implements IDriverManager {
    protected AppiumDriver driver;
    URL url;
    @Override
    public AppiumDriver createDriverInstance() {
        System.out.println("Creating driver : Android manager");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        AndroidCapabilities androidCapabilities = new AndroidCapbilityBuilder().getCapabilities();
        desiredCapabilities.setCapability("platformName", androidCapabilities.getPlatformName());
        desiredCapabilities.setCapability("platformVersion",androidCapabilities.getPlatformVersion());
        desiredCapabilities.setCapability("deviceName", androidCapabilities.getDeviceName());
        try {
            System.out.println(ConfigurationManager.getConfiguration().appiumServerURL());
            url = new URL(ConfigurationManager.getConfiguration().appiumServerURL());
            desiredCapabilities.setCapability("appPackage", androidCapabilities.getAppPackage());
            desiredCapabilities.setCapability("appActivity", androidCapabilities.getAppActivity());
            desiredCapabilities.setCapability("automationName",androidCapabilities.getAutomationName());
            driver = new AndroidDriver (url, desiredCapabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }
}
