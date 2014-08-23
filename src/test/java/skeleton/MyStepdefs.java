package skeleton;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by sreenidhy on 8/23/14.
 */
public class MyStepdefs {
    @Given("^I hve (\\d+) cukes in my belly$")
    public void I_hve_cukes_in_my_belly(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        System.out.println("Create new Belly with " + arg1 + " cukes");
        //throw new PendingException();
    }

    @When("^I wait (\\d+) hour$")
    public void I_wait_hour(int arg1) throws Throwable {
        // Express the Regexp above with the code you wish you had
        System.out.println("Almost 1 hour!!");
        /*throw new PendingException();*/
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() throws Throwable {
        // Express the Regexp above with the code you wish you had
        System.out.println("Belly Growwwll!!");
        //throw new PendingException();
    }
}
