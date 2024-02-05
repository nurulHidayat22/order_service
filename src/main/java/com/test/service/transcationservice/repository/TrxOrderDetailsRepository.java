package com.test.service.transcationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.service.transcationservice.entity.TrxOrderDetails;

public interface TrxOrderDetailsRepository extends JpaRepository<TrxOrderDetails, Integer>{

}
