package com.webscrap.Mandi_Rates_Service.Services;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.webscrap.Mandi_Rates_Service.DTOs.ResearchStudiesDto;

@Service
public class ResearchStudiesService {

    // 
    String baseURL = "https://agmarknet.gov.in/ResearchStudies/";

    public ArrayList<ResearchStudiesDto> researchStudiesList() throws IOException {
        Document document;
        document = Jsoup.connect(this.baseURL + "Default.aspx").get();
        Elements researchList = document.select(".list_profile ul li");

        ArrayList<ResearchStudiesDto> researchStudiesDtosList = new ArrayList<>();

        for (int i = 0; i < researchList.size(); i++) {

            Element element = researchList.get(i);
            // System.out.println(element);
            try {
                ResearchStudiesDto researchStudiesDto = new ResearchStudiesDto();
                String researchLink = element.select("a").attr("href");
                String researchStudyTitle = element.select("a").text();
                
                researchStudiesDto.setResearchStudyTitle(researchStudyTitle);

                if(researchLink.contains("../")){
                    researchStudiesDto.setResearchStudyLink("https://agmarknet.gov.in/" + researchLink.replace("../", ""));
                }
                else{
                researchStudiesDto.setResearchStudyLink(this.baseURL + researchLink);
                }


                researchStudiesDtosList.add(researchStudiesDto);
                i++;

            } catch (Exception e) {
                // e.printStackTrace();
                System.out.println(e);
            }
        }

        return researchStudiesDtosList;
    }

}
