package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PollTabPage {

    public PollTabPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//a[.='Add more']")
    public WebElement addMoreButton;

    @FindBy(xpath = "//a[.='Employees and departments']")
    public WebElement employeesAndDepartments;
    @FindBy(xpath = "//a[@href='#DR647']")
    public WebElement groupOfContacts;
    @FindBy (xpath = "//a[@rel='DR647']")
    public WebElement allDepartmentAndSubdepartmentEmployees;
    @FindBy(xpath = "//input[@id='question_0']")
    public WebElement questionfield;
    @FindBy(xpath = "//input[@id='answer_0__0_']")
    public WebElement answer1;
    @FindBy(xpath = "//input[@id='answer_0__1_']")
    public WebElement answer2;
    @FindBy(xpath = "//a[.='Add question']")
    public WebElement addQuestion;
    @FindBy(xpath = "//body[@style='min-height: 184px;']")
    public WebElement messageField;
    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;
    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement theMessageError;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement theRecipientErrorMessage;

    @FindBy(xpath = "//span[.='The question text is not specified.']")
    public WebElement questionsErrorMessage;


}
