package JUUKW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SLFiltrosEs {
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
	public void filtroses() throws InterruptedException {
		
		//filtros
		driver.findElement(By.xpath("//*[@id=\"__next\"]/section/div[2]/div[1]/button")).click();
		Thread.sleep(3000);
		
		//scroll hacia abajo
		/*JavascriptExecutor jsx16 = (JavascriptExecutor)driver;
		jsx16.executeScript("window.scrollBy(0,150)", "");
						
		//ver todo PAISES
        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")).click();
		Thread.sleep(3000);
		
		//seleccionar vario paises
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/input[1]")).click();
		Thread.sleep(3000);
							
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/input[1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[8]/input[1]")).click();
		Thread.sleep(3000);
		
		//Cerrar cuadro 
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]/img[1]")).click();
				Thread.sleep(3000);
				
		//scroll hacia arriba 
		JavascriptExecutor jsx17 = (JavascriptExecutor)driver;
		jsx17.executeScript("window.scrollBy(0,-150)", "");
					
		//Limpiar Filtros
		driver.findElement(By.xpath("//button[contains(text(),'Limpiar Filtros')]")).click();
		Thread.sleep(3000);
											
		
		
		//scroll hacia abajo
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		jsx.executeScript("window.scrollBy(0,450)", "");
				
		
		//ver todo ESPECIES
        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[8]/button[1]")).click();
		Thread.sleep(3000);
		
		//seleccionar varias especies
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[1]/div[3]/div[1]/input[1]")).click();
		Thread.sleep(3000);
					
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[1]/div[3]/div[2]/input[1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[1]/div[3]/div[4]/input[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[1]/div[3]/div[6]/input[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[1]/div[3]/div[7]/input[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[1]/div[3]/div[9]/input[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[1]/div[3]/div[11]/input[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[1]/div[3]/div[30]/input[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[1]/div[3]/div[38]/input[1]")).click();
		Thread.sleep(3000);
		
		//Cerrar cuadro 
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[8]/div[1]/div[2]/button[1]/img[1]")).click();
		Thread.sleep(3000);
		
		//scroll hacia arriba 
		JavascriptExecutor jsx1 = (JavascriptExecutor)driver;
		jsx1.executeScript("window.scrollBy(0,-450)", "");
			
		//Limpiar Filtros
		driver.findElement(By.xpath("//button[contains(text(),'Limpiar Filtros')]")).click();
		Thread.sleep(3000);*/
												
		//scroll hacia abajo
		JavascriptExecutor jsx2 = (JavascriptExecutor)driver;
		jsx2.executeScript("window.scrollBy(0,950)", ""); 
				
		//seleccionar ambiente
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[15]/input[1]")).click();
		Thread.sleep(7000);
							
		//scroll hacia abajo
		JavascriptExecutor jsx18 = (JavascriptExecutor)driver;
		jsx18.executeScript("window.scrollBy(0,950)", ""); 
				
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[17]/input[1]")).click();
		Thread.sleep(7000);
		
		//scroll hacia abajo
		JavascriptExecutor jsx19 = (JavascriptExecutor)driver;
		jsx19.executeScript("window.scrollBy(0,950)", ""); 
				
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[19]/input[1]")).click();
		Thread.sleep(7000);
			
		//scroll hacia arriba 
		JavascriptExecutor jsx3 = (JavascriptExecutor)driver;
		jsx3.executeScript("window.scrollBy(0,-950)", ""); 
		
		//Limpiar Filtros
		driver.findElement(By.xpath("//button[contains(text(),'Limpiar Filtros')]")).click();
		Thread.sleep(3000);
		
		//scroll hacia abajo
		JavascriptExecutor jsx4 = (JavascriptExecutor)driver;
		jsx4.executeScript("window.scrollBy(0,950)", "");
		
		
		//ver todo SERVICIOS
        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[20]/button[1]")).click();
		Thread.sleep(5000);
	
		
		//seleccionar varios servicios
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/div[20]/div[1]/div[3]/div[1]/input[1]")).click();
		Thread.sleep(5000);
							
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/div[20]/div[1]/div[3]/div[5]/input[1]")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/div[20]/div[1]/div[3]/div[12]/input[1]")).click();
		Thread.sleep(5000);
				
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/div[20]/div[1]/div[3]/div[14]/input[1]")).click();
		Thread.sleep(5000);
				
		//Cerrar cuadro 
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[20]/div[1]/div[2]/button[1]/img[1]")).click();
		Thread.sleep(5000);
				
		//scroll hacia arriba 
		JavascriptExecutor jsx5 = (JavascriptExecutor)driver;
		jsx5.executeScript("window.scrollBy(0,-950)", "");
		
		//Limpiar Filtros
		driver.findElement(By.xpath("//button[contains(text(),'Limpiar Filtros')]")).click();
		Thread.sleep(3000);
		
		//scroll hacia abajo
		JavascriptExecutor jsx6 = (JavascriptExecutor)driver;
		jsx6.executeScript("window.scrollBy(0,1250)", "");
				
		
		//Estilos de pesca
        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[27]/input[1]")).click();
		Thread.sleep(3000);	
		
		
		 driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[29]/input[1]")).click();
		Thread.sleep(3000);	
			
		//scroll hacia arriba 
		JavascriptExecutor jsx7 = (JavascriptExecutor)driver;
		jsx7.executeScript("window.scrollBy(0,-1250)", ""); 
		
		//Limpiar Filtros
		driver.findElement(By.xpath("//button[contains(text(),'Limpiar Filtros')]")).click();
		Thread.sleep(3000);
		
		//scroll hacia abajo
		JavascriptExecutor jsx8 = (JavascriptExecutor)driver;
		jsx8.executeScript("window.scrollBy(0,1450)", "");
						
				
		//Tipo de Agua
	    driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[33]/input[1]")).click();
		Thread.sleep(3000);	
		
		 driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[34]/input[1]")).click();
		Thread.sleep(3000);	
		
		//scroll hacia arriba 
		JavascriptExecutor jsx9 = (JavascriptExecutor)driver;
		jsx9.executeScript("window.scrollBy(0,-1450)", ""); 
		
		//Limpiar Filtros
		driver.findElement(By.xpath("//button[contains(text(),'Limpiar Filtros')]")).click();
		Thread.sleep(3000);
		
		//scroll hacia abajo
		JavascriptExecutor jsx10 = (JavascriptExecutor)driver;
		jsx10.executeScript("window.scrollBy(0,1500)", "");
	
		//Tipo de Salida
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/div[36]/input[1]")).click();
		Thread.sleep(3000);	
		
		 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/div[37]/input[1]")).click();
		Thread.sleep(3000);	
		
		//scroll hacia arriba 
		JavascriptExecutor jsx11 = (JavascriptExecutor)driver;
		jsx11.executeScript("window.scrollBy(0,-1500)", ""); 
		
		//Limpiar Filtros
		driver.findElement(By.xpath("//button[contains(text(),'Limpiar Filtros')]")).click();
		Thread.sleep(3000);
		
		//scroll hacia abajo
		JavascriptExecutor jsx12 = (JavascriptExecutor)driver;
		jsx12.executeScript("window.scrollBy(0,1650)", "");
			
		//Tipo de Moneda
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[39]/input[1]")).click();
		Thread.sleep(3000);	
				
	    driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[41]/input[1]")).click();
		Thread.sleep(3000);	
		
		 driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[42]/input[1]")).click();
		Thread.sleep(3000);	
				
		//scroll hacia arriba 
		JavascriptExecutor jsx13 = (JavascriptExecutor)driver;
		jsx13.executeScript("window.scrollBy(0,-1650)", ""); 
				
		//Limpiar Filtros
		driver.findElement(By.xpath("//button[contains(text(),'Limpiar Filtros')]")).click();
		Thread.sleep(3000);
		
		//scroll hacia abajo
		JavascriptExecutor jsx14 = (JavascriptExecutor)driver;
		jsx14.executeScript("window.scrollBy(0,1700)", "");
					
		//Tipo deAlojamiento
		driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[44]/input[1]")).click();
		Thread.sleep(3000);	
						
	    driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[3]/div[1]/div[1]/div[1]/div[45]/input[1]")).click();
		Thread.sleep(3000);	
				
	   	//scroll hacia arriba 
		JavascriptExecutor jsx15 = (JavascriptExecutor)driver;
		jsx15.executeScript("window.scrollBy(0,-1700)", ""); 
						
		//Limpiar Filtros
		driver.findElement(By.xpath("//button[contains(text(),'Limpiar Filtros')]")).click();
		Thread.sleep(3000);
			
	
	}

	@AfterClass
	public void afterClass() {
		driver.close();

	}

}



