package JUUKW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SLReservarIN {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\angel\\eclipse-workspace\\IT\\Drivers\\chromedriver1.exe");
		driver = new ChromeDriver();

		driver.get("https://juukweb-qa.tiarg.net.ar/"); // Ir a la URL

		driver.manage().window().maximize(); // Maximizar pagina

		Thread.sleep(3000);
	}
	
	@Test
	public void reservasin() throws InterruptedException {
		
		//seleccion idioma
		
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[3]/div[1]/button[1]/*[2]")).click(); 
		Thread.sleep(3000);
						
						
	     // Ingles	
		driver.findElement(By.xpath("//li[contains(text(),'Inglés')]")).click(); 
		Thread.sleep(10000);
				
				
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("MPD");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/*[1]")).click();
		Thread.sleep(3000);
					
		// seleccionar Experiencia		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[2]/div[2]/div[1]/div[1]/a[1]/img[1]")).click(); 
		Thread.sleep(3000);
		
		//scroll hacia abajo
		JavascriptExecutor jsx1 = (JavascriptExecutor)driver;
		jsx1.executeScript("window.scrollBy(0,1920)", "");
						
				
		// click en  cantidad pescadores		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[9]/div[1]/select[1]")).click(); 
		Thread.sleep(3000);
	
		// click en opcion	
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[9]/div[1]/select[1]/option[3]")).click(); 
		Thread.sleep(3000);
		
								
		//Elegir 1fecha
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[9]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[4]/div[6]")).click(); 
		Thread.sleep(3000);
			
		
		//click en reservar
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[9]/div[3]/button[1]")).click(); 
		Thread.sleep(3000);
		
		//click cuadro iniciar sesion
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[1]/div[1]")).click(); 
				Thread.sleep(3000);
						
				// ingresar email	
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")).sendKeys("sansa@yopmail.com"); 
				Thread.sleep(3000);
								
				// ingresar pass		
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Tiarg1234"); 
				Thread.sleep(3000);
				
				// ingresar 		
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/div[3]/div[1]/div[3]/a[1]")).click(); 
				Thread.sleep(3000);
				
				//scroll hacia abajo
				JavascriptExecutor jsx2 = (JavascriptExecutor)driver;
				jsx2.executeScript("window.scrollBy(0,1930)", "");
										
						
								
						
				//click en reservar
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[9]/div[3]/button[1]")).click(); 
				Thread.sleep(5000);
				
				
			}

			@AfterClass
			public void afterClass() {
				driver.close();

			}

		}