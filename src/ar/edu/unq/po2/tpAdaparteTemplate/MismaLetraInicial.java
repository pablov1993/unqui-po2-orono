package ar.edu.unq.po2.tpAdaparteTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MismaLetraInicial extends Filtro {
	
	public MismaLetraInicial() {
		
	}

	@Override
	public List<WikipediaPage> getSimilarPage(WikipediaPage pagina, List<WikipediaPage> paginas) {
				
		return paginas.stream().filter(p -> mismoString(pagina,p)).collect(Collectors.toList());
	}

	public boolean mismoString(WikipediaPage pagina, WikipediaPage p) {
		// TODO Auto-generated method stub
		return this.getInicial(pagina.getTitle()).equals(this.getInicial(p.getTitle()));
	}

	public String getInicial(String title) {
		String titulo = title.toLowerCase();
		List<String> tituloLista = Arrays.asList(titulo.split(""));
		
		return tituloLista.get(0);
	}
	
	

}
