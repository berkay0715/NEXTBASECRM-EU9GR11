package com.nextbasecrm.step_definitions;

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

public class TaskCreation_StepDefs {
    LoginPage loginPage = new LoginPage();

    HomePage homePage = new HomePage();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        //nextBaseCrmLoginPage.loginLink.click();
    }



    @When("user enters {string},{string}and click the login button")
    public void userEntersAndClickTheLoginButton(String email, String password) {
        loginPage.userNameInput.sendKeys(email);
        BrowserUtils.waitFor(1);
        loginPage.passwordInput.sendKeys(password);
        BrowserUtils.waitFor(1);
        loginPage.loginButton.click();
        BrowserUtils.waitFor(1);
    }


    @And("user clicks on the -Task-type the task name")
    public void userClicksOnTheTaskTypeTheTaskName() {
        homePage.taskTab.click();
        BrowserUtils.waitFor(1);
        homePage.taskPanel.click();
        homePage.taskTitle.sendKeys("plan");
        BrowserUtils.waitFor(2);
    }

    @And("user clicks to the -High Priority")
    public void userClicksToTheHighPriority() {
        homePage.highPriority.click();
    }
    @Then("user should see the High Priority Selectable")
    public void userShouldSeeTheHighPrioritySelectable() {
        Assert.assertTrue(homePage.highPriority.isSelected());
        BrowserUtils.waitFor(2);
    }
}
