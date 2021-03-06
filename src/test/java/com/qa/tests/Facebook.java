package com.qa.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Workspace\\DemoGitRepo\\drivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
	//**********************Headless***************Start
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver=new ChromeDriver(options);
	//****************************************************end	
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./screenshot/Facebook1.png"));
	}

}
