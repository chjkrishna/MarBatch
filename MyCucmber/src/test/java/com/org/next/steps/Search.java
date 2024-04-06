package com.org.next.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

    WebDriver driver;

    @Given("I am on the next home page")
    public void i_am_on_the_next_home_page() {
        driver = new ChromeDriver();
        driver.get("https://www.next.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }
    @When("I enter Jeans as a product type")
    public void i_enter_jeans_as_a_product_type() {
        driver.findElement(By.xpath("//input[@id='header-big-screen-search-box']")).sendKeys("Jeans");

    }
    @When("I click on search button")
    public void i_click_on_search_button() {
        driver.findElement(By.xpath("//*[@id=\"header-search-form\"]/button/img")).click();

    }
    @Then("I should be able to see result title as Jeans")
    public void i_should_be_able_to_see_result_title_as_jeans() {

        String expectedResult = "\"Jeans\"";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"plp-results-title-container\"]/div/h1/span")).getText();
        Assert.assertEquals(expectedResult, actualResult);
        driver.close();
    }


    @When("I enter {string} as a product type")
    public void i_enter_as_a_product_type(String productType) {
        driver.findElement(By.xpath("//input[@id='header-big-screen-search-box']")).sendKeys(productType);

    }
    @Then("I should be able to see result title as {string}")
    public void i_should_be_able_to_see_result_title_as(String resultTitle) {
        String expectedResult = resultTitle;
        String actualResult = driver.findElement(By.xpath("//*[@id=\"plp-results-title-container\"]/div/h1/span")).getText();
        Assert.assertEquals(expectedResult, actualResult);
        driver.close();

    }
}
