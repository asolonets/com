package com.Promytheus.pages;

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
		
	@FindBy(how=How.XPATH, using="html/body/app/ui-view/public-area/div/ui-view/talents-section/div/section/div/div/spinner-container/div[1]/div/div[1]/div/div/div/a")
	public static WebElement createNewTalentBtn ;
	
	@FindBy(how=How.XPATH, using=".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[1]/div/div/div/div/div/div[1]/span/span[1]")
	public static WebElement categoryChouse;
		
	@FindBy(how=How.XPATH, using=".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[1]/div/div/div/div/div/ul/li/div/span")
	public static WebElement categoryChouseEngineering;
	
	@FindBy(how=How.XPATH, using=".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[1]/div/div/div/div/div/ul/li/div[4]/span")
	public static WebElement categoryChouseDesign;
		
	@FindBy(how=How.XPATH, using=".//*[@id='talentForm']/wizard-form/div/div[2]/button[2]")
	public static WebElement nextBtnCategory ;
	
	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[1]/td[2]/input")
	public static WebElement talentTraits1 ;
	
	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[2]/td[2]/input")
	public static WebElement talentTraits2 ;

	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[3]/td[2]/input")
	public static WebElement talentTraits3 ;

	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[4]/td[2]/input")
	public static WebElement talentTraits4 ;

	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[5]/td[2]/input")
	public static WebElement talentTraits5 ;

	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[6]/td[2]/input")
	public static WebElement talentTraits6 ;

	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[7]/td[2]/input")
	public static WebElement talentTraits7 ;

	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[8]/td[2]/input")
	public static WebElement talentTraits8 ;

	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[9]/td[2]/input")
	public static WebElement talentTraits9 ;

	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[10]/td[2]/input")
	public static WebElement talentTraits10 ;

	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[11]/td[2]/input")
	public static WebElement talentTraits11 ;

	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[12]/td[2]/input")
	public static WebElement talentTraits12 ;
	
	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[13]/td[2]/input")
	public static WebElement talentTraits13 ;

	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[14]/td[2]/input")
	public static WebElement talentTraits14 ;

	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[15]/td[2]/input")
	public static WebElement talentTraits15 ;
	
	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[16]/td[2]/input")
	public static WebElement talentTraits16 ;
	
	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[17]/td[2]/input")
	public static WebElement talentTraits17 ;
	
	@FindBy(how=How.XPATH, using=".//*[@id='traits']/tbody/tr[18]/td[2]/input")
	public static WebElement talentTraits18 ;	
	
	@FindBy(how=How.XPATH, using=".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[4]/div/div/table/tbody/tr[1]/td[2]/label/span")
	public static WebElement personTraits1 ;
		
	}
	
	