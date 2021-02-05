package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BookHotelPage {
    WebDriver driver;

    public BookHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "HOTELS")
    WebElement buttonHotels;

    @FindBy(xpath = "//label[text()='Check in']")
    WebElement checkHotelspage;

    @FindBy(xpath = "//form[@name='HOTELS']//a")
    WebElement destinationSelect;

    @FindBy(xpath = "//*[@id=\"select2-drop\"]/ul//div")
    List<WebElement> listofDestinations ;

    @FindBy(id = "checkin")
    WebElement checkinElement;

    @FindBy(xpath = "//*[@id=\"datepickers-container\"]/div[1]/nav/div[3]")
    WebElement datePickerPointer;

    @FindBy(xpath = "//*[@id=\"datepickers-container\"]/div[1]/div/div/div[2]/div[13]")
    WebElement pickcheckinDate;

    @FindBy(xpath = "//*[@id=\"datepickers-container\"]/div[2]/div/div/div[2]/div[20]")
    WebElement pickcheckoutDate;

    @FindBy(xpath = "//*[@id=\"hotels\"]//form//div[3]//div[1]/div/div[2]/div/span/button[1]")
    WebElement adultAddButton;

    @FindBy(xpath = "//*[@id=\"hotels\"]//form//div[3]//div[1]/div/div[2]/div/span/button[2]")
    WebElement adultSubButton;

    @FindBy(xpath = "//*[@id=\"hotels\"]//form//div[3]//div[2]/div/div[2]/div/span/button[1]")
    WebElement childAddButton;

    @FindBy(xpath = "//*[@id=\"hotels\"]//form//div[3]//div[2]/div/div[2]/div/span/button[2]")
    WebElement childSubButton;

    @FindBy(xpath = "//*[@id=\"hotels\"]//div/button")
    WebElement searchButton;


    public boolean buttonHotelsIsvisible() {
        return buttonHotels.isDisplayed();
    }

    public void navigateTohotels() {
        buttonHotels.click();
    }

    public boolean checkHotels() {
        return checkHotelspage.isDisplayed();
    }

    public void selectHotelorLocation(String destination) {
        destinationSelect.click();

        destinationSelect.sendKeys(destination);
        for (int i = 0;i<listofDestinations.size();i++){
            if( listofDestinations.get(i).getText().contains(destination));{
                listofDestinations.get(i).click();
            }

        }


    }

    public void selectCheckinDate() {
        checkinElement.click();
        datePickerPointer.click();
        pickcheckinDate.click();
    }

    public void selectCheckoutDate() {
        pickcheckoutDate.click();
    }
    public void addadult(){
        adultAddButton.click();
    }
    public void subadult(){
        adultSubButton.click();
    }
    public void addChild(){
        childAddButton.click();
    }
    public void subChild(){
       childSubButton.click();
    }
    public void searchHotels(){
        searchButton.click();
    }
}
