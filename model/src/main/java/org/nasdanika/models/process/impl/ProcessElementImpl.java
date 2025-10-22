/**
 */
package org.nasdanika.models.process.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.graph.model.Connection;
import org.nasdanika.graph.model.impl.NodeImpl;
import org.nasdanika.models.process.ProcessElement;
import org.nasdanika.models.process.ProcessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProcessElementImpl extends NodeImpl<Connection<ProcessElement>> implements ProcessElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.PROCESS_ELEMENT;
	}

} //ProcessElementImpl
