/**
 */
package org.nasdanika.models.process;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.process.Repository#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.process.ProcessPackage#getRepository()
 * @model
 * @generated
 */
public interface Repository extends Resource {
	/**
	 * Returns the value of the '<em><b>Artifacts</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.process.Artifact}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.process.Artifact#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifacts</em>' reference list.
	 * @see org.nasdanika.models.process.ProcessPackage#getRepository_Artifacts()
	 * @see org.nasdanika.models.process.Artifact#getRepositories
	 * @model opposite="repositories"
	 * @generated
	 */
	EList<Artifact> getArtifacts();

} // Repository
