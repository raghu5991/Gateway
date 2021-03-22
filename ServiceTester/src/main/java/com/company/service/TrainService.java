package com.company.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.bean.TrainFromTo;
import com.company.bean.TrainRequest;
import com.company.bean.TrainResponse;
import com.company.dao.Train;
import com.company.repository.TrainRepository;
@Service
public class TrainService {
	@Autowired
	private TrainRepository trainRepository;
	public long addTrain(TrainRequest trainRequest) {
		// TODO Auto-generated method stub
		Train t=new Train();
		t.setSource(trainRequest.getSource());
		t.setDestination(trainRequest.getDestination());
		t.setName(trainRequest.getName());
//		List<Train> listofTrain=trainRepository.findAll();
//		List<String> sourceList=new ArrayList<String>();
//		List<String> destinationList=new ArrayList<String>();
//		for(Train tr:listofTrain)
//		{
//			sourceList.add(tr.getSource());
//			destinationList.add(tr.getDestination());
//		}
		System.out.println(t);
		Train newtr=trainRepository.save(t);
		System.out.println(newtr);
		//TrainResponse response=new TrainResponse();
		
		return newtr.getTrianid();
	}
	public List<TrainResponse> getTrains() {
		// TODO Auto-generated method stub
		List<Train> listoftrains=trainRepository.findAll();
		List<TrainResponse> listresponse=new ArrayList<TrainResponse>();
		for(Train train:listoftrains)
		{
			TrainResponse tr=new TrainResponse();
			tr.setTrianid(train.getTrianid());
			tr.setName(train.getName());
			tr.setSource(train.getSource());
			tr.setDestination(train.getDestination());
			listresponse.add(tr);
		}
		return listresponse;
	}
	public List<TrainResponse> getTrainsbysource(TrainFromTo fromTo) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		List<Train> listoftrains=trainRepository.findTrainsByName(fromTo.getSource(),fromTo.getDestination());
		List<TrainResponse> listresponse=new ArrayList<TrainResponse>();
		for(Train train:listoftrains)
		{
			TrainResponse tr=new TrainResponse();
			tr.setTrianid(train.getTrianid());
			tr.setName(train.getName());
			tr.setSource(train.getSource());
			tr.setDestination(train.getDestination());
			listresponse.add(tr);
		}
		return listresponse;
	
	}
}
