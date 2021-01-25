package JUUKW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class SLCarruselES {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\angel\\eclipse-workspace\\IT\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get("https://juukweb-qa.tiarg.net.ar/"); // Ir a la URL

		driver.manage().window().maximize(); // Maximizar pagina

		Thread.sleep(3000);
	}

	@Test
	public void carruseles() throws InterruptedException {
		
		//Seleccionar 1 slider
		driver.findElement(By.xpath("/html/body/div/section/div[1]/div[2]/ul[2]/li[1]/button")).click();
		Thread.sleep(1000);
		
		//clic para ingresar 
		driver.findElement(By.xpath("/html/body/div/section/div[1]/div[2]")).click();
		Thread.sleep(5000);
			
		// Ir a inicio		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/ul/li[1]/a")).click(); 
		Thread.sleep(10000);
		
		//Seleccionar 2 slider
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/ul[2]/li[2]/button[1]")).click();
		Thread.sleep(1000);
				
		//clic para ingresar 
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/div[1]/div[1]/h4[1]")).click();
		Thread.sleep(5000);
					
		// Ir a inicio		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/ul/li[1]/a")).click(); 
		Thread.sleep(10000);
						
						
	
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

}