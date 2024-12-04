package com.software.magento.pages;

import com.software.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {

    By popup = By.xpath("//p[text()='Consent']");
    By Men = By.xpath("//span[normalize-space()='Men']");
    By Bottom = By.xpath("//a[@id='ui-id-18']");
    By Pant = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By ProductName = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By Size = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By BlackColour = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By AddToCartButton = By.xpath("//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]");
    By verifyTheTextMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By ShoppingCardLink = By.xpath("//a[normalize-space()='shopping cart']");
    By TextShoppingCart = By.xpath("//span[@class='base']");
    By ProductName1 = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By ProductSize = By.xpath("//dd[contains(text(),'32')]");
    By Black = By.xpath("//dd[contains(text(),'Black')]");


    public void mouseHoverOnMen() {
        mouseHoverToElement(Men);
    }

    public void ClickOnpopup() {
        clickOnElement(popup);
    }

    public void mouseHoverOnBottom() {
        mouseHoverToElement(Bottom);
    }

    public void clickOnPant() {
        clickOnElement(Pant);
    }

    public void mouseHoverOnProductName() {
        mouseHoverToElement(ProductName);

    }

    public void clickOnSize1() {
        mouseHoverToElementAndClick(Size);
    }

    public void clickOnBlackColour() {
        clickOnElement(BlackColour);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(AddToCartButton);
    }

    public String verifyTheTextMessage() {
        return getTextFromElement(verifyTheTextMessage);
    }

    public void clickOnShoppingCardLink() {
        clickOnElement(ShoppingCardLink);
    }

    public String verifyTheTextShoppingCart() {
        return getTextFromElement(TextShoppingCart);

    }

    public String verifyTheProductName() {
        return getTextFromElement(ProductName1);
    }

    public String verifyTheProductSize() {
        return getTextFromElement(ProductSize);
    }

    public String verifyTheProductIsBlack() {
        return getTextFromElement(Black);
    }

}
