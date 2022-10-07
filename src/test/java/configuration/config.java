package configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class config {

	//Declaration de proper
	static Properties proper;
	
	public config() throws IOException {

		FileInputStream file = new FileInputStream("./Jeux_De_Donnees\\config.properties");

		proper = new Properties();
		proper.load(file);

	}
	
	public String getUrl() {

		String appURL = proper.getProperty("appURL");
		return appURL;
	}
	

	public String getoffresbox() {

		String appURL = proper.getProperty("offresbox");
		return appURL;
	}

	
	public String getforfaitmobile() {

		String appURL = proper.getProperty("forfaitmobile");
		return appURL;
	}
	
	public String getboxmobiles() {

		String appURL = proper.getProperty("boxmobiles");
		return appURL;
	}
	public String getTV() {

		String appURL = proper.getProperty("TV");
		return appURL;
	}
}
