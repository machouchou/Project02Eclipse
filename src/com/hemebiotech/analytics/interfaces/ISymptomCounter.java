package com.hemebiotech.analytics.interfaces;

import java.util.List;
import java.util.Map;

/**
 * interface allowing to count the number of symptoms in the file
 * the implementation must order the list of symptoms
 * 
 * @author eayic
 *
 */

public interface ISymptomCounter {

	/**
	 * @param symptoms :  a list of symptoms
	 * @return a map with symptoms in alphabetical order and number of occurrence, without duplication.
	 */
	public Map<String, Integer> countSymptoms(List<String> symptoms);
}
