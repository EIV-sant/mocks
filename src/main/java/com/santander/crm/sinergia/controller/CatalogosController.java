package com.santander.crm.sinergia.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.santander.crm.sinergia.entity.ActividadComercial;
import com.santander.crm.sinergia.entity.Banca;
import com.santander.crm.sinergia.entity.Estado;
import com.santander.crm.sinergia.entity.Localidad;
import com.santander.crm.sinergia.entity.Producto;
import com.santander.crm.sinergia.entity.Sucursal;
import com.santander.crm.sinergia.entity.Telefono;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
@RequestMapping("/sinergia")
public class CatalogosController {
	
	@RequestMapping(value = "/catalogos/estados", method = { RequestMethod.GET })
	@CrossOrigin(origins = "*")
	public ResponseEntity<List<Estado>> estados(){
		HttpStatus hs = HttpStatus.OK;		
		HttpHeaders header = new HttpHeaders();
		
		Estado estado = new Estado();
		estado.setId(1);
		estado.setNombre("Aguascalientes");
		
		Estado estado2 = new Estado();
		estado2.setId(1);
		estado2.setNombre("Baja California");
		
		List<Estado> response = new ArrayList<Estado>();
		response.add(estado);
		response.add(estado2);
				
		return new ResponseEntity<List<Estado>>(response, header, hs);
	}
	
	@RequestMapping(value = "/catalogos/estados/{idEstado}/localidades", method = { RequestMethod.GET })
	@CrossOrigin(origins = "*")
	public ResponseEntity<List<Localidad>> localidades(@PathVariable Integer idEstado){
		HttpStatus hs = HttpStatus.OK;		
		HttpHeaders header = new HttpHeaders();
		
		Localidad l1 = new Localidad();
		l1.setId(2);
		l1.setNombre("Asientos");
		
		Localidad l2 = new Localidad();
		l2.setId(3);
		l2.setNombre("Calvillo");
		
		List<Localidad> response = new ArrayList<>();
		
		response.add(l1);
		response.add(l2);
		
		return new ResponseEntity<List<Localidad>>(response, header, hs);
	}
	
	@RequestMapping(value = "/catalogos/productos", method = { RequestMethod.GET })
	@CrossOrigin(origins = "*")
	public ResponseEntity<List<Producto>> productos(){
		HttpStatus hs = HttpStatus.OK;		
		HttpHeaders header = new HttpHeaders();
		
		List<Producto> response = new ArrayList<Producto>();
		
		Producto p1 = new Producto();
		p1.setId(1);
		p1.setNombre("Nomina");
		
		return new ResponseEntity<List<Producto>>(response, header, hs);
	}
	
	@RequestMapping(value = "/catalogos/bancas", method = { RequestMethod.GET })
	@CrossOrigin(origins = "*")
	public ResponseEntity<List<Banca>> bancas(){
		HttpStatus hs = HttpStatus.OK;		
		HttpHeaders header = new HttpHeaders();
		
		List<Banca> response = new ArrayList<>();
		
		Banca b1 = new Banca();
		b1.setId(1);
		b1.setNombre("Particulares");
		
		Banca b2 = new Banca();
		b2.setId(2);
		b2.setNombre("PYME");
		
		Banca b3 = new Banca();
		b3.setId(3);
		b3.setNombre("BEI");
		
		response.add(b1);
		response.add(b2);
		response.add(b3);
		
		return new ResponseEntity<List<Banca>>(response, header, hs);
	}
	
	/**
	 * Endpoint para recuperar el catálogo de actividades comerciales
	 * @return Lista de actividades comerciales
	 */
	@RequestMapping(value = "/catalogos/actividadesComerciales", method = { RequestMethod.GET })
	@CrossOrigin(origins = "*")
	public ResponseEntity<List<ActividadComercial>> actividadesComerciales(){
		HttpStatus hs = HttpStatus.OK;		
		HttpHeaders header = new HttpHeaders();
		
		List<ActividadComercial> response = new ArrayList<>();
		
		ActividadComercial a1 = new ActividadComercial();
		a1.setId(1);
		a1.setNombre("AGRONEGOCIO");
		
		ActividadComercial a2 = new ActividadComercial();
		a2.setId(1);
		a2.setNombre("COMERCIO Y SERVICIO");
		
		ActividadComercial a3 = new ActividadComercial();
		a3.setId(1);
		a3.setNombre("INMOBILIARIO");
		
		response.add(a1);
		response.add(a2);
		response.add(a3);
		
		return new ResponseEntity<List<ActividadComercial>>(response, header, hs);
	}
	
	/**
	 * Endpoint para recuperar el catálogo de sucursales de una localidad
	 * @param idLocalidad el identificador de la localidad
	 * @return Lista de sucursales
	 */
	@RequestMapping(value = "/catalogos/sucursales/{idLocalidad}", method = { RequestMethod.GET })
	@CrossOrigin(origins = "*")
	public ResponseEntity<List<Sucursal>> sucursalesByLocalidad(@PathVariable Integer idLocalidad){
		HttpStatus hs = HttpStatus.OK;		
		HttpHeaders header = new HttpHeaders();
		
		List<Sucursal> response = new ArrayList<>();
		
		Sucursal s1 = new Sucursal();
		s1.setId(1);
		s1.setNombre("UNION DE CREDITO CHIHUAHUENSE");
		
		response.add(s1);
		
		return new ResponseEntity<List<Sucursal>>(response, header, hs);
	}
	
	/**
	 * Endpoint para recuperar el catálogo de tipos de telefono
	 * @return Lista de tipos de telefono
	 */
	@RequestMapping(value = "/catalogos/telefonos", method = { RequestMethod.GET })
	@CrossOrigin(origins = "*")
	public ResponseEntity<List<Telefono>> telefonos(){
		HttpStatus hs = HttpStatus.OK;		
		HttpHeaders header = new HttpHeaders();
		
		List<Telefono> response = new ArrayList<>();
		
		Telefono t1 = new Telefono();
		t1.setId(1);
		t1.setNombre("Celular");
		
		Telefono t2 = new Telefono();
		t2.setId(2);
		t2.setNombre("Casa");
		
		response.add(t2);
		
		return new ResponseEntity<List<Telefono>>(response, header, hs);
	}
	
	/**
	 * Endpoint test para comprobar disponibilidad de micro servicio
	 * @return
	 */
	@RequestMapping(value = "catalogos/pruebas", method = { RequestMethod.GET })
	@CrossOrigin(origins = "*")
	public ResponseEntity<String> pruebas() {
		
		HttpStatus hs = HttpStatus.OK;		
		HttpHeaders header = new HttpHeaders();
		return new ResponseEntity<String>("Hola mundo",header, hs);
	}

}
