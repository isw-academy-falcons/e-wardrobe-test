package com.skyfitzz.PageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver ldriver;

    public LoginPage(WebDriver rdriver){
        ldriver= rdriver;
        PageFactory.initElements(rdriver,this);
    }
    @FindBy(xpath = "//button[@class='homescreen-btn-primary']")
    @CacheLookup
    WebElement btnLogin;
    @FindBy(xpath = "//input[@placeholder='Enter Email']")
     @CacheLookup
    WebElement txtEmail;

    @FindBy(xpath = "//input[@placeholder='Enter Password']")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "//button[@type='submit']")
    @CacheLookup
    WebElement clickBtnLogin;


    public void clickLogin(){
        btnLogin.click();
    }
    public void setEmail(String email){
        txtEmail.sendKeys("olowo.michael179@gmail.com");
    }
    public void setPassword(String pwd){
        txtPassword.sendKeys("@Liberty561");
    }
    public void clickSubmit() {
        clickBtnLogin.click();
    }

}
