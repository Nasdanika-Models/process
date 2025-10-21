/**
 */
package org.nasdanika.models.process;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.graph.model.Connection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.process.Call#getRequest <em>Request</em>}</li>
 *   <li>{@link org.nasdanika.models.process.Call#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.process.ProcessPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Connection<ProcessElement> {
	/**
	 * Returns the value of the '<em><b>Request</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.process.Artifact}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.process.Artifact#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' reference list.
	 * @see org.nasdanika.models.process.ProcessPackage#getCall_Request()
	 * @see org.nasdanika.models.process.Artifact#getRequests
	 * @model opposite="requests"
	 * @generated
	 */
	EList<Artifact> getRequest();

	/**
	 * Returns the value of the '<em><b>Response</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.process.Artifact}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.process.Artifact#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' reference list.
	 * @see org.nasdanika.models.process.ProcessPackage#getCall_Response()
	 * @see org.nasdanika.models.process.Artifact#getResponses
	 * @model opposite="responses"
	 * @generated
	 */
	EList<Artifact> getResponse();

} // Call
