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

import com.company.bean.RequestHr;
import com.company.bean.ResponseHr;
import com.company.service.ServiceHrService;

@RestController
@RequestMapping("/service2")
public class ServiceHrController {

	@Autowired
	private ServiceHrService serviceHrService;
	@PostMapping("/addhr")
	public ResponseEntity<ResponseHr> addHr(@RequestBody RequestHr requestDev)
	{
		ResponseHr responseDev=serviceHrService.addHr(requestDev);
		return new ResponseEntity<ResponseHr>(responseDev,HttpStatus.OK);
		
	}
	@PutMapping("/updatehr/{devid}")
	public ResponseEntity<ResponseHr> updateHr(@PathVariable("devid") long devid)
	{
		ResponseHr responseDev=serviceHrService.updateHr(devid);
		return new ResponseEntity<ResponseHr>(responseDev,HttpStatus.OK);
		
	}
	@DeleteMapping("/deletehr/{devid}")
	public ResponseEntity<String> deleteHr(@PathVariable("devid") long devid)
	{
		serviceHrService.deleteHr(devid);
		return new ResponseEntity<String>(HttpStatus.OK);
		
	}
	
	@GetMapping("/showhrs")  
	public List<ResponseHr> getAllHrs()   
	{  
		
	return  serviceHrService.getAllHrs();  
	} 


}
