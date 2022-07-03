package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {

        PageFactory.initElements(Driver.callDriver(),this);
    }

    @FindBy(id="login")
    public WebElement usernameInput;

    @FindBy(id="password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement salesUserPage;


}