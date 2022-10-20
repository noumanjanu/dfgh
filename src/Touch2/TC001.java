package Touch2;

import org.testng.annotations.Test;

import Touch1.Hug1;
import Touch1.Hug2;

public class TC001 {
@Test

public static void tc001() {
	Hug1.openapplication();
	Hug3.verifytitle();
	Hug2.login("nareshit", "nareshit");
	Hug2.Add("lala", "imran", "immu");
	Hug3.logout();
	Hug1.closeapplication();
	


}
}
