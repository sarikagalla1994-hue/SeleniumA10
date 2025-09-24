package TestNG;

import org.testng.annotations.Test;

public class UsingEnabled {
	
	public class UsingPriorityFlag {
		@Test(priority = 2,enabled = true)
		public void login() {
			System.out.println("login");
			
		} @Test(priority = 1,enabled = true)
	       public void register() {
			System.out.println("register");
	       }
	       @Test(priority = 3,enabled = true)
	       public void create() {
	   		System.out.println("create");

	       }


	}

}
