package Touch1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hug1 {
public static WebDriver driver;

public static void openapplication() {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	driver = new  ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("application  opened");
}

public static void closeapplication() {
	driver.close();
	System.out.println("close application");
}
}
