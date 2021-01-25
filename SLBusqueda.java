package JUUKW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SLBusqueda {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\angel\\eclipse-workspace\\IT\\Drivers\\chromedriver1.exe");
		driver = new ChromeDriver();

		driver.get("https://juukweb-qa.tiarg.net.ar/"); // Ir a la URL

		driver.manage().window().maximize(); // Maximizar pagina

		Thread.sleep(3000);
	}

	@Test
	public void busqueda() throws InterruptedException {
		
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("dorado");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/*[1]")).click();
		Thread.sleep(3000);
		
		// Ir a inicio		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click(); 
		Thread.sleep(10000);
				
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("bariloche");
		Thread.sleep(3000);				
	

		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/*[1]")).click();
		Thread.sleep(3000);
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

}