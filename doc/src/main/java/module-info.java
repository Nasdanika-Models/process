import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.process.doc.ProcessNodeProcessorFactoryCapabilityFactory;

module org.nasdanika.models.process.doc {
		
	requires transitive org.nasdanika.models.crewai;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.process.doc;
	opens org.nasdanika.models.process.doc; // For loading resources

	provides CapabilityFactory with	ProcessNodeProcessorFactoryCapabilityFactory;
	
}
