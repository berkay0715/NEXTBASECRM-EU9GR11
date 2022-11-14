package com.nextbasecrm.step_definitions;

import com.github.javafaker.Faker;
import com.nextbasecrm.pages.HomePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.PollTabPage;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Poll_StepDefs {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    PollTabPage pollTabPage = new PollTabPage();
    Faker faker = new Faker();


    @Then("the user click on the poll button")
    public void the_user_click_on_the_poll_button() {
        homePage.pollTab.click();

    }

    @Then("the user click on the add more button in the recipient field")
    public void the_user_click_on_the_add_more_button_in_the_recipient_field() {
        pollTabPage.addMoreButton.click();

    }

    @Then("the user select the employees and department group")
    public void the_user_select_the_employees_and_department_group() {
        pollTabPage.employeesAndDepartments.click();

    }

    @Then("The user select the group ffff")
    public void the_user_select_the_group_ffff() {
        pollTabPage.groupOfContacts.click();

    }

    @Then("the user select the group of the all department and subdepartment employees")
    public void the_user_select_the_groupf_of_the_all_department_and_subdepartment_employees() {
        pollTabPage.allDepartmentAndSubdepartmentEmployees.click();

    }
    @And("the user write a question in to question field")
    public void theUserWriteAQuestionInToQuestionField() {
        pollTabPage.questionfield.sendKeys(faker.chuckNorris().fact().replaceAll("Chuck Norris", "Kamuran"));
    }
    @And("the user write a answer into answer one field")
    public void theUserWriteAAnswerIntoAnswerOneField() {
        pollTabPage.answer1.sendKeys("Yes");
    }
    @And("the user write a answer into answer two field")
    public void theUserWriteAAnswerIntoAnswerTwoField() {
        pollTabPage.answer2.sendKeys("No");
    }
    @Then("user enters something in the message field")
    public void userEntersSomethingInTheMessageField() {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        pollTabPage.messageField.sendKeys(faker.chuckNorris().fact().replaceAll("Chuck Norris", "Kamuran"));
        Driver.getDriver().switchTo().parentFrame();}

    @Then("the user send to message")
    public void user_send_to_message() {
        pollTabPage.sendButton.click();
    }


    @Then("the user se the message title error message")
    public void theUserSeTheMessageTitleErrorMessage() {
            Assert.assertTrue(pollTabPage.theMessageError.isDisplayed());
        }

    @Then("the user se the att least one recipient error message")
    public void theUserSeTheAttLeastOneRecipientErrorMessage() {
        Assert.assertTrue(pollTabPage.theRecipientErrorMessage.isDisplayed());

    }

    @Then("the user se the questions text error message")
    public void theUserSeTheQuestionsTextErrorMessage() {
        Assert.assertTrue(pollTabPage.questionsErrorMessage.isDisplayed());
    }
}

