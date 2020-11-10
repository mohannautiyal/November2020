package com.parallel.Tests;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebDriver {
	
	
	
	
	/*
	 * @BeforeMethod public void Setup() { WebDriverManager.chromedriver().setup();
	 * driver = new ChromeDriver();
	 * driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * System.out.println("Launching Application.."); }
	 */
	ThreadLocal<WebDriver> threaddriver = new ThreadLocal();

	
	@BeforeMethod
	public void Setup() {
		
		WebDriverManager.chromedriver().setup();
		 threaddriver.set(new ChromeDriver());
		WebDriver driver = threaddriver.get();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Launching Application.."+ Thread.currentThread().getName());
        
		
	}
	
	@Test
	public void verifyAppLaunch() {
	 WebDriver driver = threaddriver.get();

	 List<WebElement> logoelem=	driver.findElements(By.id("divLogo"));	 
	 assertTrue(logoelem.size()>0, "Logo not present");
	 System.out.println("Logo verification passed");
	}
	
	
	@Test
	public void verifyAppLogin() {
		 WebDriver driver =  threaddriver.get();

	 	driver.findElement(By.id("txtUsername")).sendKeys("Admin");	 
	 	driver.findElement(By.id("txtPassword")).sendKeys("admin123");	 
	 	driver.findElement(By.id("btnLogin")).click();	 

	 int elem=driver.findElements(By.xpath("//h1[contains(text(),'Dashboard')]")).size();
	 assertTrue(elem>0, "Login failed");
	 System.out.println("Login test successfull");
	}
	
	@AfterMethod
	public void quit() {
		 WebDriver driver =  threaddriver.get();

		System.out.println("Closing Browser...");
		driver.quit();
	}

}
