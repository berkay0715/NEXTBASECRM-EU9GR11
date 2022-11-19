package com.nextbasecrm.step_definitions;

import com.github.javafaker.Faker;
import com.nextbasecrm.pages.*;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SendMessagePage_StepDefs {


    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    UploadFilesAndPicturesPage uploadFilesAndPicturesPage = new UploadFilesAndPicturesPage();
    SendMessagePage sendMessagePage = new SendMessagePage();
    Faker faker = new Faker();


    @And("the user writes the message in the message input box")
    public void theUserWritesTheMessageInTheMessageInputBox() {
        BrowserUtils.waitForVisibility(sendMessagePage.iframe,5);
        Driver.getDriver().switchTo().frame(sendMessagePage.iframe);

        sendMessagePage.writeMessageBox.sendKeys("Hello Everyone! "+"\n"+faker.lorem().sentence(20));
        BrowserUtils.sleep(2);

        // switch to parent frame
        Driver.getDriver().switchTo().parentFrame();



    }

    @Then("the user should be able to see the message on the dashboard")
    public void theUserShouldBeAbleToSeeTheMessageOnTheDashboard() {
        String expectedMessage = "Hello Everyone!";
        String actualMessage = homePage.firstSentActivity.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));


    }

}








