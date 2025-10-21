/**
 */
package org.nasdanika.models.process;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.graph.model.Connection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.process.Transition#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.process.ProcessPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Connection<ProcessElement> {
	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.process.Artifact}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.process.Artifact#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see org.nasdanika.models.process.ProcessPackage#getTransition_Outputs()
	 * @see org.nasdanika.models.process.Artifact#getTransitions
	 * @model opposite="transitions"
	 * @generated
	 */
	EList<Artifact> getOutputs();

} // Transition
