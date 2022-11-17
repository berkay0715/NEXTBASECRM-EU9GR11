package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@id='sonet-groups-content-container']//span[.='Join']")
    public List<WebElement> workGroupList;

    @FindBy(className = "tasks-task-mpf-link")
    public WebElement checkList;



    @FindBy(xpath = "//a[@title='Activity Stream']")
    public WebElement activityStreamTab;

    @FindBy(xpath = "//a[@title='Workgroups']")
    public WebElement workGroupsTab;

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

    @FindBy(xpath = "//div[@id='menu-popup-feed-add-post-form-popup']//span[@class='menu-popup-item-text']")
    public List<WebElement> moreTabItems;

    @FindBy(xpath = "(//div[contains(@id,'blog_post_body')])[1]")
    public WebElement firstSentActivity;





    public void joinWorkGroups(){


        workGroupsTab.click();

        for (WebElement each : workGroupList) {
            if (each.isDisplayed()){
                each.click();
            }else {
                activityStreamTab.click();
            }
        }

        activityStreamTab.click();

    }




}
