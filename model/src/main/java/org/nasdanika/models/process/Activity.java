/**
 */
package org.nasdanika.models.process;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.graph.model.Connection;
import org.nasdanika.graph.model.Node;

import org.nasdanika.models.party.Role;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.process.Activity#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.process.Activity#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.process.ProcessPackage#getActivity()
 * @model
 * @generated
 */
public interface Activity extends ResourceConsumer, ProcessElement, Node<Connection<ProcessElement>> {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.party.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.nasdanika.models.process.ProcessPackage#getActivity_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.process.Artifact}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.process.Artifact#getActivities <em>Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' reference list.
	 * @see org.nasdanika.models.process.ProcessPackage#getActivity_Artifacts()
	 * @see org.nasdanika.models.process.Artifact#getActivities
	 * @model opposite="activities"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

} // Activity
