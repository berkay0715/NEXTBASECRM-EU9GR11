package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeCommentOnPosts {
    public MakeCommentOnPosts() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(@id,'BLOG_POST')]//a[1]")
    public WebElement likePost;

    @FindBy(xpath = "(//a[contains(@id,'blog-post-addc-' )])[1]")
    public  WebElement commentButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy (xpath = "/html/body")
    public WebElement commentBox;


    @FindBy (xpath = "//button[@class='ui-btn ui-btn-sm ui-btn-primary']")
    public WebElement sendComment;

    @FindBy (xpath = "(//div[@class='feed-com-text']//div[.='deneme'])[1]")
    public WebElement firstComment;

    @FindBy (xpath = "(//span[@class='feed-inform-ilike feed-new-like'])[2]//a")
    public WebElement likeButton;

    @FindBy (xpath = "//*[@id=\"record-BLOG_700-42-actions-reply\"]")
    public WebElement replyButton;













    }
