package ar.edu.unq.po2.tpComposite;

import java.util.List;

public class CultivoMixto extends Tierra {

	private List<Tierra> cultivos;
	public CultivoMixto(List<Tierra> cultivos) {

		this.cultivos = cultivos;
	}

	@Override
	protected double getGananciaAnual() {
		// TODO Auto-generated method stub
		double ganancia = 0d;
		for(Tierra cultivo : cultivos) {
			ganancia = ganancia + (cultivo.getGananciaAnual()/4d);
		}
		return ganancia;
	}

}
