package com.skyfitzz.PageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadCloth {
    WebDriver ldriver;

    public UploadCloth(WebDriver rdriver){
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

    @FindBy(xpath = "//button[normalize-space()='Generate Outfit']")
    @CacheLookup
    WebElement generateOutfitButton;

    @FindBy(xpath = "//button[@id='dropdown-basic']")
    @CacheLookup
    WebElement uploadDropDown;

    @FindBy(xpath = "//label[@for='dress-input']")
    @CacheLookup
    WebElement clickDressBtn;

    @FindBy(xpath = "//input[@type='file']")
    @CacheLookup
    WebElement fileInput;

    @FindBy(xpath = "//input[@id='default-FREE_STYLE']")
    @CacheLookup
    WebElement freeStyleInput;

    @FindBy(xpath = "//button[normalize-space()='Submit']")
    @CacheLookup
    WebElement submitButton;

    public void uploadCloth(String email, String password, String filePath) throws InterruptedException {
        btnLogin.click();
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        clickBtnLogin.click();
        Thread.sleep(2000);
        generateOutfitButton.click();
        uploadDropDown.click();
        clickDressBtn.click();
        fileInput.sendKeys(filePath);
        freeStyleInput.click();
        Thread.sleep(2000);
        submitButton.click();
    }

}
