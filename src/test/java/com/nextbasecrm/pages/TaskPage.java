package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TaskPage {

    public TaskPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//input[@id='tasks-task-priority-cb']")
    public WebElement highPriority;

    @FindBy(xpath = "//span[.='Task']")
    public WebElement taskButton;

    @FindBy (xpath = "(//div[.=\"marketing1@cybertekschool.com\"])[1]")
    public WebElement addMarketingPeople;

    @FindBy (xpath = "(//div[.=\"helpdesk4@cybertekschool.com\"])[1]")
    public WebElement addHelpDeskPeople;

    @FindBy (xpath = "//a[@id='destDepartmentTab_172023425']")
    public WebElement employeesAndDepartments;

    @FindBy (xpath = "//span[@class='bx-finder-groupbox-content']//a")
    public List<WebElement> selectPersonList;

    @FindBy (xpath = "//span[contains(@data-item-value,'U')]")
    public List<WebElement> addedResponsiblePersonList;


    @FindBy (xpath = "(//input[@class=\"js-id-tdp-mem-sel-is-search js-id-network-selector-search task-form-field-search task-form-field-input\"])[1]")
    public WebElement responsiblePerson;

    @FindBy (xpath = "//span[@class='popup-window-close-icon']")
    public WebElement popUp;

    @FindBy (xpath = "(//a[@class=\"js-id-tdp-mem-sel-is-open-form task-form-field-when-filled task-form-field-link add\"])[1]")
    public WebElement addMore2People;

    @FindBy (xpath = "//div[.=\"hr10@cybertekschool.com\"]")
    public WebElement addPeople1;
    @FindBy (xpath = "//div[.=\"marketing30@cybertekschool.com\"]")
    public WebElement addPeople2;
    @FindBy (xpath = "//div[.=\"helpdesk10@cybertekschool.com\"]")
    public WebElement addPeople3;

    @FindBy (xpath = "//input[@class=\"js-id-checklist-is-form-title task-checklist-field-add\"]")
    public WebElement checkListField;

    @FindBy (xpath = "(//input[@class=\"task-options-inp\"])[2]")
    public WebElement startDate;

    @FindBy (xpath = "(//input[@class=\"task-options-inp\"])[4]")
    public  WebElement finishDate;

    @FindBy (xpath ="(//input[@data-bx-id=\"datepicker-display\"])[1]" )
    public WebElement deadlineButton;

    @FindBy (xpath = "//a[.=\"17\"]")
    public WebElement nov17;

    @FindBy (xpath = "//a[.=\"23\"]")
    public WebElement nov23;
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







}
