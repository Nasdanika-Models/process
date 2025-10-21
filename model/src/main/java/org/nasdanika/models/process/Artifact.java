/**
 */
package org.nasdanika.models.process;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedStringIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.process.Artifact#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.nasdanika.models.process.Artifact#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.nasdanika.models.process.Artifact#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.process.Artifact#getRequests <em>Requests</em>}</li>
 *   <li>{@link org.nasdanika.models.process.Artifact#getResponses <em>Responses</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.process.ProcessPackage#getArtifact()
 * @model
 * @generated
 */
public interface Artifact extends DocumentedNamedStringIdentity {
	/**
	 * Returns the value of the '<em><b>Activities</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.process.Activity}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.process.Activity#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' reference list.
	 * @see org.nasdanika.models.process.ProcessPackage#getArtifact_Activities()
	 * @see org.nasdanika.models.process.Activity#getArtifacts
	 * @model opposite="artifacts"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>Repositories</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.process.Repository}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.process.Repository#getArtifacts <em>Artifacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repositories</em>' reference list.
	 * @see org.nasdanika.models.process.ProcessPackage#getArtifact_Repositories()
	 * @see org.nasdanika.models.process.Repository#getArtifacts
	 * @model opposite="artifacts"
	 * @generated
	 */
	EList<Repository> getRepositories();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.process.Transition}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.process.Transition#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' reference list.
	 * @see org.nasdanika.models.process.ProcessPackage#getArtifact_Transitions()
	 * @see org.nasdanika.models.process.Transition#getOutputs
	 * @model opposite="outputs"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.process.Call}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.process.Call#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' reference list.
	 * @see org.nasdanika.models.process.ProcessPackage#getArtifact_Requests()
	 * @see org.nasdanika.models.process.Call#getRequest
	 * @model opposite="request"
	 * @generated
	 */
	EList<Call> getRequests();

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.process.Call}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.process.Call#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' reference list.
	 * @see org.nasdanika.models.process.ProcessPackage#getArtifact_Responses()
	 * @see org.nasdanika.models.process.Call#getResponse
	 * @model opposite="response"
	 * @generated
	 */
	EList<Call> getResponses();

} // Artifact
