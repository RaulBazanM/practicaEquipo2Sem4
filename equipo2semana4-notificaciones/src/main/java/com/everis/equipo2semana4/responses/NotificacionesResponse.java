package com.everis.equipo2semana4.responses;

public class NotificacionesResponse {
	private boolean succesful;
	private String mensaje;
	private int port;
	
	public boolean isSuccesful() {
		return succesful;
	}
	public void setSuccesful(boolean succesful) {
		this.succesful = succesful;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	

}
