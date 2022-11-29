package org.training.core.workflow.actions;

import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductApprovalActionJob extends AbstractProductApprovalActionJob{
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductApprovalActionJob.class);

    @Override
    public WorkflowDecisionModel perform(final WorkflowActionModel action) {
        LOGGER.info("Entered into Product Approval Action Job");
        return approveProductAndFetchDecision(action);
    }
}
