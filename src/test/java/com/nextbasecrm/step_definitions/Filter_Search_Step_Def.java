package com.nextbasecrm.step_definitions;


import com.nextbasecrm.pages.Filter_Search_Page;
import com.nextbasecrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Filter_Search_Step_Def {
    Filter_Search_Page filterSearchPage = new Filter_Search_Page();

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

}
