package com.webscrap.Mandi_Rates_Service.Controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webscrap.Mandi_Rates_Service.DTOs.MandiBhaavDto;
import com.webscrap.Mandi_Rates_Service.Services.MandiBhaavServiceImpl;


@RestController
@RequestMapping("/market")
@CrossOrigin(origins = "http://localhost:4200")
public class MandiBhaavController {

    @Autowired
    MandiBhaavServiceImpl oBhaavServiceImpl;

    /**
     * Fetch API for Main Market Price List
     * 
     * @param oMandiBhaavDto
     * @return ResponseEntity containing list of MandiBhaav Objects
     */
    @PostMapping("/fetchMarketPriceList")
    public ResponseEntity<List<MandiBhaavDto>> fetchMarketPriceList(@RequestBody MandiBhaavDto oMandiBhaavDto) {

        try {
            if (oMandiBhaavDto.getCommodityId() != null) {

                return oBhaavServiceImpl.fetchMarketPriceList(oMandiBhaavDto);
            } else {

                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }

        } catch (Exception e) {
           
            e.printStackTrace();
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

    }

    /**
     * Fetch API for market list according to given parameters
     * 
     * @param oMandiBhaavDto
     * @return List<MandiBhaavDto>
     * @throws IOException 
     */
    @PostMapping("/fetchMarketListForDistrict")
    public List<MandiBhaavDto> fetchMarketListForDistrict(@RequestBody MandiBhaavDto oMandiBhaavDto) throws IOException {

        return oBhaavServiceImpl.fetchMarketListForDistrict(oMandiBhaavDto);
    }



    @GetMapping("/test")
    public MandiBhaavDto test(){
        MandiBhaavDto mandiBhaavDto = new MandiBhaavDto();
        mandiBhaavDto.setCommodityName("Wheat");
        // return "Mandi rates test works!!";
        return  mandiBhaavDto;
    }

}

