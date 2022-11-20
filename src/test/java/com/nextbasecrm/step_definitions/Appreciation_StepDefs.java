package com.nextbasecrm.step_definitions;

import com.github.javafaker.Faker;
import com.nextbasecrm.pages.AppreciationPage;
import com.nextbasecrm.pages.HomePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.UploadFilesAndPicturesPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Appreciation_StepDefs {

    UploadFilesAndPicturesPage uploadFilesAndPicturesPage = new UploadFilesAndPicturesPage();

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AppreciationPage appreciationPage = new AppreciationPage();

    Faker faker = new Faker();


    // TC1

    @Given("the user logs in as a {string}")
    public void the_user_logsIn_as_a(String userType) {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.loginAs(userType);

    }

    @When("the user clicks more tab on portal homepage")
    public void the_user_clicks_more_tab_on_portal_homepage() {
        //homePage.joinWorkGroups();
        homePage.moreTab.click();

    }
    @Then("the user should be able to see appreciation on menu popup")
    public void the_user_should_be_able_to_see_appreciation_on_menu_popup() {
        BrowserUtils.waitForVisibility(appreciationPage.moreTabAppreciationItem,10);
        Assert.assertTrue(appreciationPage.moreTabAppreciationItem.isDisplayed());

    }
    @When("the user clicks appreciation item")
    public void the_user_clicks_appreciation_item() {

            appreciationPage.moreTabAppreciationItem.click();
    }
    @And("the user writes a message")
    public void the_user_writes_appreciation_message_title() {
        // switch to iframe
        Driver.getDriver().switchTo().frame(appreciationPage.iframe);

        appreciationPage.appreciationMessageTitleInput.sendKeys("Back To The Future Quote: "+faker.backToTheFuture().quote());

        // switch to parent frame
        Driver.getDriver().switchTo().parentFrame();

    }

    @Then("the user should be able to see recipient as All employees by default")
    public void the_user_should_be_able_to_see_recipient_as_all_employees_by_default() {
        BrowserUtils.waitForPageToLoad(2);
        Assert.assertTrue(appreciationPage.allEmployeesAsDefaultRecipient.isDisplayed());
        BrowserUtils.waitForVisibility(uploadFilesAndPicturesPage.sendButton,10);
    }

    @When("the user clicks send button")
    public void the_user_clicks_send_button() {


        uploadFilesAndPicturesPage.sendButton.click();
        BrowserUtils.waitForPageToLoad(2);

    }
    @Then("the user should be able to see the message on activity stream")
    public void the_user_should_be_able_to_see_the_appreciation_message_on_activity_stream() {

        String expectedMessage = "Back To The Future Quote: ";
        String actualMessage = homePage.firstSentActivity.getText();
            Assert.assertTrue(actualMessage.contains(expectedMessage));
        BrowserUtils.waitForPageToLoad(2);
    }

    // TC2

    @Then("--The message title is not specified-- error message should be displayed")
    public void the_message_title_is_not_specified_error_message_should_be_displayed() {
            Assert.assertTrue(appreciationPage.emptyMessageErrorText.isDisplayed());
    }

    @Then("the user deletes all recipients")
    public void the_user_deletes_all_recipients() {
            appreciationPage.deleteAllEmployees.click();
    }

    @Then("--Please specify at least one person-- error message should be displayed")
    public void please_specify_at_least_one_person_error_message_should_be_displayed() {
            Assert.assertTrue(appreciationPage.noRecipientErrorText.isDisplayed());
    }

    // TC3

    @When("the user clicks add persons link text")
    public void the_user_clicks_add_persons_link_text() {
       appreciationPage.addPersonsGroupsDepartment.click();
    }
    @Then("the user should be able to select different recipients from the list")
    public void the_user_should_be_able_to_select_different_recipients_from_the_list() {

        //select recipients from recent tab
        for (WebElement recipient : appreciationPage.recipientsListForAppreciation) {
            recipient.click();
            Assert.assertTrue(recipient.isDisplayed());
            recipient.click();
            System.out.println("Recent :"+recipient.getText());
        }

        //select recipients from Employees and Departments tab
        appreciationPage.employeesAndDepsRecipientsTab.click();
        appreciationPage.recipientsListFromEmployeesAndDeps.get(0).click();
        Assert.assertTrue(appreciationPage.recipientsListFromEmployeesAndDeps.get(0).isDisplayed());
        appreciationPage.appreciationRecipientsInputBox.sendKeys(Keys.BACK_SPACE);
        appreciationPage.recipientsListFromEmployeesAndDeps.get(1).click();
        Assert.assertTrue(appreciationPage.recipientsListFromEmployeesAndDeps.get(1).isDisplayed());
        System.out.println("Employees :"+appreciationPage.recipientsListFromEmployeesAndDeps.get(0).getText() + ", " + appreciationPage.recipientsListFromEmployeesAndDeps.get(1).getText());


        //select recipients from My groups tab
        appreciationPage.myGroupsRecipientstab.click();

        for (WebElement recipient : appreciationPage.recipientsListFromMyGroups) {
            recipient.click();
            Assert.assertTrue(recipient.isDisplayed());
            recipient.click();
            System.out.println("My Groups :"+recipient.getText());
        }

    }


    @Then("the user should be able to click cancel button")
    public void the_user_should_be_able_to_cancel_sending_appreciation() {

        BrowserUtils.waitForClickablility(uploadFilesAndPicturesPage.cancelButton,10);

        Assert.assertTrue(uploadFilesAndPicturesPage.cancelButton.isDisplayed());

        uploadFilesAndPicturesPage.cancelButton.click();

    }


    @Then("the user should be able to select different grat icons")
    public void theUserShouldBeAbleToSelectDifferentGratIcons() {


        appreciationPage.selectGratIcon.click();


        for (int i = 1; i < appreciationPage.gratIconList.size(); i++) {

            appreciationPage.gratIconList.get(i).click();
            appreciationPage.selectGratIcon.click();

        }
        appreciationPage.gratIconList.get(11).click();
        Assert.assertTrue(appreciationPage.selectGratIcon.isDisplayed());


    }

    @And("the user selects a recipient")
    public void theUserSelectsARecipient() {


        appreciationPage.gratRecipientInputBox.click();
        appreciationPage.firstEmployeeOfList.click();
        appreciationPage.closeRecipientsPopup.click();
        BrowserUtils.waitFor(1);



    }


}
