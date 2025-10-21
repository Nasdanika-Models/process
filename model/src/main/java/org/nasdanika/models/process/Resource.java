/**
 */
package org.nasdanika.models.process;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedStringIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.process.Resource#getConsumers <em>Consumers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.process.ProcessPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends DocumentedNamedStringIdentity {
	/**
	 * Returns the value of the '<em><b>Consumers</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.process.ResourceConsumer}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.process.ResourceConsumer#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumers</em>' reference list.
	 * @see org.nasdanika.models.process.ProcessPackage#getResource_Consumers()
	 * @see org.nasdanika.models.process.ResourceConsumer#getResources
	 * @model opposite="resources"
	 * @generated
	 */
	EList<ResourceConsumer> getConsumers();

} // Resource
