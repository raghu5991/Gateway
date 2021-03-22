package com.company.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.bean.RequestTester;
import com.company.bean.ResponseTester;
import com.company.bean.TrainRequest;
import com.company.bean.TrainResponse;
import com.company.dao.Tester;
import com.company.dao.Train;
import com.company.repository.ServiceTesterRepository;
import com.company.repository.TrainRepository;
@Service
public class ServiceTesterService {
@Autowired
private ServiceTesterRepository serviceTesterRepository;
@Autowired
private TrainRepository trainRepository;

	public long addTester(RequestTester requestDev) {
		boolean result=false;
		Tester dev=new Tester();
		
		dev.setFromname(requestDev.getFromname());
		dev.setToname(requestDev.getToname());
		dev.setCode(requestDev.getCode());
		List<Tester> listofroutes=serviceTesterRepository.findAll();
		List<String> codelist=new ArrayList<String>();
		for(Tester test:listofroutes)
		{
			codelist.add(test.getCode());
		}
			if(codelist.contains(requestDev.getCode()))
			{
				result=false;
			}
			else
			{
				result=true;
			}
	
		if(result==true) {
		Tester newdev=serviceTesterRepository.save(dev);
		ResponseTester responseDev=new ResponseTester();
		responseDev.setId(newdev.getId());
		responseDev.setFromname(newdev.getFromname());
		responseDev.setToname(newdev.getToname());
		responseDev.setCode(newdev.getCode());
		return newdev.getId();
	}
		else
		{
			throw new RuntimeException("something went wrong");
		}
		
	}

	public List<Train> getTrainsByid(long id) {
		// TODO Auto-generated method stub
		Tester tester=serviceTesterRepository.findById(id).get();
		List<Train> listoftrains=trainRepository.findTrainsByName(tester.getFromname(),tester.getToname());
		return listoftrains;
	}

	public List<Tester> getAllTrains() {
		// TODO Auto-generated method stub
		List<Tester> tester=serviceTesterRepository.findAll();
		return tester;
	}

	public Tester updateRoute(long id) {
		// TODO Auto-generated method stub
		Tester tester=serviceTesterRepository.findById(id).get();
		tester.setFromname("hyd");
		Tester newdev=serviceTesterRepository.save(tester);
		return newdev;
	}
	
	

	

}
