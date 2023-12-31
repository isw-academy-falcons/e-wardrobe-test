package com.skyfitzz.TestCases;

import com.skyfitzz.Utilities.ReadConfig;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    ReadConfig readconfig=new ReadConfig();
    public String baseURL =readconfig.getApplicationURL();
    public String email= readconfig.getEmail();
    public String password = readconfig.getPassword();
    public static WebDriver driver;
    public static Logger logger;
    @Parameters("browser")
    @BeforeClass
    public void setup(String br) {

        logger = Logger.getLogger("HomeScreen");
        PropertyConfigurator.configure("Log4j.properties");

        if (br.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C://Users//dolapo.oguntoyinbo//Downloads//Design Patters//Skyfitzz2//Driver//chromedriver.exe");
            driver = new ChromeDriver();
        }
    else if (br.equals("firefox")) {

        System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
        driver = new FirefoxDriver();
    } else if (br.equals("ie")) {
        System.setProperty("webdriver.ie.driver", readconfig.getIEPath());
        driver = new InternetExplorerDriver();

    }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://skyfitzz.vercel.app/");
    }
    @AfterClass
    public void tearDown() {

        driver.quit();
    }

}
