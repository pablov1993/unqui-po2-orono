package ar.edu.unq.po2.tpAdaparteTemplate;

import java.util.List;
import java.util.stream.Collectors;

public class LinkEnComun extends Filtro {

	@Override
	protected List<WikipediaPage> getSimilarPage(WikipediaPage pagina, List<WikipediaPage> paginas) {
		
		return paginas.stream().filter(p -> tieneLinkEnComun(pagina.getLinks(),p.getLinks())).collect(Collectors.toList());
	}

	public boolean tieneLinkEnComun(List<WikipediaPage> links, List<WikipediaPage> links2) {
		return links.stream().filter(l -> contieneLink(l,links2)).collect(Collectors.toList()).size() > 0;
	}

	public boolean contieneLink(WikipediaPage link, List<WikipediaPage> links) {
		// TODO Auto-generated method stub
		return links.contains(link);
	}

	@Override
	protected boolean mismoString(WikipediaPage pagina, WikipediaPage p) {
		// TODO Auto-generated method stub
		return false;
	}

}
