package regression;

import base.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends CommonApi {


    ///Page Object Model

    @FindBy(xpath = "//*[@id='nav-link-accountList']")
    public static WebElement account;

    @FindBy(xpath = "//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")
    public static WebElement careers;

    //write method


    public void clickAccount() {

       account.click();
        System.out.println(driver.getCurrentUrl());
    }

    public void writeUsername(String userName) {
        //user
        //parameterize
    }

    public void writePass() {
        //pass
        //parameterize
    }

    public void clickCareers() {
        careers.click();
    }

    public void validateCareer(){
        if(careers.isDisplayed())
            System.out.println("verified");;
    }
}
