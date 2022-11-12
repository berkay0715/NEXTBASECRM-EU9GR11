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
//(//table[@class='diskuf-selector-table wd-fa-add-file-light-table']//div[@class='diskuf-uploader'])[1]
//
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







}
