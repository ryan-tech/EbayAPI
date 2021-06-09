package com.TechBee.EbayDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class EbayAPIBase {
    protected static WebDriver ebayDriver;
    protected static WebDriverWait wait;
    protected static Map<String, String> xpaths;
    protected static JavascriptExecutor js;

    public static WebDriver getWebdriver() {
        return ebayDriver;
    }
    public static WebDriverWait getWebDriverWait() { return wait; }
    public static Map<String, String> getXpaths() {return xpaths;}

    static {
        // create the xpaths map
        xpaths = new HashMap<>();
        // Header paths
        xpaths.put("HOME", "//*[@id=\"gh-la\"]");
        xpaths.put("SIGN_IN", "//*[@id=\"gh-ug\"]/a");
        xpaths.put("REGISTRATION", "//*[@id=\"gh-ug-flex\"]/a");
        xpaths.put("DAILY_DEALS", "//*[@id=\"gh-p-1\"]/a");
        xpaths.put("BRAND_OUTLET", "//*[@id=\"gh-p-4\"]/a");
        xpaths.put("HELP_AND_CONTACT", "//*[@id=\"gh-p-3\"]/a");
        xpaths.put("SELL", "//*[@id=\"gh-p-2\"]/a");
        xpaths.put("WISHLIST","//*[@id=\"gh-wl-click\"]/div/a[1]");
        xpaths.put("MY_EBAY","//*[@id=\"gh-eb-My\"]/div/a[1]");
        xpaths.put("NOTIFICATIONS","//*[@id=\"gh-eb-Alerts\"]/div/button");
        xpaths.put("CART","//*[@id=\"gh-minicart-hover\"]/div/a[1]");
        // Footer paths
        xpaths.put("ABOUT", "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[1]/h3/a");
        // anouncements
        xpaths.put("ANNOUNCEMENTS", "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/ul/li[7]/a");
        // community
        xpaths.put("COMMUNITY", "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/ul/li[6]/h3/a");
        // verify copyright txt
        xpaths.put("VERO", "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[11]/a");
    }

    EbayAPIBase() {
        Initialize();
    }

    public void Initialize() {
        // path to driver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ryan\\Documents\\chromedriver_win32\\chromedriver.exe");

        //---------chrome options---------//
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--window-size=1920,1080");

        // options.addArguments("--allow-insecure-localhost");
        // options.addArguments("--headless"); test cases will not pass in headless mode... can't figure out why

        // create a chrome driver with the options
        ebayDriver = new ChromeDriver(options);
        js = (JavascriptExecutor) ebayDriver;
        // initialize an explicit wait
        wait = new WebDriverWait(ebayDriver, 20);

        homepage();
    }

    public void implicitWait(Integer sec) {
        ebayDriver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }

    public void Clean() {
        ebayDriver.quit();
        ebayDriver = null;
    }

    public WebElement waitThenClickOn(String xpath) {
        WebElement webElement = ebayDriver.findElement(By.xpath(xpath));
        // waiting until the element is clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        // find the webelement object after it shows up

        // click on the element
        webElement.click();
        return webElement;
    }

    public void homepage() {
        ebayDriver.get("https://www.ebay.com");
        EbayAPIBase.getWebDriverWait().until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript(
                        "return document.readyState").equals(
                        "complete"));
    }

    public WebElement navigateTo(String key) {
        homepage();
        return waitThenClickOn(xpaths.get(key));
    }



}
