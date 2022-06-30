package ranjith;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flip {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

				   System.setProperty("webdriver.chrome.driver", "C:\\ranjit\\chromedriver\\chromedriver.exe");
				   WebDriver d= new ChromeDriver();
				   d.get("https://www.facebook.com/");  
				   d.manage().window().maximize();
				   Thread.sleep(2000);
				   
				   d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ranjithlg10@gmail.com");
				   d.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("7200230471");
				   d.findElement(By.name("login")).click();
	}

				
			




	}


