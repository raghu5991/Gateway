package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.dao.Ba;
@Repository
public interface ServiceBARepository extends JpaRepository<Ba, Long>{

}
