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


   @FindBy(linkText ="Select from structure")
    public WebElement selectFromStructure;


   @FindBy(xpath ="//span[.='Recent']")
    public WebElement recentBox;

 @FindBy(xpath = "//*[contains(@id,'last_employee')]")
 public WebElement recentSupervisor1;

 @FindBy(xpath = "//span[@id='uf_head_name']")
 public WebElement supervisorFullName;


    @FindBy(xpath ="(//span[@class='finder-box-tab-text']/..)[2]")
    public WebElement companyBox;


  @FindBy(xpath ="(//div[@class='company-department-employee-name']/../..)[4]")
    public WebElement supervisorCompany;


  @FindBy(xpath ="(//span[@class='finder-box-tab-text']/..)[3]")
    public WebElement searchBox;


   @FindBy(xpath ="//input[@class='finder-box-search-textbox']")
    public WebElement searchInput;



    //@FindBy(xpath ="//div[@bx-tooltip-user-id='481']/..")
    @FindBy(xpath ="(//div[@class='finder-box-item']//div[@bx-tooltip-user-id='481'])[2]")
    public WebElement GuljannatSearch;



    @FindBy(xpath = "//a[@title='Employees']")
    public WebElement employeeTab;

    @FindBy(xpath = "//span[.='Close']")
    public WebElement closeButton;

    @FindBy(xpath ="//a[.='New department']")
    public WebElement newDepartment;

    @FindBy(xpath ="(//div[@title='Edit department'])[1]")
    public WebElement editDepartment;

     @FindBy(xpath ="//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement saveButton;



    @FindBy(xpath ="(//div[@title='Add child department'])[1]")
    public WebElement addChildDepartment;


    @FindBy(xpath ="(//div[@title='Delete department'])[1]")
    public WebElement deleteDepartment;










}
