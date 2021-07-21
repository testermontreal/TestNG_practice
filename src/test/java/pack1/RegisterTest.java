package pack1;

import org.testng.annotations.Test;

public class RegisterTest {
	// @Parameters({ "URL", "username" })
	// @Test(enabled = true) // true or false for enable or disable test
	@Test
	public void registerAdmin() {
		System.out.println("**registerAdmin**");
		// System.out.println("L url est : " + urlName);
		// System.out.println("Le username est : " + username);

	}

	// @Parameters({ "URL" })
	@Test(groups = { "Sanity" })
	public void registerEmployee() {
		System.out.println("**registerEmployee**");
		// System.out.println("L url est : " + urlName);

	}

	// @Parameters({ "URL" })
	@Test
	public void registerGuest() {
		System.out.println("**registerGuest**");
		// System.out.println("L url est : " + urlName);
		System.out.println("*****************");

	}

}