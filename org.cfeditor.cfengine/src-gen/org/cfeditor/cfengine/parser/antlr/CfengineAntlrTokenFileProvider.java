/*
* generated by Xtext
*/
package org.cfeditor.cfengine.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CfengineAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/cfeditor/cfengine/parser/antlr/internal/InternalCfengine.tokens");
	}
}