package org.training.core.workflow.actions;

import de.hybris.platform.catalog.enums.ArticleApprovalStatus;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.model.ModelService;
import de.hybris.platform.workflow.jobs.AutomatedWorkflowTemplateJob;
import de.hybris.platform.workflow.model.WorkflowActionModel;
import de.hybris.platform.workflow.model.WorkflowDecisionModel;
import org.apache.commons.collections.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

public class AbstractProductApprovalActionJob implements AutomatedWorkflowTemplateJob {

    @Resource(name = "modelService")
    private ModelService modelService;

    protected WorkflowDecisionModel approveProductAndFetchDecision(final WorkflowActionModel action) {
        final ProductModel product = getProductFromAttachment(action);
        if (null != product) {
            product.setApprovalStatus(ArticleApprovalStatus.APPROVED);
            modelService.save(product);
            return action.getDecisions().iterator().next();
        }
        return null;
    }

    protected WorkflowDecisionModel rejectProductAndFetchDecision(final WorkflowActionModel action) {
        final ProductModel product = getProductFromAttachment(action);
        if (null != product) {
            product.setApprovalStatus(ArticleApprovalStatus.UNAPPROVED);
            modelService.save(product);
            return action.getDecisions().iterator().next();
        }
        return null;
    }

    protected ProductModel getProductFromAttachment(final WorkflowActionModel action) {
        final List<ItemModel> attachments = action.getAttachmentItems();
        if (CollectionUtils.isNotEmpty(attachments)) {
            for (final ItemModel item : attachments) {
                if (item instanceof ProductModel) {
                    return (ProductModel) item;
                }
            }
        }
        return null;
    }

    @Override
    public WorkflowDecisionModel perform(WorkflowActionModel action) {
        return null;
    }
}
