package com.santander.crm.sinergia.entity;

import java.util.ArrayList;
import java.util.List;

public class Estado {

	private Integer id;

	private String nombre;

	private List<Localidad> localidades = new ArrayList<>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Localidad> getLocalidades() {
		return localidades;
	}

	public void setLocalidades(List<Localidad> localidades) {
		this.localidades = localidades;
	}

	public void addLocalidad(Localidad localidad) {
		localidades.add(localidad);
		localidad.setEstado(null);
	}

	public void removeLocalidad(Localidad localidad) {
		localidades.remove(localidad);
		localidad.setEstado(null);
	}

}
