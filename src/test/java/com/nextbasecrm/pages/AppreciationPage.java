package com.nextbasecrm.pages;


import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage {

    public AppreciationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//div[@id='menu-popup-feed-add-post-form-popup']//span[@class='menu-popup-item-text'])[2]")
    public WebElement moreTabAppreciationItem;

    @FindBy(xpath = "//body[contains(@style,'min-height')]")
    public WebElement appreciationMessageTitleInput;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//span[@data-id='UA']//span[.='All employees']")
    public WebElement allEmployeesAsDefaultRecipient;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendAppreciationButton;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement emptyMessageErrorText;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement noRecipientErrorText;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement deleteAllEmployees;



}
