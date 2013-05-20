package org.cfeditor.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.cfeditor.cfengine.Body;
import org.cfeditor.cfengine.BodyClass;
import org.cfeditor.cfengine.BodyComponent;
import org.cfeditor.cfengine.BodyFunction;
import org.cfeditor.cfengine.BodyPromiseType;
import org.cfeditor.cfengine.Bundle;
import org.cfeditor.cfengine.BundleClass;
import org.cfeditor.cfengine.BundleComponent;
import org.cfeditor.cfengine.BundlePromise;
import org.cfeditor.cfengine.BundlePromiseType;
import org.cfeditor.cfengine.CfModel;
import org.cfeditor.cfengine.CfenginePackage;
import org.cfeditor.cfengine.PromiseValue;
import org.cfeditor.cfengine.SimpleFunction;
import org.cfeditor.cfengine.SpecialFunction;
import org.cfeditor.services.CfengineGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CfengineSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CfengineGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CfenginePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CfenginePackage.BODY:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getBodyRule()) {
					sequence_Body(context, (Body) semanticObject); 
					return; 
				}
				else break;
			case CfenginePackage.BODY_CLASS:
				if(context == grammarAccess.getBodyClassRule()) {
					sequence_BodyClass(context, (BodyClass) semanticObject); 
					return; 
				}
				else break;
			case CfenginePackage.BODY_COMPONENT:
				if(context == grammarAccess.getBodyComponentRule()) {
					sequence_BodyComponent(context, (BodyComponent) semanticObject); 
					return; 
				}
				else break;
			case CfenginePackage.BODY_FUNCTION:
				if(context == grammarAccess.getBodyFunctionRule()) {
					sequence_BodyFunction(context, (BodyFunction) semanticObject); 
					return; 
				}
				else break;
			case CfenginePackage.BODY_PROMISE_TYPE:
				if(context == grammarAccess.getBodyPromiseTypeRule()) {
					sequence_BodyPromiseType(context, (BodyPromiseType) semanticObject); 
					return; 
				}
				else break;
			case CfenginePackage.BUNDLE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getBundleRule()) {
					sequence_Bundle(context, (Bundle) semanticObject); 
					return; 
				}
				else break;
			case CfenginePackage.BUNDLE_CLASS:
				if(context == grammarAccess.getBundleClassRule()) {
					sequence_BundleClass(context, (BundleClass) semanticObject); 
					return; 
				}
				else break;
			case CfenginePackage.BUNDLE_COMPONENT:
				if(context == grammarAccess.getBundleComponentRule()) {
					sequence_BundleComponent(context, (BundleComponent) semanticObject); 
					return; 
				}
				else break;
			case CfenginePackage.BUNDLE_PROMISE:
				if(context == grammarAccess.getBundlePromiseRule()) {
					sequence_BundlePromise(context, (BundlePromise) semanticObject); 
					return; 
				}
				else break;
			case CfenginePackage.BUNDLE_PROMISE_TYPE:
				if(context == grammarAccess.getBundlePromiseTypeRule()) {
					sequence_BundlePromiseType(context, (BundlePromiseType) semanticObject); 
					return; 
				}
				else break;
			case CfenginePackage.CF_MODEL:
				if(context == grammarAccess.getCfModelRule()) {
					sequence_CfModel(context, (CfModel) semanticObject); 
					return; 
				}
				else break;
			case CfenginePackage.PROMISE_VALUE:
				if(context == grammarAccess.getPromiseValueRule()) {
					sequence_PromiseValue(context, (PromiseValue) semanticObject); 
					return; 
				}
				else break;
			case CfenginePackage.SIMPLE_FUNCTION:
				if(context == grammarAccess.getSimpleFunctionRule()) {
					sequence_SimpleFunction(context, (SimpleFunction) semanticObject); 
					return; 
				}
				else break;
			case CfenginePackage.SPECIAL_FUNCTION:
				if(context == grammarAccess.getSpecialFunctionRule()) {
					sequence_SpecialFunction(context, (SpecialFunction) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=CLASS_ID promiseType+=BodyFunction*)
	 */
	protected void sequence_BodyClass(EObject context, BodyClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_BodyComponent(EObject context, BodyComponent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CfenginePackage.Literals.BODY_COMPONENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CfenginePackage.Literals.BODY_COMPONENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBodyComponentAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=BodyPromiseType (values+=STRING | (List?='{' values+=STRING values+=STRING*) | function+=SpecialFunction)?)
	 */
	protected void sequence_BodyFunction(EObject context, BodyFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_BodyPromiseType(EObject context, BodyPromiseType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CfenginePackage.Literals.BODY_PROMISE_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CfenginePackage.Literals.BODY_PROMISE_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBodyPromiseTypeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (component=BodyComponent name=ID (variables+=ID variables+=ID*)? promiseType+=BodyFunction* classes+=BodyClass*)
	 */
	protected void sequence_Body(EObject context, Body semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=CLASS_ID promises+=BundlePromise+)
	 */
	protected void sequence_BundleClass(EObject context, BundleClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_BundleComponent(EObject context, BundleComponent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CfenginePackage.Literals.BUNDLE_COMPONENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CfenginePackage.Literals.BUNDLE_COMPONENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBundleComponentAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID promises+=BundlePromise* classes+=BundleClass*)
	 */
	protected void sequence_BundlePromiseType(EObject context, BundlePromiseType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING (values+=PromiseValue values+=PromiseValue*)?)
	 */
	protected void sequence_BundlePromise(EObject context, BundlePromise semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (component=BundleComponent name=ID (variables+=ID variables+=ID*)? promiseType+=BundlePromiseType*)
	 */
	protected void sequence_Bundle(EObject context, Bundle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=AbstractElement*
	 */
	protected void sequence_CfModel(EObject context, CfModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         keyword=ID 
	 *         (
	 *             values+=STRING | 
	 *             functions+=SimpleFunction | 
	 *             values+=ID | 
	 *             ((values+=STRING | functions+=SimpleFunction) (values+=STRING | functions+=SimpleFunction)*)
	 *         )?
	 *     )
	 */
	protected void sequence_PromiseValue(EObject context, PromiseValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID values+=STRING values+=STRING*)
	 */
	protected void sequence_SimpleFunction(EObject context, SimpleFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID func+=SpecialFunction*)
	 */
	protected void sequence_SpecialFunction(EObject context, SpecialFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
