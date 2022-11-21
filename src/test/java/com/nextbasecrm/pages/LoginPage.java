package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(linkText = "Login")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@placeholder='Login']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@name='USER_PASSWORD']")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkbox;

    @FindBy(xpath = "//a[@class='login-link-forgot-pass']")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//div[.='Incorrect login or password']")
    public WebElement errorMessage;


    public void loginAs(String loginType){
        String username ="";
        String password ="";

        switch(loginType){
            case "Helpdesk":
                username = ConfigurationReader.getProperty("helpdesk_username");
                password = ConfigurationReader.getProperty("helpdesk_password");
                break;
            case "Human Resource":
                username = ConfigurationReader.getProperty("hr_username");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "Marketing":
                username = ConfigurationReader.getProperty("marketing_username");
                password = ConfigurationReader.getProperty("marketing_password");
                break;
            case "Helpdesk2":
                username = ConfigurationReader.getProperty("helpdesk_username2");
                password = ConfigurationReader.getProperty("helpdesk_password2");
                break;
            case "Human Resource2":
                username = ConfigurationReader.getProperty("hr_username2");
                password = ConfigurationReader.getProperty("hr_password2");
                break;
            case "Marketing2":
                username = ConfigurationReader.getProperty("marketing_username2");
                password = ConfigurationReader.getProperty("marketing_password2");
                break;
            case "Helpdesk3":
                username = ConfigurationReader.getProperty("helpdesk_username3");
                password = ConfigurationReader.getProperty("helpdesk_password3");
                break;
            case "Human Resource3":
                username = ConfigurationReader.getProperty("hr_username3");
                password = ConfigurationReader.getProperty("hr_password3");
                break;
            case "Marketing3":
                username = ConfigurationReader.getProperty("marketing_username3");
                password = ConfigurationReader.getProperty("marketing_password3");
                break;
            default:
                System.out.println("invalid entry");



        }
        userNameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

    }

}
