package launch;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {
	@Before
	public void before() {
    	Date d=new Date();
		System.out.println("Before Date"+d);
		System.out.println("Before");
 
	}

	@After
	public void after() {
		Date d=new Date();
		System.out.println("After Date"+d);
		System.out.println("after");

	}
	
	
	static WebDriver driver;
	@BeforeClass

	public static void Beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	
	
	@AfterClass
	public static void afterclass() {
		driver.quit();
		System.out.println("afterclass");

	}
	
	
	@Test
	public void test2() {
	driver.get("https://www.facebook.com/");
	 driver.get("https://www.facebook.com/");
     WebElement crtbtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
     crtbtn.click();
     WebElement first = driver.findElement(By.name("firstname"));
     first.sendKeys("Divya");
     WebElement last = driver.findElement(By.name("lastname"));
     last.sendKeys("Bharathi");
     System.out.println("---Test2------");
     

	}

	
	@Test
	public void test1() {
	 driver.get("https://www.facebook.com/");
     WebElement user = driver.findElement(By.id("email"));
     user.sendKeys("Abcd");
     WebElement pwd = driver.findElement(By.id("pass"));
     pwd.sendKeys("12345");
     WebElement btn = driver.findElement(By.name("login"));
     btn.click();
     
     System.out.println("---Test1------");
	}
	
	@Ignore//it will beignore partticular case
	@Test
	public void test3() {
		System.out.println("Test3");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
