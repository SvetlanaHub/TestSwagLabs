package pageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CheckoutOverviewPage {

    //BUTTONS
    private static final SelenideElement finishButton = $("#finish");
    private static final SelenideElement cancelButton = $("#cancel");

    //PRICE
    private static final ElementsCollection itemPrice = $$(".inventory_item_price");
    public static SelenideElement itemTotalPrice = $(".summary_subtotal_label");

    @Step("Click to finish button")
    public static void clickToFinishButton() {

        finishButton.click();

    }

    @Step("Click to cancel button")
    public static void clickToCancelButton() {

        cancelButton.click();

    }

    public static List<Double> getItemPrices() {

        return itemPrice.stream()
                .map(a -> a.getText().replace("$", ""))
                .map(Double::valueOf)
                .collect(Collectors.toList());

    }

    public static double sumOrder() {

        return getItemPrices().stream().mapToDouble(a -> a).sum();

    }

    public static double getTotalSum() {

        return Double.parseDouble(itemTotalPrice.getText().split("\\$")[1]);

    }

}

