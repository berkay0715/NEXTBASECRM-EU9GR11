package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventPage {
    public EventPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//span[.='Event'])[1]" )
    public WebElement eventButton;

    @FindBy(xpath = "//input[@placeholder='Event name']")
    public WebElement eventNameInput;

    @FindBy(xpath = "//input[@name='DATE_FROM']")
    public WebElement eventStartDate;

    @FindBy(xpath = "//input[@name='TIME_FROM_']")
    public WebElement eventStartTime;

    @FindBy(xpath = "//input[@title='Hours']")
    public WebElement eventStartHour;

    @FindBy(xpath = "//input[@title='Minutes']")
    public WebElement eventStartMin;

    @FindBy(xpath = "(//input[@title='Hours'])[2]")
    public WebElement eventEndHour;

    @FindBy(xpath = "(//input[@title='Minutes'])[2]")
    public WebElement eventEndMin;

    @FindBy(xpath = "//input[@value='Set Time']")
    public WebElement setTimeButton;

    @FindBy(xpath = "//input[@name='DATE_TO']")
    public WebElement eventEndDate;

    @FindBy(xpath = "//span[.='pm']")
    public WebElement switchToAM;

    @FindBy(xpath ="//span[.='am']" )
    public WebElement switchToPM;

    @FindBy(xpath = "//input[@name='TIME_TO'] ")
    public WebElement eventEndTime;

    @FindBy(xpath ="//input[@name='EVENT_FULL_DAY']" )
    public WebElement allDayCheckBox;

    @FindBy(xpath = "//span[.='Specify time zone']")
    public WebElement specifyTimeZone;

    @FindBy(xpath = "//select[@name='TZ_FROM']")
    public WebElement timeZoneStartDropDown;

    @FindBy(xpath = "(//button[@class='ui-btn ui-btn-lg ui-btn-primary'])[1]")
    public WebElement sendButton;

    @FindBy(xpath = "//input[@name='EVENT_REMIND']")
    public WebElement setReminderCheckBox;

    @FindBy(xpath ="//input[@name='EVENT_LOCATION']" )
    public WebElement eventLocation;

}
