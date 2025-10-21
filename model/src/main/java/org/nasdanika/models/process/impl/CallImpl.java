/**
 */
package org.nasdanika.models.process.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.graph.model.impl.ConnectionImpl;

import org.nasdanika.models.process.Artifact;
import org.nasdanika.models.process.Call;
import org.nasdanika.models.process.ProcessElement;
import org.nasdanika.models.process.ProcessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.process.impl.CallImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link org.nasdanika.models.process.impl.CallImpl#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallImpl extends ConnectionImpl<ProcessElement> implements Call {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetTarget(ProcessElement newTarget, NotificationChain msgs) {
		return super.basicSetTarget(newTarget, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getRequest() {
		return (EList<Artifact>)eDynamicGet(ProcessPackage.CALL__REQUEST, ProcessPackage.Literals.CALL__REQUEST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getResponse() {
		return (EList<Artifact>)eDynamicGet(ProcessPackage.CALL__RESPONSE, ProcessPackage.Literals.CALL__RESPONSE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.CALL__REQUEST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequest()).basicAdd(otherEnd, msgs);
			case ProcessPackage.CALL__RESPONSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponse()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessPackage.CALL__REQUEST:
				return ((InternalEList<?>)getRequest()).basicRemove(otherEnd, msgs);
			case ProcessPackage.CALL__RESPONSE:
				return ((InternalEList<?>)getResponse()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.CALL__REQUEST:
				return getRequest();
			case ProcessPackage.CALL__RESPONSE:
				return getResponse();
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
			case ProcessPackage.CALL__REQUEST:
				getRequest().clear();
				getRequest().addAll((Collection<? extends Artifact>)newValue);
				return;
			case ProcessPackage.CALL__RESPONSE:
				getResponse().clear();
				getResponse().addAll((Collection<? extends Artifact>)newValue);
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
			case ProcessPackage.CALL__REQUEST:
				getRequest().clear();
				return;
			case ProcessPackage.CALL__RESPONSE:
				getResponse().clear();
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
			case ProcessPackage.CALL__REQUEST:
				return !getRequest().isEmpty();
			case ProcessPackage.CALL__RESPONSE:
				return !getResponse().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CallImpl
