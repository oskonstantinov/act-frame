package starter.steps;

import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.stepdefinitions.UiStepDefinitions;

public class UiSteps {

	@Steps
	UiStepDefinitions definitions;

	@When("^user open the Yandex main page and check logo$")
	public void openYandex() {
		definitions.openYandexSearchAndCheckSuccess();
	}
}

