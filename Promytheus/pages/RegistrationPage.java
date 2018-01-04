package com.Promytheus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    public WebDriver driver;
    @FindBy(how= How.ID, using="signUpFirstName")
    public WebElement firstName;
    @FindBy(how= How.ID, using="signUpMiddleName")
    public WebElement middleName;
    @FindBy(how= How.ID, using="signUpLastName")
    public WebElement lastName;
    @FindBy(how= How.ID, using="signUpAddress")
    public WebElement signUpAddress;
    @FindBy(how= How.ID, using="signUpCity")
    public WebElement city;
    @FindBy(how= How.ID, using="signUpRegisterEmail")
    public WebElement email;
    @FindBy(how= How.ID, using="signUpPhone")
    public WebElement phone;
    @FindBy(how= How.ID, using="signUpState")
    public WebElement state;
    @FindBy(how= How.ID, using="signUpZip")
    public WebElement postCode;
    @FindBy(how= How.ID, using="signUpRegisterPassword")
    public WebElement password;
    @FindBy(how= How.ID, using="signUpRegisterRePassword")
    public WebElement passwordRetype;
    @FindBy(how= How.XPATH, using=".//*[@id='registerForm']/div[3]/label/span")
    public WebElement policyCheckBox;
    @FindBy(how= How.ID, using="createAccount")
    public WebElement createAccountBtn;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }







}
