package com.company.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.company.dao.Train;
@Repository
public interface TrainRepository extends JpaRepository<Train, Long>{
	
	@Query("SELECT u FROM Train u WHERE u.source = :source and u.destination = :destination")
	public List<Train> findTrainsByName(@Param("source") String source,  @Param("destination") String destination);

}
