package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.hemebiotech.analytics.interfaces.ISymptomReader;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepathVariable a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile(String filepathVariable) {
		this.filepath = filepathVariable;
	}

	/**
	 * @see com.hemebiotech.analytics.interfaces.ISymptomReader#getSymptoms()
	 */
	@Override
	public List<String> getSymptoms() {
		List<String> result = new ArrayList<String>();
		
		if (filepath != null) {
			try(BufferedReader reader = new BufferedReader (new FileReader(filepath))) {
				
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
