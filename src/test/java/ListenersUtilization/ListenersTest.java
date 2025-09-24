package ListenersUtilization;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;
@Listeners(ListenersUtility.Listeners.class)
public class ListenersTest extends BaseClass {
	@Test
	
	public void demo()
	{ 
		System.out.println("Listeners Test");
		Assert.fail();
	}
    @Test(dependsOnMethods = "demo")
     public void demo1() {
    	System.out.println("demo1");
    }
}
