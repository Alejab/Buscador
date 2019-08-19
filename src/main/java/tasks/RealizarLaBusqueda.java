package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.PaginaGoogle;

public class RealizarLaBusqueda implements Task{

	public String especificada;
	public RealizarLaBusqueda(String especificada) {
		this.especificada = especificada;
	}
	@Override
	public <T extends Actor> void performAs(T aleja) {
		aleja.attemptsTo(
				Click.on(PaginaGoogle.BUSCA_PALABRA),
				Enter.theValue(especificada).into(PaginaGoogle.BUSCA_PALABRA),
				Click.on(PaginaGoogle.LETRERO),
				Click.on(PaginaGoogle.BUSCAR));
	}

	public static RealizarLaBusqueda deLaPalabra(String especificada) {
		return Tasks.instrumented(RealizarLaBusqueda.class, especificada);
	}

}
