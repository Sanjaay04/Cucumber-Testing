package stepdefinition;

import basee.base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends base {
     @Before
     private void precondition() {
		launchBrowser();
		windowMaximize();

	}@After
     private void postcondition() {
		closeEntireBrowser();

	}
}
