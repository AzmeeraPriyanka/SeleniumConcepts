package Extentpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Act_ion {
	WebDriver driver;
@BeforeMethod
	public void openFlipkart(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium_maven\\MavenProject\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		//driver.navigate().to("http://www.flipkart.com");
		driver.manage().window().maximize();
	}
@Test
public void moveToElements() throws Throwable{
	
	    Actions act= new Actions(driver);
	    act.sendKeys(Keys.ESCAPE).perform();
	    //act.perform();
	    act.moveToElement(driver.findElement(By.xpath("//div[@id='container']//span[3]"))).perform();
	    Thread.sleep(4000);
	    act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Cloth')]"))).click();
	    act.perform();
}
	    }
