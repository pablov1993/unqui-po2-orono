package ar.edu.unq.po2.tpStateStrategy;

import java.util.ArrayList;
import java.util.List;

public class Reproductor {
	
	private List<Ireproducible> playList;
	private EstadoReproductor estado;
	
	public Reproductor() {
		this.playList = new ArrayList<Ireproducible>();
		this.estado = new ModoSeleccion(this);
	}

	public void agregarCancion(Ireproducible cancion) {
		// TODO Auto-generated method stub
		
		this.playList.add(cancion);
		
	}

	public List<Ireproducible> getPlayList() {
		// TODO Auto-generated method stub
		return this.playList;
	}
	
	public EstadoReproductor getEstado() {
		return this.estado;
	}

	public void reproducir(Ireproducible cancion) throws ReproductorException {
		// TODO Auto-generated method stub
	
		this.getEstado().reproducirCancion(cancion);
		
	}

	public void pausarCancion() throws ReproductorException {
		this.estado.pausarReproduccion();
		
	}

	public void setEstado(EstadoReproductor estado) {
		this.estado = estado;	
	}

	public void detenerCancion() throws ReproductorException {
		this.estado.detenerReproduccion();
		
	}

}
