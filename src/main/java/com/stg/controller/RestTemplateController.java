package com.stg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.stg.model.Employee;
import com.stg.service.ConsumerService;

@RestController
@RequestMapping(value = "/consumer")
public class RestTemplateController {
	
	@Autowired
	private ConsumerService consumerService;

	@GetMapping(value = "/readFromProducer/{alias}")
	public ResponseEntity<Employee> readFromProducer(@PathVariable("alias") int passId){
		return new ResponseEntity<Employee>(consumerService.getProducersData(passId), HttpStatus.FOUND);
	}
}
