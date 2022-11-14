package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.CompanyStructurePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CompanyStructure_StepDefs {

    LoginPage loginPage = new LoginPage();
    CompanyStructurePage companyStructurePage = new CompanyStructurePage();


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

        Select select = new Select(companyStructurePage.parentDepartmentDropdown);

        select.selectByIndex(1);

        BrowserUtils.waitFor(5);

    }


    @When("user clicks select from structure")
    public void user_clicks_select_from_structure() {
        BrowserUtils.waitFor(5);

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", companyStructurePage.selectFromStructure);


    }

    @When("user clicks the recent box")
    public void user_clicks_the_recent_box() {

        BrowserUtils.clickWithJS(companyStructurePage.RecentBox);


    }

    @When("user clicks a supervisor from recent box")
    public void user_clicks_a_supervisor_from_recent_box() {

        BrowserUtils.clickWithJS(companyStructurePage.supervisorRecent);
        BrowserUtils.waitFor(3);


    }


    @Then("user should be able to see structure department head delete cross")
    public void user_should_be_able_to_see_structure_department_head_delete_cross() {
        Assert.assertTrue(companyStructurePage.structureDepartmentHeadCrossDelete.isDisplayed());
    }

    @When("user clicks the company box")
    public void user_clicks_the_company_box() {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(companyStructurePage.companyBox);

    }

    @When("user clicks the Cyber Vet")
    public void user_clicks_the_cyber_vet() {
        BrowserUtils.clickWithJS(companyStructurePage.cyberVet);


    }

    @When("user clicks a supervisor from company box")
    public void user_clicks_a_supervisor_from_company_box() {

        BrowserUtils.scrollToElement(companyStructurePage.supervisorCompany);
        companyStructurePage.supervisorCompany.click();
        BrowserUtils.waitFor(3);

    }

    @When("user clicks the search box")
    public void user_clicks_the_search_box() {
        BrowserUtils.clickWithJS(companyStructurePage.searchBox);
    }

    @When("user types in the search input {string}")
    public void user_types_in_the_search_input(String string) {

        companyStructurePage.searchInput.sendKeys(string);
    }

    @When("user clicks the Guljannat")
    public void user_clicks_the_guljannat() {
        BrowserUtils.clickWithJS(companyStructurePage.GuljannatSearch);
        BrowserUtils.waitFor(5);
    }


    @When("user clicks the close department pop up")
    public void user_clicks_the_close_department_pop_up() {
        companyStructurePage.closeAddDepartmentPopUp.click();
    }
    @Then("user should be able to see add department button")
    public void user_should_be_able_to_see_add_department_button() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(companyStructurePage.addDepartmentButton.isDisplayed());
    }



    @When("user clicks the edit department icon")
    public void user_clicks_the_edit_department_icon() {
        BrowserUtils.clickWithJS(companyStructurePage.editDepartment);
    }


    @When("user delete the old department name")
    public void user_delete_the_old_department_name() {
       companyStructurePage.departmentNameInput.clear();
    }

    @When("user clicks save button")
    public void user_clicks_save_button() {
      companyStructurePage.saveButton.click();
    }
    @When("user clicks add child departments")
    public void user_clicks_add_child_departments() {
       companyStructurePage.addChildDepartment.click();
    }
    @When("user clicks the delete departments")
    public void user_clicks_the_delete_departments() {
       for (WebElement delete : companyStructurePage.deleteDepartment) {

         JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
         js.executeScript("arguments[0].click();", delete);

        Alert alert =Driver.getDriver().switchTo().alert();
           alert.accept();


           BrowserUtils.sleep(10);



       }







    }


}




