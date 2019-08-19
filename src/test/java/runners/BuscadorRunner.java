package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
		features = "src/test/resources/features/Buscador.feature",
		tags= "@CasoExitoso",
		glue="definitions", 
		snippets= SnippetType.CAMELCASE)

public class BuscadorRunner {

}
