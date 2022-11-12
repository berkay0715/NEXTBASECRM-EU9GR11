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

            case "Add Link Button":
                conversationsPage.AddLinkButton.click();
                break;

            case "Save Button":
                conversationsPage.SaveButton.click();
                break;

            case "Insert Video Button":
                conversationsPage.InsertVideoButton.click();
                break;



        }



    }
    @When("user enters any message.")
    public void user_enters_any_message() {

       // BrowserUtils.waitForVisibility(conversationsPage.InputTextBox,10);
        Driver.getDriver().switchTo().frame(conversationsPage.InputTextBox);
        conversationsPage.TextInputTextBox.sendKeys(faker.weather().description()+". ");
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







    @Then("verify that user should be able to see Link page.")
    public void verify_that_user_should_be_able_to_see_link_page() {
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyLink);
    }
    @When("user enters the link text to the link text input box.")
    public void user_enters_the_link_text_to_the_link_text_input_box() {
        conversationsPage.LinkTextInputTextBox.sendKeys("Surprise Link From JavaFaker ");
    }
    @When("user enters the link url to the link url input box.")
    public void user_enters_the_link_url_to_the_link_url_input_box() {
        conversationsPage.LinkURLInputTextBox.sendKeys(faker.internet().url());
    }
    @Then("verify that user should be able to add the link successfully.")
    public void verify_that_user_should_be_able_to_add_the_link_successfully() {
        Driver.getDriver().switchTo().frame(conversationsPage.InputTextBox);
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyLinkIsAdded);
        Driver.getDriver().switchTo().parentFrame();
    }
    @Then("verify that user should be able to send the added link message successfully.")
    public void verify_that_user_should_be_able_to_send_the_added_link_message_successfully() {
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyLinkedMsg);
    }








    @Then("verify that user should be able to see video page.")
    public void verify_that_user_should_be_able_to_see_video_page() {
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyVideoPage);
    }
    @When("user enter the URL from Vimeo to video source input box.")
    public void user_enter_the_url_from_vimeo_to_video_source_input_box() {
        conversationsPage.VideoSourceInputBox.sendKeys("https://vimeo.com/565327806");
        BrowserUtils.waitForVisibility(conversationsPage.VerifyVideoIsAdded,10);
    }
    @Then("verify that user should be able to add the video from Vimeo successfully.")
    public void verify_that_user_should_be_able_to_add_the_video_from_vimeo_successfully() {
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyVideoIsAdded);
    }
    @Then("verify that user should be able to save the add video function successfully.")
    public void verify_that_user_should_be_able_to_save_the_add_video_function_successfully() {
        Driver.getDriver().switchTo().frame(conversationsPage.InputTextBox);
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyVideoIsSaved);
        Driver.getDriver().switchTo().parentFrame();
    }
    @Then("verify that user should be able to send the video added from Vimeo message successfully.")
    public void verify_that_user_should_be_able_to_send_the_video_added_from_vimeo_message_successfully() {
        Driver.getDriver().switchTo().frame(conversationsPage.VerifyVideoIsSentIframe);
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyVideoSent);
    }


}
