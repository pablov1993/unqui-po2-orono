package ar.edu.unq.po2.tpComposite;

public class Soja extends Tierra {
	
	private double gananciaAnual;
	
	public Soja() {
		this.gananciaAnual = 500d;
	}

	@Override
	protected double getGananciaAnual() {
		// TODO Auto-generated method stub
		return this.gananciaAnual;
	}

}
