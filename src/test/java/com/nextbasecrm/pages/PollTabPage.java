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

}
