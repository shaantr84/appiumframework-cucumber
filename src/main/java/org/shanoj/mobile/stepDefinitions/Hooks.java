package org.shanoj.mobile.stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.shanoj.mobile.context.TestContext;
import org.shanoj.mobile.enums.Platform;
import org.shanoj.mobile.factories.DriverManagerFactoryImpl;
import org.shanoj.mobile.factories.ScreenFactory;
import org.shanoj.mobile.managers.ConfigurationManager;
import org.shanoj.mobile.utills.JSonParser;

public class Hooks {
    protected AppiumDriver driver;
    private ScreenFactory screen;
    private final TestContext context;

    public Hooks(TestContext context) {
        System.out.println("-------------------INITIALIZING DRIVERFACTORY------------------");
        this.context = context;
    }

    @Before
    public void setUp(Scenario scenario) throws Exception {
        System.out.println("---------------------BEFORE SCENARIO STARTED-------------------");
        Platform platform = ConfigurationManager.getConfiguration().executeOnPlatform();
        System.out.println("Executing on platform : " +platform);
        driver = new DriverManagerFactoryImpl().getManager(platform).createDriverInstance();
        context.driver = driver;
        screen = new ScreenFactory(context.driver);
        context.screen = screen;
        System.out.println("path to testdata : " + ConfigurationManager.getConfiguration().testDataFileLocation());
        JSonParser.loadJsonFile(ConfigurationManager.getConfiguration().testDataFileLocation());
        System.out.println("LOG: Driver Class: " + driver.getClass());
        System.out.println("LOG: Driver Session ID: " + driver.getSessionId());
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("------------------------AFTER SCENARIO------------------------");
        if (driver != null) {
            driver.quit();
        }
    }

    public ScreenFactory screen() {
        return this.screen;
    }
}