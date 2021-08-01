package com.hemebiotech.analytics.interfaces;

import java.util.Map;

/**
 * Anything that will write symptom data into an external file
 */
public interface ISymptomWriter {
	
	/**
	 * @param symptomMap : treeMap contains symptoms list and their occurrence
	 */
	public void writeSymptoms(Map<String, Integer> symptomMap);

}
