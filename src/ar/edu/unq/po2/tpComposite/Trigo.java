package ar.edu.unq.po2.tpComposite;

public class Trigo extends Tierra {
	
	private double gananciaAnual;
	
	public Trigo() {
		this.gananciaAnual = 300d;
	}

	@Override
	protected double getGananciaAnual() {
		// TODO Auto-generated method stub
		return this.gananciaAnual;
	}
}
