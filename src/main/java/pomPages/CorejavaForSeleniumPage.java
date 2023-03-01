package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorejavaForSeleniumPage {
	
	//Declaration
	@FindBy(xpath="//h2[@class='list_title']")
	private WebElement pageHeader;
	@FindBy(xpath="//a[text()='Core Java For Selenium Training']")
	private WebElement coreJavaForSeleniumLink;
	
	//Initialization
	public CorejavaForSeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public void clickCoreJavaForSeleniumLink() {
		coreJavaForSeleniumLink.click();
	}
	

}
