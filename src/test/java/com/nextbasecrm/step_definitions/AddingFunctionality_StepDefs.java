package com.nextbasecrm.step_definitions;

import com.github.javafaker.Faker;
import com.nextbasecrm.pages.ConversationsPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.atp.Switch;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AddingFunctionality_StepDefs {

    ConversationsPage conversationsPage=new ConversationsPage();

    Faker faker = new Faker();

    Actions actions=new Actions(Driver.getDriver());


    @When("user clicks the {string}.")
    public void user_clicks_the(String button) {

        switch (button){

            case "Message Tab":
                conversationsPage.MessageTab.click();
                BrowserUtils.waitForVisibility(conversationsPage.SendButton,20);
                BrowserUtils.verifyElementDisplayed(conversationsPage.SendButton);
                break;

            case "Add Mention Button":
                Driver.getDriver().switchTo().parentFrame();
                conversationsPage.MentionButton.click();
                break;

            case "EmpAndDep Button":
                conversationsPage.EmpAndDepButton.click();
                break;

            case "On of the Employee's Mail":
                conversationsPage.MailOfEmp.click();
                break;

            case "Send Button":
                Driver.getDriver().switchTo().parentFrame();
                conversationsPage.SendButton.click();
                break;

            case "Add Link Button":
                Driver.getDriver().switchTo().parentFrame();
                conversationsPage.AddLinkButton.click();
                break;

            case "Save Button":

                conversationsPage.SaveButton.click();
                break;

            case "Insert Video Button":
                Driver.getDriver().switchTo().parentFrame();
                conversationsPage.InsertVideoButton.click();
                break;

            case "Quote Text Button":
                Driver.getDriver().switchTo().parentFrame();
                conversationsPage.QuoteTextButton.click();
                break;

            case "Tag Button":
                Driver.getDriver().switchTo().parentFrame();
                conversationsPage.TagButton.click();
                break;

            case "Add Button":
                conversationsPage.TagAddButton.click();


        }



    }
    @When("user enters any message.")
    public void user_enters_any_message() {

       // BrowserUtils.waitForVisibility(conversationsPage.InputTextBox,10);
        Driver.getDriver().switchTo().frame(conversationsPage.InputTextBox);
        conversationsPage.TextInputTextBox.sendKeys(faker.weather().description()+". ");


    }
    @Then("verify that user should be able to see list of employees.")
    public void verify_that_user_should_be_able_to_see_list_of_employees() {
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyListOfEmp);
    }
    @Then("verify that user should be able to mention the employee successfully.")
    public void verify_that_user_should_be_able_to_mention_the_employee_successfully() {
        Driver.getDriver().switchTo().frame(conversationsPage.InputTextBox);
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
        BrowserUtils.waitForVisibility(conversationsPage.VerifyLinkIsAdded,10);
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyLinkIsAdded);

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
        conversationsPage.VideoSourceInputBox.sendKeys("https://vimeo.com/760830321");
    }
    @Then("verify that user should be able to add the video successfully.")
    public void verify_that_user_should_be_able_to_add_the_video_successfully() {
        BrowserUtils.waitForVisibility(conversationsPage.VerifyVideoIsAdded,10);
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyVideoIsAdded);
    }
    @Then("verify that user should be able to save the add video function successfully.")
    public void verify_that_user_should_be_able_to_save_the_add_video_function_successfully() {
        Driver.getDriver().switchTo().frame(conversationsPage.InputTextBox);
        BrowserUtils.waitForVisibility(conversationsPage.VerifyVideoIsSaved,10);
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyVideoIsSaved);

    }
    @Then("verify that user should be able to send the video added from Vimeo message successfully.")
    public void verify_that_user_should_be_able_to_send_the_video_added_from_vimeo_message_successfully() {
        Driver.getDriver().switchTo().frame(conversationsPage.VerifyVideoIsSentIframe);
        BrowserUtils.waitForVisibility(conversationsPage.VerifyVideoSent,10);
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyVideoSent);
        Driver.getDriver().switchTo().parentFrame();
    }



    @When("user enter the URL from Youtube to video source input box.")
    public void userEnterTheURLFromYoutubeToVideoSourceInputBox() {
        conversationsPage.VideoSourceInputBox.sendKeys("https://youtu.be/53rCIbKHCeU");
    }




    @When("user removes the {string} from message box.")
    public void userRemovesTheFromMessageBox(String arg) {

        switch (arg) {

            case "Video":
                //Driver.getDriver().switchTo().frame(conversationsPage.InputTextBox);
                //conversationsPage.VerifyVideoIsSaved.clear();
                actions.contextClick(conversationsPage.VerifyVideoIsSaved).perform();
                BrowserUtils.waitForVisibility(conversationsPage.RemoveSavedVideo,10);
                conversationsPage.RemoveSavedVideo.click();
                break;
            case "Link":
                //Driver.getDriver().switchTo().frame(conversationsPage.InputTextBox);
                actions.contextClick(conversationsPage.VerifyLinkIsAdded).perform();
                BrowserUtils.waitForVisibility(conversationsPage.RemoveSavedLink,10);
                conversationsPage.RemoveSavedLink.click();
                break;
            case "Tag":
                break;
            }

        }

    @Then("verify that user should be able to remove the video from message box.")
    public void verifyThatUserShouldBeAbleToRemoveTheVideoFromMessageBox() {
        BrowserUtils.verifyElementNotDisplayed(By.xpath("//span[@title='Video']"));

    }

    @Then("verify that user should be able to remove the link from message box.")
    public void  verifyThatUserShouldBeAbleToRemoveTheLinkFromMessageBox() {
        BrowserUtils.verifyElementNotDisplayed(By.xpath("//a[.='Surprise Link From JavaFaker ']"));

    }









    @Then("verify that user should be able to see the block quote.")
    public void verifyThatUserShouldBeAbleToSeeTheBlockQuote() {
        Driver.getDriver().switchTo().frame(conversationsPage.InputTextBox);
        BrowserUtils.waitForVisibility(conversationsPage.BlockQuote,10);
        BrowserUtils.verifyElementDisplayed(conversationsPage.BlockQuote);
    }

    @When("user types something.")
    public void userTypesSomething() {
        conversationsPage.BlockQuote.sendKeys("The mind is like a parachute, it's useless if it's not open. Anonymous");

    }

    @Then("verify that user should be able to add the quote successfully.")
    public void verifyThatUserShouldBeAbleToAddTheQuoteSuccessfully() {
        BrowserUtils.waitForVisibility(conversationsPage.VerifyQuoteIsSent,10);
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyQuoteIsSent);
    }






    @Then("verify that user should be able to see tag page.")
    public void verifyThatUserShouldBeAbleToSeeTagPage() {
        BrowserUtils.waitForVisibility(conversationsPage.VerifyTagPage,10);
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyTagPage);
    }

    @When("user enters the tag name.")
    public void userEntersTheTagName() {
        conversationsPage.TagInputBox.sendKeys("Stockholm");
    }

    @Then("verify that user should be able to add the tag successfully.")
    public void verifyThatUserShouldBeAbleToAddTheTagSuccessfully() {

        BrowserUtils.waitForVisibility(conversationsPage.VerifyTagIsAdded,10);
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyTagIsAdded);
        //I need to go to iframe because before send button I go to parent frame because of other testcases step
        Driver.getDriver().switchTo().frame(conversationsPage.InputTextBox);

    }

    @Then("verify that user should be able to send the tagged message successfully.")
    public void verifyThatUserShouldBeAbleToSendTheTaggedMessageSuccessfully() {
        BrowserUtils.waitForVisibility(conversationsPage.VerifyTagIsSent,10);
        BrowserUtils.verifyElementDisplayed(conversationsPage.VerifyTagIsSent);
    }
}
