package org.training.core.workflow.actions;

import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductRejectionActionJob extends AbstractProductApprovalActionJob {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductRejectionActionJob.class);

    @Override
    public WorkflowDecisionModel perform(final WorkflowActionModel action) {
        LOGGER.info("Entered Product Rejection Action job");
        return rejectProductAndFetchDecision(action);
    }
}
