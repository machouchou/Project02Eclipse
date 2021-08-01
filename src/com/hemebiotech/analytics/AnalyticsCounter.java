 package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

import com.hemebiotech.analytics.interfaces.ISymptomCounter;
import com.hemebiotech.analytics.interfaces.ISymptomReader;
import com.hemebiotech.analytics.interfaces.ISymptomWriter;

public class AnalyticsCounter {
	/**
	 * analyse method calls getSymptoms method from ReadSymptomDataFromFile class
	 * getSymptoms method returns a symptoms list that is passed to countSymptoms 
	 * method of SymptomCounter class;
	 * countSymptoms method returns an ordered map with each symptom as key and 
	 * its occurrence as value.
	 * writeSymptoms method recieves the symptoms map and writes each symptom 
	 * and its occurrence in a file named result.out. 
	 */
	public void analyse() {
		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> symptomList = reader.getSymptoms();
		
		ISymptomCounter counter = new SymptomCounter();
		Map<String, Integer> mapSymptoms = counter.countSymptoms(symptomList);
		
		ISymptomWriter writer = new WriteSymptomDataToFile("result.out");
		writer.writeSymptoms(mapSymptoms);
	} 	
}