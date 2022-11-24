package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.HomePage;
import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.UploadFilesAndPicturesPage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class UploadFilesPictures_StepDefs {

    LoginPage loginPage= new LoginPage();
    UploadFilesAndPicturesPage uploadFilesAndPicturesPage= new UploadFilesAndPicturesPage();
    HomePage homePage= new HomePage();

    Actions actions= new Actions(Driver.getDriver());



    @When("user clicks upload files icon")
    public void user_clicks_upload_files_icon() {
        uploadFilesAndPicturesPage.uploadFilesIcon.click();
        BrowserUtils.sleep(3);

    }

    @When("user uploads file")
    public void user_uploads_file() {

        String path2="C:\\Users\\hicre\\OneDrive\\Masaüstü\\AUTOMATION\\Cucumber GITIGNORE file.docx";
        String path3="C:\\Users\\hicre\\OneDrive\\Masaüstü\\GIThub  sessions\\Github_1_Slides_.pptx";
        String path1= "C:\\Users\\hicre\\OneDrive\\Masaüstü\\GIThub  sessions\\branch on GIT.png";

        BrowserUtils.sleep(2);
        uploadFilesAndPicturesPage.uploadFilesANDimagesLink.sendKeys(path1);
        uploadFilesAndPicturesPage.uploadFilesANDimagesLink.sendKeys(path2);
        uploadFilesAndPicturesPage.uploadFilesANDimagesLink.sendKeys(path3);

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
        uploadFilesAndPicturesPage.sentMultipleDifferentFiles.isDisplayed();
    }


    @When("user uploads picture")
    public void user_uploads_picture() {
       // String path4="C:\\Users\\hicre\\OneDrive\\Masaüstü\\HTML Class\\sunnyDay.jpg";
       // uploadFilesAndPicturesPage.uploadFilesANDimagesLink.sendKeys(path4);

       String projectPath= System.getProperty("user.dir");
       String filePathJPG= "src/test/resources/filesToUpload/sunnyDay.jpg";
       String fullPath= projectPath+ "/"+filePathJPG;
       uploadFilesAndPicturesPage.uploadFilesANDimagesLink.sendKeys(fullPath);
       BrowserUtils.sleep(3);


    }
    @Then("verify the user sent the picture successfully")
    public void verify_the_user_sent_the_picture_successfully() {
        uploadFilesAndPicturesPage.sentImage.isDisplayed();

    }


    @When("user uploads file and images then insert them into the text")
    public void user_uploads_file_and_images_then_insert_them_into_the_text() {
        String path2="C:\\Users\\hicre\\OneDrive\\Masaüstü\\AUTOMATION\\Cucumber GITIGNORE file.docx";
        String path4="C:\\Users\\hicre\\OneDrive\\Masaüstü\\avatar.png";
        uploadFilesAndPicturesPage.uploadFilesANDimagesLink.sendKeys(path2);
        BrowserUtils.sleep(2);
        uploadFilesAndPicturesPage.uploadFilesANDimagesLink.sendKeys(path4);
        BrowserUtils.sleep(2);

        List<WebElement> allInsertTextButton=
                Driver.getDriver().findElements(By.xpath("//span[@class='insert-btn-text']"));

        for (WebElement each : allInsertTextButton) {
            each.click();
        }

        BrowserUtils.sleep(2);
    }
    @Then("verify the user inserted the files into the text successfully")
    public void verify_the_user_inserted_the_files_into_the_text_successfully() {
        WebElement insertedFile=
                Driver.getDriver().findElement(By.xpath("//img[contains(@id,'disk-inline-image-')]"));
        WebElement insertedFile2=
                Driver.getDriver().findElement(By.xpath("//a[@class='feed-com-file-name']"));

        insertedFile.isDisplayed();
        insertedFile2.isDisplayed();
    }


    @When("user allows a recipient to edit document")
    public void user_allows_a_recipient_to_edit_document() {
        uploadFilesAndPicturesPage.allowRecipientToEditCheckbox.isEnabled();
        System.out.println("' Allow a recipient to edit' checkbox is checked by default");
    }
    @Then("verify the user allowed a recipient to edit file successfully")
    public void verify_the_user_allowed_a_recipient_to_edit_file_successfully() {
        uploadFilesAndPicturesPage.editButton.isDisplayed();
    }


    @When("user uploads a file")
    public void user_uploads_a_file() {
        String path= "C:\\Users\\hicre\\OneDrive\\Masaüstü\\HTML Class\\minions-animated-movies-movies-three-wallpaper.jpg";
        uploadFilesAndPicturesPage.uploadFilesANDimagesLink.sendKeys(path);
    }


    @When("user remove the file")
    public void user_remove_the_file() {
        uploadFilesAndPicturesPage.delButton.click();
    }
    @Then("verify the file is removed successfully")
    public void verify_the_file_is_removed_successfully() {
       BrowserUtils.verifyElementNotDisplayed(By.xpath("//span[contains(text(),'minions')]"));

    }

    @When("user rename the file before sending it")
    public void user_rename_the_file_before_sending_it() {
        uploadFilesAndPicturesPage.renameButton.isEnabled();

        BrowserUtils.clickWithJS(uploadFilesAndPicturesPage.renameButton);
        BrowserUtils.waitForVisibility(uploadFilesAndPicturesPage.changeableFileName,5);

        uploadFilesAndPicturesPage.changeableFileName.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
        BrowserUtils.sleep(1);
       uploadFilesAndPicturesPage.changeableFileName.sendKeys("renamed"+ Keys.ENTER);
        BrowserUtils.waitFor(2);


    }
    @Then("verify the file is renamed successfully")
    public void verify_the_file_is_renamed_successfully() {
        BrowserUtils.sleep(1);
        BrowserUtils.verifyElementDisplayed(By.xpath("//img[contains(@data-bx-title,'renamed')]"));
    }


}
