package com.Promytheus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    public static WebDriver driver;

    public RegistrationPage (WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(how= How.ID, using="signUpFirstName")
    public static WebElement firstName;

    @FindBy(how= How.ID, using="signUpMiddleName")
    public static WebElement middleName;

    @FindBy(how= How.ID, using="signUpLastName")
    public static WebElement lastName;

    @FindBy(how= How.ID, using="signUpAddress")
    public static WebElement signUpAddress;

    @FindBy(how= How.ID, using="signUpCity")
    public static WebElement city;

    @FindBy(how= How.ID, using="signUpRegisterEmail")
    public static WebElement email;

    @FindBy(how= How.ID, using="signUpPhone")
    public static WebElement phone;

    @FindBy(how= How.ID, using="signUpState")
    public static WebElement state;

    @FindBy(how= How.ID, using="signUpZip")
    public static WebElement postCode;

    @FindBy(how= How.ID, using="signUpRegisterPassword")
    public static WebElement password;

    @FindBy(how= How.ID, using="signUpRegisterRePassword")
    public static WebElement passwordRetype;

    @FindBy(how= How.XPATH, using=".//*[@id='registerForm']/div[3]/label/span")
    public static WebElement policyCheckBox;

    @FindBy(how= How.ID, using="createAccount")
    public static WebElement createAccountBtn;







}
