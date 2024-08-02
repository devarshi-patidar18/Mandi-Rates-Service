package com.webscrap.Mandi_Rates_Service.Controllers;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webscrap.Mandi_Rates_Service.DTOs.ResearchStudiesDto;
import com.webscrap.Mandi_Rates_Service.Services.ResearchStudiesService;

@RestController
@RequestMapping("/research-studies")
@CrossOrigin(origins="*")
public class ResearchStudiesController {

    @Autowired
    private ResearchStudiesService researchStudiesService;

    @GetMapping("/list")
    public ArrayList<ResearchStudiesDto> researchStudiesList() throws IOException{
        

        return researchStudiesService.researchStudiesList();
    }

}
