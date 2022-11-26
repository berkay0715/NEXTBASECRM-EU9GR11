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

    //span[@data-id='U592']
    @FindBy(xpath = "//body[@style='min-height: 184px;']//span[.='hr2@cybertekschool.com']")
    public WebElement VerifyAddMention;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]//a[.='hr2@cybertekschool.com']")
    public WebElement VerifyMentionedMsg;







    @FindBy(xpath = "//span[@title='Link']")
    public WebElement AddLinkButton;

    @FindBy(xpath = "//span[.='Link']")
    public WebElement VerifyLink;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement LinkTextInputTextBox;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement LinkURLInputTextBox;

    @FindBy(xpath = "//input[@class='adm-btn-save']")
    public WebElement SaveButton;

    //You can change the LinkText based on What did you write as linkText
    @FindBy(xpath = "//a[.='Surprise Link From JavaFaker ']")
    public WebElement VerifyLinkIsAdded;

    //You can change the LinkText based on What did you write as linkText but if you have space after text here you don't put that
    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]//a[.='Surprise Link From JavaFaker']")
    public WebElement VerifyLinkedMsg;







    @FindBy(xpath = "//span[@title='Insert video']")
    public WebElement InsertVideoButton;

    @FindBy(xpath = "//span[.='Video']")
    public WebElement VerifyVideoPage;

    @FindBy(xpath = "//input[@placeholder='YouTube or Vimeo video URL']")
    public WebElement VideoSourceInputBox;

    @FindBy(xpath = "//label[.='Video title:']")
    public WebElement VerifyVideoIsAdded;

    @FindBy(xpath = "//span[@title='Video']")
    public WebElement VerifyVideoIsSaved;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]/iframe")
    public WebElement VerifyVideoIsSentIframe;

    @FindBy(xpath = "//div[@id='player']")
    public WebElement VerifyVideoSent;



    @FindBy(xpath = "(//span[.='Remove link'])[2]")
    public WebElement RemoveSavedLink;


    @FindBy(xpath = "//span[.='Delete video']")
    public WebElement RemoveSavedVideo;





    @FindBy(xpath = "//span[@title='Quote text']")
    public WebElement QuoteTextButton;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement BlockQuote;

    @FindBy(xpath = "(//table[@class='blogquote'])[1]//td") ////table[@class='blogquote']//td[contains(@text,"The mind is like")]
    public WebElement VerifyQuoteIsSent;




    @FindBy(xpath = "//span[@title='Add tag']")
    public WebElement TagButton;

    @FindBy(xpath = "//div[.='Tags:']")
    public WebElement VerifyTagPage;

    @FindBy(xpath = "//input[@name='TAGS_blogPostForm']")
    public WebElement TagInputBox;

    @FindBy(xpath = "//span[.='Add']")
    public WebElement TagAddButton;

    @FindBy(xpath = "//span[.='Stockholm']")
    public WebElement VerifyTagIsAdded;

    @FindBy(xpath = "//a[.='Stockholm']")
    public WebElement VerifyTagIsSent;

}
