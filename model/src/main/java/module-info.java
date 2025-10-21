import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.process.util.ProcessEPackageResourceSetCapabilityFactory;

module org.nasdanika.models.process {
	exports org.nasdanika.models.process;
	exports org.nasdanika.models.process.impl;
	exports org.nasdanika.models.process.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.graph.model;
	requires transitive org.nasdanika.models.party;
	
	provides CapabilityFactory with ProcessEPackageResourceSetCapabilityFactory;
	
}