package org.shanoj.mobile.stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.shanoj.mobile.context.TestContext;
import org.shanoj.mobile.factories.DriverFactory;
import org.shanoj.mobile.screens.LoginScreen;
import org.shanoj.mobile.utills.JSonParser;

public class LoginStepDefs {
    LoginScreen loginScreen;

    public LoginStepDefs(TestContext context) {
        loginScreen = context.screen.loginScreen();
    }

    @Given("^the Login screen is open$")
    public void theLoginScreenIsOpen() throws Throwable {
        System.out.println("Starting Login test:::");

    }

    @And("^I login with valid credentials$")
    public void theLoginWithValidCredentials() throws Throwable {
        System.out.println("Starting Login test:::");
        String userName = JSonParser.readJsonProperty("validUser", "userName");
        String password = JSonParser.readJsonProperty("validUser", "password");
        Thread.sleep(3000);
        loginScreen.enterEmail(userName );
        loginScreen.enterPassword(password);
        loginScreen.tapOnLoginButton();
    }


}
