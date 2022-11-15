package com.nextbasecrm.pages;


import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AppreciationPage {

    public AppreciationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "//div[@id='feed-add-post-grat-container']")
    public WebElement gratIconRecipientInput;

    @FindBy(id = "//div[@class='feed-add-grat-list']/div/span")
    public List<WebElement> gratIconList;


    @FindBy(id = "//span[contains(@class,'feed-add-grat-box')]")
    public WebElement selectGratIcon;

    @FindBy(xpath = "//input[@id='feed-add-post-destination-input']")
    public WebElement appreciationRecipientsInputBox;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement popupWindowCloseIcon;

    @FindBy(xpath = "//div[@id='bx-lm-box-email-content']//a")
    public List<WebElement> recipientsListFromEmailUsers;

    @FindBy(linkText = "E-mail users")
    public WebElement emailUsersRecipientstab;

    @FindBy(xpath = "//div[@id='bx-lm-category-relation-129']//a")
    public List<WebElement> recipientsListFromEmployeesAndDeps;

    @FindBy(linkText = "Employees and departments")
    public WebElement employeesAndDepsRecipientsTab;

    @FindBy(xpath = "//div[@id='bx-lm-box-group-content']//a")
    public List<WebElement> recipientsListFromMyGroups;

    @FindBy(linkText = "My Groups")
    public WebElement myGroupsRecipientstab;

    @FindBy(xpath = "//span[@class='bx-finder-groupbox-content']//a")
    public List<WebElement> recipientsListForAppreciation;

    @FindBy(id = "bx-destination-tag")
    public WebElement addPersonsGroupsDepartment;

    @FindBy(xpath = "(//div[@id='menu-popup-feed-add-post-form-popup']//span[@class='menu-popup-item-text'])[2]")
    public WebElement moreTabAppreciationItem;

    @FindBy(xpath = "//body[contains(@style,'min-height')]")
    public WebElement appreciationMessageTitleInput;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//span[@data-id='UA']//span[.='All employees']")
    public WebElement allEmployeesAsDefaultRecipient;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement emptyMessageErrorText;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement noRecipientErrorText;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement deleteAllEmployees;



}
