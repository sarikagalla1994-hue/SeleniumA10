package TestNG;

import org.testng.annotations.Test;

public class ThreadPoolSize {

	
	@Test(dependsOnMethods = "register")
	public void login() {
		System.out.println("login");
		
	} @Test
	//(priority = 1,enabled = true)
       public void register() {
		System.out.println("register");
       }
       @Test(dependsOnMethods = "login",invocationCount = 3,threadPoolSize = 3)
       public void create() {
   		System.out.println("create");

       }


}





