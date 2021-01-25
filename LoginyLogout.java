package JUUKW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LoginyLogout {
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
	public void loginlogout() throws InterruptedException {
		
		
		//seleccion idioma
		
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[3]/div[1]/button[1]/*[2]")).click(); 
		Thread.sleep(3000);
						
		// Ingles	
		driver.findElement(By.xpath("//li[contains(text(),'Inglés')]")).click(); 
		Thread.sleep(10000);
		
		// seleccionar menu		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/button[2]")).click(); 
		Thread.sleep(3000);
		
		// Seleccionar inicio de sesion		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/a[1]")).click(); 
		Thread.sleep(3000);
				
		// ingresar email	
		driver.findElement(By.name("email")).sendKeys("sansa@yopmail.com"); 
		Thread.sleep(3000);
				
		// ingresar pass		
		driver.findElement(By.name("password")).sendKeys("Tiarg1234"); 
		Thread.sleep(3000);
						
		// ingresar 		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/a[1]")).click(); 
		Thread.sleep(10000);
							
		// seleccionar menu		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/button[2]")).click(); 
		Thread.sleep(3000);
		
		// cerrar sesion		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[11]/a[1]")).click(); 
		Thread.sleep(3000);
		
		// Confirmar cerrar sesion		
		driver.findElement(By.xpath("//button[contains(text(),'Yes')]")).click(); 
		Thread.sleep(10000);
		
		
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

}