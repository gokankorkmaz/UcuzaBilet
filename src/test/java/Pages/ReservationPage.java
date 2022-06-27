package Pages;

import Tests.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ReservationPage extends BasePage {

    WebDriver driver = BasePage.driver;


    By fPName = By.cssSelector("input[name='name_1']");
    By fPSurname = By.cssSelector("input[name='surname_1']");
    By fpTckn = By.cssSelector("input[id='tb-tckn-1']");
    By fpgender = By.cssSelector("label[for='rb-male-1']");
    By fpbDate = By.cssSelector("input[id='tb-birthdate-1']");

    By sPName = By.cssSelector("input[name='name_2']");
    By sPSurname = By.cssSelector("input[name='surname_2']");
    By spTckn = By.cssSelector("input[id='tb-tckn-2']");
    By spbDate = By.cssSelector("input[id='tb-birthdate-2']");
    By spgender = By.cssSelector("label[for='rb-female-2']");


    By tPName = By.cssSelector("input[name='name_3']");
    By tPSurname = By.cssSelector("input[name='surname_3']");
    By tpTckn = By.cssSelector("input[id='tb-tckn-3']");
    By tpbDate = By.cssSelector("input[id='tb-birthdate-3']");
    By tpgender = By.cssSelector("label[for='rb-male-3']");


    By contactMail = By.id("contactMail");
    By phoneNumber = By.xpath("//input[@name='phoneNumber']");


    By creditCardOwnerName = By.name("creditCardOwnerName");
    By creditCardNumber = By.id("creditCardNumber");
    By creditCardCVC = By.name("creditCardCVC");


    By creditCardMonth = By.cssSelector("select[name='creditCardValidMonth']");
    By creditCardYear = By.cssSelector("select[name='creditCardValidYear']");
    By buyTicket = By.id("makeResButton");


    public void fillFormFirstPerson() {

        driver.findElement(fpgender).click();
        driver.findElement(fPName).sendKeys("Gökhan");
        driver.findElement(fPSurname).sendKeys("Korkmaz");
        driver.findElement(fpbDate).sendKeys("11051988");
        driver.findElement(fpTckn).sendKeys("46726689716");


    }

    public void fillFormSecondPerson() {
        driver.findElement(sPName).sendKeys("Kıymet");
        driver.findElement(sPSurname).sendKeys("Korkmaz");
        driver.findElement(spbDate).sendKeys("10061966");
        driver.findElement(spTckn).sendKeys("46729689652");
        driver.findElement(spgender).click();
        ;
    }

    public void fillFormThirdPerson() {
        driver.findElement(tPName).sendKeys("Deniz Ali");
        driver.findElement(tPSurname).sendKeys("Özmen");
        driver.findElement(tpbDate).sendKeys("09062020");
        driver.findElement(tpTckn).sendKeys("37307339410");
        driver.findElement(tpgender).click();

    }


    public void fillContactInformation() throws InterruptedException {
        driver.findElement(contactMail).sendKeys("gokankorkmaz@gmail.com");
        driver.findElement(phoneNumber).sendKeys("5068001077");
        Thread.sleep(2000);

    }


    public void fillCreditCardInformation() throws InterruptedException {
        driver.findElement(creditCardOwnerName).sendKeys("Paul Lamb");
        driver.findElement(creditCardNumber).sendKeys("4292276092135388");
        driver.findElement(creditCardCVC).sendKeys("453");
        driver.findElement(creditCardMonth).sendKeys("06");
        driver.findElement(creditCardYear).sendKeys("2026");

        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.cssSelector("input[name='agreeementRules']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", ele);
        driver.findElement(buyTicket).click();

    }
}
