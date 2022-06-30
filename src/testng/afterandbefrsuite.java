package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class afterandbefrsuite {
	

	@Test
	public void fb() {
		long starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\ranjit\\chromedriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		d.quit();
		long endtime = System.currentTimeMillis();
		long totaltime = endtime-starttime;
		System.out.println("total time taken"+totaltime);
	}
	@Test
	public void flip() {
		System.setProperty("webdriver.chrome.driver", "C:\\ranjit\\chromedriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.quit();
	}

	
	
}
