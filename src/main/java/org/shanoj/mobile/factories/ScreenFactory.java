package org.shanoj.mobile.factories;

import io.appium.java_client.AppiumDriver;
import org.shanoj.mobile.screens.LoginScreen;

public class ScreenFactory {
    private AppiumDriver driver;
    private LoginScreen loginScreen;


    public ScreenFactory(AppiumDriver driver) {
        this.driver = driver;
    }

    public ScreenFactory getInstance() {
        return new ScreenFactory(driver);
    }

    public LoginScreen loginScreen() {
        return (loginScreen == null) ? loginScreen = new LoginScreen(driver) : loginScreen;
    }

}
