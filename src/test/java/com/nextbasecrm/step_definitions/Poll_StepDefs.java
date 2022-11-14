package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.HomePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.PollTabPage;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Poll_StepDefs {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    PollTabPage pollTabPage=new PollTabPage();


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
    @Then("the user select the groupf of the all department and subdepartment employees")
    public void the_user_select_the_groupf_of_the_all_department_and_subdepartment_employees() {
     pollTabPage.allDepartmentAndSubdepartmentEmployees.click();

    }
}
