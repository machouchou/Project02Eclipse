package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.hemebiotech.analytics.interfaces.ISymptomCounter;

public class SymptomCounter implements ISymptomCounter {

	/**
	 * @see com.hemebiotech.analytics.interfaces.ISymptomCounter#countSymptoms(List)
	 * countSymptoms counts a list of symptoms and returns an ordered map whith each symptom as key 
	 * and its occurrence as value.  
	 */
	@Override
	public Map<String, Integer> countSymptoms(List<String> symptoms) {
		
		if (symptoms == null) {
			return null;
		}
		
		Map<String, Integer> symptomMap = new TreeMap<String, Integer>();

		for(String line : symptoms) {
			int compteurFrequence = symptomMap.getOrDefault(line, 0);
			symptomMap.put(line, ++compteurFrequence);	// compter les occurrences			
		}
		
		return symptomMap;
	}
}
