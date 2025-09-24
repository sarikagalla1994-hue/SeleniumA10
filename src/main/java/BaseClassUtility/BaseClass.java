package BaseClassUtility;



	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;

	public class BaseClass {
		@BeforeSuite
		public void bs() {
			System.out.println("connect with the database");
		}
		@AfterSuite
		public void as() {
			System.out.println("disconnect with the database");
		}
		@BeforeTest
		public void bt() {
			System.out.println("BT-configuring paralle exe");
			
		}
		@AfterTest
		public void at() {
			System.out.println("AT- close parallel exe");
		}
		@BeforeClass
		public void bc() {
			System.out.println("BC-launch the browsewr");
		}
		@AfterClass
		public void ac() {
			System.out.println("AC-quit");
		}
		@BeforeMethod
		public void bm() {
			System.out.println("BM-login");
		}
		@AfterMethod
		public void am() {
			System.out.println("AM-logout");
		}

	}


