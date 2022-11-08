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

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendAppreciationButton;


}
