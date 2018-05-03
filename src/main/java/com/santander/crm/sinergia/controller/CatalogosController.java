package com.santander.crm.sinergia.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.santander.crm.sinergia.entity.Estado;

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
		estado.setNombre("Jalisco");
		
		Estado estado2 = new Estado();
		estado2.setId(1);
		estado2.setNombre("Chihuahua");
		
		List<Estado> response = new ArrayList<Estado>();
		response.add(estado);
		response.add(estado2);
		
//		List<Estado> response = catalogoService.getAllEstados();
		
		return new ResponseEntity<List<Estado>>(response, header, hs);
	}

}
