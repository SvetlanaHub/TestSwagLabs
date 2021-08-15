package pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import io.qameta.allure.Step;

public class LoginPage extends ProductsPage {

    //LOGIN FORM FIELDS
    public static final SelenideElement usernameField = $("#user-name");
    public static final SelenideElement passwordField = $("#password");

    //BUTTON
    public static final SelenideElement loginButton = $("#login-button");

    //DATA
    public static final CharSequence USERNAME = ("standard_user");
    public static final CharSequence PASSWORD = ("secret_sauce");

    @Step("Login")
    public static void login() {

        usernameField.sendKeys(USERNAME);
        passwordField.sendKeys(PASSWORD);
        loginButton.click();

    }
    @Step("Open login page")
    public static void openLoginPage(){

        open("https://www.saucedemo.com/");

    }
}

