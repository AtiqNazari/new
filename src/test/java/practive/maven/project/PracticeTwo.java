package practive.maven.project;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeTwo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    WebElement search = driver.findElement(By.name("q"));
	    search.click();
	    search.sendKeys("Afghansitan");
	   
	    WebElement gsearch = driver.findElement(By.name("btnK"));
	    gsearch.click();
	    
	    
	    Thread.sleep(3000);
	
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	    js.executeScript("scrolBy(0, 10000)");
	    
	    
		
		
		
		
		
		

	}

}
