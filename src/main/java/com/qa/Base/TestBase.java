package com.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
		
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:/Automation/QFUND/src/main/"
					+ "java/com/qa/config/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization(){
		
		String browsername = prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:/Automation Softwares/Selenium Drivers/"
					+ "chromedriver_win32 latest version 2.36/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else {
			System.setProperty("webdriver.ie.driver", "D:/Automation Softwares/IEDriverServer_Win32_3.14.0/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));	
		
	}
}
