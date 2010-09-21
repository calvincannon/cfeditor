/*
 * generated by Xtext
 */
package edu.kit.scc.cfeditor.ui.contentassist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import edu.kit.scc.cfeditor.cfeditor.Body;
import edu.kit.scc.cfeditor.cfeditor.BodyFunction;
import edu.kit.scc.cfeditor.cfeditor.Bundle;
import edu.kit.scc.cfeditor.definitions.CfDefinitionProvider;
import edu.kit.scc.cfeditor.validation.CfFunctionType;

/**
 * Customized content assistant.
 * 
 * @author Andreas Bender
 * 
 *         see
 *         http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist
 *         on how to customize content assistant
 */
public class CfeditorProposalProvider extends AbstractCfeditorProposalProvider {

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

		// super.completeBody_PromiseType(model, assignment, context, acceptor);
		final CfDefinitionProvider defProvider = CfDefinitionProvider.getInstance();
		final HashMap<String, LinkedList<String>> promiseMap = defProvider.getBodyFunctions();

		final Body body = (Body) model;
		final LinkedList<String> promiseTypeList = promiseMap.get(body.getComponent().getName());
		ICompletionProposal completionProposal;

		// ArrayList<String> promiseTypeList =
		// defProvider.getDefinitions("BodyPromiseTypes");
		for (String promiseType : promiseTypeList) {
			completionProposal = createCompletionProposal(promiseType, context);
			acceptor.accept(completionProposal);
		}
		// proposal = getValueConverter().toString(proposal, "ID");

		// completionProposal = createCompletionProposal(proposal, context);

		// acceptor.accept(completionProposal);
	}

	public void completeBundle_PromiseType(EObject model, final Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		// super.completeBundle_PromiseType(model, assignment, context,
		// acceptor);

		final CfDefinitionProvider cfDefProvider = CfDefinitionProvider.getInstance();
		HashMap<String, LinkedList<String>> promiseMap = cfDefProvider.getBundleTypes();

		Bundle bundle = (Bundle) model;
		LinkedList<String> promiseTypeList = promiseMap.get(bundle.getComponent().getName());
		ICompletionProposal completionProposal;
		for (String promiseType : promiseTypeList) {
			completionProposal = createCompletionProposal(promiseType, context);
			acceptor.accept(completionProposal);
		}
	}

	public void completeBundle_Component(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		CfDefinitionProvider cfDefProvider = CfDefinitionProvider.getInstance();
		ArrayList<String> componentList = cfDefProvider.getDefinitions("BundleComponents");

		ICompletionProposal completionProposal;
		for (String component : componentList) {
			completionProposal = createCompletionProposal(component, context);
			acceptor.accept(completionProposal);
		}
	}

	public void completeBody_Component(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		CfDefinitionProvider cfDefProvider = CfDefinitionProvider.getInstance();
		ArrayList<String> componentList = cfDefProvider.getDefinitions("BodyComponents");

		ICompletionProposal completionProposal;
		for (String component : componentList) {
			completionProposal = createCompletionProposal(component, context);
			acceptor.accept(completionProposal);
		}
	}// TODO dublicated code

	public void completeBodyFunction_Values(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {

		BodyFunction function = (BodyFunction) model;

		CfDefinitionProvider cfDefProvider = CfDefinitionProvider.getInstance();
		String[] functionAttributes = cfDefProvider.getBodyPromiseTypes().get(function.getName().getName());

		if (null != functionAttributes) {
			String functionType = functionAttributes[0];
			String typeRange = functionAttributes[1];

			CfFunctionType typeEnum = CfFunctionType.valueOf(functionType);

			if (typeEnum.equals(CfFunctionType.OPTION)) {

				ICompletionProposal completionProposal;
				String[] options = typeRange.split(",");

				for (String option : options) {
					completionProposal = createCompletionProposal('"'+option+'"', context);
					acceptor.accept(completionProposal);
				}
			}
		}
	}
}
