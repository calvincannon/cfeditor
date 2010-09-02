package org.eclipse.xtext.definitions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Provides content of files containing predefined strings.
 * 
 * @author Andreas Bender
 * 
 */
public class CfDefinitionProvider {
	/**
	 * the input reader
	 */
	BufferedReader in;
	/**
	 * the list of the line strings
	 */
	ArrayList<String> definitionList;
	/**
	 * the content of current line
	 */
	String currentLine;

	/**
	 * Returns a list of the definition strings in a given file.
	 * 
	 * @param fileName
	 *            the name of the definition file
	 * @return list of definition strings
	 */
	public ArrayList<String> getDefinitions(String fileName) {
		definitionList = new ArrayList<String>();
		try {
			in = new BufferedReader(new InputStreamReader(this.getClass()
					.getResourceAsStream(fileName)));
			while ((currentLine = in.readLine()) != null) {
				if (!currentLine.trim().isEmpty())
					definitionList.add(currentLine.trim());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// System.out.print(definitionList);
		return definitionList;

	}

	/**
	 * Returns an input stream to a definition file.
	 * 
	 * @param fileName
	 *            the name of the definition file
	 * @return input stream to the file
	 */
	public InputStream getDefinitionStream(String fileName) {
		return this.getClass().getResourceAsStream(fileName);
	}

	public HashMap<String, LinkedList<String>> getBundleTypes() {
		HashMap<String, LinkedList<String>> bundleTypes = new HashMap<String, LinkedList<String>>();
		LinkedList<String> linkedList;
		try {
			in = new BufferedReader(new InputStreamReader(this.getClass()
					.getResourceAsStream("BundleTypes")));
			while ((currentLine = in.readLine()) != null) {
				String[] values = currentLine.split("#", 2);
				if (bundleTypes.containsKey(values[0])) {
					bundleTypes.get(values[0]).add(values[1]);
				} else {
					linkedList = new LinkedList<String>();
					linkedList.add(values[1]);
					bundleTypes.put(values[0], linkedList);
				}
				// bundleTypes.get(key);
				// if (!currentLine.trim().isEmpty())
				// definitionList.add(currentLine.trim());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return bundleTypes;
	}
}
