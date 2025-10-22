package org.nasdanika.models.process.ecore;

import java.util.function.BiConsumer;

import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Reflector.Factory;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;
import org.nasdanika.models.process.ProcessPackage;

@EPackageNodeProcessorFactory(nsURI = ProcessPackage.eNS_URI)
public class EcoreGenProcessProcessorsFactory {

	private Context context;
	
//	@Factory
//	public final ActivityProcessorsFactory activityProcessorsFactory;
//	
//	@Factory
//	public final ActorProcessorsFactory actorProcessorsFactory;
	
	@Factory
	public final AgentProcessorsFactory agentProcessorsFactory;
	
//	@Factory
//	public final ArtifactProcessorsFactory artifactProcessorsFactory;
//	
//	@Factory
//	public final CallProcessorsFactory callProcessorsFactory;
//	
//	@Factory
//	public final HumanProcessorsFactory humanProcessorsFactory;
//	
//	@Factory
//	public final ProcessProcessorsFactory processProcessorsFactory;
//	
//	@Factory
//	public final ProcessProcessorsElementFactory processElementProcessorsFactory;
//	
//	@Factory
//	public final RepositoryProcessorsFactory repositoryProcessorsFactory;
//	
//	@Factory
//	public final ResourceProcessorsFactory resourceProcessorsFactory;
//	
//	@Factory
//	public final RoleProcessorsFactory roleProcessorsFactory;
//	
//	@Factory
//	public final TransitionProcessorsFactory transitionProcessorsFactory;	
	
	// --- 
	
	public EcoreGenProcessProcessorsFactory(Context context) {
		this.context = context;
		
//		activityProcessorsFactory = new ActivityProcessorsFactory(context);
//		actorProcessorsFactory = new ActorProcessorsFactory(context);
		agentProcessorsFactory = new AgentProcessorsFactory(context);
//		artifactProcessorsFactory = new ArtifactProcessorsFactory(context);
//		callProcessorsFactory = new CallProcessorsFactory(context);
//		humanProcessorsFactory = new HumanProcessorsFactory(context);
//		processProcessorsFactory = new ProcessProcessorsFactory(context);
//		processElementProcessorsFactory = new ProcessElementProcessorsFactory(context);
//		repositoryProcessorsFactory = new repositoryProcessorsFactory(context);
//		resourceProcessorsFactory = new resourceProcessorsFactory(context);
//		roleProcessorsFactory = new roleProcessorsFactory(context);
//		transitionProcessorsFactory = new transitionProcessorsFactory(context);	
	}
	
	@EPackageNodeProcessorFactory(
			label = "Process Model",
			icon = "https://process.models.nasdanika.org/images/flow-chart.svg",
			description = "A model of a process",
			documentation =  """
				
				```drawio-resource
				process.drawio
				```
				
				...
				"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	

}
