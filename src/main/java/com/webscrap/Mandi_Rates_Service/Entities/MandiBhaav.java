package com.webscrap.Mandi_Rates_Service.Entities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MandiBhaav{

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mandiID;
    private Integer marketId;
    private String stateCode;
    private Date priceDate;
    private Integer districtId;
    private Integer commodityId;
    private String varietyOfCommoditiy;
    private String gradeOfCommoditiy;
    private Integer minPriceOfCommoditiy;
    private Integer maxPriceOfCommoditiy;
    private Integer modalPriceOfCommoditiy;

    }

