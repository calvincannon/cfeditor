package edu.kit.scc.cfeditor.cfengine.ui.reporting;

import edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction;

/**
 * Stores information of a body function element. Contains URI to the file and offset where the body function can be found.
 * 
 * @author Andreas Bender
 */
public class BodyFunctionElement {
	private String uri;
	private int offset;
	private BodyFunction bodyFunction;

	/**
	 * The Constructor. Initializes attributes.
	 * 
	 * @param uri URI to file
	 * @param offset offset in file
	 * @param bodyFunction body function element
	 */
	public BodyFunctionElement(String uri, int offset, BodyFunction bodyFunction) {
		super();
		this.uri = uri;
		this.offset = offset;
		this.bodyFunction = bodyFunction;
	}

	/**
	 * Sets URI.
	 * 
	 * @param uri URI as String
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * Returns URI as String.
	 * 
	 * @return URI to file
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * Sets Offset.
	 * 
	 * @param offset offset value
	 */
	public void setOffset(int offset) {
		this.offset = offset;
	}

	/**
	 * Returns the offset value.
	 * 
	 * @return offset value
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * Sets body function element.
	 * 
	 * @param bodyFunction body function object
	 */
	public void setBodyFunction(BodyFunction bodyFunction) {
		this.bodyFunction = bodyFunction;
	}

	/**
	 * Returns body function element.
	 * 
	 * @return body function object
	 */
	public BodyFunction getBodyFunction() {
		return bodyFunction;
	}
}
