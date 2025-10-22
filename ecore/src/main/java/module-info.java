import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.process.ecore.ECoreGenProcessProcessorsCapabilityFactory;

module org.nasdanika.models.process.ecore {
		
	requires transitive org.nasdanika.models.process;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.process.ecore;
	opens org.nasdanika.models.process.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenProcessProcessorsCapabilityFactory; 		
	
}
