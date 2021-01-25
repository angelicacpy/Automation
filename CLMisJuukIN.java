package JUUKW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CLMisJuukIN {
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
	public void misjuukin() throws InterruptedException {
		
		// seleccionar menu		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[3]/div/button[2]")).click(); 
		Thread.sleep(3000);
		
		// Seleccionar inicio de sesion		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[3]/div/div/div/nav/div[2]/a")).click(); 
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
			
		//seleccion idioma
		
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[3]/div[1]/button[1]/*[2]")).click(); 
		Thread.sleep(3000);
						
		// Ingles	
		driver.findElement(By.xpath("//li[contains(text(),'Inglés')]")).click(); 
		Thread.sleep(10000);
				
		// seleccionar menu		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[3]/div/button[2]/img")).click(); 
		Thread.sleep(3000);
		
		// click en mis juuk		
		driver.findElement(By.xpath("//a[contains(text(),'My Juuks')]")).click(); 
		Thread.sleep(3000);
		
		// juuk activos	
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[2]/button[1]")).click(); 
		Thread.sleep(10000);
		
		// juuk finalizados 		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[1]/div[2]/button[2]")).click(); 
		Thread.sleep(10000);
		
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

}