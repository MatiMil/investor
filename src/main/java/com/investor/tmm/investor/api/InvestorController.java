package com.investor.tmm.investor.api;


import com.investor.tmm.investor.service.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/investors")
public class InvestorController {
    @Autowired
    private InvestorService investorService;

    public InvestorController(InvestorService investorService) {
        this.investorService = investorService;
    }

    @GetMapping(value = "/", produces = "application/json")
    public List<InvestorDO> getInvestors() {
        return investorService.getAllInvestors();
    }
}
