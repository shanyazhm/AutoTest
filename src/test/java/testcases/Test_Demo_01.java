package testcases;

import io.qameta.allure.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import utils.TestngRetry;

public class Test_Demo_01 {
  @Test
  @Description("用于测试xx功能")
  @Step("第一步、第二步")
  @Story("第一组用例")
  @Feature("功能1")
  public void test_01() {
	  
	  Assert.assertEquals(true, false);
  }
  
  
}
