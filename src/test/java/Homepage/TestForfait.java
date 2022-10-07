package Homepage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;



public class TestForfait extends homepage{
	
	WebElement Forfaits_Telephones;
	WebElement Samsung;
	WebElement Test;
	WebElement close_but;
	WebElement pass;
	WebElement check;
@Test
	public void forfait() throws Exception{
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		By forfaitmobiles = By.xpath(conf.getforfaitmobile());
		Forfaits_Telephones = driver.findElement(forfaitmobiles);
		Forfaits_Telephones.click();
		Thread.sleep(5000);
		Samsung = driver.findElement(By.xpath("//span[@id='btnadd2basket_galaxy_s22_128go_watch5']"));
		Samsung.click();
		Thread.sleep(5000);
		
		
		close_but = driver.findElement(By.xpath("//a[@class='btn close-btn']"));
		close_but.click();
		pass = driver.findElement(By.xpath("//section[@id='Fac']/div[1]/div[1]/span[1]"));
		pass.click();
		Thread.sleep(5000);
		check = driver.findElement(By.xpath("//div[@class='headerPayment__icon']//span"));
		check.click();
	}
	}
	
