package TestNG;

import org.testng.annotations.Test;

public class UsingInvocationCount {
	
	public class UsingPriorityFlag {
		@Test(priority = 2)
		public void login() {
			System.out.println("login");
			
		} @Test(priority = 1)
	       public void register() {
			System.out.println("register");
	       }
	       @Test(priority = 3 , invocationCount = 3)
	       public void create() {
	   		System.out.println("create");

	       }


}
}
