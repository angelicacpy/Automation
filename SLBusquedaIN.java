package JUUKW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SLBusquedaIN {
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
	public void busquedaIN() throws InterruptedException {
		
		//seleccion idioma
		
				driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/button[1]")).click(); 
				Thread.sleep(3000);
						
				// Ingles	
				driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/button[1]/div/ul/li[2]")).click(); 
				Thread.sleep(10000);
						
				
				
		
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("trucha");		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		
		// Ir a inicio		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click(); 
		Thread.sleep(10000);
				
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("rosario");
		Thread.sleep(3000);	
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
	
		// Ir a inicio		
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click(); 
				Thread.sleep(10000);
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

}