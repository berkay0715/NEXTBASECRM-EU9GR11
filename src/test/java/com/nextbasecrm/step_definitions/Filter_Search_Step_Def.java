package com.nextbasecrm.step_definitions;


import com.github.javafaker.Faker;
import com.nextbasecrm.pages.Filter_Search_Page;
import com.nextbasecrm.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.est.LimitedSource;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Filter_Search_Step_Def {
    Filter_Search_Page filterSearchPage = new Filter_Search_Page();
    Faker faker = new Faker();

    @When("user clicks to the -Filter and search- box")
    public void user_clicks_to_the_filter_and_search_box() {
        filterSearchPage.filterSearchInbox.click();
        BrowserUtils.waitFor(1);
    }
    @Then("user should see the default filters")
    public void user_should_see_the_default_filters() {
        Assert.assertTrue(filterSearchPage.workFilter.isEnabled());
        BrowserUtils.waitFor(1);
        Assert.assertTrue(filterSearchPage.favoritesFilter.isEnabled());
        BrowserUtils.waitFor(1);
        Assert.assertTrue(filterSearchPage.myActivityFilter.isEnabled());
        BrowserUtils.waitFor(1);
        Assert.assertTrue(filterSearchPage.announcementFilter.isEnabled());
        BrowserUtils.waitFor(1);
        Assert.assertTrue(filterSearchPage.workFlowsFilter.isEnabled());
    }

    @When("user clicks the add field link and clicks the check box")
    public void user_clicks_the_add_field_link_and_clicks_the_check_box() {
        filterSearchPage.filterSearchInbox.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.addFieldLink.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.favoritesFilterCheckBox.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.tagFilterCheckBox.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.filterTitle.click();
        BrowserUtils.waitFor(1);
    }
    @Then("user should see the fields added")
    public void user_should_see_the_fields_added() {
        Assert.assertTrue(filterSearchPage.favoritesTitle.isEnabled());
        BrowserUtils.waitFor(1);
        Assert.assertTrue(filterSearchPage.tagTitle.isEnabled());
        BrowserUtils.waitFor(1);
    }
    @When("user clicks the restore default fields link")
    public void user_clicks_the_restore_default_fields_link() {
        filterSearchPage.restoreDefaultFields.click();
        BrowserUtils.waitFor(1);
    }
    @Then("user should see the added fields are removed")
    public void user_should_see_the_added_fields_are_removed() {
        Assert.assertTrue(filterSearchPage.dateTitle.isEnabled());
        BrowserUtils.waitFor(1);
        Assert.assertTrue(filterSearchPage.typeTitle.isEnabled());
        BrowserUtils.waitFor(1);
        Assert.assertTrue(filterSearchPage.authorTitle.isEnabled());
        BrowserUtils.waitFor(1);
        Assert.assertTrue(filterSearchPage.toTitle.isEnabled());
        BrowserUtils.waitFor(1);
    }

    @And("user clicks the any date in the date  drop inbox")
    public void user_clicks_the_any_date_in_the_date_drop_inbox() {
        filterSearchPage.restoreDefaultFields.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.anyDateInbox.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.yesterdayDateType.click();
        BrowserUtils.waitFor(1);
    }
    @And("user clicks the search button")
    public void user_clicks_the_search_button() {
        filterSearchPage.searchButton.click();
        BrowserUtils.waitFor(1);
    }
    @Then("user should see the date type in the -Filter and search- box")
    public void user_should_see_the_date_type_in_the_filter_and_search_box() {
        Assert.assertTrue(filterSearchPage.yesterdayDateTypeVerifying.isDisplayed());
        BrowserUtils.waitFor(1);
    }

    @When("user clicks any types in the type drop inbox and clicks the search button")
    public void user_clicks_any_types_in_the_type_drop_inbox_and_clicks_the_search_button() {
        filterSearchPage.typeInbox.click();
        int numberBetween = faker.number().numberBetween(1,13);
        List<WebElement> list = filterSearchPage.typeDropBoxElements;
        for (int i = numberBetween; i <numberBetween+1 ; i++) {
            WebElement element = list.get(i);
            element.click();
            BrowserUtils.waitFor(1);
            Assert.assertTrue(element.isDisplayed());
            break;
        }
        filterSearchPage.filterTitle.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.typeSearchButton.click();
        BrowserUtils.waitFor(1);
    }

    @Then("user should see the selected type in the -Filter and search- box")
    public void user_should_see_the_selected_type_in_the_filter_and_search_box() {
        Assert.assertTrue(filterSearchPage.filterResult.isDisplayed());
        BrowserUtils.waitFor(1);
        filterSearchPage.filterResult.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.typeResetButton.click();
    }

    @And("user clicks the multiple types in the type drop inbox and clicks the search button")
    public void user_clicks_the_multiple_types_in_the_type_drop_inbox_and_clicks_the_search_button() {
        filterSearchPage.typeInbox.click();
        for (WebElement webElement : filterSearchPage.typeDropBoxElements) {
            webElement.click();
            BrowserUtils.waitFor(1);
            Assert.assertTrue(webElement.isDisplayed());
        }
        filterSearchPage.filterTitle.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.typeSearchButton.click();
        BrowserUtils.waitFor(1);
    }
    @Then("user should see the selected multiple types in the -Filter and search- box")
    public void user_should_see_the_selected_multiple_types_in_the_filter_and_search_box() {
        Assert.assertTrue(filterSearchPage.filterResult.isDisplayed());
        BrowserUtils.waitFor(1);
        filterSearchPage.filterResult.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.typeResetButton.click();

    }

    @And("user clicks the -save filter link- and names the -new filter-")
    public void userClicksTheSaveFilterLinkAndNamesTheNewFilter() {
        filterSearchPage.saveFilterLink.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.newFilterLinkBox.sendKeys("SDET_FILTER");
        BrowserUtils.waitFor(1);
    }

    @And("user clicks the -save button-")
    public void userClicksTheSaveButton() {
        filterSearchPage.saveButton.click();
        BrowserUtils.waitFor(1);
    }

    @Then("user should see the new filter type under the default filters")
    public void userShouldSeeTheNewFilterTypeUnderTheDefaultFilters() {
        Assert.assertTrue(filterSearchPage.newFilterLink.isDisplayed());
        BrowserUtils.waitFor(1);
        filterSearchPage.configureButton.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.deleteButton.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.saveButton.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.resetButton.click();
        BrowserUtils.waitFor(1);
    }

    @When("user clicks the -restore default fields link- after adding new fields")
    public void user_clicks_the_restore_default_fields_link_after_adding_new_fields() {
        filterSearchPage.addFieldLink.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.favoritesFilterCheckBox.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.filterTitle.click();
        BrowserUtils.waitFor(1);
        filterSearchPage.restoreDefaultFields.click();
        BrowserUtils.waitFor(1);
    }

    @Then("user should see the default type fields")
    public void user_should_see_the_default_type_fields() {
        Assert.assertTrue(filterSearchPage.dateTitle.isEnabled());
        BrowserUtils.waitFor(1);
        Assert.assertTrue(filterSearchPage.typeTitle.isEnabled());
        BrowserUtils.waitFor(1);
        Assert.assertTrue(filterSearchPage.authorTitle.isEnabled());
        BrowserUtils.waitFor(1);
        Assert.assertTrue(filterSearchPage.toTitle.isEnabled());
        BrowserUtils.waitFor(1);
    }

}
