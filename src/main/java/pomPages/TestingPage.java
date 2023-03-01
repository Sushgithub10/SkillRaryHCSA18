package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestingPage {
	//Declaration
	@FindBy(xpath="/h1[@class='page-header'")
	private WebElement pageHeader;
	@FindBy(xpath="//img[@id='java']")
	private WebElement javaImage;
	@FindBy(xpath="//div[@id='cartArea']")
	private WebElement myCartArea;
	@FindBy(xpath="//footer/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookIcon;
	
	//Utilization
	public String getPageHeader() {
		return pageHeader.getText();
	}
	public WebElement getJavaImage() {
		return javaImage;
	}
	public WebElement getMyCartArea() {
		return myCartArea;
	}
	public WebElement getFacebookIcon() {
		return facebookIcon;
	}
	public void clickFacebookIcon() {
		facebookIcon.click();
	}

}
