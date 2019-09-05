package RegressionSuite;

import base.CommonApi;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.Homepage;
import regression.Homepage;

public class TestPOM extends CommonApi {

    Homepage homePage;
    //CheckingAcc checkingAcc;
    @BeforeMethod
    public void init(){
        homePage = PageFactory.initElements(driver, Homepage.class);
        //checkingAcc = PageFactory.initElements(driver,CheckingAcc.class);
    }

    @Test
    public void careers() {
        homePage.clickCareers();
    }
}

