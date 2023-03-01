package testScript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibraries.BaseClass;

public class SecondTest extends BaseClass {

	@Test
	
	public void SecondTest() {
		SoftAssert soft =new SoftAssert();
		 home.clickgears();
		 home.clickSkillraryDemoApp();
		 web.switchToChildBrowser();
		 
		 soft.assertEquals(demoApp.getPageHeader(),"SkillRary-ECommerce");
		 demoApp.selectCategory(web,1);
		 
		 soft.assertEquals(testing.getPageHeader(),"Testin");
		 web.dragAndDrop(testing.getJavaImage(),testing.getMyCartArea());
		 web.scrollToElement(testing.clickFacebookIcon());
		 testing.clickFacebookIcon();
		 
		 soft.assertAll();
	}
	
	
	
}
