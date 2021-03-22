package com.company.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.bean.RequestDev;
import com.company.bean.ResponseDev;
import com.company.dao.Dev;
import com.company.repository.ServiceDevRepository;
@Service
public class ServiceDevService {
@Autowired
private ServiceDevRepository serviceDevRepository;

	public ResponseDev addDeveloper(RequestDev requestDev)
	{
		Dev dev=new Dev();
		dev.setDev_address(requestDev.getAddress());
		dev.setDev_exp(requestDev.getExp());
		dev.setDev_name(requestDev.getName());
		dev.setDev_role(requestDev.getRole());
		Dev newdev=serviceDevRepository.save(dev);
		ResponseDev responseDev=new ResponseDev();
		responseDev.setAddress(newdev.getDev_address());
		responseDev.setExp(newdev.getDev_exp());
		responseDev.setName(newdev.getDev_name());
		responseDev.setRole(newdev.getDev_role());
		return responseDev;
	}
	public ResponseDev updateDeveloper(long id) {
		Dev dev=serviceDevRepository.findById(id).get();
		dev.setDev_address("hyderbad");
		Dev newdev=serviceDevRepository.save(dev);
		ResponseDev responseDev=new ResponseDev();
		responseDev.setAddress(newdev.getDev_address());
		responseDev.setExp(newdev.getDev_exp());
		responseDev.setName(newdev.getDev_name());
		responseDev.setRole(newdev.getDev_role());
		return responseDev;
	}
	public void deleteDeveloper(long id) {
		serviceDevRepository.deleteById(id);
		return;
	}
	public List<ResponseDev> getAllDevelopers()
	{
		List<Dev> devlopers = new ArrayList<Dev>();  
		serviceDevRepository.findAll().forEach(devlopers1 -> devlopers.add(devlopers1)); 
		List<ResponseDev> resdevloperslist = new ArrayList<ResponseDev>(); 
		for(Dev dev:devlopers)
		{
			ResponseDev responseDev=new ResponseDev();
			responseDev.setAddress(dev.getDev_address());
			responseDev.setExp(dev.getDev_exp());
			responseDev.setName(dev.getDev_name());
			responseDev.setRole(dev.getDev_role());
			resdevloperslist.add(responseDev);
		}
		return resdevloperslist;  
	}

}
