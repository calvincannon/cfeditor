package edu.kit.scc.cfeditor.definitions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;

/**
 * Provides content of files containing predefined strings. This class is a
 * singleton.
 * 
 * @author Andreas Bender
 * 
 */
public final class CfDefinitionProvider {
	/**
	 * the input reader
	 */
	private BufferedReader bufferedReader;
	/**
	 * the list of the line strings
	 */
	private ArrayList<String> definitionList = null;
	/**
	 * the content of current line
	 */
	private String currentLine;

	/**
	 * map for storing bundle types
	 */
	private HashMap<String, LinkedList<String>> bundleTypes = null;

	/**
	 * map for storing body types
	 */
	private HashMap<String, String[]> bodyTypes = null;

	/**
	 * map for storing body functions
	 */
	private HashMap<String, LinkedList<String>> bodyFunctions = null;

	/**
	 * holds the instance of this class
	 */
	private static final CfDefinitionProvider INSTANCE = new CfDefinitionProvider();

	/**
	 * private constructor for singleton pattern
	 */
	private CfDefinitionProvider() {
	}
	
	private Namespace nsCfeditor=Namespace.getNamespace("http://www.kit.edu/scc/Cfeditor");

	/**
	 * Returns a list of the definition strings in a given file.
	 * 
	 * @param fileName
	 *            the name of the definition file
	 * @return list of definition strings
	 */
	public ArrayList<String> getDefinitions(final String fileName) {
		definitionList = new ArrayList<String>();

		try {
			bufferedReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(fileName)));
			while ((currentLine = bufferedReader.readLine()) != null) {
				if (!currentLine.trim().isEmpty()) {
					definitionList.add(currentLine.trim());
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return definitionList;
	}

	/**
	 * Returns an input stream to a definition file.
	 * 
	 * @param fileName
	 *            the name of the definition file
	 * @return input stream to the file
	 */
	public InputStream getDefinitionStream(final String fileName) {
		return this.getClass().getResourceAsStream(fileName);
	}

	/**
	 * Returns a HashMap containing the mapping of bundle components to allowed
	 * promise types.
	 * 
	 * @return the component - promise types map
	 */
	public HashMap<String, LinkedList<String>> getBundleTypes() {
		if (null == bundleTypes) {

			bundleTypes = new HashMap<String, LinkedList<String>>();
			LinkedList<String> linkedList;
			String[] values;

			try {
				bufferedReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(
						"BundleTypes")));
				while ((currentLine = bufferedReader.readLine()) != null) {
					values = currentLine.split("#", 2);
					if (values.length == 2) { // TODO components without defined
												// promise types are ignored
						if (bundleTypes.containsKey(values[0])) {
							bundleTypes.get(values[0]).add(values[1]);
						} else {
							linkedList = new LinkedList<String>();
							linkedList.add(values[1]);
							bundleTypes.put(values[0], linkedList);
						}
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
		}

		return bundleTypes;
	}

	/**
	 * Returns a HashMap containing the mapping of body components to allowed
	 * promise types.
	 * 
	 * @return the component - promise types map
	 */
	public HashMap<String, LinkedList<String>> getBodyFunctionsINIT() {
		if (null == bodyFunctions) {
			bodyFunctions = new HashMap<String, LinkedList<String>>();
			LinkedList<String> linkedList;
			try {
				bufferedReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(
						"BodyFunctions")));
				while ((currentLine = bufferedReader.readLine()) != null) {
					String[] values = currentLine.split("#", 2);
					if (bodyFunctions.containsKey(values[0])) {
						bodyFunctions.get(values[0]).add(values[1]);
					} else {
						linkedList = new LinkedList<String>();
						linkedList.add(values[1]);
						bodyFunctions.put(values[0], linkedList);
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return bodyFunctions;
	}

	/**
	 * Returns a HashMap containing the mapping of body components to allowed
	 * promise types.
	 * 
	 * @return the component - promise types map
	 */
	public HashMap<String, LinkedList<String>> getBodyFunctions() {
		if (null == bodyFunctions) {
			bodyFunctions = new HashMap<String, LinkedList<String>>();
			LinkedList<String> linkedList;
			final SAXBuilder builder = new SAXBuilder();
			try {
				final Document doc = builder.build(this.getClass().getResourceAsStream("Definitions.xml"));
				final AbstractList<Element> list = (AbstractList<Element>) doc.getRootElement().getChild("body",nsCfeditor)
						.getChildren("component",nsCfeditor);
				String componentName;
				StringTokenizer tokenizer;
			
				for (Element component : list) {
					componentName = component.getAttributeValue("name");
					tokenizer = new StringTokenizer(component.getAttributeValue("promisetypes"));

					while (tokenizer.hasMoreTokens()) {
						if (bodyFunctions.containsKey(componentName)) {
							bodyFunctions.get(componentName).add(tokenizer.nextToken());
						} else {
							linkedList = new LinkedList<String>();
							linkedList.add(tokenizer.nextToken());
							bodyFunctions.put(componentName, linkedList);
						}
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			} catch (JDOMException e) {
				e.printStackTrace();
			}
		}
		return bodyFunctions;
	}

	public HashMap<String, String[]> getBodyPromiseTypes() {
		// if (null == bodyFunctions)
		HashMap<String, String[]> promiseTypes = new HashMap<String, String[]>();
		SAXBuilder builder = new SAXBuilder();

		try {
			Document doc = builder.build(this.getClass().getResourceAsStream("Definitions.xml"));
			AbstractList<Element> list = (AbstractList<Element>) doc.getRootElement().getChild("body",nsCfeditor)
					.getChildren("promisetype",nsCfeditor);
			for (Element promiseType : list) {
				promiseTypes.put(promiseType.getAttributeValue("name"),
						new String[] { promiseType.getAttributeValue("type"), promiseType.getAttributeValue("range") });
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		}

		return promiseTypes;
	}

	public HashMap<String, String[]> getBodyPromiseTypesINIT() {
		if (null == bodyTypes) {
			bodyTypes = new HashMap<String, String[]>();

			bufferedReader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(
					"BodyPromiseTypes")));

			try {
				while ((currentLine = bufferedReader.readLine()) != null) {
					String[] values = currentLine.split("#", 3);

					bodyTypes.put(values[0], new String[] { values[1], values[2] });
					
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return bodyTypes;
	}

	/**
	 * Returns the instance of this class.
	 * 
	 * @return instance of CfDefinitionProvider.class
	 */
	public static CfDefinitionProvider getInstance() {
		return INSTANCE;
	}

}
