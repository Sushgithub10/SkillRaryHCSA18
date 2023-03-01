package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePages {

	//Declartion
	@FindBy(xpath="//img[alt='SkillRary']")
	private WebElement logo;
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsTab;
	@FindBy(xpath="//ul[@class='dropdown-menu gear_menu']/descendant::a[text()='SkillRary Demo APP']")
    private WebElement skillraryDemoAppLink;
	@FindBy(xpath="//input[@placeholder='Search for courses']")
	private WebElement searchTF;
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchButton;
	
	
	//Intilization
	public HomePages (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public WebElement getLogo() {
		return logo;
	}

	public void clickgears() {
		gearsTab.click();
		
	}
	public void clickSkillraryDemoApp() {
		skillraryDemoAppLink.click();
	}
	public void searchFor(String data) {
		searchTF.sendKeys(data);
		searchButton.click();
	}
	}
	

