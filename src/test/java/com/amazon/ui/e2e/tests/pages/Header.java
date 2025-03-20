package com.amazon.ui.e2e.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {
    private WebDriver driver;
    private By searchBar = By.id("twotabsearchtextbox");
    private By searchIcon = By.id("nav-search-submit-button");

    public Header(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage search(String product) {
        driver.findElement(searchBar).sendKeys(product);
        driver.findElement(searchIcon).click();
        return new ProductPage(driver);
    }
}
