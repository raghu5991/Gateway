package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.bean.RequestTester;
import com.company.dao.Tester;
import com.company.dao.Train;
import com.company.service.ServiceTesterService;

@RestController
@RequestMapping("/testercontroller")
public class ServiceTesterController {

	@Autowired
	private ServiceTesterService serviceTesterService;

	@PostMapping("/adddtester")
	public long addTester(@RequestBody RequestTester requestDev) throws Exception {
		long id = serviceTesterService.addTester(requestDev);
		return id;

	}
	
	@GetMapping("/getAllTrains")
	public List<Tester> getAllTrains() throws Exception {
		 List<Tester> list = serviceTesterService.getAllTrains();
		return list;

	}
	
	@GetMapping("/getTrainsByid/{id}")
	public List<Train> getTrainsByid(@PathVariable long id) throws Exception {
		System.out.println("id========"+id);
		 List<Train> list = serviceTesterService.getTrainsByid(id);
		return list;

	}
	
	@PutMapping("/updateRoute/{id}")
	public Tester updateRoute(@PathVariable long id) throws Exception {
		Tester route = serviceTesterService.updateRoute(id);
		return route;

	}
	
//	@DeleteMapping("/getTrainsByid/{id}")
//	public List<Train> getTrainsByid(@PathVariable long id) throws Exception {
//		System.out.println("id========"+id);
//		 List<Train> list = serviceTesterService.getTrainsByid(id);
//		return list;
//
//	}

}
