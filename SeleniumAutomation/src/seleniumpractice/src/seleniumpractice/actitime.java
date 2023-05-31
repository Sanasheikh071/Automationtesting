package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("htpp://demo.actitime.com./login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Login page titile: " + driver.getTitle());
        
          //login
        driver.findElement(By.id("Username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
        
        //close
        driver.close();
		
	}

	
}
