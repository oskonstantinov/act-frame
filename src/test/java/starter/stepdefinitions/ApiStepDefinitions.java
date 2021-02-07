package starter.stepdefinitions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;

import static org.assertj.core.api.Assertions.assertThat;

public class ApiStepDefinitions {

	private EnvironmentVariables env;
	private String apiBaseUri() {
		return EnvironmentSpecificConfiguration.from(env).getProperty("api.base.url");
	}

	@Step
	public void getRequestCode(String endpoint) {
		String fullUrl = apiBaseUri() + endpoint;
		Serenity.setSessionVariable("code")
				.to(SerenityRest.when()
						.get(fullUrl).getStatusCode());
	}

	@Step
	public void assertSuccessCode() {
		assertThat(Serenity.sessionVariableCalled("code").equals(200));
	}
}
