package com.nextbasecrm.step_definitions;

import com.github.javafaker.Faker;
import com.nextbasecrm.pages.CompanyStructurePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CompanyStructure_StepDefs {


    LoginPage loginPage=new LoginPage();
    CompanyStructurePage companyStructurePage=new CompanyStructurePage();

    @When("user clicks the employees link")
    public void user_clicks_the_employees_link() {
        companyStructurePage.employeesLink.click();
    }
    @When("user clicks company structure")
    public void user_clicks_company_structure() {
        companyStructurePage.companyStructure.click();
    }
    @Then("user should see star next to company structure")
    public void user_should_see_star_next_to_company_structure() {
        Assert.assertTrue(companyStructurePage.starNexToCompany.isDisplayed());
    }

    @When("user clicks the add department button")
    public void user_clicks_the_add_department_button() {
        companyStructurePage.addDepartmentButton.click();
    }

    @When("user types {string} in the department name")
    public void user_types_in_the_department_name(String string) {

        companyStructurePage.departmentNameInput.sendKeys(string);
        BrowserUtils.waitFor(4);
    }
    @When("user clicks the Add  button")
    public void user_clicks_the_add_button() {
        companyStructurePage.addButton.click();
        BrowserUtils.waitFor(5);

    }
    @Then("user should see default parent department title")
    public void user_should_see_default_parent_department_title() {
        Assert.assertTrue(companyStructurePage.parentDepartmentTitle.isDisplayed());
    }

    @When("user select a parent department from the department dropdown")
    public void user_select_a_parent_department_from_the_department_dropdown() {

        Select select=new Select(companyStructurePage.parentDepartmentDropdown);

        select.selectByIndex(1);

        BrowserUtils.waitFor(5);

    }

    @When("user clicks select from structure")
    public void user_clicks_select_from_structure() {

        BrowserUtils.scrollToElement(companyStructurePage.selectFromStructure);
        companyStructurePage.selectFromStructure.click();
    }

    @When("user clicks the recent box")
    public void user_clicks_the_recent_box() {

        BrowserUtils.scrollToElement(companyStructurePage.RecentBox);
        companyStructurePage.RecentBox.click();

    }
    @When("user clicks a supervisor from recent box")
    public void user_clicks_a_supervisor_from_recent_box() {
        companyStructurePage.supervisorRecent.click();
        BrowserUtils.waitFor(2);
    }
}










