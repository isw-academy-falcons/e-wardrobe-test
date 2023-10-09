package com.skyfitzz.TestCases;

import com.skyfitzz.PageOjects.LoginPage;
import com.skyfitzz.PageOjects.SignUp;
import org.testng.annotations.Test;

public class TC_SignUpTest extends BaseClass {

    @Test
    public void signUpTest(){

        // Step 2: Log information
        logger.info("URL is opened");

        // Step 3: Initialize the SignUpPage
        SignUp sp = new SignUp(driver);

        // Step 4: Set firstname, lastname, email, gender, password
        sp.clickSignUp();
        sp.enterFirstName("Dolapo");
        sp.enterLastName("Daramodu");
        sp.enterEmail("dolapo@gmail.com");
        sp.selectGenderStatus("Male");
        sp.enterPassword("Joshua@98");
        sp.enterConfirmPassword("Joshua@98");
        sp.clickSubmitSignUp();
    }


    }
