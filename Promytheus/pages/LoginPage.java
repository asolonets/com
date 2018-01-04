package com.Promytheus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(how = How.XPATH, using = "html/body/app/ui-view/auth-zone/ui-view/sign-in-form/spinner-container/div[1]/div/div/form/div[1]/input")
    public WebElement login;

    public LoginPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	@FindBy(how=How.NAME, using="password")
    public WebElement password;
    @FindBy(how=How.ID, using="login")
    public WebElement btnLogin;
    @FindBy(how=How.XPATH, using="html/body/app/ui-view/auth-zone/ui-view/sign-in-form/spinner-container/div[1]/div/div/form/div[3]")
    public WebElement loginError;
    @FindBy(how=How.LINK_TEXT, using="Register Now")
    public WebElement registerNow;
    WebDriver driver;

	
}
