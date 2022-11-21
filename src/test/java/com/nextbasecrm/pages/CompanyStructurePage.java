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


  @FindBy(xpath = "(//span[.='Add department'])[1]")
    public WebElement addDepartmentButton;

   @FindBy(xpath = "//input[@id='NAME']")
    public WebElement departmentNameInput;

   @FindBy(xpath = "//span[.='Add']")
    public WebElement addButton;

   @FindBy(xpath ="//select[@id='IBLOCK_SECTION_ID']")
    public WebElement parentDepartmentDropdown;

    @FindBy(xpath ="//span[@id='bx_str_154']")
    public WebElement newDepartmentIsDisplayed;


   @FindBy(linkText ="Select from structure")
    public WebElement selectFromStructure;


   @FindBy(xpath ="//span[.='Recent']")
    public WebElement recentBox;

 @FindBy(xpath = "(//*[contains(@id,'last_employee')])[1]")
 public WebElement recentSupervisor1;

 @FindBy(xpath = "//span[@id='uf_head_name']")
 public WebElement supervisorFullName;


    @FindBy(xpath ="(//span[@class='finder-box-tab-text']/..)[2]")
    public WebElement companyBox;

    @FindBy(xpath ="//*[contains(@id,'Single_')]//div[@class='company-department-text']")
    public WebElement companySupervisor1a_QA;

    @FindBy(xpath = "(//div[.='Untitled'])[1]")
    public WebElement companySupervisor1;

    @FindBy(xpath = "//span[.='Search']")
    public WebElement searchBox;


    @FindBy(xpath = "//input[contains(@id,'user_input')]")
    public WebElement searchSupervisorInput;

 @FindBy(xpath = "//div[.='Guljannat']")
    public WebElement searchSupervisorGuljannat;









    @FindBy(xpath = "//span[.='Close']")
    public WebElement closeButton;

    @FindBy(xpath ="//a[.='New department']")
    public WebElement newDepartment;


    @FindBy(xpath ="(//div[@title='Edit department'])[1]")
    public WebElement editDepartment;

     @FindBy(xpath ="//input[@id='NAME']")
    public WebElement editDepartmentInput;



     @FindBy(xpath ="//span[.='Save']")
    public WebElement editSaveButton;

    @FindBy(xpath ="(//div[@title='Add child department'])[1]")
    public WebElement addChildDepartment;

 @FindBy(xpath = "//input[@id='NAME']")
 public WebElement childDepartmentNameInput;




    @FindBy(xpath = "//a[@title='Qa1']//div[@data-role='department_delete']")
    public WebElement deleteChildDepartment;


    @FindBy(xpath = "//a[.='A_DEPARTMENT']")
    public WebElement A_DepartmentDragAndDrop;

@FindBy(xpath = "//a[.='B_DEPARTMENT']")
    public WebElement B_DepartmentDragAndDrop;


@FindBy(xpath = "//span[@id='bx_str_129']")
    public WebElement a_QA_DepartmentDropBack;














}
