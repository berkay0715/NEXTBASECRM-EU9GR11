package com.nextbasecrm.step_definitons;

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
import org.openqa.selenium.Keys;

public class TaskCreation_step_definitions {
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

    @And("user clicks to the -Responsible Person-  and select {int} person")
    public void userClicksToTheResponsiblePersonAndSelectPerson(int arg0) {
        homePage.addMoreBtn.click();
        BrowserUtils.waitFor(1);
        homePage.responsiblePerson.sendKeys("hr10@cybertekschool.com"+ Keys.ENTER);
        BrowserUtils.waitFor(1);
        homePage.popUp.click();
        BrowserUtils.waitFor(1);
        homePage.addMore2People.click();

        homePage.responsiblePerson.sendKeys("marketing20@cybertekschool.com"+ Keys.ENTER);
        BrowserUtils.waitFor(2);
        homePage.popUp.click();
        homePage.addMore2People.click();
        homePage.responsiblePerson.sendKeys("helpdesk30@cybertekschool.com"+ Keys.ENTER);
        homePage.popUp.click();
        BrowserUtils.waitFor(2);
    }

    @Then("user should see {int} the responsible people")
    public void userShouldSeeTheResponsiblePeople(int arg0) {
        Assert.assertTrue(homePage.addPeople1.isDisplayed());
        BrowserUtils.waitFor(1);
        Assert.assertTrue(homePage.addPeople2.isDisplayed());
        BrowserUtils.waitFor(1);
        Assert.assertTrue(homePage.addPeople3.isDisplayed());
    }

    @And("user clicks to the Checklist and type text")
    public void userClicksToTheChecklistAndTypeText() {
        homePage.checkList.click();
        BrowserUtils.waitFor(1);
        homePage.checkListField.sendKeys("Urgent"+Keys.ENTER);
        BrowserUtils.waitFor(1);
    }

    @Then("user should see the added Checklist on the task")
    public void userShouldSeeTheAddedChecklistOnTheTask() {

    }


    @And("user clicks on the Deadline")
    public void userClicksOnTheDeadline() {
        homePage.deadlineButton.click();
        BrowserUtils.waitFor(2);
    }

    @And("user select the date")
    public void userSelectTheDate() {
        homePage.nov17.click();
        BrowserUtils.waitFor(2);
        homePage.selectButton.click();
        BrowserUtils.waitFor(5);

    }









    @And("user clicks on the Time planning")
    public void userClicksOnTheTimePlanning() {
        homePage.timePlanningButton.click();
        BrowserUtils.waitFor(2);
    }

    @And("user select the start and finish date")
    public void userSelectTheStartAndFinishDate() {
        homePage.startDate.click();
        BrowserUtils.waitFor(2);
        homePage.nov17.click();
        BrowserUtils.waitFor(2);
        homePage.finishDate.click();
        BrowserUtils.waitFor(2);
        homePage.nov23.click();
        BrowserUtils.waitFor(5);
    }
}
