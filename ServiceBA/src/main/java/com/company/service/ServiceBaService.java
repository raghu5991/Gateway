package com.company.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.bean.RequestBa;
import com.company.bean.ResponseBa;
import com.company.dao.Ba;
import com.company.repository.ServiceBARepository;

@Service
public class ServiceBaService {
	@Autowired
	private ServiceBARepository serviceBARepository;

	public ResponseBa addBa(RequestBa requestDev) {
		Ba dev=new Ba();
		
		dev.setName(requestDev.getName());
		dev.setClient_name(requestDev.getClient_name());
		
		Ba newdev=serviceBARepository.save(dev);
		ResponseBa responseDev=new ResponseBa();
		responseDev.setName(newdev.getName());
		responseDev.setClient_name(newdev.getClient_name());
		return responseDev;
	}

	public ResponseBa updateBa(long devid) {
		Ba dev=serviceBARepository.findById(devid).get();
		dev.setName("abc");
		Ba newdev=serviceBARepository.save(dev);
		ResponseBa responseDev=new ResponseBa();
		responseDev.setName(responseDev.getName());
		responseDev.setClient_name(responseDev.getClient_name());
		return responseDev;
	}

	public void deleteBa(long devid) {
		serviceBARepository.deleteById(devid);
		return;
	}

	public List<ResponseBa> getAllBa() {
		List<Ba> devlopers = new ArrayList<Ba>();  
		serviceBARepository.findAll().forEach(devlopers1 -> devlopers.add(devlopers1)); 
		List<ResponseBa> resdevloperslist = new ArrayList<ResponseBa>(); 
		for(Ba dev:devlopers)
		{
			ResponseBa responseDev=new ResponseBa();
			responseDev.setName(dev.getName());
			responseDev.setClient_name(dev.getClient_name());
			resdevloperslist.add(responseDev);
		}
		return resdevloperslist;  
	}

}
