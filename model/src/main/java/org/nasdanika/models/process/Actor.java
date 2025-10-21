/**
 */
package org.nasdanika.models.process;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.process.Actor#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.process.ProcessPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends ResourceConsumer {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.process.Role}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.process.Role#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see org.nasdanika.models.process.ProcessPackage#getActor_Roles()
	 * @see org.nasdanika.models.process.Role#getActors
	 * @model opposite="actors"
	 * @generated
	 */
	EList<Role> getRoles();

} // Actor
