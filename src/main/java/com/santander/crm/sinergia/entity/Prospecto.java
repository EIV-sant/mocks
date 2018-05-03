package com.santander.crm.sinergia.entity;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class Prospecto {

	private Integer id;

	// OBLIGATORIOS
	@NotEmpty
	private String nomRazSoc;

	@NotNull(message = "no puede ser nulo")
	private Integer idBanca;

	@NotNull(message = "no puede ser nulo")
	private Integer idTipoTelefono;

	@NotNull(message = "no puede ser nulo")
	private Integer idLocalidad;

	// FIN OBLIGATORIOS

	// GENERADOS AUTOMATICAMENTE
	private Date fechaAlta;

	private Date fechaActualizacion;

	private Integer idEstatus;
	// FIN GENERADOS AUTOMATICAMENTE

	// INSERTADOS EN NEGOCIO
	/**
	 * Ofi act Ejecutivo que refiere
	 */
	@JsonIgnore
	private String ofiReferente;

	private String ofiAsignado;
	// FIN INSERTADOS EN NEGOCIO

	// OPCIONALES

	/**
	 * Posibles valores: 1. PERSONA FISICA ACTIVIDAD EMPRESARIAL 2. PERSONA FISICA
	 */
	private String tipoPersona;

	private Integer idActividad;
	/**
	 * Posibles valores: 1. FEMENINO 2. MASCULINO
	 */
	private String genero;

	private String paterno;

	private String materno;

	private String telefono;

	@Email(message = "es incorrecto")
	private String email;

	private String comentarios;

	private String expReferente;

	@Size(min = 10, max = 13, message = "debe contener entre 10 y 13 digitos")
	private String rfc;

	@Past
	private Date fechaNacimiento;

	/**
	 * Posibles valores: 1. CASADO(A) 2. DIVORCIADO(A) 3. SOLTERO(A) 4. VIUDO(A)
	 */
	private String estadoCivil;

	@Min(value = 0)
	private Integer numHijos;

	private String calle;

	private String numExt;

	private String numInt;

	private String colonia;

	@Size(min = 5, max = 5, message = "debe ser de 5 digitos")
	private String codPostal;

	@Min(value = 0)
	private Long capital;

	private Long facturacion;

	@Min(value = 0)
	private Integer numEmpleados;

	@JsonManagedReference
	private List<Contacto> contactos;

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta() {
		this.fechaAlta = new Date();
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion() {
		this.fechaActualizacion = new Date();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomRazSoc() {
		return nomRazSoc;
	}

	public void setNomRazSoc(String nomRazSoc) {
		this.nomRazSoc = nomRazSoc;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getIdTipoTelefono() {
		return idTipoTelefono;
	}

	public void setIdTipoTelefono(Integer idTipoTelefono) {
		this.idTipoTelefono = idTipoTelefono;
	}

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public Integer getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(Integer idActividad) {
		this.idActividad = idActividad;
	}

	public Integer getIdLocalidad() {
		return idLocalidad;
	}

	public void setIdLocalidad(Integer idLocalidad) {
		this.idLocalidad = idLocalidad;
	}

	public Integer getIdBanca() {
		return idBanca;
	}

	public void setIdBanca(Integer idBanca) {
		this.idBanca = idBanca;
	}

	public Integer getIdEstatus() {
		return idEstatus;
	}

	public void setIdEstatus(Integer idEstatus) {
		this.idEstatus = idEstatus;
	}

	public String getOfiReferente() {
		return ofiReferente;
	}

	public void setOfiReferente(String ofiReferente) {
		this.ofiReferente = ofiReferente;
	}

	public String getOfiAsignado() {
		return ofiAsignado;
	}

	public void setOfiAsignado(String ofiAsignado) {
		this.ofiAsignado = ofiAsignado;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getExpReferente() {
		return expReferente;
	}

	public void setExpReferente(String expReferente) {
		this.expReferente = expReferente;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Integer getNumHijos() {
		return numHijos;
	}

	public void setNumHijos(Integer numHijos) {
		this.numHijos = numHijos;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumExt() {
		return numExt;
	}

	public void setNumExt(String numExt) {
		this.numExt = numExt;
	}

	public String getNumInt() {
		return numInt;
	}

	public void setNumInt(String numInt) {
		this.numInt = numInt;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(List<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Integer getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(Integer numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

	public Long getCapital() {
		return capital;
	}

	public void setCapital(Long capital) {
		this.capital = capital;
	}

	public Long getFacturacion() {
		return facturacion;
	}

	public void setFacturacion(Long facturacion) {
		this.facturacion = facturacion;
	}

}
