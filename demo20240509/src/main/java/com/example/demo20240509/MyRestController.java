package com.example.demo20240509;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@GetMapping("/weather")
	public WeatherReport getWeather() {
		
		WeatherReport weatherReport =new WeatherReport();
		
		weatherReport.setPublishingOffice("Dummy");
		weatherReport.setHeadlineText("HeadLine");
		weatherReport.setReportDatetime("5/16");
		weatherReport.setTargetArea("Sibuya");
		weatherReport.setText("Clear");
		
		return weatherReport;
	}
	
	@GetMapping("/weather/{areaCode}")
	public WeatherReport getWeather(@PathVariable String areaCode) {
		
		WeatherReport weatherReport =new WeatherReport();
		
		weatherReport.setPublishingOffice("Dummy");
		weatherReport.setHeadlineText("HeadLine");
		weatherReport.setReportDatetime("5/16");
		weatherReport.setTargetArea("area code:"+areaCode);
		weatherReport.setText("Clear");
		
		return weatherReport;
	}
	
//	@GetMapping("/")
	
}
