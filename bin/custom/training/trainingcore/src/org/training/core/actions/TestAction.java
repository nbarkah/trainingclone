package org.training.core.actions;

import de.hybris.platform.commerceservices.model.process.TestActionProcessModel;
import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.processengine.action.AbstractSimpleDecisionAction;
import de.hybris.platform.servicelayer.search.FlexibleSearchQuery;
import de.hybris.platform.servicelayer.search.FlexibleSearchService;
import de.hybris.platform.servicelayer.search.SearchResult;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.util.List;

/**
 * The Class TestAction
 *
 * @author Kris Sunu Purnandaru
 */
public class TestAction extends AbstractSimpleDecisionAction<TestActionProcessModel> {

    private static final Logger LOGGER = Logger.getLogger(TestAction.class);

    @Resource
    private FlexibleSearchService flexibleSearchService;

    @Override
    public Transition executeAction(TestActionProcessModel testActionProcessModel) {
        //Do something here
        final FlexibleSearchQuery query = new FlexibleSearchQuery("Select {pk} from {Customer} where {uid}='"
                + testActionProcessModel.getUid() + "'");
        final SearchResult<CustomerModel> searchResult = flexibleSearchService.search(query);
        List<CustomerModel> customerModelList = searchResult.getResult();

        //If everything goes well return OK, else NOK
        if (CollectionUtils.isNotEmpty(customerModelList)) {
            for (CustomerModel customerModel : customerModelList) {
                LOGGER.info("CUSTOMER name is : "+customerModel.getName());
            }
            LOGGER.info("Test Action 1 OK!");
            return Transition.OK;
        }
        else return Transition.NOK;
    }
}