package com.software.magento.pages;

import com.software.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {

    By popup=By.xpath("//p[text()='Consent']");
    By Gear = By.xpath("//span[normalize-space()='Gear']");
    By Bags = By.xpath("//span[normalize-space()='Bags']");
    By ProductOvernightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By verifyTextOvernightDuffle = By.xpath("//span[@class='base']");
    By Qty = By.xpath("//input[@id='qty']");
    By AddToCartButton = By.xpath("//button[@id='product-addtocart-button']");
    By verifyTheTextMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By ShoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    By ProductName = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By verifyTheQtyy = By.xpath("//input[@title='Qty']");
    By ProductPrice = By.xpath("(//span[@class='cart-price']//span)[2]");
    By changeTheqty = By.xpath("(//input[@class='input-text qty'])[1]");
    By UpdateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By verifyTheProductPrices2 = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");


    public void clickOnpopup(){
        clickOnElement(popup);
    }


    public void mouseHoverOnGear() {
        mouseHoverToElement(Gear);
    }

    public void clickOnBags() {
        clickOnElement(Bags);
    }

    public void clickOnProductOvernightDuffle() {
        clickOnElement(ProductOvernightDuffle);
    }

    public String verifyTextOvernightDuffle() {
        return getTextFromElement(verifyTextOvernightDuffle);
    }

    public void clearTheQty() {
        driver.findElement(Qty).clear();
    }

    public void changeTheQty(String qty) {
        sendTextToElement(Qty, qty);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(AddToCartButton);
    }

    public String verifyTheTextMessage() {
        return getTextFromElement(verifyTheTextMessage);
    }

    public void clickOnShoppingCartLink() {
        clickOnElement(ShoppingCartLink);
    }

    public String verifyTheProductName() {
        return getTextFromElement(ProductName);
    }

    public String verifyTheQty4() {
        return getTextFromElement(verifyTheQtyy);
    }

    public String verifyTheProductPrice() {
        return getTextFromElement(ProductPrice);
    }

    public void clearQty() {
        driver.findElement(changeTheqty).clear();
    }

    public void changeTheQty6() {
        sendTextToElement(changeTheqty, "5");
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(UpdateShoppingCart);
    }

    public String verifyTheProductPrices() {
        return getTextFromElement(verifyTheProductPrices2);
    }
}
