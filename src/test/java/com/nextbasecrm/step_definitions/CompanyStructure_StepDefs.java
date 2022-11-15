package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.CompanyStructurePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CompanyStructure_StepDefs {

    LoginPage loginPage = new LoginPage();
    CompanyStructurePage companyStructurePage = new CompanyStructurePage();

    // TC1

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


    // TC2
    @When("user clicks the add department button")
    public void user_clicks_the_add_department_button() {
        companyStructurePage.addDepartmentButton.click();
    }

    @When("user fills the department name")
    public void user_fills_the_department_name() {
companyStructurePage.departmentNameInput.sendKeys("New department");
    }
    @When("user clicks the Add  button")
    public void user_clicks_the_add_button() {
        companyStructurePage.addButton.click();
        BrowserUtils.waitFor(5);

    }

    @Then("user should be able to add a department")
    public void user_should_be_able_to_add_a_department() {
Assert.assertTrue(companyStructurePage.newDepartment.isDisplayed());
    }


    // TC3
    @When("user clicks parent department dropdown")
    public void user_clicks_parent_department_dropdown() {
        companyStructurePage.parentDepartmentDropdown.click();
    }
    @Then("user should be able to select a parent department")
    public void user_should_be_able_to_select_a_parent_department() {

        Select selectParentDrop = new Select(companyStructurePage.parentDepartmentDropdown);

        for (WebElement option : selectParentDrop.getOptions()) {

            option.getText();
        }
           selectParentDrop.selectByVisibleText(" . New head office");

        System.out.println(selectParentDrop.getFirstSelectedOption().getText());


        Assert.assertTrue(selectParentDrop.getFirstSelectedOption().isSelected());
    }



    // TC4
    @When("user clicks select from structure")
    public void user_clicks_select_from_structure() {
      companyStructurePage.selectFromStructure.click();
    }
    @When("user clicks the recent box")
    public void user_clicks_the_recent_box() {

      companyStructurePage.recentBox.click();
    }
    @Then("user should be able to select a supervisor from recent box")
    public void user_should_be_able_to_select_a_supervisor_from_recent_box() {
        BrowserUtils.clickWithJS(companyStructurePage.recentSupervisor1);
        BrowserUtils.waitForVisibility(companyStructurePage.supervisorFullName,10);

        Assert.assertTrue(companyStructurePage.supervisorFullName.isDisplayed());
    }
    @Then("user clicks the company box")
    public void user_clicks_the_company_box() {
      companyStructurePage.selectFromStructure.click();
      companyStructurePage.companyBox.click();
    }
    @Then("user should be able to select a supervisor from company box")
    public void user_should_be_able_to_select_a_supervisor_from_company_box() {

        BrowserUtils.clickWithJS(companyStructurePage.supervisorCompany);
        Assert.assertTrue(companyStructurePage.supervisorFullName.isDisplayed());

    }
    @Then("user clicks the search box")
    public void user_clicks_the_search_box() {
       companyStructurePage.selectFromStructure.click();
       companyStructurePage.searchBox.click();
    }
    @Then("user should be able to select a supervisor from search box")
    public void user_should_be_able_to_select_a_supervisor_from_search_box() {
        companyStructurePage.searchInput.sendKeys("Guljannat");
        companyStructurePage.GuljannatSearch.click();
        Assert.assertTrue(companyStructurePage.GuljannatSearch.isDisplayed());
    }



    // TC5

    @Then("user should be able to click to close at any time")
    public void user_should_be_able_to_click_to_close_at_any_time() {

        companyStructurePage.closeButton.click();
        companyStructurePage.employeeTab.click();
        BrowserUtils.waitFor(3);
        BrowserUtils.verifyElementNotDisplayed(By.xpath("//span[.='Close']"));

    }








    }






