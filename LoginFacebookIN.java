package JUUKW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class LoginFacebookIN {
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
	public void InicioFacebook() throws InterruptedException {
		
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
		driver.findElement(By.xpath("//*/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/nav[1]/div[2]/a[1]")).click(); 
		Thread.sleep(3000);
		
		// ingresar facebook
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[5]/button[2]")).click(); 
				Thread.sleep(3000);
		
				
		// ingresar a cuenta		
		//driver.findElement(By.name("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[2]")).click();
		//Thread.sleep(3000);
						
		// ingresar mail 		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("angelica_angels@hotmail.com"); 
		Thread.sleep(3000);
							
				
		// ingresar contraseña 		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("rocco1984."); 
		Thread.sleep(3000);
									
		// click iniciar sesion
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/button[1]")).click(); 
		Thread.sleep(3000);
						
		
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