package JUUKW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SLContacto {
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
	public void contacto() throws InterruptedException {
		
		//contactos
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/a")).click();
		Thread.sleep(3000);
		
		// Whatsapp
		driver.findElement(By.xpath("/html/body/div/section/div/div/div[1]/a/div/span[2]")).click();
		Thread.sleep(3000);
		
		// correo
		driver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/a/div/span[2]")).click();
		Thread.sleep(3000);
		
		//inicio
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/div[1]/div/a/img")).click();
		Thread.sleep(3000);
						
		//seleccionar idioma
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[3]/div[1]/button[1]/*[2]")).click(); 
		Thread.sleep(3000);
				
				
		// Ingles	
		driver.findElement(By.xpath("//li[contains(text(),'Inglés')]")).click(); 
		Thread.sleep(10000);
				
		//contact
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/a")).click();
		Thread.sleep(3000);
				
		// Whatsapp
		driver.findElement(By.xpath("/html/body/div/section/div/div/div[1]/a/div/span[2]")).click();
		Thread.sleep(3000);
				
		// correo
		driver.findElement(By.xpath("/html/body/div/section/div/div/div[2]/a/div/span[2]")).click();
		Thread.sleep(3000);	
				
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

}