package ListenersUtility;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener,ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Report Configuration - Suite Execution Finished");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("Backup Suite Execution Finished");

	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Execution Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Sucess");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Screenshot - Test Failed");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Execution Skipped");

	}
	

}
