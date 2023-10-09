package com.skyfitzz.PageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUp {
    WebDriver ldriver;
    public SignUp(WebDriver rdriver){
        ldriver= rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//button[@class='homescreen-btn-secondary']")
    @CacheLookup
    WebElement btnSignUp;

    @FindBy(xpath = "//input[@placeholder='Enter First Name']")
    @CacheLookup
    WebElement txtFirstName;

    @FindBy(xpath = "//input[@placeholder='Enter Last Name']")
    @CacheLookup
    WebElement txtLastName;

    @FindBy(xpath = "//input[@placeholder='Enter Email']")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(xpath = "//select[@class='SignUp-gender']")
    @CacheLookup
    WebElement genderDropDown;

    @FindBy(xpath = "//input[@placeholder='Enter Password']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "//input[@placeholder='Confirm Password']")
    @CacheLookup
    WebElement txtConfirmPassword;

    @FindBy(xpath = "//button[@type='submit']")
    @CacheLookup
    WebElement clickBtnSignup;

    public void clickSignUp(){
        btnSignUp.click();
    }

    public void enterFirstName(String fname){
        txtFirstName.sendKeys("Ayobami");
    }

    public void enterLastName(String lname){
        txtLastName.sendKeys("Ogundeji");
    }
    public void enterEmail(String email){
        txtEmail.sendKeys("Ayo@gmail.com");
    }
    public void selectGenderStatus(String gender){
        Select genderStatusSelect= new Select(genderDropDown);
        genderStatusSelect.selectByVisibleText(gender);
    }

    public void enterPassword(String pwd){
        txtPassword.sendKeys("Abayomi#789");
    }

    public void enterConfirmPassword(String pwd){
        txtConfirmPassword.sendKeys("Abayomi#789");
    }
    public void clickSubmitSignUp(){
        clickBtnSignup.click();
    }

}
