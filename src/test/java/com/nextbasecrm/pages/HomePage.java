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


    @FindBy(xpath = "//input[@id='tasks-task-priority-cb']")
    public WebElement highPriority;

    @FindBy(xpath = "//span[.='Task']")
    public WebElement taskButton;



    @FindBy (xpath = "(//a[@class=\"js-id-tdp-mem-sel-is-open-form task-form-field-when-filled task-form-field-link add\"])[1]\n")
    public WebElement addmoreButton;

            @FindBy (xpath = " //div[.=\"helpdesk30@cybertekschool.com\"]\n")
            public WebElement addPeople;

            @FindBy (xpath ="(//input[@data-bx-id=\"datepicker-display\"])[1]" )
            public WebElement deadlineButton;

            @FindBy (xpath = "//a[.=\"17\"]")
            public WebElement nov17;

            @FindBy (xpath = "//span[.=\"Select\"]")
            public WebElement selectButton;

            @FindBy (xpath = "//span[.=\"Time planning\"]")
            public WebElement timePlanningButton;


            @FindBy (xpath = "(//button[@class=\"ui-btn ui-btn-lg ui-btn-primary\"])[1]\n")
            public WebElement sendButton;


            @FindBy (xpath = "//div[@class=\"task-info-panel\"]")
            public WebElement taskPanel;

            @FindBy (xpath = "//*[@id=\"post-buttons-bottom\"]/span[5]")
            public WebElement checkListBtn;

            @FindBy (xpath = "//input[@data-bx-id=\"task-edit-title\"]")
            public WebElement taskTitle;

            @FindBy (id= "bx-component-scope-lifefeed_task_form-responsible")
            public WebElement addMoreBtn;


            @FindBy (xpath = "//button[@id='blog-submit-button-save']")
            public WebElement sendBtn;





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
