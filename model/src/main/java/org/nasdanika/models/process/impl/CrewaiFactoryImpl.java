/**
 */
package org.nasdanika.models.process.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.nasdanika.models.process.Agent;
import org.nasdanika.models.process.Callback;
import org.nasdanika.models.process.Code;
import org.nasdanika.models.process.Configurable;
import org.nasdanika.models.process.Crew;
import org.nasdanika.models.process.CrewaiFactory;
import org.nasdanika.models.process.CrewaiPackage;
import org.nasdanika.models.process.Function;
import org.nasdanika.models.process.Guardrail;
import org.nasdanika.models.process.KnowledgeSource;
import org.nasdanika.models.process.LargeLanguageModel;
import org.nasdanika.models.process.Task;
import org.nasdanika.models.process.Tool;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CrewaiFactoryImpl extends EFactoryImpl implements CrewaiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CrewaiFactory init() {
		try {
			CrewaiFactory theCrewaiFactory = (CrewaiFactory)EPackage.Registry.INSTANCE.getEFactory(CrewaiPackage.eNS_URI);
			if (theCrewaiFactory != null) {
				return theCrewaiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CrewaiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CrewaiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CrewaiPackage.CODE: return createCode();
			case CrewaiPackage.FUNCTION: return createFunction();
			case CrewaiPackage.GUARDRAIL: return createGuardrail();
			case CrewaiPackage.CALLBACK: return createCallback();
			case CrewaiPackage.CONFIGURABLE: return createConfigurable();
			case CrewaiPackage.TOOL: return createTool();
			case CrewaiPackage.AGENT: return createAgent();
			case CrewaiPackage.CREW: return createCrew();
			case CrewaiPackage.TASK: return createTask();
			case CrewaiPackage.LARGE_LANGUAGE_MODEL: return createLargeLanguageModel();
			case CrewaiPackage.KNOWLEDGE_SOURCE: return createKnowledgeSource();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CrewaiPackage.PROCESS:
				return createProcessFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CrewaiPackage.PROCESS:
				return convertProcessToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configurable createConfigurable() {
		ConfigurableImpl configurable = new ConfigurableImpl();
		return configurable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tool createTool() {
		ToolImpl tool = new ToolImpl();
		return tool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Crew createCrew() {
		CrewImpl crew = new CrewImpl();
		return crew;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LargeLanguageModel createLargeLanguageModel() {
		LargeLanguageModelImpl largeLanguageModel = new LargeLanguageModelImpl();
		return largeLanguageModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Guardrail createGuardrail() {
		GuardrailImpl guardrail = new GuardrailImpl();
		return guardrail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Callback createCallback() {
		CallbackImpl callback = new CallbackImpl();
		return callback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KnowledgeSource createKnowledgeSource() {
		KnowledgeSourceImpl knowledgeSource = new KnowledgeSourceImpl();
		return knowledgeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.nasdanika.models.process.Process createProcessFromString(EDataType eDataType, String initialValue) {
		org.nasdanika.models.process.Process result = org.nasdanika.models.process.Process.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrewaiPackage getCrewaiPackage() {
		return (CrewaiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CrewaiPackage getPackage() {
		return CrewaiPackage.eINSTANCE;
	}

} //CrewaiFactoryImpl
