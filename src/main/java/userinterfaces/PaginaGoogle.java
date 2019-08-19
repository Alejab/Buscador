package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com.co/")
public class PaginaGoogle extends PageObject{
	public static final Target BUSCA_PALABRA = Target.the("Para buscar palabra").
			located(By.name("q"));
	public static final Target BUSCAR = Target.the("Boton buscar").
			located(By.xpath("//*[@id='tsf']/div[2]/div/div[3]/center/input[1]"));
	public static final Target LETRERO = Target.the("Pantalla de google").
			located(By.id("lga"));
	public static final Target SUGERIDO = Target.the("Palabra sugerida del buscador").
			located(By.id("fprsl"));

}
