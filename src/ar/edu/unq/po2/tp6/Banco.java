package ar.edu.unq.po2.tp6;

import java.util.ArrayList;

public class Banco {
	
	private ArrayList<Cliente> clientes;
	private ArrayList<SolicitudCredito> solicitudesCredito;
	private ArrayList<SistemaInformatico> sistemasInformaticos;
	
	public Banco() {
		
		this.clientes = new ArrayList<Cliente>();
		this.solicitudesCredito = new ArrayList<SolicitudCredito>();
		this.sistemasInformaticos = new ArrayList<SistemaInformatico>();
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
			pagarPrestamo(cliente,solicitud.getMonto());
			
		}
		else {
			
			solicitud.setStatus("Rechazado");
		}
		return solicitud.solicitudAceptable(cliente);
	}

	private void pagarPrestamo(Cliente cliente, Float monto) {
		cliente.setCuenta(monto);		
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

	public void altaDeSistemaInformatico(SistemaInformatico sistemaInformatico) {
		this.sistemasInformaticos.add(sistemaInformatico);
	}

	public ArrayList<SistemaInformatico> getSistemasInformaticos() {
		return this.sistemasInformaticos;
	}

	
	
	

}
