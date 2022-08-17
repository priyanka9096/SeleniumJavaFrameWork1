import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Priya Workspace\\SeleniumFramework\\drivers\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Priya Workspace\\SeleniumFramework\\drivers\\chromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		
		//driver.findElement(By.id("input")).sendKeys("Automation Step by Step");	use drictly
		
		
		//WebElement textBox=driver.findElement(By.name('q'));
		WebElement textBox=driver.findElement(By.xpath("//input[@name=''q]"));
		textBox.sendKeys("Automation Step by Step");
		
		Thread.sleep(30000);
		driver.close();

	}

}
