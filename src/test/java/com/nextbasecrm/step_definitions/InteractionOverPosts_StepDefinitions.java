package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.HomePage;
import com.nextbasecrm.pages.MakeCommentOnPosts;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteractionOverPosts_StepDefinitions {

    MakeCommentOnPosts makeCommentOnPosts = new MakeCommentOnPosts();
    HomePage homePage = new HomePage();


   /* BrowserUtils.sleep(2);
        dashBoardPage.messageButton.click();
        BrowserUtils.sleep(2);
    WebDriverWait waitFrame = new WebDriverWait(Driver.getDriver(), 10);
        waitFrame.until(ExpectedConditions.visibilityOf(dashBoardPage.iframe));
        Driver.getDriver().switchTo().frame(dashBoardPage.iframe);

        BrowserUtils.waitForVisibility(dashBoardPage.messageBox, 10);
        dashBoardPage.messageBox.click();
    */

    @When("user clicks the comment button in the first post in the dashboard")
    public void user_clicks_the_comment_button_in_the_first_post_in_the_dashboard() {
        makeCommentOnPosts.commentButton.click();

    }
    @When("user writes a comment to the first post in the dashboard")
    public void user_writes_a_comment_to_the_first_post_in_the_dashboard() {

        WebDriverWait waitFrame = new WebDriverWait(Driver.getDriver(), 10);
        waitFrame.until(ExpectedConditions.visibilityOf(makeCommentOnPosts.iframe));
        Driver.getDriver().switchTo().frame(makeCommentOnPosts.iframe);
        BrowserUtils.sleep(3);

        BrowserUtils.waitForVisibility(makeCommentOnPosts.commentBox, 10);
        makeCommentOnPosts.commentBox.sendKeys("deneme");
        Driver.getDriver().switchTo().parentFrame();
    }
    @When("the user clicks the send comment button.")
    public void the_user_clicks_the_send_comment_button() {
       makeCommentOnPosts.sendComment.click();
    }
    @Then("user can see the comment under the post.")
    public void user_can_see_the_comment_under_the_post() {

        BrowserUtils.sleep(2);
        //JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        //js.executeScript("arguments[0].click();", makeCommentOnPosts.firstComment);
        BrowserUtils.waitForVisibility(makeCommentOnPosts.firstComment, 10);
        BrowserUtils.sleep(2);
        BrowserUtils.verifyElementDisplayed(makeCommentOnPosts.firstComment);
        BrowserUtils.sleep(2);
    }

    @When("user clicks the like button.")
    public void user_clicks_the_like_button() {
        //BrowserUtils.waitForVisibility(makeCommentOnPosts.likeButton, 10);
        //makeCommentOnPosts.likeButton.isDisplayed();
        BrowserUtils.waitForPageToLoad(3);
        makeCommentOnPosts.likeButton.click();
    }

    @Then("user clicks the replay button.")
    public void user_clicks_the_replay_button() {
        BrowserUtils.waitForPageToLoad(3);
        makeCommentOnPosts.replyButton.click();

    }
}
