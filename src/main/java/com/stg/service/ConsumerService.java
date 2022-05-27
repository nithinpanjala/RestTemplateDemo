package com.stg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.stg.model.Employee;

@Service
public class ConsumerService {

	@Autowired
	private RestTemplate restTemplate;

	public Employee getProducersData(int passId) {
		return restTemplate.getForObject("http://localhost:8080/api/readEmployee/"+passId ,Employee.class);
	}
}
