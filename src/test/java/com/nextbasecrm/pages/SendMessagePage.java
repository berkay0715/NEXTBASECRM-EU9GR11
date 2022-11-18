package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMessagePage {

    public SendMessagePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='feed-add-post-micro-title']")
    public WebElement sendMessageInputBox;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//body[@style='min-height: 184px;']")
    public WebElement writeMessageBox;

    @FindBy(xpath = "//*[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;


}


