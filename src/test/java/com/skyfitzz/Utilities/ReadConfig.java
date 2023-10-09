package com.skyfitzz.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

    Properties pro;
    //constructor to load the file
    public ReadConfig(){
        File src = new File("./Configuration/config.properties");
        try{
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);
        }
        catch(Exception e){
            System.out.println("Exception is " + e.getMessage());

        }
    }
    public String getApplicationURL(){
        String url=pro.getProperty("baseURL");
        return url;
    }
    public String getEmail(){
        String email=pro.getProperty("email");
        return email;
    }
    public String getPassword(){
        String password=pro.getProperty("password");
        return password;
    }
    public String getChromePath(){
        String ChromePath=pro.getProperty("ChromePath");
        return ChromePath;
    }
    public String getFirefoxPath(){
        String  FirefoxPath=pro.getProperty("FirefoxPath");
        return FirefoxPath;
    }

    public String getIEPath(){
        String  IEPath=pro.getProperty("IEPath");
        return IEPath;
    }

}
