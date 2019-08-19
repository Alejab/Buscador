package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.PaginaGoogle;

public class Seleccionar implements Task{

	@Override
	public <T extends Actor> void performAs(T aleja) {
		aleja.attemptsTo(Click.on(PaginaGoogle.SUGERIDO));
	}

	public static Seleccionar laSugerencia() {
		return Tasks.instrumented(Seleccionar.class);
	}

}
