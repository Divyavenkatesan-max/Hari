package launch;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window{
	static WebDriver driver;
	@BeforeClass
	public static void brow() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
	}
	@Test
	public void page1() throws InterruptedException {
     driver.get("https://www.flipkart.com/");
     WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
	 search.sendKeys("iphone",Keys.ENTER);	 
	 WebElement iphone = driver.findElement(By.xpath("//div[contains(text(),'Apple iPhone 15 (Blue, 128 GB)')]"));
	 iphone.click();
	 Set<String> w1 = driver.getWindowHandles();
	 List<String>l=new LinkedList<String>();
	 l.addAll(w1);
	 driver.switchTo().window(l.get(1));
	 Thread.sleep(3000);
	 WebElement card = driver.findElement(By.xpath("//button[text()='Add to cart']"));
	card.click();
	
//	 String w1 = driver.getWindowHandle();
	
//	 Set<String> w2 = driver.getWindowHandles();
//   System.out.println(w2);
//	 for (String each : w2) {
//		 if (!each.equals(w1)) {
//			 driver.switchTo().window(each);	
//	}
//	}

	}
	@AfterClass
	public static void end() {
	System.out.println("closed");

}
}
