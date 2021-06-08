package com.TechBee.EbayDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Map;

public class AdvancedSearch extends Homepage {
    protected static Map<String, String> categoriesOptions;
    protected static Map<String, String> searchIncludingOptions;
    protected static Map<String, String> priceOptions;
    protected static Map<String, String> sortOptions;
    protected static Map<String, String> resultViewOptions;
    protected static Map<String, String> resultsPerPageOptions;
    protected static String clearOptionsXpath = "//*[@id=\"adv_search_from\"]/div[3]/a";

    static {
        //xpaths of categories
        categoriesOptions.put("DROPDOWN_MENU", "//*[@id=\"e1-1\"]");
        categoriesOptions.put("ALL_CATEGORIES", "//*[@id=\"e1-1\"]/option[1]");
        categoriesOptions.put("ANTIQUES", "//*[@id=\"e1-1\"]/option[2]");
        categoriesOptions.put("ART", "//*[@id=\"e1-1\"]/option[3]");
        categoriesOptions.put("BABY", "//*[@id=\"e1-1\"]/option[4]");
        categoriesOptions.put("BOOKS", "//*[@id=\"e1-1\"]/option[5]");
        categoriesOptions.put("BUSINESS_AND_INDUSTRIAL", "//*[@id=\"e1-1\"]/option[6]");
        categoriesOptions.put("CAMERAS_AND_PHOTO", "//*[@id=\"e1-1\"]/option[7]");
        categoriesOptions.put("CELL_PHONES_AND_ACCESSORIES", "//*[@id=\"e1-1\"]/option[8]");
        categoriesOptions.put("CLOTHING_SHOES_ACCESSORIES", "//*[@id=\"e1-1\"]/option[9]");
        categoriesOptions.put("COINS_PAPER_MONEY", "//*[@id=\"e1-1\"]/option[10]");
        categoriesOptions.put("COLLECTIBLES", "//*[@id=\"e1-1\"]/option[11]");
        categoriesOptions.put("COMPUTERS_TABLETS_NETWORKING", "//*[@id=\"e1-1\"]/option[12]");
        categoriesOptions.put("CONSUMER_ELECTRONICS", "//*[@id=\"e1-1\"]/option[13]");
        categoriesOptions.put("CRAFTS", "//*[@id=\"e1-1\"]/option[14]");
        categoriesOptions.put("DOLLS_AND_BEARS", "//*[@id=\"e1-1\"]/option[15]");
        categoriesOptions.put("DVDS_MOVIES", "//*[@id=\"e1-1\"]/option[16]");
        categoriesOptions.put("EBAY_MOTORS", "//*[@id=\"e1-1\"]/option[17]");
        categoriesOptions.put("ENTERTAINMENT_MEMORABILIA", "//*[@id=\"e1-1\"]/option[18]");
        categoriesOptions.put("GIFT_CARDS_AND_COUPONS", "//*[@id=\"e1-1\"]/option[19]");
        categoriesOptions.put("HEALTH_AND_BEAUTY", "//*[@id=\"e1-1\"]/option[20]");
        categoriesOptions.put("HOME_AND_GARDEN", "//*[@id=\"e1-1\"]/option[21]");
        categoriesOptions.put("JEWELRY_AND_WATCHES", "//*[@id=\"e1-1\"]/option[22]");
        categoriesOptions.put("MUSIC", "//*[@id=\"e1-1\"]/option[23]");
        categoriesOptions.put("MUSICAL_INSTRUMENTS_AND_GEAR", "//*[@id=\"e1-1\"]/option[24]");
        categoriesOptions.put("PET_SUPPLIES", "//*[@id=\"e1-1\"]/option[25]");
        categoriesOptions.put("POTTERY_AND_GLASS", "//*[@id=\"e1-1\"]/option[26]");
        categoriesOptions.put("REAL_ESTATE", "//*[@id=\"e1-1\"]/option[27]");
        categoriesOptions.put("SPECIALTY_SERVICES", "//*[@id=\"e1-1\"]/option[28]");
        categoriesOptions.put("SPORTING_GOODS", "//*[@id=\"e1-1\"]/option[29]");
        categoriesOptions.put("SPORTS_MEM_CARDS_FAN_SHOP", "//*[@id=\"e1-1\"]/option[30]");
        categoriesOptions.put("STAMPS", "//*[@id=\"e1-1\"]/option[31]");
        categoriesOptions.put("TICKETS_AND_EXPERIENCES", "//*[@id=\"e1-1\"]/option[32]");
        categoriesOptions.put("TOYS_AND_HOBBIES", "//*[@id=\"e1-1\"]/option[33]");
        categoriesOptions.put("TRAVEL", "//*[@id=\"e1-1\"]/option[34]");
        categoriesOptions.put("VIDEO_GAMES_AND_CONSOLES", "//*[@id=\"e1-1\"]/option[35]");
        categoriesOptions.put("EVERYTHING_ELSE", "//*[@id=\"e1-1\"]/option[36]");
    }

    // search including options
    static {
        searchIncludingOptions.put("TITLE_AND_DESCRIPTION","//*[@id=\"LH_TitleDesc\"]");
        searchIncludingOptions.put("COMPLETED_LISTINGS", "//*[@id=\"LH_Complete\"]");
        searchIncludingOptions.put("SOLD_LISTINGS", "//*[@id=\"LH_Sold\"]");
    }

    // price options
    static {
        priceOptions.put("CHECKBOX","//*[@id=\"_mPrRngCbx\"]");
        priceOptions.put("MIN_PRICE_BOX", "//*[@id=\"adv_search_from\"]/fieldset[3]/input[2]");
        priceOptions.put("MAX_PRICE_BOX", "//*[@id=\"adv_search_from\"]/fieldset[3]/input[3]");
    }

    // sort by options
    static {
        sortOptions.put("DROPDOWN_MENU","//*[@id=\"LH_SORT_BY\"]");
        sortOptions.put("ENDING_SOONEST", "//*[@id=\"LH_SORT_BY\"]/option[1]");
        sortOptions.put("NEWLY_LISTED","//*[@id=\"LH_SORT_BY\"]/option[2]");
        sortOptions.put("PRICE_LOWEST_FIRST","//*[@id=\"LH_SORT_BY\"]/option[3]");
        sortOptions.put("PRICE_HIGHEST_FIRST","//*[@id=\"LH_SORT_BY\"]/option[4]");
        sortOptions.put("DISTANCE_NEAREST_FIRST","//*[@id=\"LH_SORT_BY\"]/option[5]");
        sortOptions.put("BEST_MATCH","//*[@id=\"LH_SORT_BY\"]/option[6]");
    }

    static {
        resultViewOptions.put("DROPDOWN_MENU", "//*[@id=\"LH_VIEW_RESULTS_AS\"]");
        resultViewOptions.put("ALL_ITEMS", "//*[@id=\"LH_VIEW_RESULTS_AS\"]/option[1]");
        resultViewOptions.put("PICTURE_GALLERY", "//*[@id=\"LH_VIEW_RESULTS_AS\"]/option[2]");
        resultViewOptions.put("SHOW_ITEM_NUMBERS", "//*[@id=\"LH_VIEW_RESULTS_AS\"]/option[3]");
    }

    static {
        resultsPerPageOptions.put("DROPDOWN_MENU", "//*[@id=\"LH_IPP\"]");
        resultsPerPageOptions.put("25", "//*[@id=\"LH_IPP\"]/option[1]");
        resultsPerPageOptions.put("50", "//*[@id=\"LH_IPP\"]/option[2]");
        resultsPerPageOptions.put("100", "//*[@id=\"LH_IPP\"]/option[3]");
        resultsPerPageOptions.put("200", "//*[@id=\"LH_IPP\"]/option[4]");
    }

    public void selectCategory(String category) {
        // select category
        if(category != null) {
            // click on categories dropdown
            WebElement categoriesDropDown = ebayDriver.findElement(By.xpath(categoriesOptions.get("DROPDOWN_MENU")));
            categoriesDropDown.click();

            // get category option element
            WebElement categoryOption = categoriesDropDown.findElement(By.xpath(categoriesOptions.get(category)));
            // scroll until its in view

            js.executeScript("arguments[0].scrollIntoView(true);",categoryOption); // scroll until the product element is in view
            // wait until its scrolled
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(categoriesOptions.get(category))));
            // click the category option
            categoryOption.click();
        }
    }

    public void selectSearchIncluding(String[] searchIncluding) {
        for(String searchIncludingOption : searchIncluding) {
            // click on the corresponding search option
            WebElement searchIncludingOptionElement = ebayDriver.findElement(By.xpath(searchIncludingOptions.get(searchIncludingOption)));
            searchIncludingOptionElement.click();
        }
    }

    public void selectPriceRange(Integer minPrice,
                                 Integer maxPrice) {
        if(minPrice != null || maxPrice != null) {


            // get checkbox
            WebElement priceRangeCheckBox = ebayDriver.findElement(By.xpath(priceOptions.get("CHECKBOX")));

            // scroll down to checkbox
            js.executeScript("arguments[0].scrollIntoView(true);",priceRangeCheckBox);

            // click on checkbox
            priceRangeCheckBox.click();

            // enter the min and max price if its given
            if(minPrice != null) {
                ebayDriver.findElement(By.xpath(priceOptions.get("CHECKBOX"))).sendKeys(String.valueOf(minPrice));
            }
            if(maxPrice != null) {
                ebayDriver.findElement(By.xpath(priceOptions.get("CHECKBOX"))).sendKeys(String.valueOf(maxPrice));
            }
        }
    }

    public void selectSortBy(String sortBy) {
        if(sortBy != null) {
            WebElement sortByDropDown = ebayDriver.findElement(By.xpath(sortOptions.get("DROPDOWN_MENU")));
            js.executeScript("arguments[0].scrollIntoView(true);",sortByDropDown);
            sortByDropDown.click();

            ebayDriver.findElement(By.xpath(sortOptions.get(sortBy))).click();
        }
    }

    public void selectViewResults(String viewResults) {
        if(viewResults != null) {
            WebElement viewResultsDropDown = ebayDriver.findElement(By.xpath(resultViewOptions.get("DROPDOWN_MENU")));
            js.executeScript("arguments[0].scrollIntoView(true);",viewResultsDropDown);
            viewResultsDropDown.click();

            ebayDriver.findElement(By.xpath(sortOptions.get(viewResults))).click();
        }
    }

    public void selectResultsPerPage(Integer resultsPerPage) {
        if(resultsPerPage != null) {
            WebElement resultsPerPageDropDown = ebayDriver.findElement(By.xpath(resultsPerPageOptions.get("DROPDOWN_MENU")));
            js.executeScript("arguments[0].scrollIntoView(true);",resultsPerPageDropDown);
            resultsPerPageDropDown.click();

            ebayDriver.findElement(By.xpath(sortOptions.get(resultsPerPage))).click();
        }
    }

    public void advancedSearch(String keywords,
                               String category,
                               String[] searchIncluding,
                               Integer minPrice,
                               Integer maxPrice,
                               String sortBy,
                               String viewResults,
                               Integer resultsPerPage,
                               Boolean clearOptions
                               ){
        WebElement searchBar = ebayDriver.findElement(By.xpath("//*[@id=\"_nkw\"]"));
        // input keywords
        searchBar.sendKeys(keywords);

        // select category
        selectCategory(category);

        // search including options
        selectSearchIncluding(searchIncluding);

        // price range
        selectPriceRange(minPrice, maxPrice);

        // sort by
        selectSortBy(sortBy);

        // view results
        selectViewResults(viewResults);

        // results per page
        selectResultsPerPage(resultsPerPage);

        // clear options
        if(clearOptions) {
            ebayDriver.findElement(By.xpath(clearOptionsXpath)).click();
        }
    }
}
