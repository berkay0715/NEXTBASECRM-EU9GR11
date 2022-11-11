package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ConversationsPage {

    public ConversationsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
