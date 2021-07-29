package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

import com.hemebiotech.analytics.interfaces.ISymptomCounter;
import com.hemebiotech.analytics.interfaces.ISymptomReader;
import com.hemebiotech.analytics.interfaces.ISymptomWriter;

public class AnalyticsCounter {
	
	public void analyse() {
		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> symptomList = reader.getSymptoms();
		
		ISymptomCounter counter = new SymptomCounter();
		Map<String, Integer> mapSymptoms = counter.countSymptoms(symptomList);
		
		ISymptomWriter writer = new WriteSymptomDataToFile("result.out");
		writer.writeSymptoms(mapSymptoms);
	} 	
}