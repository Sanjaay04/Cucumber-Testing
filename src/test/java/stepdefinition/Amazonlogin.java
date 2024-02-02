package stepdefinition;

import java.util.List;
import java.util.Map;

import basee.base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import pojo.Amazonpojo;

public class Amazonlogin extends base {

	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();

	}

	@When("To launch url of amazon application")
	public void to_launch_url_of_amazon_application() {
		launchUrl(
				"https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=2504385043227200356&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9148262&hvtargid=kwd-10573980&hydadcr=14453_2371562");

	}

	@When("To sign in mouse over to sign in box")
	public void to_sign_in_mouse_over_to_sign_in_box() {
		Amazonpojo l = new Amazonpojo();
		moveTheCursor(l.getMovethecurser());
	}

	@When("To click on sign in")
	public void to_click_on_sign_in() {
		Amazonpojo l = new Amazonpojo();
		clickBtn(l.getClicksignin());

	}

	@When("To pass the email in email box")
	public void to_pass_the_email_in_email_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		Map<String, String> m = d.asMap(String.class, String.class);
		Amazonpojo l = new Amazonpojo();
		passText(m.get("emailname2"), l.getEmailtxt());
	}

	@When("To click continue button")
	public void to_click_continue_button() {
		Amazonpojo l = new Amazonpojo();
		clickBtn(l.getClickcontinue());
	}

	@When("To pass the password in password box")
	public void to_pass_the_password_in_password_box(DataTable d) {
		List<Map<String, String>> m = d.asMaps();
		Amazonpojo l = new Amazonpojo();
		passText(m.get(1).get("password2"), l.getPasswordtxt());
	}

	@When("To click sign in")
	public void to_click_sign_in() {
		Amazonpojo l = new Amazonpojo();
		clickBtn(l.getSigninsubmit());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {

	}

}
