package com.TechBee.EbayDriver;

import java.util.HashMap;
import java.util.Map;

public class ProductsPage extends Homepage {
    protected static Map<String, String> productXpaths;
    static {
        productXpaths = new HashMap<>();
        productXpaths.put("ALL_LISTINGS", "//*[@id=\"s0-14-11-5-1[1]\"]/div[2]/div[1]/div/ul/li[1]/a");
        productXpaths.put("ACCEPTS_OFFERS", "//*[@id=\"s0-14-11-5-1[1]\"]/div[2]/div[1]/div/ul/li[2]/a");
        productXpaths.put("AUCTION", "//*[@id=\"s0-14-11-5-1[1]\"]/div[2]/div[1]/div/ul/li[3]/a");
        productXpaths.put("BUY_IT_NOW", "//*[@id=\"s0-14-11-5-1[1]\"]/div[2]/div[1]/div/ul/li[4]/a");
        productXpaths.put("PRICE_TYPE_CAROUSEL", "//*[@id=\"s0-14-11-6-3-query_answer1-answer-2-1-0-list\"]");
        productXpaths.put("PRICE", "//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/div[5]/div[1]/span");
        productXpaths.put("DESCRIPTION", "//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/div[2]");
    }

    public static Map<String, String> getProductXpaths() {
        return productXpaths;
    }
}
