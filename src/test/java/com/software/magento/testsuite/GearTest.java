package com.software.magento.testsuite;

import com.software.magento.pages.GearPage;
import com.software.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {


    GearPage gearPage = new GearPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {

        gearPage.clickOnpopup();
        // Mouse Hover on the ‘Gear’ Menu
        gearPage.mouseHoverOnGear();

        //  * Click on the ‘Bags’
        gearPage.clickOnBags();

        //* Click on Product Name ‘Overnight Duffle’
        gearPage.clickOnProductOvernightDuffle();

        // * Verify the text ‘Overnight Duffle’
        gearPage.verifyTextOvernightDuffle();

        //      Change the Qty 3
        gearPage.clearTheQty();
        gearPage.changeTheQty("3");

        // * Click on the ‘Add to Cart’ Button.
        gearPage.clickOnAddToCartButton();

        // * Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String expectedText = "You added Overnight Duffle to your shopping cart.";
        String actualText = gearPage.verifyTheTextMessage();
        Assert.assertEquals(actualText, expectedText, "invalid message");

        //   * Click on the ‘shopping cart’ Link into    message
        gearPage.clickOnShoppingCartLink();

        //  * Verify the product name ‘Overnight Duffle’
        String expectedProductName = "Overnight Duffle";
        String actualProductName = gearPage.verifyTheProductName();
        Assert.assertEquals(actualProductName, expectedProductName, "invalid Proct Name");

        // * Verify the product price ‘$135.00’
        String exceptedPriceOfProduct = "$135.00";
        String actualPriceOfProduct = gearPage.verifyTheProductPrice();
        Assert.assertEquals(actualPriceOfProduct, exceptedPriceOfProduct, "invalid price");

        //* Change the Qty to ‘5’
        gearPage.clearQty();
        gearPage.changeTheQty6();

        // Click on the ‘Update Shopping Cart’ button
        gearPage.clickOnUpdateShoppingCart();

        // * Verify the product price ‘$225.00’
        String expectedPrice = "$225.00";
        String actualPrice = gearPage.verifyTheProductPrices();
        Assert.assertEquals(actualPrice, expectedPrice, "invalid Price");
    }
}


