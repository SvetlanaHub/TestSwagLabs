package pageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductsPage {

    //BUTTONS
    public static SelenideElement addToCartBackpack = $("#add-to-cart-sauce-labs-backpack");
    static SelenideElement addToCartBikeLight = $("#add-to-cart-sauce-labs-bike-light");
    public static final SelenideElement cartButton = $(".shopping_cart_link");

    public static final SelenideElement products = $(".title");


    public static void addToCart() {

        addToCartBackpack.click();
        addToCartBikeLight.click();
        cartButton.click();

    }

}

