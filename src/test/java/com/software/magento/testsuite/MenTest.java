package com.software.magento.testsuite;

import com.software.magento.pages.MenPage;
import com.software.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    MenPage menPage = new MenPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {

        menPage.ClickOnpopup();

        // Mouse Hover on the ‘Men’ Menu
        menPage.mouseHoverOnMen();

        //   * Mouse Hover on the ‘Bottoms’
        menPage.mouseHoverOnBottom();

        //* Click on the ‘Pants’
        menPage.clickOnPant();

        //* Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on the size 32.
        menPage.mouseHoverOnProductName();
        menPage.clickOnSize1();

        //* Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on the
        //        Color Black.
        menPage.mouseHoverOnProductName();
        menPage.clickOnBlackColour();

        //  * Mouse Hover on the product name ‘Cronus Yoga Pant’ and click on the ‘Add To Cart’ Button.
        menPage.mouseHoverOnProductName();
        menPage.clickOnAddToCartButton();

        //  * Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        menPage.verifyTheTextMessage();
        String expectedText = "You added Cronus Yoga Pant to your shopping cart.";
        String actualText = menPage.verifyTheTextMessage();
        Assert.assertEquals(actualText, expectedText, "invalid text");

        // Click on the ‘shopping cart’ Link into   message
        menPage.clickOnShoppingCardLink();

        // * Verify the text ‘Shopping Cart.’
        String expectedMes = "Shopping Cart";
        String actualTexMessage = menPage.verifyTheTextShoppingCart();
        Assert.assertEquals(actualTexMessage, expectedMes, "Invalid text");

        //* Verify the product name ‘Cronus Yoga Pant’
        String expectedProductName = "Cronus Yoga Pant";
        String actualProducrNAme = menPage.verifyTheProductName();
        Assert.assertEquals(actualProducrNAme, expectedProductName, "invalid ANme");

        //* Verify the product size ‘32’
        String actualSize = menPage.verifyTheProductSize();
        Assert.assertEquals(actualSize, "32", "Invalid Size");

        //* Verify the product color ‘Black’
        String expectedColour = "Black";
        String actualColour = menPage.verifyTheProductIsBlack();
        Assert.assertEquals(expectedColour, actualColour, "invalid colour");
    }


}

