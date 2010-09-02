package org.eclipse.xtext.highlighting;

import org.eclipse.xtext.cfeditor.PromiseType;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

public class CfeditorHighlightingCalculator implements
		ISemanticHighlightingCalculator {

	//@Override
	public void provideHighlightingFor(XtextResource resource,
			IHighlightedPositionAcceptor acceptor) {
		if (resource == null)
			return;

		Iterable<AbstractNode> allNodes = NodeUtil.getAllContents(resource
				.getParseResult().getRootNode());

		for (AbstractNode abstractNode : allNodes) {

			System.out.println(abstractNode.getElement());

			if (abstractNode.getElement() instanceof PromiseType) {
				acceptor.addPosition(abstractNode.getOffset(),
						abstractNode.getLength(),
						CfeditorHighlightingConfiguration.PROMISEHL);
			}
		}
	}
}
