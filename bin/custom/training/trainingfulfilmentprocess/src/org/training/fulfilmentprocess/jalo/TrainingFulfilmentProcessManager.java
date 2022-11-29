package org.training.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;
import org.training.fulfilmentprocess.constants.TrainingFulfilmentProcessConstants;

public class TrainingFulfilmentProcessManager extends GeneratedTrainingFulfilmentProcessManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( TrainingFulfilmentProcessManager.class.getName() );
	
	public static final TrainingFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TrainingFulfilmentProcessManager) em.getExtension(TrainingFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
