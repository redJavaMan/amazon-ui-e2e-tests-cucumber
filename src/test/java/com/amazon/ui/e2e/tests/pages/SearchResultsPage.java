package com.amazon.ui.e2e.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class SearchResultsPage {
    private final WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void assertSearchResultsContains(String query) {
        WebElement searchResult = driver.findElement(By.xpath("(//*[contains(text(),'" + query + "')])[3]"));
        assertTrue(searchResult.isDisplayed());
    }

    public void assertNoResultsMessageDisplayed() {
        WebElement noResultMessage = driver.findElement(By.xpath("//*[contains(text(),'No results for')]"));
        assertTrue(noResultMessage.isDisplayed());
    }

    public void applyFilter(String brand) {

    }

    public void navigateToPage(int pageNo) {
        driver.findElement(By.xpath("//a[text()='"+pageNo+"' and contains(@class,'pagination')]")).click();
    }

    // Methods for interacting with filters and pagination would go here
}

