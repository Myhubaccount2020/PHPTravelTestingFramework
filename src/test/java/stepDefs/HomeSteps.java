package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;


import java.util.concurrent.TimeUnit;

public class HomeSteps {

    public static WebDriver driver;

     HomePage homePage;

    @And("user enter the url")
    public void userEnterTheUrl() {
        System.setProperty("webdriver.chrome.driver","c:\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().to("https://www.phptravels.net");
        driver.manage().window().maximize();

    }

    @Then("user should land on the home page")
    public void userShouldLandOnTheHomePage() {
        homePage=new HomePage(driver);
       Assert.assertTrue(homePage.checkHomeIsvisible());
    }
}
