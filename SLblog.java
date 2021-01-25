package JUUKW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SLblog {
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
	public void blog() throws InterruptedException {
		
		// Ir a blog		
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click(); 
		Thread.sleep(3000);
		
		//1 noticia
		driver.findElement(By.xpath("//h1[contains(text(),'Matias Curuchet: El Guia del Rio Limay')]")).click(); 
		Thread.sleep(3000);
		
		//menu blog
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click(); 
		Thread.sleep(3000);

		//scroll hacia abajo
				JavascriptExecutor jsx1 = (JavascriptExecutor)driver;
				jsx1.executeScript("window.scrollBy(0,350)", "");
								
		//2 noticia
		driver.findElement(By.xpath("//h1[contains(text(),'pesca de surubi')]")).click(); 
		Thread.sleep(3000);
				
		//menu blog
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click(); 
		Thread.sleep(3000);

		
		//scroll hacia abajo
				JavascriptExecutor jsx2 = (JavascriptExecutor)driver;
				jsx2.executeScript("window.scrollBy(0,950)", "");
								
		//3 noticia
		driver.findElement(By.xpath("//h1[contains(text(),'pesca tiburon martillo')]")).click(); 
		Thread.sleep(3000);
				
		//menu blog
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click(); 
		Thread.sleep(3000);

		
		//scroll hacia abajo
				JavascriptExecutor jsx3 = (JavascriptExecutor)driver;
				jsx3.executeScript("window.scrollBy(0,1850)", "");
								
		//5 noticia
		driver.findElement(By.xpath("//h1[contains(text(),'Pesca en buenos aires')]")).click(); 
		Thread.sleep(3000);
				
		//menu blog
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click(); 
		Thread.sleep(3000);

			
		
		//seleccion idioma
		
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[3]/div[1]/button[1]/*[2]")).click(); 
		Thread.sleep(3000);
			
				
		// Ingles	
		driver.findElement(By.xpath("//li[contains(text(),'Inglés')]")).click(); 
		Thread.sleep(10000);
		
		// Ir a blog		
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click(); 
		Thread.sleep(3000);
		
		//1 noticia
		driver.findElement(By.xpath("//h1[contains(text(),'Matias Curuchet: The guide for Limay river')]")).click(); 
		Thread.sleep(3000);
		
		//menu blog
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click(); 
		Thread.sleep(3000);
		
		
		//scroll hacia abajo
		JavascriptExecutor jsx4 = (JavascriptExecutor)driver;
		jsx4.executeScript("window.scrollBy(0,350)", "");
						
		//2 noticia
		driver.findElement(By.xpath("//h1[contains(text(),'Fishing a big hobby')]")).click(); 
		Thread.sleep(3000);
		
		//menu blog
		driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click(); 
Thread.sleep(3000);

	
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

}