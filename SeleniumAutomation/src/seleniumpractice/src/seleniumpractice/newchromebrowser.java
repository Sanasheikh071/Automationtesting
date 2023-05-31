package seleniumpractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class newchromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\SeleniumAutomation\\src\\seleniumpractice\\Executable\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
	}

}
