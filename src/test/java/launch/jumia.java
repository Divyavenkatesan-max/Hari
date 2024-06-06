package launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class jumia {
	
	
	@Test
    public void home() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.jumia.com.ng/");
driver.findElement(By.xpath("//label[text()='Account']")).click();
driver.findElement(By.xpath("//a[text()='My Account']")).click();

	
	

	}
}
