package testScript;

import java.util.List;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class FourthTest extends BaseClass {

	@Test
	public void fourhTest() {
		SoftAssert soft = new SoftAssert();
		
		home.clickgears();
		home.clickSkillraryDemoApp();
		web.switchToChildBrowser();
		soft.assertEquals(demoApp.getPageHeader(),"SkillRary_ECommerce");
		
		web.scrollToElement(demoApp.clickContactUs());
		demoApp.clickContactUs();
		
		soft.assertTrue(contact.getPageHeader().isDisplayed());
		List<String> dataList = excel.readDataFromExcel("Sheet1");
		contact.sendContactDetails(dataList.get(0),dataList.get(1),dataList.get(2),dataList.get(3));
		
		soft.assertAll();
		
		
	}
}