/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.storefront.controllers.pages;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/storefrontTrainingTaskPage")
public class StorefrontTrainingTaskPageController extends AbstractPageController {

    private static final String TEMPLATE_PAGE = "storefrontTrainingTaskPage";

    @RequestMapping(value=TEMPLATE_PAGE, method = RequestMethod.GET)
    public String getTrainingAccountPage(final Model model) throws CMSItemNotFoundException{
        final ContentPageModel trainingData = getContentPageForLabelOrId(TEMPLATE_PAGE);
        storeCmsPageInModel(model, trainingData);
        setUpMetaDataForContentPage(model, trainingData);
        return getViewForPage(model);
    }
}