package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Filter_Search_Page {
    public Filter_Search_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy(xpath = "//input[@id='LIVEFEED_search']")
    public WebElement filterSearchInbox;

    @FindBy(xpath = "(//span[@class='main-ui-filter-sidebar-item-text'])[1]")
    public WebElement workFilter;

    @FindBy(xpath = "(//span[@class='main-ui-filter-sidebar-item-text'])[2]")
    public WebElement favoritesFilter;

    @FindBy(xpath = "(//span[@class='main-ui-filter-sidebar-item-text'])[4]")
    public WebElement myActivityFilter;

    @FindBy(xpath = "(//span[@class='main-ui-filter-sidebar-item-text'])[5]")
    public WebElement announcementFilter;

    @FindBy(xpath = "(//span[@class='main-ui-filter-sidebar-item-text'])[6]")
    public WebElement workFlowsFilter;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-add-item']")
    public WebElement addFieldLink;

    @FindBy(xpath = "(//div[@class='main-ui-select-inner-label'])[5]")
    public WebElement favoritesFilterCheckBox;

    @FindBy(xpath = "(//div[@class='main-ui-select-inner-label'])[6]")
    public WebElement tagFilterCheckBox;

    @FindBy(xpath = "//h5[.='Filters']")
    public WebElement filterTitle;

    @FindBy(xpath = "//span[@title='Favorites']")
    public WebElement favoritesTitle;

    @FindBy(xpath = "//span[@title='Tag']")
    public WebElement tagTitle;

    @FindBy(xpath = "//span[@class='main-ui-filter-field-restore-items']")
    public WebElement restoreDefaultFields;

    @FindBy(xpath = "//span[@title='Date']")
    public WebElement dateTitle;

    @FindBy(xpath = "//span[@title='Type']")
    public WebElement typeTitle;

    @FindBy(xpath = "//span[@title='Author']")
    public WebElement authorTitle;

    @FindBy(xpath = "//span[@title='To']")
    public WebElement toTitle;

    @FindBy(xpath = "//div[@data-name='DATE_CREATE_datesel']")
    public WebElement anyDateInbox;

    @FindBy(xpath = "(//div[.='Yesterday']/div)[1]")
    public WebElement yesterdayDateType;

    @FindBy(xpath = "//button[@class='ui-btn ui-btn-primary ui-btn-icon-search main-ui-filter-field-button main-ui-filter-find']")
    public WebElement searchButton;

    @FindBy(xpath = "//div[.='Date: Yesterday']")
    public WebElement yesterdayDateTypeVerifying;


    @FindBy(xpath = "(//div[@data-name='EVENT_ID'])[2]")
    public WebElement typeInbox;

    @FindBy(xpath = "//div[@class='main-ui-select-inner-label']")
    public List<WebElement> typeDropBoxElements;

    @FindBy(xpath = "//button[@class='ui-btn ui-btn-primary ui-btn-icon-search main-ui-filter-field-button  main-ui-filter-find']")
    public WebElement typeSearchButton;

    @FindBy(xpath = "//div[@class='main-ui-square-item']")
    public WebElement filterResult;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-light-border main-ui-filter-field-button main-ui-filter-reset']")
    public WebElement typeResetButton;

    @FindBy(xpath = "//span[@class='main-ui-filter-add-item']")
    public WebElement saveFilterLink;

    @FindBy(xpath = "//input[@class='main-ui-filter-sidebar-edit-control']")
    public WebElement newFilterLinkBox;

    @FindBy(xpath = "(//span[@class='main-ui-filter-sidebar-item-text'])[8]")
    public WebElement newFilterLink;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-success main-ui-filter-field-button main-ui-filter-save']")
    public WebElement saveButton;

    @FindBy(xpath = "//span[@class='ui-btn ui-btn-light-border main-ui-filter-field-button main-ui-filter-reset']")
    public WebElement resetButton;

    @FindBy(xpath = "//span[@title='Configure filter']")
    public WebElement configureButton;

    @FindBy(xpath = "(//span[@title='Delete filter'])[8]")
    public WebElement deleteButton;





}
