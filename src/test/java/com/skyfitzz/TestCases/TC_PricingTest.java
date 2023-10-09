package com.skyfitzz.TestCases;

import com.skyfitzz.PageOjects.LoginPage;
import com.skyfitzz.PageOjects.Pricing;
import com.skyfitzz.PageOjects.SignUp;
import org.testng.annotations.Test;

public class TC_PricingTest extends BaseClass{

    @Test
    public void PricingTest() throws InterruptedException {
        // Step 2: Log information
        logger.info("URL is opened");

        // Step 3: Initialize the PricingPage
        Pricing pricingPage= new Pricing(driver);

        // Login
        pricingPage.login("olowo.michael179@gmail.com", "@Liberty561");

        // Generate Outfit
        pricingPage.generateOutfit();

        // Go to Pricing
        pricingPage.goToPricing();

        // Purchase
        pricingPage.purchase("Moses Musa", "Ayobo", "Lagos", "56789");

        // Enter Card Details
        pricingPage.enterCardDetails("12345667", "Moses Musa", "576", "03/2023");




    }

}
