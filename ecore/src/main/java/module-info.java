import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.process.ecore.ECoreGenProcessProcessorsCapabilityFactory;

module org.nasdanika.models.process.ecore {
		
	requires transitive org.nasdanika.models.crewai;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.crewai.ecore;
	opens org.nasdanika.models.crewai.ecore; // For loading resources

	provides CapabilityFactory with	ECoreGenProcessProcessorsCapabilityFactory; 		
	
}
