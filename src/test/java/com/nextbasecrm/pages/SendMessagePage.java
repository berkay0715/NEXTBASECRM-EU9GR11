package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMessagePage {

    public SendMessagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageTab;

    @FindBy(xpath = "//span[@class='feed-add-post-micro-title']")
    public WebElement sendMessageTextIsDisplayed;

    @FindBy(xpath = "//div[@class='feed-add-post-text']")
    public WebElement messageBox;


    @FindBy(xpath = "//span[@data-id='UA']")
    public WebElement allEmployeesEmailAddressGroup;

    @FindBy(xpath = "//*[@id='bx-destination-tag']")
    public WebElement addMoreButton;

    @FindBy(xpath = "//*[@id='destLastTab_destination7407872']")
    public WebElement addEmployeesFromRecent;

    @FindBy(xpath = "//*[@id='destDepartmentTab_destination7407872']")
    public WebElement addEmployeesByEmployeesAndDepartment;

    @FindBy(xpath = "//*[@id='destEmailTab_destination7407872']")
    public WebElement addEmployeesByEmailUsers;

    @FindBy(xpath = "//*[@id='blog-submit-button-save']")
    public  WebElement sendButton;

    @FindBy(xpath = "//*[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;









}
