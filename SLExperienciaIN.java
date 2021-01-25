package JUUKW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SLExperienciaIN {
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
	public void experienciasIN() throws InterruptedException {
		
		//seleccion idioma
		
				driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[3]/div[1]/button[1]/*[2]")).click(); 
				Thread.sleep(3000);
					
						
				// Ingles	
				driver.findElement(By.xpath("//li[contains(text(),'Inglés')]")).click(); 
				Thread.sleep(12000);
				
		
		//scroll hacia abajo
				JavascriptExecutor jsx = (JavascriptExecutor)driver;
				jsx.executeScript("window.scrollBy(0,250)", "");
						
		// Ir a card (trucha)		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[2]/div[1]/div[1]/div[2]/a[1]/img[1]")).click(); 
		Thread.sleep(3000);
		
		// Ir a inicio		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click(); 
		Thread.sleep(3000);
				
	   //scroll hacia abajo
		JavascriptExecutor jsx1 = (JavascriptExecutor)driver;
	   jsx1.executeScript("window.scrollBy(0,250)", "");
									
		// Ir a card (pejerrey)		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[2]/div[1]/div[1]/div[5]/a[1]/img[1]")).click(); 
		Thread.sleep(3000);
				
		// Ir a inicio		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click(); 
		Thread.sleep(3000);
						
		//scroll hacia abajo
		JavascriptExecutor jsx2 = (JavascriptExecutor)driver;
		jsx2.executeScript("window.scrollBy(0,250)", "");
		
		// Ir a card (tararira)		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[2]/div[1]/div[1]/div[7]/a[1]/img[1]")).click(); 
		Thread.sleep(3000);
						
		// Ir a inicio		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click(); 
		Thread.sleep(3000);		
				
	
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

}