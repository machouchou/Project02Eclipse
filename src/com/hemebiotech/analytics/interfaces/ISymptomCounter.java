package com.hemebiotech.analytics.interfaces;

import java.util.List;
import java.util.Map;

	/**
	 *
	 * countSymptoms counts symptom occurrence and put data in a map 
	 * 
	 * @param lSymptoms a list of symptoms
	 * 
	 * the implementation must order the list of symptoms
	 * 
	 * @author eayic
	 *
	 */


public interface ISymptomCounter {
	
	/**
	 * if symptoms == null, return null;
	 * @return a map with symptoms in alphabetical order and number of occurrence, without duplication.
	 */
	public Map<String, Integer> countSymptoms(List<String> symptoms);
}
