package com.investor.tmm.investor.repository;

import com.investor.tmm.investor.model.InvestorEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestorRepository extends CrudRepository<InvestorEntity, Integer> {

}
