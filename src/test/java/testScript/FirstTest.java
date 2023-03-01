package testScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class FirstTest extends BaseClass {

	@Test
	public void firstTest() {
		SoftAssert soft=new SoftAssert();
		
		
		home.clickgears();	
	home.clickSkillraryDemoApp();
	web.switchToChildBrowser();
	
	soft.assertEquals(demoApp.getPageHeader(),"SkillRary-ECommerce");
	demoApp.mouseHoverToCourse(web);
	demoApp.clickSeleniumTraining();
	
	soft.assertEquals(selenium.getPageHeader(),"Selenium Training");
	selenium.doubleClickPlusButton(web);
	selenium.clickAddToCart();
	web.handleAlert();
	
	soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
	soft.assertAll();
	}
	
}
