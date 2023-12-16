package com.amazon.ui.e2e.tests.steps;

import com.amazon.ui.e2e.tests.config.WebDriverManager;
import com.amazon.ui.e2e.tests.pages.HomePage;
import com.amazon.ui.e2e.tests.pages.SearchResultsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductSearchSteps {


    private final HomePage homePage;
    private SearchResultsPage searchResultsPage;

    public ProductSearchSteps(WebDriverManager webDriverManager) {
        homePage = new HomePage(webDriverManager.getDriver());
    }


    @Given("I am on the Amazon homepage")
    public void i_am_on_the_Amazon_homepage() {
        homePage.navigateTo();
    }

    @When("I enter {string} into the search bar")
    public void i_enter_into_the_search_bar(String query) {
        homePage.enterSearchTerm(query);
    }

    @When("I click the search button")
    public void i_click_the_search_button() {
        searchResultsPage = homePage.clickSearchButton();
    }

    @Then("I should see a list of products related to {string}")
    public void i_should_see_a_list_of_products_related_to(String query) {
        searchResultsPage.assertSearchResultsContains(query);
    }

    @Then("I should see a message indicating no results were found")
    public void i_should_see_a_message_indicating_no_results_were_found() {
        searchResultsPage.assertNoResultsMessageDisplayed();
    }

    // Additional step definitions for filters and pagination
    @Given("I have searched for {string}")
    public void i_have_searched_for(String query) {
        i_enter_into_the_search_bar(query);
        i_click_the_search_button();
    }

    @When("I apply a filter for brand {string}")
    public void i_apply_a_filter_for_brand(String brand) {
        searchResultsPage.applyFilter(brand);
    }

    @When("I apply a filter for price range {string}")
    public void i_apply_a_filter_for_price_range(String priceRange) {
        searchResultsPage.applyFilter(priceRange);
    }

    @Then("I should see a list of {string} 4K televisions within {string} price range")
    public void i_should_see_a_list_of_4k_televisions_within_price_range(String string, String string2) {

    }

    @When("I navigate to the second page of search results")
    public void i_navigate_to_the_second_page_of_search_results() {
        int pageNo = 2;
        searchResultsPage.navigateToPage(pageNo);
    }

    @Then("I should see additional products related to {string}")
    public void i_should_see_additional_products_related_to(String query) {
        i_should_see_a_list_of_products_related_to(query);
    }

}

