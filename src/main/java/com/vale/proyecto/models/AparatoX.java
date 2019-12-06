package com.vale.proyecto.models;

public class AparatoX {
	
	String nombre = "";
	Boolean encendido = false;
	Integer consumo = 0;
	Tipo tipo = Tipo.NORMAL;

	public AparatoX() {

	}

	public String getNombre() {
		return nombre;
	}

	public Boolean getEncendido() {
		return encendido;
	}

	public Integer getConsumo() {
		return consumo;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEncendido(Boolean encendido) {
		this.encendido = encendido;
	}

	public void setConsumo(Integer consumo) {
		this.consumo = consumo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Aparato [nombre=" + nombre + ", encendido=" + encendido + ", consumo=" + consumo + ", tipo=" + tipo
				+ "]";
	}

	private enum Tipo{		
		CRITICO, NORMAL;
		
	}

}
