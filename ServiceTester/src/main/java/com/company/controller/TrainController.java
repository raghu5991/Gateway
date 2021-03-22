package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.bean.TrainFromTo;
import com.company.bean.TrainRequest;
import com.company.bean.TrainResponse;
import com.company.service.TrainService;

@RestController
@RequestMapping("/traincontroller")
public class TrainController {
@Autowired
	private TrainService trainService;

	@PostMapping("/adddtrain")
	public long addtrain(@RequestBody TrainRequest trainRequest) {
		System.out.println(trainRequest);
		long id = trainService.addTrain(trainRequest);
		return id;

	}
	@GetMapping("/gettrains")
	public List<TrainResponse> getTrain() {
		
		List<TrainResponse> list= trainService.getTrains();
		return list;

	}
	@GetMapping("/gettrainsbysourcedest")
	public List<TrainResponse> getTrain(@RequestBody TrainFromTo fromTo) {
		
		List<TrainResponse> list= trainService.getTrainsbysource(fromTo);
		return list;

	}
	}
