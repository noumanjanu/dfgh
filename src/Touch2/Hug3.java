package Touch2;

import org.openqa.selenium.By;

import Touch1.Hug1;

public class Hug3 extends Hug1{

	static By logout = By.linkText("Logout");
	
	public static void logout() {
		driver.findElement(logout).click();
		System.out.println("Logout Completed");
	}
	
	public static void verifytitle() {
		if(driver.getTitle().equals("OrangeHrmS")) {
			System.out.println("Title Matched");
		}else {
			System.out.println(driver.getTitle());
		}
	}
	
}
