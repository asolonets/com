package com.Promytheus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	
	public static WebDriver driver;
    /****************************************************************************************************************************
     * Talent Traits Page
     */

    public static final String traitStart = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[3]/div[2]/div/div[2]/div/fieldset[";


    public MainPage(WebDriver driver) {

        PageFactory.initElements(driver, this);
    }

    @FindBy(how=How.XPATH, using="html/body/app/ui-view/public-area/div/footer/div[1]")
	public static WebElement mainPageInfo;
	
	@FindBy(how=How.CLASS_NAME, using="icon-user")
	public static WebElement userBtn;
	
	@FindBy(how=How.XPATH, using="html/body/app/ui-view/public-area/div/header/nav/div[2]/ul[2]/li[2]/ul/li/div/a[1]/div/div[2]/p")
	public static WebElement signOutBtn;

	@FindBy(how=How.XPATH, using="html/body/app/ui-view/public-area/div/header/nav/div[2]/ul[2]/li[2]/ul/li/div/a[1]")
	public static WebElement myProfileBtn;
		
	@FindBy(how=How.XPATH, using="html/body/app/ui-view/public-area/div/ui-view/talents-section/div/section/div/div/spinner-container/div[1]/div/div[1]/div/div/div/a")
	public static WebElement createNewTalentBtn ;

    public static final String traitFinish = "]/trait-scaler/button[";
    public static final String traitFinishLastSimbol = "]";
    /***************************************************************************************************************************
     * Personality Traits Page
     */

    public static final String personalityTraitStart = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[4]/div/div/table/tbody/tr[";
    public static final String personalityTraitFinish = "]/td[2]/label/span";
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[1]/div[1]/div/div/div[1]/span")
    public static WebElement categoryChouse;
    @FindBy(how = How.XPATH, using = "html/body/app/ui-view/public-area/div/ui-view/talent/div/section/div/div/spinner-container/div[1]/div/div/talent-form/form/wizard-form/div/div[1]/div[1]/fieldset[1]/div[1]/div/div/ul/li/div[3]/span")
    public static WebElement categoryChouseEngineering;
    /************************************************************************************************************************************
     *   Talent personal information page
     */

    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[1]/div[1]/input")
    public static WebElement firstName;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[1]/div[2]/input")
    public static WebElement middleName;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[1]/div[3]/input")
    public static WebElement lastName;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[2]/div[1]/div[1]/div/span/button")
    public static WebElement talentPicBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[3]/div/label[1]/span")
    public static WebElement sexMaleRadioBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[3]/div/label[2]/span")
    public static WebElement sexFemaleRadioBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[3]/div/label[3]/span")
    public static WebElement sexOtherRadioBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[4]/div[1]/div/input")
    public static WebElement dateOfBirth;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[4]/div[1]/div/input")
    public static WebElement placeOfBirth;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[5]/div/div/input[1]")
    public static WebElement country;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[7]/div/input")
    public static WebElement city;
    @FindBy(how = How.ID, using = "address")
    public static WebElement adressL1;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[6]/div/div/div[2]/input")
    public static WebElement adressL2;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[8]/div/input")
    public static WebElement state;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[9]/div/input")
    public static WebElement postCode;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[10]/div")
    public static WebElement locationGropuRadioBtn;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[11]/div")
    public static WebElement locationStatusGropuRadioBtn;

    /**
     * ********************************************************************************************************************************
     */
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[12]/div[1]/input")
    public static WebElement email;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[12]/div[2]/input")
    public static WebElement phone;
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[14]/div/input")
    public static WebElement height;
    //**************************************************************************************************************************
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[2]/div/div/div[15]/div/input")
    public static WebElement weight;
    /***************************************************************************************************************************
     * Story Page
     */
    @FindBy(how = How.XPATH, using = ".//*[@id='talentForm']/wizard-form/div/div[1]/div[1]/fieldset[5]/div/div/div[3]/div/select")
    public static WebElement interestLevelStoryPageSelectElement;

    //**************************************************************************************************************************
    @FindBy(how = How.XPATH, using = "html/body/app/ui-view/public-area/div/ui-view/talents-section/div/section/div/div/spinner-container/div[1]/div/div[2]/table/tbody/tr/td[2]/a")
    public static WebElement talentCreatedFirstRowName;

//***************************************************************************************************************************


	@FindBy(how=How.XPATH, using=".//*[@id='talentForm']/wizard-form/div/div[2]/button[2]")
	public static WebElement nextBtnCategory;
	}
	
	