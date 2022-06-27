package Tests;

import Pages.MainPage;
import Pages.ReservationPage;
import Pages.ResultPage;
import org.testng.annotations.Test;


public class RunTest extends BasePage {

    MainPage mainPage;
    ResultPage resultPage;
    ReservationPage reservationPage;


    @Test
    public void UcuzaBiletTest() throws InterruptedException {
        mainPage = new MainPage();
        mainPage.fromWhere("İST");
        mainPage.toWhere("İZM");
        mainPage.selectDate();
        mainPage.selectPassengersAndSearch();
        resultPage = new ResultPage();
        resultPage.setSelectFlight();
        reservationPage = new ReservationPage();
        reservationPage.fillFormFirstPerson();
        reservationPage.fillFormSecondPerson();
        reservationPage.fillFormThirdPerson();
        reservationPage.fillContactInformation();
        reservationPage.fillCreditCardInformation();


    }


}
