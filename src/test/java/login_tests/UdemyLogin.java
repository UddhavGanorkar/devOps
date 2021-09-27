package login_tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class UdemyLogin {
 WebDriver driver;
	@Test
  public void f() throws Exception{
		
		driver.get("https://www.udemy.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Log in']")).click();
		//driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
	//	driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.name("submit")).click();
		//boolean x = driver.findElement(By.xpath("//div[contains(text(),'We found your account."))
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest()throws Exception {
	  Thread.sleep(2000);
	  driver.quit();
  }

}
