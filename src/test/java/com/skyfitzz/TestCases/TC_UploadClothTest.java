package com.skyfitzz.TestCases;

import com.skyfitzz.PageOjects.UploadCloth;

import org.testng.annotations.Test;

public class TC_UploadClothTest extends BaseClass {

    @Test
    public void testUploadCloth() throws InterruptedException {

        // Step 3: Initialize the UploadCloth
        UploadCloth uploadClothPage= new UploadCloth(driver);
        // Upload Cloth
        uploadClothPage.uploadCloth("olowo.michael179@gmail.com", "@Liberty561", "C://Users//dolapo.oguntoyinbo//Pictures//New folder (2)//gown1.webp");

    }
}
