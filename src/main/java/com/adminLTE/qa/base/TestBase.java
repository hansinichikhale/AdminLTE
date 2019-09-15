package com.adminLTE.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.adminLTE.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	
	
	public TestBase(){
		try {
			prop=new Properties();
FileInputStream ip=new FileInputStream("C:\\Users\\Public\\AdminLTETest\\src\\main\\java\\com\\adminLTE\\qa\\config\\config.properties");
prop.load(ip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
}
	
	public static void initialization() {
		log=Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure("log4j.properties");
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Pavan\\Downloads\\chromedriver.exe");
			 driver=new ChromeDriver();
}else if(browsername.equals("Firefox")) {;
System.setProperty("webdriver.gecko.driver","C:\\Users\\Pavan\\Downloads\\gecko\\geckodriver.exe");
 driver=new FirefoxDriver();
	}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitilyWait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
	
