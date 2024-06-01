package org.shanoj.mobile.factories;
import io.appium.java_client.AppiumDriver;
import org.shanoj.mobile.enums.Platform;
import org.shanoj.mobile.exceptions.PlatformNotSupportedException;
import org.shanoj.mobile.managers.AndroidDriverManager;
import org.shanoj.mobile.managers.IOSDriverManager;

public class DriverFactory {
    public AppiumDriver createInstance(Platform platform) throws PlatformNotSupportedException {
        AppiumDriver driver;

        switch (platform) {
            case IOS:
                driver = new IOSDriverManager().createDriverInstance();
                break;

            case ANDROID:
                driver = new AndroidDriverManager().createDriverInstance();
                break;

            default:
                throw new PlatformNotSupportedException(
                        "Platform not supported! Check if you set ios or android on the parameter.");
        }
        return driver;
    }
}
