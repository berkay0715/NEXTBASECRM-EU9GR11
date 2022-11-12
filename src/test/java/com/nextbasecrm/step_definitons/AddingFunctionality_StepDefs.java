package com.nextbasecrm.step_definitons;

import com.github.javafaker.Faker;
import com.nextbasecrm.pages.ConversationsPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.atp.Switch;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AddingFunctionality_StepDefs {

    ConversationsPage conversationsPage=new ConversationsPage();

    Faker faker = new Faker();


    @When("user clicks the {string}.")
    public void user_clicks_the(String button) {

        switch (button){

            case "Message Tab":
                conversationsPage.MessageTab.click();
                BrowserUtils.waitForVisibility(conversationsPage.SendButton,10);
                BrowserUtils.verifyElementDisplayed(conversationsPage.SendButton);
                break;

            case "Add Mention Button":
                conversationsPage.MentionButton.click();
                break;

            case "EmpAndDep Button":
                conversationsPage.EmpAndDepButton.click();
                break;

            case "On of the Employee's Mail":
                conversationsPage.MailOfEmp.click();
                break;

            case "Send Button":
                conversationsPage.SendButton.click();
                break;

        }



    }
    @When("user enters any message.")
    public void user_enters_any_message() {

       // BrowserUtils.waitForVisibility(conversationsPage.InputTextBox,10);
        Driver.getDriver().switchTo().frame(conversationsPage.InputTextBox);
        conversationsPage.TextInputTextBox.sendKeys(faker.weather().description());
        Driver.getDriver().switchTo().parentFrame();

    }
    @Then("verify that user should be able to see list of employees.")
    public void verify_that_user_should_be_able_to_see_list_of_employees() {
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyListOfEmp);
    }
    @Then("verify that user should be able to mention the employee successfully.")
    public void verify_that_user_should_be_able_to_mention_the_employee_successfully() {
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyAddMention);
    }

    @Then("verify that user should be able to send the mentioned message successfully.")
    public void verify_that_user_should_be_able_to_send_the_mentioned_message_successfully() {
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyMentionedMsg);
    }


}
