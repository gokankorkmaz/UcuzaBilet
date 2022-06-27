package Pages;

import Tests.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage extends BasePage {

    WebDriver driver = BasePage.driver;
    By selectFlight = By.xpath("//table[@id='flights-table']/tbody/tr[1]/td[@class='flight-select']/button[1]");


    public void setSelectFlight() {
        driver.findElement(selectFlight).click();

    }

}
