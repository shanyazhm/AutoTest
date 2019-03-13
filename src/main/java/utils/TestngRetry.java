package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.log4testng.Logger;

public class TestngRetry implements IRetryAnalyzer{
//	private static Logger logger = Logger.getLogger(TestngRetry.class);
	private int retryCount = 0;
	private static int maxRetryCount=3;

	public boolean retry(ITestResult result){
		if(retryCount < maxRetryCount){
			String message = "Retry for[" + result.getName() + "]on class[" +
		result.getTestClass().getName() + "]Retry" + retryCount + "times";
			
//			logger.info(message);
			
			Reporter.setCurrentTestResult(result);
//			Reporter.log("RunCount="+(retryCount + 1));
			retryCount++;
			return true;
		}
		return false;
	}
}
