package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import com.hemebiotech.analytics.interfaces.ISymptomWriter;

public class WriteSymptomDataToFile implements ISymptomWriter {
	
	private String resultFile;
	
	/**
	 * @param resultFile
	 */
	public WriteSymptomDataToFile(String resultFile) {
		this.resultFile = resultFile;
	}

	/**
	 * @see com.hemebiotech.analytics.ISymptomWriter#writeSymptoms(Map<String, Integer> symptomMap)
	 */
	@Override

	public void writeSymptoms(Map<String, Integer> symptomMap) {
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(this.resultFile);
			
			for(String symptom : symptomMap.keySet()) {
				writer.write(symptom.substring(0, 1).toUpperCase() + symptom.substring(1) + " : " + symptomMap.get(symptom) + "\n");	
			}
		} catch(IOException e) {
			e.printStackTrace();
			
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} 
	}
}
