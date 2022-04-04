package sampletext;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.get("https://www.google.co.in/");
		 File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		    
		    FileHandler.copy(src, new File("D:\\SeleniumWorkspace\\GitTest\\image\\screen.png"));
		
	}
}
