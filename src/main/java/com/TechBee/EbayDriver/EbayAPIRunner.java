package com.TechBee.EbayDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EbayAPIRunner {

    public static void main(String[] args) throws IOException {
        Homepage ebayHomepage = new Homepage();
        ebayHomepage.navigateTo("BRAND_OUTLET");
        URL url = new URL(EbayAPIBase.getWebdriver().getCurrentUrl());
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        Integer code = connection.getResponseCode();
        System.out.println(code);
    }

}
