package com.software.magento.pages;

import com.software.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WomenPage extends Utility {

    By popup = By.xpath("//p[text()='Consent']");
    By Women = By.xpath("//span[normalize-space()='Women']");
    By Tops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By Jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By SortList = By.id("sorter");
    By verifyProductNameAlphaOrder = By.xpath("//li//div[1]//div[1]//strong[1]/a");
    By selectPrice = By.id("sorter");
    By productNameText = By.xpath("//strong[@class='product name product-item-name']//a");
    By priceListOfProduct = By.xpath("//span[@class='price-wrapper ']//span");


    public void clickOnpopup() {
        clickOnElement(popup);
    }

    public void mouseHoverOnWomen() {
        mouseHoverToElement(Women);

    }

    public void mouseHoverOnTops() {
        mouseHoverToElement(Tops);
    }

    public void clickOnJackets() {
        clickOnElement(Jackets);
    }

    public void SortByFilter() {
        selectByVisibleTextFromDropDown(SortList, "Product Name");
    }

    public void sortByPrice() {
        selectByVisibleTextFromDropDown(selectPrice, "Price");
    }

    public void nameDisplayInAlphabeticalOrder() {
        List<WebElement> productNames = driver.findElements(productNameText);

        //store product name in the actualProductName List.
        List<String> actualProductsName = new ArrayList<>();
        for (WebElement product : productNames) {
//            System.out.println(product.getText());
            actualProductsName.add(product.getText());

        }

    }

    public List<WebElement> getListOfProductPrice() {
        return driver.findElements(priceListOfProduct);
    }


}
