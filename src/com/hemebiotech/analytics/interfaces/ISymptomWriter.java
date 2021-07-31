package com.hemebiotech.analytics.interfaces;

import java.util.Map;

	/**
	 * Anything that will write symptom data to a file
	 * The important part is, the writting value from the operation, which is a list of strings,
	 * 
	 * 
	 */

public interface ISymptomWriter {
	
	/**
	 * 
	 * @param symptomMap : treeMap symptom file contains list of symptoms
	 * writeSymptoms writes a symptoms list in order in a text file "result.out" 
	 */
	
	public void writeSymptoms(Map<String, Integer> symptomSMap);

}
