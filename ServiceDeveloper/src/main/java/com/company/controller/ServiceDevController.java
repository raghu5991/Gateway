package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.bean.RequestDev;
import com.company.bean.ResponseDev;
import com.company.service.ServiceDevService;

@RestController
@RequestMapping("/service1")
public class ServiceDevController {
	@Autowired
	private ServiceDevService serviceDevService;
	@PostMapping("/adddeveloper")
	public ResponseEntity<ResponseDev> addDeveloper(@RequestBody RequestDev requestDev)
	{
		ResponseDev responseDev=serviceDevService.addDeveloper(requestDev);
		return new ResponseEntity<ResponseDev>(responseDev,HttpStatus.OK);
		
	}
	@PutMapping("/updatedeveloper/{devid}")
	public ResponseEntity<ResponseDev> updateDeveloper(@PathVariable("devid") long devid)
	{
		ResponseDev responseDev=serviceDevService.updateDeveloper(devid);
		return new ResponseEntity<ResponseDev>(responseDev,HttpStatus.OK);
		
	}
	@DeleteMapping("/deletedeveloper/{devid}")
	public ResponseEntity<String> deleteDeveloper(@PathVariable("devid") int devid)
	{
		serviceDevService.deleteDeveloper(devid);
		return new ResponseEntity<String>(HttpStatus.OK);
		
	}
	
	@GetMapping("/showdevelopers")  
	public List<ResponseDev> getAllDevelopers()   
	{  
		
	return  serviceDevService.getAllDevelopers();  
	} 
}
