package GenericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomPages.ContactUsPage;
import pomPages.CorejavaForSeleniumPage;
import pomPages.CorejavaVideoPage;
import pomPages.HomePages;
import pomPages.SeleniumTrainingPage;
import pomPages.SkillraryDemoAppPage;
import pomPages.TestingPage;


public class BaseClass {
	
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected WebDriver driver;
	protected HomePages home;
	protected SkillraryDemoAppPage demoApp;
	protected SeleniumTrainingPage selenium;
	protected TestingPage testing;
	protected CorejavaForSeleniumPage coreJava;
	protected CorejavaVideoPage javaVideo;
	protected ContactUsPage contact;
	
 //@BeforeSuite
 //@beforeTest
	
 @BeforeClass
 public void classConfiguration() {
	  property=new PropertiesUtility();
	 excel=new ExcelUtility();
	 web=new WebDriverUtility();
	 
	 property.propertiesIntialization(iConstantPath.PROPERTIES_FILE_PATH);
	 excel.excelInitialization(iConstantPath.EXCEL_FILE_PATH);
 }
 @BeforeMethod
 public void methodConfiguration() {
	 long time=Long.parseLong(property.fetchProperty("timeouts"));
	 web.openApplication(property.fetchProperty("browser"),
	 property.fetchProperty("url"),time);
	 
	 home=new HomePages(driver);
	 Assert.assertTrue(home.getLogo().isDisplayed());
	 demoApp=new SkillraryDemoAppPage(driver);
	 selenium=new SeleniumTrainingPage(driver);
	 testing= new TestingPage();
	 coreJava=new CorejavaForSeleniumPage(driver);
	 javaVideo=new CorejavaVideoPage(driver);
	 contact=new ContactUsPage(driver);
	 
	 
 }
 
 @AfterMethod
 public void methodTeardown() {
	 web.quitBrowser();
 }
 @AfterClass
 public void classTeardown() {
	 excel.closeExcel();
 }
 
 //@AfterTest
 //@AfterSuite
}
