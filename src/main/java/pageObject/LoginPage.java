package pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends ProductsPage {

    //LOGIN FORM FIELDS
    public static final SelenideElement usernameField = $("#user-name");
    public static final SelenideElement passwordField = $("#password");

    //BUTTON
    public static final SelenideElement loginButton = $("#login-button");

    //DATA
    public static final CharSequence USERNAME = ("standard_user");
    public static final CharSequence PASSWORD = ("secret_sauce");

    public static void login() {

        usernameField.sendKeys(USERNAME);
        passwordField.sendKeys(PASSWORD);
        loginButton.click();

    }

    public static void openLoginPage(){

        open("https://www.saucedemo.com/");

    }
}

