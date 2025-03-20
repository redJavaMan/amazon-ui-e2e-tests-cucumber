package com.amazon.ui.e2e.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    private By searchBox = By.id("twotabsearchtextbox");
    private By searchButton = By.id("nav-search-submit-button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo() {
        driver.get("https://www.amazon.com");
    }

    public void enterSearchTerm(String term) {
        WebElement searchBoxElement = driver.findElement(searchBox);
        searchBoxElement.clear();
        searchBoxElement.sendKeys(term);
    }

    public SearchResultsPage clickSearchButton() {
        driver.findElement(searchButton).click();
        return new SearchResultsPage(driver);
    }
}
