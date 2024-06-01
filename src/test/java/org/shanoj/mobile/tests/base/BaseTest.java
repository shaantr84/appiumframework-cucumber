//package org.shanoj.mobile.tests.base;
//
//import io.appium.java_client.AppiumDriver;
//import org.shanoj.mobile.enums.Platform;
//import org.shanoj.mobile.exceptions.PlatformNotSupportedException;
//import org.shanoj.mobile.factories.DriverManagerFactoryImpl;
//import org.shanoj.mobile.factories.ScreenFactory;
//import org.shanoj.mobile.managers.AppiumDriverManager;
//import org.shanoj.mobile.managers.ConfigurationManager;
//import org.shanoj.mobile.utills.JSonParser;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//
//import static org.shanoj.mobile.managers.AppiumDriverManager.unload;
//
//public abstract class BaseTest {
//    protected AppiumDriver driver;
//    private ScreenFactory screen;
//
//    @BeforeMethod
//    public void setUp() throws PlatformNotSupportedException {
//        Platform platform = ConfigurationManager.getConfiguration().executeOnPlatform();
//        driver = new DriverManagerFactoryImpl().getManager(platform).createDriverInstance();
//        AppiumDriverManager.setDriver(driver);
//        screen = new ScreenFactory(driver);
//        System.out.println("path to testdata : "+ConfigurationManager.getConfiguration().testDataFileLocation());
//        JSonParser.loadJsonFile(ConfigurationManager.getConfiguration().testDataFileLocation());
//    }
//
//    public ScreenFactory screen() {
//        return this.screen;
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        System.out.println("Inside aftermethod");
//        driver.quit();
//        unload();
//    }
//}
