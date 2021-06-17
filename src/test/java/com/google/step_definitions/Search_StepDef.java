package com.google.step_definitions;

import com.google.pages.Google;
import com.google.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search_StepDef {

    Google google = new Google();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @When("user enters {string}")
    public void user_enters(String string) {
        google.searchBox.sendKeys(string + Keys.ENTER);

    }

    @Then("user sees {string} in the title")
    public void user_sees_in_the_title(String expectedTitle) {
        wait.until(ExpectedConditions.titleContains("apple"));

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
