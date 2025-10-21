/**
 */
package org.nasdanika.models.process;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.process.Role#getActors <em>Actors</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.process.ProcessPackage#getRole()
 * @model
 * @generated
 */
public interface Role extends ResourceConsumer {
	/**
	 * Returns the value of the '<em><b>Actors</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.process.Actor}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.process.Actor#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' reference list.
	 * @see org.nasdanika.models.process.ProcessPackage#getRole_Actors()
	 * @see org.nasdanika.models.process.Actor#getRoles
	 * @model opposite="roles"
	 * @generated
	 */
	EList<Actor> getActors();

} // Role
