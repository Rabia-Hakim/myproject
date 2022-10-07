package Homepage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;



public class Verifyelements extends homepage{


WebElement offres_box;
WebElement Forfaits_Telephones;
WebElement Box_Mobile;
WebElement TV;

@Test
public void verification() throws Exception {
	
	
	By offresbox = By.xpath(conf.getoffresbox());
	offres_box = driver.findElement(offresbox);
	By forfaitmobiles = By.xpath(conf.getforfaitmobile());
	Forfaits_Telephones = driver.findElement(forfaitmobiles);
	By boxmobile = By.xpath(conf.getboxmobiles());
	Box_Mobile = driver.findElement(boxmobile);
	By Tv = By.xpath(conf.getTV());
	TV = driver.findElement(Tv);
	
	HighlightMyElement(offres_box);
	HighlightMyElement(Forfaits_Telephones);
	HighlightMyElement(Box_Mobile);
	HighlightMyElement(TV);
	
	getScreenshot("verification_menu");

}
		
		public void HighlightMyElement(WebElement element) throws Exception {
		
			JavascriptExecutor javascript = (JavascriptExecutor) driver;
			javascript.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
					"color: orange; border: 4px solid yellow");
		
			}
		
	
		private void getScreenshot(String capture) throws IOException {

			
			File File = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

			//random char
			//name+randomchar
			
			File targetLocation = new File("./captures/"+capture+".png");

			FileUtils.copyFile(File, targetLocation);
			}
}	
		


