package pageObject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutInformationPage {

    //CHECKOUT FORM FIELDS
    private static final SelenideElement firstNameField = $("#first-name");
    private static final SelenideElement lastNameField = $("#last-name");
    private static final SelenideElement zipPostalCodeField = $("#postal-code");

    //BUTTON
    private static final SelenideElement continueButton = $("#continue");

    //DATA
    private static final CharSequence FIRST_NAME = ("Maria");
    private static final CharSequence LAST_NAME = ("Shevchenko");
    private static final CharSequence ZIP_POSTAL_CODE = ("256129");

    @Step("Click continue button")
    public static void clickContinueButton() {

        firstNameField.sendKeys(FIRST_NAME);
        lastNameField.sendKeys(LAST_NAME);
        zipPostalCodeField.sendKeys(ZIP_POSTAL_CODE);
        continueButton.click();

    }
}