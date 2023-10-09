package com.skyfitzz.PageOjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pricing {

    WebDriver ldriver;
    public Pricing(WebDriver rdriver){
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

    @FindBy(xpath = "//a[normalize-space()='Pricing']")
    @CacheLookup
    WebElement clickBtnPricing;

    @FindBy(xpath = "//a[normalize-space()='Purchase']")
    @CacheLookup
    WebElement clickBtnPurchase;

    @FindBy(xpath = "//input[@placeholder='Enter full name']")
    @CacheLookup
    WebElement inputFullName;

    @FindBy(xpath = "//input[@placeholder='Enter address']")
    @CacheLookup
    WebElement inputAddress;

    @FindBy(xpath = "//input[@placeholder='Enter city']")
    @CacheLookup
    WebElement inputCity;

    @FindBy(xpath = "//input[@placeholder='Enter zip code']")
    @CacheLookup
    WebElement inputZipCode;

    @FindBy(xpath = "//button[@type='submit']")
    @CacheLookup
    WebElement clickNext;

    @FindBy(xpath = "//input[@value='mastercard']")
    @CacheLookup
    WebElement inputCard;

    @FindBy(xpath = "//input[@placeholder='Enter card number']")
    @CacheLookup
    WebElement inputCardNumber;

    @FindBy(xpath = "//input[@placeholder='Enter card holder name']")
    @CacheLookup
    WebElement inputCardHolderName;

    @FindBy(xpath = "//input[@placeholder='Enter CVV']")
    @CacheLookup
    WebElement inputCVV;

    @FindBy(xpath = "//input[@placeholder='MM/YYYY']")
    @CacheLookup
    WebElement inputDate;

    @FindBy(xpath = "//button[@type='submit']")
    @CacheLookup
    WebElement btnSubmit;

    public void login(String email, String password) throws InterruptedException {
        btnLogin.click();
        txtEmail.sendKeys(email);
        txtPassword.sendKeys(password);
        clickBtnLogin.click();
        Thread.sleep(500);
    }

    public void generateOutfit() {

        generateOutfitButton.click();
    }

    public void goToPricing() {
        clickBtnPricing.click();
    }

    public void purchase(String fullName, String address, String city, String zipCode) throws InterruptedException {
        clickBtnPurchase.click();
        inputFullName.sendKeys(fullName);
        inputAddress.sendKeys(address);
        inputCity.sendKeys(city);
        inputZipCode.sendKeys(zipCode);
        Thread.sleep(1000);
        clickNext.click();
    }

    public void enterCardDetails(String cardNumber, String cardHolderName, String cvv, String expirationDate) throws InterruptedException {
        inputCard.click();
        Thread.sleep(1000);
        inputCardNumber.sendKeys(cardNumber);
        inputCardHolderName.sendKeys(cardHolderName);
        inputCVV.sendKeys(cvv);
        inputDate.sendKeys(expirationDate);
        btnSubmit.click();
    }


}
