package com.TechBee.EbayDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Homepage extends EbayAPIBase{

    protected static JavascriptExecutor js = (JavascriptExecutor) ebayDriver;
    static {
        xpaths.put("SAVED","//*[@id=\"mainContent\"]/div[1]/ul/li[2]/a");
        xpaths.put("MOTORS","//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a");
        xpaths.put("FASHION","//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a");
        xpaths.put("ELECTRONICS","//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a");
        xpaths.put("COLLECTIBLES_AND_ART","//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a");
        xpaths.put("HOME_AND_GARDEN","//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a");
        xpaths.put("SPORTING_GOODS","//*[@id=\"mainContent\"]/div[1]/ul/li[8]/a");
        xpaths.put("TOYS","//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a");
        xpaths.put("BUSINESS_AND_INDUSTRIAL","//*[@id=\"mainContent\"]/div[1]/ul/li[10]/a");
        xpaths.put("MUSIC","//*[@id=\"mainContent\"]/div[1]/ul/li[11]/a");
        xpaths.put("DEALS","//*[@id=\"mainContent\"]/div[1]/ul/li[12]/a");

        xpaths.put("SEARCH", "//*[@id=\"gh-btn\"]");
        xpaths.put("SHOP_BY_CATEGORY", "//*[@id=\"gh-shop-a\"]");
        xpaths.put("ADVANCED_SEARCH", "//*[@id=\"gh-as-a\"]");
        // these are options whose parent elements must be hovered over before clicking on
        xpaths.put("SUBCATEGORY_DAILY_DEALS", "//*[@id=\"mainContent\"]/div[1]/ul/li[12]/div[2]/div[1]/nav[1]/ul/li[1]/a");

    }

    public Homepage() {}

    public WebElement moveMouse(String xpath) {
        // waiting until the element is clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        // find the webelement object after it shows up
        WebElement hoverElement = ebayDriver.findElement(By.xpath(xpath));
        // create the actions object
        Actions mouseHover = new Actions(ebayDriver);
        // perform the mouse move action
        mouseHover.moveToElement(hoverElement).perform();
        return hoverElement;
    }

    public void hoverMouseOver(String key) {
        homepage();
        moveMouse(xpaths.get(key));
    }

    public void getTodaysDeal() {
        // hover over deals
        hoverMouseOver("DEALS");
        // move mouse to daily deals

        //ebayDriver.findElement(By.xpath(xpaths.get("DAILY_DEALS"))).click();
        moveMouse(xpaths.get("SUBCATEGORY_DAILY_DEALS")).click();

    }

    public void searchFunctionality(String keywords) {
        homepage();
        WebElement searchBar = ebayDriver.findElement(By.id("gh-ac"));
        // type iphone in search bar
        searchBar.sendKeys(keywords);

        // click on search
        WebElement searchButton = ebayDriver.findElement(By.id("gh-btn"));
        searchButton.click();
    }

    /*
    public void searchByCategory(String keywords, String category) {
        homepage();
        WebElement searchBar = ebayDriver.findElement(By.id("gh-ac"));
        // type iphone in search bar
        searchBar.sendKeys(keywords);

        // Click on category drop down
        waitThenClickOn("//*[@id=\"gh-cat\"]");

        // Get webelement of option
        WebElement categoryOption = ebayDriver.findElement(By.xpath(categories.get(category)));

        // scroll until the object is into view
        JavascriptExecutor js = (JavascriptExecutor) ebayDriver;
        js.executeScript("arguments[0].scrollIntoView(true);",categoryOption); // scroll until the product element is in view

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(categories.get(category))));

        // click on category option
        categoryOption.click();

        // click on search
        WebElement searchButton = ebayDriver.findElement(By.id("gh-btn"));
        searchButton.click();
    }
*/


}
