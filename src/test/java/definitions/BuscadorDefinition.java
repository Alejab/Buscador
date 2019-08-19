package definitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import questions.MasDeSeisResultados;
import tasks.RealizarLaBusqueda;
import tasks.Seleccionar;
import userinterfaces.PaginaGoogle;

public class BuscadorDefinition {

	@Managed(driver="chrome")
	private WebDriver navegadorChrome;
	
	@Before
	public void configuracionInicial() {
		OnStage.setTheStage(new OnlineCast());
		theActorCalled("Aleja").can(BrowseTheWeb.with(navegadorChrome));
	}
	
	@Given("^Abro el navegador$")
	public void abroElNavegador() {
		theActorInTheSpotlight().wasAbleTo(Open.browserOn(new PaginaGoogle()));
	}

	@When("^ingreso la palabra (.*) en el buscador$")
	public void ingresoLaPalabraPruebazEnElBuscador(String especificada){
		theActorInTheSpotlight().attemptsTo(RealizarLaBusqueda.deLaPalabra(especificada));
	}

	@When("^selecciono la sugerencia de busqueda del buscador$")
	public void seleccionoLaSugerenciaDeBusquedaDelBuscador() {
		theActorInTheSpotlight().attemptsTo(Seleccionar.laSugerencia());
	}

	@Then("^se valida que la cantidad de resultados sea mayor a lo especificado$")
	public void seValidaQueLaCantidadDeResultadosSeaMayorALoEspecificado() {
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(MasDeSeisResultados.enLaBusqueda(), Matchers.equalTo(true)));
	}
}
