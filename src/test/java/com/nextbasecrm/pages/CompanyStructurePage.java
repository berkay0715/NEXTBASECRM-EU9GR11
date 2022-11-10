package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompanyStructurePage {
 public CompanyStructurePage(){
     PageFactory.initElements(Driver.getDriver(),this);
 }

 @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeesLink;

@FindBy(xpath = "(//span[@id='pagetitle'])[1]")
    public WebElement companyStructure;

 @FindBy(xpath = "(//span[@id='pagetitle-star'])[1]")
    public WebElement starNexToCompany;



 @FindBy(xpath ="//a[@title='Cyber Vet']")
    public WebElement parentDepartmentTitle;

@FindBy(className = "webform-small-button-text")
    public WebElement addDepartmentButton;

@FindBy(xpath = "//input[@id='NAME']")
    public WebElement departmentNameInput;

@FindBy(className = "popup-window-button-accept")
    public WebElement addButton;

 @FindBy(xpath ="//select[@id='IBLOCK_SECTION_ID']")
    public WebElement parentDepartmentDropdown;




}
