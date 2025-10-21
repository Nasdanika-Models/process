/**
 */
package org.nasdanika.models.process.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.graph.model.CompositeNode;
import org.nasdanika.graph.model.Graph;
import org.nasdanika.graph.model.ModelPackage;
import org.nasdanika.graph.model.SubGraph;

import org.nasdanika.models.process.ProcessElement;
import org.nasdanika.models.process.ProcessPackage;

import org.nasdanika.ncore.Catalog;
import org.nasdanika.ncore.DocumentedNamedStringIdentity;
import org.nasdanika.ncore.NcorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.process.impl.ProcessImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.nasdanika.models.process.impl.ProcessImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends ActivityImpl implements org.nasdanika.models.process.Process {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DocumentedNamedStringIdentity> getItems() {
		return (EList<DocumentedNamedStringIdentity>)eDynamicGet(ProcessPackage.PROCESS__ITEMS, NcorePackage.Literals.CATALOG__ITEMS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ProcessElement> getElements() {
		return (EList<ProcessElement>)eDynamicGet(ProcessPackage.PROCESS__ELEMENTS, ModelPackage.Literals.GRAPH__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.PROCESS__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
			case ProcessPackage.PROCESS__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessPackage.PROCESS__ITEMS:
				return getItems();
			case ProcessPackage.PROCESS__ELEMENTS:
				return getElements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProcessPackage.PROCESS__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends DocumentedNamedStringIdentity>)newValue);
				return;
			case ProcessPackage.PROCESS__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends ProcessElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProcessPackage.PROCESS__ITEMS:
				getItems().clear();
				return;
			case ProcessPackage.PROCESS__ELEMENTS:
				getElements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProcessPackage.PROCESS__ITEMS:
				return !getItems().isEmpty();
			case ProcessPackage.PROCESS__ELEMENTS:
				return !getElements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Catalog.class) {
			switch (derivedFeatureID) {
				case ProcessPackage.PROCESS__ITEMS: return NcorePackage.CATALOG__ITEMS;
				default: return -1;
			}
		}
		if (baseClass == Graph.class) {
			switch (derivedFeatureID) {
				case ProcessPackage.PROCESS__ELEMENTS: return ModelPackage.GRAPH__ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == SubGraph.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CompositeNode.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Catalog.class) {
			switch (baseFeatureID) {
				case NcorePackage.CATALOG__ITEMS: return ProcessPackage.PROCESS__ITEMS;
				default: return -1;
			}
		}
		if (baseClass == Graph.class) {
			switch (baseFeatureID) {
				case ModelPackage.GRAPH__ELEMENTS: return ProcessPackage.PROCESS__ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == SubGraph.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == CompositeNode.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProcessImpl
