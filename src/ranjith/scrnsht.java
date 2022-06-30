package ranjith;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrnsht {

	public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.chrome.driver", "C:\\ranjit\\chromedriver\\chromedriver.exe");
		   WebDriver d= new ChromeDriver();
		   d.get("https://www.facebook.com/");  
		   d.manage().window().maximize();
	
	}

}
