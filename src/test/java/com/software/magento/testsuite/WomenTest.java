package com.software.magento.testsuite;

import com.software.magento.pages.WomenPage;
import com.software.magento.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {


    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() {

        //click On popup
        womenPage.clickOnpopup();

        // * Mouse Hover on the ‘Women’ Menu
        womenPage.mouseHoverOnWomen();

        //   * Mouse Hover on the ‘Tops’
        womenPage.mouseHoverOnTops();

        //* Click on the ‘Jackets’
        womenPage.clickOnJackets();

        //* Select Sort By filter “Product Name”
        womenPage.SortByFilter();

        //* Verify the product name displayed inalphabetical order
        womenPage.nameDisplayInAlphabeticalOrder();


    }

    @Test
    public void verifyTheSortByPriceFilter() {

        womenPage.clickOnpopup();

        //Mouse Hover on the ‘Women’ Menu
        womenPage.mouseHoverOnWomen();

        //   * Mouse Hover on the ‘Tops’
        womenPage.mouseHoverOnTops();

        //* Click on the ‘Jackets’
        womenPage.clickOnJackets();

        //* Select Sort By filter “Price”
        womenPage.sortByPrice();

        //* Verify the product price displayed in    Low to High
        // Storing jackets price in list
        List<Double> jacketsPriceListBefore = new ArrayList<>();
        for (WebElement value : womenPage.getListOfProductPrice()) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListBefore.add(Double.valueOf(value.getText().replace("$", "")));
        }

        // After Sorting Products by Price
        List<Double> jacketsPriceListAfter = new ArrayList<>();
        for (WebElement value : womenPage.getListOfProductPrice()) {
            //Converting price in to Double and Removing $ from price
            jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
        }
        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(jacketsPriceListBefore);

        Assert.assertEquals(jacketsPriceListAfter, jacketsPriceListBefore,
                "Product is not sorting by price");
    }

}



