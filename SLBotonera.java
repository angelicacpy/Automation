package JUUKW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SLBotonera {
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
	public void botonera() throws InterruptedException {
		//botones trucha
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div[2]/div[2]/div/a[1]")).click();
		Thread.sleep(3000);

		//inicio
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(5000);
		
		//botones surubi
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div[2]/div[2]/div/a[2]")).click();
		Thread.sleep(3000);

		//inicio
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(5000);
										
		//botones pez de raya
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div[2]/div[2]/div/a[4]")).click();
		Thread.sleep(3000);

		//inicio
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(5000);
	
		//botones pez arcoiris
		/*driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div[2]/div[2]/div/a[5]")).click();
		Thread.sleep(3000);

		//inicio
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(5000);
		
		//botones angler
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div[2]/div[2]/div/a[7]")).click();
		Thread.sleep(3000);

		//inicio
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(5000);
				
		//botones pez payaso
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div[2]/div[2]/div/a[6]")).click();
		Thread.sleep(3000);*/

		//inicio
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(5000);
		
		//seleccionar idioma
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[3]/div[1]/button[1]/*[2]")).click(); 
		Thread.sleep(3000);
		
		
		// Ingles	
		driver.findElement(By.xpath("//li[contains(text(),'Inglés')]")).click(); 
		Thread.sleep(10000);
		
		
		//botones trouts
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div[2]/div[2]/div/a[1]")).click();
		Thread.sleep(4000);

		//inicio
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(5000);
			
		//botones fly
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div[2]/div[2]/div/a[2]")).click();
		Thread.sleep(3000);

		//inicio
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(5000);
					
		//botones prueba
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div[2]/div[2]/div/a[3]")).click();
		Thread.sleep(3000);

		//inicio
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(5000);
					
		//botones fishing-10
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div[2]/div[2]/div/a[4]")).click();
		Thread.sleep(3000);

		//inicio
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(5000);
				
		
		
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

}