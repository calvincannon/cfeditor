package edu.kit.scc.cfeditor.ui.highlighting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.cfeditor.BodyComponent;
import org.eclipse.xtext.cfeditor.BodyPromiseType;
import org.eclipse.xtext.cfeditor.BundleComponent;
import org.eclipse.xtext.cfeditor.BundlePromiseType;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.LeafNode;
import org.eclipse.xtext.parsetree.NodeAdapter;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * Semantic highlighting calculator. Computes highlighting rules based on the
 * model elements.
 * 
 * TODO declare the class in CfeditorUiModule highlighting rules
 * 
 * @author Andreas Bender
 * 
 */
public class CfeditorHighlightingCalculator implements ISemanticHighlightingCalculator {

	// @Override
	/**
	 * Associates styles to computed ranges.
	 * 
	 * @param resource
	 *            current xtext resource
	 * @param acceptor
	 * 
	 */
	public void provideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor) {
		if (resource == null) {
			return;
		}
		// TreeIterator<EObject> ti=resource.getAllContents();
		// for(EObject eobj:ti){}

		// for (Iterator<EObject> i = resource.getAllContents(); i.hasNext(); )
		// {
		// EObject o = i.next();
		// System.out.println(o.getClass().getName());
		// CompositeNode nodecomp =NodeUtil.getNode(o);
		// System.out.println("length:"+nodecomp.getLength());
		// }

		// TODO Debugging
		// CfModel m = (CfModel) resource.getContents().get(0);
		// List modelelements = m.getElements();

		// List<BundlePromiseType> classes =
		// EcoreUtil2.typeSelect(modelelements, BundlePromiseType.class);

		// System.out.println("model:"+resource.getContents().get(0).toString());
		// System.out.println("elements:"+modelelements);
		// System.out.println("classes:"+classes);

		// for (BundlePromiseType bundle : classes) {
		// CompositeNode nodecomp = NodeUtil.getNode(bundle);
		// System.out.println("length:" + nodecomp.getLength() +
		// bundle.getName());
		// // System.out.println(bundle.getPromiseType());
		//
		// }
		// System.out.println(resource.getContents());
		// EList<EObject> elist= resource.getContents();
		// elist.
		// acceptor.
		final Iterable<AbstractNode> allNodes = NodeUtil.getAllContents(resource.getParseResult().getRootNode());
		EObject nodeElement;
		for (AbstractNode abstractNode : allNodes) {
			nodeElement = abstractNode.getElement();
			// System.out.println(abstractNode.getElement());

			if (nodeElement instanceof BundlePromiseType || nodeElement instanceof BodyPromiseType) {
				acceptor.addPosition(abstractNode.getOffset(), abstractNode.getLength(),
						CfeditorHighlightingConfiguration.PROMISE_TYPE);

				// System.out.println(abstractNode.getElement());
			} else if (nodeElement instanceof BundleComponent || nodeElement instanceof BodyComponent) {
				acceptor.addPosition(abstractNode.getOffset(), abstractNode.getLength(),
						CfeditorHighlightingConfiguration.KEYWORD_ID);
			}

			// if (nodeElement instanceof Bundle) {
			// LeafNode nodetohighlight =
			// getFirstFeatureNode(abstractNode.getElement(),
			// "name");
			// System.out.println("Name:"+CfeditorPackage.Literals.BUNDLE_COMPONENT__NAME+"get:"+CfeditorPackage.Literals.BUNDLE_COMPONENT__NAME.getName());
			// System.out.println("nodeto:"+nodetohighlight);
			// acceptor.addPosition(nodetohighlight.getOffset(),
			// nodetohighlight.getLength(),
			// CfeditorHighlightingConfiguration.PROMISEHL);
			// }
		}
	}

	public LeafNode getFirstFeatureNode(final EObject semantic, final String feature) {
		final NodeAdapter adapter = NodeUtil.getNodeAdapter(semantic);
		if (adapter != null) {
			final CompositeNode node = adapter.getParserNode();
			if (node != null) {
				if (feature == null) {
					return null;
				}
				for (AbstractNode child : node.getChildren()) {
					if (child instanceof LeafNode) {
						System.out.println("child:" + child);
						if (feature.equals(((LeafNode) child).getFeature())) {
							return (LeafNode) child;
						}
					}
				}
			}
		}
		return null;
	}
}
