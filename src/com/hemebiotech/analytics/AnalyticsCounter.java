package com.hemebiotech.analytics;

import java.util.List;

public class AnalyticsCounter {
	
	public void analyse() {
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> symptomList = reader.getSymptoms();
		
	}
}