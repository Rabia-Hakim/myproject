package Homepage;


import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.Assert;
import org.openqa.selenium.TakesScreenshot;
import java.io.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import configuration.config;

public class homepage {

	WebDriver driver;
	WebElement but_accepter;
	config conf;
	String test;
	
	@BeforeTest
	
	public void setup() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		conf = new config();
		driver.get(conf.getUrl());
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		but_accepter = driver.findElement(By.xpath("//a[@class='A']"));
		but_accepter.click();
				
		System.out.println(test);
		
		
		//WebElement test = driver.findElement(offres_box);
		//test.click();
	}
	
@AfterTest
	
	public void closeApp() throws Exception {
		
		Thread.sleep(5000);
		driver.close();
	}
	
	
}
