package pack2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DateDrivenTest {
	@Test(dataProvider = "userLogin")
	public void testLogin(String userName, String password) {
		System.out.println("L utilisateur : **"+userName+"** ayaynt le password **"+password+"** est connecte");
	}
	@DataProvider(name="userLogin")
	public Object[][] loginData() {
		Object[][] users = { { "admin", "admin123" }, { "employee", "employee123" }, { "guest", "guest123" } };
		return users;
	}

}
