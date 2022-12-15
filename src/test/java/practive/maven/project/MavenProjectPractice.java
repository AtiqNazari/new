package practive.maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenProjectPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/"); 
		Thread.sleep(1000); 
		driver.manage().window().maximize(); 
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("atiqaetimad32@gmail.com"); 
		Thread.sleep(1000); 
		
		WebElement password = driver.findElement(By.id("pass")); 
		password.sendKeys("Kabul@4321234");
		Thread.sleep(1000); 
		WebElement logIn = driver.findElement(By.name("login")); 
		logIn.click(); 
		
		// the following formula is for popUp windows. 
		for (String windaw: driver.getWindowHandles()) {
			driver.switchTo().window(windaw); 
		}
		
		WebElement search = driver.findElement(By.xpath("//*[@id=\"mount_0_0_LE\"]/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div/div/label/input")); 
		search.click(); 
		search.sendKeys("Afghanistan");
		
		

	}

}
