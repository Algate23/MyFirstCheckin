package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.util.Capturescreenshot;

public class LaunchChrome {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Workspace\\DemoGitRepo\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com");
		Capturescreenshot.capture(driver, "Chrome");
	driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[1]/div[3]/nav/div/ul/li[3]/a")).click();
	driver.quit();
	}
	

}

	