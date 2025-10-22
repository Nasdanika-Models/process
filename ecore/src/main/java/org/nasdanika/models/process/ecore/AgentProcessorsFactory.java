package org.nasdanika.models.process.ecore;

import java.util.function.BiConsumer;

import org.eclipse.emf.common.util.EList;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.ecore.graph.processors.EClassNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EClassifierNodeProcessorFactory;
import org.nasdanika.models.process.ProcessPackage;

@EClassifierNodeProcessorFactory(classifierID = ProcessPackage.AGENT)
public class AgentProcessorsFactory { // extends ... ?
	private Context context;
	
	public AgentProcessorsFactory(Context context) {
		this.context = context;
	}	
		
	/**
	 * Test of different ways to configure action prototype.
	 * @param config
	 * @param prototypeProvider
	 * @param progressMonitor
	 * @return
	 */
	@EClassifierNodeProcessorFactory(
			icon = "https://process.models.nasdanika.org/images/software-agent.svg", 
			description = "Think of an agent as a specialized team member with specific skills, expertise, and responsibilities",
			documentation = """
					...
                    """
	)
	public EClassNodeProcessor createAgentProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EClassNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}	
			
			@Override
			protected EList<? super Action> getMembersActionCollection(Action parent) {
				return parent.getChildren();
			}
			
			@Override
			protected EList<? super Action> getMembersCollection(Action membersAction) {
				return membersAction.getChildren();
			}
			
		};
	}
	
//	@EStructuralFeatureNodeProcessorFactory(
//			nsURI = ProcessPackage.eNS_URI,
//			classID = ProcessPackage.RESOURCE_CONSUMER,
//			featureID = ProcessPackage.RESOURCE_CONSUMER__RESOURCES,
//			description = "...",
//			documentation = 
//					"""
//					... 					  					  				
//					
//					"""
//	)
//	public EReferenceNodeProcessor createToolsProcessor(
//			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
//			java.util.function.Function<ProgressMonitor, Action> prototypeProvider,
//			BiConsumer<Label, ProgressMonitor> labelConfigurator,
//			ProgressMonitor progressMonitor) {		
//		return new EReferenceNodeProcessor(config, context, prototypeProvider) {
//			
//			@Override
//			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
//				super.configureLabel(source, label, progressMonitor);
//				if (labelConfigurator != null) {
//					labelConfigurator.accept(label, progressMonitor);
//				}
//			}
//			
//		};
//	}
	
}
