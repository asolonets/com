package com.Promytheus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
    public WebDriver driver;
    @FindBy(how = How.ID, using = "firstName")
    public WebElement firstName;
    @FindBy(how = How.ID, using = "middleName")
    public WebElement middleName;
    @FindBy(how = How.ID, using = "lastName")
    public WebElement lastName;
    @FindBy(how = How.ID, using = "email")
    public WebElement email;
    @FindBy(how = How.ID, using = "phone")
    public WebElement phone;
    @FindBy(how = How.ID, using = "address")
    public WebElement address;
    @FindBy(how = How.ID, using = "city")
    public WebElement city;
    @FindBy(how = How.ID, using = "state")
    public WebElement state;
    @FindBy(how = How.ID, using = "zip")
    public WebElement postCode;
    @FindBy(how = How.ID, using = "updateProfile")
    public WebElement updateProfileBtn;

    public MyProfilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


}
