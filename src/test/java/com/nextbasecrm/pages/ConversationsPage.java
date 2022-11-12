package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConversationsPage {

    public ConversationsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement MessageTab;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement SendButton;


    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement InputTextBox;

    @FindBy(xpath = "//body[@style='min-height: 184px;']")
    public WebElement TextInputTextBox;

    @FindBy(xpath = "//span[@id='bx-b-mention-blogPostForm']")
    public WebElement MentionButton;


    @FindBy(xpath = "//a[contains(@id, \"destDepartmentTab_mention\")]")
    public WebElement EmpAndDepButton;

    @FindBy(xpath = "//div[contains(@class, \"bx-finder-box-tab-content bx-lm-box-tab-content-d\")]")
    public WebElement VerifyListOfEmp;

    @FindBy(xpath = "(//div[@class='bx-finder-company-department-employee-name'])[1]")
    public WebElement MailOfEmp;

    @FindBy(xpath = "//span[@data-id='U522']")
    public WebElement VerifyAddMention;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]//a[.='helpdesk32@cybertekschool.com']")
    public WebElement VerifyMentionedMsg;

}
