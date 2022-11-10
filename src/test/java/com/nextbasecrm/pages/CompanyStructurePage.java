package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class CompanyStructurePage {
 public CompanyStructurePage(){
     PageFactory.initElements(Driver.getDriver(),this);
 }
}
