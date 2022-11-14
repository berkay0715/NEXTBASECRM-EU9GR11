package com.nextbasecrm.step_definitons;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.SendMessagePage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.AssertionFailedError;
import org.junit.Assert;


public class SendMessagePage_StepDefs {


    LoginPage loginPage = new LoginPage();
    SendMessagePage sendMessagePage = new SendMessagePage();



    @Given("the user logs in as a {string}")
    public void the_user_logs_in_as_a(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        Driver.getDriver().manage().window().maximize();
        loginPage.loginAs(userType);
    }
    @When("the use clicks on message tab on the dashboard page")
    public void the_use_clicks_on_message_tab_on_the_dashboard_page() {
        BrowserUtils.waitForClickablility(sendMessagePage.messageTab,10);
        sendMessagePage.messageTab.click();
    }
    @Then("the user sees send message box")
    public void the_user_sees_send_message_box() {
        Assert.assertTrue(sendMessagePage.sendMessageTextIsDisplayed.isDisplayed());
        System.out.println("Text Displayed = "+Driver.getDriver().getTitle());
    }

    @Given("the user is inside the message draft box")
    public void the_user_is_inside_the_message_draft_box() {
        sendMessagePage.messageBox.click();
        //need code for switching iframe to message box
    }
    @When("the user types a message inside the message draft box")
    public void the_user_types_a_message_inside_the_message_draft_box() {
        //send keys
        //switch back to parent frame


    }
    @Then("the user sees all employees in the message box")
    public void the_user_sees_all_employees_in_the_message_box() {
        Assert.assertTrue(sendMessagePage.allEmployeesEmailAddressGroup.isDisplayed());

    }
    @Given("the user clicks on add more to add recipients")
    public void the_user_clicks_on_add_more_to_add_recipients() {
        sendMessagePage.addMoreButton.click();
    }
    @When("the user selects the recipients from recent")
    public void the_user_selects_the_recipients_from_recent() {
      sendMessagePage.addEmployeesFromRecent.click();
    }
    @And("the user selects the recipients from my groups")
    public void the_user_selects_the_recipients_from_my_groups() {
        sendMessagePage.addEmployeesByEmailUsers.click();
    }
    @And("the user selects the recipients from employees and departments")
    public void the_user_selects_the_recipients_from_employees_and_departments() {
        sendMessagePage.addEmployeesByEmployeesAndDepartment.click();
    }
    @Then("the user clicks on send and sends the message")
    public void the_user_clicks_on_send_and_sends_the_message() {
        sendMessagePage.sendButton.click();
    }






}
