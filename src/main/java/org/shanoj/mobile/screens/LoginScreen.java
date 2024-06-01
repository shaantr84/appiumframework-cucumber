package org.shanoj.mobile.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class LoginScreen extends BaseScreen {
    public LoginScreen(AppiumDriver driver) {
        System.out.println("LOG: " + getClass().getName() + " class has been initialized");
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(5)), this);
    }

    @AndroidFindBy(accessibility = "Email")
    private WebElement edtEmail;

    @AndroidFindBy(accessibility = "Password")
    private WebElement edtPassword;

    @AndroidFindBy(accessibility = "Login")
    private WebElement btnLogin;


    public LoginScreen enterEmail(String email) {
        edtEmail.sendKeys(email);
        return this;
    }

    public LoginScreen enterPassword(String password) {
        edtPassword.sendKeys(password);
        return this;
    }

    public LoginScreen tapOnLoginButton() {
        btnLogin.click();
        return this;
    }
}



