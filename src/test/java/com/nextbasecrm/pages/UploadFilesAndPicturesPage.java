package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilesAndPicturesPage {

    public UploadFilesAndPicturesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesIcon;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFilesANDimagesLink;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    @FindBy(xpath = "//span[@class='insert-btn']")
    public WebElement insertInTextBtn;

    @FindBy(xpath = "//input[@name='BLOG_POST_DISK_ATTACHED_OBJECT_ALLOW_EDIT']")
    public WebElement allowRecipientToEditCheckbox;

    @FindBy(xpath = "//a[@class='feed-con-file-changes-link']")
    public WebElement editButton;

    @FindBy()
    public WebElement iframe;

    @FindBy(xpath = "//span[@class='insert-btn-text']")
    public WebElement inText;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement delButtonForFileInText;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement delButton;

    @FindBy(xpath = "//div[contains(@id,'disk-attach-block-')]")
    public WebElement sentMultipleDifferentFiles;

    @FindBy(xpath = "//img[contains(@id,'disk-attach-image')]")
    public WebElement sentImage;

    @FindBy(xpath = "//span[@class='files-name-edit-btn']")
    public WebElement renameButton;


    @FindBy(xpath = "//input[@class='files-name-edit-inp']")
    public WebElement changeableFileName;








}
