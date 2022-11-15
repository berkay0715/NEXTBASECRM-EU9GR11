package com.nextbasecrm.step_definitions;

import com.github.javafaker.Faker;
import com.nextbasecrm.pages.AppreciationPage;
import com.nextbasecrm.pages.HomePage;
import com.nextbasecrm.pages.LoginPage;
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



}
