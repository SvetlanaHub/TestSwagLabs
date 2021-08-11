package pageObject;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class CartPage {

    //BUTTONS
    private static final SelenideElement checkoutButton = $("#checkout");
    private static final ElementsCollection removeButton = $$x("//button[contains(@data-test, 'remove')]");
    public static final SelenideElement cartButton = $(".shopping_cart_link");


    public static final SelenideElement cartBadge = $(".shopping_cart_badge");
    public static final SelenideElement inventoryItem = $(".inventory_item_name");



    public static void clickToCheckoutButton() {

        checkoutButton.click();

    }

    public static void clickToRemoveButton() {
        
        removeButton.stream().forEach(a -> a.click());

    }


}

