package pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basee.base;

public class Amazonpojo extends base {

	public Amazonpojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	private WebElement movethecurser;
	
	@FindBy(xpath = "(//span[@class='nav-action-inner'])[1]")
	private WebElement clicksignin;
	
	@FindBy(id="ap_email")
	private WebElement emailtxt;
	
	@FindBy(id = "continue")
	private WebElement clickcontinue;
	 
	@FindBy(name = "password")
	private WebElement passwordtxt;
	
	@FindBy(id = "signInSubmit")
	private WebElement signinsubmit;

	public WebElement getMovethecurser() {
		return movethecurser;
	}

	public WebElement getClicksignin() {
		return clicksignin;
	}

	public WebElement getEmailtxt() {
		return emailtxt;
	}

	public WebElement getClickcontinue() {
		return clickcontinue;
	}

	public WebElement getPasswordtxt() {
		return passwordtxt;
	}

	public WebElement getSigninsubmit() {
		return signinsubmit;
	}
}
