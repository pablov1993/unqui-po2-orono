package ar.edu.unq.po2.tp6;

import java.util.ArrayList;

public class Banco {
	
	private ArrayList<Cliente> clientes;
	private ArrayList<SolicitudesCredito> solicitudesCredito;
	
	public Banco() {
		
		this.clientes = new ArrayList<Cliente>();
		this.solicitudesCredito = new ArrayList<SolicitudesCredito>();
	}

	public void registrarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public ArrayList<Cliente> getClientes() {
		return this.clientes;
	}

	public void generarSolicitud(Cliente cliente, Float monto, Integer plazo) {
		this.solicitudesCredito.add(new CreditoPersonal(cliente.getNombre(),cliente.getApellido(), monto, plazo));
	}
	
	public ArrayList<SolicitudesCredito> getSolicitudes() {
		return this.solicitudesCredito;
	}

	public boolean evaluarSolicitudDe(Cliente cliente) {
		
		SolicitudesCredito solicitud = this.solicitudDe(cliente);
		
		if(solicitud.solicitudAceptable(cliente)) {
			solicitud.setStatus("Aprobado");
			cliente.setCuenta(solicitud.monto);
			
		}
		else {
			
			solicitud.setStatus("Rechazado");
		}
		return solicitud.solicitudAceptable(cliente);
	}

	public SolicitudesCredito solicitudDe(Cliente cliente) {
		
		SolicitudesCredito solicitud = null;
		
		for(SolicitudesCredito solicitudes : solicitudesCredito) {
			
			if(solicitudes.getNombre() == cliente.getNombre() & solicitudes.getApellido() == cliente.getApellido()) {
				solicitud = solicitudes;
			}
		}		
		return solicitud;
	}

	public void generarSolicitud(Cliente cliente, Float monto, Integer plazo, Propiedad propiedad) {
		
		this.solicitudesCredito.add(new CreditoHipotecario(cliente.getNombre(),cliente.getApellido(), monto, plazo, propiedad));
	}
	
	
	

}
