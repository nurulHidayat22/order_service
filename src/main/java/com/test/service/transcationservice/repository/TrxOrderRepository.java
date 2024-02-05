package com.test.service.transcationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.service.transcationservice.entity.TrxOrder;

public interface TrxOrderRepository extends JpaRepository<TrxOrder, Integer>{

}
