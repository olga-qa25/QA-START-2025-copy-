package org.prog.session11.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.prog.session11.DataHolder;
import org.testng.Assert;

import java.util.Random;

public class RandomTestSteps {

    private final static Random rand = new Random();

    @Given("a random number {string} under {int}")
    public void generateRandomNumber(String alias, int maxValue) {
        DataHolder.DATA.put(alias, rand.nextInt(maxValue));
    }

    @Then("number {string} is bigger than {string}")
    public void compareNumbers(String bigNumber, String smallNumber) {
        Integer big = (Integer) DataHolder.DATA.get(bigNumber);
        Integer small = (Integer) DataHolder.DATA.get(smallNumber);

        Assert.assertTrue(big >= small,
                "Number " + big + " is NOT greater than " + small);
    }
}
