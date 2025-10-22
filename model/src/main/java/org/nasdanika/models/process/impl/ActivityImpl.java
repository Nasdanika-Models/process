/**
 */
package org.nasdanika.models.process.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.drawio.model.ModelPackage;
import org.nasdanika.drawio.model.SemanticElement;
import org.nasdanika.drawio.model.SemanticMapping;

import org.nasdanika.graph.model.Connection;
import org.nasdanika.graph.model.ConnectionSource;
import org.nasdanika.graph.model.ConnectionTarget;
import org.nasdanika.graph.model.GraphElement;
import org.nasdanika.graph.model.Node;

import org.nasdanika.models.party.Role;

import org.nasdanika.models.process.Activity;
import org.nasdanika.models.process.Artifact;
import org.nasdanika.models.process.ProcessElement;
import org.nasdanika.models.process.ProcessPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.process.impl.ActivityImpl#getSemanticMappings <em>Semantic Mappings</em>}</li>
 *   <li>{@link org.nasdanika.models.process.impl.ActivityImpl#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 *   <li>{@link org.nasdanika.models.process.impl.ActivityImpl#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link org.nasdanika.models.process.impl.ActivityImpl#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.nasdanika.models.process.impl.ActivityImpl#getArtifacts <em>Artifacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends ResourceConsumerImpl implements Activity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<SemanticMapping> getSemanticMappings() {
		return (EList<SemanticMapping>)eDynamicGet(ProcessPackage.ACTIVITY__SEMANTIC_MAPPINGS, ModelPackage.Literals.SEMANTIC_ELEMENT__SEMANTIC_MAPPINGS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Connection<ProcessElement>> getIncomingConnections() {
		return (EList<Connection<ProcessElement>>)eDynamicGet(ProcessPackage.ACTIVITY__INCOMING_CONNECTIONS, org.nasdanika.graph.model.ModelPackage.Literals.CONNECTION_TARGET__INCOMING_CONNECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Connection<ProcessElement>> getOutgoingConnections() {
		return (EList<Connection<ProcessElement>>)eDynamicGet(ProcessPackage.ACTIVITY__OUTGOING_CONNECTIONS, org.nasdanika.graph.model.ModelPackage.Literals.CONNECTION_SOURCE__OUTGOING_CONNECTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Role> getRoles() {
		return (EList<Role>)eDynamicGet(ProcessPackage.ACTIVITY__ROLES, ProcessPackage.Literals.ACTIVITY__ROLES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Artifact> getArtifacts() {
		return (EList<Artifact>)eDynamicGet(ProcessPackage.ACTIVITY__ARTIFACTS, ProcessPackage.Literals.ACTIVITY__ARTIFACTS, true, true);
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
			case ProcessPackage.ACTIVITY__INCOMING_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingConnections()).basicAdd(otherEnd, msgs);
			case ProcessPackage.ACTIVITY__ARTIFACTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArtifacts()).basicAdd(otherEnd, msgs);
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
			case ProcessPackage.ACTIVITY__SEMANTIC_MAPPINGS:
				return ((InternalEList<?>)getSemanticMappings()).basicRemove(otherEnd, msgs);
			case ProcessPackage.ACTIVITY__OUTGOING_CONNECTIONS:
				return ((InternalEList<?>)getOutgoingConnections()).basicRemove(otherEnd, msgs);
			case ProcessPackage.ACTIVITY__INCOMING_CONNECTIONS:
				return ((InternalEList<?>)getIncomingConnections()).basicRemove(otherEnd, msgs);
			case ProcessPackage.ACTIVITY__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
			case ProcessPackage.ACTIVITY__ARTIFACTS:
				return ((InternalEList<?>)getArtifacts()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.ACTIVITY__SEMANTIC_MAPPINGS:
				return getSemanticMappings();
			case ProcessPackage.ACTIVITY__OUTGOING_CONNECTIONS:
				return getOutgoingConnections();
			case ProcessPackage.ACTIVITY__INCOMING_CONNECTIONS:
				return getIncomingConnections();
			case ProcessPackage.ACTIVITY__ROLES:
				return getRoles();
			case ProcessPackage.ACTIVITY__ARTIFACTS:
				return getArtifacts();
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
			case ProcessPackage.ACTIVITY__SEMANTIC_MAPPINGS:
				getSemanticMappings().clear();
				getSemanticMappings().addAll((Collection<? extends SemanticMapping>)newValue);
				return;
			case ProcessPackage.ACTIVITY__OUTGOING_CONNECTIONS:
				getOutgoingConnections().clear();
				getOutgoingConnections().addAll((Collection<? extends Connection<ProcessElement>>)newValue);
				return;
			case ProcessPackage.ACTIVITY__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				getIncomingConnections().addAll((Collection<? extends Connection<ProcessElement>>)newValue);
				return;
			case ProcessPackage.ACTIVITY__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
				return;
			case ProcessPackage.ACTIVITY__ARTIFACTS:
				getArtifacts().clear();
				getArtifacts().addAll((Collection<? extends Artifact>)newValue);
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
			case ProcessPackage.ACTIVITY__SEMANTIC_MAPPINGS:
				getSemanticMappings().clear();
				return;
			case ProcessPackage.ACTIVITY__OUTGOING_CONNECTIONS:
				getOutgoingConnections().clear();
				return;
			case ProcessPackage.ACTIVITY__INCOMING_CONNECTIONS:
				getIncomingConnections().clear();
				return;
			case ProcessPackage.ACTIVITY__ROLES:
				getRoles().clear();
				return;
			case ProcessPackage.ACTIVITY__ARTIFACTS:
				getArtifacts().clear();
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
			case ProcessPackage.ACTIVITY__SEMANTIC_MAPPINGS:
				return !getSemanticMappings().isEmpty();
			case ProcessPackage.ACTIVITY__OUTGOING_CONNECTIONS:
				return !getOutgoingConnections().isEmpty();
			case ProcessPackage.ACTIVITY__INCOMING_CONNECTIONS:
				return !getIncomingConnections().isEmpty();
			case ProcessPackage.ACTIVITY__ROLES:
				return !getRoles().isEmpty();
			case ProcessPackage.ACTIVITY__ARTIFACTS:
				return !getArtifacts().isEmpty();
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
		if (baseClass == SemanticElement.class) {
			switch (derivedFeatureID) {
				case ProcessPackage.ACTIVITY__SEMANTIC_MAPPINGS: return ModelPackage.SEMANTIC_ELEMENT__SEMANTIC_MAPPINGS;
				default: return -1;
			}
		}
		if (baseClass == GraphElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConnectionSource.class) {
			switch (derivedFeatureID) {
				case ProcessPackage.ACTIVITY__OUTGOING_CONNECTIONS: return org.nasdanika.graph.model.ModelPackage.CONNECTION_SOURCE__OUTGOING_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == ConnectionTarget.class) {
			switch (derivedFeatureID) {
				case ProcessPackage.ACTIVITY__INCOMING_CONNECTIONS: return org.nasdanika.graph.model.ModelPackage.CONNECTION_TARGET__INCOMING_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ProcessElement.class) {
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
		if (baseClass == SemanticElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.SEMANTIC_ELEMENT__SEMANTIC_MAPPINGS: return ProcessPackage.ACTIVITY__SEMANTIC_MAPPINGS;
				default: return -1;
			}
		}
		if (baseClass == GraphElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ConnectionSource.class) {
			switch (baseFeatureID) {
				case org.nasdanika.graph.model.ModelPackage.CONNECTION_SOURCE__OUTGOING_CONNECTIONS: return ProcessPackage.ACTIVITY__OUTGOING_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == ConnectionTarget.class) {
			switch (baseFeatureID) {
				case org.nasdanika.graph.model.ModelPackage.CONNECTION_TARGET__INCOMING_CONNECTIONS: return ProcessPackage.ACTIVITY__INCOMING_CONNECTIONS;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == ProcessElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ActivityImpl
