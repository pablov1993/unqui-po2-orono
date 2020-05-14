package ar.edu.unq.po2.tp6;

import java.util.ArrayList;

public class Banco {
	
	private ArrayList<Cliente> clientes;
	private ArrayList<SolicitudCredito> solicitudesCredito;
	
	public Banco() {
		
		this.clientes = new ArrayList<Cliente>();
		this.solicitudesCredito = new ArrayList<SolicitudCredito>();
	}

	public void registrarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public ArrayList<Cliente> getClientes() {
		return this.clientes;
	}

	public void generarSolicitud(SolicitudCredito solicitud) {
		this.solicitudesCredito.add(solicitud);
	}
	
	public ArrayList<SolicitudCredito> getSolicitudes() {
		return this.solicitudesCredito;
	}

	public boolean evaluarSolicitudDe(Cliente cliente) {
		
		SolicitudCredito solicitud = this.solicitudDe(cliente);
		
		if(solicitud.solicitudAceptable(cliente)) {
			solicitud.setStatus("Aprobado");
			cliente.setCuenta(solicitud.monto);
			
		}
		else {
			
			solicitud.setStatus("Rechazado");
		}
		return solicitud.solicitudAceptable(cliente);
	}

	public SolicitudCredito solicitudDe(Cliente cliente) {
		
		SolicitudCredito solicitud = null;
		
		for(SolicitudCredito solicitudes : solicitudesCredito) {
			
			if(solicitudes.getNombre() == cliente.getNombre() & solicitudes.getApellido() == cliente.getApellido()) {
				solicitud = solicitudes;
			}
		}		
		return solicitud;
	}

	
	
	

}
