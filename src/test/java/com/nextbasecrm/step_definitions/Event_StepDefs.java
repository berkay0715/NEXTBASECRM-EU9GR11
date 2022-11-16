package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.EventPage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

public class Event_StepDefs {

    LoginPage loginPage = new LoginPage();
    EventPage eventPage = new EventPage();

    Actions actions = new Actions(Driver.getDriver());



    @When("user clicks to the event box")
    public void user_clicks_to_the_event_box() {
        eventPage.eventButton.click();
    }

    @Then("user should enter a event name {string}")
    public void user_should_enter_a_event_name(String string) {
        eventPage.eventNameInput.sendKeys(string);
    }

    @Then("user should start a event")
    public void user_should_start_a_event() {
        eventPage.eventStartDate.click();

    }

    @Then("user should end the event")
    public void user_should_end_the_event() {
        eventPage.eventEndDate.click();
    }

    @Then("user should select All day")
    public void user_should_select_all_day() {
        eventPage.allDayCheckBox.click();
        System.out.println("eventPage.allDayCheckBox.isSelected() = " + eventPage.allDayCheckBox.isSelected());
        eventPage.allDayCheckBox.click();
    }

    @And("user should select Time Zone")
    public void user_should_select_time_zone() {
        eventPage.specifyTimeZone.click();
        eventPage.timeZoneStartDropDown.click();
        Select startTimeZone = new Select(eventPage.timeZoneStartDropDown);
        startTimeZone.selectByVisibleText("(UTC +01:00) Europe/Stockholm");
    }
    @Then("user should be able send event")
    public void user_should_be_able_send_event() {
        eventPage.sendButton.click();
    }
    @Then("user should be able to set a reminder")
    public void user_should_be_able_to_set_a_reminder() {
        if (eventPage.setReminderCheckBox.isSelected()){
        System.out.println("eventPage.setReminderCheckBox.isSelected() = " + eventPage.setReminderCheckBox.isSelected());
    } else if (!eventPage.setReminderCheckBox.isSelected()) {
            eventPage.setReminderCheckBox.click();

        }
    }
    @Then("user should be able to select event location")
    public void user_should_be_able_to_select_event_location() {
    eventPage.eventLocation.click();
    }

    @Then("user should be able to select individuals, groups and departments")
    public void user_should_be_able_to_select_individuals_groups_and_departments() {
        eventPage.addPeopleAndGroups.click();
        eventPage.membersInputBox.sendKeys("hr30@cybertekschool.com");


    }







    /*
    eventPage.eventEndDate.click();
    eventPage.eventEndDate.sendKeys("");
    eventPage.eventEndDate.sendKeys(string);
    eventPage.eventEndTime.click();
    eventPage.eventEndHour.sendKeys("00");
    eventPage.eventEndMin.sendKeys("00");

     eventPage.eventEndTime.click();
        eventPage.eventEndHour.sendKeys("00");
        eventPage.eventEndMin.sendKeys("00");
     */
    /*
    START
     eventPage.eventStartDate.click();
        eventPage.eventStartDate.clear();
        eventPage.eventStartDate.sendKeys(string);
        eventPage.eventStartDate.click();
        eventPage.eventStartTime.click();
        eventPage.eventStartHour.clear();
        eventPage.eventStartHour.sendKeys("0");
        eventPage.eventStartMin.click();
        eventPage.eventStartMin.sendKeys("0");
        eventPage.switchToAM.click();
        eventPage.setTimeButton.click();
     */
    /*
    END
     eventPage.eventEndDate.click();
        actions.moveToElement(eventPage.eventEndDate).click().sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_LEFT).
                sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).
                sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).
                sendKeys(string).moveToElement(eventPage.eventEndTime).click().moveToElement(eventPage.eventEndHour).sendKeys("00").
                moveToElement(eventPage.eventEndMin).sendKeys("00").perform();
        eventPage.eventEndDate.click();

        eventPage.eventEndTime.click();
        eventPage.eventEndHour.click();
        eventPage.eventEndHour.sendKeys("00");
        eventPage.eventEndMin.click();
        eventPage.eventEndMin.sendKeys("00");
     */
    /*
    Time Zone
     eventPage.specifyTimeZone.click();
        eventPage.timeZoneStartDropDown.click();
        Select startTimeZone = new Select(eventPage.timeZoneStartDropDown);
        startTimeZone.selectByVisibleText("(UTC +01:00) Europe/Stockholm");
     */



}
