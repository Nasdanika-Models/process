/**
 */
package org.nasdanika.models.process;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.ncore.DocumentedNamedStringIdentity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.process.KnowledgeSource#getAgents <em>Agents</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.process.CrewaiPackage#getKnowledgeSource()
 * @model
 * @generated
 */
public interface KnowledgeSource extends DocumentedNamedStringIdentity {

	/**
	 * Returns the value of the '<em><b>Agents</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.process.Agent}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.process.Agent#getKnowledgeSources <em>Knowledge Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' reference list.
	 * @see org.nasdanika.models.process.CrewaiPackage#getKnowledgeSource_Agents()
	 * @see org.nasdanika.models.process.Agent#getKnowledgeSources
	 * @model opposite="knowledgeSources"
	 * @generated
	 */
	EList<Agent> getAgents();
} // KnowledgeSource
