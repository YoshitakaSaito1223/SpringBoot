package com.example.demo20240509;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WeatherReport {
    @JsonProperty("publishingOffice")
    private String publishingOffice;
    
    @JsonProperty("reportDatetime")
    private String reportDatetime;
    
    @JsonProperty("targetArea")
    private String targetArea;
    
    @JsonProperty("headlineText")
    private String headlineText;
    
    @JsonProperty("text")
    private String text;
}
