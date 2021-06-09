import com.TechBee.EbayDriver.AdvancedSearch;
import com.TechBee.EbayDriver.EbayAPIBase;
import com.TechBee.EbayDriver.Homepage;
import com.TechBee.EbayDriver.ProductsPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EbayAPITest {
    private static Homepage ebayHomepage;
    //private AdvancedSearch advSearch;
    private final Integer goodHTTPResponseCode = 200;

    @BeforeAll
    static void setUp() {
        ebayHomepage = new Homepage();
    }

    @AfterAll
    static void cleanUp() {
        ebayHomepage.Clean();
    }

    //            - Sign-In and Register
    @Test
    public void testSignIn() throws IOException {
        ebayHomepage.navigateTo("SIGN_IN");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }


    //            - Daily Deals
    @Test
    public void testDailyDeals() throws IOException {
        ebayHomepage.navigateTo("DAILY_DEALS");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    //            - Brand Outlet
    @Test
    public void testBrandOutlet() throws IOException {
        ebayHomepage.navigateTo("BRAND_OUTLET");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    //            - Help & Contact
    @Test
    public void testHelpAndContact() throws IOException {
        ebayHomepage.navigateTo("HELP_AND_CONTACT");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    //            - Sell
    @Test
    public void testSell() throws IOException {
        ebayHomepage.navigateTo("SELL");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    // Wishlist, MyEbay
    @Test
    public void testWishlist() throws IOException {
        ebayHomepage.navigateTo("WISHLIST");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    // MyEbay

    @Test
    public void testMyEbay() throws IOException {
        ebayHomepage.navigateTo("MY_EBAY");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    //            - Notification
    // for notifications, ensure //*[@id="gh-eb-Alerts-o"] is visible
    @Test
    public void testNotifications() throws IOException {
        ebayHomepage.navigateTo("NOTIFICATIONS");
        WebElement notificationDropDown = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"gh-eb-Alerts-o\"]"));

        assertEquals(true,notificationDropDown.isDisplayed());
    }

    // Cart
    @Test
    public void testCart() throws IOException {
        ebayHomepage.navigateTo("CART");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }


    //            - Footer methods:
    //                About Ebay
    @Test
    public void testAbout() throws IOException {
        ebayHomepage.navigateTo("ABOUT");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    // Annoucements, Community, verifyCopyright text, etc.
    @Test
    public void testAnnouncements() throws IOException {
        ebayHomepage.navigateTo("ANNOUNCEMENTS");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    // Community
    @Test
    public void testCommunity() throws IOException {
        ebayHomepage.navigateTo("COMMUNITY");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    // verify copyright text
    @Test
    public void testVerifyCopyrightText() throws IOException {
        ebayHomepage.navigateTo("VERO");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    //*Create Method to Navigate to the
    //        following:
    //        Home,
    @Test
    public void testHome() throws IOException {
        ebayHomepage.navigateTo("HOME");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    //        Saved,
    @Test
    public void testSaved() throws IOException {
        ebayHomepage.navigateTo("SAVED");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    //        Motors,
    @Test
    public void testMotors() throws IOException {
        ebayHomepage.navigateTo("MOTORS");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    //        Expand: Motors,
    @Test
    public void testMotorsExpand() throws IOException {
        ebayHomepage.hoverMouseOver("MOTORS");
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]"));
        EbayAPIBase.getWebDriverWait().until(ExpectedConditions.visibilityOf(menu));
        assertTrue(menu.isDisplayed());
    }

    //        Fashion,
    @Test
    public void testFashion() throws IOException {
        ebayHomepage.navigateTo("FASHION");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }
    //        Expand: Fashion,
    @Test
    public void testFashionExpand() throws IOException {
        ebayHomepage.hoverMouseOver("FASHION");
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]"));
        EbayAPIBase.getWebDriverWait().until(ExpectedConditions.visibilityOf(menu));
        assertTrue(menu.isDisplayed());
    }

    //        Electronics,
    @Test
    public void testElectronics() throws IOException {
        ebayHomepage.navigateTo("ELECTRONICS");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    //        Expand: Electronics,
    @Test
    public void testElectronicsExpand() throws IOException {
        ebayHomepage.hoverMouseOver("ELECTRONICS");
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/div[2]"));
        EbayAPIBase.getWebDriverWait().until(ExpectedConditions.visibilityOf(menu));
        assertTrue(menu.isDisplayed());
    }

    //        Collectibles & Art
    @Test
    public void testCollectiblesAndArt() throws IOException {
        ebayHomepage.navigateTo("COLLECTIBLES_AND_ART");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    //        Expand: Collectibles & Art,
    @Test
    public void testCollectiblesAndArtExpand() throws IOException {
        ebayHomepage.hoverMouseOver("COLLECTIBLES_AND_ART");
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/div[2]"));
        EbayAPIBase.getWebDriverWait().until(ExpectedConditions.visibilityOf(menu));
        assertTrue(menu.isDisplayed());
    }

    //        Home & Garden
    @Test
    public void testHomeAndGarden() throws IOException {
        ebayHomepage.navigateTo("HOME_AND_GARDEN");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }
    //        Expand: Home & Garden,
    @Test
    public void testHomeAndGardenExpand() throws IOException {
        ebayHomepage.hoverMouseOver("HOME_AND_GARDEN");
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/div[2]"));
        EbayAPIBase.getWebDriverWait().until(ExpectedConditions.visibilityOf(menu));
        assertTrue(menu.isDisplayed());
    }

    //        Sporting Goods
    @Test
    public void testSportingGoods() throws IOException {
        ebayHomepage.navigateTo("SPORTING_GOODS");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }
    //        Expand: Sporting Goods,
    @Test
    public void testSportingGoodsExpand() throws IOException {
        ebayHomepage.hoverMouseOver("SPORTING_GOODS");
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[8]/div[2]"));
        EbayAPIBase.getWebDriverWait().until(ExpectedConditions.visibilityOf(menu));
        assertTrue(menu.isDisplayed());
    }

    //        Toys,
    @Test
    public void testToys() throws IOException {
        ebayHomepage.navigateTo("TOYS");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }
    //        Expand: Toys,
    @Test
    public void testToysExpand() throws IOException {
        ebayHomepage.hoverMouseOver("TOYS");
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]/div[2]"));
        EbayAPIBase.getWebDriverWait().until(ExpectedConditions.visibilityOf(menu));
        assertTrue(menu.isDisplayed());
    }

    //        Business & Industrial
    @Test
    public void testBnI() throws IOException {
        ebayHomepage.navigateTo("BUSINESS_AND_INDUSTRIAL");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }
    //        Expand: Business & Industrial,
    @Test
    public void testBnIExpand() throws IOException {
        ebayHomepage.hoverMouseOver("BUSINESS_AND_INDUSTRIAL");
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/div[2]"));
        EbayAPIBase.getWebDriverWait().until(ExpectedConditions.visibilityOf(menu));
        assertTrue(menu.isDisplayed());
    }

    //        Music
    @Test
    public void testMusic() throws IOException {
        ebayHomepage.navigateTo("MUSIC");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }
    //        Expand: Music,
    @Test
    public void testMusicExpand() throws IOException {
        ebayHomepage.hoverMouseOver("MUSIC");
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[11]/div[2]"));
        EbayAPIBase.getWebDriverWait().until(ExpectedConditions.visibilityOf(menu));
        assertTrue(menu.isDisplayed());
    }

    //        Deals
    @Test
    public void testDeals() throws IOException {
        ebayHomepage.navigateTo("DEALS");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    //        - Today's Deal functionality
    @Test
    public void testTodaysDeals() throws IOException {
        ebayHomepage.getTodaysDeal();
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    //         - Search Functionality
    @Test
    public void testSearch() throws IOException {
        ebayHomepage.searchFunctionality("iphone");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }
    //         - Search By Category
    @Test
    public void testSearchByCategory() throws IOException {
        ebayHomepage.navigateTo("SHOP_BY_CATEGORY");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }
    //
    //         - Advanced Search
    @Test
    public void testAdvancedSearch() throws IOException {
        ebayHomepage.navigateTo("ADVANCED_SEARCH");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    //

    // test advanced search functions
    @Test
    public void testAdvancedSearchFunctionality() throws IOException {
        AdvancedSearch advSearch = new AdvancedSearch();
        // navigate the webdriver to the advanced search link
        EbayAPIBase.getWebdriver().findElement(By.xpath(EbayAPIBase.getXpaths().get("ADVANCED_SEARCH"))).click();
        advSearch.advancedSearch(
                "iphone",
                "COMPUTERS_TABLETS_NETWORKING",
                new String[]{"COMPLETED_LISTINGS"},
                5,
                1500,
                "PRICE_HIGHEST_FIRST",
                "PICTURE_GALLERY",
                200,
                false
        );

        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        advSearch.Clean();

        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    //- Inherit All Methods from Base Class (Header, Footer, Search, etc.)
    //             - All Listings
    //             - Price, Type Functionality
    //             - Check Product Price, Check Product Description, etc.
    //             - Buy It Now functionality
    @Test
    public void testAllListings() throws IOException {
        // search for product

        ebayHomepage.searchFunctionality("iphone");

        // test all listings button
        ebayHomepage.waitThenClickOn(ProductsPage.getProductXpaths().get("ALL_LISTINGS"));

        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    //AcceptOffers
    @Test
    public void testAcceptsOffers() throws IOException {
        // search for product

        ebayHomepage.searchFunctionality("iphone");

        // test all listings button
        ebayHomepage.waitThenClickOn(ProductsPage.getProductXpaths().get("ACCEPTS_OFFERS"));

        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    // Auction,
    @Test
    public void testAuction() throws IOException {
        // search for product

        ebayHomepage.searchFunctionality("iphone");

        // test all listings button
        ebayHomepage.waitThenClickOn(ProductsPage.getProductXpaths().get("AUCTION"));

        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    // BuyIt Now
    @Test
    public void testBuyItNow() throws IOException {
        // search for product

        ebayHomepage.searchFunctionality("iphone");

        // test all listings button
        ebayHomepage.waitThenClickOn(ProductsPage.getProductXpaths().get("BUY_IT_NOW"));

        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }

    // test everything in the carousel
    @Test
    public void testCarousel() throws IOException {
        // search for product

        ebayHomepage.searchFunctionality("iphone");

        // test all listings button
        List<WebElement> carouselItems = EbayAPIBase.getWebdriver().findElements(By.xpath(ProductsPage.getProductXpaths().get("PRICE_TYPE_CAROUSEL")));

        for(WebElement we : carouselItems) {
            we.click();
            URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            Integer code = connection.getResponseCode();
            assertEquals(goodHTTPResponseCode, code);
        }


    }
}
