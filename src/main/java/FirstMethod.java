import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".C:\\Users\\jimia\\eclipse\\java\\Com.MavenPractice\\pom.xml");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.facebook.com/");

	}

}
