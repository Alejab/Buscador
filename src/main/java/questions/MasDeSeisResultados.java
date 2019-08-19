package questions;

import java.util.List;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class MasDeSeisResultados implements Question<Boolean>{

	Boolean resultado;
	@Override
	public Boolean answeredBy(Actor aleja) {
		List<WebElement> listaResultados = Target.the("Lista de resultados").
				located(By.xpath("//*[@class='bkWMgd']"))
				.resolveFor(aleja).findElements(By.xpath("//*[@class='g']"));
		for(int i=0; i<listaResultados.size(); i++ ){
        	System.out.println(listaResultados.get(i).getText());
        }
		if (listaResultados.size()>6) {
			resultado=true;
		}else {
			resultado=false;
		}	
		return resultado;
	}

	public static MasDeSeisResultados enLaBusqueda() {
		return new MasDeSeisResultados();
	}

}
