package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.dao.Dev;
@Repository
public interface ServiceDevRepository extends JpaRepository<Dev, Long>{

}
