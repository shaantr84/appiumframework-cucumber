//package org.shanoj.mobile.tests.scripts;
//
//import org.shanoj.mobile.exceptions.JsonReaderException;
//import org.shanoj.mobile.tests.base.BaseTest;
//import org.shanoj.mobile.utills.JSonParser;
//import org.testng.annotations.Test;
//
//public class LoginTests extends BaseTest {
//    @Test
//    public void basicLoginTest() throws JsonReaderException, InterruptedException {
//        String userName = JSonParser.readJsonProperty("validUser", "userName");
//        String password = JSonParser.readJsonProperty("validUser", "password");
//        Thread.sleep(3000);
//        screen().loginScreen().enterEmail(userName );
//        screen().loginScreen().enterPassword(password);
//        screen().loginScreen().tapOnLoginButton();
//    }
//}
