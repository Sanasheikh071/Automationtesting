import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1  {

	public static void main(String[] args) {
		//chromedriver.exe-> chrome browser
		System.setProperty("webdriver.chrome.driver"," E:\\Program files\\downloads\\chromedriver.exe");
		
		//webdriver.chrome.driver-> value of path
	WebDriver driver = new ChromeDriver();
	

	}

}
