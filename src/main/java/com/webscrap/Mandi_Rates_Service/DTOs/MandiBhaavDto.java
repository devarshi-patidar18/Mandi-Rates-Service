package com.webscrap.Mandi_Rates_Service.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MandiBhaavDto {

    private Integer marketId;
    private String marketName;
    private String stateCode;
    private String stateName;
    private String priceStartDate;
    private String priceEndDate;
    private Integer districtId;
    private String districtName;
    private Integer commodityId;
    private String commodityName;
    private String varietyOfCommoditiy;
    private String gradeOfCommoditiy;
    private Integer minPriceOfCommoditiy;
    private Integer maxPriceOfCommoditiy;
    private Integer modalPriceOfCommoditiy;
    private String responseMessage;
    private String responseCode;


}

