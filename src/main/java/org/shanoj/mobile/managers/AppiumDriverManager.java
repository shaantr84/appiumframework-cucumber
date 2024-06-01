//package org.shanoj.mobile.managers;
//
//
//import io.appium.java_client.AppiumDriver;
//
//public class AppiumDriverManager {
//    private static ThreadLocal<AppiumDriver> appiumDriver = new ThreadLocal<>();
//
//    public static AppiumDriver getDriver() {
//        return appiumDriver.get();
//    }
//
//    public static void setDriver(AppiumDriver driver) {
//        appiumDriver.set(driver);
//    }
//
//    public static void unload() {
//        appiumDriver.remove();
//    }
//}
