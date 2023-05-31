package seleniumpractice;


    import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.support.ui.Select;

	public class MMT {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver = setUp("chrome");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.redbus.in/bus-tickets/swargate-to-panjim?fromCityName=Swargate%2C%20Pune&fromCityId=67159&toCityName=Panjim%2C%20Goa&toCityId=66289&onward=22-Jun-2023&srcCountry=IND&destCountry=IND&opId=0&busType=Any");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("ul>li>label[for=\"dtBefore 6 am\"]")).click();
			driver.findElement(By.cssSelector("ul>li>label[for=\"bt_AC\"]")).click();
		     
			Thread.sleep(2000);
		       List<WebElement> searchitem=driver.findElements(By.cssSelector(".bus-items>div>li>div>div>div>div>.travels"));		
		   	Thread.sleep(8000);
				System.out.println("Bus Names count is: "+searchitem.size());
				Thread.sleep(2000);
				for(int i = 0 ; i < searchitem.size() ; i++) {
				       Thread.sleep(2000);
				       System.out.println("Bus Name : "+searchitem.get(i).getText());			       
				       Thread.sleep(2000);
				   }
						
				 List<WebElement> Price=driver.findElements(By.cssSelector(".bus-items>div>li>div>div>div>.column-seven>div>div>span"));
				  System.out.println("Bus Price count is: "+Price.size());
					
					for(int i = 0 ; i < Price.size() ; i++) {
					       Thread.sleep(2000);
					       System.out.println("Bus Price : "+Price.get(i).getText());			       
					       Thread.sleep(2000);
					   }
				  
		}
		
		public static WebDriver setUp(String browsername) {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sony\\eclipse-workspace\\SeleniumAutomation\\src\\seleniumpractice\\Executable\\chromedriver.exe");
				return new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sony\\eclipse-workspace\\SeleniumAutomation\\src\\seleniumpractice\\Executable\\geckodriver.exe");
				return new FirefoxDriver();
			} else if (browsername.equalsIgnoreCase("ie")) {
				//1. Set the required browser driver executable path using: System.setProperty(key, value);/
				System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
				//2. After setting the path of driver executable, create an instance of required browser/
				return new InternetExplorerDriver();
			}
			return null;
		}

	//}

	}

//}
