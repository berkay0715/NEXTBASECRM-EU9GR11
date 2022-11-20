package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.HomePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.TaskPage;
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

public class TaskCreation_step_definitions {


    HomePage homePage = new HomePage();
    TaskPage taskPage = new TaskPage();


    @And("user clicks on the -Task-type the task name")
    public void userClicksOnTheTaskTypeTheTaskName() {
        homePage.taskTab.click();
        BrowserUtils.waitFor(1);
        taskPage.taskPanel.click();
        taskPage.taskTitle.sendKeys("plan");
        BrowserUtils.waitFor(2);
    }

    @And("user clicks to the -High Priority")
    public void userClicksToTheHighPriority() {
        taskPage.highPriority.click();
    }
    @Then("user should see the High Priority Selectable")
    public void userShouldSeeTheHighPrioritySelectable() {
        Assert.assertTrue(taskPage.highPriority.isSelected());
        BrowserUtils.waitFor(2);
    }

    @And("user clicks to the -Responsible Person- and select three person")
    public void userClicksToTheResponsiblePersonAndSelectThreePerson() {
        taskPage.addMoreBtn.click();

        //added responsible person from recent list
        taskPage.selectPersonList.get(1).click();
        taskPage.selectPersonList.get(2).click();
        taskPage.selectPersonList.get(3).click();

        taskPage.popUp.click();

        BrowserUtils.waitFor(10);


    }

    @Then("user should see there three responsible people")
    public void userShouldSeeTheResponsiblePeople() {
        Assert.assertTrue(taskPage.addedResponsiblePersonList.get(2).isDisplayed());
        Assert.assertTrue(taskPage.addedResponsiblePersonList.get(3).isDisplayed());
        Assert.assertTrue(taskPage.addedResponsiblePersonList.get(4).isDisplayed());
        for (WebElement person : taskPage.addedResponsiblePersonList) {
            System.out.println(person.getText());
        }

    }

    @And("user clicks to the Checklist and type text")
    public void userClicksToTheChecklistAndTypeText() {
        homePage.checkList.click();
        BrowserUtils.waitFor(1);
        taskPage.checkListField.sendKeys("Urgent"+Keys.ENTER);
        BrowserUtils.waitFor(1);
    }

    @Then("user should see the added Checklist on the task")
    public void userShouldSeeTheAddedChecklistOnTheTask() {

    }


    @And("user clicks on the Deadline")
    public void userClicksOnTheDeadline() {
        taskPage.deadlineButton.click();
        BrowserUtils.waitFor(2);
    }

    @And("user select the date")
    public void userSelectTheDate() {
        taskPage.nov17.click();
        BrowserUtils.waitFor(2);
        taskPage.selectButton.click();
        BrowserUtils.waitFor(5);

    }









    @And("user clicks on the Time planning")
    public void userClicksOnTheTimePlanning() {
        taskPage.timePlanningButton.click();
        BrowserUtils.waitFor(2);
    }

    @And("user select the start and finish date")
    public void userSelectTheStartAndFinishDate() {
        taskPage.startDate.click();
        BrowserUtils.waitFor(2);
        taskPage.nov17.click();
        BrowserUtils.waitFor(2);
        taskPage.finishDate.click();
        BrowserUtils.waitFor(2);
        taskPage.nov23.click();
        BrowserUtils.waitFor(5);
    }
}
