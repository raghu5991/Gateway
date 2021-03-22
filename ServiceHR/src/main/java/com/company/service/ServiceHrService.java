package com.company.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.bean.RequestHr;
import com.company.bean.ResponseHr;
import com.company.dao.Hr;
import com.company.repository.ServiceHrRepository;
@Service
public class ServiceHrService {
	@Autowired
	private ServiceHrRepository serviceHrRepository;

	public ResponseHr addHr(RequestHr requestHr) {
		Hr hr=new Hr();
		hr.setExp(requestHr.getExp());
		hr.setHolidays(requestHr.getHolidays());
		hr.setLeaves(requestHr.getLeaves());
		hr.setTypeleave(requestHr.getTypeleave());
		Hr newHr=serviceHrRepository.save(hr);
		ResponseHr responseHr=new ResponseHr();
		responseHr.setExp(newHr.getExp());
		responseHr.setHolidays(newHr.getHolidays());
		responseHr.setLeaves(newHr.getLeaves());
		responseHr.setTypeleave(newHr.getTypeleave());
		return responseHr;
	}

	public ResponseHr updateHr(long devid) {
		Hr hr=serviceHrRepository.findById(devid).get();
		hr.setLeaves(15);
		Hr newHr=serviceHrRepository.save(hr);
		ResponseHr responseHr=new ResponseHr();
		responseHr.setExp(newHr.getExp());
		responseHr.setHolidays(newHr.getHolidays());
		responseHr.setLeaves(newHr.getLeaves());
		responseHr.setTypeleave(newHr.getTypeleave());
		return responseHr;
	}

	public void deleteHr(long devid) {
		serviceHrRepository.deleteById(devid);
		return;
	}

	public List<ResponseHr> getAllHrs() {
		List<Hr> hrs = new ArrayList<Hr>();  
		serviceHrRepository.findAll().forEach(devlopers1 -> hrs.add(devlopers1)); 
		List<ResponseHr> resdevloperslist = new ArrayList<ResponseHr>(); 
		for(Hr hr:hrs)
		{
			ResponseHr responsehr=new ResponseHr();
			responsehr.setExp(hr.getExp());
			responsehr.setHolidays(hr.getHolidays());
			responsehr.setLeaves(hr.getLeaves());
			responsehr.setTypeleave(hr.getTypeleave());
			resdevloperslist.add(responsehr);
		}
		return resdevloperslist;  
	}

}
