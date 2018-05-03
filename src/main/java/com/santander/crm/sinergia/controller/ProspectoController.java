package com.santander.crm.sinergia.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.santander.crm.sinergia.entity.Prospecto;
import com.santander.crm.sinergia.filter.ProspectoFilter;
import com.santander.crm.sinergia.response.ConsultaProspectosRes;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
@RequestMapping("/sinergia")
public class ProspectoController {


	/**
	 * Endpoint GET para consultar los prospectos
	 * @param filter filtros a aplicar para la búsqueda
	 * @param token token enviado por neo
	 * @return Lista de prospectos paginada, total de prospectos por filtro y total
	 *         convertidos por filtro
	 * @throws IOException
	 */
	@RequestMapping(value = "/prospectos", method = { RequestMethod.GET })
	@CrossOrigin(origins = "*")
	public ResponseEntity<ConsultaProspectosRes> consultarProspectos(
			@RequestParam(value = "filter", required = false) String filter,
			@RequestHeader(value = "token", required = true) String token) throws IOException {

		ProspectoFilter pFilter = new ProspectoFilter();
		if (filter != null) {
			pFilter = new ObjectMapper().readValue(filter, ProspectoFilter.class);
		}

//		ConsultaProspectosRes response = prospectoService.getProspectosByFilter(pFilter, token);
		ConsultaProspectosRes response = new ConsultaProspectosRes();
		
		response.setConvertidos(10l);
		response.setTotal(15l);
		
		Prospecto p = new Prospecto();
		p.setId(1);
		p.setNomRazSoc("Luis");
		p.setPaterno("Jimenez");
		p.setTipoPersona("PERSONA FISICA");
		p.setIdLocalidad(1);
		p.setIdBanca(1);
		p.setIdTipoTelefono(1);
		p.setEmail("algo@algo.com");
		p.setGenero("MASCULINO");
		p.setEstadoCivil("SOLTERO(A)");
		
		List<Prospecto> prospectos = new ArrayList<>();
		prospectos.add(p);
		
		response.setProspectos(prospectos);

		HttpStatus hs = HttpStatus.OK;		
		HttpHeaders header = new HttpHeaders();

		return new ResponseEntity<ConsultaProspectosRes>(response, header, hs);
	}

	/**
	 * Endpoint POST para alta de prospecto
	 * @param prospecto el prospecto a dar de alta
	 * @param token token enviado por NEO
	 * @return Prospecto dado de alta
	 */
	@RequestMapping(value = "/prospectos", method = { RequestMethod.POST })
	@CrossOrigin(origins = "*")
	public ResponseEntity<Prospecto> guardarProspecto(@RequestBody Prospecto prospecto,
			@RequestHeader(value = "token", required = true) String token) {
//		GenericProspectoRes res = prospectoService.saveProspecto(prospecto, token);

		HttpStatus hs = HttpStatus.OK;		
		HttpHeaders header = new HttpHeaders();

		prospecto.setId(1);
		Prospecto response = prospecto;

		return new ResponseEntity<Prospecto>(response, header, hs);
	}

	/**
	 * Endpoint GET para consultar un prospecto
	 * @param idProspecto el identificador del prospecto
	 * @param token token enviado por NEO
	 * @return prospecto encontrado
	 */
	@RequestMapping(value = "/prospectos/{idProspecto}", method = { RequestMethod.GET })
	@CrossOrigin(origins = "*")
	public ResponseEntity<Prospecto> consultarProspecto(@PathVariable Integer idProspecto,
			@RequestHeader(value = "token", required = true) String token) {
//		GenericProspectoRes res = prospectoService.getProspecto(idProspecto);
		
		HttpStatus hs = HttpStatus.OK;		
		HttpHeaders header = new HttpHeaders();
		
		Prospecto p = new Prospecto();
		p.setId(idProspecto);
		p.setNomRazSoc("Luis");
		p.setPaterno("Jimenez");
		p.setTipoPersona("PERSONA FISICA");
		p.setIdLocalidad(1);
		p.setIdBanca(1);
		p.setIdTipoTelefono(1);
		p.setEmail("algo@algo.com");
		p.setGenero("MASCULINO");
		p.setEstadoCivil("SOLTERO(A)");

		Prospecto prospecto = p;
		
		return new ResponseEntity<Prospecto>(prospecto, header, hs);
	}
	
	@RequestMapping(value = "/prospectos", method = { RequestMethod.PUT })
	@CrossOrigin(origins = "*")
	public ResponseEntity<Prospecto> actualizarProspecto(@RequestBody Prospecto prospecto,
			@RequestHeader(value = "token", required = true) String token) {

//		GenericProspectoRes res = prospectoService.updateProspecto(prospecto);

		HttpStatus hs = HttpStatus.OK;		
		HttpHeaders header = new HttpHeaders();

		Prospecto response = prospecto;

		return new ResponseEntity<Prospecto>(response, header, hs);
	}

}
