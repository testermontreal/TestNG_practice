package pack1;

import org.testng.annotations.Test;

public class LogoutTest {
	@Test(groups = { "Sanity" })
	public void logoutAdmin() {
		System.out.println("**logoutAdmin**");

	}

	@Test
	public void logoutEmployee() {
		System.out.println("**logoutEmployee**");

	}

	@Test(groups = { "Regression" })
	public void logoutGuest() {
		System.out.println("**logoutGuest**");
		System.out.println("*****************");

	}

}
