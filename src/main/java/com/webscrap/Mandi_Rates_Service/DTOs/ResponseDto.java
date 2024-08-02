package com.webscrap.Mandi_Rates_Service.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto {

    private String responseMessage;
    private Integer responseId;
    private String[] customResponse;

    // public String[] setCustomResponse(String ...str){
    //     this.customResponse = str;
    //     return this.customResponse;
    // }

    // public 

}
