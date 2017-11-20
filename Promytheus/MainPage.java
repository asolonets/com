package com.Promytheus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
	
	public static WebDriver driver;
	
	public MainPage (WebDriver driver){
		MainPage.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using="html/body/app/ui-view/public-area/div/footer/div[1]")
	public static WebElement mainPageInfo;
	
	@FindBy(how=How.XPATH, using="html/body/app/ui-view/public-area/div/header/nav/div[2]/ul[2]/li[2]/a/em")
	public static WebElement userBtn;
	
	@FindBy(how=How.XPATH, using="html/body/app/ui-view/public-area/div/header/nav/div[2]/ul[2]/li[2]/ul/li/div/a[2]/div/div[2]/p")
	public static WebElement signOutBtn;
	
	}
	
	