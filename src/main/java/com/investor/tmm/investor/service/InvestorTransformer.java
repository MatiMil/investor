package com.investor.tmm.investor.service;

import com.investor.tmm.investor.api.InvestorDO;
import com.investor.tmm.investor.model.InvestorEntity;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class InvestorTransformer {

/*
    public List<InvestorEntity> mapToBE(List<InvestorDO> investorDOList) {

        return

    }*/

    public List<InvestorDO> mapToDO(List<InvestorEntity> investorEntityList) {

        return investorEntityList.stream().map(investorEntity -> InvestorDO.builder()
                .name(investorEntity.getName())
                .lastname(investorEntity.getLastname())
                .build()).collect(Collectors.toList());
    }

}
