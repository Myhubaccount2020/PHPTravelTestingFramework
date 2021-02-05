package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.BookHotelPage;

public class BookHotelSteps {

    WebDriver driver= HomeSteps.driver;
    BookHotelPage bookHotelPage =new BookHotelPage(driver);


    @And("the button hotels should be visible")
    public void theButtonHotelsShouldBeVisible() {
        Assert.assertTrue(bookHotelPage.buttonHotelsIsvisible());


    }

    @Then("user click on the hotels button")
    public void userClickOnTheHotelsButton() {
        bookHotelPage.navigateTohotels();
    }

    @And("user should see the hotels page")
    public void userShouldSeeTheHotelsPage() {
        Assert.assertTrue(bookHotelPage.checkHotels());
    }
    @Then("user select a Hotel or a location {string}")
    public void userSelectAHotelOrALocation(String destination) {
        bookHotelPage.selectHotelorLocation(destination);
    }

    @And("user select a checkin date")
    public void userSelectACheckinDate() {
        bookHotelPage.selectCheckinDate();
    }

    @Then("user select checkout date")
    public void userSelectCheckoutDate() {
        bookHotelPage.selectCheckoutDate();
    }

    @And("user select the number of adults")
    public void userSelectTheNumberOfAdults() {
        bookHotelPage.addadult();
    }

    @Then("user select the number of children")
    public void userSelectTheNumberOfChildren() {
        bookHotelPage.addChild();
    }

    @Then("user click on search button")
    public void userClickOnSearchButton() {
        bookHotelPage.searchHotels();
    }


}
