import com.TechBee.EbayDriver.AdvancedSearch;
import com.TechBee.EbayDriver.EbayAPIBase;
import com.TechBee.EbayDriver.Homepage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EbayAPITest {
    private Homepage ebayHomepage;
    private AdvancedSearch advSearch;
    private final Integer goodHTTPResponseCode = 200;

    @BeforeEach
    public void setUp() throws Exception {
        ebayHomepage = new Homepage();
        advSearch = new AdvancedSearch();
    }

    //            - Sign-In and Register
    @Test
    public void testSignIn() throws IOException {
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("SIGN_IN"));
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
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("DAILY_DEALS"));
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
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("BRAND_OUTLET"));
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
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("HELP_AND_CONTACT"));
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
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("SELL"));
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
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("WISHLIST"));
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
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("MY_EBAY"));
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
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("NOTIFICATIONS"));
        WebElement notificationDropDown = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"gh-eb-Alerts-o\"]"));

        assertEquals(true,notificationDropDown.isDisplayed());
    }

    // Cart
    @Test
    public void testCart() throws IOException {
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("CART"));
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
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("ABOUT"));
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
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("ANNOUNCEMENTS"));
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
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("COMMUNITY"));
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
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("VERO"));
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
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("HOME"));
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
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("SAVED"));
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
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("MOTORS"));
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
        ebayHomepage.hoverMouseOver(EbayAPIBase.xpaths.get("MOTORS"));
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]"));
        assertEquals(true, menu.isDisplayed());
    }

    //        Fashion,
    @Test
    public void testFashion() throws IOException {
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("FASHION"));
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
        ebayHomepage.hoverMouseOver(EbayAPIBase.xpaths.get("FASHION"));
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/div[2]"));
        assertEquals(true, menu.isDisplayed());
    }

    //        Electronics,
    @Test
    public void testElectronics() throws IOException {
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("ELECTRONICS"));
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
        ebayHomepage.hoverMouseOver(EbayAPIBase.xpaths.get("ELECTRONICS"));
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/div[2]"));
        assertEquals(true, menu.isDisplayed());
    }

    //        Collectibles & Art
    @Test
    public void testCollectiblesAndArt() throws IOException {
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("COLLECTIBLES_AND_ART"));
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
        ebayHomepage.hoverMouseOver(EbayAPIBase.xpaths.get("COLLECTIBLES_AND_ART"));
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/div[2]"));
        assertEquals(true, menu.isDisplayed());
    }

    //        Home & Garden
    @Test
    public void testHomeAndGarden() throws IOException {
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("HOME_AND_GARDEN"));
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
        ebayHomepage.hoverMouseOver(EbayAPIBase.xpaths.get("HOME_AND_GARDEN"));
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/div[2]"));
        assertEquals(true, menu.isDisplayed());
    }

    //        Sporting Goods
    @Test
    public void testSportingGoods() throws IOException {
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("SPORTING_GOODS"));
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
        ebayHomepage.hoverMouseOver(EbayAPIBase.xpaths.get("SPORTING_GOODS"));
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[8]/div[2]"));
        assertEquals(true, menu.isDisplayed());
    }

    //        Toys,
    @Test
    public void testToys() throws IOException {
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("TOYS"));
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
        ebayHomepage.hoverMouseOver(EbayAPIBase.xpaths.get("TOYS"));
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]/div[2]"));
        assertEquals(true, menu.isDisplayed());
    }

    //        Business & Industrial
    @Test
    public void testBnI() throws IOException {
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("BUSINESS_AND_INDUSTRIAL"));
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
        ebayHomepage.hoverMouseOver(EbayAPIBase.xpaths.get("BUSINESS_AND_INDUSTRIAL"));
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/div[2]"));
        assertEquals(true, menu.isDisplayed());
    }

    //        Music
    @Test
    public void testMusic() throws IOException {
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("MUSIC"));
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
        ebayHomepage.hoverMouseOver(EbayAPIBase.xpaths.get("MUSIC"));
        // check that the dropdown menu shows up
        WebElement menu = EbayAPIBase.getWebdriver().findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/div[2]"));
        assertEquals(true, menu.isDisplayed());
    }

    //        Deals
    @Test
    public void testDeals() throws IOException {
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("DEALS"));
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
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("SHOP_BY_CATEGORY"));
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
        ebayHomepage.navigateTo(EbayAPIBase.xpaths.get("ADVANCED_SEARCH"));
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        assertEquals(goodHTTPResponseCode, code);
    }
    //         */

    // test advanced search functions

    //- Inherit All Methods from Base Class (Header, Footer, Search, etc.)
    //             - All Listings, AcceptOffers, Auction, BuyIt Now, etc,
    //             - Price, Type Functionality
    //             - Check Product Price, Check Product Description, etc.
    //             - Buy It Now functionality

}
