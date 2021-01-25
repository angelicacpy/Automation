package JUUKW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SLInicio {
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
	public void RecorridoHome() throws InterruptedException {
		
		// Ir al blog		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[2]/a")).click(); 
		Thread.sleep(3000);
		
		// Ir a inicio		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click(); 
		Thread.sleep(10000);
		
		// Ir al guias		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[3]/a")).click(); 
		Thread.sleep(3000);
		
		// Ir a inicio		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click(); 
		Thread.sleep(10000);
				
		//seleccion idioma
		
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[3]/div[1]/button[1]/*[2]")).click(); 
		Thread.sleep(3000);
				
		// Ingles	
		driver.findElement(By.xpath("//li[contains(text(),'Inglés')]")).click(); 
		Thread.sleep(10000);
				
		//  blog		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[2]/a")).click(); 
		Thread.sleep(3000);
		
		// Ir a home		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click(); 
		Thread.sleep(10000);
								
		// guies		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[3]/a")).click(); 
		 Thread.sleep(3000);
		 
		// Ir a home		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click(); 
		Thread.sleep(10000);
			
						
	
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

}