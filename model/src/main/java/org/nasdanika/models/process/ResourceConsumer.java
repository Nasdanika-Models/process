/**
 */
package org.nasdanika.models.process;

import org.eclipse.emf.common.util.EList;

import org.nasdanika.ncore.DocumentedNamedStringIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.process.ResourceConsumer#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.process.ProcessPackage#getResourceConsumer()
 * @model
 * @generated
 */
public interface ResourceConsumer extends DocumentedNamedStringIdentity {
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.process.Resource}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.process.Resource#getConsumers <em>Consumers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.nasdanika.models.process.ProcessPackage#getResourceConsumer_Resources()
	 * @see org.nasdanika.models.process.Resource#getConsumers
	 * @model opposite="consumers"
	 * @generated
	 */
	EList<Resource> getResources();

} // ResourceConsumer
