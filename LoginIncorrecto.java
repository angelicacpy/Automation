package JUUKW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LoginIncorrecto {
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
	public void loginInc() throws InterruptedException {
		
		// seleccionar menu		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[3]/div/button[2]")).click(); 
		Thread.sleep(3000);
		
		// Seleccionar inicio de sesion		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[3]/div/div/div/nav/div[2]/a")).click(); 
		Thread.sleep(3000);
				
		// ingresar email	
		driver.findElement(By.name("email")).sendKeys("sansa@yopmailcom"); 
		Thread.sleep(3000);
				
		// ingresar pass		
		driver.findElement(By.name("password")).sendKeys("Tiarg1234"); 
		Thread.sleep(3000);
						
		// ingresar 		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[3]/div[3]/a[1]")).click(); 
		Thread.sleep(10000);
							
		// seleccionar menu		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[3]/div/button[2]/img")).click(); 
		Thread.sleep(3000);
		
		// cerrar sesion		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[3]/div/div/div/nav/div[9]/a")).click(); 
		Thread.sleep(3000);
		
		// Confirmar cerrar sesion		
		driver.findElement(By.xpath("//button[contains(text(),'Si')]")).click(); 
		Thread.sleep(10000);
		
		
		
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

}