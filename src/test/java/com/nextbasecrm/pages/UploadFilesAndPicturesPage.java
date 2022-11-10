package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFilesAndPicturesPage {

    public UploadFilesAndPicturesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[text()='Message']")
    public WebElement messageButton;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesIcon;

    @FindBy(xpath = "(//table[@class='diskuf-selector-table wd-fa-add-file-light-table']/tbody/tr/td)[1]")
    public WebElement uploadFilesANDimagesLink;






}
