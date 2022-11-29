/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.training.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.constants.WebConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.util.GlobalMessages;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.AbstractPageModel;
import de.hybris.platform.cms2.model.pages.ContentPageModel;
import de.hybris.platform.commerceservices.model.process.TestActionProcessModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;


/**
 * Controller for testing
 */
@Controller
public class TestController extends AbstractPageController
{

	@Resource
	private BusinessProcessService businessProcessService;

	@Resource
	private ModelService modelService;

	@RequestMapping(value = "/start-business-process", method = RequestMethod.GET)
	@ResponseBody
	public String startBusinessProcess(@RequestParam final String uid,
									   @RequestParam final String name) throws CMSItemNotFoundException
	{
		TestActionProcessModel testActionProcessModel = (TestActionProcessModel) businessProcessService.createProcess("testAction-"+System.currentTimeMillis(), "defaultTestAction");
		testActionProcessModel.setUid(uid);
		testActionProcessModel.setName(name);
		modelService.save(testActionProcessModel);
		businessProcessService.startProcess(testActionProcessModel);
		return "OK";
	}
}
