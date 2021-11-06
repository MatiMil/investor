package com.investor.tmm.investor.service;

import com.investor.tmm.investor.api.InvestorDO;
import com.investor.tmm.investor.model.InvestorEntity;
import com.investor.tmm.investor.repository.InvestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestorService {

    @Autowired
    private InvestorRepository investorRepository;

    @Autowired
    private InvestorTransformer investorTransformer;

    public InvestorService(InvestorRepository investorRepository, InvestorTransformer investorTransformer) {
        this.investorRepository = investorRepository;
        this.investorTransformer = investorTransformer;
    }

    public List<InvestorDO> getAllInvestors() {
        List<InvestorEntity> investorRepositoryAll = (List<InvestorEntity>) investorRepository.findAll();


        return investorTransformer.mapToDO(investorRepositoryAll);
    }
}
