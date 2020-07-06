package ar.edu.unq.po2.tpAdaparteTemplate;

import java.util.List;

public abstract class Filtro {

	protected abstract List<WikipediaPage> getSimilarPage(WikipediaPage pagina, List<WikipediaPage> paginas);
	protected abstract boolean mismoString(WikipediaPage pagina, WikipediaPage p);

}
