package com.skyfitzz.TestCases;

import com.skyfitzz.PageOjects.LoginPage;
import org.testng.annotations.Test;

public class TC_LoginTest extends BaseClass{

    @Test
    public void loginTest(){

        // Step 2: Log information
        logger.info("URL is opened");

        // Step 3: Initialize the LoginPage
        LoginPage lp = new LoginPage(driver);

        // Step 4: Set email and password
        lp.setEmail(email);
        logger.info("Entered email");
        lp.setPassword(password);
        logger.info("Entered password");

        // Step 5: Click Submit
        lp.clickSubmit();

    }

}
