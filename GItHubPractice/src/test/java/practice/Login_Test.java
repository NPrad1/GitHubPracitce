package practice;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Test {
	
	@Test
	public void actitime_Test() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		FileInputStream fis=new FileInputStream("./commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		String URL = prop.getProperty("url");
		driver.get(URL);
		System.out.println("Successfully launched");
		System.out.println("Successfully");
		driver.quit();
		
		
		
	
	}

}
