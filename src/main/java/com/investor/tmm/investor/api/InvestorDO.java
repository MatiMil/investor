package com.investor.tmm.investor.api;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ApiModel(value = "Investor")
public class InvestorDO {

    @ApiModelProperty(value = "name")
    private String name;
    @ApiModelProperty(value = "lastname")
    private String lastname;


}




