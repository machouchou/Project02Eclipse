package com.hemebiotech.analytics.interfaces;

import java.util.List;
import java.util.Map;

/**
 *
 * @author eayic
 *
 */


public interface ISymptomCounter {
	public Map<String, Integer> countSymptoms(List<String> symptoms);
}
