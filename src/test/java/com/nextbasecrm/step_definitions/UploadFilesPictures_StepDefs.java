package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.HomePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.UploadFilesAndPicturesPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class UploadFilesPictures_StepDefs {

    LoginPage loginPage= new LoginPage();
    UploadFilesAndPicturesPage uploadFilesAndPicturesPage= new UploadFilesAndPicturesPage();
    HomePage homePage= new HomePage();

    Actions actions= new Actions(Driver.getDriver());





    @When("user clicks {string} on the quick navigate menu")
    public void userClicksOnTheQuickNavigateMenu(String messageTab) {
        homePage.messageTab.click();
        BrowserUtils.sleep(2);
    }

    @When("user clicks upload files icon")
    public void user_clicks_upload_files_icon() {
        uploadFilesAndPicturesPage.uploadFilesIcon.click();
        BrowserUtils.sleep(3);

    }

    @When("user clicks -Upload files and images- option and upload file")
    public void user_clicks_upload_files_and_images_option_and_upload_file() {

       // String path2="C:\\Users\\hicre\\OneDrive\\Masaüstü\\GIThub  sessions\\branch.png";
       // String path3="C:\\Users\\hicre\\OneDrive\\Masaüstü\\GIThub  sessions\\GIThub.png";

       // uploadFilesAndPicturesPage.uploadFilesANDimagesLink.click();


        String path1= "C:\\Users\\hicre\\OneDrive\\Masaüstü\\GIThub  sessions\\branch on GIT.png";
        BrowserUtils.sleep(5);
        uploadFilesAndPicturesPage.uploadFilesANDimagesLink.sendKeys(path1);

        BrowserUtils.sleep(3);
    }

    @When("the user clicks send button for uploading")
    public void the_user_clicks_send_button_for_uploading() {
        BrowserUtils.sleep(3);

        //BrowserUtils.clickWithJS(uploadFilesAndPicturesPage.sendButton);
        uploadFilesAndPicturesPage.sendButton.click();

        BrowserUtils.waitForPageToLoad(3);

    }



    @Then("verify the user sent the files successfully")
    public void verify_the_user_sent_the_files_successfully() {

    }



}
