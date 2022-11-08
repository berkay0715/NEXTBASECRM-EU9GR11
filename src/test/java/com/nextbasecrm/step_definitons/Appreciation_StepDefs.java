package com.nextbasecrm.step_definitons;

import com.nextbasecrm.pages.AppreciationPage;
import com.nextbasecrm.pages.HomePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Given;

public class Appreciation_StepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AppreciationPage appreciationPage = new AppreciationPage();


    @Given("the user logs in as a {string}")
    public void the_user_logsIn_as_a(String userType) {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.loginAs(userType);

    }



}
