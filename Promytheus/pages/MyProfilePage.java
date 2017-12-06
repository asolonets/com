package com.Promytheus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {

    public MyProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    public static WebDriver driver;
    @FindBy(how = How.ID, using = "firstName")
    public static WebElement firstName;
    @FindBy(how = How.ID, using = "middleName")
    public static WebElement middleName;
    @FindBy(how = How.ID, using = "lastName")
    public static WebElement lastName;
    @FindBy(how = How.ID, using = "email")
    public static WebElement email;
    @FindBy(how = How.ID, using = "phone")
    public static WebElement phone;
    @FindBy(how = How.ID, using = "address")
    public static WebElement address;
    @FindBy(how = How.ID, using = "city")
    public static WebElement city;
    @FindBy(how = How.ID, using = "state")
    public static WebElement state;
    @FindBy(how = How.ID, using = "zip")
    public static WebElement postCode;
    @FindBy(how = How.ID, using = "updateProfile")
    public static WebElement updateProfileBtn;


}
