package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageTab;

    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement taskTab;

    @FindBy(id = "feed-add-post-form-tab-calendar")
    public WebElement eventTab;

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollTab;

    @FindBy(id = "feed-add-post-form-link-more")
    public WebElement moreTab;

    @FindBy(id = "//span[contains(@class,'feed-add-post-form-file')]")
    public WebElement moreTabFileItem;

    @FindBy(id = "//span[contains(@class,'feed-add-post-form-grat')]")
    public WebElement moreTabAppreciationItem;

    @FindBy(id = "//span[contains(@class,'feed-add-post-form-important')]")
    public WebElement moreTabAnnouncementItem;

    @FindBy(id = "//span[contains(@class,'feed-add-post-form-lists')]")
    public WebElement moreTabWorkflowItem;



}
