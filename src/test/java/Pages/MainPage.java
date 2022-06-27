package Pages;

import Tests.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.*;


public class MainPage extends BasePage {

    WebDriver driver = BasePage.driver;
    WebElement logo = driver.findElement(By.className("navbar-brand"));
    WebElement fromText = driver.findElement(By.id("from_text"));
    WebElement toText = driver.findElement(By.id("to_text"));
    WebElement datenext;
    WebElement dateday;

    WebElement passengers = driver.findElement(By.xpath("(//i[@class='csprite bg-arrow_down'])[1]"));
    WebElement adults = driver.findElement(By.xpath("(//i[@class='csprite bg-bg_plus m-auto'])[1]"));
    WebElement child = driver.findElement(By.xpath("(//i[@class='csprite bg-bg_plus m-auto'])[2]"));
    WebElement search = driver.findElement(By.id("searchFormSubmit"));

    @Test
    public void fromWhere(String fromWhereText) throws InterruptedException {
        Assert.assertTrue(logo.isDisplayed());
        fromText.click();
        fromText.sendKeys(fromWhereText);
        Actions actions1 = new Actions(driver);
        actions1.sendKeys(fromText, Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    }


    public void toWhere(String toWhereText) throws InterruptedException {
        Thread.sleep(1000);
        toText.click();
        toText.sendKeys(toWhereText);
        Actions actions2 = new Actions(driver);
        actions2.sendKeys(toText, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
    }

    public void selectDate() throws InterruptedException {
        Thread.sleep(1000);
        datenext = driver.findElement(By.cssSelector("a[title='ileri>']>.ui-icon.ui-icon-circle-triangle-e"));
        Actions act = new Actions(driver);
        act.doubleClick(datenext).perform();
        //Gün
        dateday = driver.findElement(By.cssSelector(".ui-datepicker-group.ui-datepicker-group-last>.ui-datepicker-calendar>tbody>tr:nth-of-type(2)>td:nth-of-type(7)>.ui-state-default"));
        dateday.click();
    }

    public void selectPassengersAndSearch() throws InterruptedException {
        passengers.click();
        adults.click();
        child.click();
        Thread.sleep(1000);
        search.click();

    }
}
