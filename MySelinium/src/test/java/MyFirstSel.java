import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;


public class MyFirstSel {
    WebDriver driver;

    @Before
    public void preConditions() {
        // Given I am on the next home page
        driver = new ChromeDriver();
        driver.get("https://www.next.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @After
    public void postConditions() {
        driver.close();
    }

    @Test
    public void test() {

        // When I enter Jeans as a product
        driver.findElement(By.name("header-big-screen-search-box")).sendKeys("Jeans");

        // And I click on search button
        driver.findElement(By.xpath("//*[@id=\"header-search-form\"]/button/img")).click();

        // Then I should be able to see Jeans as a search result title
        String expectedResult = "\"Jeans\"";
        String actualResult = driver.findElement(By.cssSelector("#plp-results-title-container > div > h1 > span")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void validateSearchBasedonProductTypeAsBag() {
      // When I enter Bag as a productType
        driver.findElement(By.id("header-big-screen-search-box")).sendKeys("Bag");

        // And I click on search button
        driver.findElement(By.xpath("//*[@id=\"header-search-form\"]/button/img")).click();

        // Then I should be able to see Bag as a result title
        String expectedResult = "\"Bag\"";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"plp-results-title-container\"]/div/h1/span")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void validateSearchBehaviourBasedOnBrand() {

        // When I enter Nike as a brand in search box
        driver.findElement(By.id("header-big-screen-search-box")).sendKeys("Nike");

        // And I click on search button
        driver.findElement(By.xpath("//*[@id=\"header-search-form\"]/button/img")).click();

        // Then I should be able to see Nike as a result title
        String expectedResult = "\"Nike\"";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"plp-results-title-container\"]/div/h1/span")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
