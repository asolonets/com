package com.Promytheus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	public static WebDriver driver;
	
	public LoginPage (WebDriver driver){
		LoginPage.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using="html/body/app/ui-view/auth-zone/ui-view/sign-in-form/spinner-container/div[1]/div/div/form/div[1]/input")
	public static WebElement login;
	
	@FindBy(how=How.NAME, using="password")
	public static WebElement password;
	
	@FindBy(how=How.ID, using="login")
	public static WebElement btnLogin;

	@FindBy(how=How.XPATH, using="html/body/app/ui-view/auth-zone/ui-view/sign-in-form/spinner-container/div[1]/div/div/form/div[3]")
	public static WebElement loginError;

	@FindBy(how=How.LINK_TEXT, using="Register Now")
	public static WebElement registerNow;

	
}
