package com.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Capturescreenshot {

	public static void capture(WebDriver driver,String screenshotname) throws Exception {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source,new File( "./screenshot/"+screenshotname+".png"));
		
		
	}
}
