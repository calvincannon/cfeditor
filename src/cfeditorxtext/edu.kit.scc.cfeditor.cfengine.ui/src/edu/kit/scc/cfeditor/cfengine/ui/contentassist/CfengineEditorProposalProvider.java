package edu.kit.scc.cfeditor.cfengine.ui.contentassist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.parsetree.CompositeNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import edu.kit.scc.cfeditor.cfengine.cfengine.Body;
import edu.kit.scc.cfeditor.cfengine.cfengine.BodyFunction;
import edu.kit.scc.cfeditor.cfengine.cfengine.Bundle;
import edu.kit.scc.cfeditor.cfengine.definitions.CfDefinitionProvider;
import edu.kit.scc.cfeditor.cfengine.validation.CfengineEditorFunctionType;

/**
 * Customized content assistant.
 * 
 * @author Andreas Bender
 * 
 *         see
 *         http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist
 *         on how to customize content assistant
 */
public class CfengineEditorProposalProvider extends AbstractCfengineEditorProposalProvider {

	private CfDefinitionProvider cfDefProvider = CfDefinitionProvider.getInstance();

	/**
	 * Provides content assist for promise types in body block.
	 * 
	 * @param model
	 * @param assignment
	 * @param context
	 * @param acceptor
	 */
	public void completeBody_PromiseType(final EObject model, final Assignment assignment,
			final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {

		final HashMap<String, LinkedList<String>> promiseMap = cfDefProvider.getBodyFunctions();

		// TODO CfModel bei Class/PromiseType

		if (model.eClass().getName().equals("Body")) { // use instanceof or
														// try/catch?
			final Body body = (Body) model;
			final LinkedList<String> promiseTypeList = promiseMap.get(body.getComponent().getName());

			if (null != promiseTypeList) {
				createProposalAndAcceptList(promiseTypeList, context, acceptor);
			}
		}
		// proposal = getValueConverter().toString(proposal, "ID");
	}

	/**
	 * Provides content assist for promise types in bundle block.
	 * 
	 * @param model
	 * @param assignment
	 * @param context
	 * @param acceptor
	 */
	public void completeBundle_PromiseType(EObject model, final Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		HashMap<String, LinkedList<String>> promiseMap = cfDefProvider.getBundleTypes();

		Bundle bundle = (Bundle) model;
		LinkedList<String> promiseTypeList = promiseMap.get(bundle.getComponent().getName());

		if (null != promiseTypeList) {
			createProposalAndAcceptList(promiseTypeList, context, acceptor);
		}
	}

	/**
	 * Provides content assist for bundle components.
	 * 
	 * @param model
	 * @param assignment
	 * @param context
	 * @param acceptor
	 */
	public void completeBundle_Component(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		ArrayList<String> componentList = cfDefProvider.getDefinitions("BundleComponents");

		createProposalAndAcceptList(componentList, context, acceptor);
	}

	/**
	 * Provides content assist for body components.
	 * 
	 * @param model
	 * @param assignment
	 * @param context
	 * @param acceptor
	 */
	public void completeBody_Component(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		ArrayList<String> componentList = cfDefProvider.getDefinitions("BodyComponents");

		createProposalAndAcceptList(componentList, context, acceptor);
	}

	/**
	 * Provides content assist for body function values for example OPTION type
	 * values.
	 * 
	 * @param model
	 * @param assignment
	 * @param context
	 * @param acceptor
	 */
	public void completeBodyFunction_Values(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		try {
			BodyFunction function = (BodyFunction) model;

			String[] functionAttributes = cfDefProvider.getBodyPromiseTypes().get(function.getName().getName());

			if (null != functionAttributes) {
				String functionType = functionAttributes[0];
				String typeRange = functionAttributes[1];

				CfengineEditorFunctionType typeEnum = CfengineEditorFunctionType.valueOf(functionType);

				if (typeEnum.equals(CfengineEditorFunctionType.OPTION)) {

					ICompletionProposal completionProposal;
					String[] options = typeRange.split(",");

					for (String option : options) {
						completionProposal = createCompletionProposal('"' + option + '"', context);
						acceptor.accept(completionProposal);
					}
				}
			}
		} catch (ClassCastException e) {
			// ignore
		}
	}

	/**
	 * Provides content assist for promise types which are in a body class.
	 * 
	 * @param model
	 * @param assignment
	 * @param context
	 * @param acceptor
	 */
	public void completeBodyClass_PromiseType(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		CompositeNode node = NodeUtil.getNode(model);
		EObject eObj = NodeUtil.findASTParentElement(node);

		if (eObj instanceof Body) {
			Body body = (Body) eObj;
			completeBody_PromiseType(body, assignment, context, acceptor);
		}
	}

	private void createProposalAndAcceptList(List<String> wordList, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		ICompletionProposal completionProposal;
		for (String label : wordList) {
			completionProposal = createCompletionProposal(label, context);
			acceptor.accept(completionProposal);
		}
	}
}
