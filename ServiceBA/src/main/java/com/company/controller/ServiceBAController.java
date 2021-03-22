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

import com.company.bean.RequestBa;
import com.company.bean.ResponseBa;
import com.company.service.ServiceBaService;

@RestController
@RequestMapping("/bacontroller")
public class ServiceBAController {


	@Autowired
	private ServiceBaService serviceBaService;
	@PostMapping("/addba")
	public ResponseEntity<ResponseBa> addBa(@RequestBody RequestBa requestDev)
	{
		ResponseBa responseDev=serviceBaService.addBa(requestDev);
		return new ResponseEntity<ResponseBa>(responseDev,HttpStatus.OK);
		
	}
	@PutMapping("/updateba/{devid}")
	public ResponseEntity<ResponseBa> updateBa(@PathVariable("devid") long devid)
	{
		ResponseBa responseDev=serviceBaService.updateBa(devid);
		return new ResponseEntity<ResponseBa>(responseDev,HttpStatus.OK);
		
	}
	@DeleteMapping("/deleteba/{devid}")
	public ResponseEntity<String> deleteBa(@PathVariable("devid") long devid)
	{
		serviceBaService.deleteBa(devid);
		return new ResponseEntity<String>(HttpStatus.OK);
		
	}
	
	@GetMapping("/showBas")  
	public List<ResponseBa> getAllBa()   
	{  
		
	return  serviceBaService.getAllBa();  
	} 




}
