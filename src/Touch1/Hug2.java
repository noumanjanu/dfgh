package Touch1;

import org.openqa.selenium.By;

public class Hug2 extends Hug1 {
	
	static By username = By.name("txtUserName");
	static By password = By.name("txtPassword");
	static By login = By.name("Submit");
	static By Add = By.xpath("//input[@value='Add']");
	static By emplname = By.name("txtEmpLastName");
	static By empfname = By.name("txtEmpFirstName");
	static By empnname = By.name("txtEmpNickName");
	static By save = By.id("btnEdit");

	public static void login(String un,String pw) {
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pw);
		driver.findElement(login).click();
		System.out.println("login completed");
	}

	public static void Add(String ln,String fn,String nn) {
		driver.switchTo().frame("rightMenu");
		driver.findElement(Add).click();
		driver.findElement(emplname).sendKeys(ln);
		driver.findElement(empfname).sendKeys(fn);
		driver.findElement(empnname).sendKeys(nn);
		driver.findElement(save).click();
		driver.switchTo().defaultContent();
		System.out.println("Add button completed");
	}
}
