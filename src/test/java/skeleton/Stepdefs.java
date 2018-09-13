package skeleton;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdefs {
    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @Given("^I wait (\\d+) hour$")
    public void I_wait_hour(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @Then("^my belly should grow$")
    public void My_have_cukes_in_my_belly() {
       System.out.print("++++++++++++run cucumber");
    }


}
