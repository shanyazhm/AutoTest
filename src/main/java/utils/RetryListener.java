package utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

/**
 * 添加用例失败重跑监听器
 * @author luckyrabbit
 *
 */
public class RetryListener implements IAnnotationTransformer{
	
	  public void transform(ITestAnnotation annotation, Class testClass,
		      Constructor testConstructor, Method testMethod){
		 IRetryAnalyzer retry = annotation.getRetryAnalyzer();
		 if (null == retry){
			 annotation.setRetryAnalyzer(TestngRetry.class);
		 }		 
	  }
}
