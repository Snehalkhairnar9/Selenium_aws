package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sneha\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/sneha/Desktop/login.html");
		driver.findElement(By.name("username")).sendKeys("abc");
	driver.findElement(By.name("password")).sendKeys("Abc");
		// TODO Auto-generated method stub
	}

}
