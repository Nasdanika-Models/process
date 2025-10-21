/**
 */
package org.nasdanika.models.process.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.process.Activity;
import org.nasdanika.models.process.Artifact;
import org.nasdanika.models.process.Call;
import org.nasdanika.models.process.ProcessPackage;
import org.nasdanika.models.process.Repository;
import org.nasdanika.models.process.Transition;

import org.nasdanika.ncore.impl.DocumentedNamedStringIdentityImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.process.impl.ArtifactImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link org.nasdanika.models.process.impl.ArtifactImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.nasdanika.models.process.impl.ArtifactImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.process.impl.ArtifactImpl#getRequests <em>Requests</em>}</li>
 *   <li>{@link org.nasdanika.models.process.impl.ArtifactImpl#getResponses <em>Responses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactImpl extends DocumentedNamedStringIdentityImpl implements Artifact {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Activity> getActivities() {
		return (EList<Activity>)eDynamicGet(ProcessPackage.ARTIFACT__ACTIVITIES, ProcessPackage.Literals.ARTIFACT__ACTIVITIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Repository> getRepositories() {
		return (EList<Repository>)eDynamicGet(ProcessPackage.ARTIFACT__REPOSITORIES, ProcessPackage.Literals.ARTIFACT__REPOSITORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getTransitions() {
		return (EList<Transition>)eDynamicGet(ProcessPackage.ARTIFACT__TRANSITIONS, ProcessPackage.Literals.ARTIFACT__TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Call> getRequests() {
		return (EList<Call>)eDynamicGet(ProcessPackage.ARTIFACT__REQUESTS, ProcessPackage.Literals.ARTIFACT__REQUESTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Call> getResponses() {
		return (EList<Call>)eDynamicGet(ProcessPackage.ARTIFACT__RESPONSES, ProcessPackage.Literals.ARTIFACT__RESPONSES, true, true);
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
			case ProcessPackage.ARTIFACT__ACTIVITIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActivities()).basicAdd(otherEnd, msgs);
			case ProcessPackage.ARTIFACT__REPOSITORIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRepositories()).basicAdd(otherEnd, msgs);
			case ProcessPackage.ARTIFACT__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
			case ProcessPackage.ARTIFACT__REQUESTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRequests()).basicAdd(otherEnd, msgs);
			case ProcessPackage.ARTIFACT__RESPONSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponses()).basicAdd(otherEnd, msgs);
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
			case ProcessPackage.ARTIFACT__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
			case ProcessPackage.ARTIFACT__REPOSITORIES:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
			case ProcessPackage.ARTIFACT__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case ProcessPackage.ARTIFACT__REQUESTS:
				return ((InternalEList<?>)getRequests()).basicRemove(otherEnd, msgs);
			case ProcessPackage.ARTIFACT__RESPONSES:
				return ((InternalEList<?>)getResponses()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.ARTIFACT__ACTIVITIES:
				return getActivities();
			case ProcessPackage.ARTIFACT__REPOSITORIES:
				return getRepositories();
			case ProcessPackage.ARTIFACT__TRANSITIONS:
				return getTransitions();
			case ProcessPackage.ARTIFACT__REQUESTS:
				return getRequests();
			case ProcessPackage.ARTIFACT__RESPONSES:
				return getResponses();
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
			case ProcessPackage.ARTIFACT__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case ProcessPackage.ARTIFACT__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends Repository>)newValue);
				return;
			case ProcessPackage.ARTIFACT__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case ProcessPackage.ARTIFACT__REQUESTS:
				getRequests().clear();
				getRequests().addAll((Collection<? extends Call>)newValue);
				return;
			case ProcessPackage.ARTIFACT__RESPONSES:
				getResponses().clear();
				getResponses().addAll((Collection<? extends Call>)newValue);
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
			case ProcessPackage.ARTIFACT__ACTIVITIES:
				getActivities().clear();
				return;
			case ProcessPackage.ARTIFACT__REPOSITORIES:
				getRepositories().clear();
				return;
			case ProcessPackage.ARTIFACT__TRANSITIONS:
				getTransitions().clear();
				return;
			case ProcessPackage.ARTIFACT__REQUESTS:
				getRequests().clear();
				return;
			case ProcessPackage.ARTIFACT__RESPONSES:
				getResponses().clear();
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
			case ProcessPackage.ARTIFACT__ACTIVITIES:
				return !getActivities().isEmpty();
			case ProcessPackage.ARTIFACT__REPOSITORIES:
				return !getRepositories().isEmpty();
			case ProcessPackage.ARTIFACT__TRANSITIONS:
				return !getTransitions().isEmpty();
			case ProcessPackage.ARTIFACT__REQUESTS:
				return !getRequests().isEmpty();
			case ProcessPackage.ARTIFACT__RESPONSES:
				return !getResponses().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactImpl
