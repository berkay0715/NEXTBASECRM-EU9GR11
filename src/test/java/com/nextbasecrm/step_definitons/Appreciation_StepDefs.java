package com.nextbasecrm.step_definitons;

import com.github.javafaker.Faker;
import com.nextbasecrm.pages.AppreciationPage;
import com.nextbasecrm.pages.HomePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Appreciation_StepDefs {

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
        homePage.moreTab.click();

    }
    @Then("the user should be able to see appreciation on menu popup")
    public void the_user_should_be_able_to_see_appreciation_on_menu_popup() {
        Assert.assertTrue(appreciationPage.moreTabAppreciationItem.isDisplayed());

    }
    @When("the user clicks appreciation item")
    public void the_user_clicks_appreciation_item() {
        BrowserUtils.waitForVisibility(appreciationPage.moreTabAppreciationItem,10);
            appreciationPage.moreTabAppreciationItem.click();
    }
    @And("the user writes appreciation message title")
    public void the_user_writes_appreciation_message_title() {
        // switch to iframe
        Driver.getDriver().switchTo().frame(appreciationPage.iframe);

        appreciationPage.appreciationMessageTitleInput.sendKeys("Thank you for your assistance. "+faker.funnyName().name());

        // switch to parent frame
        Driver.getDriver().switchTo().parentFrame();

    }

    @Then("the user should be able to see recipient as All employees by default")
    public void the_user_should_be_able_to_see_recipient_as_all_employees_by_default() {
        Assert.assertTrue(appreciationPage.allEmployeesAsDefaultRecipient.isDisplayed());
    }

    @When("the user clicks send button")
    public void the_user_clicks_send_button() {

        appreciationPage.sendAppreciationButton.click();

    }
    @Then("the user should be able to see the appreciation message on activity stream")
    public void the_user_should_be_able_to_see_the_appreciation_message_on_activity_stream() {

        String expectedMessage = "Thank you for your assistance.";
        String actualMessage = homePage.firstSentActivity.getText();
            Assert.assertTrue(actualMessage.contains(expectedMessage));

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




}
